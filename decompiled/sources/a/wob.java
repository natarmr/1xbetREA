package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class wob extends AnimatorListenerAdapter implements dms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f39486a;
    public final Rect b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public boolean n;

    public wob(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f39486a = view;
        this.b = rect;
        this.c = z;
        this.d = rect2;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
    }

    @Override // a.dms0
    public final void a() {
        View view = this.f39486a;
        view.setTag(R.id.transition_clip, view.getClipBounds());
        view.setClipBounds(this.e ? null : this.d);
    }

    @Override // a.dms0
    public final void d() {
        View view = this.f39486a;
        Rect rect = (Rect) view.getTag(R.id.transition_clip);
        view.setTag(R.id.transition_clip, null);
        view.setClipBounds(rect);
    }

    @Override // a.dms0
    public final void g(gms0 gms0Var) {
        this.n = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.n) {
            return;
        }
        Rect rect = null;
        if (z) {
            if (!this.c) {
                rect = this.b;
            }
        } else if (!this.e) {
            rect = this.d;
        }
        View view = this.f39486a;
        view.setClipBounds(rect);
        if (z) {
            bmu0.a(view, this.f, this.g, this.h, this.i);
        } else {
            bmu0.a(view, this.j, this.k, this.l, this.m);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        int i = this.h;
        int i2 = this.f;
        int i3 = this.l;
        int i4 = this.j;
        int iMax = Math.max(i - i2, i3 - i4);
        int i5 = this.i;
        int i6 = this.g;
        int i7 = this.m;
        int i8 = this.k;
        int iMax2 = Math.max(i5 - i6, i7 - i8);
        if (z) {
            i2 = i4;
        }
        if (z) {
            i6 = i8;
        }
        View view = this.f39486a;
        bmu0.a(view, i2, i6, iMax + i2, iMax2 + i6);
        view.setClipBounds(z ? this.d : this.b);
    }

    @Override // a.dms0
    public final void b(gms0 gms0Var) {
    }

    @Override // a.dms0
    public final void c(gms0 gms0Var) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        onAnimationStart(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
