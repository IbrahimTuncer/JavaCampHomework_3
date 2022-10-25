package odev_3.dataAccess;

import odev_3.core.logging.BaseLogger;
import odev_3.oop.Category;
import odev_3.oop.Course;
import odev_3.oop.Tutor;

public class JdbcDao implements BaseDao, TutorDao, CategoryDao, CourseDao {

    @Override
    public void log(String data) {
        System.out.println("Logged with Jdbc : " + data);
    }

    @Override
    public void add(Tutor tutor) {
        System.out.println("Tutor added with Jdbc : " + tutor.getFirstName());
    }

    @Override
    public void add(Category category) {
        System.out.println("Category added with Jdbc : " + category.getCategoryName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Course added with Jdbc : " + course.getCourseName());
    }

}
