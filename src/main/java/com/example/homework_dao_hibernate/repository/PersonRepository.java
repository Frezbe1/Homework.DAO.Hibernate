package com.example.homework_dao_hibernate.repository;

import com.example.homework_dao_hibernate.entity.Person;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Person> getPersonsByCity(String city) {
        var resultCity = entityManager.createQuery(
                        "select c from Person c where c.city = :cityName order by c.surname")
                .setParameter("cityName", city);
        return resultCity.getResultList();
    }
}
