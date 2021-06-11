package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private static List<Student> studentDB = new ArrayList<>();

    @Override
    public String toString() {
        return "StudentService{} "+ studentDB.toString();
    }

    public void saveStudent(Student student) {
        studentDB.add(student);
    }

    public void updateStudent(Student student) {
        Student s = findStudent(student.getNic());
        int index = studentDB.indexOf(s);
        studentDB.set(index, student);
    }

    public void deleteStudent(String studentId) {
        studentDB.removeIf(student -> student.getNic().equals(studentId));
    }

    public List<Student> findAllStudents() {
        return studentDB;
    }

    public Student findStudent(String studentId) {

        for (Student student : studentDB
        ) {
            if (student.getNic().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> findStudents(String query) {
        List<Student> queriedStudents = new ArrayList<>();

        for (Student student : studentDB
        ) {
            if (student.getNic().contains(query) || student.getFullName().contains(query) || student.getAddress().contains(query) || student.getContact().contains(query) || student.getEmail().contains(query) || student.getDateOfBirth().toString().contains(query)) {
                queriedStudents.add(student);
            }
        }
        return queriedStudents;
    }

}
