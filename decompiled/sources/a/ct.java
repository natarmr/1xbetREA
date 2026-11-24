package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ct extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ k3t0 k;
    public final /* synthetic */ Function1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct(k3t0 k3t0Var, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k3t0Var;
        this.l = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ct(this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new ct(this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new ct(this.k, this.l, yjeVar, (byte) 2);
            case 3:
                return new ct(this.k, this.l, yjeVar, (byte) 3);
            case 4:
                return new ct(this.k, this.l, yjeVar, (byte) 4);
            case 5:
                return new ct(this.k, this.l, yjeVar, (byte) 5);
            case 6:
                return new ct(this.k, this.l, yjeVar, (byte) 6);
            case 7:
                return new ct(this.k, this.l, yjeVar, (byte) 7);
            case 8:
                return new ct(this.k, this.l, yjeVar, (byte) 8);
            case 9:
                return new ct(this.k, this.l, yjeVar, (byte) 9);
            case 10:
                return new ct(this.k, this.l, yjeVar, (byte) 10);
            case 11:
                return new ct(this.k, this.l, yjeVar, (byte) 11);
            case 12:
                return new ct(this.k, this.l, yjeVar, (byte) 12);
            case 13:
                return new ct(this.k, this.l, yjeVar, (byte) 13);
            case 14:
                return new ct(this.k, this.l, yjeVar, (byte) 14);
            case 15:
                return new ct(this.k, this.l, yjeVar, (byte) 15);
            case 16:
                return new ct(this.k, this.l, yjeVar, (byte) 16);
            case 17:
                return new ct(this.k, this.l, yjeVar, (byte) 17);
            case 18:
                return new ct(this.k, this.l, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ct(this.k, this.l, yjeVar, (byte) 19);
            case 20:
                return new ct(this.k, this.l, yjeVar, (byte) 20);
            case 21:
                return new ct(this.k, this.l, yjeVar, (byte) 21);
            case 22:
                return new ct(this.k, this.l, yjeVar, (byte) 22);
            case 23:
                return new ct(this.k, this.l, yjeVar, (byte) 23);
            case 24:
                return new ct(this.k, this.l, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ct(this.k, this.l, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ct(this.k, this.l, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ct(this.k, this.l, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new ct(this.k, this.l, yjeVar, (byte) 28);
            default:
                return new ct(this.k, this.l, yjeVar, (byte) 29);
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
        return ((ct) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.l;
        k3t0 k3t0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq gmqVarC = ((i3t0) k3t0Var).C();
                    bt btVar = new bt(function1, (byte) 0);
                    this.j = true;
                    if (((i89) gmqVarC).c(btVar, this) == wneVar) {
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
                    gmq gmqVarC2 = ((i3t0) k3t0Var).C();
                    bt btVar2 = new bt(function1, (byte) 2);
                    this.j = true;
                    if (((i89) gmqVarC2).c(btVar2, this) == wneVar2) {
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
                    gmq gmqVarC3 = ((i3t0) k3t0Var).C();
                    bt btVar3 = new bt(function1, (byte) 8);
                    this.j = true;
                    if (((i89) gmqVarC3).c(btVar3, this) == wneVar3) {
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
                    gmq gmqVarC4 = ((i3t0) k3t0Var).C();
                    bt btVar4 = new bt(function1, (byte) 9);
                    this.j = true;
                    if (((i89) gmqVarC4).c(btVar4, this) == wneVar4) {
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
                    gmq gmqVarC5 = ((i3t0) k3t0Var).C();
                    bt btVar5 = new bt(function1, (byte) 10);
                    this.j = true;
                    if (((i89) gmqVarC5).c(btVar5, this) == wneVar5) {
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
                    gmq gmqVarC6 = ((i3t0) k3t0Var).C();
                    bt btVar6 = new bt(function1, (byte) 11);
                    this.j = true;
                    if (((i89) gmqVarC6).c(btVar6, this) == wneVar6) {
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
                    gmq gmqVarC7 = ((i3t0) k3t0Var).C();
                    bt btVar7 = new bt(function1, (byte) 12);
                    this.j = true;
                    if (((i89) gmqVarC7).c(btVar7, this) == wneVar7) {
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
                    gmq gmqVarC8 = ((i3t0) k3t0Var).C();
                    bt btVar8 = new bt(function1, (byte) 13);
                    this.j = true;
                    if (((i89) gmqVarC8).c(btVar8, this) == wneVar8) {
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
                    gmq gmqVarC9 = ((i3t0) k3t0Var).C();
                    bt btVar9 = new bt(function1, (byte) 14);
                    this.j = true;
                    if (((i89) gmqVarC9).c(btVar9, this) == wneVar9) {
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
                    gmq gmqVarC10 = ((i3t0) k3t0Var).C();
                    bt btVar10 = new bt(function1, (byte) 16);
                    this.j = true;
                    if (((i89) gmqVarC10).c(btVar10, this) == wneVar10) {
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
                    gmq gmqVarC11 = ((i3t0) k3t0Var).C();
                    bt btVar11 = new bt(function1, (byte) 17);
                    this.j = true;
                    if (((i89) gmqVarC11).c(btVar11, this) == wneVar11) {
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
                    gmq gmqVarC12 = ((i3t0) k3t0Var).C();
                    bt btVar12 = new bt(function1, (byte) 18);
                    this.j = true;
                    if (((i89) gmqVarC12).c(btVar12, this) == wneVar12) {
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
                    gmq gmqVarC13 = ((i3t0) k3t0Var).C();
                    bt btVar13 = new bt(function1, (byte) 19);
                    this.j = true;
                    if (((i89) gmqVarC13).c(btVar13, this) == wneVar13) {
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
                    gmq gmqVarC14 = ((i3t0) k3t0Var).C();
                    bt btVar14 = new bt(function1, (byte) 20);
                    this.j = true;
                    if (((i89) gmqVarC14).c(btVar14, this) == wneVar14) {
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
                    gmq gmqVarC15 = ((i3t0) k3t0Var).C();
                    bt btVar15 = new bt(function1, (byte) 21);
                    this.j = true;
                    if (((i89) gmqVarC15).c(btVar15, this) == wneVar15) {
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
                    gmq gmqVarC16 = ((i3t0) k3t0Var).C();
                    bt btVar16 = new bt(function1, (byte) 22);
                    this.j = true;
                    if (((i89) gmqVarC16).c(btVar16, this) == wneVar16) {
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
                    gmq gmqVarC17 = ((i3t0) k3t0Var).C();
                    bt btVar17 = new bt(function1, (byte) 23);
                    this.j = true;
                    if (((i89) gmqVarC17).c(btVar17, this) == wneVar17) {
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
                    gmq gmqVarC18 = ((i3t0) k3t0Var).C();
                    bt btVar18 = new bt(function1, (byte) 25);
                    this.j = true;
                    if (((i89) gmqVarC18).c(btVar18, this) == wneVar18) {
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
                    gmq gmqVarC19 = ((i3t0) k3t0Var).C();
                    bt btVar19 = new bt(function1, (byte) 26);
                    this.j = true;
                    if (((i89) gmqVarC19).c(btVar19, this) == wneVar19) {
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
                    gmq gmqVarC20 = ((i3t0) k3t0Var).C();
                    bt btVar20 = new bt(function1, (byte) 27);
                    this.j = true;
                    if (((i89) gmqVarC20).c(btVar20, this) == wneVar20) {
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
                    gmq gmqVarC21 = ((i3t0) k3t0Var).C();
                    bt btVar21 = new bt(function1, (byte) 28);
                    this.j = true;
                    if (((i89) gmqVarC21).c(btVar21, this) == wneVar21) {
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
                    gmq gmqVarC22 = ((i3t0) k3t0Var).C();
                    bt btVar22 = new bt(function1, (byte) 29);
                    this.j = true;
                    if (((i89) gmqVarC22).c(btVar22, this) == wneVar22) {
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
                    gmq gmqVarC23 = ((i3t0) k3t0Var).C();
                    x6h x6hVar = new x6h(function1, (byte) 0);
                    this.j = true;
                    if (((i89) gmqVarC23).c(x6hVar, this) == wneVar23) {
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
                    gmq gmqVarC24 = ((i3t0) k3t0Var).C();
                    x6h x6hVar2 = new x6h(function1, (byte) 1);
                    this.j = true;
                    if (((i89) gmqVarC24).c(x6hVar2, this) == wneVar24) {
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
                    gmq gmqVarC25 = ((i3t0) k3t0Var).C();
                    x6h x6hVar3 = new x6h(function1, (byte) 2);
                    this.j = true;
                    if (((i89) gmqVarC25).c(x6hVar3, this) == wneVar25) {
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
                    gmq gmqVarC26 = ((i3t0) k3t0Var).C();
                    x6h x6hVar4 = new x6h(function1, (byte) 3);
                    this.j = true;
                    if (((i89) gmqVarC26).c(x6hVar4, this) == wneVar26) {
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
                    gmq gmqVarC27 = ((i3t0) k3t0Var).C();
                    x6h x6hVar5 = new x6h(function1, (byte) 4);
                    this.j = true;
                    if (((i89) gmqVarC27).c(x6hVar5, this) == wneVar27) {
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
                    gmq gmqVarC28 = ((i3t0) k3t0Var).C();
                    x6h x6hVar6 = new x6h(function1, (byte) 5);
                    this.j = true;
                    if (((i89) gmqVarC28).c(x6hVar6, this) == wneVar28) {
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
                    gmq gmqVarC29 = ((i3t0) k3t0Var).C();
                    x6h x6hVar7 = new x6h(function1, (byte) 9);
                    this.j = true;
                    if (((i89) gmqVarC29).c(x6hVar7, this) == wneVar29) {
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
                    gmq gmqVarC30 = ((i3t0) k3t0Var).C();
                    x6h x6hVar8 = new x6h(function1, (byte) 12);
                    this.j = true;
                    if (((i89) gmqVarC30).c(x6hVar8, this) == wneVar30) {
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
