package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class kxj extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f19058a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rnk0 d;
    public final /* synthetic */ lxj e;

    public kxj(ViewGroup viewGroup, View view, boolean z, rnk0 rnk0Var, lxj lxjVar) {
        this.f19058a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = rnk0Var;
        this.e = lxjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.f19058a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        rnk0 rnk0Var = this.d;
        if (z || rnk0Var.f30792a == tnk0.d) {
            tnk0 tnk0Var = rnk0Var.f30792a;
            view.getClass();
            tnk0Var.a(view, viewGroup);
        }
        lxj lxjVar = this.e;
        ((rnk0) lxjVar.c.b).c(lxjVar);
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Animator from operation " + rnk0Var + " has ended.");
        }
    }
}
