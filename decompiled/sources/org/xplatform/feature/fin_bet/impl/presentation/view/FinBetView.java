package org.xplatform.feature.fin_bet.impl.presentation.view;

import a.dfp;
import a.i7q;
import a.l1e0;
import a.maz;
import a.n0o0;
import a.p0d;
import a.pn40;
import a.qic;
import a.qva;
import a.ryl;
import a.v4i0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.a;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class FinBetView extends ConstraintLayout {
    public static final /* synthetic */ int m1 = 0;
    public final CarriageContainer A;
    public int B;
    public int f1;
    public int g1;
    public boolean h1;
    public boolean i1;
    public float[] j1;
    public int k1;
    public int l1;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final n0o0 u;
    public final n0o0 v;
    public final PointF w;
    public final Rect x;
    public final float y;
    public final FinBetChartView z;

    /* JADX WARN: Illegal instructions before constructor call */
    public FinBetView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.b(new ryl(context, (byte) 26));
        this.r = maz.b(new dfp((byte) 29));
        this.s = maz.b(new ryl(context, (byte) 27));
        this.t = maz.b(new ryl(context, (byte) 28));
        this.u = maz.b(new ryl(context, (byte) 29));
        this.v = maz.b(new i7q(context, (byte) 0));
        this.w = new PointF();
        this.x = new Rect();
        this.y = (int) Math.ceil(context.getResources().getDisplayMetrics().density * 4.0f);
        this.g1 = -1;
        this.j1 = new float[0];
        View.inflate(context, R.layout.fin_bet_view, this);
        View viewFindViewById = findViewById(R.id.chartView);
        viewFindViewById.getClass();
        this.z = (FinBetChartView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.carriagesContainer);
        viewFindViewById2.getClass();
        this.A = (CarriageContainer) viewFindViewById2;
    }

    private final Paint getLevelLinePaint() {
        return (Paint) this.s.getValue();
    }

    private final TextPaint getLevelLineTextPaint() {
        return (TextPaint) this.t.getValue();
    }

    private final Pair<PointF, Rect> getNoBetsTextPoints() {
        TextPaint noBetsTitleTextPaint = getNoBetsTitleTextPaint();
        String noBetsTitle = getNoBetsTitle();
        int length = getNoBetsTitle().length();
        Rect rect = this.x;
        noBetsTitleTextPaint.getTextBounds(noBetsTitle, 0, length, rect);
        float measuredWidth = (((getMeasuredWidth() - this.A.getMeasuredWidth()) - (this.z.getNoBetsAreaSizeX() / 2.0f)) + (rect.height() / 2)) - (rect.height() * 0.05f);
        PointF pointF = this.w;
        pointF.x = measuredWidth;
        pointF.y = (rect.width() / 2) + (getMeasuredHeight() / 2);
        return new Pair<>(pointF, rect);
    }

    private final String getNoBetsTitle() {
        return (String) this.q.getValue();
    }

    private final TextPaint getNoBetsTitleTextPaint() {
        return (TextPaint) this.u.getValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.v.getValue()).intValue();
    }

    private final Paint getZonesPaint() {
        return (Paint) this.r.getValue();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        float fFloatValue;
        canvas.getClass();
        super.dispatchDraw(canvas);
        float[] fArr = this.j1;
        if (fArr.length == 0 || (i = this.k1) == 0) {
            return;
        }
        float f = i;
        Float fValueOf = 23 < fArr.length ? Float.valueOf(fArr[23]) : null;
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            float[] fArr2 = this.j1;
            fArr2.getClass();
            if (fArr2.length == 0) {
                v4i0.o("Array is empty.");
                return;
            }
            fFloatValue = fArr2[fArr2.length - 1];
        }
        float f2 = fFloatValue;
        float measuredWidth = getMeasuredWidth();
        CarriageContainer carriageContainer = this.A;
        float measuredWidth2 = measuredWidth - carriageContainer.getMeasuredWidth();
        float f3 = this.j1[(carriageContainer.getCurrentHighlightView() * 2) + 1];
        Paint zonesPaint = getZonesPaint();
        Context context = getContext();
        context.getClass();
        zonesPaint.setColor(context.getColor(R.color.static_green_20));
        canvas.drawRect(f, f2, measuredWidth2, f3, zonesPaint);
        float f4 = this.k1;
        float f5 = this.j1[(carriageContainer.getCurrentHighlightView() * 2) + 1];
        float measuredWidth3 = getMeasuredWidth() - carriageContainer.getMeasuredWidth();
        float f6 = this.j1[1];
        Paint zonesPaint2 = getZonesPaint();
        Context context2 = getContext();
        context2.getClass();
        zonesPaint2.setColor(context2.getColor(R.color.static_red_20));
        canvas.drawRect(f4, f5, measuredWidth3, f6, zonesPaint2);
        float f7 = this.k1;
        float f8 = this.j1[(carriageContainer.getCurrentHighlightView() * 2) + 1];
        Context context3 = getContext();
        context3.getClass();
        canvas.drawCircle(f7, f8, (int) Math.ceil(context3.getResources().getDisplayMetrics().density * 3.0f), getLevelLinePaint());
        float f9 = this.k1;
        Context context4 = getContext();
        context4.getClass();
        canvas.drawLine(f9 + ((int) Math.ceil(context4.getResources().getDisplayMetrics().density * 3.0f)), this.j1[(carriageContainer.getCurrentHighlightView() * 2) + 1], getMeasuredWidth() - (carriageContainer.getMeasuredWidth() * 0.97f), this.j1[(carriageContainer.getCurrentHighlightView() * 2) + 1], getLevelLinePaint());
        int currentHighlightView = carriageContainer.getCurrentHighlightView();
        int childCount = carriageContainer.getChildCount() - 1;
        float f10 = this.y;
        float f11 = currentHighlightView == childCount ? 3.0f * f10 : -f10;
        pn40 pn40Var = pn40.f27267a;
        View childAt = carriageContainer.getChildAt(carriageContainer.getCurrentHighlightView());
        childAt.getClass();
        canvas.drawText(pn40.j(((qva) childAt).getPrice(), this.l1, false), (2.0f * f10) + this.k1, this.j1[(carriageContainer.getCurrentHighlightView() * 2) + 1] + f11, getLevelLineTextPaint());
        Pair<PointF, Rect> noBetsTextPoints = getNoBetsTextPoints();
        canvas.save();
        PointF pointF = (PointF) noBetsTextPoints.f46059a;
        canvas.rotate(-90.0f, pointF.x, pointF.y);
        String noBetsTitle = getNoBetsTitle();
        PointF pointF2 = (PointF) noBetsTextPoints.f46059a;
        canvas.drawText(noBetsTitle, pointF2.x, pointF2.y, getNoBetsTitleTextPaint());
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.i1 ? onTouchEvent(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.j1 = this.z.j();
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(i, i2);
        FinBetChartView finBetChartView = this.z;
        float[] fArrJ = finBetChartView.j();
        this.j1 = fArrJ;
        if (fArrJ.length == 0) {
            return;
        }
        this.A.setGrid(fArrJ);
        this.k1 = (int) finBetChartView.getStartBetZone();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        CarriageContainer carriageContainer = this.A;
        if (action == 0 && motionEvent.getPointerCount() == 1) {
            this.B = (int) motionEvent.getX();
            this.f1 = (int) motionEvent.getY();
            this.g1 = motionEvent.getPointerId(0);
            this.h1 = true;
            int i = this.f1;
            a aVarM = l1e0.m(2, l1e0.o(1, this.j1.length));
            int i2 = aVarM.f46068a;
            int i3 = aVarM.b;
            int i4 = aVarM.c;
            if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                while (true) {
                    float[] fArr = this.j1;
                    fArr.getClass();
                    if (i2 != fArr.length - 1) {
                        float[] fArr2 = this.j1;
                        float f = fArr2[i2];
                        int i5 = i2 + 2;
                        float f2 = fArr2[i5];
                        float f3 = i;
                        if (f2 < f3 && f3 < f) {
                            carriageContainer.setupViewIndex(f - ((f - f2) / 2.0f) < f3 ? i2 / 2 : i5 / 2);
                            break;
                        }
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    } else {
                        carriageContainer.setupViewIndex(i2 / 2);
                        break;
                    }
                }
            }
        } else if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g1) {
            float fAbs = Math.abs((int) (motionEvent.getX() - this.B));
            float y = ((int) motionEvent.getY()) - this.f1;
            if (this.h1 && !this.i1 && Math.abs(y) / 3.0f > Math.abs(fAbs) && Math.abs(y) >= getTouchSlop()) {
                this.f1 = (int) motionEvent.getY();
                this.h1 = false;
                this.i1 = true;
            } else if (this.i1) {
                int currentHighlightView = y > 0.0f ? carriageContainer.getCurrentHighlightView() - 1 : carriageContainer.getCurrentHighlightView() + 1;
                if (currentHighlightView >= 0 && currentHighlightView < carriageContainer.getChildCount()) {
                    View childAt = carriageContainer.getChildAt(currentHighlightView);
                    childAt.getClass();
                    if ((motionEvent.getY() > childAt.getTop() && motionEvent.getY() < childAt.getBottom()) || ((y > 0.0f && motionEvent.getY() > childAt.getBottom()) || (y < 0.0f && motionEvent.getY() < childAt.getTop()))) {
                        carriageContainer.setupViewIndex(currentHighlightView);
                    }
                }
            }
        } else if ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6) && motionEvent.getPointerId(0) == this.g1) {
            this.h1 = false;
            this.i1 = false;
            this.g1 = -1;
        }
        return this.i1 || this.h1;
    }

    public final void setLastClickedCoefficient(p0d p0dVar) {
        p0dVar.getClass();
        this.A.setLastClicked(new Pair<>(Integer.valueOf(p0dVar.f26144a), p0dVar.b));
    }

    public final void setOnCarriageViewClicked(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.A.setOnCarriageViewClicked(function1);
    }

    public final void setOnSpinnerValueClicked(Function2<? super Integer, ? super qic, Unit> function2) {
        function2.getClass();
        this.A.setOnSpinnerValueClicked(function2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinBetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinBetView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
