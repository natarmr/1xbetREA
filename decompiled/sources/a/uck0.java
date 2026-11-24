package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uck0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35434a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ uck0(Function1 function1, byte b) {
        this.f35434a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35434a;
        n0l0 n0l0Var = n0l0.f22704a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(mck0.f21557a);
                break;
            case 1:
                function1.invoke(jck0.f16282a);
                break;
            case 2:
                function1.invoke(n0l0Var);
                break;
            case 3:
                function1.invoke(p0l0.f26157a);
                break;
            case 4:
                function1.invoke(t0l0.f33125a);
                break;
            case 5:
                function1.invoke(r0l0.f29636a);
                break;
            case 6:
                function1.invoke(n0l0Var);
                break;
            case 7:
                function1.invoke(q0l0.f27905a);
                break;
            case 8:
                if (function1 != null) {
                    function1.invoke(h2l0.d);
                }
                break;
            case 9:
                if (function1 != null) {
                    function1.invoke(h2l0.f12340a);
                }
                break;
            case 10:
                if (function1 != null) {
                    function1.invoke(h2l0.c);
                }
                break;
            case 11:
                if (function1 != null) {
                    function1.invoke(h2l0.e);
                }
                break;
            case 12:
                if (function1 != null) {
                    function1.invoke(h2l0.c);
                }
                break;
            case 13:
                if (function1 != null) {
                    function1.invoke(h2l0.c);
                }
                break;
            case 14:
                if (function1 != null) {
                    function1.invoke(h2l0.c);
                }
                break;
            case 15:
                if (function1 != null) {
                    function1.invoke(h2l0.c);
                }
                break;
            case 16:
                if (function1 != null) {
                    function1.invoke(k2l0.f17579a);
                }
                break;
            case 17:
                if (function1 != null) {
                    function1.invoke(j2l0.f15785a);
                }
                break;
            case 18:
                function1.invoke(new vxq0(t4l0.f33326a));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new vxq0(y4l0.f42008a));
                break;
            case 20:
                function1.invoke(bgl0.f2560a);
                break;
            case 21:
                function1.invoke(cgl0.f4318a);
                break;
            case 22:
                function1.invoke(vfl0.f37338a);
                break;
            case 23:
                if (function1 != null) {
                    function1.invoke(ugl0.f35631a);
                }
                break;
            case 24:
                if (function1 != null) {
                    function1.invoke(ugl0.b);
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (function1 != null) {
                    function1.invoke(ugl0.f35631a);
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (function1 != null) {
                    function1.invoke(ugl0.b);
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (function1 != null) {
                    function1.invoke(ugl0.f35631a);
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (function1 != null) {
                    function1.invoke(ugl0.b);
                }
                break;
            default:
                if (function1 != null) {
                    function1.invoke(ugl0.f35631a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
