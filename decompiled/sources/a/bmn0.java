package a;

import android.gov.nist.core.Separators;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class bmn0 extends hzj {
    public final wu9 n;
    public final tu9 o;
    public hzj p;
    public imn0 q;

    public bmn0(int i, Size size) {
        super(i, size);
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = hne.class;
        try {
            this.o = tu9Var;
            tu9Var.f34540a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            wu9Var.b(e);
        }
        this.n = wu9Var;
    }

    @Override // a.hzj
    public final void a() {
        super.a();
        ofm0.w(new yln0(this, (byte) 2));
    }

    @Override // a.hzj
    public final ig00 f() {
        return this.n;
    }

    public final boolean g(hzj hzjVar, Runnable runnable) {
        boolean z;
        Size size = this.h;
        ofm0.m();
        hzjVar.getClass();
        int i = hzjVar.i;
        Size size2 = hzjVar.h;
        hzj hzjVar2 = this.p;
        if (hzjVar2 == hzjVar) {
            return false;
        }
        z1x.y("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", hzjVar2 == null);
        z1x.t("The provider's size(" + size + ") must match the parent(" + size2 + Separators.RPAREN, size.equals(size2));
        int i2 = this.i;
        z1x.t(ohs0.m("The provider's format(", i2, ") must match the parent(", Separators.RPAREN, i), i2 == i);
        synchronized (this.f13909a) {
            z = this.c;
        }
        z1x.y("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.p = hzjVar;
        ro4.e0(true, hzjVar.c(), this.o, bnk.a());
        hzjVar.d();
        ro4.c0(this.e).a(new zln0(hzjVar, (byte) 1), bnk.a());
        ro4.c0(hzjVar.g).a(runnable, j120.T());
        return true;
    }
}
