/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artemis_Expanded_Skyboxes;

import java.io.IOException;
import java.lang.String;

import net.dhleong.acl.enums.Console;
import net.dhleong.acl.iface.ArtemisNetworkInterface;
import net.dhleong.acl.iface.ConnectionSuccessEvent;
import net.dhleong.acl.iface.DisconnectEvent;
import net.dhleong.acl.iface.Listener;
import net.dhleong.acl.iface.ThreadedArtemisNetworkInterface;
import net.dhleong.acl.protocol.ArtemisPacket;
import net.dhleong.acl.protocol.core.setup.ReadyPacket;
import net.dhleong.acl.protocol.core.setup.SetConsolePacket;
import net.dhleong.acl.protocol.core.GameMessagePacket;
import net.dhleong.acl.protocol.core.setup.SetShipPacket;



public class Artemis_Expanded_Skyboxes {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: ArtemisClientDemo {host} [port]");
            return;
        }
        String host = args[0];
        int port = args.length > 1 ? Integer.parseInt(args[1]) : 2010;

        try {
            new Artemis_Expanded_Skyboxes(host, port);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private ArtemisNetworkInterface server;

    public Artemis_Expanded_Skyboxes(String host, int port) throws IOException {
        server = new ThreadedArtemisNetworkInterface(host, port);
        server.addListener(this);
        server.start();
    }

    @Listener
    public void onConnectSuccess(ConnectionSuccessEvent event) {
        server.send(new SetConsolePacket(Console.OBSERVER, true));
        server.send(new ReadyPacket());
        System.out.println(event);
    }

    @Listener
    public void onSetShipPacket (SetShipPacket pkt) {
            System.out.println(pkt);
}
    @Listener
    public void onGameMessagePacket(GameMessagePacket pkt) {
        if (pkt.getMessage().contains("system 1 load")) {
            System.out.println("Found system 1" + pkt);
            System01.system01();
        }
        else if (pkt.getMessage().contains("system 2 load")) {
            System.out.println("Found system 2" + pkt);
            System02.system02();
        }
        
        else if (pkt.getMessage().contains("system 3 load")) {
            System.out.println("Found system 3" + pkt);
            System03.system03();
        }
        
        else if (pkt.getMessage().contains("system 4 load")) {
            System.out.println("Found system 4" + pkt);
            System04.system04();
        }
        
        else if (pkt.getMessage().contains("system 5 load")) {
            System.out.println("Found system 5" + pkt);
            System05.system05();
        }
        
        else if (pkt.getMessage().contains("system 6 load")) {
            System.out.println("Found system 6" + pkt);
            System06.system06();
        }
        
        else if (pkt.getMessage().contains("system 7 load")) {
            System.out.println("Found system 7" + pkt);
            System07.system07();
        }
        
        else if (pkt.getMessage().contains("system 8 load")) {
            System.out.println("Found system 8" + pkt);
            System08.system08();
        }
        
        else if (pkt.getMessage().contains("system 9 load")) {
            System.out.println("Found system 9" + pkt);
            System09.system09();
        }
        
        else if (pkt.getMessage().contains("system 10 load")) {
            System.out.println("Found system 10" + pkt);
            System10.system10();
        }
        
        else if (pkt.getMessage().contains("system 11 load")) {
            System.out.println("Found system 11" + pkt);
            System11.system11();
        }
        
        else if (pkt.getMessage().contains("system 12 load")) {
            System.out.println("Found system 12" + pkt);
            System12.system12();
        }
        
        else if (pkt.getMessage().contains("system 13 load")) {
            System.out.println("Found system 13" + pkt);
            System13.system13();
        }
        
        else if (pkt.getMessage().contains("system 14 load")) {
            System.out.println("Found system 14" + pkt);
            System14.system14();
        }
        
        else if (pkt.getMessage().contains("system 15 load")) {
            System.out.println("Found system 15" + pkt);
            System15.system15();
        }
        
        else if (pkt.getMessage().contains("system 16 load")) {
            System.out.println("Found system 16" + pkt);
            System16.system16();
        }
        
        else if (pkt.getMessage().contains("system 17 load")) {
            System.out.println("Found system 17" + pkt);
            System17.system17();
        }
        
        else if (pkt.getMessage().contains("system 18 load")) {
            System.out.println("Found system 18" + pkt);
            System18.system18();
        }
        
        else if (pkt.getMessage().contains("system 19 load")) {
            System.out.println("Found system 19" + pkt);
            System19.system19();
        }
        
        else if (pkt.getMessage().contains("system 20 load")) {
            System.out.println("Found system 20" + pkt);
            System20.system20();
        }
        
        else {
            System.out.println("Found unknown" + pkt);
        }
    }
    

        @Listener
    public void onDisconnect(DisconnectEvent event) {
        System.out.println("Disconnected: " + event.getCause());
    }
}
