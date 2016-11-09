/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Emiliano
 */
public class SocketClient {
    
    public static void main(String[] args) {
        try {
            String host = "localhost";
            int port = 19999;
            
            StringBuffer mensaje = new StringBuffer();
            
            InetAddress ia = InetAddress.getByName(host);
            Socket connection = new Socket(ia, port);
            
            BufferedOutputStream bos = new BufferedOutputStream(connection.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter(bos);
            
            osw.write("soy el cliente 1, ayuuuuuuuuuuuuuuuuuuuda" + (char) 13);
            osw.flush();
            
            BufferedInputStream bis = new BufferedInputStream(connection.getInputStream());
            InputStreamReader isr = new InputStreamReader(bis);
            
            int caracter;
            while((caracter = isr.read()) != 13)
            {
                mensaje.append(caracter);
            }
            System.out.println(mensaje);
            connection.close();
            
            
        } catch (UnknownHostException ex) {
            
        } catch (IOException ex) {
            
        }
    }
}
