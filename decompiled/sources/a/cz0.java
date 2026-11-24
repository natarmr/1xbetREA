package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class cz0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5202a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ cz0(List list, boolean z, Function1 function1, byte b) {
        this.f5202a = b;
        this.b = list;
        this.c = z;
        this.d = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        fet fetVar;
        int i5;
        int i6;
        fet fetVar2;
        int i7;
        fet fetVar3;
        int i8;
        fet fetVar4;
        int i9;
        fet fetVar5;
        int i10;
        fet fetVar6;
        int i11;
        fet fetVar7;
        int i12;
        fet fetVar8;
        byte b = this.f5202a;
        boolean z = this.c;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.d;
        List list = this.b;
        byte b2 = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar9.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar9.e(iIntValue) ? 32 : 16;
                }
                if (fetVar9.U(i & 1, (i & 147) != 146)) {
                    ny0 ny0Var = (ny0) list.get(iIntValue);
                    fetVar9.e0(-903549211);
                    if (ny0Var != null) {
                        if (ny0Var instanceof my0) {
                            fetVar9.e0(-1276069807);
                            saj.A(((my0) ny0Var).f22582a, fetVar9, 0);
                            fetVar9.r(false);
                        } else if (ny0Var instanceof ly0) {
                            fetVar9.e0(-903317084);
                            if (z) {
                                fetVar9.e0(-903285278);
                                saj.M(null, (ly0) ny0Var, fetVar9, 0);
                                fetVar9.r(false);
                            } else {
                                fetVar9.e0(-903203283);
                                saj.g(null, (ly0) ny0Var, function1, fetVar9, 0);
                                fetVar9.r(false);
                            }
                            fetVar9.r(false);
                        }
                        fetVar9.r(false);
                    }
                    throw b1j.f(-1276072738, fetVar9, false);
                }
                fetVar9.X();
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar10.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar10.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar10.U(i2 & 1, (i2 & 147) != 146)) {
                    in1 in1Var = (in1) list.get(iIntValue3);
                    fetVar10.e0(-824204317);
                    if (in1Var != null) {
                        if (in1Var instanceof hn1) {
                            fetVar10.e0(111962732);
                            i120.B(((hn1) in1Var).f13330a, fetVar10, 0);
                            fetVar10.r(false);
                        } else if (in1Var instanceof gn1) {
                            fetVar10.e0(-823996215);
                            if (z) {
                                fetVar10.e0(-823964409);
                                i120.J(null, (gn1) in1Var, fetVar10, 0);
                                fetVar10.r(false);
                            } else {
                                fetVar10.e0(-823882414);
                                i120.n(null, (gn1) in1Var, function1, fetVar10, 0);
                                fetVar10.r(false);
                            }
                            fetVar10.r(false);
                        }
                        fetVar10.r(false);
                    }
                    throw b1j.f(111960096, fetVar10, false);
                }
                fetVar10.X();
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar11.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar11.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar11.U(i3 & 1, (i3 & 147) != 146)) {
                    cws cwsVar = (cws) list.get(iIntValue5);
                    fetVar11.e0(-401002016);
                    eeq.j(null, cwsVar, this.c, this.d, fetVar11, 0);
                    fetVar11.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 3:
                k8z k8zVar = (k8z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar12.g(k8zVar) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar12.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar12.U(i4 & 1, (i4 & 147) != 146)) {
                    a2n a2nVar = (a2n) list.get(iIntValue7);
                    fetVar12.e0(-991494472);
                    if (a2nVar == null) {
                        fetVar = fetVar12;
                    } else {
                        if (a2nVar instanceof y56) {
                            fetVar12.e0(-991453770);
                            y56 y56Var = (y56) a2nVar;
                            boolean zG = fetVar12.g(function1);
                            Object objP = fetVar12.P();
                            if (zG || objP == cl5Var) {
                                objP = new fzg(function1, (byte) 1);
                                fetVar12.o0(objP);
                            }
                            vcc.i(null, y56Var, this.c, (Function1) objP, null, fetVar12, 0, 17);
                            fetVar = fetVar12;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar12;
                            if (a2nVar instanceof c2o0) {
                                fetVar.e0(-991205646);
                                c2o0 c2o0Var = (c2o0) a2nVar;
                                boolean zG2 = fetVar.g(function1);
                                Object objP2 = fetVar.P();
                                if (zG2 || objP2 == cl5Var) {
                                    objP2 = new fzg(function1, (byte) 2);
                                    fetVar.o0(objP2);
                                }
                                hkb.n(null, c2o0Var, this.c, (Function1) objP2, null, fetVar, 0, 17);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(-990988026);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = (fetVar13.g(g9zVar4) ? 4 : 2) | iIntValue10;
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar13.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar13.U(i5 & 1, (i5 & 147) != 146)) {
                    e530 e530Var = (e530) list.get(iIntValue9);
                    fetVar13.e0(532715135);
                    mm40 mm40VarB = g9z.b(g9zVar4, jm40.b, null, 7);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    boolean zG3 = fetVar13.g(function1);
                    Object objP3 = fetVar13.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new fzg(function1, (byte) 15);
                        fetVar13.o0(objP3);
                    }
                    Function1 function2 = (Function1) objP3;
                    boolean zG4 = fetVar13.g(function1);
                    Object objP4 = fetVar13.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new fzg(function1, (byte) 16);
                        fetVar13.o0(objP4);
                    }
                    Function1 function3 = (Function1) objP4;
                    boolean zG5 = fetVar13.g(function1);
                    Object objP5 = fetVar13.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new hrk(function1, (byte) 2);
                        fetVar13.o0(objP5);
                    }
                    Function2 function4 = (Function2) objP5;
                    boolean zG6 = fetVar13.g(function1);
                    Object objP6 = fetVar13.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new fzg(function1, (byte) 17);
                        fetVar13.o0(objP6);
                    }
                    zdx.g(mm40VarN, e530Var, this.c, function2, function3, function4, (Function1) objP6, fetVar13, 0);
                    fetVar13.r(false);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 5:
                k8z k8zVar2 = (k8z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar14 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar14.g(k8zVar2) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar14.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar14.U(i6 & 1, (i6 & 147) != 146)) {
                    a2n a2nVar2 = (a2n) list.get(iIntValue11);
                    fetVar14.e0(378716099);
                    if (a2nVar2 == null) {
                        fetVar2 = fetVar14;
                    } else {
                        if (a2nVar2 instanceof y56) {
                            fetVar14.e0(378776889);
                            vcc.i(null, (y56) a2nVar2, this.c, this.d, null, fetVar14, 0, 17);
                            fetVar2 = fetVar14;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar14;
                            if (a2nVar2 instanceof c2o0) {
                                fetVar2.e0(379040885);
                                hkb.n(null, (c2o0) a2nVar2, this.c, this.d, null, fetVar2, 0, 17);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                    }
                    fetVar2.e0(379253297);
                    fetVar2.r(false);
                    fetVar2.r(false);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 6:
                k8z k8zVar3 = (k8z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar15.g(k8zVar3) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar15.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar15.U(i7 & 1, (i7 & 147) != 146)) {
                    a2n a2nVar3 = (a2n) list.get(iIntValue13);
                    fetVar15.e0(673527631);
                    if (a2nVar3 == null) {
                        fetVar3 = fetVar15;
                    } else {
                        if (a2nVar3 instanceof y56) {
                            fetVar15.e0(673568147);
                            vcc.i(null, (y56) a2nVar3, this.c, this.d, null, fetVar15, 0, 17);
                            fetVar3 = fetVar15;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar15;
                            if (a2nVar3 instanceof c2o0) {
                                fetVar3.e0(673823184);
                                hkb.n(null, (c2o0) a2nVar3, this.c, this.d, null, fetVar3, 0, 17);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                    }
                    fetVar3.e0(674046570);
                    fetVar3.r(false);
                    fetVar3.r(false);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 7:
                zdz zdzVar = (zdz) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar16 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar16.g(zdzVar) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar16.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar16.U(i8 & 1, (i8 & 147) != 146)) {
                    a2n a2nVar4 = (a2n) list.get(iIntValue15);
                    fetVar16.e0(687871270);
                    if (a2nVar4 == null) {
                        fetVar4 = fetVar16;
                    } else {
                        if (a2nVar4 instanceof y56) {
                            fetVar16.e0(687911786);
                            vcc.i(null, (y56) a2nVar4, this.c, this.d, null, fetVar16, 0, 17);
                            fetVar4 = fetVar16;
                            fetVar4.r(false);
                        } else {
                            fetVar4 = fetVar16;
                            if (a2nVar4 instanceof c2o0) {
                                fetVar4.e0(688166823);
                                hkb.n(null, (c2o0) a2nVar4, this.c, this.d, null, fetVar4, 0, 17);
                                fetVar4.r(false);
                            }
                        }
                        fetVar4.r(false);
                    }
                    fetVar4.e0(688390209);
                    fetVar4.r(false);
                    fetVar4.r(false);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 8:
                k8z k8zVar4 = (k8z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar17 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar17.g(k8zVar4) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar17.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar17.U(i9 & 1, (i9 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue17);
                    fetVar17.e0(-1384990209);
                    if (p6t0Var == null) {
                        fetVar5 = fetVar17;
                    } else {
                        boolean z2 = p6t0Var instanceof dee0;
                        jm40 jm40Var = jm40.b;
                        if (z2) {
                            fetVar17.e0(-460318056);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            a2n a2nVar5 = ((dee0) p6t0Var).f5948a;
                            boolean z3 = a2nVar5 instanceof y56;
                            boolean z4 = this.c;
                            Function1 function5 = this.d;
                            if (z3) {
                                fetVar17.e0(-2122113185);
                                vcc.i(mm40VarN2, (y56) a2nVar5, z4, function5, null, fetVar17, 0, 16);
                                fetVar5 = fetVar17;
                                fetVar5.r(false);
                            } else {
                                fetVar5 = fetVar17;
                                if (a2nVar5 instanceof c2o0) {
                                    fetVar5.e0(-2121872036);
                                    hkb.n(mm40VarN2, (c2o0) a2nVar5, z4, function5, null, fetVar5, 0, 16);
                                    fetVar5.r(false);
                                } else {
                                    fetVar5.e0(-2121662352);
                                    fetVar5.r(false);
                                }
                            }
                            fetVar5.r(false);
                        } else {
                            fetVar5 = fetVar17;
                            if (p6t0Var instanceof rc80) {
                                fetVar5.e0(-460309145);
                                zcl zclVar3 = qmk.f28987a;
                                nkb.h(s5x0.N(jm40Var, xfn.a(fetVar5).e - xfn.a(fetVar5).d, 8.0f, xfn.a(fetVar5).e - xfn.a(fetVar5).d, 0.0f, 8), ((rc80) p6t0Var).f30225a, kjm.f18392a, null, null, null, fetVar5, 384, 56);
                                fetVar5.r(false);
                            } else if (p6t0Var instanceof bc80) {
                                fetVar5.e0(-460292950);
                                zcl zclVar4 = qmk.f28987a;
                                jcb.l(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((bc80) p6t0Var).f2343a, true, null, fetVar5, 384, 8);
                                fetVar5.r(false);
                            }
                        }
                        fetVar5.r(false);
                    }
                    fetVar5.e0(-1383988848);
                    fetVar5.r(false);
                    fetVar5.r(false);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 9:
                k8z k8zVar5 = (k8z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar18 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar18.g(k8zVar5) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar18.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar18.U(i10 & 1, (i10 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) list.get(iIntValue19);
                    fetVar18.e0(-1020081276);
                    if (p6t0Var2 == null) {
                        fetVar6 = fetVar18;
                    } else {
                        boolean z5 = p6t0Var2 instanceof zfh0;
                        jm40 jm40Var2 = jm40.b;
                        if (z5) {
                            fetVar18.e0(-1020021013);
                            a2n a2nVar6 = ((zfh0) p6t0Var2).f44301a;
                            if (a2nVar6 instanceof y56) {
                                fetVar18.e0(-1019973800);
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                y56 y56Var2 = (y56) a2nVar6;
                                boolean zG7 = fetVar18.g(function1);
                                Object objP7 = fetVar18.P();
                                if (zG7 || objP7 == cl5Var) {
                                    objP7 = new dpl0(function1, b2);
                                    fetVar18.o0(objP7);
                                }
                                vcc.i(mm40VarN3, y56Var2, this.c, (Function1) objP7, null, fetVar18, 0, 16);
                                fetVar6 = fetVar18;
                                fetVar6.r(false);
                            } else {
                                fetVar6 = fetVar18;
                                if (a2nVar6 instanceof c2o0) {
                                    fetVar6.e0(-1019392364);
                                    zcl zclVar6 = qmk.f28987a;
                                    mm40 mm40VarN4 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                    c2o0 c2o0Var2 = (c2o0) a2nVar6;
                                    boolean zG8 = fetVar6.g(function1);
                                    Object objP8 = fetVar6.P();
                                    if (zG8 || objP8 == cl5Var) {
                                        objP8 = new dpl0(function1, b3);
                                        fetVar6.o0(objP8);
                                    }
                                    hkb.n(mm40VarN4, c2o0Var2, this.c, (Function1) objP8, null, fetVar6, 0, 16);
                                    fetVar6.r(false);
                                } else {
                                    fetVar6.e0(-1018851476);
                                    fetVar6.r(false);
                                }
                            }
                            fetVar6.r(false);
                        } else {
                            fetVar6 = fetVar18;
                            if (p6t0Var2 instanceof ofh0) {
                                fetVar6.e0(-1018769140);
                                zcl zclVar7 = qmk.f28987a;
                                i120.y(s5x0.L(jm40Var2, 4.0f, 0.0f, 2), (ofh0) p6t0Var2, function1, fetVar6, 0);
                                fetVar6.r(false);
                            } else if (p6t0Var2 instanceof nfh0) {
                                fetVar6.e0(-1018453901);
                                zcl zclVar8 = qmk.f28987a;
                                i120.E(s5x0.L(jm40Var2, 4.0f, 0.0f, 2), (nfh0) p6t0Var2, fetVar6, 0);
                                fetVar6.r(false);
                            }
                        }
                        fetVar6.r(false);
                    }
                    fetVar6.e0(-1018227508);
                    fetVar6.r(false);
                    fetVar6.r(false);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 10:
                k8z k8zVar6 = (k8z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar19 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar19.g(k8zVar6) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar19.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar19.U(i11 & 1, (i11 & 147) != 146)) {
                    a2n a2nVar7 = (a2n) list.get(iIntValue21);
                    fetVar19.e0(-1536218305);
                    if (a2nVar7 == null) {
                        fetVar7 = fetVar19;
                    } else {
                        if (a2nVar7 instanceof y56) {
                            fetVar19.e0(-1536177789);
                            vcc.i(null, (y56) a2nVar7, this.c, this.d, null, fetVar19, 0, 17);
                            fetVar7 = fetVar19;
                            fetVar7.r(false);
                        } else {
                            fetVar7 = fetVar19;
                            if (a2nVar7 instanceof c2o0) {
                                fetVar7.e0(-1535922752);
                                hkb.n(null, (c2o0) a2nVar7, this.c, this.d, null, fetVar7, 0, 17);
                                fetVar7.r(false);
                            }
                        }
                        fetVar7.r(false);
                    }
                    fetVar7.e0(-1535699366);
                    fetVar7.r(false);
                    fetVar7.r(false);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            default:
                k8z k8zVar7 = (k8z) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                fet fetVar20 = (fet) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                if ((iIntValue24 & 6) == 0) {
                    i12 = iIntValue24 | (fetVar20.g(k8zVar7) ? 4 : 2);
                } else {
                    i12 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i12 |= fetVar20.e(iIntValue23) ? 32 : 16;
                }
                if (fetVar20.U(i12 & 1, (i12 & 147) != 146)) {
                    a2n a2nVar8 = (a2n) list.get(iIntValue23);
                    fetVar20.e0(-1487657965);
                    if (a2nVar8 == null) {
                        fetVar8 = fetVar20;
                    } else {
                        if (a2nVar8 instanceof y56) {
                            fetVar20.e0(-1487617449);
                            vcc.i(null, (y56) a2nVar8, this.c, this.d, null, fetVar20, 0, 17);
                            fetVar8 = fetVar20;
                            fetVar8.r(false);
                        } else {
                            fetVar8 = fetVar20;
                            if (a2nVar8 instanceof c2o0) {
                                fetVar8.e0(-1487362412);
                                hkb.n(null, (c2o0) a2nVar8, this.c, this.d, null, fetVar8, 0, 17);
                                fetVar8.r(false);
                            }
                        }
                        fetVar8.r(false);
                    }
                    fetVar8.e0(-1487139026);
                    fetVar8.r(false);
                    fetVar8.r(false);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
        }
    }
}
