/* Practical 3 
2. Create a program in java to implement multilevel inheritance and hierarchical inheritance .
Take classes like : Doctor , Surgeon and Nurse
Create methods and show method overriding
*/

// Parent class
class DoctorDemo {
    String name;
    int age;

    DoctorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void treatPatient() {
        System.out.println("Doctor is treating patient.");
    }
}

// Subclass inheriting from DoctorDemo
class Surgeon extends DoctorDemo {
    String specialization;

    Surgeon(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    //Override
    void treatPatient() {
        System.out.println("Surgeon is performing surgery.");
    }
}

// Subclass inheriting from Doctor
class Nurse extends DoctorDemo {

    Nurse(String name, int age) {
        super(name, age);
    }

    //Override
    void treatPatient() {
        System.out.println("Nurse is assisting the doctor.");
    }
}

public class Doctor 
{
    public static void main(String[] args) 
	{
        // Multilevel inheritance
        Surgeon surgeon = new Surgeon("Dr. Smith", 40, "Neurology");
        surgeon.displayDetails();
        surgeon.treatPatient();

        // Hierarchical inheritance
        Nurse nurse = new Nurse("Nurse Jane", 30);
        nurse.displayDetails();
        nurse.treatPatient();
    }
}

/*

OUTPUT

D:\Anudip Capgemini>java Doctor
Name: Dr. Smith
Age: 40
Surgeon is performing surgery.
Name: Nurse Jane
Age: 30
Nurse is assisting the doctor.
*/
