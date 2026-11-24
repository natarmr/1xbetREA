package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class tvu extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tvu(Object obj, Object obj2, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:119:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[LOOP:2: B:53:0x00bd->B:124:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d9  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v18 java.lang.Object, still in use, count: 2, list:
          (r4v18 java.lang.Object) from 0x0055: PHI (r4 I:??) = (r4v4 java.lang.Object), (r4v18 java.lang.Object) binds: [B:15:0x0054, B:117:0x0055] A[DONT_GENERATE, DONT_INLINE]
          (r4v18 java.lang.Object) from 0x004b: CHECK_CAST (a.w2s0) (r4v18 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tvu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        Object obj5 = this.n;
        Object obj6 = this.m;
        switch (b) {
            case 0:
                tvu tvuVar = new tvu((lhf0) obj6, (ArrayList) obj5, (yje) obj4, (byte) 0);
                tvuVar.j = (dqk0) obj;
                tvuVar.k = (dqk0) obj2;
                tvuVar.l = (dqk0) obj3;
                return tvuVar.invokeSuspend(Unit.f46060a);
            default:
                tvu tvuVar2 = new tvu((gu1) obj6, (wdu) obj5, (yje) obj4, (byte) 1);
                tvuVar2.j = (List) obj;
                tvuVar2.k = (w2s0) obj2;
                tvuVar2.l = (List) obj3;
                return tvuVar2.invokeSuspend(Unit.f46060a);
        }
    }
}
