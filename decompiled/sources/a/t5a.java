package a;

import android.os.CancellationSignal;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class t5a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CancellationSignal f33358a;
    public s88 b;

    public final void a() {
        CancellationSignal cancellationSignal = this.f33358a;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.cancel();
            } catch (NullPointerException e) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
            }
            this.f33358a = null;
        }
        s88 s88Var = this.b;
        if (s88Var != null) {
            try {
                s88Var.h();
            } catch (NullPointerException e2) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
            }
            this.b = null;
        }
    }
}
