/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadedSocket;

import Sockets.SocketClient;

/**
 *
 * @author Emiliano
 */
public class TestServerWithMultipleRequest {
    public static void main(String[] args) {
        for(int i = 0; 1 < 100; i++)
        {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                   SocketClient sc = new SocketClient();
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
    
}
