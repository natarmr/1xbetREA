package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yhl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42643a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ yhl0(Function1 function1, byte b) {
        this.f42643a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42643a;
        uol0 uol0Var = uol0.f36023a;
        mzl0 mzl0Var = mzl0.f22659a;
        grk0 grk0Var = grk0.f11783a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                if (function1 != null) {
                    function1.invoke(ugl0.b);
                }
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(ugl0.f35631a);
                }
                break;
            case 2:
                if (function1 != null) {
                    function1.invoke(ugl0.b);
                }
                break;
            case 3:
                function1.invoke(vfl0.f37338a);
                break;
            case 4:
                function1.invoke(uol0Var);
                break;
            case 5:
                function1.invoke(tol0.f34291a);
                break;
            case 6:
                function1.invoke(uol0Var);
                break;
            case 7:
                function1.invoke(nol0.f23873a);
                break;
            case 8:
                function1.invoke(ool0.f25601a);
                break;
            case 9:
                function1.invoke(erl0.f8288a);
                break;
            case 10:
                function1.invoke(krl0.f18771a);
                break;
            case 11:
                function1.invoke(0);
                break;
            case 12:
                function1.invoke(0);
                break;
            case 13:
                function1.invoke(avl0.f1532a);
                break;
            case 14:
                function1.invoke(cvl0.f5036a);
                break;
            case 15:
                function1.invoke(mzl0Var);
                break;
            case 16:
                function1.invoke(v1m0.f36640a);
                break;
            case 17:
                function1.invoke(mzl0Var);
                break;
            case 18:
                function1.invoke(z1m0.f43629a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(grk0Var);
                break;
            case 20:
                function1.invoke(grk0Var);
                break;
            case 21:
                function1.invoke(new ot30(jam0.c));
                break;
            case 22:
                function1.invoke(new pt30(jam0.c));
                break;
            case 23:
                function1.invoke(new rt30(jam0.c));
                break;
            case 24:
                function1.invoke(new pt30(jam0.c));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new rt30(jam0.c));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(obm0.f24989a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(qbm0.f28450a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(t17.f33156a);
                break;
            default:
                function1.invoke(m17.f20992a);
                break;
        }
        return Unit.f46060a;
    }
}
