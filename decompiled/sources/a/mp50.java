package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mp50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22163a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ mp50(mm40 mm40Var, int i, byte b) {
        this.f22163a = b;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22163a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                i120.I(x8x.L(1), fetVar, this.b);
                break;
            case 1:
                y860.F(x8x.L(1), fetVar, this.b);
                break;
            case 2:
                y860.O(x8x.L(1), fetVar, this.b);
                break;
            case 3:
                y860.u(x8x.L(1), fetVar, this.b);
                break;
            case 4:
                ju70.u(x8x.L(1), fetVar, this.b);
                break;
            case 5:
                gq80.C(x8x.L(1), fetVar, this.b);
                break;
            case 6:
                ohq0.H(x8x.L(1), fetVar, this.b);
                break;
            case 7:
                rsr0.C(x8x.L(1), fetVar, this.b);
                break;
            case 8:
                n6x.c(x8x.L(1), fetVar, this.b);
                break;
            case 9:
                ydx.j(x8x.L(1), fetVar, this.b);
                break;
            case 10:
                efx.a(x8x.L(1), fetVar, this.b);
                break;
            case 11:
                ydx.b(x8x.L(1), fetVar, this.b);
                break;
            case 12:
                efx.e(x8x.L(1), fetVar, this.b);
                break;
            case 13:
                m0x0.A(x8x.L(7), fetVar, this.b);
                break;
            case 14:
                kcx.m(x8x.L(7), fetVar, this.b);
                break;
            case 15:
                ucx.T(x8x.L(1), fetVar, this.b);
                break;
            case 16:
                wdx.s(x8x.L(1), fetVar, this.b);
                break;
            case 17:
                xdx.h(x8x.L(1), fetVar, this.b);
                break;
            case 18:
                ydx.n(x8x.L(1), fetVar, this.b);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                zdx.j(x8x.L(1), fetVar, this.b);
                break;
            case 20:
                wdx.B(x8x.L(1), fetVar, this.b);
                break;
            case 21:
                ydx.p(x8x.L(1), fetVar, this.b);
                break;
            case 22:
                zdx.c(x8x.L(1), fetVar, this.b);
                break;
            case 23:
                wdx.f(x8x.L(1), fetVar, this.b);
                break;
            case 24:
                xdx.k(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ydx.r(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wdx.u(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                xdx.p(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                zdx.k(x8x.L(1), fetVar, this.b);
                break;
            default:
                xdx.a(x8x.L(1), fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }
}
