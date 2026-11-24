package a;

import kotlin.Unit;
import org.xplatform.feed.linelive.presentation.feeds.child.liveexpress.models.LiveExpressItemsScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class qi00 extends i3t0 {
    public static final /* synthetic */ int I = 0;
    public final r9u A;
    public final spc B;
    public final n0o0 C;
    public bby D;
    public final c4m0 E;
    public c4m0 F;
    public bby G;
    public final boolean H;
    public final vzg0 o;
    public final LiveExpressItemsScreenParams p;
    public final hjd q;
    public final xzp r;
    public final j3c s;
    public final luu t;
    public final pru u;
    public final m1e v;
    public final mne w;
    public final duj x;
    public final svu y;
    public final imf0 z;

    public qi00(vzg0 vzg0Var, LiveExpressItemsScreenParams liveExpressItemsScreenParams, g2v g2vVar, hjd hjdVar, ctf0 ctf0Var, y78 y78Var, xzp xzpVar, j3c j3cVar, luu luuVar, rpt rptVar, pru pruVar, m1e m1eVar, mne mneVar, duj dujVar, svu svuVar, imf0 imf0Var, r9u r9uVar, spc spcVar, lbu lbuVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(vs10Var, rwjVar);
        mbz mbzVar = new mbz(liveExpressItemsScreenParams, vzg0Var, (byte) 11);
        mlb mlbVar = new mlb(ctf0Var, y78Var, g2vVar, (byte) 9);
        yje yjeVar = null;
        super(mbzVar, g090VarP, mlbVar, (yzn0) null);
        this.o = vzg0Var;
        this.p = liveExpressItemsScreenParams;
        this.q = hjdVar;
        this.r = xzpVar;
        this.s = j3cVar;
        this.t = luuVar;
        this.u = pruVar;
        this.v = m1eVar;
        this.w = mneVar;
        this.x = dujVar;
        this.y = svuVar;
        this.z = imf0Var;
        this.A = r9uVar;
        this.B = spcVar;
        this.C = maz.b(new rcz(this, (byte) 22));
        this.H = lbuVar.j();
        i3t0.K(this, null, null, new bu(this, yjeVar, (byte) 10), 3);
        c4m0 c4m0Var = this.E;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.E = sac.T(new fnq(rptVar.d(), new kaw(this, yjeVar, (byte) 20), (byte) 4), d5c.S(jiu0.a(this), rwjVar), pi00.h);
        }
    }

    public final void M(boolean z) {
        Object value;
        e3c.n(this.D);
        if (z) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, nj00.a((nj00) value, null, null, null, null, null, true, null, false, 479)));
        }
        this.D = i3t0.K(this, null, new ebz(this, (byte) 27), new oi00(this, null, (byte) 0), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        uid uidVarN0;
        ki00 ki00Var = (ki00) obj;
        ki00Var.getClass();
        super.x(ki00Var);
        yje yjeVar = null;
        byte b = 1;
        if (ki00Var.equals(hi00.f13090a) || ki00Var.equals(ii00.f14806a) || (ki00Var instanceof fi00) || (ki00Var instanceof ei00)) {
            i3t0.K(this, null, null, new oi00(this, yjeVar, b), 3);
        } else if (!ki00Var.equals(ji00.f16553a) && !ki00Var.equals(di00.f6117a) && !ki00Var.equals(bi00.f2635a) && !ki00Var.equals(ci00.f4389a)) {
            t9f.b();
            return;
        }
        boolean z = ki00Var instanceof di00;
        mne mneVar = this.w;
        if (z) {
            c4m0 c4m0Var = this.F;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.F = sac.T(new fnq(this.v.b(), new slx(this, yjeVar, (byte) 17), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foe.h);
                return;
            }
            return;
        }
        if (ki00Var instanceof bi00) {
            e3c.n(this.D);
            e3c.n(this.F);
            e3c.n(this.G);
            return;
        }
        if (ki00Var instanceof ci00) {
            E();
            return;
        }
        if (ki00Var instanceof hi00) {
            M(false);
            return;
        }
        if (ki00Var instanceof ii00) {
            M(true);
            return;
        }
        if (ki00Var instanceof ji00) {
            this.z.f15023a.f13218a.b.f(Unit.f46060a);
            return;
        }
        if (!(ki00Var instanceof gi00)) {
            t9f.b();
            return;
        }
        gi00 gi00Var = (gi00) ki00Var;
        if (gi00Var instanceof fi00) {
            uidVarN0 = ebc.n0(((fi00) ki00Var).f9564a);
        } else {
            if (!(gi00Var instanceof ei00)) {
                t9f.b();
                return;
            }
            uidVarN0 = ((ei00) ki00Var).f7834a;
        }
        uid uidVar = uidVarN0;
        if (uidVar instanceof qid) {
            sac.V(jiu0.a(this), new w800((byte) 8), null, mneVar.b, new yg1(this, ((qid) uidVar).f28786a, yjeVar, (byte) 16), 10);
        }
        i3t0.B(this, this.q, new vid[]{new did(((nj00) D()).c), uidVar});
    }
}
