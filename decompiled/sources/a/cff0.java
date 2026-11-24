package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/cff0;", "La/um40;", "La/eff0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class cff0 extends um40 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cff0 ? (cff0) obj : null) != null && ycl.b(24.0f, 24.0f) && ycl.b(36.0f, 36.0f);
    }

    @Override // a.um40
    public final lm40 f() {
        eff0 eff0Var = new eff0();
        eff0Var.o = 24.0f;
        eff0Var.p = 36.0f;
        eff0Var.q = true;
        return eff0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        eff0 eff0Var = (eff0) lm40Var;
        eff0Var.getClass();
        if (!ycl.b(eff0Var.o, 24.0f) || !ycl.b(eff0Var.p, 36.0f) || !eff0Var.q) {
            vcc.Z(eff0Var).V(false);
        }
        eff0Var.o = 24.0f;
        eff0Var.p = 36.0f;
        eff0Var.q = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + defpackage.c.a(Float.hashCode(24.0f) * 31, 36.0f, 31);
    }

    public final String toString() {
        return b1j.k("RelativeOffsetModifierElement(x=", ycl.c(24.0f), ", y=", ycl.c(36.0f), ", rtlAware=true)");
    }
}
