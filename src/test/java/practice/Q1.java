package practice;

import org.testng.annotations.Test;

public class Q1 {
    @Test (priority = 10)
    public void b(){
        System.out.println("b");
    }

    @Test (enabled = false)
    public void a(){
        System.out.println("a");
    }
    @Test (dependsOnMethods = "b")
    public void c(){
        System.out.println("c");
    }
    @Test(dependsOnMethods = "d")
    public void f(){
        System.out.println("f");
    }
    @Test
    public void e(){
        System.out.println("e");
    }
    @Test
    public void d(){
        System.out.println("d");
    }


}
