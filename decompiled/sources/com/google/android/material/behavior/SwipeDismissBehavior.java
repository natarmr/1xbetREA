package com.google.android.material.behavior;

import a.d7;
import a.pmi0;
import a.rgu0;
import a.uon0;
import a.ygu0;
import a.yk50;
import a.yke;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends yke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ygu0 f45561a;
    public yk50 b;
    public boolean c;
    public boolean d;
    public byte e = 2;
    public float f = 0.0f;
    public float g = 0.5f;
    public final uon0 h = new uon0(this);

    @Override // a.yke
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (zO) {
            ygu0 ygu0Var = this.f45561a;
            if (ygu0Var == null) {
                ygu0Var = new ygu0(coordinatorLayout.getContext(), coordinatorLayout, this.h);
                this.f45561a = ygu0Var;
            }
            if (!this.d && ygu0Var.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.yke
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            rgu0.l(view, 1048576);
            rgu0.i(view, 0);
            if (x(view)) {
                rgu0.m(view, d7.k, new pmi0(this));
            }
        }
        return false;
    }

    @Override // a.yke
    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f45561a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f45561a.i(motionEvent);
        return true;
    }

    public boolean x(View view) {
        return true;
    }
}
