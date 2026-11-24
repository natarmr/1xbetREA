package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class yxa extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, (byte) 0);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, (char) 0);
            case 3:
                lkz lkzVar4 = lkz.f20223a;
                return new yxa((i89) this.k, (clz) obj3, (o47) obj2, yjeVar);
            case 4:
                lkz lkzVar5 = lkz.f20223a;
                return new yxa((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, (byte) 0);
            case 5:
                yxa yxaVar = new yxa(obj3, obj2, yjeVar, (byte) 5);
                yxaVar.k = obj;
                return yxaVar;
            case 6:
                return new yxa(this.k, obj3, obj2, yjeVar, (byte) 6);
            case 7:
                lkz lkzVar6 = lkz.f20223a;
                return new yxa((xae0) this.k, (clz) obj3, (ggb) obj2, yjeVar);
            case 8:
                lkz lkzVar7 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (ggb) obj2, yjeVar);
            case 9:
                lkz lkzVar8 = lkz.f20223a;
                return new yxa((vae0) this.k, (clz) obj3, (ggb) obj2, yjeVar);
            case 10:
                lkz lkzVar9 = lkz.f20223a;
                return new yxa((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, (char) 0);
            case 11:
                lkz lkzVar10 = lkz.f20223a;
                return new yxa((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, 0);
            case 12:
                lkz lkzVar11 = lkz.f20223a;
                return new yxa((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, (short) 0);
            case 13:
                lkz lkzVar12 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (fob) obj2, yjeVar);
            case 14:
                lkz lkzVar13 = lkz.f20223a;
                return new yxa((fnq) this.k, (clz) obj3, (c48) obj2, yjeVar);
            case 15:
                lkz lkzVar14 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (wib) obj2, yjeVar);
            case 16:
                lkz lkzVar15 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, 0);
            case 17:
                lkz lkzVar16 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, (short) 0);
            case 18:
                lkz lkzVar17 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, (byte) 0, false);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar18 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, (byte) 0, (byte) 0);
            case 20:
                lkz lkzVar19 = lkz.f20223a;
                return new yxa((fnq) this.k, (clz) obj3, (c48) obj2, yjeVar, (byte) 0);
            case 21:
                lkz lkzVar20 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (fob) obj2, yjeVar, (byte) 0);
            case 22:
                lkz lkzVar21 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, (byte) 0, (char) 0);
            case 23:
                lkz lkzVar22 = lkz.f20223a;
                return new yxa((dnq) this.k, (clz) obj3, (pqb) obj2, yjeVar);
            case 24:
                lkz lkzVar23 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (pqb) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar24 = lkz.f20223a;
                return new yxa((gmq) this.k, (clz) obj3, (pqb) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar25 = lkz.f20223a;
                return new yxa((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, (byte) 0, false);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                yxa yxaVar2 = new yxa(obj3, obj2, yjeVar, (byte) 27);
                yxaVar2.k = obj;
                return yxaVar2;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new yxa(this.k, obj3, obj2, yjeVar, (byte) 28);
            default:
                yxa yxaVar3 = new yxa(obj3, obj2, yjeVar, (byte) 29);
                yxaVar3.k = obj;
                return yxaVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((yxa) create((cx7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yxa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        byte b = this.i;
        byte b2 = 0;
        byte b3 = 10;
        byte b4 = 12;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var = new k19((c48) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB.c(k19Var, this) == wneVar) {
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
                    k19 k19Var2 = new k19((c48) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB2.c(k19Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var3 = new k19((c48) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB3.c(k19Var3, this) == wneVar3) {
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
                    f5b f5bVar = new f5b((o47) obj2, b2);
                    this.j = true;
                    if (bq9VarB4.c(f5bVar, this) == wneVar4) {
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
                    f5b f5bVar2 = new f5b((o47) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB5.c(f5bVar2, this) == wneVar5) {
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
                y7b y7bVar = (y7b) obj3;
                cx7 cx7Var = (cx7) this.k;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    if (cx7Var instanceof yw7) {
                        y7bVar.z.g(idf0.f14583a);
                        y7bVar.x.b(lx7.f20801a);
                    } else if (((r6b) y7bVar.D()).f instanceof gs20) {
                        y7bVar.x.b(ox7.f25998a);
                    }
                    kea keaVar = new kea((xvm0) obj2, cx7Var, b4);
                    int i = y7b.K;
                    y7bVar.H(keaVar);
                    if (cx7Var instanceof ww7) {
                        o030 o030Var = y7bVar.v;
                        ArrayList arrayList = ((ww7) cx7Var).f39874a;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(r3d.r(((ou20) it.next()).f25856a));
                        }
                        s030 s030Var = new s030(r3d.r(arrayList2));
                        this.k = null;
                        this.j = true;
                        if (o030Var.a(s030Var, this) == wneVar6) {
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
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (((slp) this.k).f) {
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
                ((Function1) ((pz40) obj2).getValue()).invoke(mmp.f22051a);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.c);
                    f5b f5bVar3 = new f5b((ggb) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB6.c(f5bVar3, this) == wneVar8) {
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
                    bq9 bq9VarB7 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar4 = new f5b((ggb) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB7.c(f5bVar4, this) == wneVar9) {
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
                    bq9 bq9VarB8 = hkb.B((vae0) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar5 = new f5b((ggb) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB8.c(f5bVar5, this) == wneVar10) {
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
                    bq9 bq9VarB9 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar6 = new f5b((o47) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB9.c(f5bVar6, this) == wneVar11) {
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
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar7 = new f5b((o47) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB10.c(f5bVar7, this) == wneVar12) {
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
                    bq9 bq9VarB11 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar8 = new f5b((o47) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB11.c(f5bVar8, this) == wneVar13) {
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
                    bq9 bq9VarB12 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar9 = new f5b((fob) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB12.c(f5bVar9, this) == wneVar14) {
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
                    bq9 bq9VarB13 = hkb.B((fnq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar10 = new f5b((c48) obj2, b3);
                    this.j = true;
                    if (bq9VarB13.c(f5bVar10, this) == wneVar15) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar11 = new f5b((wib) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB14.c(f5bVar11, this) == wneVar16) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar12 = new f5b((c48) obj2, b4);
                    this.j = true;
                    if (bq9VarB15.c(f5bVar12, this) == wneVar17) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar13 = new f5b((c48) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB16.c(f5bVar13, this) == wneVar18) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar14 = new f5b((c48) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB17.c(f5bVar14, this) == wneVar19) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar15 = new f5b((c48) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB18.c(f5bVar15, this) == wneVar20) {
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
                    bq9 bq9VarB19 = hkb.B((fnq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar16 = new f5b((c48) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB19.c(f5bVar16, this) == wneVar21) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar17 = new f5b((fob) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB20.c(f5bVar17, this) == wneVar22) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar18 = new f5b((c48) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB21.c(f5bVar18, this) == wneVar23) {
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
                    bq9 bq9VarB22 = hkb.B((dnq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar19 = new f5b((pqb) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB22.c(f5bVar19, this) == wneVar24) {
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
                    bq9 bq9VarB23 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar20 = new f5b((pqb) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB23.c(f5bVar20, this) == wneVar25) {
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
                    bq9 bq9VarB24 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar21 = new f5b((pqb) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB24.c(f5bVar21, this) == wneVar26) {
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
                    bq9 bq9VarB25 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    f5b f5bVar22 = new f5b((o47) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB25.c(f5bVar22, this) == wneVar27) {
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
                vne vneVar = (vne) this.k;
                Object obj4 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    htb htbVarL = ((ktb) obj2).l(vneVar);
                    this.k = null;
                    this.j = true;
                    Object objM = xkb.M((kmq) obj3, htbVarL, true, this);
                    if (objM != obj4) {
                        objM = Unit.f46060a;
                    }
                    if (objM == obj4) {
                        return obj4;
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
                gbi0 gbi0Var = (gbi0) obj2;
                wne wneVar28 = wne.f39444a;
                boolean z29 = this.j;
                try {
                    if (!z29) {
                        z1x.P(obj);
                        this.j = true;
                        if (((gmq) this.k).c((mfi0) obj3, this) == wneVar28) {
                            return wneVar28;
                        }
                    } else {
                        if (!z29) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    gbi0Var.f();
                    return Unit.f46060a;
                } catch (Throwable th) {
                    gbi0Var.f();
                    throw th;
                }
            default:
                wne wneVar29 = wne.f39444a;
                boolean z30 = this.j;
                try {
                    if (!z30) {
                        z1x.P(obj);
                        jbi0 jbi0Var = (jbi0) obj3;
                        e0g0 e0g0Var = j0g0.b;
                        this.k = null;
                        this.j = true;
                        if (jbi0Var.m(this, obj2) == wneVar29) {
                            return wneVar29;
                        }
                    } else {
                        if (!z30) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    g0g0Var = Unit.f46060a;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th2);
                }
                return new ztb(!(g0g0Var instanceof g0g0) ? Unit.f46060a : new xtb(j0g0.a(g0g0Var)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, ggb ggbVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ggbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, wib wibVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wibVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, fob fobVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, fob fobVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, pqb pqbVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pqbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(gmq gmqVar, clz clzVar, pqb pqbVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pqbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(dnq dnqVar, clz clzVar, pqb pqbVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = pqbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(fnq fnqVar, clz clzVar, c48 c48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = fnqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(fnq fnqVar, clz clzVar, c48 c48Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = fnqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(vae0 vae0Var, clz clzVar, ggb ggbVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = ggbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(xae0 xae0Var, clz clzVar, ggb ggbVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ggbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxa(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxa(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
