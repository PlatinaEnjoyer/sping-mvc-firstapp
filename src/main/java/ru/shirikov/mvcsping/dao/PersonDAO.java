package ru.shirikov.mvcsping.dao;

import org.springframework.stereotype.Component;
import ru.shirikov.mvcsping.models.Person;


import java.sql.Connection;
import java.sql.DriverManager;


@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;

    private static final String url1 = "jdbc:postgresql://localhost:5432/first_db";
    private static final String username1 = "postgres";
    private static final String password1 = "L0winSEnz5";

    private static Connection connection1;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    connection1 = DriverManager.getConnection(url1, username1, password1); // не работает, но в видеоуроке, по которому я учусь все так же

//    public List<Person> index(){
 //       return people;
//    }

//    public Person show(int id){
//        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
//    }

//    public void save(Person person) {
//        person.setId(++PEOPLE_COUNT);
//        people.add(person);
//    }

//    public void update(int id, Person updatedPerson){
//        Person personToBeUpdated = show(id);
//        personToBeUpdated.setName(updatedPerson.getName());
//    }

//    public void delete(int id){
    //    people.removeIf(p -> p.getId() == id);
  //  }
}
