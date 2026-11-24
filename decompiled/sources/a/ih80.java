package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/ih80;", "La/um40;", "La/jh80;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ih80 extends um40 {
    public final lh80 b;

    public ih80(lh80 lh80Var) {
        this.b = lh80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ih80) {
            return ((ih80) obj).b.equals(this.b);
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        jh80 jh80Var = new jh80();
        jh80Var.q = this.b;
        return jh80Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        jh80 jh80Var = (jh80) lm40Var;
        lh80 lh80Var = jh80Var.q;
        lh80 lh80Var2 = this.b;
        if (lh80Var2.equals(lh80Var)) {
            return;
        }
        jh80Var.q = lh80Var2;
        jh80Var.a1();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
