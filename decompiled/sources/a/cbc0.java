package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cbc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4055a;

    public /* synthetic */ cbc0(byte b) {
        this.f4055a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = null;
        switch (this.f4055a) {
            case 0:
                return new zw3(okx.f25427a, (byte) 0);
            case 1:
                return new zw3(sbc0.f31926a, (byte) 0);
            case 2:
                return new zw3(dbc0.f5797a, (byte) 0);
            case 3:
                return new zw3(pbc0.f26699a, (byte) 0);
            case 4:
                return new zw3(ybc0.f42337a, (byte) 0);
            case 5:
                return new zw3(jbc0.f16233a, (byte) 0);
            case 6:
                return new zw3(mbc0.f21499a, (byte) 0);
            case 7:
                return new zw3(xcc0.f40640a, (byte) 0);
            case 8:
                return new zw3(adc0.f672a, (byte) 0);
            case 9:
                return new zw3(khc0.f18285a, (byte) 0);
            case 10:
                return new vpi();
            case 11:
                return new xwc0(true, true, false, false, false);
            case 12:
                return new qxc0(true, true, false, false, true);
            case 13:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 14:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 15:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 16:
                return new yzc0();
            case 17:
                return new zw3(okx.f25427a, (byte) 0);
            case 18:
                return t6d0.Companion.serializer();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ntb.F("org.xplatform.onexcore.data.network.ProxyType", t6d0.values(), new String[]{"HTTP", "SOCKS"}, new Annotation[][]{null, null});
            case 20:
                return new d9d0(new t33(Float.valueOf(0.0f), hp4.j, obj, 12));
            case 21:
                return new zw3(ykd0.f42784a, (byte) 0);
            case 22:
                return new zw3(zkd0.f44527a, (byte) 0);
            case 23:
                return y9q0.d;
            case 24:
                return y9q0.d;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(o9a0.f24870a, (byte) 0);
            default:
                return new zw3(ftd0.f10107a, (byte) 0);
        }
    }
}
