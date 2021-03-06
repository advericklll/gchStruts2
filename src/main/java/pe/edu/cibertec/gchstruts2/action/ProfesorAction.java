
package pe.edu.cibertec.gchstruts2.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import pe.edu.cibertec.gchstruts2.dao.ProfesorDao;
import pe.edu.cibertec.gchstruts2.dao.ProfesorDaoImpl;
import pe.edu.cibertec.gchstruts2.dao.TelefonosDao;
import pe.edu.cibertec.gchstruts2.enums.ServiceTypes;
import pe.edu.cibertec.gchstruts2.factory.ProfesorFactory;
import pe.edu.cibertec.gchstruts2.entity.Profesor;
import pe.edu.cibertec.gchstruts2.service.ProfesorService;


/*
 Profesor Action: Controlador Profesor - CRUD
 */
public class ProfesorAction extends ActionSupport implements SessionAware {

    private Profesor profesor;
    private List<Profesor> profesores;

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String iniciar() throws Exception {
        // trae los profesores en la fuente de datos    
//        ProfesorService serviceProfesorBD = ProfesorFactory.create(ServiceTypes.SERVERBD);
//        profesores = serviceProfesorBD.listarTodo();
//        return "list";
        if(mapaSesion.get("telefonos") == null){
            TelefonosDao service = new TelefonosDao();
            mapaSesion.put("telefonos",service.listarTodo());
        }
        return SUCCESS;
    }

    //nuevo
    public String registrar() throws Exception {
//        return "create";
        return SUCCESS;
    }

    //editar
    public String editar() throws Exception {
        ProfesorService serviceProfesorBD = ProfesorFactory.create(ServiceTypes.SERVERBD);
        profesor = serviceProfesorBD.obtenerSegun(codigo);
        return "create";
    }

    public String confirmar() throws Exception {
        ProfesorService serviceProfesorBD = ProfesorFactory.create(ServiceTypes.SERVERBD);
        
        if (null== profesor.getCodigo() || profesor.getCodigo().length() == 0) {
            serviceProfesorBD.registrar(profesor);
            //actualizar      
        } else {
            serviceProfesorBD.actualizar(profesor);
        }
        profesores = serviceProfesorBD.listarTodo();
        return "list";
    }

    public String detalle() throws Exception {
        ProfesorService serviceProfesorBD = ProfesorFactory.create(ServiceTypes.SERVERBD);
        profesor = serviceProfesorBD.obtenerSegun(codigo);
        return "details";
    }

    public String eliminar() throws Exception {
        ProfesorService serviceProfesorBD = ProfesorFactory.create(ServiceTypes.SERVERBD);
        serviceProfesorBD.eliminarSegun(codigo);
        profesores = serviceProfesorBD.listarTodo();
        return "list";
    }

    public String buscar() throws Exception {
        // trae los profesores en la fuente de datos    
//        ProfesorService serviceProfesorBD = ProfesorFactory.create(ServiceTypes.SERVERBD);
//        profesores = serviceProfesorBD.listarSegun(nombres, apellidoPaterno, apellidoMaterno);
//        return "list";
        ProfesorDaoImpl service = new ProfesorDaoImpl();
       profesor = service.listarTodo();
       return  SUCCESS;
    }

    public void setSession(Map<String, Object> map) {

    }

    public Profesor getProfesor() {
        if (profesor == null) {
            profesor = new Profesor();
        }
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

}
