package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/gnx;", "La/um40;", "La/inx;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class gnx extends um40 {
    public final enx b;
    public final boolean c;

    public gnx(enx enxVar, boolean z) {
        this.b = enxVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        gnx gnxVar = obj instanceof gnx ? (gnx) obj : null;
        return gnxVar != null && this.b == gnxVar.b && this.c == gnxVar.c;
    }

    @Override // a.um40
    public final lm40 f() {
        inx inxVar = new inx((byte) 0);
        inxVar.p = this.b;
        inxVar.q = this.c;
        return inxVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        inx inxVar = (inx) lm40Var;
        inxVar.p = this.b;
        inxVar.q = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
