package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mn9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22077a;

    public /* synthetic */ mn9(byte b) {
        this.f22077a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22077a) {
            case 0:
                return new zw3(in9.f15062a, (byte) 0);
            case 1:
                return new zw3(qo9.f29062a, (byte) 0);
            case 2:
                return new zw3(gdy.f11125a, (byte) 0);
            case 3:
                return new zw3(sm8.f32432a, (byte) 0);
            case 4:
                return new zw3(qm9.f28971a, (byte) 0);
            case 5:
                return new zw3(ym9.f42877a, (byte) 0);
            case 6:
                return new zw3(ym9.f42877a, (byte) 0);
            case 7:
                return new zw3(um9.f35908a, (byte) 0);
            case 8:
                return new zw3(em9.f8036a, (byte) 0);
            case 9:
                return new zw3(im9.f15014a, (byte) 0);
            case 10:
                return new zw3(mm9.f22026a, (byte) 0);
            case 11:
                return new inv(ysm0.f43175a, qcy.f28507a, (byte) 1);
            case 12:
                return new eu9("", 0, false);
            case 13:
                return new adf0();
            case 14:
                kl5 kl5Var = qz9.t2;
                return Executors.newSingleThreadExecutor();
            case 15:
                return new zw3(j7a.f16030a, (byte) 0);
            case 16:
                return new zw3(gba.f11008a, (byte) 0);
            case 17:
                return new zw3(gba.f11008a, (byte) 0);
            case 18:
                return new zw3(bfa.f2493a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(bfa.f2493a, (byte) 0);
            case 20:
                return new zw3(moa.f22125a, (byte) 0);
            case 21:
                return new zw3(moa.f22125a, (byte) 0);
            case 22:
                return new zw3(moa.f22125a, (byte) 0);
            case 23:
                return new zw3(dla.f6268a, (byte) 0);
            case 24:
                return androidx.compose.runtime.e.e(null);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cl5 cl5Var = xra.X1;
                return new bdz();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i = wsa.Q;
                return bid.f2654a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                lak0 lak0Var = lak0.c;
                return new kya(lak0Var, lak0Var, bi90.e, null, true, false, true, false, 0L, null);
        }
    }
}
