package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class kpv0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f18694a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        f = unsafe.objectFieldOffset(kpv0.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(kpv0.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(kpv0.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(kpv0.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(kpv0.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(kpv0.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final cuo0 a(cuo0 cuo0Var) {
        if (b() == 127) {
            return cuo0Var;
        }
        if (cuo0Var.b) {
            c.incrementAndGet(this);
        }
        int intVolatile = defpackage.a.f0a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f18694a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, cuo0Var);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return defpackage.a.f0a.getIntVolatile(this, g) - defpackage.a.f0a.getIntVolatile(this, e);
    }

    public final cuo0 c() {
        cuo0 cuo0Var;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            kpv0 kpv0Var = this;
            if (unsafe.compareAndSwapInt(kpv0Var, j, intVolatile, intVolatile + 1) && (cuo0Var = (cuo0) kpv0Var.f18694a.getAndSet(i, null)) != null) {
                if (cuo0Var.b) {
                    c.decrementAndGet(kpv0Var);
                }
                return cuo0Var;
            }
            this = kpv0Var;
        }
    }

    public final cuo0 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f18694a;
        cuo0 cuo0Var = (cuo0) atomicReferenceArray.get(i2);
        if (cuo0Var != null && cuo0Var.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, cuo0Var, null)) {
                if (atomicReferenceArray.get(i2) != cuo0Var) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return cuo0Var;
        }
        return null;
    }
}
