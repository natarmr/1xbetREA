package org.xplatform.uikit.components.bottom_sheet.presets;

import a.bqd0;
import a.ihu0;
import a.jhu0;
import a.jmu0;
import a.pgi0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class PresetButtonsLinearLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47229a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public PresetButtonsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47229a = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.b0, 0, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(0, this.d);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.d;
        int i6 = this.c;
        if (i5 == 0) {
            Iterator it = new ihu0(this).iterator();
            int measuredWidth = this.f47229a;
            while (true) {
                jhu0 jhu0Var = (jhu0) it;
                if (!jhu0Var.hasNext()) {
                    return;
                }
                View view = (View) jhu0Var.next();
                int measuredHeight = view.getMeasuredHeight();
                int i7 = this.c;
                jmu0.f(measuredWidth, i7, view.getMeasuredWidth() + measuredWidth, measuredHeight + i7, view, this);
                measuredWidth += view.getMeasuredWidth() + i6;
            }
        } else {
            Iterator it2 = new ihu0(this).iterator();
            int measuredHeight2 = i6;
            while (true) {
                jhu0 jhu0Var2 = (jhu0) it2;
                if (!jhu0Var2.hasNext()) {
                    return;
                }
                View view2 = (View) jhu0Var2.next();
                int measuredWidth2 = view2.getMeasuredWidth();
                int i8 = this.f47229a;
                jmu0.f(i8, measuredHeight2, measuredWidth2 + i8, view2.getMeasuredHeight() + measuredHeight2, view2, this);
                measuredHeight2 += view2.getMeasuredHeight() + this.b;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int childCount;
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE);
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.f47229a;
        if (i4 == 0) {
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((size - (i5 * 2)) - ((getChildCount() - 1) * i3)) / getChildCount(), 1073741824);
            Iterator it = new ihu0(this).iterator();
            while (true) {
                jhu0 jhu0Var = (jhu0) it;
                if (!jhu0Var.hasNext()) {
                    break;
                } else {
                    ((View) jhu0Var.next()).measure(iMakeMeasureSpec2, i2);
                }
            }
            View view = (View) pgi0.j(new ihu0(this));
            childCount = (i3 * 2) + (view != null ? view.getMeasuredHeight() : 0);
        } else {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size - (i5 * 2), 1073741824);
            Iterator it2 = new ihu0(this).iterator();
            while (true) {
                jhu0 jhu0Var2 = (jhu0) it2;
                if (!jhu0Var2.hasNext()) {
                    break;
                } else {
                    ((View) jhu0Var2.next()).measure(iMakeMeasureSpec3, iMakeMeasureSpec);
                }
            }
            View view2 = (View) pgi0.j(new ihu0(this));
            childCount = (i3 * 2) + ((getChildCount() - 1) * this.b) + (getChildCount() * (view2 != null ? view2.getMeasuredHeight() : 0));
        }
        setMeasuredDimension(size, childCount);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresetButtonsLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresetButtonsLinearLayout(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
