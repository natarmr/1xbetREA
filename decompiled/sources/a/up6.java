package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class up6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public long j;
    public boolean k;
    public byte l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up6(pbt pbtVar, boolean z, Set set, long j, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.m = pbtVar;
        this.k = z;
        this.n = set;
        this.j = j;
        this.o = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new up6(this.k, (vp6) obj2, yjeVar);
            case 1:
                return new up6((z470) this.m, (h2b) this.n, (String) obj2, yjeVar, (byte) 1);
            case 2:
                return new up6((pbt) this.m, this.k, (Set) this.n, this.j, (String) obj2, yjeVar);
            case 3:
                up6 up6Var = new up6((rrd) obj2, this.j, this.k, yjeVar);
                up6Var.n = obj;
                return up6Var;
            case 4:
                return new up6((z470) this.m, (pm60) this.n, (String) obj2, yjeVar, (byte) 4);
            default:
                return new up6((z470) this.m, (g9b0) this.n, (String) obj2, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((up6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((up6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((up6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((up6) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((up6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((up6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x038f  */
    /* JADX WARN: Code duplicated, block: B:154:0x039f  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:193:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:196:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:217:0x0532  */
    /* JADX WARN: Code duplicated, block: B:220:0x0539  */
    /* JADX WARN: Code duplicated, block: B:225:0x05b5 A[LOOP:0: B:222:0x0563->B:225:0x05b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa A[PHI: r1 r5 r8
  0x01aa: PHI (r1v54 java.lang.Object) = (r1v52 java.lang.Object), (r1v60 java.lang.Object) binds: [B:64:0x01a7, B:45:0x0122] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r5v19 boolean) = (r5v17 boolean), (r5v20 boolean) binds: [B:64:0x01a7, B:45:0x0122] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r8v10 long) = (r8v9 long), (r8v11 long) binds: [B:64:0x01a7, B:45:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x024a  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0280, code lost:
    
        if (r0.c(r1, r3) == r13) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d5, code lost:
    
        if (r1 == r7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ee, code lost:
    
        if (r1 == r7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x038c, code lost:
    
        if (r0.z(r7, r3, (java.lang.String) r5, r2) == r6) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0195, code lost:
    
        if (r0.y(r10, r3, r5, r2) == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d3, code lost:
    
        if (r0 == r7) goto L74;
     */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.up6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up6(rrd rrdVar, long j, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.o = rrdVar;
        this.j = j;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ up6(z470 z470Var, Object obj, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = z470Var;
        this.n = obj;
        this.o = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up6(boolean z, vp6 vp6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.k = z;
        this.o = vp6Var;
    }
}
