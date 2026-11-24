package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class luu0 extends AnimatorListenerAdapter implements dms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f20693a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ muu0 e;

    public luu0(muu0 muu0Var, ViewGroup viewGroup, View view, View view2) {
        this.e = muu0Var;
        this.f20693a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // a.dms0
    public final void b(gms0 gms0Var) {
        gms0Var.I(this);
    }

    @Override // a.dms0
    public final void g(gms0 gms0Var) {
        if (this.d) {
            h();
        }
    }

    public final void h() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.f20693a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f20693a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.f20693a.getOverlay().add(view);
        } else {
            this.e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f20693a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // a.dms0
    public final void a() {
    }

    @Override // a.dms0
    public final void d() {
    }

    @Override // a.dms0
    public final void c(gms0 gms0Var) {
    }
}
