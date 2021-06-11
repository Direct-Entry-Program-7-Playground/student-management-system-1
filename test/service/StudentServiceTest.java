package service;

import model.Student;

import java.time.LocalDate;

public class StudentServiceTest {
    static {
        StudentService studentService = new StudentService();
        studentService.saveStudent(new Student("123456789V", "Chandimal", "Matara", "23161548", "chandi@email.com", LocalDate.now()));
        studentService.saveStudent(new Student("485912632V", "PKP", "Matara", "48563217", "pkp@email.com", LocalDate.now()));
        studentService.saveStudent(new Student("3576892125V", "MRR", "Kurunegala", "24576891", "mrr@email.com", LocalDate.now()));
    }

    public static void main(String[] args) {
        saveStudent();
        updateStudent();
        deleteStudent();
        findAllStudents();
        findStudents();
    }

    public static void saveStudent() {
        StudentService studentService = new StudentService();
        Student s = new Student("836452936V", "Testname", "testAddres", "91956263", "test@email.com", LocalDate.now());
        studentService.saveStudent(s);

        assert studentService.findStudent("836452936V") != null : "failed save test";
        assert studentService.findStudent("836452936V") != null : "failed save test";
    }

    public static void updateStudent() {
        StudentService studentService = new StudentService();
        Student s = new Student("836452936V", "Test new name", "testAddres", "91956263", "test@email.com", LocalDate.now());
        studentService.updateStudent(s);

        assert studentService.findStudent("836452936V") != null : "failed update test";
        assert studentService.findStudent("836452936V").getFullName().equals("Test new name") : "failed update test";
    }

    public static void deleteStudent() {
        StudentService studentService = new StudentService();
        studentService.deleteStudent("836452936V");
        assert studentService.findStudent("836452936V") == null : "failed delete test";

    }

    public static void findAllStudents() {
        StudentService studentService = new StudentService();
        assert studentService.findAllStudents().size() != 0 : "failed getting all students";

    }

    public static void findStudents() {
        StudentService studentService = new StudentService();
        assert !studentService.findStudents("").isEmpty() : "failed finding students";
    }

}
