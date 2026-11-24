package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class dk2 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public Object j;
    public byte k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ i3t0 m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk2(byte b, long j, yje yjeVar, i3t0 i3t0Var, boolean z) {
        super(1, yjeVar);
        this.i = b;
        this.l = z;
        this.m = i3t0Var;
        this.n = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        i3t0 i3t0Var = this.m;
        switch (b) {
            case 0:
                return new dk2((byte) 0, this.n, yjeVar, (fk2) i3t0Var, this.l);
            case 1:
                return new dk2((byte) 1, this.n, yjeVar, (fk2) i3t0Var, this.l);
            default:
                return new dk2((byte) 2, this.n, yjeVar, (qi2) i3t0Var, this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((dk2) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:102:0x019e  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:139:0x022d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0254  */
    /* JADX WARN: Code duplicated, block: B:158:0x028a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0298  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136  */
    /* JADX WARN: Code duplicated, block: B:99:0x0191  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v49 java.lang.Object, still in use, count: 2, list:
          (r1v49 java.lang.Object) from 0x0067: PHI (r1 I:??) = (r1v45 java.lang.Object), (r1v49 java.lang.Object) binds: [B:27:0x0066, B:170:0x0067] A[DONT_GENERATE, DONT_INLINE]
          (r1v49 java.lang.Object) from 0x005d: CHECK_CAST (a.xcp) (r1v49 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dk2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
