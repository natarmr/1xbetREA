package a;

import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public abstract class xa5 extends p4 {
    public final wa5 c;
    public final ywq0 d;
    public final Paint e;
    public final Paint f;
    public final Paint g;

    public xa5(xju0 xju0Var, ywq0 ywq0Var, wa5 wa5Var) {
        super((Object) xju0Var, (byte) 9);
        this.d = ywq0Var;
        this.c = wa5Var;
        if (xju0Var != null) {
            this.f = new Paint(1);
            Paint paint = new Paint();
            this.e = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.g = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            new Paint(1).setStyle(style);
        }
    }

    public void n1(float f, float f2) {
        xju0 xju0Var = (xju0) this.b;
        if (xju0Var != null) {
            RectF rectF = xju0Var.b;
            if (rectF.width() > 10.0f && xju0Var.h > 1.0f) {
                float f3 = rectF.left;
                float f4 = rectF.top;
                ywq0 ywq0Var = this.d;
                ywq0Var.getClass();
                z960 z960Var = bp10.d;
                bp10 bp10Var = (bp10) z960Var.b();
                bp10Var.b = 0.0d;
                bp10Var.c = 0.0d;
                ywq0Var.n(f3, f4, bp10Var);
                float f5 = rectF.left;
                float f6 = rectF.bottom;
                bp10 bp10Var2 = (bp10) z960Var.b();
                bp10Var2.b = 0.0d;
                bp10Var2.c = 0.0d;
                ywq0Var.n(f5, f6, bp10Var2);
                f = (float) bp10Var2.c;
                f2 = (float) bp10Var.c;
                z960Var.c(bp10Var);
                z960Var.c(bp10Var2);
            }
        }
        o1(f, f2);
    }

    public void o1(float f, float f2) {
        double dFloor;
        int i;
        float f3 = f;
        wa5 wa5Var = this.c;
        int i2 = wa5Var.l;
        double dAbs = Math.abs(f2 - f3);
        if (i2 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            wa5Var.i = new float[0];
            wa5Var.j = 0;
            return;
        }
        double d = dut0.d(dAbs / ((double) i2));
        double d2 = dut0.d(Math.pow(10.0d, (int) Math.log10(d)));
        if (((int) (d / d2)) > 5) {
            d = Math.floor(d2 * 10.0d);
        }
        if (wa5Var.m) {
            d = ((float) dAbs) / (i2 - 1);
            wa5Var.j = i2;
            if (wa5Var.i.length < i2) {
                wa5Var.i = new float[i2];
            }
            for (int i3 = 0; i3 < i2; i3++) {
                wa5Var.i[i3] = f3;
                f3 = (float) (((double) f3) + d);
            }
        } else {
            double dCeil = d == 0.0d ? 0.0d : Math.ceil(((double) f3) / d) * d;
            if (d == 0.0d) {
                dFloor = 0.0d;
            } else {
                dFloor = Math.floor(((double) f2) / d) * d;
                if (dFloor != Double.POSITIVE_INFINITY) {
                    double d3 = dFloor + 0.0d;
                    dFloor = Double.longBitsToDouble(Double.doubleToRawLongBits(d3) + (d3 >= 0.0d ? 1L : -1L));
                }
            }
            if (d != 0.0d) {
                i = 0;
                for (double d4 = dCeil; d4 <= dFloor; d4 += d) {
                    i++;
                }
            } else {
                i = 0;
            }
            wa5Var.j = i;
            if (wa5Var.i.length < i) {
                wa5Var.i = new float[i];
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                wa5Var.i[i4] = (float) dCeil;
                dCeil += d;
            }
        }
        if (d < 1.0d) {
            wa5Var.k = (int) Math.ceil(-Math.log10(d));
        } else {
            wa5Var.k = 0;
        }
    }
}
