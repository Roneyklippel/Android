package dao;

import factory.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Login;

public class daoLogin {

    ConnectionFactory conexao = new ConnectionFactory();
    

    public static boolean localizarUsuario(Login l) {
        ConnectionFactory conexao = new ConnectionFactory();
        try {
            String sql = "SELECT login,senha from usuario"
                    + " where login=? and senha=?";
            PreparedStatement stmt = conexao.connection.prepareStatement(sql);
            stmt.setString(1, l.getLogin());
            stmt.setString(2, l.getSenha());
            ResultSet rs = stmt.executeQuery();
        } catch (Exception erro) {

        }
    }

}
