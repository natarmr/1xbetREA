package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ziw implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44457a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ ziw(l7m0 l7m0Var, byte b) {
        this.f44457a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44457a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return ((jkw) l7m0Var.getValue()).c.b;
            case 1:
                return Boolean.valueOf(((hjw) l7m0Var.getValue()).c);
            case 2:
                return ((jkw) l7m0Var.getValue()).c.f14898a;
            case 3:
                return Boolean.valueOf(!(l7m0Var.getValue() instanceof djw));
            case 4:
                return ((hjw) l7m0Var.getValue()).f13180a;
            case 5:
                return ((hjw) l7m0Var.getValue()).b;
            case 6:
                return ((uc7) l7m0Var.getValue()).f35415a;
            case 7:
                return ((uc7) l7m0Var.getValue()).j;
            case 8:
                return ((uc7) l7m0Var.getValue()).g;
            case 9:
                return ((uc7) l7m0Var.getValue()).h;
            case 10:
                return ((uc7) l7m0Var.getValue()).i;
            case 11:
                return ((uc7) l7m0Var.getValue()).b;
            case 12:
                return ((uc7) l7m0Var.getValue()).c;
            case 13:
                return ((uc7) l7m0Var.getValue()).e;
            case 14:
                return ((uc7) l7m0Var.getValue()).f;
            case 15:
                return (gmm) l7m0Var.getValue();
            case 16:
                return (tly) l7m0Var.getValue();
            case 17:
                return ((qyy) l7m0Var.getValue()).f29556a;
            case 18:
                return ((qyy) l7m0Var.getValue()).b;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((yhz) l7m0Var.getValue()).b.f899a;
            case 20:
                return Boolean.valueOf(((yhz) l7m0Var.getValue()).b.c);
            case 21:
                return ((yhz) l7m0Var.getValue()).b.b;
            case 22:
                return Integer.valueOf(((wtz) l7m0Var.getValue()).g.size());
            case 23:
                return Integer.valueOf(((wtz) l7m0Var.getValue()).d);
            case 24:
                return Integer.valueOf(((jvz) l7m0Var.getValue()).g.size());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(((jvz) l7m0Var.getValue()).d);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Integer.valueOf(((xwz) l7m0Var.getValue()).g.size());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(((xwz) l7m0Var.getValue()).c);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Integer.valueOf(((uyz) l7m0Var.getValue()).g.size());
            default:
                return Integer.valueOf(((uyz) l7m0Var.getValue()).d);
        }
    }
}
