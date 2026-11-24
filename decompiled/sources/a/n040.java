package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n040 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22683a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;

    public /* synthetic */ n040(mm40 mm40Var, String str) {
        this.f22683a = (byte) 20;
        this.b = mm40Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22683a;
        String str = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                p8a.G(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 1:
                num.getClass();
                x2x.l(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 2:
                num.getClass();
                x2x.a(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 3:
                num.getClass();
                x2x.w(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 4:
                num.getClass();
                q8x.x(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 5:
                num.getClass();
                e9x.q(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 6:
                num.getClass();
                gq80.i(x8x.L(55), fetVar, mm40Var, str);
                break;
            case 7:
                num.getClass();
                gq80.W(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 8:
                num.getClass();
                ufx.r(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 9:
                num.getClass();
                uvw.o(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 10:
                num.getClass();
                yyw.u(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 11:
                num.getClass();
                d7x.e(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 12:
                num.getClass();
                ydx.l(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 13:
                num.getClass();
                efx.g(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 14:
                num.getClass();
                l7x.u(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 15:
                num.getClass();
                xww.a(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 16:
                num.getClass();
                q5x.t(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 17:
                num.getClass();
                k7x.q(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 18:
                num.getClass();
                k7x.h(x8x.L(1), fetVar, mm40Var, str);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                num.getClass();
                x9x.z(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 20:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eal0.a(0, fetVar, mm40Var, str);
                } else {
                    fetVar.X();
                }
                break;
            case 21:
                num.getClass();
                xia0.f(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 22:
                num.getClass();
                xia0.f(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 23:
                num.getClass();
                idm0.k(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 24:
                num.getClass();
                dem0.c(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                num.getClass();
                o5n0.c(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                num.getClass();
                k7n0.m(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                num.getClass();
                ewm0.f(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                num.getClass();
                fgp0.a(x8x.L(1), fetVar, mm40Var, str);
                break;
            default:
                num.getClass();
                egp0.a(x8x.L(1), fetVar, mm40Var, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n040(mm40 mm40Var, String str, int i, byte b) {
        this.f22683a = b;
        this.b = mm40Var;
        this.c = str;
    }

    public /* synthetic */ n040(String str, mm40 mm40Var, int i) {
        this.f22683a = (byte) 7;
        this.c = str;
        this.b = mm40Var;
    }
}
