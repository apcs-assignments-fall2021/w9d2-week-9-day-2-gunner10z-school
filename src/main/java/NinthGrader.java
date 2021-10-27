public class NinthGrader extends Person {
    // Instance variables:
    // firstName and lastName are already inherited
    private int classYear;

    // Constructors
    // A constructor that takes three parameters for the
    // firstName, lastName, and classYear
    public NinthGrader(String a, String b, int c) {
        super(a, b);
        this.classYear = c;
    }

    // A constructor that assumes that a default student is a ninth-grader
    public NinthGrader(String a, String b) {
        super(a, b);
        this.classYear = 2025;
    }

    // A default/no-argument constructor
    public NinthGrader() {
        super("Jerry", "Seinfeld");
        this.classYear = 2024;
    }


    // doSomething() method
    public void doSomething() {
        System.out.println("I'm studying!");
    }

    // toString()
    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.classYear;
        return str;
    }



    // Getters
    // We've already inherited getFirstName() and getLastName()
    // so we only need to add getClassYear
    public int getClassYear() {
        return this.classYear;
    }

    // Setters
    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }
}

