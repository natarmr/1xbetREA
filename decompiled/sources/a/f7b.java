package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f7b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9052a;
    public final /* synthetic */ mya b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ r6b d;

    public /* synthetic */ f7b(boolean z, mya myaVar, r6b r6bVar) {
        this.f9052a = (byte) 2;
        this.c = z;
        this.b = myaVar;
        this.d = r6bVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r19v3 java.lang.Object, still in use, count: 2, list:
          (r19v3 java.lang.Object) from 0x02dc: PHI (r19 I:??) = (r19v1 java.lang.Object), (r19v3 java.lang.Object) binds: [B:99:0x02da, B:202:0x02dc] A[DONT_GENERATE, DONT_INLINE]
          (r19v3 java.lang.Object) from 0x02cf: CHECK_CAST (a.ovm0) (r19v3 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f7b.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ f7b(mya myaVar, boolean z, r6b r6bVar, byte b) {
        this.f9052a = b;
        this.b = myaVar;
        this.c = z;
        this.d = r6bVar;
    }
}
