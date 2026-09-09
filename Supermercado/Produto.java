public class Produto
{
   Descricao descricao;
   double preco;
   int quantidadeEstoque;
   
   public Produto(Descricao desc, double preco, int qEstoque){
       this.descricao = desc;
       this.preco = preco;
       this.quantidadeEstoque = qEstoque;
   }
   
   public double getPreco(){
       return preco;
   }
   
   public void diminuirEstoque(int quantidadeComprada){
       quantidadeEstoque = quantidadeEstoque - quantidadeComprada;
    }
    
   public int getQuantidadeEstoque(){
       return quantidadeEstoque;
   }
}