package a;

import kotlin.collections.CollectionsKt;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class b0p0 extends i3t0 {
    public static final /* synthetic */ int I = 0;
    public final i1w0 A;
    public final m1e B;
    public final kud C;
    public final duj D;
    public final mne E;
    public bby F;
    public c4m0 G;
    public bby H;
    public final TeamBetScreenParams o;
    public final qgd p;
    public final ywq0 q;
    public final viu r;
    public final hjd s;
    public final j3c t;
    public final luu u;
    public final pru v;
    public final lbu w;
    public final r9u x;
    public final lk5 y;
    public final znt z;

    /* JADX WARN: Illegal instructions before constructor call */
    public b0p0(vzg0 vzg0Var, TeamBetScreenParams teamBetScreenParams, qgd qgdVar, ywq0 ywq0Var, viu viuVar, hjd hjdVar, j3c j3cVar, luu luuVar, pru pruVar, lbu lbuVar, r9u r9uVar, lk5 lk5Var, znt zntVar, i1w0 i1w0Var, m1e m1eVar, kud kudVar, duj dujVar, mne mneVar, ctf0 ctf0Var, y78 y78Var, g2v g2vVar) {
        r9uVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        super(new fno0((byte) 6), g090VarP, new mlb(ctf0Var, y78Var, g2vVar, (byte) 12), (yzn0) null);
        this.o = teamBetScreenParams;
        this.p = qgdVar;
        this.q = ywq0Var;
        this.r = viuVar;
        this.s = hjdVar;
        this.t = j3cVar;
        this.u = luuVar;
        this.v = pruVar;
        this.w = lbuVar;
        this.x = r9uVar;
        this.y = lk5Var;
        this.z = zntVar;
        this.A = i1w0Var;
        this.B = m1eVar;
        this.C = kudVar;
        this.D = dujVar;
        this.E = mneVar;
        i3t0.K(this, null, null, new fwk0(this, null, (byte) 1), 3);
    }

    public final void M(boolean z) {
        Object value;
        Object value2;
        e3c.n(this.F);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, szo0.a((szo0) value2, null, null, null, null, true, 47)));
        }
        boolean z2 = ((szo0) D()).f;
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value = p7m0Var2.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value, szo0.a((szo0) value, null, null, null, null, false, 31)));
        this.F = i3t0.K(this, null, new tfo0(1, this, b0p0.class, "onDataLoadError", "onDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 27), new vnn((Object) this, z2, (yje) null, (byte) 7), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        uid uidVarN0;
        czo0 czo0Var = (czo0) obj;
        czo0Var.getClass();
        super.x(czo0Var);
        boolean z = czo0Var instanceof tyo0;
        byte b = 0;
        mne mneVar = this.E;
        byte b2 = 1;
        yje yjeVar = null;
        if (z) {
            c4m0 c4m0Var = this.G;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.G = sac.T(new fnq(this.B.b(), new a0p0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foe.h);
                return;
            }
            return;
        }
        if (czo0Var instanceof ryo0) {
            e3c.n(this.F);
            e3c.n(this.G);
            e3c.n(this.H);
            return;
        }
        if (czo0Var instanceof syo0) {
            E();
            return;
        }
        if (czo0Var instanceof yyo0) {
            M(false);
            return;
        }
        if (czo0Var instanceof azo0) {
            M(true);
            return;
        }
        boolean z2 = czo0Var instanceof xyo0;
        i1w0 i1w0Var = this.A;
        if (z2) {
            i1w0Var.d(new zzo0(this, b));
            return;
        }
        if (czo0Var instanceof zyo0) {
            sac.V(jiu0.a(this), null, null, mneVar.b, new a0p0(this, yjeVar, b2), 11);
            return;
        }
        if (czo0Var instanceof bzo0) {
            i1w0Var.d(new zzo0(this, b2));
            return;
        }
        if (!(czo0Var instanceof wyo0)) {
            t9f.b();
            return;
        }
        wyo0 wyo0Var = (wyo0) czo0Var;
        if (wyo0Var instanceof vyo0) {
            uidVarN0 = ebc.n0(((vyo0) czo0Var).f38258a);
        } else {
            if (!(wyo0Var instanceof uyo0)) {
                t9f.b();
                return;
            }
            uidVarN0 = ((uyo0) czo0Var).f36501a;
        }
        szo0 szo0Var = (szo0) D();
        i3t0.B(this, this.s, new vid[]{new did(CollectionsKt.q0(q3d.k(szo0Var.f33080a), szo0Var.b)), uidVarN0});
    }
}
