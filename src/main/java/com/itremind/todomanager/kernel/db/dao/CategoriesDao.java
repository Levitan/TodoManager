package com.itremind.todomanager.kernel.db.dao;

import com.itremind.todomanager.kernel.db.model.Categories;

import java.util.List;

public interface CategoriesDao extends AbstractDao<Categories, Long>{
    List<Categories> getAllCategories();
    Categories getCategoryByAlias(String alias);
}
