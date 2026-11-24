package a;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class fl9 extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl9(Object obj, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.m = obj;
    }

    private final Object l(Object obj) {
        org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.m;
        sw00 sw00Var = (sw00) this.j;
        cvo0 cvo0Var = (cvo0) this.k;
        Long l = (Long) this.l;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (!sw00Var.f32897a || !((iac0) bVar.D()).j) {
            if (((iac0) bVar.D()).k) {
                bVar.C.a();
            }
            bVar.M();
            return Unit.f46060a;
        }
        if (cvo0Var != null) {
            long j = 0;
            if (cvo0Var instanceof bvo0) {
                bVar.Q(0L);
            } else if ((cvo0Var instanceof zuo0) || (cvo0Var instanceof yuo0)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = ((long) ((iac0) bVar.D()).l) * 1000;
                if (l != null) {
                    long jLongValue = jCurrentTimeMillis - l.longValue();
                    if (jLongValue < j2) {
                        j = j2 - jLongValue;
                    }
                }
                bVar.Q(j);
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x028d  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:183:0x0489  */
    /* JADX WARN: Code duplicated, block: B:300:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:301:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:325:0x0772  */
    /* JADX WARN: Code duplicated, block: B:433:0x0950  */
    /* JADX WARN: Code duplicated, block: B:609:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v12 java.lang.Object, still in use, count: 2, list:
          (r10v12 java.lang.Object) from 0x069b: PHI (r10 I:??) = (r10v9 java.lang.Object), (r10v12 java.lang.Object) binds: [B:297:0x069a, B:697:0x069b] A[DONT_GENERATE, DONT_INLINE]
          (r10v12 java.lang.Object) from 0x068f: CHECK_CAST (a.sr20) (r10v12 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 3262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fl9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        Object obj5 = this.m;
        switch (b) {
            case 0:
                fl9 fl9Var = new fl9((gl9) obj5, (yje) obj4, (byte) 0);
                fl9Var.j = (HashMap) obj;
                fl9Var.k = (HashMap) obj2;
                fl9Var.l = (HashMap) obj3;
                return fl9Var.invokeSuspend(Unit.f46060a);
            case 1:
                fl9 fl9Var2 = new fl9((j2j) obj5, (yje) obj4, (byte) 1);
                fl9Var2.j = (sw00) obj;
                fl9Var2.k = (cvo0) obj2;
                fl9Var2.l = (Long) obj3;
                return fl9Var2.invokeSuspend(Unit.f46060a);
            case 2:
                fl9 fl9Var3 = new fl9((es) obj5, (yje) obj4, (byte) 2);
                fl9Var3.j = (dqk0) obj;
                fl9Var3.k = (dqk0) obj2;
                fl9Var3.l = (dqk0) obj3;
                return fl9Var3.invokeSuspend(Unit.f46060a);
            case 3:
                fl9 fl9Var4 = new fl9((m9s) obj5, (yje) obj4, (byte) 3);
                fl9Var4.j = (ljg) obj;
                fl9Var4.k = (oxd0) obj2;
                fl9Var4.l = (g0e0) obj3;
                return fl9Var4.invokeSuspend(Unit.f46060a);
            case 4:
                fl9 fl9Var5 = new fl9((qgd) obj5, (yje) obj4, (byte) 4);
                fl9Var5.j = (dqk0) obj;
                fl9Var5.k = (dqk0) obj2;
                fl9Var5.l = (dqk0) obj3;
                return fl9Var5.invokeSuspend(Unit.f46060a);
            case 5:
                fl9 fl9Var6 = new fl9((opt) obj5, (yje) obj4, (byte) 5);
                fl9Var6.j = (srt0) obj;
                fl9Var6.k = (Map) obj2;
                fl9Var6.l = (Map) obj3;
                return fl9Var6.invokeSuspend(Unit.f46060a);
            case 6:
                fl9 fl9Var7 = new fl9((awu) obj5, (yje) obj4, (byte) 6);
                fl9Var7.j = (dqk0) obj;
                fl9Var7.k = (List) obj2;
                fl9Var7.l = (List) obj3;
                return fl9Var7.invokeSuspend(Unit.f46060a);
            case 7:
                fl9 fl9Var8 = new fl9((e730) obj5, (yje) obj4, (byte) 7);
                fl9Var8.j = (List) obj;
                fl9Var8.k = (List) obj2;
                fl9Var8.l = (String) obj3;
                return fl9Var8.invokeSuspend(Unit.f46060a);
            case 8:
                fl9 fl9Var9 = new fl9((f730) obj5, (yje) obj4, (byte) 8);
                fl9Var9.j = (List) obj;
                fl9Var9.k = (List) obj2;
                fl9Var9.l = (String) obj3;
                return fl9Var9.invokeSuspend(Unit.f46060a);
            case 9:
                fl9 fl9Var10 = new fl9((n660) obj5, (yje) obj4, (byte) 9);
                fl9Var10.j = (List) obj;
                fl9Var10.k = (List) obj2;
                fl9Var10.l = (List) obj3;
                return fl9Var10.invokeSuspend(Unit.f46060a);
            case 10:
                fl9 fl9Var11 = new fl9((f1b0) obj5, (yje) obj4, (byte) 10);
                fl9Var11.j = (sw00) obj;
                fl9Var11.k = (cvo0) obj2;
                fl9Var11.l = (Long) obj3;
                return fl9Var11.invokeSuspend(Unit.f46060a);
            case 11:
                fl9 fl9Var12 = new fl9((org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) obj5, (yje) obj4, (byte) 11);
                fl9Var12.j = (sw00) obj;
                fl9Var12.k = (cvo0) obj2;
                fl9Var12.l = (Long) obj3;
                return fl9Var12.invokeSuspend(Unit.f46060a);
            default:
                fl9 fl9Var13 = new fl9((dzm0) obj5, (yje) obj4, (byte) 12);
                fl9Var13.j = (List) obj;
                fl9Var13.k = (u5s) obj2;
                fl9Var13.l = (px7) obj3;
                return fl9Var13.invokeSuspend(Unit.f46060a);
        }
    }
}
