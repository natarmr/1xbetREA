package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class snn extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ i3t0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snn(int i, khp khpVar, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 1;
        this.k = i;
        this.l = khpVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        int i = this.k;
        i3t0 i3t0Var = this.l;
        switch (b) {
            case 0:
                return new snn((wnn) i3t0Var, i, yjeVar, (byte) 0);
            case 1:
                return new snn(i, (khp) i3t0Var, yjeVar);
            default:
                return new snn((o9g0) i3t0Var, i, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((snn) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3 A[LOOP:1: B:31:0x00cd->B:33:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v16 java.lang.Object, still in use, count: 2, list:
          (r2v16 java.lang.Object) from 0x0088: PHI (r2 I:??) = (r2v3 java.lang.Object), (r2v16 java.lang.Object) binds: [B:27:0x0087, B:58:0x0088] A[DONT_GENERATE, DONT_INLINE]
          (r2v16 java.lang.Object) from 0x0080: CHECK_CAST (a.xgp) (r2v16 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.snn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ snn(i3t0 i3t0Var, int i, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = i3t0Var;
        this.k = i;
    }
}
