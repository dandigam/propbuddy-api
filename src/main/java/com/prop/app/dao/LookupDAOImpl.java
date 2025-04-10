package com.prop.app.dao;

import com.prop.app.entity.PropertyTypeEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LookupDAOImpl implements LookupDAO {

    private EntityManager entityManager;

    @Autowired
    public LookupDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<PropertyTypeEntity> getPropertyTypes() {
        TypedQuery<PropertyTypeEntity> theQuery = entityManager.createQuery("FROM PropertyTypeEntity", PropertyTypeEntity.class);
        return theQuery.getResultList();
    }
}


