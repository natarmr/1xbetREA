package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class sne extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(sne.class, "workerCtl$volatile");
    public static final /* synthetic */ long j = defpackage.a.f0a.objectFieldOffset(sne.class.getDeclaredField("workerCtl$volatile"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpv0 f32489a;
    public final mie0 b;
    public tne c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ une h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public sne(une uneVar, int i2) {
        this.h = uneVar;
        setDaemon(true);
        setContextClassLoader(une.class.getClassLoader());
        this.f32489a = new kpv0();
        this.b = new mie0();
        this.c = tne.d;
        this.nextParkedWorker = une.k;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i2);
    }

    public final cuo0 a(boolean z) {
        cuo0 cuo0VarE;
        cuo0 cuo0VarE2;
        long j2;
        Unsafe unsafe;
        tne tneVar = this.c;
        tne tneVar2 = tne.f34229a;
        une uneVar = this.h;
        cuo0 cuo0Var = null;
        kpv0 kpv0Var = this.f32489a;
        if (tneVar != tneVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = une.i;
            do {
                j2 = atomicLongFieldUpdater.get(uneVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    kpv0Var.getClass();
                    long j3 = kpv0.f;
                    loop1: while (true) {
                        Unsafe unsafe2 = defpackage.a.f0a;
                        cuo0 cuo0Var2 = (cuo0) unsafe2.getObjectVolatile(kpv0Var, j3);
                        if (cuo0Var2 == null || !cuo0Var2.b) {
                            int intVolatile = unsafe2.getIntVolatile(kpv0Var, kpv0.e);
                            int intVolatile2 = unsafe2.getIntVolatile(kpv0Var, kpv0.g);
                            while (intVolatile != intVolatile2 && defpackage.a.f0a.getIntVolatile(kpv0Var, kpv0.d) != 0) {
                                intVolatile2--;
                                cuo0 cuo0VarD = kpv0Var.d(intVolatile2, true);
                                if (cuo0VarD != null) {
                                    cuo0Var = cuo0VarD;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            unsafe = defpackage.a.f0a;
                            if (unsafe.compareAndSwapObject(kpv0Var, kpv0.f, cuo0Var2, (Object) null)) {
                                cuo0Var = cuo0Var2;
                                break loop1;
                            }
                        } while (unsafe.getObjectVolatile(kpv0Var, j3) == cuo0Var2);
                    }
                    if (cuo0Var != null) {
                        return cuo0Var;
                    }
                    cuo0 cuo0Var3 = (cuo0) uneVar.f.d();
                    return cuo0Var3 == null ? i(1) : cuo0Var3;
                }
            } while (!une.i.compareAndSet(uneVar, j2, j2 - 4398046511104L));
            this.c = tne.f34229a;
        }
        if (z) {
            boolean z2 = d(uneVar.f35956a * 2) == 0;
            if (z2 && (cuo0VarE2 = e()) != null) {
                return cuo0VarE2;
            }
            kpv0Var.getClass();
            cuo0 cuo0VarC = (cuo0) defpackage.a.f0a.getAndSetObject(kpv0Var, kpv0.f, (Object) null);
            if (cuo0VarC == null) {
                cuo0VarC = kpv0Var.c();
            }
            if (cuo0VarC != null) {
                return cuo0VarC;
            }
            if (!z2 && (cuo0VarE = e()) != null) {
                return cuo0VarE;
            }
        } else {
            cuo0 cuo0VarE3 = e();
            if (cuo0VarE3 != null) {
                return cuo0VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i7 & i6 : (Integer.MAX_VALUE & i6) % i2;
    }

    public final cuo0 e() {
        int iD = d(2);
        une uneVar = this.h;
        u7v u7vVar = uneVar.f;
        u7v u7vVar2 = uneVar.e;
        if (iD == 0) {
            cuo0 cuo0Var = (cuo0) u7vVar2.d();
            return cuo0Var != null ? cuo0Var : (cuo0) u7vVar.d();
        }
        cuo0 cuo0Var2 = (cuo0) u7vVar.d();
        return cuo0Var2 != null ? cuo0Var2 : (cuo0) u7vVar2.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(tne tneVar) {
        tne tneVar2 = this.c;
        boolean z = tneVar2 == tne.f34229a;
        if (z) {
            une.i.addAndGet(this.h, 4398046511104L);
        }
        if (tneVar2 != tneVar) {
            this.c = tneVar;
        }
        return z;
    }

    public final cuo0 i(int i2) {
        int i3;
        long j2;
        cuo0 cuo0VarC;
        long j3;
        long j4;
        Unsafe unsafe;
        AtomicLongFieldUpdater atomicLongFieldUpdater = une.i;
        une uneVar = this.h;
        int i4 = (int) (atomicLongFieldUpdater.get(uneVar) & 2097151);
        cuo0 cuo0Var = null;
        if (i4 < 2) {
            return null;
        }
        int iD = d(i4);
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        while (i5 < i4) {
            iD++;
            if (iD > i4) {
                iD = 1;
            }
            sne sneVar = (sne) uneVar.g.b(iD);
            if (sneVar == null || sneVar == this) {
                i3 = i4;
            } else {
                kpv0 kpv0Var = sneVar.f32489a;
                kpv0Var.getClass();
                if (i2 != 3) {
                    boolean z = i2 == 1;
                    Unsafe unsafe2 = defpackage.a.f0a;
                    j2 = 0;
                    int intVolatile = unsafe2.getIntVolatile(kpv0Var, kpv0.e);
                    int intVolatile2 = unsafe2.getIntVolatile(kpv0Var, kpv0.g);
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i3 = i4;
                                if (defpackage.a.f0a.getIntVolatile(kpv0Var, kpv0.d) == 0) {
                                }
                            } else {
                                i3 = i4;
                            }
                            int i6 = intVolatile + 1;
                            cuo0 cuo0VarD = kpv0Var.d(intVolatile, z);
                            if (cuo0VarD != null) {
                                cuo0VarC = cuo0VarD;
                                break;
                            }
                            intVolatile = i6;
                            i4 = i3;
                        } else {
                            i3 = i4;
                        }
                        cuo0VarC = cuo0Var;
                        break;
                    }
                } else {
                    cuo0VarC = kpv0Var.c();
                    i3 = i4;
                    j2 = 0;
                }
                mie0 mie0Var = this.b;
                if (cuo0VarC == null) {
                    j3 = -1;
                    long j5 = kpv0.f;
                    while (true) {
                        cuo0 cuo0Var2 = (cuo0) defpackage.a.f0a.getObjectVolatile(kpv0Var, j5);
                        if (cuo0Var2 != null) {
                            if (((cuo0Var2.b ? 1 : 2) & i2) != 0) {
                                xuo0.f.getClass();
                                kpv0 kpv0Var2 = kpv0Var;
                                long jNanoTime = System.nanoTime() - cuo0Var2.f4997a;
                                long j6 = xuo0.b;
                                if (jNanoTime < j6) {
                                    j4 = j6 - jNanoTime;
                                    break;
                                }
                                do {
                                    unsafe = defpackage.a.f0a;
                                    if (unsafe.compareAndSwapObject(kpv0Var2, kpv0.f, cuo0Var2, (Object) null)) {
                                        mie0Var.f21842a = cuo0Var2;
                                        j4 = -1;
                                        break;
                                    }
                                } while (unsafe.getObjectVolatile(kpv0Var2, j5) == cuo0Var2);
                                kpv0Var = kpv0Var2;
                            }
                        }
                        j4 = -2;
                        break;
                    }
                } else {
                    mie0Var.f21842a = cuo0VarC;
                    j4 = -1;
                    j3 = -1;
                }
                if (j4 == j3) {
                    cuo0 cuo0Var3 = (cuo0) mie0Var.f21842a;
                    mie0Var.f21842a = null;
                    return cuo0Var3;
                }
                if (j4 > j2) {
                    jMin = Math.min(jMin, j4);
                }
            }
            i5++;
            i4 = i3;
            cuo0Var = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (une.j.get(this.h) != 1) {
                    tne tneVar = this.c;
                    tne tneVar2 = tne.e;
                    if (tneVar == tneVar2) {
                        break loop0;
                    }
                    cuo0 cuo0VarA = a(this.g);
                    if (cuo0VarA != null) {
                        this.e = 0L;
                        une uneVar = this.h;
                        this.d = 0L;
                        if (this.c == tne.c) {
                            this.c = tne.b;
                        }
                        if (!cuo0VarA.b) {
                            try {
                                cuo0VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(tne.b) && !uneVar.l() && !uneVar.k(une.i.get(uneVar))) {
                            uneVar.l();
                        }
                        try {
                            cuo0VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        une.i.addAndGet(uneVar, -2097152L);
                        if (this.c == tneVar2) {
                            break;
                        }
                        this.c = tne.d;
                        break;
                    }
                    this.g = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        pfw pfwVar = une.k;
                        if (obj != pfwVar) {
                            int i2 = -1;
                            defpackage.a.f0a.putIntVolatile(this, j, -1);
                            while (this.nextParkedWorker != une.k) {
                                Unsafe unsafe = defpackage.a.f0a;
                                long j2 = j;
                                if (unsafe.getIntVolatile(this, j2) != i2) {
                                    break;
                                }
                                une uneVar2 = this.h;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = une.j;
                                if (atomicIntegerFieldUpdater.get(uneVar2) == 1) {
                                    break;
                                }
                                tne tneVar3 = this.c;
                                tne tneVar4 = tne.e;
                                if (tneVar3 == tneVar4) {
                                    break;
                                }
                                h(tne.c);
                                Thread.interrupted();
                                if (this.d == 0) {
                                    this.d = System.nanoTime() + this.h.c;
                                }
                                LockSupport.parkNanos(this.h.c);
                                if (System.nanoTime() - this.d >= 0) {
                                    this.d = 0L;
                                    une uneVar3 = this.h;
                                    synchronized (uneVar3.g) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater.get(uneVar3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = une.i;
                                                if (((int) (atomicLongFieldUpdater.get(uneVar3) & 2097151)) > uneVar3.f35956a && unsafe.compareAndSwapInt(this, j2, -1, 1)) {
                                                    int i3 = this.indexInArray;
                                                    f(0);
                                                    uneVar3.e(this, i3, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(uneVar3) & 2097151);
                                                    if (andDecrement != i3) {
                                                        Object objB = uneVar3.g.b(andDecrement);
                                                        objB.getClass();
                                                        sne sneVar = (sne) objB;
                                                        uneVar3.g.c(i3, sneVar);
                                                        sneVar.f(i3);
                                                        uneVar3.e(sneVar, andDecrement, i3);
                                                    }
                                                    uneVar3.g.c(andDecrement, null);
                                                    this.c = tneVar4;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                i2 = -1;
                            }
                        } else {
                            une uneVar4 = this.h;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = une.h;
                            if (this.nextParkedWorker == pfwVar) {
                                while (true) {
                                    long j3 = atomicLongFieldUpdater2.get(uneVar4);
                                    int i4 = this.indexInArray;
                                    this.nextParkedWorker = uneVar4.g.b((int) (j3 & 2097151));
                                    une uneVar5 = uneVar4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (atomicLongFieldUpdater3.compareAndSet(uneVar5, j3, ((j3 + 2097152) & (-2097152)) | ((long) i4))) {
                                        break;
                                    }
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    uneVar4 = uneVar5;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(tne.c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.e);
                            this.e = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(tne.e);
    }
}
