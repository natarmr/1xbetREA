package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class hq7 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final mne o;
    public final gr00 p;
    public final duj q;
    public final m1e r;
    public final xp7 s;
    public final sbx0 t;
    public final h3c u;
    public bby v;
    public bby w;
    public c4m0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq7(mne mneVar, gr00 gr00Var, duj dujVar, m1e m1eVar, xp7 xp7Var, i1w0 i1w0Var, sbx0 sbx0Var, bzt bztVar, pru pruVar, h3c h3cVar, r9u r9uVar) {
        super(null, new kk0(sbx0Var, pruVar, r9uVar, (byte) 10), new ce0(bztVar, (byte) 2), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        xp7Var.getClass();
        r9uVar.getClass();
        this.o = mneVar;
        this.p = gr00Var;
        this.q = dujVar;
        this.r = m1eVar;
        this.s = xp7Var;
        this.t = sbx0Var;
        this.u = h3cVar;
        this.y = true;
        M();
    }

    public final void M() {
        bby bbyVar = this.v;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        this.v = sac.V(jiu0.a(this), new ye7(1, this, hq7.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, this.o.b, new fq7(this, null, (byte) 0), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        jp7 jp7Var = (jp7) obj;
        jp7Var.getClass();
        boolean z2 = jp7Var instanceof dp7;
        byte b = 0;
        gr00 gr00Var = this.p;
        if (!z2) {
            if (jp7Var instanceof hp7) {
                String str = (String) this.t.c;
                gr00Var.getClass();
                str.getClass();
                ((oeg0) gr00Var.f11760a).c().d(new op7(gr00Var, str, b));
                return;
            }
            boolean z3 = jp7Var instanceof ep7;
            mne mneVar = this.o;
            if (z3) {
                ep7 ep7Var = (ep7) jp7Var;
                if (!ep7Var.d) {
                    i3t0.K(this, null, null, new za(this, ep7Var, null, (byte) 25), 3);
                    return;
                }
                long j = ep7Var.f8173a;
                long j2 = ep7Var.b;
                bby bbyVar = this.w;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.w = sac.V(jiu0.a(this), new ye7(1, this, hq7.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, mneVar.f22085a, new l87(this, j, j2, null, (byte) 1), 10);
                    return;
                }
                return;
            }
            if (jp7Var instanceof ip7) {
                ip7 ip7Var = (ip7) jp7Var;
                long j3 = ip7Var.f15148a;
                long j4 = ip7Var.c;
                long j5 = ip7Var.d;
                long j6 = ip7Var.b;
                String str2 = ip7Var.e;
                boolean z4 = ip7Var.f;
                gr00Var.getClass();
                ((oeg0) gr00Var.f11760a).c().d(new rp7(gr00Var, j3, j6, str2, j4, j5, z4));
                return;
            }
            if (jp7Var instanceof gp7) {
                bby bbyVar2 = this.v;
                if (bbyVar2 != null) {
                    v3c.N(bbyVar2);
                }
                bby bbyVar3 = this.w;
                if (bbyVar3 != null) {
                    v3c.N(bbyVar3);
                }
                c4m0 c4m0Var = this.x;
                if (c4m0Var != null) {
                    v3c.N(c4m0Var);
                }
                M();
                return;
            }
            if (jp7Var instanceof fp7) {
                G(yp7.f43018a);
                return;
            }
            boolean z5 = jp7Var instanceof bp7;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z5) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, zp7.a((zp7) value2, null, false, false, false, 1015)));
                return;
            }
            if (jp7Var instanceof cp7) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, zp7.a((zp7) value, null, false, false, true, 1015)));
                return;
            }
            if (jp7Var instanceof yo7) {
                c4m0 c4m0Var2 = this.x;
                if (c4m0Var2 != null) {
                    v3c.N(c4m0Var2);
                    return;
                }
                return;
            }
            if (!(jp7Var instanceof ap7)) {
                if (jp7Var instanceof zo7) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            c4m0 c4m0Var3 = this.x;
            if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                this.x = sac.T(new fnq(this.r.b(), new fq7(this, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), gq7.h);
                return;
            }
            return;
        }
        i1w0 i1w0VarC = ((oeg0) gr00Var.f11760a).c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }
}
