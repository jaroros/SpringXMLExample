package com.example.util;

import org.springframework.stereotype.Component;

/**
 * User: Alexander Nazarenko
 */
@Component
public class FileNameHolder {

    private volatile String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }
}
