package org.Component_7_Server.Domain;

import java.util.Date;

public class Subscription {
    private int projectId;
    private int resourceId;
    private Date startDate;

    public Subscription(int projectId, int resourceId) {
        this.projectId = projectId;
        this.resourceId = resourceId;
        this.startDate = new Date();
    }
}