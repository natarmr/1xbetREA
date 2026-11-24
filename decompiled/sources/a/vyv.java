package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vyv extends w46 {
    public final sys0 b;
    public final jpc c;
    public final cnt d;
    public final mmt e;
    public final i1w0 f;
    public final p7m0 g;
    public final p7m0 h;
    public final p7m0 i;
    public final p7m0 j;
    public final p7m0 k;
    public final p7m0 l;

    public vyv(sys0 sys0Var, jpc jpcVar, cnt cntVar, mmt mmtVar, cnt cntVar2, i1w0 i1w0Var) {
        i1w0Var.getClass();
        this.b = sys0Var;
        this.c = jpcVar;
        this.d = cntVar;
        this.e = mmtVar;
        this.f = i1w0Var;
        p7m0 p7m0VarA = q7m0.a(tyv.f34775a);
        this.g = p7m0VarA;
        this.h = q7m0.a(qyv.f29553a);
        v21 v21Var = v21.ALL;
        this.i = q7m0.a(new oyv(v21Var));
        this.j = q7m0.a(new nyv(r21.ALL));
        this.k = q7m0.a(new myv(false));
        this.l = q7m0.a(new lyv(false));
        ((tnm0) cntVar2.f4672a.f35622a).getClass();
        List<v21> listJ = q3d.j(v21Var, v21.SLOTS, v21.LIVE_AGGREGATOR);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        for (v21 v21Var2 : listJ) {
            v21Var2.getClass();
            arrayList.add(new x21(false, v21Var2));
        }
        p7m0VarA.o(null, new syv(arrayList));
        p7m0 p7m0Var = this.i;
        oyv oyvVar = new oyv(((tnm0) this.c.f16892a.f35622a).d.b);
        p7m0Var.getClass();
        p7m0Var.o(null, oyvVar);
        p7m0 p7m0Var2 = this.h;
        ((tnm0) this.e.f22059a.f35622a).getClass();
        List<r21> listJ2 = q3d.j(r21.ALL, r21.REAL_MONEY, r21.FREE_SPINS);
        ArrayList arrayList2 = new ArrayList(r3d.q(listJ2, 10));
        for (r21 r21Var : listJ2) {
            r21Var.getClass();
            arrayList2.add(new s21(false, r21Var));
        }
        pyv pyvVar = new pyv(arrayList2);
        p7m0Var2.getClass();
        p7m0Var2.o(null, pyvVar);
        p7m0 p7m0Var3 = this.j;
        nyv nyvVar = new nyv(((tnm0) this.c.f16892a.f35622a).d.c);
        p7m0Var3.getClass();
        p7m0Var3.o(null, nyvVar);
        x();
    }

    public final void w() {
        u21 u21Var = ((tnm0) this.c.f16892a.f35622a).d;
        lyv lyvVar = new lyv((((oyv) this.i.getValue()).f26076a != u21Var.b) || (((nyv) this.j.getValue()).f24347a != u21Var.c));
        p7m0 p7m0Var = this.l;
        p7m0Var.getClass();
        p7m0Var.o(null, lyvVar);
    }

    public final void x() {
        myv myvVar = new myv((((oyv) this.i.getValue()).f26076a != v21.ALL) || (((nyv) this.j.getValue()).f24347a != r21.ALL));
        p7m0 p7m0Var = this.k;
        p7m0Var.getClass();
        p7m0Var.o(null, myvVar);
    }

    public final void y(t21 t21Var) {
        if (t21Var instanceof x21) {
            oyv oyvVar = new oyv(((x21) t21Var).b);
            p7m0 p7m0Var = this.i;
            p7m0Var.getClass();
            p7m0Var.o(null, oyvVar);
        } else if (t21Var instanceof s21) {
            nyv nyvVar = new nyv(((s21) t21Var).b);
            p7m0 p7m0Var2 = this.j;
            p7m0Var2.getClass();
            p7m0Var2.o(null, nyvVar);
        }
        x();
        w();
    }
}
