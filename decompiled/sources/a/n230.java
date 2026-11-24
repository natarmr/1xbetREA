package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n230 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22781a;

    public /* synthetic */ n230(byte b) {
        this.f22781a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object g0g0Var;
        int i = 3;
        int i2 = 0;
        switch (this.f22781a) {
            case 0:
                iun iunVar = iun.f15405a;
                uh90 uh90Var = uh90.g;
                uh90Var.getClass();
                uh90Var.getClass();
                uh90Var.getClass();
                uh90Var.getClass();
                return new g7h(null, null, iunVar, uh90Var, uh90Var, uh90Var, uh90Var, iunVar, -26L);
            case 1:
                int i3 = l830.A;
                return p030.f26129a;
            case 2:
                return new zw3(jd00.f16305a, (byte) 0);
            case 3:
                return new zw3(jd00.f16305a, (byte) 0);
            case 4:
                return new zw3(m4q0.f21185a, (byte) 0);
            case 5:
                int i4 = MatchInfoContainerView.t1;
                return new tk80();
            case 6:
                int i5 = MatchInfoContainerView.t1;
                return new x930();
            case 7:
                return Unit.f46060a;
            case 8:
                return new zw3(tn5.f34219a, (byte) 0);
            case 9:
                return new xcz(i2, i, i2);
            case 10:
                return new zw3(whp0.f39176a, (byte) 0);
            case 11:
                return new zw3(bc30.f2335a, (byte) 0);
            case 12:
                return new zw3(boa0.f2925a, (byte) 0);
            case 13:
                return new xcz(i2, i, i2);
            case 14:
                return new zw3(dd30.f5877a, (byte) 0);
            case 15:
                return new zw3(ked.f18149a, (byte) 0);
            case 16:
                return new zw3(ke30.f18134a, (byte) 0);
            case 17:
                return new zw3(qe30.f28563a, (byte) 0);
            case 18:
                return new zw3(te30.f33799a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(me30.f21626a, (byte) 0);
            case 20:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 21:
                return new zw3(lf30.f19934a, (byte) 0);
            case 22:
                return new zw3(if30.f14667a, (byte) 0);
            case 23:
                return new zw3(ef30.f7703a, (byte) 0);
            case 24:
                return new zw3(ze30.f44235a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Boolean.FALSE;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return xt40.f41447a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                try {
                    e0g0 e0g0Var = j0g0.b;
                    System.loadLibrary("antifraud");
                    g0g0Var = Unit.f46060a;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                return Boolean.valueOf(!(g0g0Var instanceof g0g0));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(h9a0.f12664a, (byte) 0);
            default:
                return new zw3(gv6.f11962a, (byte) 0);
        }
    }
}
