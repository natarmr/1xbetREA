package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ujl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35787a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ujl(int i, int i2, mm40 mm40Var) {
        this.f35787a = (byte) 25;
        this.b = mm40Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35787a;
        int i = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                uc9.n(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 1:
                ny9.m(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 2:
                p8a.r(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 3:
                q8a.j(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 4:
                qjj.p(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 5:
                dtb.j(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 6:
                dtb.l(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 7:
                dtb.h(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 8:
                ntb.m(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 9:
                ntb.i(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 10:
                ntb.k(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 11:
                vtb.o(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 12:
                vtb.s(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 13:
                vtb.q(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 14:
                dub.u(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 15:
                dub.w(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 16:
                dub.s(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 17:
                obc.n(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 18:
                vbc.u(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                tdc.i(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 20:
                agc.o(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 21:
                hic.j(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 22:
                plc.i(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 23:
                vic.f(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case 24:
                ccq0.J(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                dub.P(i, x8x.L(7), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                pzb.v(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                qzb.I(x8x.L(i | 1), fetVar, mm40Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                f1t0.h(x8x.L(i | 1), fetVar, mm40Var);
                break;
            default:
                bfb.z(x8x.L(i | 1), fetVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ujl(mm40 mm40Var, int i, byte b) {
        this.f35787a = b;
        this.b = mm40Var;
        this.c = i;
    }
}
