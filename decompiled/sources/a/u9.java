package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.coinplay_sport_cashback_impl.navigation.CoinplaySportCashbackScreenFactoryImpl$getScreen$1;
import org.xplatform.favorites.impl.di.FavoritesScreenFactoryImpl$getTeamBetTeamsScreen$1;
import org.xplatform.feed.navigation.FeedScreenFactoryImpl$getBetOnYourScreen$1;
import org.xplatform.lotto.impl.navigation.LottoScreenFactoryImpl$getLottoScreen$1;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoCodesScreen$1;
import org.xplatform.search.impl.navigation.SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;
import org.xplatform.swipex.impl.navigation.SwipexScreenFactoryImpl$getSwipexScreen$1;
import org.xplatform.toto_jackpot.impl.navigation.TotoJackpotScreens$TotoJackpotDsFragmentScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35257a;
    public final /* synthetic */ ab b;

    public /* synthetic */ u9(ab abVar, byte b) {
        this.f35257a = b;
        this.b = abVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35257a;
        byte b2 = 1;
        ab abVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new w9(abVar, b2))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                abVar.p.getClass();
                c8d c8dVar2 = (c8d) k0w0Var2.h(new PromoScreenFactoryImpl$getPromoCodesScreen$1()).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                break;
            case 2:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                c8d c8dVar3 = (c8d) k0w0Var3.h(abVar.G.a()).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                break;
            case 3:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                abVar.o.getClass();
                c8d c8dVar4 = (c8d) k0w0Var4.h(new SwipexScreenFactoryImpl$getSwipexScreen$1()).f14945a;
                bjk bjkVar4 = cfx0.o;
                c8dVar4.f3908a = new v7d(true, bjkVar4, bjkVar4);
                break;
            case 4:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                c8d c8dVar5 = (c8d) k0w0Var5.b(new b1w0(new za(abVar, null, (byte) 0))).f14945a;
                bjk bjkVar5 = cfx0.o;
                c8dVar5.f3908a = new v7d(true, bjkVar5, bjkVar5);
                break;
            case 5:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                c8d c8dVar6 = (c8d) k0w0Var6.h(abVar.m.k()).f14945a;
                bjk bjkVar6 = cfx0.o;
                c8dVar6.f3908a = new v7d(true, bjkVar6, bjkVar6);
                break;
            case 6:
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                kj5 kj5Var = abVar.F;
                r9u r9uVar = abVar.K;
                ygp ygpVar = ygp.k1;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                kj5Var.getClass();
                k0w0Var7.h(kj5.g(zD));
                break;
            case 7:
                k0w0 k0w0Var8 = (k0w0) obj;
                k0w0Var8.getClass();
                vjp vjpVar = abVar.k;
                j700 j700Var = j700.b;
                vjpVar.getClass();
                c8d c8dVar7 = (c8d) k0w0Var8.h(new FeedScreenFactoryImpl$getBetOnYourScreen$1(j700Var)).f14945a;
                bjk bjkVar7 = cfx0.o;
                c8dVar7.f3908a = new v7d(true, bjkVar7, bjkVar7);
                break;
            case 8:
                Throwable th = (Throwable) obj;
                th.getClass();
                abVar.d.b(th, new v9(abVar, b2));
                break;
            case 9:
                k0w0 k0w0Var9 = (k0w0) obj;
                k0w0Var9.getClass();
                eke0 eke0Var = abVar.u0;
                bhh0 bhh0Var = bhh0.c;
                eke0Var.getClass();
                c8d c8dVar8 = (c8d) k0w0Var9.h(new SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0Var)).f14945a;
                bjk bjkVar8 = cfx0.o;
                c8dVar8.f3908a = new v7d(true, bjkVar8, bjkVar8);
                break;
            case 10:
                k0w0 k0w0Var10 = (k0w0) obj;
                k0w0Var10.getClass();
                abVar.t0.getClass();
                c8d c8dVar9 = (c8d) k0w0Var10.h(new FavoritesScreenFactoryImpl$getTeamBetTeamsScreen$1()).f14945a;
                bjk bjkVar9 = cfx0.o;
                c8dVar9.f3908a = new v7d(true, bjkVar9, bjkVar9);
                break;
            case 11:
                k0w0 k0w0Var11 = (k0w0) obj;
                k0w0Var11.getClass();
                abVar.J.getClass();
                c8d c8dVar10 = (c8d) k0w0Var11.h(xr.s()).f14945a;
                bjk bjkVar10 = cfx0.o;
                c8dVar10.f3908a = new v7d(true, bjkVar10, bjkVar10);
                break;
            case 12:
                k0w0 k0w0Var12 = (k0w0) obj;
                k0w0Var12.getClass();
                c8d c8dVar11 = (c8d) k0w0Var12.h(jh70.i(abVar.p, abVar.c.a().V0)).f14945a;
                bjk bjkVar11 = cfx0.o;
                c8dVar11.f3908a = new v7d(true, bjkVar11, bjkVar11);
                break;
            case 13:
                k0w0 k0w0Var13 = (k0w0) obj;
                k0w0Var13.getClass();
                c8d c8dVar12 = (c8d) k0w0Var13.h(lk5.b(abVar.D)).f14945a;
                bjk bjkVar12 = cfx0.o;
                c8dVar12.f3908a = new v7d(true, bjkVar12, bjkVar12);
                break;
            case 14:
                k0w0 k0w0Var14 = (k0w0) obj;
                k0w0Var14.getClass();
                abVar.U.getClass();
                c8d c8dVar13 = (c8d) k0w0Var14.h(new CoinplaySportCashbackScreenFactoryImpl$getScreen$1()).f14945a;
                bjk bjkVar13 = cfx0.o;
                c8dVar13.f3908a = new v7d(true, bjkVar13, bjkVar13);
                break;
            case 15:
                k0w0 k0w0Var15 = (k0w0) obj;
                k0w0Var15.getClass();
                abVar.R.getClass();
                c8d c8dVar14 = (c8d) k0w0Var15.h(new TotoJackpotScreens$TotoJackpotDsFragmentScreen()).f14945a;
                bjk bjkVar14 = cfx0.o;
                c8dVar14.f3908a = new v7d(true, bjkVar14, bjkVar14);
                break;
            default:
                k0w0 k0w0Var16 = (k0w0) obj;
                k0w0Var16.getClass();
                atz atzVar = abVar.j0;
                fd10 fd10Var = fd10.f9337a;
                atzVar.getClass();
                c8d c8dVar15 = (c8d) k0w0Var16.h(new LottoScreenFactoryImpl$getLottoScreen$1(fd10Var)).f14945a;
                bjk bjkVar15 = cfx0.o;
                c8dVar15.f3908a = new v7d(true, bjkVar15, bjkVar15);
                break;
        }
        return Unit.f46060a;
    }
}
