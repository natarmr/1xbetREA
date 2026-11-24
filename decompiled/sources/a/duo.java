package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class duo implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6706a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ duo(ctu ctuVar, xsu xsuVar, tqt tqtVar, g2v g2vVar, int i, long j) {
        this.c = ctuVar;
        this.e = xsuVar;
        this.f = tqtVar;
        this.g = g2vVar;
        this.d = i;
        this.b = j;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x0169  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x0175  */
    /* JADX WARN: Code duplicated, block: B:75:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x0180  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7 A[LOOP:6: B:80:0x01a1->B:82:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c0 A[LOOP:7: B:84:0x01ba->B:86:0x01c0, LOOP_END] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v24 java.lang.Object, still in use, count: 2, list:
          (r2v24 java.lang.Object) from 0x0162: PHI (r2 I:??) = (r2v8 java.lang.Object), (r2v24 java.lang.Object) binds: [B:63:0x0160, B:155:0x0162] A[DONT_GENERATE, DONT_INLINE]
          (r2v24 java.lang.Object) from 0x0159: CHECK_CAST (a.ujr0) (r2v24 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.duo.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ duo(pu90 pu90Var, int i, pu90 pu90Var2, pu90 pu90Var3, long j, vj30 vj30Var, myq0 myq0Var, int i2, int i3) {
        this.c = pu90Var;
        this.d = i;
        this.e = pu90Var2;
        this.f = pu90Var3;
        this.b = j;
        this.g = vj30Var;
    }

    public /* synthetic */ duo(pu90 pu90Var, int i, pu90 pu90Var2, pu90 pu90Var3, pu90 pu90Var4, long j) {
        this.c = pu90Var;
        this.d = i;
        this.e = pu90Var2;
        this.f = pu90Var3;
        this.g = pu90Var4;
        this.b = j;
    }

    public /* synthetic */ duo(ArrayList arrayList, int[] iArr, ArrayList arrayList2, long j, pu90 pu90Var, int i) {
        this.e = arrayList;
        this.f = iArr;
        this.g = arrayList2;
        this.b = j;
        this.c = pu90Var;
        this.d = i;
    }
}
