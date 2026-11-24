package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zpe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 6;
    public boolean j;
    public final /* synthetic */ gmq k;
    public final /* synthetic */ clz l;
    public final /* synthetic */ bnn0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(p6d p6dVar, clz clzVar, pye pyeVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = p6dVar;
        this.l = clzVar;
        this.m = pyeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        clz clzVar = this.l;
        gmq gmqVar = this.k;
        bnn0 bnn0Var = this.m;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new zpe(gmqVar, clzVar, (fob) bnn0Var, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new zpe(gmqVar, clzVar, (wib) bnn0Var, yjeVar);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new zpe((xae0) gmqVar, clzVar, (ywe) bnn0Var, yjeVar);
            case 3:
                lkz lkzVar4 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (ywe) bnn0Var, yjeVar, (byte) 0);
            case 4:
                lkz lkzVar5 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (ywe) bnn0Var, yjeVar, (char) 0);
            case 5:
                lkz lkzVar6 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (ywe) bnn0Var, yjeVar, 0);
            case 6:
                lkz lkzVar7 = lkz.f20223a;
                return new zpe((c00) gmqVar, clzVar, (ywe) bnn0Var, yjeVar);
            case 7:
                lkz lkzVar8 = lkz.f20223a;
                return new zpe(gmqVar, clzVar, (ywe) bnn0Var, yjeVar);
            case 8:
                lkz lkzVar9 = lkz.f20223a;
                return new zpe(this.k, this.l, (ywe) bnn0Var, yjeVar, (byte) 0);
            case 9:
                lkz lkzVar10 = lkz.f20223a;
                return new zpe((vae0) gmqVar, clzVar, (wib) bnn0Var, yjeVar);
            case 10:
                lkz lkzVar11 = lkz.f20223a;
                return new zpe((xae0) gmqVar, clzVar, (pye) bnn0Var, yjeVar);
            case 11:
                lkz lkzVar12 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (pye) bnn0Var, yjeVar, (byte) 0);
            case 12:
                lkz lkzVar13 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (pye) bnn0Var, yjeVar, (char) 0);
            case 13:
                lkz lkzVar14 = lkz.f20223a;
                return new zpe((p6d) gmqVar, clzVar, (pye) bnn0Var, yjeVar);
            case 14:
                lkz lkzVar15 = lkz.f20223a;
                return new zpe(gmqVar, clzVar, (pye) bnn0Var, yjeVar);
            case 15:
                lkz lkzVar16 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (pye) bnn0Var, yjeVar, 0);
            case 16:
                lkz lkzVar17 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (pye) bnn0Var, yjeVar, (short) 0);
            case 17:
                lkz lkzVar18 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (pye) bnn0Var, yjeVar, (byte) 0, false);
            case 18:
                lkz lkzVar19 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (pye) bnn0Var, yjeVar, (byte) 0, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar20 = lkz.f20223a;
                return new zpe((xae0) gmqVar, clzVar, (wye) bnn0Var, yjeVar);
            case 20:
                lkz lkzVar21 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (wye) bnn0Var, yjeVar, (byte) 0);
            case 21:
                lkz lkzVar22 = lkz.f20223a;
                return new zpe(gmqVar, clzVar, (wye) bnn0Var, yjeVar);
            case 22:
                lkz lkzVar23 = lkz.f20223a;
                return new zpe((xae0) gmqVar, clzVar, (igb) bnn0Var, yjeVar);
            case 23:
                lkz lkzVar24 = lkz.f20223a;
                return new zpe((ye20) gmqVar, clzVar, (fob) bnn0Var, yjeVar);
            case 24:
                lkz lkzVar25 = lkz.f20223a;
                return new zpe((xae0) gmqVar, clzVar, (dze) bnn0Var, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar26 = lkz.f20223a;
                return new zpe((vae0) gmqVar, clzVar, (eze) bnn0Var, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar27 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (dze) bnn0Var, yjeVar, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar28 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (dze) bnn0Var, yjeVar, (char) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar29 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (dze) bnn0Var, yjeVar, 0);
            default:
                lkz lkzVar30 = lkz.f20223a;
                return new zpe((xae0) gmqVar, this.l, (dze) bnn0Var, yjeVar, (short) 0);
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
        return ((zpe) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        bnn0 bnn0Var = this.m;
        clz clzVar = this.l;
        gmq gmqVar = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B(gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar = new c7e((fob) bnn0Var, (byte) 17);
                    this.j = true;
                    if (bq9VarB.c(c7eVar, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B(gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar2 = new c7e((wib) bnn0Var, (byte) 18);
                    this.j = true;
                    if (bq9VarB2.c(c7eVar2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar3 = new c7e((ywe) bnn0Var, (byte) 19);
                    this.j = true;
                    if (bq9VarB3.c(c7eVar3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar4 = new c7e((ywe) bnn0Var, (byte) 20);
                    this.j = true;
                    if (bq9VarB4.c(c7eVar4, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar5 = new c7e((ywe) bnn0Var, (byte) 21);
                    this.j = true;
                    if (bq9VarB5.c(c7eVar5, this) == wneVar5) {
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
                    bq9 bq9VarB6 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar6 = new c7e((ywe) bnn0Var, (byte) 22);
                    this.j = true;
                    if (bq9VarB6.c(c7eVar6, this) == wneVar6) {
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
                    bq9 bq9VarB7 = hkb.B((c00) gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar7 = new c7e((ywe) bnn0Var, (byte) 23);
                    this.j = true;
                    if (bq9VarB7.c(c7eVar7, this) == wneVar7) {
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
                    bq9 bq9VarB8 = hkb.B(gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar8 = new c7e((ywe) bnn0Var, (byte) 24);
                    this.j = true;
                    if (bq9VarB8.c(c7eVar8, this) == wneVar8) {
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
                    bq9 bq9VarB9 = hkb.B(gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar9 = new c7e((ywe) bnn0Var, (byte) 25);
                    this.j = true;
                    if (bq9VarB9.c(c7eVar9, this) == wneVar9) {
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
                    bq9 bq9VarB10 = hkb.B((vae0) gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar10 = new c7e((wib) bnn0Var, (byte) 26);
                    this.j = true;
                    if (bq9VarB10.c(c7eVar10, this) == wneVar10) {
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
                    bq9 bq9VarB11 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar11 = new c7e((pye) bnn0Var, (byte) 27);
                    this.j = true;
                    if (bq9VarB11.c(c7eVar11, this) == wneVar11) {
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
                    bq9 bq9VarB12 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar12 = new c7e((pye) bnn0Var, (byte) 28);
                    this.j = true;
                    if (bq9VarB12.c(c7eVar12, this) == wneVar12) {
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
                    bq9 bq9VarB13 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    c7e c7eVar13 = new c7e((pye) bnn0Var, (byte) 29);
                    this.j = true;
                    if (bq9VarB13.c(c7eVar13, this) == wneVar13) {
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
                    bq9 bq9VarB14 = hkb.B((p6d) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar = new qye((pye) bnn0Var, (byte) 0);
                    this.j = true;
                    if (bq9VarB14.c(qyeVar, this) == wneVar14) {
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
                    bq9 bq9VarB15 = hkb.B(gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar2 = new qye((pye) bnn0Var, b2);
                    this.j = true;
                    if (bq9VarB15.c(qyeVar2, this) == wneVar15) {
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
                    bq9 bq9VarB16 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar3 = new qye((pye) bnn0Var, (byte) 2);
                    this.j = true;
                    if (bq9VarB16.c(qyeVar3, this) == wneVar16) {
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
                    bq9 bq9VarB17 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar4 = new qye((pye) bnn0Var, (byte) 3);
                    this.j = true;
                    if (bq9VarB17.c(qyeVar4, this) == wneVar17) {
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
                    bq9 bq9VarB18 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar5 = new qye((pye) bnn0Var, (byte) 4);
                    this.j = true;
                    if (bq9VarB18.c(qyeVar5, this) == wneVar18) {
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
                    bq9 bq9VarB19 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar6 = new qye((pye) bnn0Var, (byte) 5);
                    this.j = true;
                    if (bq9VarB19.c(qyeVar6, this) == wneVar19) {
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
                    bq9 bq9VarB20 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar7 = new qye((wye) bnn0Var, (byte) 6);
                    this.j = true;
                    if (bq9VarB20.c(qyeVar7, this) == wneVar20) {
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
                    bq9 bq9VarB21 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar8 = new qye((wye) bnn0Var, (byte) 7);
                    this.j = true;
                    if (bq9VarB21.c(qyeVar8, this) == wneVar21) {
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
                    bq9 bq9VarB22 = hkb.B(gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar9 = new qye((wye) bnn0Var, (byte) 8);
                    this.j = true;
                    if (bq9VarB22.c(qyeVar9, this) == wneVar22) {
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
                    bq9 bq9VarB23 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar10 = new qye((igb) bnn0Var, (byte) 9);
                    this.j = true;
                    if (bq9VarB23.c(qyeVar10, this) == wneVar23) {
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
                    bq9 bq9VarB24 = hkb.B((ye20) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar11 = new qye((fob) bnn0Var, (byte) 10);
                    this.j = true;
                    if (bq9VarB24.c(qyeVar11, this) == wneVar24) {
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
                    bq9 bq9VarB25 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar12 = new qye((dze) bnn0Var, (byte) 11);
                    this.j = true;
                    if (bq9VarB25.c(qyeVar12, this) == wneVar25) {
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
                    bq9 bq9VarB26 = hkb.B((vae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar13 = new qye((eze) bnn0Var, (byte) 12);
                    this.j = true;
                    if (bq9VarB26.c(qyeVar13, this) == wneVar26) {
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
                    bq9 bq9VarB27 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar14 = new qye((dze) bnn0Var, (byte) 13);
                    this.j = true;
                    if (bq9VarB27.c(qyeVar14, this) == wneVar27) {
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
                    bq9 bq9VarB28 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar15 = new qye((dze) bnn0Var, (byte) 14);
                    this.j = true;
                    if (bq9VarB28.c(qyeVar15, this) == wneVar28) {
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
                    bq9 bq9VarB29 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar16 = new qye((dze) bnn0Var, (byte) 15);
                    this.j = true;
                    if (bq9VarB29.c(qyeVar16, this) == wneVar29) {
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
                    bq9 bq9VarB30 = hkb.B((xae0) gmqVar, clzVar.x(), lkz.d);
                    qye qyeVar17 = new qye((dze) bnn0Var, (byte) 16);
                    this.j = true;
                    if (bq9VarB30.c(qyeVar17, this) == wneVar30) {
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
    public zpe(c00 c00Var, clz clzVar, ywe yweVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = c00Var;
        this.l = clzVar;
        this.m = yweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(gmq gmqVar, clz clzVar, wib wibVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wibVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(gmq gmqVar, clz clzVar, fob fobVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(gmq gmqVar, clz clzVar, ywe yweVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = yweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(gmq gmqVar, clz clzVar, ywe yweVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = yweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(gmq gmqVar, clz clzVar, pye pyeVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(gmq gmqVar, clz clzVar, wye wyeVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(ye20 ye20Var, clz clzVar, fob fobVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = ye20Var;
        this.l = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(vae0 vae0Var, clz clzVar, wib wibVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = wibVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(vae0 vae0Var, clz clzVar, eze ezeVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = ezeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, igb igbVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = igbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, ywe yweVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = yweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, ywe yweVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = yweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, ywe yweVar, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = yweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, ywe yweVar, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = yweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, pye pyeVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = pyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, pye pyeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = pyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, pye pyeVar, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = pyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, pye pyeVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = pyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, pye pyeVar, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = pyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, pye pyeVar, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = pyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, pye pyeVar, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = pyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, wye wyeVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = wyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, wye wyeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = wyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, dze dzeVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, dze dzeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, dze dzeVar, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, dze dzeVar, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe(xae0 xae0Var, clz clzVar, dze dzeVar, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = dzeVar;
    }
}
