package a;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class i2e implements h2e {
    public final ConnectivityManager b;

    public i2e(ConnectivityManager connectivityManager) {
        this.b = connectivityManager;
    }

    @Override // a.h2e
    public final boolean a() {
        ConnectivityManager connectivityManager = this.b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
