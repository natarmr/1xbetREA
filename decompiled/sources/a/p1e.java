package a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p1e implements m1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final umx f26197a;
    public final p7m0 b = q7m0.a(Boolean.TRUE);
    public final p7m0 c = q7m0.a(null);
    public final ConnectivityManager d;
    public final ConcurrentHashMap.KeySetView e;
    public final o1e f;

    public p1e(us00 us00Var, umx umxVar) {
        this.f26197a = umxVar;
        Object systemService = us00Var.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.d = connectivityManager;
        this.e = ConcurrentHashMap.newKeySet();
        o1e o1eVar = new o1e(this, (byte) 0);
        this.f = o1eVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), o1eVar);
        Network[] allNetworks = connectivityManager.getAllNetworks();
        allNetworks.getClass();
        boolean z = false;
        for (Network network : allNetworks) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                this.e.add(network);
                z = true;
            }
        }
        if (z) {
            return;
        }
        p7m0 p7m0Var = this.b;
        Boolean bool = Boolean.FALSE;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        p7m0 p7m0Var2 = this.c;
        p7m0Var2.getClass();
        p7m0Var2.o(null, bool);
    }

    @Override // a.m1e
    public final gmq a() {
        return i120.W(aoq.c(e(new i89(this.c, (byte) 22)), new n1e(3, null)));
    }

    @Override // a.m1e
    public final gmq b() {
        return i120.W(aoq.c(e(this.b), new n1e(3, null)));
    }

    @Override // a.m1e
    public final boolean c() {
        boolean zBooleanValue = ((Boolean) this.b.getValue()).booleanValue();
        umx umxVar = this.f26197a;
        if (((Boolean) umxVar.f35937a.getValue()).booleanValue()) {
            return zBooleanValue && ((Boolean) umxVar.b.getValue()).booleanValue();
        }
        return zBooleanValue;
    }

    @Override // a.m1e
    public final void d() {
        this.d.unregisterNetworkCallback(this.f);
        this.e.clear();
    }

    public final gmq e(gmq gmqVar) {
        umx umxVar = this.f26197a;
        return ((Boolean) umxVar.f35937a.getValue()).booleanValue() ? new p6d(gmqVar, vtb.N(umxVar.b), new t82(3, null, (byte) 2), (byte) 1) : gmqVar;
    }
}
