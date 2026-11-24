package a;

import android.app.Application;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w530 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38567a;
    public final /* synthetic */ b630 b;

    public /* synthetic */ w530(b630 b630Var, byte b) {
        this.f38567a = b;
        this.b = b630Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38567a;
        b630 b630Var = this.b;
        switch (b) {
            case 0:
                htz htzVar = b630.m2;
                fiu0 fiu0Var = b630Var.c2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                htz htzVar2 = b630.m2;
                return new wx6((t530) b630Var.l2.getValue());
            case 2:
                htz htzVar3 = b630.m2;
                return new t530(new x530(b630Var, (byte) 0), new du20(1, b630Var.T0(), e730.class, "onActionClicked", "onActionClicked(Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/SettingActionType;)V", 0, (byte) 5), new du20(1, b630Var.T0(), e730.class, "onMarketClicked", "onMarketClicked(Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/MarketSettingUiModel;)V", 0, (byte) 6), new e000(2, b630Var.T0(), e730.class, "onItemMoved", "onItemMoved(II)V", 0, (byte) 20), new o0t(0, b630Var.T0(), e730.class, "onMarketsPositionChanged", "onMarketsPositionChanged()V", 0, (byte) 21));
            case 3:
                htz htzVar4 = b630.m2;
                b630Var.T0().w();
                return Unit.f46060a;
            case 4:
                htz htzVar5 = b630.m2;
                Application application = b630Var.n0().getApplication();
                application.getClass();
                return application;
            case 5:
                htz htzVar6 = b630.m2;
                e730 e730VarT0 = b630Var.T0();
                s31 s31Var = e730VarT0.k;
                v530[] v530VarArr = v530.f36810a;
                i8i.D("action", SDPKeywords.CLEAR, s31Var.f31532a, "bet_game_market_set_clear");
                zr1 zr1Var = e730VarT0.n;
                d630[] d630VarArr = d630.f5534a;
                zr1Var.f44833a.a(cui0.b(new j1p(SDPKeywords.CLEAR, (byte) 0)), 3185L);
                sac.V(jiu0.a(e730VarT0), new du20(1, e730VarT0.j, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, null, new a730(e730VarT0, null, (byte) 2), 14);
                return Unit.f46060a;
            default:
                htz htzVar7 = b630.m2;
                e730 e730VarT1 = b630Var.T0();
                s31 s31Var2 = e730VarT1.k;
                v530[] v530VarArr2 = v530.f36810a;
                i8i.D("action", "cancel", s31Var2.f31532a, "bet_game_market_set_clear");
                zr1 zr1Var2 = e730VarT1.n;
                d630[] d630VarArr2 = d630.f5534a;
                b1j.v("cancel", zr1Var2.f44833a, 3185L);
                return Unit.f46060a;
        }
    }
}
