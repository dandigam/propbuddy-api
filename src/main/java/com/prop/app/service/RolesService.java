package com.prop.app.service;

import com.prop.app.dto.RoleDto;
import com.prop.app.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    public List<RoleDto> getRoles() {
        return rolesRepository.findAll().stream().map(role -> new RoleDto(role.getId(), role.getName())).collect(Collectors.toList());
    }
}
