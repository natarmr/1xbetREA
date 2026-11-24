package a;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wcx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f38946a;
    public static final k8x0 b;
    public static final WeakHashMap c;
    public static final y50 d;

    static {
        f4x.l(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f38946a = new AtomicReference(ycf0.j);
        b = new k8x0();
        c = new WeakHashMap();
        d = new y50((byte) 23);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static icx0 a() {
        bex0 bex0VarC = c();
        icx0 icx0Var = bex0VarC.b;
        if (icx0Var != null && icx0Var != kdx0.g) {
            return icx0Var;
        }
        c44 c44Var = fdx0.f;
        ycx0 ycx0Var = ycx0.c;
        long jA = ycx0Var.a() & (-61441);
        long jA2 = ycx0Var.a() >>> 2;
        UUID uuid = ycx0Var.f42405a;
        UUID uuid2 = new UUID(jA ^ uuid.getMostSignificantBits(), jA2 ^ uuid.getLeastSignificantBits());
        String strA = icx0.a(uuid2);
        f4x f4xVar = (f4x) f38946a.get();
        if (!f4xVar.isEmpty()) {
            f4xVar.forEach(new edx0());
        }
        c44 c44Var2 = fdx0.f;
        return new fdx0("<missing root>", uuid2, strA, bex0VarC);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public static icx0 b(bex0 bex0Var, icx0 icx0Var) {
        boolean zEquals;
        bex0Var.getClass();
        icx0 icx0Var2 = bex0Var.b;
        if (icx0Var2 != icx0Var) {
            if (icx0Var2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zEquals = Trace.isEnabled();
                } else {
                    n8x0.f23112a.getClass();
                    b.getClass();
                    String str = "false";
                    try {
                        str = (String) q8x0.f28320a.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e) {
                        Log.e("SystemProperties", "get error", e);
                    }
                    zEquals = str.equals("true");
                }
                bex0Var.f2474a = zEquals;
            }
            if (bex0Var.f2474a) {
                if (icx0Var2 != null) {
                    if (icx0Var != null) {
                        if (icx0Var2.f14557a == icx0Var && !fem0.s(icx0Var2)) {
                            Trace.endSection();
                        } else if (icx0Var2 == icx0Var.f14557a && !fem0.s(icx0Var)) {
                            fem0.t(icx0Var);
                        }
                    }
                    fem0.r(icx0Var2);
                    if (icx0Var != null) {
                        fem0.q(icx0Var);
                    }
                } else if (icx0Var != null) {
                    fem0.q(icx0Var);
                }
            }
            if (icx0Var2 != icx0Var) {
                bex0Var.b = icx0Var;
                return icx0Var2;
            }
        }
        return icx0Var;
    }

    public static bex0 c() {
        return (bex0) d.get();
    }
}
