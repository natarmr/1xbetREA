package a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.xplatform.prophylaxis.impl.prophylaxis.presentation.ProphylaxisAlarmReceiver;

/* JADX INFO: loaded from: classes5.dex */
public final class y1d0 {
    public static final long f;
    public static final long g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1d0 f41850a;
    public final jw20 b;
    public final a1d0 c;
    public final knf0 d;
    public final tgk e;

    static {
        uen uenVar = wen.b;
        f = wen.e(ibc.v0(3, bfn.MINUTES));
        g = wen.e(ibc.v0(8, bfn.SECONDS));
    }

    public y1d0(j1d0 j1d0Var, jw20 jw20Var, a1d0 a1d0Var, knf0 knf0Var, tgk tgkVar) {
        j1d0Var.getClass();
        a1d0Var.getClass();
        knf0Var.getClass();
        tgkVar.getClass();
        this.f41850a = j1d0Var;
        this.b = jw20Var;
        this.c = a1d0Var;
        this.d = knf0Var;
        this.e = tgkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(long j, zje zjeVar) throws Throwable {
        w1d0 w1d0Var;
        i050 i050Var;
        long j2;
        i050 i050Var2;
        o1d0 o1d0Var;
        if (zjeVar instanceof w1d0) {
            w1d0Var = (w1d0) zjeVar;
            int i = w1d0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1d0Var.m = i - Integer.MIN_VALUE;
            } else {
                w1d0Var = new w1d0(this, zjeVar);
            }
        } else {
            w1d0Var = new w1d0(this, zjeVar);
        }
        Object obj = w1d0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = w1d0Var.m;
        j1d0 j1d0Var = this.f41850a;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                i050Var = j1d0Var.b;
                w1d0Var.j = i050Var;
                j2 = j;
                w1d0Var.i = j2;
                w1d0Var.m = 1;
                if (i050Var.d(w1d0Var) != wneVar) {
                }
                return wneVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i050Var2 = w1d0Var.j;
                try {
                    z1x.P(obj);
                    o1d0Var = (o1d0) obj;
                    i050Var = i050Var2;
                    i050Var.c(null);
                    return o1d0Var;
                } catch (Throwable th) {
                    th = th;
                    i050Var2.c(null);
                    throw th;
                }
            }
            j2 = w1d0Var.i;
            i050 i050Var3 = w1d0Var.j;
            z1x.P(obj);
            i050Var = i050Var3;
            o1d0Var = (o1d0) j1d0Var.f15729a.getValue();
            if (System.currentTimeMillis() >= o1d0Var.a() + (o1d0Var instanceof k1d0 ? g : f)) {
                jw20 jw20Var = this.b;
                this.d.getClass();
                w1d0Var.j = i050Var;
                w1d0Var.i = j2;
                w1d0Var.m = 2;
                Object objQ = jw20Var.q(1357, j2, w1d0Var);
                if (objQ != wneVar) {
                    i050Var2 = i050Var;
                    obj = objQ;
                    o1d0Var = (o1d0) obj;
                    i050Var = i050Var2;
                }
                return wneVar;
            }
            i050Var.c(null);
            return o1d0Var;
        } catch (Throwable th2) {
            th = th2;
            i050Var2 = i050Var;
            i050Var2.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(long j, zje zjeVar, boolean z) {
        x1d0 x1d0Var;
        boolean z2;
        boolean z3;
        Object g0g0Var;
        Object g0g0Var2;
        if (zjeVar instanceof x1d0) {
            x1d0Var = (x1d0) zjeVar;
            int i = x1d0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                x1d0Var.l = i - Integer.MIN_VALUE;
            } else {
                x1d0Var = new x1d0(this, zjeVar);
            }
        } else {
            x1d0Var = new x1d0(this, zjeVar);
        }
        Object objA = x1d0Var.j;
        Object obj = wne.f39444a;
        int i2 = x1d0Var.l;
        Object[] objArr = 0;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objA);
            try {
                e0g0 e0g0Var = j0g0.b;
                z2 = z;
                try {
                    x1d0Var.i = z2;
                    x1d0Var.l = 1;
                    objA = a(j, x1d0Var);
                    if (objA == obj) {
                        return obj;
                    }
                    z3 = z2;
                } catch (Throwable th) {
                    th = th;
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                    z3 = z2;
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = z;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = x1d0Var.i;
            try {
                z1x.P(objA);
            } catch (Throwable th3) {
                th = th3;
                z2 = z3;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
                z3 = z2;
            }
        }
        g0g0Var = (o1d0) objA;
        e0g0 e0g0Var4 = j0g0.b;
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            g0g0Var = new k1d0(thA, System.currentTimeMillis());
        }
        Object obj2 = g0g0Var;
        o1d0 o1d0Var = (o1d0) obj2;
        j1d0 j1d0Var = this.f41850a;
        j1d0Var.getClass();
        o1d0Var.getClass();
        j1d0Var.f15729a.o(null, o1d0Var);
        a1d0 a1d0Var = this.c;
        a1d0Var.getClass();
        if (z3) {
            try {
                long jMax = o1d0Var instanceof k1d0 ? b1d0.b : Math.max((o1d0Var.a() + b1d0.f1801a) - System.currentTimeMillis(), 0L);
                v3c.N(a1d0Var.d);
                a1d0Var.d = sac.f0(a1d0Var.c, jMax, TimeUnit.MILLISECONDS, null, z0d0.f43562a, new coc0(a1d0Var, objArr == true ? 1 : 0, b), 36);
            } catch (Throwable th4) {
                e0g0 e0g0Var5 = j0g0.b;
                g0g0Var2 = new g0g0(th4);
            }
        }
        if (o1d0Var instanceof n1d0) {
            int i3 = ProphylaxisAlarmReceiver.h;
            us00 us00Var = a1d0Var.f67a;
            long j2 = ((n1d0) o1d0Var).c;
            Object systemService = us00Var.getSystemService("alarm");
            AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
            if (alarmManager != null) {
                PendingIntent broadcast = PendingIntent.getBroadcast(us00Var, 0, new Intent(us00Var, (Class<?>) ProphylaxisAlarmReceiver.class), rsr0.e0(134217728));
                broadcast.getClass();
                alarmManager.cancel(broadcast);
                long j3 = j2 * 1000;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis > j3) {
                    j3 = b1d0.b + jCurrentTimeMillis;
                }
                alarmManager.setAndAllowWhileIdle(0, j3, broadcast);
            }
        }
        g0g0Var2 = Unit.f46060a;
        Throwable thA2 = j0g0.a(g0g0Var2);
        if (thA2 != null) {
            thA2.printStackTrace();
        }
        this.e.j = o1d0Var instanceof n1d0;
        return obj2;
    }
}
