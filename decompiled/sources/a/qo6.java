package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qo6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public int j;
    public byte k;
    public long l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo6(long j, so6 so6Var, int i, List list, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = j;
        this.m = so6Var;
        this.j = i;
        this.n = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new qo6(this.l, (so6) this.m, this.j, (List) obj2, yjeVar);
            case 1:
                qo6 qo6Var = new qo6(this.m, obj2, yjeVar, (byte) 1);
                qo6Var.l = ((Number) obj).longValue();
                return qo6Var;
            case 2:
                return new qo6((r7f) obj2, this.l, this.j, yjeVar);
            case 3:
                return new qo6(this.l, (ywu) this.m, (String) obj2, this.j, yjeVar);
            case 4:
                return new qo6(this.m, obj2, yjeVar, (byte) 4);
            case 5:
                return new qo6((eze0) obj2, yjeVar, (byte) 5);
            default:
                return new qo6((ocf0) obj2, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qo6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qo6) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((qo6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((qo6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((qo6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((qo6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qo6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:152:0x0458  */
    /* JADX WARN: Code duplicated, block: B:222:0x065d  */
    /* JADX WARN: Code duplicated, block: B:224:0x066c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0671  */
    /* JADX WARN: Code duplicated, block: B:227:0x0674  */
    /* JADX WARN: Code duplicated, block: B:231:0x0683  */
    /* JADX WARN: Code duplicated, block: B:233:0x0686  */
    /* JADX WARN: Code duplicated, block: B:236:0x0690  */
    /* JADX WARN: Code duplicated, block: B:238:0x0698  */
    /* JADX WARN: Code duplicated, block: B:239:0x069d  */
    /* JADX WARN: Code duplicated, block: B:244:0x06aa A[LOOP:9: B:243:0x06a8->B:244:0x06aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:247:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:249:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:252:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:255:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:257:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:259:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:260:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:263:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:266:0x0705  */
    /* JADX WARN: Code duplicated, block: B:267:0x070c  */
    /* JADX WARN: Code duplicated, block: B:270:0x0712 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x0714  */
    /* JADX WARN: Code duplicated, block: B:272:0x071d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0720  */
    /* JADX WARN: Code duplicated, block: B:275:0x0722 A[PHI: r12
  0x0722: PHI (r12v10 java.lang.String) = (r12v9 java.lang.String), (r12v16 java.lang.String) binds: [B:269:0x0710, B:274:0x0720] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:276:0x0725  */
    /* JADX WARN: Code duplicated, block: B:279:0x072d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0730  */
    /* JADX WARN: Code duplicated, block: B:282:0x0733  */
    /* JADX WARN: Code duplicated, block: B:284:0x0737  */
    /* JADX WARN: Code duplicated, block: B:285:0x073a  */
    /* JADX WARN: Code duplicated, block: B:287:0x073d  */
    /* JADX WARN: Code duplicated, block: B:295:0x076b A[LOOP:7: B:220:0x0657->B:295:0x076b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:313:0x0755 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0777 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x06a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x068a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x075c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0286  */
    /* JADX WARN: Instruction removed from duplicated block: B:257:0x06d7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36, types: [int] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v33 java.lang.Object, still in use, count: 2, list:
          (r6v33 java.lang.Object) from 0x03dd: PHI (r6 I:??) = (r6v27 java.lang.Object), (r6v33 java.lang.Object) binds: [B:142:0x03dc, B:308:0x03dd] A[DONT_GENERATE, DONT_INLINE]
          (r6v33 java.lang.Object) from 0x03d3: CHECK_CAST (a.tg7) (r6v33 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qo6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo6(long j, ywu ywuVar, String str, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.l = j;
        this.m = ywuVar;
        this.n = str;
        this.j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo6(r7f r7fVar, long j, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.n = r7fVar;
        this.l = j;
        this.j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo6(i3t0 i3t0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = i3t0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo6(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
    }
}
