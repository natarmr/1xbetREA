package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class li8 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li8(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f20091a = b;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0318  */
    /* JADX WARN: Code duplicated, block: B:89:0x031b  */
    /* JADX WARN: Code duplicated, block: B:91:0x031e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0321  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v13 java.lang.Object, still in use, count: 2, list:
          (r3v13 java.lang.Object) from 0x0312: PHI (r3 I:??) = (r3v10 java.lang.Object), (r3v13 java.lang.Object) binds: [B:85:0x0311, B:182:0x0312] A[DONT_GENERATE, DONT_INLINE]
          (r3v13 java.lang.Object) from 0x0308: CHECK_CAST (a.it9) (r3v13 java.lang.Object)
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
            Method dump skipped, instruction units count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.li8.invoke(java.lang.Object):java.lang.Object");
    }
}
