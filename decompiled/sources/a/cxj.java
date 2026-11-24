package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cxj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5125a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cxj(Object obj, Object obj2, byte b) {
        this.f5125a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[LOOP:1: B:82:0x038f->B:205:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0387  */
    /* JADX WARN: Code duplicated, block: B:84:0x0395  */
    /* JADX WARN: Code duplicated, block: B:89:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:92:0x03ae  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v13 java.lang.Object, still in use, count: 2, list:
          (r5v13 java.lang.Object) from 0x037e: PHI (r5 I:??) = (r5v8 java.lang.Object), (r5v13 java.lang.Object) binds: [B:74:0x037d, B:201:0x037e] A[DONT_GENERATE, DONT_INLINE]
          (r5v13 java.lang.Object) from 0x0372: CHECK_CAST (a.wmg) (r5v13 java.lang.Object)
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
    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r51, java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 2058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cxj.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ cxj(Object obj, Object obj2, int i, byte b) {
        this.f5125a = b;
        this.b = obj;
        this.c = obj2;
    }
}
