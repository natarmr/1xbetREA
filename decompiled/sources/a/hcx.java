package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class hcx extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final e1u o;
    public final String p;
    public final i1w0 q;
    public final ctf0 r;
    public final mne s;
    public c4m0 t;
    public bby u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcx(e1u e1uVar, m1e m1eVar, String str, i1w0 i1w0Var, ctf0 ctf0Var, ocl oclVar, mne mneVar) {
        super(null, new kdw((byte) 29), new yar(oclVar, (byte) 2), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = e1uVar;
        this.p = str;
        this.q = i1w0Var;
        this.r = ctf0Var;
        this.s = mneVar;
        sac.T(new fnq(m1eVar.b(), new gcx(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
    }

    public final void M(boolean z) {
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.u = sac.V(jiu0.a(this), new adw(this, (byte) 14), null, this.s.b, new u88((Object) this, z, (yje) null, (byte) 22), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        tbx tbxVar = (tbx) obj;
        tbxVar.getClass();
        if (!tbxVar.equals(rbx.f30211a)) {
            if (tbxVar.equals(sbx.f31959a)) {
                M(true);
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
