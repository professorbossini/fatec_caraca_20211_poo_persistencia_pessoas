import javax.swing.JOptionPane;

public class Principal {
  public static void main(String[] args) {
    String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
    int op;
    do{
      op = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch (op){
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 0:
          JOptionPane.showConfirmDialog(null, "Até logo");
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida");
      }

    }while (op != 0);
  }  
}
