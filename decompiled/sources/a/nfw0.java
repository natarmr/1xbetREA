package a;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class nfw0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectionResult f23457a;

    public nfw0(ConnectionResult connectionResult) {
        s0x.B("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.b == 0 || connectionResult.c == null) ? false : true);
        this.f23457a = connectionResult;
    }
}
