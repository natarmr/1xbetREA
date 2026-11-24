package a;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class yku0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42809a;
    public final /* synthetic */ qbe0 b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ n5a d;

    public yku0(qbe0 qbe0Var, ViewTreeObserver viewTreeObserver, n5a n5aVar) {
        this.b = qbe0Var;
        this.c = viewTreeObserver;
        this.d = n5aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        qbe0 qbe0Var = this.b;
        f7k0 f7k0VarB = qbe0Var.b();
        if (f7k0VarB != null) {
            ViewTreeObserver viewTreeObserver = this.c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                qbe0Var.b.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f42809a) {
                this.f42809a = true;
                e0g0 e0g0Var = j0g0.b;
                this.d.resumeWith(f7k0VarB);
            }
        }
        return true;
    }
}
