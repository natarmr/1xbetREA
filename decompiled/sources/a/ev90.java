package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ev90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8458a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ ev90(mm40 mm40Var) {
        this.f8458a = (byte) 18;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8458a;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                ydx.a(x8x.L(1), fetVar, mm40Var);
                break;
            case 1:
                num.getClass();
                zdx.n(x8x.L(1), fetVar, mm40Var);
                break;
            case 2:
                num.getClass();
                cww.h(x8x.L(1), fetVar, mm40Var);
                break;
            case 3:
                num.getClass();
                q0x.t(x8x.L(1), fetVar, mm40Var);
                break;
            case 4:
                num.getClass();
                r7x.g(x8x.L(1), fetVar, mm40Var);
                break;
            case 5:
                num.getClass();
                j120.v(x8x.L(1), fetVar, mm40Var);
                break;
            case 6:
                num.getClass();
                ucx.h(x8x.L(1), fetVar, mm40Var);
                break;
            case 7:
                num.getClass();
                ucx.a(x8x.L(1), fetVar, mm40Var);
                break;
            case 8:
                num.getClass();
                ro4.Q(x8x.L(1), fetVar, mm40Var);
                break;
            case 9:
                num.getClass();
                jar0.A(x8x.L(1), fetVar, mm40Var);
                break;
            case 10:
                num.getClass();
                f1t0.A(x8x.L(1), fetVar, mm40Var);
                break;
            case 11:
                num.getClass();
                phu0.y(x8x.L(1), fetVar, mm40Var);
                break;
            case 12:
                num.getClass();
                i4w0.f(x8x.L(1), fetVar, mm40Var);
                break;
            case 13:
                num.getClass();
                t9x.s(x8x.L(1), fetVar, mm40Var);
                break;
            case 14:
                num.getClass();
                w9x.q(x8x.L(1), fetVar, mm40Var);
                break;
            case 15:
                num.getClass();
                p8a.E(x8x.L(1), fetVar, mm40Var);
                break;
            case 16:
                num.getClass();
                j2e.w(x8x.L(1), fetVar, mm40Var);
                break;
            case 17:
                num.getClass();
                ntr.O(x8x.L(1), fetVar, mm40Var);
                break;
            case 18:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aem0.i(0, 0, fetVar, mm40Var);
                    b5x.a(0, fetVar, mm40Var);
                    b5x.c(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                num.getClass();
                b5x.a(x8x.L(1), fetVar, mm40Var);
                break;
            case 20:
                num.getClass();
                piz.h(x8x.L(1), fetVar, mm40Var);
                break;
            case 21:
                num.getClass();
                m7x.m(x8x.L(1), fetVar, mm40Var);
                break;
            case 22:
                num.getClass();
                idx.o(x8x.L(1), fetVar, mm40Var);
                break;
            case 23:
                num.getClass();
                x4d0.K(x8x.L(1), fetVar, mm40Var);
                break;
            case 24:
                num.getClass();
                x4d0.M(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                num.getClass();
                r7x.m(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                num.getClass();
                u7x.p(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                num.getClass();
                a8k0.m(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                num.getClass();
                m8x.A(x8x.L(1), fetVar, mm40Var);
                break;
            default:
                num.getClass();
                y0x0.r(x8x.L(1), fetVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ev90(mm40 mm40Var, int i, byte b) {
        this.f8458a = b;
        this.b = mm40Var;
    }
}
