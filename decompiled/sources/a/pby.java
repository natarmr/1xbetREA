package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pby implements bby, jac, gp80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ long f26732a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        b = unsafe.objectFieldOffset(pby.class.getDeclaredField("_state$volatile"));
        f26732a = unsafe.objectFieldOffset(pby.class.getDeclaredField("_parentHandle$volatile"));
    }

    public pby(boolean z) {
        this._state$volatile = z ? qby.g : qby.f;
    }

    public static gac Q(hu00 hu00Var) {
        while (hu00Var.j()) {
            hu00Var = hu00Var.i();
        }
        while (true) {
            hu00Var = hu00Var.h();
            if (!hu00Var.j()) {
                if (hu00Var instanceof gac) {
                    return (gac) hu00Var;
                }
                if (hu00Var instanceof u460) {
                    return null;
                }
            }
        }
    }

    public static String X(Object obj) {
        if (!(obj instanceof iby)) {
            if (obj instanceof u4x) {
                return ((u4x) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof udd ? "Cancelled" : "Completed";
        }
        iby ibyVar = (iby) obj;
        if (ibyVar.d()) {
            return "Cancelling";
        }
        return ibyVar.e() ? "Completing" : "Active";
    }

    public static CancellationException Y(pby pbyVar, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new cby(pbyVar.u(), th, pbyVar) : cancellationException;
    }

    public final Object A(iby ibyVar, Object obj) throws Throwable {
        Throwable th;
        pby pbyVar;
        iby ibyVar2;
        udd uddVar = obj instanceof udd ? (udd) obj : null;
        Throwable th2 = uddVar != null ? uddVar.f35472a : null;
        synchronized (ibyVar) {
            try {
                ibyVar.d();
                ArrayList<Throwable> arrayListF = ibyVar.f(th2);
                Throwable thC = C(ibyVar, arrayListF);
                if (thC != null) {
                    try {
                        if (arrayListF.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                            for (Throwable th3 : arrayListF) {
                                if (th3 != thC && th3 != thC && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    tjo.a(thC, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thC != null && thC != th2) {
                    obj = new udd(thC, false);
                }
                if (thC != null && (t(thC) || I(thC))) {
                    obj.getClass();
                    defpackage.a.f0a.compareAndSwapInt((udd) obj, udd.b, 0, 1);
                }
                S(obj);
                Object v4xVar = obj instanceof u4x ? new v4x((u4x) obj) : obj;
                while (true) {
                    Unsafe unsafe = defpackage.a.f0a;
                    long j = b;
                    pbyVar = this;
                    ibyVar2 = ibyVar;
                    if (unsafe.compareAndSwapObject(pbyVar, j, ibyVar2, v4xVar) || unsafe.getObjectVolatile(pbyVar, j) != ibyVar2) {
                        break;
                    }
                    this = pbyVar;
                    ibyVar = ibyVar2;
                }
                pbyVar.y(ibyVar2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Object B() throws Throwable {
        Object objH = H();
        if (objH instanceof u4x) {
            jf4.n("This job has not completed yet");
            return null;
        }
        if (objH instanceof udd) {
            throw ((udd) objH).f35472a;
        }
        return qby.a(objH);
    }

    public final Throwable C(iby ibyVar, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (ibyVar.d()) {
                return new cby(u(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof gmq0) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof gmq0)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean D() {
        return true;
    }

    public final n660 E() {
        mby mbyVar = mby.f21526a;
        zys0.e(3, mbyVar);
        nby nbyVar = nby.f23264a;
        zys0.e(3, nbyVar);
        return new n660(this, mbyVar, nbyVar, (Object) null);
    }

    public boolean F() {
        return this instanceof odd;
    }

    public final u460 G(u4x u4xVar) {
        u460 u460VarC = u4xVar.c();
        if (u460VarC != null) {
            return u460VarC;
        }
        if (u4xVar instanceof mtn) {
            return new u460();
        }
        if (u4xVar instanceof eby) {
            V((eby) u4xVar);
            return null;
        }
        udk.e(u4xVar, "State should have list: ");
        return null;
    }

    public final Object H() {
        return defpackage.a.f0a.getObjectVolatile(this, b);
    }

    public boolean I(Throwable th) {
        return false;
    }

    public final void K(bby bbyVar) {
        long j = f26732a;
        a660 a660Var = a660.f303a;
        if (bbyVar == null) {
            defpackage.a.f0a.putObjectVolatile(this, j, a660Var);
            return;
        }
        bbyVar.start();
        fac facVarAttachChild = bbyVar.attachChild(this);
        Unsafe unsafe = defpackage.a.f0a;
        unsafe.putObjectVolatile(this, j, facVarAttachChild);
        if (isCompleted()) {
            facVarAttachChild.a();
            unsafe.putObjectVolatile(this, j, a660Var);
        }
    }

    public final nwk L(boolean z, eby ebyVar) {
        pby pbyVar;
        eby ebyVar2;
        boolean zD;
        ebyVar.d = this;
        loop0: while (true) {
            Object objH = this.H();
            if (!(objH instanceof mtn)) {
                pbyVar = this;
                ebyVar2 = ebyVar;
                boolean z2 = objH instanceof u4x;
                a660 a660Var = a660.f303a;
                if (z2) {
                    u4x u4xVar = (u4x) objH;
                    u460 u460VarC = u4xVar.c();
                    if (u460VarC == null) {
                        pbyVar.V((eby) objH);
                    } else {
                        if (ebyVar2.l()) {
                            iby ibyVar = u4xVar instanceof iby ? (iby) u4xVar : null;
                            Throwable thB = ibyVar != null ? ibyVar.b() : null;
                            if (thB == null) {
                                zD = u460VarC.d(ebyVar2, 5);
                            } else if (z) {
                                ebyVar2.m(thB);
                                return a660Var;
                            }
                        } else {
                            zD = u460VarC.d(ebyVar2, 1);
                        }
                        if (zD) {
                            break;
                        }
                    }
                    this = pbyVar;
                    ebyVar = ebyVar2;
                } else if (z) {
                    Object objH2 = pbyVar.H();
                    udd uddVar = objH2 instanceof udd ? (udd) objH2 : null;
                    ebyVar2.m(uddVar != null ? uddVar.f35472a : null);
                }
                return a660Var;
            }
            mtn mtnVar = (mtn) objH;
            if (mtnVar.f22378a) {
                while (true) {
                    Unsafe unsafe = defpackage.a.f0a;
                    long j = b;
                    pbyVar = this;
                    ebyVar2 = ebyVar;
                    if (unsafe.compareAndSwapObject(pbyVar, j, objH, ebyVar2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(pbyVar, j) != objH) {
                        break;
                    }
                    this = pbyVar;
                    ebyVar = ebyVar2;
                }
            } else {
                pbyVar = this;
                ebyVar2 = ebyVar;
                pbyVar.U(mtnVar);
            }
            this = pbyVar;
            ebyVar = ebyVar2;
        }
        return ebyVar2;
    }

    public boolean M() {
        return this instanceof ta8;
    }

    public final boolean N(Object obj) {
        Object objZ;
        do {
            objZ = Z(H(), obj);
            if (objZ == qby.f28461a) {
                return false;
            }
            if (objZ == qby.b) {
                return true;
            }
        } while (objZ == qby.c);
        o(objZ);
        return true;
    }

    public final Object O(Object obj) {
        Object objZ;
        do {
            objZ = Z(H(), obj);
            if (objZ == qby.f28461a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                udd uddVar = obj instanceof udd ? (udd) obj : null;
                throw new IllegalStateException(str, uddVar != null ? uddVar.f35472a : null);
            }
        } while (objZ == qby.c);
        return objZ;
    }

    public String P() {
        return getClass().getSimpleName();
    }

    public final void R(u460 u460Var, Throwable th) {
        u460Var.d(new wc00(4), 4);
        Object objG = u460Var.g();
        objG.getClass();
        ss3 ss3Var = null;
        for (hu00 hu00VarH = (hu00) objG; !hu00VarH.equals(u460Var); hu00VarH = hu00VarH.h()) {
            if ((hu00VarH instanceof eby) && ((eby) hu00VarH).l()) {
                try {
                    ((eby) hu00VarH).m(th);
                } catch (Throwable th2) {
                    if (ss3Var != null) {
                        tjo.a(ss3Var, th2);
                    } else {
                        ss3Var = new ss3("Exception in completion handler " + hu00VarH + " for " + this, th2);
                    }
                }
            }
        }
        if (ss3Var != null) {
            J(ss3Var);
        }
        t(th);
    }

    public final void U(mtn mtnVar) {
        u460 u460Var = new u460();
        Object q4xVar = mtnVar.f22378a ? u460Var : new q4x(u460Var);
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = b;
            pby pbyVar = this;
            mtn mtnVar2 = mtnVar;
            if (unsafe.compareAndSwapObject(pbyVar, j, mtnVar2, q4xVar) || unsafe.getObjectVolatile(pbyVar, j) != mtnVar2) {
                return;
            }
            this = pbyVar;
            mtnVar = mtnVar2;
        }
    }

    public final void V(eby ebyVar) {
        eby ebyVar2;
        pby pbyVar;
        u460 u460Var = new u460();
        Unsafe unsafe = defpackage.a.f0a;
        unsafe.putObjectVolatile(u460Var, hu00.b, ebyVar);
        long j = hu00.f13658a;
        unsafe.putObjectVolatile(u460Var, j, ebyVar);
        loop0: while (true) {
            if (ebyVar.g() != ebyVar) {
                ebyVar2 = ebyVar;
                break;
            }
            while (true) {
                Unsafe unsafe2 = defpackage.a.f0a;
                ebyVar2 = ebyVar;
                if (unsafe2.compareAndSwapObject(ebyVar2, hu00.f13658a, ebyVar, u460Var)) {
                    u460Var.f(ebyVar2);
                    break loop0;
                }
                pbyVar = this;
                ebyVar = ebyVar2;
                if (unsafe2.getObjectVolatile(ebyVar2, j) != ebyVar2) {
                    break;
                } else {
                    this = pbyVar;
                }
            }
            this = pbyVar;
        }
        hu00 hu00VarH = ebyVar2.h();
        while (true) {
            Unsafe unsafe3 = defpackage.a.f0a;
            long j2 = b;
            pby pbyVar2 = this;
            if (unsafe3.compareAndSwapObject(pbyVar2, j2, ebyVar2, hu00VarH) || unsafe3.getObjectVolatile(pbyVar2, j2) != ebyVar2) {
                return;
            } else {
                this = pbyVar2;
            }
        }
    }

    public final int W(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof mtn;
        long j = b;
        if (!z) {
            pby pbyVar = this;
            Object obj2 = obj;
            if (!(obj2 instanceof q4x)) {
                return 0;
            }
            u460 u460Var = ((q4x) obj2).f28123a;
            do {
                pby pbyVar2 = pbyVar;
                unsafe = defpackage.a.f0a;
                Object obj3 = obj2;
                boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(pbyVar2, b, obj3, u460Var);
                pbyVar = pbyVar2;
                obj2 = obj3;
                if (zCompareAndSwapObject) {
                    pbyVar.T();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(pbyVar, j) == obj2);
            return -1;
        }
        if (((mtn) obj).f22378a) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = defpackage.a.f0a;
            pby pbyVar3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(pbyVar3, b, obj4, qby.g)) {
                pbyVar3.T();
                return 1;
            }
            if (unsafe2.getObjectVolatile(pbyVar3, j) != obj4) {
                return -1;
            }
            this = pbyVar3;
            obj = obj4;
        }
    }

    public final Object Z(Object obj, Object obj2) {
        if (!(obj instanceof u4x)) {
            return qby.f28461a;
        }
        if ((!(obj instanceof mtn) && !(obj instanceof eby)) || (obj instanceof gac) || (obj2 instanceof udd)) {
            pby pbyVar = this;
            u4x u4xVar = (u4x) obj;
            u460 u460VarG = pbyVar.G(u4xVar);
            if (u460VarG == null) {
                return qby.c;
            }
            iby ibyVar = u4xVar instanceof iby ? (iby) u4xVar : null;
            if (ibyVar == null) {
                ibyVar = new iby(u460VarG, null);
            }
            iby ibyVar2 = ibyVar;
            synchronized (ibyVar2) {
                if (ibyVar2.e()) {
                    return qby.f28461a;
                }
                defpackage.a.f0a.putIntVolatile(ibyVar2, iby.c, 1);
                if (ibyVar2 != u4xVar) {
                    while (true) {
                        Unsafe unsafe = defpackage.a.f0a;
                        long j = b;
                        pby pbyVar2 = pbyVar;
                        pbyVar = pbyVar2;
                        if (unsafe.compareAndSwapObject(pbyVar2, j, u4xVar, ibyVar2)) {
                            break;
                        }
                        if (unsafe.getObjectVolatile(pbyVar, j) != u4xVar) {
                            return qby.c;
                        }
                    }
                }
                boolean zD = ibyVar2.d();
                udd uddVar = obj2 instanceof udd ? (udd) obj2 : null;
                if (uddVar != null) {
                    ibyVar2.a(uddVar.f35472a);
                }
                Throwable thB = zD ? null : ibyVar2.b();
                if (thB != null) {
                    pbyVar.R(u460VarG, thB);
                }
                gac gacVarQ = Q(u460VarG);
                if (gacVarQ != null && pbyVar.a0(ibyVar2, gacVarQ, obj2)) {
                    return qby.b;
                }
                u460VarG.d(new wc00(2), 2);
                gac gacVarQ2 = Q(u460VarG);
                return (gacVarQ2 == null || !pbyVar.a0(ibyVar2, gacVarQ2, obj2)) ? pbyVar.A(ibyVar2, obj2) : qby.b;
            }
        }
        u4x u4xVar2 = (u4x) obj;
        Object v4xVar = obj2 instanceof u4x ? new v4x((u4x) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = defpackage.a.f0a;
            long j2 = b;
            pby pbyVar3 = this;
            if (unsafe2.compareAndSwapObject(pbyVar3, j2, u4xVar2, v4xVar)) {
                pbyVar3.S(obj2);
                pbyVar3.y(u4xVar2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(pbyVar3, j2) != u4xVar2) {
                return qby.c;
            }
            this = pbyVar3;
        }
    }

    public final boolean a0(iby ibyVar, gac gacVar, Object obj) {
        while (zvw.W(gacVar.e, false, new hby(this, ibyVar, gacVar, obj)) == a660.f303a) {
            gacVar = Q(gacVar);
            if (gacVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // a.bby
    public final fac attachChild(jac jacVar) {
        pby pbyVar;
        gac gacVar = new gac(jacVar);
        gacVar.d = this;
        loop0: while (true) {
            Object objH = this.H();
            if (objH instanceof mtn) {
                mtn mtnVar = (mtn) objH;
                if (mtnVar.f22378a) {
                    while (true) {
                        Unsafe unsafe = defpackage.a.f0a;
                        long j = b;
                        pbyVar = this;
                        if (unsafe.compareAndSwapObject(pbyVar, j, objH, gacVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(pbyVar, j) != objH) {
                            break;
                        }
                        this = pbyVar;
                    }
                } else {
                    pbyVar = this;
                    pbyVar.U(mtnVar);
                }
                this = pbyVar;
            } else {
                pbyVar = this;
                boolean z = objH instanceof u4x;
                a660 a660Var = a660.f303a;
                Throwable thB = null;
                if (!z) {
                    Object objH2 = pbyVar.H();
                    udd uddVar = objH2 instanceof udd ? (udd) objH2 : null;
                    gacVar.m(uddVar != null ? uddVar.f35472a : null);
                    return a660Var;
                }
                u460 u460VarC = ((u4x) objH).c();
                if (u460VarC != null) {
                    if (u460VarC.d(gacVar, 7)) {
                        break;
                    }
                    boolean zD = u460VarC.d(gacVar, 3);
                    Object objH3 = pbyVar.H();
                    if (objH3 instanceof iby) {
                        thB = ((iby) objH3).b();
                    } else {
                        udd uddVar2 = objH3 instanceof udd ? (udd) objH3 : null;
                        if (uddVar2 != null) {
                            thB = uddVar2.f35472a;
                        }
                    }
                    gacVar.m(thB);
                    if (zD) {
                        break;
                    }
                    return a660Var;
                }
                pbyVar.V((eby) objH);
                this = pbyVar;
            }
        }
        return gacVar;
    }

    @Override // a.bby, a.htb
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new cby(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // a.bby
    public final CancellationException getCancellationException() {
        Object objH = H();
        if (!(objH instanceof iby)) {
            if (!(objH instanceof u4x)) {
                return objH instanceof udd ? Y(this, ((udd) objH).f35472a) : new cby(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            udk.e(this, "Job is still new or active: ");
            return null;
        }
        Throwable thB = ((iby) objH).b();
        if (thB == null) {
            udk.e(this, "Job is still new or active: ");
            return null;
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new cby(strConcat, thB, this) : cancellationException;
    }

    @Override // a.bby
    public final Sequence getChildren() {
        return new sx3(new lby(null, this), (byte) 3);
    }

    public Object getCompleted() {
        return B();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objH = H();
        if (objH instanceof u4x) {
            jf4.n("This job has not completed yet");
            return null;
        }
        udd uddVar = objH instanceof udd ? (udd) objH : null;
        if (uddVar != null) {
            return uddVar.f35472a;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return gqw0.o1;
    }

    @Override // a.bby
    public final h1i0 getOnJoin() {
        oby obyVar = oby.f25002a;
        zys0.e(3, obyVar);
        return new nw20(this, obyVar);
    }

    @Override // a.bby
    public final nwk invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return L(z2, z ? new rox(function1) : new sox(function1));
    }

    @Override // a.bby
    public boolean isActive() {
        Object objH = H();
        return (objH instanceof u4x) && ((u4x) objH).isActive();
    }

    @Override // a.bby
    public final boolean isCancelled() {
        Object objH = H();
        if (objH instanceof udd) {
            return true;
        }
        return (objH instanceof iby) && ((iby) objH).d();
    }

    @Override // a.bby
    public final boolean isCompleted() {
        return !(H() instanceof u4x);
    }

    @Override // a.bby
    public final Object join(yje yjeVar) {
        Object objH;
        do {
            objH = H();
            if (!(objH instanceof u4x)) {
                zvw.O(yjeVar.getContext());
                return Unit.f46060a;
            }
        } while (W(objH) < 0);
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        n5aVar.u(new b5a(zvw.W(this, true, new t9g0(n5aVar)), (byte) 2));
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        if (objP != wneVar) {
            objP = Unit.f46060a;
        }
        return objP == wneVar ? objP : Unit.f46060a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public void p(Object obj) {
        o(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public final Object q(yje yjeVar) {
        Object objH;
        do {
            objH = H();
            if (!(objH instanceof u4x)) {
                if (objH instanceof udd) {
                    throw ((udd) objH).f35472a;
                }
                return qby.a(objH);
            }
        } while (W(objH) < 0);
        gby gbyVar = new gby(pnx.b(yjeVar), this);
        gbyVar.r();
        gbyVar.u(new b5a(zvw.W(this, true, new s9g0(gbyVar)), (byte) 2));
        Object objP = gbyVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb A[LOOP:2: B:56:0x00b2->B:63:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean r(Object obj) {
        pby pbyVar;
        Throwable thZ;
        Object objH;
        Throwable thB;
        pfw pfwVar;
        Object objZ;
        u4x u4xVar;
        u460 u460VarG;
        iby ibyVar;
        Unsafe unsafe;
        long j;
        Object objZ2 = qby.f28461a;
        if (F()) {
            do {
                Object objH2 = H();
                if (!(objH2 instanceof u4x) || ((objH2 instanceof iby) && ((iby) objH2).e())) {
                    objZ2 = qby.f28461a;
                    break;
                }
                objZ2 = Z(objH2, new udd(z(obj), false));
            } while (objZ2 == qby.c);
            if (objZ2 != qby.b) {
                if (objZ2 == qby.f28461a) {
                    thZ = null;
                    loop1: while (true) {
                        objH = this.H();
                        if (objH instanceof iby) {
                            if (objH instanceof u4x) {
                                if (thZ == null) {
                                    thZ = this.z(obj);
                                }
                                u4xVar = (u4x) objH;
                                if (u4xVar.isActive()) {
                                    u460VarG = this.G(u4xVar);
                                    if (u460VarG == null) {
                                        pbyVar = this;
                                    } else {
                                        ibyVar = new iby(u460VarG, thZ);
                                        while (true) {
                                            unsafe = defpackage.a.f0a;
                                            j = b;
                                            pbyVar = this;
                                            if (unsafe.compareAndSwapObject(pbyVar, j, u4xVar, ibyVar)) {
                                                pbyVar.R(u460VarG, thZ);
                                                objZ = qby.f28461a;
                                            } else if (unsafe.getObjectVolatile(pbyVar, j) != u4xVar) {
                                                this = pbyVar;
                                            }
                                        }
                                    }
                                    this = pbyVar;
                                } else {
                                    pbyVar = this;
                                    objZ = pbyVar.Z(objH, new udd(thZ, false));
                                    if (objZ != qby.f28461a) {
                                        udk.e(objH, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objZ != qby.c) {
                                        this = pbyVar;
                                    }
                                }
                            } else {
                                pbyVar = this;
                                objZ = qby.d;
                            }
                            objZ2 = objZ;
                            break;
                        }
                        synchronized (objH) {
                            if (defpackage.a.f0a.getObjectVolatile((iby) objH, iby.b) == qby.e) {
                                pfwVar = qby.d;
                            } else {
                                boolean zD = ((iby) objH).d();
                                if (obj == null || !zD) {
                                    if (thZ == null) {
                                        thZ = this.z(obj);
                                    }
                                    ((iby) objH).a(thZ);
                                }
                                thB = zD ? null : ((iby) objH).b();
                                if (thB != null) {
                                    this.R(((iby) objH).f14512a, thB);
                                }
                                pfwVar = qby.f28461a;
                            }
                        }
                        pbyVar = this;
                        objZ2 = pfwVar;
                        break;
                    }
                }
                pbyVar = this;
                if (objZ2 != qby.f28461a && objZ2 != qby.b) {
                    if (objZ2 == qby.d) {
                        return false;
                    }
                    pbyVar.o(objZ2);
                    return true;
                }
            }
        } else {
            if (objZ2 == qby.f28461a) {
                thZ = null;
                loop1: while (true) {
                    objH = this.H();
                    if (objH instanceof iby) {
                        if (objH instanceof u4x) {
                            if (thZ == null) {
                                thZ = this.z(obj);
                            }
                            u4xVar = (u4x) objH;
                            if (u4xVar.isActive()) {
                                u460VarG = this.G(u4xVar);
                                if (u460VarG == null) {
                                    pbyVar = this;
                                } else {
                                    ibyVar = new iby(u460VarG, thZ);
                                    while (true) {
                                        unsafe = defpackage.a.f0a;
                                        j = b;
                                        pbyVar = this;
                                        if (unsafe.compareAndSwapObject(pbyVar, j, u4xVar, ibyVar)) {
                                            pbyVar.R(u460VarG, thZ);
                                            objZ = qby.f28461a;
                                        } else if (unsafe.getObjectVolatile(pbyVar, j) != u4xVar) {
                                            this = pbyVar;
                                        }
                                    }
                                }
                                this = pbyVar;
                            } else {
                                pbyVar = this;
                                objZ = pbyVar.Z(objH, new udd(thZ, false));
                                if (objZ != qby.f28461a) {
                                    udk.e(objH, "Cannot happen in ");
                                    return false;
                                }
                                if (objZ != qby.c) {
                                    this = pbyVar;
                                }
                            }
                        } else {
                            pbyVar = this;
                            objZ = qby.d;
                        }
                        objZ2 = objZ;
                        break;
                    }
                    synchronized (objH) {
                        if (defpackage.a.f0a.getObjectVolatile((iby) objH, iby.b) == qby.e) {
                            pfwVar = qby.d;
                        } else {
                            boolean zD2 = ((iby) objH).d();
                            if (obj == null) {
                                if (thZ == null) {
                                    thZ = this.z(obj);
                                }
                                ((iby) objH).a(thZ);
                            } else {
                                if (thZ == null) {
                                    thZ = this.z(obj);
                                }
                                ((iby) objH).a(thZ);
                            }
                            if (zD2) {
                            }
                            if (thB != null) {
                                this.R(((iby) objH).f14512a, thB);
                            }
                            pfwVar = qby.f28461a;
                        }
                        pbyVar = this;
                        objZ2 = pfwVar;
                        break;
                    }
                }
            }
            pbyVar = this;
            if (objZ2 != qby.f28461a) {
                if (objZ2 == qby.d) {
                    return false;
                }
                pbyVar.o(objZ2);
                return true;
            }
        }
        return true;
    }

    public void s(Throwable th) {
        r(th);
    }

    @Override // a.bby
    public final boolean start() {
        int iW;
        do {
            iW = W(H());
            if (iW == 0) {
                return false;
            }
        } while (iW != 1);
        return true;
    }

    public final boolean t(Throwable th) {
        if (M()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        fac facVar = (fac) defpackage.a.f0a.getObjectVolatile(this, f26732a);
        if (facVar == null || facVar == a660.f303a) {
            return z;
        }
        return facVar.b(th) || z;
    }

    public final String toString() {
        return (P() + '{' + X(H()) + '}') + '@' + qjj.R(this);
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean x(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return r(th) && D();
    }

    public final void y(u4x u4xVar, Object obj) {
        Unsafe unsafe = defpackage.a.f0a;
        long j = f26732a;
        fac facVar = (fac) unsafe.getObjectVolatile(this, j);
        if (facVar != null) {
            facVar.a();
            unsafe.putObjectVolatile(this, j, a660.f303a);
        }
        ss3 ss3Var = null;
        udd uddVar = obj instanceof udd ? (udd) obj : null;
        Throwable th = uddVar != null ? uddVar.f35472a : null;
        if (u4xVar instanceof eby) {
            try {
                ((eby) u4xVar).m(th);
                return;
            } catch (Throwable th2) {
                J(new ss3("Exception in completion handler " + u4xVar + " for " + this, th2));
                return;
            }
        }
        u460 u460VarC = u4xVar.c();
        if (u460VarC != null) {
            u460VarC.d(new wc00(1), 1);
            Object objG = u460VarC.g();
            objG.getClass();
            for (hu00 hu00VarH = (hu00) objG; !hu00VarH.equals(u460VarC); hu00VarH = hu00VarH.h()) {
                if (hu00VarH instanceof eby) {
                    try {
                        ((eby) hu00VarH).m(th);
                    } catch (Throwable th3) {
                        if (ss3Var != null) {
                            tjo.a(ss3Var, th3);
                        } else {
                            ss3Var = new ss3("Exception in completion handler " + hu00VarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (ss3Var != null) {
                J(ss3Var);
            }
        }
    }

    public final Throwable z(Object obj) {
        Throwable thB;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new cby(u(), null, this) : th;
        }
        obj.getClass();
        pby pbyVar = (pby) ((gp80) obj);
        Object objH = pbyVar.H();
        if (objH instanceof iby) {
            thB = ((iby) objH).b();
        } else if (objH instanceof udd) {
            thB = ((udd) objH).f35472a;
        } else {
            if (objH instanceof u4x) {
                udk.e(objH, "Cannot be cancelling child in this state: ");
                return null;
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new cby("Parent job is ".concat(X(objH)), thB, pbyVar) : cancellationException;
    }

    @Override // a.bby
    public final nwk invokeOnCompletion(Function1 function1) {
        return L(true, new sox(function1));
    }

    public void T() {
    }

    public void J(ss3 ss3Var) {
        throw ss3Var;
    }

    public void S(Object obj) {
    }

    public void o(Object obj) {
    }
}
