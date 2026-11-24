package a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class usg0 implements yje, xne {
    private static final tsg0 b = new tsg0(null);
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(usg0.class, Object.class, "result");
    public static final /* synthetic */ long d = defpackage.a.f0a.objectFieldOffset(usg0.class.getDeclaredField("result"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yje f36209a;
    private volatile Object result;

    public usg0(yje yjeVar) {
        wne wneVar = wne.f39444a;
        yjeVar.getClass();
        this.f36209a = yjeVar;
        this.result = wneVar;
    }

    @Override // a.xne
    public final xne getCallerFrame() {
        yje yjeVar = this.f36209a;
        if (yjeVar instanceof xne) {
            return (xne) yjeVar;
        }
        return null;
    }

    @Override // a.yje
    public final CoroutineContext getContext() {
        return this.f36209a.getContext();
    }

    @Override // a.yje
    public final void resumeWith(Object obj) {
        usg0 usg0Var;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            wne wneVar = wne.b;
            if (obj3 == wneVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = defpackage.a.f0a;
                    long j2 = d;
                    usg0Var = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(usg0Var, j2, wneVar, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(usg0Var, j2) != wneVar) {
                        break;
                    }
                    this = usg0Var;
                    obj = obj2;
                }
            } else {
                usg0Var = this;
                obj2 = obj;
                wne wneVar2 = wne.f39444a;
                if (obj3 != wneVar2) {
                    jf4.n("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c;
                wne wneVar3 = wne.c;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = defpackage.a.f0a;
                    j = d;
                    if (unsafe.compareAndSwapObject(usg0Var, j, wneVar2, wneVar3)) {
                        usg0Var.f36209a.resumeWith(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(usg0Var, j) == wneVar2);
            }
            this = usg0Var;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f36209a;
    }
}
