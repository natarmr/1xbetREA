package com.google.firebase.perf;

import a.a7t0;
import a.b55;
import a.c7k;
import a.dgd;
import a.dgq;
import a.dps0;
import a.gut0;
import a.hsd;
import a.jkd0;
import a.mbl;
import a.mj3;
import a.mos0;
import a.mx2;
import a.nfq;
import a.ofd;
import a.ogq;
import a.ouj;
import a.p8i;
import a.pfd;
import a.pmi;
import a.q0x;
import a.qff0;
import a.sgq;
import a.tgq;
import a.tyb0;
import a.udk;
import a.ugq;
import a.vgq;
import a.x860;
import a.yk5;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static ogq lambda$getComponents$0(jkd0 jkd0Var, dgd dgdVar) {
        byte b;
        AppStartTrace appStartTrace;
        int i;
        x860 x860Var;
        nfq nfqVar = (nfq) dgdVar.a(nfq.class);
        b55 b55Var = (b55) dgdVar.j(b55.class).get();
        Executor executor = (Executor) dgdVar.e(jkd0Var);
        ogq ogqVar = new ogq();
        nfqVar.a();
        Context context = nfqVar.f23449a;
        hsd hsdVarE = hsd.e();
        hsdVarE.getClass();
        hsd.d.f8700a = gut0.a(context);
        hsdVarE.c.c(context);
        mj3 mj3VarA = mj3.a();
        synchronized (mj3VarA) {
            b = 1;
            if (!mj3VarA.o) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(mj3VarA);
                    mj3VarA.o = true;
                }
            }
        }
        tgq tgqVar = new tgq();
        synchronized (mj3VarA.g) {
            mj3VarA.g.add(tgqVar);
        }
        if (b55Var != null) {
            if (AppStartTrace.z != null) {
                appStartTrace = AppStartTrace.z;
            } else {
                dps0 dps0Var = dps0.s;
                yk5 yk5Var = new yk5();
                if (AppStartTrace.z == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.z == null) {
                                AppStartTrace.z = new AppStartTrace(dps0Var, yk5Var, hsd.e(), new ThreadPoolExecutor(0, 1, 10 + ((long) AppStartTrace.y), TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                appStartTrace = AppStartTrace.z;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.f45667a) {
                    tyb0.i.f.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        boolean z = false;
                        appStartTrace.v = appStartTrace.v || AppStartTrace.c((Application) applicationContext2);
                        int i2 = Build.VERSION.SDK_INT;
                        int i3 = 2;
                        if (((ActivityManager) ((Application) applicationContext2).getSystemService("activity")) == null) {
                            x860Var = new x860(i3, z);
                        } else {
                            try {
                                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                                i = runningAppProcessInfo.importance;
                            } catch (Throwable unused) {
                                i = -1;
                            }
                            if (i2 >= 34) {
                                x860Var = new x860(i == 100 ? 1 : 2, z);
                            } else {
                                x860Var = new x860(i3, z);
                            }
                        }
                        appStartTrace.w = x860Var;
                        appStartTrace.f45667a = true;
                        appStartTrace.e = (Application) applicationContext2;
                    }
                }
            }
            if (Build.VERSION.SDK_INT < 34) {
                executor.execute(new mx2(appStartTrace, b));
            }
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return ogqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static sgq providesFirebasePerformance(dgd dgdVar) {
        dgdVar.a(ogq.class);
        pmi pmiVar = new pmi(dgdVar.a(nfq.class), dgdVar.a(dgq.class), (Object) dgdVar.j(qff0.class), (Object) dgdVar.j(mos0.class), (byte) 18);
        return (sgq) mbl.b(new vgq(new ugq(pmiVar, (byte) 0), new ugq(pmiVar, (byte) 2), new ugq(pmiVar, (byte) 1), new ugq(pmiVar, (byte) 3), new p8i(pmiVar, (byte) 11), new p8i(pmiVar, (byte) 10), new p8i(pmiVar, (byte) 12))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        jkd0 jkd0Var = new jkd0(a7t0.class, Executor.class);
        ofd ofdVarB = pfd.b(sgq.class);
        ofdVarB.f25161a = LIBRARY_NAME;
        ofdVarB.a(c7k.c(nfq.class));
        ofdVarB.a(new c7k(1, 1, qff0.class));
        ofdVarB.a(c7k.c(dgq.class));
        ofdVarB.a(new c7k(1, 1, mos0.class));
        ofdVarB.a(c7k.c(ogq.class));
        ofdVarB.f = new udk((byte) 26);
        pfd pfdVarB = ofdVarB.b();
        ofd ofdVarB2 = pfd.b(ogq.class);
        ofdVarB2.f25161a = EARLY_LIBRARY_NAME;
        ofdVarB2.a(c7k.c(nfq.class));
        ofdVarB2.a(c7k.a(b55.class));
        ofdVarB2.a(new c7k(jkd0Var, 1, 0));
        ofdVarB2.c(2);
        ofdVarB2.f = new ouj(jkd0Var, (byte) 2);
        return Arrays.asList(pfdVarB, ofdVarB2.b(), q0x.I(LIBRARY_NAME, "22.0.6"));
    }
}
