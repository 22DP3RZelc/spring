package rvt;

public class Person {
    String name;
    Education education;

    public Person(String name, Education education)
    {
        this.name = name;
        this.education = education;
    }


    public Education getEducation(Person person)
    {
        return person.education;
    }

    public String tostring(Person person)
    {
        return person.name + ", " + person.education;
    }

}
