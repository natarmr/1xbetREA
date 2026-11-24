package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class eyc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;
    public Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyc0(mie0 mie0Var, x0q0 x0q0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.m = mie0Var;
        this.l = x0q0Var;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.k;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new eyc0((byte) 0, yjeVar, (hyc0) obj2, z);
            case 1:
                return new eyc0((byte) 1, yjeVar, (hyc0) obj2, z);
            case 2:
                return new eyc0((nok0) this.m, z, (Function1) obj2, yjeVar);
            case 3:
                return new eyc0((mkn0) obj2, z, yjeVar);
            default:
                return new eyc0((mie0) this.m, (x0q0) obj2, z, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((eyc0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:304:0x050c  */
    /* JADX WARN: Code duplicated, block: B:371:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r37v2, types: [java.lang.String] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v42 java.lang.Object, still in use, count: 2, list:
          (r3v42 java.lang.Object) from 0x00d1: PHI (r3 I:??) = (r3v31 java.lang.Object), (r3v42 java.lang.Object) binds: [B:42:0x00d0, B:368:0x00d1] A[DONT_GENERATE, DONT_INLINE]
          (r3v42 java.lang.Object) from 0x00c7: CHECK_CAST (a.rgv0) (r3v42 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eyc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eyc0(byte b, yje yjeVar, hyc0 hyc0Var, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = hyc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyc0(nok0 nok0Var, boolean z, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.m = nok0Var;
        this.k = z;
        this.l = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyc0(mkn0 mkn0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.l = mkn0Var;
        this.k = z;
    }
}
