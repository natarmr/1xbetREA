package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class apb extends AnimatorListenerAdapter implements dms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f1243a;
    public final Rect b;
    public final View c;

    public apb(Rect rect, Rect rect2, View view) {
        this.c = view;
        this.f1243a = rect;
        this.b = rect2;
    }

    @Override // a.dms0
    public final void a() {
        View view = this.c;
        Rect clipBounds = view.getClipBounds();
        if (clipBounds == null) {
            clipBounds = bpb.k1;
        }
        view.setTag(R.id.transition_clip, clipBounds);
        view.setClipBounds(this.b);
    }

    @Override // a.dms0
    public final void d() {
        View view = this.c;
        view.setClipBounds((Rect) view.getTag(R.id.transition_clip));
        view.setTag(R.id.transition_clip, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        View view = this.c;
        if (z) {
            view.setClipBounds(this.f1243a);
        } else {
            view.setClipBounds(this.b);
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
    public final void g(gms0 gms0Var) {
    }
}
