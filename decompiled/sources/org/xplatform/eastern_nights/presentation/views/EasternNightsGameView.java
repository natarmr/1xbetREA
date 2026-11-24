package org.xplatform.eastern_nights.presentation.views;

import a.aim;
import a.b0d;
import a.bkx;
import a.cjn;
import a.dcn;
import a.edl;
import a.i120;
import a.iun;
import a.kkx;
import a.l1e0;
import a.p3u0;
import a.pn40;
import a.q3d;
import a.sab;
import a.xhn;
import a.xp3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class EasternNightsGameView extends FrameLayout {
    public static final /* synthetic */ int u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f46629a;
    public Function0 b;
    public Function0 c;
    public final int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final SparseArray i;
    public final SparseArray j;
    public int k;
    public byte l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public sab r;
    public ValueAnimator s;
    public final edl t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasternNightsGameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        byte b = 29;
        this.f46629a = new aim(b);
        this.b = new dcn((byte) 15);
        this.c = new dcn((byte) 16);
        this.d = (int) Math.ceil(context.getResources().getDisplayMetrics().density * 10.0f);
        this.h = true;
        this.i = new SparseArray();
        this.j = new SparseArray();
        this.r = new sab(context);
        this.t = new edl(this, b);
    }

    public static void d(int i, int i2, List list, sab sabVar) {
        if (i < list.size() && i2 - 1 == ((Number) list.get(i)).intValue() - 1) {
            sab.u(R.drawable.lamp_cell, sabVar);
        } else if (i >= list.size() || i2 - 1 == ((Number) list.get(i)).intValue() - 1) {
            sab.u(R.drawable.eastern_nights_shadowed_cell, sabVar);
        } else {
            sab.u(R.drawable.eastern_nights_shadowed_cell, sabVar);
            sabVar.setAlpha(0.5f);
        }
    }

    public final void a(int i, sab sabVar) {
        int i2 = this.n;
        SparseArray sparseArray = this.j;
        if (i == i2) {
            sab.u(R.drawable.eastern_nights_arrow_cell, sabVar);
            ((b0d) sparseArray.get(i)).setDrawable(R.drawable.eastern_nights_coeff_select);
        } else if (i <= i2) {
            ((b0d) sparseArray.get(i)).setDrawable(R.drawable.eastern_nights_coeff_unselect);
        } else {
            sab.u(R.drawable.eastern_nights_shadowed_cell, sabVar);
            ((b0d) sparseArray.get(i)).setDrawable(R.drawable.eastern_nights_coeff_unselect);
        }
    }

    public final void b(xhn xhnVar) {
        List list;
        cjn cjnVar;
        List list2;
        String strConcat;
        cjn cjnVar2;
        boolean z = xhnVar == null;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g = true;
        this.f = z;
        this.e = false;
        if (xhnVar == null) {
            this.m = 10;
            this.l = (byte) 6;
            this.n = 0;
        } else {
            cjn cjnVar3 = xhnVar.b;
            this.m = cjnVar3.g.size();
            this.l = (byte) 6;
            int size = cjnVar3.i.size();
            this.n = size;
            this.p = size;
        }
        removeAllViews();
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray = this.i;
            sparseArray.put(i2, arrayList);
            int i3 = this.l;
            for (int i4 = 0; i4 < i3; i4++) {
                if (i4 == 0) {
                    if (xhnVar == null || (cjnVar2 = xhnVar.b) == null || (list2 = cjnVar2.g) == null) {
                        list2 = iun.f15405a;
                    }
                    Context context = getContext();
                    context.getClass();
                    b0d b0dVar = new b0d(context);
                    Context context2 = b0dVar.getContext();
                    context2.getClass();
                    int iY = i120.Y(context2, 0.0f);
                    Context context3 = b0dVar.getContext();
                    context3.getClass();
                    int iY2 = i120.Y(context3, 4.0f);
                    Context context4 = b0dVar.getContext();
                    context4.getClass();
                    int iY3 = i120.Y(context4, 8.0f);
                    Context context5 = b0dVar.getContext();
                    context5.getClass();
                    b0dVar.v(iY, iY2, iY3, i120.Y(context5, 4.0f));
                    if (list2.isEmpty()) {
                        strConcat = Separators.SP;
                    } else {
                        pn40 pn40Var = pn40.f27267a;
                        strConcat = "x ".concat(pn40.c(((Number) list2.get(i2)).doubleValue(), p3u0.c));
                    }
                    b0dVar.setText(strConcat);
                    addView(b0dVar);
                    this.j.put(i2, b0dVar);
                } else {
                    if (xhnVar == null || (cjnVar = xhnVar.b) == null || (list = cjnVar.i) == null) {
                        list = iun.f15405a;
                    }
                    Context context6 = getContext();
                    context6.getClass();
                    sab sabVar = new sab(context6);
                    Context context7 = sabVar.getContext();
                    context7.getClass();
                    sabVar.setMargin((int) Math.ceil(context7.getResources().getDisplayMetrics().density * 3.0f));
                    d(i2, i4, list, sabVar);
                    a(i2, sabVar);
                    sabVar.setRow(i2);
                    sabVar.setColumn(i4);
                    sabVar.setOnClickListener(new xp3(this.t, (byte) 2));
                    addView(sabVar);
                    ((List) sparseArray.get(i2)).add(sabVar);
                }
            }
        }
    }

    public final void c() {
        Float fValueOf = Float.valueOf(0.2f);
        Iterator it = q3d.j(fValueOf, fValueOf, Float.valueOf(0.35f), Float.valueOf(0.5f), Float.valueOf(0.6f), Float.valueOf(1.0f)).iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            float fFloatValue = ((Number) it.next()).floatValue();
            List<sab> list = (List) this.i.get((this.q + this.n) - i);
            if (list != null) {
                for (sab sabVar : list) {
                    if (this.f) {
                        sabVar.setAlpha(1.0f);
                    } else {
                        sabVar.setAlpha(fFloatValue);
                    }
                }
            }
            i = i2;
        }
    }

    public final void e(boolean z) {
        int i = this.n;
        if (z) {
            i--;
        }
        SparseArray sparseArray = this.j;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            b0d b0dVar = (b0d) sparseArray.valueAt(i2);
            if (iKeyAt == i) {
                b0dVar.setDrawable(R.drawable.eastern_nights_coeff_select);
                setAlpha(1.0f);
            } else {
                b0dVar.setDrawable(R.drawable.eastern_nights_coeff_unselect);
            }
        }
    }

    public final void f(boolean z) {
        int i = this.n;
        SparseArray sparseArray = this.i;
        List list = (List) sparseArray.get(i);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sab.u(R.drawable.eastern_nights_arrow_cell, (sab) it.next());
            }
        }
        List<sab> list2 = (List) sparseArray.get(this.n - 1);
        if (list2 != null) {
            for (sab sabVar : list2) {
                if (sabVar.getColumn() == this.o && z) {
                    sab.u(R.drawable.lamp_cell, sabVar);
                } else if (sabVar.getColumn() != this.o || z) {
                    sab.u(R.drawable.eastern_nights_shadowed_cell, sabVar);
                    sabVar.setAlpha(0.5f);
                } else {
                    sab.u(R.drawable.japh_cell, sabVar);
                }
            }
        }
    }

    public final Function0<Unit> getOnEndMove() {
        return this.c;
    }

    public final Function0<Unit> getOnGameFinished() {
        return this.b;
    }

    public final Function1<Integer, Boolean> getOnTakingGameStep() {
        return this.f46629a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.e || this.f || motionEvent.getPointerCount() > 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight() - this.d;
        int i5 = this.m;
        float textSize = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            byte b = this.l;
            int i8 = 0;
            for (int i9 = 0; i9 < b; i9++) {
                if (i9 != 0) {
                    View childAt = getChildAt(i6);
                    int i10 = this.k;
                    childAt.layout(i8, measuredHeight - i10, i10 + i8, measuredHeight);
                } else {
                    View childAt2 = getChildAt(i6);
                    childAt2.getClass();
                    b0d b0dVar = (b0d) childAt2;
                    if (i7 == this.m - 1) {
                        b0dVar.u();
                    }
                    int i11 = this.k;
                    int i12 = i11 / 2;
                    int i13 = i12 / 2;
                    int i14 = measuredHeight - i12;
                    b0dVar.layout(i8, i14 - i13, i11 + i8, i14 + i13);
                    if (i7 == this.m - 1) {
                        textSize = b0dVar.getTextSize();
                    }
                }
                i8 += this.k;
                i6++;
            }
            measuredHeight -= this.k;
        }
        c();
        boolean z2 = this.g;
        SparseArray sparseArray = this.j;
        if (z2) {
            int i15 = this.m;
            int i16 = i15 - this.q;
            int i17 = this.n;
            int i18 = this.k;
            float f = i16 >= i17 ? i18 * i17 : i16 * i18;
            for (int i19 = 0; i19 < i15; i19++) {
                Object obj = this.i.get(i19);
                obj.getClass();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    ((sab) it.next()).setTranslationY(f);
                }
                ((b0d) sparseArray.get(i19)).setTranslationY(f);
            }
        }
        int size = sparseArray.size();
        for (int i20 = 0; i20 < size; i20++) {
            ((b0d) sparseArray.get(i20)).setTextSize(textSize);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.l == 0 || this.m == 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth() / this.l;
        this.k = measuredWidth;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.k / 2, 1073741824);
        SparseArray sparseArray = this.i;
        Iterator it = l1e0.o(0, sparseArray.size()).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            Iterator it2 = l1e0.o(0, ((List) sparseArray.get(iNextInt)).size()).iterator();
            while (((kkx) it2).c) {
                ((sab) ((List) sparseArray.get(iNextInt)).get(((bkx) it2).nextInt())).measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
        }
        SparseArray sparseArray2 = this.j;
        Iterator it3 = l1e0.o(0, sparseArray2.size()).iterator();
        while (((kkx) it3).c) {
            ((b0d) sparseArray2.get(((bkx) it3).nextInt())).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        if (this.k != 0) {
            this.q = getMeasuredHeight() / this.k;
        }
    }

    public final void setOnEndMove(Function0<Unit> function0) {
        function0.getClass();
        this.c = function0;
    }

    public final void setOnGameFinished(Function0<Unit> function0) {
        function0.getClass();
        this.b = function0;
    }

    public final void setOnTakingGameStep(Function1<? super Integer, Boolean> function1) {
        function1.getClass();
        this.f46629a = function1;
    }
}
