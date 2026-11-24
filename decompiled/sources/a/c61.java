package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c61 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3796a;
    public final /* synthetic */ p3w b;

    public /* synthetic */ c61(p3w p3wVar, byte b) {
        this.f3796a = b;
        this.b = p3wVar;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0443  */
    /* JADX WARN: Code duplicated, block: B:152:0x059f  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3796a;
        jm40 jm40Var = jm40.b;
        final p3w p3wVar = this.b;
        boolean z = false;
        final byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(p3wVar.u, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 2.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, 0, 0, 131068);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(p3wVar.s, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 2.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int i = 0;
                    for (Object obj3 : p3wVar.g) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        h3w h3wVar = (h3w) obj3;
                        fetVar3.b0(-664443157, p3wVar.b + "index" + i);
                        if (h3wVar == null) {
                            fetVar3.e0(879402411);
                            fetVar3.r(false);
                        } else {
                            boolean z2 = h3wVar instanceof g3w;
                            jm40 jm40Var2 = jm40.b;
                            if (z2) {
                                fetVar3.e0(877194157);
                                zcl zclVar3 = qmk.f28987a;
                                vdb.k(o2e.e0(s5x0.N(jm40Var2, 12.0f, 0.0f, 12.0f, 4.0f, 2), "CompactCoefficientTextLargeHistoryCard"), (g3w) h3wVar, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (h3wVar instanceof f3w) {
                                fetVar3.e0(877794968);
                                zcl zclVar4 = qmk.f28987a;
                                jcb.a(o2e.e0(s5x0.N(jm40Var2, 12.0f, 0.0f, 12.0f, 4.0f, 2), "COMPACT_AMOUNT_TEXT_LARGE_HISTORY_CARD"), (f3w) h3wVar, fetVar3, 0, 0);
                                fetVar3.r(false);
                            } else if (h3wVar instanceof m3w) {
                                fetVar3.e0(878382666);
                                zcl zclVar5 = qmk.f28987a;
                                ahb.c(s5x0.N(jm40Var2, 12.0f, 0.0f, 12.0f, 4.0f, 2), (m3w) h3wVar, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (h3wVar instanceof o3w) {
                                fetVar3.e0(878920144);
                                zcl zclVar6 = qmk.f28987a;
                                tlb.c(s5x0.N(jm40Var2, 4.0f, 0.0f, 4.0f, 4.0f, 2), (o3w) h3wVar, fetVar3, 0);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(879402411);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                        i = i2;
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
                    qw3 qw3Var2 = new qw3(4.0f, true, new jf4((byte) 14));
                    yx7 yx7Var = gqw0.k;
                    final byte b3 = z ? (byte) 1 : (byte) 0;
                    jwb.p(mm40VarN, qw3Var, qw3Var2, yx7Var, 0, 0, u1c.M(260376598, new xdr() { // from class: a.ocd
                        @Override // a.xdr
                        public final Object F(Object obj4, Object obj5, Object obj6) {
                            byte b4 = b3;
                            pcy pcyVar = e7z.u1;
                            p3w p3wVar2 = p3wVar;
                            switch (b4) {
                                case 0:
                                    fet fetVar5 = (fet) obj5;
                                    int iIntValue5 = ((Integer) obj6).intValue();
                                    ((bpq) obj4).getClass();
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        for (uoo0 uoo0Var : p3wVar2.f) {
                                            fetVar5.b0(-1442187682, uoo0Var.a());
                                            boolean z3 = uoo0Var instanceof too0;
                                            jm40 jm40Var3 = jm40.b;
                                            if (z3) {
                                                fetVar5.e0(-1758042074);
                                                fet fetVar6 = fetVar5;
                                                v8q0.a(p3wVar2.d, o2e.e0(jm40Var3, "BET_TYPE_TEXT_TEST_TAG"), ((ThemeColors) fetVar5.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar6, 48, 24960, 110584);
                                                fetVar5 = fetVar6;
                                                fetVar5.r(false);
                                            } else if (uoo0Var instanceof joo0) {
                                                fetVar5.e0(-1757413735);
                                                yx7 yx7Var2 = gqw0.k;
                                                zcl zclVar8 = qmk.f28987a;
                                                thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var2, fetVar5, 48);
                                                int iHashCode = Long.hashCode(fetVar5.T);
                                                bh90 bh90VarM = fetVar5.m();
                                                mm40 mm40VarC0 = kbc.c0(fetVar5, jm40Var3);
                                                mkd.c0.getClass();
                                                fetVar5.i0();
                                                if (fetVar5.S) {
                                                    fetVar5.l(pcyVar);
                                                } else {
                                                    fetVar5.r0();
                                                }
                                                jpm0.o(fetVar5, thg0VarA, gqw0.x);
                                                jpm0.o(fetVar5, bh90VarM, gqw0.w);
                                                jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                                                jpm0.n(fetVar5);
                                                jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                                                fet fetVar7 = fetVar5;
                                                j0x.b(a8k0.F(R.drawable.ic_glyph_multievent, 0, fetVar5), null, o7k0.n(jm40Var3, 12.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), 5), fetVar7, 56, 56);
                                                v8q0.a(p3wVar2.r, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar7), fetVar7, 0, 0, 131070);
                                                fetVar5 = fetVar7;
                                                fetVar5.r(true);
                                                fetVar5.r(false);
                                            } else if (uoo0Var instanceof ioo0) {
                                                fetVar5.e0(-1442130722);
                                                rq8.d(1, fetVar5, null);
                                                fetVar5.r(false);
                                            } else {
                                                if (!(uoo0Var instanceof soo0)) {
                                                    throw b1j.f(-1442186158, fetVar5, false);
                                                }
                                                fetVar5.e0(-1756308523);
                                                soo0 soo0Var = (soo0) uoo0Var;
                                                j6n.h(soo0Var.f32554a, soo0Var.b, null, 0, 0, fetVar5, 0, 28);
                                                fetVar5.r(false);
                                            }
                                            fetVar5.r(false);
                                        }
                                    } else {
                                        fetVar5.X();
                                    }
                                    return Unit.f46060a;
                                default:
                                    fet fetVar8 = (fet) obj5;
                                    int iIntValue6 = ((Integer) obj6).intValue();
                                    ((bpq) obj4).getClass();
                                    if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        for (uoo0 uoo0Var2 : p3wVar2.f) {
                                            fetVar8.b0(375820275, uoo0Var2.a());
                                            if (uoo0Var2 instanceof too0) {
                                                fetVar8.e0(-1234366287);
                                                zcl zclVar9 = qmk.f28987a;
                                                jm40 jm40Var4 = jm40.b;
                                                mm40 mm40VarG = o7k0.g(jm40Var4, 16.0f, 0.0f, 2);
                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                int iHashCode2 = Long.hashCode(fetVar8.T);
                                                bh90 bh90VarM2 = fetVar8.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar8, mm40VarG);
                                                mkd.c0.getClass();
                                                fetVar8.i0();
                                                if (fetVar8.S) {
                                                    fetVar8.l(pcyVar);
                                                } else {
                                                    fetVar8.r0();
                                                }
                                                jpm0.o(fetVar8, tj30VarC, gqw0.x);
                                                jpm0.o(fetVar8, bh90VarM2, gqw0.w);
                                                jpm0.o(fetVar8, Integer.valueOf(iHashCode2), gqw0.y);
                                                jpm0.n(fetVar8);
                                                jpm0.o(fetVar8, mm40VarC1, gqw0.v);
                                                fet fetVar9 = fetVar8;
                                                v8q0.a(kng0.k("\u200e", ((too0) uoo0Var2).b), jm40Var4, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar8), fetVar9, 48, 0, 131068);
                                                fetVar8 = fetVar9;
                                                fetVar8.r(true);
                                                fetVar8.r(false);
                                            } else if (uoo0Var2 instanceof ioo0) {
                                                fetVar8.e0(375846773);
                                                rq8.d(1, fetVar8, null);
                                                fetVar8.r(false);
                                            } else if (uoo0Var2 instanceof soo0) {
                                                fetVar8.e0(-1233576438);
                                                soo0 soo0Var2 = (soo0) uoo0Var2;
                                                j6n.h(soo0Var2.f32554a, soo0Var2.b, null, 0, 0, fetVar8, 0, 28);
                                                fetVar8.r(false);
                                            } else {
                                                fetVar8.e0(375859085);
                                                fetVar8.r(false);
                                            }
                                            fetVar8.r(false);
                                        }
                                    } else {
                                        fetVar8.X();
                                    }
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar4), fetVar4, 1575936, 48);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int i3 = 0;
                    for (Object obj4 : p3wVar.g) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            q3d.p();
                            throw null;
                        }
                        h3w h3wVar2 = (h3w) obj4;
                        fetVar5.b0(-442476709, p3wVar.b + "index" + i3);
                        if (h3wVar2 == null) {
                            fetVar5.e0(-827779191);
                            fetVar5.r(false);
                        } else {
                            boolean z3 = h3wVar2 instanceof f3w;
                            jm40 jm40Var3 = jm40.b;
                            if (z3) {
                                fetVar5.e0(-831831263);
                                zcl zclVar8 = qmk.f28987a;
                                hp4.c(o2e.e0(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, 6.0f, 2), "AMOUNT_TEXT_LARGE_HISTORY_CARD"), (f3w) h3wVar2, fetVar5, 0);
                                fetVar5.r(false);
                            } else if (h3wVar2 instanceof m3w) {
                                fetVar5.e0(-831218517);
                                zcl zclVar9 = qmk.f28987a;
                                xdx.c(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, 6.0f, 2), (m3w) h3wVar2, fetVar5, 0);
                                fetVar5.r(false);
                            } else if (h3wVar2 instanceof i3w) {
                                fetVar5.e0(-830645079);
                                zcl zclVar10 = qmk.f28987a;
                                vfc.u(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, 6.0f, 2), (i3w) h3wVar2, fetVar5, 0);
                                fetVar5.r(false);
                            } else if (h3wVar2 instanceof j3w) {
                                fetVar5.e0(-830061163);
                                zcl zclVar11 = qmk.f28987a;
                                hkb.p(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, 6.0f, 2), (j3w) h3wVar2, fetVar5, 0);
                                fetVar5.r(false);
                            } else if (h3wVar2 instanceof k3w) {
                                fetVar5.e0(-829459081);
                                zcl zclVar12 = qmk.f28987a;
                                vic.l(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, 6.0f, 2), (k3w) h3wVar2, fetVar5, 0);
                                fetVar5.r(false);
                            } else if (h3wVar2 instanceof o3w) {
                                fetVar5.e0(-828869647);
                                zcl zclVar13 = qmk.f28987a;
                                zsm0.b(s5x0.N(jm40Var3, 4.0f, 0.0f, 4.0f, 6.0f, 2), (o3w) h3wVar2, fetVar5, 0);
                                fetVar5.r(false);
                            } else if (h3wVar2 instanceof l3w) {
                                fetVar5.e0(-828302905);
                                zcl zclVar14 = qmk.f28987a;
                                h8x.f(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, 6.0f, 2), (l3w) h3wVar2, fetVar5, 0, 0);
                                fetVar5.r(false);
                            } else {
                                fetVar5.e0(-827779191);
                                fetVar5.r(false);
                            }
                        }
                        fetVar5.r(false);
                        i3 = i4;
                    }
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zcl zclVar15 = qmk.f28987a;
                    r8x.n(s5x0.M(jm40Var, 12.0f, 4.0f, 12.0f, 8.0f), p3wVar, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar16 = qmk.f28987a;
                    m0x0.b(s5x0.N(mm40VarD, 12.0f, 0.0f, 12.0f, 8.0f, 2), p3wVar, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    mm40 mm40VarK0 = mrv.k0(jm40Var, "EVENT_DESCRIPTION_ID");
                    zcl zclVar17 = qmk.f28987a;
                    v8q0.a(p3wVar.s, o2e.e0(s5x0.N(mm40VarK0, 0.0f, 0.0f, 0.0f, 2.0f, 7), "EventDescriptionTestTag"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar8), fetVar8, 0, 0, 131068);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    mm40 mm40VarK1 = mrv.k0(jm40Var, "MARKET_INFO_ID");
                    zcl zclVar18 = qmk.f28987a;
                    v8q0.a(p3wVar.u, s5x0.N(mm40VarK1, 0.0f, 0.0f, 0.0f, 2.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar9), fetVar9, 0, 0, 131068);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    v8q0.a(p3wVar.v, mrv.k0(jm40Var, "SUB_MARKET_INFO_ID"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar10), fetVar10, 48, 0, 131068);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    zx7 zx7Var = gqw0.e;
                    zcl zclVar19 = qmk.f28987a;
                    mm40 mm40VarU = o7k0.u(o7k0.e(jm40Var, 36.0f), 0.0f, 168.0f, 1);
                    long background = ((ThemeColors) fetVar11.k(zaq0.b)).getBackground();
                    zcl zclVar20 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarK2 = mrv.k0(i120.Q(mm40VarU, background, new ugg0(zclVar20, zclVar20, zclVar20, zclVar20)), "COEFFICIENT_INFO_ID");
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM = fetVar11.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar11, mm40VarK2);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(e7z.u1);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, tj30VarC, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar11);
                    jpm0.o(fetVar11, mm40VarC0, gqw0.v);
                    mm40 mm40VarE0 = o2e.e0(s5x0.J(jm40Var, 8.0f), "CoefficientInfoTestTag");
                    String str = p3wVar.t;
                    long j = qmk.p;
                    long j2 = qmk.s;
                    aad.e(str, mm40VarE0, ibm0.t(new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar11), null, 2, false, 1, 0, null, new n05(j, j2, qmk.n), fetVar11, 1597440, 424);
                    fetVar11.r(true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    zcl zclVar21 = qmk.f28987a;
                    jwb.p(jm40.b, new qw3(4.0f, true, new jf4((byte) 14)), new qw3(4.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(1884960877, new xdr() { // from class: a.ocd
                        @Override // a.xdr
                        public final Object F(Object obj5, Object obj6, Object obj7) {
                            byte b4 = b2;
                            pcy pcyVar = e7z.u1;
                            p3w p3wVar2 = p3wVar;
                            switch (b4) {
                                case 0:
                                    fet fetVar13 = (fet) obj6;
                                    int iIntValue13 = ((Integer) obj7).intValue();
                                    ((bpq) obj5).getClass();
                                    if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                        for (uoo0 uoo0Var : p3wVar2.f) {
                                            fetVar13.b0(-1442187682, uoo0Var.a());
                                            boolean z4 = uoo0Var instanceof too0;
                                            jm40 jm40Var4 = jm40.b;
                                            if (z4) {
                                                fetVar13.e0(-1758042074);
                                                fet fetVar14 = fetVar13;
                                                v8q0.a(p3wVar2.d, o2e.e0(jm40Var4, "BET_TYPE_TEXT_TEST_TAG"), ((ThemeColors) fetVar13.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar14, 48, 24960, 110584);
                                                fetVar13 = fetVar14;
                                                fetVar13.r(false);
                                            } else if (uoo0Var instanceof joo0) {
                                                fetVar13.e0(-1757413735);
                                                yx7 yx7Var2 = gqw0.k;
                                                zcl zclVar22 = qmk.f28987a;
                                                thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var2, fetVar13, 48);
                                                int iHashCode2 = Long.hashCode(fetVar13.T);
                                                bh90 bh90VarM2 = fetVar13.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar13, jm40Var4);
                                                mkd.c0.getClass();
                                                fetVar13.i0();
                                                if (fetVar13.S) {
                                                    fetVar13.l(pcyVar);
                                                } else {
                                                    fetVar13.r0();
                                                }
                                                jpm0.o(fetVar13, thg0VarA, gqw0.x);
                                                jpm0.o(fetVar13, bh90VarM2, gqw0.w);
                                                jpm0.o(fetVar13, Integer.valueOf(iHashCode2), gqw0.y);
                                                jpm0.n(fetVar13);
                                                jpm0.o(fetVar13, mm40VarC1, gqw0.v);
                                                fet fetVar15 = fetVar13;
                                                j0x.b(a8k0.F(R.drawable.ic_glyph_multievent, 0, fetVar13), null, o7k0.n(jm40Var4, 12.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar13.k(zaq0.b)).getSecondary(), 5), fetVar15, 56, 56);
                                                v8q0.a(p3wVar2.r, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar15), fetVar15, 0, 0, 131070);
                                                fetVar13 = fetVar15;
                                                fetVar13.r(true);
                                                fetVar13.r(false);
                                            } else if (uoo0Var instanceof ioo0) {
                                                fetVar13.e0(-1442130722);
                                                rq8.d(1, fetVar13, null);
                                                fetVar13.r(false);
                                            } else {
                                                if (!(uoo0Var instanceof soo0)) {
                                                    throw b1j.f(-1442186158, fetVar13, false);
                                                }
                                                fetVar13.e0(-1756308523);
                                                soo0 soo0Var = (soo0) uoo0Var;
                                                j6n.h(soo0Var.f32554a, soo0Var.b, null, 0, 0, fetVar13, 0, 28);
                                                fetVar13.r(false);
                                            }
                                            fetVar13.r(false);
                                        }
                                    } else {
                                        fetVar13.X();
                                    }
                                    return Unit.f46060a;
                                default:
                                    fet fetVar16 = (fet) obj6;
                                    int iIntValue14 = ((Integer) obj7).intValue();
                                    ((bpq) obj5).getClass();
                                    if (fetVar16.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                                        for (uoo0 uoo0Var2 : p3wVar2.f) {
                                            fetVar16.b0(375820275, uoo0Var2.a());
                                            if (uoo0Var2 instanceof too0) {
                                                fetVar16.e0(-1234366287);
                                                zcl zclVar23 = qmk.f28987a;
                                                jm40 jm40Var5 = jm40.b;
                                                mm40 mm40VarG = o7k0.g(jm40Var5, 16.0f, 0.0f, 2);
                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                int iHashCode3 = Long.hashCode(fetVar16.T);
                                                bh90 bh90VarM3 = fetVar16.m();
                                                mm40 mm40VarC2 = kbc.c0(fetVar16, mm40VarG);
                                                mkd.c0.getClass();
                                                fetVar16.i0();
                                                if (fetVar16.S) {
                                                    fetVar16.l(pcyVar);
                                                } else {
                                                    fetVar16.r0();
                                                }
                                                jpm0.o(fetVar16, tj30VarC2, gqw0.x);
                                                jpm0.o(fetVar16, bh90VarM3, gqw0.w);
                                                jpm0.o(fetVar16, Integer.valueOf(iHashCode3), gqw0.y);
                                                jpm0.n(fetVar16);
                                                jpm0.o(fetVar16, mm40VarC2, gqw0.v);
                                                fet fetVar17 = fetVar16;
                                                v8q0.a(kng0.k("\u200e", ((too0) uoo0Var2).b), jm40Var5, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar16), fetVar17, 48, 0, 131068);
                                                fetVar16 = fetVar17;
                                                fetVar16.r(true);
                                                fetVar16.r(false);
                                            } else if (uoo0Var2 instanceof ioo0) {
                                                fetVar16.e0(375846773);
                                                rq8.d(1, fetVar16, null);
                                                fetVar16.r(false);
                                            } else if (uoo0Var2 instanceof soo0) {
                                                fetVar16.e0(-1233576438);
                                                soo0 soo0Var2 = (soo0) uoo0Var2;
                                                j6n.h(soo0Var2.f32554a, soo0Var2.b, null, 0, 0, fetVar16, 0, 28);
                                                fetVar16.r(false);
                                            } else {
                                                fetVar16.e0(375859085);
                                                fetVar16.r(false);
                                            }
                                            fetVar16.r(false);
                                        }
                                    } else {
                                        fetVar16.X();
                                    }
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar12), fetVar12, 1572870, 56);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
        }
    }
}
