package com.day1.singleton;

public class Main {

    public static void main(String[] args) {
        PeerSingleton peerList01 = PeerSingleton.getInstance();
        PeerSingleton peerList02 = PeerSingleton.getInstance();

        for (String hostName : peerList01.getHosts()) {
            System.out.println(hostName);
        }

        for (String hostName : peerList02.getHosts()) {
            System.out.println(hostName);
        }
    }
}
