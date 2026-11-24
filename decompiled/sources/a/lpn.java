package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class lpn extends bnn0 implements Function1 {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public boolean k;
    public Object l;
    public Object m;
    public i3t0 n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpn(dza dzaVar, hv60 hv60Var, String str, boolean z, yje yjeVar) {
        super(1, yjeVar);
        this.m = dzaVar;
        this.n = hv60Var;
        this.o = str;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.o;
        switch (b) {
            case 0:
                return new lpn((mpn) obj, yjeVar);
            default:
                return new lpn((dza) this.m, (hv60) this.n, (String) obj, this.k, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((lpn) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x020e  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
    
        if (r5.T(r2, r22, r0) == r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0110, code lost:
    
        if (r0 == r7) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [a.lne, a.yje, java.lang.Object, java.util.concurrent.CancellationException, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v3, types: [a.lne, a.yje] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
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
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lpn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpn(mpn mpnVar, yje yjeVar) {
        super(1, yjeVar);
        this.o = mpnVar;
    }
}
