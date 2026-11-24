package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9618a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ fj4(Function1 function1, byte b) {
        this.f9618a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9618a;
        s320 s320Var = s320.f31535a;
        w320 w320Var = w320.f38479a;
        x320 x320Var = x320.f40195a;
        r320 r320Var = r320.f29766a;
        t320 t320Var = t320.f33245a;
        j75 j75Var = j75.f16024a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(qh4.f28720a);
                break;
            case 1:
                function1.invoke(v64.f36854a);
                break;
            case 2:
                function1.invoke(e74.f7316a);
                break;
            case 3:
                function1.invoke(x64.f40343a);
                break;
            case 4:
                function1.invoke(j520.f15913a);
                break;
            case 5:
                function1.invoke(w320Var);
                break;
            case 6:
                function1.invoke(s320Var);
                break;
            case 7:
                function1.invoke(b420.f1937a);
                break;
            case 8:
                function1.invoke(x320Var);
                break;
            case 9:
                function1.invoke(i320.f14077a);
                break;
            case 10:
                function1.invoke(s320Var);
                break;
            case 11:
                function1.invoke(h320.f12365a);
                break;
            case 12:
                function1.invoke(r320Var);
                break;
            case 13:
                function1.invoke(w320Var);
                break;
            case 14:
                function1.invoke(t320Var);
                break;
            case 15:
                function1.invoke(x320Var);
                break;
            case 16:
                function1.invoke(r320Var);
                break;
            case 17:
                function1.invoke(t320Var);
                break;
            case 18:
                function1.invoke(e75.f7317a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(i75.f14275a);
                break;
            case 20:
                fxb.D(ivb0.b, new fj4(function1, (byte) 22)).a();
                break;
            case 21:
                fxb.D(ivb0.b, new fj4(function1, (byte) 23)).a();
                break;
            case 22:
                function1.invoke(j75Var);
                break;
            case 23:
                function1.invoke(j75Var);
                break;
            case 24:
                fxb.D(ivb0.b, new fj4(function1, (byte) 18)).a();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(i17.f13983a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(y17.f41841a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(i46.f14131a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(Boolean.TRUE);
                break;
            default:
                function1.invoke(Boolean.FALSE);
                break;
        }
        return Unit.f46060a;
    }
}
