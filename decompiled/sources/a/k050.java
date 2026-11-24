package a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class k050 extends fbi0 implements i050 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(k050.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long j = defpackage.a.f0a.objectFieldOffset(k050.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public k050() {
        super(1);
        this.owner$volatile = l050.f19182a;
    }

    @Override // a.i050
    public final boolean a() {
        return Math.max(defpackage.a.f0a.getIntVolatile(this, fbi0.f), 0) == 0;
    }

    @Override // a.i050
    public final void c(Object obj) {
        while (this.a()) {
            Unsafe unsafe = defpackage.a.f0a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            pfw pfwVar = l050.f19182a;
            if (objectVolatile != pfwVar) {
                if (objectVolatile != obj && obj != null) {
                    hny.p("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    k050 k050Var = this;
                    if (defpackage.a.f0a.compareAndSwapObject(k050Var, j, objectVolatile, pfwVar)) {
                        k050Var.f();
                        return;
                    } else {
                        if (defpackage.a.f0a.getObjectVolatile(k050Var, j2) != objectVolatile) {
                            this = k050Var;
                            break;
                        }
                        this = k050Var;
                    }
                }
            }
        }
        jf4.n("This mutex is not locked");
    }

    @Override // a.i050
    public final Object d(yje yjeVar) {
        if (g()) {
            return Unit.f46060a;
        }
        n5a n5aVarQ = rq8.Q(pnx.b(yjeVar));
        try {
            j050 j050Var = new j050(this, n5aVarQ);
            while (true) {
                int andDecrement = fbi0.e.getAndDecrement(this);
                if (andDecrement <= this.f9260a) {
                    if (andDecrement > 0) {
                        j050Var.v(Unit.f46060a, this.b);
                        break;
                    }
                    if (e(j050Var)) {
                        break;
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

    public final boolean g() {
        k050 k050Var;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j2 = fbi0.f;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            if (intVolatile > this.f9260a) {
                while (true) {
                    Unsafe unsafe2 = defpackage.a.f0a;
                    long j3 = fbi0.f;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j3);
                    int i2 = this.f9260a;
                    if (intVolatile2 <= i2) {
                        k050Var = this;
                        break;
                    }
                    k050 k050Var2 = this;
                    k050Var = k050Var2;
                    if (unsafe2.compareAndSwapInt(k050Var2, j3, intVolatile2, i2)) {
                        break;
                    }
                    this = k050Var;
                }
            } else {
                k050Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(k050Var, j2, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(k050Var, j, (Object) null);
                    return true;
                }
            }
            this = k050Var;
        }
    }

    public final String toString() {
        return "Mutex@" + qjj.R(this) + "[isLocked=" + a() + ",owner=" + defpackage.a.f0a.getObjectVolatile(this, j) + ']';
    }
}
