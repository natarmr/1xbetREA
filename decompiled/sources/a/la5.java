package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"La/la5;", "La/um40;", "La/ka5;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class la5 extends um40 {
    public ka5 b;
    public odd c;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // a.um40
    public final lm40 f() {
        return new ka5(this);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
    }

    public final int hashCode() {
        return 234;
    }

    public final Object i(zje zjeVar) {
        odd oddVar = this.c;
        if (oddVar == null) {
            oddVar = new odd();
            this.c = oddVar;
            ka5 ka5Var = this.b;
            if (ka5Var != null && ka5Var.n) {
                ka5Var.o = x4d0.f0(ka5Var, new ys3(ka5Var, ka5Var.p, (byte) 26));
            }
        }
        Object objQ = oddVar.q(zjeVar);
        return objQ == wne.f39444a ? objQ : Unit.f46060a;
    }
}
