package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z5x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43839a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ z5x0(l6x0 l6x0Var, m5 m5Var) {
        this.b = l6x0Var;
        this.c = m5Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[Catch: CancellationException -> 0x004a, ExecutionException -> 0x004d, TryCatch #3 {CancellationException -> 0x004a, ExecutionException -> 0x004d, blocks: (B:10:0x002f, B:12:0x0045, B:25:0x0059, B:27:0x0067, B:29:0x0073, B:35:0x0083, B:37:0x0087, B:19:0x0050, B:40:0x00bf), top: B:46:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: CancellationException -> 0x004a, ExecutionException -> 0x004d, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x004a, ExecutionException -> 0x004d, blocks: (B:10:0x002f, B:12:0x0045, B:25:0x0059, B:27:0x0067, B:29:0x0073, B:35:0x0083, B:37:0x0087, B:19:0x0050, B:40:0x00bf), top: B:46:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        td9 td9Var;
        r7x0 r7x0Var;
        switch (this.f43839a) {
            case 0:
                l6x0 l6x0Var = (l6x0) this.b;
                try {
                    y7x0 y7x0Var = (y7x0) hkb.E((m5) this.c);
                    td9 td9Var2 = new td9(y7x0Var, new un00(6, 2));
                    boolean z = l6x0Var.d;
                    if (z || (td9Var = l6x0Var.f19530a) == null) {
                        synchronized (l6x0Var) {
                            if (!z) {
                                td9Var = l6x0Var.f19530a;
                                if (td9Var != null) {
                                    if (!k9x.I((wcf0) td9Var.d, (wcf0) td9Var2.d)) {
                                        r7x0Var = (r7x0) l6x0Var.b.e.get();
                                        if (r7x0Var != null) {
                                            r7x0Var.zza();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            l6x0Var.f19530a = td9Var2;
                            l6x0Var.f.f43322a.incrementAndGet();
                        }
                    } else if (!k9x.I((wcf0) td9Var.d, (wcf0) td9Var2.d)) {
                        r7x0Var = (r7x0) l6x0Var.b.e.get();
                        if (r7x0Var != null) {
                            r7x0Var.zza();
                            return;
                        }
                        return;
                    }
                    if (l6x0Var.d) {
                        c1x0 c1x0Var = l6x0Var.b;
                        y2x0 y2x0Var = (y2x0) c1x0Var.d.get();
                        String strR = y7x0Var.r();
                        y2x0Var.getClass();
                        strR.getClass();
                        d1 d1VarB = y2x0.b(y2x0Var.f41927a.c(strR));
                        a6x0 a6x0Var = new a6x0(l6x0Var, (byte) 0);
                        fr40 fr40VarA = c1x0Var.a();
                        e1 e1Var = new e1(d1VarB, Throwable.class, a6x0Var);
                        d1VarB.a(e1Var, n2x.I(fr40VarA, e1Var));
                        return;
                    }
                    return;
                } catch (CancellationException e) {
                    e = e;
                    if (e.getCause() instanceof SecurityException) {
                        return;
                    }
                    String str = l6x0Var.c;
                    Log.w("FlagStore", rw2.o(new StringBuilder(String.valueOf(str).length() + 64), "Unable to update local snapshot for ", str, ", may result in stale flags."), e);
                    return;
                } catch (ExecutionException e2) {
                    e = e2;
                    if (e.getCause() instanceof SecurityException) {
                        String str2 = l6x0Var.c;
                        Log.w("FlagStore", rw2.o(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e);
                        return;
                    }
                    return;
                }
            default:
                m6x0 m6x0Var = (m6x0) this.b;
                m6x0Var.V();
                Runnable runnable = this.c;
                m6x0Var.J().m1();
                ArrayList arrayList = m6x0Var.p;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    m6x0Var.p = arrayList;
                }
                arrayList.add(runnable);
                m6x0Var.l();
                return;
        }
    }

    public z5x0(drm0 drm0Var, m6x0 m6x0Var, Runnable runnable) {
        this.b = m6x0Var;
        this.c = runnable;
    }
}
