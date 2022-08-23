public class EmployeeData extends Calculation {
    @Override
    public void salaryCalculate(Person person ) {
        int salary = 0;

        switch (person.jobs) {
            case DEVELOPER:
                salary = person.workingYear * 30_000;
                printOut(person, salary);
                break;
            case ACCOUNTANT:
                salary = person.workingYear * 20_000;
                printOut(person, salary);
                break;
            case MANAGER:
                salary = person.workingYear * 35_000;
                printOut(person, salary);
                break;
            case CEO:
                salary = person.workingYear * 50_000;
                printOut(person, salary);
                break;
            case CLEANNING:
                salary = person.workingYear * 15_000;
                printOut(person, salary);
                break;
            case SCRUMMASTER:
                salary = person.workingYear * 32_000;
                printOut(person, salary);
                break;
            case PO:
                salary = person.workingYear * 38_000;
                printOut(person, salary);
                break;
        }
    }

    private void printOut(Person person, int salary) {
        System.out.println("Hello " + person.getName() + ", you earn "+ salary);
    }
}
