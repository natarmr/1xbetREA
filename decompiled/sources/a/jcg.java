package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jcg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16274a;

    public /* synthetic */ jcg(byte b) {
        this.f16274a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f16274a) {
            case 0:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 1:
                return new zw3(s710.f31729a, (byte) 0);
            case 2:
                return new zw3(s710.f31729a, (byte) 0);
            case 3:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 4:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 1);
            case 5:
                return Unit.f46060a;
            case 6:
                return roj0.b(1, 0, i99.b, 2);
            case 7:
                return new zw3(s710.f31729a, (byte) 0);
            case 8:
                return new zw3(kcg.f18057a, (byte) 0);
            case 9:
                return new zw3(kcg.f18057a, (byte) 0);
            case 10:
                return Unit.f46060a;
            case 11:
                int i2 = jfg.B;
                return bid.f2654a;
            case 12:
                throw new IllegalStateException("No CyberChampsMainParams provided");
            case 13:
                throw new IllegalStateException("No CyberFeedFilterRepository provided");
            case 14:
                return new xcz(i, 3, i);
            case 15:
                sip[] sipVarArrValues = sip.values();
                sipVarArrValues.getClass();
                return new g0o("org.xplatform.betting.core.zip.domain.model.FeedKind", (Enum[]) sipVarArrValues);
            case 16:
                return ijg.f14872a;
            case 17:
                return new g0o("org.xplatform.cyber.game.core.data.model.games.CyberCommonGameStatisticResponse", kjg.INSTANCE, new Annotation[0]);
            case 18:
                return new zw3(okx.f25427a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 20:
                return new zw3(s710.f31729a, (byte) 0);
            case 21:
                return new zw3(s710.f31729a, (byte) 0);
            case 22:
                return new zw3(fev.f9424a, (byte) 0);
            case 23:
                return new zw3(fev.f9424a, (byte) 0);
            case 24:
                return new zw3(fev.f9424a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(n8h.f23087a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(jls.f16732a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(lmg.f20295a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(tmg.f34193a, (byte) 0);
            default:
                return new zw3(cgh.f4313a, (byte) 0);
        }
    }
}
