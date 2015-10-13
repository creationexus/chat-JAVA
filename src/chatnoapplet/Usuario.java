package chatnoapplet;

import java.io.Serializable;

/**
 *
 * @author carriagadad
 */
public class Usuario implements Serializable {
    //Nick del usuario
    private String nick;
    private String fechaIni;
    public Usuario(String nick){
        this.nick = nick;
    }
    public void setFechaIni(String fecha){
        this.fechaIni = fecha;
    }
    public String getNick(){
        return this.nick;
    }
}
