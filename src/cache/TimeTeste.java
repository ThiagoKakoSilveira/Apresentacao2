package cache;

public class TimeTeste {
    public static void main(String[] args) {
        Time time1 = TimeFactory.getTimeByName("SANTOS");
        System.out.println(time1);
        Time time2 = TimeFactory.getTimeByName("SANTOS");
        System.out.println(time2);
        Time time3 = TimeFactory.getTimeByName("CORINTHIANS");
        System.out.println(time3);
        Time time4 = TimeFactory.getTimeByName("PONTE PRETA");
        System.out.println(time4);
        Time time5 = TimeFactory.getTimeByName("ITUANO");
        System.out.println(time5);
        Time time6 = TimeFactory.getTimeByName("BOTAFOGO");
        System.out.println(time6);
        Time time7 = TimeFactory.getTimeByName("PALMEIRAS");
        System.out.println(time7);
    }
}
