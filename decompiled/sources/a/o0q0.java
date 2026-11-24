package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o0q0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24440a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ o0q0(Function1 function1, byte b) {
        this.f24440a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24440a;
        qjq0 qjq0Var = qjq0.f28852a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new o0q0(function1, (byte) 1)).a();
                break;
            case 1:
                function1.invoke(tzp0.f34816a);
                break;
            case 2:
                function1.invoke(rzp0.f31374a);
                break;
            case 3:
                function1.invoke(szp0.f33082a);
                break;
            case 4:
                function1.invoke(b3q0.f1921a);
                break;
            case 5:
                function1.invoke(c3q0.f3691a);
                break;
            case 6:
                function1.invoke(i17.f13983a);
                break;
            case 7:
                fxb.D(ivb0.b, new o0q0(function1, (byte) 10)).a();
                break;
            case 8:
                fxb.D(ivb0.b, new o0q0(function1, (byte) 12)).a();
                break;
            case 9:
                fxb.D(ivb0.b, new o0q0(function1, (byte) 11)).a();
                break;
            case 10:
                function1.invoke(y17.f41841a);
                break;
            case 11:
                function1.invoke(h17.f12269a);
                break;
            case 12:
                function1.invoke(a27.f110a);
                break;
            case 13:
                function1.invoke(qjq0Var);
                break;
            case 14:
                function1.invoke(qjq0Var);
                break;
            case 15:
                function1.invoke(vjq0.f37543a);
                break;
            case 16:
                function1.invoke(d1s.f5325a);
                break;
            case 17:
                function1.invoke(n1s.f22767a);
                break;
            case 18:
                function1.invoke(n6s.b);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(p1s.f26219a);
                break;
            case 20:
                function1.invoke(n6s.c);
                break;
            case 21:
                function1.invoke(lmr.c);
                break;
            case 22:
                function1.invoke(mis.b);
                break;
            case 23:
                function1.invoke(lmr.d);
                break;
            case 24:
                function1.invoke(mis.c);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(q4r0.f28114a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(r4r0.f29851a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(i9r0.f14402a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(h9r0.f12691a);
                break;
            default:
                function1.invoke(lbr0.f19765a);
                break;
        }
        return Unit.f46060a;
    }
}
