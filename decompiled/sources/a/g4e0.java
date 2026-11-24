package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class g4e0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = yn90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (s9c0) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (yn90) obj2, yjeVar);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (s9c0) obj2, yjeVar, (byte) 0);
            case 3:
                g4e0 g4e0Var = new g4e0(obj3, obj2, yjeVar, (byte) 3);
                g4e0Var.k = obj;
                return g4e0Var;
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (jjc0) obj2, yjeVar);
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (s9c0) obj2, yjeVar);
            case 6:
                lkz lkzVar6 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (jjc0) obj2, yjeVar, (byte) 0);
            case 7:
                lkz lkzVar7 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (jjc0) obj2, yjeVar, (char) 0);
            case 8:
                lkz lkzVar8 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (d7a0) obj2, yjeVar);
            case 9:
                lkz lkzVar9 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (jjc0) obj2, yjeVar, 0);
            case 10:
                lkz lkzVar10 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (coc0) obj2, yjeVar);
            case 11:
                lkz lkzVar11 = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (yn90) obj2, yjeVar, (byte) 0);
            case 12:
                lkz lkzVar12 = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (yn90) obj2, yjeVar, (char) 0);
            case 13:
                g4e0 g4e0Var2 = new g4e0(obj3, obj2, yjeVar, (byte) 13);
                g4e0Var2.k = obj;
                return g4e0Var2;
            case 14:
                lkz lkzVar13 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (hne0) obj2, yjeVar);
            case 15:
                lkz lkzVar14 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (hne0) obj2, yjeVar, (byte) 0);
            case 16:
                lkz lkzVar15 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (jjc0) obj2, yjeVar, (short) 0);
            case 17:
                lkz lkzVar16 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (soe0) obj2, yjeVar);
            case 18:
                lkz lkzVar17 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (toe0) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar18 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (soe0) obj2, yjeVar, (byte) 0);
            case 20:
                lkz lkzVar19 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (toe0) obj2, yjeVar, (byte) 0);
            case 21:
                lkz lkzVar20 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (toe0) obj2, yjeVar, (char) 0);
            case 22:
                lkz lkzVar21 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (s9c0) obj2, yjeVar, (byte) 0);
            case 23:
                lkz lkzVar22 = lkz.f20223a;
                return new g4e0((gmq) this.k, (clz) obj3, (coc0) obj2, yjeVar, (byte) 0);
            case 24:
                lkz lkzVar23 = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar24 = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                g4e0 g4e0Var3 = new g4e0(obj3, obj2, yjeVar, (byte) 26);
                g4e0Var3.k = obj;
                return g4e0Var3;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar25 = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (char) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar26 = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, 0);
            default:
                lkz lkzVar27 = lkz.f20223a;
                return new g4e0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (short) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((g4e0) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 2;
        Object obj2 = this.m;
        Object obj3 = this.l;
        yje yjeVar = null;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var = new mld0((s9c0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB.c(mld0Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var2 = new mld0((yn90) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB2.c(mld0Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var3 = new mld0((s9c0) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB3.c(mld0Var3, this) == wneVar3) {
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
                o1x o1xVar = (o1x) obj2;
                gbe0 gbe0Var = (gbe0) obj3;
                vne vneVar = (vne) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (z4) {
                    if (z4) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                jzj jzjVarC = q8x.D(o1xVar, qjj.M(vneVar, (CoroutineContext) gbe0Var.f11014a.c.getValue(), new ebe0(gbe0Var, o1xVar, yjeVar, b3), 2)).c();
                this.k = null;
                this.j = true;
                Object objAwait = jzjVarC.await(this);
                return objAwait == wneVar4 ? wneVar4 : objAwait;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var4 = new mld0((jjc0) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB4.c(mld0Var4, this) == wneVar5) {
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
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var5 = new mld0((s9c0) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB5.c(mld0Var5, this) == wneVar6) {
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
                    bq9 bq9VarB6 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var6 = new mld0((jjc0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB6.c(mld0Var6, this) == wneVar7) {
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
                    bq9 bq9VarB7 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var7 = new mld0((jjc0) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB7.c(mld0Var7, this) == wneVar8) {
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
                    bq9 bq9VarB8 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var8 = new mld0((d7a0) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB8.c(mld0Var8, this) == wneVar9) {
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
                    bq9 bq9VarB9 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var9 = new mld0((jjc0) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB9.c(mld0Var9, this) == wneVar10) {
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
                    bq9 bq9VarB10 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var10 = new mld0((coc0) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB10.c(mld0Var10, this) == wneVar11) {
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
                    bq9 bq9VarB11 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var11 = new mld0((yn90) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB11.c(mld0Var11, this) == wneVar12) {
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
                    bq9 bq9VarB12 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var12 = new mld0((yn90) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB12.c(mld0Var12, this) == wneVar13) {
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
                    this.j = true;
                    ((ege0) obj3).F((vne) this.k, (qq40) obj2, this);
                    return wneVar14;
                }
                if (z14) {
                    z1x.P(obj);
                    return Unit.f46060a;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var13 = new mld0((hne0) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB13.c(mld0Var13, this) == wneVar15) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var14 = new mld0((hne0) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB14.c(mld0Var14, this) == wneVar16) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var15 = new mld0((jjc0) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB15.c(mld0Var15, this) == wneVar17) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var16 = new mld0((soe0) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB16.c(mld0Var16, this) == wneVar18) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var17 = new mld0((toe0) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB17.c(mld0Var17, this) == wneVar19) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var18 = new mld0((soe0) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB18.c(mld0Var18, this) == wneVar20) {
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
                    bq9 bq9VarB19 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var19 = new mld0((toe0) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB19.c(mld0Var19, this) == wneVar21) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var20 = new mld0((toe0) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB20.c(mld0Var20, this) == wneVar22) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    mld0 mld0Var21 = new mld0((s9c0) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB21.c(mld0Var21, this) == wneVar23) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    npe0 npe0Var = new npe0((coc0) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB22.c(npe0Var, this) == wneVar24) {
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
                    bq9 bq9VarB23 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    npe0 npe0Var2 = new npe0((due0) obj2, b3);
                    this.j = true;
                    if (bq9VarB23.c(npe0Var2, this) == wneVar25) {
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
                    bq9 bq9VarB24 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    npe0 npe0Var3 = new npe0((due0) obj2, b2);
                    this.j = true;
                    if (bq9VarB24.c(npe0Var3, this) == wneVar26) {
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
                qpg0 qpg0Var = (qpg0) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (((xue0) obj3).b.k0(qpg0Var, (Collection) obj2) == wneVar27) {
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
                    bq9 bq9VarB25 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    npe0 npe0Var4 = new npe0((due0) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB25.c(npe0Var4, this) == wneVar28) {
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
                    bq9 bq9VarB26 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    npe0 npe0Var5 = new npe0((due0) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB26.c(npe0Var5, this) == wneVar29) {
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
                    bq9 bq9VarB27 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    npe0 npe0Var6 = new npe0((due0) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB27.c(npe0Var6, this) == wneVar30) {
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
    public g4e0(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = yn90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = yn90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(i89 i89Var, clz clzVar, s9c0 s9c0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = s9c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(i89 i89Var, clz clzVar, s9c0 s9c0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = s9c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, d7a0 d7a0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = d7a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, s9c0 s9c0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = s9c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, s9c0 s9c0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = s9c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, coc0 coc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = coc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, coc0 coc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = coc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, hne0 hne0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = hne0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, hne0 hne0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = hne0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, soe0 soe0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = soe0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, soe0 soe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = soe0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, toe0 toe0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = toe0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, toe0 toe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = toe0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e0(gmq gmqVar, clz clzVar, toe0 toe0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = toe0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4e0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }
}
