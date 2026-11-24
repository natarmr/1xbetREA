package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.feature.online_call.impl.service.OnlineCallService;

/* JADX INFO: loaded from: classes3.dex */
public final class zm70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                itb itbVar = (itb) this.l;
                clz clzVar = (clz) this.k;
                lkz lkzVar = lkz.f20223a;
                return new zm70(itbVar, clzVar, (an70) obj2, yjeVar);
            case 1:
                gmq gmqVar = (gmq) this.l;
                clz clzVar2 = (clz) this.k;
                lkz lkzVar2 = lkz.f20223a;
                return new zm70(gmqVar, clzVar2, (an70) obj2, yjeVar);
            case 2:
                gmq gmqVar2 = (gmq) this.l;
                clz clzVar3 = (clz) this.k;
                lkz lkzVar3 = lkz.f20223a;
                return new zm70(gmqVar2, clzVar3, (an70) obj2, yjeVar, (byte) 0);
            case 3:
                gmq gmqVar3 = (gmq) this.l;
                clz clzVar4 = (clz) this.k;
                lkz lkzVar4 = lkz.f20223a;
                return new zm70(gmqVar3, clzVar4, (an70) obj2, yjeVar, (char) 0);
            case 4:
                gmq gmqVar4 = (gmq) this.l;
                clz clzVar5 = (clz) this.k;
                lkz lkzVar5 = lkz.f20223a;
                return new zm70(gmqVar4, clzVar5, (an70) obj2, yjeVar, 0);
            case 5:
                i89 i89Var = (i89) this.l;
                clz clzVar6 = (clz) this.k;
                lkz lkzVar6 = lkz.f20223a;
                return new zm70(i89Var, clzVar6, (gq50) obj2, yjeVar);
            case 6:
                i89 i89Var2 = (i89) this.l;
                clz clzVar7 = (clz) this.k;
                lkz lkzVar7 = lkz.f20223a;
                return new zm70(i89Var2, clzVar7, (gq50) obj2, yjeVar, (byte) 0);
            case 7:
                i89 i89Var3 = (i89) this.l;
                OnlineCallService onlineCallService = (OnlineCallService) this.k;
                lkz lkzVar8 = lkz.f20223a;
                return new zm70(i89Var3, onlineCallService, (gq50) obj2, yjeVar);
            case 8:
                zm70 zm70Var = new zm70(this.k, obj2, yjeVar, (byte) 8);
                zm70Var.l = obj;
                return zm70Var;
            case 9:
                i89 i89Var4 = (i89) this.l;
                clz clzVar8 = (clz) this.k;
                lkz lkzVar9 = lkz.f20223a;
                return new zm70(i89Var4, clzVar8, (gq50) obj2, yjeVar, (char) 0);
            case 10:
                zm70 zm70Var2 = new zm70(this.k, obj2, yjeVar, (byte) 10);
                zm70Var2.l = obj;
                return zm70Var2;
            case 11:
                m430 m430Var = (m430) this.l;
                clz clzVar9 = (clz) this.k;
                lkz lkzVar10 = lkz.f20223a;
                return new zm70(m430Var, clzVar9, (hi70) obj2, yjeVar);
            case 12:
                wk30 wk30Var = (wk30) this.l;
                clz clzVar10 = (clz) this.k;
                lkz lkzVar11 = lkz.f20223a;
                return new zm70(wk30Var, clzVar10, (hi70) obj2, yjeVar);
            case 13:
                zm70 zm70Var3 = new zm70(this.k, obj2, yjeVar, (byte) 13);
                zm70Var3.l = obj;
                return zm70Var3;
            case 14:
                utb utbVar = (utb) this.l;
                kc80 kc80Var = (kc80) this.k;
                lkz lkzVar12 = lkz.f20223a;
                return new zm70(utbVar, kc80Var, (hi70) obj2, yjeVar);
            case 15:
                gmq gmqVar5 = (gmq) this.l;
                xc80 xc80Var = (xc80) this.k;
                lkz lkzVar13 = lkz.f20223a;
                return new zm70(gmqVar5, xc80Var, (hi70) obj2, yjeVar);
            case 16:
                zm70 zm70Var4 = new zm70(this.k, obj2, yjeVar, (byte) 16);
                zm70Var4.l = obj;
                return zm70Var4;
            case 17:
                return new zm70((sd60) obj2, yjeVar);
            case 18:
                i89 i89Var5 = (i89) this.l;
                clz clzVar11 = (clz) this.k;
                lkz lkzVar14 = lkz.f20223a;
                return new zm70(i89Var5, clzVar11, (gq50) obj2, yjeVar, 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i89 i89Var6 = (i89) this.l;
                clz clzVar12 = (clz) this.k;
                lkz lkzVar15 = lkz.f20223a;
                return new zm70(i89Var6, clzVar12, (gq50) obj2, yjeVar, (short) 0);
            case 20:
                i89 i89Var7 = (i89) this.l;
                clz clzVar13 = (clz) this.k;
                lkz lkzVar16 = lkz.f20223a;
                return new zm70(i89Var7, clzVar13, (gq50) obj2, yjeVar, (byte) 0, false);
            case 21:
                gmq gmqVar6 = (gmq) this.l;
                clz clzVar14 = (clz) this.k;
                lkz lkzVar17 = lkz.f20223a;
                return new zm70(gmqVar6, clzVar14, (org.xplatform.security.impl.presentation.password.change.input_password.a) obj2, yjeVar);
            case 22:
                gmq gmqVar7 = (gmq) this.l;
                clz clzVar15 = (clz) this.k;
                lkz lkzVar18 = lkz.f20223a;
                return new zm70(gmqVar7, clzVar15, (vz80) obj2, yjeVar);
            case 23:
                gmq gmqVar8 = (gmq) this.l;
                clz clzVar16 = (clz) this.k;
                lkz lkzVar19 = lkz.f20223a;
                return new zm70(gmqVar8, clzVar16, (vz80) obj2, yjeVar, (byte) 0);
            case 24:
                gmq gmqVar9 = (gmq) this.l;
                clz clzVar17 = (clz) this.k;
                lkz lkzVar20 = lkz.f20223a;
                return new zm70(gmqVar9, clzVar17, (s980) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                zm70 zm70Var5 = new zm70(this.k, obj2, yjeVar, (byte) 25);
                zm70Var5.l = obj;
                return zm70Var5;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gmq gmqVar10 = (gmq) this.l;
                clz clzVar18 = (clz) this.k;
                lkz lkzVar21 = lkz.f20223a;
                return new zm70(gmqVar10, clzVar18, (x090) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                dnq dnqVar = (dnq) this.l;
                clz clzVar19 = (clz) this.k;
                lkz lkzVar22 = lkz.f20223a;
                return new zm70(dnqVar, clzVar19, (x090) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                xae0 xae0Var = (xae0) this.l;
                clz clzVar20 = (clz) this.k;
                lkz lkzVar23 = lkz.f20223a;
                return new zm70(xae0Var, clzVar20, (y090) obj2, yjeVar);
            default:
                xae0 xae0Var2 = (xae0) this.l;
                clz clzVar21 = (clz) this.k;
                lkz lkzVar24 = lkz.f20223a;
                return new zm70(xae0Var2, clzVar21, (y090) obj2, yjeVar, (byte) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((zm70) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((zm70) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((zm70) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((zm70) create((ynb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zm70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        char c;
        gmq gmqVarG;
        Object value;
        k050 k050Var;
        sd60 sd60Var;
        Object objB;
        byte b = this.i;
        byte b2 = 20;
        byte b3 = 2;
        byte b4 = 9;
        Object obj2 = this.m;
        byte b5 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var = new lh70((an70) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB.c(lh70Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var2 = new lh70((an70) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB2.c(lh70Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var3 = new lh70((an70) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB3.c(lh70Var3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var4 = new lh70((an70) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB4.c(lh70Var4, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var5 = new lh70((an70) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB5.c(lh70Var5, this) == wneVar5) {
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
                    bq9 bq9VarB6 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var6 = new lh70((gq50) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB6.c(lh70Var6, this) == wneVar6) {
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
                    bq9 bq9VarB7 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var7 = new lh70((gq50) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB7.c(lh70Var7, this) == wneVar7) {
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
                    bq9 bq9VarB8 = hkb.B((i89) this.l, (glz) ((OnlineCallService) this.k).f22014a.f5196a, lkz.d);
                    lh70 lh70Var8 = new lh70((gq50) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB8.c(lh70Var8, this) == wneVar8) {
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
                qgd qgdVar = (qgd) this.k;
                kmq kmqVar = (kmq) this.l;
                Object obj3 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    ts4 ts4Var = (ts4) ((nmt0) qgdVar.h).f23789a;
                    if (ts4Var.d.b.length() == 0) {
                        p7m0 p7m0Var = ts4Var.l.f30868a;
                        do {
                            value = p7m0Var.getValue();
                            ((Number) value).longValue();
                        } while (!p7m0Var.m(value, -1L));
                    }
                    yje yjeVar = null;
                    if (qgdVar.r()) {
                        qgdVar.O();
                        throw null;
                    }
                    myb mybVar = (myb) qgdVar.c;
                    ckk0 ckk0Var = (ckk0) obj2;
                    String strR = kotlin.text.c.r(((ntu) qgdVar.b).a(), "https", "wss", false);
                    ts4 ts4Var2 = mybVar.f22595a;
                    switch (ckk0Var.ordinal()) {
                        case 0:
                        case 5:
                            c = 0;
                            gmqVarG = ts4Var2.g(ckk0Var, "", strR);
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                            c = 0;
                            gmqVarG = new vsg0(new ic1((Object) ts4Var2, (Object) ckk0Var, (Object) strR, yjeVar, (byte) 4));
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                    vsg0 vsg0Var = new vsg0(new er60(qgdVar, yjeVar, b4));
                    xpp xppVar = new xpp(qgdVar, kmqVar, (yje) null);
                    this.l = null;
                    this.j = true;
                    gmq[] gmqVarArr = new gmq[2];
                    gmqVarArr[c] = gmqVarG;
                    gmqVarArr[1] = vsg0Var;
                    Object objG = tdc.G(this, h660.f12515a, new kh1((Object) xppVar, yjeVar, b4), pul.j, gmqVarArr);
                    Object obj4 = wne.f39444a;
                    if (objG != obj4) {
                        objG = Unit.f46060a;
                    }
                    if (objG != obj4) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj3) {
                        return obj3;
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
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var9 = new lh70((gq50) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB9.c(lh70Var9, this) == wneVar9) {
                        return wneVar9;
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
                e7a e7aVar = (e7a) this.l;
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    if (e7aVar != null) {
                        if (e7aVar instanceof c7a) {
                            wmq wmqVar = (wmq) this.k;
                            this.l = null;
                            this.j = true;
                            if (wmqVar.invoke(e7aVar, this) == wneVar10) {
                                return wneVar10;
                            }
                        } else if (e7aVar instanceof d7a) {
                            ((d880) obj2).invoke(e7aVar);
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z11) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
            case 11:
                wne wneVar11 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((m430) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var10 = new lh70((hi70) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB10.c(lh70Var10, this) == wneVar11) {
                        return wneVar11;
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
                wne wneVar12 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((wk30) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var11 = new lh70((hi70) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB11.c(lh70Var11, this) == wneVar12) {
                        return wneVar12;
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
                e7a e7aVar2 = (e7a) this.l;
                wne wneVar13 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    if (e7aVar2 != null) {
                        if (e7aVar2 instanceof c7a) {
                            wmq wmqVar2 = (wmq) this.k;
                            this.l = null;
                            this.j = true;
                            if (wmqVar2.invoke(e7aVar2, this) == wneVar13) {
                                return wneVar13;
                            }
                        } else if (e7aVar2 instanceof d7a) {
                            ((k980) obj2).invoke(e7aVar2);
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z14) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
            case 14:
                wne wneVar14 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((utb) this.l, ((kc80) this.k).u1, lkz.c);
                    lh70 lh70Var12 = new lh70((hi70) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB12.c(lh70Var12, this) == wneVar14) {
                        return wneVar14;
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
                wne wneVar15 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.l, ((xc80) this.k).u1, lkz.d);
                    lh70 lh70Var13 = new lh70((hi70) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB13.c(lh70Var13, this) == wneVar15) {
                        return wneVar15;
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
                wne wneVar16 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    vne vneVar = (vne) this.l;
                    itb itbVarK = xkb.K((q99) this.k);
                    r980 r980Var = new r980((qi80) obj2, vneVar, b3);
                    this.j = true;
                    if (itbVarK.c(r980Var, this) == wneVar16) {
                        return wneVar16;
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
                wne wneVar17 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    sd60 sd60Var2 = (sd60) obj2;
                    k050Var = (k050) sd60Var2.g;
                    this.l = k050Var;
                    this.k = sd60Var2;
                    this.j = true;
                    if (k050Var.d(this) == wneVar17) {
                        return wneVar17;
                    }
                    sd60Var = sd60Var2;
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sd60Var = (sd60) this.k;
                    k050 k050Var2 = (k050) this.l;
                    z1x.P(obj);
                    k050Var = k050Var2;
                }
                try {
                    bby bbyVar = (bby) sd60Var.i;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    sd60Var.i = null;
                    return Unit.f46060a;
                } finally {
                    k050Var.c(null);
                }
            case 18:
                wne wneVar18 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var = new mi80((gq50) obj2, b5);
                    this.j = true;
                    if (bq9VarB14.c(mi80Var, this) == wneVar18) {
                        return wneVar18;
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
                wne wneVar19 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var2 = new mi80((gq50) obj2, b3);
                    this.j = true;
                    if (bq9VarB15.c(mi80Var2, this) == wneVar19) {
                        return wneVar19;
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
                wne wneVar20 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var3 = new mi80((gq50) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB16.c(mi80Var3, this) == wneVar20) {
                        return wneVar20;
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
                wne wneVar21 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var4 = new mi80((org.xplatform.security.impl.presentation.password.change.input_password.a) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB17.c(mi80Var4, this) == wneVar21) {
                        return wneVar21;
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
                wne wneVar22 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var5 = new mi80((vz80) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB18.c(mi80Var5, this) == wneVar22) {
                        return wneVar22;
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
                wne wneVar23 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var6 = new mi80((vz80) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB19.c(mi80Var6, this) == wneVar23) {
                        return wneVar23;
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
                wne wneVar24 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var7 = new mi80((s980) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB20.c(mi80Var7, this) == wneVar24) {
                        return wneVar24;
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
                String str = (String) obj2;
                org.xplatform.security.impl.presentation.password.change.input_password.f fVar = (org.xplatform.security.impl.presentation.password.change.input_password.f) this.k;
                ynb0 ynb0Var = (ynb0) this.l;
                wne wneVar25 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    e0c e0cVar = fVar.i;
                    this.l = null;
                    this.j = true;
                    objB = e0cVar.b(this, ynb0Var, str);
                    if (objB == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                fVar.c.d(new jl40(fVar, str, (f0c) objB, b2));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar26 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var8 = new mi80((x090) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB21.c(mi80Var8, this) == wneVar26) {
                        return wneVar26;
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
                wne wneVar27 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((dnq) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var9 = new mi80((x090) obj2, b4);
                    this.j = true;
                    if (bq9VarB22.c(mi80Var9, this) == wneVar27) {
                        return wneVar27;
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
                wne wneVar28 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB23 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var10 = new mi80((y090) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB23.c(mi80Var10, this) == wneVar28) {
                        return wneVar28;
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
                wne wneVar29 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    bq9 bq9VarB24 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    mi80 mi80Var11 = new mi80((y090) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB24.c(mi80Var11, this) == wneVar29) {
                        return wneVar29;
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
    public zm70(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(i89 i89Var, OnlineCallService onlineCallService, gq50 gq50Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = onlineCallService;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(itb itbVar, clz clzVar, an70 an70Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = an70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(utb utbVar, kc80 kc80Var, hi70 hi70Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.l = utbVar;
        this.k = kc80Var;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, clz clzVar, an70 an70Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = an70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, clz clzVar, an70 an70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = an70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, clz clzVar, an70 an70Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = an70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, clz clzVar, an70 an70Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = an70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, clz clzVar, s980 s980Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = s980Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, clz clzVar, vz80 vz80Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = vz80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, clz clzVar, vz80 vz80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = vz80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, clz clzVar, x090 x090Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = x090Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, clz clzVar, org.xplatform.security.impl.presentation.password.change.input_password.a aVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(gmq gmqVar, xc80 xc80Var, hi70 hi70Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = xc80Var;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(dnq dnqVar, clz clzVar, x090 x090Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = x090Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(m430 m430Var, clz clzVar, hi70 hi70Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.l = m430Var;
        this.k = clzVar;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(wk30 wk30Var, clz clzVar, hi70 hi70Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.l = wk30Var;
        this.k = clzVar;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(sd60 sd60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        this.m = sd60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(xae0 xae0Var, clz clzVar, y090 y090Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = y090Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm70(xae0 xae0Var, clz clzVar, y090 y090Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = y090Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zm70(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = obj2;
    }
}
