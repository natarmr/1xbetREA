package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class rm80 extends lm40 implements v6z, ehl {
    public pm80 o;
    public boolean p;
    public u12 q;
    public qge r;
    public float s;
    public a4d t;

    public static boolean a1(long j) {
        return !h7k0.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean b1(long j) {
        return !h7k0.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        if (!Z0()) {
            return pj30Var.P(i);
        }
        long jC1 = c1(r4e.b(0, 0, 0, i, 7));
        return Math.max(p4e.k(jC1), pj30Var.P(i));
    }

    public final boolean Z0() {
        return this.p && this.o.i() != 9205357640488583168L;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pu90 pu90VarS = pj30Var.S(c1(j));
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 16));
    }

    public final long c1(long j) {
        boolean z = false;
        boolean z2 = p4e.e(j) && p4e.d(j);
        if (p4e.g(j) && p4e.f(j)) {
            z = true;
        }
        if ((!Z0() && z2) || z) {
            return p4e.b(j, p4e.i(j), 0, p4e.h(j), 0, 10);
        }
        long jI = this.o.i();
        int iRound = b1(jI) ? Math.round(Float.intBitsToFloat((int) (jI >> 32))) : p4e.k(j);
        int iRound2 = a1(jI) ? Math.round(Float.intBitsToFloat((int) (jI & 4294967295L))) : p4e.j(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(r4e.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(r4e.g(iRound, j))) << 32);
        if (Z0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!b1(this.o.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.o.i() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!a1(this.o.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.o.i() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : q8x.I(jFloatToRawIntBits2, this.r.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return p4e.b(j, r4e.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, r4e.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        if (!Z0()) {
            return pj30Var.L(i);
        }
        long jC1 = c1(r4e.b(0, 0, 0, i, 7));
        return Math.max(p4e.k(jC1), pj30Var.L(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.o + ", sizeToIntrinsics=" + this.p + ", alignment=" + this.q + ", alpha=" + this.s + ", colorFilter=" + this.t + Separators.RPAREN;
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        a6a a6aVar = g7zVar.f10839a;
        long jI = this.o.i();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(b1(jI) ? Float.intBitsToFloat((int) (jI >> 32)) : Float.intBitsToFloat((int) (a6aVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(a1(jI) ? Float.intBitsToFloat((int) (jI & 4294967295L)) : Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)))) & 4294967295L);
        long jI2 = (Float.intBitsToFloat((int) (a6aVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)) == 0.0f) ? 0L : q8x.I(jFloatToRawIntBits, this.r.a(jFloatToRawIntBits, a6aVar.d()));
        long jA = this.q.a((((long) Math.round(Float.intBitsToFloat((int) (jI2 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jI2 & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (a6aVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)))) & 4294967295L), g7zVar.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((fvt0) a6aVar.b.b).A(f, f2);
        try {
            this.o.e(g7zVar, jI2, this.s, this.t);
            ((fvt0) a6aVar.b.b).A(-f, -f2);
            g7zVar.a();
        } catch (Throwable th) {
            ((fvt0) a6aVar.b.b).A(-f, -f2);
            throw th;
        }
    }

    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        if (!Z0()) {
            return pj30Var.b(i);
        }
        long jC1 = c1(r4e.b(0, i, 0, 0, 13));
        return Math.max(p4e.j(jC1), pj30Var.b(i));
    }

    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        if (!Z0()) {
            return pj30Var.D(i);
        }
        long jC1 = c1(r4e.b(0, i, 0, 0, 13));
        return Math.max(p4e.j(jC1), pj30Var.D(i));
    }
}
