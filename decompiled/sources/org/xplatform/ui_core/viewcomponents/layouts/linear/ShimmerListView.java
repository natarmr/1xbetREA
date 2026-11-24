package org.xplatform.ui_core.viewcomponents.layouts.linear;

import a.iqj0;
import a.x0x;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ShimmerListView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47195a;
    public Integer b;
    public final iqj0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ShimmerListView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47195a = true;
        this.c = new iqj0(this, context, (byte) 1);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOccupiedHeightSpace() {
        int childCount = getChildCount();
        int height = 0;
        for (int i = 0; i < childCount; i++) {
            height += getChildAt(i).getHeight();
        }
        return height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOccupiedWidthSpace() {
        int childCount = getChildCount();
        int width = 0;
        for (int i = 0; i < childCount; i++) {
            width += getChildAt(i).getWidth();
        }
        return width;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x0x.s(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x0x.O(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        view.getClass();
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.f47195a) {
                return;
            }
            this.f47195a = true;
            x0x.s(this);
            return;
        }
        if (i == 8 && this.f47195a) {
            x0x.O(this);
            this.f47195a = false;
            invalidate();
        }
    }

    public final void setShimmerItems(int i) {
        this.b = Integer.valueOf(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerListView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
