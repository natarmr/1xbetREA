package a;

/* JADX INFO: loaded from: classes.dex */
public final class l2e extends m2e {
    public final ubg0 e;
    public final ubg0 f;
    public final float[] g;

    public l2e(ubg0 ubg0Var, ubg0 ubg0Var2) {
        float[] fArrS;
        super(ubg0Var2, ubg0Var, ubg0Var2, null);
        this.e = ubg0Var;
        this.f = ubg0Var2;
        float[] fArr = (float[]) peg0.e.b;
        nav0 nav0Var = ubg0Var.d;
        float[] fArr2 = ubg0Var.i;
        nav0 nav0Var2 = ubg0Var2.d;
        float[] fArr3 = ubg0Var2.j;
        if (qbc.K(nav0Var, nav0Var2)) {
            fArrS = qbc.S(fArr3, fArr2);
        } else {
            float[] fArrA = nav0Var.a();
            float[] fArrA2 = nav0Var2.a();
            nav0 nav0Var3 = j47.q;
            fArrS = qbc.S(qbc.K(nav0Var2, nav0Var3) ? fArr3 : qbc.R(qbc.S(qbc.J(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), ubg0Var2.i)), qbc.K(nav0Var, nav0Var3) ? fArr2 : qbc.S(qbc.J(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrS;
    }

    @Override // a.m2e
    public final long a(long j) {
        float fH = y3d.h(j);
        float fG = y3d.g(j);
        float fE = y3d.e(j);
        float fD = y3d.d(j);
        qbg0 qbg0Var = this.e.p;
        float fE2 = (float) qbg0Var.e(fH);
        float fE3 = (float) qbg0Var.e(fG);
        float fE4 = (float) qbg0Var.e(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fE4) + (fArr[3] * fE3) + (fArr[0] * fE2);
        float f2 = (fArr[7] * fE4) + (fArr[4] * fE3) + (fArr[1] * fE2);
        float f3 = (fArr[8] * fE4) + (fArr[5] * fE3) + (fArr[2] * fE2);
        ubg0 ubg0Var = this.f;
        qbg0 qbg0Var2 = ubg0Var.m;
        return fbc.c((float) qbg0Var2.e(f), (float) qbg0Var2.e(f2), (float) qbg0Var2.e(f3), fD, ubg0Var);
    }
}
