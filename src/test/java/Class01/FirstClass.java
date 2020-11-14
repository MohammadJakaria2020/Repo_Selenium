package Class01;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass {
    // Annotation
    @Test
    public void method1() {
        System.out.println("Hello World");

        int a = 100;
        int b = 120;
        boolean res= b<a;
        //Assert.assertTrue(res,"res is not as expected");
        //Assert.assertFalse(res, "res is as expected");
        Assert.assertEquals(b,a,"a & are not equal");
    }


    @Test
    public void method2() {
        System.out.println("Method 2");
    }
    //Assert  ---> is used to verify / verification



}
