package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class urn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36172a;

    public /* synthetic */ urn(byte b) {
        this.f36172a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36172a;
        bid bidVar = bid.f2654a;
        switch (b) {
            case 0:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 1:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 2:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 3:
                return new g0o("org.xplatform.consultantchat.data.models.EmptyPayloadRequest", oun.INSTANCE, new Annotation[0]);
            case 4:
                int i = d4o.H;
                return bidVar;
            case 5:
                kin0 kin0VarE = qem0.e();
                rwj rwjVar = tvk.f34603a;
                return d5c.a(kotlin.coroutines.e.c(kin0VarE, ys10.f43147a.x()));
            case 6:
                return new dms();
            case 7:
                int i2 = b7o.X;
                return ius.f15411a;
            case 8:
                return Unit.f46060a;
            case 9:
                int i3 = k9o.G;
                return bidVar;
            case 10:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 11:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 12:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 13:
                return androidx.compose.runtime.e.b(0);
            case 14:
                return androidx.compose.runtime.e.a(0.0f);
            case 15:
                return new zw3(v3a0.f36725a, (byte) 0);
            case 16:
                return new zw3(new zw3(jdo.f16338a, (byte) 0), (byte) 0);
            case 17:
                return new zw3(new zw3(dgo.f6051a, (byte) 0), (byte) 0);
            case 18:
                return new zw3(ysm0.f43175a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 20:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 21:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 22:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 23:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 24:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            default:
                return new zw3(ysm0.f43175a, (byte) 0);
        }
    }
}
