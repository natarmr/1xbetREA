package org.xplatform.ui_core.circleindicator;

import a.aqd0;
import a.epv0;
import a.gz6;
import a.hjc;
import a.ijc;
import a.jjc;
import a.ku5;
import a.nhf0;
import a.pj80;
import a.sj3;
import a.tk80;
import a.xp6;
import a.yge0;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class CircleIndicator extends LinearLayout {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijc f47185a;
    public final xp6 b;
    public final gz6 c;
    public final hjc d;
    public final hjc e;
    public tk80 f;
    public RecyclerView g;
    public ViewPager2 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public final ku5 m;
    public final nhf0 n;

    /* JADX WARN: Illegal instructions before constructor call */
    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        Animator animatorLoadAnimator;
        Animator animatorLoadAnimator2;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, 0);
        this.f47185a = new ijc(this);
        byte b = 1;
        this.b = new xp6(this, b);
        this.c = new gz6(this, b);
        this.d = new hjc(this, (byte) 0);
        this.e = new hjc(this, b);
        this.i = -1;
        this.j = -1;
        this.k = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, aqd0.g);
        typedArrayObtainStyledAttributes.getClass();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.animator.scale_with_alpha);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.white_radius);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(3, resourceId3);
        setOrientation(typedArrayObtainStyledAttributes.getInt(7, -1) == 1 ? (byte) 1 : (byte) 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(4, -1);
        setGravity(i2 < 0 ? 17 : i2);
        dimensionPixelSize3 = dimensionPixelSize3 < 0 ? sj3.X(5) : dimensionPixelSize3;
        int iX = dimensionPixelSize < 0 ? sj3.X(5) : dimensionPixelSize;
        int iX2 = dimensionPixelSize2 < 0 ? sj3.X(5) : dimensionPixelSize2;
        int i3 = resourceId == 0 ? R.animator.scale_with_alpha : resourceId;
        int i4 = i3;
        this.m = new ku5(dimensionPixelSize3, iX, iX2, i3, resourceId2, resourceId3 == 0 ? R.drawable.white_radius : resourceId3, resourceId4 == 0 ? resourceId3 : resourceId4);
        Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(context, i4);
        animatorLoadAnimator3.getClass();
        Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(context, i4);
        animatorLoadAnimator4.getClass();
        animatorLoadAnimator4.setDuration(0L);
        if (resourceId2 == 0) {
            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i4);
            animatorLoadAnimator.setInterpolator(new jjc());
        } else {
            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
            animatorLoadAnimator.getClass();
        }
        if (resourceId2 == 0) {
            animatorLoadAnimator2 = AnimatorInflater.loadAnimator(context, i4);
            animatorLoadAnimator2.setInterpolator(new jjc());
        } else {
            animatorLoadAnimator2 = AnimatorInflater.loadAnimator(context, resourceId2);
            animatorLoadAnimator2.getClass();
        }
        animatorLoadAnimator2.setDuration(0L);
        this.n = new nhf0(animatorLoadAnimator3, animatorLoadAnimator, animatorLoadAnimator4, animatorLoadAnimator2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(int i, int i2, Animator animator) {
        if (animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view = new View(getContext());
        view.setBackground(epv0.U(i2, getContext()));
        ku5 ku5Var = this.m;
        if (ku5Var == null) {
            Intrinsics.h("settings");
            throw null;
        }
        addView(view, ku5Var.c, ku5Var.d);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (i == 0) {
            if (ku5Var == null) {
                Intrinsics.h("settings");
                throw null;
            }
            int i3 = ku5Var.b;
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i3;
        } else {
            if (ku5Var == null) {
                Intrinsics.h("settings");
                throw null;
            }
            int i4 = ku5Var.b;
            layoutParams2.topMargin = i4;
            layoutParams2.bottomMargin = i4;
        }
        view.setLayoutParams(layoutParams2);
        animator.setTarget(view);
        animator.start();
    }

    public final void b(int i) {
        if (this.i == i) {
            return;
        }
        nhf0 nhf0Var = this.n;
        if (nhf0Var == null) {
            Intrinsics.h("animators");
            throw null;
        }
        if (((Animator) nhf0Var.b).isRunning()) {
            if (nhf0Var == null) {
                Intrinsics.h("animators");
                throw null;
            }
            ((Animator) nhf0Var.b).end();
            if (nhf0Var == null) {
                Intrinsics.h("animators");
                throw null;
            }
            ((Animator) nhf0Var.b).cancel();
        }
        if (nhf0Var == null) {
            Intrinsics.h("animators");
            throw null;
        }
        if (((Animator) nhf0Var.f23530a).isRunning()) {
            if (nhf0Var == null) {
                Intrinsics.h("animators");
                throw null;
            }
            ((Animator) nhf0Var.f23530a).end();
            if (nhf0Var == null) {
                Intrinsics.h("animators");
                throw null;
            }
            ((Animator) nhf0Var.f23530a).cancel();
        }
        View childAt = getChildAt(this.i);
        int i2 = this.i;
        ku5 ku5Var = this.m;
        if (i2 >= 0 && childAt != null) {
            Context context = getContext();
            if (ku5Var == null) {
                Intrinsics.h("settings");
                throw null;
            }
            childAt.setBackground(epv0.U(ku5Var.f, context));
            if (nhf0Var == null) {
                Intrinsics.h("animators");
                throw null;
            }
            ((Animator) nhf0Var.b).setTarget(childAt);
            if (nhf0Var == null) {
                Intrinsics.h("animators");
                throw null;
            }
            ((Animator) nhf0Var.b).start();
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            Context context2 = getContext();
            if (ku5Var == null) {
                Intrinsics.h("settings");
                throw null;
            }
            childAt2.setBackground(epv0.U(ku5Var.e, context2));
            if (nhf0Var == null) {
                Intrinsics.h("animators");
                throw null;
            }
            ((Animator) nhf0Var.f23530a).setTarget(childAt2);
            if (nhf0Var == null) {
                Intrinsics.h("animators");
                throw null;
            }
            ((Animator) nhf0Var.f23530a).start();
        }
        this.i = i;
    }

    public final void c() {
        yge0 adapter;
        ViewPager2 viewPager2 = this.h;
        if (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) {
            return;
        }
        if (adapter.f42580a.a()) {
            adapter.y(this.e);
        }
        ViewPager2 viewPager3 = this.h;
        if (viewPager3 != null) {
            viewPager3.g(this.b);
        }
    }

    public final void d() {
        removeAllViews();
        int i = this.k;
        if (i >= 2) {
            this.i = this.j;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = this.j;
                nhf0 nhf0Var = this.n;
                ku5 ku5Var = this.m;
                if (i3 == i2) {
                    int orientation = getOrientation();
                    if (ku5Var == null) {
                        Intrinsics.h("settings");
                        throw null;
                    }
                    int i4 = ku5Var.e;
                    if (nhf0Var == null) {
                        Intrinsics.h("animators");
                        throw null;
                    }
                    a(orientation, i4, (Animator) nhf0Var.c);
                } else {
                    int orientation2 = getOrientation();
                    if (ku5Var == null) {
                        Intrinsics.h("settings");
                        throw null;
                    }
                    int i5 = ku5Var.f;
                    if (nhf0Var == null) {
                        Intrinsics.h("animators");
                        throw null;
                    }
                    a(orientation2, i5, (Animator) nhf0Var.d);
                }
            }
        }
    }

    public final int e(b bVar) {
        if (bVar == null) {
            return -1;
        }
        tk80 tk80Var = this.f;
        View viewE = tk80Var != null ? tk80Var.e(bVar) : null;
        if (viewE == null) {
            return -1;
        }
        return b.T(viewE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            recyclerView.u0(this.c);
        }
        ViewPager2 viewPager2 = this.h;
        if (viewPager2 != null) {
            viewPager2.g(this.b);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_KEY_SUPER"));
            if (bundle.getInt("BUNDLE_KEY_INFO_POSITION") != 0) {
                this.l = bundle.getInt("BUNDLE_KEY_INFO_POSITION");
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        int i = this.i;
        if (i != -1) {
            bundle.putInt("BUNDLE_KEY_INFO_POSITION", i);
        }
        bundle.putParcelable("BUNDLE_KEY_SUPER", super.onSaveInstanceState());
        return bundle;
    }

    public final void setViewPager(ViewPager viewPager) {
        viewPager.getClass();
        pj80 adapter = viewPager.getAdapter();
        if (adapter != null) {
            this.i = -1;
            this.k = adapter.c();
            this.j = viewPager.getCurrentItem();
            d();
            ArrayList arrayList = viewPager.u1;
            ijc ijcVar = this.f47185a;
            if (arrayList != null) {
                arrayList.remove(ijcVar);
            }
            ArrayList arrayList2 = viewPager.u1;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                viewPager.u1 = arrayList2;
            }
            arrayList2.add(ijcVar);
            ijcVar.c(viewPager.getCurrentItem());
        }
    }

    public final void setViewPager2(ViewPager2 viewPager2) {
        viewPager2.getClass();
        this.h = viewPager2;
        yge0 adapter = viewPager2.getAdapter();
        if (adapter != null) {
            adapter.v(this.e);
            this.i = -1;
            this.k = adapter.d();
            this.j = viewPager2.getCurrentItem();
            d();
            xp6 xp6Var = this.b;
            viewPager2.c(xp6Var);
            xp6Var.c(viewPager2.getCurrentItem());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleIndicator(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
