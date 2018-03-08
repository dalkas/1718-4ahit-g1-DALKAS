package Singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class TakeCareThatIDontBecomeAGodClassTest {
    @Test
    public void getInstance() throws Exception {
        int val = new TakeCareThatIDontBecomeAGodClass.getInstance().getVal();

        System.out.println("val=" +val);
    }
}