package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class fzm0 extends ox30 implements SubMenu {
    public final hz30 A;
    public final ox30 z;

    public fzm0(Context context, ox30 ox30Var, hz30 hz30Var) {
        super(context);
        this.z = ox30Var;
        this.A = hz30Var;
    }

    @Override // a.ox30
    public final boolean d(hz30 hz30Var) {
        return this.z.d(hz30Var);
    }

    @Override // a.ox30
    public final boolean e(ox30 ox30Var, MenuItem menuItem) {
        return super.e(ox30Var, menuItem) || this.z.e(ox30Var, menuItem);
    }

    @Override // a.ox30
    public final boolean f(hz30 hz30Var) {
        return this.z.f(hz30Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // a.ox30
    public final String j() {
        int i = this.A.f13889a;
        if (i == 0) {
            return null;
        }
        return twn.m(i, "android:menu:actionviewstates:");
    }

    @Override // a.ox30
    public final ox30 k() {
        return this.z.k();
    }

    @Override // a.ox30
    public final boolean m() {
        return this.z.m();
    }

    @Override // a.ox30
    public final boolean n() {
        return this.z.n();
    }

    @Override // a.ox30
    public final boolean o() {
        return this.z.o();
    }

    @Override // a.ox30, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // a.ox30, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
