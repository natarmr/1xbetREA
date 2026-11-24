package com.google.android.material.snackbar;

import a.d46;
import a.f46;
import a.fvt0;
import a.n660;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final fvt0 i;

    public BaseTransientBottomBar$Behavior() {
        fvt0 fvt0Var = new fvt0();
        this.f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.e = (byte) 0;
        this.i = fvt0Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, a.yke
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        fvt0 fvt0Var = this.i;
        fvt0Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                n660.q().F((d46) fvt0Var.f10231a);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            n660.q().C((d46) fvt0Var.f10231a);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean x(View view) {
        this.i.getClass();
        return view instanceof f46;
    }
}
