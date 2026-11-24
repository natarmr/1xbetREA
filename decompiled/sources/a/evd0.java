package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class evd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8462a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ evd0(Function1 function1, byte b) {
        this.f8462a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8462a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(aud0.f1473a);
                break;
            case 1:
                function1.invoke(gud0.f11924a);
                break;
            case 2:
                function1.invoke(eud0.f8415a);
                break;
            case 3:
                function1.invoke(dud0.f6694a);
                break;
            case 4:
                function1.invoke(fud0.f10156a);
                break;
            case 5:
                function1.invoke(jud0.f17149a);
                break;
            case 6:
                function1.invoke(dwd0.f6794a);
                break;
            case 7:
                function1.invoke(x3e0.f40214a);
                break;
            case 8:
                function1.invoke(b4e0.f1954a);
                break;
            case 9:
                function1.invoke(w3e0.f38498a);
                break;
            case 10:
                function1.invoke(l5e0.f19451a);
                break;
            case 11:
                function1.invoke(n5e0.f22941a);
                break;
            case 12:
                function1.invoke(v1m0.f36640a);
                break;
            case 13:
                function1.invoke(f3e0.f8858a);
                break;
            case 14:
                function1.invoke(z1m0.f43629a);
                break;
            case 15:
                function1.invoke(x7e0.f40410a);
                break;
            case 16:
                function1.invoke(z7e0.f43915a);
                break;
            case 17:
                function1.invoke(d3e0.f5399a);
                break;
            case 18:
                function1.invoke(fee0.f9403a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(oee0.f25119a);
                break;
            case 20:
                function1.invoke(kee0.f18151a);
                break;
            case 21:
                function1.invoke(mee0.f21641a);
                break;
            case 22:
                function1.invoke(gee0.f11152a);
                break;
            case 23:
                function1.invoke(lee0.f19898a);
                break;
            case 24:
                function1.invoke(uie0.f35727a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(vie0.f37474a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(uje0.f35775a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(vje0.f37524a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(rke0.f30645a);
                break;
            default:
                function1.invoke(ske0.f32344a);
                break;
        }
        return Unit.f46060a;
    }
}
