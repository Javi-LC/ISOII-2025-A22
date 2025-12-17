package Client.Domain;

import java.util.ArrayList;
import java.util.List;

public class AuditController {

    public List<AuditLog> retrieveLogs() {
        System.out.println("-> Requesting Audit Logs from Server...");
        // Simulación de respuesta
        List<AuditLog> logs = new ArrayList<>();
        logs.add(new AuditLog(1, "admin", "Login success"));
        logs.add(new AuditLog(2, "student1", "Reserved book 'Clean Code'"));
        return logs;
    }
}