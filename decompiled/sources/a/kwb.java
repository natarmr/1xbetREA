package a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetChartView;

/* JADX INFO: loaded from: classes.dex */
public abstract class kwb extends ViewGroup implements pwb {
    public ArrayList A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18993a;
    public mwb b;
    public boolean c;
    public boolean d;
    public float e;
    public zyj f;
    public Paint g;
    public Paint h;
    public urv0 i;
    public boolean j;
    public bck k;
    public vjz l;
    public ywb m;
    public String n;
    public xjz o;
    public cbj p;
    public owb q;
    public xju0 r;
    public lwb s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public vxv[] y;
    public float z;

    public static void e(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                e(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public abstract void a();

    public final vxv b(float f, float f2) {
        FinBetChartView finBetChartView;
        vxv vxvVar;
        float f3;
        gu5 gu5Var;
        Entry entryC;
        vxv vxvVar2 = null;
        if (this.b == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        owb owbVar = (owb) getHighlighter();
        FinBetChartView finBetChartView2 = owbVar.f25961a;
        ywq0 ywq0Var = finBetChartView2.z1;
        ywq0Var.getClass();
        z960 z960Var = bp10.d;
        bp10 bp10Var = (bp10) z960Var.b();
        bp10Var.b = 0.0d;
        bp10Var.c = 0.0d;
        ywq0Var.n(f, f2, bp10Var);
        float f4 = (float) bp10Var.b;
        z960Var.c(bp10Var);
        ArrayList arrayList = owbVar.b;
        arrayList.clear();
        gu5 data = finBetChartView2.getData();
        if (data != null) {
            ArrayList arrayList2 = data.i;
            int size = arrayList2 == null ? 0 : arrayList2.size();
            int i = 0;
            while (i < size) {
                iuw iuwVarC = data.c(i);
                if (((v500) iuwVarC).e) {
                    ArrayList arrayList3 = new ArrayList();
                    v500 v500Var = (v500) iuwVarC;
                    ArrayList<Entry> arrayListA = v500Var.a(f4);
                    if (arrayListA.size() == 0 && (entryC = v500Var.c(f4, Float.NaN, 3)) != null) {
                        arrayListA = v500Var.a(entryC.c);
                    }
                    if (arrayListA.size() != 0) {
                        for (Entry entry : arrayListA) {
                            ywq0 ywq0VarF = finBetChartView2.f(v500Var.d);
                            vxv vxvVar3 = vxvVar2;
                            float f5 = entry.c;
                            float f6 = entry.f45454a;
                            float[] fArr = (float[]) ywq0VarF.f;
                            fArr[0] = f5;
                            fArr[1] = f6;
                            ywq0VarF.x(fArr);
                            FinBetChartView finBetChartView3 = finBetChartView2;
                            double d = fArr[0];
                            float f7 = f4;
                            double d2 = fArr[1];
                            bp10 bp10Var2 = (bp10) bp10.d.b();
                            bp10Var2.b = d;
                            bp10Var2.c = d2;
                            float f8 = entry.c;
                            float f9 = entry.f45454a;
                            float f10 = (float) d2;
                            int i2 = v500Var.d;
                            vxv vxvVar4 = new vxv();
                            vxvVar4.f38220a = f8;
                            vxvVar4.b = f9;
                            vxvVar4.c = (float) d;
                            vxvVar4.d = f10;
                            vxvVar4.e = i;
                            vxvVar4.f = i2;
                            arrayList3.add(vxvVar4);
                            finBetChartView2 = finBetChartView3;
                            f4 = f7;
                            vxvVar2 = vxvVar3;
                            data = data;
                        }
                    }
                    finBetChartView = finBetChartView2;
                    vxvVar = vxvVar2;
                    f3 = f4;
                    gu5Var = data;
                    arrayList.addAll(arrayList3);
                } else {
                    finBetChartView = finBetChartView2;
                    vxvVar = vxvVar2;
                    f3 = f4;
                    gu5Var = data;
                }
                i++;
                finBetChartView2 = finBetChartView;
                f4 = f3;
                vxvVar2 = vxvVar;
                data = gu5Var;
            }
        }
        FinBetChartView finBetChartView4 = finBetChartView2;
        vxv vxvVar5 = vxvVar2;
        if (arrayList.isEmpty()) {
            return vxvVar5;
        }
        int i3 = owb.a(arrayList, f2, 1) < owb.a(arrayList, f2, 2) ? 1 : 2;
        float maxHighlightDistance = finBetChartView4.getMaxHighlightDistance();
        vxv vxvVar6 = vxvVar5;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            vxv vxvVar7 = (vxv) arrayList.get(i4);
            if (vxvVar7.f == i3) {
                float fHypot = (float) Math.hypot(f - vxvVar7.c, f2 - vxvVar7.d);
                if (fHypot < maxHighlightDistance) {
                    vxvVar6 = vxvVar7;
                    maxHighlightDistance = fHypot;
                }
            }
        }
        return vxvVar6;
    }

    public final void c(vxv vxvVar) {
        Entry entryC;
        vxv[] vxvVarArr = null;
        if (vxvVar == null) {
            this.y = null;
        } else {
            int i = vxvVar.e;
            if (this.f18993a) {
                Log.i("MPAndroidChart", "Highlighted: ".concat(vxvVar.toString()));
            }
            mwb mwbVar = this.b;
            mwbVar.getClass();
            ArrayList arrayList = mwbVar.i;
            if (i >= arrayList.size()) {
                entryC = null;
            } else {
                entryC = ((v500) ((iuw) arrayList.get(i))).c(vxvVar.f38220a, vxvVar.b, 3);
            }
            if (entryC == null) {
                this.y = null;
            } else {
                vxvVarArr = new vxv[]{vxvVar};
                this.y = vxvVarArr;
            }
        }
        setLastHighlighted(vxvVarArr);
        invalidate();
    }

    public abstract void d();

    public lwb getAnimator() {
        return this.s;
    }

    public cp10 getCenter() {
        return cp10.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public cp10 getCenterOfView() {
        return getCenter();
    }

    public cp10 getCenterOffsets() {
        RectF rectF = this.r.b;
        return cp10.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    public RectF getContentRect() {
        return this.r.b;
    }

    public mwb getData() {
        return this.b;
    }

    public e3u0 getDefaultValueFormatter() {
        return this.f;
    }

    public bck getDescription() {
        return this.k;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.e;
    }

    public float getExtraBottomOffset() {
        return this.v;
    }

    public float getExtraLeftOffset() {
        return this.w;
    }

    public float getExtraRightOffset() {
        return this.u;
    }

    public float getExtraTopOffset() {
        return this.t;
    }

    public vxv[] getHighlighted() {
        return this.y;
    }

    public ruw getHighlighter() {
        return this.q;
    }

    public ArrayList<Runnable> getJobs() {
        return this.A;
    }

    public vjz getLegend() {
        return this.l;
    }

    public xjz getLegendRenderer() {
        return this.o;
    }

    public wuw getMarker() {
        return null;
    }

    @Deprecated
    public wuw getMarkerView() {
        getMarker();
        return null;
    }

    @Override // a.pwb
    public float getMaxHighlightDistance() {
        return this.z;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public mg60 getOnChartGestureListener() {
        return null;
    }

    public ywb getOnTouchListener() {
        return this.m;
    }

    public cbj getRenderer() {
        return this.p;
    }

    public xju0 getViewPortHandler() {
        return this.r;
    }

    public urv0 getXAxis() {
        return this.i;
    }

    public float getXChartMax() {
        return this.i.s;
    }

    public float getXChartMin() {
        return this.i.t;
    }

    public float getXRange() {
        return this.i.u;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.b.f22495a;
    }

    public float getYMin() {
        return this.b.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.B) {
            e(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.b == null) {
            if (TextUtils.isEmpty(this.n)) {
                return;
            }
            cp10 center = getCenter();
            canvas.drawText(this.n, center.b, center.c, this.h);
            return;
        }
        if (this.x) {
            return;
        }
        a();
        this.x = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iC = (int) dut0.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iC, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iC, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.A;
        if (this.f18993a) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            if (this.f18993a) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i + ", height: " + i2);
            }
            xju0 xju0Var = this.r;
            float f = i;
            float f2 = i2;
            RectF rectF = xju0Var.b;
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = xju0Var.c - rectF.right;
            float f6 = xju0Var.d - rectF.bottom;
            xju0Var.d = f2;
            xju0Var.c = f;
            rectF.set(f3, f4, f - f5, f2 - f6);
        } else if (this.f18993a) {
            Log.w("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + i + ", height: " + i2);
        }
        d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            post((Runnable) it.next());
        }
        arrayList.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(mwb mwbVar) {
        zyj zyjVar = this.f;
        this.b = mwbVar;
        this.x = false;
        if (mwbVar == null) {
            return;
        }
        float f = mwbVar.b;
        float f2 = mwbVar.f22495a;
        float fD = dut0.d(mwbVar.d() < 2 ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f));
        zyjVar.b(Float.isInfinite(fD) ? 0 : ((int) Math.ceil(-Math.log10(fD))) + 2);
        Iterator it = this.b.i.iterator();
        while (it.hasNext()) {
            v500 v500Var = (v500) ((iuw) it.next());
            Object obj = v500Var.f;
            if (obj != null) {
                if (obj == null) {
                    obj = dut0.g;
                }
                if (obj == zyjVar) {
                }
            }
            v500Var.f = zyjVar;
        }
        d();
        if (this.f18993a) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(bck bckVar) {
        this.k = bckVar;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.d = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.e = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setExtraBottomOffset(float f) {
        this.v = dut0.c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.w = dut0.c(f);
    }

    public void setExtraRightOffset(float f) {
        this.u = dut0.c(f);
    }

    public void setExtraTopOffset(float f) {
        this.t = dut0.c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.c = z;
    }

    public void setHighlighter(owb owbVar) {
        this.q = owbVar;
    }

    public void setLastHighlighted(vxv[] vxvVarArr) {
        vxv vxvVar;
        if (vxvVarArr == null || vxvVarArr.length <= 0 || (vxvVar = vxvVarArr[0]) == null) {
            this.m.b = null;
        } else {
            this.m.b = vxvVar;
        }
    }

    public void setLogEnabled(boolean z) {
        this.f18993a = z;
    }

    @Deprecated
    public void setMarkerView(wuw wuwVar) {
        setMarker(wuwVar);
    }

    public void setMaxHighlightDistance(float f) {
        this.z = dut0.c(f);
    }

    public void setNoDataText(String str) {
        this.n = str;
    }

    public void setNoDataTextColor(int i) {
        this.h.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public void setOnTouchListener(ywb ywbVar) {
        this.m = ywbVar;
    }

    public void setRenderer(cbj cbjVar) {
        if (cbjVar != null) {
            this.p = cbjVar;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.j = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.B = z;
    }

    public void setDrawMarkers(boolean z) {
    }

    public void setMarker(wuw wuwVar) {
    }

    public void setOnChartGestureListener(mg60 mg60Var) {
    }

    public void setOnChartValueSelectedListener(ng60 ng60Var) {
    }
}
