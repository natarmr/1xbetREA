package a;

import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pfw f32624a = new pfw("CLOSED", (byte) 6);

    public static final Object a(wvh0 wvh0Var, long j, Function2 function2) {
        Unsafe unsafe;
        long j2;
        while (true) {
            wvh0 wvh0Var2 = wvh0Var;
            while (true) {
                if (wvh0Var2.d >= j && !wvh0Var2.d()) {
                    return wvh0Var2;
                }
                Object objectVolatile = defpackage.a.f0a.getObjectVolatile(wvh0Var2, tqd.f34376a);
                pfw pfwVar = f32624a;
                if (objectVolatile == pfwVar) {
                    return pfwVar;
                }
                wvh0Var = (wvh0) ((tqd) objectVolatile);
                if (wvh0Var != null) {
                    break;
                }
                wvh0 wvh0Var3 = (wvh0) function2.invoke(Long.valueOf(wvh0Var2.d + 1), wvh0Var2);
                do {
                    unsafe = defpackage.a.f0a;
                    j2 = tqd.f34376a;
                    if (unsafe.compareAndSwapObject(wvh0Var2, j2, (Object) null, wvh0Var3)) {
                        if (wvh0Var2.d()) {
                            wvh0Var2.e();
                        }
                        wvh0Var2 = wvh0Var3;
                        break;
                    }
                } while (unsafe.getObjectVolatile(wvh0Var2, j2) == null);
            }
        }
    }
}
