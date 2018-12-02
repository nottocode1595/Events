package com.deepak.project;

import io.dropwizard.Configuration;

import javax.annotation.Nonnull;

public class AppConfig extends Configuration{

    @Nonnull
    private String dateFormat;

    public String getDateFormat(){
        return dateFormat;
    }
}