package a;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yya extends w46 {
    public final i1w0 b;
    public final lef0 c;
    public final u58 d;
    public final ix0 e;
    public final rjo f;
    public final m1e g;
    public final sa10 h;
    public final cu i;
    public final es j;
    public final duj k;
    public final mne l;
    public final ctf0 m;
    public final ArrayList n;
    public bby o;
    public bby p;
    public bby q;
    public boolean r;
    public boolean s;
    public long t;
    public final p7m0 u;
    public final p7m0 v;
    public final p7m0 w;
    public final ol60 x;
    public final ol60 y;

    public yya(i1w0 i1w0Var, lef0 lef0Var, u58 u58Var, ix0 ix0Var, rjo rjoVar, m1e m1eVar, sa10 sa10Var, cu cuVar, es esVar, duj dujVar, mne mneVar, ctf0 ctf0Var) {
        i1w0Var.getClass();
        this.b = i1w0Var;
        this.c = lef0Var;
        this.d = u58Var;
        this.e = ix0Var;
        this.f = rjoVar;
        this.g = m1eVar;
        this.h = sa10Var;
        this.i = cuVar;
        this.j = esVar;
        this.k = dujVar;
        this.l = mneVar;
        this.m = ctf0Var;
        this.n = new ArrayList();
        this.u = q7m0.a(new wya((ArrayList) null, 0, 7));
        this.v = q7m0.a(null);
        this.w = q7m0.a(Boolean.TRUE);
        this.x = new ol60(3);
        this.y = new ol60(3);
    }

    public final void w(long j) {
        bby bbyVar = this.q;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.t = j;
            this.q = sac.V(jiu0.a(this), new vya(this, (byte) 0), new h8a(this, (byte) 4), this.l.b, new ey((Object) this, j, (yje) null, (byte) 11), 8);
        }
    }

    public final void x() {
        i1w0 i1w0Var = this.b;
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

    public final void y(long j, String str) {
        p7m0 p7m0Var;
        Object value;
        yje yjeVar;
        str.getClass();
        bby bbyVar = this.o;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.t = j;
            do {
                p7m0Var = this.u;
                value = p7m0Var.getValue();
                yjeVar = null;
            } while (!p7m0Var.m(value, wya.a((wya) value, null, 0, str, 3)));
            this.o = sac.V(jiu0.a(this), xya.f41697a, null, this.l.b, new d09((Object) this, (Object) str, yjeVar, (byte) 18), 10);
        }
    }
}
