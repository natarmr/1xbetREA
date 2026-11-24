package a;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e290 extends emy {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public d290 m;

    public e290(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // a.sz5
    public final Object f(cmy cmyVar, float f) {
        float f2;
        d290 d290Var = (d290) cmyVar;
        Path path = d290Var.q;
        zn00 zn00Var = this.e;
        if (zn00Var == null || cmyVar.h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) zn00Var.L0(d290Var.g, d290Var.h.floatValue(), (PointF) d290Var.b, (PointF) d290Var.c, d(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) cmyVar.b;
        }
        d290 d290Var2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (d290Var2 != d290Var) {
            pathMeasure.setPath(path, false);
            this.m = d290Var;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f4, f5);
        if (f3 < 0.0f) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}
