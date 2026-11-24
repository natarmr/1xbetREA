package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6966a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ e0(Function1 function1, byte b) {
        this.f6966a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6966a;
        tyi0 tyi0Var = tyi0.f34758a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(sqk0.f32634a);
                break;
            case 1:
                function1.invoke(n9f0.f23136a);
                break;
            case 2:
                function1.invoke(cwe0.f5077a);
                break;
            case 3:
                function1.invoke(k3f0.f17615a);
                break;
            case 4:
                function1.invoke(gyi0.f12132a);
                break;
            case 5:
                function1.invoke(myi0.f22605a);
                break;
            case 6:
                function1.invoke(tyi0Var);
                break;
            case 7:
                function1.invoke(tyi0Var);
                break;
            case 8:
                function1.invoke(wyi0.f39975a);
                break;
            case 9:
                function1.invoke(vyi0.f38250a);
                break;
            case 10:
                function1.invoke(yxi0.f43424a);
                break;
            case 11:
                function1.invoke(kd1.f18083a);
                break;
            case 12:
                function1.invoke(x01.f40046a);
                break;
            case 13:
                function1.invoke(wc1.f38903a);
                break;
            case 14:
                function1.invoke(v01.f36561a);
                break;
            case 15:
                function1.invoke(sd1.f32012a);
                break;
            case 16:
                function1.invoke(a11.f47a);
                break;
            case 17:
                fxb.D(ivb0.b, new e0(function1, (byte) 21)).a();
                break;
            case 18:
                fxb.D(ivb0.b, new e0(function1, (byte) 24)).a();
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fxb.D(ivb0.b, new e0(function1, (byte) 23)).a();
                break;
            case 20:
                fxb.D(ivb0.b, new e0(function1, (byte) 22)).a();
                break;
            case 21:
                function1.invoke(yc1.f42364a);
                break;
            case 22:
                function1.invoke(z01.f43543a);
                break;
            case 23:
                function1.invoke(md1.f21574a);
                break;
            case 24:
                function1.invoke(w01.f38325a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(cbj0.f4064a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(fbj0.f9262a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(bbj0.f2311a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(jbj0.f16242a);
                break;
            default:
                function1.invoke(nm.f23748a);
                break;
        }
        return Unit.f46060a;
    }
}
