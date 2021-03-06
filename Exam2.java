package com.company;

import java.util.Objects;

public class Person {
    String lastname;
    String firstname;
    String patronymic;

    public Person(String name, String firstname, String patronymic) {
        this.lastname = name;
        this.firstname = firstname;
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastname, person.lastname) &&
                Objects.equals(firstname, person.firstname) &&
                Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, patronymic);
    }
}
package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        LinkedList<String> Persons = new LinkedList<>();

        Person person = new Person("Isaev","Edil","Maratovich");
        if (Persons.contains(person)){
            throw  new Exception("Error");
        }


    }
}
