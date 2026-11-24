package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rip implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30554a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ rip(pz40 pz40Var, byte b) {
        this.f30554a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30554a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(((oim) pz40Var.getValue()).g);
            case 1:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 2:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 3:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 4:
                pz40Var.setValue(null);
                return Unit.f46060a;
            case 5:
                return new i8z((Function1) pz40Var.getValue());
            case 6:
                return (hbz) ((Function0) pz40Var.getValue()).invoke();
            case 7:
                return new hcz((Function1) pz40Var.getValue());
            case 8:
                return new xdz((Function1) pz40Var.getValue());
            case 9:
                return (String) pz40Var.getValue();
            case 10:
                return Boolean.valueOf(((tw7) pz40Var.getValue()).c);
            case 11:
                wsz wszVar = yr10.R1;
                return Integer.valueOf(((ru9) pz40Var.getValue()).c);
            case 12:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 13:
                return ((lem) pz40Var.getValue()).b;
            case 14:
                htz htzVar = ki60.q2;
                return Integer.valueOf(((vi60) pz40Var.getValue()).b.size());
            case 15:
                return ((q380) pz40Var.getValue()).c;
            case 16:
                return ((q380) pz40Var.getValue()).d;
            case 17:
                return Boolean.valueOf(((ld80) pz40Var.getValue()).f19837a);
            case 18:
                fl70 fl70Var = b190.V1;
                return Integer.valueOf(((m190) pz40Var.getValue()).c);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                j6z j6zVar = (j6z) pz40Var.getValue();
                if (j6zVar != null) {
                    return j6zVar;
                }
                adx.d("Required value was null.");
                csj.b();
                return null;
            case 20:
                ((Function1) pz40Var.getValue()).invoke(i2e0.f14043a);
                return Unit.f46060a;
            case 21:
                ((Function1) pz40Var.getValue()).invoke(j2e0.f15776a);
                return Unit.f46060a;
            case 22:
                return Boolean.valueOf(((apm) pz40Var.getValue()).d);
            case 23:
                return Integer.valueOf(((apm) pz40Var.getValue()).c);
            case 24:
                ((Function0) pz40Var.getValue()).invoke();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) pz40Var.getValue()).invoke(e0i0.f6991a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) pz40Var.getValue()).invoke(c0i0.f3526a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) pz40Var.getValue()).invoke(h0i0.f12237a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((mem) pz40Var.getValue()).b;
            default:
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    return new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                }
                return new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
        }
    }
}
