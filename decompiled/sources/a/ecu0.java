package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/ecu0;", "La/um40;", "La/fcu0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ecu0 extends um40 {
    public final yx7 b;

    public ecu0(yx7 yx7Var) {
        this.b = yx7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ecu0 ecu0Var = obj instanceof ecu0 ? (ecu0) obj : null;
        if (ecu0Var == null) {
            return false;
        }
        return this.b.equals(ecu0Var.b);
    }

    @Override // a.um40
    public final lm40 f() {
        fcu0 fcu0Var = new fcu0();
        fcu0Var.o = this.b;
        return fcu0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((fcu0) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.f43406a);
    }
}
