package a;

import android.content.Context;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class esw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8348a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ esw(byte b, mm40 mm40Var, pz40 pz40Var) {
        this.f8348a = b;
        this.b = mm40Var;
        this.c = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l5d0 l5d0VarA;
        l5d0 l5d0VarA2;
        byte b = this.f8348a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        boolean z = false;
        pz40 pz40Var = this.c;
        mm40 mm40Var = this.b;
        final byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kr00.a(u1c.M(-2123031477, new esw(b2, mm40Var, pz40Var), fetVar), fetVar, 6);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    mm40 mm40VarB = hp4.B(mm40Var);
                    x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarB);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    fetVar2.e0(656053975);
                    for (hzy hzyVar : (Iterable) pz40Var.getValue()) {
                        Object objP = fetVar2.P();
                        if (objP == cl5Var) {
                            objP = new h7w((byte) 12);
                            fetVar2.o0(objP);
                        }
                        gzy.a(null, hzyVar, (Function1) objP, fetVar2, 384);
                    }
                    fetVar2.r(false);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar3, 0);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40Var);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    final udp0 udp0Var = ((xrj0) pz40Var.getValue()).b;
                    if (udp0Var == null) {
                        fetVar3.e0(332928747);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(332928748);
                        if (udp0Var instanceof ycp0) {
                            l5d0VarA = cn80.b.a(w6n.h);
                        } else {
                            if (!(udp0Var instanceof sdp0)) {
                                t9f.b();
                                return null;
                            }
                            l5d0VarA = cn80.b.a(w6n.c);
                        }
                        zfn zfnVar = kcp0.b;
                        zcl zclVar2 = qmk.f28987a;
                        l5d0[] l5d0VarArr = {l5d0VarA, zfnVar.a(new ycl(4.0f))};
                        final byte b3 = z ? (byte) 1 : (byte) 0;
                        obc.e(l5d0VarArr, u1c.M(1765638995, new Function2() { // from class: a.wrj0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                byte b4 = b3;
                                cl5 cl5Var2 = ukd.f35823a;
                                switch (b4) {
                                    case 0:
                                        fet fetVar4 = (fet) obj3;
                                        int iIntValue4 = ((Integer) obj4).intValue();
                                        if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            zcl zclVar3 = qmk.f28987a;
                                            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 24.0f, 8.0f, 0.0f, 9);
                                            Object objP2 = fetVar4.P();
                                            if (objP2 == cl5Var2) {
                                                objP2 = new ogj0((byte) 17);
                                                fetVar4.o0(objP2);
                                            }
                                            kcp0.a(mm40VarN, udp0Var, (Function2) objP2, fetVar4, 384, 0);
                                        } else {
                                            fetVar4.X();
                                        }
                                        break;
                                    default:
                                        fet fetVar5 = (fet) obj3;
                                        int iIntValue5 = ((Integer) obj4).intValue();
                                        if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            zcl zclVar4 = qmk.f28987a;
                                            mm40 mm40VarN2 = s5x0.N(jm40.b, 8.0f, 24.0f, 0.0f, 0.0f, 12);
                                            Object objP3 = fetVar5.P();
                                            if (objP3 == cl5Var2) {
                                                objP3 = new ogj0((byte) 18);
                                                fetVar5.o0(objP3);
                                            }
                                            kcp0.a(mm40VarN2, udp0Var, (Function2) objP3, fetVar5, 384, 0);
                                        } else {
                                            fetVar5.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar3), fetVar3, 48);
                        fetVar3.r(false);
                    }
                    x7z x7zVar = new x7z(1.0f, true);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(x7zVar, 4.0f, 0.0f, 2);
                    boolean zG = fetVar3.g(pz40Var);
                    Object objP2 = fetVar3.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new ryc0(pz40Var, (byte) 14);
                        fetVar3.o0(objP2);
                    }
                    b8k0.e(mm40VarL, null, null, null, null, null, false, null, (Function1) objP2, fetVar3, 0, 510);
                    final udp0 udp0Var2 = ((xrj0) pz40Var.getValue()).c;
                    if (udp0Var2 == null) {
                        fetVar3.e0(333867272);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(333867273);
                        if (udp0Var2 instanceof ycp0) {
                            l5d0VarA2 = cn80.b.a(w6n.h);
                        } else {
                            if (!(udp0Var2 instanceof sdp0)) {
                                t9f.b();
                                return null;
                            }
                            l5d0VarA2 = cn80.b.a(w6n.c);
                        }
                        obc.e(new l5d0[]{l5d0VarA2, kcp0.b.a(new ycl(4.0f))}, u1c.M(1401881916, new Function2() { // from class: a.wrj0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                byte b4 = b2;
                                cl5 cl5Var2 = ukd.f35823a;
                                switch (b4) {
                                    case 0:
                                        fet fetVar4 = (fet) obj3;
                                        int iIntValue4 = ((Integer) obj4).intValue();
                                        if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            zcl zclVar4 = qmk.f28987a;
                                            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 24.0f, 8.0f, 0.0f, 9);
                                            Object objP3 = fetVar4.P();
                                            if (objP3 == cl5Var2) {
                                                objP3 = new ogj0((byte) 17);
                                                fetVar4.o0(objP3);
                                            }
                                            kcp0.a(mm40VarN, udp0Var2, (Function2) objP3, fetVar4, 384, 0);
                                        } else {
                                            fetVar4.X();
                                        }
                                        break;
                                    default:
                                        fet fetVar5 = (fet) obj3;
                                        int iIntValue5 = ((Integer) obj4).intValue();
                                        if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            zcl zclVar5 = qmk.f28987a;
                                            mm40 mm40VarN2 = s5x0.N(jm40.b, 8.0f, 24.0f, 0.0f, 0.0f, 12);
                                            Object objP4 = fetVar5.P();
                                            if (objP4 == cl5Var2) {
                                                objP4 = new ogj0((byte) 18);
                                                fetVar5.o0(objP4);
                                            }
                                            kcp0.a(mm40VarN2, udp0Var2, (Function2) objP4, fetVar5, 384, 0);
                                        } else {
                                            fetVar5.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar3), fetVar3, 48);
                        fetVar3.r(false);
                    }
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zfn zfnVar2 = afp0.f790a;
                    w6n w6nVar = w6n.c;
                    w6n w6nVar2 = w6n.f;
                    long jB = ((yez) ((rhv0) fetVar4.k(bmd.u))).b();
                    Context context = (Context) fetVar4.k(dy2.b);
                    boolean zF = fetVar4.f(jB);
                    Object objP3 = fetVar4.P();
                    if (zF || objP3 == cl5Var) {
                        objP3 = afp0.b(afp0.a(context.getResources().getDisplayMetrics().density, jB), w6nVar, w6nVar, w6nVar2);
                        fetVar4.o0(objP3);
                    }
                    obc.d(zfnVar2.a((w6n) objP3), u1c.M(783951662, new esw((byte) 7, mm40Var, pz40Var), fetVar4), fetVar4, 56);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                l7x.A(mm40Var, pz40Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                m7x.o(mm40Var, pz40Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zcl zclVar4 = qmk.f28987a;
                    qw3 qw3Var2 = new qw3(12.0f, true, new jf4((byte) 14));
                    mm40 mm40VarB2 = hp4.B(s5x0.J(mm40Var, 12.0f));
                    x5d x5dVarA2 = w5d.a(qw3Var2, gqw0.m, fetVar5, 0);
                    int iHashCode3 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM3 = fetVar5.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarB2);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC2, gqw0.v);
                    fetVar5.e0(-1084969449);
                    Iterator it = ((Iterable) pz40Var.getValue()).iterator();
                    while (it.hasNext()) {
                        g7x.o(null, (srj0) it.next(), fetVar5, 0);
                    }
                    fetVar5.r(false);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                yx7 yx7Var = gqw0.k;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar6, 0);
                    int iHashCode4 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM4 = fetVar6.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar6, mm40Var);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC3, gqw0.v);
                    gdp0 gdp0Var = ((zrj0) pz40Var.getValue()).b;
                    if (gdp0Var == null) {
                        fetVar6.e0(640714952);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(640714953);
                        ecu0 ecu0Var = new ecu0(yx7Var);
                        zcl zclVar5 = qmk.f28987a;
                        wpm0.c(s5x0.N(ecu0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), gdp0Var, null, fetVar6, 0, 4);
                        fetVar6.r(false);
                    }
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean zG2 = fetVar6.g(pz40Var);
                    Object objP4 = fetVar6.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new ryc0(pz40Var, (byte) 15);
                        fetVar6.o0(objP4);
                    }
                    b8k0.e(x7zVar2, null, null, null, null, null, false, null, (Function1) objP4, fetVar6, 0, 510);
                    gdp0 gdp0Var2 = ((zrj0) pz40Var.getValue()).c;
                    if (gdp0Var2 == null) {
                        fetVar6.e0(641260614);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(641260615);
                        ecu0 ecu0Var2 = new ecu0(yx7Var);
                        zcl zclVar6 = qmk.f28987a;
                        wpm0.c(s5x0.N(ecu0Var2, 16.0f, 0.0f, 0.0f, 0.0f, 14), gdp0Var2, null, fetVar6, 0, 4);
                        fetVar6.r(false);
                    }
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ihm0.c(mm40Var, pz40Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ohm0.e(mm40Var, pz40Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                qim0.e(mm40Var, pz40Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                msm0.e(mm40Var, pz40Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                btm0.l(mm40Var, pz40Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ esw(mm40 mm40Var, pz40 pz40Var, int i, byte b) {
        this.f8348a = b;
        this.b = mm40Var;
        this.c = pz40Var;
    }
}
