package a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class sav implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static sav r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f31901a;
    public boolean b;
    public TelemetryData c;
    public mmx d;
    public final Context e;
    public final oav f;
    public final nmt0 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final lx3 k;
    public final lx3 l;
    public final jaw0 m;
    public volatile boolean n;

    public sav(Context context, Looper looper) {
        oav oavVar = oav.e;
        this.f31901a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new lx3(0);
        this.l = new lx3(0);
        this.n = true;
        this.e = context;
        jaw0 jaw0Var = new jaw0(looper, this);
        Looper.getMainLooper();
        this.m = jaw0Var;
        this.f = oavVar;
        Object obj = oav.d;
        nmt0 nmt0Var = new nmt0();
        nmt0Var.f23789a = new SparseIntArray();
        this.g = nmt0Var;
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = zjb.d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ufx.F() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
            zjb.d = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            this.n = false;
        }
        jaw0Var.sendMessage(jaw0Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (q) {
            try {
                sav savVar = r;
                if (savVar != null) {
                    savVar.i.incrementAndGet();
                    jaw0 jaw0Var = savVar.m;
                    jaw0Var.sendMessageAtFrontOfQueue(jaw0Var.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status d(ua3 ua3Var, ConnectionResult connectionResult) {
        String str = (String) ua3Var.b.b;
        String strValueOf = String.valueOf(connectionResult);
        return new Status(17, ua80.m(new StringBuilder(str.length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), connectionResult.c, connectionResult);
    }

    public static sav e(Context context) {
        sav savVar;
        synchronized (q) {
            try {
                savVar = r;
                if (savVar == null) {
                    Looper looper = d7x0.b().getLooper();
                    context.getPackageName();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = oav.d;
                    sav savVar2 = new sav(applicationContext, looper);
                    b9v.A = haw0.a(savVar2.e);
                    r = savVar2;
                    savVar = savVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return savVar;
    }

    public final h9w0 b(nav navVar) {
        ua3 ua3Var = navVar.f;
        ConcurrentHashMap concurrentHashMap = this.j;
        h9w0 h9w0Var = (h9w0) concurrentHashMap.get(ua3Var);
        if (h9w0Var == null) {
            h9w0Var = new h9w0(this, navVar);
            concurrentHashMap.put(ua3Var, h9w0Var);
        }
        if (h9w0Var.b.r()) {
            this.l.add(ua3Var);
        }
        h9w0Var.p();
        return h9w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    public final void c(TaskCompletionSource taskCompletionSource, int i, nav navVar) {
        k9w0 k9w0Var;
        sav savVar;
        if (i != 0) {
            ua3 ua3Var = navVar.f;
            if (f()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) peg0.m().b;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        h9w0 h9w0Var = (h9w0) this.j.get(ua3Var);
                        if (h9w0Var != null) {
                            b9v b9vVar = h9w0Var.b;
                            if (b9vVar instanceof hz5) {
                                b9v b9vVar2 = b9vVar;
                                if (b9vVar2.w == null || b9vVar2.q()) {
                                    z = z2;
                                } else {
                                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = k9w0.a(h9w0Var, b9vVar2, i);
                                    if (connectionTelemetryConfigurationA != null) {
                                        h9w0Var.q++;
                                        z = connectionTelemetryConfigurationA.c;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    k9w0Var = null;
                    savVar = this;
                }
                savVar = this;
                k9w0Var = new k9w0(savVar, i, ua3Var, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                k9w0Var = null;
                savVar = this;
            }
            if (k9w0Var != null) {
                Task task = taskCompletionSource.getTask();
                jaw0 jaw0Var = savVar.m;
                Objects.requireNonNull(jaw0Var);
                task.addOnCompleteListener(new k03(jaw0Var, (byte) 4), k9w0Var);
            }
        }
    }

    public final boolean f() {
        int i;
        if (this.b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) peg0.m().b;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.g.f23789a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final boolean g(ConnectionResult connectionResult, int i) {
        PendingIntent activity;
        int i2 = connectionResult.b;
        oav oavVar = this.f;
        oavVar.getClass();
        if (i2 != 9) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    switch (i2) {
                        case 17:
                        case 18:
                        case com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                            break;
                        default:
                            Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(connectionResult)));
                            return false;
                    }
                    break;
            }
        }
        Context context = this.e;
        if (!cjx.U(context)) {
            int i3 = connectionResult.b;
            if (i3 == 0 || (activity = connectionResult.c) == null) {
                activity = null;
                Intent intentA = oavVar.a(context, i3, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i4 = connectionResult.b;
                int i5 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                oavVar.g(context, new ConnectionResult(1, i4, PendingIntent.getActivity(context, 0, intent, iaw0.f14458a | 134217728), connectionResult.d, connectionResult.e));
                return true;
            }
        }
        return false;
    }

    public final void h(ConnectionResult connectionResult, int i) {
        if (g(connectionResult, i)) {
            return;
        }
        jaw0 jaw0Var = this.m;
        jaw0Var.sendMessage(jaw0Var.obtainMessage(5, i, 0, connectionResult));
    }

    /* JADX WARN: Code duplicated, block: B:168:0x034f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0355  */
    /* JADX WARN: Code duplicated, block: B:172:0x0387  */
    /* JADX WARN: Code duplicated, block: B:174:0x0391  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 a.h9w0, still in use, count: 2, list:
          (r2v11 a.h9w0) from 0x0347: IGET (r2v11 a.h9w0) A[WRAPPED] (LINE:840) a.h9w0.l int
          (r2v11 a.h9w0) from 0x034d: PHI (r2 I:??) = (r2v8 a.h9w0), (r2v11 a.h9w0) binds: [B:166:0x034c, B:221:0x034d] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sav.handleMessage(android.os.Message):boolean");
    }
}
