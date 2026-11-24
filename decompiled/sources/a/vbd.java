package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vbd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37136a;
    public final /* synthetic */ pl7 b;
    public final /* synthetic */ wom c;
    public final /* synthetic */ w2d d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ xcz f;

    public /* synthetic */ vbd(pl7 pl7Var, wom womVar, w2d w2dVar, Function1 function1, xcz xczVar, byte b) {
        this.f37136a = b;
        this.b = pl7Var;
        this.c = womVar;
        this.d = w2dVar;
        this.e = function1;
        this.f = xczVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f37136a;
        jr8 jr8Var = jr8.f16991a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        final xcz xczVar = this.f;
        final Function1 function1 = this.e;
        final pl7 pl7Var = this.b;
        final byte b2 = 0;
        final byte b3 = 2;
        switch (b) {
            case 0:
                hh80 hh80Var = (hh80) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(hh80Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zD = pl7Var.d();
                    boolean z = !pl7Var.d();
                    n0q n0qVar = o7k0.c;
                    mm40 mm40VarI = s5x0.I(n0qVar, hh80Var);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new dib(function1, (byte) 22);
                        fetVar.o0(objP);
                    }
                    bdx.B(mm40VarI, zD, z, this.c, this.d, null, (Function0) objP, null, u1c.M(1368609798, new xdr() { // from class: a.ybd
                        @Override // a.xdr
                        public final Object F(Object obj4, Object obj5, Object obj6) {
                            fet fetVar2;
                            fet fetVar3;
                            fet fetVar4;
                            byte b4 = b2;
                            cl5 cl5Var2 = ukd.f35823a;
                            Function1 function2 = function1;
                            pl7 pl7Var2 = pl7Var;
                            jm40 jm40Var2 = jm40.b;
                            switch (b4) {
                                case 0:
                                    ir8 ir8Var = (ir8) obj4;
                                    fet fetVar5 = (fet) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    zx7 zx7Var = gqw0.e;
                                    ir8Var.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= fetVar5.g(ir8Var) ? 4 : 2;
                                    }
                                    if (fetVar5.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        if (pl7Var2 == null) {
                                            fetVar2 = fetVar5;
                                        } else if (pl7Var2 instanceof ll7) {
                                            fetVar5.e0(130158155);
                                            xcz xczVar2 = xczVar;
                                            q0x.n(xczVar2, (ll7) pl7Var2, function2, fetVar5, 0);
                                            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                            zcl zclVar = qmk.f28987a;
                                            float f = qmk.a(fetVar5).d;
                                            lh80 lh80Var = new lh80(f, 12.0f, f, 12.0f);
                                            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                                            boolean zG2 = fetVar5.g(pl7Var2) | fetVar5.g(function2);
                                            Object objP2 = fetVar5.P();
                                            if (zG2 || objP2 == cl5Var2) {
                                                objP2 = new zbd(pl7Var2, function2, (byte) 0);
                                                fetVar5.o0(objP2);
                                            }
                                            b8k0.e(mm40VarD, xczVar2, lh80Var, qw3Var, null, null, false, null, (Function1) objP2, fetVar5, 6, Response.NOT_ACCEPTABLE_HERE);
                                            fetVar5.r(false);
                                        } else {
                                            fetVar2 = fetVar5;
                                            if (pl7Var2 instanceof nl7) {
                                                fetVar2.e0(134074602);
                                                mm40 mm40VarB = ir8Var.b(jm40Var2, zx7Var);
                                                zcl zclVar2 = qmk.f28987a;
                                                mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar = ((nl7) pl7Var2).d;
                                                boolean zG3 = fetVar2.g(function2);
                                                Object objP3 = fetVar2.P();
                                                if (zG3 || objP3 == cl5Var2) {
                                                    objP3 = new dib(function2, (byte) 23);
                                                    fetVar2.o0(objP3);
                                                }
                                                jcb.l(mm40VarN, mdmVar, false, (Function0) objP3, fetVar2, 0, 4);
                                                fetVar2.r(false);
                                            } else if (pl7Var2 instanceof ol7) {
                                                fetVar2.e0(134478656);
                                                ro4.s(0, fetVar2);
                                                fetVar2.r(false);
                                            } else if (pl7Var2 instanceof ml7) {
                                                fetVar2.e0(134592302);
                                                mm40 mm40VarB2 = ir8Var.b(jm40Var2, zx7Var);
                                                mdm mdmVar2 = ((ml7) pl7Var2).d;
                                                boolean zG4 = fetVar2.g(function2);
                                                Object objP4 = fetVar2.P();
                                                if (zG4 || objP4 == cl5Var2) {
                                                    objP4 = new dib(function2, (byte) 18);
                                                    fetVar2.o0(objP4);
                                                }
                                                jcb.l(mm40VarB2, mdmVar2, false, (Function0) objP4, fetVar2, 0, 4);
                                                fetVar2.r(false);
                                            }
                                        }
                                        throw b1j.f(974028783, fetVar2, false);
                                    }
                                    fetVar5.X();
                                    return Unit.f46060a;
                                case 1:
                                    ir8 ir8Var2 = (ir8) obj4;
                                    fet fetVar6 = (fet) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    zx7 zx7Var2 = gqw0.e;
                                    ir8Var2.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= fetVar6.g(ir8Var2) ? 4 : 2;
                                    }
                                    if (fetVar6.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        if (pl7Var2 == null) {
                                            fetVar3 = fetVar6;
                                        } else if (pl7Var2 instanceof ll7) {
                                            fetVar6.e0(308740619);
                                            xcz xczVar3 = xczVar;
                                            q0x.n(xczVar3, (ll7) pl7Var2, function2, fetVar6, 0);
                                            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                                            zcl zclVar3 = qmk.f28987a;
                                            lh80 lh80Var2 = new lh80(8.0f, 12.0f, 8.0f, 32.0f);
                                            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                                            boolean zG5 = fetVar6.g(pl7Var2) | fetVar6.g(function2);
                                            Object objP5 = fetVar6.P();
                                            if (zG5 || objP5 == cl5Var2) {
                                                objP5 = new zbd(pl7Var2, function2, (byte) 2);
                                                fetVar6.o0(objP5);
                                            }
                                            b8k0.e(mm40VarD2, xczVar3, lh80Var2, qw3Var2, null, null, false, null, (Function1) objP5, fetVar6, 6, Response.NOT_ACCEPTABLE_HERE);
                                            fetVar6.r(false);
                                        } else {
                                            fetVar3 = fetVar6;
                                            if (pl7Var2 instanceof nl7) {
                                                fetVar3.e0(312153471);
                                                mm40 mm40VarB3 = ir8Var2.b(jm40Var2, zx7Var2);
                                                zcl zclVar4 = qmk.f28987a;
                                                mm40 mm40VarN2 = s5x0.N(mm40VarB3, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar3 = ((nl7) pl7Var2).d;
                                                boolean zG6 = fetVar3.g(function2);
                                                Object objP6 = fetVar3.P();
                                                if (zG6 || objP6 == cl5Var2) {
                                                    objP6 = new dng0(function2, (byte) 4);
                                                    fetVar3.o0(objP6);
                                                }
                                                jcb.l(mm40VarN2, mdmVar3, false, (Function0) objP6, fetVar3, 0, 4);
                                                fetVar3.r(false);
                                            } else if (pl7Var2 instanceof ol7) {
                                                fetVar3.e0(312560346);
                                                xf0.e(432, fetVar3, null, true, false);
                                                fetVar3.r(false);
                                            } else if (pl7Var2 instanceof ml7) {
                                                fetVar3.e0(312793001);
                                                mm40 mm40VarB4 = ir8Var2.b(jm40Var2, zx7Var2);
                                                zcl zclVar5 = qmk.f28987a;
                                                mm40 mm40VarN3 = s5x0.N(mm40VarB4, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar4 = ((ml7) pl7Var2).d;
                                                boolean zG7 = fetVar3.g(function2);
                                                Object objP7 = fetVar3.P();
                                                if (zG7 || objP7 == cl5Var2) {
                                                    objP7 = new dng0(function2, (byte) 1);
                                                    fetVar3.o0(objP7);
                                                }
                                                jcb.l(mm40VarN3, mdmVar4, false, (Function0) objP7, fetVar3, 0, 4);
                                                fetVar3.r(false);
                                            }
                                        }
                                        throw b1j.f(287052994, fetVar3, false);
                                    }
                                    fetVar6.X();
                                    return Unit.f46060a;
                                default:
                                    ir8 ir8Var3 = (ir8) obj4;
                                    fet fetVar7 = (fet) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    zx7 zx7Var3 = gqw0.e;
                                    ir8Var3.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= fetVar7.g(ir8Var3) ? 4 : 2;
                                    }
                                    if (fetVar7.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        if (pl7Var2 == null) {
                                            fetVar4 = fetVar7;
                                        } else if (pl7Var2 instanceof ll7) {
                                            fetVar7.e0(-217166365);
                                            xcz xczVar4 = xczVar;
                                            q0x.n(xczVar4, (ll7) pl7Var2, function2, fetVar7, 0);
                                            mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                                            zcl zclVar6 = qmk.f28987a;
                                            lh80 lh80Var3 = new lh80(8.0f, 8.0f, 8.0f, 32.0f);
                                            qw3 qw3Var3 = new qw3(8.0f, true, new jf4((byte) 14));
                                            boolean zG8 = fetVar7.g(pl7Var2) | fetVar7.g(function2);
                                            Object objP8 = fetVar7.P();
                                            if (zG8 || objP8 == cl5Var2) {
                                                objP8 = new zbd(pl7Var2, function2, (byte) 3);
                                                fetVar7.o0(objP8);
                                            }
                                            b8k0.e(mm40VarD3, xczVar4, lh80Var3, qw3Var3, null, null, false, null, (Function1) objP8, fetVar7, 6, Response.NOT_ACCEPTABLE_HERE);
                                            fetVar7.r(false);
                                        } else {
                                            fetVar4 = fetVar7;
                                            if (pl7Var2 instanceof nl7) {
                                                fetVar4.e0(-213701278);
                                                mm40 mm40VarB5 = ir8Var3.b(jm40Var2, zx7Var3);
                                                zcl zclVar7 = qmk.f28987a;
                                                mm40 mm40VarN4 = s5x0.N(mm40VarB5, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar5 = ((nl7) pl7Var2).d;
                                                boolean zG9 = fetVar4.g(function2);
                                                Object objP9 = fetVar4.P();
                                                if (zG9 || objP9 == cl5Var2) {
                                                    objP9 = new gno0(function2, (byte) 11);
                                                    fetVar4.o0(objP9);
                                                }
                                                jcb.l(mm40VarN4, mdmVar5, false, (Function0) objP9, fetVar4, 0, 4);
                                                fetVar4.r(false);
                                            } else if (pl7Var2 instanceof ol7) {
                                                fetVar4.e0(-213314336);
                                                xf0.e(432, fetVar4, null, true, false);
                                                fetVar4.r(false);
                                            } else if (pl7Var2 instanceof ml7) {
                                                fetVar4.e0(-213105396);
                                                mm40 mm40VarB6 = ir8Var3.b(jm40Var2, zx7Var3);
                                                zcl zclVar8 = qmk.f28987a;
                                                mm40 mm40VarN5 = s5x0.N(mm40VarB6, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar6 = ((ml7) pl7Var2).d;
                                                boolean zG10 = fetVar4.g(function2);
                                                Object objP10 = fetVar4.P();
                                                if (zG10 || objP10 == cl5Var2) {
                                                    objP10 = new gno0(function2, (byte) 12);
                                                    fetVar4.o0(objP10);
                                                }
                                                jcb.l(mm40VarN5, mdmVar6, false, (Function0) objP10, fetVar4, 0, 4);
                                                fetVar4.r(false);
                                            }
                                        }
                                        throw b1j.f(1794108842, fetVar4, false);
                                    }
                                    fetVar7.X();
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar), fetVar, 100696064);
                    if (pl7Var.c()) {
                        fetVar.e0(1090100168);
                        Object objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = new a7d((byte) 5);
                            fetVar.o0(objP2);
                        }
                        mm40 mm40VarY = y860.Y(n0qVar, false, null, null, (Function0) objP2, 14);
                        zfn zfnVar = m8m0.f21378a;
                        mm40 mm40VarQ = i120.Q(mm40VarY, ((StaticColors) fetVar.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30VarC, gqw0.x);
                        jpm0.o(fetVar, bh90VarM, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, gqw0.v);
                        kpb.j(jr8Var.b(jm40Var, gqw0.e), new dkm((ycl) null, new y3d(((StaticColors) fetVar.k(zfnVar)).m131getWhite800d7_KjU()), 3), fetVar, 0, 0);
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1090557604);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                hh80 hh80Var2 = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                hh80Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(hh80Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    n0q n0qVar2 = o7k0.c;
                    mm40 mm40VarI2 = s5x0.I(n0qVar2, hh80Var2);
                    boolean zD2 = pl7Var.d();
                    boolean z2 = !pl7Var.d();
                    boolean zG2 = fetVar2.g(function1);
                    Object objP3 = fetVar2.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new dng0(function1, (byte) 3);
                        fetVar2.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    final byte b4 = 1;
                    bdx.B(mm40VarI2, zD2, z2, this.c, this.d, null, function0, null, u1c.M(1998061841, new xdr() { // from class: a.ybd
                        @Override // a.xdr
                        public final Object F(Object obj4, Object obj5, Object obj6) {
                            fet fetVar3;
                            fet fetVar4;
                            fet fetVar5;
                            byte b5 = b4;
                            cl5 cl5Var2 = ukd.f35823a;
                            Function1 function2 = function1;
                            pl7 pl7Var2 = pl7Var;
                            jm40 jm40Var2 = jm40.b;
                            switch (b5) {
                                case 0:
                                    ir8 ir8Var = (ir8) obj4;
                                    fet fetVar6 = (fet) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    zx7 zx7Var = gqw0.e;
                                    ir8Var.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= fetVar6.g(ir8Var) ? 4 : 2;
                                    }
                                    if (fetVar6.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        if (pl7Var2 == null) {
                                            fetVar3 = fetVar6;
                                        } else if (pl7Var2 instanceof ll7) {
                                            fetVar6.e0(130158155);
                                            xcz xczVar2 = xczVar;
                                            q0x.n(xczVar2, (ll7) pl7Var2, function2, fetVar6, 0);
                                            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                            zcl zclVar = qmk.f28987a;
                                            float f = qmk.a(fetVar6).d;
                                            lh80 lh80Var = new lh80(f, 12.0f, f, 12.0f);
                                            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                                            boolean zG3 = fetVar6.g(pl7Var2) | fetVar6.g(function2);
                                            Object objP4 = fetVar6.P();
                                            if (zG3 || objP4 == cl5Var2) {
                                                objP4 = new zbd(pl7Var2, function2, (byte) 0);
                                                fetVar6.o0(objP4);
                                            }
                                            b8k0.e(mm40VarD, xczVar2, lh80Var, qw3Var, null, null, false, null, (Function1) objP4, fetVar6, 6, Response.NOT_ACCEPTABLE_HERE);
                                            fetVar6.r(false);
                                        } else {
                                            fetVar3 = fetVar6;
                                            if (pl7Var2 instanceof nl7) {
                                                fetVar3.e0(134074602);
                                                mm40 mm40VarB = ir8Var.b(jm40Var2, zx7Var);
                                                zcl zclVar2 = qmk.f28987a;
                                                mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar = ((nl7) pl7Var2).d;
                                                boolean zG4 = fetVar3.g(function2);
                                                Object objP5 = fetVar3.P();
                                                if (zG4 || objP5 == cl5Var2) {
                                                    objP5 = new dib(function2, (byte) 23);
                                                    fetVar3.o0(objP5);
                                                }
                                                jcb.l(mm40VarN, mdmVar, false, (Function0) objP5, fetVar3, 0, 4);
                                                fetVar3.r(false);
                                            } else if (pl7Var2 instanceof ol7) {
                                                fetVar3.e0(134478656);
                                                ro4.s(0, fetVar3);
                                                fetVar3.r(false);
                                            } else if (pl7Var2 instanceof ml7) {
                                                fetVar3.e0(134592302);
                                                mm40 mm40VarB2 = ir8Var.b(jm40Var2, zx7Var);
                                                mdm mdmVar2 = ((ml7) pl7Var2).d;
                                                boolean zG5 = fetVar3.g(function2);
                                                Object objP6 = fetVar3.P();
                                                if (zG5 || objP6 == cl5Var2) {
                                                    objP6 = new dib(function2, (byte) 18);
                                                    fetVar3.o0(objP6);
                                                }
                                                jcb.l(mm40VarB2, mdmVar2, false, (Function0) objP6, fetVar3, 0, 4);
                                                fetVar3.r(false);
                                            }
                                        }
                                        throw b1j.f(974028783, fetVar3, false);
                                    }
                                    fetVar6.X();
                                    return Unit.f46060a;
                                case 1:
                                    ir8 ir8Var2 = (ir8) obj4;
                                    fet fetVar7 = (fet) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    zx7 zx7Var2 = gqw0.e;
                                    ir8Var2.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= fetVar7.g(ir8Var2) ? 4 : 2;
                                    }
                                    if (fetVar7.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        if (pl7Var2 == null) {
                                            fetVar4 = fetVar7;
                                        } else if (pl7Var2 instanceof ll7) {
                                            fetVar7.e0(308740619);
                                            xcz xczVar3 = xczVar;
                                            q0x.n(xczVar3, (ll7) pl7Var2, function2, fetVar7, 0);
                                            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                                            zcl zclVar3 = qmk.f28987a;
                                            lh80 lh80Var2 = new lh80(8.0f, 12.0f, 8.0f, 32.0f);
                                            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                                            boolean zG6 = fetVar7.g(pl7Var2) | fetVar7.g(function2);
                                            Object objP7 = fetVar7.P();
                                            if (zG6 || objP7 == cl5Var2) {
                                                objP7 = new zbd(pl7Var2, function2, (byte) 2);
                                                fetVar7.o0(objP7);
                                            }
                                            b8k0.e(mm40VarD2, xczVar3, lh80Var2, qw3Var2, null, null, false, null, (Function1) objP7, fetVar7, 6, Response.NOT_ACCEPTABLE_HERE);
                                            fetVar7.r(false);
                                        } else {
                                            fetVar4 = fetVar7;
                                            if (pl7Var2 instanceof nl7) {
                                                fetVar4.e0(312153471);
                                                mm40 mm40VarB3 = ir8Var2.b(jm40Var2, zx7Var2);
                                                zcl zclVar4 = qmk.f28987a;
                                                mm40 mm40VarN2 = s5x0.N(mm40VarB3, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar3 = ((nl7) pl7Var2).d;
                                                boolean zG7 = fetVar4.g(function2);
                                                Object objP8 = fetVar4.P();
                                                if (zG7 || objP8 == cl5Var2) {
                                                    objP8 = new dng0(function2, (byte) 4);
                                                    fetVar4.o0(objP8);
                                                }
                                                jcb.l(mm40VarN2, mdmVar3, false, (Function0) objP8, fetVar4, 0, 4);
                                                fetVar4.r(false);
                                            } else if (pl7Var2 instanceof ol7) {
                                                fetVar4.e0(312560346);
                                                xf0.e(432, fetVar4, null, true, false);
                                                fetVar4.r(false);
                                            } else if (pl7Var2 instanceof ml7) {
                                                fetVar4.e0(312793001);
                                                mm40 mm40VarB4 = ir8Var2.b(jm40Var2, zx7Var2);
                                                zcl zclVar5 = qmk.f28987a;
                                                mm40 mm40VarN3 = s5x0.N(mm40VarB4, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar4 = ((ml7) pl7Var2).d;
                                                boolean zG8 = fetVar4.g(function2);
                                                Object objP9 = fetVar4.P();
                                                if (zG8 || objP9 == cl5Var2) {
                                                    objP9 = new dng0(function2, (byte) 1);
                                                    fetVar4.o0(objP9);
                                                }
                                                jcb.l(mm40VarN3, mdmVar4, false, (Function0) objP9, fetVar4, 0, 4);
                                                fetVar4.r(false);
                                            }
                                        }
                                        throw b1j.f(287052994, fetVar4, false);
                                    }
                                    fetVar7.X();
                                    return Unit.f46060a;
                                default:
                                    ir8 ir8Var3 = (ir8) obj4;
                                    fet fetVar8 = (fet) obj5;
                                    int iIntValue5 = ((Integer) obj6).intValue();
                                    zx7 zx7Var3 = gqw0.e;
                                    ir8Var3.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= fetVar8.g(ir8Var3) ? 4 : 2;
                                    }
                                    if (fetVar8.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        if (pl7Var2 == null) {
                                            fetVar5 = fetVar8;
                                        } else if (pl7Var2 instanceof ll7) {
                                            fetVar8.e0(-217166365);
                                            xcz xczVar4 = xczVar;
                                            q0x.n(xczVar4, (ll7) pl7Var2, function2, fetVar8, 0);
                                            mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                                            zcl zclVar6 = qmk.f28987a;
                                            lh80 lh80Var3 = new lh80(8.0f, 8.0f, 8.0f, 32.0f);
                                            qw3 qw3Var3 = new qw3(8.0f, true, new jf4((byte) 14));
                                            boolean zG9 = fetVar8.g(pl7Var2) | fetVar8.g(function2);
                                            Object objP10 = fetVar8.P();
                                            if (zG9 || objP10 == cl5Var2) {
                                                objP10 = new zbd(pl7Var2, function2, (byte) 3);
                                                fetVar8.o0(objP10);
                                            }
                                            b8k0.e(mm40VarD3, xczVar4, lh80Var3, qw3Var3, null, null, false, null, (Function1) objP10, fetVar8, 6, Response.NOT_ACCEPTABLE_HERE);
                                            fetVar8.r(false);
                                        } else {
                                            fetVar5 = fetVar8;
                                            if (pl7Var2 instanceof nl7) {
                                                fetVar5.e0(-213701278);
                                                mm40 mm40VarB5 = ir8Var3.b(jm40Var2, zx7Var3);
                                                zcl zclVar7 = qmk.f28987a;
                                                mm40 mm40VarN4 = s5x0.N(mm40VarB5, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar5 = ((nl7) pl7Var2).d;
                                                boolean zG10 = fetVar5.g(function2);
                                                Object objP11 = fetVar5.P();
                                                if (zG10 || objP11 == cl5Var2) {
                                                    objP11 = new gno0(function2, (byte) 11);
                                                    fetVar5.o0(objP11);
                                                }
                                                jcb.l(mm40VarN4, mdmVar5, false, (Function0) objP11, fetVar5, 0, 4);
                                                fetVar5.r(false);
                                            } else if (pl7Var2 instanceof ol7) {
                                                fetVar5.e0(-213314336);
                                                xf0.e(432, fetVar5, null, true, false);
                                                fetVar5.r(false);
                                            } else if (pl7Var2 instanceof ml7) {
                                                fetVar5.e0(-213105396);
                                                mm40 mm40VarB6 = ir8Var3.b(jm40Var2, zx7Var3);
                                                zcl zclVar8 = qmk.f28987a;
                                                mm40 mm40VarN5 = s5x0.N(mm40VarB6, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar6 = ((ml7) pl7Var2).d;
                                                boolean zG11 = fetVar5.g(function2);
                                                Object objP12 = fetVar5.P();
                                                if (zG11 || objP12 == cl5Var2) {
                                                    objP12 = new gno0(function2, (byte) 12);
                                                    fetVar5.o0(objP12);
                                                }
                                                jcb.l(mm40VarN5, mdmVar6, false, (Function0) objP12, fetVar5, 0, 4);
                                                fetVar5.r(false);
                                            }
                                        }
                                        throw b1j.f(1794108842, fetVar5, false);
                                    }
                                    fetVar8.X();
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar2), fetVar2, 100696064);
                    if (pl7Var.c()) {
                        fetVar2.e0(196340221);
                        Object objP4 = fetVar2.P();
                        if (objP4 == cl5Var) {
                            objP4 = new j6g0((byte) 21);
                            fetVar2.o0(objP4);
                        }
                        mm40 mm40VarY2 = y860.Y(n0qVar2, false, null, null, (Function0) objP4, 14);
                        zfn zfnVar2 = m8m0.f21378a;
                        mm40 mm40VarQ2 = i120.Q(mm40VarY2, ((StaticColors) fetVar2.k(zfnVar2)).m109getOverlayBackground400d7_KjU(), jd8.n);
                        tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                        kpb.j(jr8Var.b(jm40Var, gqw0.e), new dkm((ycl) null, new y3d(((StaticColors) fetVar2.k(zfnVar2)).m131getWhite800d7_KjU()), 3), fetVar2, 0, 0);
                        fetVar2.r(true);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(196797657);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
            default:
                hh80 hh80Var3 = (hh80) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                hh80Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(hh80Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zD3 = pl7Var.d();
                    boolean z3 = !pl7Var.d();
                    n0q n0qVar3 = o7k0.c;
                    mm40 mm40VarI3 = s5x0.I(n0qVar3, hh80Var3);
                    boolean zG3 = fetVar3.g(function1);
                    Object objP5 = fetVar3.P();
                    if (zG3 || objP5 == cl5Var) {
                        objP5 = new gno0(function1, (byte) 14);
                        fetVar3.o0(objP5);
                    }
                    bdx.B(mm40VarI3, zD3, z3, this.c, this.d, null, (Function0) objP5, null, u1c.M(-1986957693, new xdr() { // from class: a.ybd
                        @Override // a.xdr
                        public final Object F(Object obj4, Object obj5, Object obj6) {
                            fet fetVar4;
                            fet fetVar5;
                            fet fetVar6;
                            byte b5 = b3;
                            cl5 cl5Var2 = ukd.f35823a;
                            Function1 function2 = function1;
                            pl7 pl7Var2 = pl7Var;
                            jm40 jm40Var2 = jm40.b;
                            switch (b5) {
                                case 0:
                                    ir8 ir8Var = (ir8) obj4;
                                    fet fetVar7 = (fet) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    zx7 zx7Var = gqw0.e;
                                    ir8Var.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= fetVar7.g(ir8Var) ? 4 : 2;
                                    }
                                    if (fetVar7.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        if (pl7Var2 == null) {
                                            fetVar4 = fetVar7;
                                        } else if (pl7Var2 instanceof ll7) {
                                            fetVar7.e0(130158155);
                                            xcz xczVar2 = xczVar;
                                            q0x.n(xczVar2, (ll7) pl7Var2, function2, fetVar7, 0);
                                            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                            zcl zclVar = qmk.f28987a;
                                            float f = qmk.a(fetVar7).d;
                                            lh80 lh80Var = new lh80(f, 12.0f, f, 12.0f);
                                            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                                            boolean zG4 = fetVar7.g(pl7Var2) | fetVar7.g(function2);
                                            Object objP6 = fetVar7.P();
                                            if (zG4 || objP6 == cl5Var2) {
                                                objP6 = new zbd(pl7Var2, function2, (byte) 0);
                                                fetVar7.o0(objP6);
                                            }
                                            b8k0.e(mm40VarD, xczVar2, lh80Var, qw3Var, null, null, false, null, (Function1) objP6, fetVar7, 6, Response.NOT_ACCEPTABLE_HERE);
                                            fetVar7.r(false);
                                        } else {
                                            fetVar4 = fetVar7;
                                            if (pl7Var2 instanceof nl7) {
                                                fetVar4.e0(134074602);
                                                mm40 mm40VarB = ir8Var.b(jm40Var2, zx7Var);
                                                zcl zclVar2 = qmk.f28987a;
                                                mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar = ((nl7) pl7Var2).d;
                                                boolean zG5 = fetVar4.g(function2);
                                                Object objP7 = fetVar4.P();
                                                if (zG5 || objP7 == cl5Var2) {
                                                    objP7 = new dib(function2, (byte) 23);
                                                    fetVar4.o0(objP7);
                                                }
                                                jcb.l(mm40VarN, mdmVar, false, (Function0) objP7, fetVar4, 0, 4);
                                                fetVar4.r(false);
                                            } else if (pl7Var2 instanceof ol7) {
                                                fetVar4.e0(134478656);
                                                ro4.s(0, fetVar4);
                                                fetVar4.r(false);
                                            } else if (pl7Var2 instanceof ml7) {
                                                fetVar4.e0(134592302);
                                                mm40 mm40VarB2 = ir8Var.b(jm40Var2, zx7Var);
                                                mdm mdmVar2 = ((ml7) pl7Var2).d;
                                                boolean zG6 = fetVar4.g(function2);
                                                Object objP8 = fetVar4.P();
                                                if (zG6 || objP8 == cl5Var2) {
                                                    objP8 = new dib(function2, (byte) 18);
                                                    fetVar4.o0(objP8);
                                                }
                                                jcb.l(mm40VarB2, mdmVar2, false, (Function0) objP8, fetVar4, 0, 4);
                                                fetVar4.r(false);
                                            }
                                        }
                                        throw b1j.f(974028783, fetVar4, false);
                                    }
                                    fetVar7.X();
                                    return Unit.f46060a;
                                case 1:
                                    ir8 ir8Var2 = (ir8) obj4;
                                    fet fetVar8 = (fet) obj5;
                                    int iIntValue5 = ((Integer) obj6).intValue();
                                    zx7 zx7Var2 = gqw0.e;
                                    ir8Var2.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= fetVar8.g(ir8Var2) ? 4 : 2;
                                    }
                                    if (fetVar8.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        if (pl7Var2 == null) {
                                            fetVar5 = fetVar8;
                                        } else if (pl7Var2 instanceof ll7) {
                                            fetVar8.e0(308740619);
                                            xcz xczVar3 = xczVar;
                                            q0x.n(xczVar3, (ll7) pl7Var2, function2, fetVar8, 0);
                                            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                                            zcl zclVar3 = qmk.f28987a;
                                            lh80 lh80Var2 = new lh80(8.0f, 12.0f, 8.0f, 32.0f);
                                            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                                            boolean zG7 = fetVar8.g(pl7Var2) | fetVar8.g(function2);
                                            Object objP9 = fetVar8.P();
                                            if (zG7 || objP9 == cl5Var2) {
                                                objP9 = new zbd(pl7Var2, function2, (byte) 2);
                                                fetVar8.o0(objP9);
                                            }
                                            b8k0.e(mm40VarD2, xczVar3, lh80Var2, qw3Var2, null, null, false, null, (Function1) objP9, fetVar8, 6, Response.NOT_ACCEPTABLE_HERE);
                                            fetVar8.r(false);
                                        } else {
                                            fetVar5 = fetVar8;
                                            if (pl7Var2 instanceof nl7) {
                                                fetVar5.e0(312153471);
                                                mm40 mm40VarB3 = ir8Var2.b(jm40Var2, zx7Var2);
                                                zcl zclVar4 = qmk.f28987a;
                                                mm40 mm40VarN2 = s5x0.N(mm40VarB3, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar3 = ((nl7) pl7Var2).d;
                                                boolean zG8 = fetVar5.g(function2);
                                                Object objP10 = fetVar5.P();
                                                if (zG8 || objP10 == cl5Var2) {
                                                    objP10 = new dng0(function2, (byte) 4);
                                                    fetVar5.o0(objP10);
                                                }
                                                jcb.l(mm40VarN2, mdmVar3, false, (Function0) objP10, fetVar5, 0, 4);
                                                fetVar5.r(false);
                                            } else if (pl7Var2 instanceof ol7) {
                                                fetVar5.e0(312560346);
                                                xf0.e(432, fetVar5, null, true, false);
                                                fetVar5.r(false);
                                            } else if (pl7Var2 instanceof ml7) {
                                                fetVar5.e0(312793001);
                                                mm40 mm40VarB4 = ir8Var2.b(jm40Var2, zx7Var2);
                                                zcl zclVar5 = qmk.f28987a;
                                                mm40 mm40VarN3 = s5x0.N(mm40VarB4, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar4 = ((ml7) pl7Var2).d;
                                                boolean zG9 = fetVar5.g(function2);
                                                Object objP11 = fetVar5.P();
                                                if (zG9 || objP11 == cl5Var2) {
                                                    objP11 = new dng0(function2, (byte) 1);
                                                    fetVar5.o0(objP11);
                                                }
                                                jcb.l(mm40VarN3, mdmVar4, false, (Function0) objP11, fetVar5, 0, 4);
                                                fetVar5.r(false);
                                            }
                                        }
                                        throw b1j.f(287052994, fetVar5, false);
                                    }
                                    fetVar8.X();
                                    return Unit.f46060a;
                                default:
                                    ir8 ir8Var3 = (ir8) obj4;
                                    fet fetVar9 = (fet) obj5;
                                    int iIntValue6 = ((Integer) obj6).intValue();
                                    zx7 zx7Var3 = gqw0.e;
                                    ir8Var3.getClass();
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= fetVar9.g(ir8Var3) ? 4 : 2;
                                    }
                                    if (fetVar9.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        if (pl7Var2 == null) {
                                            fetVar6 = fetVar9;
                                        } else if (pl7Var2 instanceof ll7) {
                                            fetVar9.e0(-217166365);
                                            xcz xczVar4 = xczVar;
                                            q0x.n(xczVar4, (ll7) pl7Var2, function2, fetVar9, 0);
                                            mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                                            zcl zclVar6 = qmk.f28987a;
                                            lh80 lh80Var3 = new lh80(8.0f, 8.0f, 8.0f, 32.0f);
                                            qw3 qw3Var3 = new qw3(8.0f, true, new jf4((byte) 14));
                                            boolean zG10 = fetVar9.g(pl7Var2) | fetVar9.g(function2);
                                            Object objP12 = fetVar9.P();
                                            if (zG10 || objP12 == cl5Var2) {
                                                objP12 = new zbd(pl7Var2, function2, (byte) 3);
                                                fetVar9.o0(objP12);
                                            }
                                            b8k0.e(mm40VarD3, xczVar4, lh80Var3, qw3Var3, null, null, false, null, (Function1) objP12, fetVar9, 6, Response.NOT_ACCEPTABLE_HERE);
                                            fetVar9.r(false);
                                        } else {
                                            fetVar6 = fetVar9;
                                            if (pl7Var2 instanceof nl7) {
                                                fetVar6.e0(-213701278);
                                                mm40 mm40VarB5 = ir8Var3.b(jm40Var2, zx7Var3);
                                                zcl zclVar7 = qmk.f28987a;
                                                mm40 mm40VarN4 = s5x0.N(mm40VarB5, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar5 = ((nl7) pl7Var2).d;
                                                boolean zG11 = fetVar6.g(function2);
                                                Object objP13 = fetVar6.P();
                                                if (zG11 || objP13 == cl5Var2) {
                                                    objP13 = new gno0(function2, (byte) 11);
                                                    fetVar6.o0(objP13);
                                                }
                                                jcb.l(mm40VarN4, mdmVar5, false, (Function0) objP13, fetVar6, 0, 4);
                                                fetVar6.r(false);
                                            } else if (pl7Var2 instanceof ol7) {
                                                fetVar6.e0(-213314336);
                                                xf0.e(432, fetVar6, null, true, false);
                                                fetVar6.r(false);
                                            } else if (pl7Var2 instanceof ml7) {
                                                fetVar6.e0(-213105396);
                                                mm40 mm40VarB6 = ir8Var3.b(jm40Var2, zx7Var3);
                                                zcl zclVar8 = qmk.f28987a;
                                                mm40 mm40VarN5 = s5x0.N(mm40VarB6, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                                mdm mdmVar6 = ((ml7) pl7Var2).d;
                                                boolean zG12 = fetVar6.g(function2);
                                                Object objP14 = fetVar6.P();
                                                if (zG12 || objP14 == cl5Var2) {
                                                    objP14 = new gno0(function2, (byte) 12);
                                                    fetVar6.o0(objP14);
                                                }
                                                jcb.l(mm40VarN5, mdmVar6, false, (Function0) objP14, fetVar6, 0, 4);
                                                fetVar6.r(false);
                                            }
                                        }
                                        throw b1j.f(1794108842, fetVar6, false);
                                    }
                                    fetVar9.X();
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar3), fetVar3, 100696064);
                    if (pl7Var.c()) {
                        fetVar3.e0(1830769290);
                        Object objP6 = fetVar3.P();
                        if (objP6 == cl5Var) {
                            objP6 = new fno0((byte) 2);
                            fetVar3.o0(objP6);
                        }
                        mm40 mm40VarY3 = y860.Y(n0qVar3, false, null, null, (Function0) objP6, 14);
                        zfn zfnVar3 = m8m0.f21378a;
                        mm40 mm40VarQ3 = i120.Q(mm40VarY3, ((StaticColors) fetVar3.k(zfnVar3)).m109getOverlayBackground400d7_KjU(), jd8.n);
                        tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                        int iHashCode3 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM3 = fetVar3.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarQ3);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(pcyVar);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, tj30VarC3, gqw0.x);
                        jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                        jpm0.o(fetVar3, Integer.valueOf(iHashCode3), gqw0.y);
                        jpm0.n(fetVar3);
                        jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                        kpb.j(jr8Var.b(jm40Var, gqw0.e), new dkm((ycl) null, new y3d(((StaticColors) fetVar3.k(zfnVar3)).m131getWhite800d7_KjU()), 3), fetVar3, 0, 0);
                        fetVar3.r(true);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(1831227687);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
