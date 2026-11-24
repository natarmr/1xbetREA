package a;

import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class eac extends eby {
    public final n5a e;

    public eac(n5a n5aVar) {
        this.e = n5aVar;
    }

    @Override // a.eby
    public final boolean l() {
        return true;
    }

    @Override // a.eby
    public final void m(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        pby pbyVarK = k();
        n5a n5aVar = this.e;
        Throwable thO = n5aVar.o(pbyVarK);
        if (n5aVar.y()) {
            yje yjeVar = n5aVar.d;
            yjeVar.getClass();
            nvk nvkVar = (nvk) yjeVar;
            long j = nvk.h;
            loop0: while (true) {
                Object objectVolatile = defpackage.a.f0a.getObjectVolatile(nvkVar, j);
                pfw pfwVar = ovk.b;
                if (Intrinsics.d(objectVolatile, pfwVar)) {
                    do {
                        unsafe = defpackage.a.f0a;
                        if (unsafe.compareAndSwapObject(nvkVar, nvk.h, pfwVar, thO)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(nvkVar, j) == pfwVar);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = defpackage.a.f0a;
                        if (unsafe2.compareAndSwapObject(nvkVar, nvk.h, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(nvkVar, j) == objectVolatile);
                }
            }
        }
        n5aVar.h(thO);
        if (n5aVar.y()) {
            return;
        }
        n5aVar.m();
    }
}
