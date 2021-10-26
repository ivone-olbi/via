package br.com.via;

import org.junit.runner.RunWith;

import br.com.via.navegadores.Chrome;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/features")
public class RunCucumberTest {

    private final Chrome chrome;

    @Before
    public void webmotors() {
        chrome.manage().window().maximize();
        chrome.get("http://lojaebac.ebaconline.art.br");
    }

}