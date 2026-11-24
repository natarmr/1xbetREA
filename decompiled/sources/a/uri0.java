package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class uri0 extends w46 {
    public bby A;
    public c4m0 B;
    public boolean C;
    public final i1w0 b;
    public final eru c;
    public final byf0 d;
    public final joc e;
    public final jrc f;
    public final jru g;
    public final lqb h;
    public final vqi0 i;
    public final woc j;
    public final qgd k;
    public final zn00 l;
    public final jh70 m;
    public final iw20 n;
    public final s31 o;
    public final je p;
    public final rjo q;
    public final mne r;
    public final art s;
    public final duj t;
    public final m1e u;
    public final e0c v;
    public final ol60 w;
    public final p7m0 x;
    public final p7m0 y;
    public final p7m0 z;

    public uri0(i1w0 i1w0Var, vzg0 vzg0Var, eru eruVar, byf0 byf0Var, joc jocVar, jrc jrcVar, jru jruVar, lqb lqbVar, vqi0 vqi0Var, woc wocVar, qgd qgdVar, zn00 zn00Var, jh70 jh70Var, iw20 iw20Var, s31 s31Var, je jeVar, rjo rjoVar, mne mneVar, art artVar, duj dujVar, m1e m1eVar, e0c e0cVar) {
        i1w0Var.getClass();
        m1eVar.getClass();
        this.b = i1w0Var;
        this.c = eruVar;
        this.d = byf0Var;
        this.e = jocVar;
        this.f = jrcVar;
        this.g = jruVar;
        this.h = lqbVar;
        this.i = vqi0Var;
        this.j = wocVar;
        this.k = qgdVar;
        this.l = zn00Var;
        this.m = jh70Var;
        this.n = iw20Var;
        this.o = s31Var;
        this.p = jeVar;
        this.q = rjoVar;
        this.r = mneVar;
        this.s = artVar;
        this.t = dujVar;
        this.u = m1eVar;
        this.v = e0cVar;
        this.w = new ol60(1, i99.b);
        this.x = q7m0.a(qri0.f29211a);
        this.y = q7m0.a(Boolean.FALSE);
        this.z = q7m0.a(new w190());
    }

    public final void w() {
        int iOrdinal = this.i.c.ordinal();
        i1w0 i1w0Var = this.b;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                zn00 zn00Var = this.l;
                if (iOrdinal != 3) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(zn00Var.G0(we50.d))), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (!pawVar.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(zn00Var.G0(we50.c))), i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorP2;
                        if (!pawVar2.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                }
            } else {
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new q0w0(iw20.f(this.n, nqh0.f23960a))), i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            }
        } else if (((d190) this.e.f16851a.f10448a).e == pwf0.c) {
            CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
            ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, new q0w0(jh70.j(this.m, false))), i1w0Var, copyOnWriteArrayListQ4, 0);
            while (true) {
                paw pawVar4 = (paw) listIteratorP4;
                if (!pawVar4.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar4.next());
                }
            }
        } else {
            CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
            ListIterator listIteratorP5 = b1j.p(copyOnWriteArrayListQ5, new c8d(y7d.f42146a, new d1w0(this.k.f0())), i1w0Var, copyOnWriteArrayListQ5, 0);
            while (true) {
                paw pawVar5 = (paw) listIteratorP5;
                if (!pawVar5.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar5.next());
                }
            }
        }
    }
}
