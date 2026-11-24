package org.xplatform.feature.fin_bet.impl.presentation.view;

import a.a2w0;
import a.b2w0;
import a.bck;
import a.bp10;
import a.cp10;
import a.du5;
import a.dut0;
import a.fu5;
import a.hu5;
import a.i120;
import a.j5d;
import a.lwb;
import a.maz;
import a.n0o0;
import a.owb;
import a.q500;
import a.rdj;
import a.ryl;
import a.s500;
import a.s8q;
import a.u500;
import a.urv0;
import a.vjz;
import a.vrv0;
import a.wjz;
import a.xju0;
import a.xjz;
import a.ykq0;
import a.ywq0;
import a.z960;
import a.znq0;
import a.zwb;
import a.zyj;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class FinBetChartView extends q500 {
    public static final /* synthetic */ int Y1 = 0;
    public final n0o0 K1;
    public final n0o0 L1;
    public final n0o0 M1;
    public float N1;
    public float O1;
    public final PointF P1;
    public final PointF Q1;
    public final RectF R1;
    public final RectF S1;
    public final RectF U1;
    public zwb V1;
    public float W1;
    public final n0o0 X1;

    /* JADX WARN: Illegal instructions before constructor call */
    public FinBetChartView(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        byte b = 0;
        super(context, attributeSet2, 0);
        this.f18993a = false;
        this.b = null;
        this.c = true;
        this.d = true;
        this.e = 0.9f;
        this.f = new zyj(0);
        this.j = true;
        this.n = "No chart data available.";
        xju0 xju0Var = new xju0();
        this.r = xju0Var;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = false;
        this.z = 0.0f;
        this.A = new ArrayList();
        this.B = false;
        setWillNotDraw(false);
        this.s = new lwb();
        Context context2 = getContext();
        DisplayMetrics displayMetrics = dut0.f6713a;
        if (context2 == null) {
            dut0.b = ViewConfiguration.getMinimumFlingVelocity();
            dut0.c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
            dut0.b = viewConfiguration.getScaledMinimumFlingVelocity();
            dut0.c = viewConfiguration.getScaledMaximumFlingVelocity();
            dut0.f6713a = context2.getResources().getDisplayMetrics();
        }
        this.z = dut0.c(500.0f);
        bck bckVar = new bck();
        bckVar.f = "Description Label";
        bckVar.g = Paint.Align.RIGHT;
        bckVar.d = dut0.c(8.0f);
        this.k = bckVar;
        vjz vjzVar = new vjz();
        vjzVar.f = new wjz[0];
        vjzVar.g = 1;
        vjzVar.h = 3;
        vjzVar.i = 1;
        vjzVar.j = 1;
        vjzVar.k = 4;
        vjzVar.l = 8.0f;
        vjzVar.m = 3.0f;
        vjzVar.n = 6.0f;
        vjzVar.o = 5.0f;
        vjzVar.p = 3.0f;
        vjzVar.q = 0.95f;
        vjzVar.r = 0.0f;
        vjzVar.s = 0.0f;
        vjzVar.t = new ArrayList(16);
        vjzVar.u = new ArrayList(16);
        vjzVar.v = new ArrayList(16);
        vjzVar.d = dut0.c(10.0f);
        vjzVar.b = dut0.c(5.0f);
        vjzVar.c = dut0.c(3.0f);
        this.l = vjzVar;
        byte b2 = 9;
        xjz xjzVar = new xjz(xju0Var, b2);
        xjzVar.f = new ArrayList(16);
        xjzVar.g = new Paint.FontMetrics();
        xjzVar.h = new Path();
        xjzVar.e = vjzVar;
        Paint paint = new Paint(1);
        xjzVar.c = paint;
        paint.setTextSize(dut0.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        xjzVar.d = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.o = xjzVar;
        urv0 urv0Var = new urv0();
        urv0Var.v = 1;
        urv0Var.w = false;
        urv0Var.x = 1;
        urv0Var.c = dut0.c(4.0f);
        this.i = urv0Var;
        this.g = new Paint(1);
        Paint paint3 = new Paint(1);
        this.h = paint3;
        paint3.setColor(Color.rgb(247, 189, 51));
        Paint paint4 = this.h;
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        this.h.setTextSize(dut0.c(12.0f));
        if (this.f18993a) {
            Log.i("", "Chart.init()");
        }
        this.v1 = new a2w0(1);
        this.w1 = new a2w0(2);
        this.z1 = new ywq0(xju0Var);
        this.A1 = new ywq0(xju0Var);
        this.x1 = new b2w0(xju0Var, this.v1, this.z1);
        this.y1 = new b2w0(xju0Var, this.w1, this.A1);
        urv0 urv0Var2 = this.i;
        vrv0 vrv0Var = new vrv0(xju0Var, this.z1, urv0Var2);
        vrv0Var.i = new Path();
        vrv0Var.j = new float[2];
        vrv0Var.k = new RectF();
        vrv0Var.l = new float[2];
        new RectF();
        new Path();
        vrv0Var.h = urv0Var2;
        Paint paint5 = vrv0Var.f;
        paint5.setColor(-16777216);
        paint5.setTextAlign(align);
        paint5.setTextSize(dut0.c(10.0f));
        this.B1 = vrv0Var;
        owb owbVar = new owb();
        owbVar.b = new ArrayList();
        owbVar.f25961a = this;
        setHighlighter(owbVar);
        fu5 fu5Var = new fu5();
        fu5Var.f43363a = 0;
        fu5Var.d = this;
        fu5Var.c = new GestureDetector(getContext(), fu5Var);
        fu5Var.e = new Matrix();
        fu5Var.f = new Matrix();
        fu5Var.g = cp10.b(0.0f, 0.0f);
        fu5Var.h = cp10.b(0.0f, 0.0f);
        fu5Var.i = 1.0f;
        fu5Var.j = 1.0f;
        fu5Var.k = 1.0f;
        fu5Var.n = 0L;
        fu5Var.o = cp10.b(0.0f, 0.0f);
        fu5Var.p = cp10.b(0.0f, 0.0f);
        fu5Var.e = xju0Var.f41005a;
        fu5Var.q = dut0.c(3.0f);
        fu5Var.r = dut0.c(3.5f);
        this.m = fu5Var;
        Paint paint6 = new Paint();
        this.o1 = paint6;
        paint6.setStyle(style);
        this.o1.setColor(Color.rgb(240, 240, 240));
        Paint paint7 = new Paint();
        this.p1 = paint7;
        Paint.Style style2 = Paint.Style.STROKE;
        paint7.setStyle(style2);
        this.p1.setColor(-16777216);
        this.p1.setStrokeWidth(dut0.c(1.0f));
        lwb lwbVar = this.s;
        s500 s500Var = new s500(xju0Var, b2);
        s500Var.c = lwbVar;
        Paint paint8 = new Paint(1);
        s500Var.d = paint8;
        paint8.setStyle(style);
        new Paint(4);
        Paint paint9 = new Paint(1);
        s500Var.f = paint9;
        paint9.setColor(Color.rgb(63, 63, 63));
        paint9.setTextAlign(align);
        paint9.setTextSize(dut0.c(9.0f));
        Paint paint10 = new Paint(1);
        s500Var.e = paint10;
        paint10.setStyle(style2);
        paint10.setStrokeWidth(2.0f);
        paint10.setColor(Color.rgb(255, 187, 115));
        s500Var.g = new hu5(s500Var, b);
        s500Var.h = new Path();
        s500Var.m = Bitmap.Config.ARGB_8888;
        s500Var.n = new Path();
        s500Var.o = new Path();
        s500Var.p = new float[4];
        s500Var.q = new Path();
        s500Var.r = new HashMap();
        s500Var.s = new float[2];
        s500Var.i = this;
        Paint paint11 = new Paint(1);
        s500Var.j = paint11;
        paint11.setStyle(style);
        paint11.setColor(-1);
        this.p = s500Var;
        this.f1 = 100;
        this.g1 = false;
        this.h1 = false;
        this.i1 = true;
        this.j1 = true;
        this.k1 = true;
        this.l1 = true;
        this.m1 = true;
        this.n1 = true;
        this.q1 = false;
        this.r1 = false;
        this.s1 = false;
        this.t1 = 15.0f;
        this.u1 = false;
        this.C1 = 0L;
        this.D1 = 0L;
        this.E1 = new RectF();
        this.F1 = new Matrix();
        new Matrix();
        this.G1 = false;
        z960 z960Var = bp10.d;
        bp10 bp10Var = (bp10) z960Var.b();
        bp10Var.b = 0.0d;
        bp10Var.c = 0.0d;
        this.H1 = bp10Var;
        bp10 bp10Var2 = (bp10) z960Var.b();
        bp10Var2.b = 0.0d;
        bp10Var2.c = 0.0d;
        this.I1 = bp10Var2;
        this.J1 = new float[2];
        this.K1 = maz.b(new ryl(context, (byte) 22));
        this.L1 = maz.b(new ryl(context, (byte) 23));
        this.M1 = maz.b(new ryl(context, (byte) 24));
        this.P1 = new PointF();
        this.Q1 = new PointF();
        this.R1 = new RectF();
        this.S1 = new RectF();
        this.U1 = new RectF();
        this.X1 = maz.b(new ryl(context, (byte) 25));
        getLegend().f4306a = false;
        float fY = i120.Y(context, 48.0f);
        this.G1 = true;
        post(new du5(this, fY, fY / 2.0f));
        if (context.getResources().getBoolean(R.bool.isTablet)) {
            float dp16 = getDp16();
            float dp17 = getDp16();
            setExtraLeftOffset(0.0f);
            setExtraTopOffset(dp16);
            setExtraRightOffset(0.0f);
            setExtraBottomOffset(dp17);
            getTextPaint().setTextSize((int) Math.ceil(context.getResources().getDisplayMetrics().scaledDensity * 14.0f));
        }
        setBackgroundColor(0);
        getDescription().f4306a = false;
        u500 u500Var = new u500();
        u500Var.f22495a = -3.4028235E38f;
        u500Var.b = Float.MAX_VALUE;
        u500Var.c = -3.4028235E38f;
        u500Var.d = Float.MAX_VALUE;
        u500Var.e = -3.4028235E38f;
        u500Var.f = Float.MAX_VALUE;
        u500Var.g = -3.4028235E38f;
        u500Var.h = Float.MAX_VALUE;
        u500Var.i = new ArrayList();
        setData(u500Var);
        vjz legend = getLegend();
        legend.k = 6;
        legend.e = -1;
        urv0 xAxis = getXAxis();
        xAxis.e = -1;
        xAxis.w = true;
        xAxis.x = 2;
        xAxis.l = 3;
        xAxis.m = true;
        xAxis.n = false;
        xAxis.g = 0;
        a2w0 axisLeft = getAxisLeft();
        axisLeft.e = -1;
        axisLeft.h = dut0.c(1.0f);
        axisLeft.o = new DashPathEffect(new float[]{30.0f, 30.0f}, 0.0f);
        TypedValue typedValue = j5d.f15927a;
        axisLeft.g = j5d.a(context, R.attr.uikitSeparator, false);
        getAxisRight().f4306a = false;
        setTouchEnabled(false);
    }

    private final RectF getChartRect() {
        return this.r.b;
    }

    private final float getDp16() {
        return ((Number) this.X1.getValue()).floatValue();
    }

    private final Paint getPaint() {
        return (Paint) this.K1.getValue();
    }

    private final Paint getRejectColorPaint() {
        return (Paint) this.L1.getValue();
    }

    private final TextPaint getTextPaint() {
        return (TextPaint) this.M1.getValue();
    }

    public static String i(Long l, boolean z) {
        rdj rdjVar = rdj.f30294a;
        return rdj.h(new znq0(l != null ? l.longValue() : 0L), ykq0.UNIVERSAL, Boolean.valueOf(z), null, 248);
    }

    public final float getNoBetsAreaSizeX() {
        return this.O1;
    }

    public final float getStartBetZone() {
        return this.N1;
    }

    public final void h(boolean z) {
        Long lValueOf;
        invalidate();
        RectF chartRect = getChartRect();
        RectF rectF = this.S1;
        rectF.set(chartRect);
        RectF rectF2 = this.r.b;
        RectF rectF3 = this.U1;
        rectF3.set(rectF2);
        RectF rectF4 = new RectF(this.W1, rectF3.top, rectF3.right, rectF3.bottom);
        RectF rectF5 = this.R1;
        rectF5.set(rectF4);
        this.O1 = rectF5.right - rectF5.left;
        Rect rect = new Rect();
        zwb zwbVar = this.V1;
        if (zwbVar != null) {
            Long l = (Long) CollectionsKt.W(1, zwbVar.i);
            lValueOf = Long.valueOf(l != null ? l.longValue() : 0L);
        } else {
            lValueOf = null;
        }
        String strI = i(lValueOf, z);
        Context context = getContext();
        context.getClass();
        float fCeil = (int) Math.ceil(context.getResources().getDisplayMetrics().density * 4.0f);
        getTextPaint().getTextBounds(strI, 0, strI.length(), rect);
        float f = this.N1;
        this.P1.set(f > 0.0f ? f - (rect.width() / 2) : 0.0f, rectF.bottom + rect.height() + fCeil);
        float fWidth = (rectF.right - rect.width()) - fCeil;
        PointF pointF = this.Q1;
        pointF.x = fWidth;
        pointF.y = rectF.bottom + rect.height() + fCeil;
    }

    public final float[] j() {
        xju0 xju0Var = this.r;
        xju0Var.getClass();
        a2w0 a2w0Var = this.v1;
        a2w0Var.getClass();
        ywq0 ywq0Var = this.z1;
        ywq0Var.getClass();
        s8q s8qVar = new s8q(xju0Var, a2w0Var, ywq0Var);
        a2w0 a2w0Var2 = this.v1;
        s8qVar.n1(a2w0Var2.t, a2w0Var2.s);
        return s8qVar.p1();
    }

    @Override // a.eu5, a.kwb, android.view.View
    public final void onDraw(Canvas canvas) {
        Long lValueOf;
        canvas.getClass();
        super.onDraw(canvas);
        zwb zwbVar = this.V1;
        if (zwbVar != null) {
            RectF rectF = this.U1;
            float f = rectF.left + this.N1;
            canvas.drawLine(f, rectF.top, f, rectF.bottom, getPaint());
            canvas.drawRect(this.R1, getRejectColorPaint());
            boolean z = zwbVar.h;
            zwb zwbVar2 = this.V1;
            Long lValueOf2 = null;
            if (zwbVar2 != null) {
                Long l = (Long) CollectionsKt.W(1, zwbVar2.i);
                lValueOf = Long.valueOf(l != null ? l.longValue() : 0L);
            } else {
                lValueOf = null;
            }
            String strI = i(lValueOf, z);
            PointF pointF = this.P1;
            canvas.drawText(strI, pointF.x, pointF.y, getTextPaint());
            zwb zwbVar3 = this.V1;
            if (zwbVar3 != null) {
                Long l2 = (Long) CollectionsKt.W(2, zwbVar3.i);
                lValueOf2 = Long.valueOf(l2 != null ? l2.longValue() : 0L);
            }
            String strI2 = i(lValueOf2, z);
            PointF pointF2 = this.Q1;
            canvas.drawText(strI2, pointF2.x, pointF2.y, getTextPaint());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinBetChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinBetChartView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
