package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class tsr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 17;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                i89 i89Var = (i89) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new tsr0(i89Var, clzVar, (fup0) obj2, yjeVar);
            case 1:
                i89 i89Var2 = (i89) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new tsr0(i89Var2, clzVar2, (fup0) obj2, yjeVar, (byte) 0);
            case 2:
                gmq gmqVar = (gmq) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new tsr0(gmqVar, clzVar3, (rtq0) obj2, yjeVar);
            case 3:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new tsr0(gmqVar2, clzVar4, (rtq0) obj2, yjeVar, (byte) 0);
            case 4:
                i89 i89Var3 = (i89) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new tsr0(i89Var3, clzVar5, (fup0) obj2, yjeVar, (char) 0);
            case 5:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new tsr0(gmqVar3, clzVar6, (rtq0) obj2, yjeVar, (char) 0);
            case 6:
                i89 i89Var4 = (i89) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new tsr0(i89Var4, clzVar7, (fup0) obj2, yjeVar, 0);
            case 7:
                i89 i89Var5 = (i89) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new tsr0(i89Var5, clzVar8, (fup0) obj2, yjeVar, (short) 0);
            case 8:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new tsr0(gmqVar4, clzVar9, (rtq0) obj2, yjeVar, 0);
            case 9:
                i89 i89Var6 = (i89) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new tsr0(i89Var6, clzVar10, (fup0) obj2, yjeVar, (byte) 0, false);
            case 10:
                xae0 xae0Var = (xae0) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new tsr0(xae0Var, clzVar11, (rtq0) obj2, yjeVar);
            case 11:
                i89 i89Var7 = (i89) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new tsr0(i89Var7, clzVar12, (fup0) obj2, yjeVar, (byte) 0, (byte) 0);
            case 12:
                return new tsr0((p4) obj2, yjeVar);
            case 13:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new tsr0(gmqVar5, clzVar13, (rtq0) obj2, yjeVar, (short) 0);
            case 14:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new tsr0(gmqVar6, clzVar14, (k6s0) obj2, yjeVar);
            case 15:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new tsr0(gmqVar7, clzVar15, (bvs0) obj2, yjeVar);
            case 16:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new tsr0(gmqVar8, clzVar16, (bvs0) obj2, yjeVar, (byte) 0);
            case 17:
                dnq dnqVar = (dnq) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new tsr0(dnqVar, clzVar17, (k5r0) obj2, yjeVar);
            case 18:
                i89 i89Var8 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new tsr0(i89Var8, clzVar18, (fup0) obj2, yjeVar, (byte) 0, (char) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i89 i89Var9 = (i89) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new tsr0(i89Var9, clzVar19, (fup0) obj2, yjeVar, (byte) 0, 0);
            case 20:
                i89 i89Var10 = (i89) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new tsr0(i89Var10, clzVar20, (fup0) obj2, yjeVar, (byte) 0, (short) 0);
            case 21:
                i89 i89Var11 = (i89) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new tsr0(i89Var11, clzVar21, (fup0) obj2, yjeVar, (char) 0, false);
            case 22:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new tsr0(gmqVar9, clzVar22, (rtq0) obj2, yjeVar, (byte) 0, false);
            case 23:
                qaf0 qaf0Var = (qaf0) this.k;
                clz clzVar23 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new tsr0(qaf0Var, clzVar23, (k5r0) obj2, yjeVar);
            case 24:
                i89 i89Var12 = (i89) this.k;
                clz clzVar24 = (clz) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new tsr0(i89Var12, clzVar24, (fup0) obj2, yjeVar, (char) 0, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gmq gmqVar10 = (gmq) this.k;
                clz clzVar25 = (clz) this.l;
                lkz lkzVar25 = lkz.f20223a;
                return new tsr0(gmqVar10, clzVar25, (z8u0) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gmq gmqVar11 = (gmq) this.k;
                clz clzVar26 = (clz) this.l;
                lkz lkzVar26 = lkz.f20223a;
                return new tsr0(gmqVar11, clzVar26, (z8u0) obj2, yjeVar, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i89 i89Var13 = (i89) this.k;
                clz clzVar27 = (clz) this.l;
                lkz lkzVar27 = lkz.f20223a;
                return new tsr0(i89Var13, clzVar27, (fau0) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gmq gmqVar12 = (gmq) this.k;
                clz clzVar28 = (clz) this.l;
                lkz lkzVar28 = lkz.f20223a;
                return new tsr0(gmqVar12, clzVar28, (k5r0) obj2, yjeVar);
            default:
                gmq gmqVar13 = (gmq) this.k;
                clz clzVar29 = (clz) this.l;
                lkz lkzVar29 = lkz.f20223a;
                return new tsr0(gmqVar13, clzVar29, (k5r0) obj2, yjeVar, (byte) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
        }
        return ((tsr0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        k050 k050Var;
        byte b = this.i;
        byte b2 = 21;
        byte b3 = 22;
        byte b4 = 23;
        byte b5 = 24;
        byte b6 = 25;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var = new mmq0((fup0) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB.c(mmq0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var2 = new mmq0((fup0) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB2.c(mmq0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var3 = new mmq0((rtq0) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB3.c(mmq0Var3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var4 = new mmq0((rtq0) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB4.c(mmq0Var4, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var5 = new mmq0((fup0) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB5.c(mmq0Var5, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var6 = new mmq0((rtq0) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB6.c(mmq0Var6, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var7 = new mmq0((fup0) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB7.c(mmq0Var7, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var = new x6s0((fup0) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB8.c(x6s0Var, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var2 = new x6s0((rtq0) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB9.c(x6s0Var2, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var3 = new x6s0((fup0) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB10.c(x6s0Var3, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var4 = new x6s0((rtq0) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB11.c(x6s0Var4, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var5 = new x6s0((fup0) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB12.c(x6s0Var5, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                p4 p4Var = (p4) obj2;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    pvh0 pvh0Var = (pvh0) p4Var;
                    pgk0 pgk0Var = pvh0Var.i;
                    if (pgk0Var != null) {
                        pgk0Var.d(pvh0Var, phu0.j, pvh0Var.h);
                    }
                    k050 k050Var2 = pvh0Var.l;
                    this.k = k050Var2;
                    this.l = p4Var;
                    this.j = true;
                    if (k050Var2.d(this) == wneVar13) {
                        return wneVar13;
                    }
                    k050Var = k050Var2;
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p4Var = (p4) this.l;
                    k050Var = (k050) this.k;
                    z1x.P(obj);
                }
                try {
                    ((pvh0) p4Var).e = ((hgk0) ((pvh0) p4Var).c).getValue();
                    n5a n5aVar = ((pvh0) p4Var).k;
                    if (n5aVar != null) {
                        e0g0 e0g0Var = j0g0.b;
                        n5aVar.resumeWith(((hgk0) ((pvh0) p4Var).c).getValue());
                    }
                    ((pvh0) p4Var).k = null;
                    return Unit.f46060a;
                } finally {
                    k050Var.c(null);
                }
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var6 = new x6s0((rtq0) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB13.c(x6s0Var6, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var7 = new x6s0((k6s0) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB14.c(x6s0Var7, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var8 = new x6s0((bvs0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB15.c(x6s0Var8, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var9 = new x6s0((bvs0) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB16.c(x6s0Var9, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.c);
                    x6s0 x6s0Var10 = new x6s0((k5r0) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB17.c(x6s0Var10, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var11 = new x6s0((fup0) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB18.c(x6s0Var11, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var12 = new x6s0((fup0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB19.c(x6s0Var12, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var13 = new x6s0((fup0) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB20.c(x6s0Var13, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var14 = new x6s0((fup0) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB21.c(x6s0Var14, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var15 = new x6s0((rtq0) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB22.c(x6s0Var15, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    bq9 bq9VarB23 = hkb.B((qaf0) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var16 = new x6s0((k5r0) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB23.c(x6s0Var16, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB24 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var17 = new x6s0((fup0) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB24.c(x6s0Var17, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    bq9 bq9VarB25 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var18 = new x6s0((z8u0) obj2, b2);
                    this.j = true;
                    if (bq9VarB25.c(x6s0Var18, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB26 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var19 = new x6s0((z8u0) obj2, b3);
                    this.j = true;
                    if (bq9VarB26.c(x6s0Var19, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB27 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var20 = new x6s0((fau0) obj2, b4);
                    this.j = true;
                    if (bq9VarB27.c(x6s0Var20, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB28 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var21 = new x6s0((k5r0) obj2, b5);
                    this.j = true;
                    if (bq9VarB28.c(x6s0Var21, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    bq9 bq9VarB29 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x6s0 x6s0Var22 = new x6s0((k5r0) obj2, b6);
                    this.j = true;
                    if (bq9VarB29.c(x6s0Var22, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(p4 p4Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = p4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, byte b, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, char c, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, char c, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(i89 i89Var, clz clzVar, fau0 fau0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fau0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, rtq0 rtq0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, rtq0 rtq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, rtq0 rtq0Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, rtq0 rtq0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, rtq0 rtq0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, rtq0 rtq0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, k5r0 k5r0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, k6s0 k6s0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k6s0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, bvs0 bvs0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bvs0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, bvs0 bvs0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bvs0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, z8u0 z8u0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = z8u0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(gmq gmqVar, clz clzVar, z8u0 z8u0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = z8u0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(dnq dnqVar, clz clzVar, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(xae0 xae0Var, clz clzVar, rtq0 rtq0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsr0(qaf0 qaf0Var, clz clzVar, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = qaf0Var;
        this.l = clzVar;
        this.m = k5r0Var;
    }
}
