package daoImpl;

import dao.Dao;
import database.Database;
import model.Animal;

import java.util.Comparator;
import java.util.List;

public class AnimalDaoImpl implements Dao<Animal> {
    @Override
    public String add(List<Animal>animals) {
Database.animals.addAll(animals);
        return "Animals successfully added! ";
    }

    @Override
    public Animal getById(Long id) {
        for (Animal animal : Database.animals){
            if (animal.getId() == id){
                return animal;
            }
        }
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return Database.animals;
    }

    @Override
    public List<Animal> sortByName() {
        Comparator<Animal>animalComparator = Comparator.comparing(Animal::getName);
         Database.animals.sort(animalComparator);
         return Database.animals;
    }

    @Override
    public List<Animal> filterByGender() {
        return null;
    }

    @Override
    public List<Animal> clear() {
        Database.animals.clear();
        return Database.animals;
    }
}
