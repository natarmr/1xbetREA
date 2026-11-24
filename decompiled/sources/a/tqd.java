package a;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ long f34376a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        f34376a = unsafe.objectFieldOffset(tqd.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(tqd.class.getDeclaredField("_prev$volatile"));
    }

    public tqd(wvh0 wvh0Var) {
        this._prev$volatile = wvh0Var;
    }

    public final void a() {
        defpackage.a.f0a.putObjectVolatile(this, b, (Object) null);
    }

    public final tqd c() {
        Object objectVolatile = defpackage.a.f0a.getObjectVolatile(this, f34376a);
        if (objectVolatile == sqd.f32624a) {
            return null;
        }
        return (tqd) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        tqd tqdVar;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = defpackage.a.f0a;
            long j = b;
            tqd tqdVar2 = (tqd) unsafe2.getObjectVolatile(this, j);
            while (tqdVar2 != null && tqdVar2.d()) {
                tqdVar2 = (tqd) defpackage.a.f0a.getObjectVolatile(tqdVar2, j);
            }
            tqd tqdVarC = c();
            tqdVarC.getClass();
            do {
                tqdVar = tqdVarC;
                if (!tqdVar.d()) {
                    break;
                } else {
                    tqdVarC = tqdVar.c();
                }
            } while (tqdVarC != null);
            while (true) {
                Object objectVolatile = defpackage.a.f0a.getObjectVolatile(tqdVar, j);
                tqd tqdVar3 = ((tqd) objectVolatile) == null ? null : tqdVar2;
                while (true) {
                    unsafe = defpackage.a.f0a;
                    if (unsafe.compareAndSwapObject(tqdVar, b, objectVolatile, tqdVar3)) {
                        break;
                    } else if (unsafe.getObjectVolatile(tqdVar, j) != objectVolatile) {
                    }
                }
            }
            if (tqdVar2 != null) {
                unsafe.putObjectVolatile(tqdVar2, f34376a, tqdVar);
            }
            if (!tqdVar.d() || tqdVar.c() == null) {
                if (tqdVar2 == null || !tqdVar2.d()) {
                    return;
                }
            }
        }
    }
}
