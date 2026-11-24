package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.SubGamesContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.behaviors.BettingContainerBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x9m0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40516a;

    public /* synthetic */ x9m0(byte b) {
        this.f40516a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40516a) {
            case 0:
                z9m0 z9m0Var = StatisticBlockModel.Companion;
                t9m0[] t9m0VarArrValues = t9m0.values();
                t9m0VarArrValues.getClass();
                return new g0o("org.xplatform.cyber.statistics_blocks.api.StatisticBlockId", (Enum[]) t9m0VarArrValues);
            case 1:
                return new zw3(zam0.f44077a, (byte) 0);
            case 2:
                return new zw3(saa0.f31883a, (byte) 0);
            case 3:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 1);
            case 4:
                return new inv(ysm0.f43175a, okx.f25427a, (byte) 1);
            case 5:
                return new zw3(lhm0.f20064a, (byte) 0);
            case 6:
                return new zw3(lhm0.f20064a, (byte) 0);
            case 7:
                return new zw3(lhm0.f20064a, (byte) 0);
            case 8:
                return new zw3(lhm0.f20064a, (byte) 0);
            case 9:
                return new zw3(bft.f2519a, (byte) 0);
            case 10:
                return new zw3(am50.f1094a, (byte) 0);
            case 11:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 12:
                return new zw3(dkv0.f6252a, (byte) 0);
            case 13:
                return new wme0(sre0.f32672a.b(String.class), ysm0.f43175a);
            case 14:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 15:
                return new Regex("\\s+");
            case 16:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 17:
                return new zw3(s710.f31729a, (byte) 0);
            case 18:
                return new zw3(su20.f32802a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(j4h0.f15884a, (byte) 0);
            case 20:
                return new zw3(if90.f14675a, (byte) 0);
            case 21:
                int i = SubGamesContainerView.e;
                return new BettingContainerBehavior();
            case 22:
                return new zw3(aas.f544a, (byte) 0);
            case 23:
                return new zw3(sel0.f32080a, (byte) 0);
            case 24:
                return new zw3(tel0.f33826a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(s710.f31729a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(i6n0.f14250a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(s710.f31729a, (byte) 0);
            default:
                return new zw3(new zw3(h7n0.f12585a, (byte) 0), (byte) 0);
        }
    }
}
