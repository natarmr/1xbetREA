package a;

import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zqe0 implements m8y {
    @Override // a.m8y
    public cqe0 a(swq swqVar) {
        Object next;
        swqVar.getClass();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(bqe0.a(azw.G(azw.F(((cqe0) next).f4791a))).a(), swqVar)) {
                return (cqe0) next;
            }
        }
        next = null;
        return (cqe0) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof zqe0) && Intrinsics.d(b(), ((zqe0) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
