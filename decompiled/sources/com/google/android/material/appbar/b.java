package com.google.android.material.appbar;

import a.ble;
import a.d7;
import a.k7;
import a.p6;
import a.tb3;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p6 {
    public final /* synthetic */ AppBarLayout d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout.BaseBehavior f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f = baseBehavior;
        this.d = appBarLayout;
        this.e = coordinatorLayout;
    }

    @Override // a.p6
    public final void d(View view, k7 k7Var) {
        View childAt;
        this.f26429a.onInitializeAccessibilityNodeInfo(view, k7Var.f17795a);
        k7Var.j(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.e;
        int childCount = coordinatorLayout.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = coordinatorLayout.getChildAt(i);
            if (((ble) childAt.getLayoutParams()).f2790a instanceof AppBarLayout.ScrollingViewBehavior) {
                break;
            } else {
                i++;
            }
        }
        if (childAt == null) {
            return;
        }
        int childCount2 = appBarLayout.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            if (((tb3) appBarLayout.getChildAt(i2).getLayoutParams()).f33642a != 0) {
                AppBarLayout.BaseBehavior baseBehavior = this.f;
                if (baseBehavior.A() != (-appBarLayout.getTotalScrollRange())) {
                    k7Var.b(d7.h);
                    k7Var.n(true);
                }
                if (baseBehavior.A() != 0) {
                    if (!childAt.canScrollVertically(-1)) {
                        k7Var.b(d7.i);
                        k7Var.n(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            k7Var.b(d7.i);
                            k7Var.n(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // a.p6
    public final boolean g(View view, int i, Bundle bundle) {
        View childAt;
        AppBarLayout appBarLayout = this.d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        if (baseBehavior.A() != 0) {
            CoordinatorLayout coordinatorLayout = this.e;
            int childCount = coordinatorLayout.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = coordinatorLayout.getChildAt(i2);
                if (((ble) childAt.getLayoutParams()).f2790a instanceof AppBarLayout.ScrollingViewBehavior) {
                    break;
                }
                i2++;
            }
            View view2 = childAt;
            if (!view2.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i3 = -appBarLayout.getDownNestedPreScrollRange();
            if (i3 != 0) {
                baseBehavior.I(coordinatorLayout, this.d, view2, i3, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
