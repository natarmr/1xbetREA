package a;

import android.util.Log;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gpj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmi0 f11687a;
    public final vji0 b;
    public final uji0 c;
    public final olq0 d;
    public final wbj e;
    public final qyb0 f;
    public final CoroutineContext g;
    public gji0 h;
    public boolean i;
    public boolean j;
    public String k;

    public gpj0(xmi0 xmi0Var, vji0 vji0Var, uji0 uji0Var, olq0 olq0Var, wbj wbjVar, qyb0 qyb0Var, CoroutineContext coroutineContext) {
        xmi0Var.getClass();
        vji0Var.getClass();
        uji0Var.getClass();
        olq0Var.getClass();
        wbjVar.getClass();
        qyb0Var.getClass();
        coroutineContext.getClass();
        this.f11687a = xmi0Var;
        this.b = vji0Var;
        this.c = uji0Var;
        this.d = olq0Var;
        this.e = wbjVar;
        this.f = qyb0Var;
        this.g = coroutineContext;
        dpj0 dpj0Var = dpj0.f6470a;
        this.k = "";
        qjj.W(d5c.a(coroutineContext), null, null, new cpj0(this, null, (byte) 0), 3);
    }

    public final void a() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        qjj.W(d5c.a(this.g), null, null, new cpj0(this, null, (byte) 1), 3);
    }

    public final void b() {
        this.i = true;
        gji0 gji0Var = this.h;
        if (gji0Var == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        yje yjeVar = null;
        if (gji0Var == null) {
            Intrinsics.h("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (d(gji0Var) || c(gji0Var)) {
            qjj.W(d5c.a(this.g), null, null, new zye0(this, gji0Var, yjeVar, (byte) 26), 3);
        }
    }

    public final boolean c(gji0 gji0Var) {
        Map map = gji0Var.c;
        boolean z = true;
        qyb0 qyb0Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + qyb0Var.a());
            return true;
        }
        qyb0Var.getClass();
        oyb0 oyb0Var = (oyb0) map.get(qyb0Var.a());
        if (oyb0Var != null && oyb0Var.f26054a == qyb0Var.c && Intrinsics.d(oyb0Var.b, (String) qyb0Var.d.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + qyb0Var.a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    public final boolean d(gji0 gji0Var) {
        wen wenVarB;
        long jV0;
        pgq0 pgq0Var = gji0Var.b;
        pji0 pji0Var = gji0Var.f11398a;
        if (pgq0Var == null) {
            Log.d("FirebaseSessions", "Session " + pji0Var.f27093a + " has not backgrounded yet");
            return false;
        }
        this.d.getClass();
        pgq0 pgq0VarA = olq0.a();
        uen uenVar = wen.b;
        long jW0 = ibc.w0(pgq0VarA.f26964a - pgq0Var.f26964a, bfn.MILLISECONDS);
        xmi0 xmi0Var = this.f11687a;
        wen wenVarB2 = xmi0Var.f41126a.b();
        if (wenVarB2 != null) {
            jV0 = wenVarB2.f39026a;
            if (jV0 <= 0 || wen.i(jV0)) {
                wenVarB = xmi0Var.b.b();
                if (wenVarB != null) {
                    jV0 = wenVarB.f39026a;
                    if (jV0 > 0 || wen.i(jV0)) {
                        jV0 = ibc.v0(30, bfn.MINUTES);
                    }
                } else {
                    jV0 = ibc.v0(30, bfn.MINUTES);
                }
            }
        } else {
            wenVarB = xmi0Var.b.b();
            if (wenVarB != null) {
                jV0 = wenVarB.f39026a;
                if (jV0 > 0) {
                    jV0 = ibc.v0(30, bfn.MINUTES);
                } else {
                    jV0 = ibc.v0(30, bfn.MINUTES);
                }
            } else {
                jV0 = ibc.v0(30, bfn.MINUTES);
            }
        }
        boolean z = wen.c(jW0, jV0) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + pji0Var.f27093a + " is expired");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, dpj0 dpj0Var, yje yjeVar) {
        fpj0 fpj0Var;
        String str2;
        if (yjeVar instanceof fpj0) {
            fpj0Var = (fpj0) yjeVar;
            int i = fpj0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                fpj0Var.m = i - Integer.MIN_VALUE;
            } else {
                fpj0Var = new fpj0(this, yjeVar);
            }
        } else {
            fpj0Var = new fpj0(this, yjeVar);
        }
        Object objB = fpj0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = fpj0Var.m;
        if (i2 == 0) {
            z1x.P(objB);
            if (Intrinsics.d(this.k, str)) {
                return Unit.f46060a;
            }
            this.k = str;
            nhq nhqVar = nhq.f23546a;
            fpj0Var.i = str;
            fpj0Var.j = dpj0Var;
            fpj0Var.m = 1;
            objB = nhqVar.b(fpj0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dpj0Var = fpj0Var.j;
            str = fpj0Var.i;
            z1x.P(objB);
        }
        for (a8f a8fVar : ((Map) objB).values()) {
            kki0 kki0Var = new kki0(str);
            a8fVar.getClass();
            String str3 = "App Quality Sessions session changed: " + kki0Var;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            es esVar = a8fVar.b;
            synchronized (esVar) {
                if (!Objects.equals((String) esVar.c, str)) {
                    es.z((xzp) esVar.f8305a, (String) esVar.b, str);
                    esVar.c = str;
                }
            }
            int iOrdinal = dpj0Var.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + jki0.f16670a + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                str2 = "Notified " + jki0.f16670a + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return Unit.f46060a;
    }
}
