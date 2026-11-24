package org.xplatform.feature.fin_bet.impl.presentation.view;

import a.bkx;
import a.d69;
import a.kea;
import a.l1e0;
import a.pua;
import a.qic;
import a.qva;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class CarriageContainer extends ViewGroup {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46649a;
    public float[] b;
    public Function2 c;
    public Function1 d;
    public Pair e;

    /* JADX WARN: Illegal instructions before constructor call */
    public CarriageContainer(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.b = new float[0];
        this.c = new pua((byte) 1);
        this.d = new d69((byte) 27);
        this.e = new Pair(-1, qic.c);
    }

    public final int getCurrentHighlightView() {
        return this.f46649a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float[] fArr = this.b;
        if (fArr.length == 0) {
            return;
        }
        for (float f2 : fArr) {
            if (f2 != 0.0f) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    int i6 = (i5 * 2) + 1;
                    float[] fArr2 = this.b;
                    fArr2.getClass();
                    Float fValueOf = (i6 < 0 || i6 >= fArr2.length) ? null : Float.valueOf(fArr2[i6]);
                    if (fValueOf == null) {
                        return;
                    }
                    int iFloatValue = (int) fValueOf.floatValue();
                    getChildAt(i5).layout(0, iFloatValue - (((int) (getHeight() * 0.05f)) / 2), getMeasuredWidth(), (((int) (getHeight() * 0.05f)) / 2) + iFloatValue);
                }
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(i, i2);
        if (this.b.length == 0) {
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        Iterator it = l1e0.o(0, getChildCount()).iterator();
        while (it.hasNext()) {
            getChildAt(((bkx) it).nextInt()).measure(i, iMakeMeasureSpec);
        }
    }

    public final void setGrid(float[] fArr) {
        fArr.getClass();
        this.b = fArr;
    }

    public final void setLastClicked(Pair<Integer, ? extends qic> pair) {
        pair.getClass();
        this.e = pair;
    }

    public final void setOnCarriageViewClicked(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.d = function1;
    }

    public final void setOnSpinnerValueClicked(Function2<? super Integer, ? super qic, Unit> function2) {
        function2.getClass();
        this.c = new kea((Object) this, (Object) function2, (byte) 4);
    }

    public final void setResetParams(Pair<Integer, ? extends qic> pair) {
        pair.getClass();
        this.e = pair;
        this.f46649a = ((Number) pair.f46059a).intValue();
    }

    public final void setupViewIndex(int i) {
        if (getChildAt(this.f46649a) == null) {
            return;
        }
        View childAt = getChildAt(this.f46649a);
        childAt.getClass();
        ((qva) childAt).e();
        this.f46649a = i;
        View childAt2 = getChildAt(i);
        childAt2.getClass();
        ((qva) childAt2).b();
        this.e = new Pair(-1, qic.c);
        ViewParent parent = getParent();
        parent.getClass();
        ((FinBetView) parent).invalidate();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarriageContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarriageContainer(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
