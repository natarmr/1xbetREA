package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class az60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 29;
    public boolean j;
    public /* synthetic */ Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
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
                gmq gmqVar = (gmq) this.l;
                clz clzVar = (clz) this.k;
                lkz lkzVar = lkz.f20223a;
                return new az60(gmqVar, clzVar, (bz60) obj2, yjeVar);
            case 1:
                m430 m430Var = (m430) this.l;
                clz clzVar2 = (clz) this.k;
                lkz lkzVar2 = lkz.f20223a;
                return new az60(m430Var, clzVar2, (vf20) obj2, yjeVar);
            case 2:
                gmq gmqVar2 = (gmq) this.l;
                clz clzVar3 = (clz) this.k;
                lkz lkzVar3 = lkz.f20223a;
                return new az60(gmqVar2, clzVar3, (vf20) obj2, yjeVar);
            case 3:
                i89 i89Var = (i89) this.l;
                clz clzVar4 = (clz) this.k;
                lkz lkzVar4 = lkz.f20223a;
                return new az60(i89Var, clzVar4, (bz60) obj2, yjeVar);
            case 4:
                i89 i89Var2 = (i89) this.l;
                clz clzVar5 = (clz) this.k;
                lkz lkzVar5 = lkz.f20223a;
                return new az60(i89Var2, clzVar5, (gq50) obj2, yjeVar);
            case 5:
                i89 i89Var3 = (i89) this.l;
                clz clzVar6 = (clz) this.k;
                lkz lkzVar6 = lkz.f20223a;
                return new az60(i89Var3, clzVar6, (nf60) obj2, yjeVar);
            case 6:
                az60 az60Var = new az60((n270) obj2, yjeVar);
                az60Var.k = obj;
                return az60Var;
            case 7:
                return new az60((l570) this.l, (List) this.k, (Function1) obj2, yjeVar);
            case 8:
                i89 i89Var4 = (i89) this.l;
                clz clzVar7 = (clz) this.k;
                lkz lkzVar7 = lkz.f20223a;
                return new az60(i89Var4, clzVar7, (gq50) obj2, yjeVar, (byte) 0);
            case 9:
                i89 i89Var5 = (i89) this.l;
                clz clzVar8 = (clz) this.k;
                lkz lkzVar8 = lkz.f20223a;
                return new az60(i89Var5, clzVar8, (gq50) obj2, yjeVar, (char) 0);
            case 10:
                i89 i89Var6 = (i89) this.l;
                clz clzVar9 = (clz) this.k;
                lkz lkzVar9 = lkz.f20223a;
                return new az60(i89Var6, clzVar9, (gq50) obj2, yjeVar, 0);
            case 11:
                gmq gmqVar3 = (gmq) this.l;
                clz clzVar10 = (clz) this.k;
                lkz lkzVar10 = lkz.f20223a;
                return new az60(gmqVar3, clzVar10, (ne70) obj2, yjeVar);
            case 12:
                itb itbVar = (itb) this.l;
                clz clzVar11 = (clz) this.k;
                lkz lkzVar11 = lkz.f20223a;
                return new az60(itbVar, clzVar11, (ne70) obj2, yjeVar);
            case 13:
                gmq gmqVar4 = (gmq) this.l;
                clz clzVar12 = (clz) this.k;
                lkz lkzVar12 = lkz.f20223a;
                return new az60(gmqVar4, clzVar12, (nf60) obj2, yjeVar);
            case 14:
                gmq gmqVar5 = (gmq) this.l;
                clz clzVar13 = (clz) this.k;
                lkz lkzVar13 = lkz.f20223a;
                return new az60(gmqVar5, clzVar13, (cg70) obj2, yjeVar);
            case 15:
                itb itbVar2 = (itb) this.l;
                clz clzVar14 = (clz) this.k;
                lkz lkzVar14 = lkz.f20223a;
                return new az60(itbVar2, clzVar14, (cg70) obj2, yjeVar);
            case 16:
                itb itbVar3 = (itb) this.l;
                clz clzVar15 = (clz) this.k;
                lkz lkzVar15 = lkz.f20223a;
                return new az60(itbVar3, clzVar15, (nf60) obj2, yjeVar);
            case 17:
                gmq gmqVar6 = (gmq) this.l;
                clz clzVar16 = (clz) this.k;
                lkz lkzVar16 = lkz.f20223a;
                return new az60(gmqVar6, clzVar16, (nf60) obj2, yjeVar, (byte) 0);
            case 18:
                itb itbVar4 = (itb) this.l;
                clz clzVar17 = (clz) this.k;
                lkz lkzVar17 = lkz.f20223a;
                return new az60(itbVar4, clzVar17, (nf60) obj2, yjeVar, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                itb itbVar5 = (itb) this.l;
                clz clzVar18 = (clz) this.k;
                lkz lkzVar18 = lkz.f20223a;
                return new az60(itbVar5, clzVar18, (nf60) obj2, yjeVar, (char) 0);
            case 20:
                itb itbVar6 = (itb) this.l;
                clz clzVar19 = (clz) this.k;
                lkz lkzVar19 = lkz.f20223a;
                return new az60(itbVar6, clzVar19, (zi70) obj2, yjeVar);
            case 21:
                gmq gmqVar7 = (gmq) this.l;
                clz clzVar20 = (clz) this.k;
                lkz lkzVar20 = lkz.f20223a;
                return new az60(gmqVar7, clzVar20, (zi70) obj2, yjeVar);
            case 22:
                gmq gmqVar8 = (gmq) this.l;
                clz clzVar21 = (clz) this.k;
                lkz lkzVar21 = lkz.f20223a;
                return new az60(gmqVar8, clzVar21, (xj70) obj2, yjeVar);
            case 23:
                gmq gmqVar9 = (gmq) this.l;
                clz clzVar22 = (clz) this.k;
                lkz lkzVar22 = lkz.f20223a;
                return new az60(gmqVar9, clzVar22, (xj70) obj2, yjeVar, (byte) 0);
            case 24:
                gmq gmqVar10 = (gmq) this.l;
                clz clzVar23 = (clz) this.k;
                lkz lkzVar23 = lkz.f20223a;
                return new az60(gmqVar10, clzVar23, (nk70) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gmq gmqVar11 = (gmq) this.l;
                clz clzVar24 = (clz) this.k;
                lkz lkzVar24 = lkz.f20223a;
                return new az60(gmqVar11, clzVar24, (nk70) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                itb itbVar7 = (itb) this.l;
                clz clzVar25 = (clz) this.k;
                lkz lkzVar25 = lkz.f20223a;
                return new az60(itbVar7, clzVar25, (nf60) obj2, yjeVar, 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                itb itbVar8 = (itb) this.l;
                clz clzVar26 = (clz) this.k;
                lkz lkzVar26 = lkz.f20223a;
                return new az60(itbVar8, clzVar26, (tl70) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gmq gmqVar12 = (gmq) this.l;
                clz clzVar27 = (clz) this.k;
                lkz lkzVar27 = lkz.f20223a;
                return new az60(gmqVar12, clzVar27, (tl70) obj2, yjeVar);
            default:
                gmq gmqVar13 = (gmq) this.l;
                clz clzVar28 = (clz) this.k;
                lkz lkzVar28 = lkz.f20223a;
                return new az60(gmqVar13, clzVar28, (an70) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((az60) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((az60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object g0g0Var;
        Object value;
        Object value2;
        Object value3;
        Object objB;
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var = new io60((bz60) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB.c(io60Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((m430) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var2 = new io60((vf20) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB2.c(io60Var2, this) == wneVar2) {
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
                    io60 io60Var3 = new io60((vf20) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB3.c(io60Var3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var4 = new io60((bz60) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB4.c(io60Var4, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var5 = new io60((gq50) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB5.c(io60Var5, this) == wneVar5) {
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
                    io60 io60Var6 = new io60((nf60) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB6.c(io60Var6, this) == wneVar6) {
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
                n270 n270Var = (n270) obj2;
                oyg0 oyg0Var = n270Var.f;
                ocj ocjVar = n270Var.i;
                Pair pair = (Pair) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                try {
                    if (!z7) {
                        z1x.P(obj);
                        pat patVar = (pat) pair.f46059a;
                        pat patVar2 = (pat) pair.b;
                        e0g0 e0g0Var = j0g0.b;
                        patVar.getClass();
                        patVar2.getClass();
                        if ((patVar instanceof oat) || (patVar2 instanceof oat)) {
                            throw new sq60();
                        }
                        if ((patVar instanceof mat) || (patVar2 instanceof mat)) {
                            throw new vub0();
                        }
                        if ((patVar instanceof lat) || (patVar2 instanceof lat)) {
                            throw new bun();
                        }
                        this.k = null;
                        this.l = n270Var;
                        this.j = true;
                        int i = n270.Z;
                        if (n270Var.N(this) == wneVar7) {
                            return wneVar7;
                        }
                    } else {
                        if (!z7) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n270Var = (n270) this.l;
                        z1x.P(obj);
                    }
                    if (((c270) n270Var.D()).c != d270.UNKNOWN) {
                        n270Var.P(((c270) n270Var.D()).c);
                        p7m0 p7m0Var = n270Var.i.f25029a;
                        do {
                            value3 = p7m0Var.getValue();
                            value3.getClass();
                        } while (!p7m0Var.m(value3, c270.a((c270) value3, null, null, d270.UNKNOWN, false, false, null, null, null, 251)));
                    }
                    g0g0Var = Unit.f46060a;
                    e0g0 e0g0Var2 = j0g0.b;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Throwable thA = j0g0.a(g0g0Var);
                if (thA != null) {
                    int i2 = n270.Z;
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    if (thA instanceof sq60) {
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var2.m(value2, c270.a((c270) value2, null, null, null, false, false, m170.c, null, null, 223)));
                    } else {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value = p7m0Var3.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var3.m(value, c270.a((c270) value, null, null, null, false, false, m170.b, null, null, 223)));
                    }
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    yoc yocVar = ((l570) this.l).c;
                    List list = (List) this.k;
                    this.j = true;
                    objB = yocVar.b(list, this);
                    if (objB == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ((Function1) obj2).invoke((List) objB);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var7 = new io60((gq50) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB7.c(io60Var7, this) == wneVar9) {
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
                    bq9 bq9VarB8 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var8 = new io60((gq50) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB8.c(io60Var8, this) == wneVar10) {
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
                    bq9 bq9VarB9 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var9 = new io60((gq50) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB9.c(io60Var9, this) == wneVar11) {
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
                    bq9 bq9VarB10 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var10 = new io60((ne70) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB10.c(io60Var10, this) == wneVar12) {
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
                    bq9 bq9VarB11 = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var11 = new io60((ne70) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB11.c(io60Var11, this) == wneVar13) {
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
                    bq9 bq9VarB12 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var12 = new io60((nf60) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB12.c(io60Var12, this) == wneVar14) {
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
                    bq9 bq9VarB13 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var13 = new io60((cg70) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB13.c(io60Var13, this) == wneVar15) {
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
                    bq9 bq9VarB14 = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var14 = new io60((cg70) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB14.c(io60Var14, this) == wneVar16) {
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
                    bq9 bq9VarB15 = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    io60 io60Var15 = new io60((nf60) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB15.c(io60Var15, this) == wneVar17) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var = new lh70((nf60) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB16.c(lh70Var, this) == wneVar18) {
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
                    bq9 bq9VarB17 = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var2 = new lh70((nf60) obj2, (byte) 1);
                    this.j = true;
                    if (bq9VarB17.c(lh70Var2, this) == wneVar19) {
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
                    bq9 bq9VarB18 = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var3 = new lh70((nf60) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB18.c(lh70Var3, this) == wneVar20) {
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
                    bq9 bq9VarB19 = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var4 = new lh70((zi70) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB19.c(lh70Var4, this) == wneVar21) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var5 = new lh70((zi70) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB20.c(lh70Var5, this) == wneVar22) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var6 = new lh70((xj70) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB21.c(lh70Var6, this) == wneVar23) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var7 = new lh70((xj70) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB22.c(lh70Var7, this) == wneVar24) {
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
                    bq9 bq9VarB23 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var8 = new lh70((nk70) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB23.c(lh70Var8, this) == wneVar25) {
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
                    bq9 bq9VarB24 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var9 = new lh70((nk70) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB24.c(lh70Var9, this) == wneVar26) {
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
                    bq9 bq9VarB25 = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var10 = new lh70((nf60) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB25.c(lh70Var10, this) == wneVar27) {
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
                    bq9 bq9VarB26 = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var11 = new lh70((tl70) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB26.c(lh70Var11, this) == wneVar28) {
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
                    bq9 bq9VarB27 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var12 = new lh70((tl70) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB27.c(lh70Var12, this) == wneVar29) {
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
                    bq9 bq9VarB28 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lh70 lh70Var13 = new lh70((an70) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB28.c(lh70Var13, this) == wneVar30) {
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
    public az60(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(i89 i89Var, clz clzVar, nf60 nf60Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(i89 i89Var, clz clzVar, bz60 bz60Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = bz60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(itb itbVar, clz clzVar, nf60 nf60Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(itb itbVar, clz clzVar, nf60 nf60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(itb itbVar, clz clzVar, nf60 nf60Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(itb itbVar, clz clzVar, nf60 nf60Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(itb itbVar, clz clzVar, ne70 ne70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = ne70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(itb itbVar, clz clzVar, cg70 cg70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = cg70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(itb itbVar, clz clzVar, zi70 zi70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = zi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(itb itbVar, clz clzVar, tl70 tl70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = tl70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, vf20 vf20Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, nf60 nf60Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, nf60 nf60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = nf60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, bz60 bz60Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = bz60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, ne70 ne70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = ne70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, cg70 cg70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = cg70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, zi70 zi70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = zi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, xj70 xj70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = xj70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, xj70 xj70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = xj70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, nk70 nk70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = nk70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, nk70 nk70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = nk70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, tl70 tl70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = tl70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(gmq gmqVar, clz clzVar, an70 an70Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = an70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(m430 m430Var, clz clzVar, vf20 vf20Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = m430Var;
        this.k = clzVar;
        this.m = vf20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(n270 n270Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = n270Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az60(l570 l570Var, List list, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.l = l570Var;
        this.k = list;
        this.m = function1;
    }
}
