package odev_2_3;

public class Main {

    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new TeacherCreditManager(),
            new AgricultureCreditManager(),new StudentCreditManager()};
        
        for(BaseCreditManager credits : creditManagers ){
            System.out.println(credits.calculate(1000));
        }
    }

}
