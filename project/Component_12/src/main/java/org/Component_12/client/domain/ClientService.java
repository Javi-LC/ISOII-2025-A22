package org.Component_12.client.domain;

import org.Component_12.client.persistence.ClientRepository;

public class ClientService {
  private final ClientRepository repo = new ClientRepository();

  public String getClientData() {
    return repo.load();
  }
}
