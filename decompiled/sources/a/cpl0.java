package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cpl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4754a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ cpl0(mm40 mm40Var, int i, byte b) {
        this.f4754a = b;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4754a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                i120.H(x8x.L(1), fetVar, this.b);
                break;
            case 1:
                j0x.q(x8x.L(1), fetVar, this.b);
                break;
            case 2:
                q0x.B(x8x.L(1), fetVar, this.b);
                break;
            case 3:
                fem0.b(x8x.L(1), fetVar, this.b);
                break;
            case 4:
                mym0.d(x8x.L(1), fetVar, this.b);
                break;
            case 5:
                hmw0.R(x8x.L(1), fetVar, this.b);
                break;
            case 6:
                nsm0.a(x8x.L(1), fetVar, this.b);
                break;
            case 7:
                nsm0.g(x8x.L(1), fetVar, this.b);
                break;
            case 8:
                v2n0.e(x8x.L(1), fetVar, this.b);
                break;
            case 9:
                k5n0.g(x8x.L(1), fetVar, this.b);
                break;
            case 10:
                hhm0.a(x8x.L(1), fetVar, this.b);
                break;
            case 11:
                knx.N(x8x.L(1), fetVar, this.b);
                break;
            case 12:
                ahy.S(x8x.L(1), fetVar, this.b);
                break;
            case 13:
                knx.A(x8x.L(1), fetVar, this.b);
                break;
            case 14:
                knx.B(x8x.L(1), fetVar, this.b);
                break;
            case 15:
                ahy.V(x8x.L(1), fetVar, this.b);
                break;
            case 16:
                ahy.U(x8x.L(1), fetVar, this.b);
                break;
            case 17:
                o5n0.g(x8x.L(1), fetVar, this.b);
                break;
            case 18:
                o5n0.j(x8x.L(1), fetVar, this.b);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                o5n0.b(x8x.L(1), fetVar, this.b);
                break;
            case 20:
                o5n0.a(x8x.L(1), fetVar, this.b);
                break;
            case 21:
                o5n0.i(x8x.L(1), fetVar, this.b);
                break;
            case 22:
                v2n0.a(x8x.L(1), fetVar, this.b);
                break;
            case 23:
                v2n0.f(x8x.L(7), fetVar, this.b);
                break;
            case 24:
                idm0.a(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                aem0.a(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wgm0.o(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                qim0.g(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                hfm0.q(x8x.L(7), fetVar, this.b);
                break;
            default:
                ghm0.l(x8x.L(7), fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }
}
