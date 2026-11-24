package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gdm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11110a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;

    public /* synthetic */ gdm(mm40 mm40Var, String str, int i, byte b) {
        this.f11110a = b;
        this.b = mm40Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11110a;
        String str = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                plc.r(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 1:
                acb.q(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 2:
                ccq0.n(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 3:
                bkb.t(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 4:
                bkb.a(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 5:
                ckb.C(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 6:
                ckb.a(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 7:
                ckb.D(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 8:
                gkb.a(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 9:
                gkb.A(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 10:
                gkb.z(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 11:
                ozb.d(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 12:
                qzb.K(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 13:
                vbc.M(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 14:
                vbc.P(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 15:
                xbc.E(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 16:
                xbc.G(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 17:
                qcc.y(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 18:
                qcc.A(x8x.L(1), fetVar, mm40Var, str);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                vcc.s(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 20:
                vcc.u(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 21:
                tdc.u(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 22:
                vfc.z(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 23:
                vic.p(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 24:
                plc.s(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lmc.x(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jeb.E(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lgb.x(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                dj8.F(x8x.L(1), fetVar, mm40Var, str);
                break;
            default:
                ckb.u(x8x.L(1), fetVar, mm40Var, str);
                break;
        }
        return Unit.f46060a;
    }
}
