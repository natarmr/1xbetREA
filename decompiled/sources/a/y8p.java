package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class y8p extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8p(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = 3;
        List list = (List) obj;
        List list2 = (List) obj2;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                y8p y8pVar = new y8p(b, yjeVar, (byte) 0);
                y8pVar.j = list;
                y8pVar.k = list2;
                return y8pVar.invokeSuspend(Unit.f46060a);
            case 1:
                y8p y8pVar2 = new y8p(b, yjeVar, (byte) 1);
                y8pVar2.j = list;
                y8pVar2.k = list2;
                return y8pVar2.invokeSuspend(Unit.f46060a);
            case 2:
                y8p y8pVar3 = new y8p(b, yjeVar, (byte) 2);
                y8pVar3.j = list;
                y8pVar3.k = list2;
                return y8pVar3.invokeSuspend(Unit.f46060a);
            case 3:
                y8p y8pVar4 = new y8p(b, yjeVar, b);
                y8pVar4.j = list;
                y8pVar4.k = list2;
                return y8pVar4.invokeSuspend(Unit.f46060a);
            case 4:
                y8p y8pVar5 = new y8p(b, yjeVar, (byte) 4);
                y8pVar5.j = list;
                y8pVar5.k = list2;
                return y8pVar5.invokeSuspend(Unit.f46060a);
            case 5:
                y8p y8pVar6 = new y8p(b, yjeVar, (byte) 5);
                y8pVar6.j = list;
                y8pVar6.k = list2;
                return y8pVar6.invokeSuspend(Unit.f46060a);
            case 6:
                y8p y8pVar7 = new y8p(b, yjeVar, (byte) 6);
                y8pVar7.j = list;
                y8pVar7.k = list2;
                return y8pVar7.invokeSuspend(Unit.f46060a);
            case 7:
                y8p y8pVar8 = new y8p(b, yjeVar, (byte) 7);
                y8pVar8.j = list;
                y8pVar8.k = list2;
                return y8pVar8.invokeSuspend(Unit.f46060a);
            case 8:
                y8p y8pVar9 = new y8p(b, yjeVar, (byte) 8);
                y8pVar9.j = list;
                y8pVar9.k = list2;
                return y8pVar9.invokeSuspend(Unit.f46060a);
            case 9:
                y8p y8pVar10 = new y8p(b, yjeVar, (byte) 9);
                y8pVar10.j = list;
                y8pVar10.k = list2;
                return y8pVar10.invokeSuspend(Unit.f46060a);
            case 10:
                y8p y8pVar11 = new y8p(b, yjeVar, (byte) 10);
                y8pVar11.j = list;
                y8pVar11.k = list2;
                return y8pVar11.invokeSuspend(Unit.f46060a);
            case 11:
                y8p y8pVar12 = new y8p(b, yjeVar, (byte) 11);
                y8pVar12.j = list;
                y8pVar12.k = list2;
                return y8pVar12.invokeSuspend(Unit.f46060a);
            case 12:
                y8p y8pVar13 = new y8p(b, yjeVar, (byte) 12);
                y8pVar13.j = list;
                y8pVar13.k = list2;
                return y8pVar13.invokeSuspend(Unit.f46060a);
            case 13:
                y8p y8pVar14 = new y8p(b, yjeVar, (byte) 13);
                y8pVar14.j = list;
                y8pVar14.k = list2;
                return y8pVar14.invokeSuspend(Unit.f46060a);
            default:
                y8p y8pVar15 = new y8p(b, yjeVar, (byte) 14);
                y8pVar15.j = list;
                y8pVar15.k = list2;
                return y8pVar15.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:278:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0281 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v11 java.lang.Object, still in use, count: 2, list:
          (r9v11 java.lang.Object) from 0x02a9: PHI (r9 I:??) = (r9v9 java.lang.Object), (r9v11 java.lang.Object) binds: [B:111:0x02a8, B:284:0x02a9] A[DONT_GENERATE, DONT_INLINE]
          (r9v11 java.lang.Object) from 0x029d: CHECK_CAST (a.kd90) (r9v11 java.lang.Object)
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
            Method dump skipped, instruction units count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y8p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
