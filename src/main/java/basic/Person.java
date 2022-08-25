package basic;

public class Person {
    String name;
    int age;
    Jobs jobs;
    int workingYear;
    String emailAddress;
    boolean isMarried;

    public Person(String name, int age, Jobs jobs, int workingYear, String emailAddress, boolean isWorked) {
        this.name = name;
        this.age = age;
        this.jobs = jobs;
        this.workingYear = workingYear;
        this.emailAddress = emailAddress;
        this.isMarried = isWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public int getWorkingYear() {
        return workingYear;
    }

    public void setWorkingYear(int workingYear) {
        this.workingYear = workingYear;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobs=" + jobs +
                ", workingYear=" + workingYear +
                ", emailAddress='" + emailAddress + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
