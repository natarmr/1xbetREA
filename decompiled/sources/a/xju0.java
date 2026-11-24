package a;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class xju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f41005a = new Matrix();
    public final RectF b = new RectF();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public float f = Float.MAX_VALUE;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = 0.0f;
    public final Matrix l = new Matrix();
    public final float[] m = new float[9];

    public final void a(View view, float[] fArr) {
        Matrix matrix = this.l;
        matrix.reset();
        matrix.set(this.f41005a);
        float f = fArr[0];
        RectF rectF = this.b;
        matrix.postTranslate(-(f - rectF.left), -(fArr[1] - rectF.top));
        e(matrix, view, true);
    }

    public final boolean b(float f) {
        return this.b.left <= f + 1.0f;
    }

    public final boolean c(float f) {
        return this.b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public final void d(Matrix matrix, RectF rectF) {
        float[] fArr = this.m;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[0];
        float f3 = fArr[5];
        float f4 = fArr[4];
        this.g = Math.min(Math.max(this.e, f2), this.f);
        this.h = Math.min(Math.max(1.0f, f4), Float.MAX_VALUE);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        this.i = Math.min(Math.max(f, ((this.g - 1.0f) * (-fWidth)) - this.j), this.j);
        float fMax = Math.max(Math.min(f3, ((this.h - 1.0f) * fHeight) + this.k), -this.k);
        fArr[2] = this.i;
        fArr[0] = this.g;
        fArr[5] = fMax;
        fArr[4] = this.h;
        matrix.setValues(fArr);
    }

    public final void e(Matrix matrix, View view, boolean z) {
        Matrix matrix2 = this.f41005a;
        matrix2.set(matrix);
        d(matrix2, this.b);
        if (z) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }
}
