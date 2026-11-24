package a;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class b4m0 extends xj implements mx30 {
    public Context d;
    public ActionBarContextView e;
    public xex f;
    public WeakReference g;
    public boolean h;
    public ox30 i;

    @Override // a.mx30
    public final void a(ox30 ox30Var) {
        k();
        xi xiVar = this.e.d;
        if (xiVar != null) {
            xiVar.l();
        }
    }

    @Override // a.xj
    public final void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.K(this);
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
        return ((z220) this.f.f40764a).H(this, menuItem);
    }

    @Override // a.xj
    public final ox30 g() {
        return this.i;
    }

    @Override // a.xj
    public final MenuInflater h() {
        return new njn0(this.e.getContext());
    }

    @Override // a.xj
    public final CharSequence i() {
        return this.e.getSubtitle();
    }

    @Override // a.xj
    public final CharSequence j() {
        return this.e.getTitle();
    }

    @Override // a.xj
    public final void k() {
        this.f.L(this, this.i);
    }

    @Override // a.xj
    public final boolean l() {
        return this.e.s;
    }

    @Override // a.xj
    public final void n(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // a.xj
    public final void o(int i) {
        p(this.d.getString(i));
    }

    @Override // a.xj
    public final void p(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // a.xj
    public final void q(int i) {
        r(this.d.getString(i));
    }

    @Override // a.xj
    public final void r(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // a.xj
    public final void s(boolean z) {
        this.b = z;
        this.e.setTitleOptional(z);
    }
}
