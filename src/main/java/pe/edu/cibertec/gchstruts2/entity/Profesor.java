package pe.edu.cibertec.gchstruts2.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Representa a un docente de la institucion.
 */
@Entity
@Table(name = "profesor")
@NamedQueries({
    @NamedQuery( name="Profesor.getTodos",
query="SELECT new pe.edu.cibertec.entity.Profesor "
+ "(p.codigo, p.nombre) "
+ "FROM Profesor p"  )
})
public class Profesor implements Serializable{

    @Id
    @Column(name = "idprofesor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private Date fechaNacimiento;
    private String direccion;
    private String referencia;
    private String sexo;
    private String estado;
    
    @OneToMany(mappedBy = "profesor")
    private List<Telefonos> telefonos;
    
    @OneToMany(mappedBy = "profesor")
    private List<Correos> correos;
    
    public Profesor(){
        
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

   
}
