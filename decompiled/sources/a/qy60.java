package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qy60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29521a;
    public final /* synthetic */ uy60 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ qy60(uy60 uy60Var, Function1 function1, int i) {
        this.f29521a = (byte) 2;
        this.b = uy60Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29521a;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        uy60 uy60Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarW = o7k0.w(jm40.b, null, false, 3);
                    imm immVar = uy60Var.e;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new ju60(function1, (byte) 9);
                        fetVar.o0(objP);
                    }
                    hlm.c(mm40VarW, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mtl mtlVar = uy60Var.f;
                    ma80 ma80Var = ma80.b;
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new i160(function1, (byte) 5);
                        fetVar2.o0(objP2);
                    }
                    bkb.f(null, mtlVar, ma80Var, false, null, (Function1) objP2, fetVar2, 384, 25);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                yyw.m(uy60Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qy60(uy60 uy60Var, Function1 function1, byte b) {
        this.f29521a = b;
        this.b = uy60Var;
        this.c = function1;
    }
}
