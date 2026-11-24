package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class wuf0 extends w46 {
    public final b8u b;
    public final ivn c;
    public final pru d;
    public final uf3 e;
    public final sek f;
    public final wsz g;
    public final uuz h;
    public final htz i;
    public final vd1 j;
    public final sa10 k;
    public final duj l;
    public final evz m;
    public final uuz n;
    public final atz o;
    public final i1w0 p;
    public final p7m0 q;
    public final p7m0 r;
    public final p7m0 s;
    public final qoj0 t;
    public bby u;

    public wuf0(b8u b8uVar, ivn ivnVar, pru pruVar, uf3 uf3Var, sek sekVar, wsz wszVar, uuz uuzVar, htz htzVar, vd1 vd1Var, sa10 sa10Var, duj dujVar, evz evzVar, uuz uuzVar2, atz atzVar, i1w0 i1w0Var, m1e m1eVar) {
        i1w0Var.getClass();
        m1eVar.getClass();
        this.b = b8uVar;
        this.c = ivnVar;
        this.d = pruVar;
        this.e = uf3Var;
        this.f = sekVar;
        this.g = wszVar;
        this.h = uuzVar;
        this.i = htzVar;
        this.j = vd1Var;
        this.k = sa10Var;
        this.l = dujVar;
        this.m = evzVar;
        this.n = uuzVar2;
        this.o = atzVar;
        this.p = i1w0Var;
        this.q = q7m0.a(ruf0.f31126a);
        this.r = q7m0.a(vuf0.d);
        this.s = q7m0.a(nuf0.f24144a);
        this.t = ckb.F();
        slb.U(new fnq(m1eVar.b(), new coc0(this, null, (byte) 24), (byte) 4), jiu0.a(this));
    }

    public final void w() {
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.u = sac.V(jiu0.a(this), new luf0(this, (byte) 0), new muf0(this, (byte) 0), null, new kpb0(this, null, (byte) 10), 12);
        }
    }

    public final void x() {
        i1w0 i1w0Var = this.p;
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

    public final void y() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.s;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new ouf0(sa10.b(this.k, pb10.g, R.string.data_retrieval_error, 0, null, 28))));
    }
}
