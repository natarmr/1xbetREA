package a;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jeo extends eeo implements vzj {
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ int j = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        i = unsafe.objectFieldOffset(jeo.class.getDeclaredField("_queue$volatile"));
        g = unsafe.objectFieldOffset(jeo.class.getDeclaredField("_delayed$volatile"));
        h = unsafe.objectFieldOffset(jeo.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // a.eeo
    public final long H() {
        Unsafe unsafe;
        jeo jeoVar;
        Unsafe unsafe2;
        Runnable runnable;
        heo heoVar;
        pfw pfwVar = keo.b;
        long j2 = i;
        if (!I()) {
            L();
            loop0: while (true) {
                unsafe = defpackage.a.f0a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j2);
                if (objectVolatile == null) {
                    jeoVar = this;
                } else if (objectVolatile instanceof ku00) {
                    ku00 ku00Var = (ku00) objectVolatile;
                    Object objD = ku00Var.d();
                    if (objD != ku00.e) {
                        Runnable runnable2 = (Runnable) objD;
                        jeoVar = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    ku00 ku00VarC = ku00Var.c();
                    while (true) {
                        Unsafe unsafe3 = defpackage.a.f0a;
                        jeoVar = this;
                        if (unsafe3.compareAndSwapObject(jeoVar, i, objectVolatile, ku00VarC) || unsafe3.getObjectVolatile(jeoVar, j2) != objectVolatile) {
                            break;
                        }
                        this = jeoVar;
                    }
                    this = jeoVar;
                } else {
                    jeoVar = this;
                    if (objectVolatile != pfwVar) {
                        do {
                            unsafe2 = defpackage.a.f0a;
                            if (unsafe2.compareAndSwapObject(jeoVar, i, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(jeoVar, j2) == objectVolatile);
                        this = jeoVar;
                    }
                }
                unsafe2 = unsafe;
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            xw3 xw3Var = jeoVar.e;
            if (((xw3Var == null || xw3Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(jeoVar, j2);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof ku00) {
                        long longVolatile = unsafe2.getLongVolatile((ku00) objectVolatile2, ku00.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == pfwVar) {
                        return Long.MAX_VALUE;
                    }
                }
                ieo ieoVar = (ieo) unsafe.getObjectVolatile(jeoVar, g);
                if (ieoVar != null) {
                    synchronized (ieoVar) {
                        heo[] heoVarArr = ieoVar.f18073a;
                        heoVar = heoVarArr != null ? heoVarArr[0] : null;
                    }
                    if (heoVar != null) {
                        long jNanoTime = heoVar.f12932a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void J(Runnable runnable) {
        L();
        if (!O(runnable)) {
            euj.k.J(runnable);
            return;
        }
        Thread threadQ = Q();
        if (Thread.currentThread() != threadQ) {
            LockSupport.unpark(threadQ);
        }
    }

    public final void L() {
        heo heoVarC;
        ieo ieoVar = (ieo) defpackage.a.f0a.getObjectVolatile(this, g);
        if (ieoVar == null || ieoVar.b() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (ieoVar) {
                try {
                    heo[] heoVarArr = ieoVar.f18073a;
                    heoVarC = null;
                    heo heoVar = heoVarArr != null ? heoVarArr[0] : null;
                    if (heoVar != null) {
                        if (jNanoTime - heoVar.f12932a >= 0 ? O(heoVar) : false) {
                            heoVarC = ieoVar.c(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (heoVarC != null);
    }

    public final boolean O(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            Unsafe unsafe4 = defpackage.a.f0a;
            long j2 = i;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j2);
            if (unsafe4.getIntVolatile(this, h) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = defpackage.a.f0a;
                    if (unsafe.compareAndSwapObject(this, i, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == null);
            } else if (objectVolatile instanceof ku00) {
                ku00 ku00Var = (ku00) objectVolatile;
                int iA = ku00Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    ku00 ku00VarC = ku00Var.c();
                    do {
                        unsafe2 = defpackage.a.f0a;
                        if (unsafe2.compareAndSwapObject(this, i, objectVolatile, ku00VarC)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == keo.b) {
                    return false;
                }
                ku00 ku00Var2 = new ku00(8, true);
                ku00Var2.a((Runnable) objectVolatile);
                ku00Var2.a(runnable);
                do {
                    unsafe3 = defpackage.a.f0a;
                    if (unsafe3.compareAndSwapObject(this, i, objectVolatile, ku00Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j2) == objectVolatile);
            }
        }
    }

    public abstract Thread Q();

    public final boolean R() {
        xw3 xw3Var = this.e;
        if (xw3Var != null ? xw3Var.isEmpty() : true) {
            Unsafe unsafe = defpackage.a.f0a;
            ieo ieoVar = (ieo) unsafe.getObjectVolatile(this, g);
            if (ieoVar != null && ieoVar.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, i);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ku00) {
                    long longVolatile = unsafe.getLongVolatile((ku00) objectVolatile, ku00.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == keo.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void S(long j2, heo heoVar) {
        euj.k.T(j2, heoVar);
    }

    public final void T(long j2, heo heoVar) {
        jeo jeoVar;
        int iC;
        Unsafe unsafe;
        Thread threadQ;
        long j3 = g;
        Unsafe unsafe2 = defpackage.a.f0a;
        if (unsafe2.getIntVolatile(this, h) == 1) {
            jeoVar = this;
            iC = 1;
        } else {
            ieo ieoVar = (ieo) unsafe2.getObjectVolatile(this, j3);
            if (ieoVar == null) {
                ieo ieoVar2 = new ieo();
                ieoVar2.c = j2;
                while (true) {
                    unsafe = defpackage.a.f0a;
                    jeoVar = this;
                    if (unsafe.compareAndSwapObject(jeoVar, g, (Object) null, ieoVar2) || unsafe.getObjectVolatile(jeoVar, j3) != null) {
                        break;
                    } else {
                        this = jeoVar;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(jeoVar, j3);
                objectVolatile.getClass();
                ieoVar = (ieo) objectVolatile;
                unsafe2 = unsafe;
            } else {
                jeoVar = this;
            }
            iC = heoVar.c(j2, ieoVar, jeoVar);
        }
        if (iC != 0) {
            if (iC == 1) {
                jeoVar.S(j2, heoVar);
                return;
            } else {
                if (iC == 2) {
                    return;
                }
                jf4.n("unexpected result");
                return;
            }
        }
        ieo ieoVar3 = (ieo) unsafe2.getObjectVolatile(jeoVar, j3);
        heo heoVar2 = null;
        if (ieoVar3 != null) {
            synchronized (ieoVar3) {
                heo[] heoVarArr = ieoVar3.f18073a;
                heoVar2 = heoVarArr != null ? heoVarArr[0] : null;
            }
        }
        if (heoVar2 != heoVar || Thread.currentThread() == (threadQ = jeoVar.Q())) {
            return;
        }
        LockSupport.unpark(threadQ);
    }

    @Override // a.vzj
    public final void a(long j2, n5a n5aVar) {
        long j3 = 0;
        if (j2 > 0) {
            j3 = j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2;
        }
        if (j3 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            feo feoVar = new feo(this, j3 + jNanoTime, n5aVar);
            T(jNanoTime, feoVar);
            n5aVar.u(new b5a(feoVar, (byte) 2));
        }
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        J(runnable);
    }

    @Override // a.eeo
    public void shutdown() {
        pfw pfwVar;
        Unsafe unsafe;
        heo heoVarC;
        gcq0.f11075a.set(null);
        defpackage.a.f0a.putIntVolatile(this, h, 1);
        pfw pfwVar2 = keo.b;
        long j2 = i;
        loop0: while (true) {
            Object objectVolatile = defpackage.a.f0a.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = defpackage.a.f0a;
                    pfwVar = pfwVar2;
                    if (unsafe2.compareAndSwapObject(this, i, (Object) null, pfwVar2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j2) != null) {
                        break;
                    } else {
                        pfwVar2 = pfwVar;
                    }
                }
                pfwVar2 = pfwVar;
            } else {
                pfwVar = pfwVar2;
                if (objectVolatile instanceof ku00) {
                    ((ku00) objectVolatile).b();
                    break;
                }
                if (objectVolatile == pfwVar) {
                    break;
                }
                ku00 ku00Var = new ku00(8, true);
                ku00Var.a((Runnable) objectVolatile);
                do {
                    unsafe = defpackage.a.f0a;
                    if (unsafe.compareAndSwapObject(this, i, objectVolatile, ku00Var)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == objectVolatile);
                pfwVar2 = pfwVar;
            }
        }
        while (H() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            ieo ieoVar = (ieo) defpackage.a.f0a.getObjectVolatile(this, g);
            if (ieoVar == null) {
                return;
            }
            synchronized (ieoVar) {
                heoVarC = ieoVar.b() > 0 ? ieoVar.c(0) : null;
            }
            if (heoVarC == null) {
                return;
            } else {
                S(jNanoTime, heoVarC);
            }
        }
    }
}
