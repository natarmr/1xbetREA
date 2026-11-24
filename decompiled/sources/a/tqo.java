package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tqo extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public final do20 A;
    public final jtj B;
    public final h3c C;
    public bby D;
    public bby E;
    public bby F;
    public final vzg0 o;
    public final i1w0 p;
    public final ouu q;
    public final pru r;
    public final nr s;
    public final yiu t;
    public final rou u;
    public final znt v;
    public final gbi w;
    public final qv2 x;
    public final m1e y;
    public final duj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqo(vzg0 vzg0Var, i1w0 i1w0Var, ouu ouuVar, pru pruVar, nr nrVar, yiu yiuVar, rou rouVar, znt zntVar, gbi gbiVar, g2v g2vVar, qv2 qv2Var, boolean z, ctf0 ctf0Var, m1e m1eVar, mne mneVar, duj dujVar, do20 do20Var, jtj jtjVar, pmi pmiVar, h3c h3cVar) {
        super(new zb1((Object) pruVar, (Object) g2vVar, (Object) vzg0Var, z, (byte) 4), cvm0.p(mneVar.c, mneVar.f22085a), new bcn(ctf0Var, (byte) 5), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = ouuVar;
        this.r = pruVar;
        this.s = nrVar;
        this.t = yiuVar;
        this.u = rouVar;
        this.v = zntVar;
        this.w = gbiVar;
        this.x = qv2Var;
        this.y = m1eVar;
        this.z = dujVar;
        this.A = do20Var;
        this.B = jtjVar;
        this.C = h3cVar;
        do20Var.l(true);
        do20Var.l(false);
    }

    public final void M(boolean z) {
        Object value;
        phe pheVar;
        Object value2;
        bby bbyVar = this.E;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            eke0 eke0Var = swh0.b;
            swh0 swh0Var = ((pqo) D()).b;
            eke0Var.getClass();
            boolean z2 = swh0Var == swh0.LIVE;
            if (z) {
                this.A.l(z2);
            }
            phe pheVar2 = phe.f26992a;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2 && (((pqo) D()).h instanceof hhe)) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, pqo.a((pqo) value2, null, false, null, null, pheVar2, null, null, null, 1919)));
            } else if (!z2 && (((pqo) D()).i instanceof hhe)) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                    pheVar = pheVar2;
                    pheVar2 = pheVar;
                } while (!p7m0Var2.m(value, pqo.a((pqo) value, null, false, null, null, null, pheVar, null, null, 1791)));
            }
            this.E = i3t0.K(this, null, new x9((Object) this, z2, (byte) 22), new olb(b, (yje) null, this, z2), 1);
        }
    }

    public final void N() {
        Object value;
        if (((pqo) D()).c) {
            List listO = kkb.O((pqo) D());
            ArrayList arrayList = new ArrayList(r3d.q(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((bhj) it.next()).f2609a));
            }
            HashSet hashSetJ0 = CollectionsKt.J0(((pqo) D()).j);
            hashSetJ0.addAll(arrayList);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, pqo.a((pqo) value, null, false, null, null, null, null, hashSetJ0, null, 1535)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object next2;
        p7m0 p7m0Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Set setP0;
        hqo hqoVar = (hqo) obj;
        hqoVar.getClass();
        boolean zEquals = hqoVar.equals(bqo.f3041a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        boolean z = false;
        vzg0 vzg0Var = this.o;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (zEquals) {
            boolean z2 = ((pqo) D()).c;
            boolean z3 = !z2;
            if (z2) {
                setP0 = xun.f41520a;
            } else {
                pqo pqoVar = (pqo) D();
                pqoVar.getClass();
                lc00 lc00VarB = kotlin.collections.a.b();
                gie gieVar = pqoVar.h;
                zhe zheVar = gieVar instanceof zhe ? (zhe) gieVar : null;
                List list = zheVar != null ? zheVar.f44389a : null;
                if (list == null) {
                    list = iun.f15405a;
                }
                lc00VarB.addAll(list);
                gie gieVar2 = pqoVar.i;
                zhe zheVar2 = gieVar2 instanceof zhe ? (zhe) gieVar2 : null;
                List list2 = zheVar2 != null ? zheVar2.f44389a : null;
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                lc00VarB.addAll(list2);
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                ArrayList arrayList = new ArrayList(r3d.q(lc00VarA, 10));
                ListIterator listIterator = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        break;
                    } else {
                        arrayList.add(Long.valueOf(((bhj) pawVar.next()).f2609a));
                    }
                }
                setP0 = CollectionsKt.P0(arrayList);
            }
            vzg0Var.e("EXPANDABLE_IDS_SAVED", setP0);
            vzg0Var.e("EXPANDED_STATE_SAVED", Boolean.valueOf(z3));
            p7m0 p7m0Var2 = ocjVar.f25029a;
            while (true) {
                Object value5 = p7m0Var2.getValue();
                value5.getClass();
                oyg0Var.getClass();
                Set set = setP0;
                if (p7m0Var2.m(value5, pqo.a((pqo) value5, null, z3, null, null, null, null, set, null, 1531))) {
                    return;
                } else {
                    setP0 = set;
                }
            }
        } else {
            if (!hqoVar.equals(cqo.f4805a)) {
                boolean z4 = true;
                if (hqoVar instanceof eqo) {
                    int i = ((eqo) hqoVar).f8247a;
                    swh0.b.getClass();
                    swh0 swh0Var = i == 0 ? swh0.LIVE : swh0.LINE;
                    Object[] objArr6 = swh0Var != ((pqo) D()).b;
                    vzg0Var.e("SELECTED_TAB", swh0Var);
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value4, pqo.a((pqo) value4, swh0Var, false, null, null, null, null, null, null, 2045)));
                    N();
                    if (objArr6 == true) {
                        v3c.N(this.E);
                        M(false);
                        return;
                    }
                    return;
                }
                if (hqoVar.equals(fqo.f9986a)) {
                    bby bbyVar = this.F;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        this.F = i3t0.K(this, null, null, new pn(this, objArr5 == true ? 1 : 0, (byte) 27), 3);
                        return;
                    }
                    return;
                }
                if (hqoVar.equals(gqo.f11743a)) {
                    v3c.N(this.F);
                    bby bbyVar2 = this.E;
                    if (bbyVar2 != null) {
                        v3c.N(bbyVar2);
                        return;
                    }
                    return;
                }
                if (hqoVar instanceof ypo) {
                    long j = ((ypo) hqoVar).f43040a;
                    HashSet hashSetJ0 = CollectionsKt.J0(((pqo) D()).j);
                    if (hashSetJ0.contains(Long.valueOf(j))) {
                        hashSetJ0.remove(Long.valueOf(j));
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var4.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var4.m(value3, pqo.a((pqo) value3, null, false, null, null, null, null, null, null, 2043)));
                    } else {
                        List listO = kkb.O((pqo) D());
                        hashSetJ0.add(Long.valueOf(j));
                        if (listO == null || !listO.isEmpty()) {
                            Iterator it = listO.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    p7m0Var = ocjVar.f25029a;
                                    do {
                                        value = p7m0Var.getValue();
                                        value.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var.m(value, pqo.a((pqo) value, null, true, null, null, null, null, null, null, 2043)));
                                } else if (!hashSetJ0.contains(Long.valueOf(((bhj) it.next()).f2609a))) {
                                }
                            }
                        } else {
                            p7m0Var = ocjVar.f25029a;
                            do {
                                value = p7m0Var.getValue();
                                value.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var.m(value, pqo.a((pqo) value, null, true, null, null, null, null, null, null, 2043)));
                        }
                    }
                    vzg0Var.e("EXPANDABLE_IDS_SAVED", hashSetJ0);
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var5.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var5.m(value2, pqo.a((pqo) value2, null, false, null, null, null, null, hashSetJ0, null, 1535)));
                    return;
                }
                if (hqoVar instanceof zpo) {
                    i3t0.K(this, null, null, new ffd(this, ((zpo) hqoVar).f44769a, objArr4 == true ? 1 : 0, (byte) 8), 3);
                    return;
                }
                boolean z5 = hqoVar instanceof wpo;
                jtj jtjVar = this.B;
                if (z5) {
                    long j2 = ((wpo) hqoVar).f39553a;
                    List listO2 = kkb.O((pqo) D());
                    Iterator it2 = listO2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (((bhj) next2).f2609a != j2);
                    bhj bhjVar = (bhj) next2;
                    if (bhjVar == null) {
                        return;
                    }
                    jtjVar.p(String.valueOf(listO2.indexOf(bhjVar) + 1), bhjVar.e, false);
                    i3t0.K(this, null, null, new sqo(this, bhjVar.d, z, objArr3 == true ? 1 : 0, (byte) 0), 3);
                    return;
                }
                if (hqoVar instanceof aqo) {
                    long j3 = ((aqo) hqoVar).f1306a;
                    List listO3 = kkb.O((pqo) D());
                    Iterator it3 = listO3.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (((bhj) next).f2609a != j3);
                    bhj bhjVar2 = (bhj) next;
                    if (bhjVar2 == null) {
                        return;
                    }
                    jtjVar.p(String.valueOf(listO3.indexOf(bhjVar2) + 1), bhjVar2.e, true);
                    i3t0.K(this, null, null, new sqo(this, bhjVar2.d, z4, objArr2 == true ? 1 : 0, (byte) 0), 3);
                    return;
                }
                if (hqoVar.equals(vpo.f37814a)) {
                    E();
                    return;
                }
                if (hqoVar.equals(xpo.f41279a)) {
                    gd90 gd90Var = ((pqo) D()).k;
                    if (gd90Var == null) {
                        return;
                    }
                    i3t0.K(this, null, null, new sqo(this, gd90Var.f11093a, gd90Var.b, objArr == true ? 1 : 0, (byte) 1), 3);
                    return;
                }
                if (!hqoVar.equals(dqo.f6526a)) {
                    t9f.b();
                    return;
                } else {
                    v3c.N(this.E);
                    M(true);
                    return;
                }
            }
            i1w0 i1w0Var = this.p;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
