package com.google.android.material.appbar;

import a.biq;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/material/appbar/FixFlingBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FixFlingBehavior extends AppBarLayout.Behavior {
    public boolean p;
    public OverScroller q;
    public final biq r;
    public boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixFlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.r = new biq(context, this);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, a.aqv
    /* JADX INFO: renamed from: F */
    public final boolean z(AppBarLayout appBarLayout) {
        return this.s && super.z(appBarLayout);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, a.aqv
    /* JADX INFO: renamed from: H */
    public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        appBarLayout.getClass();
        super.B(coordinatorLayout, appBarLayout);
        this.p = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, a.yke
    /* JADX INFO: renamed from: J */
    public final boolean u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        OverScroller overScroller;
        biq biqVar;
        view.getClass();
        view2.getClass();
        if (this.p && (overScroller = this.d) != (biqVar = this.r)) {
            this.q = overScroller;
            this.d = biqVar;
        }
        return this.s && super.u(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, a.aqv
    /* JADX INFO: renamed from: L */
    public final int C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
        appBarLayout.getClass();
        this.p = i2 == Integer.MIN_VALUE && i3 == Integer.MAX_VALUE;
        if (this.d == this.r) {
            this.d = this.q;
        }
        return super.C(coordinatorLayout, appBarLayout, i, i2, i3);
    }

    @Override // a.yke
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FixFlingBehavior(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ FixFlingBehavior(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
