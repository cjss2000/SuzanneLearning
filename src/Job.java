import java.util.Date;


//package group;
public class Job {

    int salary;
    Date hireDate;
    String jobTitle;
    int vacationDays;

    Job(){

    }

    Job(int salary, Date hireDate, String jobTitle, int vacationDays){
        this.salary = salary;
        this.hireDate = hireDate;
        this.jobTitle = jobTitle;
        this.vacationDays = vacationDays;

    }

    Job(int salary, String jobTitle){
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public Date getHireDate(){
        return hireDate;
    }
    public void setHireDate(Date hireDate){
        this.hireDate = hireDate;
    }

    public String getJobTitle(){
        return  jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public int getVacationDays(){
        return  vacationDays;
    }
    public void setVacationDays(int vacationDays){
        this.vacationDays = vacationDays;
    }

    public void getPromotion(int addtionalAmount){
        this.salary += addtionalAmount;

    }

    public void getDemotion(int deductionAmount){
        this.salary = this.salary - deductionAmount;
    }

    public void getBonus(int bonusAmount){
        this.salary +=bonusAmount;
    }

    public void addVacationDays (int addtionalDays){
        this.vacationDays += addtionalDays;
    }
    public void removeVacationDays (int removalDays) {
        this.vacationDays -= removalDays;
    }
    public void jobSpecs(){
        System.out.println("starting salary: " + this.salary);
        System.out.println("Job title: " + this.jobTitle);
        System.out.println("Start date: " +this.hireDate);
        System.out.println("vacation days: " + this.vacationDays);
    }



}
