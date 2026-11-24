package a;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes6.dex */
public final class ag80 extends f3k implements vj50, v6z {
    public BottomSheetBehavior q;
    public final agk0 r;
    public final ek50 s;

    public ag80(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        this.q = bottomSheetBehavior;
        this.r = androidx.compose.runtime.e.a(0.0f);
        this.s = new ek50(this, null);
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (i != 1 || this.q.G() <= 0 || fIntBitsToFloat <= 0.0f) {
            return 0L;
        }
        agk0 agk0Var = this.r;
        if (agk0Var.l() <= 0.0f) {
            return 0L;
        }
        float fL = agk0Var.l();
        if (fL <= fIntBitsToFloat) {
            fIntBitsToFloat = fL;
        }
        agk0Var.m(agk0Var.l() - fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
    }

    @Override // a.lm40
    public final void R0() {
        Z0(this.s);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (i != 1 || this.q.G() <= 0 || fIntBitsToFloat >= 0.0f || this.q.P != 3) {
            return 0L;
        }
        agk0 agk0Var = this.r;
        agk0Var.m(agk0Var.l() - (0.2f * fIntBitsToFloat));
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat)));
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pj30Var.getClass();
        int iB = si30.b(this.r.l());
        pu90 pu90VarS = pj30Var.S(r4e.i(0, -iB, j));
        return vj30.x(vj30Var, r4e.g(pu90VarS.f27604a, j), r4e.f(pu90VarS.b + iB, j), new cam(pu90VarS, (byte) 15));
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        if (this.r.l() == 0.0f) {
            return new g6u0(0L);
        }
        qjj.W(N0(), null, null, new c670(this, null, (byte) 7), 3);
        return new g6u0(j2);
    }
}
