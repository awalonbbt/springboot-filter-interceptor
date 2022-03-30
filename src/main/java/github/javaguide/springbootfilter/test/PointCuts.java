package github.javaguide.springbootfilter.test;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {
    @Pointcut(value = "within(github.javaguide.springbootfilter.controller.*)")
    public void aopDemo() {
    }
}
