package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/i5q0;", "La/um40;", "La/j5q0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i5q0 extends um40 {
    public final hcp0 b;
    public final bu c;
    public final f7q0 d;
    public final sme e;

    public i5q0(hcp0 hcp0Var, bu buVar, f7q0 f7q0Var, sme smeVar) {
        this.b = hcp0Var;
        this.c = buVar;
        this.d = f7q0Var;
        this.e = smeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5q0)) {
            return false;
        }
        i5q0 i5q0Var = (i5q0) obj;
        return this.b == i5q0Var.b && this.c == i5q0Var.c && this.d == i5q0Var.d && this.e == i5q0Var.e;
    }

    @Override // a.um40
    public final lm40 f() {
        return new j5q0(this.b, this.c, this.d, this.e);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        j5q0 j5q0Var = (j5q0) lm40Var;
        j5q0Var.q.b = null;
        hcp0 hcp0Var = this.b;
        j5q0Var.q = hcp0Var;
        hcp0Var.b = j5q0Var;
        hcp0Var.c = j5q0Var.n ? iwq0.c : iwq0.b;
        j5q0Var.r = this.c;
        j5q0Var.s = this.d;
        j5q0Var.t = this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }
}
