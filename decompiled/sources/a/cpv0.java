package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes.dex */
public final class cpv0 {
    public static cpv0 k;
    public static cpv0 l;
    public static final Object m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4768a;
    public final wsd b;
    public final WorkDatabase c;
    public final fpv0 d;
    public final List e;
    public final ezb0 f;
    public final o470 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final lds0 j;

    static {
        wv00.h("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public cpv0(Context context, final wsd wsdVar, fpv0 fpv0Var, final WorkDatabase workDatabase, final List list, ezb0 ezb0Var, lds0 lds0Var) {
        Context applicationContext = context.getApplicationContext();
        yje yjeVar = null;
        if (applicationContext.isDeviceProtectedStorage()) {
            jf4.n("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        byte b = 4;
        wv00 wv00Var = new wv00(4, (byte) 0);
        synchronized (wv00.b) {
            try {
                if (wv00.c == null) {
                    wv00.c = wv00Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4768a = applicationContext;
        this.d = fpv0Var;
        this.c = workDatabase;
        this.f = ezb0Var;
        this.j = lds0Var;
        this.b = wsdVar;
        this.e = list;
        sje sjeVar = fpv0Var.c;
        this.g = new o470(workDatabase);
        final xgi0 xgi0Var = fpv0Var.f9946a;
        String str = m2h0.f21060a;
        ezb0Var.a(new zjo() { // from class: a.l2h0
            @Override // a.zjo
            public final void c(xov0 xov0Var, boolean z) {
                xgi0Var.execute(new qx9((Object) workDatabase, (Object) xov0Var, (Object) list, (Object) wsdVar, (byte) 8));
            }
        });
        fpv0Var.a(new ytq(applicationContext, this));
        String str2 = u7t0.f35202a;
        sjeVar.getClass();
        if (zyb0.a(applicationContext, wsdVar)) {
            slb.U(new fnq(i120.W(ulb.D(new a1g(fxb.z(workDatabase.y().f36087a, new String[]{"workspec"}, new ejv0((byte) 10)), new t7t0(4, null), (byte) 20), -1)), new k6s0(applicationContext, yjeVar, (byte) 7), b), sjeVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cpv0 d(Context context) {
        cpv0 cpv0VarD;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        cpv0VarD = k;
                        if (cpv0VarD == null) {
                            cpv0VarD = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return cpv0VarD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cpv0VarD == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof vsd)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            ((ApplicationLoader) ((vsd) applicationContext)).getClass();
            e(applicationContext, new wsd(new usd()));
            cpv0VarD = d(applicationContext);
        }
        return cpv0VarD;
    }

    public static void e(Context context, wsd wsdVar) {
        synchronized (m) {
            try {
                cpv0 cpv0Var = k;
                if (cpv0Var != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (cpv0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    cpv0 cpv0VarP = l;
                    if (cpv0VarP == null) {
                        cpv0VarP = epv0.P(applicationContext, wsdVar);
                        l = cpv0VarP;
                    }
                    k = cpv0VarP;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(lpv0 lpv0Var) {
        lpv0Var.getClass();
        List listC = kotlin.collections.a.c(lpv0Var);
        if (listC.isEmpty()) {
            jf4.o("enqueue needs at least one WorkRequest.");
        } else {
            new qov0(this, null, zko.b, listC, 0).a();
        }
    }

    public final gqw0 b(String str, bg90 bg90Var) {
        yko[] ykoVarArr = yko.f42800a;
        yko[] ykoVarArr2 = yko.f42800a;
        yko[] ykoVarArr3 = yko.f42800a;
        return new qov0(this, str, zko.f44542a, Collections.singletonList(bg90Var), 0).a();
    }

    public final void c(String str, zko zkoVar, yl60 yl60Var) {
        str.getClass();
        yl60Var.getClass();
        new qov0(this, str, zkoVar, kotlin.collections.a.c(yl60Var), 0).a();
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() throws Throwable {
        std stdVar = this.b.f;
        jmv0 jmv0Var = new jmv0(this, (byte) 3);
        boolean zW = afn0.w();
        if (zW) {
            try {
                Trace.beginSection("ReschedulingWork");
            } finally {
                if (zW) {
                    Trace.endSection();
                }
            }
        }
        jmv0Var.invoke();
    }
}
