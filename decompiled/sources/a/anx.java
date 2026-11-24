package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/anx;", "La/um40;", "La/bnx;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class anx extends um40 {
    public final enx b;
    public final boolean c;

    public anx(enx enxVar, boolean z) {
        this.b = enxVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        anx anxVar = obj instanceof anx ? (anx) obj : null;
        return anxVar != null && this.b == anxVar.b && this.c == anxVar.c;
    }

    @Override // a.um40
    public final lm40 f() {
        bnx bnxVar = new bnx((byte) 0);
        bnxVar.p = this.b;
        bnxVar.q = this.c;
        return bnxVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        bnx bnxVar = (bnx) lm40Var;
        bnxVar.p = this.b;
        bnxVar.q = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
