package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zk2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44508a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ zk2(Function1 function1, byte b) {
        this.f44508a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44508a;
        sk2 sk2Var = sk2.f32327a;
        sh2 sh2Var = sh2.f32189a;
        x44 x44Var = x44.f40247a;
        ha4 ha4Var = ha4.f12708a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(sk2Var);
                break;
            case 1:
                function1.invoke(gk2.f11426a);
                break;
            case 2:
                function1.invoke(sk2Var);
                break;
            case 3:
                function1.invoke(rk2.f30626a);
                break;
            case 4:
                function1.invoke(lh2.f20034a);
                break;
            case 5:
                function1.invoke(jh2.f16506a);
                break;
            case 6:
                function1.invoke(sh2Var);
                break;
            case 7:
                function1.invoke(sh2Var);
                break;
            case 8:
                function1.invoke(fm2.f9765a);
                break;
            case 9:
                function1.invoke(om2.f25483a);
                break;
            case 10:
                function1.invoke(gm2.f11522a);
                break;
            case 11:
                function1.invoke(pm2.f27212a);
                break;
            case 12:
                function1.invoke(m93.f21395a);
                break;
            case 13:
                function1.invoke(x44Var);
                break;
            case 14:
                function1.invoke(v44.f36761a);
                break;
            case 15:
                function1.invoke(x44Var);
                break;
            case 16:
                function1.invoke(f74.f9041a);
                break;
            case 17:
                function1.invoke(w64.f38608a);
                break;
            case 18:
                function1.invoke(c74.f3844a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(i74.f14273a);
                break;
            case 20:
                function1.invoke(s94.f31835a);
                break;
            case 21:
                function1.invoke(q94.f28329a);
                break;
            case 22:
                function1.invoke(w94.f38759a);
                break;
            case 23:
                function1.invoke(v94.f37015a);
                break;
            case 24:
                function1.invoke(aa4.f506a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(ha4Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(ha4Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(ea4.f7449a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(ca4.f3989a);
                break;
            default:
                function1.invoke(ce4.f4194a);
                break;
        }
        return Unit.f46060a;
    }
}
