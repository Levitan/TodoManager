package com.itremind.todomanager.kernel.db.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tasks {
    private long id;
    private String title;
    private String description;
    private boolean priority;
    private Long category;
    private boolean status;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TITLE", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 4000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "PRIORITY", nullable = false, precision = 0)
    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "CATEGORY", nullable = true, precision = 0)
    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    @Basic
    @Column(name = "STATUS", nullable = false, precision = 0)
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tasks tasks = (Tasks) o;

        if (id != tasks.id) return false;
        if (priority != tasks.priority) return false;
        if (status != tasks.status) return false;
        if (title != null ? !title.equals(tasks.title) : tasks.title != null) return false;
        if (description != null ? !description.equals(tasks.description) : tasks.description != null) return false;
        if (category != null ? !category.equals(tasks.category) : tasks.category != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (priority ? 1 : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (status ? 1 : 0);
        return result;
    }
}
