package com.itremind.todomanager.kernel.db.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class Taskoperation {
    private long id;
    private String action;
    private String changedfield;
    private String oldValue;
    private String newValue;
    private Time chngedDate;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ACTION", nullable = false, length = 255)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "CHANGEDFIELD", nullable = false, length = 255)
    public String getChangedfield() {
        return changedfield;
    }

    public void setChangedfield(String changedfield) {
        this.changedfield = changedfield;
    }

    @Basic
    @Column(name = "OLD_VALUE", nullable = false, length = 4000)
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    @Basic
    @Column(name = "NEW_VALUE", nullable = false, length = 4000)
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    @Basic
    @Column(name = "CHNGED_DATE", nullable = false)
    public Time getChngedDate() {
        return chngedDate;
    }

    public void setChngedDate(Time chngedDate) {
        this.chngedDate = chngedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Taskoperation that = (Taskoperation) o;

        if (id != that.id) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;
        if (changedfield != null ? !changedfield.equals(that.changedfield) : that.changedfield != null) return false;
        if (oldValue != null ? !oldValue.equals(that.oldValue) : that.oldValue != null) return false;
        if (newValue != null ? !newValue.equals(that.newValue) : that.newValue != null) return false;
        if (chngedDate != null ? !chngedDate.equals(that.chngedDate) : that.chngedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (changedfield != null ? changedfield.hashCode() : 0);
        result = 31 * result + (oldValue != null ? oldValue.hashCode() : 0);
        result = 31 * result + (newValue != null ? newValue.hashCode() : 0);
        result = 31 * result + (chngedDate != null ? chngedDate.hashCode() : 0);
        return result;
    }
}
