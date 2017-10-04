package com.itremind.todomanager.kernel.db.model.beans;

public class TaskVariables {

    public final int TYPE_BUG = 100;
    public final int TYPE_NEW_FEATURE = 101;
    public final int TYPE_IMPROVMENT = 102;

    public final int STATUS_OPEN = 200;
    public final int STATUS_CLOSED = 201;
    public final int STATUS_REOPEN = 202;
    public final int STATUS_IN_PROGRESS = 203;
    public final int STATUS_NOT_A_BUG = 204;
    public final int STATUS_RESOLVED = 205;
    public final int STATUS_ON_HOLD = 206;
    
    public final int PRIORITY_LOW = 301;
    public final int PRIORITY_MEDIUM = 302;
    public final int PRIORITY_HIGHT = 303;
    public final int PRIORITY_CRITICAL = 304;
    public final int PRIORITY_BLOCKER = 305;

    public int getTYPE_BUG() {
        return TYPE_BUG;
    }

    public int getTYPE_NEW_FEATURE() {
        return TYPE_NEW_FEATURE;
    }

    public int getTYPE_IMPROVMENT() {
        return TYPE_IMPROVMENT;
    }

    public int getSTATUS_OPEN() {
        return STATUS_OPEN;
    }

    public int getSTATUS_CLOSED() {
        return STATUS_CLOSED;
    }

    public int getSTATUS_REOPEN() {
        return STATUS_REOPEN;
    }

    public int getSTATUS_IN_PROGRESS() {
        return STATUS_IN_PROGRESS;
    }

    public int getSTATUS_NOT_A_BUG() {
        return STATUS_NOT_A_BUG;
    }

    public int getPRIORITY_LOW() {
        return PRIORITY_LOW;
    }

    public int getPRIORITY_MEDIUM() {
        return PRIORITY_MEDIUM;
    }

    public int getPRIORITY_HIGHT() {
        return PRIORITY_HIGHT;
    }

    public int getPRIORITY_CRITICAL() {
        return PRIORITY_CRITICAL;
    }

    public int getPRIORITY_BLOCKER() {
        return PRIORITY_BLOCKER;
    }

    public int getSTATUS_RESOLVED() {
        return STATUS_RESOLVED;
    }

    public int getSTATUS_ON_HOLD() {
        return STATUS_ON_HOLD;
    }
}
