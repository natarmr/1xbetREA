package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g7o0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10827a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ g7o0(l7m0 l7m0Var, byte b) {
        this.f10827a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10827a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return ((j7o0) l7m0Var.getValue()).f16052a;
            case 1:
                return ((j7o0) l7m0Var.getValue()).b;
            case 2:
                return ((j7o0) l7m0Var.getValue()).c;
            case 3:
                return Boolean.valueOf(((j7o0) l7m0Var.getValue()).d);
            case 4:
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                return bool;
            case 5:
                return ((wzo0) l7m0Var.getValue()).b;
            case 6:
                return Boolean.valueOf(((wzo0) l7m0Var.getValue()).f40031a);
            case 7:
                return ((c3p0) l7m0Var.getValue()).b;
            case 8:
                return Boolean.valueOf(((c3p0) l7m0Var.getValue()).f3689a);
            case 9:
                return ((r7p0) l7m0Var.getValue()).b;
            case 10:
                return ((r7p0) l7m0Var.getValue()).c;
            case 11:
                return Boolean.valueOf(((r7p0) l7m0Var.getValue()).d);
            case 12:
                return ((xap0) l7m0Var.getValue()).f40569a;
            case 13:
                return ((xap0) l7m0Var.getValue()).b;
            case 14:
                return ((xap0) l7m0Var.getValue()).c;
            case 15:
                return ((xap0) l7m0Var.getValue()).d;
            case 16:
                return Boolean.valueOf(((xap0) l7m0Var.getValue()).e);
            case 17:
                return ((bbp0) ((sbp0) l7m0Var.getValue()).c.getValue()).f2319a;
            case 18:
                return (gbp0) ((sbp0) l7m0Var.getValue()).b.getValue();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((bbp0) ((sbp0) l7m0Var.getValue()).c.getValue()).b;
            case 20:
                return Boolean.valueOf(((bbp0) ((sbp0) l7m0Var.getValue()).c.getValue()).c);
            case 21:
                return Integer.valueOf(((gbp0) l7m0Var.getValue()).f11026a.f9273a ? 1 : 0);
            case 22:
                return Boolean.valueOf(!(((Number) l7m0Var.getValue()).floatValue() == 1.0f));
            case 23:
                return Integer.valueOf(((t3r0) l7m0Var.getValue()).b);
            case 24:
                return Boolean.valueOf(((x6r0) l7m0Var.getValue()).b);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(((CharSequence) l7m0Var.getValue()).length() == 0 ? 2 : 1);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (v6n) l7m0Var.getValue();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                j6m0 j6m0Var = v9r0.O1;
                return ((cdr0) l7m0Var.getValue()).a();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((cjr0) l7m0Var.getValue()).f4474a;
            default:
                return ((jjr0) l7m0Var.getValue()).b;
        }
    }
}
