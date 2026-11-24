package a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class ieq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14646a;

    public ieq(Context context) {
        this.f14646a = context;
    }

    public final void a(cu cuVar, s88 s88Var) {
        CancellationSignal cancellationSignal;
        if (s88Var != null) {
            synchronized (s88Var) {
                try {
                    if (((CancellationSignal) s88Var.c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        s88Var.c = cancellationSignal2;
                        if (s88Var.b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) s88Var.c;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            cancellationSignal = null;
        }
        FingerprintManager fingerprintManagerB = geq.b(this.f14646a);
        if (fingerprintManagerB != null) {
            geq.a(fingerprintManagerB, geq.e(cuVar), cancellationSignal, new feq());
        }
    }
}
