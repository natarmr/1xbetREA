package a;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r3x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29808a;
    public final /* synthetic */ a4x0 b;

    public /* synthetic */ r3x0(a4x0 a4x0Var, byte b) {
        this.f29808a = b;
        this.b = a4x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f29808a;
        a4x0 a4x0Var = this.b;
        switch (b) {
            case 0:
                a4x0Var.r1();
                break;
            case 1:
                kxw0 kxw0Var = (kxw0) a4x0Var.b;
                gtw0 gtw0Var = a4x0Var.e;
                if (gtw0Var == null) {
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.g.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        gtw0Var.l(a4x0Var.B1(false));
                        a4x0Var.y1();
                    } catch (RemoteException e) {
                        uuw0 uuw0Var2 = kxw0Var.f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.g.b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                kxw0 kxw0Var2 = (kxw0) a4x0Var.b;
                gtw0 gtw0Var2 = a4x0Var.e;
                if (gtw0Var2 == null) {
                    uuw0 uuw0Var3 = kxw0Var2.f;
                    kxw0.g(uuw0Var3);
                    uuw0Var3.g.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        gtw0Var2.i(a4x0Var.B1(false));
                        a4x0Var.y1();
                    } catch (RemoteException e2) {
                        uuw0 uuw0Var4 = kxw0Var2.f;
                        kxw0.g(uuw0Var4);
                        uuw0Var4.g.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
