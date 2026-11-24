package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sp7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32577a = 0;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ w2d c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ sp7(pz40 pz40Var, w2d w2dVar, Function1 function1) {
        this.b = pz40Var;
        this.c = w2dVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32577a;
        Function1 function1 = this.d;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eq7 eq7Var = (eq7) pz40Var.getValue();
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new to6(function1, (byte) 20);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new to6(function1, (byte) 21);
                        fetVar.o0(objP2);
                    }
                    oja0.e(null, eq7Var, this.c, function0, (Function0) objP2, fetVar, 512);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                oja0.f(pz40Var, this.c, function1, (fet) obj, x8x.L(65));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ sp7(pz40 pz40Var, w2d w2dVar, Function1 function1, int i) {
        this.b = pz40Var;
        this.c = w2dVar;
        this.d = function1;
    }
}
