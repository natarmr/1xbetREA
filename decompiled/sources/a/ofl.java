package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ofl extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new ofl((gmq) this.k, (clz) obj3, (pfl) obj2, yjeVar);
            case 1:
                return new ofl(this.j, (uz40) this.k, (agk0) obj3, (l7m0) obj2, yjeVar);
            case 2:
                ofl oflVar = new ofl(obj3, obj2, yjeVar, (byte) 2);
                oflVar.k = obj;
                return oflVar;
            case 3:
                lkz lkzVar2 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar);
            case 4:
                lkz lkzVar3 = lkz.f20223a;
                return new ofl((u6n0) this.k, (clz) obj3, (pfl) obj2, yjeVar);
            case 5:
                lkz lkzVar4 = lkz.f20223a;
                return new ofl((gmq) this.k, (clz) obj3, (pfl) obj2, yjeVar, (byte) 0);
            case 6:
                lkz lkzVar5 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (byte) 0);
            case 7:
                lkz lkzVar6 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (char) 0);
            case 8:
                lkz lkzVar7 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, 0);
            case 9:
                lkz lkzVar8 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (short) 0);
            case 10:
                lkz lkzVar9 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (byte) 0, false);
            case 11:
                lkz lkzVar10 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (byte) 0, (byte) 0);
            case 12:
                ofl oflVar2 = new ofl(obj3, obj2, yjeVar, (byte) 12);
                oflVar2.k = obj;
                return oflVar2;
            case 13:
                ofl oflVar3 = new ofl(obj3, obj2, yjeVar, (byte) 13);
                oflVar3.k = obj;
                return oflVar3;
            case 14:
                lkz lkzVar11 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (byte) 0, (char) 0);
            case 15:
                lkz lkzVar12 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (byte) 0, 0);
            case 16:
                ofl oflVar4 = new ofl(obj3, obj2, yjeVar, (byte) 16);
                oflVar4.k = obj;
                return oflVar4;
            case 17:
                lkz lkzVar13 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (byte) 0, (short) 0);
            case 18:
                lkz lkzVar14 = lkz.f20223a;
                return new ofl((gmq) this.k, (clz) obj3, (sxk) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar15 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (char) 0, false);
            case 20:
                lkz lkzVar16 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (char) 0, (byte) 0);
            case 21:
                lkz lkzVar17 = lkz.f20223a;
                return new ofl((dnq) this.k, (clz) obj3, (r5p) obj2, yjeVar);
            case 22:
                lkz lkzVar18 = lkz.f20223a;
                return new ofl((gmq) this.k, (clz) obj3, (r5p) obj2, yjeVar);
            case 23:
                lkz lkzVar19 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (char) 0, (char) 0);
            case 24:
                return new ofl((diu0) this.k, (Serializable) obj3, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar20 = lkz.f20223a;
                return new ofl((dnq) this.k, (clz) obj3, (sxk) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ofl((diu0) this.k, (Serializable) obj3, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar21 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (char) 0, 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar22 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, (char) 0, (short) 0);
            default:
                lkz lkzVar23 = lkz.f20223a;
                return new ofl((i89) this.k, (clz) obj3, (brk) obj2, yjeVar, 0, false);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ofl) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ofl) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ofl) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ofl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wgh0 wgh0Var;
        byte b = this.i;
        byte b2 = 3;
        byte b3 = 27;
        byte b4 = 10;
        byte b5 = 12;
        byte b6 = 0;
        Object obj2 = this.m;
        Object obj3 = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar = new abk((pfl) obj2, b4);
                    this.j = true;
                    if (bq9VarB.c(abkVar, this) == wneVar) {
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
                uz40 uz40Var = (uz40) this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (this.j) {
                    uts0 uts0Var = w3m.f38508a;
                    if (((agk0) obj3).l() > 0.0f && ((Boolean) ((l7m0) obj2).getValue()).booleanValue()) {
                        uz40Var.o1(Boolean.TRUE);
                    }
                } else {
                    uz40Var.o1(Boolean.FALSE);
                }
                return Unit.f46060a;
            case 2:
                pz40 pz40Var = (pz40) obj2;
                rah0 rah0Var = (rah0) obj3;
                vne vneVar = (vne) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    qjj.W(vneVar, null, null, new n4m(rah0Var, pz40Var, yjeVar, b6), 3);
                    vsg0 vsg0VarV = ydx.V(null, new pdb(rah0Var, (byte) 1));
                    o4m o4mVar = new o4m(rah0Var, pz40Var, b6);
                    this.k = null;
                    this.j = true;
                    if (vsg0VarV.c(o4mVar, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar2 = new abk((brk) obj2, b5);
                    this.j = true;
                    if (bq9VarB2.c(abkVar2, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((u6n0) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar3 = new abk((pfl) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB3.c(abkVar3, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar4 = new abk((pfl) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB4.c(abkVar4, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar5 = new abk((brk) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB5.c(abkVar5, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar6 = new abk((brk) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB6.c(abkVar6, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar7 = new abk((brk) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB7.c(abkVar7, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar8 = new abk((brk) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB8.c(abkVar8, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar9 = new abk((brk) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB9.c(abkVar9, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar10 = new abk((brk) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB10.c(abkVar10, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                qpg0 qpg0Var = (qpg0) this.k;
                wne wneVar13 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (((nbo) obj3).b.k0(qpg0Var, (ArrayList) obj2) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                qpg0 qpg0Var2 = (qpg0) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (((qco) obj3).b.k0(qpg0Var2, (ArrayList) obj2) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar11 = new abk((brk) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB11.c(abkVar11, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar12 = new abk((brk) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB12.c(abkVar12, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                kmq kmqVar = (kmq) this.k;
                wne wneVar17 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    ((lie0) obj3).f20100a = System.currentTimeMillis();
                    this.k = null;
                    this.j = true;
                    if (((Function2) obj2).invoke(kmqVar, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar13 = new abk((brk) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB13.c(abkVar13, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar14 = new abk((sxk) obj2, b3);
                    this.j = true;
                    if (bq9VarB14.c(abkVar14, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    abk abkVar15 = new abk((brk) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB15.c(abkVar15, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    l4p l4pVar = new l4p((brk) obj2, b6);
                    this.j = true;
                    if (bq9VarB16.c(l4pVar, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((dnq) this.k, ((clz) obj3).x(), lkz.d);
                    l4p l4pVar2 = new l4p((r5p) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB17.c(l4pVar2, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    l4p l4pVar3 = new l4p((r5p) obj2, b2);
                    this.j = true;
                    if (bq9VarB18.c(l4pVar3, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    l4p l4pVar4 = new l4p((brk) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB19.c(l4pVar4, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                mlr mlrVar = (mlr) obj3;
                ccp ccpVar = (ccp) this.k;
                wne wneVar25 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    if (!ccpVar.M.c()) {
                        return Unit.f46060a;
                    }
                    xr xrVar = ccpVar.q;
                    String strN = ccpVar.N(mlrVar);
                    this.j = true;
                    if (xrVar.m(mlrVar, false, 8201, strN, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                fun funVar = new fun((hc80) obj2, mlrVar, b3);
                int i = ccp.u0;
                ccpVar.H(funVar);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((dnq) this.k, ((clz) obj3).x(), lkz.e);
                    l4p l4pVar5 = new l4p((sxk) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB20.c(l4pVar5, this) == wneVar26) {
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
                String str = (String) obj3;
                org.xplatform.favorites.impl.presentation.category.f fVar = (org.xplatform.favorites.impl.presentation.category.f) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(500L, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var = fVar.y;
                p7m0Var.getClass();
                p7m0Var.o(null, str);
                if (str.length() > 0) {
                    int iOrdinal = org.xplatform.favorites.impl.presentation.category.b.a(fVar.u).ordinal();
                    if (iOrdinal == 0) {
                        wgh0Var = wgh0.FAVORITES_TEAM;
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        wgh0Var = wgh0.FAVORITES_CHAMP;
                    }
                    fVar.q.h(wgh0Var, str, null);
                    fVar.r.D(null, wgh0Var.f39117a, str);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    l4p l4pVar6 = new l4p((brk) obj2, b4);
                    this.j = true;
                    if (bq9VarB21.c(l4pVar6, this) == wneVar28) {
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
                    bq9 bq9VarB22 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    l4p l4pVar7 = new l4p((brk) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB22.c(l4pVar7, this) == wneVar29) {
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
                    bq9 bq9VarB23 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    l4p l4pVar8 = new l4p((brk) obj2, b5);
                    this.j = true;
                    if (bq9VarB23.c(l4pVar8, this) == wneVar30) {
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
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b, short s) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, char c, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, char c, char c2) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, char c, int i) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, char c, short s) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, char c, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, int i, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(i89 i89Var, clz clzVar, brk brkVar, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = brkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(gmq gmqVar, clz clzVar, sxk sxkVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = sxkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(gmq gmqVar, clz clzVar, r5p r5pVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = r5pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(dnq dnqVar, clz clzVar, sxk sxkVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = sxkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(dnq dnqVar, clz clzVar, r5p r5pVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = r5pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(u6n0 u6n0Var, clz clzVar, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = u6n0Var;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofl(diu0 diu0Var, Serializable serializable, Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = diu0Var;
        this.l = serializable;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofl(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofl(boolean z, uz40 uz40Var, agk0 agk0Var, l7m0 l7m0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.j = z;
        this.k = uz40Var;
        this.l = agk0Var;
        this.m = l7m0Var;
    }
}
