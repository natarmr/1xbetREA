package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u7g0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35183a = 1;
    public final /* synthetic */ y7g0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ u7g0(y7g0 y7g0Var, Function1 function1, int i) {
        this.b = y7g0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35183a;
        Function1 function1 = this.c;
        y7g0 y7g0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new dvd0(function1, (byte) 28);
                        fetVar.o0(objP);
                    }
                    Function1 function2 = (Function1) objP;
                    boolean zI = fetVar.i(y7g0Var);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new eme0(y7g0Var, (byte) 18);
                        fetVar.o0(objP2);
                    }
                    dwi0.b(function2, n0qVar, (Function1) objP2, fetVar, 48, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                knx.M(y7g0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ u7g0(Function1 function1, y7g0 y7g0Var) {
        this.c = function1;
        this.b = y7g0Var;
    }
}
