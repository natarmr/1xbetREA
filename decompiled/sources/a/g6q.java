package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g6q extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = brkVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                xae0 xae0Var = (xae0) this.l;
                clz clzVar = (clz) this.k;
                lkz lkzVar = lkz.f20223a;
                return new g6q(xae0Var, clzVar, (h6q) obj2, yjeVar);
            case 1:
                gmq gmqVar = (gmq) this.l;
                clz clzVar2 = (clz) this.k;
                lkz lkzVar2 = lkz.f20223a;
                return new g6q(gmqVar, clzVar2, (h6q) obj2, yjeVar);
            case 2:
                gmq gmqVar2 = (gmq) this.l;
                clz clzVar3 = (clz) this.k;
                lkz lkzVar3 = lkz.f20223a;
                return new g6q(gmqVar2, clzVar3, (h6q) obj2, yjeVar, (byte) 0);
            case 3:
                xae0 xae0Var2 = (xae0) this.l;
                clz clzVar4 = (clz) this.k;
                lkz lkzVar4 = lkz.f20223a;
                return new g6q(xae0Var2, clzVar4, (h6q) obj2, yjeVar, (byte) 0);
            case 4:
                xae0 xae0Var3 = (xae0) this.l;
                clz clzVar5 = (clz) this.k;
                lkz lkzVar5 = lkz.f20223a;
                return new g6q(xae0Var3, clzVar5, (h6q) obj2, yjeVar, (char) 0);
            case 5:
                i89 i89Var = (i89) this.l;
                clz clzVar6 = (clz) this.k;
                lkz lkzVar6 = lkz.f20223a;
                return new g6q(i89Var, clzVar6, (brk) obj2, yjeVar);
            case 6:
                i89 i89Var2 = (i89) this.l;
                clz clzVar7 = (clz) this.k;
                lkz lkzVar7 = lkz.f20223a;
                return new g6q(i89Var2, clzVar7, (brk) obj2, yjeVar, (byte) 0);
            case 7:
                g6q g6qVar = new g6q(this.k, obj2, yjeVar, (byte) 7);
                g6qVar.l = obj;
                return g6qVar;
            case 8:
                g6q g6qVar2 = new g6q(this.k, obj2, yjeVar, (byte) 8);
                g6qVar2.l = obj;
                return g6qVar2;
            case 9:
                g6q g6qVar3 = new g6q(this.k, obj2, yjeVar, (byte) 9);
                g6qVar3.l = obj;
                return g6qVar3;
            case 10:
                g6q g6qVar4 = new g6q((kmq) obj2, yjeVar);
                g6qVar4.k = ((ztb) obj).f44949a;
                return g6qVar4;
            case 11:
                g6q g6qVar5 = new g6q((gmq[]) this.k, yjeVar, (wdr) obj2, (byte) 11);
                g6qVar5.l = obj;
                return g6qVar5;
            case 12:
                g6q g6qVar6 = new g6q((gmq[]) this.k, yjeVar, (wdr) obj2, (byte) 12);
                g6qVar6.l = obj;
                return g6qVar6;
            case 13:
                return new g6q(this.l, this.k, obj2, yjeVar, (byte) 13);
            case 14:
                xae0 xae0Var4 = (xae0) this.l;
                clz clzVar8 = (clz) this.k;
                lkz lkzVar8 = lkz.f20223a;
                return new g6q(xae0Var4, clzVar8, (jjr) obj2, yjeVar);
            case 15:
                xae0 xae0Var5 = (xae0) this.l;
                clz clzVar9 = (clz) this.k;
                lkz lkzVar9 = lkz.f20223a;
                return new g6q(xae0Var5, clzVar9, (kjr) obj2, yjeVar);
            case 16:
                xae0 xae0Var6 = (xae0) this.l;
                clz clzVar10 = (clz) this.k;
                lkz lkzVar10 = lkz.f20223a;
                return new g6q(xae0Var6, clzVar10, (jjr) obj2, yjeVar, (byte) 0);
            case 17:
                gmq gmqVar3 = (gmq) this.l;
                clz clzVar11 = (clz) this.k;
                lkz lkzVar11 = lkz.f20223a;
                return new g6q(gmqVar3, clzVar11, (kjr) obj2, yjeVar);
            case 18:
                i89 i89Var3 = (i89) this.l;
                clz clzVar12 = (clz) this.k;
                lkz lkzVar12 = lkz.f20223a;
                return new g6q(i89Var3, clzVar12, (sxk) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i89 i89Var4 = (i89) this.l;
                clz clzVar13 = (clz) this.k;
                lkz lkzVar13 = lkz.f20223a;
                return new g6q(i89Var4, clzVar13, (brk) obj2, yjeVar, (char) 0);
            case 20:
                gmq gmqVar4 = (gmq) this.l;
                clz clzVar14 = (clz) this.k;
                lkz lkzVar14 = lkz.f20223a;
                return new g6q(gmqVar4, clzVar14, (jv0) obj2, yjeVar);
            case 21:
                gmq gmqVar5 = (gmq) this.l;
                clz clzVar15 = (clz) this.k;
                lkz lkzVar15 = lkz.f20223a;
                return new g6q(gmqVar5, clzVar15, (g6g) obj2, yjeVar);
            case 22:
                return new g6q((l0s) this.l, (m0k0) this.k, (m97) obj2, this.j, yjeVar);
            case 23:
                return new g6q(this.l, this.k, obj2, yjeVar, (byte) 23);
            case 24:
                return new g6q(this.l, this.k, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i89 i89Var5 = (i89) this.l;
                clz clzVar16 = (clz) this.k;
                lkz lkzVar16 = lkz.f20223a;
                return new g6q(i89Var5, clzVar16, (brk) obj2, yjeVar, 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new g6q(this.l, this.k, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i89 i89Var6 = (i89) this.l;
                clz clzVar17 = (clz) this.k;
                lkz lkzVar17 = lkz.f20223a;
                return new g6q(i89Var6, clzVar17, (brk) obj2, yjeVar, (short) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var7 = (i89) this.l;
                clz clzVar18 = (clz) this.k;
                lkz lkzVar18 = lkz.f20223a;
                return new g6q(i89Var7, clzVar18, (brk) obj2, yjeVar, (byte) 0, false);
            default:
                i89 i89Var8 = (i89) this.l;
                clz clzVar19 = (clz) this.k;
                lkz lkzVar19 = lkz.f20223a;
                return new g6q(i89Var8, clzVar19, (brk) obj2, yjeVar, (byte) 0, (byte) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((g6q) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Object obj3 = ((ztb) obj).f44949a;
                g6q g6qVar = new g6q((kmq) this.m, (yje) obj2);
                g6qVar.k = obj3;
                return g6qVar.invokeSuspend(Unit.f46060a);
            case 11:
                return ((g6q) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((g6q) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g6q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        byte b2 = 27;
        byte b3 = 28;
        byte b4 = 16;
        byte b5 = 22;
        Object obj2 = this.m;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar = new l4p((h6q) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB.c(l4pVar, this) == wneVar) {
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
                    l4p l4pVar2 = new l4p((h6q) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB2.c(l4pVar2, this) == wneVar2) {
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
                    l4p l4pVar3 = new l4p((h6q) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB3.c(l4pVar3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar4 = new l4p((h6q) obj2, b4);
                    this.j = true;
                    if (bq9VarB4.c(l4pVar4, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar5 = new l4p((h6q) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB5.c(l4pVar5, this) == wneVar5) {
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
                    l4p l4pVar6 = new l4p((brk) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB6.c(l4pVar6, this) == wneVar6) {
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
                    l4p l4pVar7 = new l4p((brk) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB7.c(l4pVar7, this) == wneVar7) {
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
                if (z8) {
                    if (z8) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                vne vneVar = (vne) this.l;
                ArrayList arrayList = new ArrayList();
                qoj0 qoj0Var = ((gy40) this.k).f12108a;
                yj2 yj2Var = new yj2((Object) arrayList, (Object) vneVar, obj2, (byte) 12);
                this.j = true;
                qoj0Var.c(yj2Var, this);
                return wneVar8;
            case 8:
                vne vneVar2 = (vne) this.l;
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    this.l = null;
                    this.j = true;
                    if (((xdr) this.k).F(vneVar2, (kmq) obj2, this) == wneVar9) {
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
                    Object obj3 = this.l;
                    this.j = true;
                    if (((xdr) this.k).F((f5b) obj2, obj3, this) == wneVar10) {
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
                Object obj4 = this.k;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    kmq kmqVar = (kmq) obj2;
                    if (!(obj4 instanceof ytb)) {
                        this.k = null;
                        this.l = obj4;
                        this.j = true;
                        if (kmqVar.a(obj4, this) == wneVar11) {
                            return wneVar11;
                        }
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj4 = this.l;
                    z1x.P(obj);
                }
                if (!(obj4 instanceof xtb)) {
                    return Boolean.TRUE;
                }
                Throwable thA = ztb.a(obj4);
                if (thA == null) {
                    return Boolean.FALSE;
                }
                throw thA;
            case 11:
                kmq kmqVar2 = (kmq) this.l;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    gmq[] gmqVarArr = (gmq[]) this.k;
                    pul pulVar = pul.j;
                    zo1 zo1Var = new zo1(yjeVar, (ydr) obj2, b2);
                    this.l = null;
                    this.j = true;
                    if (tdc.G(this, kmqVar2, zo1Var, pulVar, gmqVarArr) == wneVar12) {
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
                kmq kmqVar3 = (kmq) this.l;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    gmq[] gmqVarArr2 = (gmq[]) this.k;
                    pul pulVar2 = pul.j;
                    zo1 zo1Var2 = new zo1(yjeVar, (aer) obj2, b3);
                    this.l = null;
                    this.j = true;
                    if (tdc.G(this, kmqVar3, zo1Var2, pulVar2, gmqVarArr2) == wneVar13) {
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
                    gy40 gy40Var = (gy40) this.l;
                    nlx nlxVar = (nlx) this.k;
                    this.j = true;
                    if (gy40Var.a(nlxVar, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
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
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar8 = new l4p((jjr) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB8.c(l4pVar8, this) == wneVar15) {
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
                    bq9 bq9VarB9 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar9 = new l4p((kjr) obj2, b5);
                    this.j = true;
                    if (bq9VarB9.c(l4pVar9, this) == wneVar16) {
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
                    bq9 bq9VarB10 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar10 = new l4p((jjr) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB10.c(l4pVar10, this) == wneVar17) {
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
                    bq9 bq9VarB11 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar11 = new l4p((kjr) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB11.c(l4pVar11, this) == wneVar18) {
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
                    bq9 bq9VarB12 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar12 = new l4p((sxk) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB12.c(l4pVar12, this) == wneVar19) {
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
                    bq9 bq9VarB13 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar13 = new l4p((brk) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB13.c(l4pVar13, this) == wneVar20) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar14 = new l4p((jv0) obj2, b2);
                    this.j = true;
                    if (bq9VarB14.c(l4pVar14, this) == wneVar21) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar15 = new l4p((g6g) obj2, b3);
                    this.j = true;
                    if (bq9VarB15.c(l4pVar15, this) == wneVar22) {
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
                z1x.P(obj);
                l0s l0sVar = (l0s) this.l;
                l0sVar.g.s(epv0.a0((m0k0) this.k), j2e.W((m97) obj2));
                l0sVar.A.f(new rm7(this.j));
                return Unit.f46060a;
            case 23:
                l0s l0sVar2 = (l0s) this.l;
                wne wneVar24 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    pmi pmiVar = l0sVar2.p;
                    ms2 ms2Var = l0sVar2.z;
                    this.j = true;
                    obj = ((cr) pmiVar.d).b((m0k0) this.k, (zxj0) obj2, phu0.Y(ms2Var), hrs.f13547a, this);
                    if (obj == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                l0sVar2.A.f(new tm7((aud) obj, ctc.b));
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    this.j = true;
                    if (dtb.R((xcz) this.l, (a4x) this.k, (dja) obj2, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    l4p l4pVar16 = new l4p((brk) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB16.c(l4pVar16, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    dja djaVar = (dja) this.l;
                    if (djaVar == null) {
                        return Unit.f46060a;
                    }
                    gmq gmqVarW = i120.W(ydx.V(null, new gmo((l7m0) this.k, djaVar, b5)));
                    o4m o4mVar = new o4m((xcz) obj2, djaVar, b4);
                    this.j = true;
                    if (gmqVarW.c(o4mVar, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    g7s g7sVar = new g7s((brk) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB17.c(g7sVar, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    g7s g7sVar2 = new g7s((brk) obj2, (byte) 1);
                    this.j = true;
                    if (bq9VarB18.c(g7sVar2, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    g7s g7sVar3 = new g7s((brk) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB19.c(g7sVar3, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(i89 i89Var, clz clzVar, sxk sxkVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = sxkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(gmq gmqVar, clz clzVar, jv0 jv0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = jv0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(gmq gmqVar, clz clzVar, g6g g6gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = g6gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(gmq gmqVar, clz clzVar, h6q h6qVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = h6qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(gmq gmqVar, clz clzVar, h6q h6qVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = h6qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(gmq gmqVar, clz clzVar, kjr kjrVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = kjrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(kmq kmqVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        this.m = kmqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(l0s l0sVar, m0k0 m0k0Var, m97 m97Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        this.l = l0sVar;
        this.k = m0k0Var;
        this.m = m97Var;
        this.j = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(xae0 xae0Var, clz clzVar, h6q h6qVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = h6qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(xae0 xae0Var, clz clzVar, h6q h6qVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = h6qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(xae0 xae0Var, clz clzVar, h6q h6qVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = h6qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(xae0 xae0Var, clz clzVar, jjr jjrVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = jjrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(xae0 xae0Var, clz clzVar, jjr jjrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = jjrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6q(xae0 xae0Var, clz clzVar, kjr kjrVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = kjrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6q(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6q(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6q(gmq[] gmqVarArr, yje yjeVar, wdr wdrVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gmqVarArr;
        this.m = wdrVar;
    }
}
