package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p3l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26303a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ p3l(Function1 function1, byte b) {
        this.f26303a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26303a;
        jd50 jd50Var = jd50.f16315a;
        md50 md50Var = md50.f21581a;
        ulm ulmVar = ulm.f35879a;
        vlm vlmVar = vlm.f37631a;
        nhm nhmVar = nhm.f23539a;
        jhm jhmVar = jhm.f16534a;
        ihm ihmVar = ihm.f14787a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(s1l.f31462a);
                break;
            case 1:
                function1.invoke(k1l.f17530a);
                break;
            case 2:
                function1.invoke(r1l.f29686a);
                break;
            case 3:
                function1.invoke(p1l.f26207a);
                break;
            case 4:
                function1.invoke(n1l.f22755a);
                break;
            case 5:
                function1.invoke(q1l.f27959a);
                break;
            case 6:
                function1.invoke(u1l.f34905a);
                break;
            case 7:
                function1.invoke(ihmVar);
                break;
            case 8:
                function1.invoke(jhmVar);
                break;
            case 9:
                function1.invoke(jhmVar);
                break;
            case 10:
                function1.invoke(nhmVar);
                break;
            case 11:
                function1.invoke(ihmVar);
                break;
            case 12:
                function1.invoke(lhm.f20063a);
                break;
            case 13:
                function1.invoke(ohm.f25271a);
                break;
            case 14:
                function1.invoke(ihmVar);
                break;
            case 15:
                function1.invoke(jhmVar);
                break;
            case 16:
                function1.invoke(nhmVar);
                break;
            case 17:
                function1.invoke(jhmVar);
                break;
            case 18:
                function1.invoke(nhmVar);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(mhm.f21801a);
                break;
            case 20:
                function1.invoke(rhm.f30496a);
                break;
            case 21:
                function1.invoke(ihmVar);
                break;
            case 22:
                function1.invoke(jd50Var);
                break;
            case 23:
                function1.invoke(md50Var);
                break;
            case 24:
                function1.invoke(jd50Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(md50Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(ulmVar);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(vlmVar);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(ulmVar);
                break;
            default:
                function1.invoke(vlmVar);
                break;
        }
        return Unit.f46060a;
    }
}
