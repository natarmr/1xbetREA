package a;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bf7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2489a;
    public final /* synthetic */ if7 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ bf7(if7 if7Var, Function1 function1, byte b) {
        this.f2489a = b;
        this.b = if7Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2489a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.c;
        if7 if7Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                nia0.l(if7Var, function1, (fet) obj, x8x.L(1));
                break;
            case 1:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarW = o050.W(jm40Var);
                    imm immVar = if7Var.e;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new to6(function1, (byte) 11);
                        fetVar.o0(objP);
                    }
                    hlm.c(mm40VarW, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    WeakHashMap weakHashMap = djv0.w;
                    mm40 mm40VarK0 = j120.k0(mm40VarD, new ujo(zcm0.i(fetVar2).c, zcm0.i(fetVar2).e));
                    mtl mtlVar = if7Var.g;
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new uo6(function1, (byte) 12);
                        fetVar2.o0(objP2);
                    }
                    bkb.f(mm40VarK0, mtlVar, null, false, null, (Function1) objP2, fetVar2, 0, 28);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                nia0.l(if7Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bf7(if7 if7Var, Function1 function1, int i, byte b) {
        this.f2489a = b;
        this.b = if7Var;
        this.c = function1;
    }
}
