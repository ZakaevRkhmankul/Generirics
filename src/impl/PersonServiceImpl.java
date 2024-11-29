package impl;

import dao.Dao;
import daoImpl.PersonDaoImpl;
import database.Database;
import model.Person;
import service.GenericService;

import java.util.List;

public class PersonServiceImpl implements GenericService<Person> {
    private Dao dao = new PersonDaoImpl();

    @Override
    public String add(List<Person>people) {
        dao.add(people);
        return "Peoples successfully added!";
    }

    @Override
    public Person getById(Long id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return dao.getAll();
    }

    @Override
    public List<Person> sortByName() {
        return dao.sortByName();
    }

    @Override
    public List<Person> filterByGender() {
        return dao.filterByGender();
    }

    @Override
    public List<Person> clear() {
        return dao.clear();
    }
}
