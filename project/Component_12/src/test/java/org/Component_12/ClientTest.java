package org.Component_12;

import org.Component_12.client.presentation.ClientPresenter;
import org.Component_12.client.persistence.ClientRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
  @Test
  public void clientPresenterShowsData() {
    ClientPresenter p = new ClientPresenter();
    assertEquals("Client: client-data", p.show());
  }

  @Test
  public void clientRepoSaveAndLoad() {
    ClientRepository r = new ClientRepository();
    assertEquals("client-data", r.load());
    assertTrue(r.save("x"));
  }
}
