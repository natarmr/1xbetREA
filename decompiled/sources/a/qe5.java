package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballView;

/* JADX INFO: loaded from: classes3.dex */
public final class qe5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public long k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe5(long j, CardFootballView cardFootballView, eha ehaVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.k = j;
        this.l = cardFootballView;
        this.m = ehaVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new qe5(this.l, obj2, this.k, yjeVar, (byte) 0);
            case 1:
                return new qe5(this.k, (CardFootballView) this.l, (eha) obj2, yjeVar);
            case 2:
                return new qe5(obj2, this.k, yjeVar, (byte) 2);
            case 3:
                qe5 qe5Var = new qe5(this.l, obj2, yjeVar, (byte) 3);
                qe5Var.k = ((Number) obj).longValue();
                return qe5Var;
            case 4:
                return new qe5(this.l, this.k, obj2, yjeVar, (byte) 4);
            case 5:
                qe5 qe5Var2 = new qe5(obj2, this.k, yjeVar, (byte) 5);
                qe5Var2.l = obj;
                return qe5Var2;
            case 6:
                return new qe5(this.l, obj2, this.k, yjeVar, (byte) 6);
            case 7:
                return new qe5(this.l, this.k, obj2, yjeVar, (byte) 7);
            case 8:
                return new qe5(this.l, obj2, yjeVar, (byte) 8);
            case 9:
                return new qe5(obj2, this.k, yjeVar, (byte) 9);
            case 10:
                return new qe5(this.l, obj2, yjeVar, (byte) 10);
            case 11:
                return new qe5(this.l, obj2, yjeVar, (byte) 11);
            case 12:
                return new qe5(this.l, obj2, yjeVar, (byte) 12);
            case 13:
                return new qe5(this.l, obj2, yjeVar, (byte) 13);
            case 14:
                return new qe5(this.l, obj2, yjeVar, (byte) 14);
            case 15:
                return new qe5(this.l, obj2, yjeVar, (byte) 15);
            case 16:
                return new qe5(this.l, obj2, yjeVar, (byte) 16);
            default:
                return new qe5(this.l, obj2, yjeVar, (byte) 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((qe5) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((qe5) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qe5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:329:0x08ca  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0376, code lost:
    
        if (r13.S(r5, r4, r29) == r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x044d, code lost:
    
        if (r13.S(r3, r7, r29) == r1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        if (r0.j(r5, r29) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04e6, code lost:
    
        if (r4.c(r5, r29) == r1) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05a4, code lost:
    
        if (r13.o0(r0, r29) == r1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x062b, code lost:
    
        if (a.qcc.P(r0, r29) == r8) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x06a9, code lost:
    
        if (a.qjj.d0(r0, r16, r29) == r2) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0784, code lost:
    
        if (r0.a(r1, r29) == r2) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x07d0, code lost:
    
        if (a.t33.a(r0, r3, r2, null, null, r29, 12) == r7) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x082f, code lost:
    
        if (a.qjj.d0(r5, r7, r29) == r3) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0846, code lost:
    
        if (a.qjj.d0(r4, r5, r29) == r3) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fe, code lost:
    
        if (r0.j(r5, r29) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0976, code lost:
    
        if (r1 == r0) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x09c7, code lost:
    
        if (r0.y(r1, r2, r4, r5, r29) == r7) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x09ed, code lost:
    
        if (r0.y(r1, r2, r4, r5, r29) == r7) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0a11, code lost:
    
        if (r0.x(r1, r3, r4, r5, r29) == r7) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0a35, code lost:
    
        if (r0.x(r1, r3, r4, r5, r29) == r7) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0172, code lost:
    
        if (r0.j(r5, r29) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        if (r0.j(r3, r29) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02e0, code lost:
    
        if (r13.S(r3, r7, r29) == r1) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [a.jo20] */
    /* JADX WARN: Type inference failed for: r13v13, types: [a.kgb0] */
    /* JADX WARN: Type inference failed for: r2v51, types: [a.gw60] */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v16 */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qe5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe5(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe5(Object obj, long j, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = j;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe5(Object obj, Object obj2, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe5(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }
}
