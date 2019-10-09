package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionFactory {
    public Connection connection = null;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String DBNAME = "dbsistema";
    private  final String URL = "jdbc:mysql://localhost:3306/"+DBNAME;
    private final String LOGIN = "root";
    private final String SENHA = "123456";
    public boolean getConnection(){
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            JOptionPane.showMessageDialog(null,"Conectou");
            return true;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Driver não encontrado..."+ e);
            return false;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Falha ao conectar..."+ e);
            return false;
        }
        
    }
    public void close(){
        try {
            connection.close();
            JOptionPane.showMessageDialog(null, "Bando desconectado!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao fechar o banco! " + e);
        }
    }
}
