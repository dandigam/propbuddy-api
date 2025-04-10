package com.prop.app.dao;

import com.prop.app.entity.PropertyTypeEntity;

import java.util.List;

public interface LookupDAO {

    public List<PropertyTypeEntity> getPropertyTypes();
}
