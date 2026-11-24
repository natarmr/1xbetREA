package a;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wqm0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ezb0 f39598a;
    public final h6m0 b;
    public final boolean c;
    public final int d;

    public wqm0(ezb0 ezb0Var, h6m0 h6m0Var, boolean z, int i) {
        ezb0Var.getClass();
        h6m0Var.getClass();
        this.f39598a = ezb0Var;
        this.b = h6m0Var;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        nqv0 nqv0VarB;
        boolean z = this.c;
        ezb0 ezb0Var = this.f39598a;
        h6m0 h6m0Var = this.b;
        if (z) {
            int i = this.d;
            ezb0Var.getClass();
            String str = h6m0Var.f12537a.f41241a;
            synchronized (ezb0Var.k) {
                nqv0VarB = ezb0Var.b(str);
            }
            zD = ezb0.d(str, nqv0VarB, i);
        } else {
            int i2 = this.d;
            ezb0Var.getClass();
            String str2 = h6m0Var.f12537a.f41241a;
            synchronized (ezb0Var.k) {
                try {
                    if (ezb0Var.f.get(str2) != null) {
                        wv00.f().a(ezb0.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) ezb0Var.h.get(str2);
                        if (set != null && set.contains(h6m0Var)) {
                            zD = ezb0.d(str2, ezb0Var.b(str2), i2);
                        }
                    }
                    zD = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        wv00 wv00VarF = wv00.f();
        String strH = wv00.h("StopWorkRunnable");
        String str3 = this.b.f12537a.f41241a;
        int i3 = this.d;
        StringBuilder sbU = brm0.u("StopWorkRunnable for ", str3, "; Processor.stopWork = ", zD, ", reason: ");
        sbU.append(i3);
        wv00VarF.a(strH, sbU.toString());
    }
}
