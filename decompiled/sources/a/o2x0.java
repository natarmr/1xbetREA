package a;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class o2x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24553a;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzr b;
    public final /* synthetic */ a4x0 c;

    public /* synthetic */ o2x0(a4x0 a4x0Var, com.google.android.gms.measurement.internal.zzr zzrVar, byte b) {
        this.f24553a = b;
        this.b = zzrVar;
        this.c = a4x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f24553a;
        com.google.android.gms.measurement.internal.zzr zzrVar = this.b;
        a4x0 a4x0Var = this.c;
        switch (b) {
            case 0:
                kxw0 kxw0Var = (kxw0) a4x0Var.b;
                gtw0 gtw0Var = a4x0Var.e;
                if (gtw0Var != null) {
                    try {
                        gtw0Var.q(zzrVar);
                    } catch (RemoteException e) {
                        uuw0 uuw0Var = kxw0Var.f;
                        kxw0.g(uuw0Var);
                        uuw0Var.g.b(e, "Failed to reset data on the service: remote exception");
                    }
                    a4x0Var.y1();
                } else {
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                kxw0 kxw0Var2 = (kxw0) a4x0Var.b;
                gtw0 gtw0Var2 = a4x0Var.e;
                if (gtw0Var2 == null) {
                    uuw0 uuw0Var3 = kxw0Var2.f;
                    kxw0.g(uuw0Var3);
                    uuw0Var3.j.a("Failed to send app backgrounded");
                } else {
                    try {
                        gtw0Var2.x(zzrVar);
                        a4x0Var.y1();
                    } catch (RemoteException e2) {
                        uuw0 uuw0Var4 = kxw0Var2.f;
                        kxw0.g(uuw0Var4);
                        uuw0Var4.g.b(e2, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            default:
                kxw0 kxw0Var3 = (kxw0) a4x0Var.b;
                gtw0 gtw0Var3 = a4x0Var.e;
                if (gtw0Var3 == null) {
                    uuw0 uuw0Var5 = kxw0Var3.f;
                    kxw0.g(uuw0Var5);
                    uuw0Var5.g.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        gtw0Var3.j(zzrVar);
                        a4x0Var.y1();
                    } catch (RemoteException e3) {
                        uuw0 uuw0Var6 = kxw0Var3.f;
                        kxw0.g(uuw0Var6);
                        uuw0Var6.g.b(e3, "Failed to send measurementEnabled to the service");
                    }
                }
                break;
        }
    }
}
