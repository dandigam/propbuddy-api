package com.prop.app.service;

import com.prop.app.dao.LookupDAO;
import com.prop.app.entity.PropertyTypeEntity;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LookupService {

    @Autowired
    private LookupDAO lookupDAO;

    public List<PropertyTypeEntity> getPropertyTypes() {
        return lookupDAO.getPropertyTypes();
    }
}
