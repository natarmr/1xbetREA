package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.playersduel.impl.presentation.players_duel.screen.PlayersDuelParams;

/* JADX INFO: loaded from: classes5.dex */
public final class b3a0 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final PlayersDuelParams o;
    public final i1w0 p;
    public final yk50 q;
    public final vpu r;
    public final g7u s;
    public final yfu t;
    public final c4m0 u;
    public c4m0 v;
    public final c4m0 w;

    /* JADX WARN: Illegal instructions before constructor call */
    public b3a0(mne mneVar, PlayersDuelParams playersDuelParams, lbu lbuVar, ivn ivnVar, ocl oclVar, i1w0 i1w0Var, hbu hbuVar, reu reuVar, yk50 yk50Var, vpu vpuVar, vpu vpuVar2, g7u g7uVar, yfu yfuVar, m1e m1eVar) {
        m1eVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.f22085a, mneVar.c);
        yje yjeVar = null;
        super(new qw80((Object) ivnVar, (Object) lbuVar, (byte) 13), g090VarP, new ka70(playersDuelParams, oclVar, (byte) 22), (yzn0) null);
        this.o = playersDuelParams;
        this.p = i1w0Var;
        this.q = yk50Var;
        this.r = vpuVar;
        this.s = g7uVar;
        this.t = yfuVar;
        c4m0 c4m0Var = this.w;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.w = i3t0.L(this, new fnq(m1eVar.b(), new a3a0(this, yjeVar, (byte) 0), (byte) 4), null, null, 3);
        }
        i3t0.L(this, new fnq(vpuVar2.a(), new a3a0(this, yjeVar, b), (byte) 4), null, null, 3);
        c4m0 c4m0Var2 = this.u;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            this.u = i3t0.L(this, new p6d(new va(hbuVar.f12788a.f14642a.b, (byte) 13), new va(((ien) reuVar.b).f14642a.b, (byte) 14), new wx4((Object) this, yjeVar, (byte) 29), (byte) 1), null, null, 3);
        }
    }

    public final void M() {
        c4m0 c4m0Var = this.v;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        PlayersDuelParams playersDuelParams = this.o;
        boolean z = playersDuelParams.c;
        long j = playersDuelParams.b;
        fga0 fga0Var = (fga0) this.t.f42558a;
        or30 or30Var = fga0Var.d.f30377a;
        uen uenVar = wen.b;
        this.v = i3t0.L(this, new fnq(ulb.L(gfx.R(or30Var, ibc.w0(z ? 8L : 30L, bfn.SECONDS), null, new m92(fga0Var, z, j, null), 220), fga0Var.c.b), new s980(this, yjeVar, (byte) 15), (byte) 4), null, new z2a0(this, (byte) 0), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        w1a0 w1a0Var = (w1a0) obj;
        w1a0Var.getClass();
        super.x(w1a0Var);
        if (w1a0Var instanceof p1a0) {
            E();
            return;
        }
        boolean z = w1a0Var instanceof r1a0;
        i1w0 i1w0Var = this.p;
        if (z) {
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
        } else {
            if (w1a0Var instanceof t1a0) {
                if (!this.q.g()) {
                    i1w0Var.d(new z2a0(this, (byte) 1));
                    return;
                } else {
                    i3t0.K(this, null, null, new epp(this, null, (byte) 21), 3);
                    return;
                }
            }
            if (w1a0Var instanceof v1a0) {
                G(new h2a0(((v1a0) w1a0Var).f36621a));
                return;
            }
            if (w1a0Var instanceof s1a0) {
                G(new m2a0(((s1a0) w1a0Var).f31446a));
                return;
            }
            if (w1a0Var instanceof u1a0) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, p2a0.a((p2a0) value, false, null, null, false, 31)));
                M();
                return;
            }
            if (!(w1a0Var instanceof q1a0)) {
                t9f.b();
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ2, 0);
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
