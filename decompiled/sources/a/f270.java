package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_section.feature.bonuses.di.BonusesScreenFactoryImpl$getAllBonusesScreen$1;
import org.xplatform.games_section.feature.bonuses_info.di.BonusesInfoScreenFactoryImpl$getBonusesInfoScreen$1;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$WeeklyRewardFragmentScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f270 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8799a;
    public final /* synthetic */ n270 b;

    public /* synthetic */ f270(n270 n270Var, byte b) {
        this.f8799a = b;
        this.b = n270Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8799a;
        n270 n270Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                uf3 uf3Var = n270Var.J;
                String str = ((c270) n270Var.D()).b;
                uf3Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(new BonusesScreenFactoryImpl$getAllBonusesScreen$1(str)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar2 = (c8d) k0w0Var2.h(n270Var.J.f35560a.d()).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                break;
            case 2:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                oct octVar = n270Var.J.f35560a;
                c8d c8dVar3 = (c8d) k0w0Var3.h(new GamesSectionScreens$WeeklyRewardFragmentScreen()).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                break;
            case 3:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                oct octVar2 = n270Var.J.f35560a;
                c8d c8dVar4 = (c8d) k0w0Var4.h(new BonusesInfoScreenFactoryImpl$getBonusesInfoScreen$1()).f14945a;
                bjk bjkVar4 = cfx0.o;
                c8dVar4.f3908a = new v7d(true, bjkVar4, bjkVar4);
                break;
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                n270Var.M.b(th, new cr60((byte) 15));
                break;
            default:
                c8d c8dVar5 = (c8d) ((k0w0) obj).h(n270Var.J.f35560a.e()).f14945a;
                bjk bjkVar5 = cfx0.o;
                c8dVar5.f3908a = new v7d(true, bjkVar5, bjkVar5);
                break;
        }
        return Unit.f46060a;
    }
}
