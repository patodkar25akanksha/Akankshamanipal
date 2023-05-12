package org.example;

import org.testng.annotations.Test;

public class title extends HelperClass {
    @Test
    public void titlefetch(){

        String pagetitle = getDriver().getTitle();
        System.out.print(pagetitle);

    }

}
