package a;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class o7x0 implements r7x0 {
    public static boolean c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lin0 f24806a;
    public final int b = Math.max(5, 10);

    public o7x0(lin0 lin0Var) {
        this.f24806a = lin0Var;
    }

    @Override // a.r7x0
    public final void zza() {
        synchronized (o7x0.class) {
            try {
                if (!c) {
                    tsn tsnVar = new tsn(this);
                    long j = this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    fr40 fr40Var = (fr40) this.f24806a.get();
                    y1x0 y1x0Var = new y1x0(this, tsnVar, fr40Var, j);
                    fr40Var.getClass();
                    trs0 trs0Var = new trs0(Executors.callable(y1x0Var, null));
                    dr40 dr40Var = new dr40(trs0Var, fr40Var.b.schedule(trs0Var, j, timeUnit));
                    dr40Var.a(new kfr(dr40Var, (byte) 1), ank.f1158a);
                    c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
