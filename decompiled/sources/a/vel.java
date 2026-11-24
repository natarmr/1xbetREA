package a;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vel extends hel {
    public wel k1;
    public boolean l1;
    public xdr m1;
    public xdr n1;
    public boolean o1;

    @Override // a.hel
    public final Object d1(ic1 ic1Var, xb2 xb2Var) {
        ma80 ma80Var = this.q;
        if (ma80Var == null) {
            return Unit.f46060a;
        }
        wel welVar = this.k1;
        c050 c050Var = c050.f3507a;
        Object objA = welVar.a(new ic1(ic1Var, this, ma80Var, (yje) null, (byte) 25), xb2Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    @Override // a.hel
    public final void i1(long j) {
        if (!this.n || Intrinsics.d(this.m1, uel.f35535a)) {
            return;
        }
        qjj.W(N0(), null, yne.d, new ir((Object) this, j, (yje) null, (byte) 8), 1);
    }

    @Override // a.hel
    public final void j1(qdl qdlVar) {
        ma80 ma80Var;
        if (!this.n || Intrinsics.d(this.n1, uel.b) || (ma80Var = this.q) == null) {
            return;
        }
        qjj.W(N0(), null, yne.d, new ic1(this, qdlVar, ma80Var, (yje) null, (byte) 26), 1);
    }

    @Override // a.hel
    public final boolean r1() {
        return this.l1;
    }
}
