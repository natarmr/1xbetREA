package a;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zz3 extends yge0 {
    public final dp d;
    public final yz3 e;

    public zz3(dtb dtbVar) {
        dp dpVar = new dp();
        if (dtbVar == null) {
            hny.u("ItemCallback is null");
            throw null;
        }
        this.e = new yz3(this, dtbVar);
        this.d = dpVar;
    }

    public void A(List list) {
        this.e.b(list, null);
    }

    public final void B(List list, Runnable runnable) {
        this.e.b(list, runnable);
    }

    @Override // a.yge0
    public int d() {
        return this.e.f.size();
    }

    @Override // a.yge0
    public int f(int i) {
        return this.d.d(i, this.e.f);
    }

    @Override // a.yge0
    public void n(xhe0 xhe0Var, int i) {
        this.d.e(this.e.f, i, xhe0Var, null);
    }

    @Override // a.yge0
    public void o(xhe0 xhe0Var, int i, List list) {
        this.d.e(this.e.f, i, xhe0Var, list);
    }

    @Override // a.yge0
    public xhe0 p(ViewGroup viewGroup, int i) {
        return this.d.f(viewGroup, i);
    }

    @Override // a.yge0
    public final boolean r(xhe0 xhe0Var) {
        return this.d.g(xhe0Var);
    }

    @Override // a.yge0
    public final void s(xhe0 xhe0Var) {
        this.d.h(xhe0Var);
    }

    @Override // a.yge0
    public final void t(xhe0 xhe0Var) {
        this.d.i(xhe0Var);
    }

    @Override // a.yge0
    public final void u(xhe0 xhe0Var) {
        this.d.j(xhe0Var);
    }

    public List z() {
        return this.e.f;
    }
}
