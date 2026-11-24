package org.xplatform.uikit.components.cells;

import a.bqd0;
import a.hny;
import a.jk3;
import a.jmu0;
import a.ktt0;
import a.x8b;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsShimmerCell extends ConstraintLayout implements x8b {
    public final jk3 q;
    public boolean r;
    public boolean s;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsShimmerCell(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.cellShimmersStyle);
        LayoutInflater.from(context).inflate(R.layout.settings_shimmer_layout, this);
        int i2 = R.id.icon;
        DsShimmerView dsShimmerView = (DsShimmerView) yum0.f(this, R.id.icon);
        if (dsShimmerView != null) {
            i2 = R.id.longTitle;
            DsShimmerView dsShimmerView2 = (DsShimmerView) yum0.f(this, R.id.longTitle);
            if (dsShimmerView2 != null) {
                i2 = R.id.separator;
                DsSeparator dsSeparator = (DsSeparator) yum0.f(this, R.id.separator);
                if (dsSeparator != null) {
                    i2 = R.id.title;
                    DsShimmerView dsShimmerView3 = (DsShimmerView) yum0.f(this, R.id.title);
                    if (dsShimmerView3 != null) {
                        this.q = new jk3(this, dsShimmerView, dsShimmerView2, dsSeparator, dsShimmerView3, (byte) 12);
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.l0, R.attr.cellShimmersStyle, 0);
                        jmu0.j(this, ktt0.m(0, context, typedArrayObtainStyledAttributes));
                        this.r = typedArrayObtainStyledAttributes.getBoolean(1, this.r);
                        this.s = typedArrayObtainStyledAttributes.getBoolean(2, this.s);
                        setIconVisible(typedArrayObtainStyledAttributes.getBoolean(3, true));
                        setTitleVisible(typedArrayObtainStyledAttributes.getBoolean(7, true));
                        setLongTitleVisible(typedArrayObtainStyledAttributes.getBoolean(4, false));
                        setSeparatorVisible(typedArrayObtainStyledAttributes.getBoolean(5, false));
                        typedArrayObtainStyledAttributes.recycle();
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        boolean z = this.r;
        int i2 = R.attr.order_first;
        if (!z) {
            i2 = -R.attr.order_first;
        }
        boolean z2 = this.s;
        int i3 = R.attr.order_last;
        if (!z2) {
            i3 = -R.attr.order_last;
        }
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{i2, i3});
        iArrMergeDrawableStates.getClass();
        return iArrMergeDrawableStates;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((DsSeparator) this.q.e).getVisibility();
    }

    @Override // a.x8b
    public void setFirst(boolean z) {
        this.r = z;
        ((DsSeparator) this.q.e).setVisibility(this.s ? 8 : 0);
        refreshDrawableState();
    }

    public final void setIconVisible(boolean z) {
        ((DsShimmerView) this.q.c).setVisibility(z ? 0 : 8);
    }

    @Override // a.x8b
    public void setLast(boolean z) {
        this.s = z;
        ((DsSeparator) this.q.e).setVisibility(z ? 8 : 0);
        refreshDrawableState();
    }

    public final void setLongTitleVisible(boolean z) {
        jk3 jk3Var = this.q;
        ((DsShimmerView) jk3Var.d).setVisibility(z ? 0 : 8);
        if (z) {
            ((DsShimmerView) jk3Var.f).setVisibility(8);
        }
    }

    public final void setSeparatorVisible(boolean z) {
        ((DsSeparator) this.q.e).setVisibility(z ? 0 : 8);
    }

    public final void setTitleVisible(boolean z) {
        jk3 jk3Var = this.q;
        ((DsShimmerView) jk3Var.f).setVisibility(z ? 0 : 8);
        if (z) {
            ((DsShimmerView) jk3Var.d).setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsShimmerCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsShimmerCell(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
