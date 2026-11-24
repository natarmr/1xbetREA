package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/btv0;", "La/um40;", "La/etv0;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class btv0 extends um40 {
    public final xcz b;
    public final xcz c;
    public final ywv0 d;
    public final boolean e;

    public btv0(xcz xczVar, xcz xczVar2, ywv0 ywv0Var, boolean z) {
        ywv0Var.getClass();
        this.b = xczVar;
        this.c = xczVar2;
        this.d = ywv0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        btv0 btv0Var = obj instanceof btv0 ? (btv0) obj : null;
        return btv0Var != null && this.b == btv0Var.b && this.c == btv0Var.c && this.d == btv0Var.d && this.e == btv0Var.e;
    }

    @Override // a.um40
    public final lm40 f() {
        ywv0 ywv0Var = this.d;
        ywv0Var.getClass();
        etv0 etv0Var = new etv0();
        etv0Var.o = this.b;
        etv0Var.p = this.c;
        etv0Var.q = ywv0Var;
        etv0Var.r = this.e;
        etv0Var.A = -1;
        return etv0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        etv0 etv0Var = (etv0) lm40Var;
        etv0Var.getClass();
        ywv0 ywv0Var = this.d;
        ywv0Var.getClass();
        muv0 muv0Var = ywv0Var.e;
        xcz xczVar = etv0Var.o;
        xcz xczVar2 = this.b;
        xcz xczVar3 = this.c;
        boolean z = this.e;
        if (xczVar == xczVar2 && etv0Var.p == xczVar3 && etv0Var.q == ywv0Var && etv0Var.r == z) {
            return;
        }
        ywv0 ywv0Var2 = etv0Var.q;
        if (ywv0Var2 != ywv0Var) {
            muv0 muv0Var2 = ywv0Var2.e;
            int i = muv0Var2.d - 1;
            if (i < 0) {
                i = 0;
            }
            muv0Var2.d = i;
            muv0Var.d++;
        }
        etv0Var.o = xczVar2;
        etv0Var.p = xczVar3;
        etv0Var.q = ywv0Var;
        etv0Var.r = z;
        muv0Var.f = z;
        if (!z) {
            ((hgk0) muv0Var.i).setValue(zsv0.f44926a);
        }
        etv0Var.d1();
        etv0Var.s = qjj.W(etv0Var.N0(), null, null, new k6s0(etv0Var, null, (byte) 28), 3);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) ^ ((System.identityHashCode(this.b) ^ System.identityHashCode(this.c)) ^ System.identityHashCode(this.d));
    }
}
