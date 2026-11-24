package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e280 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7074a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ e280(l7m0 l7m0Var, Function1 function1, pz40 pz40Var, byte b) {
        this.f7074a = b;
        this.b = l7m0Var;
        this.c = function1;
        this.d = pz40Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f7074a;
        jm40 jm40Var = jm40.b;
        byte b2 = 18;
        cl5 cl5Var = ukd.f35823a;
        pz40 pz40Var = this.d;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarA = yhg0Var.a(1.0f, jm40Var, true);
                    gil0 gil0Var = new gil0(2, null, null, new zgl0(), 6);
                    boolean zG = fetVar.g(function1) | fetVar.g(pz40Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new jg2(function1, pz40Var, b2);
                        fetVar.o0(objP);
                    }
                    Function1 function2 = (Function1) objP;
                    boolean zG2 = fetVar.g(function1) | fetVar.g(pz40Var);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new jg2(function1, pz40Var, (byte) 19);
                        fetVar.o0(objP2);
                    }
                    vfc.q(mm40VarA, this.b, gil0Var, function2, (Function1) objP2, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarA2 = yhg0Var2.a(1.0f, jm40Var, true);
                    gil0 gil0Var2 = new gil0(2, null, null, new zgl0(), 6);
                    boolean zG3 = fetVar2.g(function1) | fetVar2.g(pz40Var);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new jg2(function1, pz40Var, (byte) 25);
                        fetVar2.o0(objP3);
                    }
                    Function1 function3 = (Function1) objP3;
                    boolean zG4 = fetVar2.g(function1) | fetVar2.g(pz40Var);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new jg2(function1, pz40Var, (byte) 26);
                        fetVar2.o0(objP4);
                    }
                    vfc.q(mm40VarA2, this.b, gil0Var2, function3, (Function1) objP4, fetVar2, 0, 0);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    gil0 gil0Var3 = new gil0(2, null, null, new zgl0(), 6);
                    boolean zG5 = fetVar3.g(function1) | fetVar3.g(pz40Var);
                    Object objP5 = fetVar3.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new jg2(function1, pz40Var, (byte) 27);
                        fetVar3.o0(objP5);
                    }
                    Function1 function4 = (Function1) objP5;
                    boolean zG6 = fetVar3.g(function1) | fetVar3.g(pz40Var);
                    Object objP6 = fetVar3.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new jg2(function1, pz40Var, (byte) 28);
                        fetVar3.o0(objP6);
                    }
                    vfc.q(null, this.b, gil0Var3, function4, (Function1) objP6, fetVar3, 0, 1);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
