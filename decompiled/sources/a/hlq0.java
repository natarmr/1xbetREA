package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class hlq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 13;
    public boolean j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar) {
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
                gmq gmqVar = (gmq) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new hlq0(gmqVar, clzVar, (bdl0) obj2, yjeVar);
            case 1:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new hlq0(gmqVar2, clzVar2, (bdl0) obj2, yjeVar, (byte) 0);
            case 2:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new hlq0(gmqVar3, clzVar3, (bdl0) obj2, yjeVar, (char) 0);
            case 3:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new hlq0(gmqVar4, clzVar4, (bdl0) obj2, yjeVar, 0);
            case 4:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new hlq0(gmqVar5, clzVar5, (bdl0) obj2, yjeVar, (short) 0);
            case 5:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new hlq0(gmqVar6, clzVar6, (bdl0) obj2, yjeVar, (byte) 0, false);
            case 6:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new hlq0(gmqVar7, clzVar7, (bdl0) obj2, yjeVar, (byte) 0, (byte) 0);
            case 7:
                xae0 xae0Var = (xae0) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new hlq0(xae0Var, clzVar8, (bdl0) obj2, yjeVar);
            case 8:
                xae0 xae0Var2 = (xae0) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new hlq0(xae0Var2, clzVar9, (bdl0) obj2, yjeVar, (byte) 0);
            case 9:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new hlq0(gmqVar8, clzVar10, (bdl0) obj2, yjeVar, (byte) 0, (char) 0);
            case 10:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new hlq0(gmqVar9, clzVar11, (ssl0) obj2, yjeVar);
            case 11:
                gmq gmqVar10 = (gmq) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new hlq0(gmqVar10, clzVar12, (ssl0) obj2, yjeVar, (byte) 0);
            case 12:
                gmq gmqVar11 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new hlq0(gmqVar11, clzVar13, (ssl0) obj2, yjeVar, (char) 0);
            case 13:
                a1g a1gVar = (a1g) this.k;
                xsq0 xsq0Var = (xsq0) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new hlq0(a1gVar, xsq0Var, (bdl0) obj2, yjeVar);
            case 14:
                gmq gmqVar12 = (gmq) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new hlq0(gmqVar12, clzVar14, (wsq0) obj2, yjeVar);
            case 15:
                gmq gmqVar13 = (gmq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new hlq0(gmqVar13, clzVar15, (wsq0) obj2, yjeVar, (byte) 0);
            case 16:
                hlq0 hlq0Var = new hlq0((czq0) this.l, (vne) obj2, yjeVar);
                hlq0Var.k = obj;
                return hlq0Var;
            case 17:
                i89 i89Var = (i89) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new hlq0(i89Var, clzVar16, (fup0) obj2, yjeVar);
            case 18:
                utb utbVar = (utb) this.k;
                q7r0 q7r0Var = (q7r0) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new hlq0(utbVar, q7r0Var, (k5r0) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i89 i89Var2 = (i89) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new hlq0(i89Var2, clzVar17, (fup0) obj2, yjeVar, (byte) 0);
            case 20:
                i89 i89Var3 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new hlq0(i89Var3, clzVar18, (fup0) obj2, yjeVar, (char) 0);
            case 21:
                i89 i89Var4 = (i89) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new hlq0(i89Var4, clzVar19, (fup0) obj2, yjeVar, 0);
            case 22:
                gmq gmqVar14 = (gmq) this.k;
                udr0 udr0Var = (udr0) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new hlq0(gmqVar14, udr0Var, (k5r0) obj2, yjeVar);
            case 23:
                hlq0 hlq0Var2 = new hlq0((ofr0) obj2, yjeVar);
                hlq0Var2.l = obj;
                return hlq0Var2;
            case 24:
                i89 i89Var5 = (i89) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new hlq0(i89Var5, clzVar20, (fup0) obj2, yjeVar, (short) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gmq gmqVar15 = (gmq) this.k;
                phr0 phr0Var = (phr0) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new hlq0(gmqVar15, phr0Var, (fup0) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gmq gmqVar16 = (gmq) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar25 = lkz.f20223a;
                return new hlq0(gmqVar16, clzVar21, (nir0) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gmq gmqVar17 = (gmq) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar26 = lkz.f20223a;
                return new hlq0(gmqVar17, clzVar22, (nir0) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new hlq0(this.j, (xcz) this.k, (oyq0) this.l, (Function0) obj2, yjeVar);
            default:
                i89 i89Var6 = (i89) this.k;
                clz clzVar23 = (clz) this.l;
                lkz lkzVar27 = lkz.f20223a;
                return new hlq0(i89Var6, clzVar23, (fup0) obj2, yjeVar, (byte) 0, false);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((hlq0) create((dip) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hlq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        u0r0 u0r0Var;
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    xqp0 xqp0Var = new xqp0((bdl0) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB.c(xqp0Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    xqp0 xqp0Var2 = new xqp0((bdl0) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB2.c(xqp0Var2, this) == wneVar2) {
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
                    xqp0 xqp0Var3 = new xqp0((bdl0) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB3.c(xqp0Var3, this) == wneVar3) {
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
                    xqp0 xqp0Var4 = new xqp0((bdl0) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB4.c(xqp0Var4, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    xqp0 xqp0Var5 = new xqp0((bdl0) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB5.c(xqp0Var5, this) == wneVar5) {
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
                    xqp0 xqp0Var6 = new xqp0((bdl0) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB6.c(xqp0Var6, this) == wneVar6) {
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
                    bq9 bq9VarB7 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    xqp0 xqp0Var7 = new xqp0((bdl0) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB7.c(xqp0Var7, this) == wneVar7) {
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
                    bq9 bq9VarB8 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    xqp0 xqp0Var8 = new xqp0((bdl0) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB8.c(xqp0Var8, this) == wneVar8) {
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
                    bq9 bq9VarB9 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    xqp0 xqp0Var9 = new xqp0((bdl0) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB9.c(xqp0Var9, this) == wneVar9) {
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
                    bq9 bq9VarB10 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var = new mmq0((bdl0) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB10.c(mmq0Var, this) == wneVar10) {
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
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var2 = new mmq0((ssl0) obj2, (byte) 1);
                    this.j = true;
                    if (bq9VarB11.c(mmq0Var2, this) == wneVar11) {
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
                    bq9 bq9VarB12 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var3 = new mmq0((ssl0) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB12.c(mmq0Var3, this) == wneVar12) {
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
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var4 = new mmq0((ssl0) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB13.c(mmq0Var4, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((a1g) this.k, ((xsq0) this.l).u1, lkz.c);
                    mmq0 mmq0Var5 = new mmq0((bdl0) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB14.c(mmq0Var5, this) == wneVar14) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var6 = new mmq0((wsq0) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB15.c(mmq0Var6, this) == wneVar15) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var7 = new mmq0((wsq0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB16.c(mmq0Var7, this) == wneVar16) {
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
                czq0 czq0Var = (czq0) this.l;
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                try {
                    if (!z17) {
                        z1x.P(obj);
                        e0g0 e0g0Var = j0g0.b;
                        ttb0 ttb0Var = czq0Var.d;
                        this.k = null;
                        this.j = true;
                        Object objB = ttb0Var.f34503a.b(ttb0Var.b.f15748a.f21021a.a().getBoolean("SPECIAL_EVENT_ENABLE", false), this);
                        if (objB != wneVar17) {
                            objB = Unit.f46060a;
                        }
                        if (objB == wneVar17) {
                            return wneVar17;
                        }
                    } else {
                        if (!z17) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    g0g0Var = Unit.f46060a;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (!(g0g0Var instanceof g0g0)) {
                }
                vne vneVar = (vne) obj2;
                Throwable thA = j0g0.a(g0g0Var);
                if (thA != null) {
                    thA.getLocalizedMessage();
                    czq0Var.f(thA, vneVar);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var8 = new mmq0((fup0) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB17.c(mmq0Var8, this) == wneVar18) {
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
                    bq9 bq9VarB18 = hkb.B((utb) this.k, ((q7r0) this.l).u1, lkz.c);
                    mmq0 mmq0Var9 = new mmq0((k5r0) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB18.c(mmq0Var9, this) == wneVar19) {
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
                    mmq0 mmq0Var10 = new mmq0((fup0) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB19.c(mmq0Var10, this) == wneVar20) {
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
                    mmq0 mmq0Var11 = new mmq0((fup0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB20.c(mmq0Var11, this) == wneVar21) {
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
                    mmq0 mmq0Var12 = new mmq0((fup0) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB21.c(mmq0Var12, this) == wneVar22) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((udr0) this.l).u1, lkz.d);
                    mmq0 mmq0Var13 = new mmq0((k5r0) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB22.c(mmq0Var13, this) == wneVar23) {
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
                ofr0 ofr0Var = (ofr0) obj2;
                dip dipVar = (dip) this.l;
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    if (dipVar != null) {
                        if (dipVar instanceof zhp) {
                            u0r0Var = new u0r0(b1r0.f1823a, iun.f15405a);
                        } else if (dipVar instanceof aip) {
                            List list = ((aip) dipVar).b;
                            if (list == null) {
                                list = iun.f15405a;
                            }
                            u0r0Var = new u0r0(c1r0.f3588a, list);
                        } else if (dipVar instanceof cip) {
                            u0r0Var = new u0r0(g1r0.f10530a, iun.f15405a);
                        } else if (dipVar instanceof bip) {
                            List list2 = ((bip) dipVar).f2667a;
                            u0r0 u0r0Var2 = new u0r0(f1r0.f8780a, list2);
                            tjb0 tjb0Var = ofr0Var.v;
                            p4l0 p4l0Var = new p4l0(list2);
                            this.l = null;
                            this.k = u0r0Var2;
                            this.j = true;
                            tjb0Var.getClass();
                            if (tjb0Var.a(p4l0Var, this) == wneVar24) {
                                return wneVar24;
                            }
                            u0r0Var = u0r0Var2;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z24) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u0r0Var = (u0r0) this.k;
                z1x.P(obj);
                int i = ofr0.U0;
                ofr0Var.V(u0r0Var);
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB23 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var14 = new mmq0((fup0) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB23.c(mmq0Var14, this) == wneVar25) {
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
                    bq9 bq9VarB24 = hkb.B((gmq) this.k, ((phr0) this.l).u1, lkz.d);
                    mmq0 mmq0Var15 = new mmq0((fup0) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB24.c(mmq0Var15, this) == wneVar26) {
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
                    bq9 bq9VarB25 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var16 = new mmq0((nir0) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB25.c(mmq0Var16, this) == wneVar27) {
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
                    bq9 bq9VarB26 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var17 = new mmq0((nir0) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB26.c(mmq0Var17, this) == wneVar28) {
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
                z1x.P(obj);
                if (this.j) {
                    xcz xczVar = (xcz) this.k;
                    v0h0 v0h0Var = xcz.y;
                    xczVar.k(0, 0);
                    ((oyq0) this.l).c(0.0f);
                    ((Function0) obj2).invoke();
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB27 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    mmq0 mmq0Var18 = new mmq0((fup0) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB27.c(mmq0Var18, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(utb utbVar, q7r0 q7r0Var, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = utbVar;
        this.l = q7r0Var;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(a1g a1gVar, xsq0 xsq0Var, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = a1gVar;
        this.l = xsq0Var;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, ssl0 ssl0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, ssl0 ssl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, ssl0 ssl0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, wsq0 wsq0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wsq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, wsq0 wsq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wsq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, nir0 nir0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nir0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, clz clzVar, nir0 nir0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nir0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, udr0 udr0Var, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = udr0Var;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(gmq gmqVar, phr0 phr0Var, fup0 fup0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = phr0Var;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(xae0 xae0Var, clz clzVar, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(xae0 xae0Var, clz clzVar, bdl0 bdl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(czq0 czq0Var, vne vneVar, yje yjeVar) {
        super(2, yjeVar);
        this.l = czq0Var;
        this.m = vneVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(ofr0 ofr0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = ofr0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlq0(boolean z, xcz xczVar, oyq0 oyq0Var, Function0 function0, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = xczVar;
        this.l = oyq0Var;
        this.m = function0;
    }
}
