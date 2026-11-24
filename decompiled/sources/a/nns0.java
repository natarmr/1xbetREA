package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class nns0 extends AnimatorListenerAdapter implements dms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f23838a;
    public final View b;
    public int[] c;
    public float d;
    public float e;
    public final float f;
    public final float g;
    public boolean h;

    public nns0(View view, View view2, float f, float f2) {
        this.b = view;
        this.f23838a = view2;
        this.f = f;
        this.g = f2;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.c = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, null);
        }
    }

    @Override // a.dms0
    public final void a() {
        int[] iArr = this.c;
        if (iArr == null) {
            iArr = new int[2];
            this.c = iArr;
        }
        View view = this.b;
        view.getLocationOnScreen(iArr);
        this.f23838a.setTag(R.id.transition_position, this.c);
        this.d = view.getTranslationX();
        this.e = view.getTranslationY();
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // a.dms0
    public final void b(gms0 gms0Var) {
        e(gms0Var);
    }

    @Override // a.dms0
    public final void d() {
        float f = this.d;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.e);
    }

    @Override // a.dms0
    public final void e(gms0 gms0Var) {
        if (this.h) {
            return;
        }
        this.f23838a.setTag(R.id.transition_position, null);
    }

    @Override // a.dms0
    public final void g(gms0 gms0Var) {
        this.h = true;
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.h = true;
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // a.dms0
    public final void c(gms0 gms0Var) {
    }
}
