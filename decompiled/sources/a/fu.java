package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/fu;", "La/um40;", "La/gu;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class fu extends um40 {
    public final a6p0 b;

    public fu(a6p0 a6p0Var) {
        this.b = a6p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fu) {
            return this.b == ((fu) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        gu guVar = new gu();
        guVar.q = this.b;
        t1 t1Var = new t1(guVar, (byte) 15);
        eu euVar = new eu();
        euVar.o = t1Var;
        guVar.Z0(euVar);
        return guVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((gu) lm40Var).q = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
