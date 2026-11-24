package a;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class jwj implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xk80 f17253a;
    public final k6z b;

    public jwj(xk80 xk80Var, k6z k6zVar) {
        ma80 ma80Var = ma80.f21447a;
        this.f17253a = xk80Var;
        this.b = k6zVar;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        ma80 ma80Var = ma80.f21447a;
        if (i != 1) {
            return 0L;
        }
        xk80 xk80Var = this.f17253a;
        if (Math.abs(xk80Var.l()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        pk80 pk80VarM = xk80Var.m();
        float fL = xk80Var.l() * xk80Var.o();
        float f = ((pk80VarM.b + pk80VarM.c) * (-Math.signum(xk80Var.l()))) + fL;
        if (xk80Var.l() > 0.0f) {
            fL = f;
            f = fL;
        }
        float fC = l1e0.c(Float.intBitsToFloat(i2), fL, f);
        boolean z = this.b == k6z.b;
        ywj ywjVar = xk80Var.k;
        float fE = z ? ywjVar.e(fC) : -ywjVar.e(-fC);
        ma80 ma80Var2 = ma80.f21447a;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fE)) << 32);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        ma80 ma80Var = ma80.f21447a;
        if (Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        ma80 ma80Var = ma80.f21447a;
        ma80 ma80Var2 = ma80.f21447a;
        return new g6u0(g6u0.a(j2, 0.0f, 0.0f, 1));
    }
}
