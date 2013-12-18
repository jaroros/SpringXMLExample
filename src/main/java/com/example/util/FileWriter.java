package com.example.util;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

/**
 * User: Alexander Nazarenko
 */
@Component
public class FileWriter {

    public void writeStringToFile(final String fileName, final String line) throws IOException {
        FileUtils.writeStringToFile(new File(fileName), line + "\n", true);
    }

    public void cleanFile(final String fileName) throws IOException {
        final File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}
