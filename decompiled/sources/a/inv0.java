package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class inv0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15092a = 1;
    public final /* synthetic */ knv0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ inv0(knv0 knv0Var, Function1 function1, int i) {
        this.b = knv0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15092a;
        Function1 function1 = this.c;
        knv0 knv0Var = this.b;
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
                        objP = new szu0(function1, (byte) 9);
                        fetVar.o0(objP);
                    }
                    Function1 function2 = (Function1) objP;
                    boolean zG2 = fetVar.g(knv0Var);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new gdv0(knv0Var, (byte) 4);
                        fetVar.o0(objP2);
                    }
                    dwi0.b(function2, n0qVar, (Function1) objP2, fetVar, 48, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                wha0.k(knv0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ inv0(Function1 function1, knv0 knv0Var) {
        this.c = function1;
        this.b = knv0Var;
    }
}
