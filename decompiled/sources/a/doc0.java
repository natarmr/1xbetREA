package a;

import java.io.Serializable;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes5.dex */
public final class doc0 extends w3k {
    public final tac0 c;
    public final kpu d;
    public final wou e;
    public final epu f;
    public final cpu g;
    public final pru h;
    public final mne i;
    public final m1e j;
    public final ctf0 k;
    public final yfu l;
    public final o3c m;
    public final wtt n;
    public final qho o;
    public final toc0 p;
    public boolean q;
    public bby r;
    public c4m0 s;
    public final p7m0 t;
    public final p7m0 u;
    public final xae0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doc0(vzg0 vzg0Var, tac0 tac0Var, kpu kpuVar, wou wouVar, epu epuVar, cpu cpuVar, pru pruVar, mne mneVar, m1e m1eVar, ctf0 ctf0Var, yfu yfuVar, o3c o3cVar, wtt wttVar, qho qhoVar) {
        super(vzg0Var, kotlin.collections.a.c(tac0Var));
        kpuVar.getClass();
        wouVar.getClass();
        epuVar.getClass();
        cpuVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.c = tac0Var;
        this.d = kpuVar;
        this.e = wouVar;
        this.f = epuVar;
        this.g = cpuVar;
        this.h = pruVar;
        this.i = mneVar;
        this.j = m1eVar;
        this.k = ctf0Var;
        this.l = yfuVar;
        this.m = o3cVar;
        this.n = wttVar;
        this.o = qhoVar;
        this.p = pruVar.a().l;
        dfe dfeVar = dfe.f5996a;
        p7m0 p7m0VarA = q7m0.a(dfeVar);
        this.t = p7m0VarA;
        p7m0 p7m0VarA2 = q7m0.a(dfeVar);
        this.u = p7m0VarA2;
        this.v = vtb.h0(new dnq(new p6d(p7m0VarA, p7m0VarA2, new aoc0(3, this, doc0.class, "combineData", "combineData(Lorg/xplatform/promo/impl/settings/presentation/ContentLoadingState;Lorg/xplatform/promo/impl/settings/presentation/ContentLoadingState;)Ljava/util/List;", 4), (byte) 1), new pr60(3, null, (byte) 17), (byte) 1), d5c.S(jiu0.a(this), mneVar.b), new o6m0(Long.MAX_VALUE), w());
        y();
    }

    public final lc00 w() {
        lc00 lc00VarB = kotlin.collections.a.b();
        toc0 toc0Var = this.p;
        if (toc0Var.k) {
            lc00VarB.add(new n5c0(toc0Var.c, toc0Var.f));
        }
        if (toc0Var.y) {
            lc00VarB.add(new htc0(gtc0.CHAMPIONS_CLUB));
        }
        lc00VarB.add(new htc0(gtc0.SPORT_CASHBACK_CP));
        lc00VarB.add(new htc0(gtc0.BONUS_GAMES));
        lc00VarB.add(new htc0(gtc0.PROMO_CODE_CHECK));
        lc00VarB.add(new htc0(gtc0.CASHBACK));
        lc00VarB.add(new htc0(gtc0.VIP_CASHBACK));
        lc00VarB.add(new htc0(gtc0.REGISTRATION_BONUS_PARTICIPATION));
        lc00VarB.add(new htc0(gtc0.PROMO_PARTICIPATION));
        lc00VarB.add(new htc0(gtc0.BONUSES));
        lc00VarB.add(new htc0(gtc0.REFERRAL_PROGRAM));
        return kotlin.collections.a.a(lc00VarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable x(zje zjeVar) {
        boc0 boc0Var;
        Serializable g0g0Var;
        if (zjeVar instanceof boc0) {
            boc0Var = (boc0) zjeVar;
            int i = boc0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                boc0Var.l = i - Integer.MIN_VALUE;
            } else {
                boc0Var = new boc0(this, zjeVar);
            }
        } else {
            boc0Var = new boc0(this, zjeVar);
        }
        Object obj = boc0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = boc0Var.l;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                o3c o3cVar = this.m;
                boc0Var.i = this;
                boc0Var.l = 1;
                if (o3c.p(o3cVar, false, boc0Var, 3) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = boc0Var.i;
                z1x.P(obj);
            }
            g0g0Var = Boolean.valueOf(!this.n.a());
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? Boolean.FALSE : g0g0Var;
    }

    public final void y() {
        z(true, true);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = this.i.b;
        l8c0 l8c0Var = new l8c0(1, this.c, tac0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26);
        sac.i0(bvcVarA, "PromoPlainListViewModel.loadPlainListWithData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new dd70(this, null, (byte) 1), null, dvjVar, l8c0Var, null, 592);
    }

    public final void z(boolean z, boolean z2) {
        bby bbyVar = this.r;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.r = sac.i0(jiu0.a(this), "PromoPlainListViewModel.loadPlainListWithData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new a220((Object) this, z2, (yje) null, (byte) 12), null, this.i.b, new ij90(z, (Object) this, (byte) 3), null, 592);
        }
    }
}
