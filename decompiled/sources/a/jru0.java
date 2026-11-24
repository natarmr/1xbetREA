package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jru0 extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final hzg o;
    public final mne p;
    public final vqc q;
    public final oeg0 r;
    public final vqc s;
    public final g2v t;
    public final pmi u;
    public final m1e v;
    public c4m0 w;
    public bby x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jru0(hzg hzgVar, g2v g2vVar, ctf0 ctf0Var, mne mneVar, vqc vqcVar, oeg0 oeg0Var, vqc vqcVar2, g2v g2vVar2, pmi pmiVar, m1e m1eVar) {
        super(new o1u0((byte) 18), cvm0.p(mneVar.c, mneVar.f22085a), new cls0(ctf0Var, g2vVar, (byte) 9), (yzn0) null);
        ctf0Var.getClass();
        oeg0Var.getClass();
        m1eVar.getClass();
        this.o = hzgVar;
        this.p = mneVar;
        this.q = vqcVar;
        this.r = oeg0Var;
        this.s = vqcVar2;
        this.t = g2vVar2;
        this.u = pmiVar;
        this.v = m1eVar;
    }

    public final void M() {
        e3c.n(this.w);
        this.w = sac.T(new fnq(i120.W(this.v.b()), new k6s0(this, null, (byte) 18), (byte) 4), d5c.S(jiu0.a(this), this.p.f22085a), foe.h);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        fru0 fru0Var;
        yqu0 yqu0Var = (yqu0) obj;
        yqu0Var.getClass();
        super.x(yqu0Var);
        Object obj2 = null;
        if (!(yqu0Var instanceof xqu0)) {
            if (!(yqu0Var instanceof qqu0)) {
                t9f.b();
                return;
            }
            qqu0 qqu0Var = (qqu0) yqu0Var;
            if (qqu0Var instanceof pqu0) {
                if (((fru0) D()).b == null) {
                    M();
                    return;
                }
                return;
            } else {
                if (!(qqu0Var instanceof oqu0)) {
                    t9f.b();
                    return;
                }
                c4m0 c4m0Var = this.w;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                    return;
                }
                return;
            }
        }
        xqu0 xqu0Var = (xqu0) yqu0Var;
        boolean z = xqu0Var instanceof vqu0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            boolean z2 = ((vqu0) xqu0Var).f37870a;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                fru0Var = (fru0) value5;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, !z2 ? fru0.a(fru0Var, "", null, z2, false, 10) : fru0.a(fru0Var, null, null, z2, false, 11)));
            return;
        }
        boolean z3 = xqu0Var instanceof tqu0;
        hzg hzgVar = this.o;
        if (z3) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, fru0.a((fru0) value3, "", null, false, false, 14)));
            if (!((fru0) D()).c) {
                ((uzg) hzgVar).a();
                return;
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value4 = p7m0Var3.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value4, fru0.a((fru0) value4, "", null, false, false, 10)));
            return;
        }
        if (xqu0Var instanceof wqu0) {
            String str = ((wqu0) xqu0Var).f39610a;
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, fru0.a((fru0) value2, str, null, false, false, 14)));
            return;
        }
        if (!(xqu0Var instanceof rqu0)) {
            if (!(xqu0Var instanceof squ0)) {
                if (xqu0Var instanceof uqu0) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (!((fru0) D()).c) {
                ((uzg) hzgVar).a();
                return;
            }
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value = p7m0Var5.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value, fru0.a((fru0) value, "", null, false, false, 10)));
            return;
        }
        int i = ((rqu0) xqu0Var).f30949a;
        j0g0 j0g0Var = ((fru0) D()).b;
        if (j0g0Var != null) {
            Object obj3 = j0g0Var.f15681a;
            if (obj3 instanceof g0g0) {
                obj3 = null;
            }
            List list = (List) obj3;
            if (list != null) {
                for (Object obj4 : list) {
                    if (((oru0) obj4).f25753a == i) {
                        obj2 = obj4;
                        break;
                    }
                }
                oru0 oru0Var = (oru0) obj2;
                if (oru0Var != null) {
                    this.r.c().d(new xis0((Object) this, (Object) oru0Var, (byte) 23));
                    this.q.k(pzb.C(new d4u0((byte) 13)));
                }
            }
        }
    }
}
