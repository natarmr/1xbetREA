package a;

import kotlin.Unit;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedGameItemsScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class uhs extends i3t0 {
    public static final /* synthetic */ int J = 0;
    public final r9u A;
    public final spc B;
    public final n0o0 C;
    public final qz40 D;
    public bby E;
    public final c4m0 F;
    public c4m0 G;
    public bby H;
    public final boolean I;
    public final FeedGameItemsScreenParams o;
    public final pzu p;
    public final hjd q;
    public final j3c r;
    public final luu s;
    public final imf0 t;
    public final pru u;
    public final m1e v;
    public final mne w;
    public final duj x;
    public final svu y;
    public final imf0 z;

    public uhs(vzg0 vzg0Var, FeedGameItemsScreenParams feedGameItemsScreenParams, pzu pzuVar, g2v g2vVar, hjd hjdVar, ctf0 ctf0Var, y78 y78Var, j3c j3cVar, luu luuVar, rpt rptVar, imf0 imf0Var, pru pruVar, m1e m1eVar, mne mneVar, duj dujVar, svu svuVar, imf0 imf0Var2, r9u r9uVar, spc spcVar, lbu lbuVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(vs10Var, rwjVar);
        byte b = 1;
        jcs jcsVar = new jcs(feedGameItemsScreenParams, b);
        mlb mlbVar = new mlb(ctf0Var, y78Var, g2vVar, (byte) 7);
        yje yjeVar = null;
        super(jcsVar, g090VarP, mlbVar, (yzn0) null);
        this.o = feedGameItemsScreenParams;
        this.p = pzuVar;
        this.q = hjdVar;
        this.r = j3cVar;
        this.s = luuVar;
        this.t = imf0Var;
        this.u = pruVar;
        this.v = m1eVar;
        this.w = mneVar;
        this.x = dujVar;
        this.y = svuVar;
        this.z = imf0Var2;
        this.A = r9uVar;
        this.B = spcVar;
        this.C = maz.b(new jcs(this, (byte) 2));
        this.D = vzg0Var.b();
        this.I = lbuVar.j();
        i3t0.K(this, null, null, new shs(this, yjeVar, b), 3);
        c4m0 c4m0Var = this.F;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.F = sac.T(new fnq(rptVar.d(), new phs(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), ths.h);
        }
    }

    public final void M(boolean z) {
        e3c.n(this.E);
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            boolean z2 = z;
            if (p7m0Var.m(value, cis.a((cis) value, null, null, ais.f939a, null, z2, false, 107))) {
                this.E = i3t0.K(this, null, new g7p((Object) this, (byte) 22), new shs(this, null, (byte) 0), 1);
                return;
            }
            z = z2;
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        uid uidVarN0;
        ohs ohsVar = (ohs) obj;
        ohsVar.getClass();
        super.x(ohsVar);
        byte b = 4;
        yje yjeVar = null;
        if (ohsVar.equals(lhs.f20072a) || ohsVar.equals(mhs.f21810a) || (ohsVar instanceof jhs) || (ohsVar instanceof ihs)) {
            i3t0.K(this, null, null, new epp(this, yjeVar, b), 3);
        } else if (!ohsVar.equals(nhs.f23549a) && !ohsVar.equals(hhs.f13080a) && !ohsVar.equals(fhs.f9557a) && !ohsVar.equals(ghs.f11315a)) {
            t9f.b();
            return;
        }
        byte b2 = 2;
        if (ohsVar instanceof hhs) {
            c4m0 c4m0Var = this.G;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.G = sac.T(new fnq(this.v.b(), new gkr(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), this.w.f22085a), foe.h);
                return;
            }
            return;
        }
        if (ohsVar instanceof fhs) {
            e3c.n(this.E);
            e3c.n(this.G);
            e3c.n(this.H);
            return;
        }
        if (ohsVar instanceof ghs) {
            E();
            return;
        }
        if (ohsVar instanceof lhs) {
            M(false);
            return;
        }
        if (ohsVar instanceof mhs) {
            M(true);
            return;
        }
        if (ohsVar instanceof nhs) {
            this.z.f15023a.f13218a.b.f(Unit.f46060a);
            return;
        }
        if (!(ohsVar instanceof khs)) {
            t9f.b();
            return;
        }
        khs khsVar = (khs) ohsVar;
        if (khsVar instanceof jhs) {
            uidVarN0 = ebc.n0(((jhs) ohsVar).f16543a);
        } else {
            if (!(khsVar instanceof ihs)) {
                t9f.b();
                return;
            }
            uidVarN0 = ((ihs) ohsVar).f14796a;
        }
        i3t0.B(this, this.q, new vid[]{new did(((cis) D()).b), uidVarN0});
    }
}
