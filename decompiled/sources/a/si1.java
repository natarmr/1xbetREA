package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class si1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32241a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ si1(Function1 function1, byte b) {
        this.f32241a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32241a;
        es1 es1Var = es1.f8307a;
        os1 os1Var = os1.f25762a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(wh1.f39143a);
                break;
            case 1:
                function1.invoke(xh1.f40866a);
                break;
            case 2:
                function1.invoke(y7d0.f42147a);
                break;
            case 3:
                function1.invoke(z7d0.f43914a);
                break;
            case 4:
                function1.invoke(v7d0.f36919a);
                break;
            case 5:
                function1.invoke(ck1.f4485a);
                break;
            case 6:
                function1.invoke(dk1.f6212a);
                break;
            case 7:
                function1.invoke(fk1.f9669a);
                break;
            case 8:
                function1.invoke(vm1.f37654a);
                break;
            case 9:
                function1.invoke(wm1.f39382a);
                break;
            case 10:
                function1.invoke(dn1.f6345a);
                break;
            case 11:
                function1.invoke(es1Var);
                break;
            case 12:
                function1.invoke(os1Var);
                break;
            case 13:
                function1.invoke(ks1.f18792a);
                break;
            case 14:
                function1.invoke(es1Var);
                break;
            case 15:
                function1.invoke(os1Var);
                break;
            case 16:
                function1.invoke(es1Var);
                break;
            case 17:
                function1.invoke(os1Var);
                break;
            case 18:
                function1.invoke(es1Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(os1Var);
                break;
            case 20:
                function1.invoke(qx1.f29459a);
                break;
            case 21:
                function1.invoke(px1.f27733a);
                break;
            case 22:
                function1.invoke(vx1.f38179a);
                break;
            case 23:
                function1.invoke(ux1.f36418a);
                break;
            case 24:
                function1.invoke(mx1.f22531a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(zx1.f45136a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(ox1.f25990a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new kxq0(zj0.f44463a));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(b62.f2033a);
                break;
            default:
                function1.invoke(c62.f3798a);
                break;
        }
        return Unit.f46060a;
    }
}
