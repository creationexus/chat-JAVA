package chatnoapplet;

import chatnoapplet.tcp.cliente.Cliente;
import chatnoapplet.tcp.servidor.Servidor;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carriagadad
 */
public class ChatNoApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Servidor s;
            if(args.length == 1){
                s = new Servidor(Integer.parseInt(args[0]), 2);
            }
            else
                s = new Servidor(8030, 2);
        InetAddress host;
        try {
            host = InetAddress.getLocalHost();
            //Cliente c = new Cliente(host.getHostName(), 8030);
        } catch (UnknownHostException ex) {
            System.out.println("Error al conectar al Servidor");
        }
            
    }
}
