package daoImpl;

import dao.Dao;
import database.Database;
import enums.Gender;
import model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDaoImpl implements Dao<Person> {


    @Override
    public String add(List<Person>people) {
        Database.people.addAll(people);
        return "Peoples successfully added!";
    }

    @Override
    public Person getById(Long id) {
        try {
            for (Person person : Database.people) {
                if (!person.getId().equals(id)) {
                    throw new RuntimeException(id + " айдисинде турган киши табылбады!");
                } else {
                    return person;
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<Person> getAll() {
        List<Person> people = new ArrayList<>(Database.people);
        return people;
    }

    @Override
    public List<Person> sortByName() {
        return Database.people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

    }

    @Override
    public List<Person> filterByGender() {
        List<Person> females = new ArrayList<>();
        List<Person> males = new ArrayList<>();
        for (Person person : Database.people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                return females;
            } else if (person.getGender().equals(Gender.MALE)) {
                return males;
            }
        }
        return null;
    }

    @Override
    public List<Person> clear() {
        Database.people.clear();
        return Database.people;
    }
}
