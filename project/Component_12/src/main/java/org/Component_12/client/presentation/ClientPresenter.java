package org.Component_12.client.presentation;

import org.Component_12.client.domain.ClientService;

public class ClientPresenter {
  private final ClientService service = new ClientService();

  public String show() {
    return "Client: " + service.getClientData();
  }
}
