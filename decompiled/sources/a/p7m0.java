package a;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class p7m0 extends e5 implements qz40, p5a, afr {
    public static final /* synthetic */ long f = defpackage.a.f0a.objectFieldOffset(p7m0.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public p7m0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // a.mz40, a.kmq
    public final Object a(Object obj, yje yjeVar) {
        n(obj);
        return Unit.f46060a;
    }

    @Override // a.afr
    public final gmq b(CoroutineContext coroutineContext, int i, i99 i99Var) {
        return (((i < 0 || i >= 2) && i != -2) || i99Var != i99.b) ? roj0.c(this, coroutineContext, i, i99Var) : this;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ec A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:33:0x0082, B:35:0x008c, B:38:0x0093, B:39:0x0097, B:41:0x009a, B:51:0x00bb, B:54:0x00cb, B:55:0x00e5, B:61:0x00f9, B:64:0x0102, B:58:0x00ec, B:60:0x00f2, B:43:0x00a0, B:47:0x00a7, B:21:0x0047, B:24:0x0050, B:32:0x0073, B:27:0x005e, B:29:0x0062), top: B:69:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:55:0x00e5->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ca -> B:33:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // a.gmq
    public final java.lang.Object c(a.kmq r13, a.yje r14) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p7m0.c(a.kmq, a.yje):java.lang.Object");
    }

    @Override // a.noj0
    public final List d() {
        return kotlin.collections.a.c(getValue());
    }

    @Override // a.mz40
    public final boolean g(Object obj) {
        n(obj);
        return true;
    }

    @Override // a.n7m0
    public final Object getValue() {
        Object objectVolatile = defpackage.a.f0a.getObjectVolatile(this, f);
        if (objectVolatile == k860.f17859a) {
            return null;
        }
        return objectVolatile;
    }

    @Override // a.mz40
    public final void i() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final boolean m(Object obj, Object obj2) {
        pfw pfwVar = k860.f17859a;
        if (obj == null) {
            obj = pfwVar;
        }
        if (obj2 == null) {
            obj2 = pfwVar;
        }
        return o(obj, obj2);
    }

    public final void n(Object obj) {
        if (obj == null) {
            obj = k860.f17859a;
        }
        o(null, obj);
    }

    public final boolean o(Object obj, Object obj2) {
        int i;
        f5[] f5VarArr;
        pfw pfwVar;
        synchronized (this) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !Intrinsics.d(objectVolatile, obj)) {
                return false;
            }
            if (Intrinsics.d(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            f5[] f5VarArr2 = this.f7207a;
            while (true) {
                r7m0[] r7m0VarArr = (r7m0[]) f5VarArr2;
                if (r7m0VarArr != null) {
                    for (r7m0 r7m0Var : r7m0VarArr) {
                        if (r7m0Var != null) {
                            AtomicReference atomicReference = r7m0Var.f29984a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 == null || obj3 == (pfwVar = q7m0.b)) {
                                    break;
                                }
                                pfw pfwVar2 = q7m0.f28258a;
                                if (obj3 != pfwVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, pfwVar2)) {
                                            Unit unit = Unit.f46060a;
                                            e0g0 e0g0Var = j0g0.b;
                                            ((n5a) obj3).resumeWith(unit);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, pfwVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    f5VarArr = this.f7207a;
                }
                f5VarArr2 = f5VarArr;
                i3 = i;
            }
        }
    }
}
