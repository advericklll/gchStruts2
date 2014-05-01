package pe.edu.cibertec.gchstruts2.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import pe.edu.cibertec.gchstruts2.entity.Profesor;
import pe.edu.cibertec.gchstruts2.util.PersistenceUtil;

public class ProfesorDaoImpl implements ProfesorDao {
    
    private static ProfesorDaoImpl instance =null;

    @Override
    public void registrar(Profesor profesor) {
//        int nextCodigo=1;
//        if (!Contenedor.PROFESORES.isEmpty())
//        {
//            nextCodigo = Integer.parseInt(Contenedor.PROFESORES.get(Contenedor.PROFESORES.size()-1).getCodigo().toString())+1;
//        }        
//        profesor.setCodigo(""+nextCodigo);
//        Contenedor.PROFESORES.add(profesor);
        EntityManager em = PersistenceUtil.getEmf().createEntityManager();
    em.getTransaction().begin();
    em.persist(profesor);
            
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void actualizar(Profesor profesor) {
//        Contenedor.PROFESORES.set(searchByCodigo(profesor.getCodigo()), profesor);
        EntityManager em = PersistenceUtil.getEmf().createEntityManager();
    em.getTransaction().begin();
    em.merge(profesor);
            
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void eliminarSegun(Integer codigo) {
//        Contenedor.PROFESORES.remove(searchByCodigo(codigo));
        
        EntityManager em = PersistenceUtil.getEmf().createEntityManager();
            em.getTransaction().begin();
    
             pe.edu.cibertec.gchstruts2.entity.Profesor profesor = (pe.edu.cibertec.gchstruts2.entity.Profesor) em.find(pe.edu.cibertec.gchstruts2.entity.Profesor.class,codigo);
             em.remove(profesor);
            
             em.getTransaction().commit();
             em.close();
    }

    @Override
    public List<Profesor> listarTodo() {
//        return Contenedor.PROFESORES;
        EntityManager em = PersistenceUtil.getEmf().createEntityManager();
        TypedQuery<pe.edu.cibertec.gchstruts2.entity.Profesor> emquery = em.createNamedQuery("Profesor.getTodos", pe.edu.cibertec.gchstruts2.entity.Profesor.class);
        List<pe.edu.cibertec.gchstruts2.entity.Profesor> profesor=emquery.getResultList();
        em.close();
        return profesor;
    }

    @Override
    public List<Profesor> listarSegun(String nombres, String apellidoPaterno, String apellidoMaterno) {
        List<Profesor> profesores = new LinkedList();
        for (Profesor profesor : Contenedor.PROFESORES) {
            boolean nombreCoincide = nombres == null 
                    || nombres.isEmpty()
                    || profesor.getNombres().toLowerCase(Locale.ENGLISH)
                    .contains(nombres.toLowerCase(Locale.ENGLISH));
            boolean apellidoPaternoCoincide = apellidoPaterno == null 
                    || apellidoPaterno.isEmpty()
                    || profesor.getApellidoPaterno().toLowerCase(Locale.ENGLISH)
                    .contains(apellidoPaterno.toLowerCase(Locale.ENGLISH));
            boolean apellidoMaternoCoincide = apellidoMaterno == null 
                    || apellidoMaterno.isEmpty() 
                    || profesor.getApellidoMaterno().toLowerCase(Locale.ENGLISH)
                    .contains(apellidoMaterno.toLowerCase(Locale.ENGLISH));
            if (nombreCoincide && apellidoPaternoCoincide && apellidoMaternoCoincide) {
                profesores.add(profesor);
            }
        }
        return profesores;
    }

    @Override
    public Profesor obtenerSegun(Integer codigo) {
//        return Contenedor.PROFESORES.get(searchByCodigo(codigo));
        EntityManager em = PersistenceUtil.getEmf().createEntityManager();
    pe.edu.cibertec.gchstruts2.entity.Profesor profesor = em.find(pe.edu.cibertec.gchstruts2.entity.Profesor.class, codigo);
            
        em.close();
        return profesor;
    }

    private static class Contenedor {

        private static List<Profesor> PROFESORES = new LinkedList<Profesor>();
    }
    
    private int searchByCodigo(String codigo){
        int i=-1;
       for (Profesor unProfesor : Contenedor.PROFESORES){
           if (codigo.equals(unProfesor.getCodigo()))
               i= Contenedor.PROFESORES.indexOf(unProfesor);
       }
       return i;
    }
    
   protected ProfesorDaoImpl() {
      // Exists only to defeat instantiation.
//       ProfesorBuilder builder = new ProfesorBuilder();
//       Profesor A= builder.withCodigo("1").withNombre("Fransico").withApePat("Verastegui")
//               .withApeMat("_").withEmail("fverastegui@gmail.com").withSexo("M").build();
//       Contenedor.PROFESORES.add(A);
//       builder.reset();
//       Profesor B= builder.withCodigo("2").withNombre("Lucas").withApePat("Manrique")
//               .withApeMat("Villa").withEmail("sagitario1lm@gmail.com").withSexo("M").build();
//       Contenedor.PROFESORES.add(B);
//       builder.reset();
//       Profesor C= builder.withCodigo("3").withNombre("Alvaro").withApePat("Rodas")
//               .withApeMat("Vasquez").withEmail("avasquez@gmail.com").withSexo("M").build();
//       Contenedor.PROFESORES.add(C);
//       builder.reset();
//       Profesor D= builder.withCodigo("4").withNombre("Mila").withApePat("Kunis")
//               .withApeMat("G").withEmail("mkunis@gmail.com").withSexo("F").build();      
//       Contenedor.PROFESORES.add(D);
//       builder.reset();
   }
   
   //initiate using singleton 
   public static ProfesorDaoImpl getInstance() {
      if(instance == null) {
         instance = new ProfesorDaoImpl();
      }
      return instance;
   }
}
