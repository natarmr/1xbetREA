package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41928a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;

    public /* synthetic */ y30(mm40 mm40Var, int i, byte b) {
        this.f41928a = b;
        this.b = mm40Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41928a;
        int i = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                jd8.c(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 1:
                num.getClass();
                s5x0.b(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 2:
                num.getClass();
                jd8.f(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 3:
                num.getClass();
                mrv.i(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 4:
                num.intValue();
                lv00.j(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 5:
                num.getClass();
                fx1.f(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 6:
                num.getClass();
                j120.J(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 7:
                num.getClass();
                ix1.d(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 8:
                num.getClass();
                kx1.d(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 9:
                num.getClass();
                gq80.g(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 10:
                num.getClass();
                i4w0.d(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 11:
                num.getClass();
                q8a.s(i, x8x.L(1), fetVar, mm40Var);
                break;
            case 12:
                num.intValue();
                zq8.a(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 13:
                num.getClass();
                obb.c(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 14:
                num.getClass();
                acb.e(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 15:
                num.getClass();
                dyb.i(i, x8x.L(1), fetVar, mm40Var);
                break;
            case 16:
                num.intValue();
                rcb.S(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 17:
                num.intValue();
                vtb.J(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 18:
                num.getClass();
                gq80.c(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                num.getClass();
                wwb.f(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 20:
                num.getClass();
                wwb.g(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 21:
                num.getClass();
                x4d0.x(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 22:
                num.getClass();
                unh0.u(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 23:
                num.getClass();
                ccq0.r(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 24:
                num.getClass();
                ohq0.A(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                num.getClass();
                xbc.j(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                num.getClass();
                vcc.d(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                num.getClass();
                tdc.f(x8x.L(i | 1), fetVar, mm40Var);
                break;
            default:
                num.getClass();
                gkb.f(x8x.L(i | 1), fetVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ y30(mm40 mm40Var, int i, int i2, byte b) {
        this.f41928a = b;
        this.b = mm40Var;
        this.c = i;
    }
}
