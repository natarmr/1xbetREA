package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class my7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ t33 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my7(t33 t33Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t33Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new my7(this.k, yjeVar, (byte) 0);
            case 1:
                return new my7(this.k, yjeVar, (byte) 1);
            case 2:
                return new my7(this.k, yjeVar, (byte) 2);
            case 3:
                return new my7(this.k, yjeVar, (byte) 3);
            case 4:
                return new my7(this.k, yjeVar, (byte) 4);
            case 5:
                return new my7(this.k, yjeVar, (byte) 5);
            case 6:
                return new my7(this.k, yjeVar, (byte) 6);
            case 7:
                return new my7(this.k, yjeVar, (byte) 7);
            case 8:
                return new my7(this.k, yjeVar, (byte) 8);
            case 9:
                return new my7(this.k, yjeVar, (byte) 9);
            case 10:
                return new my7(this.k, yjeVar, (byte) 10);
            case 11:
                return new my7(this.k, yjeVar, (byte) 11);
            case 12:
                return new my7(this.k, yjeVar, (byte) 12);
            case 13:
                return new my7(this.k, yjeVar, (byte) 13);
            case 14:
                return new my7(this.k, yjeVar, (byte) 14);
            case 15:
                return new my7(this.k, yjeVar, (byte) 15);
            case 16:
                return new my7(this.k, yjeVar, (byte) 16);
            case 17:
                return new my7(this.k, yjeVar, (byte) 17);
            case 18:
                return new my7(this.k, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new my7(this.k, yjeVar, (byte) 19);
            case 20:
                return new my7(this.k, yjeVar, (byte) 20);
            case 21:
                return new my7(this.k, yjeVar, (byte) 21);
            case 22:
                return new my7(this.k, yjeVar, (byte) 22);
            case 23:
                return new my7(this.k, yjeVar, (byte) 23);
            case 24:
                return new my7(this.k, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new my7(this.k, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new my7(this.k, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new my7(this.k, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new my7(this.k, yjeVar, (byte) 28);
            default:
                return new my7(this.k, yjeVar, (byte) 29);
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
        return ((my7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        t33 t33Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    Float f = new Float(1.0f);
                    j73 j73Var = (j73) ry7.b.getValue();
                    this.j = true;
                    if (t33.a(this.k, f, j73Var, null, null, this, 12) == wneVar) {
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
                    Float f2 = new Float(0.0f);
                    j73 j73Var2 = (j73) ry7.b.getValue();
                    this.j = true;
                    if (t33.a(this.k, f2, j73Var2, null, null, this, 12) == wneVar2) {
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
                    Float f3 = new Float(0.0f);
                    j73 j73Var3 = (j73) ry7.e.getValue();
                    this.j = true;
                    if (t33.a(this.k, f3, j73Var3, null, null, this, 12) == wneVar3) {
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
                    Float f4 = new Float(72.0f);
                    j73 j73Var4 = (j73) ry7.d.getValue();
                    this.j = true;
                    if (t33.a(this.k, f4, j73Var4, null, null, this, 12) == wneVar4) {
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
                    Float f5 = new Float(1.0f);
                    j73 j73Var5 = (j73) ry7.d.getValue();
                    this.j = true;
                    if (t33.a(this.k, f5, j73Var5, null, null, this, 12) == wneVar5) {
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
                    Float f6 = new Float(0.0f);
                    j73 j73Var6 = (j73) ry7.d.getValue();
                    this.j = true;
                    if (t33.a(this.k, f6, j73Var6, null, null, this, 12) == wneVar6) {
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
                    Float f7 = new Float(-6.0f);
                    imy imyVar = new imy();
                    imyVar.f15048a = 1800;
                    Float fValueOf = Float.valueOf(-6.0f);
                    hmy hmyVarA = imyVar.a(Response.BUSY_EVERYWHERE, fValueOf);
                    zsf zsfVar = jz7.f17396a;
                    hmyVarA.b = zsfVar;
                    Float fValueOf2 = Float.valueOf(14.0f);
                    imyVar.a(900, fValueOf2);
                    imyVar.a(1500, fValueOf2).b = zsfVar;
                    imyVar.a(1800, fValueOf);
                    w7x w7xVarB0 = ro4.b0(new jmy(imyVar), null, 0L, 6);
                    this.j = true;
                    if (t33.a(this.k, f7, w7xVarB0, null, null, this, 12) == wneVar7) {
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
                    this.j = true;
                    if (dea.c(t33Var, this) == wneVar8) {
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
                    this.j = true;
                    if (dea.c(t33Var, this) == wneVar9) {
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
                    this.j = true;
                    if (dea.c(t33Var, this) == wneVar10) {
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
                    this.j = true;
                    if (dea.c(t33Var, this) == wneVar11) {
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
                    this.j = true;
                    if (dea.c(t33Var, this) == wneVar12) {
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
                    this.j = true;
                    if (dea.c(t33Var, this) == wneVar13) {
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
                    if (dea.c(t33Var, this) == wneVar14) {
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
                    this.j = true;
                    if (dea.c(t33Var, this) == wneVar15) {
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
                    Float f8 = new Float(1.0f);
                    uts0 uts0VarM0 = ro4.m0(300, 0, ihn.d, 2);
                    this.j = true;
                    if (t33.a(this.k, f8, uts0VarM0, null, null, this, 12) == wneVar16) {
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
                    Float f9 = new Float(0.0f);
                    uts0 uts0VarM1 = ro4.m0(300, 0, ihn.d, 2);
                    this.j = true;
                    if (t33.a(this.k, f9, uts0VarM1, null, null, this, 12) == wneVar17) {
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
                    Float f10 = new Float(-200.0f);
                    uts0 uts0VarM2 = ro4.m0(Response.BUSY_EVERYWHERE, 0, ihn.d, 2);
                    this.j = true;
                    if (t33.a(this.k, f10, uts0VarM2, null, null, this, 12) == wneVar18) {
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
                    Float f11 = new Float(200.0f);
                    uts0 uts0VarM3 = ro4.m0(Response.BUSY_EVERYWHERE, 0, ihn.d, 2);
                    this.j = true;
                    if (t33.a(this.k, f11, uts0VarM3, null, null, this, 12) == wneVar19) {
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
                    Float f12 = new Float(0.0f);
                    uts0 uts0VarM4 = ro4.m0(Response.BUSY_EVERYWHERE, 0, ihn.d, 2);
                    this.j = true;
                    if (t33.a(this.k, f12, uts0VarM4, null, null, this, 12) == wneVar20) {
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
                    Float f13 = new Float(0.0f);
                    uts0 uts0VarM5 = ro4.m0(Response.BUSY_EVERYWHERE, 0, ihn.d, 2);
                    this.j = true;
                    if (t33.a(this.k, f13, uts0VarM5, null, null, this, 12) == wneVar21) {
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
                    Float f14 = new Float(0.0f);
                    uts0 uts0VarM6 = ro4.m0(Response.OK, 0, ihn.d, 2);
                    this.j = true;
                    if (t33.a(this.k, f14, uts0VarM6, null, null, this, 12) == wneVar22) {
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
                    Float f15 = new Float(0.0f);
                    this.j = true;
                    if (t33.a(this.k, f15, null, null, null, this, 14) == wneVar23) {
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
                    Float f16 = new Float(0.0f);
                    uts0 uts0Var = qna0.f29022a;
                    this.j = true;
                    if (t33.a(this.k, f16, uts0Var, null, null, this, 12) == wneVar24) {
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
                    Float f17 = new Float(1.0f);
                    uts0 uts0Var2 = qna0.f29022a;
                    this.j = true;
                    if (t33.a(this.k, f17, uts0Var2, null, null, this, 12) == wneVar25) {
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
                    Float f18 = new Float(1.0f);
                    uts0 uts0Var3 = qna0.f29022a;
                    this.j = true;
                    if (t33.a(this.k, f18, uts0Var3, null, null, this, 12) == wneVar26) {
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
                    Float f19 = new Float(0.0f);
                    uts0 uts0Var4 = qna0.f29022a;
                    this.j = true;
                    if (t33.a(this.k, f19, uts0Var4, null, null, this, 12) == wneVar27) {
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
                    Float f20 = new Float(0.0f);
                    uts0 uts0Var5 = qna0.f29022a;
                    this.j = true;
                    if (t33.a(this.k, f20, uts0Var5, null, null, this, 12) == wneVar28) {
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
                    Float f21 = new Float(0.0f);
                    uts0 uts0Var6 = qna0.f29022a;
                    this.j = true;
                    if (t33.a(this.k, f21, uts0Var6, null, null, this, 12) == wneVar29) {
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
                    Float f22 = new Float(1.0f);
                    uts0 uts0Var7 = qna0.f29022a;
                    this.j = true;
                    if (t33.a(this.k, f22, uts0Var7, null, null, this, 12) == wneVar30) {
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
}
