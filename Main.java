public class Main {
public static void main(String[] args) {
Student s1 = new Student("juliusz", "cezar", "s98293", "s98293@pjwstk.edu.pl", "andrutowa 69");
s1.addGrades(5);
s1.addGrades(3.5);
StudentGroup g1 = new StudentGroup("14c");
g1.add(s1);
System.out.println(s1.toString());
}
}

