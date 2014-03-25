<%-- 
    Document   : create
    Created on : 19-mar-2014, 2:36:14
    Author     : Lucas
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" href="../css/jquery-ui-1.10.4.css">
<script src="../js/jquery-ui-1.10.4.js"></script>
<script src="../js/registroScript.js"></script>

<s:div cssStyle="width: 40%">
    <s:form method="post" cssClass="form-horizontal" role="form">        
        <fieldset>
            <s:hidden name="profesor.codigo"/>
            <legend><s:text name="professor.form.personal"/></legend>
            <s:div cssClass="form-group" >
                <label for="profesor.nombres" class="col-sm-4 control-label"><s:text name="professor.form.firstname"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.nombres" cssClass="form-control" id="nombres" 
                                 maxLength="50" placeholder="%{getText('professor.form.firstname')}" required=""/>                       
                </s:div>                    
            </s:div> 
            <s:div cssClass="form-group">
                <label for="profesor.apellidoPaterno" class="col-sm-4 control-label"><s:text name="professor.form.midname"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.apellidoPaterno" cssClass="form-control" id="apellidoPaterno" 
                                 maxLength="50" placeholder="%{getText('professor.form.midname')}" required=""/>            
                </s:div>                    
            </s:div> 
            <s:div cssClass="form-group">
                <label for="profesor.apellidoMaterno" class="col-sm-4 control-label"><s:text name="professor.form.lastname"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.apellidoMaterno" cssClass="form-control" id="apellidoMaterno" 
                                 maxLength="50" placeholder="%{getText('professor.form.lastname')}" required=""/>            
                </s:div>                    
            </s:div> 
        </fieldset>
        <fieldset>
            <legend><s:text name="professor.form.address"/></legend>
            <s:div cssClass="form-group">
                <label for="profesor.direccion" class="col-sm-4 control-label"><s:text name="professor.form.address.complete"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.direccion" cssClass="form-control" id="direccion" 
                                 maxLength="400" placeholder="%{getText('professor.form.address.complete')}" required=""/>                     
                </s:div>                    
            </s:div>
            <s:div cssClass="form-group">
                <label for="profesor.referencia" class="col-sm-4 control-label"><s:text name="professor.form.address.reference"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.referencia" cssClass="form-control" id="referencia" 
                                 maxLength="400" placeholder="%{getText('professor.form.address.reference')}"/>             
                </s:div>                    
            </s:div>
        </fieldset>
        <fieldset>
            <legend><s:text name="professor.form.phones"/></legend>
            <s:div cssClass="form-group">
                <label for="profesor.telefono1"  class="col-sm-4 control-label"><s:text name="professor.form.phones.phone1"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.telefono1" cssClass="form-control" id="telefono1" 
                                 maxLength="12" placeholder="%{getText('professor.form.phones.phone1')}"/>          

                </s:div>                   
            </s:div>
            <s:div cssClass="form-group">
                <label for="profesor.telefono2"  class="col-sm-4 control-label"><s:text name="professor.form.phones.phone2"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.telefono2" cssClass="form-control" id="telefono2" 
                                 maxLength="12" placeholder="%{getText('professor.form.phones.phone2')}"/>                  
                </s:div>                  
            </s:div>                
        </fieldset>
        <fieldset>
            <legend><s:text name="professor.form.emails"/></legend>
            <s:div cssClass="form-group">
                <label for="profesor.email1" class="col-sm-4 control-label"><s:text name="professor.form.emails.email1"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.email1" cssClass="form-control" id="email1" 
                                 maxLength="100" placeholder="%{getText('professor.form.emails.email1')}"/>              
                </s:div>                    
            </s:div>
            <s:div cssClass="form-group">
                <label for="profesor.email2" class="col-sm-4 control-label"><s:text name="professor.form.emails.email2"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.email2" cssClass="form-control" id="email2" 
                                 maxLength="100" placeholder="%{getText('professor.form.emails.email2')}"/>              
                </s:div>                     
            </s:div>                
        </fieldset>
        <fieldset>
            <legend><s:text name="professor.form.details"/></legend>

            <s:div cssClass="form-group">
                <label for="profesor.fechaNacimiento" class="col-sm-4 control-label">
                    <s:text name="professor.form.details.birthday"/>
                </label>
                <s:div cssClass="col-sm-8">    
                    <s:textfield name="profesor.fechaNacimiento" cssClass="form-control" id="fechaNacimiento" 
                                 readonly="true"/>                    
                </s:div>
            </s:div>
            <s:div cssClass="form-group">
                <label class="col-sm-4 control-label"><s:text name="professor.form.details.sex"/></label>
                <s:div cssClass="col-sm-8">
                    <s:div cssClass="radio-inline">                        
                        <input type="radio" name="profesor.sexo" id="masculino" value="M" />
                        <s:text name="professor.form.details.sex.male"/>
                    </s:div>
                    <s:div cssClass="radio-inline">                        
                        <input type="radio" name="profesor.sexo" id="femenino" value="F" /> 
                        <s:text name="professor.form.details.sex.female"/>
                    </s:div>
                </s:div>
            </s:div>
            <s:div cssClass="form-group">
                <label class="col-sm-4 control-label" for="profesor.estadoCivil">
                    <s:text name="professor.form.details.marital"/>
                </label>
                <s:div cssClass="col-sm-8">
                    <select name="profesor.estadoCivil" id="estadoCivil" class="form-control">
                        <option value=""><s:text name="professor.form.details.estado.seleccione"/></option>
                        <option value="1"><s:text name="professor.form.details.estado.soltero"/></option>
                        <option value="2"><s:text name="professor.form.details.estado.casado"/></option>
                        <option value="3"><s:text name="professor.form.details.estado.vuido"/></option>
                        <option value="4"><s:text name="professor.form.details.estado.divorciado"/></option>
                        <option value="5"><s:text name="professor.form.details.estado.conviviente"/></option>
                    </select>
                </s:div>                  
            </s:div>
        </fieldset>
        <s:submit name="Registrar" cssClass="btn btn-primary btn-lg" 
                  key="professor.form.button" action="confirmarProfesor" namespace="/profesor"/>        
    </s:form>
</s:div>
