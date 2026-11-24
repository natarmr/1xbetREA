package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z6e extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43862a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6e(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f43862a = b;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:117:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:122:0x0407  */
    /* JADX WARN: Code duplicated, block: B:124:0x0417  */
    /* JADX WARN: Code duplicated, block: B:125:0x041a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0430  */
    /* JADX WARN: Code duplicated, block: B:133:0x0434  */
    /* JADX WARN: Code duplicated, block: B:136:0x0442  */
    /* JADX WARN: Code duplicated, block: B:138:0x0452  */
    /* JADX WARN: Code duplicated, block: B:139:0x0455  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v22 java.lang.Object, still in use, count: 2, list:
          (r4v22 java.lang.Object) from 0x03f1: PHI (r4 I:??) = (r4v7 java.lang.Object), (r4v22 java.lang.Object) binds: [B:114:0x03f0, B:182:0x03f1] A[DONT_GENERATE, DONT_INLINE]
          (r4v22 java.lang.Object) from 0x03e2: CHECK_CAST (a.a640) (r4v22 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z6e.invoke(java.lang.Object):java.lang.Object");
    }
}
