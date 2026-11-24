package a;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class alu0 extends dlu0 {
    public SparseArray f;
    public float[] g;

    @Override // a.zzk0
    public final void b(float f, int i) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // a.zzk0
    public final void d(int i) {
        SparseArray sparseArray = this.f;
        int size = sparseArray.size();
        int iC = ((x2e) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.g = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            x2e x2eVar = (x2e) sparseArray.valueAt(i2);
            dArr[i2] = ((double) iKeyAt) * 0.01d;
            x2eVar.b(this.g);
            int i3 = 0;
            while (true) {
                float[] fArr = this.g;
                if (i3 < fArr.length) {
                    dArr2[i2][i3] = fArr[i3];
                    i3++;
                }
            }
        }
        this.f45259a = kpb.y(i, dArr, dArr2);
    }

    @Override // a.dlu0
    public final void e(View view, float f) {
        this.f45259a.Q(f, this.g);
        dyb.k0((x2e) this.f.valueAt(0), view, this.g);
    }
}
