package a;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class ftg0 implements a8z, Serializable {
    public static final etg0 c = new etg0(null);
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(ftg0.class, Object.class, "b");
    public static final /* synthetic */ long e = defpackage.a.f0a.objectFieldOffset(ftg0.class.getDeclaredField("b"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Function0 f10111a;
    public volatile Object b;

    @Override // a.a8z
    public final Object getValue() {
        ftg0 ftg0Var;
        Object obj = this.b;
        m2t0 m2t0Var = m2t0.f21082a;
        if (obj != m2t0Var) {
            return obj;
        }
        Function0 function0 = this.f10111a;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                ftg0Var = this;
                if (defpackage.a.f0a.compareAndSwapObject(ftg0Var, e, m2t0Var, objInvoke)) {
                    ftg0Var.f10111a = null;
                    return objInvoke;
                }
                if (defpackage.a.f0a.getObjectVolatile(ftg0Var, e) == m2t0Var) {
                    this = ftg0Var;
                }
            }
        } else {
            ftg0Var = this;
        }
        return ftg0Var.b;
    }

    public final String toString() {
        return this.b != m2t0.f21082a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
