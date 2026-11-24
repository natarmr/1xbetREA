package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.promo.impl.promocodes.navigation.PromoCodesScreenFactory$getPromoShopDetailScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class hyc0 extends w3k {
    public final zuc0 A;
    public bby B;
    public bby C;
    public c4m0 D;
    public final p7m0 E;
    public final p7m0 F;
    public final p7m0 G;
    public final p7m0 H;
    public final p7m0 I;
    public final p7m0 J;
    public final ol60 K;
    public final xae0 L;
    public final tac0 c;
    public final epu d;
    public final cpu e;
    public final uou f;
    public final fhj g;
    public final sou h;
    public final hnu i;
    public final nou j;
    public final j910 k;
    public final mne l;
    public final m1e m;
    public final duj n;
    public final ctf0 o;
    public final ntu p;
    public final yfu q;
    public final iqt r;
    public final pru s;
    public final x20 t;
    public final b4j u;
    public final bbw0 v;
    public final wtt w;
    public final qho x;
    public boolean y;
    public final toc0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyc0(vzg0 vzg0Var, tac0 tac0Var, epu epuVar, cpu cpuVar, uou uouVar, fhj fhjVar, sou souVar, hnu hnuVar, nou nouVar, j910 j910Var, mne mneVar, m1e m1eVar, duj dujVar, ctf0 ctf0Var, ntu ntuVar, yfu yfuVar, iqt iqtVar, pru pruVar, x20 x20Var, b4j b4jVar, bbw0 bbw0Var, wtt wttVar, qho qhoVar) {
        super(vzg0Var, kotlin.collections.a.c(tac0Var));
        epuVar.getClass();
        cpuVar.getClass();
        uouVar.getClass();
        souVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.c = tac0Var;
        this.d = epuVar;
        this.e = cpuVar;
        this.f = uouVar;
        this.g = fhjVar;
        this.h = souVar;
        this.i = hnuVar;
        this.j = nouVar;
        this.k = j910Var;
        this.l = mneVar;
        this.m = m1eVar;
        this.n = dujVar;
        this.o = ctf0Var;
        this.p = ntuVar;
        this.q = yfuVar;
        this.r = iqtVar;
        this.s = pruVar;
        this.t = x20Var;
        this.u = b4jVar;
        this.v = bbw0Var;
        this.w = wttVar;
        this.x = qhoVar;
        this.z = pruVar.a().l;
        this.A = pruVar.a().V0;
        dfe dfeVar = dfe.f5996a;
        p7m0 p7m0VarA = q7m0.a(dfeVar);
        this.E = p7m0VarA;
        p7m0 p7m0VarA2 = q7m0.a(dfeVar);
        this.F = p7m0VarA2;
        p7m0 p7m0VarA3 = q7m0.a(dfeVar);
        this.G = p7m0VarA3;
        p7m0 p7m0VarA4 = q7m0.a(dfeVar);
        this.H = p7m0VarA4;
        p7m0 p7m0VarA5 = q7m0.a(dfeVar);
        this.I = p7m0VarA5;
        p7m0 p7m0VarA6 = q7m0.a(dfeVar);
        this.J = p7m0VarA6;
        this.K = new ol60(3);
        this.L = vtb.h0(new dnq(new m430(new gmq[]{p7m0VarA, p7m0VarA2, p7m0VarA3, p7m0VarA4, p7m0VarA5, p7m0VarA6}, this, (byte) 25), new pr60(3, null, (byte) 18), (byte) 1), d5c.S(jiu0.a(this), mneVar.b), new o6m0(Long.MAX_VALUE), w());
        z(true);
    }

    public final void A(boolean z) {
        bby bbyVar = this.C;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.C = sac.i0(jiu0.a(this), "PromoCardsWithGamesAndStoreViewModel.loadPromoCodesData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new fyc0((byte) 0, null, this, z), null, this.l.b, new byc0(this, (byte) 2), null, 592);
        }
    }

    public final void B() {
        this.c.getClass();
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            sac.V(jiu0.a(this), new byc0(this, (byte) 5), null, this.l.b, new dyc0(this, null, (byte) 3), 10);
        }
    }

    public final void C(euc0 euc0Var) {
        Object next;
        tac0 tac0Var = this.c;
        tac0Var.getClass();
        x20 x20Var = tac0Var.g;
        long j = euc0Var.f8414a;
        x20Var.v(new ruc0(j));
        Iterator it = tac0Var.l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((vrc0) next).getId() != j);
        vrc0 vrc0Var = (vrc0) next;
        if (vrc0Var == null) {
            return;
        }
        b4j b4jVar = tac0Var.f;
        long id = vrc0Var.getId();
        h97.x("promo_id", Long.valueOf(id), b4jVar.f1961a, "promo_menu_call");
        i1w0 i1w0Var = tac0Var.d;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        FragmentScreen promoCodesScreenFactory$getPromoShopDetailScreen$1 = new PromoCodesScreenFactory$getPromoShopDetailScreen$1(vrc0Var);
        if (promoCodesScreenFactory$getPromoShopDetailScreen$1 instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promoCodesScreenFactory$getPromoShopDetailScreen$1)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(promoCodesScreenFactory$getPromoShopDetailScreen$1)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void D() {
        yje yjeVar = null;
        byte b = 4;
        fnq fnqVar = new fnq(this.m.b(), new dyc0(this, yjeVar, (byte) 2), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.l;
        this.D = slb.U(fnqVar, d5c.S(bvcVarA, mneVar.b));
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            sac.i0(jiu0.a(this), "PromoCardsWithGamesAndStoreViewModel.updatePromoBalance", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new dyc0(this, yjeVar, b), null, mneVar.b, null, null, 848);
        }
        A(false);
        ((vwb0) ((rrd) this.v.b).f).g("TEMPORARY_BALANCE_ID", 0L);
    }

    public final void E(Integer num, Boolean bool) {
        p7m0 p7m0Var;
        Object value;
        gfe afeVar;
        do {
            p7m0Var = this.E;
            value = p7m0Var.getValue();
            afeVar = (gfe) value;
            if (afeVar instanceof afe) {
                eic0 eic0Var = (eic0) ((afe) afeVar).f774a;
                afeVar = new afe(eic0.a(eic0Var, num != null ? num.intValue() : eic0Var.f7853a, bool.booleanValue(), 54));
            }
        } while (!p7m0Var.m(value, afeVar));
    }

    public final lc00 w() {
        lc00 lc00VarB = kotlin.collections.a.b();
        toc0 toc0Var = this.z;
        boolean z = toc0Var.k;
        boolean z2 = toc0Var.f;
        if (z) {
            boolean z3 = toc0Var.c;
            if (z3 || z2) {
                lc00VarB.add(new n5c0(z3, z2));
            }
            lc00VarB.add(new htc0(gtc0.USER_PROMO_CODES));
        }
        if (toc0Var.y) {
            lc00VarB.add(new htc0(gtc0.CHAMPIONS_CLUB));
        }
        if (toc0Var.f34278a) {
            lc00VarB.add(l7c0.f19551a);
        }
        lc00VarB.add(s4c0.f31598a);
        lc00VarB.add(new htc0(gtc0.REFERRAL_PROGRAM));
        return kotlin.collections.a.a(lc00VarB);
    }

    public final String x() {
        String str = this.s.a().Z1;
        return str.length() == 0 ? this.o.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0)) : str;
    }

    public final void y(boolean z) {
        sac.i0(jiu0.a(this), "PromoCardsWithGamesAndStoreViewModel.loadBonusGamesData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new eyc0((byte) 1, (yje) null, this, z), null, this.l.b, new byc0(this, (byte) 0), null, 592);
    }

    public final void z(boolean z) {
        bby bbyVar = this.B;
        byte b = 1;
        yje yjeVar = null;
        mne mneVar = this.l;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.B = sac.i0(jiu0.a(this), "PromoCardsWithGamesAndStoreViewModel.loadPromoShopItemsData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new fyc0(b, yjeVar, this, z), null, mneVar.b, new byc0(this, (byte) 4), null, 592);
        }
        A(z);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        byte b2 = 0;
        sac.i0(bvcVarA, "PromoCardsWithGamesAndStoreViewModel.loadAdditionalData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new eyc0(b2, yjeVar, this, z), null, dvjVar, new byc0(this, (byte) 3), null, 592);
        y(z);
        sac.i0(jiu0.a(this), "PromoCardsWithGamesAndStoreViewModel.loadAdditionalData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new dyc0(b, yjeVar, this, z), null, mneVar.b, new byc0(this, (byte) 1), null, 592);
        sac.i0(jiu0.a(this), "PromoWithGamesAndStoreViewModel.addChampionsClubData", 3, 3L, q3d.j(UnknownHostException.class, oqt0.class), null, new dyc0(b2, yjeVar, this, z), null, mneVar.b, new byc0(this, (byte) 6), null, 592);
    }
}
