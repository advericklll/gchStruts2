<%-- 
    Document   : list
    Created on : 19-mar-2014, 2:36:08
    Author     : Lucas
--%>

<%@taglib prefix="s" uri="/struts-tags"%>
<script src="../js/indexScript.js"></script>

<s:div cssStyle="width: 30%">
    <s:form role="form">    
        <legend><s:text name="professor.form.search.fields"/></legend>
        <s:div cssClass="form-group">         
            <label for="nombres"> <s:text name="professor.form.firstname"/> </label> 
            <s:textfield name="nombres" cssClass="form-control" id="nombres" 
                         maxLength="50" placeholder="%{getText('professor.form.firstname')}"/>                    
        </s:div>
        <s:div cssClass="form-group">
            <label for="apellidoPaterno"> <s:text name="professor.form.midname"/>  </label>
            <s:textfield name="apellidoPaterno" cssClass="form-control" id="apellidoPaterno" 
                         maxLength="50" placeholder="%{getText('professor.form.midname')}"/>          
        </s:div>
        <s:div cssClass="form-group">
            <label for="apellidoMaterno"> <s:text name="professor.form.lastname"/>  </label>
            <s:textfield name="apellidoMaterno" cssClass="form-control" id="apellidoMaterno" 
                         maxLength="50" placeholder="%{getText('professor.form.lastname')}"/>                      
        </s:div>
        <s:div cssClass="form-group">
            <s:submit name="Buscar" cssClass="btn btn-primary" 
                      key="professor.form.search" action="buscarProfesor" namespace="/profesor"/>                         
        </s:div>

        <s:div cssClass="form-group">  
            <nav>
                <ul>
                    <li>
                        <s:a action="registrarProfesor" namespace="/profesor">
                            <s:text name="professor.form.add"/>
                        </s:a>                            
                    </li>
                </ul>
            </nav>
        </s:div>
    </s:form>
</s:div>
<s:div cssStyle="width: 60%">    
    <table id="resultadoConsulta"  class="table table-striped" style="text-align: center;"> 
        <thead>
        <th style="text-align: center;"><s:text name="professor.table.id"/></th>
        <th style="text-align: center;"><s:text name="professor.table.names"/></th>
        <th style="text-align: center;"><s:text name="professor.table.email"/></th>
        <th style="text-align: center;"><s:text name="professor.table.sex"/></th>
        <th colspan="3" style="text-align: center;"><s:text name="professor.table.action"/></th>            
    </thead>
    <tbody>
        <s:iterator value="profesores">
            <tr>                 
                <td><s:property value="codigo" /></td>
                <td><s:property value="nombres" /> <s:property value="apellidoPaterno" /> <s:property value="apellidoMaterno" /></td>
                <td><s:property value="email1" /></td>
                <td><s:property value="sexo" /></td>
                <td>
                    <s:url var="update" action="editarProfesor" namespace="/profesor">
                        <s:param name="codigo"><s:property value="codigo"/></s:param>
                    </s:url>
                    <s:a href="%{update}"><s:text name="professor.table.action.update"/></s:a>
                    </td>
                    <td>
                    <s:url var="details" action="detalleProfesor" namespace="/profesor">
                        <s:param name="codigo"><s:property value="codigo"/></s:param>
                    </s:url>
                    <s:a href="%{details}"><s:text name="professor.table.action.details"/></s:a>
                    </td>
                    <td>
                    <s:url var="delete" action="eliminarProfesor" namespace="/profesor">
                        <s:param name="codigo"><s:property value="codigo"/></s:param>
                    </s:url>
                    <s:a href="%{delete}" ><s:text name="professor.table.action.delete"/></s:a>
                    </td>
                </tr>
        </s:iterator>
    </tbody>        
</table>

</s:div>


