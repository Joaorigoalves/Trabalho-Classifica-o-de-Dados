import java.util.Scanner;
public class Main
{  
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  Produto p1 = new Produto(Descricao.ARROZ, 5.50, 20);
  Produto p2 = new Produto(Descricao.LEITE, 10.00, 40);
  Produto p3 = new Produto(Descricao.FEIJAO, 8.00, 30);
  Produto p4 = new Produto(Descricao.FARINHA, 6.00, 25);
  
  Pedido pedido1 = null;
  
  new Scanner(System.in);
  
  //Item item1 = new Item(p1, 3);
  //Item item2 = new Item(p2, 5);
  
  //Cliente cliente1 = new Cliente("João", "2345678900");
  
  //Item[] itens = new Item[2];

  //itens[0] = item1;
  //itens[1] = item2;
  
  //Pedido pedido1 = new Pedido(cliente1, itens, TipoPagamento.DINHEIRO);
  
  
  //System.out.println("Total de item: " + item1.getTotal());
  //System.out.println("Total Pedido: " + pedido1.getTotalPedido());  
  //System.out.println("Forma de pagamento: " + pedido1.getPagamento());
  //System.out.println("Estoque de arroz: " + p1.getQuantidadeEstoque());
  

  int opcao = -1;

  
  System.out.println("1 - Novo pedido");
  System.out.println("2 - Realizar pagamento");  
  System.out.println("0 - Sair");

  System.out.print("Escolha uma opção: ");
  opcao = scanner.nextInt();
  

  switch(opcao)
  {
        case 1:
            System.out.print("Nome do cliente: ");
            String nome = scanner.next();

            System.out.print("CPF: ");
            String cpf = scanner.next();

            Cliente cliente = new Cliente(nome, cpf);

            System.out.println("1 - Arroz");
            System.out.println("2 - Feijão");
            System.out.println("3 - Farinha");
            System.out.println("4 - Leite");

            System.out.print("Escolha o produto: ");
            int escolhaProduto = scanner.nextInt();

            Produto produtoEscolhido = null;

        switch(escolhaProduto)
        {
            case 1:
                produtoEscolhido = p1;
                break;

            case 2:
                produtoEscolhido = p3;
                break;

            case 3:
                produtoEscolhido = p4;
                break;

            case 4:
                produtoEscolhido = p2;
                break;
        }

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            if(quantidade > produtoEscolhido.getQuantidadeEstoque()){
                System.out.println("Quantidade indisponível!");
            }

            Item item = new Item(produtoEscolhido, quantidade);

            Item[] itens = new Item[1];
            itens[0] = item;

            System.out.println("1 - Dinheiro");
            System.out.println("2 - Cheque");
            System.out.println("3 - Cartão");
            System.out.println("4 - Pix");

            System.out.print("Escolha a forma de pagamento: ");
            int escolhaPagamento = scanner.nextInt();

            TipoPagamento pagamento = null;

        switch(escolhaPagamento)
        {
            case 1:
                pagamento = TipoPagamento.DINHEIRO;
                break;

            case 2:
                pagamento = TipoPagamento.CHEQUE;
                break;

            case 3:
                pagamento = TipoPagamento.CARTAO;
                break;

            case 4:
                pagamento = TipoPagamento.PIX;
                break;
        }

            pedido1 = new Pedido(cliente, itens, pagamento);

            System.out.println("Pedido criado!");

            break;


            
        case 2:
            System.out.println("Pagamento realizado!");
            System.out.println("Total: " + pedido1.getTotalPedido());
            System.out.println("Método de pagamento: " + pedido1.getPagamento());

            break;

        case 0:
            System.out.println("Saindo...");
            break;
  }

    }  
}   