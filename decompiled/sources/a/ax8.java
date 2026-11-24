package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ax8 implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1611a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ d9z c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fy8 e;

    public /* synthetic */ ax8(dy8 dy8Var, Function1 function1, d9z d9zVar, boolean z) {
        this.e = dy8Var;
        this.b = function1;
        this.c = d9zVar;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0408  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fet fetVar;
        long backgroundContent;
        fet fetVar2;
        boolean z;
        ch80 ch80VarF;
        hh80 hh80Var;
        boolean zG;
        Object objP;
        Object objA;
        boolean zG2;
        Object objP2;
        byte b = this.f1611a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        float f = 0.0f;
        fy8 fy8Var = this.e;
        byte b2 = 2;
        switch (b) {
            case 0:
                cy8 cy8Var = (cy8) fy8Var;
                l7m0 l7m0Var = (l7m0) obj2;
                fet fetVar3 = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                l7m0Var.getClass();
                ((l7m0) obj3).getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= fetVar3.g(l7m0Var) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue & 1, (iIntValue & 1041) != 1040)) {
                    boolean z2 = (iIntValue & 112) == 32;
                    Function1 function1 = this.b;
                    boolean zG3 = z2 | fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new dl2(b2, null, l7m0Var, function1);
                        fetVar3.o0(objP3);
                    }
                    m0x0.t(fetVar3, l7m0Var, (Function2) objP3);
                    n0q n0qVar = o7k0.c;
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    ge70 ge70Var = cy8Var.e;
                    if (ge70Var instanceof fe70) {
                        fetVar = fetVar3;
                        fetVar.e0(1688309271);
                        fetVar.r(false);
                    } else {
                        pp0 pp0Var = cy8Var.g;
                        if ((!(pp0Var instanceof np0) || ((np0) pp0Var).f23889a.f10362a.isEmpty()) && !(pp0Var instanceof op0)) {
                            fetVar = fetVar3;
                            fetVar.e0(1688309271);
                            fetVar.r(false);
                        } else {
                            fetVar3.e0(1687297741);
                            if (((Number) l7m0Var.getValue()).floatValue() < 1.0f) {
                                fetVar3.e0(1687437427);
                                backgroundContent = ((ThemeColors) fetVar3.k(zaq0.b)).getBackground();
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(1687542796);
                                backgroundContent = ((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent();
                                fetVar3.r(false);
                            }
                            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, jd8.n);
                            mp0 mp0Var = mp0.c;
                            pp0 pp0Var2 = cy8Var.g;
                            zcl zclVar = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(qmk.a(fetVar3).c, 0.0f, 2);
                            boolean zG4 = fetVar3.g(function1);
                            Object objP4 = fetVar3.P();
                            if (zG4 || objP4 == cl5Var) {
                                objP4 = new tk8(function1, (byte) 21);
                                fetVar3.o0(objP4);
                            }
                            Function0 function0 = (Function0) objP4;
                            boolean zG5 = fetVar3.g(function1);
                            Object objP5 = fetVar3.P();
                            if (zG5 || objP5 == cl5Var) {
                                objP5 = new uo6(function1, (byte) 26);
                                fetVar3.o0(objP5);
                            }
                            bkb.e(mm40VarQ, mp0Var, pp0Var2, lh80VarT, function0, (Function1) objP5, fetVar3, 48);
                            fetVar = fetVar3;
                            fetVar.r(false);
                        }
                    }
                    if (ge70Var != null) {
                        boolean z3 = ge70Var instanceof de70;
                        boolean z4 = this.d;
                        if (z3) {
                            x7z x7zVarF = rz4.f(fetVar, 1688473230, 1.0f, true);
                            a4x a4xVar = ((de70) ge70Var).f5935a;
                            boolean zG6 = fetVar.g(function1);
                            Object objP6 = fetVar.P();
                            if (zG6 || objP6 == cl5Var) {
                                objP6 = new tk8(function1, (byte) 22);
                                fetVar.o0(objP6);
                            }
                            hmw0.K(x7zVarF, a4xVar, this.c, z4, function1, (Function0) objP6, fetVar, 0);
                            fetVar.r(false);
                        } else if (ge70Var instanceof ee70) {
                            hmw0.k(rz4.f(fetVar, 1689073049, 1.0f, true), ((ee70) ge70Var).f7657a, z4, null, fetVar, 0, 8);
                            fetVar.r(false);
                        } else if (ge70Var instanceof fe70) {
                            x7z x7zVarF2 = rz4.f(fetVar, 1689473972, 1.0f, true);
                            mdm mdmVar = ((fe70) ge70Var).f9392a;
                            boolean zG7 = fetVar.g(function1);
                            Object objP7 = fetVar.P();
                            if (zG7 || objP7 == cl5Var) {
                                objP7 = new tk8(function1, (byte) 23);
                                fetVar.o0(objP7);
                            }
                            hmw0.k(x7zVarF2, mdmVar, z4, (Function0) objP7, fetVar, 0, 0);
                            fetVar.r(false);
                        }
                        fetVar.r(true);
                    }
                    throw b1j.f(1855579054, fetVar, false);
                }
                fetVar3.X();
                return Unit.f46060a;
            default:
                dy8 dy8Var = (dy8) fy8Var;
                hyl hylVar = dy8Var.g;
                fet fetVar4 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 1025) != 1024)) {
                    n0q n0qVar2 = o7k0.c;
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, n0qVar2);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    av8 av8Var = dy8Var.e;
                    boolean z5 = av8Var instanceof zu8;
                    Function1 function2 = this.b;
                    if (!z5 && (((hylVar instanceof fyl) && !((fyl) hylVar).f10362a.isEmpty()) || (hylVar instanceof gyl))) {
                        fetVar4.e0(1938719918);
                        zcl zclVar2 = qmk.f28987a;
                        float f2 = qmk.a(fetVar4).e;
                        boolean zG8 = fetVar4.g(hylVar);
                        Object objP8 = fetVar4.P();
                        if (zG8 || objP8 == cl5Var) {
                            if (hylVar != null) {
                                if (hylVar instanceof fyl) {
                                    objP8 = s5x0.t(f2, 0.0f, 2);
                                } else if (hylVar instanceof gyl) {
                                    objP8 = new lh80(f2, 8.0f, f2, 8.0f);
                                }
                                fetVar4.o0(objP8);
                                hh80Var = (hh80) objP8;
                                zG = fetVar4.g(hylVar) | fetVar4.g(hh80Var);
                                objP = fetVar4.P();
                                if (zG || objP == cl5Var) {
                                    if (hylVar != null) {
                                        if (hylVar instanceof fyl) {
                                            objA = fyl.a((fyl) hylVar, hh80Var);
                                        } else if (hylVar instanceof gyl) {
                                            objA = gyl.a((gyl) hylVar, hh80Var);
                                        }
                                        objP = objA;
                                        fetVar4.o0(objP);
                                    }
                                    t9f.b();
                                }
                                hyl hylVar2 = (hyl) objP;
                                mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 1);
                                zG2 = fetVar4.g(function2);
                                objP2 = fetVar4.P();
                                if (zG2 || objP2 == cl5Var) {
                                    objP2 = new uo6(function2, (byte) 27);
                                    fetVar4.o0(objP2);
                                }
                                ebc.r(mm40VarL, hylVar2, null, (Function1) objP2, null, fetVar4, 0, 44);
                                fetVar2 = fetVar4;
                                fetVar2.r(false);
                            }
                            t9f.b();
                        } else {
                            hh80Var = (hh80) objP8;
                            zG = fetVar4.g(hylVar) | fetVar4.g(hh80Var);
                            objP = fetVar4.P();
                            if (zG) {
                                if (hylVar != null) {
                                    if (hylVar instanceof fyl) {
                                        objA = fyl.a((fyl) hylVar, hh80Var);
                                    } else if (hylVar instanceof gyl) {
                                        objA = gyl.a((gyl) hylVar, hh80Var);
                                    }
                                    objP = objA;
                                    fetVar4.o0(objP);
                                }
                                t9f.b();
                            } else {
                                if (hylVar != null) {
                                    if (hylVar instanceof fyl) {
                                        objA = fyl.a((fyl) hylVar, hh80Var);
                                    } else if (hylVar instanceof gyl) {
                                        objA = gyl.a((gyl) hylVar, hh80Var);
                                    }
                                    objP = objA;
                                    fetVar4.o0(objP);
                                }
                                t9f.b();
                            }
                            hyl hylVar3 = (hyl) objP;
                            mm40 mm40VarL2 = s5x0.L(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 1);
                            zG2 = fetVar4.g(function2);
                            objP2 = fetVar4.P();
                            if (zG2) {
                                objP2 = new uo6(function2, (byte) 27);
                                fetVar4.o0(objP2);
                            } else {
                                objP2 = new uo6(function2, (byte) 27);
                                fetVar4.o0(objP2);
                            }
                            ebc.r(mm40VarL2, hylVar3, null, (Function1) objP2, null, fetVar4, 0, 44);
                            fetVar2 = fetVar4;
                            fetVar2.r(false);
                        }
                        return null;
                    }
                    fetVar2 = fetVar4;
                    fetVar2.e0(1940402629);
                    fetVar2.r(false);
                    if (av8Var != null) {
                        boolean z6 = av8Var instanceof xu8;
                        boolean z7 = this.d;
                        if (z6) {
                            x7z x7zVarF3 = rz4.f(fetVar2, 1940571548, 1.0f, true);
                            bml bmlVar = ((xu8) av8Var).f41497a;
                            fetVar2.e0(-75926782);
                            zcl zclVar3 = qmk.f28987a;
                            float f3 = qmk.a(fetVar2).c;
                            if ((!(hylVar instanceof fyl) || ((fyl) hylVar).f10362a.isEmpty()) && !(hylVar instanceof gyl)) {
                                f = 8.0f;
                            }
                            lh80 lh80Var = new lh80(f3, f, qmk.a(fetVar2).c, 24.0f);
                            if (z7) {
                                fetVar2.e0(1514727447);
                                ch80VarF = knm0.g(lh80Var, fetVar2);
                                z = false;
                                fetVar2.r(false);
                            } else {
                                z = false;
                                fetVar2.e0(1514827856);
                                ch80VarF = knm0.f(lh80Var, fetVar2);
                                fetVar2.r(false);
                            }
                            ch80 ch80Var = ch80VarF;
                            fetVar2.r(z);
                            boolean zG9 = fetVar2.g(function2);
                            Object objP9 = fetVar2.P();
                            if (zG9 || objP9 == cl5Var) {
                                objP9 = new tk8(function2, (byte) 24);
                                fetVar2.o0(objP9);
                            }
                            Function0 function3 = (Function0) objP9;
                            boolean zG10 = fetVar2.g(function2);
                            Object objP10 = fetVar2.P();
                            if (zG10 || objP10 == cl5Var) {
                                objP10 = new uo6(function2, (byte) 28);
                                fetVar2.o0(objP10);
                            }
                            Function1 function4 = (Function1) objP10;
                            boolean zG11 = fetVar2.g(function2);
                            Object objP11 = fetVar2.P();
                            if (zG11 || objP11 == cl5Var) {
                                objP11 = new uo6(function2, (byte) 29);
                                fetVar2.o0(objP11);
                            }
                            ckb.f(x7zVarF3, bmlVar, this.c, ch80Var, function3, null, function4, (Function1) objP11, fetVar2, 0, 32);
                            fetVar2.r(false);
                        } else if (av8Var instanceof yu8) {
                            nnw0.h(rz4.f(fetVar2, 1942132615, 1.0f, true), ((yu8) av8Var).f43255a, z7, null, fetVar2, 0, 8);
                            fetVar2.r(false);
                        } else if (av8Var instanceof zu8) {
                            x7z x7zVarF4 = rz4.f(fetVar2, 1942532546, 1.0f, true);
                            mdm mdmVar2 = ((zu8) av8Var).f44997a;
                            boolean zG12 = fetVar2.g(function2);
                            Object objP12 = fetVar2.P();
                            if (zG12 || objP12 == cl5Var) {
                                objP12 = new tk8(function2, (byte) 25);
                                fetVar2.o0(objP12);
                            }
                            nnw0.h(x7zVarF4, mdmVar2, z7, (Function0) objP12, fetVar2, 0, 0);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                    }
                    throw b1j.f(-75950579, fetVar2, false);
                }
                fetVar4.X();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ax8(Function1 function1, cy8 cy8Var, d9z d9zVar, boolean z) {
        this.b = function1;
        this.e = cy8Var;
        this.c = d9zVar;
        this.d = z;
    }
}
