/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchstruts2.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import pe.edu.cibertec.gchstruts2.enums.ServiceTypes;
import pe.edu.cibertec.gchstruts2.factory.ProfesorFactory;
import pe.edu.cibertec.gchstruts2.modelo.Profesor;
import pe.edu.cibertec.gchstruts2.service.ProfesorService;

/**
 *
 * @author Lucas
 */
public class ProfesorAction extends ActionSupport implements SessionAware{
    
     private Profesor profesor;
     private List<Profesor> profesores;
    
    public String iniciar() throws Exception{
        // trae los profesores en la fuente de datos    
        ProfesorService serviceProfesorBD = ProfesorFactory.create(ServiceTypes.SERVERBD);
        profesores = serviceProfesorBD.listarTodo();
        
        return SUCCESS;
    }
    
    public String registrar() throws Exception{
        
        return SUCCESS;
    }
            
    public String eliminar() throws Exception{
        
        return SUCCESS;
    }
    
    public String buscar() throws Exception{
        
        return SUCCESS;
    }   
    
    public void setSession(Map<String, Object> map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
