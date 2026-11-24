package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_section.feature.bonuses.di.BonusesScreenFactoryImpl$getAllBonusesScreen$1;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$OneXGamesFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wc70 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38912a;
    public final /* synthetic */ xd70 b;

    public /* synthetic */ wc70(xd70 xd70Var, byte b) {
        this.f38912a = b;
        this.b = xd70Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38912a;
        xd70 xd70Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(((oct) xd70Var.s.get()).c(((xb70) xd70Var.D()).n.e, ((xb70) xd70Var.D()).p.b, ((xb70) xd70Var.D()).b));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                xd70Var.T(th);
                ((hkt0) xd70Var.x.get()).a(vpv0.f37827a);
                break;
            case 2:
                ((k0w0) obj).h(((oct) xd70Var.s.get()).c(((xb70) xd70Var.D()).n.e, ((xb70) xd70Var.D()).p.b, ((xb70) xd70Var.D()).b));
                break;
            case 3:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.c(null);
                z7z z7zVar = xd70Var.s;
                Object obj2 = z7zVar.get();
                obj2.getClass();
                GamesSectionScreens$OneXGamesFragmentScreen gamesSectionScreens$OneXGamesFragmentScreenF = oct.f((oct) obj2, 0L, null, 0, t270.b, null, 23);
                Object obj3 = z7zVar.get();
                obj3.getClass();
                k0w0Var2.i(gamesSectionScreens$OneXGamesFragmentScreenF, new BonusesScreenFactoryImpl$getAllBonusesScreen$1(""));
                break;
            default:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.c(null);
                z7z z7zVar2 = xd70Var.s;
                Object obj4 = z7zVar2.get();
                obj4.getClass();
                GamesSectionScreens$OneXGamesFragmentScreen gamesSectionScreens$OneXGamesFragmentScreenF2 = oct.f((oct) obj4, 0L, null, 0, t270.b, null, 23);
                Object obj5 = z7zVar2.get();
                obj5.getClass();
                k0w0Var3.i(gamesSectionScreens$OneXGamesFragmentScreenF2, new BonusesScreenFactoryImpl$getAllBonusesScreen$1(""));
                break;
        }
        return Unit.f46060a;
    }
}
