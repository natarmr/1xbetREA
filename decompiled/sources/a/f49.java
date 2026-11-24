package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f49 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8902a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ f49(mm40 mm40Var, String str, Function0 function0, int i, byte b) {
        this.f8902a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8902a;
        Function0 function0 = this.d;
        String str = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                hp4.f(mm40Var, str, function0, fetVar, x8x.L(7));
                break;
            case 1:
                ahy.j(mm40Var, str, function0, fetVar, x8x.L(1));
                break;
            case 2:
                g8x.g(mm40Var, str, function0, fetVar, x8x.L(1));
                break;
            case 3:
                lv00.r(mm40Var, str, function0, fetVar, x8x.L(1));
                break;
            case 4:
                ju70.y(mm40Var, str, function0, fetVar, x8x.L(7));
                break;
            case 5:
                ydx.k(mm40Var, str, function0, fetVar, x8x.L(1));
                break;
            case 6:
                efx.f(mm40Var, str, function0, fetVar, x8x.L(1));
                break;
            case 7:
                q0x.d(mm40Var, str, function0, fetVar, x8x.L(1));
                break;
            case 8:
                xia0.z(mm40Var, str, function0, fetVar, x8x.L(7));
                break;
            default:
                dnm0.f(mm40Var, str, function0, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
