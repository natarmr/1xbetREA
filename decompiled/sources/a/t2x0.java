package a;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t2x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33238a;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzr b;
    public final /* synthetic */ a4x0 c;

    public t2x0(a4x0 a4x0Var, com.google.android.gms.measurement.internal.zzr zzrVar, byte b) {
        this.f33238a = b;
        switch (b) {
            case 1:
                this.b = zzrVar;
                Objects.requireNonNull(a4x0Var);
                this.c = a4x0Var;
                break;
            default:
                this.b = zzrVar;
                this.c = a4x0Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        byte b = this.f33238a;
        com.google.android.gms.measurement.internal.zzr zzrVar = this.b;
        a4x0 a4x0Var = this.c;
        switch (b) {
            case 0:
                gtw0 gtw0Var = a4x0Var.e;
                kxw0 kxw0Var = (kxw0) a4x0Var.b;
                if (gtw0Var == null) {
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.g.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        bkw0 bkw0Var = kxw0Var.d;
                        atw0 atw0Var = btw0.W0;
                        if (bkw0Var.x1(null, atw0Var)) {
                            a4x0Var.D1(gtw0Var, null, zzrVar);
                        }
                        gtw0Var.v(zzrVar);
                        kxw0Var.h().q1();
                        kxw0Var.d.x1(null, atw0Var);
                        a4x0Var.D1(gtw0Var, null, zzrVar);
                        a4x0Var.y1();
                    } catch (RemoteException e) {
                        uuw0 uuw0Var2 = kxw0Var.f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.g.b(e, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            default:
                gtw0 gtw0Var2 = a4x0Var.e;
                kxw0 kxw0Var2 = (kxw0) a4x0Var.b;
                if (gtw0Var2 == null) {
                    uuw0 uuw0Var3 = kxw0Var2.f;
                    kxw0.g(uuw0Var3);
                    uuw0Var3.g.a("Failed to send consent settings to service");
                } else {
                    try {
                        gtw0Var2.B(zzrVar);
                        a4x0Var.y1();
                    } catch (RemoteException e2) {
                        uuw0 uuw0Var4 = kxw0Var2.f;
                        kxw0.g(uuw0Var4);
                        uuw0Var4.g.b(e2, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
