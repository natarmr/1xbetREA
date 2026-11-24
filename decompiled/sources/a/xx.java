package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xx implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41634a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ xx(pz40 pz40Var, byte b) {
        this.f41634a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41634a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(((ty) pz40Var.getValue()).f34727a);
            case 1:
                return ((uy) pz40Var.getValue()).f36464a;
            case 2:
                return ((vy) pz40Var.getValue()).f38224a;
            case 3:
                return ((uy) pz40Var.getValue()).b;
            case 4:
                return ((vy) pz40Var.getValue()).b;
            case 5:
                return Integer.valueOf(((ty) pz40Var.getValue()).b);
            case 6:
                return ((uy) pz40Var.getValue()).c;
            case 7:
                return ((vy) pz40Var.getValue()).c;
            case 8:
                return Integer.valueOf(((ty) pz40Var.getValue()).c);
            case 9:
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 10:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 11:
                j6z j6zVar = (j6z) pz40Var.getValue();
                if (j6zVar != null) {
                    return j6zVar;
                }
                adx.d("Required value was null.");
                csj.b();
                return null;
            case 12:
                j6z j6zVar2 = (j6z) pz40Var.getValue();
                if (j6zVar2 != null) {
                    return j6zVar2;
                }
                adx.d("Required value was null.");
                csj.b();
                return null;
            case 13:
                if (pz40Var != null) {
                    return (List) pz40Var.getValue();
                }
                return null;
            case 14:
                return Boolean.valueOf(((sw7) pz40Var.getValue()).c);
            case 15:
                return Boolean.valueOf(((rw7) pz40Var.getValue()).c);
            case 16:
                ((Function0) pz40Var.getValue()).invoke();
                return Unit.f46060a;
            case 17:
                ((Function0) pz40Var.getValue()).invoke();
                return Unit.f46060a;
            case 18:
                ((Function0) pz40Var.getValue()).invoke();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function0) pz40Var.getValue()).invoke();
                return Unit.f46060a;
            case 20:
                return Boolean.valueOf(pz40Var.getValue() == gex.f11177a);
            case 21:
                return Boolean.valueOf(pz40Var.getValue() == gex.b);
            case 22:
                uts0 uts0Var = lcc.f19792a;
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 23:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case 24:
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    return new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                }
                return new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    return new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                }
                return new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Boolean bool = (Boolean) pz40Var.getValue();
                bool.booleanValue();
                return bool;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                return Unit.f46060a;
            default:
                int i = q1j.n2;
                return Integer.valueOf(((e2j) pz40Var.getValue()).f7089a.f25510a.size());
        }
    }
}
