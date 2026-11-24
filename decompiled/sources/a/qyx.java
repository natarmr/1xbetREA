package a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qyx implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29555a;
    public final float b;
    public final float c;
    public final float d;
    public final xhe0 e;
    public final byte f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ xhe0 o;
    public final /* synthetic */ vyx p;

    /* JADX WARN: Multi-variable type inference failed */
    public qyx(vyx vyxVar, xhe0 xhe0Var, int i, float f, float f2, float f3, float f4, int i2, xhe0 xhe0Var2) {
        this.p = vyxVar;
        this.n = i2;
        this.o = xhe0Var2;
        this.f = i;
        this.e = xhe0Var;
        this.f29555a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new mo8(this, (byte) 3));
        valueAnimatorOfFloat.setTarget(xhe0Var.f40887a);
        valueAnimatorOfFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.q(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        xhe0 xhe0Var = this.o;
        vyx vyxVar = this.p;
        if (i <= 0) {
            vyxVar.m.getClass();
            syx.d(xhe0Var);
        } else {
            vyxVar.f38271a.add(xhe0Var.f40887a);
            this.h = true;
            if (i > 0) {
                vyxVar.q.post(new mfr(vyxVar, this, i));
            }
        }
        View view = vyxVar.v;
        View view2 = xhe0Var.f40887a;
        if (view == view2 && view2 == view) {
            vyxVar.v = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
