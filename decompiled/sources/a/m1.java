package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(lj ljVar, clz clzVar, qa qaVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = ljVar;
        this.l = clzVar;
        this.m = qaVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                return new m1(this.k, obj3, obj2, yjeVar, (byte) 0);
            case 1:
                return new m1(this.k, obj3, obj2, yjeVar, (byte) 1);
            case 2:
                return new m1(this.k, obj3, obj2, yjeVar, (byte) 2);
            case 3:
                lkz lkzVar = lkz.f20223a;
                return new m1((a1g) this.k, (l8) obj3, (i8) obj2, yjeVar);
            case 4:
                lkz lkzVar2 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (j8) obj2, yjeVar);
            case 5:
                lkz lkzVar3 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (j8) obj2, yjeVar, (byte) 0);
            case 6:
                return new m1(this.k, obj3, obj2, yjeVar, (byte) 6);
            case 7:
                return new m1(this.k, obj3, obj2, yjeVar, (byte) 7);
            case 8:
                lkz lkzVar4 = lkz.f20223a;
                return new m1((a1g) this.k, (y8) obj3, (i8) obj2, yjeVar);
            case 9:
                lkz lkzVar5 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (x8) obj2, yjeVar);
            case 10:
                lkz lkzVar6 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (x8) obj2, yjeVar, (byte) 0);
            case 11:
                lkz lkzVar7 = lkz.f20223a;
                return new m1((a1g) this.k, (f9) obj3, (i8) obj2, yjeVar);
            case 12:
                lkz lkzVar8 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (e9) obj2, yjeVar);
            case 13:
                lkz lkzVar9 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (e9) obj2, yjeVar, (byte) 0);
            case 14:
                lkz lkzVar10 = lkz.f20223a;
                return new m1((a1g) this.k, (t9) obj3, (i8) obj2, yjeVar);
            case 15:
                lkz lkzVar11 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (s9) obj2, yjeVar);
            case 16:
                lkz lkzVar12 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (s9) obj2, yjeVar, (byte) 0);
            case 17:
                lkz lkzVar13 = lkz.f20223a;
                return new m1((i89) this.k, (clz) obj3, (oc) obj2, yjeVar);
            case 18:
                lkz lkzVar14 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (pa) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar15 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (qa) obj2, yjeVar);
            case 20:
                lkz lkzVar16 = lkz.f20223a;
                return new m1((xae0) this.k, (clz) obj3, (qa) obj2, yjeVar);
            case 21:
                lkz lkzVar17 = lkz.f20223a;
                return new m1((lj) this.k, (clz) obj3, (qa) obj2, yjeVar);
            case 22:
                lkz lkzVar18 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (i8) obj2, yjeVar);
            case 23:
                lkz lkzVar19 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (wu) obj2, yjeVar);
            case 24:
                lkz lkzVar20 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (wu) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                m1 m1Var = new m1((pv) obj3, (Function2) obj2, yjeVar);
                m1Var.k = obj;
                return m1Var;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar21 = lkz.f20223a;
                return new m1((i89) this.k, (clz) obj3, (qa) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar22 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (lz) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar23 = lkz.f20223a;
                return new m1((gmq) this.k, (clz) obj3, (lz) obj2, yjeVar, (byte) 0);
            default:
                lkz lkzVar24 = lkz.f20223a;
                return new m1((dnq) this.k, (clz) obj3, (lz) obj2, yjeVar);
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
        return ((m1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        byte b2 = 0;
        wt30 wt30Var = wt30.f39720a;
        Object obj2 = this.m;
        Object obj3 = this.l;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (((gy40) this.k).a((iub0) obj3, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                nwk nwkVar = (nwk) obj2;
                if (nwkVar != null) {
                    nwkVar.a();
                }
                return Unit.f46060a;
            case 1:
                Function1 function1 = (Function1) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        if (((rno0) this.k).f30798a) {
                            this.j = true;
                            if (d9z.f((d9z) obj3, this) == wneVar2) {
                                return wneVar2;
                            }
                        }
                        return Unit.f46060a;
                    }
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    function1.invoke(wt30Var);
                    return Unit.f46060a;
                } catch (Throwable th) {
                    function1.invoke(wt30Var);
                    throw th;
                }
            case 2:
                Function1 function2 = (Function1) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                try {
                    if (!z3) {
                        z1x.P(obj);
                        if (((sno0) this.k).f32504a) {
                            this.j = true;
                            if (d9z.f((d9z) obj3, this) == wneVar3) {
                                return wneVar3;
                            }
                        }
                        return Unit.f46060a;
                    }
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    function2.invoke(wt30Var);
                    return Unit.f46060a;
                } catch (Throwable th2) {
                    function2.invoke(wt30Var);
                    throw th2;
                }
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((a1g) this.k, ((l8) obj3).u1, lkz.c);
                    h8 h8Var = new h8((i8) obj2, b2);
                    this.j = true;
                    if (bq9VarB.c(h8Var, this) == wneVar4) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var2 = new h8((j8) obj2, b3);
                    this.j = true;
                    if (bq9VarB2.c(h8Var2, this) == wneVar5) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var3 = new h8((j8) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB3.c(h8Var3, this) == wneVar6) {
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
                Function1 function3 = (Function1) obj2;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                try {
                    if (!z7) {
                        z1x.P(obj);
                        if (((tno0) this.k).f34246a) {
                            this.j = true;
                            v0h0 v0h0Var = xcz.y;
                            if (((xcz) obj3).f(0, 0, this) == wneVar7) {
                                return wneVar7;
                            }
                        }
                        return Unit.f46060a;
                    }
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    function3.invoke(wt30Var);
                    return Unit.f46060a;
                } catch (Throwable th3) {
                    function3.invoke(wt30Var);
                    throw th3;
                }
            case 7:
                Function1 function4 = (Function1) obj2;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                try {
                    if (!z8) {
                        z1x.P(obj);
                        if (((uno0) this.k).f35974a) {
                            this.j = true;
                            v0h0 v0h0Var2 = xcz.y;
                            if (((xcz) obj3).f(0, 0, this) == wneVar8) {
                                return wneVar8;
                            }
                        }
                        return Unit.f46060a;
                    }
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    function4.invoke(wt30Var);
                    return Unit.f46060a;
                } catch (Throwable th4) {
                    function4.invoke(wt30Var);
                    throw th4;
                }
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((a1g) this.k, ((y8) obj3).u1, lkz.c);
                    h8 h8Var4 = new h8((i8) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB4.c(h8Var4, this) == wneVar9) {
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
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var5 = new h8((x8) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB5.c(h8Var5, this) == wneVar10) {
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
                    bq9 bq9VarB6 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var6 = new h8((x8) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB6.c(h8Var6, this) == wneVar11) {
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
                    bq9 bq9VarB7 = hkb.B((a1g) this.k, ((f9) obj3).u1, lkz.c);
                    h8 h8Var7 = new h8((i8) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB7.c(h8Var7, this) == wneVar12) {
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
                    bq9 bq9VarB8 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var8 = new h8((e9) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB8.c(h8Var8, this) == wneVar13) {
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
                    bq9 bq9VarB9 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var9 = new h8((e9) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB9.c(h8Var9, this) == wneVar14) {
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
                    bq9 bq9VarB10 = hkb.B((a1g) this.k, ((t9) obj3).u1, lkz.c);
                    h8 h8Var10 = new h8((i8) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB10.c(h8Var10, this) == wneVar15) {
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
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var11 = new h8((s9) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB11.c(h8Var11, this) == wneVar16) {
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
                    bq9 bq9VarB12 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var12 = new h8((s9) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB12.c(h8Var12, this) == wneVar17) {
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
                    bq9 bq9VarB13 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var13 = new h8((oc) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB13.c(h8Var13, this) == wneVar18) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var14 = new h8((pa) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB14.c(h8Var14, this) == wneVar19) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var15 = new h8((qa) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB15.c(h8Var15, this) == wneVar20) {
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
                    bq9 bq9VarB16 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var16 = new h8((qa) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB16.c(h8Var16, this) == wneVar21) {
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
                    bq9 bq9VarB17 = hkb.B((lj) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var17 = new h8((qa) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB17.c(h8Var17, this) == wneVar22) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var18 = new h8((i8) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB18.c(h8Var18, this) == wneVar23) {
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
                    bq9 bq9VarB19 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var19 = new h8((wu) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB19.c(h8Var19, this) == wneVar24) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var20 = new h8((wu) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB20.c(h8Var20, this) == wneVar25) {
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
                vne vneVar = (vne) this.k;
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    p7m0 p7m0Var = ((pv) obj3).o;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, jv.a((jv) value, true, null, null, false, false, null, 62)));
                    this.k = null;
                    this.j = true;
                    if (((Function2) obj2).invoke(vneVar, this) == wneVar26) {
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
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var21 = new h8((qa) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB21.c(h8Var21, this) == wneVar27) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var22 = new h8((lz) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB22.c(h8Var22, this) == wneVar28) {
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
                    bq9 bq9VarB23 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var23 = new h8((lz) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB23.c(h8Var23, this) == wneVar29) {
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
                    bq9 bq9VarB24 = hkb.B((dnq) this.k, ((clz) obj3).x(), lkz.d);
                    h8 h8Var24 = new h8((lz) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB24.c(h8Var24, this) == wneVar30) {
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
    public m1(pv pvVar, Function2 function2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        this.l = pvVar;
        this.m = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(i89 i89Var, clz clzVar, qa qaVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = qaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(a1g a1gVar, l8 l8Var, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = a1gVar;
        this.l = l8Var;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(a1g a1gVar, y8 y8Var, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = a1gVar;
        this.l = y8Var;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(a1g a1gVar, f9 f9Var, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = a1gVar;
        this.l = f9Var;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(a1g a1gVar, t9 t9Var, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = a1gVar;
        this.l = t9Var;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, j8 j8Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = j8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, j8 j8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = j8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, x8 x8Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = x8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, x8 x8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = x8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, e9 e9Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = e9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, e9 e9Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = e9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, s9 s9Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = s9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, s9 s9Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = s9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, pa paVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = paVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, qa qaVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = qaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, wu wuVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, wu wuVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, lz lzVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = lzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gmq gmqVar, clz clzVar, lz lzVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = lzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(dnq dnqVar, clz clzVar, lz lzVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = lzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(xae0 xae0Var, clz clzVar, qa qaVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = qaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
