package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cml implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4610a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ cml(pz40 pz40Var, byte b) {
        this.f4610a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4610a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 1:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 2:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 3:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 4:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 5:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 6:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 7:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 8:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 9:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 10:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 11:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 12:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 13:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 14:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 15:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 16:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 17:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 18:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 20:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 21:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 22:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 23:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 24:
                Function0 function0 = (Function0) pz40Var.getValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(((lim) pz40Var.getValue()).g);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Integer.valueOf(((mim) pz40Var.getValue()).f);
            default:
                return Integer.valueOf(((nim) pz40Var.getValue()).g);
        }
    }
}
