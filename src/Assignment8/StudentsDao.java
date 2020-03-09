package session6;

import java.util.ArrayList;

public interface StudentsDao {
     ArrayList<Student> list();
    boolean create(Student s);
    boolean update(Student s);
    boolean delete(Student s);

}
