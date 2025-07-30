package com.nec.studentmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nec.studentmanagement.entity.Role;
@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role findRoleByName(String theRoleName) {
        try {
            return entityManager.createQuery("SELECT r FROM Role r WHERE r.name = :role", Role.class)
                    .setParameter("role", theRoleName)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
