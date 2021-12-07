package com.qhrtech.app;

import io.opentelemetry.extension.annotations.WithSpan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello World");
        logger.error("Hello World");
        App app = new App();
        app.doStuff();
    }

    public App() {

    }

    @WithSpan
    private void doStuff() {
        System.out.println( "Doing stuff" );
        doOtherStuff();
    }

    @WithSpan
    private void doOtherStuff() {
        System.out.println( "Doing other stuff" );
    }

}