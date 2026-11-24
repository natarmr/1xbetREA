package a;

import java.util.Locale;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final class ffj extends c2 {
    public final Locale c;
    public final SimpleDate d;
    public final SimpleDate e;
    public final pz40 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffj(Locale locale, SimpleDate simpleDate, SimpleDate simpleDate2, pz40 pz40Var) {
        super((Object) null, (Object) null);
        simpleDate.getClass();
        simpleDate2.getClass();
        pz40Var.getClass();
        this.c = locale;
        this.d = simpleDate;
        this.e = simpleDate2;
        this.f = pz40Var;
    }

    @Override // a.c2
    public final boolean E() {
        return Q() != null;
    }

    public final wk9 Q() {
        return (wk9) this.f.getValue();
    }
}
