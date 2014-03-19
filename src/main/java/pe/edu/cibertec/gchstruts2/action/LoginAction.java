/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchstruts2.action;

/**
 *
 * @author Lucas
 */
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import pe.edu.cibertec.gchStruts2.modelo.User;

public class LoginAction extends ActionSupport{
    private User usuario;

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

  
    public String login() throws Exception {
        
        if(usuario.getUser().equals("admin") && 
                usuario.getPass().equals("admin")){
            
            //obtenemos sesion
            Map sesion=ActionContext.getContext().getSession();
            
            //guardamos objetos en sesion
            sesion.put("usuario", getUsuario().getUser());            
            addActionMessage(getText("login.ok"));
            
            return SUCCESS;
        }else{
            addActionError(getText("login.error"));
            return LOGIN; 
        }
    }
    
    public String logout() throws Exception {       
            //obtenemos sesion
            Map sesion=ActionContext.getContext().getSession();
            SessionMap sessionMap=(SessionMap)sesion;
            sessionMap.invalidate();
            
            return LOGIN;
    }
    
    
    public String inicio(){
        return LOGIN;
    }    
}
