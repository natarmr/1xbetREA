package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class khx extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khx(k3t0 k3t0Var, z620 z620Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = z620Var;
        this.l = pz40Var;
    }

    private final Object l(Object obj) throws Exception {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        gmq gmqVarC = ((i3t0) ((k3t0) this.j)).C();
        iwa0 iwa0Var = (iwa0) this.k;
        lkz lkzVar = lkz.f20223a;
        yn90 yn90Var = new yn90(2, (Function1) ((pz40) this.l).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 6);
        clz clzVarW = aac.W(iwa0Var);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fra0((i89) gmqVarC, clzVarW, yn90Var, (yje) null, (char) 0), 3);
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                khx khxVar = new khx(obj3, obj2, yjeVar, (byte) 0);
                khxVar.j = obj;
                return khxVar;
            case 1:
                khx khxVar2 = new khx(obj3, obj2, yjeVar, (byte) 1);
                khxVar2.j = obj;
                return khxVar2;
            case 2:
                return new khx((l1z) this.j, (kwj) obj3, (Function1) obj2, yjeVar, (byte) 2);
            case 3:
                khx khxVar3 = new khx(obj3, obj2, yjeVar, (byte) 3);
                khxVar3.j = obj;
                return khxVar3;
            case 4:
                lkz lkzVar = lkz.f20223a;
                return new khx((k3t0) this.j, (sxz) obj3, (pz40) obj2, yjeVar);
            case 5:
                khx khxVar4 = new khx(obj3, obj2, yjeVar, (byte) 5);
                khxVar4.j = obj;
                return khxVar4;
            case 6:
                return new khx((b310) this.j, (n210) obj3, (String) obj2, yjeVar, (byte) 6);
            case 7:
                khx khxVar5 = new khx(obj3, obj2, yjeVar, (byte) 7);
                khxVar5.j = obj;
                return khxVar5;
            case 8:
                return new khx((bo10) this.j, (x9v0) obj3, (c8h0) obj2, yjeVar, (byte) 8);
            case 9:
                khx khxVar6 = new khx(obj3, obj2, yjeVar, (byte) 9);
                khxVar6.j = obj;
                return khxVar6;
            case 10:
                lkz lkzVar2 = lkz.f20223a;
                return new khx((k3t0) this.j, (b720) obj3, (pz40) obj2, yjeVar);
            case 11:
                lkz lkzVar3 = lkz.f20223a;
                return new khx((k3t0) this.j, (z620) obj3, (pz40) obj2, yjeVar);
            case 12:
                khx khxVar7 = new khx(obj3, obj2, yjeVar, (byte) 12);
                khxVar7.j = obj;
                return khxVar7;
            case 13:
                khx khxVar8 = new khx(obj3, obj2, yjeVar, (byte) 13);
                khxVar8.j = obj;
                return khxVar8;
            case 14:
                khx khxVar9 = new khx(obj3, obj2, yjeVar, (byte) 14);
                khxVar9.j = obj;
                return khxVar9;
            case 15:
                khx khxVar10 = new khx(obj3, obj2, yjeVar, (byte) 15);
                khxVar10.j = obj;
                return khxVar10;
            case 16:
                khx khxVar11 = new khx(obj3, obj2, yjeVar, (byte) 16);
                khxVar11.j = obj;
                return khxVar11;
            case 17:
                lkz lkzVar4 = lkz.f20223a;
                return new khx((k3t0) this.j, (qg30) obj3, (pz40) obj2, yjeVar);
            case 18:
                khx khxVar12 = new khx(obj3, obj2, yjeVar, (byte) 18);
                khxVar12.j = obj;
                return khxVar12;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                khx khxVar13 = new khx(obj3, obj2, yjeVar, (byte) 19);
                khxVar13.j = obj;
                return khxVar13;
            case 20:
                return new khx((jn5) this.j, (pz40) obj3, (l7m0) obj2, yjeVar, (byte) 20);
            case 21:
                return new khx((d9z) this.j, (pkk0) obj3, (wpq) obj2, yjeVar, (byte) 21);
            case 22:
                lkz lkzVar5 = lkz.f20223a;
                return new khx((k3t0) this.j, (gs70) obj3, (pz40) obj2, yjeVar);
            case 23:
                return new khx((vne) this.j, (d9d0) obj3, (pz40) obj2, yjeVar, (byte) 23);
            case 24:
                khx khxVar14 = new khx(obj3, obj2, yjeVar, (byte) 24);
                khxVar14.j = obj;
                return khxVar14;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar6 = lkz.f20223a;
                return new khx((k3t0) this.j, (dn90) obj3, (pz40) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar7 = lkz.f20223a;
                return new khx((k3t0) this.j, (ao90) obj3, (pz40) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                khx khxVar15 = new khx(obj3, obj2, yjeVar, (byte) 27);
                khxVar15.j = obj;
                return khxVar15;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar8 = lkz.f20223a;
                return new khx((k3t0) this.j, (iwa0) obj3, (pz40) obj2, yjeVar);
            default:
                return new khx((Function1) this.j, (vne) obj3, (xcz) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((khx) create((nhx) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((khx) create((az40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((khx) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((khx) create((i8d) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((khx) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((khx) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((khx) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((khx) create((g730) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((khx) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((khx) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((khx) create((vmt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((khx) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((khx) create((t2b) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((khx) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((khx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:335:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:336:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:340:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:346:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:347:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:389:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0a2c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v15 java.lang.Object, still in use, count: 2, list:
          (r8v15 java.lang.Object) from 0x0a05: PHI (r8 I:??) = (r8v8 java.lang.Object), (r8v15 java.lang.Object) binds: [B:332:0x0a04, B:421:0x0a05] A[DONT_GENERATE, DONT_INLINE]
          (r8v15 java.lang.Object) from 0x09f9: CHECK_CAST (a.c4h) (r8v15 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 3040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.khx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khx(k3t0 k3t0Var, sxz sxzVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = sxzVar;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khx(k3t0 k3t0Var, b720 b720Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = b720Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khx(k3t0 k3t0Var, qg30 qg30Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = qg30Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khx(k3t0 k3t0Var, gs70 gs70Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = gs70Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khx(k3t0 k3t0Var, dn90 dn90Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = dn90Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khx(k3t0 k3t0Var, ao90 ao90Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = ao90Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khx(k3t0 k3t0Var, iwa0 iwa0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = iwa0Var;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ khx(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ khx(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }
}
