package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class orb0 extends w46 {
    public final dgu b;
    public final duj c;
    public final i1w0 d;
    public final mne e;
    public final z220 f;
    public final String g;
    public final sa10 h;
    public final long i;
    public final m1e j;
    public final hpc k;
    public final pru l;
    public final pmi0 m;
    public final ctf0 n;
    public final p7m0 o;
    public final qoj0 p;
    public final qoj0 q;
    public final qoj0 r;
    public final uob0 s;
    public boolean t;
    public bby u;
    public boolean v;
    public cit0 w;

    public orb0(dgu dguVar, duj dujVar, i1w0 i1w0Var, mne mneVar, z220 z220Var, String str, sa10 sa10Var, long j, m1e m1eVar, hpc hpcVar, pru pruVar, pmi0 pmi0Var, ctf0 ctf0Var, p4u p4uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = dguVar;
        this.c = dujVar;
        this.d = i1w0Var;
        this.e = mneVar;
        this.f = z220Var;
        this.g = str;
        this.h = sa10Var;
        this.i = j;
        this.j = m1eVar;
        this.k = hpcVar;
        this.l = pruVar;
        this.m = pmi0Var;
        this.n = ctf0Var;
        this.o = q7m0.a(new lrb0(false));
        this.p = ckb.F();
        this.q = ckb.F();
        this.r = ckb.F();
        this.s = ((drb0) ((iw20) p4uVar.f26374a).f15470a).f6552a;
        this.u = zvw.g();
        this.v = true;
        w();
        slb.U(new fnq(m1eVar.b(), new a220(this, null, (byte) 10), (byte) 4), d5c.S(jiu0.a(this), mneVar.b));
    }

    public final void w() {
        this.u.cancel(null);
        this.u = sac.Z(jiu0.a(this), ibc.w0(8L, bfn.SECONDS), this.e.b, new irb0(this, (byte) 2), new er60((Object) this, (yje) null, (byte) 20));
    }

    public final void x() {
        i1w0 i1w0Var = this.d;
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
