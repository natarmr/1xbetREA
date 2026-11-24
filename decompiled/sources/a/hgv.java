package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hgv extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new hgv((gmq) this.k, (clz) obj3, (pfl) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new hgv((gmq) this.k, (clz) obj3, (j0s) obj2, yjeVar);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (j0s) obj2, yjeVar);
            case 3:
                return new hgv(this.k, (Long) obj3, (l9s) obj2, yjeVar, (byte) 3);
            case 4:
                return new hgv(this.k, (Long) obj3, (l9s) obj2, yjeVar, (byte) 4);
            case 5:
                return new hgv(this.k, (Long) obj3, (l9s) obj2, yjeVar, (byte) 5);
            case 6:
                lkz lkzVar4 = lkz.f20223a;
                return new hgv((vae0) this.k, (clz) obj3, (j0s) obj2, yjeVar);
            case 7:
                lkz lkzVar5 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (iyv) obj2, yjeVar);
            case 8:
                lkz lkzVar6 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (iyv) obj2, yjeVar, (byte) 0);
            case 9:
                lkz lkzVar7 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (iyv) obj2, yjeVar, (char) 0);
            case 10:
                lkz lkzVar8 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (iyv) obj2, yjeVar, 0);
            case 11:
                lkz lkzVar9 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (iyv) obj2, yjeVar, (short) 0);
            case 12:
                lkz lkzVar10 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (iyv) obj2, yjeVar, (byte) 0, false);
            case 13:
                lkz lkzVar11 = lkz.f20223a;
                return new hgv((dnq) this.k, (clz) obj3, (hzv) obj2, yjeVar);
            case 14:
                lkz lkzVar12 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (gkr) obj2, yjeVar);
            case 15:
                lkz lkzVar13 = lkz.f20223a;
                return new hgv((gmq) this.k, (clz) obj3, (hzv) obj2, yjeVar);
            case 16:
                lkz lkzVar14 = lkz.f20223a;
                return new hgv((gmq) this.k, (clz) obj3, (hzv) obj2, yjeVar, (byte) 0);
            case 17:
                lkz lkzVar15 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (hzv) obj2, yjeVar);
            case 18:
                lkz lkzVar16 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (hzv) obj2, yjeVar, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar17 = lkz.f20223a;
                return new hgv((i89) this.k, (clz) obj3, (ens) obj2, yjeVar);
            case 20:
                lkz lkzVar18 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (j0s) obj2, yjeVar, (byte) 0);
            case 21:
                lkz lkzVar19 = lkz.f20223a;
                return new hgv((fnq) this.k, (clz) obj3, (q1w) obj2, yjeVar);
            case 22:
                lkz lkzVar20 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (q1w) obj2, yjeVar);
            case 23:
                lkz lkzVar21 = lkz.f20223a;
                return new hgv((vae0) this.k, (clz) obj3, (u5u) obj2, yjeVar);
            case 24:
                hgv hgvVar = new hgv((vne) obj3, (q1w) obj2, yjeVar);
                hgvVar.k = obj;
                return hgvVar;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar22 = lkz.f20223a;
                return new hgv((gmq) this.k, (clz) obj3, (q1w) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar23 = lkz.f20223a;
                return new hgv((gmq) this.k, (clz) obj3, (pfl) obj2, yjeVar, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar24 = lkz.f20223a;
                return new hgv((gmq) this.k, (clz) obj3, (q1w) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar25 = lkz.f20223a;
                return new hgv((xae0) this.k, (clz) obj3, (q1w) obj2, yjeVar, (byte) 0);
            default:
                lkz lkzVar26 = lkz.f20223a;
                return new hgv((gmq) this.k, (clz) obj3, (j0s) obj2, yjeVar, (byte) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((hgv) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hgv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar = new ggv((pfl) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB.c(ggvVar, this) == wneVar) {
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
                    ggv ggvVar2 = new ggv((j0s) obj2, b2);
                    this.j = true;
                    if (bq9VarB2.c(ggvVar2, this) == wneVar2) {
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
                    ggv ggvVar3 = new ggv((j0s) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB3.c(ggvVar3, this) == wneVar3) {
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
                    afm0 afm0Var = (afm0) ((pwi) this.k).f27712a;
                    long jLongValue = ((Long) obj3).longValue();
                    long jC = ((l9s) obj2).c();
                    this.j = true;
                    if (afm0Var.m(jLongValue, jC, this) == wneVar4) {
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
                    afm0 afm0Var2 = (afm0) ((daf) this.k).j;
                    long jLongValue2 = ((Long) obj3).longValue();
                    long jC2 = ((l9s) obj2).c();
                    this.j = true;
                    if (afm0Var2.m(jLongValue2, jC2, this) == wneVar5) {
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
                    afm0 afm0Var3 = (afm0) ((nc0) this.k).f23267a;
                    long jLongValue3 = ((Long) obj3).longValue();
                    long j = ((k9s) obj2).s;
                    this.j = true;
                    if (afm0Var3.m(jLongValue3, j, this) == wneVar6) {
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
                    bq9 bq9VarB4 = hkb.B((vae0) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar4 = new ggv((j0s) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB4.c(ggvVar4, this) == wneVar7) {
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
                    bq9 bq9VarB5 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar5 = new ggv((iyv) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB5.c(ggvVar5, this) == wneVar8) {
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
                    ggv ggvVar6 = new ggv((iyv) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB6.c(ggvVar6, this) == wneVar9) {
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
                    ggv ggvVar7 = new ggv((iyv) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB7.c(ggvVar7, this) == wneVar10) {
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
                    ggv ggvVar8 = new ggv((iyv) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB8.c(ggvVar8, this) == wneVar11) {
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
                    ggv ggvVar9 = new ggv((iyv) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB9.c(ggvVar9, this) == wneVar12) {
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
                    ggv ggvVar10 = new ggv((iyv) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB10.c(ggvVar10, this) == wneVar13) {
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
                    bq9 bq9VarB11 = hkb.B((dnq) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar11 = new ggv((hzv) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB11.c(ggvVar11, this) == wneVar14) {
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
                    bq9 bq9VarB12 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar12 = new ggv((gkr) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB12.c(ggvVar12, this) == wneVar15) {
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
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar13 = new ggv((hzv) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB13.c(ggvVar13, this) == wneVar16) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar14 = new ggv((hzv) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB14.c(ggvVar14, this) == wneVar17) {
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
                    bq9 bq9VarB15 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar15 = new ggv((hzv) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB15.c(ggvVar15, this) == wneVar18) {
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
                    bq9 bq9VarB16 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar16 = new ggv((hzv) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB16.c(ggvVar16, this) == wneVar19) {
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
                    bq9 bq9VarB17 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar17 = new ggv((ens) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB17.c(ggvVar17, this) == wneVar20) {
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
                    bq9 bq9VarB18 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar18 = new ggv((j0s) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB18.c(ggvVar18, this) == wneVar21) {
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
                    bq9 bq9VarB19 = hkb.B((fnq) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar19 = new ggv((q1w) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB19.c(ggvVar19, this) == wneVar22) {
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
                    bq9 bq9VarB20 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar20 = new ggv((q1w) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB20.c(ggvVar20, this) == wneVar23) {
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
                    bq9 bq9VarB21 = hkb.B((vae0) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar21 = new ggv((u5u) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB21.c(ggvVar21, this) == wneVar24) {
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
                Object obj4 = this.k;
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    if (d5c.R((vne) obj3)) {
                        this.k = null;
                        this.j = true;
                        if (((q1w) obj2).invoke(obj4, this) == wneVar25) {
                            return wneVar25;
                        }
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar22 = new ggv((q1w) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB22.c(ggvVar22, this) == wneVar26) {
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
                    bq9 bq9VarB23 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar23 = new ggv((pfl) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB23.c(ggvVar23, this) == wneVar27) {
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
                    bq9 bq9VarB24 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar24 = new ggv((q1w) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB24.c(ggvVar24, this) == wneVar28) {
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
                    bq9 bq9VarB25 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar25 = new ggv((q1w) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB25.c(ggvVar25, this) == wneVar29) {
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
                    bq9 bq9VarB26 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    ggv ggvVar26 = new ggv((j0s) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB26.c(ggvVar26, this) == wneVar30) {
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
    public hgv(vne vneVar, q1w q1wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.m = q1wVar;
        this.l = vneVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(gmq gmqVar, clz clzVar, j0s j0sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = j0sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(gmq gmqVar, clz clzVar, j0s j0sVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = j0sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(gmq gmqVar, clz clzVar, hzv hzvVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = hzvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(gmq gmqVar, clz clzVar, hzv hzvVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = hzvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(gmq gmqVar, clz clzVar, q1w q1wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = q1wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(gmq gmqVar, clz clzVar, q1w q1wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = q1wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(dnq dnqVar, clz clzVar, hzv hzvVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = hzvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(fnq fnqVar, clz clzVar, q1w q1wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = fnqVar;
        this.l = clzVar;
        this.m = q1wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(vae0 vae0Var, clz clzVar, j0s j0sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = j0sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(vae0 vae0Var, clz clzVar, u5u u5uVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = u5uVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, gkr gkrVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = gkrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, j0s j0sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = j0sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, j0s j0sVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = j0sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, iyv iyvVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = iyvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, iyv iyvVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = iyvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, iyv iyvVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = iyvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, iyv iyvVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = iyvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, iyv iyvVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = iyvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, iyv iyvVar, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = iyvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, hzv hzvVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = hzvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, hzv hzvVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = hzvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, q1w q1wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = q1wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgv(xae0 xae0Var, clz clzVar, q1w q1wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = q1wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgv(Object obj, Long l, l9s l9sVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = l;
        this.m = l9sVar;
    }
}
