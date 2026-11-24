package org.xplatform.bonus_games.impl.memories.presentation.views;

import a.aqd0;
import a.dyb;
import a.gt30;
import a.o9k0;
import a.tr20;
import a.yr30;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class MemoryGameView extends ViewGroup implements o9k0 {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gt30[] f46441a;
    public final int b;
    public Function1 c;
    public boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    public MemoryGameView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46441a = new gt30[9];
        this.b = 16;
        this.c = new tr20((byte) 20);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, aqd0.d, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 16);
            typedArrayObtainStyledAttributes.recycle();
            for (int i2 = 0; i2 < 9; i2++) {
                Context context2 = getContext();
                context2.getClass();
                gt30 gt30Var = new gt30(context2);
                gt30Var.setListener(this);
                this.f46441a[i2] = gt30Var;
                dyb.O(gt30Var, new yr30(this, i2, (byte) 0));
                addView(gt30Var);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View, a.o9k0
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        this.d = false;
    }

    @Override // android.view.View, a.o9k0
    public final void onAnimationStart() {
        super.onAnimationStart();
        this.d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int paddingRight;
        boolean z2 = getMeasuredWidth() > getMeasuredHeight();
        if (z2) {
            measuredWidth = getMeasuredHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int i5 = measuredWidth - paddingRight;
        int measuredHeight = z2 ? 0 : (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - i5) / 2;
        int measuredWidth2 = z2 ? (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - i5) / 2 : 0;
        int i6 = i5 / 3;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int paddingLeft = (i6 * i7) + getPaddingLeft() + measuredWidth2;
            int i10 = this.b;
            i7++;
            int i11 = i8 + 1;
            childAt.layout(paddingLeft + i10, (i6 * i8) + getPaddingTop() + measuredHeight + i10, (((i6 * i7) + getPaddingLeft()) + measuredWidth2) - i10, (((i6 * i11) + getPaddingTop()) + measuredHeight) - i10);
            if (i7 == 3) {
                i7 = 0;
                i8 = i11;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int paddingRight;
        super.onMeasure(i, i2);
        if (getMeasuredWidth() > getMeasuredHeight()) {
            measuredWidth = getMeasuredHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((measuredWidth - paddingRight) / 3) - (this.b * 2), Integer.MIN_VALUE);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
    }

    public final void setListener(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.c = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemoryGameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemoryGameView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
