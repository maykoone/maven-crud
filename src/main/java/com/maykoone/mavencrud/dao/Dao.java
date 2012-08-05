/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maykoone.mavencrud.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import org.springframework.dao.DataAccessException;

public abstract class Dao<T> {

    private Class<T> clazz;

    public Dao(Class<T> clazz) {
        this.clazz = clazz;
    }

    public abstract EntityManager getEntityManager();

    public T save(T entity) throws DataAccessException {
        return getEntityManager().merge(entity);
    }

    public void remove(T entity) throws DataAccessException {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T findById(Long id) throws DataAccessException {
        return getEntityManager().find(clazz, id);
    }

    public List<T> findAll() throws DataAccessException {
        CriteriaQuery<T> cq = getEntityManager().getCriteriaBuilder().createQuery(clazz);
        return getEntityManager().createQuery(cq.select(cq.from(clazz))).getResultList();
    }
}
