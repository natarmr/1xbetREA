package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7737a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ eg(mm40 mm40Var) {
        this.f7737a = (byte) 22;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7737a;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                xia0.a(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                kc5.I0(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 2:
                ((Integer) obj2).getClass();
                j2e.c(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 3:
                ((Integer) obj2).getClass();
                tke.c(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 4:
                ((Integer) obj2).getClass();
                mrv.b(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 5:
                ((Integer) obj2).getClass();
                lt0.d(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ro4.g(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 7:
                ((Integer) obj2).getClass();
                o2e.f(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 8:
                ((Integer) obj2).getClass();
                tke.g(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ohq0.e(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 10:
                ((Integer) obj2).getClass();
                eeq.f(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 11:
                ((Integer) obj2).getClass();
                cjx.d(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 12:
                ((Integer) obj2).getClass();
                knx.f(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 13:
                ((Integer) obj2).getClass();
                unh0.c(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 14:
                ((Integer) obj2).getClass();
                jar0.c(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 15:
                ((Integer) obj2).getClass();
                ntr.g(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 16:
                ((Integer) obj2).getClass();
                x8f.e(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 17:
                ((Integer) obj2).getClass();
                mrv.l(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 18:
                ((Integer) obj2).getClass();
                j47.L(x8x.L(1), (fet) obj, mm40Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                fre0.G(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 20:
                ((Integer) obj2).getClass();
                y860.s(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 21:
                ((Integer) obj2).getClass();
                y860.U(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 22:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tfx.e(this.b, udl0.ADVANCED, true, fetVar, 432, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                oja0.F(x8x.L(1), (fet) obj, mm40Var);
                break;
            case 24:
                ((Integer) obj2).getClass();
                i18.c(x8x.L(1), (fet) obj, mm40Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                rq8.y(x8x.L(1), (fet) obj, mm40Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                uc9.f(x8x.L(1), (fet) obj, mm40Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                knx.k(x8x.L(1), (fet) obj, mm40Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                fre0.m(x8x.L(1), (fet) obj, mm40Var);
                break;
            default:
                ((Integer) obj2).getClass();
                i4w0.m(x8x.L(1), (fet) obj, mm40Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ eg(mm40 mm40Var, int i, byte b) {
        this.f7737a = b;
        this.b = mm40Var;
    }
}
