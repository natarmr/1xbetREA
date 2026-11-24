package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class omc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25496a = 0;
    public final /* synthetic */ wmc0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ omc0(wmc0 wmc0Var, Function1 function1) {
        this.b = wmc0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25496a;
        Function1 function1 = this.c;
        wmc0 wmc0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarE0 = o2e.e0(o050.W(o7k0.c), "PROMO_LIST_WITH_GAMES_LAZY_COLUMN");
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar);
                    boolean zG = fetVar.g(wmc0Var) | fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new oac0(wmc0Var, function1, (byte) 6);
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarE0, null, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                i4w0.o(wmc0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ omc0(wmc0 wmc0Var, Function1 function1, int i) {
        this.b = wmc0Var;
        this.c = function1;
    }
}
