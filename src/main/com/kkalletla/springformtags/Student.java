package main.com.kkalletla.springformtags;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
    private String[] operatingSystem;

    private LinkedHashMap<String,String> languages;
    private LinkedHashMap<String,String> countries;
    private LinkedHashMap<String,String> operatingSystems;
    public Student() {
        setCountries();
        setLanguages();
        setOperatingSystems();
    }

    /*public Student(String firstName, String lastName, String country, String favouriteLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favouriteLanguage = favouriteLanguage;
        setCountries();
        setLanguages();
    }*/

    public LinkedHashMap<String, String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems() {
        operatingSystems = new LinkedHashMap<>();
        operatingSystems.put("Win","Windows");
        operatingSystems.put("Mac","Mac");
        operatingSystems.put("Linux","Linux");
        operatingSystems.put("UNIX","UNIX");
    }

    public void setCountries() {
        countries = new LinkedHashMap<>();
        countries.put("BR","Brazil");
        countries.put("FR","France");
        countries.put("DE","Germany");
        countries.put("IN","India");
    }

    public LinkedHashMap<String, String> getCountries() {
        return countries;
    }

    public LinkedHashMap<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages() {
        languages = new LinkedHashMap<>();
        languages.put("Java","Java");
        languages.put("C++","C++");
        languages.put("C#","C#");
        languages.put("PL/SQL","PL/SQL");
        languages.put("JS","JS");
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
