package a;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class q4x0 extends bmw0 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4x0(Object obj, syw0 syw0Var, byte b) {
        super(syw0Var);
        this.e = b;
        this.f = obj;
    }

    @Override // a.bmw0
    public final void a() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                dr8 dr8Var = (dr8) obj;
                w4x0 w4x0Var = (w4x0) dr8Var.d;
                w4x0Var.m1();
                kxw0 kxw0Var = (kxw0) w4x0Var.b;
                kxw0Var.k.getClass();
                dr8Var.r(SystemClock.elapsedRealtime(), false, false);
                dqw0 dqw0Var = kxw0Var.n;
                kxw0.d(dqw0Var);
                kxw0Var.k.getClass();
                dqw0Var.p1(SystemClock.elapsedRealtime());
                break;
            case 1:
                i5x0 i5x0Var = (i5x0) obj;
                i5x0Var.q1();
                uuw0 uuw0Var = ((kxw0) i5x0Var.b).f;
                kxw0.g(uuw0Var);
                uuw0Var.o.a("Starting upload from DelayedRunnable");
                i5x0Var.c.l();
                break;
            default:
                m6x0 m6x0Var = (m6x0) obj;
                m6x0Var.J().m1();
                String str = (String) m6x0Var.q.pollFirst();
                if (str != null) {
                    m6x0Var.S().getClass();
                    m6x0Var.j1 = SystemClock.elapsedRealtime();
                    m6x0Var.r().o.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = m6x0Var.l.f19080a;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                m6x0Var.E();
                break;
        }
    }
}
