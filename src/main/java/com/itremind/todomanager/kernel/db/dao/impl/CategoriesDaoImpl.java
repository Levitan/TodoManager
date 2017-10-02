package com.itremind.todomanager.kernel.db.dao.impl;

import com.itremind.todomanager.kernel.db.dao.CategoriesDao;
import com.itremind.todomanager.kernel.db.model.Categories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class CategoriesDaoImpl extends AbstractDaoImpl<Categories, Long> implements CategoriesDao {
    public CategoriesDaoImpl() {
        super(Categories.class);
    }


    public CategoriesDaoImpl(Class<Categories> entityClass) {
        super(entityClass);
    }

    public List<Categories> getAllCategories() {
        return null;
    }

    public Categories getCategoryByAlias(String alias) {
        return null;
    }
}
