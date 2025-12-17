package Server.Domain;

import java.util.Date;

public class AuditLog {
    private int id;
    private String username;
    private String action;
    private Date date;

    public AuditLog(int id, String username, String action) {
        this.id = id;
        this.username = username;
        this.action = action;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "[" + date + "] User: " + username + " - Action: " + action;
    }
}