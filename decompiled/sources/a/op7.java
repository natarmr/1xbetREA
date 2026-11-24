package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class op7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25628a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ op7(vl8 vl8Var, Function1 function1) {
        this.f25628a = (byte) 7;
        this.b = vl8Var;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0475  */
    /* JADX WARN: Code duplicated, block: B:160:0x047c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0488  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:183:0x04da A[LOOP:4: B:181:0x04d4->B:183:0x04da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:187:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:189:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:192:0x0506  */
    /* JADX WARN: Code duplicated, block: B:198:0x0528 A[LOOP:7: B:196:0x0522->B:198:0x0528, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0545  */
    /* JADX WARN: Code duplicated, block: B:206:0x0558 A[LOOP:5: B:201:0x053f->B:206:0x0558, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x0560  */
    /* JADX WARN: Code duplicated, block: B:212:0x0565  */
    /* JADX WARN: Code duplicated, block: B:274:0x04a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x04c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x055c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0511 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v35 java.lang.Object, still in use, count: 2, list:
          (r3v35 java.lang.Object) from 0x0471: PHI (r3 I:??) = (r3v15 java.lang.Object), (r3v35 java.lang.Object) binds: [B:155:0x0470, B:272:0x0471] A[DONT_GENERATE, DONT_INLINE]
          (r3v35 java.lang.Object) from 0x0463: CHECK_CAST (a.sfp0) (r3v35 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.op7.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ op7(Object obj, Object obj2, byte b) {
        this.f25628a = b;
        this.b = obj;
        this.c = obj2;
    }
}
