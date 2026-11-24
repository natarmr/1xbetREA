package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class xn2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public int k;
    public Object l;
    public Object m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn2(pzu pzuVar, String str, int i, String str2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.l = pzuVar;
        this.n = str;
        this.k = i;
        this.m = str2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new xn2((yn2) this.l, (z470) this.m, (String) this.n, yjeVar);
            case 1:
                return new xn2((List) this.l, yjeVar, (g9a) this.m, this.k);
            case 2:
                xn2 xn2Var = new xn2((nyu) this.n, this.k, yjeVar);
                xn2Var.m = obj;
                return xn2Var;
            case 3:
                return new xn2(this.n, yjeVar, (byte) 3);
            case 4:
                return new xn2(this.n, yjeVar, (byte) 4);
            case 5:
                return new xn2((pzu) this.l, (String) this.n, this.k, (String) this.m, yjeVar);
            default:
                xn2 xn2Var2 = new xn2(this.n, yjeVar, (byte) 6);
                xn2Var2.m = obj;
                return xn2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((xn2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((xn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((xn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((xn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xn2) create((gmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:173:0x03f3 A[Catch: all -> 0x03f9, TryCatch #2 {all -> 0x03f9, blocks: (B:171:0x03ea, B:173:0x03f3, B:176:0x03fb, B:179:0x0400), top: B:244:0x03ea }] */
    /* JADX WARN: Code duplicated, block: B:178:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:182:0x040c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0413 A[Catch: all -> 0x0390, TRY_LEAVE, TryCatch #0 {all -> 0x0390, blocks: (B:147:0x038b, B:183:0x040d, B:185:0x0413), top: B:240:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:213:0x048c  */
    /* JADX WARN: Code duplicated, block: B:214:0x048f  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a1 A[PHI: r3 r4
  0x04a1: PHI (r3v9 ??) = (r3v84 ??), (r3v85 ??) binds: [B:216:0x049e, B:199:0x044c] A[DONT_GENERATE, DONT_INLINE]
  0x04a1: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v12 java.lang.Object) binds: [B:216:0x049e, B:199:0x044c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:250:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x020a  */
    /* JADX WARN: Code duplicated, block: B:80:0x020f  */
    /* JADX WARN: Code duplicated, block: B:87:0x024f A[LOOP:2: B:83:0x022d->B:87:0x024f, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v6 java.lang.Object, still in use, count: 2, list:
          (r10v6 java.lang.Object) from 0x0488: PHI (r10 I:??) = (r10v2 java.lang.Object), (r10v6 java.lang.Object) binds: [B:210:0x0487, B:256:0x0488] A[DONT_GENERATE, DONT_INLINE]
          (r10v6 java.lang.Object) from 0x047a: CHECK_CAST (a.pbv) (r10v6 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xn2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn2(nyu nyuVar, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.n = nyuVar;
        this.k = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn2(yn2 yn2Var, z470 z470Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = yn2Var;
        this.m = z470Var;
        this.n = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn2(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn2(List list, yje yjeVar, g9a g9aVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.l = list;
        this.m = g9aVar;
        this.k = i;
    }
}
