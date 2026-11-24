package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/wkw;", "La/um40;", "La/xkw;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wkw extends um40 {
    public final xx7 b;

    public wkw(xx7 xx7Var) {
        this.b = xx7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        wkw wkwVar = obj instanceof wkw ? (wkw) obj : null;
        if (wkwVar == null) {
            return false;
        }
        return this.b.equals(wkwVar.b);
    }

    @Override // a.um40
    public final lm40 f() {
        xkw xkwVar = new xkw();
        xkwVar.o = this.b;
        return xkwVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((xkw) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.f41642a);
    }
}
