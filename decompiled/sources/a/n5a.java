package a;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class n5a extends qvk implements m5a, xne, nvu0 {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final yje d;
    public final CoroutineContext e;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        f = unsafe.objectFieldOffset(n5a.class.getDeclaredField("_decisionAndIndex$volatile"));
        h = unsafe.objectFieldOffset(n5a.class.getDeclaredField("_state$volatile"));
        g = unsafe.objectFieldOffset(n5a.class.getDeclaredField("_parentHandle$volatile"));
    }

    public n5a(int i, yje yjeVar) {
        super(i);
        this.d = yjeVar;
        this.e = yjeVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = gl.f11468a;
    }

    public static Object E(j660 j660Var, Object obj, int i, xdr xdrVar) {
        if (obj instanceof udd) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (xdrVar != null || (j660Var instanceof c5a)) {
            return new sdd(obj, j660Var instanceof c5a ? (c5a) j660Var : null, xdrVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(j660 j660Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + j660Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        n5a n5aVar;
        yje yjeVar = this.d;
        Throwable th = null;
        nvk nvkVar = yjeVar instanceof nvk ? (nvk) yjeVar : null;
        if (nvkVar != null) {
            long j = nvk.h;
            loop0: while (true) {
                Object objectVolatile = defpackage.a.f0a.getObjectVolatile(nvkVar, j);
                pfw pfwVar = ovk.b;
                if (objectVolatile == pfwVar) {
                    while (true) {
                        Unsafe unsafe = defpackage.a.f0a;
                        n5a n5aVar2 = this;
                        n5aVar = n5aVar2;
                        if (unsafe.compareAndSwapObject(nvkVar, nvk.h, pfwVar, n5aVar2)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(nvkVar, j) != pfwVar) {
                            break;
                        } else {
                            this = n5aVar;
                        }
                    }
                    this = n5aVar;
                } else {
                    n5aVar = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        udk.e(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    while (true) {
                        Unsafe unsafe2 = defpackage.a.f0a;
                        if (unsafe2.compareAndSwapObject(nvkVar, nvk.h, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                            break;
                        } else if (unsafe2.getObjectVolatile(nvkVar, j) != objectVolatile) {
                            jf4.o("Failed requirement.");
                            return;
                        }
                    }
                }
            }
            if (th == null) {
                return;
            }
            n5aVar.m();
            n5aVar.h(th);
        }
    }

    public final void C(Object obj, int i, xdr xdrVar) throws mvk {
        n5a n5aVar;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof j660)) {
                n5a n5aVar2 = this;
                if (objectVolatile instanceof v5a) {
                    v5a v5aVar = (v5a) objectVolatile;
                    if (unsafe.compareAndSwapInt(v5aVar, v5a.c, 0, 1)) {
                        if (xdrVar != null) {
                            n5aVar2.k(xdrVar, v5aVar.f35472a, obj);
                            return;
                        }
                        return;
                    }
                }
                udk.e(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objE = E((j660) objectVolatile, obj, i, xdrVar);
            while (true) {
                Unsafe unsafe2 = defpackage.a.f0a;
                n5aVar = this;
                if (unsafe2.compareAndSwapObject(n5aVar, h, objectVolatile, objE)) {
                    if (!n5aVar.y()) {
                        n5aVar.m();
                    }
                    n5aVar.n(i);
                    return;
                } else if (unsafe2.getObjectVolatile(n5aVar, j) != objectVolatile) {
                    break;
                } else {
                    this = n5aVar;
                }
            }
            this = n5aVar;
        }
    }

    public final void D(lne lneVar, Object obj) {
        yje yjeVar = this.d;
        nvk nvkVar = yjeVar instanceof nvk ? (nvk) yjeVar : null;
        C(obj, (nvkVar != null ? nvkVar.d : null) == lneVar ? 4 : this.c, null);
    }

    public final pfw F(Object obj, xdr xdrVar) {
        n5a n5aVar;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof j660)) {
                return null;
            }
            Object objE = E((j660) objectVolatile, obj, this.c, xdrVar);
            while (true) {
                Unsafe unsafe2 = defpackage.a.f0a;
                n5aVar = this;
                if (unsafe2.compareAndSwapObject(n5aVar, h, objectVolatile, objE)) {
                    boolean zY = n5aVar.y();
                    pfw pfwVar = o5a.f24678a;
                    if (!zY) {
                        n5aVar.m();
                    }
                    return pfwVar;
                }
                if (unsafe2.getObjectVolatile(n5aVar, j) != objectVolatile) {
                    break;
                }
                this = n5aVar;
            }
            this = n5aVar;
        }
    }

    @Override // a.nvu0
    public final void a(wvh0 wvh0Var, int i) {
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                jf4.n("invokeOnCancellation should be called at most once");
                return;
            }
            n5a n5aVar = this;
            if (unsafe.compareAndSwapInt(n5aVar, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                n5aVar.u(wvh0Var);
                return;
            }
            this = n5aVar;
        }
    }

    @Override // a.m5a
    public final pfw b(Object obj, xdr xdrVar) {
        return F(obj, xdrVar);
    }

    @Override // a.qvk
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        n5a n5aVar;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof j660) {
                jf4.n("Not completed");
                return;
            }
            if (objectVolatile instanceof udd) {
                return;
            }
            if (objectVolatile instanceof sdd) {
                sdd sddVar = (sdd) objectVolatile;
                if (sddVar.e != null) {
                    jf4.n("Must be called at most once");
                    return;
                }
                sdd sddVarA = sdd.a(sddVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = defpackage.a.f0a;
                    n5a n5aVar2 = this;
                    if (unsafe2.compareAndSwapObject(n5aVar2, h, objectVolatile, sddVarA)) {
                        c5a c5aVar = sddVar.b;
                        if (c5aVar != null) {
                            n5aVar2.j(c5aVar, cancellationException);
                        }
                        xdr xdrVar = sddVar.c;
                        if (xdrVar != null) {
                            n5aVar2.k(xdrVar, cancellationException, sddVar.f32029a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(n5aVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        n5aVar = n5aVar2;
                        break;
                    }
                    this = n5aVar2;
                }
            } else {
                n5a n5aVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                sdd sddVar2 = new sdd(objectVolatile, (c5a) null, (xdr) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    sdd sddVar3 = sddVar2;
                    Unsafe unsafe3 = defpackage.a.f0a;
                    n5aVar = n5aVar3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(n5aVar, h, objectVolatile, sddVar3);
                    sddVar2 = sddVar3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(n5aVar, j) != objectVolatile) {
                        break;
                    } else {
                        n5aVar3 = n5aVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = n5aVar;
        }
    }

    @Override // a.qvk
    public final yje d() {
        return this.d;
    }

    @Override // a.qvk
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // a.qvk
    public final Object f(Object obj) {
        return obj instanceof sdd ? ((sdd) obj).f32029a : obj;
    }

    @Override // a.xne
    public final xne getCallerFrame() {
        yje yjeVar = this.d;
        if (yjeVar instanceof xne) {
            return (xne) yjeVar;
        }
        return null;
    }

    @Override // a.yje
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // a.m5a
    public final boolean h(Throwable th) {
        Throwable cancellationException;
        n5a n5aVar;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof j660)) {
                return false;
            }
            boolean z = (objectVolatile instanceof c5a) || (objectVolatile instanceof wvh0);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            v5a v5aVar = new v5a(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = defpackage.a.f0a;
                n5aVar = this;
                if (unsafe2.compareAndSwapObject(n5aVar, h, objectVolatile, v5aVar)) {
                    j660 j660Var = (j660) objectVolatile;
                    if (j660Var instanceof c5a) {
                        n5aVar.j((c5a) objectVolatile, th);
                    } else if (j660Var instanceof wvh0) {
                        n5aVar.l((wvh0) objectVolatile, th);
                    }
                    if (!n5aVar.y()) {
                        n5aVar.m();
                    }
                    n5aVar.n(n5aVar.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(n5aVar, j) != objectVolatile) {
                    break;
                }
                this = n5aVar;
            }
            this = n5aVar;
        }
    }

    @Override // a.qvk
    public final Object i() {
        return q();
    }

    public final void j(c5a c5aVar, Throwable th) {
        try {
            c5aVar.b(th);
        } catch (Throwable th2) {
            u1c.H(new ss3("Exception in invokeOnCancellation handler for " + this, th2), this.e);
        }
    }

    public final void k(xdr xdrVar, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.e;
        try {
            xdrVar.F(th, obj, coroutineContext);
        } catch (Throwable th2) {
            u1c.H(new ss3("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void l(wvh0 wvh0Var, Throwable th) {
        CoroutineContext coroutineContext = this.e;
        int intVolatile = defpackage.a.f0a.getIntVolatile(this, f) & 536870911;
        if (intVolatile == 536870911) {
            jf4.n("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            wvh0Var.h(intVolatile, coroutineContext);
        } catch (Throwable th2) {
            u1c.H(new ss3("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void m() {
        Unsafe unsafe = defpackage.a.f0a;
        long j = g;
        nwk nwkVar = (nwk) unsafe.getObjectVolatile(this, j);
        if (nwkVar == null) {
            return;
        }
        nwkVar.a();
        unsafe.putObjectVolatile(this, j, a660.f303a);
    }

    public final void n(int i) throws mvk {
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    jf4.n("Already resumed");
                    return;
                }
                boolean z = i == 4;
                yje yjeVar = this.d;
                if (!z && (yjeVar instanceof nvk)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.c;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        nvk nvkVar = (nvk) yjeVar;
                        lne lneVar = nvkVar.d;
                        CoroutineContext context = nvkVar.e.getContext();
                        if (ovk.c(lneVar, context)) {
                            ovk.b(lneVar, context, this);
                            return;
                        }
                        eeo eeoVarA = gcq0.a();
                        if (eeoVarA.c >= 4294967296L) {
                            eeoVarA.y(this);
                            return;
                        }
                        eeoVarA.F(true);
                        try {
                            plc.K(this, yjeVar, true);
                            do {
                            } while (eeoVarA.I());
                        } catch (Throwable th) {
                            try {
                                this.g(th);
                            } finally {
                                eeoVarA.x(true);
                            }
                        }
                        return;
                    }
                }
                plc.K(this, yjeVar, z);
                return;
            }
            n5a n5aVar = this;
            if (unsafe.compareAndSwapInt(n5aVar, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = n5aVar;
            }
        }
    }

    public Throwable o(pby pbyVar) {
        return pbyVar.getCancellationException();
    }

    public final Object p() {
        bby bbyVar;
        boolean zY = y();
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    jf4.n("Already suspended");
                    return null;
                }
                if (zY) {
                    this.B();
                }
                Object objQ = this.q();
                if (objQ instanceof udd) {
                    throw ((udd) objQ).f35472a;
                }
                int i2 = this.c;
                if ((i2 != 1 && i2 != 2) || (bbyVar = (bby) this.e.get(gqw0.o1)) == null || bbyVar.isActive()) {
                    return this.f(objQ);
                }
                CancellationException cancellationException = bbyVar.getCancellationException();
                this.c(cancellationException);
                throw cancellationException;
            }
            n5a n5aVar = this;
            if (unsafe.compareAndSwapInt(n5aVar, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((nwk) unsafe.getObjectVolatile(n5aVar, g)) == null) {
                    n5aVar.s();
                }
                if (zY) {
                    n5aVar.B();
                }
                return wne.f39444a;
            }
            this = n5aVar;
        }
    }

    public final Object q() {
        return defpackage.a.f0a.getObjectVolatile(this, h);
    }

    public final void r() {
        nwk nwkVarS = s();
        if (nwkVarS != null && x()) {
            nwkVarS.a();
            defpackage.a.f0a.putObjectVolatile(this, g, a660.f303a);
        }
    }

    @Override // a.yje
    public final void resumeWith(Object obj) {
        Throwable thA = j0g0.a(obj);
        if (thA != null) {
            obj = new udd(thA, false);
        }
        C(obj, this.c, null);
    }

    public final nwk s() {
        bby bbyVar = (bby) this.e.get(gqw0.o1);
        if (bbyVar == null) {
            return null;
        }
        nwk nwkVarW = zvw.W(bbyVar, true, new eac(this));
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = g;
            n5a n5aVar = this;
            if (unsafe.compareAndSwapObject(n5aVar, j, (Object) null, nwkVarW) || unsafe.getObjectVolatile(n5aVar, j) != null) {
                break;
            }
            this = n5aVar;
        }
        return nwkVarW;
    }

    public final void t(Function1 function1) {
        u(new b5a(function1, (byte) 1));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(A());
        sb.append('(');
        sb.append(qjj.b0(this.d));
        sb.append("){");
        Object objQ = q();
        if (objQ instanceof j660) {
            str = "Active";
        } else {
            str = objQ instanceof v5a ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(qjj.R(this));
        return sb.toString();
    }

    public final void u(j660 j660Var) {
        j660 j660Var2;
        n5a n5aVar;
        n5a n5aVar2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = defpackage.a.f0a;
            long j = h;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof gl) {
                while (true) {
                    Unsafe unsafe3 = defpackage.a.f0a;
                    n5a n5aVar3 = this;
                    j660 j660Var3 = j660Var;
                    n5aVar = n5aVar3;
                    j660Var2 = j660Var3;
                    if (unsafe3.compareAndSwapObject(n5aVar3, h, objectVolatile, j660Var3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(n5aVar, j) != objectVolatile) {
                        break;
                    }
                    this = n5aVar;
                    j660Var = j660Var2;
                }
            } else {
                j660Var2 = j660Var;
                n5aVar = this;
                if ((objectVolatile instanceof c5a) || (objectVolatile instanceof wvh0)) {
                    z(j660Var2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof udd) {
                    udd uddVar = (udd) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(uddVar, udd.b, 0, 1)) {
                        z(j660Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof v5a) {
                        Throwable th = uddVar.f35472a;
                        if (j660Var2 instanceof c5a) {
                            n5aVar.j((c5a) j660Var2, th);
                            return;
                        } else {
                            n5aVar.l((wvh0) j660Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof sdd) {
                    sdd sddVar = (sdd) objectVolatile;
                    if (sddVar.b != null) {
                        z(j660Var2, objectVolatile);
                        throw null;
                    }
                    if (j660Var2 instanceof wvh0) {
                        return;
                    }
                    c5a c5aVar = (c5a) j660Var2;
                    Throwable th2 = sddVar.e;
                    if (th2 != null) {
                        n5aVar.j(c5aVar, th2);
                        return;
                    }
                    sdd sddVarA = sdd.a(sddVar, c5aVar, null, 29);
                    do {
                        unsafe = defpackage.a.f0a;
                        if (unsafe.compareAndSwapObject(n5aVar, h, objectVolatile, sddVarA)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(n5aVar, j) == objectVolatile);
                } else {
                    if (j660Var2 instanceof wvh0) {
                        return;
                    }
                    sdd sddVar2 = new sdd(objectVolatile, (c5a) j660Var2, (xdr) null, (Throwable) null, 28);
                    while (true) {
                        sdd sddVar3 = sddVar2;
                        Unsafe unsafe4 = defpackage.a.f0a;
                        n5aVar2 = n5aVar;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(n5aVar2, h, objectVolatile, sddVar3);
                        sddVar2 = sddVar3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(n5aVar2, j) != objectVolatile) {
                            break;
                        } else {
                            n5aVar = n5aVar2;
                        }
                    }
                }
                this = n5aVar2;
                j660Var = j660Var2;
            }
            n5aVar2 = n5aVar;
            this = n5aVar2;
            j660Var = j660Var2;
        }
    }

    @Override // a.m5a
    public final void v(Object obj, xdr xdrVar) {
        C(obj, this.c, xdrVar);
    }

    @Override // a.m5a
    public final void w(Object obj) throws mvk {
        n(this.c);
    }

    public final boolean x() {
        return !(q() instanceof j660);
    }

    public final boolean y() {
        if (this.c != 2) {
            return false;
        }
        yje yjeVar = this.d;
        yjeVar.getClass();
        return defpackage.a.f0a.getObjectVolatile((nvk) yjeVar, nvk.h) != null;
    }
}
