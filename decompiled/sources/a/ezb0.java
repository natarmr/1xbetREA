package a;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ezb0 {
    public static final String l = wv00.h("Processor");
    public final Context b;
    public final wsd c;
    public final fpv0 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f8664a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public ezb0(Context context, wsd wsdVar, fpv0 fpv0Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = wsdVar;
        this.d = fpv0Var;
        this.e = workDatabase;
    }

    public static boolean d(String str, nqv0 nqv0Var, int i) {
        String str2 = l;
        if (nqv0Var == null) {
            wv00.f().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        nqv0Var.l.r(new eqv0(i));
        wv00 wv00VarF = wv00.f();
        StringBuilder sbT = kng0.t("WorkerWrapper interrupted for ", str, " (");
        sbT.append(nqv0Var.f23975a.c);
        sbT.append("), reason: ");
        sbT.append(i);
        wv00VarF.a(str2, sbT.toString());
        return true;
    }

    public final void a(zjo zjoVar) {
        synchronized (this.k) {
            this.j.add(zjoVar);
        }
    }

    public final nqv0 b(String str) {
        nqv0 nqv0Var = (nqv0) this.f.remove(str);
        boolean z = nqv0Var != null;
        if (!z) {
            nqv0Var = (nqv0) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = o9o0.j;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            wv00.f().e(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f8664a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f8664a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return nqv0Var;
    }

    public final nqv0 c(String str) {
        nqv0 nqv0Var = (nqv0) this.f.get(str);
        return nqv0Var == null ? (nqv0) this.g.get(str) : nqv0Var;
    }
}
