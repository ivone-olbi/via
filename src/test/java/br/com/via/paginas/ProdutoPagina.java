package br.com.via.paginas;

import org.openqa.selenium.By;

import br.com.via.navegadores.Chrome;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProdutoPagina {

    private final Chrome chrome;

    public void selecionarCorProduto(String cor) {
        chrome.findElement(By.xpath("//li[@title='" + cor + "']")).click();
    }

    public void selecionarTamanhoProduto(String tamanho) {
        chrome.findElement(By.xpath("//li[@title='" + tamanho + "']")).click();
    }

    public void comprarProduto() {
        chrome.findElement(By.xpath("//button[contains(text(),'Comprar')]")).click();
    }

    public void verCarrinho() {
        chrome.findElement(By.xpath("//a[contains(text(),'Ver carrinho')]")).click();
    }

}