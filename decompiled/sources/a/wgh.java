package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wgh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39116a;
    public final /* synthetic */ qpg b;

    public /* synthetic */ wgh(qpg qpgVar, byte b) {
        this.f39116a = b;
        this.b = qpgVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0104  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Code duplicated, block: B:61:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:5: B:42:0x010a->B:72:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v17 java.lang.Object, still in use, count: 2, list:
          (r6v17 java.lang.Object) from 0x0039: PHI (r6 I:??) = (r6v1 java.lang.Object), (r6v17 java.lang.Object) binds: [B:11:0x0038, B:59:0x0039] A[DONT_GENERATE, DONT_INLINE]
          (r6v17 java.lang.Object) from 0x002e: CHECK_CAST (a.u1h) (r6v17 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wgh.invoke(java.lang.Object):java.lang.Object");
    }
}
