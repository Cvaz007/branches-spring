package com.riwi.branch.controllers;

import com.riwi.branch.models.Role;
import com.riwi.branch.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping("/role")
    public List<Role> listAllRoles() {
        return  roleService.findAll();
    }
    @GetMapping("/role/{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable Integer id) {
        try {
            Role role =  roleService.findById(id);
            return new ResponseEntity<Role>(role, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Role>(HttpStatus.NOT_FOUND);
        }

    }
    @DeleteMapping("/role/{id}")
    public ResponseEntity<?> deleteRoleById(@PathVariable Integer id) {
        try {
            Role role = roleService.findById(id);
            roleService.deleteRole(id);
            return new ResponseEntity<Role>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/role")
    public void saveRole(@RequestBody Role role) {
        roleService.saveRole(role);
    }
    @PutMapping("/role/{id}")
    public ResponseEntity<Role> updateRole(@RequestBody Role role, @PathVariable Integer id) {
        try {
            Role currentRole = roleService.findById(id);
            currentRole.setName(role.getName());
            currentRole.setDescription(role.getDescription());
            roleService.saveRole(currentRole);
            return new ResponseEntity<Role>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Role>(HttpStatus.NOT_FOUND);
        }
    }
}
