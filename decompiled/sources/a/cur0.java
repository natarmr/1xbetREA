package a;

import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class cur0 extends i3t0 {
    public final int o;
    public final rkt0 p;
    public final i1w0 q;

    public cur0(vzg0 vzg0Var, int i, long j, xsu xsuVar, tqt tqtVar, g2v g2vVar, rkt0 rkt0Var, mne mneVar, ctu ctuVar, i1w0 i1w0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        duo duoVar = new duo(ctuVar, xsuVar, tqtVar, g2vVar, i, j);
        h0j0 h0j0Var = new h0j0(ctf0Var, (byte) 24);
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, duoVar, h0j0Var, cvm0.p(rwjVar, rwjVar));
        this.o = i;
        this.p = rkt0Var;
        this.q = i1w0Var;
    }

    public final void M() {
        i1w0 i1w0Var = this.q;
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

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        vtr0 vtr0Var = (vtr0) obj;
        vtr0Var.getClass();
        super.x(vtr0Var);
        if (vtr0Var.equals(ptr0.f27579a)) {
            Set setV = pgi0.v(pgi0.p(pgi0.h(pgi0.l(new sx3(((ztr0) D()).b, (byte) 1), new t9r0((byte) 19)), new t9r0((byte) 20)), new t9r0((byte) 21)));
            rkt0 rkt0Var = this.p;
            rkt0Var.getClass();
            setV.getClass();
            qoj0 qoj0Var = ((sd80) ((vkr0) rkt0Var.b).e).f32021a;
            Map map = (Map) CollectionsKt.firstOrNull(qoj0Var.d());
            LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            boolean zIsEmpty = setV.isEmpty();
            int i = this.o;
            if (zIsEmpty) {
                linkedHashMap.remove(Integer.valueOf(i));
            } else {
                linkedHashMap.put(Integer.valueOf(i), setV);
            }
            qoj0Var.g(linkedHashMap);
            M();
            return;
        }
        if (vtr0Var.equals(qtr0.f29311a)) {
            M();
            return;
        }
        if (vtr0Var.equals(str0.f32786a)) {
            H(new efr0((byte) 8));
            return;
        }
        if (vtr0Var.equals(ttr0.f34522a)) {
            H(new efr0((byte) 7));
            return;
        }
        if (vtr0Var instanceof rtr0) {
            H(new bur0(((rtr0) vtr0Var).f31090a, this));
        } else if (!(vtr0Var instanceof utr0)) {
            t9f.b();
        } else {
            utr0 utr0Var = (utr0) vtr0Var;
            H(new dv90(utr0Var.f36268a, utr0Var.b, (byte) 4));
        }
    }
}
