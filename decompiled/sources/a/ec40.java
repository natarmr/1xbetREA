package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ec40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7549a;

    public /* synthetic */ ec40(byte b) {
        this.f7549a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7549a) {
            case 0:
                return new inv(ac40.f612a, new zw3(rb40.f30167a, (byte) 0), (byte) 1);
            case 1:
                return new zw3(vc40.f37170a, (byte) 0);
            case 2:
                return new zw3(fdo.f9367a, (byte) 0);
            case 3:
                return Unit.f46060a;
            case 4:
                return androidx.compose.runtime.e.e(Boolean.TRUE);
            case 5:
                return new zw3(kj40.f18369a, (byte) 0);
            case 6:
                int i = nl40.a0;
                return ius.f15411a;
            case 7:
                return new dms();
            case 8:
                return UUID.randomUUID();
            case 9:
                return new zw3(mrv.j0(c95.f3945a), (byte) 0);
            case 10:
                return new zw3(mrv.j0(d95.f5683a), (byte) 0);
            case 11:
                return new zw3(mrv.j0(e95.f7404a), (byte) 0);
            case 12:
                return new zw3(mrv.j0(f95.f9138a), (byte) 0);
            case 13:
                return new zw3(mrv.j0(h95.f12661a), (byte) 0);
            case 14:
                return Unit.f46060a;
            case 15:
                return Unit.f46060a;
            case 16:
                return Unit.f46060a;
            case 17:
                return new zw3(nr40.f23985a, (byte) 0);
            case 18:
                return new zw3(poa0.f27320a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(xt6.f41449a, (byte) 0);
            case 20:
                int i2 = p850.p0;
                return ab0.f555a;
            case 21:
                throw new z950("LocalNavBarHolder не предоставлен. Оберни контент в ProvideNavBarOwner(holder), или, если это главный экран, предоставь holder через rememberNavBarHolder()");
            case 22:
                return null;
            case 23:
                return Unit.f46060a;
            case 24:
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return new zw3(bh50.f2589a, (byte) 0);
        }
    }
}
