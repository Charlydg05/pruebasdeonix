
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersistencia=new ControladoraPersistencia();
    
    public void crearUsuario(Usuarios usu){
        controlPersistencia.crearUsuario(usu);
    }
    
    public List<Usuarios> traUsuarios(){
        return controlPersistencia.traerUsuarios();
    }

}
