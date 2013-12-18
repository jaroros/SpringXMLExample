package com.example;

import com.example.service.MatchService;
import com.example.util.FileNameHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * .
 * User: Alexander Nazarenko
 */
public class MainController {
    protected static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    public static void main(final String[] args) {
        final ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        applicationContext.refresh();
        final FileNameHolder fileNameHolder = applicationContext.getBean(FileNameHolder.class);
        fileNameHolder.setFileName("big-data.xml");
        final MatchService matchService = applicationContext.getBean(MatchService.class);
        try {
            matchService.writeAlphaSortedMathes("matсh-list-alphasort.txt");
            matchService.writeGoalSortedMathes("matсh-list-goalssort.txt");
            matchService.writeTopList("math-top-list.txt");
            LOGGER.info("Files generated successfully ");
        } catch (IOException e) {
            LOGGER.warn("Can't save to file");
        }
    }
}
