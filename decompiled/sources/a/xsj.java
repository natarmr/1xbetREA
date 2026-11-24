package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xsj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                gmq gmqVar = (gmq) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new xsj(gmqVar, clzVar, (d7e) obj2, yjeVar);
            case 1:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new xsj(gmqVar2, clzVar2, (d7e) obj2, yjeVar, (byte) 0);
            case 2:
                xsj xsjVar = new xsj((ywj) this.l, (Function2) obj2, yjeVar);
                xsjVar.k = obj;
                return xsjVar;
            case 3:
                return new xsj(this.k, this.l, (wdr) obj2, yjeVar, (byte) 3);
            case 4:
                rzj rzjVar = (rzj) this.k;
                Map map = (Map) this.l;
                oot0 oot0Var = oot0.f25610a;
                return new xsj(rzjVar, yjeVar, map, (crd) obj2);
            case 5:
                return new xsj((rzj) this.k, yjeVar, (hx9) this.l, (Map) obj2);
            case 6:
                i89 i89Var = (i89) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new xsj(i89Var, clzVar3, (e9g) obj2, yjeVar);
            case 7:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new xsj(gmqVar3, clzVar4, (e9g) obj2, yjeVar);
            case 8:
                xae0 xae0Var = (xae0) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new xsj(xae0Var, clzVar5, (hij) obj2, yjeVar);
            case 9:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new xsj(gmqVar4, clzVar6, (a9k) obj2, yjeVar);
            case 10:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new xsj(gmqVar5, clzVar7, (a9k) obj2, yjeVar, (byte) 0);
            case 11:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new xsj(gmqVar6, clzVar8, (a9k) obj2, yjeVar, (char) 0);
            case 12:
                return new xsj((w46) obj2, yjeVar, (byte) 12);
            case 13:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new xsj(gmqVar7, clzVar9, (u9k) obj2, yjeVar);
            case 14:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new xsj(gmqVar8, clzVar10, (u9k) obj2, yjeVar, (byte) 0);
            case 15:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new xsj(gmqVar9, clzVar11, (u9k) obj2, yjeVar, (char) 0);
            case 16:
                return new xsj((w46) obj2, yjeVar, (byte) 16);
            case 17:
                i89 i89Var2 = (i89) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new xsj(i89Var2, clzVar12, (mhc) obj2, yjeVar);
            case 18:
                gmq gmqVar10 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new xsj(gmqVar10, clzVar13, (e9g) obj2, yjeVar, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xae0 xae0Var2 = (xae0) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new xsj(xae0Var2, clzVar14, (hij) obj2, yjeVar, (byte) 0);
            case 20:
                return new xsj(this.k, this.l, (wdr) obj2, yjeVar, (byte) 20);
            case 21:
                i89 i89Var3 = (i89) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new xsj(i89Var3, clzVar15, (brk) obj2, yjeVar);
            case 22:
                gmq gmqVar11 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new xsj(gmqVar11, clzVar16, (otk) obj2, yjeVar);
            case 23:
                gmq gmqVar12 = (gmq) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new xsj(gmqVar12, clzVar17, (otk) obj2, yjeVar, (byte) 0);
            case 24:
                i89 i89Var4 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new xsj(i89Var4, clzVar18, (e9g) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gmq gmqVar13 = (gmq) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new xsj(gmqVar13, clzVar19, (e9g) obj2, yjeVar, (char) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gmq gmqVar14 = (gmq) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new xsj(gmqVar14, clzVar20, (qzk) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gmq gmqVar15 = (gmq) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new xsj(gmqVar15, clzVar21, (qzk) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var5 = (i89) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new xsj(i89Var5, clzVar22, (brk) obj2, yjeVar, (byte) 0);
            default:
                gmq gmqVar16 = (gmq) this.k;
                clz clzVar23 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new xsj(gmqVar16, clzVar23, (d7e) obj2, yjeVar, (char) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((xsj) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xsj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:214:0x049f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v56 java.lang.Object, still in use, count: 2, list:
          (r1v56 java.lang.Object) from 0x049b: PHI (r1 I:??) = (r1v51 java.lang.Object), (r1v56 java.lang.Object) binds: [B:211:0x049a, B:343:0x049b] A[DONT_GENERATE, DONT_INLINE]
          (r1v56 java.lang.Object) from 0x0493: CHECK_CAST (a.n8k) (r1v56 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xsj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xsj(w46 w46Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = w46Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(i89 i89Var, clz clzVar, e9g e9gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = e9gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(i89 i89Var, clz clzVar, e9g e9gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = e9gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(ywj ywjVar, Function2 function2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.l = ywjVar;
        this.m = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(rzj rzjVar, yje yjeVar, hx9 hx9Var, Map map) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.k = rzjVar;
        this.l = hx9Var;
        this.m = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(rzj rzjVar, yje yjeVar, Map map, crd crdVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        oot0 oot0Var = oot0.f25610a;
        this.k = rzjVar;
        this.l = map;
        this.m = crdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, e9g e9gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = e9gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, e9g e9gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = e9gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, e9g e9gVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = e9gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, a9k a9kVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = a9kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, a9k a9kVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = a9kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, a9k a9kVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = a9kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, u9k u9kVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = u9kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, u9k u9kVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = u9kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, u9k u9kVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = u9kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, otk otkVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = otkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, otk otkVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = otkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, qzk qzkVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = qzkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(gmq gmqVar, clz clzVar, qzk qzkVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = qzkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(xae0 xae0Var, clz clzVar, hij hijVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = hijVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(xae0 xae0Var, clz clzVar, hij hijVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = hijVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xsj(Object obj, Object obj2, wdr wdrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = wdrVar;
    }
}
