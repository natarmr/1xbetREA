package a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetChartView;

/* JADX INFO: loaded from: classes.dex */
public abstract class eu5 extends kwb implements pwb {
    public ywq0 A1;
    public vrv0 B1;
    public long C1;
    public long D1;
    public RectF E1;
    public Matrix F1;
    public boolean G1;
    public bp10 H1;
    public bp10 I1;
    public float[] J1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public Paint o1;
    public Paint p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public float t1;
    public boolean u1;
    public a2w0 v1;
    public a2w0 w1;
    public b2w0 x1;
    public b2w0 y1;
    public ywq0 z1;

    @Override // a.kwb
    public final void a() {
        RectF rectF = this.E1;
        xju0 xju0Var = this.r;
        if (!this.G1) {
            rectF.left = 0.0f;
            rectF.right = 0.0f;
            rectF.top = 0.0f;
            rectF.bottom = 0.0f;
            vjz vjzVar = this.l;
            if (vjzVar != null && vjzVar.f4306a) {
                int iE = hne.E(vjzVar.i);
                if (iE == 0) {
                    int iE2 = hne.E(this.l.h);
                    if (iE2 == 0) {
                        float f = rectF.top;
                        vjz vjzVar2 = this.l;
                        rectF.top = Math.min(vjzVar2.s, xju0Var.d * vjzVar2.q) + this.l.c + f;
                    } else if (iE2 == 2) {
                        float f2 = rectF.bottom;
                        vjz vjzVar3 = this.l;
                        rectF.bottom = Math.min(vjzVar3.s, xju0Var.d * vjzVar3.q) + this.l.c + f2;
                    }
                } else if (iE == 1) {
                    int iE3 = hne.E(this.l.g);
                    if (iE3 == 0) {
                        float f3 = rectF.left;
                        vjz vjzVar4 = this.l;
                        rectF.left = Math.min(vjzVar4.r, xju0Var.c * vjzVar4.q) + this.l.b + f3;
                    } else if (iE3 == 1) {
                        int iE4 = hne.E(this.l.h);
                        if (iE4 == 0) {
                            float f4 = rectF.top;
                            vjz vjzVar5 = this.l;
                            rectF.top = Math.min(vjzVar5.s, xju0Var.d * vjzVar5.q) + this.l.c + f4;
                        } else if (iE4 == 2) {
                            float f5 = rectF.bottom;
                            vjz vjzVar6 = this.l;
                            rectF.bottom = Math.min(vjzVar6.s, xju0Var.d * vjzVar6.q) + this.l.c + f5;
                        }
                    } else if (iE3 == 2) {
                        float f6 = rectF.right;
                        vjz vjzVar7 = this.l;
                        rectF.right = Math.min(vjzVar7.r, xju0Var.c * vjzVar7.q) + this.l.b + f6;
                    }
                }
            }
            float fD = rectF.left + 0.0f;
            float f7 = rectF.top + 0.0f;
            float fD2 = rectF.right + 0.0f;
            float f8 = rectF.bottom + 0.0f;
            a2w0 a2w0Var = this.v1;
            if (a2w0Var.f4306a && a2w0Var.n) {
                fD += a2w0Var.d(this.x1.f);
            }
            a2w0 a2w0Var2 = this.w1;
            if (a2w0Var2.f4306a && a2w0Var2.n) {
                fD2 += a2w0Var2.d(this.y1.f);
            }
            urv0 urv0Var = this.i;
            if (urv0Var.f4306a && urv0Var.n) {
                float f9 = urv0Var.v + urv0Var.c;
                int i = urv0Var.x;
                if (i == 2) {
                    f8 += f9;
                } else if (i == 1) {
                    f7 += f9;
                } else if (i == 3) {
                    f8 += f9;
                    f7 += f9;
                }
            }
            float extraTopOffset = getExtraTopOffset() + f7;
            float extraRightOffset = getExtraRightOffset() + fD2;
            float extraBottomOffset = getExtraBottomOffset() + f8;
            float extraLeftOffset = getExtraLeftOffset() + fD;
            float fC = dut0.c(this.t1);
            xju0Var.b.set(Math.max(fC, extraLeftOffset), Math.max(fC, extraTopOffset), xju0Var.c - Math.max(fC, extraRightOffset), xju0Var.d - Math.max(fC, extraBottomOffset));
            if (this.f18993a) {
                StringBuilder sbS = dw9.s(extraLeftOffset, extraTopOffset, "offsetLeft: ", ", offsetTop: ", ", offsetRight: ");
                sbS.append(extraRightOffset);
                sbS.append(", offsetBottom: ");
                sbS.append(extraBottomOffset);
                Log.i("MPAndroidChart", sbS.toString());
                Log.i("MPAndroidChart", "Content: " + xju0Var.b.toString());
            }
        }
        ywq0 ywq0Var = this.A1;
        this.w1.getClass();
        ywq0Var.y();
        ywq0 ywq0Var2 = this.z1;
        this.v1.getClass();
        ywq0Var2.y();
        g();
    }

    @Override // android.view.View
    public final void computeScroll() {
        ywb ywbVar = this.m;
        if (ywbVar instanceof fu5) {
            fu5 fu5Var = (fu5) ywbVar;
            cp10 cp10Var = fu5Var.p;
            FinBetChartView finBetChartView = fu5Var.d;
            cp10 cp10Var2 = fu5Var.g;
            cp10 cp10Var3 = fu5Var.o;
            if (cp10Var.b == 0.0f && cp10Var.c == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            cp10Var.b = finBetChartView.getDragDecelerationFrictionCoef() * cp10Var.b;
            float dragDecelerationFrictionCoef = finBetChartView.getDragDecelerationFrictionCoef() * cp10Var.c;
            cp10Var.c = dragDecelerationFrictionCoef;
            float f = (jCurrentAnimationTimeMillis - fu5Var.n) / 1000.0f;
            float f2 = cp10Var3.b + (cp10Var.b * f);
            cp10Var3.b = f2;
            float f3 = cp10Var3.c + (dragDecelerationFrictionCoef * f);
            cp10Var3.c = f3;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f2, f3, 0);
            float f4 = finBetChartView.k1 ? cp10Var3.b - cp10Var2.b : 0.0f;
            float f5 = finBetChartView.l1 ? cp10Var3.c - cp10Var2.c : 0.0f;
            fu5Var.e.set(fu5Var.f);
            finBetChartView.getOnChartGestureListener();
            fu5Var.b();
            fu5Var.e.postTranslate(f4, f5);
            motionEventObtain.recycle();
            xju0 viewPortHandler = finBetChartView.getViewPortHandler();
            Matrix matrix = fu5Var.e;
            viewPortHandler.e(matrix, finBetChartView, false);
            fu5Var.e = matrix;
            fu5Var.n = jCurrentAnimationTimeMillis;
            if (Math.abs(cp10Var.b) >= 0.01d || Math.abs(cp10Var.c) >= 0.01d) {
                DisplayMetrics displayMetrics = dut0.f6713a;
                finBetChartView.postInvalidateOnAnimation();
            } else {
                finBetChartView.a();
                finBetChartView.postInvalidate();
                cp10Var.b = 0.0f;
                cp10Var.c = 0.0f;
            }
        }
    }

    @Override // a.kwb
    public final void d() {
        ArrayList arrayList;
        String str;
        float f;
        int i;
        float f2;
        mwb mwbVar = this.b;
        boolean z = this.f18993a;
        if (mwbVar == null) {
            if (z) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (z) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        urv0 urv0Var = this.i;
        gu5 gu5Var = (gu5) this.b;
        urv0Var.a(gu5Var.d, gu5Var.c);
        int i2 = 1;
        this.v1.a(((gu5) this.b).f(1), ((gu5) this.b).e(1));
        this.w1.a(((gu5) this.b).f(2), ((gu5) this.b).e(2));
        b2w0 b2w0Var = this.x1;
        a2w0 a2w0Var = this.v1;
        b2w0Var.n1(a2w0Var.t, a2w0Var.s);
        b2w0 b2w0Var2 = this.y1;
        a2w0 a2w0Var2 = this.w1;
        b2w0Var2.n1(a2w0Var2.t, a2w0Var2.s);
        vrv0 vrv0Var = this.B1;
        urv0 urv0Var2 = this.i;
        vrv0Var.n1(urv0Var2.t, urv0Var2.s);
        if (this.l != null) {
            xjz xjzVar = this.o;
            mwb mwbVar2 = this.b;
            Paint paint = xjzVar.c;
            vjz vjzVar = xjzVar.e;
            vjzVar.getClass();
            ArrayList arrayList2 = xjzVar.f;
            arrayList2.clear();
            int i3 = 0;
            while (true) {
                ArrayList arrayList3 = mwbVar2.i;
                if (i3 >= (arrayList3 == null ? 0 : arrayList3.size())) {
                    break;
                }
                iuw iuwVarC = mwbVar2.c(i3);
                ArrayList arrayList4 = ((v500) iuwVarC).f36806a;
                int size = ((v500) iuwVarC).o.size();
                int i4 = 0;
                while (i4 < arrayList4.size() && i4 < size) {
                    String str2 = (i4 >= arrayList4.size() - i2 || i4 >= size + (-1)) ? ((v500) mwbVar2.c(i3)).c : null;
                    v500 v500Var = (v500) iuwVarC;
                    int i5 = v500Var.g;
                    float f3 = v500Var.h;
                    float f4 = v500Var.i;
                    int iIntValue = ((Integer) arrayList4.get(i4)).intValue();
                    wjz wjzVar = new wjz();
                    wjzVar.f39285a = str2;
                    wjzVar.b = i5;
                    wjzVar.c = f3;
                    wjzVar.d = f4;
                    wjzVar.e = iIntValue;
                    arrayList2.add(wjzVar);
                    i4++;
                    i2 = 1;
                }
                i3++;
                i2 = 1;
            }
            vjzVar.f = (wjz[]) arrayList2.toArray(new wjz[arrayList2.size()]);
            paint.setTextSize(vjzVar.d);
            paint.setColor(vjzVar.e);
            xju0 xju0Var = (xju0) xjzVar.b;
            ArrayList arrayList5 = vjzVar.u;
            ArrayList arrayList6 = vjzVar.t;
            ArrayList arrayList7 = vjzVar.v;
            float f5 = vjzVar.l;
            float fC = dut0.c(f5);
            float fC2 = dut0.c(vjzVar.p);
            float f6 = vjzVar.o;
            float fC3 = dut0.c(f6);
            float fC4 = dut0.c(vjzVar.n);
            float fC5 = dut0.c(0.0f);
            wjz[] wjzVarArr = vjzVar.f;
            int length = wjzVarArr.length;
            dut0.c(f6);
            wjz[] wjzVarArr2 = vjzVar.f;
            int length2 = wjzVarArr2.length;
            int i6 = 0;
            float f7 = 0.0f;
            float f8 = 0.0f;
            while (i6 < length2) {
                int i7 = i6;
                wjz wjzVar2 = wjzVarArr2[i7];
                float f9 = fC;
                float fC6 = dut0.c(Float.isNaN(wjzVar2.c) ? f5 : wjzVar2.c);
                if (fC6 > f8) {
                    f8 = fC6;
                }
                String str3 = wjzVar2.f39285a;
                if (str3 != null) {
                    float fMeasureText = (int) paint.measureText(str3);
                    if (fMeasureText > f7) {
                        f7 = fMeasureText;
                    }
                }
                i6 = i7 + 1;
                fC = f9;
            }
            float f10 = fC;
            wjz[] wjzVarArr3 = vjzVar.f;
            int length3 = wjzVarArr3.length;
            float f11 = 0.0f;
            int i8 = 0;
            while (i8 < length3) {
                wjz[] wjzVarArr4 = wjzVarArr3;
                String str4 = wjzVarArr4[i8].f39285a;
                if (str4 != null) {
                    float fA = dut0.a(paint, str4);
                    if (fA > f11) {
                        f11 = fA;
                    }
                }
                i8++;
                wjzVarArr3 = wjzVarArr4;
            }
            int iE = hne.E(vjzVar.i);
            if (iE == 0) {
                Paint.FontMetrics fontMetrics = dut0.e;
                paint.getFontMetrics(fontMetrics);
                float f12 = fontMetrics.descent - fontMetrics.ascent;
                paint.getFontMetrics(fontMetrics);
                float f13 = (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom + fC5;
                xju0Var.b.width();
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                int i9 = -1;
                int i10 = 0;
                float fMax = 0.0f;
                float f14 = 0.0f;
                float f15 = 0.0f;
                while (i10 < length) {
                    wjz wjzVar3 = wjzVarArr[i10];
                    float f16 = fC2;
                    int i11 = wjzVar3.b;
                    float f17 = f13;
                    float f18 = wjzVar3.c;
                    boolean z2 = i11 != 1;
                    float fC7 = Float.isNaN(f18) ? f10 : dut0.c(f18);
                    String str5 = wjzVar3.f39285a;
                    boolean z3 = z2;
                    arrayList5.add(Boolean.FALSE);
                    float f19 = i9 == -1 ? 0.0f : f14 + f16;
                    if (str5 != null) {
                        arrayList = arrayList5;
                        arrayList6.add(dut0.b(paint, str5));
                        f = f19 + (z3 ? fC3 + fC7 : 0.0f) + ((ruo) arrayList6.get(i10)).b;
                        str = str5;
                        i = -1;
                    } else {
                        arrayList = arrayList5;
                        ruo ruoVar = (ruo) ruo.d.b();
                        str = str5;
                        ruoVar.b = 0.0f;
                        ruoVar.c = 0.0f;
                        arrayList6.add(ruoVar);
                        if (!z3) {
                            fC7 = 0.0f;
                        }
                        f = f19 + fC7;
                        i = -1;
                        if (i9 == -1) {
                            i9 = i10;
                        }
                    }
                    if (str != null || i10 == length - 1) {
                        float f20 = (f15 == 0.0f ? 0.0f : fC4) + f + f15;
                        if (i10 == length - 1) {
                            ruo ruoVar2 = (ruo) ruo.d.b();
                            ruoVar2.b = f20;
                            ruoVar2.c = f12;
                            arrayList7.add(ruoVar2);
                            fMax = Math.max(fMax, f20);
                        }
                        f15 = f20;
                    }
                    if (str != null) {
                        i9 = i;
                    }
                    i10++;
                    arrayList5 = arrayList;
                    f13 = f17;
                    f14 = f;
                    fC2 = f16;
                }
                float f21 = f13;
                vjzVar.r = fMax;
                vjzVar.s = (f21 * (arrayList7.size() == 0 ? 0 : arrayList7.size() - 1)) + (f12 * arrayList7.size());
            } else if (iE == 1) {
                Paint.FontMetrics fontMetrics2 = dut0.e;
                paint.getFontMetrics(fontMetrics2);
                float f22 = fontMetrics2.descent - fontMetrics2.ascent;
                float fMax2 = 0.0f;
                float f23 = 0.0f;
                float f24 = 0.0f;
                int i12 = 0;
                boolean z4 = false;
                while (i12 < length) {
                    wjz wjzVar4 = wjzVarArr[i12];
                    int i13 = wjzVar4.b;
                    float f25 = wjzVar4.c;
                    float f26 = f22;
                    boolean z5 = i13 != 1;
                    float fC8 = Float.isNaN(f25) ? f10 : dut0.c(f25);
                    String str6 = wjzVar4.f39285a;
                    if (!z4) {
                        f24 = 0.0f;
                    }
                    if (z5) {
                        if (z4) {
                            f24 += fC2;
                        }
                        f24 += fC8;
                    }
                    if (str6 != null) {
                        if (z5 && !z4) {
                            f2 = f24 + fC3;
                        } else if (z4) {
                            fMax2 = Math.max(fMax2, f24);
                            f23 += f26 + fC5;
                            f2 = 0.0f;
                            z4 = false;
                        } else {
                            f2 = f24;
                        }
                        float fMeasureText2 = f2 + ((int) paint.measureText(str6));
                        if (i12 < length - 1) {
                            f23 = f26 + fC5 + f23;
                        }
                        f24 = fMeasureText2;
                    } else {
                        f24 += fC8;
                        if (i12 < length - 1) {
                            f24 += fC2;
                        }
                        z4 = true;
                    }
                    fMax2 = Math.max(fMax2, f24);
                    i12++;
                    f22 = f26;
                }
                vjzVar.r = fMax2;
                vjzVar.s = f23;
            }
            vjzVar.s += vjzVar.c;
            vjzVar.r += vjzVar.b;
        }
        a();
    }

    public final ywq0 f(int i) {
        return i == 1 ? this.z1 : this.A1;
    }

    public final void g() {
        if (this.f18993a) {
            Log.i("MPAndroidChart", "Preparing Value-Px Matrix, xmin: " + this.i.t + ", xmax: " + this.i.s + ", xdelta: " + this.i.u);
        }
        ywq0 ywq0Var = this.A1;
        urv0 urv0Var = this.i;
        float f = urv0Var.t;
        float f2 = urv0Var.u;
        a2w0 a2w0Var = this.w1;
        ywq0Var.z(f, f2, a2w0Var.u, a2w0Var.t);
        ywq0 ywq0Var2 = this.z1;
        urv0 urv0Var2 = this.i;
        float f3 = urv0Var2.t;
        float f4 = urv0Var2.u;
        a2w0 a2w0Var2 = this.v1;
        ywq0Var2.z(f3, f4, a2w0Var2.u, a2w0Var2.t);
    }

    public a2w0 getAxisLeft() {
        return this.v1;
    }

    public a2w0 getAxisRight() {
        return this.w1;
    }

    @Override // a.kwb, a.pwb
    public /* bridge */ gu5 getData() {
        return (gu5) super.getData();
    }

    public ch60 getDrawListener() {
        return null;
    }

    public float getHighestVisibleX() {
        ywq0 ywq0Var = this.z1;
        RectF rectF = this.r.b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        bp10 bp10Var = this.I1;
        ywq0Var.n(f, f2, bp10Var);
        return (float) Math.min(this.i.s, bp10Var.b);
    }

    public float getLowestVisibleX() {
        ywq0 ywq0Var = this.z1;
        RectF rectF = this.r.b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        bp10 bp10Var = this.H1;
        ywq0Var.n(f, f2, bp10Var);
        return (float) Math.max(this.i.t, bp10Var.b);
    }

    @Override // a.kwb, a.pwb
    public int getMaxVisibleCount() {
        return this.f1;
    }

    public float getMinOffset() {
        return this.t1;
    }

    public b2w0 getRendererLeftYAxis() {
        return this.x1;
    }

    public b2w0 getRendererRightYAxis() {
        return this.y1;
    }

    public vrv0 getRendererXAxis() {
        return this.B1;
    }

    @Override // android.view.View
    public float getScaleX() {
        xju0 xju0Var = this.r;
        if (xju0Var == null) {
            return 1.0f;
        }
        return xju0Var.g;
    }

    @Override // android.view.View
    public float getScaleY() {
        xju0 xju0Var = this.r;
        if (xju0Var == null) {
            return 1.0f;
        }
        return xju0Var.h;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // a.kwb, a.pwb
    public float getYChartMax() {
        return Math.max(this.v1.s, this.w1.s);
    }

    @Override // a.kwb, a.pwb
    public float getYChartMin() {
        return Math.min(this.v1.t, this.w1.t);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:104:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:137:0x03af  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:149:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:154:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:156:0x0402  */
    /* JADX WARN: Code duplicated, block: B:157:0x0420  */
    /* JADX WARN: Code duplicated, block: B:158:0x042e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0444  */
    /* JADX WARN: Code duplicated, block: B:164:0x044e  */
    /* JADX WARN: Code duplicated, block: B:167:0x045d  */
    /* JADX WARN: Code duplicated, block: B:169:0x046d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0492  */
    /* JADX WARN: Code duplicated, block: B:174:0x049f  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:180:0x04bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:182:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:186:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:193:0x050a  */
    /* JADX WARN: Code duplicated, block: B:195:0x053a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0556  */
    /* JADX WARN: Code duplicated, block: B:200:0x056f A[LOOP:9: B:198:0x0568->B:200:0x056f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x059c  */
    /* JADX WARN: Code duplicated, block: B:205:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:207:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:209:0x060f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0612  */
    /* JADX WARN: Code duplicated, block: B:213:0x062e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x0631  */
    /* JADX WARN: Code duplicated, block: B:218:0x063d  */
    /* JADX WARN: Code duplicated, block: B:219:0x063f  */
    /* JADX WARN: Code duplicated, block: B:222:0x068c A[PHI: r0
  0x068c: PHI (r0v18 android.graphics.Path) = (r0v17 android.graphics.Path), (r0v21 android.graphics.Path) binds: [B:206:0x05f6, B:221:0x068a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:224:0x0690  */
    /* JADX WARN: Code duplicated, block: B:227:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:242:0x0737  */
    /* JADX WARN: Code duplicated, block: B:244:0x0743  */
    /* JADX WARN: Code duplicated, block: B:253:0x076c  */
    /* JADX WARN: Code duplicated, block: B:255:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:258:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:263:0x081d  */
    /* JADX WARN: Code duplicated, block: B:269:0x083b  */
    /* JADX WARN: Code duplicated, block: B:306:0x090a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0913  */
    /* JADX WARN: Code duplicated, block: B:312:0x092d  */
    /* JADX WARN: Code duplicated, block: B:314:0x0935  */
    /* JADX WARN: Code duplicated, block: B:316:0x093f  */
    /* JADX WARN: Code duplicated, block: B:318:0x094b  */
    /* JADX WARN: Code duplicated, block: B:320:0x0954  */
    /* JADX WARN: Code duplicated, block: B:321:0x0961  */
    /* JADX WARN: Code duplicated, block: B:326:0x097c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0989  */
    /* JADX WARN: Code duplicated, block: B:332:0x099b  */
    /* JADX WARN: Code duplicated, block: B:336:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:339:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:347:0x09ec  */
    /* JADX WARN: Code duplicated, block: B:348:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:350:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:351:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:353:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:354:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:356:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:357:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:361:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:362:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:370:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:387:0x048f A[EDGE_INSN: B:387:0x048f->B:171:0x048f BREAK  A[LOOP:7: B:144:0x03d1->B:170:0x0489], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x048f A[EDGE_INSN: B:389:0x048f->B:171:0x048f BREAK  A[LOOP:7: B:144:0x03d1->B:170:0x0489], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0489 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0489 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x0489 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x068a A[EDGE_INSN: B:398:0x068a->B:221:0x068a BREAK  A[LOOP:10: B:211:0x0625->B:220:0x0640], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0910 A[EDGE_INSN: B:416:0x0910->B:308:0x0910 BREAK  A[LOOP:14: B:305:0x0908->B:322:0x0963], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0910 A[EDGE_INSN: B:417:0x0910->B:308:0x0910 BREAK  A[LOOP:14: B:305:0x0908->B:322:0x0963], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x018f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bc A[LOOP:2: B:71:0x01b9->B:73:0x01bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ea A[LOOP:3: B:75:0x01e7->B:77:0x01ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0247  */
    /* JADX WARN: Code duplicated, block: B:82:0x0249  */
    /* JADX WARN: Code duplicated, block: B:89:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x028a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0294  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b3  */
    @Override // a.kwb, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        vrv0 vrv0Var;
        Paint paint;
        wa5 wa5Var;
        xju0 xju0Var;
        urv0 urv0Var;
        int iSave;
        RectF rectF;
        int i;
        WeakReference weakReference;
        Bitmap bitmapCreateBitmap;
        int i2;
        RectF rectF2;
        xju0 xju0Var2;
        long j;
        float f;
        eu5 eu5Var;
        vxv[] vxvVarArr;
        s500 s500Var;
        HashMap map;
        FinBetChartView finBetChartView;
        ArrayList arrayList;
        int i3;
        Canvas canvas3;
        vrv0 vrv0Var2;
        Paint paint2;
        xju0 xju0Var3;
        urv0 urv0Var2;
        RectF rectF3;
        bck bckVar;
        float f2;
        cp10 cp10VarB;
        int i4;
        float f3;
        vrv0 vrv0Var3;
        ArrayList arrayList2;
        boolean z;
        Canvas canvas4;
        r500 r500Var;
        int i5;
        int i6;
        Entry entryB;
        float f4;
        RectF rectF4;
        Bitmap bitmap;
        s500 s500Var2;
        lwb lwbVar;
        FinBetChartView finBetChartView2;
        u500 lineData;
        int i7;
        v500 v500Var;
        ArrayList arrayList3;
        Entry entryC;
        float fIndexOf;
        float size;
        float f5;
        float f6;
        xju0 xju0Var4;
        Path path;
        Paint paint3;
        Iterator it;
        v500 v500Var2;
        xju0 xju0Var5;
        long j2;
        Iterator it2;
        Path path2;
        int i8;
        Path path3;
        hu5 hu5Var;
        lwb lwbVar2;
        ArrayList arrayList4;
        int i9;
        int iE;
        Path path4;
        ywq0 ywq0VarF;
        float f7;
        PathEffect pathEffect;
        Entry entryB2;
        Entry entryB3;
        int i10;
        int i11;
        Entry entry;
        Path path5;
        int i12;
        ywq0 ywq0VarF2;
        Path path6;
        Entry entryB4;
        int i13;
        int size2;
        int i14;
        int i15;
        ywq0 ywq0VarF3;
        float f8;
        int size3;
        float[] fArr;
        int i16;
        int i17;
        int i18;
        int i19;
        Entry entryB5;
        int length;
        int i20;
        int i21;
        Entry entryB6;
        float[] fArr2;
        float f9;
        float f10;
        char c;
        float[] fArr3;
        float f11;
        RectF rectF5;
        Entry entryB7;
        float f12;
        float[] fArr4;
        RectF rectF6;
        float[] fArr5;
        int i22;
        Path path7;
        int i23;
        xju0 xju0Var6 = this.r;
        super.onDraw(canvas);
        if (this.b == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.q1) {
            canvas.drawRect(xju0Var6.b, this.o1);
        }
        if (this.r1) {
            canvas.drawRect(xju0Var6.b, this.p1);
        }
        int i24 = 2;
        if (this.g1) {
            float lowestVisibleX = getLowestVisibleX();
            float highestVisibleX = getHighestVisibleX();
            gu5 gu5Var = (gu5) this.b;
            Iterator it3 = gu5Var.i.iterator();
            while (it3.hasNext()) {
                v500 v500Var3 = (v500) ((iuw) it3.next());
                ArrayList arrayList5 = v500Var3.o;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    v500Var3.p = -3.4028235E38f;
                    v500Var3.q = Float.MAX_VALUE;
                    int iD = v500Var3.d(highestVisibleX, Float.NaN, 1);
                    for (int iD2 = v500Var3.d(lowestVisibleX, Float.NaN, i24); iD2 <= iD; iD2++) {
                        float f13 = ((Entry) arrayList5.get(iD2)).f45454a;
                        if (f13 < v500Var3.q) {
                            v500Var3.q = f13;
                        }
                        if (f13 > v500Var3.p) {
                            v500Var3.p = f13;
                        }
                    }
                }
                i24 = 2;
            }
            gu5Var.a();
            urv0 urv0Var3 = this.i;
            gu5 gu5Var2 = (gu5) this.b;
            urv0Var3.a(gu5Var2.d, gu5Var2.c);
            a2w0 a2w0Var = this.v1;
            if (a2w0Var.f4306a) {
                a2w0Var.a(((gu5) this.b).f(1), ((gu5) this.b).e(1));
            }
            a2w0 a2w0Var2 = this.w1;
            if (a2w0Var2.f4306a) {
                a2w0Var2.a(((gu5) this.b).f(2), ((gu5) this.b).e(2));
            }
            a();
        }
        a2w0 a2w0Var3 = this.v1;
        if (a2w0Var3.f4306a) {
            this.x1.n1(a2w0Var3.t, a2w0Var3.s);
        }
        a2w0 a2w0Var4 = this.w1;
        if (a2w0Var4.f4306a) {
            this.y1.n1(a2w0Var4.t, a2w0Var4.s);
        }
        urv0 urv0Var4 = this.i;
        if (urv0Var4.f4306a) {
            this.B1.n1(urv0Var4.t, urv0Var4.s);
        }
        vrv0 vrv0Var4 = this.B1;
        xju0 xju0Var7 = (xju0) vrv0Var4.b;
        Paint paint4 = vrv0Var4.g;
        urv0 urv0Var5 = vrv0Var4.h;
        urv0Var5.getClass();
        int i25 = 4;
        if (urv0Var5.f4306a) {
            paint4.setColor(-7829368);
            paint4.setStrokeWidth(1.0f);
            paint4.setPathEffect(null);
            int i26 = urv0Var5.x;
            if (i26 == 1 || i26 == 4 || i26 == 3) {
                RectF rectF7 = xju0Var7.b;
                float f14 = rectF7.left;
                float f15 = rectF7.top;
                canvas.drawLine(f14, f15, rectF7.right, f15, paint4);
            }
            int i27 = urv0Var5.x;
            if (i27 == 2 || i27 == 5 || i27 == 3) {
                RectF rectF8 = xju0Var7.b;
                float f16 = rectF8.left;
                float f17 = rectF8.bottom;
                float f18 = rectF8.right;
                canvas2 = canvas;
                canvas2.drawLine(f16, f17, f18, f17, paint4);
            }
            this.x1.r1(canvas2);
            this.y1.r1(canvas2);
            this.i.getClass();
            vrv0Var = this.B1;
            paint = vrv0Var.e;
            wa5Var = vrv0Var.c;
            xju0Var = (xju0) vrv0Var.b;
            urv0Var = vrv0Var.h;
            urv0Var.getClass();
            int i28 = 0;
            if (urv0Var.f4306a) {
                int iSave2 = canvas2.save();
                RectF rectF9 = vrv0Var.k;
                RectF rectF10 = xju0Var.b;
                rectF6 = xju0Var.b;
                rectF9.set(rectF10);
                rectF9.inset(-wa5Var.h, 0.0f);
                canvas2.clipRect(rectF9);
                fArr5 = vrv0Var.j;
                if (fArr5.length != wa5Var.j * 2) {
                    fArr5 = new float[urv0Var.j * 2];
                    vrv0Var.j = fArr5;
                }
                for (i22 = 0; i22 < fArr5.length; i22 += 2) {
                    float[] fArr6 = urv0Var.i;
                    int i29 = i22 / 2;
                    fArr5[i22] = fArr6[i29];
                    fArr5[i22 + 1] = fArr6[i29];
                }
                vrv0Var.d.x(fArr5);
                paint.setColor(urv0Var.g);
                paint.setStrokeWidth(urv0Var.h);
                paint.setPathEffect(urv0Var.o);
                path7 = vrv0Var.i;
                path7.reset();
                for (i23 = 0; i23 < fArr5.length; i23 += 2) {
                    float f19 = fArr5[i23];
                    float f20 = fArr5[i23 + 1];
                    path7.moveTo(f19, rectF6.bottom);
                    path7.lineTo(f19, rectF6.top);
                    canvas2.drawPath(path7, paint);
                    path7.reset();
                }
                canvas2.restoreToCount(iSave2);
            }
            this.v1.getClass();
            this.x1.s1(canvas2);
            this.w1.getClass();
            this.y1.s1(canvas2);
            boolean z2 = this.i.f4306a;
            boolean z3 = this.v1.f4306a;
            boolean z4 = this.w1.f4306a;
            iSave = canvas2.save();
            RectF rectF11 = xju0Var6.b;
            rectF = xju0Var6.b;
            canvas2.clipRect(rectF11);
            s500 s500Var3 = (s500) this.p;
            Paint paint5 = s500Var3.d;
            FinBetChartView finBetChartView3 = s500Var3.i;
            xju0 xju0Var8 = (xju0) s500Var3.b;
            i = (int) xju0Var8.c;
            int i30 = (int) xju0Var8.d;
            weakReference = s500Var3.k;
            if (weakReference == null) {
                bitmapCreateBitmap = null;
            } else {
                bitmapCreateBitmap = (Bitmap) weakReference.get();
            }
            if (bitmapCreateBitmap == null && bitmapCreateBitmap.getWidth() == i && bitmapCreateBitmap.getHeight() == i30) {
                bitmapCreateBitmap.eraseColor(0);
                it = finBetChartView3.getLineData().i.iterator();
                while (it.hasNext()) {
                    v500Var2 = (v500) it.next();
                    if (v500Var2.n) {
                        path2 = s500Var3.n;
                        i8 = i28;
                        path3 = s500Var3.o;
                        j2 = jCurrentTimeMillis;
                        hu5Var = s500Var3.g;
                        lwbVar2 = s500Var3.c;
                        arrayList4 = v500Var2.o;
                        i9 = v500Var2.B;
                        it2 = it;
                        xju0Var5 = xju0Var6;
                        if (arrayList4.size() < 1) {
                            paint5.setStrokeWidth(v500Var2.z);
                            paint5.setPathEffect(null);
                            iE = hne.E(i9);
                            if (iE != 2) {
                                iSave = iSave;
                                rectF = rectF;
                                bitmapCreateBitmap = bitmapCreateBitmap;
                                path4 = path2;
                                lwbVar2.getClass();
                                ywq0VarF = finBetChartView3.f(v500Var2.d);
                                hu5Var.X(finBetChartView3, v500Var2);
                                f7 = v500Var2.G;
                                path4.reset();
                                if (hu5Var.d >= 1) {
                                    int i31 = hu5Var.b;
                                    entryB2 = v500Var2.b(Math.max(i31 - 1, 0));
                                    entryB3 = v500Var2.b(Math.max(i31, 0));
                                    if (entryB3 == null) {
                                        pathEffect = null;
                                    } else {
                                        path4.moveTo(entryB3.c, entryB3.f45454a * 1.0f);
                                        i10 = -1;
                                        i11 = hu5Var.b + 1;
                                        entry = entryB3;
                                        while (true) {
                                            path5 = path4;
                                            if (i11 <= hu5Var.d + hu5Var.b) {
                                                break;
                                                break;
                                            }
                                            if (i10 != i11) {
                                                entryB3 = v500Var2.b(i11);
                                            }
                                            i12 = i11 + 1;
                                            if (i12 < arrayList4.size()) {
                                                i10 = i12;
                                            } else {
                                                i10 = i11;
                                            }
                                            Entry entryB8 = v500Var2.b(i10);
                                            float f21 = entryB3.c;
                                            float f22 = (f21 - entryB2.c) * f7;
                                            float f23 = entryB3.f45454a;
                                            float f24 = (f23 - entryB2.f45454a) * f7;
                                            float f25 = entryB8.c;
                                            float f26 = entry.c;
                                            float f27 = (f25 - f26) * f7;
                                            float f28 = entryB8.f45454a;
                                            float f29 = entry.f45454a;
                                            path5.cubicTo(f26 + f22, (f29 + f24) * 1.0f, f21 - f27, (f23 - ((f28 - f29) * f7)) * 1.0f, f21, f23 * 1.0f);
                                            entryB2 = entry;
                                            path4 = path5;
                                            entry = entryB3;
                                            entryB3 = entryB8;
                                            i11 = i12;
                                        }
                                        path4 = path5;
                                        if (v500Var2.A) {
                                            path3.reset();
                                            path3.addPath(path4);
                                            s500Var3.o1(s500Var3.l, v500Var2, path3, ywq0VarF, s500Var3.g);
                                        }
                                        paint5.setColor(((Integer) v500Var2.f36806a.get(0)).intValue());
                                        paint5.setStyle(Paint.Style.STROKE);
                                        ywq0VarF.u(path4);
                                        s500Var3.l.drawPath(path4, paint5);
                                        pathEffect = null;
                                        paint5.setPathEffect(null);
                                    }
                                } else {
                                    if (v500Var2.A) {
                                        path3.reset();
                                        path3.addPath(path4);
                                        s500Var3.o1(s500Var3.l, v500Var2, path3, ywq0VarF, s500Var3.g);
                                    }
                                    paint5.setColor(((Integer) v500Var2.f36806a.get(0)).intValue());
                                    paint5.setStyle(Paint.Style.STROKE);
                                    ywq0VarF.u(path4);
                                    s500Var3.l.drawPath(path4, paint5);
                                    pathEffect = null;
                                    paint5.setPathEffect(null);
                                }
                            } else if (iE != 3) {
                                size2 = arrayList4.size();
                                if (i9 == 2) {
                                    i14 = 1;
                                } else {
                                    i14 = i8;
                                }
                                if (i14 != 0) {
                                    i15 = i25;
                                } else {
                                    i15 = 2;
                                }
                                ywq0VarF3 = finBetChartView3.f(v500Var2.d);
                                lwbVar2.getClass();
                                paint5.setStyle(Paint.Style.STROKE);
                                hu5Var.X(finBetChartView3, v500Var2);
                                if (v500Var2.A) {
                                    iSave = iSave;
                                    bitmapCreateBitmap = bitmapCreateBitmap;
                                    f8 = 1.0f;
                                } else {
                                    iSave = iSave;
                                    bitmapCreateBitmap = bitmapCreateBitmap;
                                    f8 = 1.0f;
                                }
                                size3 = v500Var2.f36806a.size();
                                fArr = s500Var3.p;
                                if (size3 > 1) {
                                    length = fArr.length;
                                    i20 = i15 * 2;
                                    if (length <= i20) {
                                        s500Var3.p = new float[i15 * 4];
                                    }
                                    i21 = hu5Var.b;
                                    while (i21 <= hu5Var.d + hu5Var.b) {
                                        entryB6 = v500Var2.b(i21);
                                        if (entryB6 == null) {
                                            fArr2 = s500Var3.p;
                                            f9 = entryB6.c;
                                            fArr2[i8] = f9;
                                            f10 = entryB6.f45454a * f8;
                                            fArr2[1] = f10;
                                            if (i21 < hu5Var.c) {
                                                entryB7 = v500Var2.b(i21 + 1);
                                                if (entryB7 == null) {
                                                    break;
                                                    break;
                                                }
                                                f12 = entryB7.c;
                                                fArr4 = s500Var3.p;
                                                if (i14 != 0) {
                                                    fArr4[2] = f12;
                                                    float f30 = fArr4[1];
                                                    fArr4[3] = f30;
                                                    fArr4[i25] = f12;
                                                    fArr4[5] = f30;
                                                    fArr4[6] = f12;
                                                    fArr4[7] = entryB7.f45454a * f8;
                                                    fArr2 = fArr4;
                                                    c = 2;
                                                } else {
                                                    c = 2;
                                                    fArr4[2] = f12;
                                                    fArr4[3] = entryB7.f45454a * f8;
                                                    fArr2 = fArr4;
                                                }
                                            } else {
                                                c = 2;
                                                fArr2[2] = f9;
                                                fArr2[3] = f10;
                                            }
                                            ywq0VarF3.x(fArr2);
                                            if (!xju0Var8.c(s500Var3.p[i8])) {
                                                break;
                                                break;
                                            }
                                            if (xju0Var8.b(s500Var3.p[c])) {
                                                fArr3 = s500Var3.p;
                                                f11 = fArr3[1];
                                                rectF5 = xju0Var8.b;
                                                if (rectF5.top <= f11) {
                                                    ArrayList arrayList6 = v500Var2.f36806a;
                                                    paint5.setColor(((Integer) arrayList6.get(i21 % arrayList6.size())).intValue());
                                                    canvas2.drawLines(s500Var3.p, i8, i20, paint5);
                                                } else if (rectF5.bottom >= ((int) (fArr3[3] * 100.0f)) / 100.0f) {
                                                    ArrayList arrayList7 = v500Var2.f36806a;
                                                    paint5.setColor(((Integer) arrayList7.get(i21 % arrayList7.size())).intValue());
                                                    canvas2.drawLines(s500Var3.p, i8, i20, paint5);
                                                }
                                            }
                                        }
                                        i21++;
                                        i8 = 0;
                                    }
                                } else {
                                    i16 = size2 * i15;
                                    if (fArr.length < Math.max(i16, i15) * 2) {
                                        s500Var3.p = new float[Math.max(i16, i15) * 4];
                                    }
                                    if (v500Var2.b(hu5Var.b) != null) {
                                        i18 = 0;
                                        for (i17 = hu5Var.b; i17 <= hu5Var.d + hu5Var.b; i17++) {
                                            if (i17 == 0) {
                                                i19 = 0;
                                            } else {
                                                i19 = i17 - 1;
                                            }
                                            entryB5 = v500Var2.b(i19);
                                            Entry entryB9 = v500Var2.b(i17);
                                            if (entryB5 == null) {
                                            }
                                        }
                                        if (i18 > 0) {
                                            ywq0VarF3.x(s500Var3.p);
                                            int iMax = Math.max((hu5Var.d + 1) * i15, i15) * 2;
                                            paint5.setColor(((Integer) v500Var2.f36806a.get(0)).intValue());
                                            canvas2.drawLines(s500Var3.p, 0, iMax, paint5);
                                        }
                                    }
                                }
                                pathEffect = null;
                                paint5.setPathEffect(null);
                            } else {
                                iSave = iSave;
                                rectF = rectF;
                                bitmapCreateBitmap = bitmapCreateBitmap;
                                lwbVar2.getClass();
                                ywq0VarF2 = finBetChartView3.f(v500Var2.d);
                                hu5Var.X(finBetChartView3, v500Var2);
                                path2.reset();
                                if (hu5Var.d >= 1) {
                                    entryB4 = v500Var2.b(hu5Var.b);
                                    path2.moveTo(entryB4.c, entryB4.f45454a * 1.0f);
                                    i13 = hu5Var.b + 1;
                                    while (i13 <= hu5Var.d + hu5Var.b) {
                                        Entry entryB10 = v500Var2.b(i13);
                                        float f31 = entryB4.c;
                                        float f32 = entryB10.c;
                                        float fZ = rw2.z(f32, f31, 2.0f, f31);
                                        float f33 = entryB4.f45454a * 1.0f;
                                        float f34 = entryB10.f45454a * 1.0f;
                                        Path path8 = path2;
                                        path8.cubicTo(fZ, f33, fZ, f34, f32, f34);
                                        i13++;
                                        path2 = path8;
                                        entryB4 = entryB10;
                                    }
                                }
                                path6 = path2;
                                if (v500Var2.A) {
                                    path3.reset();
                                    path3.addPath(path6);
                                    s500Var3.o1(s500Var3.l, v500Var2, path3, ywq0VarF2, s500Var3.g);
                                }
                                paint5.setColor(((Integer) v500Var2.f36806a.get(0)).intValue());
                                paint5.setStyle(Paint.Style.STROKE);
                                ywq0VarF2.u(path6);
                                s500Var3.l.drawPath(path6, paint5);
                                pathEffect = null;
                                paint5.setPathEffect(null);
                            }
                            paint5.setPathEffect(pathEffect);
                        }
                        jCurrentTimeMillis = j2;
                        it = it2;
                        xju0Var6 = xju0Var5;
                        rectF = rectF;
                        iSave = iSave;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i28 = 0;
                    } else {
                        xju0Var5 = xju0Var6;
                        j2 = jCurrentTimeMillis;
                        it2 = it;
                    }
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    jCurrentTimeMillis = j2;
                    it = it2;
                    xju0Var6 = xju0Var5;
                    rectF = rectF;
                    iSave = iSave;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    i28 = 0;
                }
                i2 = iSave;
                rectF2 = rectF;
                xju0Var2 = xju0Var6;
                j = jCurrentTimeMillis;
                f = 1.0f;
                canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint5);
            } else if (i > 0 || i30 <= 0) {
                i2 = iSave;
                rectF2 = rectF;
                xju0Var2 = xju0Var6;
                j = jCurrentTimeMillis;
                f = 1.0f;
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(i, i30, s500Var3.m);
                s500Var3.k = new WeakReference(bitmapCreateBitmap);
                s500Var3.l = new Canvas(bitmapCreateBitmap);
                bitmapCreateBitmap.eraseColor(0);
                it = finBetChartView3.getLineData().i.iterator();
                while (it.hasNext()) {
                    v500Var2 = (v500) it.next();
                    if (v500Var2.n) {
                        path2 = s500Var3.n;
                        i8 = i28;
                        path3 = s500Var3.o;
                        j2 = jCurrentTimeMillis;
                        hu5Var = s500Var3.g;
                        lwbVar2 = s500Var3.c;
                        arrayList4 = v500Var2.o;
                        i9 = v500Var2.B;
                        it2 = it;
                        xju0Var5 = xju0Var6;
                        if (arrayList4.size() < 1) {
                            paint5.setStrokeWidth(v500Var2.z);
                            paint5.setPathEffect(null);
                            iE = hne.E(i9);
                            if (iE != 2) {
                                iSave = iSave;
                                rectF = rectF;
                                bitmapCreateBitmap = bitmapCreateBitmap;
                                path4 = path2;
                                lwbVar2.getClass();
                                ywq0VarF = finBetChartView3.f(v500Var2.d);
                                hu5Var.X(finBetChartView3, v500Var2);
                                f7 = v500Var2.G;
                                path4.reset();
                                if (hu5Var.d >= 1) {
                                    int i32 = hu5Var.b;
                                    entryB2 = v500Var2.b(Math.max(i32 - 1, 0));
                                    entryB3 = v500Var2.b(Math.max(i32, 0));
                                    if (entryB3 == null) {
                                        pathEffect = null;
                                    } else {
                                        path4.moveTo(entryB3.c, entryB3.f45454a * 1.0f);
                                        i10 = -1;
                                        i11 = hu5Var.b + 1;
                                        entry = entryB3;
                                        while (true) {
                                            path5 = path4;
                                            if (i11 <= hu5Var.d + hu5Var.b) {
                                                break;
                                            }
                                            if (i10 != i11) {
                                                entryB3 = v500Var2.b(i11);
                                            }
                                            i12 = i11 + 1;
                                            if (i12 < arrayList4.size()) {
                                                i10 = i12;
                                            } else {
                                                i10 = i11;
                                            }
                                            Entry entryB11 = v500Var2.b(i10);
                                            float f210 = entryB3.c;
                                            float f211 = (f210 - entryB2.c) * f7;
                                            float f212 = entryB3.f45454a;
                                            float f213 = (f212 - entryB2.f45454a) * f7;
                                            float f214 = entryB11.c;
                                            float f215 = entry.c;
                                            float f216 = (f214 - f215) * f7;
                                            float f217 = entryB11.f45454a;
                                            float f218 = entry.f45454a;
                                            path5.cubicTo(f215 + f211, (f218 + f213) * 1.0f, f210 - f216, (f212 - ((f217 - f218) * f7)) * 1.0f, f210, f212 * 1.0f);
                                            entryB2 = entry;
                                            path4 = path5;
                                            entry = entryB3;
                                            entryB3 = entryB11;
                                            i11 = i12;
                                        }
                                        path4 = path5;
                                        if (v500Var2.A) {
                                            path3.reset();
                                            path3.addPath(path4);
                                            s500Var3.o1(s500Var3.l, v500Var2, path3, ywq0VarF, s500Var3.g);
                                        }
                                        paint5.setColor(((Integer) v500Var2.f36806a.get(0)).intValue());
                                        paint5.setStyle(Paint.Style.STROKE);
                                        ywq0VarF.u(path4);
                                        s500Var3.l.drawPath(path4, paint5);
                                        pathEffect = null;
                                        paint5.setPathEffect(null);
                                    }
                                } else {
                                    if (v500Var2.A) {
                                        path3.reset();
                                        path3.addPath(path4);
                                        s500Var3.o1(s500Var3.l, v500Var2, path3, ywq0VarF, s500Var3.g);
                                    }
                                    paint5.setColor(((Integer) v500Var2.f36806a.get(0)).intValue());
                                    paint5.setStyle(Paint.Style.STROKE);
                                    ywq0VarF.u(path4);
                                    s500Var3.l.drawPath(path4, paint5);
                                    pathEffect = null;
                                    paint5.setPathEffect(null);
                                }
                            } else if (iE != 3) {
                                size2 = arrayList4.size();
                                if (i9 == 2) {
                                    i14 = 1;
                                } else {
                                    i14 = i8;
                                }
                                if (i14 != 0) {
                                    i15 = i25;
                                } else {
                                    i15 = 2;
                                }
                                ywq0VarF3 = finBetChartView3.f(v500Var2.d);
                                lwbVar2.getClass();
                                paint5.setStyle(Paint.Style.STROKE);
                                hu5Var.X(finBetChartView3, v500Var2);
                                if (v500Var2.A || size2 <= 0) {
                                    iSave = iSave;
                                    bitmapCreateBitmap = bitmapCreateBitmap;
                                    f8 = 1.0f;
                                } else {
                                    Path path9 = s500Var3.q;
                                    int i33 = hu5Var.b;
                                    int i34 = hu5Var.d + i33;
                                    int i35 = i8;
                                    while (true) {
                                        iSave = iSave;
                                        int i36 = (i35 * 128) + i33;
                                        int i37 = i35;
                                        int i38 = i36 + 128;
                                        if (i38 > i34) {
                                            i38 = i34;
                                        }
                                        if (i36 <= i38) {
                                            v500Var2.H.getClass();
                                            float fC = usd.c(v500Var2, finBetChartView3);
                                            int i39 = i9 == 2 ? 1 : i8;
                                            path9.reset();
                                            int i40 = i39;
                                            Entry entryB12 = v500Var2.b(i36);
                                            path9.moveTo(entryB12.c, fC);
                                            path9.lineTo(entryB12.c, entryB12.f45454a * 1.0f);
                                            f8 = 1.0f;
                                            int i41 = i36 + 1;
                                            Entry entry2 = entryB12;
                                            Entry entryB13 = null;
                                            while (i41 <= i38) {
                                                entryB13 = v500Var2.b(i41);
                                                int i42 = i41;
                                                if (i40 != 0) {
                                                    path9.lineTo(entryB13.c, entry2.f45454a * 1.0f);
                                                }
                                                path9.lineTo(entryB13.c, entryB13.f45454a * 1.0f);
                                                i41 = i42 + 1;
                                                entry2 = entryB13;
                                            }
                                            if (entryB13 != null) {
                                                path9.lineTo(entryB13.c, fC);
                                            }
                                            path9.close();
                                            ywq0VarF3.u(path9);
                                            int i43 = (v500Var2.x & 16777215) | (v500Var2.y << 24);
                                            DisplayMetrics displayMetrics = dut0.f6713a;
                                            int iSave3 = canvas2.save();
                                            canvas2.clipPath(path9);
                                            canvas2.drawColor(i43);
                                            canvas2.restoreToCount(iSave3);
                                        } else {
                                            f8 = 1.0f;
                                        }
                                        int i44 = i37 + 1;
                                        if (i36 > i38) {
                                            break;
                                        }
                                        i35 = i44;
                                        i34 = i34;
                                        i9 = i9;
                                        iSave = iSave;
                                        bitmapCreateBitmap = bitmapCreateBitmap;
                                    }
                                }
                                size3 = v500Var2.f36806a.size();
                                fArr = s500Var3.p;
                                if (size3 > 1) {
                                    length = fArr.length;
                                    i20 = i15 * 2;
                                    if (length <= i20) {
                                        s500Var3.p = new float[i15 * 4];
                                    }
                                    i21 = hu5Var.b;
                                    while (i21 <= hu5Var.d + hu5Var.b) {
                                        entryB6 = v500Var2.b(i21);
                                        if (entryB6 == null) {
                                            fArr2 = s500Var3.p;
                                            f9 = entryB6.c;
                                            fArr2[i8] = f9;
                                            f10 = entryB6.f45454a * f8;
                                            fArr2[1] = f10;
                                            if (i21 < hu5Var.c) {
                                                entryB7 = v500Var2.b(i21 + 1);
                                                if (entryB7 == null) {
                                                    break;
                                                }
                                                f12 = entryB7.c;
                                                fArr4 = s500Var3.p;
                                                if (i14 != 0) {
                                                    fArr4[2] = f12;
                                                    float f35 = fArr4[1];
                                                    fArr4[3] = f35;
                                                    fArr4[i25] = f12;
                                                    fArr4[5] = f35;
                                                    fArr4[6] = f12;
                                                    fArr4[7] = entryB7.f45454a * f8;
                                                    fArr2 = fArr4;
                                                    c = 2;
                                                } else {
                                                    c = 2;
                                                    fArr4[2] = f12;
                                                    fArr4[3] = entryB7.f45454a * f8;
                                                    fArr2 = fArr4;
                                                }
                                            } else {
                                                c = 2;
                                                fArr2[2] = f9;
                                                fArr2[3] = f10;
                                            }
                                            ywq0VarF3.x(fArr2);
                                            if (!xju0Var8.c(s500Var3.p[i8])) {
                                                break;
                                            }
                                            if (xju0Var8.b(s500Var3.p[c])) {
                                                fArr3 = s500Var3.p;
                                                f11 = fArr3[1];
                                                rectF5 = xju0Var8.b;
                                                if (rectF5.top <= f11) {
                                                    ArrayList arrayList8 = v500Var2.f36806a;
                                                    paint5.setColor(((Integer) arrayList8.get(i21 % arrayList8.size())).intValue());
                                                    canvas2.drawLines(s500Var3.p, i8, i20, paint5);
                                                } else if (rectF5.bottom >= ((int) (fArr3[3] * 100.0f)) / 100.0f) {
                                                    ArrayList arrayList9 = v500Var2.f36806a;
                                                    paint5.setColor(((Integer) arrayList9.get(i21 % arrayList9.size())).intValue());
                                                    canvas2.drawLines(s500Var3.p, i8, i20, paint5);
                                                }
                                            }
                                        }
                                        i21++;
                                        i8 = 0;
                                    }
                                } else {
                                    i16 = size2 * i15;
                                    if (fArr.length < Math.max(i16, i15) * 2) {
                                        s500Var3.p = new float[Math.max(i16, i15) * 4];
                                    }
                                    if (v500Var2.b(hu5Var.b) != null) {
                                        i18 = 0;
                                        while (i17 <= hu5Var.d + hu5Var.b) {
                                            if (i17 == 0) {
                                                i19 = 0;
                                            } else {
                                                i19 = i17 - 1;
                                            }
                                            entryB5 = v500Var2.b(i19);
                                            Entry entryB14 = v500Var2.b(i17);
                                            if (entryB5 == null && entryB14 != null) {
                                                float f36 = entryB14.c;
                                                float[] fArr7 = s500Var3.p;
                                                fArr7[i18] = entryB5.c;
                                                int i45 = i18 + 2;
                                                float f37 = entryB5.f45454a * f8;
                                                fArr7[i18 + 1] = f37;
                                                if (i14 != 0) {
                                                    fArr7[i45] = f36;
                                                    fArr7[i18 + 3] = f37;
                                                    fArr7[i18 + 4] = f36;
                                                    i45 = i18 + 6;
                                                    fArr7[i18 + 5] = f37;
                                                }
                                                fArr7[i45] = f36;
                                                fArr7[i45 + 1] = entryB14.f45454a * f8;
                                                i18 = i45 + 2;
                                            }
                                        }
                                        if (i18 > 0) {
                                            ywq0VarF3.x(s500Var3.p);
                                            int iMax2 = Math.max((hu5Var.d + 1) * i15, i15) * 2;
                                            paint5.setColor(((Integer) v500Var2.f36806a.get(0)).intValue());
                                            canvas2.drawLines(s500Var3.p, 0, iMax2, paint5);
                                        }
                                    }
                                }
                                pathEffect = null;
                                paint5.setPathEffect(null);
                            } else {
                                iSave = iSave;
                                rectF = rectF;
                                bitmapCreateBitmap = bitmapCreateBitmap;
                                lwbVar2.getClass();
                                ywq0VarF2 = finBetChartView3.f(v500Var2.d);
                                hu5Var.X(finBetChartView3, v500Var2);
                                path2.reset();
                                if (hu5Var.d >= 1) {
                                    entryB4 = v500Var2.b(hu5Var.b);
                                    path2.moveTo(entryB4.c, entryB4.f45454a * 1.0f);
                                    i13 = hu5Var.b + 1;
                                    while (i13 <= hu5Var.d + hu5Var.b) {
                                        Entry entryB15 = v500Var2.b(i13);
                                        float f38 = entryB4.c;
                                        float f39 = entryB15.c;
                                        float fZ2 = rw2.z(f39, f38, 2.0f, f38);
                                        float f310 = entryB4.f45454a * 1.0f;
                                        float f311 = entryB15.f45454a * 1.0f;
                                        Path path10 = path2;
                                        path10.cubicTo(fZ2, f310, fZ2, f311, f39, f311);
                                        i13++;
                                        path2 = path10;
                                        entryB4 = entryB15;
                                    }
                                }
                                path6 = path2;
                                if (v500Var2.A) {
                                    path3.reset();
                                    path3.addPath(path6);
                                    s500Var3.o1(s500Var3.l, v500Var2, path3, ywq0VarF2, s500Var3.g);
                                }
                                paint5.setColor(((Integer) v500Var2.f36806a.get(0)).intValue());
                                paint5.setStyle(Paint.Style.STROKE);
                                ywq0VarF2.u(path6);
                                s500Var3.l.drawPath(path6, paint5);
                                pathEffect = null;
                                paint5.setPathEffect(null);
                            }
                            paint5.setPathEffect(pathEffect);
                        }
                        jCurrentTimeMillis = j2;
                        it = it2;
                        xju0Var6 = xju0Var5;
                        rectF = rectF;
                        iSave = iSave;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i28 = 0;
                    } else {
                        xju0Var5 = xju0Var6;
                        j2 = jCurrentTimeMillis;
                        it2 = it;
                    }
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    jCurrentTimeMillis = j2;
                    it = it2;
                    xju0Var6 = xju0Var5;
                    rectF = rectF;
                    iSave = iSave;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    i28 = 0;
                }
                i2 = iSave;
                rectF2 = rectF;
                xju0Var2 = xju0Var6;
                j = jCurrentTimeMillis;
                f = 1.0f;
                canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint5);
            }
            eu5Var = this;
            eu5Var.i.getClass();
            eu5Var.v1.getClass();
            eu5Var.w1.getClass();
            vxvVarArr = eu5Var.y;
            if (vxvVarArr != null && vxvVarArr.length > 0 && vxvVarArr[0] != null) {
                s500Var2 = (s500) eu5Var.p;
                lwbVar = s500Var2.c;
                finBetChartView2 = s500Var2.i;
                lineData = finBetChartView2.getLineData();
                for (vxv vxvVar : vxvVarArr) {
                    v500Var = (v500) lineData.c(vxvVar.e);
                    if (v500Var != null) {
                        arrayList3 = v500Var.o;
                        if (v500Var.e && (entryC = v500Var.c(vxvVar.f38220a, vxvVar.b, 3)) != null) {
                            fIndexOf = arrayList3.indexOf(entryC);
                            size = arrayList3.size();
                            lwbVar.getClass();
                            if (fIndexOf >= size * f) {
                                ywq0 ywq0VarF4 = finBetChartView2.f(v500Var.d);
                                float f40 = entryC.c;
                                float f41 = entryC.f45454a * f;
                                float[] fArr8 = (float[]) ywq0VarF4.f;
                                fArr8[0] = f40;
                                fArr8[1] = f41;
                                ywq0VarF4.x(fArr8);
                                double d = fArr8[0];
                                double d2 = fArr8[1];
                                bp10 bp10Var = (bp10) bp10.d.b();
                                bp10Var.b = d;
                                bp10Var.c = d2;
                                f5 = (float) d;
                                f6 = (float) d2;
                                xju0Var4 = (xju0) s500Var2.b;
                                path = s500Var2.h;
                                paint3 = s500Var2.e;
                                paint3.setColor(v500Var.t);
                                paint3.setStrokeWidth(v500Var.w);
                                paint3.setPathEffect(null);
                                if (v500Var.u) {
                                    path.reset();
                                    path.moveTo(f5, xju0Var4.b.top);
                                    path.lineTo(f5, xju0Var4.b.bottom);
                                    canvas2.drawPath(path, paint3);
                                }
                                if (v500Var.v) {
                                    path.reset();
                                    path.moveTo(xju0Var4.b.left, f6);
                                    path.lineTo(xju0Var4.b.right, f6);
                                    canvas2.drawPath(path, paint3);
                                }
                            }
                        }
                    }
                }
            }
            canvas2.restoreToCount(i2);
            s500Var = (s500) eu5Var.p;
            hu5 hu5Var2 = s500Var.g;
            xju0 xju0Var9 = (xju0) s500Var.b;
            map = s500Var.r;
            s500Var.d.setStyle(Paint.Style.FILL);
            s500Var.c.getClass();
            float[] fArr9 = s500Var.s;
            fArr9[0] = 0.0f;
            fArr9[1] = 0.0f;
            finBetChartView = s500Var.i;
            arrayList = finBetChartView.getLineData().i;
            i3 = 0;
            while (i3 < arrayList.size()) {
                v500 v500Var4 = (v500) arrayList.get(i3);
                z = v500Var4.n;
                ArrayList arrayList10 = v500Var4.C;
                float f42 = v500Var4.F;
                float f43 = v500Var4.E;
                int i46 = v500Var4.D;
                if (z || !v500Var4.I || v500Var4.o.size() == 0) {
                    arrayList = arrayList;
                    canvas4 = canvas2;
                } else {
                    s500Var.j.setColor(i46);
                    ywq0 ywq0VarF5 = finBetChartView.f(v500Var4.d);
                    hu5Var2.X(finBetChartView, v500Var4);
                    boolean z5 = v500Var4.J && f42 < f43 && f42 > 0.0f;
                    boolean z6 = z5;
                    boolean z7 = z5 && i46 == 1122867;
                    if (map.containsKey(v500Var4)) {
                        r500Var = (r500) map.get(v500Var4);
                    } else {
                        r500Var = new r500(s500Var);
                        map.put(v500Var4, r500Var);
                    }
                    r500Var.getClass();
                    int size4 = arrayList10.size();
                    Bitmap[] bitmapArr = r500Var.b;
                    if (bitmapArr == null) {
                        r500Var.b = new Bitmap[size4];
                    } else {
                        if (bitmapArr.length != size4) {
                            r500Var.b = new Bitmap[size4];
                        }
                        int i47 = hu5Var2.d;
                        i5 = hu5Var2.b;
                        i6 = i47 + i5;
                        while (i5 <= i6) {
                            entryB = v500Var4.b(i5);
                            if (entryB == null) {
                                break;
                            }
                            fArr9[0] = entryB.c;
                            fArr9[1] = entryB.f45454a * f;
                            ywq0VarF5.x(fArr9);
                            if (!xju0Var9.c(fArr9[0])) {
                                break;
                            }
                            if (xju0Var9.b(fArr9[0])) {
                                f4 = fArr9[1];
                                rectF4 = xju0Var9.b;
                                if (rectF4.top <= f4) {
                                    if (rectF4.bottom >= ((int) (f4 * 100.0f)) / 100.0f) {
                                        Bitmap[] bitmapArr2 = r500Var.b;
                                        bitmap = bitmapArr2[i5 % bitmapArr2.length];
                                        if (bitmap != null) {
                                            canvas.drawBitmap(bitmap, fArr9[0] - f43, f4 - f43, (Paint) null);
                                        }
                                    }
                                }
                            }
                            i5++;
                        }
                        canvas4 = canvas;
                    }
                    Path path11 = r500Var.f29862a;
                    s500 s500Var4 = r500Var.c;
                    boolean z8 = z7;
                    int size5 = arrayList10.size();
                    int i48 = 0;
                    while (i48 < size5) {
                        int i49 = size5;
                        int i50 = (int) (((double) f43) * 2.1d);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i50, i50, Bitmap.Config.ARGB_4444);
                        Canvas canvas5 = new Canvas(bitmapCreateBitmap2);
                        r500Var.b[i48] = bitmapCreateBitmap2;
                        Paint paint6 = s500Var4.d;
                        paint6.setColor(((Integer) arrayList10.get(i48)).intValue());
                        if (z8) {
                            path11.reset();
                            path11.addCircle(f43, f43, f43, Path.Direction.CW);
                            path11.addCircle(f43, f43, f42, Path.Direction.CCW);
                            canvas5.drawPath(path11, paint6);
                        } else {
                            canvas5.drawCircle(f43, f43, f43, paint6);
                            if (z6) {
                                canvas5.drawCircle(f43, f43, f42, s500Var4.j);
                            }
                        }
                        i48++;
                        size5 = i49;
                    }
                    int i410 = hu5Var2.d;
                    i5 = hu5Var2.b;
                    i6 = i410 + i5;
                    while (i5 <= i6) {
                        entryB = v500Var4.b(i5);
                        if (entryB == null) {
                            break;
                            break;
                        }
                        fArr9[0] = entryB.c;
                        fArr9[1] = entryB.f45454a * f;
                        ywq0VarF5.x(fArr9);
                        if (!xju0Var9.c(fArr9[0])) {
                            break;
                            break;
                        }
                        if (xju0Var9.b(fArr9[0])) {
                            f4 = fArr9[1];
                            rectF4 = xju0Var9.b;
                            if (rectF4.top <= f4) {
                                if (rectF4.bottom >= ((int) (f4 * 100.0f)) / 100.0f) {
                                    Bitmap[] bitmapArr3 = r500Var.b;
                                    bitmap = bitmapArr3[i5 % bitmapArr3.length];
                                    if (bitmap != null) {
                                        canvas.drawBitmap(bitmap, fArr9[0] - f43, f4 - f43, (Paint) null);
                                    }
                                }
                            }
                        }
                        i5++;
                    }
                    canvas4 = canvas;
                }
                i3++;
                eu5Var = this;
                canvas2 = canvas4;
                finBetChartView = finBetChartView;
                s500Var = s500Var;
                map = map;
                arrayList = arrayList;
            }
            canvas3 = canvas2;
            if (eu5Var.i.f4306a) {
                vrv0Var3 = eu5Var.B1;
                arrayList2 = vrv0Var3.h.p;
                if (arrayList2.size() > 0) {
                    float[] fArr10 = vrv0Var3.l;
                    fArr10[0] = 0.0f;
                    fArr10[1] = 0.0f;
                    if (arrayList2.size() > 0) {
                        arrayList2.get(0).getClass();
                        hny.b();
                        return;
                    }
                }
            }
            if (eu5Var.v1.f4306a) {
                eu5Var.x1.t1();
            }
            if (eu5Var.w1.f4306a) {
                eu5Var.y1.t1();
            }
            vrv0Var2 = eu5Var.B1;
            paint2 = vrv0Var2.f;
            xju0Var3 = (xju0) vrv0Var2.b;
            urv0Var2 = vrv0Var2.h;
            if (urv0Var2.f4306a && urv0Var2.n) {
                f2 = urv0Var2.c;
                paint2.setTypeface(null);
                paint2.setTextSize(urv0Var2.d);
                paint2.setColor(urv0Var2.e);
                cp10VarB = cp10.b(0.0f, 0.0f);
                i4 = urv0Var2.x;
                if (i4 == 1) {
                    cp10VarB.b = 0.5f;
                    cp10VarB.c = f;
                    vrv0Var2.p1(canvas3, xju0Var3.b.top - f2, cp10VarB);
                } else {
                    f3 = f;
                    if (i4 == i25) {
                        cp10VarB.b = 0.5f;
                        cp10VarB.c = f3;
                        vrv0Var2.p1(canvas3, xju0Var3.b.top + f2 + urv0Var2.v, cp10VarB);
                    } else if (i4 == 2) {
                        cp10VarB.b = 0.5f;
                        cp10VarB.c = 0.0f;
                        vrv0Var2.p1(canvas3, xju0Var3.b.bottom + f2, cp10VarB);
                    } else if (i4 == 5) {
                        cp10VarB.b = 0.5f;
                        cp10VarB.c = 0.0f;
                        vrv0Var2.p1(canvas3, (xju0Var3.b.bottom - f2) - urv0Var2.v, cp10VarB);
                    } else {
                        cp10VarB.b = 0.5f;
                        cp10VarB.c = 1.0f;
                        vrv0Var2.p1(canvas3, xju0Var3.b.top - f2, cp10VarB);
                        cp10VarB.b = 0.5f;
                        cp10VarB.c = 0.0f;
                        vrv0Var2.p1(canvas3, xju0Var3.b.bottom + f2, cp10VarB);
                    }
                }
                cp10.d.c(cp10VarB);
            }
            eu5Var.x1.q1(canvas3);
            eu5Var.y1.q1(canvas3);
            if (eu5Var.s1) {
                int iSave4 = canvas3.save();
                rectF3 = rectF2;
                canvas3.clipRect(rectF3);
                eu5Var.p.n1(canvas3);
                canvas3.restoreToCount(iSave4);
            } else {
                rectF3 = rectF2;
                eu5Var.p.n1(canvas3);
            }
            eu5Var.o.o1(canvas3);
            bckVar = eu5Var.k;
            if (bckVar != null && bckVar.f4306a) {
                eu5Var.g.setTypeface(null);
                eu5Var.g.setTextSize(eu5Var.k.d);
                eu5Var.g.setColor(eu5Var.k.e);
                eu5Var.g.setTextAlign(eu5Var.k.g);
                xju0 xju0Var10 = xju0Var2;
                float width = (eu5Var.getWidth() - (xju0Var10.c - rectF3.right)) - eu5Var.k.b;
                float height = eu5Var.getHeight() - (xju0Var10.d - rectF3.bottom);
                bck bckVar2 = eu5Var.k;
                canvas3.drawText(bckVar2.f, width, height - bckVar2.c, eu5Var.g);
            }
            if (eu5Var.f18993a) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                long j3 = eu5Var.C1 + jCurrentTimeMillis2;
                eu5Var.C1 = j3;
                long j4 = eu5Var.D1 + 1;
                eu5Var.D1 = j4;
                StringBuilder sbQ = kng0.q(jCurrentTimeMillis2, "Drawtime: ", " ms, average: ");
                sbQ.append(j3 / j4);
                sbQ.append(" ms, cycles: ");
                sbQ.append(eu5Var.D1);
                Log.i("MPAndroidChart", sbQ.toString());
            }
        }
        i25 = 4;
        canvas2 = canvas;
        this.x1.r1(canvas2);
        this.y1.r1(canvas2);
        this.i.getClass();
        vrv0Var = this.B1;
        paint = vrv0Var.e;
        wa5Var = vrv0Var.c;
        xju0Var = (xju0) vrv0Var.b;
        urv0Var = vrv0Var.h;
        urv0Var.getClass();
        int i210 = 0;
        if (urv0Var.f4306a) {
            int iSave5 = canvas2.save();
            RectF rectF12 = vrv0Var.k;
            RectF rectF13 = xju0Var.b;
            rectF6 = xju0Var.b;
            rectF12.set(rectF13);
            rectF12.inset(-wa5Var.h, 0.0f);
            canvas2.clipRect(rectF12);
            fArr5 = vrv0Var.j;
            if (fArr5.length != wa5Var.j * 2) {
                fArr5 = new float[urv0Var.j * 2];
                vrv0Var.j = fArr5;
            }
            while (i22 < fArr5.length) {
                float[] fArr11 = urv0Var.i;
                int i211 = i22 / 2;
                fArr5[i22] = fArr11[i211];
                fArr5[i22 + 1] = fArr11[i211];
            }
            vrv0Var.d.x(fArr5);
            paint.setColor(urv0Var.g);
            paint.setStrokeWidth(urv0Var.h);
            paint.setPathEffect(urv0Var.o);
            path7 = vrv0Var.i;
            path7.reset();
            while (i23 < fArr5.length) {
                float f110 = fArr5[i23];
                float f219 = fArr5[i23 + 1];
                path7.moveTo(f110, rectF6.bottom);
                path7.lineTo(f110, rectF6.top);
                canvas2.drawPath(path7, paint);
                path7.reset();
            }
            canvas2.restoreToCount(iSave5);
        }
        this.v1.getClass();
        this.x1.s1(canvas2);
        this.w1.getClass();
        this.y1.s1(canvas2);
        boolean z9 = this.i.f4306a;
        boolean z10 = this.v1.f4306a;
        boolean z11 = this.w1.f4306a;
        iSave = canvas2.save();
        RectF rectF14 = xju0Var6.b;
        rectF = xju0Var6.b;
        canvas2.clipRect(rectF14);
        s500 s500Var5 = (s500) this.p;
        Paint paint7 = s500Var5.d;
        FinBetChartView finBetChartView4 = s500Var5.i;
        xju0 xju0Var11 = (xju0) s500Var5.b;
        i = (int) xju0Var11.c;
        int i310 = (int) xju0Var11.d;
        weakReference = s500Var5.k;
        if (weakReference == null) {
            bitmapCreateBitmap = null;
        } else {
            bitmapCreateBitmap = (Bitmap) weakReference.get();
        }
        if (bitmapCreateBitmap == null) {
            if (i > 0) {
            }
            i2 = iSave;
            rectF2 = rectF;
            xju0Var2 = xju0Var6;
            j = jCurrentTimeMillis;
            f = 1.0f;
        } else {
            if (i > 0) {
            }
            i2 = iSave;
            rectF2 = rectF;
            xju0Var2 = xju0Var6;
            j = jCurrentTimeMillis;
            f = 1.0f;
        }
        eu5Var = this;
        eu5Var.i.getClass();
        eu5Var.v1.getClass();
        eu5Var.w1.getClass();
        vxvVarArr = eu5Var.y;
        if (vxvVarArr != null) {
            s500Var2 = (s500) eu5Var.p;
            lwbVar = s500Var2.c;
            finBetChartView2 = s500Var2.i;
            lineData = finBetChartView2.getLineData();
            while (i7 < r7) {
                v500Var = (v500) lineData.c(vxvVar.e);
                if (v500Var != null) {
                    arrayList3 = v500Var.o;
                    if (v500Var.e) {
                        fIndexOf = arrayList3.indexOf(entryC);
                        size = arrayList3.size();
                        lwbVar.getClass();
                        if (fIndexOf >= size * f) {
                            ywq0 ywq0VarF6 = finBetChartView2.f(v500Var.d);
                            float f44 = entryC.c;
                            float f45 = entryC.f45454a * f;
                            float[] fArr12 = (float[]) ywq0VarF6.f;
                            fArr12[0] = f44;
                            fArr12[1] = f45;
                            ywq0VarF6.x(fArr12);
                            double d3 = fArr12[0];
                            double d4 = fArr12[1];
                            bp10 bp10Var2 = (bp10) bp10.d.b();
                            bp10Var2.b = d3;
                            bp10Var2.c = d4;
                            f5 = (float) d3;
                            f6 = (float) d4;
                            xju0Var4 = (xju0) s500Var2.b;
                            path = s500Var2.h;
                            paint3 = s500Var2.e;
                            paint3.setColor(v500Var.t);
                            paint3.setStrokeWidth(v500Var.w);
                            paint3.setPathEffect(null);
                            if (v500Var.u) {
                                path.reset();
                                path.moveTo(f5, xju0Var4.b.top);
                                path.lineTo(f5, xju0Var4.b.bottom);
                                canvas2.drawPath(path, paint3);
                            }
                            if (v500Var.v) {
                                path.reset();
                                path.moveTo(xju0Var4.b.left, f6);
                                path.lineTo(xju0Var4.b.right, f6);
                                canvas2.drawPath(path, paint3);
                            }
                        }
                    }
                }
            }
        }
        canvas2.restoreToCount(i2);
        s500Var = (s500) eu5Var.p;
        hu5 hu5Var3 = s500Var.g;
        xju0 xju0Var12 = (xju0) s500Var.b;
        map = s500Var.r;
        s500Var.d.setStyle(Paint.Style.FILL);
        s500Var.c.getClass();
        float[] fArr13 = s500Var.s;
        fArr13[0] = 0.0f;
        fArr13[1] = 0.0f;
        finBetChartView = s500Var.i;
        arrayList = finBetChartView.getLineData().i;
        i3 = 0;
        while (i3 < arrayList.size()) {
            v500 v500Var5 = (v500) arrayList.get(i3);
            z = v500Var5.n;
            ArrayList arrayList11 = v500Var5.C;
            float f46 = v500Var5.F;
            float f47 = v500Var5.E;
            int i411 = v500Var5.D;
            if (z) {
                arrayList = arrayList;
                canvas4 = canvas2;
            } else {
                arrayList = arrayList;
                canvas4 = canvas2;
            }
            i3++;
            eu5Var = this;
            canvas2 = canvas4;
            finBetChartView = finBetChartView;
            s500Var = s500Var;
            map = map;
            arrayList = arrayList;
        }
        canvas3 = canvas2;
        if (eu5Var.i.f4306a) {
            vrv0Var3 = eu5Var.B1;
            arrayList2 = vrv0Var3.h.p;
            if (arrayList2.size() > 0) {
                float[] fArr14 = vrv0Var3.l;
                fArr14[0] = 0.0f;
                fArr14[1] = 0.0f;
                if (arrayList2.size() > 0) {
                    arrayList2.get(0).getClass();
                    hny.b();
                    return;
                }
            }
        }
        if (eu5Var.v1.f4306a) {
            eu5Var.x1.t1();
        }
        if (eu5Var.w1.f4306a) {
            eu5Var.y1.t1();
        }
        vrv0Var2 = eu5Var.B1;
        paint2 = vrv0Var2.f;
        xju0Var3 = (xju0) vrv0Var2.b;
        urv0Var2 = vrv0Var2.h;
        if (urv0Var2.f4306a) {
            f2 = urv0Var2.c;
            paint2.setTypeface(null);
            paint2.setTextSize(urv0Var2.d);
            paint2.setColor(urv0Var2.e);
            cp10VarB = cp10.b(0.0f, 0.0f);
            i4 = urv0Var2.x;
            if (i4 == 1) {
                cp10VarB.b = 0.5f;
                cp10VarB.c = f;
                vrv0Var2.p1(canvas3, xju0Var3.b.top - f2, cp10VarB);
            } else {
                f3 = f;
                if (i4 == i25) {
                    cp10VarB.b = 0.5f;
                    cp10VarB.c = f3;
                    vrv0Var2.p1(canvas3, xju0Var3.b.top + f2 + urv0Var2.v, cp10VarB);
                } else if (i4 == 2) {
                    cp10VarB.b = 0.5f;
                    cp10VarB.c = 0.0f;
                    vrv0Var2.p1(canvas3, xju0Var3.b.bottom + f2, cp10VarB);
                } else if (i4 == 5) {
                    cp10VarB.b = 0.5f;
                    cp10VarB.c = 0.0f;
                    vrv0Var2.p1(canvas3, (xju0Var3.b.bottom - f2) - urv0Var2.v, cp10VarB);
                } else {
                    cp10VarB.b = 0.5f;
                    cp10VarB.c = 1.0f;
                    vrv0Var2.p1(canvas3, xju0Var3.b.top - f2, cp10VarB);
                    cp10VarB.b = 0.5f;
                    cp10VarB.c = 0.0f;
                    vrv0Var2.p1(canvas3, xju0Var3.b.bottom + f2, cp10VarB);
                }
            }
            cp10.d.c(cp10VarB);
        }
        eu5Var.x1.q1(canvas3);
        eu5Var.y1.q1(canvas3);
        if (eu5Var.s1) {
            int iSave6 = canvas3.save();
            rectF3 = rectF2;
            canvas3.clipRect(rectF3);
            eu5Var.p.n1(canvas3);
            canvas3.restoreToCount(iSave6);
        } else {
            rectF3 = rectF2;
            eu5Var.p.n1(canvas3);
        }
        eu5Var.o.o1(canvas3);
        bckVar = eu5Var.k;
        if (bckVar != null) {
            eu5Var.g.setTypeface(null);
            eu5Var.g.setTextSize(eu5Var.k.d);
            eu5Var.g.setColor(eu5Var.k.e);
            eu5Var.g.setTextAlign(eu5Var.k.g);
            xju0 xju0Var13 = xju0Var2;
            float width2 = (eu5Var.getWidth() - (xju0Var13.c - rectF3.right)) - eu5Var.k.b;
            float height2 = eu5Var.getHeight() - (xju0Var13.d - rectF3.bottom);
            bck bckVar3 = eu5Var.k;
            canvas3.drawText(bckVar3.f, width2, height2 - bckVar3.c, eu5Var.g);
        }
        if (eu5Var.f18993a) {
            long jCurrentTimeMillis3 = System.currentTimeMillis() - j;
            long j5 = eu5Var.C1 + jCurrentTimeMillis3;
            eu5Var.C1 = j5;
            long j6 = eu5Var.D1 + 1;
            eu5Var.D1 = j6;
            StringBuilder sbQ2 = kng0.q(jCurrentTimeMillis3, "Drawtime: ", " ms, average: ");
            sbQ2.append(j5 / j6);
            sbQ2.append(" ms, cycles: ");
            sbQ2.append(eu5Var.D1);
            Log.i("MPAndroidChart", sbQ2.toString());
        }
    }

    @Override // a.kwb, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        xju0 xju0Var = this.r;
        float[] fArr = this.J1;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.u1) {
            RectF rectF = xju0Var.b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            this.z1.w(fArr);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.u1) {
            xju0Var.e(xju0Var.f41005a, this, true);
        } else {
            this.z1.x(fArr);
            xju0Var.a(this, fArr);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        ywb ywbVar = this.m;
        if (ywbVar == null || this.b == null || !this.j) {
            return false;
        }
        return ((fu5) ywbVar).onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.g1 = z;
    }

    public void setBorderColor(int i) {
        this.p1.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.p1.setStrokeWidth(dut0.c(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.s1 = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.i1 = z;
    }

    public void setDragEnabled(boolean z) {
        this.k1 = z;
        this.l1 = z;
    }

    public void setDragOffsetX(float f) {
        xju0 xju0Var = this.r;
        xju0Var.getClass();
        xju0Var.j = dut0.c(f);
    }

    public void setDragOffsetY(float f) {
        xju0 xju0Var = this.r;
        xju0Var.getClass();
        xju0Var.k = dut0.c(f);
    }

    public void setDragXEnabled(boolean z) {
        this.k1 = z;
    }

    public void setDragYEnabled(boolean z) {
        this.l1 = z;
    }

    public void setDrawBorders(boolean z) {
        this.r1 = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.q1 = z;
    }

    public void setGridBackgroundColor(int i) {
        this.o1.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.j1 = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.u1 = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.f1 = i;
    }

    public void setMinOffset(float f) {
        this.t1 = f;
    }

    public void setPinchZoom(boolean z) {
        this.h1 = z;
    }

    public void setRendererLeftYAxis(b2w0 b2w0Var) {
        this.x1 = b2w0Var;
    }

    public void setRendererRightYAxis(b2w0 b2w0Var) {
        this.y1 = b2w0Var;
    }

    public void setScaleEnabled(boolean z) {
        this.m1 = z;
        this.n1 = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.m1 = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.n1 = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.i.u / f;
        xju0 xju0Var = this.r;
        xju0Var.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        xju0Var.e = f2;
        xju0Var.d(xju0Var.f41005a, xju0Var.b);
    }

    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.i.u / f;
        xju0 xju0Var = this.r;
        xju0Var.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        xju0Var.f = f2;
        xju0Var.d(xju0Var.f41005a, xju0Var.b);
    }

    public void setXAxisRenderer(vrv0 vrv0Var) {
        this.B1 = vrv0Var;
    }

    public void setOnDrawListener(ch60 ch60Var) {
    }
}
