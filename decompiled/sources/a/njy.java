package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/njy;", "La/um40;", "La/ojy;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class njy extends um40 {
    public final xcz b;

    public njy(xcz xczVar) {
        xczVar.getClass();
        this.b = xczVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        njy njyVar = obj instanceof njy ? (njy) obj : null;
        return njyVar != null && this.b == njyVar.b;
    }

    @Override // a.um40
    public final lm40 f() {
        xcz xczVar = this.b;
        xczVar.getClass();
        ojy ojyVar = new ojy();
        ojyVar.o = xczVar;
        ojyVar.r = -1;
        ojyVar.s = -1;
        ojyVar.t = rzf0.f31357a;
        return ojyVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ojy ojyVar = (ojy) lm40Var;
        ojyVar.getClass();
        xcz xczVar = this.b;
        xczVar.getClass();
        if (ojyVar.o == xczVar) {
            return;
        }
        ojyVar.o = xczVar;
        if (ojyVar.n) {
            ojyVar.Z0();
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
