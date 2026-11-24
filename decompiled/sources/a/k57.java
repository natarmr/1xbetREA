package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k57 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17705a;
    public final /* synthetic */ z77 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ k57(z77 z77Var, Function1 function1, byte b) {
        this.f17705a = b;
        this.b = z77Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17705a;
        Function1 function1 = this.c;
        z77 z77Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vtb.e(z77Var, function1, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ulb.d(z77Var, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                num.getClass();
                ulb.d(z77Var, function1, fetVar, x8x.L(1));
                break;
            case 3:
                int iIntValue3 = num.intValue();
                if (fetVar.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    vtb.e(z77Var, function1, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            case 4:
                int iIntValue4 = num.intValue();
                if (fetVar.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ro4.N(z77Var, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 5:
                num.getClass();
                ro4.N(z77Var, function1, fetVar, x8x.L(1));
                break;
            case 6:
                int iIntValue5 = num.intValue();
                if (fetVar.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    egm0.b(z77Var, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                egm0.b(z77Var, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ k57(z77 z77Var, Function1 function1, int i, byte b) {
        this.f17705a = b;
        this.b = z77Var;
        this.c = function1;
    }
}
