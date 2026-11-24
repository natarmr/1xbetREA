package a;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdb;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class kxw0 implements syw0 {
    public static volatile kxw0 g1;
    public int A;
    public int B;
    public final long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19080a;
    public final boolean b;
    public final svs0 c;
    public final bkw0 d;
    public final wvw0 e;
    public final uuw0 f;
    public final long f1;
    public final fxw0 g;
    public final w4x0 h;
    public final x6x0 i;
    public final iuw0 j;
    public final lwf k;
    public final c2x0 l;
    public final b1x0 m;
    public final dqw0 n;
    public final k1x0 o;
    public final String p;
    public euw0 q;
    public a4x0 r;
    public kmw0 s;
    public vtw0 t;
    public o1x0 u;
    public Boolean w;
    public long x;
    public volatile Boolean y;
    public volatile boolean z;
    public boolean v = false;
    public final AtomicInteger Y = new AtomicInteger(0);

    public kxw0(bzw0 bzw0Var) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        boolean z = false;
        Context context = bzw0Var.f3494a;
        svs0 svs0Var = new svs0((byte) 23);
        this.c = svs0Var;
        ltt0.c = svs0Var;
        this.f19080a = context;
        this.b = bzw0Var.e;
        this.y = bzw0Var.b;
        this.p = bzw0Var.h;
        boolean z2 = true;
        this.z = true;
        byte b = 2;
        if (t1x0.b == null) {
            Object obj = t1x0.f33191a;
            synchronized (obj) {
                try {
                    if (t1x0.b == null) {
                        synchronized (obj) {
                            try {
                                r0x0 r0x0Var = t1x0.b;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (r0x0Var == null || r0x0Var.f29651a != applicationContext2) {
                                    if (r0x0Var != null) {
                                        Iterator it = u0x0.f34877a.values().iterator();
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                throw new ClassCastException();
                                            }
                                            throw null;
                                        }
                                        a2x0.a();
                                    }
                                    t1x0.b = new r0x0(applicationContext2, hfm0.z(new f1x0(applicationContext2, b)));
                                    t1x0.c.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.k = lwf.i;
        tzw0 tzw0Var = new tzw0(context, gzw0.f12204a, ea3.D, mav.c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        euo0 euo0VarA = s9w0.a();
        euo0VarA.f8431a = new okt0(strConcat, new String[0]);
        tzw0Var.b(0, euo0VarA.a());
        AtomicReference atomicReference = c1x0.k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                c1x0.b();
                k7n0.I(Level.WARNING, (Executor) c1x0.m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = bzw0Var.f;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.k.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.Z = jCurrentTimeMillis;
        Long l2 = bzw0Var.g;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f1 = jElapsedRealtime;
        bkw0 bkw0Var = new bkw0(this);
        bkw0Var.e = svs0.b;
        this.d = bkw0Var;
        wvw0 wvw0Var = new wvw0(this);
        wvw0Var.p1();
        this.e = wvw0Var;
        uuw0 uuw0Var = new uuw0(this);
        uuw0Var.p1();
        this.f = uuw0Var;
        x6x0 x6x0Var = new x6x0(this);
        x6x0Var.p1();
        this.i = x6x0Var;
        this.j = new iuw0(new ilp0(bzw0Var, this));
        this.n = new dqw0(this);
        c2x0 c2x0Var = new c2x0(this);
        c2x0Var.f1();
        this.l = c2x0Var;
        b1x0 b1x0Var = new b1x0(this);
        b1x0Var.f1();
        this.m = b1x0Var;
        w4x0 w4x0Var = new w4x0(this);
        w4x0Var.f1();
        this.h = w4x0Var;
        k1x0 k1x0Var = new k1x0(this);
        ((kxw0) k1x0Var.b).A++;
        k1x0Var.p1();
        this.o = k1x0Var;
        fxw0 fxw0Var = new fxw0(this);
        fxw0Var.p1();
        this.g = fxw0Var;
        zzdb zzdbVar = bzw0Var.d;
        if (zzdbVar != null && zzdbVar.b != 0) {
            z2 = false;
        }
        if (this.f19080a.getApplicationContext() instanceof Application) {
            f(b1x0Var);
            if (((kxw0) b1x0Var.b).f19080a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((kxw0) b1x0Var.b).f19080a.getApplicationContext();
                cgp cgpVar = b1x0Var.d;
                if (cgpVar == null) {
                    cgpVar = new cgp(b1x0Var, b);
                    b1x0Var.d = cgpVar;
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(cgpVar);
                    application.registerActivityLifecycleCallbacks(b1x0Var.d);
                    uuw0 uuw0Var2 = ((kxw0) b1x0Var.b).f;
                    g(uuw0Var2);
                    uuw0Var2.o.a("Registered activity lifecycle callback");
                }
            }
        } else {
            g(uuw0Var);
            uuw0Var.j.a("Application context is not an Application");
        }
        fxw0Var.v1(new mfr(this, bzw0Var, z, (byte) 22));
    }

    public static final void d(zrw0 zrw0Var) {
        if (zrw0Var != null) {
            return;
        }
        jf4.n("Component not created");
    }

    public static final void e(p4 p4Var) {
        if (p4Var != null) {
            return;
        }
        jf4.n("Component not created");
    }

    public static final void f(etw0 etw0Var) {
        if (etw0Var == null) {
            jf4.n("Component not created");
        } else {
            if (etw0Var.c) {
                return;
            }
            jf4.n("Component not initialized: ".concat(String.valueOf(etw0Var.getClass())));
        }
    }

    public static final void g(ryw0 ryw0Var) {
        if (ryw0Var == null) {
            jf4.n("Component not created");
        } else {
            if (ryw0Var.c) {
                return;
            }
            jf4.n("Component not initialized: ".concat(String.valueOf(ryw0Var.getClass())));
        }
    }

    public static kxw0 l(Context context, zzdb zzdbVar, Long l, Long l2) {
        Bundle bundle;
        if (zzdbVar != null) {
            Bundle bundle2 = zzdbVar.d;
            zzdbVar = new zzdb(zzdbVar.f45525a, zzdbVar.b, zzdbVar.c, bundle2, null);
        }
        s0x.H(context);
        s0x.H(context.getApplicationContext());
        if (g1 == null) {
            synchronized (kxw0.class) {
                try {
                    if (g1 == null) {
                        g1 = new kxw0(new bzw0(context, zzdbVar, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzdbVar != null && (bundle = zzdbVar.d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            s0x.H(g1);
            g1.y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        s0x.H(g1);
        return g1;
    }

    @Override // a.syw0
    public final fxw0 J() {
        fxw0 fxw0Var = this.g;
        g(fxw0Var);
        return fxw0Var;
    }

    @Override // a.syw0
    public final Context K() {
        return this.f19080a;
    }

    @Override // a.syw0
    public final lwf S() {
        return this.k;
    }

    public final boolean a() {
        return b() == 0;
    }

    public final int b() {
        fxw0 fxw0Var = this.g;
        g(fxw0Var);
        fxw0Var.m1();
        bkw0 bkw0Var = this.d;
        if (bkw0Var.A1()) {
            return 1;
        }
        g(fxw0Var);
        fxw0Var.m1();
        if (!this.z) {
            return 8;
        }
        wvw0 wvw0Var = this.e;
        e(wvw0Var);
        wvw0Var.m1();
        Boolean boolValueOf = wvw0Var.q1().contains("measurement_enabled") ? Boolean.valueOf(wvw0Var.q1().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        svs0 svs0Var = ((kxw0) bkw0Var.b).c;
        Boolean boolZ1 = bkw0Var.z1("firebase_analytics_collection_enabled");
        if (boolZ1 != null) {
            return boolZ1.booleanValue() ? 0 : 4;
        }
        return (this.y == null || this.y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean c() {
        x6x0 x6x0Var;
        Context context;
        boolean z = false;
        if (!this.v) {
            jf4.n("AppMeasurement is not initialized");
            return false;
        }
        fxw0 fxw0Var = this.g;
        g(fxw0Var);
        fxw0Var.m1();
        Boolean bool = this.w;
        lwf lwfVar = this.k;
        if (bool == null || this.x == 0) {
            lwfVar.getClass();
            this.x = SystemClock.elapsedRealtime();
            x6x0Var = this.i;
            e(x6x0Var);
            if (x6x0Var.P1("android.permission.INTERNET") && x6x0Var.P1("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.f19080a;
                if (grv0.a(context).c() || this.d.p1() || (x6x0.h2(context) && x6x0.H1(context))) {
                    z = true;
                }
            }
            this.w = Boolean.valueOf(z);
            if (z) {
                this.w = Boolean.valueOf(x6x0Var.s1(k().s1()));
            }
        } else if (!bool.booleanValue()) {
            lwfVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.x) > 1000) {
                lwfVar.getClass();
                this.x = SystemClock.elapsedRealtime();
                x6x0Var = this.i;
                e(x6x0Var);
                if (x6x0Var.P1("android.permission.INTERNET")) {
                    context = this.f19080a;
                    if (grv0.a(context).c()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.w = Boolean.valueOf(z);
                if (z) {
                    this.w = Boolean.valueOf(x6x0Var.s1(k().s1()));
                }
            }
        }
        return this.w.booleanValue();
    }

    public final euw0 h() {
        f(this.q);
        return this.q;
    }

    public final a4x0 i() {
        f(this.r);
        return this.r;
    }

    public final kmw0 j() {
        g(this.s);
        return this.s;
    }

    public final vtw0 k() {
        f(this.t);
        return this.t;
    }

    @Override // a.syw0
    public final svs0 p() {
        return this.c;
    }

    @Override // a.syw0
    public final uuw0 r() {
        uuw0 uuw0Var = this.f;
        g(uuw0Var);
        return uuw0Var;
    }
}
