package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class npt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23928a;
    public final /* synthetic */ Object b;

    public /* synthetic */ npt0(Object obj, byte b) {
        this.f23928a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0427  */
    /* JADX WARN: Code duplicated, block: B:104:0x0448  */
    /* JADX WARN: Code duplicated, block: B:106:0x044d  */
    /* JADX WARN: Code duplicated, block: B:111:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:114:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:116:0x04b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:118:0x04be  */
    /* JADX WARN: Code duplicated, block: B:120:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:121:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:123:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:127:0x04ed A[LOOP:5: B:125:0x04e7->B:127:0x04ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0410 A[PHI: r5
  0x0410: PHI (r5v25 a.xtu0) = (r5v24 a.xtu0), (r5v28 a.xtu0) binds: [B:95:0x0404, B:97:0x040c] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v29 java.lang.Object, still in use, count: 2, list:
          (r5v29 java.lang.Object) from 0x0402: PHI (r5 I:??) = (r5v22 java.lang.Object), (r5v29 java.lang.Object) binds: [B:93:0x0401, B:211:0x0402] A[DONT_GENERATE, DONT_INLINE]
          (r5v29 java.lang.Object) from 0x03f7: CHECK_CAST (a.xtu0) (r5v29 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 2018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.npt0.invoke(java.lang.Object):java.lang.Object");
    }
}
