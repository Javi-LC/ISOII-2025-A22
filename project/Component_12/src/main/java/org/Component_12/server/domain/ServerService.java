package org.Component_12.server.domain;

import org.Component_12.server.persistence.ServerRepository;

public class ServerService {
  private final ServerRepository repo = new ServerRepository();

  public String getServerInfo() {
    return repo.load();
  }
}
