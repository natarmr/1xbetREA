package a;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes4.dex */
public final class kw20 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18981a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kw20(Object obj, byte b) {
        this.f18981a = b;
        this.b = obj;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        byte b = this.f18981a;
        Object obj = this.b;
        menuItem.getClass();
        switch (b) {
            case 0:
                p7m0 p7m0Var = ((e730) obj).t;
                ((y630) p7m0Var.getValue()).getClass();
                p7m0Var.o(null, new y630(true));
                break;
            case 1:
                e730 e730Var = (e730) obj;
                e730Var.l.g(wgh0.MARKET_SET);
                e730Var.m.C("market_set");
                break;
            default:
                aya ayaVar = (aya) obj;
                bj5 bj5Var = aya.S1;
                ayaVar.I0().y(ayaVar.G0(), "");
                break;
        }
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        byte b = this.f18981a;
        menuItem.getClass();
        switch (b) {
            case 0:
                p7m0 p7m0Var = ((e730) this.b).t;
                ((y630) p7m0Var.getValue()).getClass();
                p7m0Var.o(null, new y630(false));
                break;
        }
        return true;
    }
}
