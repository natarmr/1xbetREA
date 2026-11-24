package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sd8 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32020a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sd8(Object obj, byte b) {
        this.f32020a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        xej xejVar = (xej) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        nwd nwdVar = xej.l2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 28.0f, 0L, fetVar, 0, 5);
            wwb.i(null, xejVar.P0().f47184a, 0L, 0, 0L, fetVar, 0, 29);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            vtb.t(null, qqm.b, null, 0L, fetVar, 48, 13);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        hll hllVar = (hll) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            String str = hllVar.j;
            gso0 gso0Var = gso0.f11839a;
            if (str != null) {
                fetVar.e0(-489254513);
                j6n.h(hllVar.j, gso0Var, null, 0, 0, fetVar, 48, 28);
                fetVar.r(false);
            } else {
                fetVar.e0(-489029639);
                fetVar.r(false);
            }
            if (hllVar.k != null) {
                fetVar.e0(-488961811);
                j6n.h(hllVar.k, gso0Var, null, 0, 0, fetVar, 48, 28);
                fetVar.r(false);
            } else {
                fetVar.e0(-488735015);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        xk80 xk80Var = (xk80) this.b;
        lr8 lr8Var = (lr8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        lr8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(lr8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fD = lr8Var.d();
            zcl zclVar = qmk.f28987a;
            float f = (fD - 304.0f) / 2.0f;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            q5x.e(xk80Var, o7k0.d(jm40.b, 1.0f), s5x0.t(f, 0.0f, 2), new xi80(), 0, 12.0f, null, null, false, null, null, gfk0.b, null, u1c.M(-1411618004, new ec30((vne) objP, xk80Var, (byte) 22), fetVar), fetVar, 48, 24960, 12240);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02f3  */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Object objJ;
        Object objJ2;
        ugd ugdVar;
        byte b = this.f32020a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 18;
        ugd ugdVarM = null;
        jm40 jm40Var = jm40.b;
        final byte b3 = 2;
        boolean z = true;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                tf5 tf5Var = (tf5) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    thb.f(null, tf5Var, fetVar, 0, 1);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                return new qb(obj3, obj4, obj, (byte) 22);
            case 2:
                i4 i4Var = (i4) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ListIterator listIterator = i4Var.listIterator(0);
                    while (listIterator.hasNext()) {
                        sc9 sc9Var = (sc9) listIterator.next();
                        fetVar2.b0(-1063563166, sc9Var.getKey());
                        if (sc9Var instanceof qc9) {
                            fetVar2.e0(1389362901);
                            j6n.h(rsm0.w(R.string.incompatible, 0, fetVar2), ((qc9) sc9Var).b, null, 0, 0, fetVar2, 0, 28);
                            fetVar2.r(false);
                        } else {
                            if (!(sc9Var instanceof rc9)) {
                                throw b1j.f(-1063562095, fetVar2, false);
                            }
                            fetVar2.e0(1389882058);
                            v8q0.a(((rc9) sc9Var).b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar2, 0, 24960, 110590);
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                ((b530) obj4).invoke((Throwable) obj);
                return Unit.f46060a;
            case 4:
                vaa vaaVar = (vaa) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((mm40) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    n4c.l(s5x0.L(jm40Var, 8.0f, 0.0f, 2), vaaVar.f37076a, ((Boolean) fetVar3.k(kr00.f18743a)).booleanValue(), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 5:
                waa waaVar = (waa) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((mm40) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    wb.i(o7k0.e(o7k0.s(jm40Var, 84.0f), 96.0f), waaVar.e, null, u1c.M(-1789701831, new maa(waaVar, true ? (byte) 1 : (byte) 0), fetVar4), fetVar4, 3072, 20);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 6:
                s5h0 s5h0Var = (s5h0) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                qja qjaVar = qja.j;
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    oms0 oms0VarZ = phu0.Z(s5h0Var.f31653a, null, fetVar5, 0, 2);
                    pz40 pz40Var = oms0VarZ.d;
                    p4 p4Var = oms0VarZ.f25519a;
                    hgk0 hgk0Var = (hgk0) pz40Var;
                    gex gexVar = (gex) hgk0Var.getValue();
                    fetVar5.e0(1161836153);
                    int[] iArr = vja.f37517a;
                    long jD = iArr[gexVar.ordinal()] == 1 ? cs0.D(fetVar5, -166950242, fetVar5, false) : b1j.e(fetVar5, -166948380, fetVar5, false);
                    fetVar5.r(false);
                    y4d y4dVarF = y3d.f(jD);
                    boolean zG = fetVar5.g(y4dVarF);
                    Object objP = fetVar5.P();
                    Object objD = objP;
                    if (zG || objP == cl5Var) {
                        objD = kng0.d(qjaVar, new s43(y4dVarF, b3), fetVar5);
                    }
                    lxs0 lxs0Var = (lxs0) objD;
                    if (oms0VarZ.h()) {
                        objJ = vqd.j(fetVar5, 1666827533, false, p4Var);
                    } else {
                        fetVar5.e0(1666573488);
                        boolean zG2 = fetVar5.g(oms0VarZ);
                        objJ = fetVar5.P();
                        if (zG2 || objJ == cl5Var) {
                            rfk0 rfk0VarJ = vdx.J();
                            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                            try {
                                Object objY0 = p4Var.y0();
                                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                                fetVar5.o0(objY0);
                                objJ = objY0;
                            } catch (Throwable th) {
                                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                                throw th;
                            }
                        }
                        fetVar5.r(false);
                    }
                    fetVar5.e0(1161836153);
                    y3d y3dVarF = dw9.f(fetVar5, false, iArr[((gex) objJ).ordinal()] == 1 ? cs0.D(fetVar5, -166950242, fetVar5, false) : b1j.e(fetVar5, -166948380, fetVar5, false));
                    boolean zG3 = fetVar5.g(oms0VarZ);
                    Object objP2 = fetVar5.P();
                    Object obj5 = objP2;
                    if (zG3 || objP2 == cl5Var) {
                        zbk zbkVarB = jgk0.b(new gb3(oms0VarZ, (byte) 22));
                        fetVar5.o0(zbkVarB);
                        obj5 = zbkVarB;
                    }
                    gex gexVar2 = (gex) ((l7m0) obj5).getValue();
                    fetVar5.e0(1161836153);
                    y3d y3dVarF2 = dw9.f(fetVar5, false, iArr[gexVar2.ordinal()] == 1 ? cs0.D(fetVar5, -166950242, fetVar5, false) : b1j.e(fetVar5, -166948380, fetVar5, false));
                    boolean zG4 = fetVar5.g(oms0VarZ);
                    Object objP3 = fetVar5.P();
                    Object obj6 = objP3;
                    if (zG4 || objP3 == cl5Var) {
                        zbk zbkVarB2 = jgk0.b(new gb3(oms0VarZ, (byte) 23));
                        fetVar5.o0(zbkVarB2);
                        obj6 = zbkVarB2;
                    }
                    fetVar5.e0(-781456724);
                    nul0 nul0VarG0 = ro4.g0(0.0f, 0.0f, null, 7);
                    fetVar5.r(false);
                    cms0 cms0VarE = phu0.E(oms0VarZ, y3dVarF, y3dVarF2, nul0VarG0, lxs0Var, fetVar5, 0);
                    gex gexVar3 = (gex) hgk0Var.getValue();
                    fetVar5.e0(1397028703);
                    long jD2 = iArr[gexVar3.ordinal()] == 2 ? cs0.D(fetVar5, -1780176380, fetVar5, false) : b1j.e(fetVar5, -1780174518, fetVar5, false);
                    fetVar5.r(false);
                    y4d y4dVarF2 = y3d.f(jD2);
                    boolean zG5 = fetVar5.g(y4dVarF2);
                    Object objP4 = fetVar5.P();
                    Object objD2 = objP4;
                    if (zG5 || objP4 == cl5Var) {
                        objD2 = kng0.d(qjaVar, new s43(y4dVarF2, (byte) 2), fetVar5);
                    }
                    lxs0 lxs0Var2 = (lxs0) objD2;
                    if (oms0VarZ.h()) {
                        objJ2 = vqd.j(fetVar5, 1666827533, false, p4Var);
                    } else {
                        fetVar5.e0(1666573488);
                        boolean zG6 = fetVar5.g(oms0VarZ);
                        objJ2 = fetVar5.P();
                        if (zG6 || objJ2 == cl5Var) {
                            rfk0 rfk0VarJ2 = vdx.J();
                            Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                            rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                            try {
                                Object objY1 = p4Var.y0();
                                vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                                fetVar5.o0(objY1);
                                objJ2 = objY1;
                            } catch (Throwable th2) {
                                vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                                throw th2;
                            }
                        }
                        fetVar5.r(false);
                    }
                    fetVar5.e0(1397028703);
                    y3d y3dVarF3 = dw9.f(fetVar5, false, iArr[((gex) objJ2).ordinal()] == 2 ? cs0.D(fetVar5, -1780176380, fetVar5, false) : b1j.e(fetVar5, -1780174518, fetVar5, false));
                    boolean zG7 = fetVar5.g(oms0VarZ);
                    Object objP5 = fetVar5.P();
                    Object obj7 = objP5;
                    if (zG7 || objP5 == cl5Var) {
                        zbk zbkVarB3 = jgk0.b(new gb3(oms0VarZ, (byte) 24));
                        fetVar5.o0(zbkVarB3);
                        obj7 = zbkVarB3;
                    }
                    gex gexVar4 = (gex) ((l7m0) obj7).getValue();
                    fetVar5.e0(1397028703);
                    y3d y3dVarF4 = dw9.f(fetVar5, false, iArr[gexVar4.ordinal()] == 2 ? cs0.D(fetVar5, -1780176380, fetVar5, false) : b1j.e(fetVar5, -1780174518, fetVar5, false));
                    boolean zG8 = fetVar5.g(oms0VarZ);
                    Object objP6 = fetVar5.P();
                    Object obj8 = objP6;
                    if (zG8 || objP6 == cl5Var) {
                        zbk zbkVarB4 = jgk0.b(new gb3(oms0VarZ, (byte) 25));
                        fetVar5.o0(zbkVarB4);
                        obj8 = zbkVarB4;
                    }
                    fetVar5.e0(-781456724);
                    nul0 nul0VarG1 = ro4.g0(0.0f, 0.0f, null, 7);
                    fetVar5.r(false);
                    cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVarF3, y3dVarF4, nul0VarG1, lxs0Var2, fetVar5, 0);
                    Object objP7 = fetVar5.P();
                    Object obj9 = objP7;
                    if (objP7 == cl5Var) {
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 32.0f), 1.0f);
                        fetVar5.o0(mm40VarD);
                        obj9 = mm40VarD;
                    }
                    mm40 mm40Var = (mm40) obj9;
                    zdx.d(6, fetVar5, mm40Var, cms0VarE);
                    zdx.d(6, fetVar5, mm40Var, cms0VarE2);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 7:
                wka wkaVar = (wka) obj4;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((mm40) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    mm40 mm40VarY0 = q8a.y0(jm40Var, enx.b);
                    zcl zclVar4 = qmk.f28987a;
                    wb.i(o7k0.e(s5x0.N(mm40VarY0, 0.0f, 0.0f, 0.0f, 56.0f, 7), 96.0f), null, new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), u1c.M(1092816534, new pka(wkaVar, true ? (byte) 1 : (byte) 0), fetVar6), fetVar6, 3120, 16);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                vka vkaVar = (vka) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((mm40) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(o7k0.c(o7k0.s(jm40Var, 80.0f), 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.j, (byte) 11)), gqw0.m, fetVar7, 0);
                    int iHashCode = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM = fetVar7.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar7, mm40VarN);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(e7z.u1);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, x5dVarA, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC0, gqw0.v);
                    n4c.l(s5x0.L(jm40Var, 8.0f, 0.0f, 2), vkaVar.d, ((Boolean) fetVar7.k(kr00.f18743a)).booleanValue(), fetVar7, 0);
                    mm40 mm40VarE = o7k0.u(jm40Var, 0.0f, 80.0f, 1).e(new wkw(gqw0.n));
                    String str = vkaVar.e;
                    ((g1t0) fetVar7.k(j1t0.e)).getClass();
                    v8q0.a(str, mm40VarE, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar7, 0, 24960, 109560);
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 9:
                u5a0 u5a0Var = (u5a0) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (!fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    fetVar8.X();
                } else if (u5a0Var instanceof t5a0) {
                    fetVar8.e0(-1567040189);
                    rq8.t((t5a0) u5a0Var, fetVar8, 0);
                    fetVar8.r(false);
                } else {
                    if (!Intrinsics.d(u5a0Var, s5a0.f31646a)) {
                        throw b1j.f(-1567042659, fetVar8, false);
                    }
                    fetVar8.e0(-1567037213);
                    zcl zclVar6 = qmk.f28987a;
                    zq8.a(0, fetVar8, o7k0.e(jm40Var, 100.0f));
                    fetVar8.r(false);
                }
                return Unit.f46060a;
            case 10:
                wlp wlpVar = (wlp) obj4;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    float f = wlpVar.f39366a;
                    jm40 jm40Var2 = jm40.b;
                    nkb.h(s5x0.N(jm40Var2, 0.0f, f, 0.0f, 0.0f, 13), new ijm(), kjm.b, null, null, null, fetVar9, 384, 56);
                    for (int i = 0; i < 24; i++) {
                        mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                        zcl zclVar7 = qmk.f28987a;
                        mm40 mm40VarE2 = o7k0.e(mm40VarD2, 64.0f);
                        zcl zclVar8 = qmk.i;
                        ugg0 ugg0Var = vgg0.f37379a;
                        zq8.a(0, fetVar9, xbc.c0(h97.e(zclVar8, zclVar8, zclVar8, zclVar8, mm40VarE2), vbc.d0(null, fetVar9, 0, 1)));
                        qxw.o(fetVar9, o7k0.e(jm40Var2, 8.0f));
                    }
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 11:
                ctb ctbVar = (ctb) obj4;
                y5d y5dVar = (y5d) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                yk5 yk5Var = zsb.n2;
                y5dVar.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(y5dVar) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar9 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 16.0f, 16.0f, 16.0f, 0.0f, 8), ctbVar.c, 0L, 0, 0L, fetVar10, 0, 28);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 12:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                vj30Var.getClass();
                pj30Var.getClass();
                float fD = ((f3d) obj4).d();
                zcl zclVar10 = qmk.f28987a;
                int iB = si30.b((1.0f - fD) * vj30Var.T(8.0f));
                pu90 pu90VarS = pj30Var.S(((p4e) obj3).f26347a);
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b + iB, new y1(pu90VarS, (byte) 10));
            case 13:
                hod hodVar = (hod) obj4;
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                mm40Var2.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    obc.d(dgp0.f6053a.a(2), u1c.M(123025501, new eod(mm40Var2, hodVar, false ? (byte) 1 : (byte) 0), fetVar11), fetVar11, 56);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 14:
                rod rodVar = (rod) obj4;
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                mm40Var3.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    final s5h0 s5h0Var2 = rodVar.c;
                    Object objP8 = fetVar12.P();
                    if (objP8 == cl5Var) {
                        zcl zclVar11 = qmk.f28987a;
                        objP8 = rq8.L(s5x0.J(o7k0.n(jm40Var, 32.0f), 1.0f), new d69(b2));
                        fetVar12.o0(objP8);
                    }
                    final mm40 mm40Var4 = (mm40) objP8;
                    Object objP9 = fetVar12.P();
                    if (objP9 == cl5Var) {
                        zcl zclVar12 = qmk.f28987a;
                        objP9 = o7k0.e(jm40Var, 16.0f);
                        fetVar12.o0(objP9);
                    }
                    final mm40 mm40Var5 = (mm40) objP9;
                    pz40 pz40VarF = androidx.compose.runtime.e.f(s5h0Var2.b, fetVar12);
                    if (s5h0Var2.d != null) {
                        fetVar12.e0(1553950704);
                        final byte b4 = false ? (byte) 1 : (byte) 0;
                        ugd ugdVarM2 = u1c.M(-41292535, new xdr() { // from class: a.sja
                            @Override // a.xdr
                            public final Object F(Object obj10, Object obj11, Object obj12) {
                                byte b5 = b4;
                                ugd ugdVarM3 = null;
                                final mm40 mm40Var6 = mm40Var5;
                                final s5h0 s5h0Var3 = s5h0Var2;
                                byte b6 = 18;
                                final byte b7 = 0;
                                boolean z2 = true;
                                switch (b5) {
                                    case 0:
                                        y5d y5dVar2 = (y5d) obj10;
                                        fet fetVar13 = (fet) obj11;
                                        int iIntValue13 = ((Integer) obj12).intValue();
                                        y5dVar2.getClass();
                                        if ((iIntValue13 & 6) == 0) {
                                            iIntValue13 |= fetVar13.g(y5dVar2) ? 4 : 2;
                                        }
                                        if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                                            x0s x0sVar = s5h0Var3.d;
                                            j83 j83VarA = x0sVar.a();
                                            j83 j83VarB = x0sVar.b();
                                            ((g1t0) fetVar13.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD = g1t0.d();
                                            if (x0sVar instanceof u0s) {
                                                fetVar13.e0(-1784831511);
                                                ugdVarM3 = u1c.M(-328144515, new xdr() { // from class: a.uja
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b8 = b7;
                                                        s5h0 s5h0Var4 = s5h0Var3;
                                                        y5d y5dVar3 = (y5d) obj13;
                                                        fet fetVar14 = (fet) obj14;
                                                        int iIntValue14 = ((Integer) obj15).intValue();
                                                        switch (b8) {
                                                            case 0:
                                                                y5dVar3.getClass();
                                                                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                                                                    ((u0s) s5h0Var4.d).getClass();
                                                                    ((g1t0) fetVar14.k(j1t0.e)).getClass();
                                                                    ntb.w(6, ((StaticColors) fetVar14.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar14, mm40Var6, g1t0.e(), null);
                                                                } else {
                                                                    fetVar14.X();
                                                                }
                                                                break;
                                                            default:
                                                                y5dVar3.getClass();
                                                                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                                                                    ((ioa0) s5h0Var4.e).getClass();
                                                                    ((g1t0) fetVar14.k(j1t0.e)).getClass();
                                                                    ntb.w(6, ((StaticColors) fetVar14.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar14, mm40Var6, g1t0.e(), null);
                                                                } else {
                                                                    fetVar14.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar13);
                                                fetVar13.r(false);
                                            } else {
                                                if (!(x0sVar instanceof v0s)) {
                                                    throw b1j.f(-1027409208, fetVar13, false);
                                                }
                                                fetVar13.e0(-1784325964);
                                                fetVar13.r(false);
                                            }
                                            bww.w(y5dVar2, mm40Var4, j83VarA, j83VarB, y9q0VarD, ugdVarM3, fetVar13, (iIntValue13 & 14) | 48);
                                        } else {
                                            fetVar13.X();
                                        }
                                        return Unit.f46060a;
                                    case 1:
                                        y5d y5dVar3 = (y5d) obj10;
                                        fet fetVar14 = (fet) obj11;
                                        int iIntValue14 = ((Integer) obj12).intValue();
                                        y5dVar3.getClass();
                                        if ((iIntValue14 & 6) == 0) {
                                            iIntValue14 |= fetVar14.g(y5dVar3) ? 4 : 2;
                                        }
                                        if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                            loa0 loa0Var = s5h0Var3.e;
                                            j83 j83VarA2 = loa0Var.a();
                                            j83 j83VarB2 = loa0Var.b();
                                            ((g1t0) fetVar14.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD2 = g1t0.d();
                                            if (loa0Var instanceof ioa0) {
                                                fetVar14.e0(-2127711321);
                                                final byte b8 = z2 ? (byte) 1 : (byte) 0;
                                                ugdVarM3 = u1c.M(218248126, new xdr() { // from class: a.uja
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b9 = b8;
                                                        s5h0 s5h0Var4 = s5h0Var3;
                                                        y5d y5dVar4 = (y5d) obj13;
                                                        fet fetVar15 = (fet) obj14;
                                                        int iIntValue15 = ((Integer) obj15).intValue();
                                                        switch (b9) {
                                                            case 0:
                                                                y5dVar4.getClass();
                                                                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                    ((u0s) s5h0Var4.d).getClass();
                                                                    ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                    ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                                } else {
                                                                    fetVar15.X();
                                                                }
                                                                break;
                                                            default:
                                                                y5dVar4.getClass();
                                                                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                    ((ioa0) s5h0Var4.e).getClass();
                                                                    ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                    ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                                } else {
                                                                    fetVar15.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar14);
                                                fetVar14.r(false);
                                            } else {
                                                if (!(loa0Var instanceof joa0)) {
                                                    throw b1j.f(69908749, fetVar14, false);
                                                }
                                                fetVar14.e0(-2127203821);
                                                fetVar14.r(false);
                                            }
                                            bww.w(y5dVar3, mm40Var4, j83VarA2, j83VarB2, y9q0VarD2, ugdVarM3, fetVar14, (iIntValue14 & 14) | 48);
                                        } else {
                                            fetVar14.X();
                                        }
                                        return Unit.f46060a;
                                    default:
                                        y5d y5dVar4 = (y5d) obj10;
                                        fet fetVar15 = (fet) obj11;
                                        int iIntValue15 = ((Integer) obj12).intValue();
                                        y5dVar4.getClass();
                                        if ((iIntValue15 & 6) == 0) {
                                            iIntValue15 |= fetVar15.g(y5dVar4) ? 4 : 2;
                                        }
                                        if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                            hgr0 hgr0Var = s5h0Var3.c;
                                            j83 j83VarA3 = hgr0Var.a();
                                            j83 j83VarB3 = hgr0Var.b();
                                            ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarA = g1t0.a();
                                            if (hgr0Var instanceof egr0) {
                                                fetVar15.e0(-1869679976);
                                                ugdVarM3 = u1c.M(-154841050, new ab4(mm40Var6, hgr0Var, b6), fetVar15);
                                                fetVar15.r(false);
                                            } else {
                                                if (!(hgr0Var instanceof fgr0)) {
                                                    throw b1j.f(-753051908, fetVar15, false);
                                                }
                                                fetVar15.e0(-1869231221);
                                                fetVar15.r(false);
                                            }
                                            bww.w(y5dVar4, mm40Var4, j83VarA3, j83VarB3, y9q0VarA, ugdVarM3, fetVar15, (iIntValue15 & 14) | 48);
                                        } else {
                                            fetVar15.X();
                                        }
                                        return Unit.f46060a;
                                }
                            }
                        }, fetVar12);
                        fetVar12.r(false);
                        ugdVar = ugdVarM2;
                    } else {
                        fetVar12.e0(1554944471);
                        fetVar12.r(false);
                        ugdVar = null;
                    }
                    if (s5h0Var2.e != null) {
                        fetVar12.e0(1555066890);
                        final byte b5 = true ? (byte) 1 : (byte) 0;
                        ugdVarM = u1c.M(505100106, new xdr() { // from class: a.sja
                            @Override // a.xdr
                            public final Object F(Object obj10, Object obj11, Object obj12) {
                                byte b6 = b5;
                                ugd ugdVarM3 = null;
                                final mm40 mm40Var6 = mm40Var5;
                                final s5h0 s5h0Var3 = s5h0Var2;
                                byte b7 = 18;
                                final byte b8 = 0;
                                boolean z2 = true;
                                switch (b6) {
                                    case 0:
                                        y5d y5dVar2 = (y5d) obj10;
                                        fet fetVar13 = (fet) obj11;
                                        int iIntValue13 = ((Integer) obj12).intValue();
                                        y5dVar2.getClass();
                                        if ((iIntValue13 & 6) == 0) {
                                            iIntValue13 |= fetVar13.g(y5dVar2) ? 4 : 2;
                                        }
                                        if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                                            x0s x0sVar = s5h0Var3.d;
                                            j83 j83VarA = x0sVar.a();
                                            j83 j83VarB = x0sVar.b();
                                            ((g1t0) fetVar13.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD = g1t0.d();
                                            if (x0sVar instanceof u0s) {
                                                fetVar13.e0(-1784831511);
                                                ugdVarM3 = u1c.M(-328144515, new xdr() { // from class: a.uja
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b9 = b8;
                                                        s5h0 s5h0Var4 = s5h0Var3;
                                                        y5d y5dVar4 = (y5d) obj13;
                                                        fet fetVar15 = (fet) obj14;
                                                        int iIntValue15 = ((Integer) obj15).intValue();
                                                        switch (b9) {
                                                            case 0:
                                                                y5dVar4.getClass();
                                                                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                    ((u0s) s5h0Var4.d).getClass();
                                                                    ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                    ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                                } else {
                                                                    fetVar15.X();
                                                                }
                                                                break;
                                                            default:
                                                                y5dVar4.getClass();
                                                                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                    ((ioa0) s5h0Var4.e).getClass();
                                                                    ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                    ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                                } else {
                                                                    fetVar15.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar13);
                                                fetVar13.r(false);
                                            } else {
                                                if (!(x0sVar instanceof v0s)) {
                                                    throw b1j.f(-1027409208, fetVar13, false);
                                                }
                                                fetVar13.e0(-1784325964);
                                                fetVar13.r(false);
                                            }
                                            bww.w(y5dVar2, mm40Var4, j83VarA, j83VarB, y9q0VarD, ugdVarM3, fetVar13, (iIntValue13 & 14) | 48);
                                        } else {
                                            fetVar13.X();
                                        }
                                        return Unit.f46060a;
                                    case 1:
                                        y5d y5dVar3 = (y5d) obj10;
                                        fet fetVar14 = (fet) obj11;
                                        int iIntValue14 = ((Integer) obj12).intValue();
                                        y5dVar3.getClass();
                                        if ((iIntValue14 & 6) == 0) {
                                            iIntValue14 |= fetVar14.g(y5dVar3) ? 4 : 2;
                                        }
                                        if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                            loa0 loa0Var = s5h0Var3.e;
                                            j83 j83VarA2 = loa0Var.a();
                                            j83 j83VarB2 = loa0Var.b();
                                            ((g1t0) fetVar14.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD2 = g1t0.d();
                                            if (loa0Var instanceof ioa0) {
                                                fetVar14.e0(-2127711321);
                                                final byte b9 = z2 ? (byte) 1 : (byte) 0;
                                                ugdVarM3 = u1c.M(218248126, new xdr() { // from class: a.uja
                                                    @Override // a.xdr
                                                    public final Object F(Object obj13, Object obj14, Object obj15) {
                                                        byte b10 = b9;
                                                        s5h0 s5h0Var4 = s5h0Var3;
                                                        y5d y5dVar4 = (y5d) obj13;
                                                        fet fetVar15 = (fet) obj14;
                                                        int iIntValue15 = ((Integer) obj15).intValue();
                                                        switch (b10) {
                                                            case 0:
                                                                y5dVar4.getClass();
                                                                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                    ((u0s) s5h0Var4.d).getClass();
                                                                    ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                    ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                                } else {
                                                                    fetVar15.X();
                                                                }
                                                                break;
                                                            default:
                                                                y5dVar4.getClass();
                                                                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                    ((ioa0) s5h0Var4.e).getClass();
                                                                    ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                    ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                                } else {
                                                                    fetVar15.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar14);
                                                fetVar14.r(false);
                                            } else {
                                                if (!(loa0Var instanceof joa0)) {
                                                    throw b1j.f(69908749, fetVar14, false);
                                                }
                                                fetVar14.e0(-2127203821);
                                                fetVar14.r(false);
                                            }
                                            bww.w(y5dVar3, mm40Var4, j83VarA2, j83VarB2, y9q0VarD2, ugdVarM3, fetVar14, (iIntValue14 & 14) | 48);
                                        } else {
                                            fetVar14.X();
                                        }
                                        return Unit.f46060a;
                                    default:
                                        y5d y5dVar4 = (y5d) obj10;
                                        fet fetVar15 = (fet) obj11;
                                        int iIntValue15 = ((Integer) obj12).intValue();
                                        y5dVar4.getClass();
                                        if ((iIntValue15 & 6) == 0) {
                                            iIntValue15 |= fetVar15.g(y5dVar4) ? 4 : 2;
                                        }
                                        if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                            hgr0 hgr0Var = s5h0Var3.c;
                                            j83 j83VarA3 = hgr0Var.a();
                                            j83 j83VarB3 = hgr0Var.b();
                                            ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarA = g1t0.a();
                                            if (hgr0Var instanceof egr0) {
                                                fetVar15.e0(-1869679976);
                                                ugdVarM3 = u1c.M(-154841050, new ab4(mm40Var6, hgr0Var, b7), fetVar15);
                                                fetVar15.r(false);
                                            } else {
                                                if (!(hgr0Var instanceof fgr0)) {
                                                    throw b1j.f(-753051908, fetVar15, false);
                                                }
                                                fetVar15.e0(-1869231221);
                                                fetVar15.r(false);
                                            }
                                            bww.w(y5dVar4, mm40Var4, j83VarA3, j83VarB3, y9q0VarA, ugdVarM3, fetVar15, (iIntValue15 & 14) | 48);
                                        } else {
                                            fetVar15.X();
                                        }
                                        return Unit.f46060a;
                                }
                            }
                        }, fetVar12);
                        fetVar12.r(false);
                    } else {
                        fetVar12.e0(1556066423);
                        fetVar12.r(false);
                    }
                    piz.z(mm40Var3, false, ugdVar, ugdVarM, u1c.M(1534361136, new sd8(s5h0Var2, (byte) 6), fetVar12), u1c.M(-1356546870, new tja(pz40VarF, mm40Var5, mm40Var4, false ? (byte) 1 : (byte) 0), fetVar12), u1c.M(-1667820878, new xdr() { // from class: a.sja
                        @Override // a.xdr
                        public final Object F(Object obj10, Object obj11, Object obj12) {
                            byte b6 = b3;
                            ugd ugdVarM3 = null;
                            final mm40 mm40Var6 = mm40Var5;
                            final s5h0 s5h0Var3 = s5h0Var2;
                            byte b7 = 18;
                            final byte b8 = 0;
                            boolean z2 = true;
                            switch (b6) {
                                case 0:
                                    y5d y5dVar2 = (y5d) obj10;
                                    fet fetVar13 = (fet) obj11;
                                    int iIntValue13 = ((Integer) obj12).intValue();
                                    y5dVar2.getClass();
                                    if ((iIntValue13 & 6) == 0) {
                                        iIntValue13 |= fetVar13.g(y5dVar2) ? 4 : 2;
                                    }
                                    if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                                        x0s x0sVar = s5h0Var3.d;
                                        j83 j83VarA = x0sVar.a();
                                        j83 j83VarB = x0sVar.b();
                                        ((g1t0) fetVar13.k(j1t0.e)).getClass();
                                        y9q0 y9q0VarD = g1t0.d();
                                        if (x0sVar instanceof u0s) {
                                            fetVar13.e0(-1784831511);
                                            ugdVarM3 = u1c.M(-328144515, new xdr() { // from class: a.uja
                                                @Override // a.xdr
                                                public final Object F(Object obj13, Object obj14, Object obj15) {
                                                    byte b10 = b8;
                                                    s5h0 s5h0Var4 = s5h0Var3;
                                                    y5d y5dVar4 = (y5d) obj13;
                                                    fet fetVar15 = (fet) obj14;
                                                    int iIntValue15 = ((Integer) obj15).intValue();
                                                    switch (b10) {
                                                        case 0:
                                                            y5dVar4.getClass();
                                                            if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                ((u0s) s5h0Var4.d).getClass();
                                                                ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                            } else {
                                                                fetVar15.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar4.getClass();
                                                            if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                ((ioa0) s5h0Var4.e).getClass();
                                                                ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                            } else {
                                                                fetVar15.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar13);
                                            fetVar13.r(false);
                                        } else {
                                            if (!(x0sVar instanceof v0s)) {
                                                throw b1j.f(-1027409208, fetVar13, false);
                                            }
                                            fetVar13.e0(-1784325964);
                                            fetVar13.r(false);
                                        }
                                        bww.w(y5dVar2, mm40Var4, j83VarA, j83VarB, y9q0VarD, ugdVarM3, fetVar13, (iIntValue13 & 14) | 48);
                                    } else {
                                        fetVar13.X();
                                    }
                                    return Unit.f46060a;
                                case 1:
                                    y5d y5dVar3 = (y5d) obj10;
                                    fet fetVar14 = (fet) obj11;
                                    int iIntValue14 = ((Integer) obj12).intValue();
                                    y5dVar3.getClass();
                                    if ((iIntValue14 & 6) == 0) {
                                        iIntValue14 |= fetVar14.g(y5dVar3) ? 4 : 2;
                                    }
                                    if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                        loa0 loa0Var = s5h0Var3.e;
                                        j83 j83VarA2 = loa0Var.a();
                                        j83 j83VarB2 = loa0Var.b();
                                        ((g1t0) fetVar14.k(j1t0.e)).getClass();
                                        y9q0 y9q0VarD2 = g1t0.d();
                                        if (loa0Var instanceof ioa0) {
                                            fetVar14.e0(-2127711321);
                                            final byte b9 = z2 ? (byte) 1 : (byte) 0;
                                            ugdVarM3 = u1c.M(218248126, new xdr() { // from class: a.uja
                                                @Override // a.xdr
                                                public final Object F(Object obj13, Object obj14, Object obj15) {
                                                    byte b10 = b9;
                                                    s5h0 s5h0Var4 = s5h0Var3;
                                                    y5d y5dVar4 = (y5d) obj13;
                                                    fet fetVar15 = (fet) obj14;
                                                    int iIntValue15 = ((Integer) obj15).intValue();
                                                    switch (b10) {
                                                        case 0:
                                                            y5dVar4.getClass();
                                                            if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                ((u0s) s5h0Var4.d).getClass();
                                                                ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                            } else {
                                                                fetVar15.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar4.getClass();
                                                            if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                ((ioa0) s5h0Var4.e).getClass();
                                                                ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                                                ntb.w(6, ((StaticColors) fetVar15.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar15, mm40Var6, g1t0.e(), null);
                                                            } else {
                                                                fetVar15.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar14);
                                            fetVar14.r(false);
                                        } else {
                                            if (!(loa0Var instanceof joa0)) {
                                                throw b1j.f(69908749, fetVar14, false);
                                            }
                                            fetVar14.e0(-2127203821);
                                            fetVar14.r(false);
                                        }
                                        bww.w(y5dVar3, mm40Var4, j83VarA2, j83VarB2, y9q0VarD2, ugdVarM3, fetVar14, (iIntValue14 & 14) | 48);
                                    } else {
                                        fetVar14.X();
                                    }
                                    return Unit.f46060a;
                                default:
                                    y5d y5dVar4 = (y5d) obj10;
                                    fet fetVar15 = (fet) obj11;
                                    int iIntValue15 = ((Integer) obj12).intValue();
                                    y5dVar4.getClass();
                                    if ((iIntValue15 & 6) == 0) {
                                        iIntValue15 |= fetVar15.g(y5dVar4) ? 4 : 2;
                                    }
                                    if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                        hgr0 hgr0Var = s5h0Var3.c;
                                        j83 j83VarA3 = hgr0Var.a();
                                        j83 j83VarB3 = hgr0Var.b();
                                        ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                        y9q0 y9q0VarA = g1t0.a();
                                        if (hgr0Var instanceof egr0) {
                                            fetVar15.e0(-1869679976);
                                            ugdVarM3 = u1c.M(-154841050, new ab4(mm40Var6, hgr0Var, b7), fetVar15);
                                            fetVar15.r(false);
                                        } else {
                                            if (!(hgr0Var instanceof fgr0)) {
                                                throw b1j.f(-753051908, fetVar15, false);
                                            }
                                            fetVar15.e0(-1869231221);
                                            fetVar15.r(false);
                                        }
                                        bww.w(y5dVar4, mm40Var4, j83VarA3, j83VarB3, y9q0VarA, ugdVarM3, fetVar15, (iIntValue15 & 14) | 48);
                                    } else {
                                        fetVar15.X();
                                    }
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar12), fetVar12, (iIntValue12 & 14) | 1794048);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 15:
                tod todVar = (tod) obj4;
                mm40 mm40Var6 = (mm40) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                mm40Var6.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar13.g(mm40Var6) ? 4 : 2;
                }
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    obc.d(dgp0.f6053a.a(2), u1c.M(-1678387083, new eod(mm40Var6, todVar, b3), fetVar13), fetVar13, 56);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 16:
                ane aneVar = (ane) obj4;
                int iIntValue14 = ((Integer) obj).intValue();
                int iIntValue15 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue14 = aneVar.w.n(iIntValue14);
                }
                if (!zBooleanValue) {
                    iIntValue15 = aneVar.w.n(iIntValue15);
                }
                if (aneVar.u) {
                    long j = aneVar.r.b;
                    int i2 = o9q0.c;
                    if (iIntValue14 == ((int) (j >> 32)) && iIntValue15 == ((int) (j & 4294967295L))) {
                        z = false;
                    } else if (Math.min(iIntValue14, iIntValue15) < 0 || Math.max(iIntValue14, iIntValue15) > aneVar.r.f440a.b.length()) {
                        k7q0 k7q0Var = aneVar.x;
                        k7q0Var.u(false);
                        k7q0Var.r(dmv.f6336a);
                        z = false;
                    } else {
                        if (zBooleanValue || iIntValue14 == iIntValue15) {
                            k7q0 k7q0Var2 = aneVar.x;
                            k7q0Var2.u(false);
                            k7q0Var2.r(dmv.f6336a);
                        } else {
                            aneVar.x.e(true);
                        }
                        aneVar.s.v.invoke(new a8q0(aneVar.r.f440a, s7n0.e(iIntValue14, iIntValue15), (o9q0) null));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                koh0 koh0Var = (koh0) obj4;
                fet fetVar14 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar14.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    ((g1t0) fetVar14.k(j1t0.e)).getClass();
                    v8q0.a(koh0Var.c, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar14, 0, 24960, 110590);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 18:
                yog yogVar = (yog) obj4;
                vj30 vj30Var2 = (vj30) obj;
                pj30 pj30Var2 = (pj30) obj2;
                vj30Var2.getClass();
                pj30Var2.getClass();
                pu90 pu90VarS2 = pj30Var2.S(((p4e) obj3).f26347a);
                yogVar.f42983a = pu90VarS2.b;
                int iB2 = si30.b(l1e0.c(yogVar.b.l(), 0.0f, pu90VarS2.b));
                return vj30.x(vj30Var2, pu90VarS2.f27604a, pu90VarS2.b - iB2, new n7(pu90VarS2, iB2, (byte) 8));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                h7h h7hVar = (h7h) obj4;
                fet fetVar15 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    uzb.k(0, 5, fetVar15, null, h7hVar.e, null);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 20:
                dhh dhhVar = (dhh) obj4;
                fet fetVar16 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar16.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    feb.u(dhhVar, fetVar16, 0);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 21:
                kkh kkhVar = (kkh) obj4;
                fet fetVar17 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((qwv0) obj).getClass();
                if (fetVar17.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams = kkhVar.f18439a;
                    ekh ekhVar = CyberTournamentBracketMatchParams.Companion;
                    ahb.e(cyberTournamentBracketMatchParams, fetVar17, 8);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 22:
                xph xphVar = (xph) obj4;
                mm40 mm40Var7 = (mm40) obj;
                fet fetVar18 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                mm40Var7.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= fetVar18.g(mm40Var7) ? 4 : 2;
                }
                if (fetVar18.U(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    vcc.c(iIntValue20 & 14, fetVar18, mm40Var7, xphVar.a());
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 23:
                vcj vcjVar = (vcj) obj4;
                fet fetVar19 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                kud kudVar = vcj.m2;
                ((y5d) obj).getClass();
                if (fetVar19.U(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    zcl zclVar13 = qmk.f28987a;
                    wvb.o(null, 28.0f, 0L, fetVar19, 0, 5);
                    wwb.i(null, vcjVar.P0().f47182a, 0L, 0, 0L, fetVar19, 0, 29);
                    wvb.o(null, 16.0f, 0L, fetVar19, 0, 5);
                    vtb.t(null, qqm.b, null, 0L, fetVar19, 48, 13);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case 24:
                hdj hdjVar = (hdj) obj4;
                fet fetVar20 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                kud kudVar2 = vcj.m2;
                ((y5d) obj).getClass();
                if (fetVar20.U(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    y860.w(wha0.a0(cjx.V(jm40Var, x0x.a0(fetVar20), null), wha0.T(fetVar20), false, 14), new wtl(hdjVar), null, null, null, null, null, fetVar20, 1020);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return a(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return b(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return c(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ytl ytlVar = (ytl) obj4;
                fet fetVar21 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar21.U(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    nkb.v(ytlVar.f43223a, ytlVar.b, ytlVar.c, fetVar21, 0);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            default:
                vpm0 vpm0Var = (vpm0) obj4;
                fet fetVar22 = (fet) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar22.U(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    mm40 mm40VarS = o7k0.s(jm40Var, vpm0Var.b);
                    zcl zclVar14 = qmk.f28987a;
                    qxw.o(fetVar22, o7k0.e(mm40VarS, 24.0f));
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
        }
    }
}
