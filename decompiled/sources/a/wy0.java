package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wy0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39954a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mdm c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ wy0(mm40 mm40Var, mdm mdmVar, Function1 function1, int i, byte b) {
        this.f39954a = b;
        this.b = mm40Var;
        this.c = mdmVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39954a;
        int i = this.e;
        Function1 function1 = this.d;
        mdm mdmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                saj.u(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                i120.v(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                bsr0.o(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 3:
                bsr0.q(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 4:
                rsr0.s(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 5:
                rsr0.t(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 6:
                saj.k(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 7:
                gkb.n(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 8:
                o050.u(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 9:
                kkb.r(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 10:
                dwi0.n(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 11:
                uc9.q(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 12:
                ny9.n(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 13:
                q8a.l(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 14:
                x8f.z(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 15:
                saj.t(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 16:
                tke.x(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 17:
                hp4.i(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 18:
                j47.U(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                kc5.Z(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 20:
                jd8.x(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 21:
                rq8.l(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 22:
                dj8.s(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 23:
                phu0.m(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 24:
                saj.v(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                j120.u(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wha0.o(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                o2e.L(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mrv.B(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                x4d0.C(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
