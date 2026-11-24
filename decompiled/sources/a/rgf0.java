package a;

import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class rgf0 extends i3t0 {
    public final pyu o;
    public final i1w0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgf0(mne mneVar, ctf0 ctf0Var, pyu pyuVar, i1w0 i1w0Var, dot dotVar) {
        Object value;
        super(null, new b4f0((byte) 8), new iv80(ctf0Var, (byte) 24), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = pyuVar;
        this.p = i1w0Var;
        Map mapE = ((vff0) pyuVar.f27815a).e();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, pgf0.a((pgf0) value, mapE, null, null, null, 14)));
        dotVar.f6428a.f15748a.f21021a.f("TEST_REMOTE_CONFIG_LAST_ACTION_TIME", System.currentTimeMillis());
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        cgf0 cgf0Var;
        Object value4;
        hgf0 hgf0Var = (hgf0) obj;
        hgf0Var.getClass();
        if (!hgf0Var.equals(bgf0.f2553a)) {
            if (hgf0Var instanceof egf0) {
                G(new mgf0(((egf0) hgf0Var).f7762a));
                return;
            }
            if (hgf0Var.equals(agf0.f822a)) {
                E();
                return;
            }
            boolean z = hgf0Var instanceof fgf0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value4, pgf0.a((pgf0) value4, null, ((fgf0) hgf0Var).f9490a, null, null, 13)));
                return;
            }
            if (hgf0Var.equals(ggf0.f11252a)) {
                G(new ngf0(((pgf0) D()).c, ((pgf0) D()).d));
                return;
            }
            boolean z2 = hgf0Var instanceof cgf0;
            pyu pyuVar = this.o;
            if (!z2) {
                if (!hgf0Var.equals(dgf0.f6040a)) {
                    t9f.b();
                    return;
                }
                Map mapE = ((vff0) pyuVar.f27815a).e();
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, pgf0.a((pgf0) value, mapE, null, null, null, 14)));
                return;
            }
            Map mapE2 = ((vff0) pyuVar.f27815a).e();
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, pgf0.a((pgf0) value2, mapE2, null, null, null, 14)));
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value3 = p7m0Var4.getValue();
                value3.getClass();
                oyg0Var.getClass();
                cgf0Var = (cgf0) hgf0Var;
            } while (!p7m0Var4.m(value3, pgf0.a((pgf0) value3, null, null, cgf0Var.f4310a, cgf0Var.b, 3)));
            return;
        }
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
}
