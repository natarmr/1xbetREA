package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gcn0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11073a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gcn0(Object obj, byte b) {
        this.f11073a = b;
        this.b = obj;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        byte b = this.f11073a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                icn0 icn0Var = (icn0) obj4;
                a8z a8zVar = icn0Var.S1;
                int iIntValue = ((Integer) obj).intValue();
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                g9m0 g9m0Var = icn0.W1;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.e(iIntValue) ? 4 : 2;
                }
                if (!fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    fetVar2.X();
                } else if (iIntValue == 0) {
                    fetVar2.e0(1403780783);
                    pz40 pz40VarY = ((i3t0) icn0Var.H0()).y(fetVar2);
                    k3t0 k3t0VarH0 = icn0Var.H0();
                    boolean zI = fetVar2.i(k3t0VarH0);
                    Object objP = fetVar2.P();
                    if (zI || objP == cl5Var) {
                        kcl0 kcl0Var = new kcl0(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 28);
                        fetVar2.o0(kcl0Var);
                        objP = kcl0Var;
                    }
                    Function1 function1 = (Function1) ((jhy) objP);
                    boolean zI2 = fetVar2.i(icn0Var);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new j1l0(icn0Var, (byte) 22);
                        fetVar2.o0(objP2);
                    }
                    rsr0.P(pz40VarY, function1, (Function1) objP2, fetVar2, 0);
                    fetVar2.r(false);
                } else if (iIntValue != 1) {
                    fetVar2.e0(1404713728);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1404368047);
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar2);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI3 = fetVar2.i(k3t0Var);
                    Object objP3 = fetVar2.P();
                    if (zI3 || objP3 == cl5Var) {
                        kcl0 kcl0Var2 = new kcl0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar2.o0(kcl0Var2);
                        objP3 = kcl0Var2;
                    }
                    fen0.d(pz40VarY2, (Function1) ((jhy) objP3), fetVar2, 0);
                    fetVar2.r(false);
                }
                return Unit.f46060a;
            case 1:
                e900 e900Var = (e900) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarP = o7k0.p(s5x0.N(jm40Var2, 24.0f, 12.0f, 0.0f, 12.0f, 4), 96.0f, 12.0f);
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar3, i120.P(mm40VarP, e900Var, ugg0Var, 4));
                    pzw.q(s5x0.L(o7k0.d(jm40Var2, 1.0f), 12.0f, 0.0f, 2), e900Var, fetVar3, 0);
                    zq8.a(0, fetVar3, i120.P(o7k0.p(s5x0.N(jm40Var2, 24.0f, 12.0f, 0.0f, 12.0f, 4), 96.0f, 12.0f), e900Var, ugg0Var, 4));
                    pzw.q(s5x0.L(o7k0.d(jm40Var2, 1.0f), 12.0f, 0.0f, 2), e900Var, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                uvo0 uvo0Var = (uvo0) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    nsm0.b(o7k0.d(s5x0.L(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 12.0f, 7), 12.0f, 0.0f, 2), 1.0f), uvo0Var, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                hvo0 hvo0Var = (hvo0) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i = hvo0.k2;
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarM = s5x0.M(jm40Var3, 16.0f, 28.0f, 16.0f, 16.0f);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarM);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                    kkb.m(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), rsm0.w(R.string.federal_tax_legislation_info, 0, fetVar5), null, 0, 0L, 0L, fetVar5, 0, 60);
                    mm40 mm40VarD = o7k0.d(jm40Var3, 1.0f);
                    wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.understand_action, 0, fetVar5)), true, false, true);
                    boolean zI4 = fetVar5.i(hvo0Var);
                    Object objP4 = fetVar5.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new jfm0(hvo0Var, (byte) 29);
                        fetVar5.o0(objP4);
                    }
                    qzb.n(mm40VarD, wulVar, (Function0) objP4, fetVar5, 6, 0);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                axo0 axo0Var = (axo0) obj4;
                bpq bpqVar = (bpq) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                bpqVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(bpqVar) ? 4 : 2;
                }
                if (!fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    fetVar6.X();
                } else if (axo0Var == null) {
                    fetVar6.e0(803453434);
                    fetVar6.r(false);
                } else {
                    fetVar6.e0(803453435);
                    xsm0.e(bpqVar.a(1.0f, jm40Var, true), axo0Var, fetVar6, 0);
                    fetVar6.r(false);
                }
                return Unit.f46060a;
            case 5:
                bxo0 bxo0Var = (bxo0) obj4;
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(yhg0Var) ? 4 : 2;
                }
                if (!fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    fetVar7.X();
                } else if (bxo0Var == null) {
                    fetVar7.e0(-1259386395);
                    fetVar7.r(false);
                } else {
                    fetVar7.e0(-1259386394);
                    tnq0.b(yhg0Var.a(1.0f, jm40Var, true), bxo0Var, fetVar7, 0);
                    fetVar7.r(false);
                }
                return Unit.f46060a;
            case 6:
                gxo0 gxo0Var = (gxo0) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(s5x0.L(jm40Var, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar8, 0);
                    int iHashCode2 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM2 = fetVar8.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar8, mm40VarN);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC1, gqw0.v);
                    v8q0.a(gxo0Var.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar8), fetVar8, 0, 0, 131070);
                    if (gxo0Var.d) {
                        fetVar8.e0(1130328818);
                        for (int i2 = 0; i2 < 4; i2++) {
                            jtm0.c(0, fetVar8);
                        }
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(1130451237);
                        for (dxo0 dxo0Var : gxo0Var.e) {
                            jtm0.b(dxo0Var.f6857a, dxo0Var.b, fetVar8, 0);
                        }
                        fetVar8.r(false);
                    }
                    fetVar8.r(true);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                znp0 znp0Var = (znp0) obj4;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (!fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    fetVar9.X();
                } else if (znp0Var.f) {
                    fetVar9.e0(540130313);
                    zcl zclVar5 = qmk.f28987a;
                    rsm0.g(0, fetVar9, o7k0.n(jm40Var, 24.0f), znp0Var.e);
                    fetVar9.r(false);
                } else {
                    fetVar9.e0(540295078);
                    fetVar9.r(false);
                }
                return Unit.f46060a;
            case 8:
                ajp0 ajp0Var = (ajp0) obj4;
                y5d y5dVar = (y5d) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                s9m0 s9m0Var = ajp0.r2;
                y5dVar.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(y5dVar) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar6 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), ajp0Var.m2.n(ajp0Var, ajp0.s2[1]), 0L, 0, 0L, fetVar10, 0, 28);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 9:
                r0q0 r0q0Var = (r0q0) obj4;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    qsm0.h(o7k0.e(jm40Var, 52.0f), r0q0Var.f29643a.f27915a.f3384a, fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 10:
                ixp0 ixp0Var = (ixp0) obj4;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    String str = ixp0Var.d;
                    if (str == null) {
                        fetVar12.e0(-358124128);
                        fetVar12.r(false);
                    } else {
                        fetVar12.e0(-358124127);
                        zcl zclVar8 = qmk.f28987a;
                        rsm0.i(o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 80.0f), str, 0, fetVar12, 0, 4);
                        fetVar12.r(false);
                    }
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 11:
                k7q0 k7q0Var = (k7q0) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar13 = (fet) obj2;
                ((Integer) obj3).getClass();
                fetVar13.e0(1980580247);
                w6k w6kVar = (w6k) fetVar13.k(bmd.h);
                Object objP5 = fetVar13.P();
                if (objP5 == cl5Var) {
                    objP5 = androidx.compose.runtime.e.e(new qkx(0L));
                    fetVar13.o0(objP5);
                }
                pz40 pz40Var = (pz40) objP5;
                boolean zI5 = fetVar13.i(k7q0Var);
                Object objP6 = fetVar13.P();
                if (zI5 || objP6 == cl5Var) {
                    objP6 = new yip0(k7q0Var, pz40Var, (byte) 8);
                    fetVar13.o0(objP6);
                }
                Function0 function0 = (Function0) objP6;
                boolean zG = fetVar13.g(w6kVar);
                Object objP7 = fetVar13.P();
                if (zG || objP7 == cl5Var) {
                    objP7 = new a1i(w6kVar, pz40Var, (byte) 5);
                    fetVar13.o0(objP7);
                }
                q73 q73Var = i5i0.f14194a;
                mm40 mm40VarO = kbc.O(mm40Var, new b5m(function0, (Function1) objP7));
                fetVar13.r(false);
                return mm40VarO;
            case 12:
                air0 air0Var = (air0) obj4;
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                mm40Var2.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar14.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    aem0.j(mm40Var2, air0Var.c, fetVar14, 14 & iIntValue13);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 13:
                usr0 usr0Var = (usr0) obj4;
                fet fetVar15 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i3 = usr0.r2;
                ((y5d) obj).getClass();
                if (fetVar15.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    k3t0 k3t0VarQ0 = usr0Var.Q0();
                    boolean zI6 = fetVar15.i(usr0Var);
                    Object objP8 = fetVar15.P();
                    if (zI6 || objP8 == cl5Var) {
                        mjr0 mjr0Var = new mjr0(1, usr0Var, usr0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_bet/makebet/presentation/common/model/TotoMakeBetSideEffect;)V", 0, (byte) 11);
                        fetVar15.o0(mjr0Var);
                        objP8 = mjr0Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP8), fetVar15);
                    boolean zI7 = fetVar15.i(k3t0VarQ0) | fetVar15.i(usr0Var) | fetVar15.e(3) | fetVar15.g(pz40VarF);
                    Object objP9 = fetVar15.P();
                    if (zI7 || objP9 == cl5Var) {
                        fetVar = fetVar15;
                        tmj0 tmj0Var = new tmj0(k3t0VarQ0, usr0Var, pz40VarF, null, (byte) 16);
                        fetVar.o0(tmj0Var);
                        objP9 = tmj0Var;
                    } else {
                        fetVar = fetVar15;
                    }
                    m0x0.t(fetVar, usr0Var, (Function2) objP9);
                    pz40 pz40VarY3 = ((i3t0) usr0Var.Q0()).y(fetVar);
                    k3t0 k3t0VarQ1 = usr0Var.Q0();
                    boolean zI8 = fetVar.i(k3t0VarQ1);
                    Object objP10 = fetVar.P();
                    if (zI8 || objP10 == cl5Var) {
                        mjr0 mjr0Var2 = new mjr0(1, k3t0VarQ1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                        fetVar.o0(mjr0Var2);
                        objP10 = mjr0Var2;
                    }
                    b8k0.g(null, pz40VarY3, (Function1) ((jhy) objP10), null, fetVar, 0, 9);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 14:
                he80 he80Var = (he80) obj4;
                fet fetVar16 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar16.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    mm40 mm40VarW = o7k0.w(jm40Var, null, false, 3);
                    zcl zclVar9 = qmk.f28987a;
                    xcm0.e(s5x0.N(mm40VarW, 0.0f, 12.0f, 0.0f, 4.0f, 5), he80Var, fetVar16, 0);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 15:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                str2.getClass();
                str3.getClass();
                str4.getClass();
                ((k3t0) obj4).x(new zur0(str2, str3, str4));
                return Unit.f46060a;
            case 16:
                a480 a480Var = (a480) obj4;
                fet fetVar17 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar17.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    iym0.e(6, fetVar17, o7k0.y(jm40Var, null, 3), a480Var.f211a + " - ");
                    iym0.e(6, fetVar17, jm40Var, a480Var.b);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 17:
                xiu0 xiu0Var = (xiu0) obj4;
                ob50 ob50Var = (ob50) obj;
                fet fetVar18 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= fetVar18.g(ob50Var) ? 4 : 2;
                }
                if (fetVar18.U(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    obc.d(ms00.f22297a.a(t9x.L(ob50Var.b, xiu0Var, (i0h0) fetVar18.k(xr00.f41346a), fetVar18, 0)), u1c.M(1108866301, new yb5(ob50Var, (byte) 3), fetVar18), fetVar18, 56);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            default:
                u4s u4sVar = (u4s) obj;
                ((Integer) obj2).getClass();
                u4sVar.getClass();
                ((uqv0) obj4).invoke(u4sVar, (String) obj3);
                return Unit.f46060a;
        }
    }
}
