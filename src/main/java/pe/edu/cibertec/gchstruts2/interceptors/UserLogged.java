
package pe.edu.cibertec.gchstruts2.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.Map;

/**
 *
 * Interceptor Para la validar sesion de Struts2
 */
public class UserLogged implements Interceptor{

    public void destroy() {
        
    }

    public void init() {
        
    }

    public String intercept(ActionInvocation ai) throws Exception {
        //obtenemos sesion
        Map<String, Object> userSession = ai.getInvocationContext().getSession();
        
        if (userSession==null || userSession.get("usuario") ==null){
            return "login";
        }else{
            if(userSession.get("usuario").toString().equals("admin")){
                return ai.invoke();
            }else{
                return "login";
            }
        }        
    }    
}
