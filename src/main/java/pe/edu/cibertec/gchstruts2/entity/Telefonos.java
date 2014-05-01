
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
    @NamedQuery(name="Telefono.getTodos",
            query= "SELECT new pe.edu.cibertec.entity.Telefonos"
            +"(t.codigo, t.telefono)"
            +"FROM Telefonos t" )
})
public class Telefonos implements Serializable{

@Id 
@Column(name="idtelefono")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int codigo;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "idprofesor", referencedColumnName = "idprofesor")
private Profesor profesor; 
        
private String telefono;

    public Telefonos() {
    }


    public Telefonos(int codigo, Profesor profesor, String telefono) {
        this.codigo = codigo;
        this.profesor = profesor;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


        
    
}
