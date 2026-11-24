package a;

/* JADX INFO: loaded from: classes3.dex */
public final class l80 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19584a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l80(Object obj, byte b) {
        this.f19584a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x023d  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v15 java.lang.Object, still in use, count: 2, list:
          (r4v15 java.lang.Object) from 0x0239: PHI (r4 I:??) = (r4v10 java.lang.Object), (r4v15 java.lang.Object) binds: [B:143:0x0238, B:205:0x0239] A[DONT_GENERATE, DONT_INLINE]
          (r4v15 java.lang.Object) from 0x0225: CHECK_CAST (a.vh0) (r4v15 java.lang.Object)
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
    @Override // a.kmq
    public final java.lang.Object a(java.lang.Object r44, a.yje r45) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l80.a(java.lang.Object, a.yje):java.lang.Object");
    }
}
