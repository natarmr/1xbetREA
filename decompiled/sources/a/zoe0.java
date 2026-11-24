package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zoe0 extends w46 {
    public final p4u b;
    public final epi0 c;
    public final ort d;
    public final pzu e;
    public final zr1 f;
    public final j6m0 g;
    public final y2m0 h;
    public final ih5 i;
    public final yo4 j;
    public final duj k;
    public final l7k l;
    public final cmt m;
    public final x20 n;
    public bby o;
    public final c4m0 p;
    public final p7m0 q;
    public final p7m0 r;
    public final p7m0 s;
    public final qoj0 t;
    public final p7m0 u;

    public zoe0(p4u p4uVar, epi0 epi0Var, ort ortVar, pzu pzuVar, zr1 zr1Var, j6m0 j6m0Var, y2m0 y2m0Var, ih5 ih5Var, yo4 yo4Var, m1e m1eVar, duj dujVar, l7k l7kVar, cmt cmtVar, x20 x20Var) {
        m1eVar.getClass();
        this.b = p4uVar;
        this.c = epi0Var;
        this.d = ortVar;
        this.e = pzuVar;
        this.f = zr1Var;
        this.g = j6m0Var;
        this.h = y2m0Var;
        this.i = ih5Var;
        this.j = yo4Var;
        this.k = dujVar;
        this.l = l7kVar;
        this.m = cmtVar;
        this.n = x20Var;
        this.q = q7m0.a(iun.f15405a);
        Boolean bool = Boolean.FALSE;
        this.r = q7m0.a(bool);
        this.s = q7m0.a(Boolean.TRUE);
        this.t = ckb.F();
        this.u = q7m0.a(bool);
        x();
        c4m0 c4m0Var = this.p;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.p = slb.U(new fnq(m1eVar.b(), new yoe0(this, null, (byte) 0), (byte) 4), jiu0.a(this));
        }
    }

    public final void w(String str) {
        yo4 yo4Var = this.j;
        yo4Var.getClass();
        i8i.D("option", str, yo4Var.f42966a, "promo_referal_rules_call");
        x20 x20Var = this.n;
        x20Var.getClass();
        b1j.v(str, x20Var.f40143a, 3323L);
        pzu pzuVar = this.e;
        ((oeg0) pzuVar.f27863a).c().d(new bod0(pzuVar));
    }

    public final void x() {
        List<ekz> list = ((ioe0) ((z220) this.b.f26374a).b).f15113a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (ekz ekzVar : list) {
            this.g.getClass();
            ekzVar.getClass();
            arrayList.add(new fkz(ekzVar.f7975a, ekzVar.b));
        }
        rlg0 rlg0Var = new rlg0(((Boolean) this.r.getValue()).booleanValue());
        this.h.getClass();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.add(rlg0Var);
        p7m0 p7m0Var = this.q;
        p7m0Var.getClass();
        p7m0Var.o(null, arrayList2);
        Boolean bool = Boolean.FALSE;
        p7m0 p7m0Var2 = this.s;
        p7m0Var2.getClass();
        p7m0Var2.o(null, bool);
    }
}
