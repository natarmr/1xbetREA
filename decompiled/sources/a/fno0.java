package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fno0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9849a;

    public /* synthetic */ fno0(byte b) {
        this.f9849a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9849a;
        bid bidVar = bid.f2654a;
        switch (b) {
            case 0:
                return Unit.f46060a;
            case 1:
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 4:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 5:
                return androidx.compose.runtime.e.e(Boolean.TRUE);
            case 6:
                return new szo0(null, iun.f15405a, izo0.f15644a, null, false, true);
            case 7:
                int i = b0p0.I;
                return bidVar;
            case 8:
                j6m0 j6m0Var = i0p0.Z1;
                return new bdz();
            case 9:
                return new zw3(x0p0.f40082a, (byte) 0);
            case 10:
                return new zw3(d2p0.f5368a, (byte) 0);
            case 11:
                return new zw3(f4n0.f8924a, (byte) 0);
            case 12:
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                return new zw3(f5p0.f8975a, (byte) 0);
            case 15:
                return new zw3(ewb.f8514a, (byte) 0);
            case 16:
                return new zw3(ewb.f8514a, (byte) 0);
            case 17:
                return new zw3(ewb.f8514a, (byte) 0);
            case 18:
                return new zw3(ked.f18149a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case 20:
                return new p7p0(true, null);
            case 21:
                return new zw3(fh.f9519a, (byte) 0);
            case 22:
                return new zw3(uhs0.f35698a, (byte) 0);
            case 23:
                return new zw3(s710.f31729a, (byte) 0);
            case 24:
                int i2 = wbp0.L;
                return bidVar;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(s710.f31729a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(s710.f31729a, (byte) 0);
            default:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 1);
        }
    }
}
