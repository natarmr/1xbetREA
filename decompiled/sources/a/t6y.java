package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class t6y extends w46 {
    public final jru b;
    public final m0u c;
    public final m1e d;
    public final sa10 e;
    public final uyn f;
    public final i1w0 g;
    public final mne h;
    public final duj i;
    public final abu j;
    public final wsf0 k;
    public final kyg0 l;
    public boolean m;
    public final p7m0 n;
    public final p7m0 o;
    public final p7m0 p;
    public final ol60 q;

    public t6y(jru jruVar, m0u m0uVar, m1e m1eVar, sa10 sa10Var, uyn uynVar, i1w0 i1w0Var, mne mneVar, duj dujVar, abu abuVar, wsf0 wsf0Var, kyg0 kyg0Var, n4u n4uVar) {
        i1w0Var.getClass();
        this.b = jruVar;
        this.c = m0uVar;
        this.d = m1eVar;
        this.e = sa10Var;
        this.f = uynVar;
        this.g = i1w0Var;
        this.h = mneVar;
        this.i = dujVar;
        this.j = abuVar;
        this.k = wsf0Var;
        this.l = kyg0Var;
        this.n = q7m0.a(p6y.f26480a);
        this.o = q7m0.a(m6y.f21294a);
        this.p = q7m0.a(n4uVar.c());
        this.q = new ol60(1, i99.b);
    }

    @Override // a.diu0
    public final void v() {
        d5c.G(jiu0.a(this), null);
    }

    public final void w() {
        i1w0 i1w0Var = this.g;
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
