package a;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class kil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18344a;
    public float b;
    public float c;
    public int d;
    public float[] e = null;

    public kil(kil kilVar) {
        this.f18344a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0;
        this.f18344a = kilVar.f18344a;
        this.b = kilVar.b;
        this.c = kilVar.c;
        this.d = kilVar.d;
    }

    public final void a(int i, sty styVar) {
        int iAlpha = Color.alpha(this.d);
        int iC = ah40.c(i);
        Matrix matrix = cut0.f5002a;
        int i2 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            styVar.clearShadowLayer();
        } else {
            styVar.setShadowLayer(Math.max(this.f18344a, Float.MIN_VALUE), this.b, this.c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        }
    }

    public final void b(int i) {
        this.d = Color.argb(Math.round((ah40.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void c(Matrix matrix) {
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = new float[2];
            this.e = fArr;
        }
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.f18344a = matrix.mapRadius(this.f18344a);
    }
}
