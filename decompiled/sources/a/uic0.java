package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class uic0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vic0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uic0(vic0 vic0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vic0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vic0 vic0Var = this.k;
        switch (b) {
            case 0:
                uic0 uic0Var = new uic0(vic0Var, yjeVar, (byte) 0);
                uic0Var.j = obj;
                return uic0Var;
            default:
                uic0 uic0Var2 = new uic0(vic0Var, yjeVar, (byte) 1);
                uic0Var2.j = obj;
                return uic0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((uic0) create((ejc0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((uic0) create((zic0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fc  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v7 java.lang.Object, still in use, count: 2, list:
          (r8v7 java.lang.Object) from 0x01f3: PHI (r8 I:??) = (r8v5 java.lang.Object), (r8v7 java.lang.Object) binds: [B:66:0x01f2, B:75:0x01f3] A[DONT_GENERATE, DONT_INLINE]
          (r8v7 java.lang.Object) from 0x01eb: CHECK_CAST (androidx.fragment.app.Fragment) (r8v7 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uic0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
