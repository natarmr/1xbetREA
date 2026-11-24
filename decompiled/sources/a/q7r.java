package a;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class q7r extends c2 implements ue80 {
    public final int c;
    public final int d;
    public final z04 e;
    public final /* synthetic */ s7r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7r(s7r s7rVar, int i, int i2, z04 z04Var) {
        super((byte) 7);
        this.f = s7rVar;
        this.c = i;
        this.d = i2;
        this.e = z04Var;
    }

    @Override // a.c2
    public final void G() {
        boolean zIsTerminated;
        odd oddVar = (odd) this.b;
        Object obj = null;
        if (oddVar.isCompleted() && !oddVar.isCancelled()) {
            Object obj2 = ((bf80) oddVar.B()).f2490a;
            if (!(obj2 instanceof df80) && obj2 != null) {
                obj = obj2;
            }
        }
        b3x b3xVar = (voj0) obj;
        if (b3xVar != null) {
            if (b3xVar instanceof AutoCloseable) {
                b3xVar.close();
                return;
            }
            if (!(b3xVar instanceof ExecutorService)) {
                e9d0.o();
                return;
            }
            ExecutorService executorService = (ExecutorService) b3xVar;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // a.ue80
    public final void b(Object obj) {
        int i;
        Object obj2;
        r7r r7rVar;
        AutoCloseable autoCloseableA;
        boolean zIsTerminated;
        boolean z = obj instanceof df80;
        ye80 ye80Var = (ye80) ((z || obj == null) ? null : obj);
        if (ye80Var != null) {
            if (ye80Var instanceof voj0) {
                autoCloseableA = ((voj0) ye80Var).a();
            } else {
                voj0 voj0Var = (voj0) ye80Var.H(sre0.f32672a.b(voj0.class));
                autoCloseableA = voj0Var != null ? voj0Var.a() : new voj0(ye80Var, new ywu(ye80Var));
            }
            if (!((odd) this.b).N(new bf80(autoCloseableA))) {
                if (autoCloseableA instanceof AutoCloseable) {
                    autoCloseableA.close();
                } else {
                    if (!(autoCloseableA instanceof ExecutorService)) {
                        e9d0.o();
                        return;
                    }
                    ExecutorService executorService = (ExecutorService) autoCloseableA;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z2 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        } else {
            odd oddVar = (odd) this.b;
            if (z || obj == null) {
                i = obj == null ? 2 : ((df80) obj).f5987a;
            } else {
                i = 1;
            }
            oddVar.N(new bf80(new df80(i)));
        }
        z04 z04Var = this.e;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z04.b;
        if (atomicIntegerFieldUpdater.decrementAndGet(z04Var) == 0) {
            Iterator it = this.f.h.iterator();
            it.getClass();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
            s7r s7rVar = this.f;
            z04 z04Var2 = s7rVar.g;
            z04Var2.getClass();
            if (atomicIntegerFieldUpdater.decrementAndGet(z04Var2) != 0) {
                return;
            }
            c14 c14Var = s7rVar.f;
            do {
                obj2 = c14Var.f3556a;
                r7r r7rVar2 = (r7r) obj2;
                int iOrdinal = r7rVar2.ordinal();
                if (iOrdinal == 0) {
                    r7rVar = r7r.c;
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalStateException("Unexpected frame state for " + s7rVar + "! State is " + r7rVar2 + ' ');
                    }
                    r7rVar = r7r.d;
                }
            } while (!c14Var.a(obj2, r7rVar));
            Iterator it2 = s7rVar.h.iterator();
            it2.getClass();
            if (it2.hasNext()) {
                throw rw2.h(it2);
            }
            if (r7rVar == r7r.d) {
                Iterator it3 = s7rVar.h.iterator();
                it3.getClass();
                if (it3.hasNext()) {
                    throw rw2.h(it3);
                }
            }
        }
    }
}
