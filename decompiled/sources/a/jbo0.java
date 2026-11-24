package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/jbo0;", "La/um40;", "La/lbo0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class jbo0 extends um40 {
    public final l7m0 b;
    public final int c;
    public final boolean d;
    public final nul0 e;

    public jbo0(l7m0 l7m0Var, int i, boolean z, nul0 nul0Var) {
        this.b = l7m0Var;
        this.c = i;
        this.d = z;
        this.e = nul0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jbo0) {
            jbo0 jbo0Var = (jbo0) obj;
            if (this.b == jbo0Var.b && this.c == jbo0Var.c && this.d == jbo0Var.d && this.e.equals(jbo0Var.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        lbo0 lbo0Var = new lbo0();
        lbo0Var.o = this.b;
        lbo0Var.p = this.c;
        lbo0Var.q = this.d;
        lbo0Var.r = this.e;
        return lbo0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        lbo0 lbo0Var = (lbo0) lm40Var;
        lbo0Var.o = this.b;
        lbo0Var.p = this.c;
        lbo0Var.q = this.d;
        lbo0Var.r = this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(twn.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.b + ", selectedTabIndex=" + this.c + ", followContentSize=" + this.d + ", animationSpec=" + this.e + ')';
    }
}
