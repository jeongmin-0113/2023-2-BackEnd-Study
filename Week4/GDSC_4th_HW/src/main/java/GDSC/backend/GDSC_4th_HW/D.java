package GDSC.backend.GDSC_4th_HW;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class D {
    private final C c;

    public C getC() {
        return c;
    }
}
