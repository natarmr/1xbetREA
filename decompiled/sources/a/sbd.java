package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sbd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31927a;
    public final /* synthetic */ z77 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xcz d;

    public /* synthetic */ sbd(xcz xczVar, z77 z77Var, Function1 function1) {
        this.f31927a = (byte) 2;
        this.d = xczVar;
        this.b = z77Var;
        this.c = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        zx7 zx7Var;
        byte b = this.f31927a;
        cl5 cl5Var = ukd.f35823a;
        final xcz xczVar = this.d;
        final Function1 function1 = this.c;
        final z77 z77Var = this.b;
        jm40 jm40Var = jm40.b;
        final byte b2 = 2;
        Object[] objArr = 0;
        final byte b3 = 1;
        switch (b) {
            case 0:
                ir8 ir8Var = (ir8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                zx7 zx7Var2 = gqw0.e;
                ir8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(ir8Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if (z77Var != null) {
                        if (z77Var instanceof u77) {
                            fetVar2.e0(573853822);
                            mm40 mm40VarB = ir8Var.b(jm40Var, zx7Var2);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                            mdm mdmVar = ((u77) z77Var).f;
                            boolean zG = fetVar2.g(function1);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new dib(function1, (byte) 16);
                                fetVar2.o0(objP);
                            }
                            zx7Var = zx7Var2;
                            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar2, 0, 4);
                            fetVar = fetVar2;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar2;
                            zx7Var = zx7Var2;
                            if (z77Var instanceof v77) {
                                fetVar.e0(574295975);
                                mm40 mm40VarB2 = ir8Var.b(jm40Var, zx7Var);
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarN2 = s5x0.N(mm40VarB2, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                                mdm mdmVar2 = ((v77) z77Var).f;
                                boolean zG2 = fetVar.g(function1);
                                Object objP2 = fetVar.P();
                                if (zG2 || objP2 == cl5Var) {
                                    objP2 = new dib(function1, (byte) 17);
                                    fetVar.o0(objP2);
                                }
                                jcb.l(mm40VarN2, mdmVar2, false, (Function0) objP2, fetVar, 0, 4);
                                fetVar.r(false);
                            } else if (z77Var instanceof w77) {
                                fetVar.e0(574721264);
                                ro4.s(0, fetVar);
                                fetVar.r(false);
                            } else if (z77Var instanceof x77) {
                                fetVar.e0(574938853);
                                q0x.m(xczVar, (x77) z77Var, function1, fetVar, 0);
                                obc.d(xf80.f40779a.a(null), u1c.M(193624053, new Function2() { // from class: a.f57
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        byte b4 = b3;
                                        cl5 cl5Var2 = ukd.f35823a;
                                        jm40 jm40Var2 = jm40.b;
                                        Function1 function2 = function1;
                                        z77 z77Var2 = z77Var;
                                        switch (b4) {
                                            case 0:
                                                fet fetVar3 = (fet) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                                    zcl zclVar3 = qmk.f28987a;
                                                    lh80 lh80Var = new lh80(xfn.a(fetVar3).d, 12.0f, xfn.a(fetVar3).d, 32.0f);
                                                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                                                    boolean zG3 = fetVar3.g(z77Var2) | fetVar3.g(function2);
                                                    Object objP3 = fetVar3.P();
                                                    if (zG3 || objP3 == cl5Var2) {
                                                        objP3 = new g57(z77Var2, function2, (byte) 0);
                                                        fetVar3.o0(objP3);
                                                    }
                                                    b8k0.e(mm40VarD, xczVar, lh80Var, qw3Var, null, null, false, null, (Function1) objP3, fetVar3, 6, Response.NOT_ACCEPTABLE_HERE);
                                                } else {
                                                    fetVar3.X();
                                                }
                                                break;
                                            case 1:
                                                fet fetVar4 = (fet) obj4;
                                                int iIntValue3 = ((Integer) obj5).intValue();
                                                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                                                    zcl zclVar4 = qmk.f28987a;
                                                    lh80 lh80Var2 = new lh80(qmk.a(fetVar4).d, 12.0f, qmk.a(fetVar4).d, 24.0f);
                                                    qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                                                    boolean zG4 = fetVar4.g(z77Var2) | fetVar4.g(function2);
                                                    Object objP4 = fetVar4.P();
                                                    if (zG4 || objP4 == cl5Var2) {
                                                        objP4 = new g57(z77Var2, function2, (byte) 1);
                                                        fetVar4.o0(objP4);
                                                    }
                                                    b8k0.e(mm40VarD2, xczVar, lh80Var2, qw3Var2, null, null, false, null, (Function1) objP4, fetVar4, 6, Response.NOT_ACCEPTABLE_HERE);
                                                } else {
                                                    fetVar4.X();
                                                }
                                                break;
                                            default:
                                                fet fetVar5 = (fet) obj4;
                                                int iIntValue4 = ((Integer) obj5).intValue();
                                                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                                                    zcl zclVar5 = qmk.f28987a;
                                                    lh80 lh80Var3 = new lh80(xfn.a(fetVar5).d, 12.0f, xfn.a(fetVar5).d, 32.0f);
                                                    qw3 qw3Var3 = new qw3(8.0f, true, new jf4((byte) 14));
                                                    boolean zG5 = fetVar5.g(z77Var2) | fetVar5.g(function2);
                                                    Object objP5 = fetVar5.P();
                                                    if (zG5 || objP5 == cl5Var2) {
                                                        objP5 = new g57(z77Var2, function2, (byte) 3);
                                                        fetVar5.o0(objP5);
                                                    }
                                                    b8k0.e(mm40VarD3, xczVar, lh80Var3, qw3Var3, null, null, false, null, (Function1) objP5, fetVar5, 6, Response.NOT_ACCEPTABLE_HERE);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), fetVar, 48);
                                fetVar.r(false);
                            } else if (z77Var instanceof y77) {
                                fetVar.e0(578430848);
                                mm40 mm40VarB3 = ir8Var.b(jm40Var, zx7Var);
                                zcl zclVar3 = qmk.f28987a;
                                jcb.l(s5x0.N(mm40VarB3, 0.0f, 0.0f, 0.0f, 32.0f, 7), ((y77) z77Var).f, false, null, fetVar, 0, 12);
                                fetVar.r(false);
                            }
                        }
                        if (z77Var.c()) {
                            fetVar.e0(578742367);
                            n0q n0qVar = o7k0.c;
                            Object objP3 = fetVar.P();
                            if (objP3 == cl5Var) {
                                objP3 = new a7d((byte) 4);
                                fetVar.o0(objP3);
                            }
                            mm40 mm40VarY = y860.Y(n0qVar, false, null, null, (Function0) objP3, 14);
                            zfn zfnVar = m8m0.f21378a;
                            mm40 mm40VarQ = i120.Q(mm40VarY, ((StaticColors) fetVar.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
                            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                            int iHashCode = Long.hashCode(fetVar.T);
                            bh90 bh90VarM = fetVar.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, tj30VarC, gqw0.x);
                            jpm0.o(fetVar, bh90VarM, gqw0.w);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC0, gqw0.v);
                            kpb.j(jr8.f16991a.b(jm40Var, zx7Var), new dkm((ycl) null, new y3d(((StaticColors) fetVar.k(zfnVar)).m131getWhite800d7_KjU()), 3), fetVar, 0, 0);
                            fetVar.r(true);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(579246892);
                            fetVar.r(false);
                        }
                    } else {
                        fetVar = fetVar2;
                    }
                    throw b1j.f(-1644054364, fetVar, false);
                }
                fetVar2.X();
                return Unit.f46060a;
            case 1:
                ir8 ir8Var2 = (ir8) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                zx7 zx7Var3 = gqw0.e;
                ir8Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar3.g(ir8Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    if (z77Var != null) {
                        if (z77Var instanceof u77) {
                            fetVar3.e0(-1377042703);
                            mm40 mm40VarB4 = ir8Var2.b(jm40Var, zx7Var3);
                            zcl zclVar4 = qmk.f28987a;
                            mm40 mm40VarN3 = s5x0.N(mm40VarB4, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                            mdm mdmVar3 = ((u77) z77Var).f;
                            boolean zG3 = fetVar3.g(function1);
                            Object objP4 = fetVar3.P();
                            if (zG3 || objP4 == cl5Var) {
                                objP4 = new to6(function1, (byte) 7);
                                fetVar3.o0(objP4);
                            }
                            jcb.l(mm40VarN3, mdmVar3, false, (Function0) objP4, fetVar3, 0, 4);
                            fetVar3.r(false);
                        } else if (z77Var instanceof v77) {
                            fetVar3.e0(-1376601449);
                            mm40 mm40VarB5 = ir8Var2.b(jm40Var, zx7Var3);
                            zcl zclVar5 = qmk.f28987a;
                            mm40 mm40VarN4 = s5x0.N(mm40VarB5, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                            mdm mdmVar4 = ((v77) z77Var).f;
                            boolean zG4 = fetVar3.g(function1);
                            Object objP5 = fetVar3.P();
                            if (zG4 || objP5 == cl5Var) {
                                objP5 = new to6(function1, (byte) 8);
                                fetVar3.o0(objP5);
                            }
                            jcb.l(mm40VarN4, mdmVar4, false, (Function0) objP5, fetVar3, 0, 4);
                            fetVar3.r(false);
                        } else if (z77Var instanceof w77) {
                            fetVar3.e0(-1376146555);
                            w2w w2wVar = ((w77) z77Var).b;
                            xf0.e(0, fetVar3, null, w2wVar.c, w2wVar.b);
                            fetVar3.r(false);
                        } else if (z77Var instanceof x77) {
                            fetVar3.e0(-1375688406);
                            q0x.m(xczVar, (x77) z77Var, function1, fetVar3, 0);
                            l5d0 l5d0VarA = xf80.f40779a.a(null);
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            obc.d(l5d0VarA, u1c.M(-661125214, new Function2() { // from class: a.f57
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    byte b4 = objArr2;
                                    cl5 cl5Var2 = ukd.f35823a;
                                    jm40 jm40Var2 = jm40.b;
                                    Function1 function2 = function1;
                                    z77 z77Var2 = z77Var;
                                    switch (b4) {
                                        case 0:
                                            fet fetVar4 = (fet) obj4;
                                            int iIntValue3 = ((Integer) obj5).intValue();
                                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                                zcl zclVar6 = qmk.f28987a;
                                                lh80 lh80Var = new lh80(xfn.a(fetVar4).d, 12.0f, xfn.a(fetVar4).d, 32.0f);
                                                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                                                boolean zG5 = fetVar4.g(z77Var2) | fetVar4.g(function2);
                                                Object objP6 = fetVar4.P();
                                                if (zG5 || objP6 == cl5Var2) {
                                                    objP6 = new g57(z77Var2, function2, (byte) 0);
                                                    fetVar4.o0(objP6);
                                                }
                                                b8k0.e(mm40VarD, xczVar, lh80Var, qw3Var, null, null, false, null, (Function1) objP6, fetVar4, 6, Response.NOT_ACCEPTABLE_HERE);
                                            } else {
                                                fetVar4.X();
                                            }
                                            break;
                                        case 1:
                                            fet fetVar5 = (fet) obj4;
                                            int iIntValue4 = ((Integer) obj5).intValue();
                                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                                                zcl zclVar7 = qmk.f28987a;
                                                lh80 lh80Var2 = new lh80(qmk.a(fetVar5).d, 12.0f, qmk.a(fetVar5).d, 24.0f);
                                                qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                                                boolean zG6 = fetVar5.g(z77Var2) | fetVar5.g(function2);
                                                Object objP7 = fetVar5.P();
                                                if (zG6 || objP7 == cl5Var2) {
                                                    objP7 = new g57(z77Var2, function2, (byte) 1);
                                                    fetVar5.o0(objP7);
                                                }
                                                b8k0.e(mm40VarD2, xczVar, lh80Var2, qw3Var2, null, null, false, null, (Function1) objP7, fetVar5, 6, Response.NOT_ACCEPTABLE_HERE);
                                            } else {
                                                fetVar5.X();
                                            }
                                            break;
                                        default:
                                            fet fetVar6 = (fet) obj4;
                                            int iIntValue5 = ((Integer) obj5).intValue();
                                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                                                zcl zclVar8 = qmk.f28987a;
                                                lh80 lh80Var3 = new lh80(xfn.a(fetVar6).d, 12.0f, xfn.a(fetVar6).d, 32.0f);
                                                qw3 qw3Var3 = new qw3(8.0f, true, new jf4((byte) 14));
                                                boolean zG7 = fetVar6.g(z77Var2) | fetVar6.g(function2);
                                                Object objP8 = fetVar6.P();
                                                if (zG7 || objP8 == cl5Var2) {
                                                    objP8 = new g57(z77Var2, function2, (byte) 3);
                                                    fetVar6.o0(objP8);
                                                }
                                                b8k0.e(mm40VarD3, xczVar, lh80Var3, qw3Var3, null, null, false, null, (Function1) objP8, fetVar6, 6, Response.NOT_ACCEPTABLE_HERE);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar3), fetVar3, 48);
                            fetVar3.r(false);
                        } else if (z77Var instanceof y77) {
                            fetVar3.e0(-1370923117);
                            mm40 mm40VarB6 = ir8Var2.b(jm40Var, zx7Var3);
                            zcl zclVar6 = qmk.f28987a;
                            jcb.l(s5x0.N(mm40VarB6, 0.0f, 0.0f, 0.0f, 32.0f, 7), ((y77) z77Var).f, false, null, fetVar3, 0, 12);
                            fetVar3.r(false);
                        }
                    }
                    throw b1j.f(1479603684, fetVar3, false);
                }
                fetVar3.X();
                return Unit.f46060a;
            case 2:
                ir8 ir8Var3 = (ir8) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir8Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar4.g(ir8Var3) ? (byte) 4 : (byte) 2;
                }
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    nnw0.x(ir8Var3, this.d, this.b, this.c, fetVar4, iIntValue3 & 14);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                ir8 ir8Var4 = (ir8) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                zx7 zx7Var4 = gqw0.e;
                ir8Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar5.g(ir8Var4) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    if (z77Var != null) {
                        if (z77Var instanceof u77) {
                            fetVar5.e0(-487161215);
                            mm40 mm40VarB7 = ir8Var4.b(jm40Var, zx7Var4);
                            zcl zclVar7 = qmk.f28987a;
                            mm40 mm40VarN5 = s5x0.N(mm40VarB7, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                            mdm mdmVar5 = ((u77) z77Var).f;
                            boolean zG5 = fetVar5.g(function1);
                            Object objP6 = fetVar5.P();
                            if (zG5 || objP6 == cl5Var) {
                                objP6 = new gno0(function1, (byte) 9);
                                fetVar5.o0(objP6);
                            }
                            jcb.l(mm40VarN5, mdmVar5, false, (Function0) objP6, fetVar5, 0, 4);
                            fetVar5.r(false);
                        } else if (z77Var instanceof v77) {
                            fetVar5.e0(-486661526);
                            mm40 mm40VarB8 = ir8Var4.b(jm40Var, zx7Var4);
                            zcl zclVar8 = qmk.f28987a;
                            mm40 mm40VarN6 = s5x0.N(mm40VarB8, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                            mdm mdmVar6 = ((v77) z77Var).f;
                            boolean zG6 = fetVar5.g(function1);
                            Object objP7 = fetVar5.P();
                            if (zG6 || objP7 == cl5Var) {
                                objP7 = new gno0(function1, (byte) 10);
                                fetVar5.o0(objP7);
                            }
                            jcb.l(mm40VarN6, mdmVar6, false, (Function0) objP7, fetVar5, 0, 4);
                            fetVar5.r(false);
                        } else if (z77Var instanceof w77) {
                            fetVar5.e0(-486152785);
                            w2w w2wVar2 = ((w77) z77Var).b;
                            xf0.e(0, fetVar5, null, w2wVar2.c, w2wVar2.b);
                            fetVar5.r(false);
                        } else if (z77Var instanceof x77) {
                            fetVar5.e0(-485706323);
                            q0x.m(xczVar, (x77) z77Var, function1, fetVar5, 0);
                            obc.d(xf80.f40779a.a(null), u1c.M(-248432040, new Function2() { // from class: a.f57
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    byte b4 = b2;
                                    cl5 cl5Var2 = ukd.f35823a;
                                    jm40 jm40Var2 = jm40.b;
                                    Function1 function2 = function1;
                                    z77 z77Var2 = z77Var;
                                    switch (b4) {
                                        case 0:
                                            fet fetVar6 = (fet) obj4;
                                            int iIntValue5 = ((Integer) obj5).intValue();
                                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                                zcl zclVar9 = qmk.f28987a;
                                                lh80 lh80Var = new lh80(xfn.a(fetVar6).d, 12.0f, xfn.a(fetVar6).d, 32.0f);
                                                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                                                boolean zG7 = fetVar6.g(z77Var2) | fetVar6.g(function2);
                                                Object objP8 = fetVar6.P();
                                                if (zG7 || objP8 == cl5Var2) {
                                                    objP8 = new g57(z77Var2, function2, (byte) 0);
                                                    fetVar6.o0(objP8);
                                                }
                                                b8k0.e(mm40VarD, xczVar, lh80Var, qw3Var, null, null, false, null, (Function1) objP8, fetVar6, 6, Response.NOT_ACCEPTABLE_HERE);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                        case 1:
                                            fet fetVar7 = (fet) obj4;
                                            int iIntValue6 = ((Integer) obj5).intValue();
                                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                                                zcl zclVar10 = qmk.f28987a;
                                                lh80 lh80Var2 = new lh80(qmk.a(fetVar7).d, 12.0f, qmk.a(fetVar7).d, 24.0f);
                                                qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                                                boolean zG8 = fetVar7.g(z77Var2) | fetVar7.g(function2);
                                                Object objP9 = fetVar7.P();
                                                if (zG8 || objP9 == cl5Var2) {
                                                    objP9 = new g57(z77Var2, function2, (byte) 1);
                                                    fetVar7.o0(objP9);
                                                }
                                                b8k0.e(mm40VarD2, xczVar, lh80Var2, qw3Var2, null, null, false, null, (Function1) objP9, fetVar7, 6, Response.NOT_ACCEPTABLE_HERE);
                                            } else {
                                                fetVar7.X();
                                            }
                                            break;
                                        default:
                                            fet fetVar8 = (fet) obj4;
                                            int iIntValue7 = ((Integer) obj5).intValue();
                                            if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                                mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                                                zcl zclVar11 = qmk.f28987a;
                                                lh80 lh80Var3 = new lh80(xfn.a(fetVar8).d, 12.0f, xfn.a(fetVar8).d, 32.0f);
                                                qw3 qw3Var3 = new qw3(8.0f, true, new jf4((byte) 14));
                                                boolean zG9 = fetVar8.g(z77Var2) | fetVar8.g(function2);
                                                Object objP10 = fetVar8.P();
                                                if (zG9 || objP10 == cl5Var2) {
                                                    objP10 = new g57(z77Var2, function2, (byte) 3);
                                                    fetVar8.o0(objP10);
                                                }
                                                b8k0.e(mm40VarD3, xczVar, lh80Var3, qw3Var3, null, null, false, null, (Function1) objP10, fetVar8, 6, Response.NOT_ACCEPTABLE_HERE);
                                            } else {
                                                fetVar8.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar5), fetVar5, 48);
                            fetVar5.r(false);
                        } else if (z77Var instanceof y77) {
                            fetVar5.e0(-481331293);
                            mm40 mm40VarB9 = ir8Var4.b(jm40Var, zx7Var4);
                            zcl zclVar9 = qmk.f28987a;
                            jcb.l(s5x0.N(mm40VarB9, 0.0f, 0.0f, 0.0f, 32.0f, 7), ((y77) z77Var).f, false, null, fetVar5, 0, 12);
                            fetVar5.r(false);
                        }
                    }
                    throw b1j.f(-1124090064, fetVar5, false);
                }
                fetVar5.X();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ sbd(byte b, z77 z77Var, xcz xczVar, Function1 function1) {
        this.f31927a = b;
        this.b = z77Var;
        this.c = function1;
        this.d = xczVar;
    }
}
