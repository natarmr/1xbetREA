package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class o6j extends w46 {
    public final v4v b;
    public final tru c;
    public final i1w0 d;
    public final mne e;
    public final uyn f;
    public final duj g;
    public final c4m0 h;
    public bby i;
    public final p7m0 j;
    public final p7m0 k;

    public o6j(v4v v4vVar, v4v v4vVar2, tru truVar, i1w0 i1w0Var, mne mneVar, uyn uynVar, m1e m1eVar, duj dujVar) {
        i1w0Var.getClass();
        this.b = v4vVar;
        this.c = truVar;
        this.d = i1w0Var;
        this.e = mneVar;
        this.f = uynVar;
        this.g = dujVar;
        p7m0 p7m0VarA = q7m0.a(Boolean.FALSE);
        this.j = p7m0VarA;
        this.k = q7m0.a(k6j.f17773a);
        c4m0 c4m0Var = this.h;
        byte b = 1;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.h = slb.U(new fnq(m1eVar.b(), new n6j(this, yjeVar, b), (byte) 4), jiu0.a(this));
        }
        slb.U(new p6d(vtb.M(((yzi) v4vVar2.f36800a.b).b), p7m0VarA, new ko0((Object) this, yjeVar, (byte) 11), (byte) 1), d5c.S(jiu0.a(this), mneVar.f22085a));
    }

    public final void w() {
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
