package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m040 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20936a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ m040(Function1 function1, byte b) {
        this.f20936a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20936a;
        tu30 tu30Var = tu30.f34532a;
        u740 u740Var = u740.f35166a;
        no40 no40Var = no40.f23852a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(vt30.f37983a);
                break;
            case 1:
                function1.invoke(uu30.f36283a);
                break;
            case 2:
                function1.invoke(tu30Var);
                break;
            case 3:
                function1.invoke(tu30Var);
                break;
            case 4:
                function1.invoke(xt30.f41446a);
                break;
            case 5:
                function1.invoke(av30.f1508a);
                break;
            case 6:
                function1.invoke(wu30.f39773a);
                break;
            case 7:
                function1.invoke(su30.f32803a);
                break;
            case 8:
                function1.invoke(ou30.f25858a);
                break;
            case 9:
                function1.invoke(k740.f17801a);
                break;
            case 10:
                function1.invoke(u740Var);
                break;
            case 11:
                function1.invoke(l740.f19538a);
                break;
            case 12:
                function1.invoke(m740.f21302a);
                break;
            case 13:
                function1.invoke(u740Var);
                break;
            case 14:
                function1.invoke(ya40.f42277a);
                break;
            case 15:
                function1.invoke(va40.f37068a);
                break;
            case 16:
                function1.invoke(qh40.f28721a);
                break;
            case 17:
                function1.invoke(ph40.f26979a);
                break;
            case 18:
                function1.invoke(oh40.f25249a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(mh40.f21774a);
                break;
            case 20:
                function1.invoke(sh40.f32193a);
                break;
            case 21:
                function1.invoke(bk40.f2732a);
                break;
            case 22:
                function1.invoke(zj40.f44469a);
                break;
            case 23:
                function1.invoke(an40.f1133a);
                break;
            case 24:
                function1.invoke(no40Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(no40Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(m150.f20989a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(q150.f27935a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(z050.f43549a);
                break;
            default:
                function1.invoke(c150.f3558a);
                break;
        }
        return Unit.f46060a;
    }
}
