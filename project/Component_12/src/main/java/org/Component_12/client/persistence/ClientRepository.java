package org.Component_12.client.persistence;

public class ClientRepository {
  public String load() {
    return "client-data";
  }

  public boolean save(String data) {
    return data != null;
  }
}
