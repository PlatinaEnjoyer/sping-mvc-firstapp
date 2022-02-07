package ru.shirikov.mvcsping.dao;

import org.springframework.stereotype.Component;
import ru.shirikov.mvcsping.models.Person;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;

    private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "L0winSEnz5";

    private static Connection connection1;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    connection1 = DriverManager.getConnection(url,user,password);

    public List<Person> index(){
        return people;
    }

//    public Person show(int id){
//        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
//    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

//    public void update(int id, Person updatedPerson){
//        Person personToBeUpdated = show(id);
//        personToBeUpdated.setName(updatedPerson.getName());
//    }

    public void delete(int id){
        people.removeIf(p -> p.getId() == id);
    }
}
