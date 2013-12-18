package com.example;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

/**
 * User: Alexander Nazarenko
 */
public class ResourceLoader {
    protected static final Logger LOGGER = Logger.getLogger(ResourceLoader.class.getName());

    public static URL getClassPathResourceAsURL(final String resName) throws IOException {
        return Resources.getResource(resName);
    }

    public static URL getFilePath(final String fileName) throws IOException {
        return getClassPathResourceAsURL(fileName);
    }

}
