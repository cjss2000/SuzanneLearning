import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Group {
    public static void main(String[] args) {

        Job plumber = new Job(1200, new Date(2001,1,1), "Plumber", 7);
        Job maid = new Job(1800, new Date(2001, 1, 1), "maid", 8 );
        Person person1 = new Person();
        Person person2 = new Person("Mark", 19);
        Person person3 = new Person("Melissa", 21, "Democrat", "23 fake street", "female");
        Person person4 = new Person("Kristen", 18, "Democrat", "Flordia", "female");
        Person person5 = new Person("Kelly", 23, "Republican", "34543 fake drive", "Female");
        person3.getAJob(maid);
        person4.getAJob(plumber);
        person5.assignJob(2300, new Date(2001, 1, 1), "Sys admin", 12);

        person5.job.getPromotion(200);
        System.out.println(person5.job.getSalary());
        person5.job.jobSpecs();
        person4.job.addVacationDays(4);
        person4.job.jobSpecs();

        Person personList = new Person();

        personList.startAPersonList();
        personList.addPerson(person3);
        personList.addPerson(person4);
        personList.addPerson(person5);
        personList.viewPeople();

        //give everyone a job with salary, give everyone an age
        //make a scatter plot of salary vs age
        //after assigning salary and age, collect information.





//        person1.setAge(12);
//        person1.setName("Marty");
//
//    int score1 = person3.compatabilityScore(person4);
//    // System.out.println(score1);
//
//     int kellyMelissaScore = person3.compatabilityScore(person5);
//
//        System.out.println(person3.personComparer(person4));
//        int newPersonTest = person3.compatabilityScore(new Person("Steve", 18, "1232 ", "dfsd", "male"));
        // System.out.println(newPersonTest);

//        person3.compatabilityScore(person4);
//        person3.viewScoreCard();
//        person4.compatabilityScore(person5);
//        person5.compatabilityScore(person4);
//        person5.viewScoreCard();
//        person5.viewCompScore();

    }
}