package a;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k4x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17691a;
    public final /* synthetic */ long b;
    public final /* synthetic */ w4x0 c;

    public k4x0(w4x0 w4x0Var, long j, byte b) {
        this.f17691a = b;
        switch (b) {
            case 1:
                this.b = j;
                Objects.requireNonNull(w4x0Var);
                this.c = w4x0Var;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(w4x0Var);
                this.c = w4x0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00af  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f17691a;
        w4x0 w4x0Var = this.c;
        switch (b) {
            case 0:
                dr8 dr8Var = w4x0Var.g;
                w4x0Var.m1();
                w4x0Var.p1();
                kxw0 kxw0Var = (kxw0) w4x0Var.b;
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                quw0 quw0Var = uuw0Var.o;
                long j = this.b;
                quw0Var.b(Long.valueOf(j), "Activity resumed, time");
                bkw0 bkw0Var = kxw0Var.d;
                if (bkw0Var.x1(null, btw0.S0)) {
                    if (bkw0Var.B1() || w4x0Var.e) {
                        ((w4x0) dr8Var.d).m1();
                        ((q4x0) dr8Var.c).c();
                        dr8Var.f6545a = j;
                        dr8Var.b = j;
                    }
                } else if (bkw0Var.B1()) {
                    ((w4x0) dr8Var.d).m1();
                    ((q4x0) dr8Var.c).c();
                    dr8Var.f6545a = j;
                    dr8Var.b = j;
                } else {
                    wvw0 wvw0Var = kxw0Var.e;
                    kxw0.e(wvw0Var);
                    if (wvw0Var.t.a()) {
                        ((w4x0) dr8Var.d).m1();
                        ((q4x0) dr8Var.c).c();
                        dr8Var.f6545a = j;
                        dr8Var.b = j;
                    }
                }
                afm0 afm0Var = w4x0Var.h;
                w4x0 w4x0Var2 = (w4x0) afm0Var.c;
                w4x0Var2.m1();
                o4x0 o4x0Var = (o4x0) afm0Var.b;
                if (o4x0Var != null) {
                    w4x0Var2.d.removeCallbacks(o4x0Var);
                }
                wvw0 wvw0Var2 = ((kxw0) w4x0Var2.b).e;
                kxw0.e(wvw0Var2);
                wvw0Var2.t.b(false);
                w4x0Var2.m1();
                w4x0Var2.e = false;
                ikt0 ikt0Var = w4x0Var.f;
                w4x0 w4x0Var3 = (w4x0) ikt0Var.f14945a;
                w4x0Var3.m1();
                kxw0 kxw0Var2 = (kxw0) w4x0Var3.b;
                boolean zA = kxw0Var2.a();
                lwf lwfVar = kxw0Var2.k;
                if (zA) {
                    lwfVar.getClass();
                    ikt0Var.g(System.currentTimeMillis(), kxw0Var2.d.x1(null, btw0.e1) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
            default:
                w4x0Var.m1();
                w4x0Var.p1();
                kxw0 kxw0Var3 = (kxw0) w4x0Var.b;
                uuw0 uuw0Var2 = kxw0Var3.f;
                kxw0.g(uuw0Var2);
                quw0 quw0Var2 = uuw0Var2.o;
                long j2 = this.b;
                quw0Var2.b(Long.valueOf(j2), "Activity paused, time");
                afm0 afm0Var2 = w4x0Var.h;
                w4x0 w4x0Var4 = (w4x0) afm0Var2.c;
                ((kxw0) w4x0Var4.b).k.getClass();
                o4x0 o4x0Var2 = new o4x0(afm0Var2, System.currentTimeMillis(), j2);
                afm0Var2.b = o4x0Var2;
                w4x0Var4.d.postDelayed(o4x0Var2, 2000L);
                if (kxw0Var3.d.B1()) {
                    ((q4x0) w4x0Var.g.c).c();
                }
                break;
        }
    }
}
