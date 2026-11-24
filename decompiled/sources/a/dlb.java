package a;

/* JADX INFO: loaded from: classes6.dex */
public final class dlb implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6270a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public dlb(float f, Float f2) {
        this.b = f;
        this.c = f2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130  */
    /* JADX WARN: Code duplicated, block: B:49:0x0133  */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v11 java.lang.Object, still in use, count: 2, list:
          (r3v11 java.lang.Object) from 0x00c4: PHI (r3 I:??) = (r3v5 java.lang.Object), (r3v11 java.lang.Object) binds: [B:22:0x00c3, B:60:0x00c4] A[DONT_GENERATE, DONT_INLINE]
          (r3v11 java.lang.Object) from 0x00b8: CHECK_CAST (a.pj30) (r3v11 java.lang.Object)
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
    @Override // a.tj30
    public final a.uj30 b(a.vj30 r20, java.util.List r21, long r22) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dlb.b(a.vj30, java.util.List, long):a.uj30");
    }

    public dlb(cms0 cms0Var, float f) {
        this.c = cms0Var;
        this.b = f;
    }
}
