package a;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes6.dex */
public final class rl50 extends b4e {
    public final ConnectivityManager g;
    public final Object h;
    public volatile boolean i;
    public final o1e j;

    public rl50(Context context, fpv0 fpv0Var) {
        super(context, fpv0Var);
        Object systemService = ((Context) this.c).getSystemService("connectivity");
        systemService.getClass();
        this.g = (ConnectivityManager) systemService;
        this.h = new Object();
        this.j = new o1e(this, (byte) 2);
    }

    @Override // a.b4e
    public final Object d() {
        return ql50.a(this.g, this.i);
    }

    @Override // a.b4e
    public final void g() {
        try {
            wv00.f().a(ql50.f28917a, "Registering network callback");
            ConnectivityManager connectivityManager = this.g;
            o1e o1eVar = this.j;
            connectivityManager.getClass();
            o1eVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(o1eVar);
        } catch (IllegalArgumentException e) {
            wv00.f().e(ql50.f28917a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            wv00.f().e(ql50.f28917a, "Received exception while registering network callback", e2);
        }
    }

    @Override // a.b4e
    public final void h() {
        try {
            wv00.f().a(ql50.f28917a, "Unregistering network callback");
            this.g.unregisterNetworkCallback(this.j);
        } catch (IllegalArgumentException e) {
            wv00.f().e(ql50.f28917a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            wv00.f().e(ql50.f28917a, "Received exception while unregistering network callback", e2);
        }
    }
}
