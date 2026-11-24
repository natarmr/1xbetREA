package a;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class tl60 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f34129a;
    public ViewTreeObserver b;
    private final Runnable c;

    public tl60(View view, Runnable runnable) {
        this.f34129a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            hny.u("view == null");
            return;
        }
        tl60 tl60Var = new tl60(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(tl60Var);
        view.addOnAttachStateChangeListener(tl60Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.f34129a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f34129a.removeOnAttachStateChangeListener(this);
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.f34129a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f34129a.removeOnAttachStateChangeListener(this);
    }
}
