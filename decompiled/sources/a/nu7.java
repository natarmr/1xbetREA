package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class nu7 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24136a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Object d;

    public nu7(int i, l7m0 l7m0Var, Function1 function1) {
        this.b = i;
        this.d = function1;
        this.c = l7m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0147  */
    /* JADX WARN: Code duplicated, block: B:35:0x0150  */
    /* JADX WARN: Code duplicated, block: B:39:0x0166  */
    /* JADX WARN: Code duplicated, block: B:46:0x0181  */
    /* JADX WARN: Code duplicated, block: B:47:0x018c  */
    /* JADX WARN: Code duplicated, block: B:49:0x018f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0192  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x0200  */
    /* JADX WARN: Code duplicated, block: B:64:0x0204  */
    /* JADX WARN: Code duplicated, block: B:66:0x020a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0213  */
    /* JADX WARN: Code duplicated, block: B:69:0x021b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0224  */
    /* JADX WARN: Code duplicated, block: B:72:0x022c  */
    /* JADX WARN: Code duplicated, block: B:73:0x023d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0242  */
    /* JADX WARN: Code duplicated, block: B:82:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0245 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v11 java.lang.Object, still in use, count: 2, list:
          (r11v11 java.lang.Object) from 0x0143: PHI (r11 I:??) = (r11v1 java.lang.Object), (r11v11 java.lang.Object) binds: [B:31:0x0142, B:80:0x0143] A[DONT_GENERATE, DONT_INLINE]
          (r11v11 java.lang.Object) from 0x0135: CHECK_CAST (a.pj30) (r11v11 java.lang.Object)
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
    public final a.uj30 b(a.vj30 r21, java.util.List r22, long r23) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nu7.b(a.vj30, java.util.List, long):a.uj30");
    }

    public nu7(a4x a4xVar, int i, l7m0 l7m0Var) {
        this.d = a4xVar;
        this.b = i;
        this.c = l7m0Var;
    }
}
