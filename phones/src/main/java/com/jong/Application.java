package com.jong;

import com.jong.claro.ClaroPortal;

public class Application {
    public static void main(String[] args) {
        ClaroPortal claroPortal = new ClaroPortal();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        claroPortal.requestIphoneX();
    }
}
