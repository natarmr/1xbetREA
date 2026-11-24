package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wqr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39605a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ wqr(mm40 mm40Var, int i, byte b) {
        this.f39605a = b;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39605a;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                uzb.L(x8x.L(1), fetVar, mm40Var);
                break;
            case 1:
                kbc.b(x8x.L(1), fetVar, mm40Var);
                break;
            case 2:
                v3c.B(x8x.L(1), fetVar, mm40Var);
                break;
            case 3:
                gkb.s(x8x.L(1), fetVar, mm40Var);
                break;
            case 4:
                ulb.p(x8x.L(1), fetVar, mm40Var);
                break;
            case 5:
                n4c.E(x8x.L(1), fetVar, mm40Var);
                break;
            case 6:
                k9x.b(x8x.L(1), fetVar, mm40Var);
                break;
            case 7:
                vdx.d(x8x.L(1), fetVar, mm40Var);
                break;
            case 8:
                l8x.z(x8x.L(1), fetVar, mm40Var);
                break;
            case 9:
                bdx.r(x8x.L(1), fetVar, mm40Var);
                break;
            case 10:
                ucx.e(x8x.L(1), fetVar, mm40Var);
                break;
            case 11:
                tke.H(x8x.L(1), fetVar, mm40Var);
                break;
            case 12:
                x8f.M(x8x.L(1), fetVar, mm40Var);
                break;
            case 13:
                saj.J(x8x.L(1), fetVar, mm40Var);
                break;
            case 14:
                eeq.I(x8x.L(1), fetVar, mm40Var);
                break;
            case 15:
                bww.b(x8x.L(1), fetVar, mm40Var);
                break;
            case 16:
                vdx.g(x8x.L(1), fetVar, mm40Var);
                break;
            case 17:
                xww.g(x8x.L(1), fetVar, mm40Var);
                break;
            case 18:
                yyw.l(x8x.L(1), fetVar, mm40Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                bsr0.w(x8x.L(7), fetVar, mm40Var);
                break;
            case 20:
                q7x.c(x8x.L(1), fetVar, mm40Var);
                break;
            case 21:
                q0x.j(x8x.L(1), fetVar, mm40Var);
                break;
            case 22:
                j47.k0(x8x.L(1), fetVar, mm40Var);
                break;
            case 23:
                jd8.O(x8x.L(1), fetVar, mm40Var);
                break;
            case 24:
                dj8.L(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                rq8.z(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lv00.v(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lv00.o(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lv00.N(x8x.L(1), fetVar, mm40Var);
                break;
            default:
                i120.i(x8x.L(1), fetVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }
}
