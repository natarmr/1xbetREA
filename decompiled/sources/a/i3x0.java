package a;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class i3x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14120a;
    public final /* synthetic */ gtw0 b;
    public final /* synthetic */ t3x0 c;

    public /* synthetic */ i3x0(t3x0 t3x0Var, gtw0 gtw0Var, byte b) {
        this.f14120a = b;
        this.b = gtw0Var;
        this.c = t3x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14120a) {
            case 0:
                t3x0 t3x0Var = this.c;
                synchronized (t3x0Var) {
                    try {
                        t3x0Var.f33290a = false;
                        a4x0 a4x0Var = t3x0Var.c;
                        if (!a4x0Var.C1()) {
                            uuw0 uuw0Var = ((kxw0) a4x0Var.b).f;
                            kxw0.g(uuw0Var);
                            uuw0Var.o.a("Connected to service");
                            gtw0 gtw0Var = this.b;
                            a4x0Var.m1();
                            a4x0Var.e = gtw0Var;
                            a4x0Var.y1();
                            a4x0Var.A1();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                t3x0 t3x0Var2 = this.c;
                synchronized (t3x0Var2) {
                    try {
                        t3x0Var2.f33290a = false;
                        a4x0 a4x0Var2 = t3x0Var2.c;
                        if (!a4x0Var2.C1()) {
                            uuw0 uuw0Var2 = ((kxw0) a4x0Var2.b).f;
                            kxw0.g(uuw0Var2);
                            uuw0Var2.n.a("Connected to remote service");
                            gtw0 gtw0Var2 = this.b;
                            a4x0Var2.m1();
                            a4x0Var2.e = gtw0Var2;
                            a4x0Var2.y1();
                            a4x0Var2.A1();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                a4x0 a4x0Var3 = this.c.c;
                ScheduledExecutorService scheduledExecutorService = a4x0Var3.h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    a4x0Var3.h = null;
                    return;
                }
                return;
        }
    }
}
