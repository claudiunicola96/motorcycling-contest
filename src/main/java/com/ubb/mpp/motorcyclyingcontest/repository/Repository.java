package com.ubb.mpp.motorcyclyingcontest.repository;

import com.ubb.mpp.motorcyclyingcontest.domain.HasId;
import java.util.Collection;

/**
 * @author Marius Adam
 */
public interface Repository<Id, T extends HasId<Id>> {
    /**
     * Inserts a new entity into the repository
     *
     * @param obj The object to be inserted
     * @throws RepositoryException If there is already an entity with the same id
     */
    void insert(T obj) throws RepositoryException;
    /**
     * Removes the entity from the repository
     *
     * @param id The id of the entity to be deleted
     * @return Entity The deleted entity
     */
    T delete(Id id) throws RepositoryException;

    /**
     * Updates the given entity by identifying the entity from
     * within the repository by id
     *
     * @param entity The entity to be updated
     */
    void update(T entity) throws RepositoryException;

    /**
     * Searches for an entity with a given id
     *
     * @param id The id of the searched entity
     * @return Entity The searched entity
     * @throws java.util.NoSuchElementException If the searched entity is not found
     */
    T findById(Id id) throws RepositoryException;

    /**
     *
     * @return {@link Collection} The object containing all the entities
     */
    Collection<T> getAll() throws RepositoryException;

    /**
     *
     * @param collection A collection of objects to insert into the repository
     */
    void addCollection(Collection<T> collection) throws RepositoryException;

    /**
     *
     * @return int
     */
    int size() throws RepositoryException;
}