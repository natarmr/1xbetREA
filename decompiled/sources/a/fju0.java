package a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class fju0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9661a;
    public final Object b;

    public fju0(d9w0 d9w0Var, y78 y78Var) {
        this.f9661a = (byte) 4;
        Objects.requireNonNull(d9w0Var);
        this.b = y78Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x023a  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = 3;
        byte b2 = 0;
        byte b3 = 1;
        switch (this.f9661a) {
            case 0:
                ViewPager viewPager = (ViewPager) this.b;
                viewPager.setScrollState(0);
                viewPager.q();
                return;
            case 1:
                ((h9w0) this.b).a();
                return;
            case 2:
                b9v b9vVar = ((h9w0) ((w4p0) this.b).b).b;
                b9vVar.d(b9vVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 3:
                ((r9w0) this.b).m.l(new ConnectionResult(4, null, null));
                return;
            case 4:
                throw null;
            case 5:
                pvu0 pvu0Var = (pvu0) this.b;
                synchronized (pvu0Var.f27679a) {
                    try {
                        if (pvu0Var.b()) {
                            Log.e("WakeLock", String.valueOf(pvu0Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            pvu0Var.d();
                            if (pvu0Var.b()) {
                                pvu0Var.c = 1;
                                pvu0Var.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 6:
                if (((TaskCompletionSource) this.b).trySetException(new IOException(Payload.RESPONSE_TIMEOUT))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 7:
                zlw0 zlw0Var = (zlw0) this.b;
                try {
                    SQLiteDatabase sQLiteDatabaseC2 = zlw0Var.c2();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseC2.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e) {
                    uuw0 uuw0Var = ((kxw0) zlw0Var.b).f;
                    kxw0.g(uuw0Var);
                    uuw0Var.g.b(e, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 8:
                ((jvw0) this.b).f17223a.M();
                return;
            case 9:
                a4x0 a4x0Var = ((t3x0) this.b).c;
                a4x0Var.w1(new ComponentName(((kxw0) a4x0Var.b).f19080a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 10:
                a4x0 a4x0Var2 = ((t3x0) ((k3x0) this.b).c).c;
                fxw0 fxw0Var = ((kxw0) a4x0Var2.b).g;
                kxw0.g(fxw0Var);
                fxw0Var.v1(new r3x0(a4x0Var2, b2));
                return;
            case 11:
                o4x0 o4x0Var = (o4x0) this.b;
                w4x0 w4x0Var = (w4x0) o4x0Var.c.c;
                w4x0Var.m1();
                kxw0 kxw0Var = (kxw0) w4x0Var.b;
                uuw0 uuw0Var2 = kxw0Var.f;
                Context context = kxw0Var.f19080a;
                kxw0.g(uuw0Var2);
                uuw0Var2.n.a("Application going to the background");
                wvw0 wvw0Var = kxw0Var.e;
                kxw0.e(wvw0Var);
                wvw0Var.t.b(true);
                w4x0Var.m1();
                w4x0Var.e = true;
                bkw0 bkw0Var = kxw0Var.d;
                if (!bkw0Var.B1()) {
                    long j = o4x0Var.b;
                    dr8 dr8Var = w4x0Var.g;
                    dr8Var.r(j, false, false);
                    ((q4x0) dr8Var.c).c();
                }
                long j2 = o4x0Var.f24661a;
                kxw0.g(uuw0Var2);
                uuw0Var2.m.b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                b1x0 b1x0Var = kxw0Var.m;
                kxw0.f(b1x0Var);
                b1x0Var.m1();
                kxw0 kxw0Var2 = (kxw0) b1x0Var.b;
                b1x0Var.n1();
                a4x0 a4x0VarI = kxw0Var2.i();
                a4x0VarI.m1();
                a4x0VarI.n1();
                if (a4x0VarI.s1()) {
                    x6x0 x6x0Var = ((kxw0) a4x0VarI.b).i;
                    kxw0.e(x6x0Var);
                    if (x6x0Var.X1() >= 242600) {
                        a4x0 a4x0VarI2 = kxw0Var2.i();
                        a4x0VarI2.m1();
                        a4x0VarI2.n1();
                        a4x0VarI2.z1(new o2x0(a4x0VarI2, a4x0VarI2.B1(true), b3));
                    }
                } else {
                    a4x0 a4x0VarI3 = kxw0Var2.i();
                    a4x0VarI3.m1();
                    a4x0VarI3.n1();
                    a4x0VarI3.z1(new o2x0(a4x0VarI3, a4x0VarI3.B1(true), b3));
                }
                if (bkw0Var.x1(null, btw0.N0)) {
                    x6x0 x6x0Var2 = kxw0Var.i;
                    kxw0.e(x6x0Var2);
                    long jU1 = x6x0Var2.R1(context.getPackageName(), bkw0Var.d) ? 1000L : bkw0Var.u1(context.getPackageName(), btw0.E);
                    kxw0.g(uuw0Var2);
                    uuw0Var2.o.b(Long.valueOf(jU1), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    kxw0.d(kxw0Var.u);
                    kxw0Var.u.p1(jU1);
                    return;
                }
                return;
            case 12:
                m6x0 m6x0Var = (m6x0) this.b;
                m6x0Var.J().m1();
                m6x0Var.k = new drm0(m6x0Var);
                zlw0 zlw0Var2 = new zlw0(m6x0Var);
                zlw0Var2.o1();
                m6x0Var.c = zlw0Var2;
                uww0 uww0Var = m6x0Var.f21293a;
                bkw0 bkw0VarE0 = m6x0Var.e0();
                s0x.H(uww0Var);
                bkw0VarE0.e = uww0Var;
                d4x0 d4x0Var = new d4x0(m6x0Var);
                d4x0Var.o1();
                m6x0Var.i = d4x0Var;
                ydw0 ydw0Var = new ydw0(m6x0Var);
                ydw0Var.o1();
                m6x0Var.f = ydw0Var;
                fvw0 fvw0Var = new fvw0(m6x0Var, b3);
                fvw0Var.o1();
                m6x0Var.h = fvw0Var;
                i5x0 i5x0Var = new i5x0(m6x0Var);
                i5x0Var.o1();
                m6x0Var.e = i5x0Var;
                m6x0Var.d = new jvw0(m6x0Var);
                if (m6x0Var.r != m6x0Var.s) {
                    m6x0Var.r().g.c(Integer.valueOf(m6x0Var.r), Integer.valueOf(m6x0Var.s), "Not all upload components initialized");
                }
                m6x0Var.m.set(true);
                m6x0Var.r().o.a("UploadController is now fully initialized");
                m6x0Var.J().m1();
                zlw0 zlw0Var3 = m6x0Var.c;
                m6x0.T(zlw0Var3);
                zlw0Var3.w1();
                zlw0 zlw0Var4 = m6x0Var.c;
                m6x0.T(zlw0Var4);
                zlw0Var4.m1();
                zlw0Var4.n1();
                if (zlw0Var4.X1()) {
                    atw0 atw0Var = btw0.u0;
                    if (((Long) atw0Var.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseC3 = zlw0Var4.c2();
                        kxw0 kxw0Var3 = (kxw0) zlw0Var4.b;
                        kxw0Var3.k.getClass();
                        int iDelete = sQLiteDatabaseC3.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(atw0Var.a(null))});
                        if (iDelete > 0) {
                            uuw0 uuw0Var3 = kxw0Var3.f;
                            kxw0.g(uuw0Var3);
                            uuw0Var3.o.b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (m6x0Var.i.i.a() == 0) {
                    rvw0 rvw0Var = m6x0Var.i.i;
                    m6x0Var.S().getClass();
                    rvw0Var.b(System.currentTimeMillis());
                }
                m6x0Var.M();
                return;
            case 13:
                throw new RuntimeException(((ExecutionException) this.b).getCause());
            case 14:
                try {
                    hkb.E((epq) this.b);
                    return;
                } catch (Exception e2) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e2);
                    return;
                }
            case 15:
                try {
                    hkb.E((fpq) this.b);
                    return;
                } catch (Exception e3) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e3);
                        return;
                    }
                    return;
                }
            case 16:
                kxw0 kxw0Var4 = (kxw0) ((md3) this.b).b;
                kxw0.d(kxw0Var4.u);
                kxw0Var4.u.p1(((Long) btw0.D.a(null)).longValue());
                return;
            default:
                kxw0 kxw0Var5 = (kxw0) this.b;
                x6x0 x6x0Var3 = kxw0Var5.i;
                b1x0 b1x0Var2 = kxw0Var5.m;
                kxw0.e(x6x0Var3);
                x6x0Var3.m1();
                if (x6x0Var3.J1() != 1) {
                    uuw0 uuw0Var4 = kxw0Var5.f;
                    kxw0.g(uuw0Var4);
                    uuw0Var4.j.a("registerTrigger called but app not eligible");
                    return;
                }
                kxw0.f(b1x0Var2);
                b1x0Var2.m1();
                ezw0 ezw0Var = b1x0Var2.m;
                if (ezw0Var != null) {
                    ezw0Var.c();
                }
                kxw0.f(b1x0Var2);
                new Thread(new dzw0(b1x0Var2, b)).start();
                return;
        }
    }

    public /* synthetic */ fju0(Object obj, byte b) {
        this.f9661a = b;
        this.b = obj;
    }

    public fju0(r9w0 r9w0Var) {
        this.f9661a = (byte) 3;
        Objects.requireNonNull(r9w0Var);
        this.b = r9w0Var;
    }

    public fju0(jvw0 jvw0Var, boolean z) {
        this.f9661a = (byte) 8;
        this.b = jvw0Var;
    }

    public fju0(m6x0 m6x0Var, ilp0 ilp0Var) {
        this.f9661a = (byte) 12;
        this.b = m6x0Var;
    }
}
