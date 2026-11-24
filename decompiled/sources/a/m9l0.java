package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m9l0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21416a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ m9l0(pz40 pz40Var, byte b) {
        this.f21416a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21416a;
        boolean z = false;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    return new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                }
                return new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            case 1:
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    return new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                }
                return new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            case 2:
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    return new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                }
                return new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            case 3:
                return ((chl0) pz40Var.getValue()).b;
            case 4:
                return ((chl0) pz40Var.getValue()).c;
            case 5:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).e);
            case 6:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).f);
            case 7:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).g);
            case 8:
                if (((chl0) pz40Var.getValue()).h && !((chl0) pz40Var.getValue()).e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                return ((chl0) pz40Var.getValue()).f4366a;
            case 10:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).e);
            case 11:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).f);
            case 12:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).g);
            case 13:
                if (((chl0) pz40Var.getValue()).h && !((chl0) pz40Var.getValue()).e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                return ((chl0) pz40Var.getValue()).f4366a;
            case 15:
                return ((chl0) pz40Var.getValue()).b;
            case 16:
                return ((chl0) pz40Var.getValue()).c;
            case 17:
                return ((chl0) pz40Var.getValue()).b;
            case 18:
                return ((chl0) pz40Var.getValue()).c;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).e);
            case 20:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).f);
            case 21:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).g);
            case 22:
                if (((chl0) pz40Var.getValue()).h && !((chl0) pz40Var.getValue()).e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                return ((chl0) pz40Var.getValue()).f4366a;
            case 24:
                return ((chl0) pz40Var.getValue()).c;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).e);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).f);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Boolean.valueOf(((chl0) pz40Var.getValue()).g);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (((chl0) pz40Var.getValue()).h && !((chl0) pz40Var.getValue()).e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return ((chl0) pz40Var.getValue()).f4366a;
        }
    }
}
