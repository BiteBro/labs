package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

import java.util.regex.PatternSyntaxException;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    private Person person;
    private Address registrationAddress;

    private String seriesAndDocNumber;
//    private String name;
//    private String surname;
//    private String secondName;
    private String dateOfIssue;
    private String organization;

    public Passport(String seriesAndDocNumber, String dateOfIssue, String organization){
        this.seriesAndDocNumber = seriesAndDocNumber;
        this.dateOfIssue = dateOfIssue;
        this.organization = organization;
    }

    public Passport(Person person, String seriesAndDocNumber, String dateOfIssue, String organization){
        this(seriesAndDocNumber, dateOfIssue, organization);
        this.person = person;

    }
    public Passport(Person person, Address registrationAddress, String seriesAndDocNumber, String dateOfIssue, String organization){
        this(person, seriesAndDocNumber, dateOfIssue, organization);
        this.registrationAddress = registrationAddress;
    }

    public Address getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(Address registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getSeriesAndDocNumber() {
        return seriesAndDocNumber;
    }

    public void setSeriesAndDocNumber(String seriesAndDocNumber) {
        this.seriesAndDocNumber = seriesAndDocNumber;
    }

    public String getName() {
        return person.getName();
    }

    public void setName(String name) {
        person.setName(name);
    }

    public String getSurname() {
        return person.getSurname();
    }

    public void setSurname(String surname) {
       person.setSurname(surname);
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

//    public String getSecondName() {
//        return secondName;
//    }
//
//    public void setSecondName(String secondName) {
//        this.secondName = secondName;
//    }

//    public Date getBirthday() {
//        return person.getBirthday();
//    }
//
//    public void setBirthday(Date birthday) {
//        person.setBirthday(birthday);
//    }

//    public Date getDateOfIssue() {
//        return dateOfIssue;
//    }
//
//    public void setDateOfIssue(Date dateOfIssue) {
//        this.dateOfIssue = dateOfIssue;
//    }

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
