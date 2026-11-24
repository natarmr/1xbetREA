package a;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;
import org.xplatform.limits_ne.impl.presentation.LimitsNeScreens$LimitsNeBetLockFragmentScreen;
import org.xplatform.limits_ne.impl.presentation.LimitsNeScreens$LimitsNeDepositLockFragmentScreen;
import org.xplatform.limits_ne.impl.presentation.LimitsNeScreens$LimitsNeSessionTimeLockFragmentScreen;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$RealityLimitLockScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class o120 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ w220 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o120(w220 w220Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = w220Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w220 w220Var = this.k;
        switch (b) {
            case 0:
                return new o120(w220Var, yjeVar, (byte) 0);
            case 1:
                return new o120(w220Var, yjeVar, (byte) 1);
            case 2:
                return new o120(w220Var, yjeVar, (byte) 2);
            case 3:
                return new o120(w220Var, yjeVar, (byte) 3);
            case 4:
                return new o120(w220Var, yjeVar, (byte) 4);
            case 5:
                o120 o120Var = new o120(w220Var, yjeVar, (byte) 5);
                o120Var.j = ((Boolean) obj).booleanValue();
                return o120Var;
            case 6:
                return new o120(w220Var, yjeVar, (byte) 6);
            case 7:
                return new o120(w220Var, yjeVar, (byte) 7);
            case 8:
                return new o120(w220Var, yjeVar, (byte) 8);
            case 9:
                o120 o120Var2 = new o120(w220Var, yjeVar, (byte) 9);
                o120Var2.j = ((Boolean) obj).booleanValue();
                return o120Var2;
            case 10:
                return new o120(w220Var, yjeVar, (byte) 10);
            case 11:
                o120 o120Var3 = new o120(w220Var, yjeVar, (byte) 11);
                o120Var3.j = ((Boolean) obj).booleanValue();
                return o120Var3;
            case 12:
                return new o120(w220Var, yjeVar, (byte) 12);
            case 13:
                return new o120(w220Var, yjeVar, (byte) 13);
            case 14:
                return new o120(w220Var, yjeVar, (byte) 14);
            case 15:
                return new o120(w220Var, yjeVar, (byte) 15);
            case 16:
                return new o120(w220Var, yjeVar, (byte) 16);
            case 17:
                o120 o120Var4 = new o120(w220Var, yjeVar, (byte) 17);
                o120Var4.j = ((Boolean) obj).booleanValue();
                return o120Var4;
            default:
                return new o120(w220Var, yjeVar, (byte) 18);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((o120) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((o120) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((o120) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((o120) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((o120) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((o120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws oqt0 {
        boolean z;
        Object value;
        byte b = this.i;
        byte b2 = 8;
        w220 w220Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    pyu pyuVar = w220Var.I;
                    this.j = true;
                    if (((y3v) pyuVar.f27815a).y(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bj5 bj5Var = w220Var.L;
                    this.j = true;
                    bj5Var.getClass();
                    if (zvw.g() == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    ywq0 ywq0Var = w220Var.M;
                    this.j = true;
                    if (qjj.d0(((mne) ywq0Var.c).b, new jtb(ywq0Var, yjeVar, (byte) 6), this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    yuu yuuVar = w220Var.a0;
                    this.j = true;
                    obj = yuuVar.r(this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    i1w0 i1w0VarS = w220Var.s.s();
                    k0w0 k0w0Var = new k0w0(i1w0VarS);
                    w220Var.d0.getClass();
                    k0w0Var.h(new ResponsibleGamblingScreens$RealityLimitLockScreen());
                    ListIterator listIteratorO = b1j.o(i1w0VarS, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0VarS.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    w220Var.z();
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    if (((ivp0) w220Var.S0.f21107a.c).f15457a.length() > 0) {
                        m3c m3cVar = w220Var.T0;
                        this.j = true;
                        cyu cyuVar = m3cVar.f21107a;
                        obj = cyuVar.q(((ivp0) cyuVar.c).f15457a, this);
                        if (obj == wneVar5) {
                            return wneVar5;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                dup0 dup0Var = (dup0) obj;
                w220Var.A1.f(new dvp0(dup0Var.f6708a, dup0Var.b));
                return Unit.f46060a;
            case 5:
                boolean z7 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (z7) {
                    w220Var.x1.f(new v8h0(false));
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    g090 g090Var = w220Var.k;
                    this.j = true;
                    if (g090Var.o(this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                uuz uuzVar = w220Var.K0;
                ouu ouuVar = w220Var.s;
                sff0 sff0Var = w220Var.c1;
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    w220Var.w1 = true;
                    yfu yfuVar = w220Var.N0;
                    this.j = true;
                    obj = yfuVar.h(true, this);
                    if (obj == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = (List) obj;
                boolean z10 = sff0Var.f.i && list.contains(LimitKenyaGroupEnum.b);
                z = sff0Var.f.l && list.contains(LimitKenyaGroupEnum.f46749a);
                if (z10) {
                    i1w0 i1w0VarS2 = ouuVar.s();
                    k0w0 k0w0Var2 = new k0w0(i1w0VarS2);
                    uuzVar.getClass();
                    k0w0Var2.h(new LimitsNeScreens$LimitsNeDepositLockFragmentScreen());
                    ListIterator listIteratorO2 = b1j.o(i1w0VarS2, k0w0Var2.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (pawVar2.hasNext()) {
                            i1w0VarS2.a((oe50) pawVar2.next());
                        }
                    }
                }
                if (z) {
                    i1w0 i1w0VarS3 = ouuVar.s();
                    k0w0 k0w0Var3 = new k0w0(i1w0VarS3);
                    uuzVar.getClass();
                    k0w0Var3.h(new LimitsNeScreens$LimitsNeBetLockFragmentScreen());
                    ListIterator listIteratorO3 = b1j.o(i1w0VarS3, k0w0Var3.f17489a, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO3;
                        if (pawVar3.hasNext()) {
                            i1w0VarS3.a((oe50) pawVar3.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 8:
                uuz uuzVar2 = w220Var.L0;
                ouu ouuVar2 = w220Var.s;
                sff0 sff0Var2 = w220Var.c1;
                wne wneVar9 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    ucq ucqVar = sff0Var2.f;
                    if (!ucqVar.i && !ucqVar.l && !ucqVar.j) {
                        return Unit.f46060a;
                    }
                    w220Var.w1 = true;
                    reu reuVar = w220Var.O0;
                    this.j = true;
                    obj = reuVar.f(this);
                    if (obj == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list2 = (List) obj;
                boolean z12 = sff0Var2.f.i && list2.contains(LimitNeGroupEnum.DEPOSIT_LIMITS);
                boolean z13 = sff0Var2.f.l && list2.contains(LimitNeGroupEnum.BET_LIMITS);
                z = sff0Var2.f.j && list2.contains(LimitNeGroupEnum.SESSION_TIME_LIMITS);
                if (z12) {
                    i1w0 i1w0VarS4 = ouuVar2.s();
                    k0w0 k0w0Var4 = new k0w0(i1w0VarS4);
                    uuzVar2.getClass();
                    k0w0Var4.h(new LimitsNeScreens$LimitsNeDepositLockFragmentScreen());
                    ListIterator listIteratorO4 = b1j.o(i1w0VarS4, k0w0Var4.f17489a, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO4;
                        if (pawVar4.hasNext()) {
                            i1w0VarS4.a((oe50) pawVar4.next());
                        }
                    }
                }
                if (z13) {
                    i1w0 i1w0VarS5 = ouuVar2.s();
                    k0w0 k0w0Var5 = new k0w0(i1w0VarS5);
                    uuzVar2.getClass();
                    k0w0Var5.h(new LimitsNeScreens$LimitsNeBetLockFragmentScreen());
                    ListIterator listIteratorO5 = b1j.o(i1w0VarS5, k0w0Var5.f17489a, 0);
                    while (true) {
                        paw pawVar5 = (paw) listIteratorO5;
                        if (pawVar5.hasNext()) {
                            i1w0VarS5.a((oe50) pawVar5.next());
                        }
                    }
                }
                if (z) {
                    i1w0 i1w0VarS6 = ouuVar2.s();
                    k0w0 k0w0Var6 = new k0w0(i1w0VarS6);
                    uuzVar2.getClass();
                    k0w0Var6.h(new LimitsNeScreens$LimitsNeSessionTimeLockFragmentScreen());
                    ListIterator listIteratorO6 = b1j.o(i1w0VarS6, k0w0Var6.f17489a, 0);
                    while (true) {
                        paw pawVar6 = (paw) listIteratorO6;
                        if (pawVar6.hasNext()) {
                            i1w0VarS6.a((oe50) pawVar6.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 9:
                mne mneVar = w220Var.C;
                boolean z14 = this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                if (z14) {
                    bby bbyVar = w220Var.k1;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        w220Var.k1 = sac.V(jiu0.a(w220Var), new p610((byte) 24), null, mneVar.b, new o120(w220Var, yjeVar, (byte) 16), 10);
                    }
                    bby bbyVar2 = w220Var.g1;
                    if (bbyVar2 == null || !bbyVar2.isActive()) {
                        w220Var.g1 = sac.V(jiu0.a(w220Var), t120.f33148a, null, mneVar.f22085a, new fhq(w220Var, yjeVar, (byte) 22), 10);
                    }
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    fnq fnqVar = w220Var.i0.b;
                    cw10 cw10Var = new cw10(w220Var, (byte) 8);
                    this.j = true;
                    if (fnqVar.c(cw10Var, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                boolean z16 = this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                w220Var.s0.e("IS_TAB_BAR_VISIBLE", Boolean.valueOf(z16));
                p7m0 p7m0Var = w220Var.B1;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new mao0(z16, ((mao0) value).b)));
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    this.j = true;
                    if (w220Var.J(this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                w220Var.I();
                w220Var.H();
                w220Var.x();
                sac.V(jiu0.a(w220Var), s120.f31435a, null, w220Var.C.b, new o120(w220Var, yjeVar, (byte) 4), 10);
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    this.j = true;
                    if (w220Var.y(this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    tmt tmtVarK = ((o3c) w220Var.W0.b).k();
                    this.j = true;
                    obj = tmtVarK.f34211a.i0(this);
                    if (obj == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                String str = (String) obj;
                if (str.length() > 0) {
                    w220Var.x1.f(new u8h0(kng0.l(w220Var.X0.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0)), "://open/getCoupon?id=", str)));
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    eyg0 eyg0Var = w220Var.H;
                    this.j = true;
                    Object objL = ((yzn0) eyg0Var.b).l(this);
                    if (objL != wneVar16) {
                        objL = Unit.f46060a;
                    }
                    if (objL == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    z220 z220Var = w220Var.I0;
                    utb utbVarC = aoq.c(((jqt) z220Var.b).a(), new za60(yjeVar, z220Var, b2));
                    this.j = true;
                    if (slb.N(utbVarC, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                boolean z22 = this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                w220Var.x1.f(new w8h0(z22));
                return Unit.f46060a;
            default:
                wne wneVar19 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    suk sukVar = w220Var.d;
                    this.j = true;
                    if (sukVar.f32825a.s(this) == wneVar19) {
                        return wneVar19;
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
}
