package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class veq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ weq0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ veq0(weq0 weq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = weq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        weq0 weq0Var = this.k;
        switch (b) {
            case 0:
                veq0 veq0Var = new veq0(weq0Var, yjeVar, (byte) 0);
                veq0Var.j = obj;
                return veq0Var;
            case 1:
                veq0 veq0Var2 = new veq0(weq0Var, yjeVar, (byte) 1);
                veq0Var2.j = obj;
                return veq0Var2;
            case 2:
                veq0 veq0Var3 = new veq0(weq0Var, yjeVar, (byte) 2);
                veq0Var3.j = obj;
                return veq0Var3;
            default:
                veq0 veq0Var4 = new veq0(weq0Var, yjeVar, (byte) 3);
                veq0Var4.j = obj;
                return veq0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((veq0) create((dfq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((veq0) create((hfq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((veq0) create((ofq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((veq0) create((rfq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if ((r0 instanceof a.pfq0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0247, code lost:
    
        if ((r0 instanceof a.ffq0) != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.veq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
