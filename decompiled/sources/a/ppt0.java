package a;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ppt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1a f27386a;
    public final wy9 b;
    public final ehf0 c;
    public final f4w0 d;
    public final ge10 e;
    public final r2a f;
    public final o5d0 g;
    public final o5d0 h;
    public final l4a i;
    public final yz9 j;
    public final Object k;
    public final LinkedHashSet l;
    public final LinkedHashSet m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final LinkedHashSet q;
    public final ae40 r;
    public final hln0 s;
    public final cgx0 t;
    public final npt0 u;
    public volatile qv2 v;
    public final ArrayList w;
    public final LinkedHashSet x;

    public ppt0(m1a m1aVar, wy9 wy9Var, ehf0 ehf0Var, f4w0 f4w0Var, ge10 ge10Var, Set set, bw9 bw9Var, r2a r2aVar, w1k w1kVar, o5d0 o5d0Var, o5d0 o5d0Var2, ewn ewnVar, l1a l1aVar, l4a l4aVar, yz9 yz9Var, Context context, xvk xvkVar) {
        wy9Var.getClass();
        f4w0Var.getClass();
        ge10Var.getClass();
        set.getClass();
        bw9Var.getClass();
        r2aVar.getClass();
        w1kVar.getClass();
        o5d0Var.getClass();
        o5d0Var2.getClass();
        ewnVar.getClass();
        l1aVar.getClass();
        yz9Var.getClass();
        context.getClass();
        this.f27386a = m1aVar;
        this.b = wy9Var;
        this.c = ehf0Var;
        this.d = f4w0Var;
        this.e = ge10Var;
        this.f = r2aVar;
        this.g = w1kVar;
        this.h = o5d0Var2;
        this.i = l4aVar;
        this.j = yz9Var;
        this.k = new Object();
        this.l = new LinkedHashSet();
        this.m = new LinkedHashSet();
        this.o = true;
        this.p = true;
        this.q = new LinkedHashSet();
        this.r = new ae40(l1aVar, new zd40(), xvkVar);
        c1a c1aVar = l1aVar.b;
        this.s = new hln0(context, c1aVar, ewnVar, egp.g0);
        this.t = new cgx0(c1aVar);
        this.u = new npt0(this, (byte) 0);
        this.w = new ArrayList();
        LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(set);
        linkedHashSetO0.add(bw9Var);
        this.x = linkedHashSetO0;
    }

    public final boolean a(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.i.f19393a.e(l4a.l, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && i(linkedHashSet)) {
            b();
            return true;
        }
        if (!linkedHashSet.contains(this.r) || i(linkedHashSet)) {
            return false;
        }
        ae40 ae40Var = this.r;
        ae40Var.getClass();
        synchronized (this.k) {
            if (this.m.remove(ae40Var)) {
                k();
            }
        }
        f(kotlin.collections.a.c(ae40Var));
        ae40Var.D((s0a) this.g.get());
        return true;
    }

    public final void b() {
        ae40 ae40Var = this.r;
        ae40Var.b((s0a) this.g.get(), null, null, null);
        ae40Var.I();
        c(kotlin.collections.a.c(ae40Var));
        synchronized (this.k) {
            if (this.m.add(ae40Var)) {
                k();
            }
        }
    }

    public final void c(List list) {
        list.getClass();
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (l8x.j0()) {
                    Log.w("CXCP", "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "Attaching " + list + " from " + this);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.l.contains((fot0) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fot0) it.next()).w();
            }
            if (this.l.addAll(list) && !a(CollectionsKt.Z(this.l, this.m))) {
                m();
                this.e.a(CollectionsKt.L0(this.l));
                j(this.l);
            }
            if (this.o) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((fot0) it2.next()).u();
                }
            } else {
                this.q.addAll(arrayList);
            }
        }
    }

    public final Object d(bnn0 bnn0Var) {
        List listL0;
        synchronized (this.k) {
            e();
            this.r.A();
            listL0 = CollectionsKt.L0(this.w);
        }
        Object objT = qjj.T(listL0, bnn0Var);
        return objT == wne.f39444a ? objT : Unit.f46060a;
    }

    public final void e() {
        bby bbyVarJ;
        mot0 mot0VarG = g();
        this.v = null;
        wy9 wy9Var = this.b;
        j0a j0aVar = (j0a) this.h.get();
        wy9Var.getClass();
        j0aVar.getClass();
        synchronized (wy9Var.b) {
            try {
                if (wy9Var.g) {
                    ArrayList arrayList = wy9Var.e;
                    c1a c1aVar = (c1a) ay3.g0(j0aVar, sre0.f32672a.b(c1a.class));
                    String str = c1aVar != null ? ((ow9) c1aVar).f25959a : null;
                    g0a g0aVar = str != null ? new g0a(str) : null;
                    if (g0aVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.remove(g0aVar.f10449a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mot0VarG != null) {
            if (mot0VarG.h.a()) {
                mot0VarG.c.close();
                bbyVarJ = qjj.W(mot0VarG.b.f, null, null, new lot0(null, mot0VarG), 3);
            } else {
                bbyVarJ = ozb.j(Unit.f46060a);
            }
            this.w.add(bbyVarJ);
            bbyVarJ.invokeOnCompletion(new xis0((Object) this, (Object) bbyVarJ, (byte) 13));
        }
        synchronized (this.k) {
        }
    }

    public final void f(List list) {
        list.getClass();
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (l8x.j0()) {
                    Log.w("CXCP", "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "Detaching " + list + " from " + this);
            }
            this.m.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fot0 fot0Var = (fot0) it.next();
                if (this.l.contains(fot0Var)) {
                    fot0Var.x();
                }
            }
            if (this.l.removeAll(list)) {
                if (a(CollectionsKt.Z(this.l, this.m))) {
                    return;
                }
                if (this.l.isEmpty()) {
                    this.d.e(false);
                    this.e.a(iun.f15405a);
                } else {
                    m();
                    this.e.a(CollectionsKt.L0(this.l));
                }
                j(this.l);
            }
            this.q.removeAll(list);
        }
    }

    public final mot0 g() {
        qv2 qv2Var = this.v;
        if (qv2Var != null) {
            return (mot0) ((n5d0) qv2Var.n).get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int h() {
        boolean z;
        synchronized (this.k) {
            wy9 wy9Var = this.b;
            synchronized (wy9Var.b) {
                z = wy9Var.f;
            }
            return z == 2 ? 1 : 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    public final boolean i(LinkedHashSet linkedHashSet) {
        boolean z;
        hln0 hln0Var;
        boolean z2;
        ?? r21;
        int i;
        fpt0 fpt0Var;
        ?? r0;
        List listC;
        if (((Boolean) this.i.f19393a.e(l4a.l, Boolean.TRUE)).booleanValue() && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                fot0 fot0Var = (fot0) it.next();
                ae40 ae40Var = this.r;
                if (!Intrinsics.d(fot0Var, ae40Var)) {
                    List listB = fot0Var.p.b();
                    listB.getClass();
                    if (!listB.isEmpty()) {
                        ArrayList<fot0> arrayList = new ArrayList();
                        for (Object obj : this.l) {
                            if (!Intrinsics.d((fot0) obj, ae40Var)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                            wii0 wii0Var = new wii0();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                wii0Var.a(((fot0) it2.next()).p);
                            }
                            xii0 xii0VarB = wii0Var.b();
                            List listUnmodifiableList = Collections.unmodifiableList(xii0VarB.g.f33457a);
                            listUnmodifiableList.getClass();
                            List listB2 = xii0VarB.b();
                            listB2.getClass();
                            if (!listB2.isEmpty()) {
                                if (listB2.isEmpty()) {
                                    z = true;
                                    break;
                                }
                                Iterator it3 = listB2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z = true;
                                        break;
                                    }
                                    if (!Intrinsics.d(((hzj) it3.next()).j, MediaCodec.class)) {
                                        z = false;
                                        break;
                                    }
                                }
                                boolean zIsEmpty = listUnmodifiableList.isEmpty();
                                if (!z && !zIsEmpty) {
                                    break;
                                }
                                if (ae40Var.c() == null) {
                                    ae40Var.I();
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    boolean zHasNext = it4.hasNext();
                                    hln0Var = this.s;
                                    if (!zHasNext) {
                                        z2 = true;
                                        r21 = 0;
                                        break;
                                    }
                                    fot0 fot0Var2 = (fot0) it4.next();
                                    Size sizeC = fot0Var2.c();
                                    h55 h55Var = fot0Var2.j;
                                    if (sizeC == null || h55Var == null) {
                                        z2 = true;
                                        r21 = 0;
                                        if (l8x.j0()) {
                                            Log.w("CXCP", "Invalid surface resolution or stream spec is found.");
                                        }
                                        arrayList2.clear();
                                        break;
                                    }
                                    wln0 wln0VarQ = hln0Var.q(h(), fot0Var2.i.k(), sizeC, fot0Var2.i.u());
                                    int iK = fot0Var2.i.k();
                                    agn agnVar = h55Var.c;
                                    if (fot0Var2 instanceof qrm0) {
                                        fpt0 fpt0Var2 = ((qrm0) fot0Var2).i;
                                        fpt0Var2.getClass();
                                        listC = (List) ((rrm0) fpt0Var2).d(rrm0.b);
                                        listC.getClass();
                                    } else {
                                        listC = kotlin.collections.a.c(fot0Var2.i.v());
                                    }
                                    List list = listC;
                                    drd drdVarL = h55Var.f;
                                    if (drdVarL == null) {
                                        drdVarL = wy40.l();
                                    }
                                    drd drdVar = drdVarL;
                                    int i2 = h55Var.d;
                                    Range range = h55Var.e;
                                    Boolean bool = (Boolean) fot0Var2.i.e(fpt0.J0, Boolean.FALSE);
                                    Objects.requireNonNull(bool);
                                    arrayList2.add(new l15(wln0VarQ, iK, sizeC, agnVar, list, drdVar, i2, range, bool.booleanValue(), fot0Var2.i.w(sizeC)));
                                }
                                if (arrayList2.isEmpty()) {
                                    r0 = r21;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (fot0 fot0Var3 : arrayList) {
                                        List<hzj> listB3 = fot0Var3.p.b();
                                        listB3.getClass();
                                        for (hzj hzjVar : listB3) {
                                            int iH = h();
                                            int iK2 = fot0Var3.i.k();
                                            Size size = hzjVar.h;
                                            size.getClass();
                                            arrayList3.add(hln0Var.q(iH, iK2, size, fot0Var3.i.u()));
                                        }
                                    }
                                    int iH2 = h();
                                    Iterator it5 = this.t.t(arrayList2, kotlin.collections.a.c(ae40Var.i), kotlin.collections.a.c(Integer.valueOf((int) r21))).entrySet().iterator();
                                    do {
                                        if (!it5.hasNext()) {
                                            i = 8;
                                            break;
                                        }
                                        i = 10;
                                    } while (((agn) ((Map.Entry) it5.next()).getValue()).b != 10);
                                    int i3 = i;
                                    boolean zT = qsm0.t(arrayList);
                                    rfu0 rfu0VarU = qsm0.u(arrayList, new qzs0((byte) 7));
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj2 : arrayList) {
                                        if (obj2 instanceof mzw) {
                                            arrayList4.add(obj2);
                                        }
                                    }
                                    mzw mzwVar = (mzw) CollectionsKt.firstOrNull(arrayList4);
                                    ?? r27 = (mzwVar == null || (fpt0Var = mzwVar.i) == null || fpt0Var.k() != 4101) ? r21 : z2;
                                    Range range2 = h55.h;
                                    range2.getClass();
                                    gln0 gln0Var = new gln0(iH2, i3, zT, rfu0VarU, r27, false, false, false, range2, false);
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList3);
                                    int iH3 = h();
                                    int iK3 = ae40Var.i.k();
                                    Size sizeC2 = ae40Var.c();
                                    sizeC2.getClass();
                                    arrayList5.add(hln0Var.q(iH3, iK3, sizeC2, ae40Var.i.u()));
                                    boolean zB = hln0.b(hln0Var, gln0Var, arrayList5);
                                    r0 = zB;
                                    if (l8x.f0("CXCP")) {
                                        Log.d("CXCP", "Combination of " + arrayList3 + " + " + ae40Var + " is supported: " + zB);
                                        r0 = zB;
                                    }
                                }
                                return r0 != 0 ? z2 : r21;
                            }
                            break;
                        }
                        break;
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final void j(LinkedHashSet linkedHashSet) {
        e();
        List listL0 = CollectionsKt.L0(linkedHashSet);
        if (listL0.isEmpty()) {
            for (jot0 jot0Var : this.x) {
                jot0Var.b(null);
                jot0Var.reset();
            }
            return;
        }
        if (!this.o) {
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                ((jot0) it.next()).b(null);
            }
        }
        sev sevVar = new sev(this.f);
        synchronized (this.k) {
        }
        zii0 zii0Var = new zii0(listL0, this.p);
        yz9 yz9Var = this.j;
        npt0 npt0Var = this.u;
        synchronized (this.k) {
        }
        yz9Var.getClass();
        npt0Var.getClass();
        iot0 iot0Var = new iot0(npt0Var, sevVar, zii0Var, maz.b(new hot0(zii0Var, yz9Var, sevVar, (byte) 0)));
        if (!this.o) {
            wy9 wy9Var = this.b;
            j0a j0aVar = (j0a) this.h.get();
            wy9Var.getClass();
            j0aVar.getClass();
            synchronized (wy9Var.b) {
                try {
                    if (wy9Var.g) {
                        ArrayList arrayList = wy9Var.e;
                        c1a c1aVar = (c1a) ay3.g0(j0aVar, sre0.f32672a.b(c1a.class));
                        String str = c1aVar != null ? ((ow9) c1aVar).f25959a : null;
                        g0a g0aVar = str != null ? new g0a(str) : null;
                        if (g0aVar == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(g0aVar.f10449a);
                        synchronized (wy9Var.b) {
                            wy9Var.d.getClass();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ehf0 ehf0Var = this.c;
        this.v = new qv2((cbi) ehf0Var.b, (dbi) ehf0Var.c, iot0Var);
        mot0 mot0VarG = g();
        if (mot0VarG == null) {
            jf4.n("Required value was null.");
            return;
        }
        qjj.W(mot0VarG.b.f, null, null, new wup0(null, mot0VarG), 3);
        Iterator it2 = this.x.iterator();
        while (it2.hasNext()) {
            ((jot0) it2.next()).b(mot0VarG.c);
        }
        qjj.W(mot0VarG.b.f, null, null, new lot0(null, mot0VarG, this.n), 3);
        l(CollectionsKt.Z(this.l, this.m));
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "Notifying " + this.q + " camera control ready");
        }
        Iterator it3 = this.q.iterator();
        while (it3.hasNext()) {
            ((fot0) it3.next()).u();
        }
        this.q.clear();
    }

    public final void k() {
        if (this.l.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSetZ = CollectionsKt.Z(this.l, this.m);
        if (((Boolean) this.i.f19393a.e(l4a.l, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && i(linkedHashSetZ)) {
            b();
            return;
        }
        if (!linkedHashSetZ.contains(this.r) || i(linkedHashSetZ)) {
            l(linkedHashSetZ);
            return;
        }
        ae40 ae40Var = this.r;
        ae40Var.getClass();
        synchronized (this.k) {
            if (this.m.remove(ae40Var)) {
                k();
            }
        }
        f(kotlin.collections.a.c(ae40Var));
        ae40Var.D((s0a) this.g.get());
    }

    public final void l(LinkedHashSet linkedHashSet) {
        mot0 mot0VarG = g();
        if (mot0VarG != null) {
            mot0VarG.c.b(linkedHashSet, this.p);
            for (jot0 jot0Var : this.x) {
                if (jot0Var instanceof opt0) {
                    ((opt0) jot0Var).a(linkedHashSet);
                }
            }
        }
    }

    public final void m() {
        boolean z = false;
        LinkedHashSet linkedHashSet = this.l;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((fot0) it.next()).i.e(fpt0.L0, Boolean.FALSE)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        this.d.e(z);
    }

    public final String toString() {
        return "UseCaseManager<" + this.j + '>';
    }
}
