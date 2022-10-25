package odev_3.managers;

import odev_3.dataAccess.TutorDao;
import odev_3.core.logging.BaseLogger;
import odev_3.oop.Tutor;

public class TutorManager {

    private TutorDao tutorDao;
    private BaseLogger[] loggers;

    public TutorManager(TutorDao tutorDao, BaseLogger[] loggers) {
        this.tutorDao = tutorDao;
        this.loggers = loggers;
    }

    public void add(Tutor tutor) {
        tutorDao.add(tutor);
    }

}
