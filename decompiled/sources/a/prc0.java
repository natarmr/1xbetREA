package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class prc0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27458a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ prc0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f27458a = b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:108:0x0300  */
    /* JADX WARN: Code duplicated, block: B:112:0x0323 A[LOOP:4: B:73:0x0235->B:112:0x0323, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x04cb A[LOOP:13: B:172:0x04c5->B:174:0x04cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x050b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0517  */
    /* JADX WARN: Code duplicated, block: B:279:0x0759  */
    /* JADX WARN: Code duplicated, block: B:403:0x0526 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0173  */
    /* JADX WARN: Code duplicated, block: B:42:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x025a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0271  */
    /* JADX WARN: Code duplicated, block: B:85:0x027f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0291  */
    /* JADX WARN: Code duplicated, block: B:91:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v18, types: [a.p7m0] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v27 java.lang.Object, still in use, count: 2, list:
          (r4v27 java.lang.Object) from 0x0258: PHI (r4 I:??) = (r4v25 java.lang.Object), (r4v27 java.lang.Object) binds: [B:79:0x0257, B:405:0x0258] A[DONT_GENERATE, DONT_INLINE]
          (r4v27 java.lang.Object) from 0x024d: CHECK_CAST (a.aco0) (r4v27 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 2512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.prc0.invoke(java.lang.Object):java.lang.Object");
    }
}
