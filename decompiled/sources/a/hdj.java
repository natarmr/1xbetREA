package a;

import java.util.Locale;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final class hdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f12873a;
    public final SimpleDate b;
    public final SimpleDate c;
    public final pz40 d;

    public hdj(Locale locale, SimpleDate simpleDate, SimpleDate simpleDate2, pz40 pz40Var) {
        simpleDate.getClass();
        simpleDate2.getClass();
        pz40Var.getClass();
        this.f12873a = locale;
        this.b = simpleDate;
        this.c = simpleDate2;
        this.d = pz40Var;
    }

    public final SimpleDate a() {
        return (SimpleDate) this.d.getValue();
    }
}
