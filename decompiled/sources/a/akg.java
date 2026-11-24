package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class akg implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1020a = 0;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ qdz c;
    public final /* synthetic */ xk80 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Object i;

    public /* synthetic */ akg(l7m0 l7m0Var, qdz qdzVar, xk80 xk80Var, Function1 function1, float f, rdo0 rdo0Var, Function1 function2, Function1 function3) {
        this.b = l7m0Var;
        this.c = qdzVar;
        this.d = xk80Var;
        this.e = function1;
        this.f = f;
        this.i = rdo0Var;
        this.g = function2;
        this.h = function3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        a4x a4xVar;
        ekw ekwVar;
        xcz xczVar;
        Function1 function1;
        a4x a4xVar2;
        ekw ekwVar2;
        xk80 xk80Var;
        int i;
        Function1 function2;
        byte b = this.f1020a;
        cl5 cl5Var = ukd.f35823a;
        Object obj5 = this.i;
        l7m0 l7m0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                rdo0 rdo0Var = (rdo0) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    gkw gkwVar = (gkw) ((kkw) l7m0Var.getValue()).c.getValue();
                    if (gkwVar != null && (a4xVar = gkwVar.b) != null && (ekwVar = (ekw) CollectionsKt.W(iIntValue, a4xVar)) != null) {
                        pz40 pz40VarF = androidx.compose.runtime.e.f(ekwVar, fetVar);
                        String strValueOf = String.valueOf(iIntValue);
                        jyf jyfVar = new jyf((byte) 22);
                        qdz qdzVar = this.c;
                        xcz xczVarB = qdzVar.b(strValueOf, jyfVar, fetVar, 0);
                        xk80 xk80Var2 = this.d;
                        Integer numValueOf = Integer.valueOf(xk80Var2.k());
                        boolean zG = fetVar.g(xczVarB);
                        float f = this.f;
                        boolean zD = zG | fetVar.d(f) | fetVar.g(xk80Var2);
                        boolean z = (iIntValue2 & 112) == 32;
                        Function1 function3 = this.e;
                        boolean zG2 = zD | z | fetVar.g(function3);
                        Object objP = fetVar.P();
                        if (zG2 || objP == cl5Var) {
                            xczVar = xczVarB;
                            ekg ekgVar = new ekg(xczVar, f, xk80Var2, iIntValue, function3, null, (byte) 0);
                            function1 = function3;
                            fetVar.o0(ekgVar);
                            objP = ekgVar;
                        } else {
                            xczVar = xczVarB;
                            function1 = function3;
                        }
                        m0x0.v(numValueOf, function1, (Function2) objP, fetVar);
                        if (((kkw) l7m0Var.getValue()).b) {
                            fetVar.e0(1965583781);
                            boolean zG3 = fetVar.g(xczVar) | fetVar.g(rdo0Var);
                            Object objP2 = fetVar.P();
                            if (zG3 || objP2 == cl5Var) {
                                objP2 = new fkg(xczVar, rdo0Var, null, b2);
                                fetVar.o0(objP2);
                            }
                            pvm0.e((Function2) objP2, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1965938390);
                            fetVar.r(false);
                        }
                        ntr.K(((kkw) l7m0Var.getValue()).f18461a, (l7m0) xp20.d(((kkw) l7m0Var.getValue()).d, ((ekw) pz40VarF.getValue()).f7971a), xk80Var2.k() == iIntValue, ((kkw) l7m0Var.getValue()).b, xczVar, qdzVar, this.g, this.h, fetVar, 0);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                Function1 function4 = (Function1) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    gkw gkwVar2 = (gkw) ((kkw) l7m0Var.getValue()).c.getValue();
                    if (gkwVar2 != null && (a4xVar2 = gkwVar2.b) != null && (ekwVar2 = (ekw) CollectionsKt.W(iIntValue3, a4xVar2)) != null) {
                        pz40 pz40VarF2 = androidx.compose.runtime.e.f(ekwVar2, fetVar2);
                        String strValueOf2 = String.valueOf(iIntValue3);
                        x2w x2wVar = new x2w((byte) 15);
                        qdz qdzVar2 = this.c;
                        xcz xczVarB2 = qdzVar2.b(strValueOf2, x2wVar, fetVar2, 0);
                        xk80 xk80Var3 = this.d;
                        Integer numValueOf2 = Integer.valueOf(xk80Var3.k());
                        boolean zG4 = fetVar2.g(xczVarB2);
                        float f2 = this.f;
                        boolean zD2 = zG4 | fetVar2.d(f2) | fetVar2.g(xk80Var3);
                        boolean z2 = (iIntValue4 & 112) == 32;
                        Function1 function5 = this.e;
                        boolean zG5 = z2 | zD2 | fetVar2.g(function5);
                        Object objP3 = fetVar2.P();
                        if (zG5 || objP3 == cl5Var) {
                            xk80Var = xk80Var3;
                            objP3 = new ekg(xczVarB2, f2, xk80Var, iIntValue3, function5, null, (byte) 1);
                            i = iIntValue3;
                            function2 = function5;
                            fetVar2.o0(objP3);
                        } else {
                            xk80Var = xk80Var3;
                            i = iIntValue3;
                            function2 = function5;
                        }
                        m0x0.v(numValueOf2, function2, (Function2) objP3, fetVar2);
                        cfx0.m(((kkw) l7m0Var.getValue()).b, xczVarB2, this.g, fetVar2, 0);
                        cfx0.q(((kkw) l7m0Var.getValue()).f18461a, (l7m0) xp20.d(((kkw) l7m0Var.getValue()).d, ((ekw) pz40VarF2.getValue()).f7971a), xk80Var.k() == i, ((kkw) l7m0Var.getValue()).b, xczVarB2, qdzVar2, this.h, function4, fetVar2, 0);
                    }
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ akg(l7m0 l7m0Var, qdz qdzVar, xk80 xk80Var, Function1 function1, float f, Function1 function2, Function1 function3, Function1 function4) {
        this.b = l7m0Var;
        this.c = qdzVar;
        this.d = xk80Var;
        this.e = function1;
        this.f = f;
        this.g = function2;
        this.h = function3;
        this.i = function4;
    }
}
