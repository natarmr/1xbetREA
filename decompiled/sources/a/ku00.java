package a;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class ku00 {
    public static final pfw e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18891a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        f = unsafe.objectFieldOffset(ku00.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(ku00.class.getDeclaredField("_state$volatile"));
        e = new pfw("REMOVE_FROZEN", (byte) 6);
    }

    public ku00(int i, boolean z) {
        this.f18891a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            jf4.n("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        jf4.n("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        ku00 ku00Var = this;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(ku00Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = ku00Var.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = ku00Var.b;
            AtomicReferenceArray atomicReferenceArray = ku00Var.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(ku00Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    ku00 ku00VarC = this;
                    while ((defpackage.a.f0a.getLongVolatile(ku00VarC, j) & 1152921504606846976L) != 0) {
                        ku00VarC = ku00VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = ku00VarC.d;
                        int i4 = ku00VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof ju00) && ((ju00) obj2).f17127a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            ku00VarC = null;
                        }
                        if (ku00VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                ku00Var = this;
            } else {
                int i5 = ku00Var.f18891a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = defpackage.a.f0a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            ku00 ku00Var = this;
            if (defpackage.a.f0a.compareAndSwapLong(ku00Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = ku00Var;
        }
    }

    public final ku00 c() {
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Unsafe unsafe2;
        do {
            unsafe = defpackage.a.f0a;
            j = g;
            longVolatile = unsafe.getLongVolatile(this, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j2 = longVolatile;
                break;
            }
            j2 = 1152921504606846976L | longVolatile;
        } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        while (true) {
            Unsafe unsafe3 = defpackage.a.f0a;
            long j3 = f;
            ku00 ku00Var = (ku00) unsafe3.getObjectVolatile(this, j3);
            if (ku00Var != null) {
                return ku00Var;
            }
            ku00 ku00Var2 = new ku00(this.f18891a * 2, this.b);
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object ju00Var = this.d.get(i4);
                if (ju00Var == null) {
                    ju00Var = new ju00(i);
                }
                ku00Var2.d.set(ku00Var2.c & i, ju00Var);
                i++;
            }
            defpackage.a.f0a.putLongVolatile(ku00Var2, g, j2 & (-1152921504606846977L));
            do {
                unsafe2 = defpackage.a.f0a;
                if (unsafe2.compareAndSwapObject(this, f, (Object) null, ku00Var2)) {
                    break;
                }
            } while (unsafe2.getObjectVolatile(this, j3) == null);
        }
    }

    public final Object d() {
        ku00 ku00VarC = this;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(ku00VarC, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = ku00VarC.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = ku00VarC.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = ku00VarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof ju00)) {
                    long j2 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(ku00VarC, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    ku00VarC = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = defpackage.a.f0a;
                            long j3 = g;
                            long longVolatile2 = unsafe2.getLongVolatile(ku00VarC, j3);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                ku00VarC = ku00VarC.c();
                            } else {
                                if (unsafe2.compareAndSwapLong(ku00VarC, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                    ku00VarC.d.set(ku00VarC.c & i5, null);
                                    ku00VarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (ku00VarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
