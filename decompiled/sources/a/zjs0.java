package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zjs0 extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final duj o;
    public final x4u p;
    public final i1w0 q;
    public final String r;
    public final mne s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjs0(duj dujVar, x4u x4uVar, m1e m1eVar, i1w0 i1w0Var, ocl oclVar, String str, mne mneVar, ctf0 ctf0Var) {
        super(null, new yqr0((byte) 23), new gpb0(oclVar, ctf0Var, (byte) 20), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = dujVar;
        this.p = x4uVar;
        this.q = i1w0Var;
        this.r = str;
        this.s = mneVar;
        sac.T(new fnq(m1eVar.b(), new yjs0(this, null, (byte) 0), (byte) 4), d5c.S(d5c.S(jiu0.a(this), mneVar.b), new ax5(this)), foe.h);
        M();
    }

    public final void M() {
        Object value;
        byte b;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            b = 1;
        } while (!p7m0Var.m(value, tjs0.a((tjs0) value, true, false)));
        sac.V(jiu0.a(this), new lcr0(this, (byte) 18), null, this.s.b, new yjs0(this, null, b), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ljs0 ljs0Var = (ljs0) obj;
        ljs0Var.getClass();
        super.x(ljs0Var);
        if (!ljs0Var.equals(jjs0.f16634a)) {
            if (ljs0Var.equals(kjs0.f18402a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
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
}
