package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ntm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24108a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ntm(mm40 mm40Var, uzm uzmVar, uzm uzmVar2, mpm mpmVar, boolean z, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        this.f24108a = (byte) 3;
        uso0 uso0Var = uso0.f36223a;
        this.b = mm40Var;
        this.d = uzmVar;
        this.e = uzmVar2;
        this.f = mpmVar;
        this.c = z;
        this.g = jwmVar;
        this.h = jwmVar2;
        this.i = jwmVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v40 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r2;
        int i;
        byte b = this.f24108a;
        Object obj3 = ukd.f35823a;
        boolean z = this.c;
        jm40 jm40Var = jm40.b;
        pcy pcyVar = e7z.u1;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj10;
                String str = (String) obj9;
                a4x a4xVar = (a4x) obj6;
                String str2 = (String) obj8;
                y1m y1mVar = (y1m) obj4;
                String str3 = (String) obj7;
                a4x a4xVar2 = (a4x) obj5;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    zhg0 zhg0Var = zhg0.f44392a;
                    slb.B(zhg0Var.a(1.0f, jm40Var, true), str, a4xVar, true, fetVar, 3072);
                    slb.d(0, y1mVar, fetVar, zhg0Var.a(1.0f, jm40Var, true), str2, this.c);
                    slb.B(zhg0Var.a(1.0f, jm40Var, true), str3, a4xVar2, false, fetVar, 3072);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40 mm40Var2 = (mm40) obj10;
                sum sumVar = (sum) obj8;
                mpm mpmVar = (mpm) obj7;
                sum sumVar2 = (sum) obj6;
                mum mumVar = (mum) obj5;
                String str4 = (String) obj9;
                k6z k6zVar = (k6z) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z2 = fetVar2.k(bmd.n) == k6z.b;
                    Object objP = fetVar2.P();
                    if (objP == obj3) {
                        objP = new x8h();
                        fetVar2.o0(objP);
                    }
                    x8h x8hVar = (x8h) objP;
                    mm40 mm40VarD2 = o7k0.d(mm40Var2, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(s5x0.L(o7k0.e(mm40VarD2, 94.0f), 8.0f, 0.0f, 2), "DS_SPORT_EVENT_CARD_CYBER_DEFAULT_LAYOUT");
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x8hVar, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    f7k.v(6, 6, fetVar2, mrv.k0(jm40Var, w8k0.f38726a), sumVar.f32828a);
                    f7k.u(mrv.k0(jm40Var, u8k0.f35236a), sumVar.b, fetVar2, 6);
                    f7k.w(o2e.e0(mrv.k0(jm40Var, s8k0.f31806a), "FIRST_OPPONENT_VICTORY_INDICATOR"), sumVar.c, sumVar.d, !z2, fetVar2, 6);
                    n4c.l(mrv.k0(jm40Var, h9k0.f12682a), mpmVar, z, fetVar2, 0);
                    f7k.w(o2e.e0(mrv.k0(jm40Var, b9k0.f2215a), "SECOND_OPPONENT_VICTORY_INDICATOR"), sumVar2.c, sumVar2.d, z2, fetVar2, 6);
                    f7k.u(mrv.k0(jm40Var, d9k0.f5705a), sumVar2.b, fetVar2, 6);
                    f7k.v(5, 6, fetVar2, mrv.k0(jm40Var, f9k0.f9158a), sumVar2.f32828a);
                    f7k.r(mumVar, fetVar2, 0);
                    f7k.q(str4, mumVar instanceof jum ? 2 : 1, k6zVar, fetVar2, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                mm40 mm40Var3 = (mm40) obj10;
                y0n y0nVar = (y0n) obj8;
                mpm mpmVar2 = (mpm) obj7;
                y0n y0nVar2 = (y0n) obj6;
                r0n r0nVar = (r0n) obj5;
                String str5 = (String) obj9;
                k6z k6zVar2 = (k6z) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objP2 = fetVar3.P();
                    if (objP2 == obj3) {
                        objP2 = new zws0();
                        fetVar3.o0(objP2);
                    }
                    zws0 zws0Var = (zws0) objP2;
                    mm40 mm40VarD3 = o7k0.d(mm40Var3, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD3, 94.0f), 8.0f, 0.0f, 2);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarL);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, zws0Var, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                    mm40 mm40VarK0 = mrv.k0(jm40Var, v8k0.f36989a);
                    String str6 = y0nVar.f41815a;
                    int i2 = y0nVar.b;
                    d280 d280Var = y0nVar.c;
                    dub.R(6, 6, fetVar3, mm40VarK0, str6);
                    if (d280Var != null) {
                        fetVar3.e0(53869151);
                        dub.Q(o2e.e0(mrv.k0(jm40Var, t8k0.f33515a), "EVENT_CARD_OPPONENT_LOGO"), d280Var, fetVar3, 6);
                        r2 = 0;
                        fetVar3.r(false);
                    } else {
                        r2 = 0;
                        fetVar3.e0(54100752);
                        fetVar3.r(false);
                    }
                    if (d280Var == null || i2 == 0) {
                        fetVar3.e0(54427120);
                        fetVar3.r(r2);
                    } else {
                        fetVar3.e0(54210895);
                        dub.P(i2, 6, fetVar3, mrv.k0(jm40Var, r8k0.f30032a));
                        fetVar3.r(r2);
                    }
                    n4c.l(mrv.k0(jm40Var, g9k0.f10918a), mpmVar2, z, fetVar3, r2);
                    d280 d280Var2 = y0nVar2.c;
                    int i3 = y0nVar2.b;
                    if (d280Var2 == null || i3 == 0) {
                        fetVar3.e0(54942960);
                        fetVar3.r(r2);
                    } else {
                        fetVar3.e0(54724813);
                        dub.P(i3, 6, fetVar3, mrv.k0(jm40Var, a9k0.f482a));
                        fetVar3.r(r2);
                    }
                    if (d280Var2 != null) {
                        fetVar3.e0(55011935);
                        i = 6;
                        dub.Q(mrv.k0(jm40Var, c9k0.f3966a), d280Var2, fetVar3, 6);
                        fetVar3.r(r2);
                    } else {
                        i = 6;
                        fetVar3.e0(55212784);
                        fetVar3.r(r2);
                    }
                    dub.R(5, i, fetVar3, mrv.k0(jm40Var, e9k0.f7426a), y0nVar2.f41815a);
                    dub.I(r0nVar, fetVar3, r2);
                    if (str5.length() > 0) {
                        fetVar3.e0(55574120);
                        dub.H(str5, r0nVar instanceof o0n ? 2 : 1, k6zVar2, fetVar3, r2);
                        fetVar3.r(r2);
                    } else {
                        fetVar3.e0(55858576);
                        fetVar3.r(r2);
                    }
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                mm40 mm40Var4 = (mm40) obj10;
                uzm uzmVar = (uzm) obj9;
                uzm uzmVar2 = (uzm) obj8;
                mpm mpmVar3 = (mpm) obj7;
                uso0 uso0Var = uso0.f36223a;
                jwm jwmVar = (jwm) obj6;
                jwm jwmVar2 = (jwm) obj5;
                jwm jwmVar3 = (jwm) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarD4 = o7k0.d(mm40Var4, 1.0f);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(s5x0.L(mm40VarD4, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode4 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM4 = fetVar4.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC3, gqw0.v);
                    jiq0.O(null, uzmVar, uzmVar2, mpmVar3, this.c, fetVar4, 0);
                    tlb.l(null, jwmVar, jwmVar2, jwmVar3, 0L, fetVar4, 0, 17);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                mm40 mm40Var5 = (mm40) obj10;
                xzm xzmVar = (xzm) obj9;
                xzm xzmVar2 = (xzm) obj8;
                a2m a2mVar = (a2m) obj7;
                uso0 uso0Var2 = uso0.f36223a;
                jwm jwmVar4 = (jwm) obj6;
                jwm jwmVar5 = (jwm) obj5;
                jwm jwmVar6 = (jwm) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mm40 mm40VarD5 = o7k0.d(mm40Var5, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(s5x0.L(mm40VarD5, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    x5d x5dVarA2 = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar5, 0);
                    int iHashCode5 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM5 = fetVar5.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar5, mm40VarN3);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC4, gqw0.v);
                    fxb.x(null, xzmVar, xzmVar2, a2mVar, this.c, fetVar5, 0);
                    tlb.l(null, jwmVar4, jwmVar5, jwmVar6, 0L, fetVar5, 0, 17);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                mm40 mm40Var6 = (mm40) obj10;
                String str7 = (String) obj9;
                yzm yzmVar = (yzm) obj8;
                yzm yzmVar2 = (yzm) obj7;
                a2m a2mVar2 = (a2m) obj6;
                uso0 uso0Var3 = uso0.f36223a;
                jwm jwmVar7 = (jwm) obj5;
                jwm jwmVar8 = (jwm) obj4;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    mm40 mm40VarD6 = o7k0.d(mm40Var6, 1.0f);
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarN4 = s5x0.N(s5x0.L(mm40VarD6, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    x5d x5dVarA3 = w5d.a(uc9.c, gqw0.n, fetVar6, 48);
                    int iHashCode6 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM6 = fetVar6.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar6, mm40VarN4);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar6, x5dVarA3, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar6, bh90VarM6, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode6);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar6, numValueOf, shdVar3);
                    jpm0.n(fetVar6);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar6, mm40VarC5, shdVar4);
                    int length = str7.length();
                    jm40 jm40Var2 = jm40.b;
                    if (length > 0) {
                        fetVar6.e0(-976493127);
                        mm40 mm40VarE = o7k0.e(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7), 16.0f);
                        tj30 tj30VarC = zq8.c(gqw0.e, false);
                        int iHashCode7 = Long.hashCode(fetVar6.T);
                        bh90 bh90VarM7 = fetVar6.m();
                        mm40 mm40VarC6 = kbc.c0(fetVar6, mm40VarE);
                        fetVar6.i0();
                        if (fetVar6.S) {
                            fetVar6.l(pcyVar);
                        } else {
                            fetVar6.r0();
                        }
                        jpm0.o(fetVar6, tj30VarC, shdVar);
                        jpm0.o(fetVar6, bh90VarM7, shdVar2);
                        vqd.u(iHashCode7, fetVar6, shdVar3, fetVar6);
                        jpm0.o(fetVar6, mm40VarC6, shdVar4);
                        v8q0.a(str7, null, ((ThemeColors) fetVar6.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar6, 0, 24960, 110586);
                        fetVar6.r(true);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(-975930942);
                        fetVar6.r(false);
                    }
                    dyb.E(null, yzmVar, yzmVar2, a2mVar2, this.c, fetVar6, 0);
                    tlb.l(s5x0.N(jm40Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13), null, jwmVar7, jwmVar8, 0L, fetVar6, 48, 16);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                azw.y((ehm0) obj10, this.c, (mdm) obj9, (jam0) obj8, (h1z) obj7, (Function1) obj6, (Function0) obj5, (Function1) obj4, (fet) obj, x8x.L(14155777));
                break;
            case 7:
                ((Integer) obj2).getClass();
                hmw0.J((vby) obj10, (String) obj9, this.c, (Function0) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                vdx.j((mm40) obj10, (String) obj9, (tvw) obj7, (String) obj8, this.c, (a4x) obj6, (ec) obj5, (Function0) obj4, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ter0.a((mm40) obj10, (String) obj9, (Double) obj7, this.c, (String) obj8, (gy40) obj6, (Function0) obj5, (Function0) obj4, (fet) obj, x8x.L(196609));
                break;
            default:
                qtv0 qtv0Var = (qtv0) obj10;
                ugd ugdVar = (ugd) obj9;
                Function2 function2 = (Function2) obj8;
                l7m0 l7m0Var = (l7m0) obj7;
                fuj0 fuj0Var = (fuj0) obj6;
                w6k w6kVar = (w6k) obj5;
                l7m0 l7m0Var2 = (l7m0) obj4;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fetVar7.X();
                } else if (!z || qtv0Var == null) {
                    fetVar7.e0(475650719);
                    ugdVar.F(function2, fetVar7, 48);
                    fetVar7.r(false);
                } else {
                    fetVar7.e0(474913632);
                    mm40 mm40VarD7 = o7k0.d(jm40Var, 1.0f);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode8 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM8 = fetVar7.m();
                    mm40 mm40VarC7 = kbc.c0(fetVar7, mm40VarD7);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM8, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode8), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC7, gqw0.v);
                    ugdVar.F(null, fetVar7, 54);
                    qsm0.q(jr8.f16991a.b(jm40Var, gqw0.b), tsv0.d, l7m0Var, fuj0Var, w6kVar, u1c.M(-1109601397, new onu0(qtv0Var, l7m0Var2, (byte) 8), fetVar7), fetVar7, 196656, 0);
                    fetVar7.r(true);
                    fetVar7.r(false);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ntm(vby vbyVar, String str, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i) {
        this.f24108a = (byte) 7;
        this.b = vbyVar;
        this.d = str;
        this.c = z;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = function3;
        this.i = function4;
    }

    public /* synthetic */ ntm(mm40 mm40Var, xzm xzmVar, xzm xzmVar2, a2m a2mVar, boolean z, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        this.f24108a = (byte) 4;
        uso0 uso0Var = uso0.f36223a;
        this.b = mm40Var;
        this.d = xzmVar;
        this.e = xzmVar2;
        this.f = a2mVar;
        this.c = z;
        this.g = jwmVar;
        this.h = jwmVar2;
        this.i = jwmVar3;
    }

    public /* synthetic */ ntm(mm40 mm40Var, Object obj, mpm mpmVar, boolean z, Object obj2, Object obj3, String str, k6z k6zVar, byte b) {
        this.f24108a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = mpmVar;
        this.c = z;
        this.g = obj2;
        this.h = obj3;
        this.d = str;
        this.i = k6zVar;
    }

    public /* synthetic */ ntm(mm40 mm40Var, String str, yzm yzmVar, yzm yzmVar2, a2m a2mVar, boolean z, jwm jwmVar, jwm jwmVar2) {
        this.f24108a = (byte) 5;
        uso0 uso0Var = uso0.f36223a;
        this.b = mm40Var;
        this.d = str;
        this.e = yzmVar;
        this.f = yzmVar2;
        this.g = a2mVar;
        this.c = z;
        this.h = jwmVar;
        this.i = jwmVar2;
    }

    public /* synthetic */ ntm(mm40 mm40Var, String str, tvw tvwVar, String str2, boolean z, a4x a4xVar, ec ecVar, Function0 function0, int i) {
        this.f24108a = (byte) 8;
        this.b = mm40Var;
        this.d = str;
        this.f = tvwVar;
        this.e = str2;
        this.c = z;
        this.g = a4xVar;
        this.h = ecVar;
        this.i = function0;
    }

    public /* synthetic */ ntm(mm40 mm40Var, String str, a4x a4xVar, String str2, y1m y1mVar, boolean z, String str3, a4x a4xVar2) {
        this.f24108a = (byte) 0;
        this.b = mm40Var;
        this.d = str;
        this.g = a4xVar;
        this.e = str2;
        this.i = y1mVar;
        this.c = z;
        this.f = str3;
        this.h = a4xVar2;
    }

    public /* synthetic */ ntm(mm40 mm40Var, String str, Double d, boolean z, String str2, gy40 gy40Var, Function0 function0, Function0 function1, int i) {
        this.f24108a = (byte) 9;
        this.b = mm40Var;
        this.d = str;
        this.f = d;
        this.c = z;
        this.e = str2;
        this.g = gy40Var;
        this.h = function0;
        this.i = function1;
    }

    public /* synthetic */ ntm(ehm0 ehm0Var, boolean z, mdm mdmVar, jam0 jam0Var, h1z h1zVar, Function1 function1, Function0 function0, Function1 function2, int i) {
        this.f24108a = (byte) 6;
        this.b = ehm0Var;
        this.c = z;
        this.d = mdmVar;
        this.e = jam0Var;
        this.f = h1zVar;
        this.g = function1;
        this.h = function0;
        this.i = function2;
    }

    public /* synthetic */ ntm(boolean z, qtv0 qtv0Var, ugd ugdVar, ugd ugdVar2, zbk zbkVar, fuj0 fuj0Var, w6k w6kVar, l7m0 l7m0Var) {
        this.f24108a = (byte) 10;
        this.c = z;
        this.b = qtv0Var;
        this.d = ugdVar;
        this.e = ugdVar2;
        this.f = zbkVar;
        this.g = fuj0Var;
        this.h = w6kVar;
        this.i = l7m0Var;
    }
}
