package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p8w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26579a;
    public final /* synthetic */ naw b;

    public /* synthetic */ p8w(naw nawVar, n3w n3wVar) {
        this.f26579a = (byte) 5;
        this.b = nawVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0127 A[LOOP:2: B:52:0x011e->B:54:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0131 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v4 java.lang.Object, still in use, count: 2, list:
          (r7v4 java.lang.Object) from 0x00ae: PHI (r7 I:??) = (r7v1 java.lang.Object), (r7v4 java.lang.Object) binds: [B:24:0x00ad, B:74:0x00ae] A[DONT_GENERATE, DONT_INLINE]
          (r7v4 java.lang.Object) from 0x009e: CHECK_CAST (a.n3w) (r7v4 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p8w.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ p8w(naw nawVar, byte b) {
        this.f26579a = b;
        this.b = nawVar;
    }
}
