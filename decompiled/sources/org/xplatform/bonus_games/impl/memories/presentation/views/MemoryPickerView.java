package org.xplatform.bonus_games.impl.memories.presentation.views;

import a.aqd0;
import a.ht30;
import a.tr20;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class MemoryPickerView extends ViewGroup {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f46442a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    public MemoryPickerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46442a = new tr20((byte) 22);
        this.b = 16;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, aqd0.d, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 16);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
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

    public final void setListener(Function1<? super ht30, Unit> function1) {
        function1.getClass();
        this.f46442a = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemoryPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemoryPickerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
