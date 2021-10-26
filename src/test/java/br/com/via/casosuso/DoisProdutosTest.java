package br.com.via.casosuso;

import static org.junit.Assert.assertEquals;

import br.com.via.paginas.CarrinhoPagina;
import br.com.via.paginas.ProdutoPagina;
import br.com.via.paginas.ProdutosPagina;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DoisProdutosTest {

    private final ProdutoPagina produtoPagina;
    private final ProdutosPagina produtosPagina;
    private final CarrinhoPagina carrinhoPagina;

    @Given("a lista de produtos")
    public void a_lista_de_produtos() {
        produtosPagina.listarProdutos();
    }

    @When("escolho o produto {string}")
    public void escolho_o_produto(String nomeProduto) {
        selecionarProduto(nomeProduto, "XS", "Blue");
    }

    @And("o produto {string}")
    public void o_produto(String nomeProduto) {
       produtosPagina.listarProdutos();
       selecionarProduto(nomeProduto, "XS", "Black");
    }

    @Then("devem haver {string} produtos no carrinho")
    public void deve_haver_produtos_no_carrinho(String quantidadeProdutos) {
        produtoPagina.verCarrinho();
        assertEquals(Integer.parseInt(quantidadeProdutos), carrinhoPagina.getProdutos().size());
    }

    private void selecionarProduto(String nomeProduto, String corProduto, String tamanhoProduto) {
        produtosPagina.selecionarProduto(nomeProduto);
        produtoPagina.selecionarCorProduto(corProduto);
        produtoPagina.selecionarTamanhoProduto(tamanhoProduto);
        produtoPagina.comprarProduto();
    }

}