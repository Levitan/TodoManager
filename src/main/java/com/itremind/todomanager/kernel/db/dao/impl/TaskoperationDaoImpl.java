package com.itremind.todomanager.kernel.db.dao.impl;

import com.itremind.todomanager.kernel.db.dao.TaskoperationDao;
import com.itremind.todomanager.kernel.db.model.Taskoperation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TaskoperationDaoImpl extends AbstractDaoImpl<Taskoperation, Long> implements TaskoperationDao {

    public TaskoperationDaoImpl() {
        super(Taskoperation.class);
    }

    public TaskoperationDaoImpl(Class<Taskoperation> entityClass) {
        super(entityClass);
    }
}
