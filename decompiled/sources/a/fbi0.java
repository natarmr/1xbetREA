package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class fbi0 {
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9260a;
    public final rqc0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        g = unsafe.objectFieldOffset(fbi0.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(fbi0.class, "deqIdx$volatile");
        h = unsafe.objectFieldOffset(fbi0.class.getDeclaredField("tail$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(fbi0.class, "enqIdx$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(fbi0.class, "_availablePermits$volatile");
        f = unsafe.objectFieldOffset(fbi0.class.getDeclaredField("_availablePermits$volatile"));
    }

    public fbi0(int i) {
        this.f9260a = i;
        if (i <= 0) {
            c99.s(twn.m(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            c99.s(twn.m(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        ibi0 ibi0Var = new ibi0(0L, null, 2);
        this.head$volatile = ibi0Var;
        this.tail$volatile = ibi0Var;
        this._availablePermits$volatile = i;
        this.b = new rqc0(this, (byte) 10);
    }

    public final Object b(zje zjeVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = e;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.f9260a;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return Unit.f46060a;
        }
        n5a n5aVarQ = rq8.Q(pnx.b(zjeVar));
        try {
            if (!e(n5aVarQ)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            n5aVarQ.v(Unit.f46060a, this.b);
                            break;
                        }
                        if (e(n5aVarQ)) {
                            break;
                        }
                    }
                }
            }
            Object objP = n5aVarQ.p();
            wne wneVar = wne.f39444a;
            if (objP != wneVar) {
                objP = Unit.f46060a;
            }
            return objP == wneVar ? objP : Unit.f46060a;
        } catch (Throwable th) {
            n5aVarQ.B();
            throw th;
        }
    }

    public final boolean e(nvu0 nvu0Var) {
        Object objA;
        Unsafe unsafe;
        fbi0 fbi0Var = this;
        Unsafe unsafe2 = defpackage.a.f0a;
        long j = h;
        ibi0 ibi0Var = (ibi0) unsafe2.getObjectVolatile(fbi0Var, j);
        long andIncrement = d.getAndIncrement(fbi0Var);
        dbi0 dbi0Var = dbi0.f5806a;
        long j2 = andIncrement / ((long) hbi0.f);
        loop0: while (true) {
            objA = sqd.a(ibi0Var, j2, dbi0Var);
            if (efx.A(objA)) {
                break;
            }
            wvh0 wvh0VarX = efx.x(objA);
            while (true) {
                wvh0 wvh0Var = (wvh0) defpackage.a.f0a.getObjectVolatile(fbi0Var, j);
                if (wvh0Var.d >= wvh0VarX.d) {
                    fbi0Var = this;
                    break loop0;
                }
                if (!wvh0VarX.j()) {
                    break;
                }
                do {
                    unsafe = defpackage.a.f0a;
                    fbi0Var = this;
                    if (unsafe.compareAndSwapObject(fbi0Var, h, wvh0Var, wvh0VarX)) {
                        if (!wvh0Var.f()) {
                            break loop0;
                        }
                        wvh0Var.e();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(fbi0Var, j) == wvh0Var);
                if (wvh0VarX.f()) {
                    wvh0VarX.e();
                }
            }
            fbi0Var = this;
        }
        ibi0 ibi0Var2 = (ibi0) efx.x(objA);
        AtomicReferenceArray atomicReferenceArray = ibi0Var2.g;
        int i = (int) (andIncrement % ((long) hbi0.f));
        while (!atomicReferenceArray.compareAndSet(i, null, nvu0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                pfw pfwVar = hbi0.b;
                pfw pfwVar2 = hbi0.c;
                while (!atomicReferenceArray.compareAndSet(i, pfwVar, pfwVar2)) {
                    if (atomicReferenceArray.get(i) != pfwVar) {
                        return false;
                    }
                }
                ((m5a) nvu0Var).v(Unit.f46060a, fbi0Var.b);
                return true;
            }
        }
        nvu0Var.a(ibi0Var2, i);
        return true;
    }

    public final void f() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object objA;
        boolean zI;
        Unsafe unsafe2;
        do {
            int andIncrement = e.getAndIncrement(this);
            int i2 = this.f9260a;
            if (andIncrement >= i2) {
                do {
                    unsafe = defpackage.a.f0a;
                    j = f;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.f9260a;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                e9d0.d(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = defpackage.a.f0a;
            long j2 = g;
            ibi0 ibi0Var = (ibi0) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = c.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) hbi0.f);
            ebi0 ebi0Var = ebi0.f7520a;
            while (true) {
                objA = sqd.a(ibi0Var, j3, ebi0Var);
                if (!efx.A(objA)) {
                    wvh0 wvh0VarX = efx.x(objA);
                    while (true) {
                        wvh0 wvh0Var = (wvh0) defpackage.a.f0a.getObjectVolatile(this, j2);
                        if (wvh0Var.d >= wvh0VarX.d) {
                            break;
                        }
                        if (!wvh0VarX.j()) {
                            break;
                        }
                        do {
                            unsafe2 = defpackage.a.f0a;
                            if (unsafe2.compareAndSwapObject(this, g, wvh0Var, wvh0VarX)) {
                                if (!wvh0Var.f()) {
                                    break;
                                }
                                wvh0Var.e();
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j2) == wvh0Var);
                        if (wvh0VarX.f()) {
                            wvh0VarX.e();
                        }
                    }
                } else {
                    break;
                }
            }
            ibi0 ibi0Var2 = (ibi0) efx.x(objA);
            AtomicReferenceArray atomicReferenceArray = ibi0Var2.g;
            ibi0Var2.a();
            zI = false;
            if (ibi0Var2.d <= j3) {
                int i3 = (int) (andIncrement2 % ((long) hbi0.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, hbi0.b);
                if (andSet == null) {
                    int i4 = hbi0.f12772a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            pfw pfwVar = hbi0.b;
                            pfw pfwVar2 = hbi0.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, pfwVar, pfwVar2)) {
                                    zI = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == pfwVar);
                            zI = !zI;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == hbi0.c) {
                            zI = true;
                            break;
                        }
                        i5++;
                    }
                } else if (andSet != hbi0.e) {
                    if (andSet instanceof m5a) {
                        m5a m5aVar = (m5a) andSet;
                        pfw pfwVarB = m5aVar.b(Unit.f46060a, this.b);
                        if (pfwVarB != null) {
                            m5aVar.w(pfwVarB);
                            zI = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof o2i0)) {
                            udk.e(andSet, "unexpected: ");
                            return;
                        }
                        zI = ((o2i0) andSet).i(this, Unit.f46060a);
                    }
                }
            }
        } while (!zI);
    }
}
