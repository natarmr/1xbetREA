package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dg00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6025a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ dg00(Function1 function1, byte b) {
        this.f6025a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6025a;
        o320 o320Var = o320.f24561a;
        p420 p420Var = p420.f26329a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(xpw.f41286a);
                break;
            case 1:
                function1.invoke(du30.f6682a);
                break;
            case 2:
                function1.invoke(o420.f24612a);
                break;
            case 3:
                function1.invoke(o320Var);
                break;
            case 4:
                function1.invoke(j420.f15864a);
                break;
            case 5:
                function1.invoke(j520.f15913a);
                break;
            case 6:
                function1.invoke(i320.f14077a);
                break;
            case 7:
                function1.invoke(h320.f12365a);
                break;
            case 8:
                function1.invoke(o320Var);
                break;
            case 9:
                function1.invoke(h420.f12413a);
                break;
            case 10:
                function1.invoke(i420.f14125a);
                break;
            case 11:
                function1.invoke(p420Var);
                break;
            case 12:
                function1.invoke(p420Var);
                break;
            case 13:
                function1.invoke(b520.f1980a);
                break;
            case 14:
                function1.invoke(di00.f6117a);
                break;
            case 15:
                function1.invoke(bi00.f2635a);
                break;
            case 16:
                function1.invoke(ii00.f14806a);
                break;
            case 17:
                function1.invoke(hi00.f13090a);
                break;
            case 18:
                function1.invoke(ty00.f34729a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(my00.f22583a);
                break;
            case 20:
                function1.invoke(sy00.f33002a);
                break;
            case 21:
                function1.invoke(qy00.f29511a);
                break;
            case 22:
                function1.invoke(py00.f27783a);
                break;
            case 23:
                function1.invoke(ry00.f31289a);
                break;
            case 24:
                function1.invoke(vy00.f38226a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(t110.f33147a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(ec10.f7544a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(fc10.f9287a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(ac10.f607a);
                break;
            default:
                function1.invoke(cc10.f4089a);
                break;
        }
        return Unit.f46060a;
    }
}
