package odev_3.dataAccess;

import odev_3.core.logging.BaseLogger;
import odev_3.oop.Category;
import odev_3.oop.Course;
import odev_3.oop.Tutor;

public class HibernateDao implements BaseDao, TutorDao, CategoryDao, CourseDao {

    @Override
    public void log(String data) {
        System.out.println("Logged with Hibernate : " + data);
    }

    @Override
    public void add(Tutor tutor) {
        System.out.println("Tutor added with Hibernate : " + tutor.getFirstName());
    }

    @Override
    public void add(Category category) {
        System.out.println("Category added with Hibernate : " + category.getCategoryName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Course added with Hibernate : " + course.getCourseName());
    }

}
