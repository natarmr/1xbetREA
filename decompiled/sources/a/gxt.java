package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class gxt extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ long m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxt(yje yjeVar, qgd qgdVar, List list, long j) {
        super(3, yjeVar);
        this.i = (byte) 1;
        this.n = qgdVar;
        this.o = list;
        this.m = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                gxt gxtVar = new gxt((yje) obj3, (xzp) obj5, this.m, (sip) obj4, (byte) 0);
                gxtVar.k = (kmq) obj;
                gxtVar.l = obj2;
                return gxtVar.invokeSuspend(Unit.f46060a);
            case 1:
                gxt gxtVar2 = new gxt((yje) obj3, (qgd) obj5, (List) obj4, this.m);
                gxtVar2.k = (kmq) obj;
                gxtVar2.l = obj2;
                return gxtVar2.invokeSuspend(Unit.f46060a);
            case 2:
                gxt gxtVar3 = new gxt((yje) obj3, (nc0) obj5, this.m, (sip) obj4, (byte) 2);
                gxtVar3.k = (kmq) obj;
                gxtVar3.l = obj2;
                return gxtVar3.invokeSuspend(Unit.f46060a);
            case 3:
                gxt gxtVar4 = new gxt((yje) obj3, (ywq0) obj5, this.m, (sip) obj4, (byte) 3);
                gxtVar4.k = (kmq) obj;
                gxtVar4.l = obj2;
                return gxtVar4.invokeSuspend(Unit.f46060a);
            default:
                long j = ((ne60) obj2).f23370a;
                gxt gxtVar5 = new gxt((vne) this.l, (pz40) obj5, (gy40) obj4, (yje) obj3);
                gxtVar5.k = (hub0) obj;
                gxtVar5.m = j;
                return gxtVar5.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x016a  */
    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Iterable] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v14 java.lang.Object, still in use, count: 2, list:
          (r11v14 java.lang.Object) from 0x0147: PHI (r11 I:??) = (r11v3 java.lang.Object), (r11v14 java.lang.Object) binds: [B:48:0x0146, B:100:0x0147] A[DONT_GENERATE, DONT_INLINE]
          (r11v14 java.lang.Object) from 0x013d: CHECK_CAST (a.x2q) (r11v14 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gxt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxt(yje yjeVar, Object obj, long j, sip sipVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.n = obj;
        this.m = j;
        this.o = sipVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxt(vne vneVar, pz40 pz40Var, gy40 gy40Var, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 4;
        this.l = vneVar;
        this.n = pz40Var;
        this.o = gy40Var;
    }
}
