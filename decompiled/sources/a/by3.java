package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/by3;", "La/um40;", "La/jy3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class by3 extends um40 {
    public final float b;
    public final boolean c;

    public by3(float f, boolean z) {
        this.b = f;
        this.c = z;
        if (f > 0.0f) {
            return;
        }
        vcx.a("aspectRatio " + f + " must be > 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        by3 by3Var = obj instanceof by3 ? (by3) obj : null;
        if (by3Var != null && this.b == by3Var.b) {
            if (this.c == ((by3) obj).c) {
                return true;
            }
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        jy3 jy3Var = new jy3();
        jy3Var.o = this.b;
        jy3Var.p = this.c;
        return jy3Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        jy3 jy3Var = (jy3) lm40Var;
        jy3Var.o = this.b;
        jy3Var.p = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
