package ru.demin.myRestApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.demin.myRestApp.models.Person;

@Repository
public interface PeopleRepo extends JpaRepository<Person, Integer> {
}
