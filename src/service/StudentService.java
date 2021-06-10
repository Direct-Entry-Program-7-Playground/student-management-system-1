package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    List<Student> students = new ArrayList<>();

    public void saveStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(Student student) {
        for (Student studentFromList :
                students) {
            if (studentFromList.getNic().equals(student.getNic())) {
                deleteStudent(student.getNic());
                students.add(student);
            }
        }
    }

    public void deleteStudent(String studentId) {
        students.removeIf(student -> student.getNic().equals(studentId));
    }

    public List<Student> findAllStudents() {

        return students;
    }

    public Student findStudent(String studentId) {
        for (Student student : students
        ) {
            if (student.getNic().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> findStudents(String query) {
        List<Student> queriedStudents = new ArrayList<>();
        for (Student student : students
        ) {
            if (student.getNic().contains(query) || student.getFullName().contains(query) || student.getAddress().contains(query)) {
                queriedStudents.add(student);
            }
        }
        return queriedStudents;
    }

}
