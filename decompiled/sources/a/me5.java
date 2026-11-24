package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.background_video.impl.presentation.BackgroundVideoService;

/* JADX INFO: loaded from: classes4.dex */
public final class me5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(lr lrVar, clz clzVar, cm3 cm3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = lrVar;
        this.l = clzVar;
        this.m = cm3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new me5((gmq) this.k, (BackgroundVideoService) obj3, (vp3) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (vp3) obj2, yjeVar);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (vp3) obj2, yjeVar);
            case 3:
                lkz lkzVar4 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (vp3) obj2, yjeVar, (byte) 0);
            case 4:
                me5 me5Var = new me5(obj3, obj2, yjeVar, (byte) 4);
                me5Var.k = obj;
                return me5Var;
            case 5:
                me5 me5Var2 = new me5(obj3, obj2, yjeVar, (byte) 5);
                me5Var2.k = obj;
                return me5Var2;
            case 6:
                me5 me5Var3 = new me5(obj3, obj2, yjeVar, (byte) 6);
                me5Var3.k = obj;
                return me5Var3;
            case 7:
                lkz lkzVar5 = lkz.f20223a;
                return new me5((i89) this.k, (clz) obj3, (df2) obj2, yjeVar);
            case 8:
                lkz lkzVar6 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (dj5) obj2, yjeVar);
            case 9:
                lkz lkzVar7 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (qv3) obj2, yjeVar);
            case 10:
                lkz lkzVar8 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (vp3) obj2, yjeVar, (byte) 0);
            case 11:
                lkz lkzVar9 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (vp3) obj2, yjeVar, (char) 0);
            case 12:
                lkz lkzVar10 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (vp3) obj2, yjeVar, 0);
            case 13:
                lkz lkzVar11 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (dj5) obj2, yjeVar);
            case 14:
                lkz lkzVar12 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (dj5) obj2, yjeVar, (byte) 0);
            case 15:
                me5 me5Var4 = new me5(obj3, obj2, yjeVar, (byte) 15);
                me5Var4.k = obj;
                return me5Var4;
            case 16:
                lkz lkzVar13 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (al5) obj2, yjeVar);
            case 17:
                lkz lkzVar14 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (al5) obj2, yjeVar);
            case 18:
                lkz lkzVar15 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (el5) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar16 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (el5) obj2, yjeVar);
            case 20:
                lkz lkzVar17 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (cm3) obj2, yjeVar);
            case 21:
                lkz lkzVar18 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (nl5) obj2, yjeVar);
            case 22:
                lkz lkzVar19 = lkz.f20223a;
                return new me5((xae0) this.k, (clz) obj3, (nl5) obj2, yjeVar);
            case 23:
                me5 me5Var5 = new me5(obj3, obj2, yjeVar, (byte) 23);
                me5Var5.k = obj;
                return me5Var5;
            case 24:
                lkz lkzVar20 = lkz.f20223a;
                return new me5((lr) this.k, (clz) obj3, (cm3) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar21 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (ud6) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar22 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (vd6) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar23 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (ud6) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar24 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (ud6) obj2, yjeVar, (char) 0);
            default:
                lkz lkzVar25 = lkz.f20223a;
                return new me5((gmq) this.k, (clz) obj3, (ud6) obj2, yjeVar, 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((me5) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((me5) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((me5) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((me5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objD;
        byte b = this.i;
        byte b2 = 12;
        byte b3 = 0;
        byte b4 = 27;
        Object obj2 = this.m;
        Object obj3 = this.l;
        byte b5 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, (glz) ((BackgroundVideoService) obj3).f22014a.f5196a, lkz.d);
                    nw4 nw4Var = new nw4((vp3) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB.c(nw4Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var2 = new nw4((vp3) obj2, b2);
                    this.j = true;
                    if (bq9VarB2.c(nw4Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var3 = new nw4((vp3) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB3.c(nw4Var3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var4 = new nw4((vp3) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB4.c(nw4Var4, this) == wneVar4) {
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
                Object obj4 = this.k;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    if (d5c.R((vne) obj3)) {
                        this.k = null;
                        this.j = true;
                        if (((vp3) obj2).invoke(obj4, this) == wneVar5) {
                            return wneVar5;
                        }
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
                Object obj5 = this.k;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    if (d5c.R((vne) obj3)) {
                        this.k = null;
                        this.j = true;
                        if (((df2) obj2).invoke(obj5, this) == wneVar6) {
                            return wneVar6;
                        }
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
                Object obj6 = this.k;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (d5c.R((vne) obj3)) {
                        this.k = null;
                        this.j = true;
                        if (((df2) obj2).invoke(obj6, this) == wneVar7) {
                            return wneVar7;
                        }
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
                    bq9 bq9VarB5 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var5 = new nw4((df2) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB5.c(nw4Var5, this) == wneVar8) {
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
                    bq9 bq9VarB6 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var6 = new nw4((dj5) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB6.c(nw4Var6, this) == wneVar9) {
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
                    bq9 bq9VarB7 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var7 = new nw4((qv3) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB7.c(nw4Var7, this) == wneVar10) {
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
                    bq9 bq9VarB8 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var8 = new nw4((vp3) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB8.c(nw4Var8, this) == wneVar11) {
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
                    bq9 bq9VarB9 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var9 = new nw4((vp3) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB9.c(nw4Var9, this) == wneVar12) {
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
                    bq9 bq9VarB10 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var10 = new nw4((vp3) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB10.c(nw4Var10, this) == wneVar13) {
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
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var11 = new nw4((dj5) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB11.c(nw4Var11, this) == wneVar14) {
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
                    bq9 bq9VarB12 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var12 = new nw4((dj5) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB12.c(nw4Var12, this) == wneVar15) {
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
                dk5 dk5Var = (dk5) obj2;
                vne vneVar = (vne) this.k;
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    el80 el80Var = new el80(30, 10, 60);
                    vae0 vae0VarM = ffb0.M(new sj5(new di80(new m91(new uj5(dk5Var, b3), yjeVar, b2), new dfs0(((ql5) obj3).f28916a, null, null), el80Var).f, dk5Var, (byte) 1), vneVar);
                    vj5 vj5Var = new vj5(dk5Var, yjeVar, b5);
                    this.k = null;
                    this.j = true;
                    if (slb.O(vae0VarM, vj5Var, this) == wneVar16) {
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
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var13 = new nw4((al5) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB13.c(nw4Var13, this) == wneVar17) {
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
                    bq9 bq9VarB14 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var14 = new nw4((al5) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB14.c(nw4Var14, this) == wneVar18) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var15 = new nw4((el5) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB15.c(nw4Var15, this) == wneVar19) {
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
                    bq9 bq9VarB16 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var16 = new nw4((el5) obj2, b4);
                    this.j = true;
                    if (bq9VarB16.c(nw4Var16, this) == wneVar20) {
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
                    bq9 bq9VarB17 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var17 = new nw4((cm3) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB17.c(nw4Var17, this) == wneVar21) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    nw4 nw4Var18 = new nw4((nl5) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB18.c(nw4Var18, this) == wneVar22) {
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
                    bq9 bq9VarB19 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    ml5 ml5Var = new ml5((nl5) obj2, b3);
                    this.j = true;
                    if (bq9VarB19.c(ml5Var, this) == wneVar23) {
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
                vne vneVar2 = (vne) this.k;
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    String name = vneVar2.getClass().getName();
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(10L, bfn.SECONDS);
                    List listJ = q3d.j(SocketException.class, SocketTimeoutException.class, ConnectException.class, UnknownHostException.class, oqt0.class, j7t0.class);
                    y32 y32Var = new y32((rrd) obj3, (tl5) obj2, yjeVar, b4);
                    this.k = null;
                    this.j = true;
                    objD = j0x.D(10, jW0, this, name, listJ, y32Var);
                    if (objD == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD = ((j0g0) obj).f15681a;
                }
                Object obj7 = objD;
                z1x.P(obj7);
                return obj7;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((lr) this.k, ((clz) obj3).x(), lkz.d);
                    ml5 ml5Var2 = new ml5((cm3) obj2, b5);
                    this.j = true;
                    if (bq9VarB20.c(ml5Var2, this) == wneVar25) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ml5 ml5Var3 = new ml5((ud6) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB21.c(ml5Var3, this) == wneVar26) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ml5 ml5Var4 = new ml5((vd6) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB22.c(ml5Var4, this) == wneVar27) {
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
                    bq9 bq9VarB23 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ml5 ml5Var5 = new ml5((ud6) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB23.c(ml5Var5, this) == wneVar28) {
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
                    bq9 bq9VarB24 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ml5 ml5Var6 = new ml5((ud6) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB24.c(ml5Var6, this) == wneVar29) {
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
                    bq9 bq9VarB25 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ml5 ml5Var7 = new ml5((ud6) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB25.c(ml5Var7, this) == wneVar30) {
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
    public me5(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, vp3 vp3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, vp3 vp3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, dj5 dj5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = dj5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, dj5 dj5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = dj5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, al5 al5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = al5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, el5 el5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = el5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, nl5 nl5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nl5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, ud6 ud6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ud6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, ud6 ud6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ud6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, ud6 ud6Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ud6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, ud6 ud6Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ud6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, clz clzVar, vd6 vd6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vd6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(gmq gmqVar, BackgroundVideoService backgroundVideoService, vp3 vp3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = backgroundVideoService;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, cm3 cm3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = cm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, vp3 vp3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, vp3 vp3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, vp3 vp3Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, vp3 vp3Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, qv3 qv3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = qv3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, dj5 dj5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = dj5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, al5 al5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = al5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, el5 el5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = el5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(xae0 xae0Var, clz clzVar, nl5 nl5Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = nl5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me5(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj2;
        this.l = obj;
    }
}
