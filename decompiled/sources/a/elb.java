package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class elb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7987a;
    public final /* synthetic */ oms0 b;

    public /* synthetic */ elb(oms0 oms0Var, byte b) {
        this.f7987a = b;
        this.b = oms0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7987a;
        oms0 oms0Var = this.b;
        switch (b) {
            case 0:
                return ((hgk0) oms0Var.d).getValue();
            case 1:
                return oms0Var.f();
            case 2:
                return ((hgk0) oms0Var.d).getValue();
            case 3:
                return oms0Var.f();
            case 4:
                return ((hgk0) oms0Var.d).getValue();
            case 5:
                return oms0Var.f();
            case 6:
                return ((hgk0) oms0Var.d).getValue();
            case 7:
                return oms0Var.f();
            case 8:
                return ((hgk0) oms0Var.d).getValue();
            case 9:
                return oms0Var.f();
            case 10:
                return ((hgk0) oms0Var.d).getValue();
            case 11:
                return oms0Var.f();
            case 12:
                return ((hgk0) oms0Var.d).getValue();
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
                return oms0Var.f();
            case 20:
                return ((hgk0) oms0Var.d).getValue();
            case 21:
                return oms0Var.f();
            case 22:
                return ((hgk0) oms0Var.d).getValue();
            case 23:
                return oms0Var.f();
            case 24:
                return ((hgk0) oms0Var.d).getValue();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return oms0Var.f();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((hgk0) oms0Var.d).getValue();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return oms0Var.f();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((hgk0) oms0Var.d).getValue();
            default:
                return ((hgk0) oms0Var.d).getValue();
        }
    }
}
