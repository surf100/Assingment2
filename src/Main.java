import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> person_data = new ArrayList<>();
        Employee Rasul = new Employee("Rasul","Satmyrza","Trader",300000.00);
        Employee Abylai = new Employee("Abylai","Ahmet","Activist",400000.00);
        Student Davlat = new Student("Davlat","Sunnatov",3.46);
        Student Beka = new Student("Bekzat","Nakiev",2.0);
        person_data.add(Rasul);
        person_data.add(Abylai);
        person_data.add(Davlat);
        person_data.add(Beka);
        Collections.sort(person_data, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Double.valueOf(person1.getPaymentAmount()).compareTo(person2.getPaymentAmount());
            }
        });
        for(Person person : person_data){
            System.out.println(person);
        }

        }
    }
