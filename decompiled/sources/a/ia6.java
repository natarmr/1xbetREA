package a;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ia6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f14421a = new zfn(new o85((byte) 22), (byte) 1);
    public static Boolean b;

    public static final void a(final j83 j83Var, final y9q0 y9q0Var, final mrq mrqVar, final List list, final boolean z, fet fetVar) {
        Executor executor = (Executor) fetVar.k(f14421a);
        if (executor == null || !b(j83Var.b.length())) {
            fetVar.e0(317137883);
            fetVar.r(false);
            return;
        }
        fetVar.e0(315439796);
        final k6z k6zVar = (k6z) fetVar.k(bmd.n);
        final w6k w6kVar = (w6k) fetVar.k(bmd.h);
        try {
            executor.execute(new Runnable() { // from class: a.ga6
                @Override // java.lang.Runnable
                public final void run() {
                    nz40 nz40VarC;
                    y9q0 y9q0Var2 = y9q0Var;
                    k6z k6zVar2 = k6zVar;
                    j83 j83Var2 = j83Var;
                    w6k w6kVar2 = w6kVar;
                    mrq mrqVar2 = mrqVar;
                    boolean z2 = z;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        rfk0 rfk0VarH = xfk0.h();
                        nz40 nz40Var = rfk0VarH instanceof nz40 ? (nz40) rfk0VarH : null;
                        if (nz40Var == null || (nz40VarC = nz40Var.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            rfk0 rfk0VarJ = nz40VarC.j();
                            try {
                                y9q0 y9q0VarA = afn0.A(y9q0Var2, k6zVar2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                w5z w5zVar = new w5z(j83Var2, w6kVar2, mrqVar2, y9q0VarA, list2, z2);
                                w5zVar.e();
                                w5zVar.f();
                                rfk0.q(rfk0VarJ);
                                nz40VarC.w().L();
                                nz40VarC.c();
                                Trace.endSection();
                            } catch (Throwable th) {
                                rfk0.q(rfk0VarJ);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                nz40VarC.c();
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        fetVar.r(false);
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean boolValueOf = b;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
