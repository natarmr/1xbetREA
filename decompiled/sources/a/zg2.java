package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class zg2 extends bnn0 implements xdr {
    public final /* synthetic */ byte i = 1;
    public Object j;
    public byte k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg2(yje yjeVar, hh2 hh2Var) {
        super(3, yjeVar);
        this.n = hh2Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        switch (this.i) {
            case 0:
                zg2 zg2Var = new zg2((yje) obj3, (hh2) this.n);
                zg2Var.l = (kmq) obj;
                zg2Var.j = obj2;
                return zg2Var.invokeSuspend(Unit.f46060a);
            default:
                zg2 zg2Var2 = new zg2((di80) this.p, (yje) obj3);
                zg2Var2.n = (xh80) obj;
                zg2Var2.o = (yh80) obj2;
                return zg2Var2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x041d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0434  */
    /* JADX WARN: Code duplicated, block: B:148:0x0455  */
    /* JADX WARN: Code duplicated, block: B:27:0x0114  */
    /* JADX WARN: Code duplicated, block: B:30:0x0125  */
    /* JADX WARN: Code duplicated, block: B:39:0x0140  */
    /* JADX WARN: Code duplicated, block: B:41:0x0144  */
    /* JADX WARN: Code duplicated, block: B:42:0x0147  */
    /* JADX WARN: Code duplicated, block: B:44:0x014a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0156  */
    /* JADX WARN: Code duplicated, block: B:63:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6 A[LOOP:2: B:64:0x01b0->B:66:0x01b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x0287 A[LOOP:0: B:90:0x0281->B:92:0x0287, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x02b5  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v21 java.lang.Object, still in use, count: 2, list:
          (r4v21 java.lang.Object) from 0x0193: PHI (r4 I:??) = (r4v17 java.lang.Object), (r4v21 java.lang.Object) binds: [B:60:0x0192, B:161:0x0193] A[DONT_GENERATE, DONT_INLINE]
          (r4v21 java.lang.Object) from 0x0187: CHECK_CAST (a.mm80) (r4v21 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg2(di80 di80Var, yje yjeVar) {
        super(3, yjeVar);
        this.p = di80Var;
    }
}
