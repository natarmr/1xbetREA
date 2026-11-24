package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class ecr0 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public final c4m0 A;
    public bby B;
    public c4m0 C;
    public bby D;
    public final String o;
    public final long p;
    public final yfu q;
    public final duj r;
    public final mne s;
    public final wyu t;
    public final i1w0 u;
    public final jwu v;
    public final qzt w;
    public final fhj x;
    public final f7u y;
    public bby z;

    public ecr0(String str, long j, yfu yfuVar, m1e m1eVar, ocl oclVar, duj dujVar, mne mneVar, uyu uyuVar, wyu wyuVar, i1w0 i1w0Var, weu weuVar, jwu jwuVar, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, f7u f7uVar, r9u r9uVar) {
        m1eVar.getClass();
        wyuVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        sla0 sla0Var = new sla0(qztVar, weuVar, str, fhjVar, j, wyuVar, (byte) 3);
        tla0 tla0Var = new tla0(oclVar, ctf0Var, r9uVar, (byte) 9);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, sla0Var, tla0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = yfuVar;
        this.r = dujVar;
        this.s = mneVar;
        this.t = wyuVar;
        this.u = i1w0Var;
        this.v = jwuVar;
        this.w = qztVar;
        this.x = fhjVar;
        this.y = f7uVar;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new bcr0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), dcr0.h);
        c4m0 c4m0Var = this.A;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.A = sac.T(new fnq(m1eVar.b(), new ybr0(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new bcr0(this, yjeVar, (byte) 0));
        }
        N();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.z;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, tbr0.a((tbr0) value, null, null, null, true, false, false, null, 103)));
            this.z = sac.V(jiu0.a(this), new nop0((Object) this, (byte) 28), null, this.s.f22085a, new ybr0(this, null, (byte) 0), 10);
        }
    }

    public final void N() {
        c4m0 c4m0Var;
        bby bbyVar;
        bby bbyVar2 = this.B;
        byte b = 1;
        yje yjeVar = null;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.B) != null) {
            bbyVar.cancel(null);
        }
        boolean z = ((tbr0) D()).f;
        mne mneVar = this.s;
        this.B = z ? sac.X(jiu0.a(this), 30L, mneVar.b, zbr0.f44130a, new ybr0(this, yjeVar, b)) : sac.V(jiu0.a(this), acr0.f642a, null, mneVar.b, new ybr0(this, yjeVar, (byte) 2), 10);
        c4m0 c4m0Var2 = this.C;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.C) != null) {
            c4m0Var.cancel(null);
        }
        this.C = sac.T(new fnq(this.y.n(this.o), new otp0(this, this.w.a(), (yje) null, (byte) 3), (byte) 4), jiu0.a(this), ccr0.h);
        M();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        nbr0 nbr0Var = (nbr0) obj;
        nbr0Var.getClass();
        super.x(nbr0Var);
        if (!nbr0Var.equals(lbr0.f19765a)) {
            if (nbr0Var.equals(mbr0.f21522a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0Var = this.u;
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
