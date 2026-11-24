package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class dwo extends AnimatorListenerAdapter implements dms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6809a;
    public boolean b = false;

    public dwo(View view) {
        this.f6809a = view;
    }

    @Override // a.dms0
    public final void a() {
        View view = this.f6809a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? bmu0.f2855a.z(view) : 0.0f));
    }

    @Override // a.dms0
    public final void d() {
        this.f6809a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        bmu0.b(this.f6809a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.f6809a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        bmu0.b(view, 1.0f);
        bmu0.f2855a.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f6809a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // a.dms0
    public final void b(gms0 gms0Var) {
    }

    @Override // a.dms0
    public final void c(gms0 gms0Var) {
    }

    @Override // a.dms0
    public final void f(gms0 gms0Var) {
    }

    @Override // a.dms0
    public final void g(gms0 gms0Var) {
    }
}
