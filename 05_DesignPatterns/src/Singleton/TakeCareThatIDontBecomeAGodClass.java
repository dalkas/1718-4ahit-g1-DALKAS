package Singleton;

/**
 * Created by Asmen Dalkilic on 30.11.2017.
 */
public class TakeCareThatIDontBecomeAGodClass {
    private static TakeCareThatIDontBecomeAGodClass ourInstance = new TakeCareThatIDontBecomeAGodClass();

    private int val;

    public TakeCareThatIDontBecomeAGodClass() {
        val=0;
        myInfo="No Info!";
    }

    private String myInfo;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getMyInfo() {
        return myInfo;
    }

    public void setMyInfo(String myInfo) {
        this.myInfo = myInfo;
    }

    public static TakeCareThatIDontBecomeAGodClass getInstance() {
        return ourInstance;
    }
}
