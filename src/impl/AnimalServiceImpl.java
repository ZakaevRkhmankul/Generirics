package impl;

import dao.Dao;
import daoImpl.AnimalDaoImpl;
import daoImpl.PersonDaoImpl;
import database.Database;
import model.Animal;
import model.Person;
import service.GenericService;

import java.util.List;

public class AnimalServiceImpl implements GenericService<Animal> {

   private Dao dao = new AnimalDaoImpl();


    @Override
    public String add(List<Animal> t) {
        dao.add(t);
        return "Animals successfully added!";
    }

    @Override
    public Animal getById(Long id) {
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return dao.getAll();
    }

    @Override
    public List<Animal> sortByName() {
        return dao.sortByName();
    }

    @Override
    public List<Animal> filterByGender() {
        return dao.filterByGender();
    }

    @Override
    public List<Animal> clear() {
        return dao.clear();
    }
}
