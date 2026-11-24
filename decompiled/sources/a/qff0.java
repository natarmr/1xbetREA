package a;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qff0 implements bhq {
    public static final Random j = new Random();
    public static final HashMap k = new HashMap();
    public final Context b;
    public final ScheduledExecutorService c;
    public final nfq d;
    public final dgq e;
    public final gfq f;
    public final p5d0 g;
    public final String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f28630a = new HashMap();
    public final HashMap i = new HashMap();

    public qff0(Context context, ScheduledExecutorService scheduledExecutorService, nfq nfqVar, dgq dgqVar, gfq gfqVar, p5d0 p5d0Var) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = nfqVar;
        this.e = dgqVar;
        this.f = gfqVar;
        this.g = p5d0Var;
        nfqVar.a();
        this.h = nfqVar.c.b;
        AtomicReference atomicReference = pff0.f26902a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = pff0.f26902a;
        if (atomicReference2.get() == null) {
            pff0 pff0Var = new pff0();
            while (!atomicReference2.compareAndSet(null, pff0Var)) {
                if (atomicReference2.get() != null) {
                }
            }
            fc5.b(application);
            fc5.e.a(pff0Var);
        }
        Tasks.call(scheduledExecutorService, new hrd(this, (byte) 5));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public final synchronized xgq a(nfq nfqVar, String str, dgq dgqVar, gfq gfqVar, Executor executor, krd krdVar, krd krdVar2, krd krdVar3, rrd rrdVar, srd srdVar, msd msdVar, n660 n660Var) {
        gfq gfqVar2;
        if (!this.f28630a.containsKey(str)) {
            if (str.equals("firebase")) {
                nfqVar.a();
                if (nfqVar.b.equals("[DEFAULT]")) {
                    gfqVar2 = gfqVar;
                } else {
                    gfqVar2 = null;
                }
            } else {
                gfqVar2 = null;
            }
            Context context = this.b;
            synchronized (this) {
                ScheduledExecutorService scheduledExecutorService = this.c;
                phf0 phf0Var = new phf0();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                phf0Var.f26994a = linkedHashSet;
                phf0Var.b = new esd(nfqVar, dgqVar, rrdVar, krdVar2, context, str, linkedHashSet, msdVar, scheduledExecutorService);
                phf0Var.c = scheduledExecutorService;
                xgq xgqVar = new xgq(gfqVar2, executor, krdVar, krdVar2, krdVar3, rrdVar, srdVar, msdVar, phf0Var, n660Var);
                krdVar2.b();
                krdVar3.b();
                krdVar.b();
                this.f28630a.put(str, xgqVar);
                k.put(str, xgqVar);
            }
        }
        return (xgq) this.f28630a.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006f  */
    public final synchronized xgq b(String str) throws Throwable {
        Throwable th;
        zn00 zn00Var;
        try {
            try {
                krd krdVarC = c(str, "fetch");
                krd krdVarC2 = c(str, "activate");
                krd krdVarC3 = c(str, "defaults");
                try {
                    msd msdVar = new msd(this.b.getSharedPreferences("frc_" + this.h + BundleUtil.UNDERLINE_TAG + str + "_settings", 0));
                    srd srdVar = new srd(this.c, krdVarC2, krdVarC3);
                    nfq nfqVar = this.d;
                    p5d0 p5d0Var = this.g;
                    nfqVar.a();
                    if (nfqVar.b.equals("[DEFAULT]")) {
                        try {
                            if (str.equals("firebase")) {
                                zn00Var = new zn00();
                                zn00Var.b = Collections.synchronizedMap(new HashMap());
                                zn00Var.f44650a = p5d0Var;
                            } else {
                                zn00Var = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        zn00Var = null;
                    }
                    if (zn00Var != null) {
                        off0 off0Var = new off0(zn00Var);
                        synchronized (srdVar.f32670a) {
                            srdVar.f32670a.add(off0Var);
                        }
                    }
                    j910 j910Var = new j910((byte) 23);
                    j910Var.b = krdVarC2;
                    j910Var.c = krdVarC3;
                    ScheduledExecutorService scheduledExecutorService = this.c;
                    n660 n660Var = new n660();
                    n660Var.d = Collections.newSetFromMap(new ConcurrentHashMap());
                    n660Var.f22981a = krdVarC2;
                    n660Var.b = j910Var;
                    n660Var.c = scheduledExecutorService;
                    return a(this.d, str, this.e, this.f, this.c, krdVarC, krdVarC2, krdVarC3, d(str, krdVarC, msdVar), srdVar, msdVar, n660Var);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            throw th;
        }
    }

    public final krd c(String str, String str2) {
        nsd nsdVar;
        krd krdVar;
        String strN = axq.n(b1j.n("frc_", this.h, BundleUtil.UNDERLINE_TAG, str, BundleUtil.UNDERLINE_TAG), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.b;
        HashMap map = nsd.c;
        synchronized (nsd.class) {
            try {
                HashMap map2 = nsd.c;
                if (!map2.containsKey(strN)) {
                    map2.put(strN, new nsd(context, strN));
                }
                nsdVar = (nsd) map2.get(strN);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = krd.d;
        synchronized (krd.class) {
            try {
                String str3 = nsdVar.b;
                HashMap map4 = krd.d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new krd(scheduledExecutorService, nsdVar));
                }
                krdVar = (krd) map4.get(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return krdVar;
    }

    public final synchronized rrd d(String str, krd krdVar, msd msdVar) {
        dgq dgqVar;
        Object ogdVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str2;
        nfq nfqVar;
        try {
            dgqVar = this.e;
            nfq nfqVar2 = this.d;
            nfqVar2.a();
            ogdVar = nfqVar2.b.equals("[DEFAULT]") ? this.g : new ogd((byte) 10);
            scheduledExecutorService = this.c;
            random = j;
            nfq nfqVar3 = this.d;
            nfqVar3.a();
            str2 = nfqVar3.c.f21755a;
            nfqVar = this.d;
            nfqVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new rrd((Object) dgqVar, ogdVar, (Object) scheduledExecutorService, (Object) random, (Object) krdVar, (Object) new ConfigFetchHttpClient(this.b, nfqVar.c.b, str2, str, msdVar.f22313a.getLong("fetch_timeout_in_seconds", 60L), msdVar.f22313a.getLong("fetch_timeout_in_seconds", 60L)), (Object) msdVar, (Object) this.i, (byte) 0);
    }
}
