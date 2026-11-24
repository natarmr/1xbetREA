package a;

import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yfb0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yfb0 f42533a = new yfb0(1, nfb0.class, "toLuckyWheelUiModel", "toLuckyWheelUiModel(Lorg/xplatform/games_section/feature/popular/impl/presentation/mappers/models/PopularOneXGamesMapperLuckyWheelState;)Lorg/xplatform/games_section/feature/popular/impl/presentation/models/ui/PopularOneXGamesContentItemUiModel$MediumBanner;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mfb0 mfb0Var = (mfb0) obj;
        mfb0Var.getClass();
        neb0 neb0Var = nfb0.f23428a;
        hfe hfeVar = mfb0Var.f21687a;
        if (!(hfeVar instanceof vee)) {
            if (!(hfeVar instanceof bfe)) {
                return null;
            }
            if (!mfb0Var.b) {
                cfb0 cfb0Var = (cfb0) ((bfe) hfeVar).f2497a;
                return new neb0(new to30(cfb0Var.f4252a, cfb0Var.b, new m0x(R.drawable.lucky_wheel_popular_banner, null, 6), cfb0Var.c), meb0.f21636a);
            }
        }
        return neb0Var;
    }
}
