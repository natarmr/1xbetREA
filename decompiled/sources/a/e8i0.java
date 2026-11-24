package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class e8i0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final i1w0 o;
    public final ctf0 p;
    public final duj q;
    public final rou r;
    public final csi0 s;
    public final jtu t;
    public final mne u;
    public bby v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8i0(vzg0 vzg0Var, i1w0 i1w0Var, ctf0 ctf0Var, duj dujVar, rou rouVar, csi0 csi0Var, jtu jtuVar, ocl oclVar, mne mneVar) {
        super(vzg0Var, new eoh0((byte) 18), new gpb0(ctf0Var, oclVar, (byte) 7), cvm0.p(mneVar.c, mneVar.f22085a));
        ctf0Var.getClass();
        csi0Var.getClass();
        jtuVar.getClass();
        this.o = i1w0Var;
        this.p = ctf0Var;
        this.q = dujVar;
        this.r = rouVar;
        this.s = csi0Var;
        this.t = jtuVar;
        this.u = mneVar;
        I(mneVar.b, new d8i0(this, (byte) 0), new hhb0(this, null, (byte) 8));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        m7i0 m7i0Var = (m7i0) obj;
        m7i0Var.getClass();
        super.x(m7i0Var);
        boolean zEquals = m7i0Var.equals(i7i0.f14293a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.o;
        byte b = 1;
        if (zEquals) {
            bby bbyVar = this.v;
            if (bbyVar != null && bbyVar.isActive()) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!m7i0Var.equals(j7i0.f16042a)) {
                if (m7i0Var.equals(k7i0.f17822a)) {
                    G(y7i0.f42153a);
                    return;
                }
                if (!m7i0Var.equals(l7i0.f19560a)) {
                    if (m7i0Var.equals(h7i0.f12575a)) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                bby bbyVar2 = this.v;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    d9i0 d9i0Var = this.t.f17119a.c.b;
                    if (d9i0Var.f5702a == 0 || StringsKt.W(d9i0Var.b)) {
                        return;
                    }
                    this.v = I(this.u.b, new d8i0(this, b), new hr(this, d9i0Var, null, (byte) 27));
                    return;
                }
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
