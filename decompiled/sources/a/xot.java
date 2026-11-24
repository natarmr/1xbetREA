package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xot implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41237a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ List c;

    public /* synthetic */ xot(kmq kmqVar, List list, byte b) {
        this.f41237a = b;
        this.b = kmqVar;
        this.c = list;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:129:0x020c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0264  */
    /* JADX WARN: Code duplicated, block: B:149:0x0267  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v5 java.lang.Object, still in use, count: 2, list:
          (r8v5 java.lang.Object) from 0x0260: PHI (r8 I:??) = (r8v2 java.lang.Object), (r8v5 java.lang.Object) binds: [B:145:0x025f, B:171:0x0260] A[DONT_GENERATE, DONT_INLINE]
          (r8v5 java.lang.Object) from 0x0254: CHECK_CAST (a.pxy) (r8v5 java.lang.Object)
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
    public final java.lang.Object a(java.lang.Object r16, a.yje r17) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xot.a(java.lang.Object, a.yje):java.lang.Object");
    }
}
