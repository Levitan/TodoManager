package com.itremind.todomanager.kernel.db.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tasks {
    public final int TYPE_BUG = 1;
    public final int TYPE_NEW = 2;

    public final int STATUS_NEW = 0;
    public final int STATUS_CLOSE = 4;


    private Long id;
    private String title;
    private String description;
    private Integer priority;
    private Long category;
    private Integer status;
    private Date startDate;
    private Date endDate;
    private Date createDate;
    private Long type;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
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
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "START_DATE", nullable = true)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "END_DATE", nullable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "TYPE", nullable = false, precision = 0)
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tasks tasks = (Tasks) o;

        if (!id.equals(tasks.id)) return false;
        if (!title.equals(tasks.title)) return false;
        if (description != null ? !description.equals(tasks.description) : tasks.description != null) return false;
        if (!priority.equals(tasks.priority)) return false;
        if (category != null ? !category.equals(tasks.category) : tasks.category != null) return false;
        if (!status.equals(tasks.status)) return false;
        if (startDate != null ? !startDate.equals(tasks.startDate) : tasks.startDate != null) return false;
        if (endDate != null ? !endDate.equals(tasks.endDate) : tasks.endDate != null) return false;
        if (!createDate.equals(tasks.createDate)) return false;
        return type.equals(tasks.type);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + priority.hashCode();
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + status.hashCode();
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + createDate.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

}
