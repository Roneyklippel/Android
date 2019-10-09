package controler;

import model.Login;

public class ctrlLogin {
    public boolean localizarUsuario(Login l){
        if(validarUsuario(l)){
            
        }else{
            return false;
        }
    }

    private boolean validarUsuario(Login l) {
        return (!l.getLogin().isEmpty()&&!l.getSenha().isEmpty()) ;
        
    }
    
}
