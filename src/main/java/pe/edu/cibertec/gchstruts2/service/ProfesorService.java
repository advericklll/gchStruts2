

package pe.edu.cibertec.gchstruts2.service;

import java.util.List;
import pe.edu.cibertec.gchstruts2.entity.Profesor;

public abstract class ProfesorService {
    
    public ProfesorService() {
        super();
        construct();
    }

    public abstract void construct();
    public abstract void identify();
    
    public abstract void registrar(Profesor profesor);
    public abstract void actualizar(Profesor profesor);
    public abstract void eliminarSegun(Integer codigo);
    public abstract List<Profesor> listarTodo();
    public abstract List<Profesor> listarSegun(String nombre, String apellidoPaterno, String apellidoMaterno);
    public abstract Profesor obtenerSegun(Integer codigo);
    
}
