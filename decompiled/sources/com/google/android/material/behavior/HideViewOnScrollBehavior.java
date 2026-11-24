package com.google.android.material.behavior;

import a.bc0;
import a.ble;
import a.g7x;
import a.jf4;
import a.n6x;
import a.n73;
import a.rw2;
import a.ua80;
import a.vbc;
import a.xwv;
import a.yke;
import a.ywv;
import a.zwv;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends yke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vbc f45560a;
    public AccessibilityManager b;
    public xwv c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public byte j = 2;
    public int l = 0;
    public int m = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // a.yke
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.b = accessibilityManager;
        }
        if (accessibilityManager != null && this.c == null) {
            xwv xwvVar = new xwv(this, view, (byte) 1);
            this.c = xwvVar;
            accessibilityManager.addTouchExplorationStateChangeListener(xwvVar);
            view.addOnAttachStateChangeListener(new bc0(this, (byte) 8));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((ble) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            x(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            x((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.f45560a.X(view, marginLayoutParams);
        this.e = n6x.T(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = n6x.T(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = g7x.W(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, n73.d);
        this.h = g7x.W(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, n73.c);
        return false;
    }

    @Override // a.yke
    public final void q(int i, int i2, int i3, View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                y(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            z(view, 1);
            this.k = this.f45560a.Z(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new ywv(this, view, (byte) 1));
        }
    }

    @Override // a.yke
    public final boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void x(int i) {
        vbc vbcVar = this.f45560a;
        if (vbcVar == null || vbcVar.Y() != i) {
            if (i == 0) {
                this.f45560a = new zwv((byte) 2);
                return;
            }
            if (i == 1) {
                this.f45560a = new zwv((byte) 0);
            } else if (i == 2) {
                this.f45560a = new zwv((byte) 1);
            } else {
                jf4.o(ua80.e(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
        }
    }

    public final void y(View view) {
        if (this.j == 2) {
            return;
        }
        z(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f45560a.getClass();
        this.k = this.f45560a.Z(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new ywv(this, view, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(View view, int i) {
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
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
