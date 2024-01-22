public abstract class Person implements Payable,Comparable<Person>{
    private static int id_gen = 0;
    private int id;
    private String name;
    private String surname;
    public Person(){
    }
    public Person(String name,String surname){
        setName(name);
        setSurname(surname);
        this.id_gen++;
        this.id = id_gen;

    }
    public int compareTo(Person person){
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
    public abstract String getPosition();
    @Override
    public String toString() {
        return  getPosition() +
                "\nid = " + getId() +
                "\nname = " + name +
                "\nsurname = " + surname;
    }
}
