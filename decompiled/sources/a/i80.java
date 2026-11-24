package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14318a;
    public final /* synthetic */ n80 b;

    public /* synthetic */ i80(n80 n80Var, byte b) {
        this.f14318a = b;
        this.b = n80Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v7 java.lang.Object, still in use, count: 2, list:
          (r5v7 java.lang.Object) from 0x008f: PHI (r5 I:??) = (r5v4 java.lang.Object), (r5v7 java.lang.Object) binds: [B:20:0x008e, B:48:0x008f] A[DONT_GENERATE, DONT_INLINE]
          (r5v7 java.lang.Object) from 0x007d: CHECK_CAST (a.t70) (r5v7 java.lang.Object)
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
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i80.invoke(java.lang.Object):java.lang.Object");
    }
}
