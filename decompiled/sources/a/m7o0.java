package a;

import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;

/* JADX INFO: loaded from: classes4.dex */
public final class m7o0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final CyberChampParams o;
    public final m1e p;
    public final fxu q;
    public final pmi r;
    public final reu s;
    public final ctf0 t;
    public final ih5 u;
    public final zr1 v;
    public c4m0 w;
    public long x;
    public bby y;
    public bby z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7o0(vzg0 vzg0Var, CyberChampParams cyberChampParams, mne mneVar, m1e m1eVar, fxu fxuVar, pmi pmiVar, reu reuVar, wgu wguVar, r9u r9uVar, ctf0 ctf0Var, g2v g2vVar, pru pruVar, ih5 ih5Var, zr1 zr1Var) {
        super(new ggg(wguVar, pruVar, r9uVar, (byte) 1), cvm0.p(mneVar.c, mneVar.f22085a), new nej0((Object) ctf0Var, (Object) g2vVar, (Object) cyberChampParams, (byte) 14), (yzn0) null);
        m1eVar.getClass();
        wguVar.getClass();
        ctf0Var.getClass();
        this.o = cyberChampParams;
        this.p = m1eVar;
        this.q = fxuVar;
        this.r = pmiVar;
        this.s = reuVar;
        this.t = ctf0Var;
        this.u = ih5Var;
        this.v = zr1Var;
    }

    public final void M() {
        e3c.n(this.w);
        this.w = i3t0.L(this, new fnq(i120.W(this.p.b()), new z2n0(this, null, (byte) 3), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        x6o0 x6o0Var = (x6o0) obj;
        x6o0Var.getClass();
        super.x(x6o0Var);
        yje yjeVar = null;
        if (!(x6o0Var instanceof s6o0)) {
            if (!(x6o0Var instanceof w6o0)) {
                t9f.b();
                return;
            }
            w6o0 w6o0Var = (w6o0) x6o0Var;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.x;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.y;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.y = i3t0.K(this, null, null, new r72(w6o0Var, this, yjeVar, (byte) 16), 3);
                this.x = jCurrentTimeMillis;
                return;
            }
            return;
        }
        s6o0 s6o0Var = (s6o0) x6o0Var;
        if (s6o0Var.equals(r6o0.f29943a)) {
            M();
            return;
        }
        if (!s6o0Var.equals(q6o0.f28209a)) {
            if (s6o0Var.equals(p6o0.f26466a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        c4m0 c4m0Var = this.w;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar2 = this.z;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
    }
}
