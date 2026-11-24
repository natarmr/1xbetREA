package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cgp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4325a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;

    public /* synthetic */ cgp0(mm40 mm40Var, String str, int i, byte b) {
        this.f4325a = b;
        this.b = mm40Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4325a;
        String str = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ggp0.a(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 1:
                atm0.c(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 2:
                iym0.f(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 3:
                qem0.g(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 4:
                wgm0.c(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 5:
                wgm0.b(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 6:
                btm0.b(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 7:
                etm0.h(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 8:
                etm0.a(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 9:
                j5n0.g(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 10:
                k5n0.e(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 11:
                vbw0.x(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 12:
                dqm0.g(x8x.L(1), fetVar, mm40Var, str);
                break;
            case 13:
                xnm0.f(x8x.L(1), fetVar, mm40Var, str);
                break;
            default:
                ipm0.b(x8x.L(1), fetVar, mm40Var, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cgp0(String str, mm40 mm40Var, int i, byte b) {
        this.f4325a = b;
        this.c = str;
        this.b = mm40Var;
    }
}
