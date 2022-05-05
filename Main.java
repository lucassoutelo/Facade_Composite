import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    LojaNotebooks compra = new LojaNotebooks();

    System.out.println("Escolha a marca de um notebook para comprar");
    System.out.println("1 - Notebook Acer");
    System.out.println("2 - Notebook Dell");
    System.out.println("3 - Notebook Lenovo");

    Scanner in = new Scanner(System.in);
    int op =  in.nextInt();

    switch(op){
      case 1:
        compra.acerVenda();
        break;

      case 2:
        compra.dellVenda();
        break;

      case 3:
        compra.lenovoVenda();
        break;

      default:
        System.out.println("Opcao invalida");
          
    }
    
  }
}