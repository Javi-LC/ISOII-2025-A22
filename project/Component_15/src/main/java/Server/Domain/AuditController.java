package Server.Domain;

import java.util.ArrayList;
import java.util.List;
import Server.Persistance.Broker;

public class AuditController {

    public void recordAction(String username, String action) {
        String sql = "INSERT INTO AuditLog (user, action) VALUES ('" + username + "', '" + action + "')";
        Broker.getBroker().insert(sql);
    }

    public List<AuditLog> getAuditLogs() {
        // En una implementación real, esto convertiría el Vector<Object> del Broker a List<AuditLog>
        // Aquí simulamos el retorno para el prototipo
        List<AuditLog> logs = new ArrayList<>();
        logs.add(new AuditLog(1, "admin", "Login success"));
        logs.add(new AuditLog(2, "student1", "Reserved book 'Clean Code'"));
        return logs;
    }
}