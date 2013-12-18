package com.example.util;

import com.example.ResourceLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * User: Alexander Nazarenko
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ObjectLoader {
    public static final String SPORT = "Sport";
    public static final String LIVESCORE_DATA = "LivescoreData";
    protected static final Logger LOGGER = LoggerFactory.getLogger(ObjectLoader.class);
    private XMLStreamReader xmlStreamReader = null;
    private Unmarshaller unmarshaller = null;
    private Class type = null;
    @Autowired
    private FileNameHolder fileHolder = null;

    public ObjectLoader() {
    }

    public <T> void init(final Class<T> typeClazz) {
        this.type = typeClazz;
        try {
            final URL urlFile = ResourceLoader.getFilePath(fileHolder.getFileName());
            initJAXB(type, urlFile);
        } catch (JAXBException e) {
            LOGGER.warn("Can't load file", e);
        } catch (FileNotFoundException e) {
            LOGGER.warn("Can't load file", e);
        } catch (XMLStreamException e) {
            LOGGER.warn("Can't load file", e);
        } catch (IOException e) {
            LOGGER.warn("Can't load file", e);
        }
    }

    protected void initJAXB(final Class clazz, final URL urlFile) throws JAXBException, IOException, XMLStreamException {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileReader(urlFile.getFile()));
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        unmarshaller = jaxbContext.createUnmarshaller();
    }

    public XMLStreamReader getXmlStreamReader() {
        return xmlStreamReader;
    }

    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }

    //This magic was created for partially loading of XML file
    public <T> void loadingMatches(final ObjectMapper<T> objectMapper) {
        try {
            while (getXmlStreamReader().hasNext()) {
                getXmlStreamReader().nextTag();
                if (getXmlStreamReader().getEventType() == XMLStreamConstants.START_ELEMENT) {
                    if (getXmlStreamReader().getLocalName().equals(LIVESCORE_DATA)) {
                        getXmlStreamReader().nextTag();
                        while (getXmlStreamReader().hasNext()) {
                            if (getXmlStreamReader().getEventType() == XMLStreamConstants.START_ELEMENT) {
                                if (SPORT.equals(xmlStreamReader.getLocalName())) {
                                    JAXBElement<T> matchTypeJAXBElement = getUnmarshaller().unmarshal(getXmlStreamReader(), type);
                                    T sportType = matchTypeJAXBElement.getValue();
                                    objectMapper.buildRowFromMatchType(sportType);
                                }
                            }
                            getXmlStreamReader().next();
                        }
                    }
                }
            }
        } catch (XMLStreamException e) {
            LOGGER.warn("Can't load file", e);
        } catch (JAXBException e) {
            LOGGER.warn("Can't load file", e);
        }
    }


}
