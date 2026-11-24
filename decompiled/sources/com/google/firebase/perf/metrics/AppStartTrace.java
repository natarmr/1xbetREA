package com.google.firebase.perf.metrics;

import a.b55;
import a.bc0;
import a.blz;
import a.dps0;
import a.f03;
import a.fbs0;
import a.fy2;
import a.hsd;
import a.ibs0;
import a.kh60;
import a.kkz;
import a.mh3;
import a.nfq;
import a.ohs0;
import a.prb0;
import a.tyb0;
import a.uhq;
import a.v680;
import a.x860;
import a.yk5;
import a.zsd;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, blz {
    public static ThreadPoolExecutor A;
    public static final Timer x = new Timer();
    public static final int y = 60000000;
    public static volatile AppStartTrace z;
    public final dps0 b;
    public final hsd c;
    public final fbs0 d;
    public Application e;
    public final Timer g;
    public final Timer h;
    public PerfSession r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45667a = false;
    public boolean f = false;
    public Timer i = null;
    public Timer j = null;
    public Timer k = null;
    public Timer l = null;
    public Timer m = null;
    public Timer n = null;
    public Timer o = null;
    public Timer p = null;
    public Timer q = null;
    public boolean s = false;
    public int t = 0;
    public final mh3 u = new mh3(this);
    public boolean v = false;
    public x860 w = null;

    public AppStartTrace(dps0 dps0Var, yk5 yk5Var, hsd hsdVar, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer = null;
        this.b = dps0Var;
        this.c = hsdVar;
        A = threadPoolExecutor;
        fbs0 fbs0VarH = ibs0.H();
        fbs0VarH.p("_experiment_app_start_ttid");
        this.d = fbs0VarH;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        this.g = new Timer((micros - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        b55 b55Var = (b55) nfq.d().b(b55.class);
        if (b55Var != null) {
            long micros2 = timeUnit.toMicros(b55Var.b);
            timer = new Timer((micros2 - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros2);
        }
        this.h = timer;
    }

    public static boolean c(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strN = ohs0.n(packageName, Separators.COLON);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strN))) {
                return true;
            }
        }
        return false;
    }

    public static void setLauncherActivityOnCreateTime(String str) {
    }

    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final Timer a() {
        Timer timer = this.h;
        return timer != null ? timer : x;
    }

    public final Timer b() {
        Timer timer = this.g;
        return timer != null ? timer : a();
    }

    public final void d(fbs0 fbs0Var) {
        if (this.o == null || this.p == null || this.q == null) {
            return;
        }
        A.execute(new fy2(this, fbs0Var, (byte) 5));
        e();
    }

    public final synchronized void e() {
        if (this.f45667a) {
            tyb0.i.f.f(this);
            this.e.unregisterActivityLifecycleCallbacks(this);
            this.f45667a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                x860 x860Var = this.w;
                if (x860Var == null || x860Var.f40449a != 1) {
                    this.s = true;
                }
            } else if (this.j != null) {
                this.s = true;
                this.j = null;
            }
            if (!this.s && this.i == null) {
                this.v = this.v || c(this.e);
                new WeakReference(activity);
                this.i = new Timer();
                if (b().b(this.i) > y) {
                    this.f = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.s || this.f) {
            return;
        }
        hsd hsdVar = this.c;
        hsdVar.getClass();
        v680 v680VarG = hsdVar.g(zsd.q0());
        if ((v680VarG.b() ? ((Boolean) v680VarG.a()).booleanValue() : false) && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
            viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.u);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [a.lh3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [a.lh3] */
    /* JADX WARN: Type inference failed for: r4v6, types: [a.lh3] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.s && !this.f) {
                hsd hsdVar = this.c;
                hsdVar.getClass();
                v680 v680VarG = hsdVar.g(zsd.q0());
                final byte b = 0;
                boolean zBooleanValue = v680VarG.b() ? ((Boolean) v680VarG.a()).booleanValue() : false;
                if (zBooleanValue && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.u);
                    uhq uhqVar = new uhq(viewFindViewById, new Runnable(this) { // from class: a.lh3
                        public final /* synthetic */ AppStartTrace b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            AppStartTrace appStartTrace = this.b;
                            switch (b2) {
                                case 0:
                                    Timer timer = AppStartTrace.x;
                                    fbs0 fbs0Var = appStartTrace.d;
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        fbs0 fbs0VarH = ibs0.H();
                                        fbs0VarH.p("_experiment_onDrawFoQ");
                                        fbs0VarH.n(appStartTrace.b().f45671a);
                                        fbs0VarH.o(appStartTrace.b().b(appStartTrace.q));
                                        fbs0Var.j((ibs0) fbs0VarH.h());
                                        if (appStartTrace.g != null) {
                                            fbs0 fbs0VarH2 = ibs0.H();
                                            fbs0VarH2.p("_experiment_procStart_to_classLoad");
                                            fbs0VarH2.n(appStartTrace.b().f45671a);
                                            fbs0VarH2.o(appStartTrace.b().b(appStartTrace.a()));
                                            fbs0Var.j((ibs0) fbs0VarH2.h());
                                        }
                                        String str = appStartTrace.v ? "true" : "false";
                                        fbs0Var.i();
                                        ((ibs0) fbs0Var.b).G().put("systemDeterminedForeground", str);
                                        fbs0Var.m(appStartTrace.t, "onDrawCount");
                                        rd90 rd90VarA = appStartTrace.r.a();
                                        fbs0Var.i();
                                        ((ibs0) fbs0Var.b).t(rd90VarA);
                                        appStartTrace.d(fbs0Var);
                                        break;
                                    }
                                    break;
                                case 1:
                                    Timer timer2 = AppStartTrace.x;
                                    fbs0 fbs0Var2 = appStartTrace.d;
                                    if (appStartTrace.o == null) {
                                        appStartTrace.o = new Timer();
                                        fbs0Var2.n(appStartTrace.b().f45671a);
                                        fbs0Var2.o(appStartTrace.b().b(appStartTrace.o));
                                        appStartTrace.d(fbs0Var2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    Timer timer3 = AppStartTrace.x;
                                    fbs0 fbs0Var3 = appStartTrace.d;
                                    if (appStartTrace.p == null) {
                                        appStartTrace.p = new Timer();
                                        fbs0 fbs0VarH3 = ibs0.H();
                                        fbs0VarH3.p("_experiment_preDrawFoQ");
                                        fbs0VarH3.n(appStartTrace.b().f45671a);
                                        fbs0VarH3.o(appStartTrace.b().b(appStartTrace.p));
                                        fbs0Var3.j((ibs0) fbs0VarH3.h());
                                        appStartTrace.d(fbs0Var3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer4 = AppStartTrace.x;
                                    fbs0 fbs0VarH4 = ibs0.H();
                                    fbs0VarH4.p("_as");
                                    fbs0VarH4.n(appStartTrace.a().f45671a);
                                    fbs0VarH4.o(appStartTrace.a().b(appStartTrace.l));
                                    ArrayList arrayList = new ArrayList(3);
                                    fbs0 fbs0VarH5 = ibs0.H();
                                    fbs0VarH5.p("_astui");
                                    fbs0VarH5.n(appStartTrace.a().f45671a);
                                    fbs0VarH5.o(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((ibs0) fbs0VarH5.h());
                                    if (appStartTrace.k != null) {
                                        fbs0 fbs0VarH6 = ibs0.H();
                                        fbs0VarH6.p("_astfd");
                                        fbs0VarH6.n(appStartTrace.i.f45671a);
                                        fbs0VarH6.o(appStartTrace.i.b(appStartTrace.k));
                                        arrayList.add((ibs0) fbs0VarH6.h());
                                        fbs0 fbs0VarH7 = ibs0.H();
                                        fbs0VarH7.p("_asti");
                                        fbs0VarH7.n(appStartTrace.k.f45671a);
                                        fbs0VarH7.o(appStartTrace.k.b(appStartTrace.l));
                                        arrayList.add((ibs0) fbs0VarH7.h());
                                    }
                                    fbs0VarH4.i();
                                    ((ibs0) fbs0VarH4.b).s(arrayList);
                                    rd90 rd90VarA2 = appStartTrace.r.a();
                                    fbs0VarH4.i();
                                    ((ibs0) fbs0VarH4.b).t(rd90VarA2);
                                    appStartTrace.b.c((ibs0) fbs0VarH4.h(), ts3.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    });
                    if (Build.VERSION.SDK_INT >= 26 || (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow())) {
                        viewFindViewById.getViewTreeObserver().addOnDrawListener(uhqVar);
                    } else {
                        viewFindViewById.addOnAttachStateChangeListener(new bc0(uhqVar, (byte) 5));
                    }
                    final byte b2 = 1;
                    final byte b3 = 2;
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new prb0(viewFindViewById, new Runnable(this) { // from class: a.lh3
                        public final /* synthetic */ AppStartTrace b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b2;
                            AppStartTrace appStartTrace = this.b;
                            switch (b4) {
                                case 0:
                                    Timer timer = AppStartTrace.x;
                                    fbs0 fbs0Var = appStartTrace.d;
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        fbs0 fbs0VarH = ibs0.H();
                                        fbs0VarH.p("_experiment_onDrawFoQ");
                                        fbs0VarH.n(appStartTrace.b().f45671a);
                                        fbs0VarH.o(appStartTrace.b().b(appStartTrace.q));
                                        fbs0Var.j((ibs0) fbs0VarH.h());
                                        if (appStartTrace.g != null) {
                                            fbs0 fbs0VarH2 = ibs0.H();
                                            fbs0VarH2.p("_experiment_procStart_to_classLoad");
                                            fbs0VarH2.n(appStartTrace.b().f45671a);
                                            fbs0VarH2.o(appStartTrace.b().b(appStartTrace.a()));
                                            fbs0Var.j((ibs0) fbs0VarH2.h());
                                        }
                                        String str = appStartTrace.v ? "true" : "false";
                                        fbs0Var.i();
                                        ((ibs0) fbs0Var.b).G().put("systemDeterminedForeground", str);
                                        fbs0Var.m(appStartTrace.t, "onDrawCount");
                                        rd90 rd90VarA = appStartTrace.r.a();
                                        fbs0Var.i();
                                        ((ibs0) fbs0Var.b).t(rd90VarA);
                                        appStartTrace.d(fbs0Var);
                                        break;
                                    }
                                    break;
                                case 1:
                                    Timer timer2 = AppStartTrace.x;
                                    fbs0 fbs0Var2 = appStartTrace.d;
                                    if (appStartTrace.o == null) {
                                        appStartTrace.o = new Timer();
                                        fbs0Var2.n(appStartTrace.b().f45671a);
                                        fbs0Var2.o(appStartTrace.b().b(appStartTrace.o));
                                        appStartTrace.d(fbs0Var2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    Timer timer3 = AppStartTrace.x;
                                    fbs0 fbs0Var3 = appStartTrace.d;
                                    if (appStartTrace.p == null) {
                                        appStartTrace.p = new Timer();
                                        fbs0 fbs0VarH3 = ibs0.H();
                                        fbs0VarH3.p("_experiment_preDrawFoQ");
                                        fbs0VarH3.n(appStartTrace.b().f45671a);
                                        fbs0VarH3.o(appStartTrace.b().b(appStartTrace.p));
                                        fbs0Var3.j((ibs0) fbs0VarH3.h());
                                        appStartTrace.d(fbs0Var3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer4 = AppStartTrace.x;
                                    fbs0 fbs0VarH4 = ibs0.H();
                                    fbs0VarH4.p("_as");
                                    fbs0VarH4.n(appStartTrace.a().f45671a);
                                    fbs0VarH4.o(appStartTrace.a().b(appStartTrace.l));
                                    ArrayList arrayList = new ArrayList(3);
                                    fbs0 fbs0VarH5 = ibs0.H();
                                    fbs0VarH5.p("_astui");
                                    fbs0VarH5.n(appStartTrace.a().f45671a);
                                    fbs0VarH5.o(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((ibs0) fbs0VarH5.h());
                                    if (appStartTrace.k != null) {
                                        fbs0 fbs0VarH6 = ibs0.H();
                                        fbs0VarH6.p("_astfd");
                                        fbs0VarH6.n(appStartTrace.i.f45671a);
                                        fbs0VarH6.o(appStartTrace.i.b(appStartTrace.k));
                                        arrayList.add((ibs0) fbs0VarH6.h());
                                        fbs0 fbs0VarH7 = ibs0.H();
                                        fbs0VarH7.p("_asti");
                                        fbs0VarH7.n(appStartTrace.k.f45671a);
                                        fbs0VarH7.o(appStartTrace.k.b(appStartTrace.l));
                                        arrayList.add((ibs0) fbs0VarH7.h());
                                    }
                                    fbs0VarH4.i();
                                    ((ibs0) fbs0VarH4.b).s(arrayList);
                                    rd90 rd90VarA2 = appStartTrace.r.a();
                                    fbs0VarH4.i();
                                    ((ibs0) fbs0VarH4.b).t(rd90VarA2);
                                    appStartTrace.b.c((ibs0) fbs0VarH4.h(), ts3.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: a.lh3
                        public final /* synthetic */ AppStartTrace b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            AppStartTrace appStartTrace = this.b;
                            switch (b4) {
                                case 0:
                                    Timer timer = AppStartTrace.x;
                                    fbs0 fbs0Var = appStartTrace.d;
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        fbs0 fbs0VarH = ibs0.H();
                                        fbs0VarH.p("_experiment_onDrawFoQ");
                                        fbs0VarH.n(appStartTrace.b().f45671a);
                                        fbs0VarH.o(appStartTrace.b().b(appStartTrace.q));
                                        fbs0Var.j((ibs0) fbs0VarH.h());
                                        if (appStartTrace.g != null) {
                                            fbs0 fbs0VarH2 = ibs0.H();
                                            fbs0VarH2.p("_experiment_procStart_to_classLoad");
                                            fbs0VarH2.n(appStartTrace.b().f45671a);
                                            fbs0VarH2.o(appStartTrace.b().b(appStartTrace.a()));
                                            fbs0Var.j((ibs0) fbs0VarH2.h());
                                        }
                                        String str = appStartTrace.v ? "true" : "false";
                                        fbs0Var.i();
                                        ((ibs0) fbs0Var.b).G().put("systemDeterminedForeground", str);
                                        fbs0Var.m(appStartTrace.t, "onDrawCount");
                                        rd90 rd90VarA = appStartTrace.r.a();
                                        fbs0Var.i();
                                        ((ibs0) fbs0Var.b).t(rd90VarA);
                                        appStartTrace.d(fbs0Var);
                                        break;
                                    }
                                    break;
                                case 1:
                                    Timer timer2 = AppStartTrace.x;
                                    fbs0 fbs0Var2 = appStartTrace.d;
                                    if (appStartTrace.o == null) {
                                        appStartTrace.o = new Timer();
                                        fbs0Var2.n(appStartTrace.b().f45671a);
                                        fbs0Var2.o(appStartTrace.b().b(appStartTrace.o));
                                        appStartTrace.d(fbs0Var2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    Timer timer3 = AppStartTrace.x;
                                    fbs0 fbs0Var3 = appStartTrace.d;
                                    if (appStartTrace.p == null) {
                                        appStartTrace.p = new Timer();
                                        fbs0 fbs0VarH3 = ibs0.H();
                                        fbs0VarH3.p("_experiment_preDrawFoQ");
                                        fbs0VarH3.n(appStartTrace.b().f45671a);
                                        fbs0VarH3.o(appStartTrace.b().b(appStartTrace.p));
                                        fbs0Var3.j((ibs0) fbs0VarH3.h());
                                        appStartTrace.d(fbs0Var3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer4 = AppStartTrace.x;
                                    fbs0 fbs0VarH4 = ibs0.H();
                                    fbs0VarH4.p("_as");
                                    fbs0VarH4.n(appStartTrace.a().f45671a);
                                    fbs0VarH4.o(appStartTrace.a().b(appStartTrace.l));
                                    ArrayList arrayList = new ArrayList(3);
                                    fbs0 fbs0VarH5 = ibs0.H();
                                    fbs0VarH5.p("_astui");
                                    fbs0VarH5.n(appStartTrace.a().f45671a);
                                    fbs0VarH5.o(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((ibs0) fbs0VarH5.h());
                                    if (appStartTrace.k != null) {
                                        fbs0 fbs0VarH6 = ibs0.H();
                                        fbs0VarH6.p("_astfd");
                                        fbs0VarH6.n(appStartTrace.i.f45671a);
                                        fbs0VarH6.o(appStartTrace.i.b(appStartTrace.k));
                                        arrayList.add((ibs0) fbs0VarH6.h());
                                        fbs0 fbs0VarH7 = ibs0.H();
                                        fbs0VarH7.p("_asti");
                                        fbs0VarH7.n(appStartTrace.k.f45671a);
                                        fbs0VarH7.o(appStartTrace.k.b(appStartTrace.l));
                                        arrayList.add((ibs0) fbs0VarH7.h());
                                    }
                                    fbs0VarH4.i();
                                    ((ibs0) fbs0VarH4.b).s(arrayList);
                                    rd90 rd90VarA2 = appStartTrace.r.a();
                                    fbs0VarH4.i();
                                    ((ibs0) fbs0VarH4.b).t(rd90VarA2);
                                    appStartTrace.b.c((ibs0) fbs0VarH4.h(), ts3.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                }
                if (this.l != null) {
                    return;
                }
                new WeakReference(activity);
                this.l = new Timer();
                this.r = SessionManager.getInstance().perfSession();
                f03.d().a("onResume(): " + activity.getClass().getName() + ": " + a().b(this.l) + " microseconds");
                final byte b4 = 3;
                A.execute(new Runnable(this) { // from class: a.lh3
                    public final /* synthetic */ AppStartTrace b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b4;
                        AppStartTrace appStartTrace = this.b;
                        switch (b5) {
                            case 0:
                                Timer timer = AppStartTrace.x;
                                fbs0 fbs0Var = appStartTrace.d;
                                if (appStartTrace.q == null) {
                                    appStartTrace.q = new Timer();
                                    fbs0 fbs0VarH = ibs0.H();
                                    fbs0VarH.p("_experiment_onDrawFoQ");
                                    fbs0VarH.n(appStartTrace.b().f45671a);
                                    fbs0VarH.o(appStartTrace.b().b(appStartTrace.q));
                                    fbs0Var.j((ibs0) fbs0VarH.h());
                                    if (appStartTrace.g != null) {
                                        fbs0 fbs0VarH2 = ibs0.H();
                                        fbs0VarH2.p("_experiment_procStart_to_classLoad");
                                        fbs0VarH2.n(appStartTrace.b().f45671a);
                                        fbs0VarH2.o(appStartTrace.b().b(appStartTrace.a()));
                                        fbs0Var.j((ibs0) fbs0VarH2.h());
                                    }
                                    String str = appStartTrace.v ? "true" : "false";
                                    fbs0Var.i();
                                    ((ibs0) fbs0Var.b).G().put("systemDeterminedForeground", str);
                                    fbs0Var.m(appStartTrace.t, "onDrawCount");
                                    rd90 rd90VarA = appStartTrace.r.a();
                                    fbs0Var.i();
                                    ((ibs0) fbs0Var.b).t(rd90VarA);
                                    appStartTrace.d(fbs0Var);
                                    break;
                                }
                                break;
                            case 1:
                                Timer timer2 = AppStartTrace.x;
                                fbs0 fbs0Var2 = appStartTrace.d;
                                if (appStartTrace.o == null) {
                                    appStartTrace.o = new Timer();
                                    fbs0Var2.n(appStartTrace.b().f45671a);
                                    fbs0Var2.o(appStartTrace.b().b(appStartTrace.o));
                                    appStartTrace.d(fbs0Var2);
                                    break;
                                }
                                break;
                            case 2:
                                Timer timer3 = AppStartTrace.x;
                                fbs0 fbs0Var3 = appStartTrace.d;
                                if (appStartTrace.p == null) {
                                    appStartTrace.p = new Timer();
                                    fbs0 fbs0VarH3 = ibs0.H();
                                    fbs0VarH3.p("_experiment_preDrawFoQ");
                                    fbs0VarH3.n(appStartTrace.b().f45671a);
                                    fbs0VarH3.o(appStartTrace.b().b(appStartTrace.p));
                                    fbs0Var3.j((ibs0) fbs0VarH3.h());
                                    appStartTrace.d(fbs0Var3);
                                    break;
                                }
                                break;
                            default:
                                Timer timer4 = AppStartTrace.x;
                                fbs0 fbs0VarH4 = ibs0.H();
                                fbs0VarH4.p("_as");
                                fbs0VarH4.n(appStartTrace.a().f45671a);
                                fbs0VarH4.o(appStartTrace.a().b(appStartTrace.l));
                                ArrayList arrayList = new ArrayList(3);
                                fbs0 fbs0VarH5 = ibs0.H();
                                fbs0VarH5.p("_astui");
                                fbs0VarH5.n(appStartTrace.a().f45671a);
                                fbs0VarH5.o(appStartTrace.a().b(appStartTrace.i));
                                arrayList.add((ibs0) fbs0VarH5.h());
                                if (appStartTrace.k != null) {
                                    fbs0 fbs0VarH6 = ibs0.H();
                                    fbs0VarH6.p("_astfd");
                                    fbs0VarH6.n(appStartTrace.i.f45671a);
                                    fbs0VarH6.o(appStartTrace.i.b(appStartTrace.k));
                                    arrayList.add((ibs0) fbs0VarH6.h());
                                    fbs0 fbs0VarH7 = ibs0.H();
                                    fbs0VarH7.p("_asti");
                                    fbs0VarH7.n(appStartTrace.k.f45671a);
                                    fbs0VarH7.o(appStartTrace.k.b(appStartTrace.l));
                                    arrayList.add((ibs0) fbs0VarH7.h());
                                }
                                fbs0VarH4.i();
                                ((ibs0) fbs0VarH4.b).s(arrayList);
                                rd90 rd90VarA2 = appStartTrace.r.a();
                                fbs0VarH4.i();
                                ((ibs0) fbs0VarH4.b).t(rd90VarA2);
                                appStartTrace.b.c((ibs0) fbs0VarH4.h(), ts3.FOREGROUND_BACKGROUND);
                                break;
                        }
                    }
                });
                if (!zBooleanValue) {
                    e();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.s && this.k == null && !this.f) {
            this.k = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @kh60(kkz.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.s || this.f || this.n != null) {
            return;
        }
        this.n = new Timer();
        fbs0 fbs0VarH = ibs0.H();
        fbs0VarH.p("_experiment_firstBackgrounding");
        fbs0VarH.n(b().f45671a);
        fbs0VarH.o(b().b(this.n));
        this.d.j((ibs0) fbs0VarH.h());
    }

    @kh60(kkz.ON_START)
    public void onAppEnteredForeground() {
        if (this.s || this.f || this.m != null) {
            return;
        }
        this.m = new Timer();
        fbs0 fbs0VarH = ibs0.H();
        fbs0VarH.p("_experiment_firstForegrounding");
        fbs0VarH.n(b().f45671a);
        fbs0VarH.o(b().b(this.m));
        this.d.j((ibs0) fbs0VarH.h());
    }
}
