package odev_3;

import odev_3.core.logging.BaseLogger;
import odev_3.core.logging.DatabaseLogger;
import odev_3.core.logging.FileLogger;
import odev_3.dataAccess.HibernateDao;
import odev_3.dataAccess.JdbcDao;
import odev_3.dataAccess.TutorDao;
import odev_3.managers.CategoryManager;
import odev_3.managers.CourseManager;
import odev_3.managers.TutorManager;
import odev_3.oop.Category;
import odev_3.oop.Course;
import odev_3.oop.Tutor;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Tutor tutor = new Tutor("Ibrahim", "Tuncer", 1, 4);
        Category category = new Category("Software Courses", 1);
        Course course = new Course("Layered Architecture", "Ibrahim", true, 0, 0);

        BaseLogger[] loggers = {new DatabaseLogger(),new FileLogger()};
        
        TutorManager tutorManager = new TutorManager(new JdbcDao(), loggers);
        tutorManager.add(tutor);
        
        CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
        categoryManager.add(category);
        
        CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
        courseManager.add(course);
        
    }
}
