package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class sgu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sgu(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = obj;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.l;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                sgu sguVar = new sgu((tgu) obj4, (yje) obj3, (byte) 0);
                sguVar.j = iIntValue;
                sguVar.k = (List) obj2;
                return sguVar.invokeSuspend(Unit.f46060a);
            default:
                int iIntValue2 = ((Number) obj2).intValue();
                sgu sguVar2 = new sgu((mkn0) obj4, (yje) obj3, (byte) 1);
                sguVar2.k = (qjn0) obj;
                sguVar2.j = iIntValue2;
                return sguVar2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v19 java.lang.Object, still in use, count: 2, list:
          (r4v19 java.lang.Object) from 0x009b: PHI (r4 I:??) = (r4v7 java.lang.Object), (r4v19 java.lang.Object) binds: [B:26:0x009a, B:70:0x009b] A[DONT_GENERATE, DONT_INLINE]
          (r4v19 java.lang.Object) from 0x008f: CHECK_CAST (a.mr70) (r4v19 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sgu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
