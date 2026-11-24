package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.coupon.impl.generate_coupon.presentation.screen.GenerateCouponsScreen;
import org.xplatform.favorites.impl.di.FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45265a;
    public final /* synthetic */ b0p0 b;

    public /* synthetic */ zzo0(b0p0 b0p0Var, byte b) {
        this.f45265a = b;
        this.b = b0p0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f45265a;
        b0p0 b0p0Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                lk5 lk5Var = b0p0Var.y;
                TeamBetScreenParams teamBetScreenParams = b0p0Var.o;
                long j = teamBetScreenParams.f46640a;
                String str = teamBetScreenParams.b;
                lk5Var.getClass();
                str.getClass();
                k0w0Var.h(new FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1(lk5Var, j, str));
                break;
            default:
                k0w0Var.getClass();
                kud kudVar = b0p0Var.C;
                List listC = kotlin.collections.a.c(Integer.valueOf((int) b0p0Var.o.f46640a));
                kudVar.getClass();
                listC.getClass();
                k0w0Var.h(new GenerateCouponsScreen(listC));
                break;
        }
        return Unit.f46060a;
    }
}
