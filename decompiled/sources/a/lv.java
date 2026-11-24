package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lv extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public boolean k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(x4t x4tVar, d650 d650Var, mlr mlrVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        this.l = x4tVar;
        this.m = d650Var;
        this.n = mlrVar;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new lv(obj2, this.k, yjeVar, (byte) 0);
            case 1:
                lv lvVar = new lv(obj2, this.k, yjeVar, (byte) 1);
                lvVar.m = obj;
                return lvVar;
            case 2:
                lv lvVar2 = new lv(this.k, this.m, obj2, yjeVar, (byte) 2);
                lvVar2.l = obj;
                return lvVar2;
            case 3:
                return new lv(this.k, this.m, obj2, yjeVar, (byte) 3);
            case 4:
                return new lv((diu0) obj2, yjeVar, (byte) 4);
            case 5:
                return new lv(this.k, (Function0) this.l, (r7n) this.m, (egk0) obj2, yjeVar, (byte) 5);
            case 6:
                lv lvVar3 = new lv(this.k, (pbt) obj2, yjeVar);
                lvVar3.m = obj;
                return lvVar3;
            case 7:
                lv lvVar4 = new lv(obj2, this.k, yjeVar, (byte) 7);
                lvVar4.m = obj;
                return lvVar4;
            case 8:
                lv lvVar5 = new lv((wdu) this.m, (vh0) obj2, this.j, yjeVar);
                lvVar5.l = obj;
                return lvVar5;
            case 9:
                return new lv(this.k, (zaz) this.l, (cfq) this.m, (dfv) obj2, yjeVar, (byte) 9);
            case 10:
                return new lv(obj2, this.k, yjeVar, (byte) 10);
            case 11:
                return new lv((diu0) obj2, yjeVar, (byte) 11);
            case 12:
                return new lv((x4t) this.l, (d650) this.m, (mlr) obj2, this.k, yjeVar);
            case 13:
                return new lv(obj2, this.k, yjeVar, (byte) 13);
            default:
                lv lvVar6 = new lv(this.k, this.m, obj2, yjeVar, (byte) 14);
                lvVar6.l = obj;
                return lvVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((lv) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((lv) create((xe60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((lv) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x025a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0282  */
    /* JADX WARN: Code duplicated, block: B:129:0x028c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:174:0x040d  */
    /* JADX WARN: Code duplicated, block: B:178:0x041c A[PHI: r0 r4
  0x041c: PHI (r0v106 java.lang.Object) = (r0v105 java.lang.Object), (r0v114 java.lang.Object) binds: [B:176:0x0419, B:154:0x0313] A[DONT_GENERATE, DONT_INLINE]
  0x041c: PHI (r4v18 a.lv) = (r4v17 a.lv), (r4v0 a.lv) binds: [B:176:0x0419, B:154:0x0313] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:308:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:315:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:353:0x077c  */
    /* JADX WARN: Code duplicated, block: B:387:0x0837  */
    /* JADX WARN: Code duplicated, block: B:464:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11, types: [int] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r3v75, types: [a.qi10] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006a -> B:16:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:309:0x06ac -> B:311:0x06af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:316:0x06ca -> B:318:0x06ce). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lv(wdu wduVar, vh0 vh0Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.m = wduVar;
        this.n = vh0Var;
        this.j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv(Object obj, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(boolean z, pbt pbtVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.k = z;
        this.n = pbtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv(boolean z, Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv(boolean z, Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }
}
