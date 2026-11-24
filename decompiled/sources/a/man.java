package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class man implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21466a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ man(mm40 mm40Var, String str, String str2, int i, byte b) {
        this.f21466a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21466a;
        mm40 mm40Var = this.b;
        String str = this.d;
        String str2 = this.c;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                f1t0.k(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 1:
                ieb.M(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 2:
                ckb.v(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 3:
                j2e.v(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 4:
                ibc.C(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 5:
                lgb.z(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 6:
                rcb.N(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 7:
                vcc.p(x8x.L(7), fetVar, mm40Var, str2, str);
                break;
            case 8:
                tdc.s(x8x.L(7), fetVar, mm40Var, str2, str);
                break;
            case 9:
                l8x.x(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 10:
                ucx.U(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 11:
                m2x.b(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 12:
                q0x.c(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 13:
                q0x.s(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 14:
                s0x.o(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 15:
                wdx.v(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 16:
                q0x.G(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 17:
                g1x.k(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 18:
                k9x.s(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ucx.D(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 20:
                xdx.o(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 21:
                dem0.a(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 22:
                w7n0.d(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case 23:
                nsm0.e(x8x.L(7), fetVar, mm40Var, str2, str);
                break;
            case 24:
                jtt0.a(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                zgc.F(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                btm0.c(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                btm0.g(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                j5n0.f(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
            default:
                k5n0.d(x8x.L(1), fetVar, mm40Var, str2, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ man(String str, String str2, mm40 mm40Var, int i, byte b) {
        this.f21466a = b;
        this.c = str;
        this.d = str2;
        this.b = mm40Var;
    }
}
