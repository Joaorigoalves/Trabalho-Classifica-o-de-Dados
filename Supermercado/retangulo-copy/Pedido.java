public class Pedido
{
   Cliente cliente;
   Item[] itens;
   TipoPagamento pagamento;
   
   public Pedido(Cliente cliente, Item[] itens, TipoPagamento pagamento){
       this.cliente = cliente;
       this.itens = itens;
       this.pagamento = pagamento;
   }
   
   public double getTotalPedido(){
       double total = 0;
       for(int i = 0; i < itens.length; i ++){
            total += itens[i].getTotal();
       }
       return total;
    }
    
   public TipoPagamento getPagamento(){
       return pagamento;
   }
}