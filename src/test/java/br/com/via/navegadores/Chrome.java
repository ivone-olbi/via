package br.com.via.navegadores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lombok.experimental.Delegate;

public class Chrome {

    @Delegate
    private WebDriver navegador = configure();

    // Configuracao do navegador Chrome.
    private WebDriver configure() {
        System.setProperty("webdriver.chrome.driver", getClass().getResource("/cucumber/drivers/chromedriver.exe").getPath());
        return (navegador = new ChromeDriver());
    }

}