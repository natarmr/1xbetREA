package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f7f0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9056a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ f7f0(l7m0 l7m0Var, byte b) {
        this.f9056a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9056a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((p7f0) l7m0Var.getValue()).c);
            case 1:
                return Boolean.valueOf(((p7f0) l7m0Var.getValue()).d);
            case 2:
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                return bool;
            case 3:
                return Boolean.valueOf(!(((Number) l7m0Var.getValue()).floatValue() == 1.0f));
            case 4:
                return Boolean.valueOf(((u9f0) ((nbf0) l7m0Var.getValue()).c.getValue()).b);
            case 5:
                return ((g9g0) l7m0Var.getValue()).f10913a;
            case 6:
                return ((g9g0) l7m0Var.getValue()).b;
            case 7:
                lme0 lme0Var = xph0.Q1;
                return Integer.valueOf(((zph0) l7m0Var.getValue()).d);
            case 8:
                ne60 ne60Var = (ne60) l7m0Var.getValue();
                long j = ne60Var.f23370a;
                return ne60Var;
            case 9:
                q73 q73Var = i5i0.f14194a;
                ne60 ne60Var2 = (ne60) l7m0Var.getValue();
                long j2 = ne60Var2.f23370a;
                return ne60Var2;
            case 10:
                return Integer.valueOf(((ucj0) l7m0Var.getValue()).d.size());
            case 11:
                return Integer.valueOf(((wlj0) l7m0Var.getValue()).f39357a);
            case 12:
                return (v6n) l7m0Var.getValue();
            case 13:
                zie0 zie0Var = fpk0.V1;
                return ((kpk0) l7m0Var.getValue()).e;
            case 14:
                zie0 zie0Var2 = fpk0.V1;
                return Integer.valueOf(((mwk0) l7m0Var.getValue()).f22508a);
            case 15:
                zie0 zie0Var3 = fpk0.V1;
                return ((kpk0) l7m0Var.getValue()).f18681a;
            case 16:
                zie0 zie0Var4 = fpk0.V1;
                return ((kpk0) l7m0Var.getValue()).b;
            case 17:
                zie0 zie0Var5 = fpk0.V1;
                return ((kpk0) l7m0Var.getValue()).c;
            case 18:
                zie0 zie0Var6 = fpk0.V1;
                return ((kpk0) l7m0Var.getValue()).d;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                zie0 zie0Var7 = fpk0.V1;
                return Integer.valueOf(((kwk0) l7m0Var.getValue()).f19006a);
            case 20:
                Boolean bool2 = (Boolean) l7m0Var.getValue();
                bool2.getClass();
                return bool2;
            case 21:
                Boolean bool3 = (Boolean) l7m0Var.getValue();
                bool3.getClass();
                return bool3;
            case 22:
                if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                    return new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                }
                return new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            case 23:
                if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                    return new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                }
                return new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            case 24:
                return Boolean.valueOf(((Number) l7m0Var.getValue()).floatValue() < 0.5f);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool4 = (Boolean) l7m0Var.getValue();
                bool4.getClass();
                return bool4;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ubn0) l7m0Var.getValue()).d;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Boolean.valueOf(((ubn0) l7m0Var.getValue()).b);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Boolean bool5 = (Boolean) l7m0Var.getValue();
                bool5.getClass();
                return bool5;
            default:
                return Boolean.valueOf(((mdn0) l7m0Var.getValue()).a());
        }
    }
}
