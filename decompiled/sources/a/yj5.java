package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yj5 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42726a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj5(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f42726a = b;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:129:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:132:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x0425  */
    /* JADX WARN: Code duplicated, block: B:146:0x0453  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 java.lang.Object, still in use, count: 2, list:
          (r5v6 java.lang.Object) from 0x03cc: PHI (r5 I:??) = (r5v2 java.lang.Object), (r5v6 java.lang.Object) binds: [B:124:0x03cb, B:167:0x03cc] A[DONT_GENERATE, DONT_INLINE]
          (r5v6 java.lang.Object) from 0x03c2: CHECK_CAST (a.q88) (r5v6 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yj5.invoke(java.lang.Object):java.lang.Object");
    }
}
