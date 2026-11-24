package a;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes4.dex */
public final class lw20 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20742a;
    public final /* synthetic */ f730 b;

    public /* synthetic */ lw20(f730 f730Var, byte b) {
        this.f20742a = b;
        this.b = f730Var;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        byte b = this.f20742a;
        f730 f730Var = this.b;
        menuItem.getClass();
        switch (b) {
            case 0:
                p7m0 p7m0Var = f730Var.q;
                ((z630) p7m0Var.getValue()).getClass();
                p7m0Var.o(null, new z630(true));
                break;
            default:
                f730Var.k.g(wgh0.MARKET_SET);
                f730Var.l.C("market_set");
                break;
        }
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        byte b = this.f20742a;
        menuItem.getClass();
        switch (b) {
            case 0:
                p7m0 p7m0Var = this.b.q;
                ((z630) p7m0Var.getValue()).getClass();
                p7m0Var.o(null, new z630(false));
                break;
        }
        return true;
    }
}
