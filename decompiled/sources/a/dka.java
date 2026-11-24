package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dka implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6221a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ dka(mm40 mm40Var, int i, byte b) {
        this.f6221a = b;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6221a;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fka.a(x8x.L(7), fetVar, mm40Var);
                break;
            case 1:
                fka.a(x8x.L(7), fetVar, mm40Var);
                break;
            case 2:
                qjj.g(x8x.L(1), fetVar, mm40Var);
                break;
            case 3:
                mrv.s(x8x.L(1), fetVar, mm40Var);
                break;
            case 4:
                y860.p(x8x.L(1), fetVar, mm40Var);
                break;
            case 5:
                oja0.n(x8x.L(1), fetVar, mm40Var);
                break;
            case 6:
                slb.D(x8x.L(1), fetVar, mm40Var);
                break;
            case 7:
                nia0.T(x8x.L(1), fetVar, mm40Var);
                break;
            case 8:
                lmc.A(x8x.L(1), fetVar, mm40Var);
                break;
            case 9:
                obb.f(x8x.L(1), fetVar, mm40Var);
                break;
            case 10:
                acb.b(x8x.L(1), fetVar, mm40Var);
                break;
            case 11:
                acb.a(x8x.L(7), fetVar, mm40Var);
                break;
            case 12:
                uzb.g(x8x.L(1), fetVar, mm40Var);
                break;
            case 13:
                wzb.i(x8x.L(1), fetVar, mm40Var);
                break;
            case 14:
                feb.F(x8x.L(1), fetVar, mm40Var);
                break;
            case 15:
                u1c.s(x8x.L(1), fetVar, mm40Var);
                break;
            case 16:
                vtb.k(x8x.L(1), fetVar, mm40Var);
                break;
            case 17:
                ro4.y(x8x.L(1), fetVar, mm40Var);
                break;
            case 18:
                fre0.x(x8x.L(1), fetVar, mm40Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rcb.o(x8x.L(1), fetVar, mm40Var);
                break;
            case 20:
                f7k.s(x8x.L(1), fetVar, mm40Var);
                break;
            case 21:
                rcb.p(x8x.L(1), fetVar, mm40Var);
                break;
            case 22:
                jcb.I(x8x.L(1), fetVar, mm40Var);
                break;
            case 23:
                lgb.i(x8x.L(1), fetVar, mm40Var);
                break;
            case 24:
                zgc.p(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                j2e.s(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                o2e.u(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                tke.w(x8x.L(1), fetVar, mm40Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                zjb.g(x8x.L(1), fetVar, mm40Var);
                break;
            default:
                hkb.g(x8x.L(1), fetVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }
}
