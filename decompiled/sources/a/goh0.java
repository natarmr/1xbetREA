package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class goh0 extends i3t0 {
    public final i1w0 o;
    public final pru p;

    public goh0(i1w0 i1w0Var, nqh0 nqh0Var, ctf0 ctf0Var, pru pruVar, mne mneVar) {
        ctf0Var.getClass();
        x6h0 x6h0Var = new x6h0(ctf0Var, nqh0Var, (byte) 4);
        eoh0 eoh0Var = new eoh0((byte) 0);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, x6h0Var, eoh0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = i1w0Var;
        this.p = pruVar;
        sac.V(jiu0.a(this), foh0.f9880a, null, rwjVar, new tmg0(this, null, (byte) 3), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        sph0 sph0Var = (sph0) obj;
        sph0Var.getClass();
        super.x(sph0Var);
        if (sph0Var instanceof rph0) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, yph0.a((yph0) value, null, ((rph0) sph0Var).f30887a, 3)));
            return;
        }
        if (!(sph0Var instanceof qph0)) {
            t9f.b();
            return;
        }
        i1w0 i1w0Var = this.o;
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
