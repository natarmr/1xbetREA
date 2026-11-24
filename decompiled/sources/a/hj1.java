package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hj1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ nj1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj1(nj1 nj1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = nj1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nj1 nj1Var = this.j;
        switch (b) {
            case 0:
                return new hj1(nj1Var, yjeVar, (byte) 0);
            case 1:
                return new hj1(nj1Var, yjeVar, (byte) 1);
            default:
                return new hj1(nj1Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hj1) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[LOOP:2: B:25:0x0081->B:27:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0059 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v11 java.lang.Object, still in use, count: 2, list:
          (r0v11 java.lang.Object) from 0x0046: PHI (r0 I:??) = (r0v5 java.lang.Object), (r0v11 java.lang.Object) binds: [B:12:0x0045, B:36:0x0046] A[DONT_GENERATE, DONT_INLINE]
          (r0v11 java.lang.Object) from 0x003c: CHECK_CAST (a.x2q) (r0v11 java.lang.Object)
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
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
