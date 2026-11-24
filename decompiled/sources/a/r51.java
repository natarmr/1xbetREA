package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r51 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ v51 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r51(v51 v51Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = v51Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v51 v51Var = this.k;
        switch (b) {
            case 0:
                r51 r51Var = new r51(v51Var, yjeVar, (byte) 0);
                r51Var.j = obj;
                return r51Var;
            case 1:
                r51 r51Var2 = new r51(v51Var, yjeVar, (byte) 1);
                r51Var2.j = obj;
                return r51Var2;
            case 2:
                r51 r51Var3 = new r51(v51Var, yjeVar, (byte) 2);
                r51Var3.j = obj;
                return r51Var3;
            case 3:
                r51 r51Var4 = new r51(v51Var, yjeVar, (byte) 3);
                r51Var4.j = obj;
                return r51Var4;
            default:
                r51 r51Var5 = new r51(v51Var, yjeVar, (byte) 4);
                r51Var5.j = obj;
                return r51Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r51) create((nao0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r51) create((p91) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((r51) create((axf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((r51) create((f2j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r51) create((ub0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x013f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0143  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v36 java.lang.Object, still in use, count: 2, list:
          (r1v36 java.lang.Object) from 0x00fb: PHI (r1 I:??) = (r1v25 java.lang.Object), (r1v36 java.lang.Object) binds: [B:40:0x00fa, B:103:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          (r1v36 java.lang.Object) from 0x00f1: CHECK_CAST (androidx.fragment.app.Fragment) (r1v36 java.lang.Object)
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
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r51.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
