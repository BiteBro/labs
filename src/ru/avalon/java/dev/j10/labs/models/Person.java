package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    private String   name;
    private String   patronymic;  // отчество
    private String   secondName;  // второе мия
    private String   surname;
    private String   birthday;
    private Passport passport;
    private Address  residenceAddress;

    public Person(String surname, String name){
        this.name = name;
        this.surname = surname;
    }
    public Person(String surname, String name, String patronymic){
        this(surname, name);
        this.patronymic = patronymic;
    }
    public Person(String surname, String name, String patronymic, String secondName){
        this(surname, name, patronymic);
        this.secondName = secondName;
    }
    public Person(String surname, String name, String patronymic, Address residenceAddress){
        this(surname, name, patronymic);
        this.residenceAddress = residenceAddress;
    }

//    public Person(String surname, String name,  String birthday){
//        this.name = name;
//        this.birthday = birthday;
//        this.surname = surname;
//    }
//    public Person(String surname, String name, String secondName, String birthday){
//        this(surname, name, birthday);
//        this.secondName = secondName;
//    }
//    public Person(String surname, String name, String secondName, String birthday, Address residenceAddress){
//        this(surname, name, birthday, secondName);
//        this.residenceAddress = residenceAddress;
//    }

    public String getName() {
        return name + " ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname + " ";
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic + " ";
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSecondName() {
        return secondName + " ";
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setResidenceAddress(Address residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public Address getResidenceAddress() {
        return residenceAddress;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */

    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        if (residenceAddress != null && passport != null) {
             return "Residence: " + residenceAddress.toString() + "\n" +
                    "Registration: " + passport.getRegistrationAddress().toString() + "\n";
        }
        if (residenceAddress != null){
             return "Residence: " + residenceAddress.toString() +
                    "\nRegistration: Address not set!";
        }
        if (passport != null){
             return "Registration: " + passport.getRegistrationAddress().toString() +
                    "\nResidence: Address not set!";
        }
        return "ERROR: Address not set!";
    }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */

    public String getFullName() {

        if (secondName != null) {
            return  (name + " " + secondName.charAt(0) + ". " + surname);
        }
        if (patronymic == null) {
            return surname + " " + name;
        }

        return surname + " " + name + " " + patronymic;
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
    }
}