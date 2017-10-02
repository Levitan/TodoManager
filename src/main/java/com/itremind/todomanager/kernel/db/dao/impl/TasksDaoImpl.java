package com.itremind.todomanager.kernel.db.dao.impl;

import com.itremind.todomanager.kernel.db.dao.TasksDao;
import com.itremind.todomanager.kernel.db.model.Tasks;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TasksDaoImpl extends AbstractDaoImpl<Tasks, Long> implements TasksDao {

    public TasksDaoImpl() {
        super(Tasks.class);
    }

    public TasksDaoImpl(Class<Tasks> entityClass) {
        super(entityClass);
    }
}
