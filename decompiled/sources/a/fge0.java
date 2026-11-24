package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fge0 extends nld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o39 f9488a;
    public final y3v b;
    public final Object c;
    public bby d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public iz40 h;
    public final xz40 i;
    public final ArrayList j;
    public final ArrayList k;
    public final hz40 l;
    public final dq00 m;
    public final hz40 n;
    public final hz40 o;
    public ArrayList p;
    public iz40 q;
    public n5a r;
    public final p7m0 s;
    public boolean t;
    public final p7m0 u;
    public final nvu v;
    public final dby w;
    public final CoroutineContext x;
    public final cge0 y;
    public static final p7m0 z = q7m0.a(ci90.e);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public fge0(CoroutineContext coroutineContext) {
        o39 o39Var = new o39(new age0(this, (byte) 0));
        this.f9488a = o39Var;
        this.b = new y3v(new age0(this, (byte) 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new iz40();
        this.i = new xz40(new tld[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new hz40();
        this.m = new dq00((byte) 8);
        this.n = new hz40();
        this.o = new hz40();
        this.s = q7m0.a(null);
        this.u = q7m0.a(dge0.c);
        this.v = new nvu((byte) 20);
        dby dbyVar = new dby((bby) coroutineContext.get(gqw0.o1));
        dbyVar.invokeOnCompletion(new v6d0(this, (byte) 23));
        this.w = dbyVar;
        this.x = coroutineContext.plus(o39Var).plus(dbyVar);
        this.y = new cge0((byte) 0);
    }

    public static final void B(fge0 fge0Var, mu40 mu40Var, mu40 mu40Var2) {
        List list = mu40Var2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mu40 mu40Var3 = (mu40) list.get(i);
                dq00 dq00Var = fge0Var.m;
                ju40 ju40Var = mu40Var3.f22397a;
                fx40.a((hz40) dq00Var.b, ju40Var, new sj50(mu40Var3, mu40Var));
                fx40.a((hz40) dq00Var.c, mu40Var, ju40Var);
                B(fge0Var, mu40Var, mu40Var3);
            }
        }
    }

    public static final void K(ArrayList arrayList, fge0 fge0Var, tld tldVar) {
        arrayList.clear();
        synchronized (fge0Var.c) {
            Iterator it = fge0Var.k.iterator();
            while (it.hasNext()) {
                mu40 mu40Var = (mu40) it.next();
                if (mu40Var.c.equals(tldVar)) {
                    arrayList.add(mu40Var);
                    it.remove();
                }
            }
        }
    }

    public static void z(nz40 nz40Var) {
        try {
            if (nz40Var.w() instanceof sfk0) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            nz40Var.c();
        } catch (Throwable th) {
            nz40Var.c();
            throw th;
        }
    }

    public final void A() {
        synchronized (this.c) {
            if (((dge0) this.u.getValue()).compareTo(dge0.e) >= 0) {
                p7m0 p7m0Var = this.u;
                dge0 dge0Var = dge0.b;
                p7m0Var.getClass();
                p7m0Var.o(null, dge0Var);
            }
        }
        this.w.cancel(null);
    }

    public final m5a C() {
        dge0 dge0Var;
        p7m0 p7m0Var = this.u;
        int iCompareTo = ((dge0) p7m0Var.getValue()).compareTo(dge0.b);
        p7m0 p7m0Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        xz40 xz40Var = this.i;
        if (iCompareTo > 0) {
            if (p7m0Var2.getValue() != null) {
                dge0Var = dge0.c;
            } else if (this.d == null) {
                this.h = new iz40();
                xz40Var.g();
                dge0Var = (D() || F()) ? dge0.d : dge0.c;
            } else {
                dge0Var = (xz40Var.c != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.l.j()) ? dge0.f : dge0.e;
            }
            p7m0Var.getClass();
            p7m0Var.o(null, dge0Var);
            if (dge0Var != dge0.f) {
                return null;
            }
            n5a n5aVar = this.r;
            this.r = null;
            return n5aVar;
        }
        List listH = H();
        int size = listH.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = iun.f15405a;
        this.h = new iz40();
        xz40Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        n5a n5aVar2 = this.r;
        if (n5aVar2 != null) {
            n5aVar2.h(null);
        }
        this.r = null;
        p7m0Var2.n(null);
        return null;
    }

    public final boolean D() {
        return !this.t && (((a14) this.f9488a.b.c).get() & 134217727) > 0;
    }

    public final boolean E() {
        return this.i.c != 0 || D() || F() || this.l.j();
    }

    public final boolean F() {
        return !this.t && (((a14) ((gr00) this.b.c).c).get() & 134217727) > 0;
    }

    public final boolean G() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.c != 0 || D() || F();
        }
        return z2;
    }

    public final List H() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? iun.f15405a : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void I() {
        m5a m5aVarC;
        synchronized (this.c) {
            m5aVarC = C();
            if (((dge0) this.u.getValue()).compareTo(dge0.b) <= 0) {
                throw plc.b("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (m5aVarC != null) {
            e0g0 e0g0Var = j0g0.b;
            ((n5a) m5aVarC).resumeWith(Unit.f46060a);
        }
    }

    public final void J(tld tldVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((mu40) arrayList.get(i)).c.equals(tldVar)) {
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, tldVar);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, tldVar);
                    }
                    return;
                }
            }
        }
    }

    public final List L(List list, iz40 iz40Var) {
        nz40 nz40VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            tld tldVar = ((mu40) obj).c;
            Object arrayList2 = map.get(tldVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(tldVar, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            tld tldVar2 = (tld) entry.getKey();
            List list2 = (List) entry.getValue();
            if (tldVar2.v.F) {
                ykd.a("Check failed");
            }
            v6d0 v6d0Var = new v6d0(tldVar2, (byte) 22);
            oac0 oac0Var = new oac0(tldVar2, iz40Var, (byte) 23);
            rfk0 rfk0VarH = xfk0.h();
            nz40 nz40Var = rfk0VarH instanceof nz40 ? (nz40) rfk0VarH : null;
            if (nz40Var == null || (nz40VarC = nz40Var.C(v6d0Var, oac0Var)) == null) {
                jf4.n("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                rfk0 rfk0VarJ = nz40VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                mu40 mu40Var = (mu40) list2.get(i2);
                                Object objB = fx40.b(this.l, mu40Var.f22397a);
                                mu40 mu40Var2 = (mu40) objB;
                                if (mu40Var2 != null) {
                                    this.m.n(mu40Var2);
                                }
                                arrayList.add(new Pair(mu40Var, objB));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.b == null) {
                                    if (((hz40) this.m.b).b(((mu40) pair.f46059a).f22397a)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            Pair pair2 = (Pair) arrayList.get(i4);
                                            if (pair2.b == null) {
                                                dq00 dq00Var = this.m;
                                                ju40 ju40Var = ((mu40) pair2.f46059a).f22397a;
                                                hz40 hz40Var = (hz40) dq00Var.b;
                                                sj50 sj50Var = (sj50) fx40.b(hz40Var, ju40Var);
                                                if (hz40Var.i()) {
                                                    ((hz40) dq00Var.c).a();
                                                }
                                                if (sj50Var != null) {
                                                    mu40 mu40Var3 = sj50Var.f32291a;
                                                    fx40.a(this.o, sj50Var.b, mu40Var3);
                                                    pair2 = new Pair(pair2.f46059a, mu40Var3);
                                                }
                                            }
                                            arrayList3.add(pair2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((Pair) arrayList.get(i5)).b != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((Pair) arrayList.get(i6)).b == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        Pair pair3 = (Pair) arrayList.get(i7);
                                        mu40 mu40Var4 = pair3.b == null ? (mu40) pair3.f46059a : null;
                                        if (mu40Var4 != null) {
                                            arrayList4.add(mu40Var4);
                                        }
                                    }
                                    synchronized (this.c) {
                                        w3d.u(this.k, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((Pair) obj2).b != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    tldVar2.w(arrayList);
                    rfk0.q(rfk0VarJ);
                    z(nz40VarC);
                } catch (Throwable th2) {
                    rfk0.q(rfk0VarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                z(nz40VarC);
                throw th3;
            }
        }
        return CollectionsKt.L0(map.keySet());
    }

    public final tld M(tld tldVar, iz40 iz40Var) {
        iz40 iz40Var2;
        nz40 nz40VarC;
        if (!tldVar.v.F && !tldVar.c() && ((iz40Var2 = this.q) == null || !iz40Var2.c(tldVar))) {
            v6d0 v6d0Var = new v6d0(tldVar, (byte) 22);
            oac0 oac0Var = new oac0(tldVar, iz40Var, (byte) 23);
            rfk0 rfk0VarH = xfk0.h();
            nz40 nz40Var = rfk0VarH instanceof nz40 ? (nz40) rfk0VarH : null;
            if (nz40Var == null || (nz40VarC = nz40Var.C(v6d0Var, oac0Var)) == null) {
                jf4.n("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    rfk0 rfk0VarJ = nz40VarC.j();
                    if (iz40Var != null) {
                        try {
                            if (iz40Var.h()) {
                                gvb0 gvb0Var = new gvb0(iz40Var, tldVar, (byte) 16);
                                fet fetVar = tldVar.v;
                                if (fetVar.F) {
                                    ykd.a("Preparing a composition while composing is not supported");
                                }
                                fetVar.F = true;
                                try {
                                    gvb0Var.invoke();
                                    fetVar.F = false;
                                } catch (Throwable th) {
                                    fetVar.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            rfk0.q(rfk0VarJ);
                            throw th2;
                        }
                    }
                    boolean zA = tldVar.A();
                    rfk0.q(rfk0VarJ);
                    z(nz40VarC);
                    if (zA) {
                        return tldVar;
                    }
                } catch (Throwable th3) {
                    z(nz40VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public final void N(Throwable th, tld tldVar) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof dkd)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                bge0 bge0Var = (bge0) this.s.getValue();
                if (bge0Var != null) {
                    throw bge0Var.f2551a;
                }
                p7m0 p7m0Var = this.s;
                bge0 bge0Var2 = new bge0(th);
                p7m0Var.getClass();
                p7m0Var.o(null, bge0Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new iz40();
                this.k.clear();
                this.l.a();
                this.n.a();
                p7m0 p7m0Var2 = this.s;
                bge0 bge0Var3 = new bge0(th);
                p7m0Var2.getClass();
                p7m0Var2.o(null, bge0Var3);
                if (tldVar != null) {
                    P(tldVar);
                }
                if (C() != null) {
                    ykd.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean O() {
        boolean zE;
        synchronized (this.c) {
            if (this.h.g()) {
                return E();
            }
            List listH = H();
            w1h0 w1h0Var = new w1h0(this.h);
            this.h = new iz40();
            try {
                int size = listH.size();
                for (int i = 0; i < size; i++) {
                    ((tld) listH.get(i)).B(w1h0Var);
                    if (((dge0) this.u.getValue()).compareTo(dge0.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zE = E();
                }
                return zE;
            } catch (Throwable th) {
                synchronized (this.c) {
                    iz40 iz40Var = this.h;
                    iz40Var.getClass();
                    Iterator<E> it = w1h0Var.iterator();
                    while (it.hasNext()) {
                        iz40Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void P(tld tldVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(tldVar)) {
            arrayList.add(tldVar);
        }
        if (this.f.remove(tldVar)) {
            this.g = null;
        }
    }

    @Override // a.nld
    public final void a(tld tldVar, Function2 function2) throws Throwable {
        dge0 dge0Var;
        boolean zContains;
        nz40 nz40VarC;
        boolean z2 = tldVar.v.F;
        synchronized (this.c) {
            dge0 dge0Var2 = (dge0) this.u.getValue();
            dge0Var = dge0.b;
            zContains = dge0Var2.compareTo(dge0Var) > 0 ? true ^ H().contains(tldVar) : true;
        }
        try {
            v6d0 v6d0Var = new v6d0(tldVar, (byte) 22);
            oac0 oac0Var = new oac0(tldVar, null, (byte) 23);
            rfk0 rfk0VarH = xfk0.h();
            nz40 nz40Var = rfk0VarH instanceof nz40 ? (nz40) rfk0VarH : null;
            if (nz40Var == null || (nz40VarC = nz40Var.C(v6d0Var, oac0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                rfk0 rfk0VarJ = nz40VarC.j();
                try {
                    tldVar.p(function2);
                    rfk0.q(rfk0VarJ);
                    z(nz40VarC);
                    synchronized (this.c) {
                        if (((dge0) this.u.getValue()).compareTo(dge0Var) > 0 && !H().contains(tldVar)) {
                            this.f.add(tldVar);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        xfk0.h().m();
                    }
                    try {
                        J(tldVar);
                        try {
                            tldVar.j();
                            tldVar.l();
                            if (z2) {
                                return;
                            }
                            xfk0.h().m();
                        } catch (Throwable th) {
                            N(th, null);
                        }
                    } catch (Throwable th2) {
                        N(th2, tldVar);
                    }
                } catch (Throwable th3) {
                    rfk0.q(rfk0VarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                z(nz40VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            N(th5, tldVar);
        }
    }

    @Override // a.nld
    public final iz40 b(tld tldVar, isj0 isj0Var, Function2 function2) {
        nvu nvuVar = this.v;
        try {
            isj0 isj0Var2 = tldVar.p;
            tldVar.p = isj0Var;
            try {
                a(tldVar, function2);
                iz40 iz40Var = (iz40) nvuVar.w();
                if (iz40Var == null) {
                    iz40Var = v1h0.f36630a;
                    iz40Var.getClass();
                }
                tldVar.p = isj0Var2;
                nvuVar.P(null);
                return iz40Var;
            } catch (Throwable th) {
                tldVar.p = isj0Var2;
                throw th;
            }
        } catch (Throwable th2) {
            nvuVar.P(null);
            throw th2;
        }
    }

    @Override // a.nld
    public final void c(mu40 mu40Var) {
        m5a m5aVarC;
        synchronized (this.c) {
            try {
                fx40.a(this.l, mu40Var.f22397a, mu40Var);
                if (mu40Var.h != null) {
                    B(this, mu40Var, mu40Var);
                }
                m5aVarC = C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m5aVarC != null) {
            e0g0 e0g0Var = j0g0.b;
            ((n5a) m5aVarC).resumeWith(Unit.f46060a);
        }
    }

    @Override // a.nld
    public final CoroutineContext k() {
        return this.x;
    }

    @Override // a.nld
    public final void m(mu40 mu40Var) {
        m5a m5aVarC;
        synchronized (this.c) {
            this.k.add(mu40Var);
            m5aVarC = C();
        }
        if (m5aVarC != null) {
            e0g0 e0g0Var = j0g0.b;
            ((n5a) m5aVarC).resumeWith(Unit.f46060a);
        }
    }

    @Override // a.nld
    public final void n(tld tldVar) {
        m5a m5aVarC;
        synchronized (this.c) {
            if (this.i.h(tldVar)) {
                m5aVarC = null;
            } else {
                this.i.b(tldVar);
                m5aVarC = C();
            }
        }
        if (m5aVarC != null) {
            e0g0 e0g0Var = j0g0.b;
            ((n5a) m5aVarC).resumeWith(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x008a A[LOOP:0: B:16:0x004a->B:29:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[EDGE_INSN: B:37:0x008d->B:30:0x008d BREAK  A[LOOP:0: B:16:0x004a->B:29:0x008a], SYNTHETIC] */
    @Override // a.nld
    public final void o(mu40 mu40Var, lu40 lu40Var, bv3 bv3Var) {
        vy40 vy40Var;
        synchronized (this.c) {
            this.n.n(mu40Var, lu40Var);
            Object objG = this.o.g(mu40Var);
            if (objG == null) {
                vy40Var = w960.b;
                vy40Var.getClass();
            } else if (objG instanceof vy40) {
                vy40Var = (vy40) objG;
            } else {
                Object[] objArr = w960.f38764a;
                vy40 vy40Var2 = new vy40(1);
                vy40Var2.a(objG);
                vy40Var = vy40Var2;
            }
            if (vy40Var.j()) {
                hz40 hz40VarE = lu40Var.f20657a.e(bv3Var, vy40Var);
                Object[] objArr2 = hz40VarE.b;
                Object[] objArr3 = hz40VarE.c;
                long[] jArr = hz40VarE.f13891a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr2[i4];
                                    this.n.n((mu40) obj, (lu40) objArr3[i4]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // a.nld
    public final lu40 p(mu40 mu40Var) {
        lu40 lu40Var;
        synchronized (this.c) {
            lu40Var = (lu40) this.n.l(mu40Var);
        }
        return lu40Var;
    }

    @Override // a.nld
    public final iz40 q(tld tldVar, isj0 isj0Var, iz40 iz40Var) {
        nvu nvuVar = this.v;
        try {
            O();
            tldVar.B(new w1h0(iz40Var));
            isj0 isj0Var2 = tldVar.p;
            tldVar.p = isj0Var;
            try {
                tld tldVarM = M(tldVar, null);
                if (tldVarM != null) {
                    J(tldVar);
                    tldVarM.j();
                    tldVarM.l();
                }
                iz40 iz40Var2 = (iz40) nvuVar.w();
                if (iz40Var2 == null) {
                    iz40Var2 = v1h0.f36630a;
                    iz40Var2.getClass();
                }
                tldVar.p = isj0Var2;
                nvuVar.P(null);
                return iz40Var2;
            } catch (Throwable th) {
                tldVar.p = isj0Var2;
                throw th;
            }
        } catch (Throwable th2) {
            nvuVar.P(null);
            throw th2;
        }
    }

    @Override // a.nld
    public final void t(yfe0 yfe0Var) {
        nvu nvuVar = this.v;
        iz40 iz40Var = (iz40) nvuVar.w();
        if (iz40Var == null) {
            iz40 iz40Var2 = v1h0.f36630a;
            iz40Var = new iz40();
            nvuVar.P(iz40Var);
        }
        iz40Var.a(yfe0Var);
    }

    @Override // a.nld
    public final void u(tld tldVar) {
        synchronized (this.c) {
            try {
                iz40 iz40Var = this.q;
                if (iz40Var == null) {
                    iz40 iz40Var2 = v1h0.f36630a;
                    iz40Var = new iz40();
                    this.q = iz40Var;
                }
                iz40Var.a(tldVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.nld
    public final s5a v(rcz rczVar) {
        y3v y3vVar = this.b;
        gr00 gr00Var = (gr00) y3vVar.c;
        hx50 hx50Var = new hx50();
        hx50Var.f13798a = rczVar;
        return gr00Var.f(hx50Var, (a540) y3vVar.d);
    }

    @Override // a.nld
    public final void y(tld tldVar) {
        synchronized (this.c) {
            if (this.f.remove(tldVar)) {
                this.g = null;
            }
            this.i.j(tldVar);
            this.j.remove(tldVar);
        }
    }
}
