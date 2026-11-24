package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eod implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8133a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eod(Object obj, Object obj2, byte b) {
        this.f8133a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x042a  */
    /* JADX WARN: Code duplicated, block: B:128:0x042d  */
    /* JADX WARN: Code duplicated, block: B:132:0x043b  */
    /* JADX WARN: Code duplicated, block: B:137:0x044f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0452  */
    /* JADX WARN: Code duplicated, block: B:297:0x044a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:? A[LOOP:2: B:130:0x0435->B:298:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v54 java.lang.Object, still in use, count: 2, list:
          (r4v54 java.lang.Object) from 0x0426: PHI (r4 I:??) = (r4v49 java.lang.Object), (r4v54 java.lang.Object) binds: [B:124:0x0425, B:294:0x0426] A[DONT_GENERATE, DONT_INLINE]
          (r4v54 java.lang.Object) from 0x041a: CHECK_CAST (a.xif) (r4v54 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 2618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eod.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ eod(Object obj, Object obj2, int i, byte b) {
        this.f8133a = b;
        this.b = obj;
        this.c = obj2;
    }
}
