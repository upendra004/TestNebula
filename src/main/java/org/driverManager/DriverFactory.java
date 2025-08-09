package org.driverManager;



public class DriverFactory {
    public static void init(String browser) {
        DriverManager.createDriver(browser);
    }

    public static void quit() {
        DriverManager.quitDriver();
    }
}

