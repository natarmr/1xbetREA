package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tp7 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34317a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tp7(float f, epd0 epd0Var, tnd0 tnd0Var, Function1 function1) {
        this.f34317a = (byte) 3;
        this.b = f;
        this.c = epd0Var;
        this.d = tnd0Var;
        this.e = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        pcy pcyVar;
        boolean z;
        fet fetVar;
        boolean z2;
        byte b = this.f34317a;
        byte b2 = 14;
        pcy pcyVar2 = e7z.u1;
        float f = this.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                w2d w2dVar = (w2d) obj6;
                pz40 pz40Var = (pz40) obj5;
                Function1 function1 = (Function1) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(hh80Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarN = jm40.b;
                    mm40 mm40VarV = cjx.V(s5x0.I(mm40VarN, hh80Var), w2dVar, null);
                    zx7 zx7Var = gqw0.f11754a;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarV);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar2);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    n0q n0qVar = o7k0.c;
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        pcyVar = pcyVar2;
                        fetVar2.l(pcyVar);
                    } else {
                        pcyVar = pcyVar2;
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    mm40 mm40VarE = jr8.f16991a.b(o7k0.d(mm40VarN, 1.0f), gqw0.b).e(n0qVar).e(i120.Q(mm40VarN, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), vgg0.c(f, f, 0.0f, 0.0f, 12)));
                    tj30 tj30VarC3 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC3, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    eq7 eq7Var = (eq7) pz40Var.getValue();
                    if (eq7Var != null) {
                        if (eq7Var instanceof dq7) {
                            fetVar2.e0(94364064);
                            zcl zclVar = qmk.f28987a;
                            oja0.F(0, fetVar2, s5x0.N(mm40VarN, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                            fetVar2.r(false);
                        } else if (eq7Var instanceof bq7) {
                            fetVar2.e0(94552637);
                            mdm mdmVar = ((bq7) eq7Var).f;
                            boolean zG = fetVar2.g(function1);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new to6(function1, (byte) 18);
                                fetVar2.o0(objP);
                            }
                            jcb.l(null, mdmVar, false, (Function0) objP, fetVar2, 0, 5);
                            fetVar2.r(false);
                        } else if (eq7Var instanceof cq7) {
                            fetVar2.e0(94897946);
                            mdm mdmVar2 = ((cq7) eq7Var).f;
                            boolean zG2 = fetVar2.g(function1);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new to6(function1, (byte) 19);
                                fetVar2.o0(objP2);
                            }
                            jcb.l(null, mdmVar2, false, (Function0) objP2, fetVar2, 0, 5);
                            fetVar2.r(false);
                        } else if (eq7Var instanceof aq7) {
                            fetVar2.e0(95260553);
                            aq7 aq7Var = (aq7) eq7Var;
                            if (aq7Var.e) {
                                zcl zclVar2 = qmk.f28987a;
                                mm40VarN = s5x0.N(mm40VarN, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                            }
                            oja0.p(mm40VarN, aq7Var.e, aq7Var, function1, fetVar2, 0);
                            fetVar2.r(false);
                        }
                        ohs0.x(fetVar2, true, true, true);
                    }
                    throw b1j.f(3042195, fetVar2, false);
                }
                fetVar2.X();
                return Unit.f46060a;
            case 1:
                l7m0 l7m0Var = (l7m0) obj6;
                f3d f3dVar = (f3d) obj5;
                y82 y82Var = (y82) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                qek0 qek0Var = y82.V1;
                mm40Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar3.g(mm40Var) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zI = fetVar3.i(y82Var);
                    Object objP3 = fetVar3.P();
                    if (zI || objP3 == cl5Var) {
                        objP3 = new p82(y82Var, (byte) 1);
                        fetVar3.o0(objP3);
                    }
                    ntb.d(mm40Var, l7m0Var, this.b, f3dVar, (Function1) objP3, fetVar3, iIntValue2 & 14);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                Function1 function2 = (Function1) obj4;
                Function1 function3 = (Function1) obj6;
                l7m0 l7m0Var2 = (l7m0) obj5;
                g9z g9zVar = (g9z) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                g9zVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar4.g(g9zVar) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    Object objP4 = fetVar4.P();
                    if (objP4 == cl5Var) {
                        mm40 mm40VarL = s5x0.L(o7k0.w(g9zVar.d(1.0f), null, false, 3), f, 0.0f, 2);
                        fetVar4.o0(mm40VarL);
                        objP4 = mm40VarL;
                    }
                    mm40 mm40Var2 = (mm40) objP4;
                    boolean zG3 = fetVar4.g(function2);
                    Object objP5 = fetVar4.P();
                    if (zG3 || objP5 == cl5Var) {
                        objP5 = new baq(function2, (byte) 10);
                        fetVar4.o0(objP5);
                    }
                    mm40 mm40VarY = fre0.Y(mm40Var2, (Function1) objP5);
                    asr asrVar = (asr) l7m0Var2.getValue();
                    boolean zG4 = fetVar4.g(function3);
                    Object objP6 = fetVar4.P();
                    if (zG4 || objP6 == cl5Var) {
                        z = false;
                        objP6 = new x6s(function3, (byte) (0 == true ? 1 : 0));
                        fetVar4.o0(objP6);
                    } else {
                        z = false;
                    }
                    Function2 function4 = (Function2) objP6;
                    nw3 nw3Var = uc9.g;
                    asrVar.getClass();
                    function4.getClass();
                    mm40 mm40VarB = hp4.B(o7k0.d(mm40VarY, 1.0f));
                    tj30 tj30VarC4 = zq8.c(gqw0.f11754a, z);
                    int iHashCode4 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM4 = fetVar4.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarB);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar2);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC4, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC3, gqw0.v);
                    if (asrVar instanceof prr) {
                        fetVar4.e0(2000180964);
                        fxb.q(0, fetVar4, null, ((prr) asrVar).f27479a);
                        fetVar4.r(false);
                        fetVar = fetVar4;
                    } else {
                        final byte b3 = 0;
                        boolean z3 = asrVar instanceof urr;
                        jm40 jm40Var = jm40.b;
                        if (z3) {
                            fetVar4.e0(2000183657);
                            final urr urrVar = (urr) asrVar;
                            final byte b4 = 1;
                            n4c.s(jm40Var, null, u1c.M(-8891393, new ydr() { // from class: a.crr
                                @Override // a.ydr
                                public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                    byte b5 = b3;
                                    urr urrVar2 = urrVar;
                                    switch (b5) {
                                        case 0:
                                            mm40 mm40Var3 = (mm40) obj8;
                                            fet fetVar5 = (fet) obj9;
                                            int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                ozb.y(mm40Var3, urrVar2.f36178a, fetVar5, (iD >> 3) & 14);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var4 = (mm40) obj8;
                                            fet fetVar6 = (fet) obj9;
                                            int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var4);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar6.g(mm40Var4) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar6, 0);
                                                int iHashCode5 = Long.hashCode(fetVar6.T);
                                                bh90 bh90VarM5 = fetVar6.m();
                                                mm40 mm40VarC4 = kbc.c0(fetVar6, mm40Var4);
                                                mkd.c0.getClass();
                                                fetVar6.i0();
                                                if (fetVar6.S) {
                                                    fetVar6.l(e7z.u1);
                                                } else {
                                                    fetVar6.r0();
                                                }
                                                jpm0.o(fetVar6, x5dVarA, gqw0.x);
                                                jpm0.o(fetVar6, bh90VarM5, gqw0.w);
                                                jpm0.o(fetVar6, Integer.valueOf(iHashCode5), gqw0.y);
                                                jpm0.n(fetVar6);
                                                jpm0.o(fetVar6, mm40VarC4, gqw0.v);
                                                nqr nqrVar = urrVar2.f;
                                                Object objP7 = fetVar6.P();
                                                cl5 cl5Var2 = ukd.f35823a;
                                                if (objP7 == cl5Var2) {
                                                    objP7 = new dcr((byte) 5);
                                                    fetVar6.o0(objP7);
                                                }
                                                Function1 function5 = (Function1) objP7;
                                                Object objP8 = fetVar6.P();
                                                if (objP8 == cl5Var2) {
                                                    objP8 = new dcr((byte) 6);
                                                    fetVar6.o0(objP8);
                                                }
                                                ay3.f(nqrVar, null, function5, null, null, (Function1) objP8, o050.d, fetVar6, 1769856, 26);
                                                zcl zclVar3 = qmk.f28987a;
                                                jwb.r(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), urrVar2.e, fetVar6, 0);
                                                fetVar6.r(true);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4), u1c.M(917863360, new ec30(urrVar, function4, (byte) 29), fetVar4), u1c.M(1844618113, new ydr() { // from class: a.crr
                                @Override // a.ydr
                                public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                    byte b5 = b4;
                                    urr urrVar2 = urrVar;
                                    switch (b5) {
                                        case 0:
                                            mm40 mm40Var3 = (mm40) obj8;
                                            fet fetVar5 = (fet) obj9;
                                            int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                ozb.y(mm40Var3, urrVar2.f36178a, fetVar5, (iD >> 3) & 14);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var4 = (mm40) obj8;
                                            fet fetVar6 = (fet) obj9;
                                            int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var4);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar6.g(mm40Var4) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar6, 0);
                                                int iHashCode5 = Long.hashCode(fetVar6.T);
                                                bh90 bh90VarM5 = fetVar6.m();
                                                mm40 mm40VarC4 = kbc.c0(fetVar6, mm40Var4);
                                                mkd.c0.getClass();
                                                fetVar6.i0();
                                                if (fetVar6.S) {
                                                    fetVar6.l(e7z.u1);
                                                } else {
                                                    fetVar6.r0();
                                                }
                                                jpm0.o(fetVar6, x5dVarA, gqw0.x);
                                                jpm0.o(fetVar6, bh90VarM5, gqw0.w);
                                                jpm0.o(fetVar6, Integer.valueOf(iHashCode5), gqw0.y);
                                                jpm0.n(fetVar6);
                                                jpm0.o(fetVar6, mm40VarC4, gqw0.v);
                                                nqr nqrVar = urrVar2.f;
                                                Object objP7 = fetVar6.P();
                                                cl5 cl5Var2 = ukd.f35823a;
                                                if (objP7 == cl5Var2) {
                                                    objP7 = new dcr((byte) 5);
                                                    fetVar6.o0(objP7);
                                                }
                                                Function1 function5 = (Function1) objP7;
                                                Object objP8 = fetVar6.P();
                                                if (objP8 == cl5Var2) {
                                                    objP8 = new dcr((byte) 6);
                                                    fetVar6.o0(objP8);
                                                }
                                                ay3.f(nqrVar, null, function5, null, null, (Function1) objP8, o050.d, fetVar6, 1769856, 26);
                                                zcl zclVar3 = qmk.f28987a;
                                                jwb.r(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), urrVar2.e, fetVar6, 0);
                                                fetVar6.r(true);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar4), fetVar4, 28032, 2);
                            fetVar = fetVar4;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar4;
                            if (asrVar instanceof srr) {
                                fetVar.e0(2000189320);
                                final srr srrVar = (srr) asrVar;
                                final byte b5 = 1;
                                final byte b6 = 2;
                                n4c.s(jm40Var, null, u1c.M(-880066950, new ydr() { // from class: a.yqr
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        byte b7 = b3;
                                        final srr srrVar2 = srrVar;
                                        boolean z4 = true;
                                        final byte b8 = 0;
                                        mm40 mm40Var3 = (mm40) obj8;
                                        fet fetVar5 = (fet) obj9;
                                        int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                        switch (b7) {
                                            case 0:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    ozb.y(mm40Var3, srrVar2.f32693a, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            case 1:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    zcl zclVar3 = qmk.f28987a;
                                                    final byte b9 = 2;
                                                    mm40 mm40VarL2 = s5x0.L(mm40Var3, 8.0f, 0.0f, 2);
                                                    ugd ugdVarM = u1c.M(280223523, new xdr() { // from class: a.arr
                                                        @Override // a.xdr
                                                        public final Object F(Object obj11, Object obj12, Object obj13) {
                                                            byte b10 = b8;
                                                            srr srrVar3 = srrVar2;
                                                            switch (b10) {
                                                                case 0:
                                                                    mm40 mm40Var4 = (mm40) obj11;
                                                                    fet fetVar6 = (fet) obj12;
                                                                    int iIntValue4 = ((Integer) obj13).intValue();
                                                                    mm40Var4.getClass();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                                                    }
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        String str = srrVar3.b;
                                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                                        v8q0.a(str, mm40Var4, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, (iIntValue4 << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    fet fetVar7 = (fet) obj12;
                                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                                    ((mm40) obj11).getClass();
                                                                    if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                        n4c.l(jm40.b, srrVar3.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                                                                    } else {
                                                                        fetVar7.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mm40 mm40Var5 = (mm40) obj11;
                                                                    fet fetVar8 = (fet) obj12;
                                                                    int iIntValue6 = ((Integer) obj13).intValue();
                                                                    mm40Var5.getClass();
                                                                    if ((iIntValue6 & 6) == 0) {
                                                                        iIntValue6 |= fetVar8.g(mm40Var5) ? 4 : 2;
                                                                    }
                                                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                        int i = iIntValue6;
                                                                        String str2 = srrVar3.c;
                                                                        pz40 pz40Var3 = s6t0.f31722a;
                                                                        v8q0.a(str2, mm40Var5, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar8, (i << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5);
                                                    final byte b10 = z4 ? (byte) 1 : (byte) 0;
                                                    wzb.y(mm40VarL2, q3d.j(ugdVarM, u1c.M(1422571108, new xdr() { // from class: a.arr
                                                        @Override // a.xdr
                                                        public final Object F(Object obj11, Object obj12, Object obj13) {
                                                            byte b11 = b10;
                                                            srr srrVar3 = srrVar2;
                                                            switch (b11) {
                                                                case 0:
                                                                    mm40 mm40Var4 = (mm40) obj11;
                                                                    fet fetVar6 = (fet) obj12;
                                                                    int iIntValue4 = ((Integer) obj13).intValue();
                                                                    mm40Var4.getClass();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                                                    }
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        String str = srrVar3.b;
                                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                                        v8q0.a(str, mm40Var4, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, (iIntValue4 << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    fet fetVar7 = (fet) obj12;
                                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                                    ((mm40) obj11).getClass();
                                                                    if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                        n4c.l(jm40.b, srrVar3.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                                                                    } else {
                                                                        fetVar7.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mm40 mm40Var5 = (mm40) obj11;
                                                                    fet fetVar8 = (fet) obj12;
                                                                    int iIntValue6 = ((Integer) obj13).intValue();
                                                                    mm40Var5.getClass();
                                                                    if ((iIntValue6 & 6) == 0) {
                                                                        iIntValue6 |= fetVar8.g(mm40Var5) ? 4 : 2;
                                                                    }
                                                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                        int i = iIntValue6;
                                                                        String str2 = srrVar3.c;
                                                                        pz40 pz40Var3 = s6t0.f31722a;
                                                                        v8q0.a(str2, mm40Var5, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar8, (i << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5), u1c.M(-1730048603, new xdr() { // from class: a.arr
                                                        @Override // a.xdr
                                                        public final Object F(Object obj11, Object obj12, Object obj13) {
                                                            byte b11 = b9;
                                                            srr srrVar3 = srrVar2;
                                                            switch (b11) {
                                                                case 0:
                                                                    mm40 mm40Var4 = (mm40) obj11;
                                                                    fet fetVar6 = (fet) obj12;
                                                                    int iIntValue4 = ((Integer) obj13).intValue();
                                                                    mm40Var4.getClass();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                                                    }
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        String str = srrVar3.b;
                                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                                        v8q0.a(str, mm40Var4, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, (iIntValue4 << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    fet fetVar7 = (fet) obj12;
                                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                                    ((mm40) obj11).getClass();
                                                                    if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                        n4c.l(jm40.b, srrVar3.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                                                                    } else {
                                                                        fetVar7.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mm40 mm40Var5 = (mm40) obj11;
                                                                    fet fetVar8 = (fet) obj12;
                                                                    int iIntValue6 = ((Integer) obj13).intValue();
                                                                    mm40Var5.getClass();
                                                                    if ((iIntValue6 & 6) == 0) {
                                                                        iIntValue6 |= fetVar8.g(mm40Var5) ? 4 : 2;
                                                                    }
                                                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                        int i = iIntValue6;
                                                                        String str2 = srrVar3.c;
                                                                        pz40 pz40Var3 = s6t0.f31722a;
                                                                        v8q0.a(str2, mm40Var5, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar8, (i << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5)), fetVar5);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            default:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    jwb.r(mm40Var3, srrVar2.e, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), u1c.M(1718876987, new ydr() { // from class: a.yqr
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        byte b7 = b5;
                                        final srr srrVar2 = srrVar;
                                        boolean z4 = true;
                                        final byte b8 = 0;
                                        mm40 mm40Var3 = (mm40) obj8;
                                        fet fetVar5 = (fet) obj9;
                                        int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                        switch (b7) {
                                            case 0:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    ozb.y(mm40Var3, srrVar2.f32693a, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            case 1:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    zcl zclVar3 = qmk.f28987a;
                                                    final byte b9 = 2;
                                                    mm40 mm40VarL2 = s5x0.L(mm40Var3, 8.0f, 0.0f, 2);
                                                    ugd ugdVarM = u1c.M(280223523, new xdr() { // from class: a.arr
                                                        @Override // a.xdr
                                                        public final Object F(Object obj11, Object obj12, Object obj13) {
                                                            byte b11 = b8;
                                                            srr srrVar3 = srrVar2;
                                                            switch (b11) {
                                                                case 0:
                                                                    mm40 mm40Var4 = (mm40) obj11;
                                                                    fet fetVar6 = (fet) obj12;
                                                                    int iIntValue4 = ((Integer) obj13).intValue();
                                                                    mm40Var4.getClass();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                                                    }
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        String str = srrVar3.b;
                                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                                        v8q0.a(str, mm40Var4, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, (iIntValue4 << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    fet fetVar7 = (fet) obj12;
                                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                                    ((mm40) obj11).getClass();
                                                                    if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                        n4c.l(jm40.b, srrVar3.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                                                                    } else {
                                                                        fetVar7.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mm40 mm40Var5 = (mm40) obj11;
                                                                    fet fetVar8 = (fet) obj12;
                                                                    int iIntValue6 = ((Integer) obj13).intValue();
                                                                    mm40Var5.getClass();
                                                                    if ((iIntValue6 & 6) == 0) {
                                                                        iIntValue6 |= fetVar8.g(mm40Var5) ? 4 : 2;
                                                                    }
                                                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                        int i = iIntValue6;
                                                                        String str2 = srrVar3.c;
                                                                        pz40 pz40Var3 = s6t0.f31722a;
                                                                        v8q0.a(str2, mm40Var5, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar8, (i << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5);
                                                    final byte b10 = z4 ? (byte) 1 : (byte) 0;
                                                    wzb.y(mm40VarL2, q3d.j(ugdVarM, u1c.M(1422571108, new xdr() { // from class: a.arr
                                                        @Override // a.xdr
                                                        public final Object F(Object obj11, Object obj12, Object obj13) {
                                                            byte b11 = b10;
                                                            srr srrVar3 = srrVar2;
                                                            switch (b11) {
                                                                case 0:
                                                                    mm40 mm40Var4 = (mm40) obj11;
                                                                    fet fetVar6 = (fet) obj12;
                                                                    int iIntValue4 = ((Integer) obj13).intValue();
                                                                    mm40Var4.getClass();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                                                    }
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        String str = srrVar3.b;
                                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                                        v8q0.a(str, mm40Var4, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, (iIntValue4 << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    fet fetVar7 = (fet) obj12;
                                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                                    ((mm40) obj11).getClass();
                                                                    if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                        n4c.l(jm40.b, srrVar3.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                                                                    } else {
                                                                        fetVar7.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mm40 mm40Var5 = (mm40) obj11;
                                                                    fet fetVar8 = (fet) obj12;
                                                                    int iIntValue6 = ((Integer) obj13).intValue();
                                                                    mm40Var5.getClass();
                                                                    if ((iIntValue6 & 6) == 0) {
                                                                        iIntValue6 |= fetVar8.g(mm40Var5) ? 4 : 2;
                                                                    }
                                                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                        int i = iIntValue6;
                                                                        String str2 = srrVar3.c;
                                                                        pz40 pz40Var3 = s6t0.f31722a;
                                                                        v8q0.a(str2, mm40Var5, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar8, (i << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5), u1c.M(-1730048603, new xdr() { // from class: a.arr
                                                        @Override // a.xdr
                                                        public final Object F(Object obj11, Object obj12, Object obj13) {
                                                            byte b11 = b9;
                                                            srr srrVar3 = srrVar2;
                                                            switch (b11) {
                                                                case 0:
                                                                    mm40 mm40Var4 = (mm40) obj11;
                                                                    fet fetVar6 = (fet) obj12;
                                                                    int iIntValue4 = ((Integer) obj13).intValue();
                                                                    mm40Var4.getClass();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                                                    }
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        String str = srrVar3.b;
                                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                                        v8q0.a(str, mm40Var4, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, (iIntValue4 << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    fet fetVar7 = (fet) obj12;
                                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                                    ((mm40) obj11).getClass();
                                                                    if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                        n4c.l(jm40.b, srrVar3.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                                                                    } else {
                                                                        fetVar7.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mm40 mm40Var5 = (mm40) obj11;
                                                                    fet fetVar8 = (fet) obj12;
                                                                    int iIntValue6 = ((Integer) obj13).intValue();
                                                                    mm40Var5.getClass();
                                                                    if ((iIntValue6 & 6) == 0) {
                                                                        iIntValue6 |= fetVar8.g(mm40Var5) ? 4 : 2;
                                                                    }
                                                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                        int i = iIntValue6;
                                                                        String str2 = srrVar3.c;
                                                                        pz40 pz40Var3 = s6t0.f31722a;
                                                                        v8q0.a(str2, mm40Var5, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar8, (i << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5)), fetVar5);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            default:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    jwb.r(mm40Var3, srrVar2.e, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), u1c.M(22853628, new ydr() { // from class: a.yqr
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        byte b7 = b6;
                                        final srr srrVar2 = srrVar;
                                        boolean z4 = true;
                                        final byte b8 = 0;
                                        mm40 mm40Var3 = (mm40) obj8;
                                        fet fetVar5 = (fet) obj9;
                                        int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                        switch (b7) {
                                            case 0:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    ozb.y(mm40Var3, srrVar2.f32693a, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            case 1:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    zcl zclVar3 = qmk.f28987a;
                                                    final byte b9 = 2;
                                                    mm40 mm40VarL2 = s5x0.L(mm40Var3, 8.0f, 0.0f, 2);
                                                    ugd ugdVarM = u1c.M(280223523, new xdr() { // from class: a.arr
                                                        @Override // a.xdr
                                                        public final Object F(Object obj11, Object obj12, Object obj13) {
                                                            byte b11 = b8;
                                                            srr srrVar3 = srrVar2;
                                                            switch (b11) {
                                                                case 0:
                                                                    mm40 mm40Var4 = (mm40) obj11;
                                                                    fet fetVar6 = (fet) obj12;
                                                                    int iIntValue4 = ((Integer) obj13).intValue();
                                                                    mm40Var4.getClass();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                                                    }
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        String str = srrVar3.b;
                                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                                        v8q0.a(str, mm40Var4, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, (iIntValue4 << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    fet fetVar7 = (fet) obj12;
                                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                                    ((mm40) obj11).getClass();
                                                                    if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                        n4c.l(jm40.b, srrVar3.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                                                                    } else {
                                                                        fetVar7.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mm40 mm40Var5 = (mm40) obj11;
                                                                    fet fetVar8 = (fet) obj12;
                                                                    int iIntValue6 = ((Integer) obj13).intValue();
                                                                    mm40Var5.getClass();
                                                                    if ((iIntValue6 & 6) == 0) {
                                                                        iIntValue6 |= fetVar8.g(mm40Var5) ? 4 : 2;
                                                                    }
                                                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                        int i = iIntValue6;
                                                                        String str2 = srrVar3.c;
                                                                        pz40 pz40Var3 = s6t0.f31722a;
                                                                        v8q0.a(str2, mm40Var5, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar8, (i << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5);
                                                    final byte b10 = z4 ? (byte) 1 : (byte) 0;
                                                    wzb.y(mm40VarL2, q3d.j(ugdVarM, u1c.M(1422571108, new xdr() { // from class: a.arr
                                                        @Override // a.xdr
                                                        public final Object F(Object obj11, Object obj12, Object obj13) {
                                                            byte b11 = b10;
                                                            srr srrVar3 = srrVar2;
                                                            switch (b11) {
                                                                case 0:
                                                                    mm40 mm40Var4 = (mm40) obj11;
                                                                    fet fetVar6 = (fet) obj12;
                                                                    int iIntValue4 = ((Integer) obj13).intValue();
                                                                    mm40Var4.getClass();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                                                    }
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        String str = srrVar3.b;
                                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                                        v8q0.a(str, mm40Var4, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, (iIntValue4 << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    fet fetVar7 = (fet) obj12;
                                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                                    ((mm40) obj11).getClass();
                                                                    if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                        n4c.l(jm40.b, srrVar3.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                                                                    } else {
                                                                        fetVar7.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mm40 mm40Var5 = (mm40) obj11;
                                                                    fet fetVar8 = (fet) obj12;
                                                                    int iIntValue6 = ((Integer) obj13).intValue();
                                                                    mm40Var5.getClass();
                                                                    if ((iIntValue6 & 6) == 0) {
                                                                        iIntValue6 |= fetVar8.g(mm40Var5) ? 4 : 2;
                                                                    }
                                                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                        int i = iIntValue6;
                                                                        String str2 = srrVar3.c;
                                                                        pz40 pz40Var3 = s6t0.f31722a;
                                                                        v8q0.a(str2, mm40Var5, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar8, (i << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5), u1c.M(-1730048603, new xdr() { // from class: a.arr
                                                        @Override // a.xdr
                                                        public final Object F(Object obj11, Object obj12, Object obj13) {
                                                            byte b11 = b9;
                                                            srr srrVar3 = srrVar2;
                                                            switch (b11) {
                                                                case 0:
                                                                    mm40 mm40Var4 = (mm40) obj11;
                                                                    fet fetVar6 = (fet) obj12;
                                                                    int iIntValue4 = ((Integer) obj13).intValue();
                                                                    mm40Var4.getClass();
                                                                    if ((iIntValue4 & 6) == 0) {
                                                                        iIntValue4 |= fetVar6.g(mm40Var4) ? 4 : 2;
                                                                    }
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                        String str = srrVar3.b;
                                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                                        v8q0.a(str, mm40Var4, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, (iIntValue4 << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    fet fetVar7 = (fet) obj12;
                                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                                    ((mm40) obj11).getClass();
                                                                    if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                        n4c.l(jm40.b, srrVar3.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                                                                    } else {
                                                                        fetVar7.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    mm40 mm40Var5 = (mm40) obj11;
                                                                    fet fetVar8 = (fet) obj12;
                                                                    int iIntValue6 = ((Integer) obj13).intValue();
                                                                    mm40Var5.getClass();
                                                                    if ((iIntValue6 & 6) == 0) {
                                                                        iIntValue6 |= fetVar8.g(mm40Var5) ? 4 : 2;
                                                                    }
                                                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                        int i = iIntValue6;
                                                                        String str2 = srrVar3.c;
                                                                        pz40 pz40Var3 = s6t0.f31722a;
                                                                        v8q0.a(str2, mm40Var5, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar8, (i << 3) & 112, 24960, 109560);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5)), fetVar5);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            default:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    jwb.r(mm40Var3, srrVar2.e, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), fetVar, 28032, 2);
                                fetVar.r(false);
                            } else if (asrVar instanceof nrr) {
                                fetVar.e0(2000192159);
                                final nrr nrrVar = (nrr) asrVar;
                                final byte b7 = 1;
                                n4c.s(jm40Var, nw3Var, u1c.M(-1907190411, new ydr() { // from class: a.qqr
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        byte b8 = b3;
                                        nrr nrrVar2 = nrrVar;
                                        mm40 mm40Var3 = (mm40) obj8;
                                        fet fetVar5 = (fet) obj9;
                                        int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                        switch (b8) {
                                            case 0:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    ozb.y(mm40Var3, nrrVar2.f24018a, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            default:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    jwb.r(mm40Var3, nrrVar2.d, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), u1c.M(-397168586, new ec30(nrrVar, function4, (byte) 27), fetVar), u1c.M(1112853239, new ydr() { // from class: a.qqr
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        byte b8 = b7;
                                        nrr nrrVar2 = nrrVar;
                                        mm40 mm40Var3 = (mm40) obj8;
                                        fet fetVar5 = (fet) obj9;
                                        int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                        switch (b8) {
                                            case 0:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    ozb.y(mm40Var3, nrrVar2.f24018a, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            default:
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    jwb.r(mm40Var3, nrrVar2.d, fetVar5, (iD >> 3) & 14);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), fetVar, 28080, 0);
                                fetVar.r(false);
                            } else {
                                if (asrVar instanceof wrr) {
                                    fetVar.e0(2000197545);
                                    final wrr wrrVar = (wrr) asrVar;
                                    final byte b8 = 1;
                                    final byte b9 = 2;
                                    n4c.s(jm40Var, null, u1c.M(300678874, new ydr() { // from class: a.hrr
                                        @Override // a.ydr
                                        public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                            byte b10 = b3;
                                            wrr wrrVar2 = wrrVar;
                                            switch (b10) {
                                                case 0:
                                                    mm40 mm40Var3 = (mm40) obj8;
                                                    fet fetVar5 = (fet) obj9;
                                                    int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                                    if ((iD & 48) == 0) {
                                                        iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                    }
                                                    if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                        ozb.y(mm40Var3, wrrVar2.f39658a, fetVar5, (iD >> 3) & 14);
                                                    } else {
                                                        fetVar5.X();
                                                    }
                                                    break;
                                                case 1:
                                                    mm40 mm40Var4 = (mm40) obj8;
                                                    fet fetVar6 = (fet) obj9;
                                                    int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var4);
                                                    if ((iD2 & 48) == 0) {
                                                        iD2 |= fetVar6.g(mm40Var4) ? 32 : 16;
                                                    }
                                                    if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                        zcl zclVar3 = qmk.f28987a;
                                                        mm40 mm40VarE2 = o7k0.e(s5x0.L(mm40Var4, 8.0f, 0.0f, 2), 100.0f);
                                                        tj30 tj30VarC5 = zq8.c(gqw0.e, false);
                                                        int iHashCode5 = Long.hashCode(fetVar6.T);
                                                        bh90 bh90VarM5 = fetVar6.m();
                                                        mm40 mm40VarC4 = kbc.c0(fetVar6, mm40VarE2);
                                                        mkd.c0.getClass();
                                                        fetVar6.i0();
                                                        if (fetVar6.S) {
                                                            fetVar6.l(e7z.u1);
                                                        } else {
                                                            fetVar6.r0();
                                                        }
                                                        jpm0.o(fetVar6, tj30VarC5, gqw0.x);
                                                        jpm0.o(fetVar6, bh90VarM5, gqw0.w);
                                                        jpm0.o(fetVar6, Integer.valueOf(iHashCode5), gqw0.y);
                                                        jpm0.n(fetVar6);
                                                        jpm0.o(fetVar6, mm40VarC4, gqw0.v);
                                                        String str = wrrVar2.b;
                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                        v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 0, 24960, 109562);
                                                        fetVar6.r(true);
                                                    } else {
                                                        fetVar6.X();
                                                    }
                                                    break;
                                                default:
                                                    mm40 mm40Var5 = (mm40) obj8;
                                                    fet fetVar7 = (fet) obj9;
                                                    int iD3 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var5);
                                                    if ((iD3 & 48) == 0) {
                                                        iD3 |= fetVar7.g(mm40Var5) ? 32 : 16;
                                                    }
                                                    if (fetVar7.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                        jwb.r(mm40Var5, wrrVar2.c, fetVar7, (iD3 >> 3) & 14);
                                                    } else {
                                                        fetVar7.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar), u1c.M(1555460891, new ydr() { // from class: a.hrr
                                        @Override // a.ydr
                                        public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                            byte b10 = b8;
                                            wrr wrrVar2 = wrrVar;
                                            switch (b10) {
                                                case 0:
                                                    mm40 mm40Var3 = (mm40) obj8;
                                                    fet fetVar5 = (fet) obj9;
                                                    int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                                    if ((iD & 48) == 0) {
                                                        iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                    }
                                                    if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                        ozb.y(mm40Var3, wrrVar2.f39658a, fetVar5, (iD >> 3) & 14);
                                                    } else {
                                                        fetVar5.X();
                                                    }
                                                    break;
                                                case 1:
                                                    mm40 mm40Var4 = (mm40) obj8;
                                                    fet fetVar6 = (fet) obj9;
                                                    int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var4);
                                                    if ((iD2 & 48) == 0) {
                                                        iD2 |= fetVar6.g(mm40Var4) ? 32 : 16;
                                                    }
                                                    if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                        zcl zclVar3 = qmk.f28987a;
                                                        mm40 mm40VarE2 = o7k0.e(s5x0.L(mm40Var4, 8.0f, 0.0f, 2), 100.0f);
                                                        tj30 tj30VarC5 = zq8.c(gqw0.e, false);
                                                        int iHashCode5 = Long.hashCode(fetVar6.T);
                                                        bh90 bh90VarM5 = fetVar6.m();
                                                        mm40 mm40VarC4 = kbc.c0(fetVar6, mm40VarE2);
                                                        mkd.c0.getClass();
                                                        fetVar6.i0();
                                                        if (fetVar6.S) {
                                                            fetVar6.l(e7z.u1);
                                                        } else {
                                                            fetVar6.r0();
                                                        }
                                                        jpm0.o(fetVar6, tj30VarC5, gqw0.x);
                                                        jpm0.o(fetVar6, bh90VarM5, gqw0.w);
                                                        jpm0.o(fetVar6, Integer.valueOf(iHashCode5), gqw0.y);
                                                        jpm0.n(fetVar6);
                                                        jpm0.o(fetVar6, mm40VarC4, gqw0.v);
                                                        String str = wrrVar2.b;
                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                        v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 0, 24960, 109562);
                                                        fetVar6.r(true);
                                                    } else {
                                                        fetVar6.X();
                                                    }
                                                    break;
                                                default:
                                                    mm40 mm40Var5 = (mm40) obj8;
                                                    fet fetVar7 = (fet) obj9;
                                                    int iD3 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var5);
                                                    if ((iD3 & 48) == 0) {
                                                        iD3 |= fetVar7.g(mm40Var5) ? 32 : 16;
                                                    }
                                                    if (fetVar7.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                        jwb.r(mm40Var5, wrrVar2.c, fetVar7, (iD3 >> 3) & 14);
                                                    } else {
                                                        fetVar7.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar), u1c.M(-1484724388, new ydr() { // from class: a.hrr
                                        @Override // a.ydr
                                        public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                            byte b10 = b9;
                                            wrr wrrVar2 = wrrVar;
                                            switch (b10) {
                                                case 0:
                                                    mm40 mm40Var3 = (mm40) obj8;
                                                    fet fetVar5 = (fet) obj9;
                                                    int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                                    if ((iD & 48) == 0) {
                                                        iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                    }
                                                    if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                        ozb.y(mm40Var3, wrrVar2.f39658a, fetVar5, (iD >> 3) & 14);
                                                    } else {
                                                        fetVar5.X();
                                                    }
                                                    break;
                                                case 1:
                                                    mm40 mm40Var4 = (mm40) obj8;
                                                    fet fetVar6 = (fet) obj9;
                                                    int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var4);
                                                    if ((iD2 & 48) == 0) {
                                                        iD2 |= fetVar6.g(mm40Var4) ? 32 : 16;
                                                    }
                                                    if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                        zcl zclVar3 = qmk.f28987a;
                                                        mm40 mm40VarE2 = o7k0.e(s5x0.L(mm40Var4, 8.0f, 0.0f, 2), 100.0f);
                                                        tj30 tj30VarC5 = zq8.c(gqw0.e, false);
                                                        int iHashCode5 = Long.hashCode(fetVar6.T);
                                                        bh90 bh90VarM5 = fetVar6.m();
                                                        mm40 mm40VarC4 = kbc.c0(fetVar6, mm40VarE2);
                                                        mkd.c0.getClass();
                                                        fetVar6.i0();
                                                        if (fetVar6.S) {
                                                            fetVar6.l(e7z.u1);
                                                        } else {
                                                            fetVar6.r0();
                                                        }
                                                        jpm0.o(fetVar6, tj30VarC5, gqw0.x);
                                                        jpm0.o(fetVar6, bh90VarM5, gqw0.w);
                                                        jpm0.o(fetVar6, Integer.valueOf(iHashCode5), gqw0.y);
                                                        jpm0.n(fetVar6);
                                                        jpm0.o(fetVar6, mm40VarC4, gqw0.v);
                                                        String str = wrrVar2.b;
                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                        v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 0, 24960, 109562);
                                                        fetVar6.r(true);
                                                    } else {
                                                        fetVar6.X();
                                                    }
                                                    break;
                                                default:
                                                    mm40 mm40Var5 = (mm40) obj8;
                                                    fet fetVar7 = (fet) obj9;
                                                    int iD3 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var5);
                                                    if ((iD3 & 48) == 0) {
                                                        iD3 |= fetVar7.g(mm40Var5) ? 32 : 16;
                                                    }
                                                    if (fetVar7.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                        jwb.r(mm40Var5, wrrVar2.c, fetVar7, (iD3 >> 3) & 14);
                                                    } else {
                                                        fetVar7.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar), fetVar, 28032, 2);
                                    fetVar.r(false);
                                } else {
                                    if (!(asrVar instanceof yrr)) {
                                        throw b1j.f(2000179880, fetVar, false);
                                    }
                                    fetVar.e0(2000200547);
                                    final yrr yrrVar = (yrr) asrVar;
                                    pz40 pz40VarF = androidx.compose.runtime.e.f(yrrVar.e.f17160a, fetVar);
                                    ugd ugdVarM = u1c.M(540223663, new ydr() { // from class: a.jrr
                                        @Override // a.ydr
                                        public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                            byte b10 = b3;
                                            yrr yrrVar2 = yrrVar;
                                            mm40 mm40Var3 = (mm40) obj8;
                                            fet fetVar5 = (fet) obj9;
                                            int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                            switch (b10) {
                                                case 0:
                                                    if ((iD & 48) == 0) {
                                                        iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                    }
                                                    if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                        ozb.y(mm40Var3, yrrVar2.f43135a, fetVar5, (iD >> 3) & 14);
                                                    } else {
                                                        fetVar5.X();
                                                    }
                                                    break;
                                                default:
                                                    if ((iD & 48) == 0) {
                                                        iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                    }
                                                    if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                        jwb.r(mm40Var3, yrrVar2.d, fetVar5, (iD >> 3) & 14);
                                                    } else {
                                                        fetVar5.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar);
                                    ugd ugdVarM2 = u1c.M(985760974, new n82(yrrVar, pz40VarF, function4, b2), fetVar);
                                    z2 = true;
                                    final char c = 1 == true ? 1 : 0;
                                    n4c.s(jm40Var, nw3Var, ugdVarM, ugdVarM2, u1c.M(1431298285, new ydr() { // from class: a.jrr
                                        @Override // a.ydr
                                        public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                            byte b10 = c;
                                            yrr yrrVar2 = yrrVar;
                                            mm40 mm40Var3 = (mm40) obj8;
                                            fet fetVar5 = (fet) obj9;
                                            int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                            switch (b10) {
                                                case 0:
                                                    if ((iD & 48) == 0) {
                                                        iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                    }
                                                    if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                        ozb.y(mm40Var3, yrrVar2.f43135a, fetVar5, (iD >> 3) & 14);
                                                    } else {
                                                        fetVar5.X();
                                                    }
                                                    break;
                                                default:
                                                    if ((iD & 48) == 0) {
                                                        iD |= fetVar5.g(mm40Var3) ? 32 : 16;
                                                    }
                                                    if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                        jwb.r(mm40Var3, yrrVar2.d, fetVar5, (iD >> 3) & 14);
                                                    } else {
                                                        fetVar5.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar), fetVar, 28080, 0);
                                    fetVar.r(false);
                                }
                                fetVar.r(z2);
                            }
                        }
                    }
                    z2 = true;
                    fetVar.r(z2);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                shd shdVar5 = gqw0.v;
                shd shdVar6 = gqw0.y;
                shd shdVar7 = gqw0.w;
                shd shdVar8 = gqw0.x;
                epd0 epd0Var = (epd0) obj6;
                tnd0 tnd0Var = (tnd0) obj5;
                Function1 function5 = (Function1) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                zx7 zx7Var2 = gqw0.e;
                lr8Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar5.g(lr8Var) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    Object objP7 = fetVar5.P();
                    if (objP7 == cl5Var) {
                        objP7 = androidx.compose.runtime.e.e(new ycl(lr8Var.d()));
                        fetVar5.o0(objP7);
                    }
                    int iA = ycl.a(f, ((ycl) ((pz40) objP7).getValue()).f42389a);
                    jm40 jm40Var2 = jm40.b;
                    if (iA <= 0 || epd0Var.f == null) {
                        fetVar5.e0(-1262511500);
                        mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarE2 = o7k0.e(mm40VarD, 48.0f);
                        tj30 tj30VarC5 = zq8.c(zx7Var2, false);
                        int iHashCode5 = Long.hashCode(fetVar5.T);
                        bh90 bh90VarM5 = fetVar5.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar5, mm40VarE2);
                        mkd.c0.getClass();
                        fetVar5.i0();
                        if (fetVar5.S) {
                            fetVar5.l(pcyVar2);
                        } else {
                            fetVar5.r0();
                        }
                        jpm0.o(fetVar5, tj30VarC5, shdVar8);
                        jpm0.o(fetVar5, bh90VarM5, shdVar7);
                        jpm0.o(fetVar5, Integer.valueOf(iHashCode5), shdVar6);
                        jpm0.n(fetVar5);
                        jpm0.o(fetVar5, mm40VarC4, shdVar5);
                        zvw.o(null, epd0Var, tnd0Var, function5, null, fetVar5, 0);
                        fetVar5.r(true);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-1261983260);
                        mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarE3 = o7k0.e(mm40VarD2, 84.0f);
                        tj30 tj30VarC6 = zq8.c(zx7Var2, false);
                        int iHashCode6 = Long.hashCode(fetVar5.T);
                        bh90 bh90VarM6 = fetVar5.m();
                        mm40 mm40VarC5 = kbc.c0(fetVar5, mm40VarE3);
                        mkd.c0.getClass();
                        fetVar5.i0();
                        if (fetVar5.S) {
                            fetVar5.l(pcyVar2);
                        } else {
                            fetVar5.r0();
                        }
                        jpm0.o(fetVar5, tj30VarC6, shdVar8);
                        jpm0.o(fetVar5, bh90VarM6, shdVar7);
                        jpm0.o(fetVar5, Integer.valueOf(iHashCode6), shdVar6);
                        jpm0.n(fetVar5);
                        jpm0.o(fetVar5, mm40VarC5, shdVar5);
                        zvw.m(epd0Var, tnd0Var, function5, fetVar5, 6);
                        fetVar5.r(true);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ tp7(Object obj, float f, Object obj2, Object obj3, byte b) {
        this.f34317a = b;
        this.c = obj;
        this.b = f;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ tp7(Function1 function1, Function1 function2, float f, l7m0 l7m0Var) {
        this.f34317a = (byte) 2;
        this.e = function1;
        this.c = function2;
        this.b = f;
        this.d = l7m0Var;
    }
}
