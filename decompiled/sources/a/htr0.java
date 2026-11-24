package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class htr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13647a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ htr0(Object obj, Object obj2, byte b) {
        this.f13647a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[LOOP:1: B:39:0x00de->B:137:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v17 java.lang.Object, still in use, count: 2, list:
          (r4v17 java.lang.Object) from 0x00cd: PHI (r4 I:??) = (r4v12 java.lang.Object), (r4v17 java.lang.Object) binds: [B:33:0x00cc, B:133:0x00cd] A[DONT_GENERATE, DONT_INLINE]
          (r4v17 java.lang.Object) from 0x00c1: CHECK_CAST (a.rrh) (r4v17 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.htr0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ htr0(Object obj, Object obj2, int i, byte b) {
        this.f13647a = b;
        this.b = obj;
        this.c = obj2;
    }
}
