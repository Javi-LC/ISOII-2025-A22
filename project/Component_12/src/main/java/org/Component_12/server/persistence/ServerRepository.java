package org.Component_12.server.persistence;

public class ServerRepository {
  public String load() {
    return "server-info";
  }

  public boolean save(String info) {
    return info != null;
  }
}
