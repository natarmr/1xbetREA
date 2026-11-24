package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rt1 implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31056a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ d9z e;
    public final /* synthetic */ xcz f;
    public final /* synthetic */ xcz g;

    public /* synthetic */ rt1(d9z d9zVar, xcz xczVar, xcz xczVar2, xcz xczVar3, l7m0 l7m0Var, Function1 function1) {
        this.f31056a = (byte) 0;
        this.b = l7m0Var;
        this.c = function1;
        this.d = xczVar;
        this.e = d9zVar;
        this.f = xczVar2;
        this.g = xczVar3;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.f31056a;
        cl5 cl5Var = ukd.f35823a;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                    l7m0 l7m0Var = this.b;
                    fu1 fu1VarE = ((ev1) l7m0Var.getValue()).e();
                    Function1 function1 = this.c;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new h61(function1, (byte) 19);
                        fetVar.o0(objP);
                    }
                    ju70.d(null, fu1VarE, (Function1) objP, u1c.M(26761085, new tt1(this.e, this.d, this.f, this.g, l7m0Var, function1), fetVar), fetVar, 3072);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                l7m0 l7m0Var2 = (l7m0) obj2;
                fet fetVar2 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                l7m0Var2.getClass();
                ((l7m0) obj3).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar2.g(l7m0Var2) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 1041) != 1040)) {
                    l7m0 l7m0Var3 = this.b;
                    fu1 fu1VarE2 = ((ev1) l7m0Var3.getValue()).e();
                    Function1 function2 = this.c;
                    boolean zG2 = fetVar2.g(function2);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new h61(function2, (byte) 23);
                        fetVar2.o0(objP2);
                    }
                    nia0.e(null, l7m0Var2, fu1VarE2, (Function1) objP2, u1c.M(1272629942, new tt1((byte) 1, this.e, this.d, this.f, this.g, l7m0Var3, function2), fetVar2), fetVar2, (iIntValue2 & 112) | 24576);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                l7m0 l7m0Var4 = (l7m0) obj2;
                fet fetVar3 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                l7m0Var4.getClass();
                ((l7m0) obj3).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar3.g(l7m0Var4) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 1041) != 1040)) {
                    l7m0 l7m0Var5 = this.b;
                    fu1 fu1VarE3 = ((ev1) l7m0Var5.getValue()).e();
                    Function1 function3 = this.c;
                    boolean zG3 = fetVar3.g(function3);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new h61(function3, (byte) 24);
                        fetVar3.o0(objP3);
                    }
                    ffb0.a(null, l7m0Var4, fu1VarE3, (Function1) objP3, u1c.M(-1635844917, new tt1((byte) 2, this.e, this.d, this.f, this.g, l7m0Var5, function3), fetVar3), fetVar3, (iIntValue3 & 112) | 24576);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                l7m0 l7m0Var6 = (l7m0) obj2;
                fet fetVar4 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                l7m0Var6.getClass();
                ((l7m0) obj3).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar4.g(l7m0Var6) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 1041) != 1040)) {
                    l7m0 l7m0Var7 = this.b;
                    ru1 ru1Var = ((ev1) l7m0Var7.getValue()).e().e;
                    Function1 function4 = this.c;
                    boolean zG4 = fetVar4.g(function4);
                    Object objP4 = fetVar4.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new h61(function4, (byte) 25);
                        fetVar4.o0(objP4);
                    }
                    oja0.a(null, l7m0Var6, ru1Var, (Function1) objP4, u1c.M(-1813883280, new tt1((byte) 3, this.e, this.d, this.f, this.g, l7m0Var7, function4), fetVar4), fetVar4, (iIntValue4 & 112) | 24576);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ rt1(byte b, d9z d9zVar, xcz xczVar, xcz xczVar2, xcz xczVar3, l7m0 l7m0Var, Function1 function1) {
        this.f31056a = b;
        this.b = l7m0Var;
        this.c = function1;
        this.d = xczVar;
        this.e = d9zVar;
        this.f = xczVar2;
        this.g = xczVar3;
    }
}
