package br.com.via.paginas;

import org.openqa.selenium.By;

import br.com.via.navegadores.Chrome;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProdutosPagina {

    private final Chrome chrome;

    public void listarProdutos() {
        chrome.get("http://lojaebac.ebaconline.art.br/produtos");
    }

    public void selecionarProduto(String nomeProduto) {
        chrome.findElement(By.xpath("//a[contains(text(),'" + nomeProduto + "')]")).click();
    }

}