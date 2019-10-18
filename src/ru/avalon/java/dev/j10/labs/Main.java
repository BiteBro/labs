package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    public static void main(String[] args) {

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        
        Person ivanov = new Person("Иванов", "Иван","Иванович" );
        Person petrov = new Person("Петров", "Петр");
        Person smith  = new Person("Smith", "John", "", "Edvard");

        // Создание строковых переменных содержащих полное имя
        String strIvanov = ivanov.getSurname() + ivanov.getName() + ivanov.getPatronymic();
        String strPetrov = petrov.getSurname() + petrov.getName();
        String strSmith  = smith.getName() + smith.getSecondName() + smith.getSurname();

        // установка адресов объектам Person
        ivanov.setResidenceAddress(new Address("Москва", "123 789"));
        petrov.setResidenceAddress(new Address("Санкт-Петербург", "512 643"));
        smith.setResidenceAddress(new Address("New York", "100 20"));

        // Создание строковых переменных содержащих адрес проживания
        String strIvanovAddress = ivanov.getResidenceAddress().toString();
        String strPetrovAddress = petrov.getResidenceAddress().toString();
        String strSmithAddress  = smith.getResidenceAddress().toString();

        System.out.println(smith.getFullName());
        System.out.println(strSmith);
        System.out.println(strSmithAddress);
        System.out.println();

        System.out.println(petrov.getFullName());
        System.out.println(strPetrov);
        System.out.println(strPetrovAddress);
        System.out.println();

        System.out.println(ivanov.getFullName());
        System.out.println(strIvanov);
        System.out.println(strIvanovAddress);

        //Вывод фактического места жительства и регистрации (адрес регистрации не задан!)
        System.out.println(ivanov.getAddress());


        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
