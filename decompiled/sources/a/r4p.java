package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r4p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29847a;

    public /* synthetic */ r4p(byte b) {
        this.f29847a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29847a;
        bid bidVar = bid.f2654a;
        switch (b) {
            case 0:
                int i = org.xplatform.favorites.impl.presentation.category.a.L;
                return bidVar;
            case 1:
                return c7p.Companion.serializer();
            case 2:
                return ntb.F("org.xplatform.aggregator.impl.favorite.data.models.FavoriteClearSourceRequest", c7p.values(), new String[]{"all", "casino", "1xgames"}, new Annotation[][]{null, null, null});
            case 3:
                return new d7p(iun.f15405a, xun.f41520a);
            case 4:
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                return Unit.f46060a;
            case 7:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 8:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 9:
                return new zw3(s710.f31729a, (byte) 0);
            case 10:
                return new zw3(l8p.f19616a, (byte) 0);
            case 11:
                return k6z.f17794a;
            case 12:
                return k6z.f17794a;
            case 13:
                return k6z.f17794a;
            case 14:
                return k6z.f17794a;
            case 15:
            case 16:
                return null;
            case 17:
                int i2 = ccp.u0;
                return vm60.f37664a;
            case 18:
                int i3 = ccp.u0;
                return bidVar;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(j5p.f15943a, (byte) 0);
            case 20:
                return new zw3(z8p.f43979a, (byte) 0);
            case 21:
                return new zw3(ycp.f42392a, (byte) 0);
            case 22:
                return new zw3(s710.f31729a, (byte) 0);
            case 23:
                return new zw3(s710.f31729a, (byte) 0);
            case 24:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 1);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(tum0.f34559a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(jcp.f16287a, (byte) 0);
            default:
                return new zw3(ysm0.f43175a, (byte) 0);
        }
    }
}
