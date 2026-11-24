package a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uoj0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uoj0 f36019a = new uoj0();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static void a() {
        ArrayList<Pair> arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        Function1 function1 = (Function1) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        uoj0 uoj0Var = f36019a;
                        NetworkCapabilities networkCapabilities = d;
                        uoj0Var.getClass();
                        Boolean bool = f;
                        bool.getClass();
                        arrayList.add(new Pair(function1, !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities) ? u4e.f35042a : new v4e(7)));
                    }
                    for (Pair pair : arrayList) {
                        ((Function1) pair.f46059a).invoke((w4e) pair.b);
                    }
                    return;
                }
                wv00.f().a(pov0.f27347a, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            if (Intrinsics.d(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(new v4e(7));
            }
        }
    }
}
