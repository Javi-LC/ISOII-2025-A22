package org.Component_3.server.domain;

public class AcquisitionRequest {

    private long id;
    private Status status;
    private String courseId;

    public enum Status {
        PENDING,
        APPROVED
    }

    public AcquisitionRequest() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
