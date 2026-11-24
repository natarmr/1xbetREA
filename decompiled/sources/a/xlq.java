package a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class xlq implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f41086a = new float[9];
    public final float[] b = new float[9];
    public final Matrix c = new Matrix();
    public final /* synthetic */ zlq d;

    public xlq(zlq zlqVar) {
        this.d = zlqVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        this.d.p = f;
        float[] fArr = this.f41086a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = rw2.a(f2, f3, f, f3);
        }
        Matrix matrix = this.c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
