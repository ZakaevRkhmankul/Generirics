import dao.Dao;
import daoImpl.PersonDaoImpl;
import enums.Gender;
import impl.AnimalServiceImpl;
import impl.PersonServiceImpl;
import model.Animal;
import model.Person;
import service.GenericService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person>people = new ArrayList<>(Arrays.asList(
                new Person(1L, "Rahman", 21, Gender.MALE),
                new Person(2L, "Aitegin", 20, Gender.MALE)));
        GenericService genericService = new PersonServiceImpl();
        Dao dao = new PersonDaoImpl();

//      TODO person methods
//        System.out.println("Get by id:");
//        System.out.println(dao.getById(1L));
//
//        System.out.println("Get all:");
//        System.out.println(genericService.getAll());
//
//        System.out.println("Sort by name:");
//        System.out.println(genericService.sortByName());
//
//        System.out.println("Filter by gender:");
//        System.out.println(genericService.filterByGender());
//
//        System.out.println("Clear: ");
//        System.out.println(genericService.clear());

//      TODO animal methods

        GenericService animalService = new AnimalServiceImpl();
        List<Animal>animals = new ArrayList<>(Arrays.asList(
                new Animal(1L,"Hirts",5,Gender.FEMALE),
                new Animal(2L,"Sheep",4,Gender.FEMALE),
                new Animal(3L,"Dog",2,Gender.MALE)));
        System.out.println("Add animals");
        System.out.println(animalService.add(animals));

        System.out.println("Get by id:");
        System.out.println(dao.getById(2L));

        System.out.println("Get all:");
        System.out.println(animalService.getAll());

        System.out.println("Sort by name:");
        System.out.println(animalService.sortByName());

        System.out.println("Filter by gender:");
        System.out.println(animalService.filterByGender());

        System.out.println("Clear:");
        System.out.println(animalService.clear());

        
    }
}