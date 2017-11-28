package com.day1.singleton;

public class PeerSingleton {

    private static final String[] hostsName = new String[5];

    static {
        hostsName[0] = "111.111.11.1";
        hostsName[1] = "222.222.22.2";
        hostsName[2] = "333.333.33.3";
        hostsName[3] = "444.444.44.4";
        hostsName[4] = "555.555.55.5";
    }

    private static final PeerSingleton instance = new PeerSingleton();

    private PeerSingleton() {
    }

    public static PeerSingleton getInstance() {
        return instance;
    }

    public static String[] getHosts() {
        return hostsName;
    }
}
