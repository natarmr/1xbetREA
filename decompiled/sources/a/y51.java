package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y51 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(zh3 zh3Var, clz clzVar, sg3 sg3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = zh3Var;
        this.l = clzVar;
        this.m = sg3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                y51 y51Var = new y51((b61) obj2, yjeVar);
                y51Var.m = obj;
                return y51Var;
            case 1:
                lkz lkzVar = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar);
            case 2:
                lkz lkzVar2 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (byte) 0);
            case 3:
                lkz lkzVar3 = lkz.f20223a;
                return new y51((gmq) this.k, (clz) obj2, (oc) this.m, yjeVar);
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (char) 0);
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, 0);
            case 6:
                lkz lkzVar6 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (short) 0);
            case 7:
                lkz lkzVar7 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (byte) 0, false);
            case 8:
                lkz lkzVar8 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (byte) 0, (byte) 0);
            case 9:
                lkz lkzVar9 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (byte) 0, (char) 0);
            case 10:
                lkz lkzVar10 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (byte) 0, 0);
            case 11:
                return new y51((uv1) this.k, (mlr) obj2, (bv1) this.m, yjeVar);
            case 12:
                lkz lkzVar11 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (byte) 0, (short) 0);
            case 13:
                lkz lkzVar12 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (char) 0, false);
            case 14:
                lkz lkzVar13 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (char) 0, (byte) 0);
            case 15:
                lkz lkzVar14 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (char) 0, (char) 0);
            case 16:
                lkz lkzVar15 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (char) 0, 0);
            case 17:
                lkz lkzVar16 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (oc) this.m, yjeVar, (char) 0, (short) 0);
            case 18:
                lkz lkzVar17 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (df2) this.m, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar18 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (df2) this.m, yjeVar, (byte) 0);
            case 20:
                lkz lkzVar19 = lkz.f20223a;
                return new y51((i89) this.k, (clz) obj2, (df2) this.m, yjeVar, (char) 0);
            case 21:
                lkz lkzVar20 = lkz.f20223a;
                return new y51((gmq) this.k, (clz) obj2, (qa) this.m, yjeVar);
            case 22:
                y51 y51Var2 = new y51(this.k, obj2, yjeVar, (byte) 22);
                y51Var2.m = obj;
                return y51Var2;
            case 23:
                y51 y51Var3 = new y51(this.k, obj2, yjeVar, (byte) 23);
                y51Var3.m = obj;
                return y51Var3;
            case 24:
                y51 y51Var4 = new y51(this.k, obj2, yjeVar, (byte) 24);
                y51Var4.m = obj;
                return y51Var4;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                y51 y51Var5 = new y51(this.k, obj2, yjeVar, (byte) 25);
                y51Var5.m = obj;
                return y51Var5;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                y51 y51Var6 = new y51(this.k, obj2, yjeVar, (byte) 26);
                y51Var6.m = obj;
                return y51Var6;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar21 = lkz.f20223a;
                return new y51((gmq) this.k, (clz) obj2, (ee0) this.m, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar22 = lkz.f20223a;
                return new y51((gmq) this.k, (clz) obj2, (i8) this.m, yjeVar);
            default:
                lkz lkzVar23 = lkz.f20223a;
                return new y51((zh3) this.k, (clz) obj2, (sg3) this.m, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((y51) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((y51) create((no20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((y51) create((vtj) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((y51) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((y51) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((y51) create((gzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((y51) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long jP;
        Object objA;
        byte b = this.i;
        byte b2 = 3;
        Object obj2 = this.l;
        byte b3 = 1;
        switch (b) {
            case 0:
                b61 b61Var = (b61) obj2;
                sw00 sw00Var = (sw00) this.m;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (sw00Var.f32897a) {
                        xru xruVar = b61Var.r;
                        bm5 bm5Var = bm5.e;
                        xruVar.getClass();
                        jP = xruVar.f41388a.p(bm5Var);
                        if (jP <= 0) {
                            nou nouVar = b61Var.s;
                            this.m = null;
                            this.k = b61Var;
                            this.j = true;
                            objA = nouVar.a(tl5.c, this);
                            if (objA == wneVar) {
                                return wneVar;
                            }
                        }
                        b61Var.w = jP;
                    }
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b61Var = (b61) this.k;
                z1x.P(obj);
                objA = obj;
                jP = ((ql5) objA).f28916a;
                b61Var.w = jP;
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    l80 l80Var = new l80((oc) this.m, (byte) 21);
                    this.j = true;
                    if (bq9VarB.c(l80Var, this) == wneVar2) {
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
                    bq9 bq9VarB2 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    l80 l80Var2 = new l80((oc) this.m, (byte) 22);
                    this.j = true;
                    if (bq9VarB2.c(l80Var2, this) == wneVar3) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) obj2).x(), lkz.d);
                    l80 l80Var3 = new l80((oc) this.m, (byte) 23);
                    this.j = true;
                    if (bq9VarB3.c(l80Var3, this) == wneVar4) {
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
                    bq9 bq9VarB4 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    l80 l80Var4 = new l80((oc) this.m, (byte) 24);
                    this.j = true;
                    if (bq9VarB4.c(l80Var4, this) == wneVar5) {
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
                    bq9 bq9VarB5 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    l80 l80Var5 = new l80((oc) this.m, (byte) 25);
                    this.j = true;
                    if (bq9VarB5.c(l80Var5, this) == wneVar6) {
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
                    bq9 bq9VarB6 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    l80 l80Var6 = new l80((oc) this.m, (byte) 26);
                    this.j = true;
                    if (bq9VarB6.c(l80Var6, this) == wneVar7) {
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
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    l80 l80Var7 = new l80((oc) this.m, (byte) 28);
                    this.j = true;
                    if (bq9VarB7.c(l80Var7, this) == wneVar8) {
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
                    bq9 bq9VarB8 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    l80 l80Var8 = new l80((oc) this.m, (byte) 29);
                    this.j = true;
                    if (bq9VarB8.c(l80Var8, this) == wneVar9) {
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
                    bq9 bq9VarB9 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var = new mn1((oc) this.m, (byte) 0);
                    this.j = true;
                    if (bq9VarB9.c(mn1Var, this) == wneVar10) {
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
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var2 = new mn1((oc) this.m, b3);
                    this.j = true;
                    if (bq9VarB10.c(mn1Var2, this) == wneVar11) {
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
                bv1 bv1Var = (bv1) this.m;
                mlr mlrVar = (mlr) obj2;
                uv1 uv1Var = (uv1) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    long j = mlrVar.f22006a;
                    int i = uv1.X;
                    ix0 ix0Var = uv1Var.H;
                    int iX = CollectionsKt.X(((yu1) uv1Var.D()).q.keySet(), Long.valueOf(j));
                    Integer numValueOf = Integer.valueOf(iX);
                    if (iX < 0) {
                        numValueOf = null;
                    }
                    Integer numE = numValueOf != null ? kng0.e(1, numValueOf) : null;
                    int iOrdinal = bv1Var.ordinal();
                    if (iOrdinal == 0) {
                        Integer num = numE;
                        uv1Var.G.q("tournament_page", 0L, j, num, null);
                        y1p y1pVar = y1p.MAIN;
                        ix0Var.a((int) j, 0, num, "tournament_page", null);
                    } else if (iOrdinal == 1) {
                        Integer num2 = numE;
                        uv1Var.G.q("tournament_games", 0L, j, num2, null);
                        y1p y1pVar2 = y1p.MAIN;
                        ix0Var.a((int) j, 0, num2, "tournament_games", null);
                    } else if (iOrdinal != 2 && iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    pw70 pw70Var = uv1Var.s;
                    String strM = uv1Var.M(mlrVar.f22006a, bv1Var);
                    this.j = true;
                    if (pw70.b(pw70Var, mlrVar, strM, 0, false, false, this, 82) == wneVar12) {
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
                    bq9 bq9VarB11 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var3 = new mn1((oc) this.m, b2);
                    this.j = true;
                    if (bq9VarB11.c(mn1Var3, this) == wneVar13) {
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
                    bq9 bq9VarB12 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var4 = new mn1((oc) this.m, (byte) 4);
                    this.j = true;
                    if (bq9VarB12.c(mn1Var4, this) == wneVar14) {
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
                    bq9 bq9VarB13 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var5 = new mn1((oc) this.m, (byte) 5);
                    this.j = true;
                    if (bq9VarB13.c(mn1Var5, this) == wneVar15) {
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
                    bq9 bq9VarB14 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var6 = new mn1((oc) this.m, (byte) 6);
                    this.j = true;
                    if (bq9VarB14.c(mn1Var6, this) == wneVar16) {
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
                    bq9 bq9VarB15 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var7 = new mn1((oc) this.m, (byte) 7);
                    this.j = true;
                    if (bq9VarB15.c(mn1Var7, this) == wneVar17) {
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
                    bq9 bq9VarB16 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var8 = new mn1((oc) this.m, (byte) 9);
                    this.j = true;
                    if (bq9VarB16.c(mn1Var8, this) == wneVar18) {
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
                    bq9 bq9VarB17 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var9 = new mn1((df2) this.m, (byte) 10);
                    this.j = true;
                    if (bq9VarB17.c(mn1Var9, this) == wneVar19) {
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
                    bq9 bq9VarB18 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var10 = new mn1((df2) this.m, (byte) 11);
                    this.j = true;
                    if (bq9VarB18.c(mn1Var10, this) == wneVar20) {
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
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var11 = new mn1((df2) this.m, (byte) 12);
                    this.j = true;
                    if (bq9VarB19.c(mn1Var11, this) == wneVar21) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var12 = new mn1((qa) this.m, (byte) 16);
                    this.j = true;
                    if (bq9VarB20.c(mn1Var12, this) == wneVar22) {
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
                    no20 no20Var = (no20) this.m;
                    xdr xdrVar = (xdr) this.k;
                    mv2 mv2Var = (mv2) ((qv2) obj2).n;
                    this.j = true;
                    if (xdrVar.F(mv2Var, no20Var, this) == wneVar23) {
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
                    vtj vtjVar = (vtj) this.m;
                    xdr xdrVar2 = (xdr) this.k;
                    nv2 nv2Var = ((rv2) obj2).j;
                    this.j = true;
                    if (xdrVar2.F(nv2Var, vtjVar, this) == wneVar24) {
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
                    Pair pair = (Pair) this.m;
                    no20 no20Var2 = (no20) pair.f46059a;
                    Object obj3 = pair.b;
                    ydr ydrVar = (ydr) this.k;
                    mv2 mv2Var2 = (mv2) ((qv2) obj2).n;
                    this.j = true;
                    if (ydrVar.j(mv2Var2, no20Var2, obj3, this) == wneVar25) {
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
                    Pair pair2 = (Pair) this.m;
                    vtj vtjVar2 = (vtj) pair2.f46059a;
                    Object obj4 = pair2.b;
                    ydr ydrVar2 = (ydr) this.k;
                    nv2 nv2Var2 = ((rv2) obj2).j;
                    this.j = true;
                    if (ydrVar2.j(nv2Var2, vtjVar2, obj4, this) == wneVar26) {
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
                oms0 oms0Var = (oms0) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    gzb0 gzb0Var = (gzb0) this.m;
                    vsg0 vsg0VarV = ydx.V(null, new sz2(oms0Var, (byte) 2));
                    yj2 yj2Var = new yj2(gzb0Var, oms0Var, (pz40) obj2, b3);
                    this.j = true;
                    if (vsg0VarV.c(yj2Var, this) == wneVar27) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) this.k, ((clz) obj2).x(), lkz.d);
                    mn1 mn1Var13 = new mn1((ee0) this.m, (byte) 18);
                    this.j = true;
                    if (bq9VarB21.c(mn1Var13, this) == wneVar28) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((clz) obj2).x(), lkz.e);
                    mn1 mn1Var14 = new mn1((i8) this.m, (byte) 19);
                    this.j = true;
                    if (bq9VarB22.c(mn1Var14, this) == wneVar29) {
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
                    bq9 bq9VarB23 = hkb.B((zh3) this.k, ((clz) obj2).x(), lkz.c);
                    mn1 mn1Var15 = new mn1((sg3) this.m, (byte) 20);
                    this.j = true;
                    if (bq9VarB23.c(mn1Var15, this) == wneVar30) {
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
    public y51(uv1 uv1Var, mlr mlrVar, bv1 bv1Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        this.k = uv1Var;
        this.l = mlrVar;
        this.m = bv1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(b61 b61Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = b61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, short s) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, char c, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, char c, char c2) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, char c, int i) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, char c, short s) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, char c, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(gmq gmqVar, clz clzVar, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(gmq gmqVar, clz clzVar, qa qaVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = qaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(gmq gmqVar, clz clzVar, oc ocVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(gmq gmqVar, clz clzVar, ee0 ee0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ee0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y51(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }
}
