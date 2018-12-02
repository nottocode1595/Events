package com.deepak.project;

import com.deepak.project.Resources.EventApi;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class App extends Application<AppConfig> {

    public void run(AppConfig appConfig, Environment environment) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat(appConfig.getDateFormat());
        environment.getObjectMapper().setDateFormat(dateFormat);

        EventApi eventApi = new EventApi();
        environment.jersey().register(eventApi);
    }

    @Override
    public void initialize(Bootstrap<AppConfig> bootstrap){

    }

    public static void main(final String[] args) throws Exception {
        App app = new App();
        app.run(args);
    }
}
