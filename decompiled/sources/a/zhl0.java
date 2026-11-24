package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zhl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44399a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ zhl0(pz40 pz40Var, byte b) {
        this.f44399a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44399a;
        boolean z = false;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                return ((chl0) pz40Var.getValue()).b;
            case 1:
                return ((chl0) pz40Var.getValue()).c;
            case 2:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).e);
            case 3:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).f);
            case 4:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).g);
            case 5:
                if (((chl0) pz40Var.getValue()).h && !((chl0) pz40Var.getValue()).e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                return ((chl0) pz40Var.getValue()).f4366a;
            case 7:
                return ((chl0) pz40Var.getValue()).b;
            case 8:
                return Boolean.valueOf(pz40Var.getValue() == eex.f7695a);
            case 9:
                return Boolean.valueOf(pz40Var.getValue() == dex.f5973a);
            case 10:
                return Boolean.valueOf(pz40Var.getValue() == eex.b);
            case 11:
                return Boolean.valueOf(pz40Var.getValue() == dex.b);
            case 12:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 13:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 14:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 15:
                return (j6z) pz40Var.getValue();
            case 16:
                fxa0 fxa0Var = (fxa0) pz40Var.getValue();
                fxa0 fxa0Var2 = fxa0.b;
                if (fxa0Var == fxa0Var2) {
                    fxa0Var2 = fxa0.f10302a;
                }
                pz40Var.setValue(fxa0Var2);
                return Unit.f46060a;
            case 17:
                pz40Var.setValue(fxa0.c);
                return Unit.f46060a;
            case 18:
                return ((yar0) pz40Var.getValue()).b;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((yar0) pz40Var.getValue()).c;
            case 20:
                return ((yar0) pz40Var.getValue()).d;
            case 21:
                return ((yar0) pz40Var.getValue()).e;
            case 22:
                return ((yar0) pz40Var.getValue()).f;
            case 23:
                return ((abr0) pz40Var.getValue()).d;
            case 24:
                return ((abr0) pz40Var.getValue()).e;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((abr0) pz40Var.getValue()).b;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((abr0) pz40Var.getValue()).f;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((abr0) pz40Var.getValue()).g;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((abr0) pz40Var.getValue()).h;
            default:
                return ((abr0) pz40Var.getValue()).i;
        }
    }
}
