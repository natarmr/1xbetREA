package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xz20 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41735a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ xz20(xdr xdrVar, Function1 function1, Function1 function2, byte b) {
        this.f41735a = b;
        this.b = xdrVar;
        this.c = function1;
        this.d = function2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f41735a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                or20 or20Var = (or20) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                or20Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(or20Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    bh bhVar = or20Var.b;
                    eao eaoVar = bhVar.f2580a;
                    a4x a4xVar = bhVar.b;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new lj00(function1, (byte) 22);
                        fetVar.o0(objP);
                    }
                    bww.f(null, eaoVar, a4xVar, this.b, (Function1) objP, this.d, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                or20 or20Var2 = (or20) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                or20Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(or20Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    zcl zclVar2 = qmk.i;
                    mm40 mm40VarN = s5x0.N(i120.Q(dw9.i(zclVar, zclVar, zclVar2, zclVar2, jm40Var), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 0.0f, 4.0f, 0.0f, 2.0f, 5);
                    bh bhVar2 = or20Var2.b;
                    eao eaoVar2 = bhVar2.f2580a;
                    a4x a4xVar2 = bhVar2.b;
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new lj00(function1, (byte) 23);
                        fetVar2.o0(objP2);
                    }
                    cww.d(mm40VarN, eaoVar2, a4xVar2, this.b, (Function1) objP2, this.d, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                or20 or20Var3 = (or20) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                or20Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(or20Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(s5x0.L(mm40VarQ, 8.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 5);
                    bh bhVar3 = or20Var3.b;
                    eao eaoVar3 = bhVar3.f2580a;
                    a4x a4xVar3 = bhVar3.b;
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new lj00(function1, (byte) 24);
                        fetVar3.o0(objP3);
                    }
                    cww.d(mm40VarN2, eaoVar3, a4xVar3, this.b, (Function1) objP3, this.d, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                or20 or20Var4 = (or20) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                or20Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(or20Var4) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    bh bhVar4 = or20Var4.b;
                    eao eaoVar4 = bhVar4.f2580a;
                    a4x a4xVar4 = bhVar4.b;
                    boolean zG4 = fetVar4.g(function1);
                    Object objP4 = fetVar4.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new lj00(function1, (byte) 25);
                        fetVar4.o0(objP4);
                    }
                    xww.h(null, eaoVar4, a4xVar4, this.b, (Function1) objP4, this.d, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                or20 or20Var5 = (or20) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                or20Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(or20Var5) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    mm40 mm40VarQ2 = i120.Q(jm40Var, ((ThemeColors) fetVar5.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    bh bhVar5 = or20Var5.b;
                    eao eaoVar5 = bhVar5.f2580a;
                    a4x a4xVar5 = bhVar5.b;
                    boolean zG5 = fetVar5.g(function1);
                    Object objP5 = fetVar5.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new lj00(function1, (byte) 26);
                        fetVar5.o0(objP5);
                    }
                    qxw.g(mm40VarQ2, eaoVar5, a4xVar5, this.b, (Function1) objP5, this.d, fetVar5, 0, 0);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
