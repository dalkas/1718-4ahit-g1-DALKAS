package Singleton;

public class StaticPlayGroundTestDriver {
    public static void main(String[] args) {
        StaticPlayground spg1 = new StaticPlayground();
        StaticPlayground spg2 = new StaticPlayground();

        System.out.println("spg1.staticVal=" + spg1.getStaticVal());
        System.out.println("spg2.staticVal=" + spg2.getStaticVal());
        System.out.println("spg1.nonstaticVal=" + spg1.getStaticVal());
        System.out.println("spg2.nonstaticVal=" + spg2.getStaticVal());


        spg1.setStaticVal(100);
        spg1.getNonStaticVal(-100);


    }
}
