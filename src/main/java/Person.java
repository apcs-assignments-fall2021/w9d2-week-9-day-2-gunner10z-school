public class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void doSomething(){
        System.out.println("You speak to yo mother with that mouth");
    }
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
