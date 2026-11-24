package a;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class uya extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public bby A;
    public bby B;
    public bby C;
    public final i1w0 o;
    public final m1e p;
    public final mne q;
    public final lef0 r;
    public final cu s;
    public final es t;
    public final u58 u;
    public final ix0 v;
    public final rjo w;
    public final duj x;
    public final ctf0 y;
    public c4m0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uya(i1w0 i1w0Var, m1e m1eVar, mne mneVar, lef0 lef0Var, cu cuVar, es esVar, u58 u58Var, ix0 ix0Var, rjo rjoVar, duj dujVar, ctf0 ctf0Var, ocl oclVar) {
        super(new mn9((byte) 29), cvm0.p(mneVar.c, mneVar.b), new cz(ctf0Var, oclVar, (byte) 10), (yzn0) null);
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = i1w0Var;
        this.p = m1eVar;
        this.q = mneVar;
        this.r = lef0Var;
        this.s = cuVar;
        this.t = esVar;
        this.u = u58Var;
        this.v = ix0Var;
        this.w = rjoVar;
        this.x = dujVar;
        this.y = ctf0Var;
    }

    public final void M() {
        i1w0 i1w0Var = this.o;
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

    public final void N() {
        bby bbyVar = this.A;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.A = sac.V(jiu0.a(this), new rya(this, b), new h8a(this, (byte) 3), this.q.b, new sya(this, null, (byte) 0), 8);
        }
    }

    public final void O(String str) {
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.B = sac.V(jiu0.a(this), tya.f34743a, null, this.q.b, new d09((Object) this, (Object) str, (yje) null, (byte) 17), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        bi90 bi90Var;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        txa txaVar = (txa) obj;
        txaVar.getClass();
        super.x(txaVar);
        if (txaVar instanceof ixa) {
            M();
            return;
        }
        boolean z = txaVar instanceof lxa;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value6 = p7m0Var.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value6, kya.a((kya) value6, null, null, null, null, false, false, 0L, null, 511)));
            if (((kya) D()).d == null) {
                N();
                return;
            } else {
                String str = ((kya) D()).d;
                O(str != null ? str : "");
                return;
            }
        }
        if (txaVar instanceof qxa) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value5 = p7m0Var2.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value5, kya.a((kya) value5, null, null, null, "", false, false, 0L, null, 1015)));
            O("");
            return;
        }
        if (txaVar instanceof rxa) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value4 = p7m0Var3.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value4, kya.a((kya) value4, null, null, null, null, false, false, 0L, null, 1015)));
            O("");
            return;
        }
        if (txaVar instanceof sxa) {
            String str2 = ((sxa) txaVar).f32966a;
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value3 = p7m0Var4.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value3, kya.a((kya) value3, null, null, null, str2, false, false, 0L, null, 1015)));
            O(str2);
            return;
        }
        byte b = 0;
        byte b2 = 1;
        if (txaVar instanceof kxa) {
            long j = ((kxa) txaVar).f19044a;
            if (((kya) D()).c.d.containsKey(Long.valueOf(j))) {
                bi90Var = ((kya) D()).c;
                Long lValueOf = Long.valueOf(j);
                dh90 dh90VarPut = bi90Var.d;
                yb00 yb00Var = (yb00) dh90VarPut.get(lValueOf);
                if (yb00Var != null) {
                    Object obj2 = yb00Var.f42319a;
                    Object obj3 = yb00Var.b;
                    nqs0 nqs0Var = dh90VarPut.d;
                    nqs0 nqs0VarW = nqs0Var.w(lValueOf.hashCode(), lValueOf, 0);
                    if (nqs0Var != nqs0VarW) {
                        if (nqs0VarW == null) {
                            dh90VarPut = dh90.f;
                            dh90VarPut.getClass();
                        } else {
                            dh90VarPut = new dh90(nqs0VarW, dh90VarPut.e - 1);
                        }
                    }
                    ujn ujnVar = ujn.k;
                    if (obj2 != ujnVar) {
                        Object obj4 = dh90VarPut.get(obj2);
                        obj4.getClass();
                        dh90VarPut = dh90VarPut.put(obj2, new yb00(((yb00) obj4).f42319a, obj3));
                    }
                    if (obj3 != ujnVar) {
                        Object obj5 = dh90VarPut.get(obj3);
                        obj5.getClass();
                        dh90VarPut = dh90VarPut.put(obj3, new yb00(obj2, ((yb00) obj5).b));
                    }
                    Object obj6 = obj2 != ujnVar ? bi90Var.b : obj3;
                    if (obj3 != ujnVar) {
                        obj2 = bi90Var.c;
                    }
                    bi90Var = new bi90(obj6, obj2, dh90VarPut);
                }
            } else if (((kya) D()).c.d.e < 2) {
                bi90Var = ((kya) D()).c;
                Long lValueOf2 = Long.valueOf(j);
                dh90 dh90Var = bi90Var.d;
                if (!dh90Var.containsKey(lValueOf2)) {
                    if (bi90Var.isEmpty()) {
                        bi90Var = new bi90(lValueOf2, lValueOf2, dh90Var.put(lValueOf2, new yb00()));
                    } else {
                        Object obj7 = bi90Var.c;
                        Object obj8 = dh90Var.get(obj7);
                        obj8.getClass();
                        bi90Var = new bi90(bi90Var.b, lValueOf2, dh90Var.put(obj7, new yb00(((yb00) obj8).f42319a, lValueOf2)).put(lValueOf2, new yb00(obj7)));
                    }
                }
            } else {
                bi90Var = ((kya) D()).c;
            }
            bi90 bi90Var2 = bi90Var;
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value2 = p7m0Var5.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value2, kya.a((kya) value2, null, null, bi90Var2, null, false, false, 0L, null, 1019)));
            return;
        }
        if (txaVar instanceof jxa) {
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value = p7m0Var6.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value, kya.a((kya) value, null, null, bi90.e, null, false, false, 0L, null, 1019)));
            return;
        }
        if (txaVar instanceof mxa) {
            if (((kya) D()).g && ((kya) D()).c.d.e == 2) {
                G(gya.f12118a);
                return;
            }
            return;
        }
        boolean z2 = txaVar instanceof oxa;
        mne mneVar = this.q;
        yje yjeVar = null;
        if (z2) {
            bby bbyVar = this.C;
            if (bbyVar == null || !bbyVar.isActive()) {
                a4x a4xVar = ((kya) D()).b;
                ArrayList arrayList = new ArrayList();
                for (Object obj9 : a4xVar) {
                    if (((kya) D()).c.d.containsKey(Long.valueOf(((pbv) obj9).f26728a))) {
                        arrayList.add(obj9);
                    }
                }
                this.C = sac.V(jiu0.a(this), new rya(this, b), null, mneVar.b, new d09((Object) this, (Object) arrayList, yjeVar, (byte) 16), 10);
                return;
            }
            return;
        }
        if (txaVar instanceof nxa) {
            return;
        }
        if (txaVar instanceof pxa) {
            M();
            return;
        }
        if (!(txaVar instanceof hxa)) {
            if (txaVar instanceof fxa) {
                E();
                return;
            } else {
                if (txaVar instanceof gxa) {
                    return;
                }
                t9f.b();
                return;
            }
        }
        long j2 = ((hxa) txaVar).f13805a;
        p7m0 p7m0Var7 = ocjVar.f25029a;
        while (true) {
            Object value7 = p7m0Var7.getValue();
            value7.getClass();
            oyg0Var.getClass();
            long j3 = j2;
            if (p7m0Var7.m(value7, kya.a((kya) value7, null, null, null, null, false, false, j3, null, 767))) {
                break;
            } else {
                j2 = j3;
            }
        }
        c4m0 c4m0Var = this.z;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.z = slb.U(new dnq(new fnq(this.p.b(), new sya(this, yjeVar, b2), (byte) 4), new lo3(3, yjeVar, (byte) 4), (byte) 1), d5c.S(jiu0.a(this), mneVar.b));
        }
    }
}
