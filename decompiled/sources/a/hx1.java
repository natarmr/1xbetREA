package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hx1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13791a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hx1(mm40 mm40Var, String str, int i, byte b) {
        this.f13791a = b;
        this.b = mm40Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13791a;
        String str = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ix1.e(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 1:
                kx1.e(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 2:
                rsr0.a(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 3:
                dj8.f(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 4:
                j47.M(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 5:
                j47.W(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 6:
                j47.T(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 7:
                d18.b(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 8:
                ohq0.m(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 9:
                ohq0.m(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 10:
                kc5.R(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 11:
                lv00.p(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 12:
                rq8.v(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 13:
                slb.F(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 14:
                cjx.o(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 15:
                slb.z(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 16:
                slb.C(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 17:
                dub.W(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 18:
                acb.c(x8x.L(1), fetVar, mm40Var, str);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lv00.x(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 20:
                bfb.B(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 21:
                bfb.f(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 22:
                d5c.f(x8x.L(7), fetVar, mm40Var, str);
                break;
            case 23:
                sac.e(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 24:
                ebc.i(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                kkb.z(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xia0.X(x8x.L(7), fetVar, mm40Var, str);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ckb.H(x8x.L(1), fetVar, mm40Var, str);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                kkb.E(x8x.L(1), fetVar, mm40Var, str);
                break;
            default:
                n6m.g(x8x.L(1), fetVar, mm40Var, str);
                break;
        }
        return Unit.f46060a;
    }
}
