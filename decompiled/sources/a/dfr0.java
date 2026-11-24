package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dfr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6013a;

    public /* synthetic */ dfr0(byte b) {
        this.f6013a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6013a) {
            case 0:
                int i = ofr0.U0;
                return bid.f2654a;
            case 1:
                int i2 = ofr0.U0;
                return vv60.f38085a;
            case 2:
                int i3 = ofr0.U0;
                return mj0.f21870a;
            case 3:
                return new zw3(bkr0.f2764a, (byte) 0);
            case 4:
                return new zw3(okx.f25427a, (byte) 0);
            case 5:
                return new zw3(yjr0.f42755a, (byte) 0);
            case 6:
                return new zw3(okx.f25427a, (byte) 0);
            case 7:
                return new zw3(mrv.j0(vjr0.f37544a), (byte) 0);
            case 8:
                return new zw3(iir0.f14841a, (byte) 0);
            case 9:
                return new zw3(tlf0.f34142a, (byte) 0);
            case 10:
                return new zw3(ilr0.f14993a, (byte) 0);
            case 11:
                return new zw3(imr0.f15040a, (byte) 0);
            case 12:
                return new zw3(xmr0.f41143a, (byte) 0);
            case 13:
                return new zw3(s710.f31729a, (byte) 0);
            case 14:
                return new zw3(ymr0.f42905a, (byte) 0);
            case 15:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 16:
                return new zw3(s710.f31729a, (byte) 0);
            case 17:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 18:
                return new zw3(ysm0.f43175a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 20:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 21:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 22:
                return new zw3(dnb.f6359a, (byte) 0);
            case 23:
                return new zw3(enb.f8086a, (byte) 0);
            case 24:
                return new zw3(gor0.f11646a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(hor0.f13408a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(okx.f25427a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(kpr0.f18688a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(zpr0.f44774a, (byte) 0);
            default:
                return androidx.compose.runtime.e.a(0.0f);
        }
    }
}
