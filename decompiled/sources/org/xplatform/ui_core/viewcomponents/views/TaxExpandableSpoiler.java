package org.xplatform.ui_core.viewcomponents.views;

import a.a8z;
import a.aqd0;
import a.dvo0;
import a.dyb;
import a.evo0;
import a.fvo0;
import a.hxm0;
import a.iun;
import a.j5d;
import a.jmu0;
import a.jpe0;
import a.maz;
import a.ttn0;
import a.w23;
import a.wez;
import a.x0x;
import a.ywm0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class TaxExpandableSpoiler extends LinearLayout {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47213a;
    public evo0 b;
    public List c;
    public final short d;
    public final PathInterpolator e;
    public final int f;
    public final int g;
    public final int h;
    public final LinearLayout.LayoutParams i;
    public final ArrayList j;

    /* JADX WARN: Illegal instructions before constructor call */
    public TaxExpandableSpoiler(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47213a = maz.a(wez.b, new ywm0(this, this, (byte) 7));
        this.b = evo0.f8481a;
        this.c = iun.f15405a;
        this.d = (short) 400;
        this.e = new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
        this.f = getResources().getDimensionPixelSize(R.dimen.radius_16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_14);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_12);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dimensionPixelSize);
        layoutParams.topMargin = dimensionPixelSize2;
        this.i = layoutParams;
        ArrayList arrayList = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            Context context2 = getContext();
            context2.getClass();
            DsShimmerView dsShimmerView = new DsShimmerView(context2, null, 6);
            dsShimmerView.setLayoutParams(this.i);
            hxm0.x(dsShimmerView, this.f);
            arrayList.add(dsShimmerView);
        }
        this.j = arrayList;
        setBackground(context.getDrawable(R.drawable.bg_rounded_corners_10dp));
        TypedValue typedValue = j5d.f15927a;
        jmu0.j(this, j5d.d(context, R.attr.uikitBackground, R.attr.uikitBackground));
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i3 = this.h;
        int i4 = this.g;
        setPadding(i3, i4, i3, i4);
        setLayoutParams(layoutParams2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setHeaderIcon(resourceId);
        }
        typedArrayObtainStyledAttributes.recycle();
        dyb.O(getBinding().f, new ttn0(this, (byte) 14));
        getBinding().b.setOnClickListener(new jpe0(this, (byte) 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fvo0 getBinding() {
        Object value = this.f47213a.getValue();
        value.getClass();
        return (fvo0) value;
    }

    private final void setHeaderTitle(String str) {
        getBinding().h.setText(str);
    }

    public final void b(LinearLayout linearLayout) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(linearLayout.getHeight(), 0);
        valueAnimatorOfInt.setDuration(this.d);
        valueAnimatorOfInt.setInterpolator(this.e);
        valueAnimatorOfInt.addUpdateListener(new dvo0(linearLayout, (byte) 0));
        valueAnimatorOfInt.start();
    }

    public final void c(LinearLayout linearLayout) {
        ViewParent parent = linearLayout.getParent();
        parent.getClass();
        ViewGroup viewGroup = (ViewGroup) parent;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(linearLayout.getHeight(), linearLayout.getMeasuredHeight());
        valueAnimatorOfInt.setDuration(this.d);
        valueAnimatorOfInt.setInterpolator(this.e);
        valueAnimatorOfInt.addUpdateListener(new dvo0(linearLayout, (byte) 1));
        valueAnimatorOfInt.start();
    }

    public final void d() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new w23(this, (byte) 18));
        } else if (this.b == evo0.b) {
            c(getBinding().d);
            getBinding().b.setExpanded(true);
        } else {
            b(getBinding().d);
            getBinding().b.setExpanded(false);
        }
    }

    public final void e() {
        x0x.O(this);
        getBinding().g.setVisibility(8);
        getBinding().i.setVisibility(0);
    }

    public final void f() {
        setContent(iun.f15405a);
        setHeaderValue("");
    }

    public final void g() {
        setContent(this.j);
        x0x.s(this);
        getBinding().g.setVisibility(0);
        getBinding().i.setVisibility(8);
    }

    public final void setContent(List<? extends View> list) {
        list.getClass();
        this.c = list;
        getBinding().e.removeAllViews();
        if (!this.c.isEmpty()) {
            for (View view : this.c) {
                hxm0.v(view);
                getBinding().e.addView(view);
            }
        }
        d();
    }

    public final void setHeaderIcon(int i) {
        getBinding().c.setImageResource(i);
    }

    public final void setHeaderValue(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() > 0) {
            getBinding().i.setText(charSequence);
            getBinding().i.setVisibility(0);
            String string = getContext().getString(R.string.tax_bonus);
            string.getClass();
            setHeaderTitle(string);
            return;
        }
        getBinding().i.setText("");
        getBinding().i.setVisibility(8);
        String string2 = getContext().getString(R.string.tax_bonus_empty);
        string2.getClass();
        setHeaderTitle(string2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxExpandableSpoiler(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxExpandableSpoiler(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
