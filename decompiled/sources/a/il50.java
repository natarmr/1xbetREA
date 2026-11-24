package a;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class il50 implements y2e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f14959a;

    public il50(ConnectivityManager connectivityManager) {
        this.f14959a = connectivityManager;
    }

    @Override // a.y2e
    public final boolean a(ppv0 ppv0Var) {
        if (!b(ppv0Var)) {
            return false;
        }
        jf4.n("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // a.y2e
    public final boolean b(ppv0 ppv0Var) {
        ppv0Var.getClass();
        return (ppv0Var.j.a() == null && ppv0Var.j.f24629a == sl50.f32381a) ? false : true;
    }

    @Override // a.y2e
    public final bq9 c(o4e o4eVar) {
        o4eVar.getClass();
        return nkb.y(new hk40((Object) o4eVar, (Object) this, (yje) null, (byte) 10));
    }
}
