package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class o63 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24714a = 1;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(pz40 pz40Var, g3e g3eVar, Function0 function0, xgm xgmVar, xgm xgmVar2, ugd ugdVar) {
        super(2);
        this.c = pz40Var;
        this.d = g3eVar;
        this.e = function0;
        this.f = xgmVar;
        this.g = xgmVar2;
        this.b = ugdVar;
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
        byte b = this.f24714a;
        Object obj3 = this.c;
        Object obj4 = this.g;
        Object obj5 = this.d;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                b34.f((uz40) obj3, (mm40) obj5, (pzn) this.e, (alo) obj6, (String) obj4, this.b, (fet) obj, x8x.L(1572871));
                break;
            default:
                fet fetVar = (fet) obj;
                xgm xgmVar = (xgm) obj6;
                g3e g3eVar = (g3e) obj5;
                xgm xgmVar2 = (xgm) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && fetVar.D()) {
                    fetVar.X();
                } else {
                    ((pz40) obj3).setValue(Unit.f46060a);
                    g3eVar.getClass();
                    g3eVar.g();
                    fetVar.e0(-1205063843);
                    g3e g3eVar2 = (g3e) g3eVar.f().b;
                    u2e u2eVarE = g3eVar2.e();
                    u2e u2eVarE2 = g3eVar2.e();
                    u2e u2eVarE3 = g3eVar2.e();
                    boolean z = ((k6z) fetVar.k(bmd.n)) == k6z.f17794a;
                    xgm xgmVar3 = z ? xgmVar : xgmVar2;
                    jgm jgmVar = jgm.f16488a;
                    boolean zG = fetVar.g(u2eVarE2) | fetVar.g(xgmVar2);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new d5n(u2eVarE2, xgmVar2, (byte) 0);
                        fetVar.o0(objP);
                    }
                    jm40 jm40Var = jm40.b;
                    ieb.p(g3e.d(jm40Var, u2eVarE, (Function1) objP), xgmVar3, jgmVar, fetVar, 384);
                    boolean zG2 = fetVar.g(u2eVarE) | fetVar.g(u2eVarE3);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new e5n(u2eVarE, u2eVarE3, (byte) 0);
                        fetVar.o0(objP2);
                    }
                    this.b.F(g3e.d(jm40Var, u2eVarE2, (Function1) objP2), fetVar, 0);
                    if (z) {
                        xgmVar = xgmVar2;
                    }
                    jgm jgmVar2 = jgm.b;
                    boolean zG3 = fetVar.g(u2eVarE2) | fetVar.g(xgmVar2);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new d5n(u2eVarE2, xgmVar2, (byte) 1);
                        fetVar.o0(objP3);
                    }
                    ieb.p(g3e.d(jm40Var, u2eVarE3, (Function1) objP3), xgmVar, jgmVar2, fetVar, 384);
                    fetVar.r(false);
                }
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(uz40 uz40Var, mm40 mm40Var, pzn pznVar, alo aloVar, String str, ugd ugdVar, int i) {
        super(2);
        this.c = uz40Var;
        this.d = mm40Var;
        this.e = pznVar;
        this.f = aloVar;
        this.g = str;
        this.b = ugdVar;
    }
}
