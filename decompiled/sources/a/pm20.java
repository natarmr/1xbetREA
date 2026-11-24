package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class pm20 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public ql5 j;
    public tmt k;
    public List l;
    public String m;
    public long n;
    public byte o;
    public final /* synthetic */ i3t0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm20(i3t0 i3t0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.p = i3t0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        i3t0 i3t0Var = this.p;
        switch (b) {
            case 0:
                return new pm20((nn20) i3t0Var, yjeVar, (byte) 0);
            default:
                return new pm20((on20) i3t0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((pm20) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a2 A[LOOP:0: B:25:0x009c->B:27:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b2 A[PHI: r0 r1 r2 r3
  0x01b2: PHI (r0v7 a.tmt) = (r0v6 a.tmt), (r0v17 a.tmt) binds: [B:61:0x01af, B:51:0x0141] A[DONT_GENERATE, DONT_INLINE]
  0x01b2: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v15 java.lang.Object) binds: [B:61:0x01af, B:51:0x0141] A[DONT_GENERATE, DONT_INLINE]
  0x01b2: PHI (r2v7 java.util.List) = (r2v6 java.util.List), (r2v13 java.util.List) binds: [B:61:0x01af, B:51:0x0141] A[DONT_GENERATE, DONT_INLINE]
  0x01b2: PHI (r3v5 long) = (r3v4 long), (r3v12 long) binds: [B:61:0x01af, B:51:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01cb  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
    
        if (r0 == r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ea, code lost:
    
        if (r0 == r11) goto L69;
     */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pm20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
