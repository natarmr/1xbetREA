package com.google.firebase.messaging;

import a.a6u;
import a.cgp;
import a.cgq;
import a.cig0;
import a.crm0;
import a.csj;
import a.dgq;
import a.drm0;
import a.f8x0;
import a.fd40;
import a.g090;
import a.gx3;
import a.haw0;
import a.hi;
import a.igq;
import a.kgq;
import a.n950;
import a.nfq;
import a.o24;
import a.ogd;
import a.p5d0;
import a.pzu;
import a.s0x;
import a.sbx0;
import a.uq;
import a.uzn0;
import a.v6n0;
import a.viq;
import a.vp2;
import a.w9x;
import a.wxs0;
import a.x0x;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {
    public static drm0 l;
    public static p5d0 m = new ogd(5);
    public static ScheduledThreadPoolExecutor n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfq f45665a;
    public final Context b;
    public final pzu c;
    public final a6u d;
    public final g090 e;
    public final o24 f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final fd40 i;
    public final dgq j;
    public boolean k;

    public FirebaseMessaging(final nfq nfqVar, p5d0 p5d0Var, p5d0 p5d0Var2, final dgq dgqVar, p5d0 p5d0Var3, v6n0 v6n0Var) {
        nfqVar.a();
        Context context = nfqVar.f23449a;
        final fd40 fd40Var = new fd40();
        final byte b = 0;
        fd40Var.d = (byte) 0;
        fd40Var.e = context;
        pzu pzuVar = new pzu(nfqVar, fd40Var, p5d0Var, p5d0Var2, dgqVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new n950("Firebase-Messaging-Task"));
        final byte b2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new n950("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n950("Firebase-Messaging-File-Io"));
        this.k = false;
        m = p5d0Var3;
        this.f45665a = nfqVar;
        o24 o24Var = new o24();
        o24Var.d = this;
        o24Var.b = v6n0Var;
        this.f = o24Var;
        nfqVar.a();
        final Context context2 = nfqVar.f23449a;
        this.b = context2;
        cgp cgpVar = new cgp();
        this.i = fd40Var;
        this.c = pzuVar;
        this.j = dgqVar;
        a6u a6uVar = new a6u(context2, nfqVar, dgqVar, pzuVar, fd40Var);
        this.d = a6uVar;
        g090 g090Var = new g090();
        g090Var.b = new gx3(0);
        g090Var.f10448a = executorServiceNewSingleThreadExecutor;
        this.e = g090Var;
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        nfqVar.a();
        Context context3 = nfqVar.f23449a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(cgpVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (a6uVar.J()) {
            igq igqVar = new igq(this);
            cgq cgqVar = (cgq) dgqVar;
            synchronized (cgqVar) {
                cgqVar.j.add(igqVar);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: a.jgq
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task taskForException;
                int i;
                byte b3 = b;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (b3) {
                    case 0:
                        if (firebaseMessaging.f.h() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context4 = firebaseMessaging.b;
                        w9x.J(context4);
                        pzu pzuVar2 = firebaseMessaging.c;
                        boolean zF = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesR = x9x.R(context4);
                            if (!sharedPreferencesR.contains("proxy_retention") || sharedPreferencesR.getBoolean("proxy_retention", false) != zF) {
                                cig0 cig0Var = (cig0) pzuVar2.c;
                                if (cig0Var.c.t() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    sbx0 sbx0VarM = sbx0.m(cig0Var.b);
                                    synchronized (sbx0VarM) {
                                        i = sbx0VarM.b;
                                        sbx0VarM.b = i + 1;
                                    }
                                    taskForException = sbx0VarM.n(new f8x0(i, 4, bundle, (byte) 0));
                                } else {
                                    taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                taskForException.addOnSuccessListener(new ew3((byte) 1), new glo(context4, zF));
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new n950("Firebase-Messaging-Topics-Io"));
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: a.yfr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xfr0 xfr0Var;
                Context context4 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                fd40 fd40Var2 = fd40Var;
                nfq nfqVar2 = nfqVar;
                FirebaseMessaging firebaseMessaging = this;
                dgq dgqVar2 = dgqVar;
                synchronized (xfr0.class) {
                    try {
                        WeakReference weakReference = xfr0.c;
                        xfr0Var = weakReference != null ? (xfr0) weakReference.get() : null;
                        if (xfr0Var == null) {
                            SharedPreferences sharedPreferences = context4.getSharedPreferences("com.google.android.gms.appid", 0);
                            xfr0 xfr0Var2 = new xfr0(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (xfr0Var2) {
                                xfr0Var2.f40806a = y3v.a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            xfr0.c = new WeakReference(xfr0Var2);
                            xfr0Var = xfr0Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new zfr0(fd40Var2, xfr0Var, new ouu(nfqVar2, firebaseMessaging, dgqVar2), context4, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new kgq(this, b));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: a.jgq
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task taskForException;
                int i;
                byte b3 = b2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (b3) {
                    case 0:
                        if (firebaseMessaging.f.h() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context4 = firebaseMessaging.b;
                        w9x.J(context4);
                        pzu pzuVar2 = firebaseMessaging.c;
                        boolean zF = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesR = x9x.R(context4);
                            if (!sharedPreferencesR.contains("proxy_retention") || sharedPreferencesR.getBoolean("proxy_retention", false) != zF) {
                                cig0 cig0Var = (cig0) pzuVar2.c;
                                if (cig0Var.c.t() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    sbx0 sbx0VarM = sbx0.m(cig0Var.b);
                                    synchronized (sbx0VarM) {
                                        i = sbx0VarM.b;
                                        sbx0VarM.b = i + 1;
                                    }
                                    taskForException = sbx0VarM.n(new f8x0(i, 4, bundle, (byte) 0));
                                } else {
                                    taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                taskForException.addOnSuccessListener(new ew3((byte) 1), new glo(context4, zF));
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = n;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new n950("TAG"));
                    n = scheduledThreadPoolExecutor;
                }
                scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized drm0 c(Context context) {
        drm0 drm0Var;
        drm0Var = l;
        if (drm0Var == null) {
            drm0Var = new drm0(context);
            l = drm0Var;
        }
        return drm0Var;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(nfq nfqVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) nfqVar.b(FirebaseMessaging.class);
        s0x.I(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskContinueWithTask;
        crm0 crm0VarD = d();
        if (!h(crm0VarD)) {
            return crm0VarD.b;
        }
        String strB = fd40.b(this.f45665a);
        g090 g090Var = this.e;
        synchronized (g090Var) {
            taskContinueWithTask = (Task) ((gx3) g090Var.b).get(strB);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strB);
                }
                a6u a6uVar = this.d;
                taskContinueWithTask = a6uVar.L().continueWithTask(Executors.newSingleThreadExecutor(new n950("Firebase-Messaging-Task")), new viq(a6uVar, (byte) 5)).onSuccessTask(this.h, new hi(this, strB, crm0VarD)).continueWithTask((Executor) g090Var.f10448a, new uq((Object) g090Var, (Object) strB, (byte) 26));
                ((gx3) g090Var.b).put(strB, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e) {
            csj.c("FCM Registration failed!", e);
            return null;
        }
    }

    public final crm0 d() {
        crm0 crm0VarB;
        drm0 drm0VarC = c(this.b);
        nfq nfqVar = this.f45665a;
        nfqVar.a();
        String strF = "[DEFAULT]".equals(nfqVar.b) ? "" : nfqVar.f();
        String strB = fd40.b(this.f45665a);
        synchronized (drm0VarC) {
            crm0VarB = crm0.b(((SharedPreferences) drm0VarC.f6568a).getString(strF + "|T|" + strB + "|*", null));
        }
        return crm0VarB;
    }

    public final void e() {
        Task taskForException;
        int i;
        cig0 cig0Var = (cig0) this.c.c;
        byte b = 1;
        if (cig0Var.c.t() >= 241100000) {
            sbx0 sbx0VarM = sbx0.m(cig0Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (sbx0VarM) {
                i = sbx0VarM.b;
                sbx0VarM.b = i + 1;
            }
            taskForException = sbx0VarM.n(new f8x0(i, 5, bundle, (byte) 1)).continueWith(haw0.d, wxs0.b);
        } else {
            taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskForException.addOnSuccessListener(this.g, new kgq(this, b));
    }

    public final boolean f() {
        Context context = this.b;
        w9x.J(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f45665a.b(vp2.class) != null) {
                    return true;
                }
                if (x0x.N() && m != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void g(long j) {
        b(new uzn0(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.k = true;
    }

    public final boolean h(crm0 crm0Var) {
        String str;
        if (crm0Var != null) {
            String str2 = crm0Var.b;
            String strA = this.i.a();
            if (System.currentTimeMillis() <= crm0Var.f4852a + 604800000 && strA.equals(crm0Var.c)) {
                if (!this.d.J()) {
                    return str2.length() <= 22;
                }
                try {
                    str = (String) Tasks.await(((cgq) this.j).c());
                } catch (InterruptedException | ExecutionException unused) {
                    str = null;
                }
                return !str2.equalsIgnoreCase(str);
            }
        }
        return true;
    }
}
