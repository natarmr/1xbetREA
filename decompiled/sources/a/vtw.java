package a;

import okhttp3.Call;

/* JADX INFO: loaded from: classes7.dex */
public final class vtw extends wtw {
    public final vo9 d;

    public vtw(pmf0 pmf0Var, Call.Factory factory, vke vkeVar, vo9 vo9Var) {
        super(pmf0Var, factory, vkeVar);
        this.d = vo9Var;
    }

    @Override // a.wtw
    public final Object b(jf60 jf60Var, Object[] objArr) {
        to9 to9Var = (to9) this.d.f(jf60Var);
        yje yjeVar = (yje) objArr[objArr.length - 1];
        try {
            n5a n5aVar = new n5a(1, pnx.b(yjeVar));
            n5aVar.r();
            n5aVar.t(new iry(to9Var, (byte) 2));
            to9Var.y(new hru(n5aVar));
            Object objP = n5aVar.p();
            wne wneVar = wne.f39444a;
            return objP;
        } catch (Exception e) {
            k9x.Q(e, yjeVar);
            return wne.f39444a;
        }
    }
}
