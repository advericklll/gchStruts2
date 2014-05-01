package pe.edu.cibertec.gchstruts2.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
    
    private static EntityManagerFactory emf;
    
    static {
        emf=Persistence.createEntityManagerFactory("PU_JMAD");
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }
    
}
