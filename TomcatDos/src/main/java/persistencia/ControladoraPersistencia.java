
package persistencia;

import java.util.List;
import logica.Usuarios;


public class ControladoraPersistencia {
    UsuariosJpaController usuJpa=new UsuariosJpaController();
    //operacion create
    public void crearUsuario(Usuarios usu){
        
        usuJpa.create(usu);
        
    }
    
    //opreacion read
    public List<Usuarios> traerUsuarios(){
        return usuJpa.findUsuariosEntities();
    }

}
