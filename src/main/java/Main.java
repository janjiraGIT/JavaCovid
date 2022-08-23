import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
	    Valiable valiable = new Valiable();
	    //valiable.Run();

        OperatorsEx operatorsEx = new OperatorsEx();
        //operatorsEx.Run();
        IfEx ifEx = new IfEx();
        //ifEx.Run2();

        StringEx stringEx = new StringEx();
        //stringEx.Run();

        SwitchEx switchEx = new SwitchEx();
        switchEx.Run(EnumEx.SUNDAY);

        WhileEx whileEx = new WhileEx();
        //whileEx.Run(20);

        ForLoopEx forLoopEx = new ForLoopEx();
        //forLoopEx.Run();

        StringForEachLoopEx stringForEachLoopEx = new StringForEachLoopEx();
        //stringForEachLoopEx.Run();


        ConstructorEx constructorEx = new ConstructorEx("Janjira", "Erik");
        //System.out.println(constructorEx.fullname + constructorEx.familyName);

        //Person person = new Person("Benji",9,0);
        //System.out.println(person.getName() + ":" + person.getAge() + ":" + person.getSalary());

        ArrayListEx list = new ArrayListEx();
        //list.Run();

        HashMapEx hashMapEx = new HashMapEx();
        //hashMapEx.Run();

        HashSetEx hashSetEx = new HashSetEx();
        //hashSetEx.Run();

        ItelatorEx itelatorEx = new ItelatorEx();
        //itelatorEx.Run();

        EnumEx workday = EnumEx.FRIDAY;
        SwitchEx switchEx1 = new SwitchEx();
        //switchEx1.Run(workday);

        DateEx dateEx = new DateEx();
        //dateEx.Run();

        TryCatchEx tryCatchEx = new TryCatchEx();
        //tryCatchEx.Run();
        //tryCatchEx.checkAge(18);

        ScannerEx scannerEx = new ScannerEx();
        //scannerEx.Run();

        StringBuilderEx strBuilder = new StringBuilderEx();
        //strBuilder.Run();

        CountSameWord countSameWord = new CountSameWord();
        //countSameWord.Run();

        StreamEx streamEx = new StreamEx();
        //streamEx.Run();

        ArrayEx arrayEx = new ArrayEx();
        //arrayEx.Run();

        ArrayPrintOut arrayPrintOut = new ArrayPrintOut();
        //arrayPrintOut.Run();

        AverageValue averageValue = new AverageValue();
        //averageValue.RunIt();

        DifferenceValueArrayMinMax differenceValue = new DifferenceValueArrayMinMax();
        //differenceValue.RunIt();

        ArrayFindSpecificedElements arrayFindSpecificedElements = new ArrayFindSpecificedElements();
        //arrayFindSpecificedElements.RunIt();

        EmployeeData employeeData = new EmployeeData();
        //Person person = new Person("Anthony Johansson", 54, Jobs.DEVELOPER, 5);
        //employeeData.salaryCalculate(person);

        Stream stream = new Stream();
        //stream.RunIt();
        //stream.RunIt2();

        FileReadEx file = new FileReadEx();
        //file.Run();


        ArrayListScanner arrayListScanner = new ArrayListScanner();
        ArrayList<Integer> listNumbers = arrayListScanner.inputTheNumbers();
        arrayListScanner.findTheHighestNumber(listNumbers);
        arrayListScanner.findTheLowestNumber(listNumbers);
        arrayListScanner.sumAllNumbers(listNumbers);

    }
}
