package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class plh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27181a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ plh(l7m0 l7m0Var, byte b) {
        this.f27181a = b;
        this.b = l7m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27181a;
        boolean z = true;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return ((kmh) l7m0Var.getValue()).c;
            case 1:
                return ((kmh) l7m0Var.getValue()).b;
            case 2:
                return ((tsk) l7m0Var.getValue()).c.f11834a;
            case 3:
                return ((tsk) l7m0Var.getValue()).c.b;
            case 4:
                return Boolean.valueOf(((tsk) l7m0Var.getValue()).c.c);
            case 5:
                return Boolean.valueOf((((Number) l7m0Var.getValue()).floatValue() == 1.0f ? 1 : 0) ^ 1);
            case 6:
                return ((tsk) l7m0Var.getValue()).c.f11834a;
            case 7:
                return ((tsk) l7m0Var.getValue()).c.b;
            case 8:
                return Boolean.valueOf(((tsk) l7m0Var.getValue()).c.c);
            case 9:
                return ((tsk) l7m0Var.getValue()).c.f11834a;
            case 10:
                return ((tsk) l7m0Var.getValue()).c.b;
            case 11:
                return Boolean.valueOf(((tsk) l7m0Var.getValue()).c.c);
            case 12:
                return ((tsk) l7m0Var.getValue()).c.f11834a;
            case 13:
                return ((tsk) l7m0Var.getValue()).c.b;
            case 14:
                return Boolean.valueOf(((tsk) l7m0Var.getValue()).c.c);
            case 15:
                return ((tsk) l7m0Var.getValue()).f34464a;
            case 16:
                return Float.valueOf(((Number) l7m0Var.getValue()).floatValue());
            case 17:
                return ((z3o) l7m0Var.getValue()).c.f7192a;
            case 18:
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                return bool;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(((z3o) l7m0Var.getValue()).c.c);
            case 20:
                return ((g9o) l7m0Var.getValue()).b.f33520a;
            case 21:
                return ((g9o) l7m0Var.getValue()).b.b;
            case 22:
                return Boolean.valueOf((((Number) l7m0Var.getValue()).floatValue() == 1.0f ? 1 : 0) ^ 1);
            case 23:
                return Integer.valueOf(((Number) l7m0Var.getValue()).floatValue() < 0.0f ? -((int) ((Number) l7m0Var.getValue()).floatValue()) : 0);
            case 24:
                return ((y4p) l7m0Var.getValue()).c;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Boolean.valueOf(((y4p) l7m0Var.getValue()).b);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Boolean.valueOf(((tly) l7m0Var.getValue()).f34169a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Boolean.valueOf(((qnp) l7m0Var.getValue()).d);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                nek nekVar = rop.a2;
                ysv ysvVar = ((qnp) l7m0Var.getValue()).f29041a;
                usv usvVar = ysvVar instanceof usv ? (usv) ysvVar : null;
                if ((usvVar != null ? usvVar.f36229a : null) != h8l0.LARGE_HEADER_MEDIUM_TABS) {
                    ysv ysvVar2 = ((qnp) l7m0Var.getValue()).f29041a;
                    usv usvVar2 = ysvVar2 instanceof usv ? (usv) ysvVar2 : null;
                    if ((usvVar2 != null ? usvVar2.f36229a : null) != h8l0.NO_HEADER_LARGE_TABS) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return ((qyp) l7m0Var.getValue()).b.f12088a;
        }
    }
}
