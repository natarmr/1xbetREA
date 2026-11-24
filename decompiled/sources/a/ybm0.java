package a;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampMenuType;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampSubMenuItem;
import org.xplatform.statistic.completedmatches.navigation.CompletedMatchesScreens;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.screen.ChampStatisticTourNetScreen;
import org.xplatform.statistic.stage.impl.stagetable.presentation.rating.screen.RatingStageTableScreen;
import org.xplatform.statistic.upcoming_events.navigation.UpcomingEventsScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class ybm0 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public final r2u A;
    public bby B;
    public c4m0 C;
    public final i1w0 o;
    public final bwl p;
    public final String q;
    public final long r;
    public final duj s;
    public final u58 t;
    public final nai u;
    public final svs0 v;
    public final kl5 w;
    public final fhj x;
    public final m1e y;
    public final mne z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybm0(i1w0 i1w0Var, bwl bwlVar, String str, long j, duj dujVar, u58 u58Var, ocl oclVar, nai naiVar, svs0 svs0Var, kl5 kl5Var, fhj fhjVar, uyu uyuVar, wyu wyuVar, m1e m1eVar, mne mneVar, qzt qztVar, r2u r2uVar, r9u r9uVar) {
        super(null, new fkm(j, qztVar, fhjVar, str, wyuVar), new xuh(oclVar, r9uVar, (byte) 13), cvm0.p(mneVar.c, mneVar.f22085a), null);
        wyuVar.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        this.o = i1w0Var;
        this.p = bwlVar;
        this.q = str;
        this.r = j;
        this.s = dujVar;
        this.t = u58Var;
        this.u = naiVar;
        this.v = svs0Var;
        this.w = kl5Var;
        this.x = fhjVar;
        this.y = m1eVar;
        this.z = mneVar;
        this.A = r2uVar;
        yje yjeVar = null;
        i3t0.K(this, null, null, new hhb0(this, yjeVar, (byte) 16), 3);
        sac.T(new fnq(uyuVar.f36509a.h(), new ssl0((Object) this, yjeVar, (byte) 8), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), xbm0.h);
        M(false);
    }

    public final void M(boolean z) {
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.B = sac.V(jiu0.a(this), new kcl0(1, this, ybm0.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 19), null, this.z.b, new a220(z, (Object) this, (yje) null, (byte) 29), 10);
        }
    }

    public final void N(final ChampSubMenuItem champSubMenuItem) {
        ChampMenuType champMenuType = champSubMenuItem.f47019a;
        if (champMenuType == null) {
            return;
        }
        boolean z = champMenuType instanceof ChampMenuType.ChampTourNet;
        i1w0 i1w0Var = this.o;
        if (z) {
            final byte b = 0;
            i1w0Var.d(new Function1(this) { // from class: a.vbm0
                public final /* synthetic */ ybm0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b2 = b;
                    ChampSubMenuItem champSubMenuItem2 = champSubMenuItem;
                    ybm0 ybm0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj;
                    switch (b2) {
                        case 0:
                            k0w0Var.getClass();
                            nai naiVar = ybm0Var.u;
                            long j = ybm0Var.r;
                            String str = champSubMenuItem2.b;
                            String str2 = champSubMenuItem2.c;
                            naiVar.getClass();
                            str.getClass();
                            str2.getClass();
                            k0w0Var.h(new ChampStatisticTourNetScreen(j, str, str2));
                            break;
                        default:
                            k0w0Var.getClass();
                            nai naiVar2 = ybm0Var.u;
                            String str3 = champSubMenuItem2.c;
                            String str4 = champSubMenuItem2.b;
                            long j2 = ybm0Var.r;
                            naiVar2.getClass();
                            str3.getClass();
                            str4.getClass();
                            k0w0Var.h(new RatingStageTableScreen(str3, str4, j2));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        } else if (champMenuType instanceof ChampMenuType.ChampTourTable) {
            final byte b2 = 1;
            i1w0Var.d(new Function1(this) { // from class: a.vbm0
                public final /* synthetic */ ybm0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    ChampSubMenuItem champSubMenuItem2 = champSubMenuItem;
                    ybm0 ybm0Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj;
                    switch (b3) {
                        case 0:
                            k0w0Var.getClass();
                            nai naiVar = ybm0Var.u;
                            long j = ybm0Var.r;
                            String str = champSubMenuItem2.b;
                            String str2 = champSubMenuItem2.c;
                            naiVar.getClass();
                            str.getClass();
                            str2.getClass();
                            k0w0Var.h(new ChampStatisticTourNetScreen(j, str, str2));
                            break;
                        default:
                            k0w0Var.getClass();
                            nai naiVar2 = ybm0Var.u;
                            String str3 = champSubMenuItem2.c;
                            String str4 = champSubMenuItem2.b;
                            long j2 = ybm0Var.r;
                            naiVar2.getClass();
                            str3.getClass();
                            str4.getClass();
                            k0w0Var.h(new RatingStageTableScreen(str3, str4, j2));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        sbm0 sbm0Var = (sbm0) obj;
        sbm0Var.getClass();
        super.x(sbm0Var);
        boolean zEquals = sbm0Var.equals(obm0.f24989a);
        final byte b = 0;
        i1w0 i1w0Var = this.o;
        if (!zEquals) {
            final byte b2 = 1;
            if (sbm0Var.equals(qbm0.f28450a)) {
                M(true);
                return;
            }
            if (sbm0Var instanceof pbm0) {
                tdb tdbVar = ((pbm0) sbm0Var).f26715a;
                ChampMenuType champMenuType = tdbVar.f33760a;
                this.t.i(champMenuType.b);
                ArrayList arrayList = tdbVar.c;
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() == 1) {
                        N((ChampSubMenuItem) CollectionsKt.U(arrayList));
                        return;
                    } else {
                        G(new ccm0(tdbVar.b, arrayList));
                        return;
                    }
                }
                if (champMenuType instanceof ChampMenuType.ChampCompletedGames) {
                    i1w0Var.d(new Function1(this) { // from class: a.wbm0
                        public final /* synthetic */ ybm0 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b3 = b;
                            ybm0 ybm0Var = this.b;
                            k0w0 k0w0Var = (k0w0) obj2;
                            switch (b3) {
                                case 0:
                                    k0w0Var.getClass();
                                    kl5 kl5Var = ybm0Var.w;
                                    long j = ybm0Var.r;
                                    String str = ybm0Var.q;
                                    kl5Var.getClass();
                                    str.getClass();
                                    k0w0Var.h(new CompletedMatchesScreens(str, j));
                                    break;
                                default:
                                    k0w0Var.getClass();
                                    svs0 svs0Var = ybm0Var.v;
                                    long j2 = ybm0Var.r;
                                    String str2 = ybm0Var.q;
                                    svs0Var.getClass();
                                    str2.getClass();
                                    k0w0Var.h(new UpcomingEventsScreen(str2, j2));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    return;
                } else {
                    if (champMenuType instanceof ChampMenuType.ChampUpcomingGames) {
                        i1w0Var.d(new Function1(this) { // from class: a.wbm0
                            public final /* synthetic */ ybm0 b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b3 = b2;
                                ybm0 ybm0Var = this.b;
                                k0w0 k0w0Var = (k0w0) obj2;
                                switch (b3) {
                                    case 0:
                                        k0w0Var.getClass();
                                        kl5 kl5Var = ybm0Var.w;
                                        long j = ybm0Var.r;
                                        String str = ybm0Var.q;
                                        kl5Var.getClass();
                                        str.getClass();
                                        k0w0Var.h(new CompletedMatchesScreens(str, j));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        svs0 svs0Var = ybm0Var.v;
                                        long j2 = ybm0Var.r;
                                        String str2 = ybm0Var.q;
                                        svs0Var.getClass();
                                        str2.getClass();
                                        k0w0Var.h(new UpcomingEventsScreen(str2, j2));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            if (sbm0Var instanceof rbm0) {
                N(((rbm0) sbm0Var).f30196a);
                return;
            }
            yje yjeVar = null;
            if (sbm0Var.equals(mbm0.f21517a)) {
                c4m0 c4m0Var = this.C;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.C = sac.T(new fnq(this.y.b(), new yng0(this, yjeVar, (byte) 26), (byte) 4), jiu0.a(this), new bdl0(2, this, ybm0.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 4, (byte) 4));
                    return;
                }
                return;
            }
            if (!sbm0Var.equals(nbm0.f23249a)) {
                if (sbm0Var.equals(lbm0.f19761a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            c4m0 c4m0Var2 = this.C;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            bby bbyVar = this.B;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
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
    }
}
