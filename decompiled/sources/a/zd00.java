package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zd00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 7;
    public boolean j;
    public final /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new zd00((xae0) this.l, (clz) obj3, (ae00) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (ae00) obj2, yjeVar);
            case 2:
                zd00 zd00Var = new zd00((Function2) obj3, (tu9) obj2, yjeVar);
                zd00Var.l = obj;
                return zd00Var;
            case 3:
                lkz lkzVar3 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (kaw) obj2, yjeVar);
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (pfl) obj2, yjeVar);
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                return new zd00((i89) this.l, (clz) obj3, (e000) obj2, yjeVar);
            case 6:
                lkz lkzVar6 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (kaw) obj2, yjeVar, (byte) 0);
            case 7:
                return new zd00((a1t) this.l, (pkk0) obj3, (wpq) obj2, yjeVar);
            case 8:
                lkz lkzVar7 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (sx00) obj2, yjeVar);
            case 9:
                lkz lkzVar8 = lkz.f20223a;
                return new zd00((i89) this.l, (clz) obj3, (sx00) obj2, yjeVar);
            case 10:
                lkz lkzVar9 = lkz.f20223a;
                return new zd00((i89) this.l, (clz) obj3, (e000) obj2, yjeVar, (byte) 0);
            case 11:
                lkz lkzVar10 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (kaw) obj2, yjeVar, (char) 0);
            case 12:
                lkz lkzVar11 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (q810) obj2, yjeVar);
            case 13:
                lkz lkzVar12 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (q810) obj2, yjeVar, (byte) 0);
            case 14:
                lkz lkzVar13 = lkz.f20223a;
                return new zd00((i89) this.l, (clz) obj3, (e000) obj2, yjeVar, (char) 0);
            case 15:
                lkz lkzVar14 = lkz.f20223a;
                return new zd00((i89) this.l, (clz) obj3, (e000) obj2, yjeVar, 0);
            case 16:
                lkz lkzVar15 = lkz.f20223a;
                return new zd00((i89) this.l, (clz) obj3, (e000) obj2, yjeVar, (short) 0);
            case 17:
                lkz lkzVar16 = lkz.f20223a;
                return new zd00((i89) this.l, (clz) obj3, (e000) obj2, yjeVar, (byte) 0, false);
            case 18:
                lkz lkzVar17 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (jj10) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar18 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (jj10) obj2, yjeVar, (byte) 0);
            case 20:
                lkz lkzVar19 = lkz.f20223a;
                return new zd00((gmq) this.l, (clz) obj3, (jj10) obj2, yjeVar, (char) 0);
            case 21:
                lkz lkzVar20 = lkz.f20223a;
                return new zd00((i89) this.l, (clz) obj3, (e000) obj2, yjeVar, (byte) 0, (byte) 0);
            case 22:
                lkz lkzVar21 = lkz.f20223a;
                return new zd00((xae0) this.l, (clz) obj3, (dm10) obj2, yjeVar);
            case 23:
                lkz lkzVar22 = lkz.f20223a;
                return new zd00((xae0) this.l, (clz) obj3, (o2d) obj2, yjeVar);
            case 24:
                lkz lkzVar23 = lkz.f20223a;
                return new zd00((vsg0) this.l, (clz) obj3, (dm10) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar24 = lkz.f20223a;
                return new zd00((xae0) this.l, (clz) obj3, (dm10) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar25 = lkz.f20223a;
                return new zd00((xae0) this.l, (clz) obj3, (dm10) obj2, yjeVar, (char) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar26 = lkz.f20223a;
                return new zd00((xae0) this.l, (clz) obj3, (dm10) obj2, yjeVar, 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar27 = lkz.f20223a;
                return new zd00((xae0) this.l, (clz) obj3, (dm10) obj2, yjeVar, (short) 0);
            default:
                lkz lkzVar28 = lkz.f20223a;
                return new zd00((xae0) this.l, (clz) obj3, (dm10) obj2, yjeVar, (byte) 0, false);
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
        return ((zd00) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 8;
        Object obj2 = this.m;
        Object obj3 = this.k;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar = new poz((ae00) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB.c(pozVar, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar2 = new poz((ae00) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB2.c(pozVar2, this) == wneVar2) {
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
                tu9 tu9Var = (tu9) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                try {
                    if (!z3) {
                        z1x.P(obj);
                        vne vneVar = (vne) this.l;
                        this.j = true;
                        obj = ((Function2) obj3).invoke(vneVar, this);
                        if (obj == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        if (!z3) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    tu9Var.b(obj);
                    break;
                } catch (CancellationException unused) {
                    tu9Var.c();
                } catch (Throwable th) {
                    tu9Var.d(th);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar3 = new poz((kaw) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB3.c(pozVar3, this) == wneVar4) {
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
                    bq9 bq9VarB4 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar4 = new poz((pfl) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB4.c(pozVar4, this) == wneVar5) {
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
                    bq9 bq9VarB5 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar5 = new poz((e000) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB5.c(pozVar5, this) == wneVar6) {
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
                    bq9 bq9VarB6 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar6 = new poz((kaw) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB6.c(pozVar6, this) == wneVar7) {
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
                    a1t a1tVar = (a1t) this.l;
                    clu cluVar = new clu((pkk0) obj3, (wpq) obj2, b2);
                    this.j = true;
                    if (a1tVar.c(cluVar, this) == wneVar8) {
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
                    bq9 bq9VarB7 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar7 = new poz((sx00) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB7.c(pozVar7, this) == wneVar9) {
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
                    bq9 bq9VarB8 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar8 = new poz((sx00) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB8.c(pozVar8, this) == wneVar10) {
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
                    bq9 bq9VarB9 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar9 = new poz((e000) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB9.c(pozVar9, this) == wneVar11) {
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
                    bq9 bq9VarB10 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar10 = new poz((kaw) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB10.c(pozVar10, this) == wneVar12) {
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
                    bq9 bq9VarB11 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar11 = new poz((q810) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB11.c(pozVar11, this) == wneVar13) {
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
                    bq9 bq9VarB12 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar12 = new poz((q810) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB12.c(pozVar12, this) == wneVar14) {
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
                    bq9 bq9VarB13 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar13 = new poz((e000) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB13.c(pozVar13, this) == wneVar15) {
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
                    bq9 bq9VarB14 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar14 = new poz((e000) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB14.c(pozVar14, this) == wneVar16) {
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
                    bq9 bq9VarB15 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    poz pozVar15 = new poz((e000) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB15.c(pozVar15, this) == wneVar17) {
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
                    bq9 bq9VarB16 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var = new kg10((e000) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB16.c(kg10Var, this) == wneVar18) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var2 = new kg10((jj10) obj2, b3);
                    this.j = true;
                    if (bq9VarB17.c(kg10Var2, this) == wneVar19) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var3 = new kg10((jj10) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB18.c(kg10Var3, this) == wneVar20) {
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
                    bq9 bq9VarB19 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var4 = new kg10((jj10) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB19.c(kg10Var4, this) == wneVar21) {
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
                    bq9 bq9VarB20 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var5 = new kg10((e000) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB20.c(kg10Var5, this) == wneVar22) {
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
                    bq9 bq9VarB21 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var6 = new kg10((dm10) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB21.c(kg10Var6, this) == wneVar23) {
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
                    bq9 bq9VarB22 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var7 = new kg10((o2d) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB22.c(kg10Var7, this) == wneVar24) {
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
                    bq9 bq9VarB23 = hkb.B((vsg0) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var8 = new kg10((dm10) obj2, b2);
                    this.j = true;
                    if (bq9VarB23.c(kg10Var8, this) == wneVar25) {
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
                    bq9 bq9VarB24 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var9 = new kg10((dm10) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB24.c(kg10Var9, this) == wneVar26) {
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
                    bq9 bq9VarB25 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var10 = new kg10((dm10) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB25.c(kg10Var10, this) == wneVar27) {
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
                    bq9 bq9VarB26 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var11 = new kg10((dm10) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB26.c(kg10Var11, this) == wneVar28) {
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
                    bq9 bq9VarB27 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var12 = new kg10((dm10) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB27.c(kg10Var12, this) == wneVar29) {
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
                    bq9 bq9VarB28 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    kg10 kg10Var13 = new kg10((dm10) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB28.c(kg10Var13, this) == wneVar30) {
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
    public zd00(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(i89 i89Var, clz clzVar, e000 e000Var, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = e000Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(i89 i89Var, clz clzVar, sx00 sx00Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = sx00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, kaw kawVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = kawVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, kaw kawVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = kawVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, kaw kawVar, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = kawVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, ae00 ae00Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = ae00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, sx00 sx00Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = sx00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, q810 q810Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = q810Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, q810 q810Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = q810Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, jj10 jj10Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = jj10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, jj10 jj10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = jj10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(gmq gmqVar, clz clzVar, jj10 jj10Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = jj10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(a1t a1tVar, pkk0 pkk0Var, wpq wpqVar, yje yjeVar) {
        super(2, yjeVar);
        this.l = a1tVar;
        this.k = pkk0Var;
        this.m = wpqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(xae0 xae0Var, clz clzVar, o2d o2dVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = o2dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(xae0 xae0Var, clz clzVar, ae00 ae00Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = ae00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(xae0 xae0Var, clz clzVar, dm10 dm10Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dm10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(xae0 xae0Var, clz clzVar, dm10 dm10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dm10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(xae0 xae0Var, clz clzVar, dm10 dm10Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dm10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(xae0 xae0Var, clz clzVar, dm10 dm10Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dm10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(xae0 xae0Var, clz clzVar, dm10 dm10Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dm10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(xae0 xae0Var, clz clzVar, dm10 dm10Var, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dm10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(vsg0 vsg0Var, clz clzVar, dm10 dm10Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = vsg0Var;
        this.k = clzVar;
        this.m = dm10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd00(Function2 function2, tu9 tu9Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = function2;
        this.m = tu9Var;
    }
}
