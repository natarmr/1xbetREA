package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kk7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18421a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ kk7(l7m0 l7m0Var, byte b) {
        this.f18421a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        String str3;
        byte b = this.f18421a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return ((yvg0) l7m0Var.getValue()).m;
            case 1:
                return ((yvg0) l7m0Var.getValue()).f;
            case 2:
                return ((yvg0) l7m0Var.getValue()).i;
            case 3:
                return ((yvg0) l7m0Var.getValue()).g;
            case 4:
                return ((yvg0) l7m0Var.getValue()).j;
            case 5:
                return ((yvg0) l7m0Var.getValue()).l;
            case 6:
                return ((yvg0) l7m0Var.getValue()).h;
            case 7:
                return ((yvg0) l7m0Var.getValue()).k;
            case 8:
                yk5 yk5Var = au7.U1;
                return Integer.valueOf(((qu7) l7m0Var.getValue()).b);
            case 9:
                yk5 yk5Var2 = au7.U1;
                return ((qu7) l7m0Var.getValue()).c;
            case 10:
                yk5 yk5Var3 = au7.U1;
                return ((qu7) l7m0Var.getValue()).f29334a;
            case 11:
                yk5 yk5Var4 = au7.U1;
                return ((qu7) l7m0Var.getValue()).d;
            case 12:
                return Float.valueOf(1.0f - ((Number) l7m0Var.getValue()).floatValue());
            case 13:
                return Float.valueOf((1.0f - ((Number) l7m0Var.getValue()).floatValue()) * 14.66f);
            case 14:
                return new ycl((1.0f - ((Number) l7m0Var.getValue()).floatValue()) * l18.p);
            case 15:
                return new ycl((1.0f - ((Number) l7m0Var.getValue()).floatValue()) * l18.q);
            case 16:
                return Float.valueOf(((Number) l7m0Var.getValue()).floatValue());
            case 17:
                return Float.valueOf(1.0f - ((Number) l7m0Var.getValue()).floatValue());
            case 18:
                return Float.valueOf(((Number) l7m0Var.getValue()).floatValue());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(l7m0Var.getValue() != null);
            case 20:
                kg30 kg30Var = (kg30) l7m0Var.getValue();
                if (kg30Var == null || (str = kg30Var.f18223a) == null) {
                    return null;
                }
                return str.concat(Separators.SP);
            case 21:
                kg30 kg30Var2 = (kg30) l7m0Var.getValue();
                if (kg30Var2 == null || (str2 = kg30Var2.b) == null) {
                    return null;
                }
                return str2.concat(Separators.COLON);
            case 22:
                kg30 kg30Var3 = (kg30) l7m0Var.getValue();
                if (kg30Var3 == null || (str3 = kg30Var3.c) == null) {
                    return null;
                }
                return str3.concat(Separators.COLON);
            case 23:
                kg30 kg30Var4 = (kg30) l7m0Var.getValue();
                if (kg30Var4 != null) {
                    return kg30Var4.d;
                }
                return null;
            case 24:
                return Boolean.valueOf(((tly) l7m0Var.getValue()).f34169a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Boolean.valueOf(((Number) l7m0Var.getValue()).floatValue() >= 1.0f);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Boolean.valueOf(!(((Number) l7m0Var.getValue()).floatValue() == 1.0f));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((Boolean) l7m0Var.getValue()).booleanValue() ? new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109) : new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Boolean.valueOf(l7m0Var.getValue() != null);
            default:
                kg30 kg30Var5 = (kg30) l7m0Var.getValue();
                String str4 = kg30Var5 != null ? kg30Var5.f18223a : null;
                return str4 == null ? "" : str4;
        }
    }
}
