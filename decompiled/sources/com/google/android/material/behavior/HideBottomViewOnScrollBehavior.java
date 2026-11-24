package com.google.android.material.behavior;

import a.bc0;
import a.g7x;
import a.n6x;
import a.n73;
import a.rw2;
import a.xwv;
import a.yke;
import a.ywv;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends yke {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public xwv h;
    public ViewPropertyAnimator k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f45559a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public byte j = 2;
    public int l = 0;
    public int m = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // a.yke
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = n6x.T(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = n6x.T(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = g7x.W(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, n73.d);
        this.e = g7x.W(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, n73.c);
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.g = accessibilityManager;
        }
        if (accessibilityManager != null && this.h == null) {
            xwv xwvVar = new xwv(this, view, (byte) 0);
            this.h = xwvVar;
            accessibilityManager.addTouchExplorationStateChangeListener(xwvVar);
            view.addOnAttachStateChangeListener(new bc0(this, (byte) 7));
        }
        return false;
    }

    @Override // a.yke
    public final void q(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                x(view);
            }
        } else {
            if (this.j == 1) {
                return;
            }
            if (this.i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            y(view, 1);
            this.k = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new ywv(this, view, (byte) 0));
        }
    }

    @Override // a.yke
    public boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void x(View view) {
        if (this.j == 2) {
            return;
        }
        y(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.k = view.animate().translationY(0.0f).setInterpolator(this.d).setDuration(this.b).setListener(new ywv(this, view, (byte) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(View view, int i) {
        this.j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        Iterator it = this.f45559a.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
