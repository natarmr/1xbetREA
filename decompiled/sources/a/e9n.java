package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/e9n;", "La/um40;", "La/d9n;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class e9n extends um40 {
    public final d1v0 b;
    public final Function0 c;

    public e9n(d1v0 d1v0Var, Function0 function0) {
        this.b = d1v0Var;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9n)) {
            return false;
        }
        e9n e9nVar = (e9n) obj;
        return this.b.equals(e9nVar.b) && this.c.equals(e9nVar.c);
    }

    @Override // a.um40
    public final lm40 f() {
        return new d9n(this.b, this.c);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        d9n d9nVar = (d9n) lm40Var;
        d9nVar.getClass();
        d1v0 d1v0Var = d9nVar.p;
        d1v0 d1v0Var2 = this.b;
        d9nVar.p = d1v0Var2;
        if (!d1v0Var.equals(d1v0Var2)) {
            c4m0 c4m0Var = d9nVar.r;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            d9nVar.r = null;
            if (d9nVar.s) {
                d9nVar.Z0();
            }
        }
        vfc.J(d9nVar);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DsWaveAnimationEffectItemNodeElement(config=" + this.b + ", onAnimationFinished=" + this.c + Separators.RPAREN;
    }
}
