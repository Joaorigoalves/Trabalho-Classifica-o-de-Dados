public class Item
{
  Produto produto;
  int quantidade;
  
  public Item(Produto prod, int q){
      this.produto = prod;
      this.quantidade = q;
      produto.diminuirEstoque(quantidade);
  }
  
  public double getTotal(){
      return produto.getPreco() * quantidade;
  }
}