package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ndp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23346a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ndp(String str, mm40 mm40Var, int i) {
        this.f23346a = (byte) 13;
        this.c = str;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23346a;
        String str = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qrq qrqVar = j1t0.b;
                    long j = qmk.r;
                    v8q0.a(this.c, this.b, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, j, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110568);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                kkb.t(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 2:
                ((Integer) obj2).getClass();
                wvb.v(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 3:
                ((Integer) obj2).getClass();
                x8f.g(x8x.L(7), (fet) obj, mm40Var, str);
                break;
            case 4:
                ((Integer) obj2).getClass();
                wwb.o(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 5:
                ((Integer) obj2).getClass();
                fxb.q(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 6:
                ((Integer) obj2).getClass();
                v3c.j(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 7:
                ((Integer) obj2).getClass();
                m8x.j(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 8:
                ((Integer) obj2).getClass();
                e9x.a(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 9:
                ((Integer) obj2).getClass();
                l8x.P(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 10:
                ((Integer) obj2).getClass();
                vdx.a(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 11:
                ((Integer) obj2).getClass();
                vdx.C(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 12:
                ((Integer) obj2).getClass();
                pzw.h(x8x.L(7), (fet) obj, mm40Var, str);
                break;
            case 13:
                ((Integer) obj2).getClass();
                j0x.d(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 14:
                ((Integer) obj2).getClass();
                oja0.w(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 15:
                ((Integer) obj2).getClass();
                oja0.C(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 16:
                ((Integer) obj2).getClass();
                ffb0.r(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 17:
                ((Integer) obj2).getClass();
                ffb0.u(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 18:
                ((Integer) obj2).getClass();
                ro4.D(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                ro4.F(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 20:
                ((Integer) obj2).getClass();
                x4d0.D(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 21:
                ((Integer) obj2).getClass();
                x4d0.z(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 22:
                ((Integer) obj2).getClass();
                x4d0.G(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 23:
                ((Integer) obj2).getClass();
                unh0.C(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case 24:
                ((Integer) obj2).getClass();
                unh0.x(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                ccq0.t(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ccq0.w(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                km10.h(x8x.L(1), (fet) obj, mm40Var, str);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                u7x.e(x8x.L(7), (fet) obj, mm40Var, str);
                break;
            default:
                ((Integer) obj2).getClass();
                a8k0.e(x8x.L(1), (fet) obj, mm40Var, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ndp(mm40 mm40Var, String str, int i, byte b) {
        this.f23346a = b;
        this.b = mm40Var;
        this.c = str;
    }

    public /* synthetic */ ndp(mm40 mm40Var, String str) {
        this.f23346a = (byte) 0;
        this.c = str;
        this.b = mm40Var;
    }
}
