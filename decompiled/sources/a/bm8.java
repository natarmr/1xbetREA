package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class bm8 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public long k;
    public i3t0 l;
    public Serializable m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm8(jm8 jm8Var, String str, csr csrVar, yje yjeVar) {
        super(1, yjeVar);
        this.l = jm8Var;
        this.m = str;
        this.n = csrVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.n;
        switch (b) {
            case 0:
                return new bm8((jm8) this.l, (String) this.m, (csr) obj, yjeVar);
            default:
                return new bm8((u0v0) obj, this.k, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((bm8) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:0x0198  */
    /* JADX WARN: Code duplicated, block: B:56:0x019b  */
    /* JADX WARN: Code duplicated, block: B:58:0x019e  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b3  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v16 java.lang.Object, still in use, count: 2, list:
          (r2v16 java.lang.Object) from 0x0165: PHI (r2 I:??) = (r2v13 java.lang.Object), (r2v16 java.lang.Object) binds: [B:44:0x0164, B:69:0x0165] A[DONT_GENERATE, DONT_INLINE]
          (r2v16 java.lang.Object) from 0x015b: CHECK_CAST (a.pbv) (r2v16 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bm8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm8(u0v0 u0v0Var, long j, yje yjeVar) {
        super(1, yjeVar);
        this.n = u0v0Var;
        this.k = j;
    }
}
