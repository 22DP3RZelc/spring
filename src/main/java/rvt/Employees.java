package rvt;

import java.util.ArrayList;
import java.util.List;
// import Person.tostring;

public class Employees {
    List<Person> employees;

    public void add(Person personToAdd)
    {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd)
    {
        employees.addAll(peopleToAdd);
    }

    public void print()
    {
        for (Person person : employees) 
        {
            person.tostring(person);
        }
       
    }

    public void print(Education education)
    {

    }
}
