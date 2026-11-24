package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g4b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10657a;
    public final /* synthetic */ kz20 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ g4b(kz20 kz20Var, ugd ugdVar, Function1 function1, byte b) {
        this.f10657a = b;
        this.b = kz20Var;
        this.c = ugdVar;
        this.d = function1;
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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10657a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.d;
        ugd ugdVar = this.c;
        kz20 kz20Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (rs20 rs20Var : kz20Var.f19134a) {
                        fetVar.b0(-1024185483, rs20Var.getName());
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarE = o7k0.e(jm40Var, 48.0f);
                        lm6 lm6Var = kz20Var.m;
                        boolean z = !(lm6Var != null && lm6Var.b);
                        boolean zG = fetVar.g(function1) | fetVar.i(rs20Var);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new i4b(function1, rs20Var, b2);
                            fetVar.o0(objP);
                        }
                        ugdVar.j(y860.W(mm40VarE, null, null, z, null, (Function0) objP, 24), rs20Var, fetVar, 0);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    for (rwm0 rwm0Var : kz20Var.b.f29542a) {
                        fetVar2.b0(727061682, rwm0Var.c);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarE2 = o7k0.e(jm40Var, 40.0f);
                        boolean zG2 = fetVar2.g(function1) | fetVar2.i(rwm0Var);
                        Object objP2 = fetVar2.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new bvm0(function1, rwm0Var, b2);
                            fetVar2.o0(objP2);
                        }
                        ugdVar.j(y860.W(mm40VarE2, null, null, false, null, (Function0) objP2, 28), rwm0Var, fetVar2, 0);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
