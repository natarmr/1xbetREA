package a;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class lsb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f20570a = new Matrix();
    public final View b;
    public final float[] c;
    public float d;
    public float e;

    public lsb(View view, float[] fArr) {
        this.b = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.c = fArr2;
        this.d = fArr2[2];
        this.e = fArr2[5];
        a();
    }

    public final void a() {
        float f = this.d;
        float[] fArr = this.c;
        fArr[2] = f;
        fArr[5] = this.e;
        Matrix matrix = this.f20570a;
        matrix.setValues(fArr);
        bmu0.f2855a.H(this.b, matrix);
    }
}
