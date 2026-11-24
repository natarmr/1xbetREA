package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f700a;
    public final /* synthetic */ Object b;

    public /* synthetic */ adw(Object obj, byte b) {
        this.f700a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0231  */
    /* JADX WARN: Code duplicated, block: B:103:0x0242  */
    /* JADX WARN: Code duplicated, block: B:105:0x024b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0256  */
    /* JADX WARN: Code duplicated, block: B:108:0x025a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0265  */
    /* JADX WARN: Code duplicated, block: B:111:0x026a  */
    /* JADX WARN: Code duplicated, block: B:273:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x0209 A[LOOP:3: B:90:0x0203->B:92:0x0209, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0223  */
    /* JADX WARN: Code duplicated, block: B:96:0x0226  */
    /* JADX WARN: Code duplicated, block: B:98:0x0229  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v7 java.lang.Object, still in use, count: 2, list:
          (r13v7 java.lang.Object) from 0x01d8: PHI (r13 I:??) = (r13v2 java.lang.Object), (r13v7 java.lang.Object) binds: [B:80:0x01d7, B:275:0x01d8] A[DONT_GENERATE, DONT_INLINE]
          (r13v7 java.lang.Object) from 0x01cc: CHECK_CAST (a.lok0) (r13v7 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.adw.invoke(java.lang.Object):java.lang.Object");
    }
}
