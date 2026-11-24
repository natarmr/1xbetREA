package a;

import android.app.Activity;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class npu0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(i89 i89Var, clz clzVar, fau0 fau0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fau0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new npu0((i89) this.k, (clz) obj3, (fau0) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new npu0((utb) this.k, (xru0) obj3, (k5r0) obj2, yjeVar);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new npu0((gmq) this.k, (hsu0) obj3, (k5r0) obj2, yjeVar);
            case 3:
                lkz lkzVar4 = lkz.f20223a;
                return new npu0((i89) this.k, (clz) obj3, (fau0) obj2, yjeVar, (byte) 0);
            case 4:
                lkz lkzVar5 = lkz.f20223a;
                return new npu0((i89) this.k, (clz) obj3, (fau0) obj2, yjeVar, (char) 0);
            case 5:
                lkz lkzVar6 = lkz.f20223a;
                return new npu0((i89) this.k, (clz) obj3, (rtq0) obj2, yjeVar);
            case 6:
                lkz lkzVar7 = lkz.f20223a;
                return new npu0((gmq) this.k, (clz) obj3, (wup0) obj2, yjeVar);
            case 7:
                lkz lkzVar8 = lkz.f20223a;
                return new npu0((gmq) this.k, (clz) obj3, (k5r0) obj2, yjeVar);
            case 8:
                lkz lkzVar9 = lkz.f20223a;
                return new npu0((gmq) this.k, (clz) obj3, (k5r0) obj2, yjeVar, (byte) 0);
            case 9:
                lkz lkzVar10 = lkz.f20223a;
                return new npu0((gmq) this.k, (clz) obj3, (k5r0) obj2, yjeVar, (char) 0);
            case 10:
                lkz lkzVar11 = lkz.f20223a;
                return new npu0((gmq) this.k, (clz) obj3, (rtq0) obj2, yjeVar);
            case 11:
                lkz lkzVar12 = lkz.f20223a;
                return new npu0((xae0) this.k, (clz) obj3, (rtq0) obj2, yjeVar);
            case 12:
                lkz lkzVar13 = lkz.f20223a;
                return new npu0((gmq) this.k, (clz) obj3, (k5r0) obj2, yjeVar, 0);
            case 13:
                lkz lkzVar14 = lkz.f20223a;
                return new npu0((gmq) this.k, (clz) obj3, (k6v0) obj2, yjeVar);
            case 14:
                lkz lkzVar15 = lkz.f20223a;
                return new npu0((gmq) this.k, (clz) obj3, (k6v0) obj2, yjeVar, (byte) 0);
            case 15:
                lkz lkzVar16 = lkz.f20223a;
                return new npu0((gmq) this.k, (clz) obj3, (k6v0) obj2, yjeVar, (char) 0);
            case 16:
                lkz lkzVar17 = lkz.f20223a;
                return new npu0((i89) this.k, (clz) obj3, (fau0) obj2, yjeVar, 0);
            case 17:
                return new npu0(this.k, obj3, obj2, yjeVar, (byte) 17);
            case 18:
                npu0 npu0Var = new npu0((w4p0) obj3, (Activity) obj2, yjeVar);
                npu0Var.k = obj;
                return npu0Var;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new npu0(this.k, obj3, obj2, yjeVar, (byte) 19);
            case 20:
                lkz lkzVar18 = lkz.f20223a;
                return new npu0((utb) this.k, (cyv0) obj3, (k5r0) obj2, yjeVar);
            case 21:
                lkz lkzVar19 = lkz.f20223a;
                return new npu0((i89) this.k, (clz) obj3, (fau0) obj2, yjeVar, (short) 0);
            default:
                lkz lkzVar20 = lkz.f20223a;
                return new npu0((gmq) this.k, (wzv0) obj3, (k5r0) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((npu0) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((npu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        byte b2 = 6;
        byte b3 = 7;
        Object obj2 = this.m;
        Object obj3 = this.l;
        byte b4 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    x6s0 x6s0Var = new x6s0((fau0) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB.c(x6s0Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((utb) this.k, ((xru0) obj3).u1, lkz.c);
                    x6s0 x6s0Var2 = new x6s0((k5r0) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB2.c(x6s0Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((hsu0) obj3).u1, lkz.c);
                    x6s0 x6s0Var3 = new x6s0((k5r0) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB3.c(x6s0Var3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var = new owu0((fau0) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB4.c(owu0Var, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var2 = new owu0((fau0) obj2, b4);
                    this.j = true;
                    if (bq9VarB5.c(owu0Var2, this) == wneVar5) {
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
                    bq9 bq9VarB6 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var3 = new owu0((rtq0) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB6.c(owu0Var3, this) == wneVar6) {
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
                    bq9 bq9VarB7 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.c);
                    owu0 owu0Var4 = new owu0((wup0) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB7.c(owu0Var4, this) == wneVar7) {
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
                    bq9 bq9VarB8 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.c);
                    owu0 owu0Var5 = new owu0((k5r0) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB8.c(owu0Var5, this) == wneVar8) {
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
                    bq9 bq9VarB9 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.c);
                    owu0 owu0Var6 = new owu0((k5r0) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB9.c(owu0Var6, this) == wneVar9) {
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
                    bq9 bq9VarB10 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.c);
                    owu0 owu0Var7 = new owu0((k5r0) obj2, b2);
                    this.j = true;
                    if (bq9VarB10.c(owu0Var7, this) == wneVar10) {
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
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var8 = new owu0((rtq0) obj2, b3);
                    this.j = true;
                    if (bq9VarB11.c(owu0Var8, this) == wneVar11) {
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
                    bq9 bq9VarB12 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var9 = new owu0((rtq0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB12.c(owu0Var9, this) == wneVar12) {
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
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var10 = new owu0((k5r0) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB13.c(owu0Var10, this) == wneVar13) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var11 = new owu0((k6v0) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB14.c(owu0Var11, this) == wneVar14) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var12 = new owu0((k6v0) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB15.c(owu0Var12, this) == wneVar15) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var13 = new owu0((k6v0) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB16.c(owu0Var13, this) == wneVar16) {
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
                    bq9 bq9VarB17 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var14 = new owu0((fau0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB17.c(owu0Var14, this) == wneVar17) {
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
                if (z18) {
                    if (z18) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0Var = ((gy40) this.k).f12108a;
                sco0 sco0Var = new sco0((Function0) obj3, (pz40) obj2, b2);
                this.j = true;
                qoj0Var.c(sco0Var, this);
                return wneVar18;
            case 18:
                w4p0 w4p0Var = (w4p0) obj3;
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    hzb0 hzb0Var = (hzb0) this.k;
                    ad3 ad3Var = new ad3(hzb0Var, b2);
                    ((jhv0) w4p0Var.b).a((Activity) obj2, new ew3((byte) 1), ad3Var);
                    ugu0 ugu0Var = new ugu0(w4p0Var, ad3Var, b3);
                    this.j = true;
                    if (q7x.t(hzb0Var, ugu0Var, this) == wneVar19) {
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
                ppv0 ppv0Var = (ppv0) obj3;
                wne wneVar20 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    gmq gmqVarE = ((zas0) this.k).e(ppv0Var);
                    sco0 sco0Var2 = new sco0((ah60) obj2, ppv0Var, b3);
                    this.j = true;
                    if (gmqVarE.c(sco0Var2, this) == wneVar20) {
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
                    bq9 bq9VarB18 = hkb.B((utb) this.k, ((cyv0) obj3).u1, lkz.c);
                    owu0 owu0Var15 = new owu0((k5r0) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB18.c(owu0Var15, this) == wneVar21) {
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
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    owu0 owu0Var16 = new owu0((fau0) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB19.c(owu0Var16, this) == wneVar22) {
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
            default:
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((gmq) this.k, ((wzv0) obj3).u1, lkz.d);
                    owu0 owu0Var17 = new owu0((k5r0) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB20.c(owu0Var17, this) == wneVar23) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(i89 i89Var, clz clzVar, fau0 fau0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fau0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(i89 i89Var, clz clzVar, fau0 fau0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fau0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(i89 i89Var, clz clzVar, fau0 fau0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fau0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(i89 i89Var, clz clzVar, rtq0 rtq0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(i89 i89Var, clz clzVar, fau0 fau0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = fau0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(utb utbVar, xru0 xru0Var, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = utbVar;
        this.l = xru0Var;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(utb utbVar, cyv0 cyv0Var, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = utbVar;
        this.l = cyv0Var;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, clz clzVar, wup0 wup0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wup0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, clz clzVar, rtq0 rtq0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, clz clzVar, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, clz clzVar, k5r0 k5r0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, clz clzVar, k5r0 k5r0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, clz clzVar, k5r0 k5r0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, clz clzVar, k6v0 k6v0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k6v0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, clz clzVar, k6v0 k6v0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k6v0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, clz clzVar, k6v0 k6v0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k6v0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, hsu0 hsu0Var, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = hsu0Var;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(gmq gmqVar, wzv0 wzv0Var, k5r0 k5r0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = wzv0Var;
        this.m = k5r0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(xae0 xae0Var, clz clzVar, rtq0 rtq0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = rtq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npu0(w4p0 w4p0Var, Activity activity, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        this.l = w4p0Var;
        this.m = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npu0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
