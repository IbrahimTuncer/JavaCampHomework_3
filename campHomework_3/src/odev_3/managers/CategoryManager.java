package odev_3.managers;

import odev_2_2.FileLogger;
import odev_3.core.logging.BaseLogger;
import odev_3.dataAccess.CategoryDao;
import odev_3.oop.Category;

public class CategoryManager {

    
    private CategoryDao categoryDao;
    private BaseLogger[] loggers;

    public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    
    
    public void add(Category category) throws Exception {
        categoryDao.add(category);
        for(BaseLogger logger : loggers){
            if(category.getCategoryName()=="The old one"){
                throw new Exception(); 
            }
                
}
        
    }

}
