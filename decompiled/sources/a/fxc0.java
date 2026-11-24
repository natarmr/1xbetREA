package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fxc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = yn90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new fxc0((i3t0) this.k, (String) this.l, (String) obj2, yjeVar, (byte) 0);
            case 1:
                i89 i89Var = (i89) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new fxc0(i89Var, clzVar, (yn90) obj2, yjeVar);
            case 2:
                return new fxc0((i3t0) this.k, (String) this.l, (String) obj2, yjeVar, (byte) 2);
            case 3:
                xae0 xae0Var = (xae0) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new fxc0(xae0Var, clzVar2, (s9c0) obj2, yjeVar);
            case 4:
                xae0 xae0Var2 = (xae0) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new fxc0(xae0Var2, clzVar3, (jjc0) obj2, yjeVar);
            case 5:
                fxc0 fxc0Var = new fxc0((pzu) obj2, yjeVar);
                fxc0Var.l = obj;
                return fxc0Var;
            case 6:
                gmq gmqVar = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new fxc0(gmqVar, clzVar4, (jjc0) obj2, yjeVar);
            case 7:
                gmq gmqVar2 = (gmq) this.k;
                bed0 bed0Var = (bed0) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new fxc0(gmqVar2, bed0Var, (jjc0) obj2, yjeVar);
            case 8:
                p6d p6dVar = (p6d) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new fxc0(p6dVar, clzVar5, (coc0) obj2, yjeVar);
            case 9:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new fxc0(gmqVar3, clzVar6, (ffd0) obj2, yjeVar);
            case 10:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new fxc0(gmqVar4, clzVar7, (ffd0) obj2, yjeVar, (byte) 0);
            case 11:
                dnq dnqVar = (dnq) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new fxc0(dnqVar, clzVar8, (ffd0) obj2, yjeVar);
            case 12:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new fxc0(gmqVar5, clzVar9, (igd0) obj2, yjeVar);
            case 13:
                dnq dnqVar2 = (dnq) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new fxc0(dnqVar2, clzVar10, (igd0) obj2, yjeVar);
            case 14:
                dnq dnqVar3 = (dnq) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new fxc0(dnqVar3, clzVar11, (whd0) obj2, yjeVar);
            case 15:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new fxc0(gmqVar6, clzVar12, (whd0) obj2, yjeVar);
            case 16:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new fxc0(gmqVar7, clzVar13, (vid0) obj2, yjeVar);
            case 17:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new fxc0(gmqVar8, clzVar14, (vid0) obj2, yjeVar, (byte) 0);
            case 18:
                dnq dnqVar4 = (dnq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new fxc0(dnqVar4, clzVar15, (mjd0) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new fxc0(gmqVar9, clzVar16, (mjd0) obj2, yjeVar);
            case 20:
                gmq gmqVar10 = (gmq) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new fxc0(gmqVar10, clzVar17, (jjc0) obj2, yjeVar, (byte) 0);
            case 21:
                gmq gmqVar11 = (gmq) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new fxc0(gmqVar11, clzVar18, (d7a0) obj2, yjeVar);
            case 22:
                gmq gmqVar12 = (gmq) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new fxc0(gmqVar12, clzVar19, (xmd0) obj2, yjeVar);
            case 23:
                gmq gmqVar13 = (gmq) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new fxc0(gmqVar13, clzVar20, (xmd0) obj2, yjeVar, (byte) 0);
            case 24:
                fxc0 fxc0Var2 = new fxc0((gnd0) this.l, (ind0) obj2, yjeVar);
                fxc0Var2.k = obj;
                return fxc0Var2;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                p7m0 p7m0Var = (p7m0) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new fxc0(p7m0Var, clzVar21, (jjc0) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ol60 ol60Var = (ol60) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new fxc0(ol60Var, clzVar22, (jjc0) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i89 i89Var2 = (i89) this.k;
                clz clzVar23 = (clz) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new fxc0(i89Var2, clzVar23, (yn90) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gmq gmqVar14 = (gmq) this.k;
                clz clzVar24 = (clz) this.l;
                lkz lkzVar25 = lkz.f20223a;
                return new fxc0(gmqVar14, clzVar24, (s9c0) obj2, yjeVar);
            default:
                i89 i89Var3 = (i89) this.k;
                clz clzVar25 = (clz) this.l;
                lkz lkzVar26 = lkz.f20223a;
                return new fxc0(i89Var3, clzVar25, (yn90) obj2, yjeVar, (char) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((fxc0) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:256:0x05b4 A[Catch: all -> 0x0599, CancellationException -> 0x0631, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0631, all -> 0x0599, blocks: (B:248:0x0595, B:256:0x05b4, B:258:0x05d5, B:259:0x05e1), top: B:328:0x0595 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x05d5 A[Catch: all -> 0x0599, CancellationException -> 0x0631, TryCatch #2 {CancellationException -> 0x0631, all -> 0x0599, blocks: (B:248:0x0595, B:256:0x05b4, B:258:0x05d5, B:259:0x05e1), top: B:328:0x0595 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:264:0x05f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:260:0x05eb -> B:262:0x05ef). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fxc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = yn90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = yn90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(p6d p6dVar, clz clzVar, coc0 coc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = p6dVar;
        this.l = clzVar;
        this.m = coc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, d7a0 d7a0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = d7a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, s9c0 s9c0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = s9c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, ffd0 ffd0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ffd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, ffd0 ffd0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ffd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, igd0 igd0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = igd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, whd0 whd0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = whd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, vid0 vid0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vid0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, vid0 vid0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vid0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, mjd0 mjd0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = mjd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, xmd0 xmd0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = xmd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, clz clzVar, xmd0 xmd0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = xmd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gmq gmqVar, bed0 bed0Var, jjc0 jjc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = bed0Var;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(dnq dnqVar, clz clzVar, ffd0 ffd0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = ffd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(dnq dnqVar, clz clzVar, igd0 igd0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = igd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(dnq dnqVar, clz clzVar, whd0 whd0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = whd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(dnq dnqVar, clz clzVar, mjd0 mjd0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = mjd0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(pzu pzuVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.m = pzuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(ol60 ol60Var, clz clzVar, jjc0 jjc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = ol60Var;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(gnd0 gnd0Var, ind0 ind0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.l = gnd0Var;
        this.m = ind0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(xae0 xae0Var, clz clzVar, s9c0 s9c0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = s9c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(xae0 xae0Var, clz clzVar, jjc0 jjc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc0(p7m0 p7m0Var, clz clzVar, jjc0 jjc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = p7m0Var;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fxc0(i3t0 i3t0Var, String str, String str2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = i3t0Var;
        this.l = str;
        this.m = str2;
    }
}
