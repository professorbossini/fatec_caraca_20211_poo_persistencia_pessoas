import java.sql.Connection;
import java.sql.PreparedStatement;

public class PessoaDAO {

  public boolean inserir (Pessoa p){
    Connection conn = null;
    try{
      //1. Especificar o comando SQL
      String sql = "INSERT I tb_pessoa (nome, fone, email) VALUES (?, ?, ?)";
      //2. Abrir uma conexão com o banco
      conn = ConnectionFactory.obterConexao();
      //3. Pré compilar o comando
      PreparedStatement ps = conn.prepareStatement(sql);
      //4. Substituir os placeholder ou preencher os dados faltantes
      ps.setString(1, p.getNome());
      ps.setString(2, p.getFone());
      ps.setString(3, p.getEmail());
      //5. Executar
      ps.execute();
      ps.close();
      conn.close();
      return true;
    }
    catch (Exception e){
      try{
        conn.close();
      }
      catch (Exception e1){
        e1.printStackTrace();
      }
      e.printStackTrace();
      return false;
    }
  }
  
}
