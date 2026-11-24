package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class q99 implements htb {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(q99.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicLongFieldUpdater g;
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28336a;
    public final Function1 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final sd8 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        r = unsafe.objectFieldOffset(q99.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(q99.class, "receivers$volatile");
        p = unsafe.objectFieldOffset(q99.class.getDeclaredField("receivers$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(q99.class, "bufferEnd$volatile");
        k = unsafe.objectFieldOffset(q99.class.getDeclaredField("bufferEnd$volatile"));
        g = AtomicLongFieldUpdater.newUpdater(q99.class, "completedExpandBuffersAndPauseFlag$volatile");
        n = unsafe.objectFieldOffset(q99.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(q99.class, Object.class, "sendSegment$volatile");
        q = unsafe.objectFieldOffset(q99.class.getDeclaredField("sendSegment$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(q99.class, Object.class, "receiveSegment$volatile");
        o = unsafe.objectFieldOffset(q99.class.getDeclaredField("receiveSegment$volatile"));
        l = unsafe.objectFieldOffset(q99.class.getDeclaredField("bufferEndSegment$volatile"));
        j = unsafe.objectFieldOffset(q99.class.getDeclaredField("_closeCause$volatile"));
        m = unsafe.objectFieldOffset(q99.class.getDeclaredField("closeHandler$volatile"));
    }

    public q99(int i2, Function1 function1) {
        long j2;
        this.f28336a = i2;
        this.b = function1;
        if (i2 < 0) {
            c99.s(ua80.e(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        aub aubVar = s99.f31842a;
        if (i2 != 0) {
            j2 = i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE;
        } else {
            j2 = 0;
        }
        this.bufferEnd$volatile = j2;
        this.completedExpandBuffersAndPauseFlag$volatile = p();
        aub aubVar2 = new aub(0L, null, this, 3);
        this.sendSegment$volatile = aubVar2;
        this.receiveSegment$volatile = aubVar2;
        if (C()) {
            aubVar2 = s99.f31842a;
            aubVar2.getClass();
        }
        this.bufferEndSegment$volatile = aubVar2;
        this.c = function1 != null ? new sd8(this, (byte) 1) : null;
        this._closeCause$volatile = s99.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object G(q99 q99Var, zje zjeVar) {
        o99 o99Var;
        aub aubVar;
        if (zjeVar instanceof o99) {
            o99Var = (o99) zjeVar;
            int i2 = o99Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o99Var.k = i2 - Integer.MIN_VALUE;
            } else {
                o99Var = new o99(q99Var, zjeVar);
            }
        } else {
            o99Var = new o99(q99Var, zjeVar);
        }
        o99 o99Var2 = o99Var;
        Object obj = o99Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = o99Var2.k;
        if (i3 != 0) {
            if (i3 == 1) {
                z1x.P(obj);
                return ((ztb) obj).f44949a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        aub aubVar2 = (aub) defpackage.a.f0a.getObjectVolatile(q99Var, o);
        while (!q99Var.z()) {
            long andIncrement = e.getAndIncrement(q99Var);
            long j2 = s99.b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (aubVar2.d != j3) {
                aub aubVarN = q99Var.n(j3, aubVar2);
                if (aubVarN == null) {
                    continue;
                } else {
                    aubVar = aubVarN;
                }
            } else {
                aubVar = aubVar2;
            }
            q99 q99Var2 = q99Var;
            Object objM = q99Var2.M(aubVar, i4, andIncrement, null);
            if (objM == s99.m) {
                jf4.n("unexpected");
                return null;
            }
            if (objM != s99.o) {
                if (objM != s99.n) {
                    aubVar.a();
                    return objM;
                }
                o99Var2.k = 1;
                Object objH = q99Var2.H(aubVar, i4, andIncrement, o99Var2);
                return objH == wneVar ? wneVar : objH;
            }
            if (andIncrement < q99Var2.v()) {
                aubVar.a();
            }
            q99Var = q99Var2;
            aubVar2 = aubVar;
        }
        return new xtb(q99Var.q());
    }

    public final boolean A() {
        return y(false, defpackage.a.f0a.getLongVolatile(this, r));
    }

    public boolean B() {
        return false;
    }

    public final boolean C() {
        long jP = p();
        return jP == 0 || jP == Long.MAX_VALUE;
    }

    public final void D(long j2, aub aubVar) {
        q99 q99Var;
        aub aubVar2;
        aub aubVar3;
        while (aubVar.d < j2 && (aubVar3 = (aub) aubVar.c()) != null) {
            aubVar = aubVar3;
        }
        while (true) {
            aub aubVar4 = aubVar;
            while (aubVar4.d() && (aubVar2 = (aub) aubVar4.c()) != null) {
                aubVar4 = aubVar2;
            }
            while (true) {
                Unsafe unsafe = defpackage.a.f0a;
                long j3 = l;
                wvh0 wvh0Var = (wvh0) unsafe.getObjectVolatile(this, j3);
                if (wvh0Var.d >= aubVar4.d) {
                    return;
                }
                if (!aubVar4.j()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = defpackage.a.f0a;
                    q99Var = this;
                    if (unsafe2.compareAndSwapObject(q99Var, l, wvh0Var, aubVar4)) {
                        if (wvh0Var.f()) {
                            wvh0Var.e();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(q99Var, j3) != wvh0Var) {
                        break;
                    } else {
                        this = q99Var;
                    }
                }
                if (aubVar4.f()) {
                    aubVar4.e();
                }
                this = q99Var;
            }
            aubVar = aubVar4;
        }
    }

    public final Object E(yje yjeVar, Object obj) {
        ss3 ss3VarF;
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        Function1 function1 = this.b;
        if (function1 == null || (ss3VarF = vdx.F(function1, obj, null)) == null) {
            Throwable thU = u();
            e0g0 e0g0Var = j0g0.b;
            n5aVar.resumeWith(new g0g0(thU));
        } else {
            tjo.a(ss3VarF, u());
            e0g0 e0g0Var2 = j0g0.b;
            n5aVar.resumeWith(new g0g0(ss3VarF));
        }
        Object objP = n5aVar.p();
        return objP == wne.f39444a ? objP : Unit.f46060a;
    }

    public final void F(Object obj, n5a n5aVar) {
        Function1 function1 = this.b;
        if (function1 != null) {
            vdx.E(function1, obj, n5aVar.e);
        }
        Throwable thU = u();
        e0g0 e0g0Var = j0g0.b;
        n5aVar.resumeWith(new g0g0(thU));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object H(aub aubVar, int i2, long j2, zje zjeVar) {
        p99 p99Var;
        ztb ztbVar;
        kx2 kx2Var;
        if (zjeVar instanceof p99) {
            p99Var = (p99) zjeVar;
            int i3 = p99Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p99Var.k = i3 - Integer.MIN_VALUE;
            } else {
                p99Var = new p99(this, zjeVar);
            }
        } else {
            p99Var = new p99(this, zjeVar);
        }
        Object objP = p99Var.i;
        wne wneVar = wne.f39444a;
        int i4 = p99Var.k;
        kx2 kx2Var2 = null;
        if (i4 == 0) {
            z1x.P(objP);
            p99Var.k = 1;
            n5a n5aVarQ = rq8.Q(pnx.b(p99Var));
            try {
                ode0 ode0Var = new ode0(n5aVarQ);
                Object objM = M(aubVar, i2, j2, ode0Var);
                if (objM == s99.m) {
                    ode0Var.a(aubVar, i2);
                } else {
                    Object obj = s99.o;
                    Function1 function1 = this.b;
                    if (objM == obj) {
                        if (j2 < v()) {
                            aubVar.a();
                        }
                        aub aubVar2 = (aub) defpackage.a.f0a.getObjectVolatile(this, o);
                        while (true) {
                            if (z()) {
                                e0g0 e0g0Var = j0g0.b;
                                n5aVarQ.resumeWith(new ztb(new xtb(q())));
                            } else {
                                long andIncrement = e.getAndIncrement(this);
                                long j3 = s99.b;
                                long j4 = andIncrement / j3;
                                int i5 = (int) (andIncrement % j3);
                                if (aubVar2.d != j4) {
                                    aub aubVarN = n(j4, aubVar2);
                                    if (aubVarN != null) {
                                        aubVar2 = aubVarN;
                                    }
                                }
                                Object objM2 = M(aubVar2, i5, andIncrement, ode0Var);
                                if (objM2 == s99.m) {
                                    ode0Var.a(aubVar2, i5);
                                } else if (objM2 == s99.o) {
                                    if (andIncrement < v()) {
                                        aubVar2.a();
                                    }
                                } else {
                                    if (objM2 == s99.n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    aubVar2.a();
                                    ztbVar = new ztb(objM2);
                                    if (function1 != null) {
                                        kx2Var = new kx2(3, this, q99.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 2);
                                        kx2Var2 = kx2Var;
                                    }
                                    n5aVarQ.v(ztbVar, kx2Var2);
                                }
                            }
                        }
                    } else {
                        aubVar.a();
                        ztbVar = new ztb(objM);
                        if (function1 != null) {
                            kx2Var = new kx2(3, this, q99.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 2);
                            kx2Var2 = kx2Var;
                        }
                        n5aVarQ.v(ztbVar, kx2Var2);
                    }
                }
                objP = n5aVarQ.p();
                wne wneVar2 = wne.f39444a;
                if (objP == wneVar) {
                    return wneVar;
                }
            } catch (Throwable th) {
                n5aVarQ.B();
                throw th;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objP);
        }
        return ((ztb) objP).f44949a;
    }

    public final void I(o2i0 o2i0Var) {
        aub aubVar;
        aub aubVar2 = (aub) defpackage.a.f0a.getObjectVolatile(this, o);
        while (!this.z()) {
            long andIncrement = e.getAndIncrement(this);
            long j2 = s99.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (aubVar2.d != j3) {
                aub aubVarN = this.n(j3, aubVar2);
                if (aubVarN == null) {
                    continue;
                } else {
                    aubVar = aubVarN;
                }
            } else {
                aubVar = aubVar2;
            }
            Object objM = this.M(aubVar, i2, andIncrement, o2i0Var);
            aubVar2 = aubVar;
            if (objM == s99.m) {
                o2i0 o2i0Var2 = o2i0Var != 0 ? o2i0Var : null;
                if (o2i0Var2 != null) {
                    o2i0Var2.c = aubVar2;
                    o2i0Var2.d = i2;
                    return;
                }
                return;
            }
            if (objM != s99.o) {
                if (objM == s99.n) {
                    jf4.n("unexpected");
                    return;
                } else {
                    aubVar2.a();
                    o2i0Var.e = objM;
                    return;
                }
            }
            if (andIncrement < this.v()) {
                aubVar2.a();
            }
            this = this;
            o2i0Var = o2i0Var;
        }
        o2i0Var.e = s99.l;
    }

    public final void J(nvu0 nvu0Var, boolean z) {
        if (nvu0Var instanceof m5a) {
            yje yjeVar = (yje) nvu0Var;
            e0g0 e0g0Var = j0g0.b;
            yjeVar.resumeWith(new g0g0(z ? s() : u()));
            return;
        }
        if (nvu0Var instanceof ode0) {
            n5a n5aVar = ((ode0) nvu0Var).f25071a;
            e0g0 e0g0Var2 = j0g0.b;
            n5aVar.resumeWith(new ztb(new xtb(q())));
            return;
        }
        if (!(nvu0Var instanceof j99)) {
            if (nvu0Var instanceof o2i0) {
                ((o2i0) nvu0Var).i(this, s99.l);
                return;
            } else {
                udk.e(nvu0Var, "Unexpected waiter: ");
                return;
            }
        }
        j99 j99Var = (j99) nvu0Var;
        n5a n5aVar2 = j99Var.b;
        n5aVar2.getClass();
        j99Var.b = null;
        j99Var.f16126a = s99.l;
        Throwable thQ = j99Var.c.q();
        if (thQ == null) {
            e0g0 e0g0Var3 = j0g0.b;
            n5aVar2.resumeWith(Boolean.FALSE);
        } else {
            e0g0 e0g0Var4 = j0g0.b;
            n5aVar2.resumeWith(new g0g0(thQ));
        }
    }

    public final boolean K(Object obj, Object obj2) throws mvk {
        if (obj instanceof o2i0) {
            return ((o2i0) obj).i(this, obj2);
        }
        boolean z = obj instanceof ode0;
        Function1 function1 = this.b;
        xdr kx2Var = null;
        if (z) {
            n5a n5aVar = ((ode0) obj).f25071a;
            ztb ztbVar = new ztb(obj2);
            if (function1 != null) {
                kx2Var = new kx2(3, this, q99.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 2);
            }
            aub aubVar = s99.f31842a;
            pfw pfwVarB = n5aVar.b(ztbVar, kx2Var);
            if (pfwVarB == null) {
                return false;
            }
            n5aVar.w(pfwVarB);
            return true;
        }
        if (!(obj instanceof j99)) {
            if (!(obj instanceof m5a)) {
                udk.e(obj, "Unexpected receiver type: ");
                return false;
            }
            m5a m5aVar = (m5a) obj;
            kx2Var = function1 != null ? new kx2(3, this, q99.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 1) : null;
            aub aubVar2 = s99.f31842a;
            pfw pfwVarB2 = m5aVar.b(obj2, kx2Var);
            if (pfwVarB2 == null) {
                return false;
            }
            m5aVar.w(pfwVarB2);
            return true;
        }
        j99 j99Var = (j99) obj;
        n5a n5aVar2 = j99Var.b;
        n5aVar2.getClass();
        j99Var.b = null;
        j99Var.f16126a = obj2;
        Boolean bool = Boolean.TRUE;
        Function1 function2 = j99Var.c.b;
        kx2Var = function2 != null ? new ab4((byte) 16, obj2, function2) : null;
        aub aubVar3 = s99.f31842a;
        pfw pfwVarB3 = n5aVar2.b(bool, kx2Var);
        if (pfwVarB3 == null) {
            return false;
        }
        n5aVar2.w(pfwVarB3);
        return true;
    }

    public final boolean L(Object obj, aub aubVar, int i2) {
        wrs0 wrs0Var;
        if (obj instanceof m5a) {
            m5a m5aVar = (m5a) obj;
            Unit unit = Unit.f46060a;
            aub aubVar2 = s99.f31842a;
            pfw pfwVarB = m5aVar.b(unit, null);
            if (pfwVarB == null) {
                return false;
            }
            m5aVar.w(pfwVarB);
            return true;
        }
        if (!(obj instanceof o2i0)) {
            udk.e(obj, "Unexpected waiter: ");
            return false;
        }
        int iJ = ((o2i0) obj).j(this, Unit.f46060a);
        if (iJ == 0) {
            wrs0Var = wrs0.f39661a;
        } else if (iJ == 1) {
            wrs0Var = wrs0.b;
        } else if (iJ == 2) {
            wrs0Var = wrs0.c;
        } else {
            if (iJ != 3) {
                e9d0.d(iJ, "Unexpected internal result: ");
                return false;
            }
            wrs0Var = wrs0.d;
        }
        if (wrs0Var == wrs0.b) {
            aubVar.n(i2, null);
        }
        return wrs0Var == wrs0.f39661a;
    }

    public final Object M(aub aubVar, int i2, long j2, Object obj) {
        Object objL = aubVar.l(i2);
        AtomicReferenceArray atomicReferenceArray = aubVar.h;
        long j3 = r;
        if (objL == null) {
            if (j2 >= (defpackage.a.f0a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                if (obj == null) {
                    return s99.n;
                }
                if (aubVar.k(i2, objL, obj)) {
                    l();
                    return s99.m;
                }
            }
        } else if (objL == s99.d && aubVar.k(i2, objL, s99.i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            aubVar.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = aubVar.l(i2);
            if (objL2 == null || objL2 == s99.e) {
                if (j2 < (defpackage.a.f0a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                    if (aubVar.k(i2, objL2, s99.h)) {
                        l();
                        return s99.o;
                    }
                } else {
                    if (obj == null) {
                        return s99.n;
                    }
                    if (aubVar.k(i2, objL2, obj)) {
                        l();
                        return s99.m;
                    }
                }
            } else if (objL2 != s99.d) {
                pfw pfwVar = s99.j;
                if (objL2 == pfwVar) {
                    return s99.o;
                }
                if (objL2 == s99.h) {
                    return s99.o;
                }
                if (objL2 == s99.l) {
                    l();
                    return s99.o;
                }
                if (objL2 != s99.g && aubVar.k(i2, objL2, s99.f)) {
                    boolean z = objL2 instanceof ovu0;
                    if (z) {
                        objL2 = ((ovu0) objL2).f25942a;
                    }
                    if (L(objL2, aubVar, i2)) {
                        aubVar.o(i2, s99.i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        aubVar.n(i2, null);
                        return obj3;
                    }
                    aubVar.o(i2, pfwVar);
                    aubVar.i();
                    if (z) {
                        l();
                    }
                    return s99.o;
                }
            } else if (aubVar.k(i2, objL2, s99.i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                aubVar.n(i2, null);
                return obj4;
            }
        }
    }

    public final int N(aub aubVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        aubVar.n(i2, obj);
        if (z) {
            return O(aubVar, i2, obj, j2, obj2, z);
        }
        Object objL = aubVar.l(i2);
        if (objL == null) {
            if (b(j2)) {
                if (aubVar.k(i2, null, s99.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (aubVar.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof nvu0) {
            aubVar.n(i2, null);
            if (K(objL, obj)) {
                aubVar.o(i2, s99.i);
                return 0;
            }
            pfw pfwVar = s99.k;
            if (aubVar.h.getAndSet((i2 * 2) + 1, pfwVar) == pfwVar) {
                return 5;
            }
            aubVar.m(i2, true);
            return 5;
        }
        return O(aubVar, i2, obj, j2, obj2, z);
    }

    public final int O(aub aubVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objL = aubVar.l(i2);
            if (objL == null) {
                if (!b(j2) || z) {
                    if (z) {
                        if (aubVar.k(i2, null, s99.j)) {
                            aubVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (aubVar.k(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (aubVar.k(i2, null, s99.d)) {
                    break;
                }
            } else {
                if (objL != s99.e) {
                    pfw pfwVar = s99.k;
                    if (objL == pfwVar) {
                        aubVar.n(i2, null);
                        return 5;
                    }
                    if (objL == s99.h) {
                        aubVar.n(i2, null);
                        return 5;
                    }
                    if (objL == s99.l) {
                        aubVar.n(i2, null);
                        A();
                        return 4;
                    }
                    aubVar.n(i2, null);
                    if (objL instanceof ovu0) {
                        objL = ((ovu0) objL).f25942a;
                    }
                    if (K(objL, obj)) {
                        aubVar.o(i2, s99.i);
                        return 0;
                    }
                    if (aubVar.h.getAndSet((i2 * 2) + 1, pfwVar) != pfwVar) {
                        aubVar.m(i2, true);
                    }
                    return 5;
                }
                if (aubVar.k(i2, objL, s99.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void P(long j2) {
        q99 q99Var = this;
        if (q99Var.C()) {
            return;
        }
        while (q99Var.p() <= j2) {
            q99Var = this;
        }
        int i2 = s99.c;
        int i3 = 0;
        while (true) {
            long j3 = n;
            if (i3 < i2) {
                long jP = q99Var.p();
                if (jP == (defpackage.a.f0a.getLongVolatile(q99Var, j3) & 4611686018427387903L) && jP == q99Var.p()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = defpackage.a.f0a;
                    long longVolatile = unsafe.getLongVolatile(q99Var, j3);
                    if (unsafe.compareAndSwapLong(q99Var, n, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        q99Var = this;
                    }
                }
                while (true) {
                    long jP2 = q99Var.p();
                    Unsafe unsafe2 = defpackage.a.f0a;
                    long longVolatile2 = unsafe2.getLongVolatile(q99Var, j3);
                    long j4 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jP2 == j4 && jP2 == q99Var.p()) {
                        break;
                    }
                    if (z) {
                        q99Var = this;
                    } else {
                        q99Var = this;
                        unsafe2.compareAndSwapLong(q99Var, n, longVolatile2, j4 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = defpackage.a.f0a;
                    long longVolatile3 = unsafe3.getLongVolatile(q99Var, j3);
                    if (unsafe3.compareAndSwapLong(q99Var, n, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        q99Var = this;
                    }
                }
            }
        }
    }

    @Override // a.htb
    public final Object a(bnn0 bnn0Var) {
        return G(this, bnn0Var);
    }

    public final boolean b(long j2) {
        return j2 < p() || j2 < t() + ((long) this.f28336a);
    }

    @Override // a.jbi0
    public final void c(Function1 function1) {
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = defpackage.a.f0a;
            q99 q99Var = this;
            if (unsafe2.compareAndSwapObject(q99Var, m, (Object) null, function1)) {
                return;
            }
            long j2 = m;
            if (unsafe2.getObjectVolatile(q99Var, j2) != null) {
                while (true) {
                    Object objectVolatile = defpackage.a.f0a.getObjectVolatile(q99Var, j2);
                    pfw pfwVar = s99.q;
                    if (objectVolatile != pfwVar) {
                        if (objectVolatile == s99.r) {
                            jf4.n("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            udk.e(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    pfw pfwVar2 = s99.r;
                    do {
                        q99 q99Var2 = q99Var;
                        unsafe = defpackage.a.f0a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(q99Var2, m, pfwVar, pfwVar2);
                        q99Var = q99Var2;
                        if (zCompareAndSwapObject) {
                            function1.invoke(q99Var.q());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(q99Var, j2) == pfwVar);
                }
            } else {
                this = q99Var;
            }
        }
    }

    @Override // a.htb
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    public final boolean d(Throwable th) {
        return e(th, false);
    }

    public final boolean e(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        long j3;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j4;
        long longVolatile2;
        Unsafe unsafe4;
        long j5;
        long longVolatile3;
        if (z) {
            do {
                unsafe4 = defpackage.a.f0a;
                j5 = r;
                longVolatile3 = unsafe4.getLongVolatile(this, j5);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                aub aubVar = s99.f31842a;
            } while (!unsafe4.compareAndSwapLong(this, j5, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        pfw pfwVar = s99.s;
        while (true) {
            Unsafe unsafe5 = defpackage.a.f0a;
            long j6 = j;
            if (unsafe5.compareAndSwapObject(this, j6, pfwVar, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j6) != pfwVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = defpackage.a.f0a;
                j4 = r;
                longVolatile2 = unsafe3.getLongVolatile(this, j4);
            } while (!unsafe3.compareAndSwapLong(this, j4, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = defpackage.a.f0a;
                j2 = r;
                longVolatile = unsafe.getLongVolatile(this, j2);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j3 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j3));
        }
        A();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = defpackage.a.f0a;
                long j7 = m;
                objectVolatile = unsafe6.getObjectVolatile(this, j7);
                pfw pfwVar2 = objectVolatile == null ? s99.q : s99.r;
                do {
                    unsafe2 = defpackage.a.f0a;
                    if (unsafe2.compareAndSwapObject(this, m, objectVolatile, pfwVar2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j7) == objectVolatile);
            }
            if (objectVolatile != null) {
                zys0.e(1, objectVolatile);
                ((Function1) objectVolatile).invoke(q());
                return z2;
            }
        }
        return z2;
    }

    @Override // a.jbi0
    public Object f(Object obj) {
        q99 q99Var = this;
        Unsafe unsafe = defpackage.a.f0a;
        long longVolatile = unsafe.getLongVolatile(q99Var, r);
        long j2 = 1152921504606846975L;
        boolean z = q99Var.y(false, longVolatile) ? false : !q99Var.b(longVolatile & 1152921504606846975L);
        ytb ytbVar = ztb.b;
        if (z) {
            return ytbVar;
        }
        Object obj2 = s99.j;
        aub aubVar = (aub) unsafe.getObjectVolatile(q99Var, q);
        while (true) {
            long andIncrement = d.getAndIncrement(q99Var);
            long j3 = andIncrement & j2;
            boolean zY = q99Var.y(false, andIncrement);
            int i2 = s99.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (aubVar.d != j5) {
                aub aubVarO = q99Var.o(j5, aubVar);
                if (aubVarO != null) {
                    aubVar = aubVarO;
                } else {
                    if (zY) {
                        return new xtb(q99Var.u());
                    }
                    j2 = 1152921504606846975L;
                }
            }
            int iN = q99Var.N(aubVar, i3, obj, j3, obj2, zY);
            if (iN == 0) {
                aubVar.a();
                return Unit.f46060a;
            }
            if (iN == 1) {
                return Unit.f46060a;
            }
            if (iN == 2) {
                if (zY) {
                    aubVar.i();
                    return new xtb(u());
                }
                nvu0 nvu0Var = obj2 instanceof nvu0 ? (nvu0) obj2 : null;
                if (nvu0Var != null) {
                    nvu0Var.a(aubVar, i3 + i2);
                }
                aubVar.i();
                return ytbVar;
            }
            if (iN == 3) {
                jf4.n("unexpected");
                return null;
            }
            if (iN == 4) {
                if (j3 < t()) {
                    aubVar.a();
                }
                return new xtb(u());
            }
            if (iN == 5) {
                aubVar.a();
            }
            j2 = 1152921504606846975L;
            q99Var = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.n5a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // a.htb
    public final Object g(yje yjeVar) throws Throwable {
        aub aubVar;
        Throwable th;
        ?? r1;
        n5a n5aVar;
        kx2 kx2Var;
        aub aubVar2;
        Unsafe unsafe = defpackage.a.f0a;
        ?? r2 = o;
        aub aubVar3 = (aub) unsafe.getObjectVolatile(this, (long) r2);
        while (!this.z()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = s99.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (aubVar3.d != j3) {
                aub aubVarN = this.n(j3, aubVar3);
                if (aubVarN == null) {
                    continue;
                } else {
                    aubVar = aubVarN;
                }
            } else {
                aubVar = aubVar3;
            }
            q99 q99Var = this;
            Object objM = q99Var.M(aubVar, i2, andIncrement, null);
            pfw pfwVar = s99.m;
            kx2 kx2Var2 = null;
            if (objM == pfwVar) {
                jf4.n("unexpected");
                return null;
            }
            pfw pfwVar2 = s99.o;
            if (objM == pfwVar2) {
                if (andIncrement < q99Var.v()) {
                    aubVar.a();
                }
                this = q99Var;
                aubVar3 = aubVar;
            } else {
                if (objM != s99.n) {
                    aubVar.a();
                    return objM;
                }
                n5a n5aVarQ = rq8.Q(pnx.b(yjeVar));
                try {
                    Object objM2 = q99Var.M(aubVar, i2, andIncrement, n5aVarQ);
                    try {
                        if (objM2 == pfwVar) {
                            n5aVarQ.a(aubVar, i2);
                        } else {
                            Function1 function1 = q99Var.b;
                            try {
                                if (objM2 == pfwVar2) {
                                    if (andIncrement < q99Var.v()) {
                                        aubVar.a();
                                    }
                                    aub aubVar4 = (aub) defpackage.a.f0a.getObjectVolatile(q99Var, (long) r2);
                                    while (true) {
                                        if (q99Var.z()) {
                                            e0g0 e0g0Var = j0g0.b;
                                            n5aVarQ.resumeWith(new g0g0(q99Var.s()));
                                        } else {
                                            n5a n5aVar2 = n5aVarQ;
                                            try {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(q99Var);
                                                long j4 = s99.b;
                                                long j5 = andIncrement2 / j4;
                                                int i3 = (int) (andIncrement2 % j4);
                                                if (aubVar4.d != j5) {
                                                    try {
                                                        aub aubVarN2 = q99Var.n(j5, aubVar4);
                                                        if (aubVarN2 == null) {
                                                            n5aVarQ = n5aVar2;
                                                        } else {
                                                            aubVar2 = aubVarN2;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        r1 = n5aVar2;
                                                        r1.B();
                                                        throw th;
                                                    }
                                                } else {
                                                    aubVar2 = aubVar4;
                                                }
                                                q99 q99Var2 = q99Var;
                                                objM2 = q99Var2.M(aubVar2, i3, andIncrement2, n5aVar2);
                                                q99Var = q99Var2;
                                                aub aubVar5 = aubVar2;
                                                n5aVar = n5aVar2;
                                                if (objM2 == s99.m) {
                                                    n5aVar.a(aubVar5, i3);
                                                } else if (objM2 == s99.o) {
                                                    if (andIncrement2 < q99Var.v()) {
                                                        aubVar5.a();
                                                    }
                                                    aubVar4 = aubVar5;
                                                    n5aVarQ = n5aVar;
                                                } else {
                                                    if (objM2 == s99.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    aubVar5.a();
                                                    if (function1 != null) {
                                                        kx2Var = new kx2(3, q99Var, q99.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 1);
                                                        kx2Var2 = kx2Var;
                                                    }
                                                    n5aVar.v(objM2, kx2Var2);
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r2 = n5aVar2;
                                                th = th;
                                                r1 = r2;
                                                r1.B();
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    n5aVar = n5aVarQ;
                                    aubVar.a();
                                    if (function1 != null) {
                                        kx2Var = new kx2(3, q99Var, q99.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 1);
                                        kx2Var2 = kx2Var;
                                    }
                                    n5aVar.v(objM2, kx2Var2);
                                }
                                Object objP = n5aVar.p();
                                wne wneVar = wne.f39444a;
                                return objP;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        n5aVar = n5aVarQ;
                        Object objP2 = n5aVar.p();
                        wne wneVar2 = wne.f39444a;
                        return objP2;
                    } catch (Throwable th5) {
                        th = th5;
                        r1 = n5aVarQ;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r2 = n5aVarQ;
                }
            }
        }
        Throwable thS = this.s();
        int i4 = yul0.f43274a;
        throw thS;
    }

    public final aub h(long j2) {
        tqd tqdVar;
        long j3;
        Unsafe unsafe;
        long j4;
        Unsafe unsafe2 = defpackage.a.f0a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, l);
        aub aubVar = (aub) unsafe2.getObjectVolatile(this, q);
        if (aubVar.d > ((aub) objectVolatile).d) {
            objectVolatile = aubVar;
        }
        aub aubVar2 = (aub) unsafe2.getObjectVolatile(this, o);
        if (aubVar2.d > ((aub) objectVolatile).d) {
            objectVolatile = aubVar2;
        }
        tqd tqdVar2 = (tqd) objectVolatile;
        loop0: while (true) {
            tqdVar = tqdVar2;
            while (true) {
                int i2 = tqd.c;
                tqdVar.getClass();
                Object objectVolatile2 = defpackage.a.f0a.getObjectVolatile(tqdVar, tqd.f34376a);
                pfw pfwVar = sqd.f32624a;
                if (objectVolatile2 == pfwVar) {
                    break loop0;
                }
                tqdVar2 = (tqd) objectVolatile2;
                if (tqdVar2 == null) {
                    do {
                        unsafe = defpackage.a.f0a;
                        j4 = tqd.f34376a;
                        if (unsafe.compareAndSwapObject(tqdVar, j4, (Object) null, pfwVar)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(tqdVar, j4) == null);
                }
            }
        }
        aub aubVar3 = (aub) tqdVar;
        if (B()) {
            aub aubVar4 = aubVar3;
            loop3: while (true) {
                int i3 = s99.b - 1;
                while (true) {
                    if (-1 < i3) {
                        j3 = (aubVar4.d * ((long) s99.b)) + ((long) i3);
                        if (j3 >= t()) {
                            while (true) {
                                Object objL = aubVar4.l(i3);
                                if (objL != null && objL != s99.e) {
                                    if (objL != s99.d) {
                                        break;
                                    }
                                    break loop3;
                                }
                                if (aubVar4.k(i3, objL, s99.l)) {
                                    aubVar4.i();
                                    break;
                                }
                            }
                            i3--;
                        }
                    } else {
                        aubVar4 = (aub) ((tqd) defpackage.a.f0a.getObjectVolatile(aubVar4, tqd.b));
                        if (aubVar4 == null) {
                        }
                    }
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                k(j3);
            }
        }
        Object objM = null;
        loop6: for (aub aubVar5 = aubVar3; aubVar5 != null; aubVar5 = (aub) ((tqd) defpackage.a.f0a.getObjectVolatile(aubVar5, tqd.b))) {
            for (int i4 = s99.b - 1; -1 < i4; i4--) {
                if ((aubVar5.d * ((long) s99.b)) + ((long) i4) < j2) {
                    break loop6;
                }
                while (true) {
                    Object objL2 = aubVar5.l(i4);
                    if (objL2 != null && objL2 != s99.e) {
                        if (!(objL2 instanceof ovu0)) {
                            if (!(objL2 instanceof nvu0)) {
                                break;
                            }
                            if (aubVar5.k(i4, objL2, s99.l)) {
                                objM = idx.M(objM, objL2);
                                aubVar5.m(i4, true);
                                break;
                            }
                        } else {
                            if (aubVar5.k(i4, objL2, s99.l)) {
                                objM = idx.M(objM, ((ovu0) objL2).f25942a);
                                aubVar5.m(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (aubVar5.k(i4, objL2, s99.l)) {
                            aubVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objM != null) {
            if (!(objM instanceof ArrayList)) {
                J((nvu0) objM, true);
                return aubVar3;
            }
            ArrayList arrayList = (ArrayList) objM;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                J((nvu0) arrayList.get(size), true);
            }
        }
        return aubVar3;
    }

    @Override // a.htb
    public final i1i0 i() {
        m99 m99Var = m99.f21399a;
        zys0.e(3, m99Var);
        n99 n99Var = n99.f23128a;
        zys0.e(3, n99Var);
        return new n660(this, m99Var, n99Var, this.c);
    }

    @Override // a.htb
    public final j99 iterator() {
        return new j99(this);
    }

    @Override // a.htb
    public final Object j() {
        aub aubVar;
        Unsafe unsafe = defpackage.a.f0a;
        long longVolatile = unsafe.getLongVolatile(this, p);
        long longVolatile2 = unsafe.getLongVolatile(this, r);
        if (y(true, longVolatile2)) {
            return new xtb(q());
        }
        long j2 = longVolatile2 & 1152921504606846975L;
        ytb ytbVar = ztb.b;
        if (longVolatile >= j2) {
            return ytbVar;
        }
        Object obj = s99.k;
        aub aubVar2 = (aub) unsafe.getObjectVolatile(this, o);
        while (!this.z()) {
            long andIncrement = e.getAndIncrement(this);
            long j3 = s99.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (aubVar2.d != j4) {
                aub aubVarN = this.n(j4, aubVar2);
                if (aubVarN == null) {
                    continue;
                } else {
                    aubVar = aubVarN;
                }
            } else {
                aubVar = aubVar2;
            }
            q99 q99Var = this;
            Object objM = q99Var.M(aubVar, i2, andIncrement, obj);
            aubVar2 = aubVar;
            if (objM == s99.m) {
                nvu0 nvu0Var = obj instanceof nvu0 ? (nvu0) obj : null;
                if (nvu0Var != null) {
                    nvu0Var.a(aubVar2, i2);
                }
                q99Var.P(andIncrement);
                aubVar2.i();
                return ytbVar;
            }
            if (objM != s99.o) {
                if (objM != s99.n) {
                    aubVar2.a();
                    return objM;
                }
                jf4.n("unexpected");
                return null;
            }
            if (andIncrement < q99Var.v()) {
                aubVar2.a();
            }
            this = q99Var;
        }
        return new xtb(this.q());
    }

    public final void k(long j2) {
        ss3 ss3VarF;
        aub aubVar = (aub) defpackage.a.f0a.getObjectVolatile(this, o);
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j3 = p;
            long longVolatile = unsafe.getLongVolatile(this, j3);
            if (j2 < Math.max(((long) this.f28336a) + longVolatile, this.p())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j3, longVolatile, 1 + longVolatile)) {
                long j4 = s99.b;
                long j5 = longVolatile / j4;
                int i2 = (int) (longVolatile % j4);
                if (aubVar.d != j5) {
                    aub aubVarN = this.n(j5, aubVar);
                    if (aubVarN != null) {
                        aubVar = aubVarN;
                    }
                }
                aub aubVar2 = aubVar;
                Object objM = this.M(aubVar2, i2, longVolatile, null);
                if (objM != s99.o) {
                    aubVar2.a();
                    Function1 function1 = this.b;
                    if (function1 != null && (ss3VarF = vdx.F(function1, objM, null)) != null) {
                        throw ss3VarF;
                    }
                } else if (longVolatile < this.v()) {
                    aubVar2.a();
                }
                aubVar = aubVar2;
            }
        }
    }

    public final void l() {
        Object objA;
        Unsafe unsafe;
        if (C()) {
            return;
        }
        Unsafe unsafe2 = defpackage.a.f0a;
        long j2 = l;
        aub aubVar = (aub) unsafe2.getObjectVolatile(this, j2);
        while (true) {
            long andIncrement = f.getAndIncrement(this);
            long j3 = andIncrement / ((long) s99.b);
            if (v() <= andIncrement) {
                if (aubVar.d < j3 && aubVar.c() != null) {
                    D(j3, aubVar);
                }
                w(1L);
                return;
            }
            if (aubVar.d != j3) {
                r99 r99Var = r99.f30067a;
                while (true) {
                    objA = sqd.a(aubVar, j3, r99Var);
                    if (!efx.A(objA)) {
                        wvh0 wvh0VarX = efx.x(objA);
                        while (true) {
                            wvh0 wvh0Var = (wvh0) defpackage.a.f0a.getObjectVolatile(this, j2);
                            if (wvh0Var.d >= wvh0VarX.d) {
                                break;
                            }
                            if (!wvh0VarX.j()) {
                                break;
                            }
                            do {
                                unsafe = defpackage.a.f0a;
                                if (unsafe.compareAndSwapObject(this, l, wvh0Var, wvh0VarX)) {
                                    if (!wvh0Var.f()) {
                                        break;
                                    }
                                    wvh0Var.e();
                                    break;
                                }
                            } while (unsafe.getObjectVolatile(this, j2) == wvh0Var);
                            if (wvh0VarX.f()) {
                                wvh0VarX.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                aub aubVar2 = null;
                if (efx.A(objA)) {
                    A();
                    D(j3, aubVar);
                    w(1L);
                } else {
                    aub aubVar3 = (aub) efx.x(objA);
                    long j4 = aubVar3.d;
                    if (j4 > j3) {
                        long j5 = ((long) s99.b) * j4;
                        if (defpackage.a.f0a.compareAndSwapLong(this, k, 1 + andIncrement, j5)) {
                            w(j5 - andIncrement);
                        } else {
                            w(1L);
                        }
                    } else {
                        aubVar2 = aubVar3;
                    }
                }
                if (aubVar2 == null) {
                    continue;
                } else {
                    aubVar = aubVar2;
                }
            }
            int i2 = (int) (andIncrement % ((long) s99.b));
            Object objL = aubVar.l(i2);
            boolean z = objL instanceof nvu0;
            long j6 = p;
            if (!z || andIncrement < defpackage.a.f0a.getLongVolatile(this, j6) || !aubVar.k(i2, objL, s99.g)) {
                while (true) {
                    Object objL2 = aubVar.l(i2);
                    if (objL2 instanceof nvu0) {
                        if (andIncrement < defpackage.a.f0a.getLongVolatile(this, j6)) {
                            if (aubVar.k(i2, objL2, new ovu0((nvu0) objL2))) {
                                w(1L);
                                return;
                            }
                        } else if (aubVar.k(i2, objL2, s99.g)) {
                            if (!L(objL2, aubVar, i2)) {
                                aubVar.o(i2, s99.j);
                                aubVar.i();
                                break;
                            } else {
                                aubVar.o(i2, s99.d);
                                w(1L);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == s99.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (aubVar.k(i2, objL2, s99.e)) {
                                w(1L);
                                return;
                            }
                        } else if (objL2 == s99.d || objL2 == s99.h || objL2 == s99.i || objL2 == s99.k || objL2 == s99.l) {
                            w(1L);
                            return;
                        } else if (objL2 != s99.f) {
                            udk.e(objL2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                w(1L);
            } else if (L(objL, aubVar, i2)) {
                aubVar.o(i2, s99.d);
                w(1L);
                return;
            } else {
                aubVar.o(i2, s99.j);
                aubVar.i();
                w(1L);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0158  */
    /* JADX WARN: Code duplicated, block: B:91:0x015c A[RETURN] */
    @Override // a.jbi0
    public Object m(yje yjeVar, Object obj) {
        Object objP;
        wne wneVar;
        int i2;
        q99 q99Var = this;
        Unsafe unsafe = defpackage.a.f0a;
        long j2 = q;
        aub aubVar = (aub) unsafe.getObjectVolatile(q99Var, j2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(q99Var);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zY = q99Var.y(false, andIncrement);
            int i3 = s99.b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            if (aubVar.d != j5) {
                aub aubVarO = q99Var.o(j5, aubVar);
                if (aubVarO != null) {
                    aubVar = aubVarO;
                } else if (zY) {
                    Object objE = E(yjeVar, obj);
                    if (objE != wne.f39444a) {
                        break;
                    }
                    return objE;
                }
            }
            int iN = q99Var.N(aubVar, i4, obj, j3, null, zY);
            if (iN == 0) {
                aubVar.a();
                break;
            }
            if (iN != 1) {
                if (iN == 2) {
                    if (!zY) {
                        break;
                    }
                    aubVar.i();
                    Object objE2 = E(yjeVar, obj);
                    if (objE2 != wne.f39444a) {
                        break;
                    }
                    return objE2;
                }
                if (iN == 3) {
                    n5a n5aVarQ = rq8.Q(pnx.b(yjeVar));
                    try {
                        int iN2 = N(aubVar, i4, obj, j3, n5aVarQ, false);
                        if (iN2 == 0) {
                            aubVar.a();
                            e0g0 e0g0Var = j0g0.b;
                        } else {
                            if (iN2 != 1) {
                                if (iN2 != 2) {
                                    if (iN2 != 4) {
                                        String str = "unexpected";
                                        if (iN2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        aubVar.a();
                                        aub aubVar2 = (aub) defpackage.a.f0a.getObjectVolatile(this, j2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean zY2 = y(false, andIncrement2);
                                            int i5 = s99.b;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j7 = i5;
                                            long j8 = j6 / j7;
                                            int i6 = (int) (j6 % j7);
                                            if (aubVar2.d != j8) {
                                                aub aubVarO2 = o(j8, aubVar2);
                                                if (aubVarO2 != null) {
                                                    i2 = i6;
                                                    aubVar2 = aubVarO2;
                                                } else if (zY2) {
                                                }
                                            } else {
                                                i2 = i6;
                                            }
                                            int iN3 = N(aubVar2, i2, obj, j6, n5aVarQ, zY2);
                                            if (iN3 == 0) {
                                                aubVar2.a();
                                                e0g0 e0g0Var2 = j0g0.b;
                                            } else if (iN3 == 1) {
                                                e0g0 e0g0Var3 = j0g0.b;
                                            } else if (iN3 == 2) {
                                                if (!zY2) {
                                                    n5aVarQ.a(aubVar2, i2 + i5);
                                                    break;
                                                }
                                                aubVar2.i();
                                            } else {
                                                if (iN3 == 3) {
                                                    throw new IllegalStateException(str);
                                                }
                                                if (iN3 != 4) {
                                                    if (iN3 == 5) {
                                                        aubVar2.a();
                                                    }
                                                    str = str;
                                                } else if (j6 < t()) {
                                                    aubVar2.a();
                                                }
                                            }
                                        }
                                    } else if (j3 < t()) {
                                        aubVar.a();
                                    }
                                    F(obj, n5aVarQ);
                                    break;
                                } else {
                                    n5aVarQ.a(aubVar, i4 + i3);
                                }
                                objP = n5aVarQ.p();
                                wneVar = wne.f39444a;
                                if (objP != wneVar) {
                                    objP = Unit.f46060a;
                                }
                                if (objP == wneVar) {
                                    break;
                                }
                                return objP;
                            }
                            e0g0 e0g0Var4 = j0g0.b;
                        }
                        n5aVarQ.resumeWith(Unit.f46060a);
                        objP = n5aVarQ.p();
                        wneVar = wne.f39444a;
                        if (objP != wneVar) {
                            objP = Unit.f46060a;
                        }
                        if (objP == wneVar) {
                            break;
                        }
                        return objP;
                    } catch (Throwable th) {
                        n5aVarQ.B();
                        throw th;
                    }
                }
                if (iN == 4) {
                    if (j3 < t()) {
                        aubVar.a();
                    }
                    Object objE3 = E(yjeVar, obj);
                    if (objE3 != wne.f39444a) {
                        break;
                    }
                    return objE3;
                }
                if (iN == 5) {
                    aubVar.a();
                }
                q99Var = this;
            } else {
                break;
            }
        }
        return Unit.f46060a;
    }

    public final aub n(long j2, aub aubVar) {
        Object objA;
        aub aubVar2;
        Unsafe unsafe;
        long j3;
        long longVolatile;
        Unsafe unsafe2;
        aub aubVar3 = s99.f31842a;
        r99 r99Var = r99.f30067a;
        loop0: while (true) {
            objA = sqd.a(aubVar, j2, r99Var);
            if (!efx.A(objA)) {
                wvh0 wvh0VarX = efx.x(objA);
                while (true) {
                    Unsafe unsafe3 = defpackage.a.f0a;
                    long j4 = o;
                    wvh0 wvh0Var = (wvh0) unsafe3.getObjectVolatile(this, j4);
                    if (wvh0Var.d >= wvh0VarX.d) {
                        break loop0;
                    }
                    if (!wvh0VarX.j()) {
                        break;
                    }
                    do {
                        unsafe2 = defpackage.a.f0a;
                        if (unsafe2.compareAndSwapObject(this, o, wvh0Var, wvh0VarX)) {
                            if (!wvh0Var.f()) {
                                break loop0;
                            }
                            wvh0Var.e();
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(this, j4) == wvh0Var);
                    if (wvh0VarX.f()) {
                        wvh0VarX.e();
                    }
                }
            } else {
                break;
            }
        }
        if (efx.A(objA)) {
            A();
            if (aubVar.d * ((long) s99.b) < v()) {
                aubVar.a();
                return null;
            }
        } else {
            aub aubVar4 = (aub) efx.x(objA);
            long j5 = aubVar4.d;
            if (C() || j2 > p() / ((long) s99.b)) {
                aubVar2 = aubVar4;
                break;
            }
            loop3: while (true) {
                Unsafe unsafe4 = defpackage.a.f0a;
                long j6 = l;
                wvh0 wvh0Var2 = (wvh0) unsafe4.getObjectVolatile(this, j6);
                if (wvh0Var2.d >= j5 || !aubVar4.j()) {
                    aubVar2 = aubVar4;
                    break;
                }
                while (true) {
                    Unsafe unsafe5 = defpackage.a.f0a;
                    aubVar2 = aubVar4;
                    if (unsafe5.compareAndSwapObject(this, l, wvh0Var2, aubVar4)) {
                        if (!wvh0Var2.f()) {
                            break loop3;
                        }
                        wvh0Var2.e();
                        break loop3;
                    }
                    if (unsafe5.getObjectVolatile(this, j6) != wvh0Var2) {
                        break;
                    }
                    aubVar4 = aubVar2;
                }
                if (aubVar2.f()) {
                    aubVar2.e();
                }
                aubVar4 = aubVar2;
            }
            if (j5 <= j2) {
                return aubVar2;
            }
            long j7 = j5 * ((long) s99.b);
            do {
                unsafe = defpackage.a.f0a;
                j3 = p;
                longVolatile = unsafe.getLongVolatile(this, j3);
                if (longVolatile >= j7) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j3, longVolatile, j7));
            if (j5 * ((long) s99.b) < v()) {
                aubVar2.a();
            }
        }
        return null;
    }

    public final aub o(long j2, aub aubVar) {
        Object objA;
        aub aubVar2;
        long j3;
        Unsafe unsafe;
        q99 q99Var = this;
        aub aubVar3 = s99.f31842a;
        r99 r99Var = r99.f30067a;
        loop0: while (true) {
            objA = sqd.a(aubVar, j2, r99Var);
            if (!efx.A(objA)) {
                wvh0 wvh0VarX = efx.x(objA);
                while (true) {
                    Unsafe unsafe2 = defpackage.a.f0a;
                    long j4 = q;
                    wvh0 wvh0Var = (wvh0) unsafe2.getObjectVolatile(q99Var, j4);
                    if (wvh0Var.d >= wvh0VarX.d) {
                        break loop0;
                    }
                    if (!wvh0VarX.j()) {
                        break;
                    }
                    do {
                        unsafe = defpackage.a.f0a;
                        if (unsafe.compareAndSwapObject(q99Var, q, wvh0Var, wvh0VarX)) {
                            if (!wvh0Var.f()) {
                                break loop0;
                            }
                            wvh0Var.e();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(q99Var, j4) == wvh0Var);
                    if (wvh0VarX.f()) {
                        wvh0VarX.e();
                    }
                }
            } else {
                break;
            }
        }
        aub aubVar4 = null;
        if (efx.A(objA)) {
            q99Var.A();
            if (aubVar.d * ((long) s99.b) >= q99Var.t()) {
                return null;
            }
            aubVar.a();
            return null;
        }
        aub aubVar5 = (aub) efx.x(objA);
        long j5 = aubVar5.d;
        if (j5 <= j2) {
            return aubVar5;
        }
        long j6 = j5 * ((long) s99.b);
        while (true) {
            Unsafe unsafe3 = defpackage.a.f0a;
            long j7 = r;
            long longVolatile = unsafe3.getLongVolatile(q99Var, j7);
            long j8 = 1152921504606846975L & longVolatile;
            if (j8 >= j6) {
                aubVar2 = aubVar4;
                j3 = j5;
                break;
            }
            aubVar2 = aubVar4;
            j3 = j5;
            if (unsafe3.compareAndSwapLong(q99Var, j7, longVolatile, j8 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            q99Var = this;
            aubVar4 = aubVar2;
            j5 = j3;
        }
        if (j3 * ((long) s99.b) >= t()) {
            return aubVar2;
        }
        aubVar5.a();
        return aubVar2;
    }

    public final long p() {
        return defpackage.a.f0a.getLongVolatile(this, k);
    }

    public final Throwable q() {
        return (Throwable) defpackage.a.f0a.getObjectVolatile(this, j);
    }

    public final i1i0 r() {
        k99 k99Var = k99.f17904a;
        zys0.e(3, k99Var);
        l99 l99Var = l99.f19639a;
        zys0.e(3, l99Var);
        return new n660(this, k99Var, l99Var, this.c);
    }

    public final Throwable s() {
        Throwable thQ = q();
        return thQ == null ? new fvc("Channel was closed") : thQ;
    }

    public final long t() {
        return defpackage.a.f0a.getLongVolatile(this, p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = defpackage.a.f0a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, r) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f28336a + ',');
        sb.append("data=[");
        int i2 = 0;
        List listJ = q3d.j(unsafe.getObjectVolatile(this, o), unsafe.getObjectVolatile(this, q), unsafe.getObjectVolatile(this, l));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((aub) obj) != s99.f31842a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            itt0.a();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((aub) next).d;
            do {
                Object next2 = it.next();
                long j3 = ((aub) next2).d;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        aub aubVar = (aub) next;
        long jT = t();
        long jV = v();
        loop2: while (true) {
            int i3 = s99.b;
            for (int i4 = i2; i4 < i3; i4++) {
                long j4 = (aubVar.d * ((long) s99.b)) + ((long) i4);
                if (j4 >= jV && j4 >= jT) {
                    break loop2;
                }
                Object objL = aubVar.l(i4);
                Object obj2 = aubVar.h.get(i4 * 2);
                if (objL instanceof m5a) {
                    string = (jV > j4 || j4 >= jT) ? (jT > j4 || j4 >= jV) ? "cont" : "send" : "receive";
                } else if (objL instanceof o2i0) {
                    string = (jV > j4 || j4 >= jT) ? (jT > j4 || j4 >= jV) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof ode0) {
                    string = "receiveCatching";
                } else if (objL instanceof ovu0) {
                    string = "EB(" + objL + ')';
                } else if (Intrinsics.d(objL, s99.f) || Intrinsics.d(objL, s99.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(s99.e) && !objL.equals(s99.i) && !objL.equals(s99.h) && !objL.equals(s99.k) && !objL.equals(s99.j) && !objL.equals(s99.l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append(Separators.LPAREN + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            aubVar = (aub) aubVar.c();
            if (aubVar == null) {
                break;
            }
            i2 = 0;
        }
        if (ttm0.J(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thQ = q();
        return thQ == null ? new gvc("Channel was closed") : thQ;
    }

    public final long v() {
        return defpackage.a.f0a.getLongVolatile(this, r) & 1152921504606846975L;
    }

    public final void w(long j2) {
        if ((g.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((defpackage.a.f0a.getLongVolatile(this, n) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean y(boolean z, long j2) {
        q99 q99Var = this;
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                q99Var.h(j2 & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = defpackage.a.f0a;
                        long j3 = o;
                        aub aubVarN = (aub) unsafe.getObjectVolatile(q99Var, j3);
                        long jT = q99Var.t();
                        if (q99Var.v() <= jT) {
                            break;
                        }
                        long j4 = s99.b;
                        long j5 = jT / j4;
                        if (aubVarN.d != j5 && (aubVarN = q99Var.n(j5, aubVarN)) == null) {
                            if (((aub) unsafe.getObjectVolatile(q99Var, j3)).d < j5) {
                                break;
                            }
                        } else {
                            aubVarN.a();
                            int i3 = (int) (jT % j4);
                            while (true) {
                                Object objL = aubVarN.l(i3);
                                if (objL != null && objL != s99.e) {
                                    if (objL != s99.d && (objL == s99.j || objL == s99.l || objL == s99.i || objL == s99.h || (objL != s99.g && (objL == s99.f || jT != q99Var.t())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else {
                                    if (aubVarN.k(i3, objL, s99.h)) {
                                        q99Var.l();
                                        break;
                                    }
                                    q99Var = this;
                                }
                            }
                            defpackage.a.f0a.compareAndSwapLong(q99Var, p, jT, 1 + jT);
                            q99Var = this;
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    c99.v(twn.m(i2, "unexpected close status: "));
                    return false;
                }
                aub aubVarH = q99Var.h(j2 & 1152921504606846975L);
                ss3 ss3VarF = null;
                Object objM = null;
                loop0: do {
                    AtomicReferenceArray atomicReferenceArray = aubVarH.h;
                    for (int i4 = s99.b - 1; -1 < i4; i4--) {
                        long j6 = (aubVarH.d * ((long) s99.b)) + ((long) i4);
                        while (true) {
                            Object objL2 = aubVarH.l(i4);
                            if (objL2 == s99.i) {
                                break loop0;
                            }
                            pfw pfwVar = s99.d;
                            Function1 function1 = q99Var.b;
                            if (objL2 != pfwVar) {
                                if (objL2 != s99.e && objL2 != null) {
                                    if (!(objL2 instanceof nvu0) && !(objL2 instanceof ovu0)) {
                                        pfw pfwVar2 = s99.g;
                                        if (objL2 == pfwVar2 || objL2 == s99.f) {
                                            break loop0;
                                        }
                                        if (objL2 != pfwVar2) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < q99Var.t()) {
                                            break loop0;
                                        }
                                        nvu0 nvu0Var = objL2 instanceof ovu0 ? ((ovu0) objL2).f25942a : (nvu0) objL2;
                                        if (aubVarH.k(i4, objL2, s99.l)) {
                                            if (function1 != null) {
                                                ss3VarF = vdx.F(function1, atomicReferenceArray.get(i4 * 2), ss3VarF);
                                            }
                                            objM = idx.M(objM, nvu0Var);
                                            aubVarH.n(i4, null);
                                            aubVarH.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (aubVarH.k(i4, objL2, s99.l)) {
                                        aubVarH.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j6 < q99Var.t()) {
                                    break loop0;
                                }
                                if (aubVarH.k(i4, objL2, s99.l)) {
                                    if (function1 != null) {
                                        ss3VarF = vdx.F(function1, atomicReferenceArray.get(i4 * 2), ss3VarF);
                                    }
                                    aubVarH.n(i4, null);
                                    aubVarH.i();
                                    break;
                                }
                            }
                        }
                    }
                    aubVarH = (aub) ((tqd) defpackage.a.f0a.getObjectVolatile(aubVarH, tqd.b));
                } while (aubVarH != null);
                if (objM != null) {
                    if (objM instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            q99Var.J((nvu0) arrayList.get(size), false);
                        }
                    } else {
                        q99Var.J((nvu0) objM, false);
                    }
                }
                if (ss3VarF != null) {
                    throw ss3VarF;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean z() {
        return y(true, defpackage.a.f0a.getLongVolatile(this, r));
    }
}
