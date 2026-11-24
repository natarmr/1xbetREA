package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class uu2 extends bnn0 implements ydr {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(xtq0 xtq0Var, List list, String str, yje yjeVar) {
        super(4, yjeVar);
        this.m = xtq0Var;
        this.n = list;
        this.o = str;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0033 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 java.lang.Object, still in use, count: 2, list:
          (r11v4 java.lang.Object) from 0x0058: PHI (r11 I:??) = (r11v2 java.lang.Object), (r11v4 java.lang.Object) binds: [B:13:0x0057, B:62:0x0058] A[DONT_GENERATE, DONT_INLINE]
          (r11v4 java.lang.Object) from 0x004e: CHECK_CAST (a.r040) (r11v4 java.lang.Object)
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
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uu2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        Object obj5 = this.o;
        Object obj6 = this.n;
        switch (b) {
            case 0:
                uu2 uu2Var = new uu2((rv2) obj6, (j73) obj5, (yje) obj4);
                uu2Var.k = (nv2) obj;
                uu2Var.l = (vtj) obj2;
                uu2Var.m = obj3;
                return uu2Var.invokeSuspend(Unit.f46060a);
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                uu2 uu2Var2 = new uu2((xtq0) this.m, (List) obj6, (String) obj5, (yje) obj4);
                uu2Var2.k = (Map) obj;
                uu2Var2.l = (String) obj2;
                uu2Var2.j = zBooleanValue;
                return uu2Var2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(rv2 rv2Var, j73 j73Var, yje yjeVar) {
        super(4, yjeVar);
        this.n = rv2Var;
        this.o = j73Var;
    }
}
