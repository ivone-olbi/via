package br.com.via.paginas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.via.navegadores.Chrome;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarrinhoPagina {

    private final Chrome chrome;

    public List<WebElement> getProdutos() {
        return chrome.findElements(By.className("cart_item"));
    }

}