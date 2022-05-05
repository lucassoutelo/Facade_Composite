public class LojaNotebooks{
  private Notebook acer;
  private Notebook dell;
  private Notebook lenovo;

  public LojaNotebooks(){
    acer = new Acer();
    dell = new Dell();
    lenovo = new Lenovo();
  }
  

  public void acerVenda(){
    acer.modelo();
    acer.preco();
  }

  public void dellVenda(){
    dell.modelo();
    dell.preco();
  }

  public void lenovoVenda(){
    lenovo.modelo();
    lenovo.preco();
  }
}