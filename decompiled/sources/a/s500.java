package a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetChartView;

/* JADX INFO: loaded from: classes.dex */
public final class s500 extends cbj {
    public hu5 g;
    public Path h;
    public FinBetChartView i;
    public Paint j;
    public WeakReference k;
    public Canvas l;
    public Bitmap.Config m;
    public Path n;
    public Path o;
    public float[] p;
    public Path q;
    public HashMap r;
    public float[] s;

    @Override // a.cbj
    public final void n1(Canvas canvas) {
        xju0 xju0Var;
        lwb lwbVar;
        hu5 hu5Var;
        xju0 xju0Var2;
        float f;
        lwb lwbVar2 = this.c;
        Paint paint = this.f;
        hu5 hu5Var2 = this.g;
        FinBetChartView finBetChartView = this.i;
        float fD = finBetChartView.getData().d();
        float maxVisibleCount = finBetChartView.getMaxVisibleCount();
        xju0 xju0Var3 = (xju0) this.b;
        if (fD < maxVisibleCount * xju0Var3.g) {
            ArrayList arrayList = finBetChartView.getLineData().i;
            int i = 0;
            while (i < arrayList.size()) {
                v500 v500Var = (v500) arrayList.get(i);
                if (!v500Var.n || (!(v500Var.j || v500Var.k) || v500Var.o.size() < 1)) {
                    xju0Var = xju0Var3;
                    lwbVar = lwbVar2;
                    hu5Var = hu5Var2;
                } else {
                    paint.setTypeface(null);
                    paint.setTextSize(v500Var.m);
                    ywq0 ywq0VarF = finBetChartView.f(v500Var.d);
                    int i2 = (int) (v500Var.E * 1.75f);
                    if (!v500Var.I) {
                        i2 /= 2;
                    }
                    hu5Var2.X(finBetChartView, v500Var);
                    lwbVar2.getClass();
                    int i3 = hu5Var2.b;
                    float f2 = 1.0f;
                    int i4 = (((int) ((hu5Var2.c - i3) * 1.0f)) + 1) * 2;
                    float[] fArr = (float[]) ywq0VarF.d;
                    if (fArr.length != i4) {
                        fArr = new float[i4];
                        ywq0VarF.d = fArr;
                    }
                    int i5 = 0;
                    while (i5 < i4) {
                        Entry entryB = v500Var.b((i5 / 2) + i3);
                        if (entryB != null) {
                            f = f2;
                            fArr[i5] = entryB.c;
                            fArr[i5 + 1] = entryB.f45454a * f;
                        } else {
                            f = f2;
                            fArr[i5] = 0.0f;
                            fArr[i5 + 1] = 0.0f;
                        }
                        i5 += 2;
                        f2 = f;
                    }
                    Matrix matrix = (Matrix) ywq0VarF.g;
                    matrix.set((Matrix) ywq0VarF.f43384a);
                    matrix.postConcat(((xju0) ywq0VarF.c).f41005a);
                    matrix.postConcat((Matrix) ywq0VarF.b);
                    matrix.mapPoints(fArr);
                    e3u0 e3u0Var = v500Var.f;
                    if (e3u0Var == null) {
                        e3u0Var = dut0.g;
                    }
                    cp10 cp10Var = v500Var.l;
                    cp10 cp10Var2 = (cp10) cp10.d.b();
                    float f3 = cp10Var.b;
                    cp10Var2.b = f3;
                    cp10Var2.c = cp10Var.c;
                    cp10Var2.b = dut0.c(f3);
                    cp10Var2.c = dut0.c(cp10Var2.c);
                    int i6 = 0;
                    while (i6 < fArr.length) {
                        float f4 = fArr[i6];
                        float f5 = fArr[i6 + 1];
                        if (!xju0Var3.c(f4)) {
                            break;
                        }
                        if (xju0Var3.b(f4)) {
                            RectF rectF = xju0Var3.b;
                            xju0Var2 = xju0Var3;
                            if (rectF.top <= f5) {
                                if (rectF.bottom >= ((int) (f5 * 100.0f)) / 100.0f) {
                                    int i7 = i6 / 2;
                                    Entry entryB2 = v500Var.b(hu5Var2.b + i7);
                                    if (v500Var.j) {
                                        e3u0Var.getClass();
                                        ArrayList arrayList2 = v500Var.b;
                                        paint.setColor(((Integer) arrayList2.get(i7 % arrayList2.size())).intValue());
                                        canvas.drawText(e3u0Var.a(entryB2.f45454a), f4, f5 - i2, paint);
                                    }
                                    entryB2.getClass();
                                }
                            }
                            i6 += 2;
                            xju0Var3 = xju0Var2;
                            lwbVar2 = lwbVar2;
                            hu5Var2 = hu5Var2;
                        } else {
                            xju0Var2 = xju0Var3;
                        }
                        lwbVar2 = lwbVar2;
                        hu5Var2 = hu5Var2;
                        i6 += 2;
                        xju0Var3 = xju0Var2;
                        lwbVar2 = lwbVar2;
                        hu5Var2 = hu5Var2;
                    }
                    xju0Var = xju0Var3;
                    lwbVar = lwbVar2;
                    hu5Var = hu5Var2;
                    cp10.d.c(cp10Var2);
                }
                i++;
                xju0Var3 = xju0Var;
                lwbVar2 = lwbVar;
                hu5Var2 = hu5Var;
            }
        }
    }

    public final void o1(Canvas canvas, v500 v500Var, Path path, ywq0 ywq0Var, hu5 hu5Var) {
        usd usdVar = v500Var.H;
        FinBetChartView finBetChartView = this.i;
        usdVar.getClass();
        float fC = usd.c(v500Var, finBetChartView);
        path.lineTo(v500Var.b(hu5Var.b + hu5Var.d).c, fC);
        path.lineTo(v500Var.b(hu5Var.b).c, fC);
        path.close();
        ywq0Var.u(path);
        int i = (v500Var.x & 16777215) | (v500Var.y << 24);
        DisplayMetrics displayMetrics = dut0.f6713a;
        int iSave = canvas.save();
        canvas.clipPath(path);
        canvas.drawColor(i);
        canvas.restoreToCount(iSave);
    }
}
