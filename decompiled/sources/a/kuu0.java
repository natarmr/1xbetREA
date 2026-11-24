package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class kuu0 extends AnimatorListenerAdapter implements dms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18931a;
    public final int b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public kuu0(View view, int i) {
        this.f18931a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // a.dms0
    public final void a() {
        h(false);
        if (this.f) {
            return;
        }
        bmu0.c(this.f18931a, this.b);
    }

    @Override // a.dms0
    public final void b(gms0 gms0Var) {
        gms0Var.I(this);
    }

    @Override // a.dms0
    public final void d() {
        h(true);
        if (this.f) {
            return;
        }
        bmu0.c(this.f18931a, 0);
    }

    public final void h(boolean z) {
        ViewGroup viewGroup;
        if (!this.d || this.e == z || (viewGroup = this.c) == null) {
            return;
        }
        this.e = z;
        v2n0.q(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f) {
            bmu0.c(this.f18931a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            bmu0.c(this.f18931a, 0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            bmu0.c(this.f18931a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // a.dms0
    public final void c(gms0 gms0Var) {
    }

    @Override // a.dms0
    public final void g(gms0 gms0Var) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
