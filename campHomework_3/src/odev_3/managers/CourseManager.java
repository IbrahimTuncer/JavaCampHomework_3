package odev_3.managers;

import odev_3.core.logging.BaseLogger;
import odev_3.dataAccess.CourseDao;
import odev_3.oop.Course;

public class CourseManager {

    private CourseDao courseDao;
    private BaseLogger[] loggers;

    public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        courseDao.add(course);

        for (BaseLogger logger : loggers) {
            if (course.getCourseName() == "The old one") {
                throw new Exception();
            } else if (course.getCoursePrice() < 0) {
                throw new Exception();
            }
            else{
                
            }

        }
    }
}
