package a;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class phv0 extends xj implements mx30 {
    public final Context d;
    public final ox30 e;
    public xex f;
    public WeakReference g;
    public final /* synthetic */ qhv0 h;

    public phv0(qhv0 qhv0Var, Context context, xex xexVar) {
        this.h = qhv0Var;
        this.d = context;
        this.f = xexVar;
        ox30 ox30Var = new ox30(context);
        ox30Var.l = true;
        this.e = ox30Var;
        ox30Var.e = this;
    }

    @Override // a.mx30
    public final void a(ox30 ox30Var) {
        if (this.f == null) {
            return;
        }
        k();
        xi xiVar = this.h.f.d;
        if (xiVar != null) {
            xiVar.l();
        }
    }

    @Override // a.xj
    public final void c() {
        qhv0 qhv0Var = this.h;
        if (qhv0Var.i != this) {
            return;
        }
        if (qhv0Var.p) {
            qhv0Var.j = this;
            qhv0Var.k = this.f;
        } else {
            this.f.K(this);
        }
        this.f = null;
        qhv0Var.a(false);
        ActionBarContextView actionBarContextView = qhv0Var.f;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        qhv0Var.c.setHideOnContentScrollEnabled(qhv0Var.u);
        qhv0Var.i = null;
    }

    @Override // a.xj
    public final View d() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // a.mx30
    public final boolean f(ox30 ox30Var, MenuItem menuItem) {
        xex xexVar = this.f;
        if (xexVar != null) {
            return ((z220) xexVar.f40764a).H(this, menuItem);
        }
        return false;
    }

    @Override // a.xj
    public final ox30 g() {
        return this.e;
    }

    @Override // a.xj
    public final MenuInflater h() {
        return new njn0(this.d);
    }

    @Override // a.xj
    public final CharSequence i() {
        return this.h.f.getSubtitle();
    }

    @Override // a.xj
    public final CharSequence j() {
        return this.h.f.getTitle();
    }

    @Override // a.xj
    public final void k() {
        if (this.h.i != this) {
            return;
        }
        ox30 ox30Var = this.e;
        ox30Var.w();
        try {
            this.f.L(this, ox30Var);
        } finally {
            ox30Var.v();
        }
    }

    @Override // a.xj
    public final boolean l() {
        return this.h.f.s;
    }

    @Override // a.xj
    public final void n(View view) {
        this.h.f.setCustomView(view);
        this.g = new WeakReference(view);
    }

    @Override // a.xj
    public final void o(int i) {
        p(this.h.f28761a.getResources().getString(i));
    }

    @Override // a.xj
    public final void p(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // a.xj
    public final void q(int i) {
        r(this.h.f28761a.getResources().getString(i));
    }

    @Override // a.xj
    public final void r(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override // a.xj
    public final void s(boolean z) {
        this.b = z;
        this.h.f.setTitleOptional(z);
    }
}
