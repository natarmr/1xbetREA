package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zw1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45085a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;

    public /* synthetic */ zw1(int i, a4x a4xVar, mm40 mm40Var) {
        this.f45085a = (byte) 26;
        this.c = a4xVar;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f45085a;
        mm40 mm40Var = this.b;
        a4x a4xVar = this.c;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                i120.e(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 1:
                vbw0.i(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 2:
                cy2.c(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 3:
                cy2.c(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 4:
                v3c.d(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 5:
                lmc.a(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 6:
                kkb.y(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 7:
                ahb.s(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 8:
                bkb.u(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 9:
                ckb.E(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 10:
                gkb.B(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 11:
                jwb.s(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 12:
                uvw.b(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 13:
                uvw.b(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 14:
                uvw.b(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 15:
                nia0.E(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 16:
                xww.l(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 17:
                piz.u(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 18:
                yyw.r(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                azw.p(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 20:
                n6x.g(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 21:
                dnm0.c(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 22:
                w7n0.g(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case 23:
                nsm0.f(x8x.L(7), fetVar, a4xVar, mm40Var);
                break;
            case 24:
                aad.w(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wgm0.l(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
            default:
                v2n0.i(x8x.L(1), fetVar, a4xVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zw1(mm40 mm40Var, a4x a4xVar, int i, byte b) {
        this.f45085a = b;
        this.b = mm40Var;
        this.c = a4xVar;
    }
}
