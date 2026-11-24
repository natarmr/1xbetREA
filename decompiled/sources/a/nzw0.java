package a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class nzw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24393a;
    public final /* synthetic */ long b;
    public final /* synthetic */ b1x0 c;

    public nzw0(b1x0 b1x0Var, long j, byte b) {
        this.f24393a = b;
        switch (b) {
            case 1:
                this.b = j;
                this.c = b1x0Var;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(b1x0Var);
                this.c = b1x0Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f24393a;
        long j = this.b;
        b1x0 b1x0Var = this.c;
        switch (b) {
            case 0:
                kxw0 kxw0Var = (kxw0) b1x0Var.b;
                wvw0 wvw0Var = kxw0Var.e;
                kxw0.e(wvw0Var);
                wvw0Var.l.b(j);
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.n.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                b1x0Var.m1();
                b1x0Var.n1();
                kxw0 kxw0Var2 = (kxw0) b1x0Var.b;
                uuw0 uuw0Var2 = kxw0Var2.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.n.a("Resetting analytics data (FE)");
                w4x0 w4x0Var = kxw0Var2.h;
                kxw0.f(w4x0Var);
                w4x0Var.m1();
                dr8 dr8Var = w4x0Var.g;
                ((q4x0) dr8Var.c).c();
                ((kxw0) ((w4x0) dr8Var.d).b).k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                dr8Var.f6545a = jElapsedRealtime;
                dr8Var.b = jElapsedRealtime;
                kxw0Var2.k().q1();
                boolean z = !kxw0Var2.a();
                wvw0 wvw0Var2 = kxw0Var2.e;
                kxw0.e(wvw0Var2);
                wvw0Var2.g.b(j);
                kxw0 kxw0Var3 = (kxw0) wvw0Var2.b;
                wvw0 wvw0Var3 = kxw0Var3.e;
                kxw0.e(wvw0Var3);
                if (!TextUtils.isEmpty(wvw0Var3.w.t())) {
                    wvw0Var2.w.u(null);
                }
                wvw0Var2.q.b(0L);
                wvw0Var2.r.b(0L);
                if (!kxw0Var3.d.A1()) {
                    wvw0Var2.u1(z);
                }
                wvw0Var2.x.u(null);
                wvw0Var2.y.b(0L);
                wvw0Var2.z.y(null);
                a4x0 a4x0VarI = kxw0Var2.i();
                a4x0VarI.m1();
                a4x0VarI.n1();
                com.google.android.gms.measurement.internal.zzr zzrVarB1 = a4x0VarI.B1(false);
                a4x0VarI.x1();
                ((kxw0) a4x0VarI.b).h().p1();
                a4x0VarI.z1(new o2x0(a4x0VarI, zzrVarB1, (byte) 0));
                kxw0.f(w4x0Var);
                w4x0Var.f.e();
                b1x0Var.s = z;
                kxw0Var2.i().p1(new AtomicReference());
                break;
        }
    }
}
