package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zbt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44133a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ zbt0(Function1 function1, byte b) {
        this.f44133a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44133a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(p8t0.f26576a);
                break;
            case 1:
                function1.invoke(s8t0.f31820a);
                break;
            case 2:
                function1.invoke(bgt0.f2574a);
                break;
            case 3:
                function1.invoke(dgt0.f6057a);
                break;
            case 4:
                function1.invoke(gxt0.f12095a);
                break;
            case 5:
                function1.invoke(ywt0.f43389a);
                break;
            case 6:
                function1.invoke(fxt0.f10328a);
                break;
            case 7:
                function1.invoke(cxt0.f5140a);
                break;
            case 8:
                function1.invoke(bxt0.f3392a);
                break;
            case 9:
                function1.invoke(dxt0.f6864a);
                break;
            case 10:
                function1.invoke(ixt0.f15560a);
                break;
            case 11:
                function1.invoke(myt0.f22619a);
                break;
            case 12:
                function1.invoke(new h8u0(false));
                break;
            case 13:
                function1.invoke(k8u0.f17889a);
                break;
            case 14:
                function1.invoke(s9u0.f31865a);
                break;
            case 15:
                function1.invoke(v9u0.f37052a);
                break;
            case 16:
                function1.invoke(unu0.f35980a);
                break;
            case 17:
                function1.invoke(znu0.f44692a);
                break;
            case 18:
                function1.invoke(tnu0.f34254a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(xnu0.f41187a);
                break;
            case 20:
                function1.invoke(rou0.f30858a);
                break;
            case 21:
                function1.invoke(qou0.f29086a);
                break;
            case 22:
                function1.invoke(tou0.f34301a);
                break;
            case 23:
                function1.invoke(apu0.f1269a);
                break;
            case 24:
                function1.invoke(pqu0.f27434a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(uqu0.f36134a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(oqu0.f25707a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(tqu0.f34397a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(jsu0.f17070a);
                break;
            default:
                function1.invoke(isu0.f15323a);
                break;
        }
        return Unit.f46060a;
    }
}
