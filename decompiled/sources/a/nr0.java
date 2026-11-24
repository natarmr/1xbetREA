package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23979a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ nr0(Function1 function1, byte b) {
        this.f23979a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23979a;
        y01 y01Var = y01.f41781a;
        ld1 ld1Var = ld1.f19826a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(tp0.f34308a);
                break;
            case 1:
                function1.invoke(yp0.f43008a);
                break;
            case 2:
                function1.invoke(ns0.f24030a);
                break;
            case 3:
                function1.invoke(ks0.f18791a);
                break;
            case 4:
                function1.invoke(os0.f25760a);
                break;
            case 5:
                function1.invoke(hy0.f13838a);
                break;
            case 6:
                fxb.D(ivb0.b, new nr0(function1, (byte) 8)).a();
                break;
            case 7:
                fxb.D(ivb0.b, new nr0(function1, (byte) 9)).a();
                break;
            case 8:
                function1.invoke(y01Var);
                break;
            case 9:
                function1.invoke(y01Var);
                break;
            case 10:
                fxb.D(ivb0.b, new nr0(function1, (byte) 12)).a();
                break;
            case 11:
                function1.invoke(u01.f34832a);
                break;
            case 12:
                function1.invoke(n01.f22678a);
                break;
            case 13:
                function1.invoke(w61.f38605a);
                break;
            case 14:
                function1.invoke(v61.f36850a);
                break;
            case 15:
                function1.invoke(z61.f43842a);
                break;
            case 16:
                function1.invoke(q61.f28178a);
                break;
            case 17:
                function1.invoke(x61.f40339a);
                break;
            case 18:
                oz30[] oz30VarArr = oz30.f26086a;
                function1.invoke(new u61(2));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fxb.D(ivb0.b, new nr0(function1, (byte) 23)).a();
                break;
            case 20:
                fxb.D(ivb0.b, new nr0(function1, (byte) 22)).a();
                break;
            case 21:
                function1.invoke(jd1.f16306a);
                break;
            case 22:
                art artVar = d7v.f5612a;
                function1.invoke(new fd1());
                break;
            case 23:
                function1.invoke(xc1.f40624a);
                break;
            case 24:
                fxb.D(ivb0.b, new nr0(function1, (byte) 21)).a();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(ld1Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(zc1.f44145a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(ld1Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(yh1.f42613a);
                break;
            default:
                function1.invoke(bi1.f2636a);
                break;
        }
        return Unit.f46060a;
    }
}
