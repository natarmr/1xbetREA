package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ojr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25374a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ ojr0(l7m0 l7m0Var, byte b) {
        this.f25374a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25374a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return ((cjr0) l7m0Var.getValue()).b;
            case 1:
                return ((jjr0) l7m0Var.getValue()).c;
            case 2:
                Object value = l7m0Var.getValue();
                hjr0 hjr0Var = value instanceof hjr0 ? (hjr0) value : null;
                return hjr0Var != null ? hjr0Var.c : new smr0("", false);
            case 3:
                return Boolean.valueOf(!Intrinsics.d(l7m0Var.getValue(), new smr0("", false)));
            case 4:
                return Boolean.valueOf(((smr0) l7m0Var.getValue()).b);
            case 5:
                return ((smr0) l7m0Var.getValue()).f32461a;
            case 6:
                return ((bwr0) l7m0Var.getValue()).f3340a;
            case 7:
                return ((vvr0) l7m0Var.getValue()).c;
            case 8:
                return ((vvr0) l7m0Var.getValue()).b;
            case 9:
                return ((bwr0) l7m0Var.getValue()).b;
            case 10:
                return Boolean.valueOf(Intrinsics.d(l7m0Var.getValue(), drq0.f6576a));
            case 11:
                return ((mfs0) l7m0Var.getValue()).f21709a;
            case 12:
                return ((mfs0) l7m0Var.getValue()).b;
            case 13:
                return ((mfs0) l7m0Var.getValue()).c;
            case 14:
                return ((bls0) l7m0Var.getValue()).b.f16686a;
            case 15:
                return ((bls0) l7m0Var.getValue()).b.b;
            case 16:
                return Boolean.valueOf(((bls0) l7m0Var.getValue()).b.c);
            case 17:
                return ((cat0) l7m0Var.getValue()).f4030a;
            case 18:
                return ((cat0) l7m0Var.getValue()).b;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((cat0) l7m0Var.getValue()).c;
            case 20:
                return Boolean.valueOf(((cat0) l7m0Var.getValue()).d);
            case 21:
                return ((xat0) l7m0Var.getValue()).f40574a;
            case 22:
                return ((xat0) l7m0Var.getValue()).b;
            case 23:
                return ((xat0) l7m0Var.getValue()).c;
            case 24:
                return Boolean.valueOf(((xat0) l7m0Var.getValue()).d);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((vbt0) l7m0Var.getValue()).f37156a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((vbt0) l7m0Var.getValue()).b;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((vbt0) l7m0Var.getValue()).c;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((vbt0) l7m0Var.getValue()).d;
            default:
                return Boolean.valueOf(((vbt0) l7m0Var.getValue()).e);
        }
    }
}
