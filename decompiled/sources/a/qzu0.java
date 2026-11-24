package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qzu0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29595a;
    public final /* synthetic */ n0v0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ qzu0(n0v0 n0v0Var, Function1 function1, int i) {
        this.f29595a = (byte) 2;
        this.b = n0v0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29595a;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        n0v0 n0v0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    imm immVarA = n0v0Var.a();
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new ntu0(function1, (byte) 5);
                        fetVar.o0(objP);
                    }
                    hlm.c(null, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mtl mtlVarB = n0v0Var.b();
                    if (mtlVarB == null) {
                        fetVar2.e0(-1802610619);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1802610618);
                        ma80 ma80Var = ma80.f21447a;
                        boolean zG2 = fetVar2.g(function1);
                        Object objP2 = fetVar2.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new szu0(function1, (byte) 0);
                            fetVar2.o0(objP2);
                        }
                        bkb.f(null, mtlVarB, ma80Var, false, null, (Function1) objP2, fetVar2, 384, 25);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                eeq.P(n0v0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qzu0(n0v0 n0v0Var, Function1 function1, byte b) {
        this.f29595a = b;
        this.b = n0v0Var;
        this.c = function1;
    }
}
