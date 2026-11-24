package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qgx implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28708a;

    public /* synthetic */ qgx(byte b) {
        this.f28708a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object g0g0Var;
        switch (this.f28708a) {
            case 0:
                return new zw3(su20.f32802a, (byte) 0);
            case 1:
                int i = dix.C;
                return p030.f26129a;
            case 2:
                return null;
            case 3:
                return new zw3(okx.f25427a, (byte) 0);
            case 4:
                return new zw3(okx.f25427a, (byte) 0);
            case 5:
                return new ycl(48.0f);
            case 6:
                return Unit.f46060a;
            case 7:
                return Unit.f46060a;
            case 8:
                return new zw3(b2y.f1876a, (byte) 0);
            case 9:
                return new zw3(c2y.f3646a, (byte) 0);
            case 10:
                return new zw3(e0y.f7013a, (byte) 0);
            case 11:
                return new zw3(f0y.f8738a, (byte) 0);
            case 12:
                return new zw3(okx.f25427a, (byte) 0);
            case 13:
                return new zw3(okx.f25427a, (byte) 0);
            case 14:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 15:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 16:
                return new zw3(f0y.f8738a, (byte) 0);
            case 17:
                return new zw3(h2y.f12359a, (byte) 0);
            case 18:
                return new zw3(i2y.f14071a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 20:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 21:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 22:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 23:
                return androidx.compose.runtime.e.e(Boolean.TRUE);
            case 24:
                return androidx.compose.runtime.e.e(Boolean.TRUE);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                try {
                    e0g0 e0g0Var = j0g0.b;
                    System.loadLibrary("antifraud");
                    g0g0Var = Unit.f46060a;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                return Boolean.valueOf(!(g0g0Var instanceof g0g0));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return mdy.b;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return cdy.b;
            default:
                return ycy.b;
        }
    }

    public /* synthetic */ qgx(mox moxVar, byte b) {
        this.f28708a = b;
    }
}
