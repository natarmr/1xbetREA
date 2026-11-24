package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s39 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31545a;
    public final /* synthetic */ xk80 b;

    public /* synthetic */ s39(xk80 xk80Var, byte b) {
        this.f31545a = b;
        this.b = xk80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iK;
        byte b = this.f31545a;
        xk80 xk80Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(xk80Var.k());
            case 1:
                return Integer.valueOf(xk80Var.k());
            case 2:
                return Boolean.valueOf(xk80Var.k.a());
            case 3:
                int iN = xk80Var.n();
                if (iN > 9) {
                    iN = 9;
                }
                return Integer.valueOf(iN);
            case 4:
                int iK2 = xk80Var.k();
                float fL = xk80Var.l();
                int iN2 = xk80Var.n() - 1;
                if (fL > 0.4f && iK2 < iN2) {
                    iK2++;
                } else if (fL < -0.4f && iK2 > 0) {
                    iK2--;
                }
                return Integer.valueOf(iK2);
            case 5:
                return Integer.valueOf(xk80Var.k());
            case 6:
                return Integer.valueOf(xk80Var.k());
            case 7:
                return new Pair(Integer.valueOf(xk80Var.k()), Integer.valueOf(xk80Var.r()));
            case 8:
                return Integer.valueOf(xk80Var.k());
            case 9:
                return Boolean.valueOf(xk80Var.k.a());
            case 10:
                return Integer.valueOf(xk80Var.k());
            case 11:
                return Integer.valueOf(xk80Var.n());
            case 12:
                return Integer.valueOf(xk80Var.n());
            case 13:
                return Integer.valueOf(xk80Var.k());
            case 14:
                return Integer.valueOf(xk80Var.k());
            case 15:
                return Integer.valueOf(xk80Var.k());
            case 16:
                return Integer.valueOf(xk80Var.k());
            case 17:
                return Integer.valueOf(xk80Var.k());
            case 18:
                return Integer.valueOf(xk80Var.k());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Integer.valueOf(xk80Var.k());
            case 20:
                return Float.valueOf(xk80Var.l() + xk80Var.k());
            case 21:
                return Float.valueOf(xk80Var.l() + xk80Var.k());
            case 22:
                return Integer.valueOf(xk80Var.k());
            case 23:
                return Integer.valueOf(xk80Var.k());
            case 24:
                return Integer.valueOf(xk80Var.k());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(xk80Var.k());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Integer.valueOf(xk80Var.k.a() ? xk80Var.r.l() : xk80Var.k());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                boolean zA = xk80Var.k.a();
                cgk0 cgk0Var = xk80Var.q;
                if (!zA) {
                    iK = xk80Var.k();
                } else if (cgk0Var.l() != -1) {
                    iK = cgk0Var.l();
                } else {
                    float fAbs = Math.abs(xk80Var.l());
                    w6k w6kVar = xk80Var.n;
                    yk80 yk80Var = zk80.f44518a;
                    if (fAbs >= Math.abs(Math.min(w6kVar.w0(56.0f), xk80Var.o() / 2.0f) / xk80Var.o())) {
                        boolean zBooleanValue = ((Boolean) ((hgk0) xk80Var.F).getValue()).booleanValue();
                        int i = xk80Var.e;
                        iK = zBooleanValue ? i + 1 : i;
                    } else {
                        iK = xk80Var.k();
                    }
                }
                return Integer.valueOf(xk80Var.j(iK));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Integer.valueOf(xk80Var.n());
            default:
                return Boolean.valueOf(xk80Var.k.a());
        }
    }
}
