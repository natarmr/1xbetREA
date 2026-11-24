package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vod0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37761a;
    public final /* synthetic */ epd0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ vod0(byte b, epd0 epd0Var, Function1 function1) {
        this.f37761a = b;
        this.b = epd0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37761a;
        Function1 function1 = this.c;
        epd0 epd0Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                xvw.i(epd0Var, function1, fetVar, x8x.L(7));
                break;
            case 1:
                num.getClass();
                bww.l(epd0Var, function1, fetVar, x8x.L(7));
                break;
            case 2:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xvw.k(epd0Var, function1, null, fetVar, 6);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                int iIntValue2 = num.intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    xvw.i(epd0Var, function1, fetVar, 6);
                } else {
                    fetVar.X();
                }
                break;
            case 4:
                int iIntValue3 = num.intValue();
                if (fetVar.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    bww.n(epd0Var, function1, null, fetVar, 6);
                } else {
                    fetVar.X();
                }
                break;
            default:
                int iIntValue4 = num.intValue();
                if (fetVar.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    bww.l(epd0Var, function1, fetVar, 6);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vod0(epd0 epd0Var, Function1 function1, int i, byte b) {
        this.f37761a = b;
        this.b = epd0Var;
        this.c = function1;
    }
}
