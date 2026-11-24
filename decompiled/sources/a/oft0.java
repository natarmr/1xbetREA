package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/oft0;", "La/um40;", "La/pft0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class oft0 extends um40 {
    public final float b;
    public final float c;

    public oft0(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oft0)) {
            return false;
        }
        oft0 oft0Var = (oft0) obj;
        return ycl.b(this.b, oft0Var.b) && ycl.b(this.c, oft0Var.c);
    }

    @Override // a.um40
    public final lm40 f() {
        pft0 pft0Var = new pft0();
        pft0Var.o = this.b;
        pft0Var.p = this.c;
        return pft0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        pft0 pft0Var = (pft0) lm40Var;
        pft0Var.o = this.b;
        pft0Var.p = this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
