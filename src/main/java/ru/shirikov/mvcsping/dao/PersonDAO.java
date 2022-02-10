package ru.shirikov.mvcsping.dao;

import org.springframework.stereotype.Component;
import ru.shirikov.mvcsping.models.Person;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


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

        try {
            connection1 = DriverManager.getConnection(url1, username1, password1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<Person> index(){
        List<Person> people = new ArrayList<>();

        try {
            Statement statement = connection1.createStatement();
            String SQL = "SELECT * FROM person";
            ResultSet resultSet = statement.executeQuery(SQL);

            while(resultSet.next()){
                Person person = new Person();
                person.setId( resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));

                people.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return people;
    }

   public Person show(int id){
//        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
       return null;
   }

    public void save(Person person) {
 //       person.setId(++PEOPLE_COUNT);
//        people.add(person);

        try {
            Statement statement = connection1.createStatement();
            String SQL = "INSERT INTO person VALUES(" + 1 + ",'" + person.getName() + "')";

            statement.executeUpdate(SQL);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update(int id, Person updatedPerson){
 //      Person personToBeUpdated = show(id);
  //     personToBeUpdated.setName(updatedPerson.getName());
    }

    public void delete(int id){
   //     people.removeIf(p -> p.getId() == id);
    }
}
