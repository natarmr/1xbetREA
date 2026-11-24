package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class kje0 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final duj o;
    public final reu p;
    public final i1w0 q;
    public final String r;
    public final mne s;
    public bby t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kje0(duj dujVar, reu reuVar, m1e m1eVar, i1w0 i1w0Var, ocl oclVar, String str, mne mneVar, r9u r9uVar) {
        super(null, new o6e0((byte) 12), new xuh(oclVar, r9uVar, (byte) 11), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        r9uVar.getClass();
        this.o = dujVar;
        this.p = reuVar;
        this.q = i1w0Var;
        this.r = str;
        this.s = mneVar;
        sac.T(new fnq(m1eVar.b(), new jje0(this, null, (byte) 0), (byte) 4), d5c.S(d5c.S(jiu0.a(this), mneVar.b), new ax5(this)), foe.h);
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.t;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, dje0.a((dje0) value, true, false)));
            this.t = sac.V(jiu0.a(this), new v6d0(this, (byte) 26), null, this.s.b, new jje0(this, null, b), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        wie0 wie0Var = (wie0) obj;
        wie0Var.getClass();
        super.x(wie0Var);
        if (!wie0Var.equals(uie0.f35727a)) {
            if (wie0Var.equals(vie0.f37474a)) {
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
