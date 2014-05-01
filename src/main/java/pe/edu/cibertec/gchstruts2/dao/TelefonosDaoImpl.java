/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.gchstruts2.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import pe.edu.cibertec.gchstruts2.entity.Telefonos;
import pe.edu.cibertec.gchstruts2.util.PersistenceUtil;

public class TelefonosDaoImpl {
    
  
    public List<Telefonos> buscar(){
       EntityManager em=PersistenceUtil.getEmf().createEntityManager();
       TypedQuery<Telefonos> emquery = em.createNamedQuery("Telefonos.getTodos", Telefonos.class);
        
            List<Telefonos> telefonos=emquery.getResultList();
        
       em.close();
       return telefonos;       
    }
    
   
}
