

package pe.edu.cibertec.gchstruts2.service;

import java.util.List;
import pe.edu.cibertec.gchstruts2.dao.ProfesorDao;
import pe.edu.cibertec.gchstruts2.dao.ProfesorDaoImpl;
import pe.edu.cibertec.gchstruts2.entity.Profesor;



public class ServiceBD extends ProfesorService{
    ProfesorDao profesorDao;
    

    @Override
    public void construct() {
        profesorDao = ProfesorDaoImpl.getInstance();
        System.out.println("Se establecio una conexion Local");
    }

    @Override
    public void identify() {
        
    }

    @Override
    public void registrar(Profesor profesor) {
        profesorDao.registrar(profesor);
    }

    @Override
    public void actualizar(Profesor profesor) {
        profesorDao.actualizar(profesor);
    }

    @Override
    public void eliminarSegun(Integer codigo) {
        profesorDao.eliminarSegun(codigo);
    }

    @Override
    public List<Profesor> listarTodo() {
        return profesorDao.listarTodo();
    }

    @Override
    public List<Profesor> listarSegun(String nombre, String apellidoPaterno, String apellidoMaterno) {
        System.out.println("Se hizo la consulta de manera local:\n");
        return profesorDao.listarSegun(nombre, apellidoPaterno, apellidoMaterno);
    }

    @Override
    public Profesor obtenerSegun(Integer codigo) {
        return profesorDao.obtenerSegun(codigo);
    }
    
}
