/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.gchstruts2.modelo;

import java.io.Serializable;
import pe.edu.cibertec.gchstruts2.annotations.Autor;
import pe.edu.cibertec.gchstruts2.annotations.ComplejidadExposicion;

/**
 *
 * @author jvasquezc
 */
//@ComplejidadExposicion(complejidad = "Alta")
//@Autor(codigo= 1, nombre="alumno")

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
