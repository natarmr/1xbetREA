package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v2w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36707a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v2w(mm40 mm40Var, int i) {
        this.f36707a = (byte) 21;
        ugd ugdVar = phd.f26991a;
        this.b = mm40Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36707a;
        int i = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                bfb.w(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                piz.g(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 2:
                ((Integer) obj2).getClass();
                g1x.b(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 3:
                ((Integer) obj2).getClass();
                qxw.f(i, x8x.L(1), (fet) obj, mm40Var);
                break;
            case 4:
                ((Integer) obj2).getClass();
                b5x.l(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 5:
                ((Integer) obj2).getClass();
                b5x.b(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 6:
                ((Integer) obj2).getClass();
                q5x.a(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 7:
                ((Integer) obj2).getClass();
                q5x.x(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 8:
                ((Integer) obj2).getClass();
                q5x.q(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 9:
                ((Integer) obj2).getClass();
                x9x.r(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 10:
                ((Integer) obj2).getClass();
                xdx.q(i, x8x.L(7), (fet) obj, mm40Var);
                break;
            case 11:
                ((Integer) obj2).getClass();
                zdx.o(i, x8x.L(7), (fet) obj, mm40Var);
                break;
            case 12:
                ((Integer) obj2).getClass();
                ydx.s(i, x8x.L(7), (fet) obj, mm40Var);
                break;
            case 13:
                ((Integer) obj2).getClass();
                wdx.C(i, x8x.L(7), (fet) obj, mm40Var);
                break;
            case 14:
                ((Integer) obj2).getClass();
                mrv.O(i, x8x.L(1), (fet) obj, mm40Var);
                break;
            case 15:
                ((Integer) obj2).getClass();
                bdx.y(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 16:
                ((Integer) obj2).getClass();
                vbw0.F(i, x8x.L(1), (fet) obj, mm40Var);
                break;
            case 17:
                ((Integer) obj2).getClass();
                zgc.y(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 18:
                ((Integer) obj2).getClass();
                d9x.u(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                d7x.m(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 20:
                ((Integer) obj2).getClass();
                j0x.l(i, x8x.L(49), (fet) obj, mm40Var);
                break;
            case 21:
                ugd ugdVar = phd.f26991a;
                ((Integer) obj2).getClass();
                kcx.b(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 22:
                ((Integer) obj2).getClass();
                r8x.z(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 23:
                ((Integer) obj2).getClass();
                ltt0.c(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case 24:
                ((Integer) obj2).getClass();
                pym0.b(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                osm0.d(i, x8x.L(1), (fet) obj, mm40Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).intValue();
                jpm0.c(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                ewm0.m(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).intValue();
                wgm0.d(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
            default:
                ((Integer) obj2).getClass();
                j5n0.s(x8x.L(i | 1), (fet) obj, mm40Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ v2w(int i, int i2, mm40 mm40Var) {
        this.f36707a = (byte) 20;
        this.c = i;
        this.b = mm40Var;
    }

    public /* synthetic */ v2w(mm40 mm40Var, int i, byte b) {
        this.f36707a = b;
        this.b = mm40Var;
        this.c = i;
    }

    public /* synthetic */ v2w(mm40 mm40Var, int i, int i2, byte b) {
        this.f36707a = b;
        this.b = mm40Var;
        this.c = i;
    }
}
