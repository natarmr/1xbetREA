package a;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class yzk0 extends zzk0 {
    public zz2 f;
    public float[] g;

    @Override // a.zzk0
    public final void b(float f, int i) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // a.zzk0
    public final void c(ywu ywuVar, float f) {
        this.f45259a.Q(f, this.g);
        zz2 zz2Var = this.f;
        ((iyf[]) zz2Var.c)[((int[]) zz2Var.b)[0]].e(ywuVar, this.g);
    }

    @Override // a.zzk0
    public final void d(int i) {
        zz2 zz2Var = this.f;
        int i2 = zz2Var.f45232a;
        iyf[] iyfVarArr = (iyf[]) zz2Var.c;
        int[] iArr = (int[]) zz2Var.b;
        int iD = iyfVarArr[iArr[0]].d();
        double[] dArr = new double[i2];
        this.g = new float[iD];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i2, iD);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            iyf iyfVar = iyfVarArr[i4];
            dArr[i3] = ((double) i4) * 0.01d;
            iyfVar.c(this.g);
            int i5 = 0;
            while (true) {
                float[] fArr = this.g;
                if (i5 < fArr.length) {
                    dArr2[i3][i5] = fArr[i5];
                    i5++;
                }
            }
        }
        this.f45259a = kpb.y(i, dArr, dArr2);
    }
}
