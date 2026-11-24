package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class v060 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ x060 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v060(x060 x060Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.j = x060Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        x060 x060Var = this.j;
        switch (b) {
            case 0:
                return new v060(x060Var, yjeVar, (byte) 0);
            case 1:
                return new v060(x060Var, yjeVar, (byte) 1);
            default:
                return new v060(x060Var, yjeVar, (byte) 2);
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
        return ((v060) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x025f  */
    /* JADX WARN: Code duplicated, block: B:140:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x021f A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v8 java.lang.Object, still in use, count: 2, list:
          (r4v8 java.lang.Object) from 0x024b: PHI (r4 I:??) = (r4v5 java.lang.Object), (r4v8 java.lang.Object) binds: [B:94:0x024a, B:146:0x024b] A[DONT_GENERATE, DONT_INLINE]
          (r4v8 java.lang.Object) from 0x0240: CHECK_CAST (a.k460) (r4v8 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v060.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
