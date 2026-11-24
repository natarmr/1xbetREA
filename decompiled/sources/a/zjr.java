package a;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zjr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44495a;
    public final /* synthetic */ fkr b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ zjr(fkr fkrVar, Function1 function1, int i) {
        this.f44495a = (byte) 2;
        this.b = fkrVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44495a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.c;
        fkr fkrVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarW = o050.W(jm40Var);
                    imm immVar = fkrVar.f;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new hcr(function1, (byte) 6);
                        fetVar.o0(objP);
                    }
                    hlm.c(mm40VarW, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    WeakHashMap weakHashMap = djv0.w;
                    mm40 mm40VarK0 = j120.k0(mm40VarD, new ujo(zcm0.i(fetVar2).c, zcm0.i(fetVar2).e));
                    mtl mtlVar = fkrVar.g;
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new baq(function1, (byte) 9);
                        fetVar2.o0(objP2);
                    }
                    bkb.f(mm40VarK0, mtlVar, null, false, null, (Function1) objP2, fetVar2, 0, 28);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                x4d0.E(fkrVar, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zjr(fkr fkrVar, Function1 function1, byte b) {
        this.f44495a = b;
        this.b = fkrVar;
        this.c = function1;
    }
}
