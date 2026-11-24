package a;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class rz30 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f31339a;
    public final /* synthetic */ sz30 b;

    public rz30(sz30 sz30Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = sz30Var;
        this.f31339a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f31339a.onMenuItemActionCollapse(this.b.m(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f31339a.onMenuItemActionExpand(this.b.m(menuItem));
    }
}
