package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j6g0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15985a;

    public /* synthetic */ j6g0(byte b) {
        this.f15985a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15985a) {
            case 0:
                return new zw3(whp0.f39176a, (byte) 0);
            case 1:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 2:
                return new zw3(vhg0.f37428a, (byte) 0);
            case 3:
                return new zw3(pjo0.f27100a, (byte) 0);
            case 4:
                return new zw3(d6u0.f5568a, (byte) 0);
            case 5:
                int i = o9g0.M;
                return dll0.f6288a;
            case 6:
                return new zw3(p2g0.f26249a, (byte) 0);
            case 7:
                return Unit.f46060a;
            case 8:
                return Unit.f46060a;
            case 9:
                return Unit.f46060a;
            case 10:
                return Unit.f46060a;
            case 11:
                return Unit.f46060a;
            case 12:
                return Unit.f46060a;
            case 13:
                return new icg0(null, 3);
            case 14:
                return new zw3(r9c.f30073a, (byte) 0);
            case 15:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 1);
            case 16:
                return new zw3(ujg0.f35778a, (byte) 0);
            case 17:
                return Boolean.TRUE;
            case 18:
                return new zw3(yog0.f42984a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(yog0.f42984a, (byte) 0);
            case 20:
                return new zw3(okx.f25427a, (byte) 0);
            case 21:
                return Unit.f46060a;
            case 22:
                return new zw3(gdy.f11125a, (byte) 0);
            case 23:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 24:
                return new zw3(gn7.f11572a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(gdy.f11125a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(fn7.f9819a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(gdy.f11125a, (byte) 0);
            default:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
        }
    }
}
