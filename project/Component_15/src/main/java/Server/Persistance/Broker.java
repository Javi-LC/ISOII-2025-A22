package Server.Persistance;

import java.util.Vector;

public class Broker {
    private static Broker instance;

    private Broker() {}

    public static Broker getBroker() {
        if (instance == null) instance = new Broker();
        return instance;
    }

    public boolean insert(String sql) {
        System.out.println("[DATABASE] Executing Update: " + sql);
        return true;
    }

    public Vector<Object> select(String sql) {
        System.out.println("[DATABASE] Executing Query: " + sql);
        return new Vector<>(); // Retorna vector vacío simulado
    }
}