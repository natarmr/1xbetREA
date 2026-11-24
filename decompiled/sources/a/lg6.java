package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lg6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19991a;

    public /* synthetic */ lg6(byte b) {
        this.f19991a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19991a) {
            case 0:
                return new zw3(rg6.f30418a, (byte) 0);
            case 1:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 2:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 3:
                return new zw3(jf6.f16409a, (byte) 0);
            case 4:
                return new zw3(jk6.f16651a, (byte) 0);
            case 5:
                return new zw3(sk6.f32331a, (byte) 0);
            case 6:
                return new zw3(vk6.f37558a, (byte) 0);
            case 7:
                return new inv(ysm0.f43175a, mrv.j0(new zw3(bm6.f2823a, (byte) 0)), (byte) 1);
            case 8:
                return new zw3(sh6.f32196a, (byte) 0);
            case 9:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 1);
            case 10:
                return new zw3(okx.f25427a, (byte) 0);
            case 11:
                return new zw3(okx.f25427a, (byte) 0);
            case 12:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 13:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 14:
                return new zw3(gdy.f11125a, (byte) 0);
            case 15:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 16:
                return new zw3(mrv.j0(tbl.f33669a), (byte) 0);
            case 17:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 18:
                return new zw3(ysm0.f43175a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 20:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 21:
                return Unit.f46060a;
            case 22:
                return Unit.f46060a;
            case 23:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 24:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return androidx.compose.runtime.e.e(Boolean.TRUE);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            default:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
        }
    }
}
