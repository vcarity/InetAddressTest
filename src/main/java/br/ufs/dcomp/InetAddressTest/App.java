package br.ufs.dcomp.InetAddressTest;

import java.net.*;

public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "www.google.com";
            
            InetAddress[] address_list = InetAddress.getAllByName(name);
    
            System.out.println( "Name:      "+ name);
            for (int i = 0; i < address_list.length; i++) {
                InetAddress address = address_list[i];
                System.out.println( "Address:   "+ address.getHostAddress());
            }

        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
