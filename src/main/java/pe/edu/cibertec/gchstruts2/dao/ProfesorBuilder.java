
package pe.edu.cibertec.gchstruts2.dao;

import pe.edu.cibertec.gchstruts2.modelo.Profesor;


public class ProfesorBuilder {
    Profesor profesor;

    public ProfesorBuilder() {
        this.profesor = new Profesor();
    }
    
    public ProfesorBuilder withNombre (String nombre){
        profesor.setNombres(nombre);
        return this;
    }
    
    public ProfesorBuilder withApePat (String apePat){
        profesor.setApellidoPaterno(apePat);
        return this;
    }
    
    public ProfesorBuilder withApeMat (String apeMat){
        profesor.setApellidoMaterno(apeMat);
        return this;
    }
    
    public ProfesorBuilder withCodigo (String codigo){
        profesor.setCodigo(codigo);
        return this;
    }
    
    public ProfesorBuilder withEmail (String email){
        profesor.setEmail1(email);
        return this;
    }
    
    public ProfesorBuilder withSexo (String sexo){
        profesor.setSexo(sexo);
        return this;
    }
    
    public Profesor build(){
        return profesor;
    }
    
    public void reset(){
        profesor = new Profesor();
    }
            
    
    
}
