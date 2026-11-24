package a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o1e extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24474a;
    public final Object b;

    public o1e(rw40 rw40Var) {
        this.f24474a = (byte) 1;
        this.b = rw40Var;
    }

    public void a() {
        p1e p1eVar = (p1e) this.b;
        ConcurrentHashMap.KeySetView keySetView = p1eVar.e;
        keySetView.getClass();
        boolean z = !keySetView.isEmpty();
        twn.A(z, p1eVar.b, null);
        twn.A(z, p1eVar.c, null);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f24474a) {
            case 0:
                network.getClass();
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.f24474a) {
            case 2:
                network.getClass();
                if (network.equals(((rl50) this.b).g.getActiveNetwork())) {
                    wv00.f().a(ql50.f28917a, "Network blocked status changed: " + z);
                    rl50 rl50Var = (rl50) this.b;
                    Object objD = rl50Var.e;
                    if (objD == null) {
                        objD = rl50Var.d();
                    }
                    pl50 pl50Var = (pl50) objD;
                    rl50 rl50Var2 = (rl50) this.b;
                    synchronized (rl50Var2.h) {
                        if (rl50Var2.i == z) {
                            return;
                        }
                        rl50Var2.i = z;
                        ((rl50) this.b).f(new pl50(pl50Var.f27167a, pl50Var.b, pl50Var.c, pl50Var.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f24474a) {
            case 0:
                ConcurrentHashMap.KeySetView keySetView = ((p1e) this.b).e;
                network.getClass();
                networkCapabilities.getClass();
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                boolean zHasCapability2 = networkCapabilities.hasCapability(16);
                if (zHasCapability && zHasCapability2) {
                    keySetView.add(network);
                } else {
                    keySetView.remove(network);
                }
                a();
                break;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((rw40) this.b).invoke(u4e.f35042a);
                break;
            default:
                network.getClass();
                networkCapabilities.getClass();
                wv00.f().a(ql50.f28917a, "Network capabilities changed: " + networkCapabilities);
                rl50 rl50Var = (rl50) this.b;
                rl50Var.f(ql50.a(rl50Var.g, rl50Var.i));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        byte b = this.f24474a;
        Object obj = this.b;
        network.getClass();
        switch (b) {
            case 0:
                ((p1e) obj).e.remove(network);
                a();
                break;
            case 1:
                wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController onLost callback");
                ((rw40) obj).invoke(new v4e(7));
                break;
            default:
                wv00.f().a(ql50.f28917a, "Network connection lost");
                ((rl50) obj).f(new pl50(false, false, false, false, false));
                break;
        }
    }

    public /* synthetic */ o1e(Object obj, byte b) {
        this.f24474a = b;
        this.b = obj;
    }
}
