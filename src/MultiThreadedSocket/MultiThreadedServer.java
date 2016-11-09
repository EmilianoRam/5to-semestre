/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadedSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Emiliano
 */
public class MultiThreadedServer {
    public static final int port = 19999;
    
    public static void main(String[] args) throws IOException {
        
        ServerSocket ss = new ServerSocket(port);
        Socket connection;
        while(true)
        {
            System.out.println("Servidor esperando conexion");
            connection = ss.accept();
            System.out.println("Servidor recibio una petición");
            ProcessRequest request = new ProcessRequest(connection);
        }
    }
}
    

