package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dqz implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6536a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ dqz(l7m0 l7m0Var, Function1 function1) {
        this.f6536a = (byte) 15;
        this.b = l7m0Var;
        this.c = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        byte b = this.f6536a;
        jm40 jm40Var = jm40.b;
        byte b2 = 25;
        cl5 cl5Var = ukd.f35823a;
        byte b3 = 2;
        Function1 function1 = this.c;
        l7m0 l7m0Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                hh80 hh80Var = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(hh80Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nia0.K(hh80Var, l7m0Var, function1, fetVar2, iIntValue & 14);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                hh80 hh80Var2 = (hh80) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                hh80Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar3.g(hh80Var2) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    xia0.E(hh80Var2, l7m0Var, function1, fetVar3, iIntValue2 & 14);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    rd30 rd30Var = (rd30) l7m0Var.getValue();
                    if (rd30Var != null) {
                        if (rd30Var instanceof pd30) {
                            fetVar4.e0(1382330311);
                            azw.g(0, fetVar4, ((pd30) rd30Var).c);
                            fetVar4.r(false);
                        } else if (rd30Var instanceof od30) {
                            fetVar4.e0(1382333209);
                            azw.b(((od30) rd30Var).c, function1, fetVar4, 0);
                            fetVar4.r(false);
                        } else if (rd30Var instanceof qd30) {
                            fetVar4.e0(1382338709);
                            azw.i(l7m0Var, function1, fetVar4, 0);
                            fetVar4.r(false);
                        }
                    }
                    throw b1j.f(1382327997, fetVar4, false);
                }
                fetVar4.X();
                return Unit.f46060a;
            case 3:
                ir8 ir8Var = (ir8) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar5.g(ir8Var) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    yw50 yw50Var = (yw50) l7m0Var.getValue();
                    if (yw50Var != null) {
                        if (yw50Var instanceof ww50) {
                            fetVar5.e0(1015119040);
                            q5x.g(0, fetVar5);
                            fetVar5.r(false);
                        } else if (yw50Var instanceof vw50) {
                            fetVar5.e0(1015120916);
                            q5x.b(ir8Var, ((vw50) yw50Var).c, function1, fetVar5, iIntValue4 & 14);
                            fetVar5.r(false);
                        } else if (yw50Var instanceof xw50) {
                            fetVar5.e0(1015126466);
                            q5x.k((xw50) yw50Var, function1, fetVar5, 0);
                            fetVar5.r(false);
                        }
                    }
                    throw b1j.f(1015116994, fetVar5, false);
                }
                fetVar5.X();
                return Unit.f46060a;
            case 4:
                hh80 hh80Var3 = (hh80) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                hh80Var3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar6.g(hh80Var3) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    if (((q560) l7m0Var.getValue()).f28135a) {
                        fetVar6.e0(-1012714400);
                        xia0.I(hh80Var3, fetVar6, iIntValue5 & 14);
                    } else {
                        fetVar6.e0(-1329355145);
                    }
                    fetVar6.r(false);
                    xia0.K(hh80Var3, l7m0Var, function1, fetVar6, iIntValue5 & 14);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    b34.h(((iu70) l7m0Var.getValue()).l, null, kzn.d(null, 0.0f, 3), kzn.e(null, 3), "AnimatedVisibility", u1c.M(-1472116317, new uis(u1c.M(-1041022814, new zs70(l7m0Var, function1, b3), fetVar7), (byte) 6), fetVar7), fetVar7, 221184, 2);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fet fetVar8 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar8.h(zBooleanValue) ? (byte) 4 : (byte) 2;
                }
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 72.0f);
                    boolean z2 = ((iu70) l7m0Var.getValue()).c;
                    wvw wvwVarC = xvw.C(fetVar8);
                    StaticColors staticColors = StaticColors.INSTANCE;
                    wvw wvwVarA = wvwVarC.a(zBooleanValue ? staticColors.m113getRed0d7_KjU() : staticColors.m98getGreen0d7_KjU(), staticColors.m123getWhite0d7_KjU(), zBooleanValue ? staticColors.m113getRed0d7_KjU() : staticColors.m98getGreen0d7_KjU(), staticColors.m123getWhite0d7_KjU());
                    int i = ((iu70) l7m0Var.getValue()).u;
                    boolean zG = fetVar8.g(function1) | ((iIntValue7 & 14) == 4) | fetVar8.g(l7m0Var);
                    Object objP = fetVar8.P();
                    if (zG || objP == cl5Var) {
                        objP = new lf2(function1, zBooleanValue, l7m0Var, (byte) 9);
                        fetVar8.o0(objP);
                    }
                    q5x.p(mm40VarN, wvwVarA, null, (Function0) objP, i, z2, fetVar8, 196608, 4);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                ir8 ir8Var2 = (ir8) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ir8Var2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar9.g(ir8Var2) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    saj.E(ir8Var2, l7m0Var, function1, fetVar9, iIntValue8 & 14);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar10 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    rla0 rla0Var = (rla0) l7m0Var.getValue();
                    if (rla0Var != null) {
                        if (rla0Var instanceof qla0) {
                            fetVar10.e0(1599450902);
                            knx.s(0, fetVar10);
                            fetVar10.r(false);
                        } else if (rla0Var instanceof pla0) {
                            fetVar10.e0(1599453633);
                            knx.r(((pla0) rla0Var).d, function1, fetVar10, 0);
                            fetVar10.r(false);
                        } else if (rla0Var instanceof ola0) {
                            fetVar10.e0(1599459729);
                            knx.q((ola0) rla0Var, function1, fetVar10, 0);
                            fetVar10.r(false);
                        }
                    }
                    throw b1j.f(1599448273, fetVar10, false);
                }
                fetVar10.X();
                return Unit.f46060a;
            case 9:
                fet fetVar11 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar11.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    vma0 vma0Var = (vma0) l7m0Var.getValue();
                    if (vma0Var != null) {
                        if (vma0Var instanceof uma0) {
                            fetVar11.e0(1795823171);
                            ahy.z(0, fetVar11);
                            fetVar11.r(false);
                        } else if (vma0Var instanceof tma0) {
                            fetVar11.e0(1795825454);
                            ahy.s(((tma0) vma0Var).d, function1, fetVar11, 0);
                            fetVar11.r(false);
                        } else if (vma0Var instanceof sma0) {
                            fetVar11.e0(1795831119);
                            ahy.G((sma0) vma0Var, function1, fetVar11, 0);
                            fetVar11.r(false);
                        }
                    }
                    throw b1j.f(1795820748, fetVar11, false);
                }
                fetVar11.X();
                return Unit.f46060a;
            case 10:
                fet fetVar12 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar12.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    t8e0 t8e0Var = (t8e0) l7m0Var.getValue();
                    if (t8e0Var != null) {
                        if (t8e0Var instanceof q8e0) {
                            fetVar12.e0(566760904);
                            mdm mdmVar = ((q8e0) t8e0Var).d;
                            boolean zG2 = fetVar12.g(function1);
                            Object objP2 = fetVar12.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new evd0(function1, (byte) 16);
                                fetVar12.o0(objP2);
                            }
                            hp4.j(mdmVar, (Function0) objP2, fetVar12, 0);
                            fetVar12.r(false);
                        } else if (t8e0Var instanceof r8e0) {
                            fetVar12.e0(566767506);
                            hp4.v(0, fetVar12);
                            fetVar12.r(false);
                        } else if (t8e0Var instanceof s8e0) {
                            fetVar12.e0(566769545);
                            hp4.y(((s8e0) t8e0Var).d, function1, fetVar12, 8);
                            fetVar12.r(false);
                        }
                    }
                    throw b1j.f(566758616, fetVar12, false);
                }
                fetVar12.X();
                return Unit.f46060a;
            case 11:
                hh80 hh80Var4 = (hh80) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                hh80Var4.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar13.g(hh80Var4) ? 4 : 2;
                }
                if (fetVar13.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    kc5.h0(hh80Var4, l7m0Var, function1, fetVar13, iIntValue12 & 14);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 12:
                hh80 hh80Var5 = (hh80) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                hh80Var5.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar14.g(hh80Var5) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    saj.n(hh80Var5, l7m0Var, function1, fetVar14, iIntValue13 & 14);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 13:
                fet fetVar15 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 8.0f, 1);
                    String str = ((qgf0) l7m0Var.getValue()).b;
                    boolean zG3 = fetVar15.g(function1);
                    Object objP3 = fetVar15.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new dvd0(function1, (byte) 25);
                        fetVar15.o0(objP3);
                    }
                    aac.n(mm40VarL, false, str, null, null, null, (Function1) objP3, null, null, fetVar15, 0, 442);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 14:
                fet fetVar16 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar16.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    f5k0 f5k0Var = (f5k0) l7m0Var.getValue();
                    if (f5k0Var != null) {
                        if (f5k0Var instanceof e5k0) {
                            fetVar16.e0(-2045773723);
                            ay3.v(0, fetVar16);
                            fetVar16.r(false);
                        } else if (f5k0Var instanceof d5k0) {
                            fetVar16.e0(-2045771261);
                            ay3.q((d5k0) f5k0Var, function1, fetVar16, 0);
                            fetVar16.r(false);
                        } else if (f5k0Var instanceof c5k0) {
                            fetVar16.e0(-2045765801);
                            ay3.D((c5k0) f5k0Var, function1, fetVar16, 0);
                            fetVar16.r(false);
                        }
                    }
                    throw b1j.f(-2045776327, fetVar16, false);
                }
                fetVar16.X();
                return Unit.f46060a;
            case 15:
                fet fetVar17 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar17.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    float f = qmk.a(fetVar17).d;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarL2 = s5x0.L(jm40Var2, f, 0.0f, 2);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar17.T);
                    bh90 bh90VarM = fetVar17.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar17, mm40VarL2);
                    mkd.c0.getClass();
                    fetVar17.i0();
                    if (fetVar17.S) {
                        fetVar17.l(e7z.u1);
                    } else {
                        fetVar17.r0();
                    }
                    jpm0.o(fetVar17, tj30VarC, gqw0.x);
                    jpm0.o(fetVar17, bh90VarM, gqw0.w);
                    jpm0.o(fetVar17, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar17);
                    jpm0.o(fetVar17, mm40VarC0, gqw0.v);
                    jcm0 jcm0Var = (jcm0) l7m0Var.getValue();
                    if (jcm0Var != null) {
                        if (jcm0Var instanceof gcm0) {
                            fetVar17.e0(686658567);
                            mm40 mm40VarB = jr8.f16991a.b(jm40Var2, gqw0.e);
                            mdm mdmVar2 = ((gcm0) jcm0Var).d;
                            boolean zG4 = fetVar17.g(function1);
                            Object objP4 = fetVar17.P();
                            if (zG4 || objP4 == cl5Var) {
                                objP4 = new yhl0(function1, (byte) 27);
                                fetVar17.o0(objP4);
                            }
                            jcb.l(mm40VarB, mdmVar2, false, (Function0) objP4, fetVar17, 0, 4);
                            fetVar = fetVar17;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar17;
                            if (jcm0Var instanceof hcm0) {
                                fetVar.e0(686667457);
                                xvw.d(4, 48, fetVar, s5x0.N(jm40Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13));
                                fetVar.r(false);
                            } else if (jcm0Var instanceof icm0) {
                                fetVar.e0(686674255);
                                ArrayList arrayList = ((icm0) jcm0Var).d;
                                boolean zG5 = fetVar.g(function1);
                                Object objP5 = fetVar.P();
                                if (zG5 || objP5 == cl5Var) {
                                    objP5 = new zbm0(function1, z ? (byte) 1 : (byte) 0);
                                    fetVar.o0(objP5);
                                }
                                bcm0.a(arrayList, (Function1) objP5, fetVar, 0);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(true);
                    } else {
                        fetVar = fetVar17;
                    }
                    throw b1j.f(686656506, fetVar, false);
                }
                fetVar17.X();
                return Unit.f46060a;
            case 16:
                fet fetVar18 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar18.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    h6p0 h6p0Var = (h6p0) l7m0Var.getValue();
                    if (h6p0Var != null) {
                        if (h6p0Var instanceof f6p0) {
                            fetVar18.e0(576009756);
                            w7n0.f(0, fetVar18);
                            fetVar18.r(false);
                        } else if (h6p0Var instanceof e6p0) {
                            fetVar18.e0(576122534);
                            w7n0.c(((e6p0) h6p0Var).c, function1, fetVar18, 0);
                            fetVar18.r(false);
                        } else if (h6p0Var instanceof g6p0) {
                            fetVar18.e0(576349082);
                            g6p0 g6p0Var = (g6p0) h6p0Var;
                            w7n0.b(g6p0Var.c, g6p0Var.b, fetVar18, 0);
                            fetVar18.r(false);
                        }
                    }
                    throw b1j.f(-1921084122, fetVar18, false);
                }
                fetVar18.X();
                return Unit.f46060a;
            case 17:
                fet fetVar19 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar19.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    itp0 itp0Var = (itp0) l7m0Var.getValue();
                    if (itp0Var != null) {
                        if (itp0Var instanceof htp0) {
                            fetVar19.e0(1600045489);
                            q8a.t(0, fetVar19);
                            fetVar19.r(false);
                        } else if (itp0Var instanceof gtp0) {
                            fetVar19.e0(1600047791);
                            q8a.o((gtp0) itp0Var, function1, fetVar19, 0);
                            fetVar19.r(false);
                        } else if (itp0Var instanceof ftp0) {
                            fetVar19.e0(1600053086);
                            q8a.E((ftp0) itp0Var, function1, fetVar19, 0);
                            fetVar19.r(false);
                        }
                    }
                    throw b1j.f(1600043025, fetVar19, false);
                }
                fetVar19.X();
                return Unit.f46060a;
            case 18:
                fet fetVar20 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar20.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    w3q0 w3q0Var = (w3q0) l7m0Var.getValue();
                    if (w3q0Var != null) {
                        if (w3q0Var instanceof u3q0) {
                            fetVar20.e0(-868519142);
                            tke.D(0, fetVar20);
                            fetVar20.r(false);
                        } else if (w3q0Var instanceof t3q0) {
                            fetVar20.e0(-868516978);
                            tke.y(((t3q0) w3q0Var).c, function1, fetVar20, 0);
                            fetVar20.r(false);
                        } else if (w3q0Var instanceof v3q0) {
                            fetVar20.e0(-868511135);
                            tke.l((v3q0) w3q0Var, function1, fetVar20, 0);
                            fetVar20.r(false);
                        }
                    }
                    throw b1j.f(-868521444, fetVar20, false);
                }
                fetVar20.X();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                mm40 mm40Var = (mm40) obj;
                fet fetVar21 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= fetVar21.g(mm40Var) ? 4 : 2;
                }
                if (fetVar21.U(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    hjs hjsVar = ((ojs) l7m0Var.getValue()).e;
                    boolean zG6 = fetVar21.g(function1);
                    Object objP6 = fetVar21.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new coo0(function1, b2);
                        fetVar21.o0(objP6);
                    }
                    xbc.x(mm40Var, hjsVar, (Function1) objP6, fetVar21, iIntValue20 & 14);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            default:
                ir8 ir8Var3 = (ir8) obj;
                fet fetVar22 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ir8Var3.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= fetVar22.g(ir8Var3) ? 4 : 2;
                }
                if (fetVar22.U(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    int iOrdinal = ((zlv0) l7m0Var.getValue()).d().ordinal();
                    if (iOrdinal == 0) {
                        fetVar22.e0(1958910541);
                        ju70.I(ir8Var3, l7m0Var, function1, fetVar22, iIntValue21 & 14);
                        fetVar22.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar22.e0(596810923);
                        ohm0.g(ir8Var3, l7m0Var, function1, fetVar22, iIntValue21 & 14);
                        fetVar22.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw b1j.f(1958908156, fetVar22, false);
                        }
                        fetVar22.e0(596990816);
                        hhm0.k(ir8Var3, l7m0Var, function1, fetVar22, iIntValue21 & 14);
                        fetVar22.r(false);
                    }
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dqz(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f6536a = b;
        this.b = l7m0Var;
        this.c = function1;
    }
}
