package a;

import a.ccv0;
import a.i120;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.special_event.impl.who_win.presentation.model.WhoWinScreenParams;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;
import org.xplatform.statistic.rating.impl.rating_statistic.presentation.screen.RatingStatisticScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class svk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32872a;
    public final /* synthetic */ iwk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ svk0(iwk0 iwk0Var, String str, byte b) {
        this.f32872a = b;
        this.b = iwk0Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32872a;
        iwk0 iwk0Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                gcv0 gcv0Var = iwk0Var.P;
                int i = iwk0Var.p.f46974a;
                long j = ((dvk0) iwk0Var.D()).C.d;
                final WhoWinScreenParams whoWinScreenParams = new WhoWinScreenParams(this.c, i, ((dvk0) iwk0Var.D()).C.c, j);
                gcv0Var.getClass();
                k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.special_event.impl.who_win.navigation.WhoWinScreenFactoryImpl$getScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        ccv0.Q1.getClass();
                        ccv0 ccv0Var = new ccv0();
                        ccv0Var.s0(i120.V(new Pair("BUNDLE_PARAMS", whoWinScreenParams)));
                        return ccv0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                break;
            default:
                k0w0Var.getClass();
                g9m0 g9m0Var = iwk0Var.e0;
                long j2 = ((dvk0) iwk0Var.D()).C.d;
                RatingStatisticScreenParams.EventParamsStatistic eventParamsStatistic = new RatingStatisticScreenParams.EventParamsStatistic(this.c, ((dvk0) iwk0Var.D()).C.c, j2);
                g9m0Var.getClass();
                k0w0Var.h(new RatingStatisticScreen(eventParamsStatistic));
                break;
        }
        return Unit.f46060a;
    }
}
