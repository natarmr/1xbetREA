package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class igh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14736a;

    public /* synthetic */ igh0(byte b) {
        this.f14736a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14736a) {
            case 0:
                return new zw3(rgh0.f30436a, (byte) 0);
            case 1:
                return new zw3(ogh0.f25218a, (byte) 0);
            case 2:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 3:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 4:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 5:
                return new zw3(kgh0.f18240a, (byte) 0);
            case 6:
                int i = sih0.N;
                return dll0.f6288a;
            case 7:
                int i2 = sih0.N;
                return bid.f2654a;
            case 8:
                return new zw3(q680.f28189a, (byte) 0);
            case 9:
                return new zw3(p680.f26443a, (byte) 0);
            case 10:
                return new pjh0(0, iun.f15405a);
            case 11:
                return new zw3(okx.f25427a, (byte) 0);
            case 12:
                return new zw3(s710.f31729a, (byte) 0);
            case 13:
                return new zw3(okx.f25427a, (byte) 0);
            case 14:
                return new zw3(okx.f25427a, (byte) 0);
            case 15:
                return new zw3(okx.f25427a, (byte) 0);
            case 16:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 17:
                return new zw3(moa.f22125a, (byte) 0);
            case 18:
                return new zw3(moa.f22125a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(oyh0.f26060a, (byte) 0);
            case 20:
                return null;
            case 21:
                return new zw3(n5i0.f22946a, (byte) 0);
            case 22:
                return new zw3(kko0.f18451a, (byte) 0);
            case 23:
                return new zw3(jko0.f16681a, (byte) 0);
            case 24:
                return new zw3(mjo0.f21905a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(s5i0.f31655a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }
}
