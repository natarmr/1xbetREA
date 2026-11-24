package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pd10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26785a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ pd10(Function1 function1, byte b) {
        this.f26785a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26785a;
        hl10 hl10Var = hl10.f13234a;
        sl10 sl10Var = sl10.f32377a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(gc10.f11037a);
                break;
            case 1:
                function1.invoke(bc10.f2332a);
                break;
            case 2:
                function1.invoke(je10.f16353a);
                break;
            case 3:
                function1.invoke(oe10.f25101a);
                break;
            case 4:
                function1.invoke(dg10.f6027a);
                break;
            case 5:
                function1.invoke(j150.f15716a);
                break;
            case 6:
                function1.invoke(hl10Var);
                break;
            case 7:
                function1.invoke(sl10Var);
                break;
            case 8:
                function1.invoke(ml10.f21967a);
                break;
            case 9:
                function1.invoke(nl10.f23706a);
                break;
            case 10:
                function1.invoke(hl10Var);
                break;
            case 11:
                function1.invoke(sl10Var);
                break;
            case 12:
                function1.invoke(ql10.f28913a);
                break;
            case 13:
                function1.invoke(fl10.f9719a);
                break;
            case 14:
                function1.invoke(dl10.f6258a);
                break;
            case 15:
                function1.invoke(ol10.f25432a);
                break;
            case 16:
                function1.invoke(ll10.f20226a);
                break;
            case 17:
                function1.invoke(rl10.f30676a);
                break;
            case 18:
                function1.invoke(pl10.f27160a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(kl10.f18464a);
                break;
            case 20:
                function1.invoke(jr10.f16981a);
                break;
            case 21:
                function1.invoke(ty20.f);
                break;
            case 22:
                function1.invoke(ty20.f);
                break;
            case 23:
                function1.invoke(ty20.f);
                break;
            case 24:
                function1.invoke(ty20.f);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(x030.c);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(new d130());
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(x030.f40051a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(x030.f40051a);
                break;
            default:
                function1.invoke(x030.b);
                break;
        }
        return Unit.f46060a;
    }
}
