package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class m6x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21292a;
    public final /* synthetic */ oms0 b;

    public /* synthetic */ m6x(oms0 oms0Var, byte b) {
        this.f21292a = b;
        this.b = oms0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21292a;
        oms0 oms0Var = this.b;
        switch (b) {
            case 0:
                return oms0Var.f();
            case 1:
                return oms0Var.f();
            case 2:
                return ((hgk0) oms0Var.d).getValue();
            case 3:
                return ((hgk0) oms0Var.d).getValue();
            case 4:
                return oms0Var.f();
            case 5:
                return oms0Var.f();
            case 6:
                return ((hgk0) oms0Var.d).getValue();
            case 7:
                return ((hgk0) oms0Var.d).getValue();
            case 8:
                return oms0Var.f();
            case 9:
                return oms0Var.f();
            case 10:
                return ((hgk0) oms0Var.d).getValue();
            case 11:
                return ((hgk0) oms0Var.d).getValue();
            case 12:
                return oms0Var.f();
            case 13:
                return oms0Var.f();
            case 14:
                return ((hgk0) oms0Var.d).getValue();
            case 15:
                return oms0Var.f();
            case 16:
                return ((hgk0) oms0Var.d).getValue();
            case 17:
                return oms0Var.f();
            case 18:
                return ((hgk0) oms0Var.d).getValue();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((hgk0) oms0Var.d).getValue();
            case 20:
                return oms0Var.f();
            case 21:
                return oms0Var.f();
            case 22:
                return ((hgk0) oms0Var.d).getValue();
            case 23:
                return ((hgk0) oms0Var.d).getValue();
            case 24:
                return oms0Var.f();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return oms0Var.f();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((hgk0) oms0Var.d).getValue();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return oms0Var.f();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((hgk0) oms0Var.d).getValue();
            default:
                return oms0Var.f();
        }
    }
}
