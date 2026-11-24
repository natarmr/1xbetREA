package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class lto0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (b) {
            case 0:
                return new lto0(obj4, obj3, obj2, yjeVar, (byte) 0);
            case 1:
                lkz lkzVar = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (nfj0) obj2, yjeVar);
            case 2:
                lkz lkzVar2 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (nfj0) obj2, yjeVar, (byte) 0);
            case 3:
                lkz lkzVar3 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (nfj0) obj2, yjeVar, (char) 0);
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (nfj0) obj2, yjeVar, 0);
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (nfj0) obj2, yjeVar, (short) 0);
            case 6:
                lkz lkzVar6 = lkz.f20223a;
                return new lto0((xae0) obj4, (clz) obj3, (ssl0) obj2, yjeVar);
            case 7:
                lkz lkzVar7 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (nfj0) obj2, yjeVar, (byte) 0, false);
            case 8:
                lkz lkzVar8 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (nfj0) obj2, yjeVar, (byte) 0, (byte) 0);
            case 9:
                lkz lkzVar9 = lkz.f20223a;
                return new lto0((dnq) obj4, (clz) obj3, (bdl0) obj2, yjeVar);
            case 10:
                lkz lkzVar10 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (bdl0) obj2, yjeVar);
            case 11:
                lkz lkzVar11 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (bdl0) obj2, yjeVar, (byte) 0);
            case 12:
                lkz lkzVar12 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (fup0) obj2, yjeVar);
            case 13:
                lkz lkzVar13 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (fup0) obj2, yjeVar, (byte) 0);
            case 14:
                lkz lkzVar14 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (fup0) obj2, yjeVar, (char) 0);
            case 15:
                lkz lkzVar15 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (bdl0) obj2, yjeVar, (char) 0);
            case 16:
                lkz lkzVar16 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (bdl0) obj2, yjeVar, 0);
            case 17:
                return new lto0(obj4, obj3, obj2, yjeVar, (byte) 17);
            case 18:
                lkz lkzVar17 = lkz.f20223a;
                return new lto0((h2c) obj4, (clz) obj3, (bdl0) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar18 = lkz.f20223a;
                return new lto0((p7m0) obj4, (clz) obj3, (bdl0) obj2, yjeVar);
            case 20:
                lkz lkzVar19 = lkz.f20223a;
                return new lto0((p7m0) obj4, (clz) obj3, (bdl0) obj2, yjeVar, (byte) 0);
            case 21:
                lkz lkzVar20 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (feq0) obj2, yjeVar);
            case 22:
                lkz lkzVar21 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (feq0) obj2, yjeVar, (byte) 0);
            case 23:
                lkz lkzVar22 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (veq0) obj2, yjeVar);
            case 24:
                lkz lkzVar23 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (veq0) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar24 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (veq0) obj2, yjeVar, (char) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar25 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (veq0) obj2, yjeVar, 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar26 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (fup0) obj2, yjeVar, 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar27 = lkz.f20223a;
                return new lto0((i89) obj4, (clz) obj3, (ssl0) obj2, yjeVar);
            default:
                lkz lkzVar28 = lkz.f20223a;
                return new lto0((gmq) obj4, (clz) obj3, (bdl0) obj2, yjeVar, (short) 0);
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
        return ((lto0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 0;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gxt gxtVar = (gxt) obj4;
                    long j = ((dpa0) obj2).c;
                    this.j = true;
                    gxt gxtVar2 = new gxt((vne) gxtVar.l, (pz40) gxtVar.n, (gy40) gxtVar.o, this);
                    gxtVar2.k = (hub0) obj3;
                    gxtVar2.m = j;
                    if (gxtVar2.invokeSuspend(Unit.f46060a) == wneVar) {
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
                    bq9 bq9VarB = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    lpn0 lpn0Var = new lpn0((nfj0) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB.c(lpn0Var, this) == wneVar2) {
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
                    bq9 bq9VarB2 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    lpn0 lpn0Var2 = new lpn0((nfj0) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB2.c(lpn0Var2, this) == wneVar3) {
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
                    bq9 bq9VarB3 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    lpn0 lpn0Var3 = new lpn0((nfj0) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB3.c(lpn0Var3, this) == wneVar4) {
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
                    bq9 bq9VarB4 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    lpn0 lpn0Var4 = new lpn0((nfj0) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB4.c(lpn0Var4, this) == wneVar5) {
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
                    bq9 bq9VarB5 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    lpn0 lpn0Var5 = new lpn0((nfj0) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB5.c(lpn0Var5, this) == wneVar6) {
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
                    bq9 bq9VarB6 = hkb.B((xae0) obj4, ((clz) obj3).x(), lkz.d);
                    lpn0 lpn0Var6 = new lpn0((ssl0) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB6.c(lpn0Var6, this) == wneVar7) {
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
                    bq9 bq9VarB7 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    lpn0 lpn0Var7 = new lpn0((nfj0) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB7.c(lpn0Var7, this) == wneVar8) {
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
                    bq9 bq9VarB8 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    lpn0 lpn0Var8 = new lpn0((nfj0) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB8.c(lpn0Var8, this) == wneVar9) {
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
                    bq9 bq9VarB9 = hkb.B((dnq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var = new xqp0((bdl0) obj2, b2);
                    this.j = true;
                    if (bq9VarB9.c(xqp0Var, this) == wneVar10) {
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
                    bq9 bq9VarB10 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var2 = new xqp0((bdl0) obj2, b3);
                    this.j = true;
                    if (bq9VarB10.c(xqp0Var2, this) == wneVar11) {
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
                    bq9 bq9VarB11 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var3 = new xqp0((bdl0) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB11.c(xqp0Var3, this) == wneVar12) {
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
                    bq9 bq9VarB12 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var4 = new xqp0((fup0) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB12.c(xqp0Var4, this) == wneVar13) {
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
                    bq9 bq9VarB13 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var5 = new xqp0((fup0) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB13.c(xqp0Var5, this) == wneVar14) {
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
                    bq9 bq9VarB14 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var6 = new xqp0((fup0) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB14.c(xqp0Var6, this) == wneVar15) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var7 = new xqp0((bdl0) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB15.c(xqp0Var7, this) == wneVar16) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var8 = new xqp0((bdl0) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB16.c(xqp0Var8, this) == wneVar17) {
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
                List list = (List) obj3;
                cgk0 cgk0Var = (cgk0) obj4;
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    if (cgk0Var.l() > 0 && list.size() > cgk0Var.l()) {
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (((xcz) obj2).f(0, 0, this) == wneVar18) {
                            return wneVar18;
                        }
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                cgk0Var.m(list.size());
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((h2c) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var9 = new xqp0((bdl0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB17.c(xqp0Var9, this) == wneVar19) {
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
                    bq9 bq9VarB18 = hkb.B((p7m0) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var10 = new xqp0((bdl0) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB18.c(xqp0Var10, this) == wneVar20) {
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
                    bq9 bq9VarB19 = hkb.B((p7m0) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var11 = new xqp0((bdl0) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB19.c(xqp0Var11, this) == wneVar21) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var12 = new xqp0((feq0) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB20.c(xqp0Var12, this) == wneVar22) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var13 = new xqp0((feq0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB21.c(xqp0Var13, this) == wneVar23) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var14 = new xqp0((veq0) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB22.c(xqp0Var14, this) == wneVar24) {
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
                    bq9 bq9VarB23 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var15 = new xqp0((veq0) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB23.c(xqp0Var15, this) == wneVar25) {
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
                    bq9 bq9VarB24 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var16 = new xqp0((veq0) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB24.c(xqp0Var16, this) == wneVar26) {
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
                    bq9 bq9VarB25 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var17 = new xqp0((veq0) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB25.c(xqp0Var17, this) == wneVar27) {
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
                    bq9 bq9VarB26 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var18 = new xqp0((fup0) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB26.c(xqp0Var18, this) == wneVar28) {
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
                    bq9 bq9VarB27 = hkb.B((i89) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var19 = new xqp0((ssl0) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB27.c(xqp0Var19, this) == wneVar29) {
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
                    bq9 bq9VarB28 = hkb.B((gmq) obj4, ((clz) obj3).x(), lkz.d);
                    xqp0 xqp0Var20 = new xqp0((bdl0) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB28.c(xqp0Var20, this) == wneVar30) {
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
    public lto0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, ssl0 ssl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(i89 i89Var, clz clzVar, fup0 fup0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(h2c h2cVar, clz clzVar, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = h2cVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, feq0 feq0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = feq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, feq0 feq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = feq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, veq0 veq0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = veq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, veq0 veq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = veq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, veq0 veq0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = veq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(gmq gmqVar, clz clzVar, veq0 veq0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = veq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(dnq dnqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(xae0 xae0Var, clz clzVar, ssl0 ssl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(p7m0 p7m0Var, clz clzVar, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = p7m0Var;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto0(p7m0 p7m0Var, clz clzVar, bdl0 bdl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = p7m0Var;
        this.l = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lto0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
