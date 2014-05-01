package pe.edu.cibertec.gchstruts2.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="correos")
@NamedQueries({
    @NamedQuery(name="Correos.getTodos",
            query="SELECT new pe.edu.cibertec.entity.Correos"
            +"(r.codigo, r.correo)"
            +"FROM Correos r" )
})
public class Correos implements Serializable{

@Id 
@Column(name="idcorreo")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer codigo;  
private String correo;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "idprofesor", referencedColumnName = "idprofesor")
private Profesor profesor; 

    public Correos() {
    }


    public Correos(int codigo, Profesor profesor, String correo) {
        this.codigo = codigo;
        this.profesor = profesor;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
