package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xjz extends p4 {
    public Paint c;
    public Paint d;
    public vjz e;
    public ArrayList f;
    public Paint.FontMetrics g;
    public Path h;

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    public final void n1(Canvas canvas, float f, float f2, wjz wjzVar, vjz vjzVar) {
        Canvas canvas2;
        Path path = this.h;
        Paint paint = this.d;
        int i = wjzVar.e;
        float f3 = wjzVar.d;
        float f4 = wjzVar.c;
        if (i == 1122868 || i == 1122867 || i == 0) {
            return;
        }
        int iSave = canvas.save();
        int i2 = wjzVar.b;
        if (i2 == 3) {
            i2 = vjzVar.k;
        }
        paint.setColor(i);
        if (Float.isNaN(f4)) {
            f4 = vjzVar.l;
        }
        float fC = dut0.c(f4);
        float f5 = fC / 2.0f;
        int iE = hne.E(i2);
        if (iE == 2) {
            canvas2 = canvas;
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f + f5, f2, f5, paint);
        } else if (iE == 3) {
            paint.setStyle(Paint.Style.FILL);
            canvas2 = canvas;
            canvas2.drawRect(f, f2 - f5, f + fC, f2 + f5, paint);
        } else if (iE != 4) {
            if (iE == 5) {
                if (Float.isNaN(f3)) {
                    f3 = vjzVar.m;
                }
                float fC2 = dut0.c(f3);
                vjzVar.getClass();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(fC2);
                paint.setPathEffect(null);
                path.reset();
                path.moveTo(f, f2);
                path.lineTo(f + fC, f2);
                canvas.drawPath(path, paint);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f + f5, f2, f5, paint);
        }
        canvas2.restoreToCount(iSave);
    }

    public final void o1(Canvas canvas) {
        float f;
        float f2;
        float fZ;
        Canvas canvas2;
        ArrayList arrayList;
        int i;
        float f3;
        float f4;
        Canvas canvas3;
        float f5;
        float f6;
        String str;
        int i2;
        float fMeasureText;
        float f7;
        float f8;
        float fWidth;
        xjz xjzVar = this;
        Paint.FontMetrics fontMetrics = xjzVar.g;
        Paint paint = xjzVar.c;
        xju0 xju0Var = (xju0) xjzVar.b;
        vjz vjzVar = xjzVar.e;
        if (vjzVar.f4306a) {
            paint.setTextSize(vjzVar.d);
            paint.setColor(vjzVar.e);
            DisplayMetrics displayMetrics = dut0.f6713a;
            paint.getFontMetrics(fontMetrics);
            float f9 = fontMetrics.descent - fontMetrics.ascent;
            paint.getFontMetrics(fontMetrics);
            float fC = dut0.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
            float fA = f9 - (dut0.a(paint, "ABC") / 2.0f);
            wjz[] wjzVarArr = vjzVar.f;
            float fC2 = dut0.c(vjzVar.o);
            float fC3 = dut0.c(vjzVar.n);
            int i3 = vjzVar.i;
            int i4 = vjzVar.g;
            int i5 = vjzVar.h;
            int i6 = vjzVar.j;
            float fC4 = dut0.c(vjzVar.l);
            float fC5 = dut0.c(vjzVar.p);
            float f10 = vjzVar.c;
            float f11 = vjzVar.b;
            int iE = hne.E(i4);
            if (iE == 0) {
                f = fC5;
                if (i3 != 2) {
                    f11 += xju0Var.b.left;
                }
                f2 = i6 == 2 ? vjzVar.r + f11 : f11;
            } else if (iE == 1) {
                if (i3 == 2) {
                    fWidth = xju0Var.c / 2.0f;
                } else {
                    RectF rectF = xju0Var.b;
                    fWidth = (rectF.width() / 2.0f) + rectF.left;
                }
                f2 = fWidth + (i6 == 1 ? f11 : -f11);
                if (i3 == 2) {
                    f = fC5;
                    double d = f2;
                    float f12 = vjzVar.r;
                    f2 = (float) (d + (i6 == 1 ? (((double) (-f12)) / 2.0d) + ((double) f11) : (((double) f12) / 2.0d) - ((double) f11)));
                } else {
                    f = fC5;
                }
            } else if (iE != 2) {
                f = fC5;
                f2 = 0.0f;
            } else {
                f2 = (i3 == 2 ? xju0Var.c : xju0Var.b.right) - f11;
                if (i6 == 1) {
                    f2 -= vjzVar.r;
                }
                f = fC5;
            }
            int iE2 = hne.E(i3);
            if (iE2 != 0) {
                if (iE2 != 1) {
                    return;
                }
                int iE3 = hne.E(i5);
                if (iE3 == 0) {
                    f4 = (i4 == 2 ? 0.0f : xju0Var.b.top) + f10;
                } else if (iE3 == 1) {
                    f4 = ((xju0Var.d / 2.0f) - (vjzVar.s / 2.0f)) + vjzVar.c;
                } else if (iE3 != 2) {
                    f4 = 0.0f;
                } else {
                    f4 = (i4 == 2 ? xju0Var.d : xju0Var.b.bottom) - (vjzVar.s + f10);
                }
                float f13 = f4;
                boolean z = false;
                int i7 = 0;
                float f14 = 0.0f;
                while (i7 < wjzVarArr.length) {
                    wjz wjzVar = wjzVarArr[i7];
                    int i8 = wjzVar.b;
                    String str2 = wjzVar.f39285a;
                    float f15 = wjzVar.c;
                    boolean z2 = i8 != 1;
                    float fC6 = Float.isNaN(f15) ? fC4 : dut0.c(f15);
                    if (z2) {
                        float f16 = i6 == 1 ? f2 + f14 : f2 - (fC6 - f14);
                        f5 = f13;
                        f6 = f2;
                        i2 = i6;
                        str = str2;
                        fMeasureText = f16;
                        canvas3 = canvas;
                        xjzVar.n1(canvas3, fMeasureText, f13 + fA, wjzVar, xjzVar.e);
                        if (i2 == 1) {
                            fMeasureText += fC6;
                        }
                    } else {
                        canvas3 = canvas;
                        f5 = f13;
                        f6 = f2;
                        str = str2;
                        i2 = i6;
                        fMeasureText = f6;
                    }
                    if (str != null) {
                        if (z2 && !z) {
                            fMeasureText += i2 == 1 ? fC2 : -fC2;
                        } else if (z) {
                            fMeasureText = f6;
                        }
                        if (i2 == 2) {
                            fMeasureText -= (int) paint.measureText(str);
                        }
                        if (z) {
                            f8 = f9 + fC + f5;
                            canvas3.drawText(str, fMeasureText, f8 + f9, paint);
                        } else {
                            canvas3.drawText(str, fMeasureText, f5 + f9, paint);
                            f8 = f5;
                        }
                        f7 = f9 + fC + f8;
                        f14 = 0.0f;
                    } else {
                        f14 = fC6 + f + f14;
                        f7 = f5;
                        z = true;
                    }
                    i7++;
                    i6 = i2;
                    f2 = f6;
                    f13 = f7;
                }
                return;
            }
            float f17 = f2;
            ArrayList arrayList2 = vjzVar.v;
            ArrayList arrayList3 = vjzVar.t;
            ArrayList arrayList4 = vjzVar.u;
            int iE4 = hne.E(i5);
            if (iE4 == 0) {
                fZ = f10;
            } else if (iE4 != 1) {
                fZ = iE4 != 2 ? 0.0f : (xju0Var.d - f10) - vjzVar.s;
            } else {
                fZ = rw2.z(xju0Var.d, vjzVar.s, 2.0f, f10);
            }
            int length = wjzVarArr.length;
            float f18 = f17;
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                float f19 = f18;
                wjz wjzVar2 = wjzVarArr[i9];
                float f20 = fZ;
                int i11 = wjzVar2.b;
                float f21 = f;
                String str3 = wjzVar2.f39285a;
                int i12 = length;
                float f22 = wjzVar2.c;
                boolean z3 = i11 != 1;
                float fC7 = Float.isNaN(f22) ? fC4 : dut0.c(f22);
                if (i9 < arrayList4.size() && ((Boolean) arrayList4.get(i9)).booleanValue()) {
                    f20 = f9 + fC + f20;
                    f19 = f17;
                }
                if (f19 == f17 && i4 == 2 && i10 < arrayList2.size()) {
                    f19 = ((i6 == 2 ? ((ruo) arrayList2.get(i10)).b : -((ruo) arrayList2.get(i10)).b) / 2.0f) + f19;
                    i10++;
                }
                float f23 = f19;
                int i13 = i10;
                boolean z4 = str3 == null;
                if (z3) {
                    if (i6 == 2) {
                        f23 -= fC7;
                    }
                    float f24 = f23;
                    arrayList = arrayList2;
                    i = i9;
                    xjzVar.n1(canvas, f24, f20 + fA, wjzVar2, xjzVar.e);
                    canvas2 = canvas;
                    f23 = i6 == 1 ? f24 + fC7 : f24;
                } else {
                    canvas2 = canvas;
                    arrayList = arrayList2;
                    i = i9;
                }
                if (z4) {
                    f = f21;
                    if (i6 == 2) {
                        f21 = -f;
                    }
                    f3 = f23 + f21;
                } else {
                    if (z3) {
                        f23 += i6 == 2 ? -fC2 : fC2;
                    }
                    if (i6 == 2) {
                        f23 -= ((ruo) arrayList3.get(i)).b;
                    }
                    canvas2.drawText(str3, f23, f20 + f9, paint);
                    if (i6 == 1) {
                        f23 += ((ruo) arrayList3.get(i)).b;
                    }
                    f3 = f23 + (i6 == 2 ? -fC3 : fC3);
                    f = f21;
                }
                f18 = f3;
                xjzVar = this;
                i9 = i + 1;
                i10 = i13;
                fZ = f20;
                length = i12;
                arrayList2 = arrayList;
            }
        }
    }
}
