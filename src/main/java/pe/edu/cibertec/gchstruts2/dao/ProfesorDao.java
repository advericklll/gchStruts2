package pe.edu.cibertec.gchstruts2.dao;

import java.util.List;
import javax.persistence.EntityManager;
import pe.edu.cibertec.gchstruts2.entity.Profesor;
import pe.edu.cibertec.gchstruts2.util.PersistenceUtil;

/**
 * Contrato de operaciones referentes a la entidad de Profesor en la fuente de
 * datos.
 *
 */
public interface ProfesorDao {
    
    public void registrar(Profesor profesor);
    void actualizar(Profesor profesor);
    void eliminarSegun(Integer codigo);
    List<Profesor> listarTodo();
    List<Profesor> listarSegun(String nombre, String apellidoPaterno, String apellidoMaterno);
    Profesor obtenerSegun(Integer codigo);

}
