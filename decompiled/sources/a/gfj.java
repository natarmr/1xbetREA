package a;

import java.util.Locale;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
public final class gfj extends c2 {
    public final Locale c;
    public final SimpleDate d;
    public final SimpleDate e;
    public final TimeOfDay23 f;
    public final TimeOfDay23 g;
    public final yg40 h;
    public final pz40 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfj(Locale locale, SimpleDate simpleDate, SimpleDate simpleDate2, TimeOfDay23 timeOfDay23, TimeOfDay23 timeOfDay24, yg40 yg40Var, pz40 pz40Var) {
        super(timeOfDay23, timeOfDay24);
        simpleDate.getClass();
        simpleDate2.getClass();
        yg40Var.getClass();
        pz40Var.getClass();
        this.c = locale;
        this.d = simpleDate;
        this.e = simpleDate2;
        this.f = timeOfDay23;
        this.g = timeOfDay24;
        this.h = yg40Var;
        this.i = pz40Var;
    }

    @Override // a.c2
    public final boolean E() {
        return Q() != null;
    }

    public final xk9 Q() {
        return (xk9) this.i.getValue();
    }
}
