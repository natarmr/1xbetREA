package a;

import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes5.dex */
public final class qyc0 extends w3k {
    public final p7m0 A;
    public final xae0 B;
    public final tac0 c;
    public final epu d;
    public final cpu e;
    public final wou f;
    public final fhj g;
    public final sou h;
    public final mne i;
    public final m1e j;
    public final duj k;
    public final ctf0 l;
    public final ntu m;
    public final yfu n;
    public final iqt o;
    public final pru p;
    public final wtt q;
    public final qho r;
    public boolean s;
    public final toc0 t;
    public final zuc0 u;
    public bby v;
    public c4m0 w;
    public final p7m0 x;
    public final p7m0 y;
    public final p7m0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyc0(vzg0 vzg0Var, tac0 tac0Var, epu epuVar, cpu cpuVar, wou wouVar, fhj fhjVar, sou souVar, mne mneVar, m1e m1eVar, duj dujVar, ctf0 ctf0Var, ntu ntuVar, yfu yfuVar, iqt iqtVar, pru pruVar, wtt wttVar, qho qhoVar) {
        super(vzg0Var, kotlin.collections.a.c(tac0Var));
        epuVar.getClass();
        cpuVar.getClass();
        wouVar.getClass();
        souVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.c = tac0Var;
        this.d = epuVar;
        this.e = cpuVar;
        this.f = wouVar;
        this.g = fhjVar;
        this.h = souVar;
        this.i = mneVar;
        this.j = m1eVar;
        this.k = dujVar;
        this.l = ctf0Var;
        this.m = ntuVar;
        this.n = yfuVar;
        this.o = iqtVar;
        this.p = pruVar;
        this.q = wttVar;
        this.r = qhoVar;
        this.t = pruVar.a().l;
        this.u = pruVar.a().V0;
        dfe dfeVar = dfe.f5996a;
        p7m0 p7m0VarA = q7m0.a(dfeVar);
        this.x = p7m0VarA;
        p7m0 p7m0VarA2 = q7m0.a(dfeVar);
        this.y = p7m0VarA2;
        p7m0 p7m0VarA3 = q7m0.a(dfeVar);
        this.z = p7m0VarA3;
        p7m0 p7m0VarA4 = q7m0.a(dfeVar);
        this.A = p7m0VarA4;
        this.B = vtb.h0(new dnq(dub.e0(p7m0VarA, p7m0VarA2, p7m0VarA3, p7m0VarA4, new oyc0(5, this, qyc0.class, "combineData", "combineData(Lorg/xplatform/promo/impl/settings/presentation/ContentLoadingState;Lorg/xplatform/promo/impl/settings/presentation/ContentLoadingState;Lorg/xplatform/promo/impl/settings/presentation/ContentLoadingState;Lorg/xplatform/promo/impl/settings/presentation/ContentLoadingState;)Ljava/util/List;", 4)), new pr60(3, null, (byte) 19), (byte) 1), d5c.S(jiu0.a(this), mneVar.b), new o6m0(Long.MAX_VALUE), w());
        y();
    }

    public final lc00 w() {
        lc00 lc00VarB = kotlin.collections.a.b();
        toc0 toc0Var = this.t;
        if (toc0Var.k) {
            lc00VarB.add(new n5c0(toc0Var.c, toc0Var.f));
        }
        if (toc0Var.f34278a) {
            lc00VarB.add(l7c0.f19551a);
        }
        lc00VarB.add(s4c0.f31598a);
        lc00VarB.add(new htc0(gtc0.REFERRAL_PROGRAM));
        return kotlin.collections.a.a(lc00VarB);
    }

    public final void x() {
        sac.i0(jiu0.a(this), "PromoCardsWithGamesViewModel.loadBonusGamesData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new a220(this, null, (byte) 14), null, this.i.b, new myc0(this, (byte) 1), null, 592);
    }

    public final void y() {
        bby bbyVar = this.v;
        yje yjeVar = null;
        mne mneVar = this.i;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.v = sac.i0(jiu0.a(this), "PromoCardsWithGamesViewModel.getPromoBannerData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new pyc0(this, yjeVar, (byte) 0), null, mneVar.b, new myc0(this, (byte) 0), null, 592);
        }
        sac.i0(jiu0.a(this), "PromoCardsWithGamesViewModel.loadAdditionalData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new o690((w46) this, yjeVar, (byte) 28), null, mneVar.b, new myc0(this, (byte) 3), null, 592);
        x();
        sac.i0(jiu0.a(this), "PromoCardsWithGamesViewModel.addReferralProgramData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new d7a0(this, yjeVar, (byte) 10), null, mneVar.b, new myc0(this, (byte) 2), null, 592);
    }
}
