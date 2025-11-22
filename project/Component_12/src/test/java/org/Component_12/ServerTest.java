package org.Component_12;

import org.Component_12.server.domain.ServerService;
import org.Component_12.server.persistence.ServerRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServerTest {
  @Test
  public void serverServiceUsesRepo() {
    ServerRepository r = new ServerRepository();
    ServerService s = new ServerService();
    assertEquals("server-info", r.load());
    assertEquals("server-info", s.getServerInfo());
  }
}
