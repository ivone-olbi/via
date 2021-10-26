@Carrinho @DoisProdutos
Feature: Carrinho - 2 Produtos
  Quero poder adicionar dois produtos no carrinho.

  @Sucesso
  Scenario: Devo poder adicionar 2 produtos no carrinho
    Given a lista de produtos
     When escolho o produto "Abominable Hoodie"
      And o produto "Aero Daily Fitness Tee"
     Then devem haver "2" produtos no carrinho