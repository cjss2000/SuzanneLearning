//package group;

/**
 * @author cjss2
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class Person {


    private String name;
    private int age;
    private String address;
    private String voter_affiliation;
    private String gender;

    private List<Person> compatabilityList = new ArrayList<>();
    private HashMap<Person, Integer> compScore = new HashMap<>();
    private List<Person> personList;



    Job job;

    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        boolean ageCheck = this.checkAge(age);
        if (ageCheck) {
            this.age = age;
        }

    }

    Person(String name, int age, String voter_affiliation, String address, String gender) {
        this.name = name;
        boolean ageCheck = this.checkAge(age);
        if (ageCheck) {
            this.age = age;
        }

        this.voter_affiliation = voter_affiliation;
        this.address = address;
        this.gender = gender;
    }

    public boolean checkAge(int age) {
        if (age < 0) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        boolean ageIsPostive;
        ageIsPostive = this.checkAge(age);
        if (ageIsPostive) {
            this.age = age;
        }
    }

    public String printCandidate() {
        if (this.voter_affiliation == "taco truck") {
            System.out.println("that's not a candidate, dummy");
            return "";
        }
        if (this.voter_affiliation == "Democrat") {
            System.out.println("Your candidate is Joe Biden");
            return "Joe Biden";
        }
        if (this.voter_affiliation == "Republican") {
            System.out.println("Your candidate is Trump");
            return "Trump";
        }
        return "No candidate found";
    }

    public boolean personComparer(Person newperson) {
        boolean isCompatable = false;
        if (this.voter_affiliation.equals(newperson.voter_affiliation)) {
            System.out.println("Hey we are the same!");
            isCompatable = true;
        } else System.out.println("We don't match!");
        return isCompatable;

    }

    public int compatabilityScore(Person newPerson) {
        int scoreCard = 0;

        if (this.voter_affiliation == newPerson.voter_affiliation) {
            scoreCard += 10;
        }
        Character firstLetter = this.name.charAt(0);
        String firstStgLetter = firstLetter.toString();
        if (newPerson.getName().startsWith(firstStgLetter)) {
            System.out.println("hey our names kinda match");
            scoreCard += 2;
        }
        int ageDifference = this.age - newPerson.age;
        if (ageDifference < 10) {
            System.out.println("hey we are the same generation!");
            scoreCard += 5;

        }
        if (scoreCard > 10) {
            compatabilityList.add(newPerson);
        }
        compScore.put(newPerson, scoreCard);
        return scoreCard;
    }

    public void viewScoreCard() {
        System.out.printf("%s is compatible with: \n", this.name);
        for (Person stuff : compatabilityList) {
            System.out.println(stuff.getName());
        }
    }

    public void viewCompScore() {
        for (Person stuff : compScore.keySet()) {
            System.out.printf("%s has a score of %d", stuff.name, compScore.get(stuff));

        }
    }

    public void getAJob(Job job) {
        this.job = job;
    }

    public void assignJob(int salary, Date hireDate, String jobTitle, int vacationDays) {
        this.job = new Job(salary, hireDate, jobTitle, vacationDays);
    }

    public void startAPersonList() {
       this.personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
            this.personList.add(person);
        }


    public void viewPeople() {
        System.out.println("Here are the people listed within the person list: ");
        for (Person people : this.personList) {
            System.out.println("People" + people);
        }

    }

//    public List<Integer> ageList(){
//        List<Integer> ageList = new ArrayList<>();
//        for (Person person : this.personList){
//           ageList.add(person.getAge());
//        }
//    }
    @Override
    public String toString(){
        return "Personnel information:"  + this.name + " " + this.address + " " + this.voter_affiliation + " " + this.age;
    }

}