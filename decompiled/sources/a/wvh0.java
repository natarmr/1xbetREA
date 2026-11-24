package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wvh0 extends tqd implements j660 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(wvh0.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = defpackage.a.f0a.objectFieldOffset(wvh0.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public wvh0(long j, wvh0 wvh0Var, int i) {
        super(wvh0Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // a.tqd
    public final boolean d() {
        return defpackage.a.f0a.getIntVolatile(this, f) == g() && c() != null;
    }

    public final boolean f() {
        return e.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, CoroutineContext coroutineContext);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            wvh0 wvh0Var = this;
            if (unsafe.compareAndSwapInt(wvh0Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = wvh0Var;
        }
    }
}
