package GDSC.backend.GDSC_4th_HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private B b;
    private C c;

    public A() {}

    /* setter */
    @Autowired
    public void setB(B b) {
        this.b = b;
    }

    @Autowired
    public void setC(C c) {
        this.c = c;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}
