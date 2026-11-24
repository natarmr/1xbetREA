package a;

import android.os.Parcelable;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampParams;

/* JADX INFO: loaded from: classes4.dex */
public final class jdt0 extends i3t0 {
    public static final /* synthetic */ int N = 0;
    public final grj A;
    public final vqc B;
    public final pmi0 C;
    public final poq0 D;
    public final m1e E;
    public final ih5 F;
    public final zr1 G;
    public long H;
    public bby I;
    public bby J;
    public bby K;
    public bby L;
    public c4m0 M;
    public final UniversalChampParams o;
    public final mne p;
    public final ctf0 q;
    public final nc0 r;
    public final hzg s;
    public final hjd t;
    public final i1w0 u;
    public final pv00 v;
    public final gr00 w;
    public final yfm0 x;
    public final pyg0 y;
    public final qyg0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public jdt0(pru pruVar, UniversalChampParams universalChampParams, mne mneVar, ctf0 ctf0Var, lbu lbuVar, nc0 nc0Var, luu luuVar, y78 y78Var, svu svuVar, r9u r9uVar, hzg hzgVar, hjd hjdVar, wiu wiuVar, i1w0 i1w0Var, pv00 pv00Var, gr00 gr00Var, yfm0 yfm0Var, pyg0 pyg0Var, qyg0 qyg0Var, grj grjVar, vqc vqcVar, pmi0 pmi0Var, g2v g2vVar, poq0 poq0Var, m1e m1eVar, ih5 ih5Var, zr1 zr1Var) {
        ctf0Var.getClass();
        r9uVar.getClass();
        m1eVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new pg1((Parcelable) universalChampParams, luuVar, lbuVar, pruVar, svuVar, wiuVar, r9uVar, (byte) 15), g090VarP, new mlb(ctf0Var, g2vVar, y78Var, (byte) 13), (yzn0) null);
        this.o = universalChampParams;
        this.p = mneVar;
        this.q = ctf0Var;
        this.r = nc0Var;
        this.s = hzgVar;
        this.t = hjdVar;
        this.u = i1w0Var;
        this.v = pv00Var;
        this.w = gr00Var;
        this.x = yfm0Var;
        this.y = pyg0Var;
        this.z = qyg0Var;
        this.A = grjVar;
        this.B = vqcVar;
        this.C = pmi0Var;
        this.D = poq0Var;
        this.E = m1eVar;
        this.F = ih5Var;
        this.G = zr1Var;
        i3t0.K(this, null, null, new jtr0((Object) this, (yje) null, (byte) 4), 3);
    }

    public final void M() {
        e3c.n(this.M);
        this.M = i3t0.L(this, new fnq(i120.W(this.E.b()), new k6s0(this, null, (byte) 11), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        jdt0 jdt0Var;
        v8t0 v8t0Var = (v8t0) obj;
        v8t0Var.getClass();
        super.x(v8t0Var);
        byte b = 24;
        yje yjeVar = null;
        if (!(v8t0Var instanceof g8t0)) {
            if (!(v8t0Var instanceof u8t0)) {
                t9f.b();
                return;
            }
            u8t0 u8t0Var = (u8t0) v8t0Var;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.H;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.I;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.I = i3t0.K(this, null, null, new r72(u8t0Var, this, yjeVar, b), 3);
                this.H = jCurrentTimeMillis;
                return;
            }
            return;
        }
        g8t0 g8t0Var = (g8t0) v8t0Var;
        if (!g8t0Var.equals(f8t0.f9124a)) {
            if (g8t0Var.equals(e8t0.f7390a)) {
                e3c.n(this.M);
                e3c.n(this.K);
                e3c.n(this.J);
                return;
            } else if (g8t0Var.equals(d8t0.f5668a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        M();
        bby bbyVar2 = this.J;
        if (bbyVar2 == null || !bbyVar2.isActive()) {
            jdt0Var = this;
            jdt0Var.J = i3t0.F(jdt0Var, this.t, this.p.f22085a, null, new i9t0((byte) 5), 118);
        } else {
            jdt0Var = this;
        }
        bby bbyVar3 = jdt0Var.L;
        if (bbyVar3 == null || !bbyVar3.isActive()) {
            jdt0Var.L = i3t0.K(jdt0Var, null, null, new m91(jdt0Var, yjeVar, b), 3);
        }
    }
}
