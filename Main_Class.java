//package comp346pa1w2020;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Main_Class {

    public static void main(String[] args) {

        Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();
        Server objServer = new Server();                        /* Start the server */
        objServer.start();
        Client objClient1 = new Client("sending");              /* Start the sending client */
        objClient1.start();
        Client objClient2 = new Client("receiving");            /* Start the receiving client */
        objClient2.start();

    }

}
