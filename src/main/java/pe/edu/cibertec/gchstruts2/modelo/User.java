
package pe.edu.cibertec.gchstruts2.modelo;

import java.io.Serializable;

/**
 *
 * Representa al usuario de la aplicacion
 */


public class User implements Serializable{

    private String user;
    private String pass;  
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }    
}
