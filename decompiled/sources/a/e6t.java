package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.games_mania.presentation.views.GamesManiaDice;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e6t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7304a;

    public /* synthetic */ e6t(byte b) {
        this.f7304a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7304a) {
            case 0:
                return new zw3(s710.f31729a, (byte) 0);
            case 1:
                return new zw3(s710.f31729a, (byte) 0);
            case 2:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 3:
                return new zw3(i6t.f14259a, (byte) 0);
            case 4:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 0);
            case 5:
                return new zw3(y6t.f42116a, (byte) 0);
            case 6:
                return new zw3(qu10.f29328a, (byte) 0);
            case 7:
                int i = GamesManiaDice.e;
                return Unit.f46060a;
            case 8:
                return new zw3(okx.f25427a, (byte) 0);
            case 9:
                return new zw3(f7t.f9074a, (byte) 0);
            case 10:
                List list = GamesManiaMapView.z1;
                return Unit.f46060a;
            case 11:
                return new zw3(okx.f25427a, (byte) 0);
            case 12:
                return new zw3(okx.f25427a, (byte) 0);
            case 13:
                return new zw3(x9t.f40524a, (byte) 0);
            case 14:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 15:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 16:
                return new zw3(s710.f31729a, (byte) 0);
            case 17:
                return new zw3(s710.f31729a, (byte) 0);
            case 18:
                return new zw3(ysm0.f43175a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(ubt.f35398a, (byte) 0);
            case 20:
                ysm0 ysm0Var2 = ysm0.f43175a;
                return new inv(ysm0Var2, ysm0Var2, (byte) 0);
            case 21:
                return new zw3(rbt.f30205a, (byte) 0);
            case 22:
                return new zw3(dct.f5861a, (byte) 0);
            case 23:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 24:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(s710.f31729a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(s710.f31729a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(gct.f11078a, (byte) 0);
            default:
                ysm0 ysm0Var3 = ysm0.f43175a;
                return new inv(ysm0Var3, ysm0Var3, (byte) 0);
        }
    }
}
