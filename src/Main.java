import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //create ArrayList to store objects of type person
        ArrayList<Person> person_data = new ArrayList<>();
        //creating objects of Employee and Student classes
        Employee Rasul = new Employee("Rasul","Satmyrza","Trader",300000.00);
        Employee Abylai = new Employee("Abylai","Ahmet","Activist",400000.00);
        Student Davlat = new Student("Davlat","Sunnatov",3.46);
        Student Beka = new Student("Bekzat","Nakiev",2.0);

        person_data.add(Rasul);
        person_data.add(Abylai);
        person_data.add(Davlat);
        person_data.add(Beka);
        //sorting them with compareTo method,which in Person class
        Collections.sort(person_data);

        printData(person_data);
        }
        //creating printData method
        public static void printData(Iterable<Person> persons){
            for (Person person : persons){
                //iterating through ArrayList and printing its objects
                System.out.println(person);
            }
        }
    }
