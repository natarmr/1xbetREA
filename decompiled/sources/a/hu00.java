package a;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hu00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ long f13658a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        f13658a = unsafe.objectFieldOffset(hu00.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(hu00.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(hu00.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean d(hu00 hu00Var, int i) {
        hu00 hu00Var2;
        hu00 hu00Var3;
        while (true) {
            hu00 hu00VarI = this.i();
            if (hu00VarI instanceof wc00) {
                return (((wc00) hu00VarI).d & i) == 0 && hu00VarI.d(hu00Var, i);
            }
            Unsafe unsafe = defpackage.a.f0a;
            unsafe.putObjectVolatile(hu00Var, b, hu00VarI);
            long j = f13658a;
            unsafe.putObjectVolatile(hu00Var, j, this);
            while (true) {
                Unsafe unsafe2 = defpackage.a.f0a;
                hu00Var2 = this;
                hu00Var3 = hu00Var;
                if (unsafe2.compareAndSwapObject(hu00VarI, f13658a, hu00Var2, hu00Var3)) {
                    hu00Var3.f(hu00Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(hu00VarI, j) != hu00Var2) {
                    break;
                }
                this = hu00Var2;
                hu00Var = hu00Var3;
            }
            this = hu00Var2;
            hu00Var = hu00Var3;
        }
    }

    public final hu00 e() {
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = b;
            hu00 hu00Var = (hu00) unsafe.getObjectVolatile(this, j);
            hu00 hu00Var2 = null;
            hu00 hu00Var3 = hu00Var;
            while (true) {
                if (hu00Var3 == null) {
                    hny.b();
                    return null;
                }
                Unsafe unsafe2 = defpackage.a.f0a;
                long j2 = f13658a;
                Object objectVolatile = unsafe2.getObjectVolatile(hu00Var3, j2);
                if (objectVolatile == this) {
                    if (hu00Var != hu00Var3) {
                        while (true) {
                            Unsafe unsafe3 = defpackage.a.f0a;
                            hu00 hu00Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(hu00Var4, b, hu00Var, hu00Var3);
                            hu00 hu00Var5 = hu00Var;
                            this = hu00Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != hu00Var5) {
                                    break;
                                }
                                this = this;
                                hu00Var = hu00Var5;
                            }
                        }
                    }
                    return hu00Var3;
                }
                hu00Var = hu00Var;
                this = this;
                if (this.j()) {
                    return null;
                }
                if (!(objectVolatile instanceof hjf0)) {
                    objectVolatile.getClass();
                    hu00Var2 = hu00Var3;
                    hu00Var3 = (hu00) objectVolatile;
                } else if (hu00Var2 != null) {
                    hu00 hu00Var6 = ((hjf0) objectVolatile).f13157a;
                    while (true) {
                        hu00 hu00Var7 = hu00Var3;
                        Unsafe unsafe4 = defpackage.a.f0a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(hu00Var2, f13658a, hu00Var7, hu00Var6);
                        hu00Var3 = hu00Var7;
                        if (zCompareAndSwapObject2) {
                            hu00Var3 = hu00Var2;
                            hu00Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(hu00Var2, j2) != hu00Var3) {
                            break;
                        }
                    }
                } else {
                    if (hu00Var3 == null) {
                        hny.b();
                        return null;
                    }
                    hu00Var3 = (hu00) unsafe2.getObjectVolatile(hu00Var3, j);
                }
            }
            this = this;
        }
    }

    public final void f(hu00 hu00Var) {
        hu00 hu00Var2;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = b;
            hu00 hu00Var3 = (hu00) unsafe.getObjectVolatile(hu00Var, j);
            if (this.g() != hu00Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = defpackage.a.f0a;
                hu00Var2 = this;
                hu00 hu00Var4 = hu00Var;
                if (unsafe2.compareAndSwapObject(hu00Var4, b, hu00Var3, hu00Var2)) {
                    if (hu00Var2.j()) {
                        hu00Var4.e();
                        return;
                    }
                    return;
                } else {
                    hu00Var = hu00Var4;
                    if (unsafe2.getObjectVolatile(hu00Var4, j) != hu00Var3) {
                        break;
                    } else {
                        this = hu00Var2;
                    }
                }
            }
            this = hu00Var2;
        }
    }

    public final Object g() {
        return defpackage.a.f0a.getObjectVolatile(this, f13658a);
    }

    public final hu00 h() {
        Object objG = g();
        hjf0 hjf0Var = objG instanceof hjf0 ? (hjf0) objG : null;
        if (hjf0Var != null) {
            return hjf0Var.f13157a;
        }
        objG.getClass();
        return (hu00) objG;
    }

    public final hu00 i() {
        hu00 hu00VarE = e();
        if (hu00VarE != null) {
            return hu00VarE;
        }
        Unsafe unsafe = defpackage.a.f0a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            hu00 hu00Var = (hu00) objectVolatile;
            if (!hu00Var.j()) {
                return hu00Var;
            }
            objectVolatile = defpackage.a.f0a.getObjectVolatile(hu00Var, j);
        }
    }

    public boolean j() {
        return g() instanceof hjf0;
    }

    public String toString() {
        return new a6g(this, qjj.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, (byte) 10) + '@' + qjj.R(this);
    }
}
