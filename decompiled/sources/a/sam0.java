package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class sam0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ tam0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sam0(tam0 tam0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = tam0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tam0 tam0Var = this.j;
        switch (b) {
            case 0:
                return new sam0(tam0Var, yjeVar, (byte) 0);
            case 1:
                return new sam0(tam0Var, yjeVar, (byte) 1);
            default:
                return new sam0(tam0Var, yjeVar, (byte) 2);
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
        }
        return ((sam0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x019f  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v10 java.lang.Object, still in use, count: 2, list:
          (r9v10 java.lang.Object) from 0x019b: PHI (r9 I:??) = (r9v5 java.lang.Object), (r9v10 java.lang.Object) binds: [B:37:0x019a, B:85:0x019b] A[DONT_GENERATE, DONT_INLINE]
          (r9v10 java.lang.Object) from 0x0193: CHECK_CAST (org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel) (r9v10 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sam0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
