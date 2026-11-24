package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class vrv0 extends xa5 {
    public urv0 h;
    public Path i;
    public float[] j;
    public RectF k;
    public float[] l;

    @Override // a.xa5
    public final void n1(float f, float f2) {
        xju0 xju0Var = (xju0) this.b;
        RectF rectF = xju0Var.b;
        RectF rectF2 = xju0Var.b;
        if (rectF.width() > 10.0f) {
            float f3 = xju0Var.g;
            float f4 = xju0Var.e;
            if (f3 > f4 || f4 > 1.0f) {
                float f5 = rectF2.left;
                float f6 = rectF2.top;
                ywq0 ywq0Var = this.d;
                ywq0Var.getClass();
                z960 z960Var = bp10.d;
                bp10 bp10Var = (bp10) z960Var.b();
                bp10Var.b = 0.0d;
                bp10Var.c = 0.0d;
                ywq0Var.n(f5, f6, bp10Var);
                float f7 = rectF2.right;
                float f8 = rectF2.top;
                bp10 bp10Var2 = (bp10) z960Var.b();
                bp10Var2.b = 0.0d;
                bp10Var2.c = 0.0d;
                ywq0Var.n(f7, f8, bp10Var2);
                f = (float) bp10Var.b;
                f2 = (float) bp10Var2.b;
                z960Var.c(bp10Var);
                z960Var.c(bp10Var2);
            }
        }
        o1(f, f2);
    }

    @Override // a.xa5
    public final void o1(float f, float f2) {
        super.o1(f, f2);
        urv0 urv0Var = this.h;
        String strB = urv0Var.b();
        Paint paint = this.f;
        paint.setTypeface(null);
        paint.setTextSize(urv0Var.d);
        ruo ruoVarB = dut0.b(paint, strB);
        float f3 = ruoVarB.b;
        float fA = dut0.a(paint, "Q");
        float fAbs = Math.abs(((float) Math.sin(0.0d)) * fA) + Math.abs(((float) Math.cos(0.0d)) * f3);
        float fAbs2 = Math.abs(((float) Math.cos(0.0d)) * fA) + Math.abs(((float) Math.sin(0.0d)) * f3);
        z960 z960Var = ruo.d;
        ruo ruoVar = (ruo) z960Var.b();
        ruoVar.b = fAbs;
        ruoVar.c = fAbs2;
        Math.round(f3);
        Math.round(fA);
        Math.round(ruoVar.b);
        urv0Var.v = Math.round(ruoVar.c);
        z960Var.c(ruoVar);
        z960Var.c(ruoVarB);
    }

    public final void p1(Canvas canvas, float f, cp10 cp10Var) {
        xju0 xju0Var = (xju0) this.b;
        urv0 urv0Var = this.h;
        urv0Var.getClass();
        int i = urv0Var.j * 2;
        float[] fArr = new float[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            fArr[i3] = urv0Var.i[i3 / 2];
        }
        this.d.x(fArr);
        int i4 = 0;
        while (i4 < i) {
            float fMeasureText = fArr[i4];
            if (xju0Var.b(fMeasureText) && xju0Var.c(fMeasureText)) {
                int i5 = i4 / 2;
                String strA = urv0Var.c().a(urv0Var.i[i5]);
                boolean z = urv0Var.w;
                Paint paint = this.f;
                if (z) {
                    int i6 = urv0Var.j;
                    if (i5 == i6 - 1 && i6 > 1) {
                        DisplayMetrics displayMetrics = dut0.f6713a;
                        float fMeasureText2 = (int) paint.measureText(strA);
                        float f2 = xju0Var.c;
                        if (fMeasureText2 > (f2 - xju0Var.b.right) * 2.0f && fMeasureText + fMeasureText2 > f2) {
                            fMeasureText -= fMeasureText2 / 2.0f;
                        }
                    } else if (i4 == 0) {
                        DisplayMetrics displayMetrics2 = dut0.f6713a;
                        fMeasureText += ((int) paint.measureText(strA)) / 2.0f;
                    }
                }
                Paint.FontMetrics fontMetrics = dut0.i;
                float fontMetrics2 = paint.getFontMetrics(fontMetrics);
                int length = strA.length();
                Rect rect = dut0.h;
                paint.getTextBounds(strA, i2, length, rect);
                float fWidth = 0.0f - rect.left;
                float f3 = (-fontMetrics.ascent) + 0.0f;
                Paint.Align textAlign = paint.getTextAlign();
                paint.setTextAlign(Paint.Align.LEFT);
                if (cp10Var.b != 0.0f || cp10Var.c != 0.0f) {
                    fWidth -= rect.width() * cp10Var.b;
                    f3 -= fontMetrics2 * cp10Var.c;
                }
                canvas.drawText(strA, fWidth + fMeasureText, f3 + f, paint);
                paint.setTextAlign(textAlign);
            }
            i4 += 2;
            i2 = 0;
        }
    }
}
