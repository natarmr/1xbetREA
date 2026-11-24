package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40485a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x9(Object obj, boolean z, byte b) {
        this.f40485a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0253  */
    /* JADX WARN: Code duplicated, block: B:68:0x025a  */
    /* JADX WARN: Code duplicated, block: B:70:0x025d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0264  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v16 java.lang.Object, still in use, count: 2, list:
          (r12v16 java.lang.Object) from 0x0247: PHI (r12 I:??) = (r12v9 java.lang.Object), (r12v16 java.lang.Object) binds: [B:64:0x0246, B:184:0x0247] A[DONT_GENERATE, DONT_INLINE]
          (r12v16 java.lang.Object) from 0x023d: CHECK_CAST (a.lgr0) (r12v16 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x9.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ x9(boolean z, Object obj, byte b) {
        this.f40485a = b;
        this.b = z;
        this.c = obj;
    }
}
