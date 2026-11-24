package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eqj0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8240a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ eqj0(mm40 mm40Var, int i, byte b) {
        this.f8240a = b;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8240a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                azw.u(x8x.L(1), fetVar, this.b);
                break;
            case 1:
                q0x.y(x8x.L(1), fetVar, this.b);
                break;
            case 2:
                q0x.x(x8x.L(1), fetVar, this.b);
                break;
            case 3:
                s0x.u(x8x.L(1), fetVar, this.b);
                break;
            case 4:
                s0x.s(x8x.L(1), fetVar, this.b);
                break;
            case 5:
                z1x.k(x8x.L(7), fetVar, this.b);
                break;
            case 6:
                x2x.s(x8x.L(7), fetVar, this.b);
                break;
            case 7:
                x2x.p(x8x.L(1), fetVar, this.b);
                break;
            case 8:
                kc5.w0(x8x.L(1), fetVar, this.b);
                break;
            case 9:
                j47.j0(x8x.L(1), fetVar, this.b);
                break;
            case 10:
                jd8.P(x8x.L(1), fetVar, this.b);
                break;
            case 11:
                n2x.m(x8x.L(1), fetVar, this.b);
                break;
            case 12:
                d7x.a(x8x.L(1), fetVar, this.b);
                break;
            case 13:
                d7x.b(x8x.L(1), fetVar, this.b);
                break;
            case 14:
                tke.K(x8x.L(1), fetVar, this.b);
                break;
            case 15:
                x8f.Q(x8x.L(1), fetVar, this.b);
                break;
            case 16:
                saj.O(x8x.L(1), fetVar, this.b);
                break;
            case 17:
                qjj.I(x8x.L(1), fetVar, this.b);
                break;
            case 18:
                eeq.K(x8x.L(1), fetVar, this.b);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gfx.q(x8x.L(1), fetVar, this.b);
                break;
            case 20:
                ntr.S(x8x.L(1), fetVar, this.b);
                break;
            case 21:
                mrv.X(x8x.L(1), fetVar, this.b);
                break;
            case 22:
                z1x.n(x8x.L(7), fetVar, this.b);
                break;
            case 23:
                knx.K(x8x.L(1), fetVar, this.b);
                break;
            case 24:
                z1x.q(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ahy.C(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ahy.E(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ahy.N(x8x.L(1), fetVar, this.b);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ahy.x(x8x.L(1), fetVar, this.b);
                break;
            default:
                lv00.K(x8x.L(1), fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }
}
