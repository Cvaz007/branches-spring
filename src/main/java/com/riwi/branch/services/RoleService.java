package com.riwi.branch.services;

import com.riwi.branch.models.Role;
import com.riwi.branch.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
    public Role findById(Integer id) {
        return roleRepository.findById(id).get();
    }
    public void saveRole(Role role) {
        roleRepository.save(role);
    }
    public void deleteRole(Integer id) {
        roleRepository.deleteById(id);
    }
}
