/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.gchstruts2.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import pe.edu.cibertec.gchstruts2.entity.Correos;
import pe.edu.cibertec.gchstruts2.util.PersistenceUtil;

public class CorreosDaoImpl {
    
  
    public List<Correos> buscar(){
       EntityManager em=PersistenceUtil.getEmf().createEntityManager();
       TypedQuery<Correos> emquery = em.createNamedQuery("Correos.getTodos", Correos.class);
        
            List<Correos> correos=emquery.getResultList();
        
       em.close();
       return correos;       
    }
    
   
}
