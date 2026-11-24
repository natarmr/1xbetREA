package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b2w0 extends xa5 {
    public final a2w0 h;
    public final Path i;
    public final RectF j;
    public float[] k;
    public final Path l;
    public final float[] m;

    public b2w0(xju0 xju0Var, a2w0 a2w0Var, ywq0 ywq0Var) {
        super(xju0Var, ywq0Var, a2w0Var);
        this.i = new Path();
        this.j = new RectF();
        this.k = new float[2];
        new Path();
        new RectF();
        this.l = new Path();
        this.m = new float[2];
        new RectF();
        this.h = a2w0Var;
        if (xju0Var != null) {
            this.f.setColor(-16777216);
            this.f.setTextSize(dut0.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public final float[] p1() {
        float[] fArr = this.k;
        int length = fArr.length;
        a2w0 a2w0Var = this.h;
        int i = a2w0Var.j * 2;
        if (length != i) {
            fArr = new float[i];
            this.k = fArr;
        }
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = a2w0Var.i[i2 / 2];
        }
        this.d.x(fArr);
        return fArr;
    }

    public final void q1(Canvas canvas) {
        float f;
        xju0 xju0Var = (xju0) this.b;
        a2w0 a2w0Var = this.h;
        if (a2w0Var.f4306a && a2w0Var.n) {
            float[] fArrP1 = p1();
            Paint paint = this.f;
            paint.setTypeface(null);
            paint.setTextSize(a2w0Var.d);
            paint.setColor(a2w0Var.e);
            float f2 = a2w0Var.b;
            float fA = (dut0.a(paint, "A") / 2.5f) + a2w0Var.c;
            if (a2w0Var.v == 1) {
                paint.setTextAlign(Paint.Align.RIGHT);
                f = xju0Var.b.left - f2;
            } else {
                paint.setTextAlign(Paint.Align.LEFT);
                f = xju0Var.b.right + f2;
            }
            int i = a2w0Var.j;
            int i2 = 0;
            while (i2 < i) {
                canvas.drawText((i2 < 0 || i2 >= a2w0Var.i.length) ? "" : a2w0Var.c().a(a2w0Var.i[i2]), f, fArrP1[(i2 * 2) + 1] + fA, paint);
                i2++;
            }
        }
    }

    public final void r1(Canvas canvas) {
        a2w0 a2w0Var = this.h;
        if (a2w0Var.f4306a) {
            Paint paint = this.g;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            int i = a2w0Var.v;
            xju0 xju0Var = (xju0) this.b;
            if (i == 1) {
                RectF rectF = xju0Var.b;
                float f = rectF.left;
                canvas.drawLine(f, rectF.top, f, rectF.bottom, paint);
            } else {
                RectF rectF2 = xju0Var.b;
                float f2 = rectF2.right;
                canvas.drawLine(f2, rectF2.top, f2, rectF2.bottom, paint);
            }
        }
    }

    public final void s1(Canvas canvas) {
        xju0 xju0Var = (xju0) this.b;
        a2w0 a2w0Var = this.h;
        if (a2w0Var.f4306a) {
            int iSave = canvas.save();
            RectF rectF = xju0Var.b;
            RectF rectF2 = xju0Var.b;
            RectF rectF3 = this.j;
            rectF3.set(rectF);
            rectF3.inset(0.0f, -this.c.h);
            canvas.clipRect(rectF3);
            float[] fArrP1 = p1();
            int i = a2w0Var.g;
            Paint paint = this.e;
            paint.setColor(i);
            paint.setStrokeWidth(a2w0Var.h);
            paint.setPathEffect(a2w0Var.o);
            Path path = this.i;
            path.reset();
            for (int i2 = 0; i2 < fArrP1.length; i2 += 2) {
                int i3 = i2 + 1;
                path.moveTo(rectF2.left, fArrP1[i3]);
                path.lineTo(rectF2.right, fArrP1[i3]);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final void t1() {
        ArrayList arrayList = this.h.p;
        if (arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.m;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.l.reset();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        hny.b();
    }
}
