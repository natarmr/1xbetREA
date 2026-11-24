package a;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class une implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(une.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(une.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(une.class, "_isTerminated$volatile");
    public static final pfw k = new pfw("NOT_IN_STACK", (byte) 6);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35956a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final u7v e;
    public final u7v f;
    public final gsf0 g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public une(String str, int i2, int i3, long j2) {
        this.f35956a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 < 1) {
            c99.s(ua80.e(i2, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i3 < i2) {
            c99.s(f140.j(i3, "Max pool size ", i2, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i3 > 2097150) {
            c99.s(ua80.e(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j2 <= 0) {
            c99.s(axq.h(j2, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.e = new u7v();
        this.f = new u7v();
        this.g = new gsf0((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
    }

    public static /* synthetic */ void d(une uneVar, Runnable runnable, int i2) {
        uneVar.c(runnable, false, (i2 & 4) == 0);
    }

    public final int a() {
        synchronized (this.g) {
            try {
                if (j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f35956a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.g.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                sne sneVar = new sne(this, i4);
                this.g.c(i4, sneVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                sneVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, boolean z, boolean z2) {
        cuo0 nuo0Var;
        tne tneVar;
        xuo0.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof cuo0) {
            nuo0Var = (cuo0) runnable;
            nuo0Var.f4997a = jNanoTime;
            nuo0Var.b = z;
        } else {
            nuo0Var = new nuo0(runnable, jNanoTime, z);
        }
        boolean z3 = nuo0Var.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        sne sneVar = threadCurrentThread instanceof sne ? (sne) threadCurrentThread : null;
        if (sneVar == null || sneVar.h != this) {
            sneVar = null;
        }
        if (sneVar != null && (tneVar = sneVar.c) != tne.e && (nuo0Var.b || tneVar != tne.b)) {
            sneVar.g = true;
            kpv0 kpv0Var = sneVar.f32489a;
            if (z2) {
                nuo0Var = kpv0Var.a(nuo0Var);
            } else {
                kpv0Var.getClass();
                cuo0 cuo0Var = (cuo0) defpackage.a.f0a.getAndSetObject(kpv0Var, kpv0.f, nuo0Var);
                nuo0Var = cuo0Var == null ? null : kpv0Var.a(cuo0Var);
            }
        }
        if (nuo0Var != null) {
            if (!(nuo0Var.b ? this.f.a(nuo0Var) : this.e.a(nuo0Var))) {
                throw new RejectedExecutionException(axq.n(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z3) {
            if (l() || k(jAddAndGet)) {
                return;
            }
            l();
            return;
        }
        if (l() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        l();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i2;
        cuo0 cuo0VarA;
        if (j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            sne sneVar = threadCurrentThread instanceof sne ? (sne) threadCurrentThread : null;
            if (sneVar == null || sneVar.h != this) {
                sneVar = null;
            }
            synchronized (this.g) {
                i2 = (int) (i.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object objB = this.g.b(i3);
                    objB.getClass();
                    sne sneVar2 = (sne) objB;
                    if (sneVar2 != sneVar) {
                        while (sneVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(sneVar2);
                            sneVar2.join(10000L);
                        }
                        kpv0 kpv0Var = sneVar2.f32489a;
                        u7v u7vVar = this.f;
                        kpv0Var.getClass();
                        cuo0 cuo0Var = (cuo0) defpackage.a.f0a.getAndSetObject(kpv0Var, kpv0.f, (Object) null);
                        if (cuo0Var != null) {
                            u7vVar.a(cuo0Var);
                        }
                        while (true) {
                            cuo0 cuo0VarC = kpv0Var.c();
                            if (cuo0VarC == null) {
                                break;
                            } else {
                                u7vVar.a(cuo0VarC);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (sneVar != null) {
                    cuo0VarA = sneVar.a(true);
                    if (cuo0VarA == null) {
                        cuo0VarA = (cuo0) this.e.d();
                        if (cuo0VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    cuo0VarA = (cuo0) this.e.d();
                    if (cuo0VarA == null && (cuo0VarA = (cuo0) this.f.d()) == null) {
                        break;
                    }
                }
                try {
                    cuo0VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (sneVar != null) {
                sneVar.h(tne.e);
            }
            h.set(this, 0L);
            i.set(this, 0L);
        }
    }

    public final void e(sne sneVar, int i2, int i3) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object objC = sneVar.c();
                    while (true) {
                        if (objC == k) {
                            i4 = -1;
                            break;
                        }
                        if (objC == null) {
                            i4 = 0;
                            break;
                        }
                        sne sneVar2 = (sne) objC;
                        int iB = sneVar2.b();
                        if (iB != 0) {
                            i4 = iB;
                            break;
                        }
                        objC = sneVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                long j4 = j3 | ((long) i4);
                une uneVar = this;
                if (atomicLongFieldUpdater.compareAndSet(uneVar, j2, j4)) {
                    return;
                } else {
                    this = uneVar;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(this, runnable, 6);
    }

    public final boolean k(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f35956a;
        if (i2 < i3) {
            int iA = a();
            if (iA == 1 && i3 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        une uneVar;
        pfw pfwVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            sne sneVar = (sne) this.g.b((int) (2097151 & j2));
            if (sneVar == null) {
                sneVar = null;
                uneVar = this;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object objC = sneVar.c();
                while (true) {
                    pfwVar = k;
                    if (objC == pfwVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    sne sneVar2 = (sne) objC;
                    iB = sneVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = sneVar2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (iB >= 0) {
                    une uneVar2 = this;
                    boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(uneVar2, j2, j3 | ((long) iB));
                    uneVar = uneVar2;
                    if (zCompareAndSet) {
                        sneVar.g(pfwVar);
                    }
                    this = uneVar;
                } else {
                    continue;
                }
            }
            if (sneVar == null) {
                return false;
            }
            if (sne.i.compareAndSet(sneVar, -1, 0)) {
                LockSupport.unpark(sneVar);
                return true;
            }
            this = uneVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        gsf0 gsf0Var = this.g;
        int iA = gsf0Var.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            sne sneVar = (sne) gsf0Var.b(i7);
            if (sneVar != null) {
                kpv0 kpv0Var = sneVar.f32489a;
                kpv0Var.getClass();
                Object objectVolatile = defpackage.a.f0a.getObjectVolatile(kpv0Var, kpv0.f);
                int iB = kpv0Var.b();
                if (objectVolatile != null) {
                    iB++;
                }
                int iOrdinal = sneVar.c.ordinal();
                if (iOrdinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i4++;
                } else if (iOrdinal == 3) {
                    i5++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    i6++;
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(qjj.R(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f35956a;
        sb4.append(i8);
        sb4.append(", max = ");
        axq.r(this.b, i2, "}, Worker States {CPU = ", ", blocking = ", sb4);
        axq.r(i3, i4, ", parked = ", ", dormant = ", sb4);
        axq.r(i5, i6, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
