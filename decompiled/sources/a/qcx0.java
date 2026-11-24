package a;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qcx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f28506a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        o6x0 o6x0Var;
        icx0 icx0Var;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f28506a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                o6x0Var = null;
            } else {
                weakHashMap2.put(th, (lcx0) weakHashMap2.get(cause2));
                o6x0Var = new o6x0();
            }
        }
        if (o6x0Var != null || (icx0Var = wcx0.c().b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (icx0Var = wcx0.c().b; icx0Var != null; icx0Var = icx0Var.f14557a) {
            arrayList.add(icx0Var);
        }
        UUID uuid = ((icx0) arrayList.get(0)).b;
        ((icx0) arrayList.get(0)).getClass();
        u3x u3xVarM = b4x.m(arrayList.size());
        u3x u3xVarM2 = b4x.m(arrayList.size());
        for (icx0 icx0Var2 : x0x.b0(arrayList)) {
            u3xVarM2.b(icx0Var2.d);
            u3xVarM.b(icx0Var2.c());
        }
        WeakHashMap weakHashMap3 = f28506a;
        synchronized (weakHashMap3) {
            try {
                rcf0 rcf0VarG = u3xVarM2.g();
                if (rcf0VarG == null) {
                    throw new NullPointerException("Null spansNames");
                }
                rcf0 rcf0VarG2 = u3xVarM.g();
                if (rcf0VarG2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new lcx0(rcf0VarG, rcf0VarG2, uuid));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
