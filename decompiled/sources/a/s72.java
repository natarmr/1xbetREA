package a;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xplatform.results.impl.presentation.alt_champs.ChampsResultsParams;

/* JADX INFO: loaded from: classes5.dex */
public final class s72 extends i3t0 {
    public static final /* synthetic */ int I = 0;
    public final z8u A;
    public final ivn B;
    public final xfu C;
    public final eyg0 D;
    public bby E;
    public bby F;
    public bby G;
    public bby H;
    public final ChampsResultsParams o;
    public final hru p;
    public final qrc q;
    public final clc r;
    public final cmt s;
    public final m1e t;
    public final ctf0 u;
    public final mne v;
    public final i1w0 w;
    public final gle0 x;
    public final fvt0 y;
    public final nv20 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public s72(vzg0 vzg0Var, ChampsResultsParams champsResultsParams, hru hruVar, qrc qrcVar, clc clcVar, cmt cmtVar, m1e m1eVar, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, gle0 gle0Var, pru pruVar, bzt bztVar, fvt0 fvt0Var, nv20 nv20Var, z8u z8uVar, ivn ivnVar, xfu xfuVar, eyg0 eyg0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, new bg0(pruVar, bztVar, hruVar, champsResultsParams, vzg0Var, qrcVar, (byte) 1), cvm0.p(rwjVar, rwjVar), new uc(ctf0Var, (byte) 17));
        this.o = champsResultsParams;
        this.p = hruVar;
        this.q = qrcVar;
        this.r = clcVar;
        this.s = cmtVar;
        this.t = m1eVar;
        this.u = ctf0Var;
        this.v = mneVar;
        this.w = i1w0Var;
        this.x = gle0Var;
        this.y = fvt0Var;
        this.z = nv20Var;
        this.A = z8uVar;
        this.B = ivnVar;
        this.C = xfuVar;
        this.D = eyg0Var;
        yje yjeVar = null;
        i3t0.K(this, null, null, new q72(this, yjeVar, (byte) 2), 3);
        i3t0.K(this, null, null, new q72(this, yjeVar, (byte) 1), 3);
    }

    public final void M(boolean z) {
        Object value;
        Object value2;
        if (z) {
            v3c.N(this.H);
        }
        bby bbyVar = this.H;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            boolean z2 = ((g72) D()).d instanceof e72;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, g72.a((g72) value, null, null, false, e72.f7313a, false, false, false, false, false, null, null, null, 522223)));
            } else {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, g72.a((g72) value2, null, null, false, null, false, true, false, false, false, null, null, null, 522239)));
            }
            this.H = sac.V(jiu0.a(this), new o72(this, (byte) 2), null, this.v.f22085a, new y32(this, null, b), 10);
        }
    }

    @Override // a.diu0
    public final void v() {
        chf0 chf0Var = qx40.f29464a;
        qx40.a(s72.class.getSimpleName());
    }

    /* JADX WARN: Code duplicated, block: B:106:0x027b  */
    /* JADX WARN: Code duplicated, block: B:153:0x033b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        List<odb> list;
        String strB;
        Object next;
        List<odb> list2;
        String strB2;
        Object next2;
        Object value;
        Object value2;
        Object value3;
        s62 s62Var = (s62) obj;
        s62Var.getClass();
        byte b = 0;
        ?? r5 = 0;
        str = null;
        str = null;
        String str = null;
        r5 = 0;
        r5 = 0;
        if (s62Var.equals(b62.f2033a)) {
            bby bbyVar = this.E;
            byte b2 = 3;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.E = i3t0.K(this, null, null, new q72(this, r5, b2), 3);
            }
            this.F = i3t0.K(this, null, null, new q72(this, r5, b), 3);
            return;
        }
        if (s62Var.equals(c62.f3798a)) {
            v3c.N(this.E);
            v3c.N(this.H);
            v3c.N(this.F);
            return;
        }
        boolean zEquals = s62Var.equals(e62.f7260a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        ChampsResultsParams champsResultsParams = this.o;
        i1w0 i1w0Var = this.w;
        if (!zEquals) {
            if (s62Var.equals(o62.f24712a)) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, g72.a((g72) value2, null, null, false, null, true, false, false, false, false, null, null, null, 523263)));
                return;
            }
            if (s62Var instanceof m62) {
                H(new g0(((m62) s62Var).f21246a, (byte) 4));
                return;
            }
            if (s62Var.equals(q62.f28179a)) {
                M(false);
                return;
            }
            if (s62Var.equals(r62.f29914a)) {
                M(true);
                return;
            }
            if (s62Var.equals(a62.f298a)) {
                E();
                return;
            }
            if (s62Var.equals(n62.f22974a)) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, g72.a((g72) value, null, null, false, null, false, false, false, false, false, null, null, null, 520191)));
                return;
            }
            if (s62Var.equals(h62.f12509a)) {
                G(new z62(((g72) D()).b));
                return;
            }
            boolean z = s62Var instanceof g62;
            byte b3 = 2;
            byte b4 = 13;
            eyg0 eyg0Var = this.D;
            if (z) {
                g62 g62Var = (g62) s62Var;
                int i = g62Var.f10742a;
                int i2 = g62Var.b;
                int i3 = g62Var.c;
                Calendar calendar = Calendar.getInstance();
                Date date = ((g72) D()).b;
                if (date != null) {
                    calendar.setTimeInMillis(date.getTime());
                }
                Calendar calendar2 = Calendar.getInstance();
                int i4 = calendar2.get(11);
                int i5 = calendar2.get(12);
                int i6 = calendar2.get(13);
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(i, i2, i3, i4, i5, i6);
                if (((g72) D()).b != null) {
                    calendar.getClass();
                    if (calendar3.get(1) == calendar.get(1) && calendar3.get(2) == calendar.get(2) && calendar3.get(5) == calendar.get(5)) {
                        return;
                    }
                }
                boolean z2 = champsResultsParams.d;
                Date time = calendar3.getTime();
                time.getClass();
                this.q.a(time, z2);
                eyg0Var.n(false);
                H(new n72(calendar3, (byte) 0));
                M(true);
                return;
            }
            ?? r3 = "";
            if (s62Var instanceof i62) {
                long j = ((i62) s62Var).f14221a;
                f72 f72Var = ((g72) D()).d;
                d72 d72Var = f72Var instanceof d72 ? (d72) f72Var : null;
                if (d72Var != null && (list2 = d72Var.f5574a) != null) {
                    for (odb odbVar : list2) {
                        if (odbVar.a() == j) {
                            strB2 = odbVar.b();
                        } else if (odbVar instanceof kdb) {
                            Iterator it = ((kdb) odbVar).g.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                            } while (((mdb) next2).f21587a != j);
                            mdb mdbVar = (mdb) next2;
                            if (mdbVar != null) {
                                strB2 = mdbVar.b;
                            } else {
                                strB2 = null;
                            }
                        } else {
                            strB2 = null;
                        }
                        if (strB2 != null) {
                            str = strB2;
                            break;
                        }
                    }
                }
                i1w0Var.d(new mz0(this, str == null ? "" : str, j, (byte) 2));
                return;
            }
            if (s62Var instanceof p62) {
                if (!((g72) D()).o) {
                    i1w0Var.d(new df1(this, s62Var, b4));
                    return;
                }
                long j2 = ((p62) s62Var).f26432a.f9981a;
                eyg0Var.n(true);
                H(new a21((byte) 1, j2));
                return;
            }
            if (!(s62Var instanceof f62)) {
                if (s62Var instanceof j62) {
                    H(new a21(b3, ((j62) s62Var).f15963a));
                    return;
                }
                boolean zEquals2 = s62Var.equals(k62.f17746a);
                y62 y62Var = y62.f42074a;
                if (zEquals2) {
                    G(y62Var);
                    return;
                }
                if (s62Var.equals(d62.f5532a)) {
                    G(y62Var);
                    return;
                } else {
                    if (!(s62Var instanceof l62)) {
                        t9f.b();
                        return;
                    }
                    long j3 = ((l62) s62Var).f19485a;
                    eyg0Var.n(true);
                    H(new a21((byte) 1, j3));
                    return;
                }
            }
            jtl jtlVar = ((f62) s62Var).f8989a;
            if (!(jtlVar instanceof tbb)) {
                if (jtlVar instanceof sbb) {
                    eyg0Var.n(false);
                    H(new xg1((byte) 25));
                    return;
                }
                return;
            }
            Set set = ((g72) D()).p;
            if (set.size() == 1) {
                long jLongValue = ((Number) CollectionsKt.T(set)).longValue();
                f72 f72Var2 = ((g72) D()).d;
                d72 d72Var2 = f72Var2 instanceof d72 ? (d72) f72Var2 : null;
                if (d72Var2 != null && (list = d72Var2.f5574a) != null) {
                    for (odb odbVar2 : list) {
                        if (odbVar2.a() == jLongValue) {
                            strB = odbVar2.b();
                        } else if (odbVar2 instanceof kdb) {
                            Iterator it2 = ((kdb) odbVar2).g.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (((mdb) next).f21587a != jLongValue);
                            mdb mdbVar2 = (mdb) next;
                            if (mdbVar2 != null) {
                                strB = mdbVar2.b;
                            } else {
                                strB = null;
                            }
                        } else {
                            strB = null;
                        }
                        if (strB != null) {
                            r5 = strB;
                            break;
                        }
                    }
                }
                if (r5 != 0) {
                    r3 = r5;
                }
            }
            i1w0Var.d(new df1(this, r3, (byte) 14));
            return;
        }
        if (((g72) D()).j) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, g72.a((g72) value3, "", null, false, null, false, false, false, false, false, null, null, null, 523262)));
            return;
        }
        if (champsResultsParams.d) {
            ((u5g0) ((nv20) this.r.b).f24171a).b.n(null);
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
