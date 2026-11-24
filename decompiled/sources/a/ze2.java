package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.favorites.impl.presentation.screen.category_image_header.models.CategoryImageHeaderTab;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ze2 implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44234a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ze2(Object obj, byte b) {
        this.f44234a = b;
        this.b = obj;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b2 = this.f44234a;
        cl5 cl5Var = ukd.f35823a;
        Object obj6 = this.b;
        switch (b2) {
            case 0:
                ef2 ef2Var = (ef2) obj6;
                ir8 ir8Var = (ir8) obj;
                e2d e2dVar = (e2d) obj2;
                b9g0 b9g0Var = (b9g0) obj3;
                fet fetVar = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                hfk0 hfk0Var = ef2.V1;
                ir8Var.getClass();
                e2dVar.getClass();
                b9g0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (fetVar.g(ir8Var) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= fetVar.g(e2dVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= fetVar.e(b9g0Var.ordinal()) ? 256 : 128;
                }
                if (fetVar.U(i & 1, (i & 1171) != 1170)) {
                    int i6 = i & 1022;
                    boolean zI = fetVar.i(ef2Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new af2(ef2Var, (byte) 0);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI2 = fetVar.i(ef2Var);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        b = 1;
                        objP2 = new af2(ef2Var, b);
                        fetVar.o0(objP2);
                    } else {
                        b = 1;
                    }
                    v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
                    int iOrdinal = b9g0Var.ordinal();
                    if (iOrdinal == 0) {
                        fetVar.e0(1756138111);
                        ef2Var.G0(e2dVar, fetVar, (i6 >> 3) & 14);
                        fetVar.r(false);
                    } else if (iOrdinal == b) {
                        fetVar.e0(1756140092);
                        ef2Var.H0(e2dVar, fetVar, (i6 >> 3) & 14);
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw b1j.f(1756136569, fetVar, false);
                        }
                        fetVar.e0(1756142046);
                        ef2Var.I0(e2dVar, fetVar, (i6 >> 3) & 14);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                g5b g5bVar = (g5b) obj6;
                ir8 ir8Var2 = (ir8) obj;
                bzl bzlVar = (bzl) obj2;
                CategoryImageHeaderTab categoryImageHeaderTab = (CategoryImageHeaderTab) obj3;
                fet fetVar2 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                gl5 gl5Var = g5b.c2;
                ir8Var2.getClass();
                bzlVar.getClass();
                categoryImageHeaderTab.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (fetVar2.g(ir8Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= fetVar2.g(bzlVar) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= fetVar2.e(categoryImageHeaderTab.ordinal()) ? 256 : 128;
                }
                if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
                    g5bVar.M1.J(g5bVar, g5b.d2[1], categoryImageHeaderTab);
                    int i7 = i2 & 1022;
                    int iOrdinal2 = categoryImageHeaderTab.ordinal();
                    if (iOrdinal2 == 0) {
                        fetVar2.e0(1364554155);
                        g5bVar.L0(bzlVar, fetVar2, (i7 >> 3) & 14);
                        fetVar2.r(false);
                    } else if (iOrdinal2 == 1) {
                        fetVar2.e0(1364558635);
                        g5bVar.N0(bzlVar, fetVar2, (i7 >> 3) & 14);
                        fetVar2.r(false);
                    } else if (iOrdinal2 == 2) {
                        fetVar2.e0(1364556335);
                        g5bVar.G0(bzlVar, fetVar2, (i7 >> 3) & 14);
                        fetVar2.r(false);
                    } else {
                        if (iOrdinal2 != 3) {
                            throw b1j.f(1364552017, fetVar2, false);
                        }
                        fetVar2.e0(1364560811);
                        g5bVar.M0(bzlVar, fetVar2, (i7 >> 3) & 14);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                rop ropVar = (rop) obj6;
                f9h0 f9h0Var = (f9h0) obj;
                j700 j700Var = (j700) obj2;
                dhq0 dhq0Var = (dhq0) obj3;
                fet fetVar3 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                nek nekVar = rop.a2;
                f9h0Var.getClass();
                j700Var.getClass();
                dhq0Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = ((iIntValue3 & 8) == 0 ? fetVar3.g(f9h0Var) : fetVar3.i(f9h0Var) ? 4 : 2) | iIntValue3;
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= fetVar3.e(j700Var.ordinal()) ? 32 : 16;
                }
                if ((iIntValue3 & 384) == 0) {
                    i3 |= fetVar3.g(dhq0Var) ? 256 : 128;
                }
                if (fetVar3.U(i3 & 1, (i3 & 1171) != 1170)) {
                    obc.d(nip.f23600a.a(((hgk0) ropVar.Z1).getValue()), u1c.M(2134554770, new iop(dhq0Var, ropVar, f9h0Var, j700Var, (byte) 0), fetVar3), fetVar3, 56);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                final j3n j3nVar = (j3n) obj6;
                mm40 mm40Var = (mm40) obj;
                xcz xczVar = (xcz) obj2;
                xcz xczVar2 = (xcz) obj3;
                fet fetVar4 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                mm40Var.getClass();
                xczVar.getClass();
                xczVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i4 = (fetVar4.g(mm40Var) ? 4 : 2) | iIntValue4;
                } else {
                    i4 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i4 |= fetVar4.g(xczVar) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i4 |= fetVar4.g(xczVar2) ? 256 : 128;
                }
                if (fetVar4.U(i4 & 1, (i4 & 1171) != 1170)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarD = o7k0.d(s5x0.N(mm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar4, 0);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarD);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    boolean z = fetVar4.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar4, thg0VarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar4, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar4, numValueOf, shdVar3);
                    jpm0.n(fetVar4);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar4, mm40VarC0, shdVar4);
                    zhg0 zhg0Var = zhg0.f44392a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarC = o7k0.c(zhg0Var.a(1.0f, jm40Var, true), 1.0f);
                    nw3 nw3Var = uc9.e;
                    boolean zG = fetVar4.g(j3nVar);
                    Object objP3 = fetVar4.P();
                    if (zG || objP3 == cl5Var) {
                        final byte b3 = 0;
                        objP3 = new Function1() { // from class: a.q9l0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b4 = b3;
                                j3n j3nVar2 = j3nVar;
                                hcz hczVar = (hcz) obj7;
                                switch (b4) {
                                    case 0:
                                        hczVar.getClass();
                                        ArrayList arrayList = j3nVar2.d;
                                        r9l0 r9l0Var = r9l0.b;
                                        hczVar.f(arrayList.size(), new j13(arrayList, (byte) 29), new t9l0(arrayList, (byte) 0), new ugd(802480018, true, new wyl0(arrayList, (byte) 3)));
                                        break;
                                    default:
                                        hczVar.getClass();
                                        ArrayList arrayList2 = j3nVar2.e;
                                        s9l0 s9l0Var = s9l0.b;
                                        hczVar.f(arrayList2.size(), new t9l0(arrayList2), new t9l0(arrayList2, (byte) 2), new ugd(802480018, true, new wyl0(arrayList2, (byte) 4)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar4.o0(objP3);
                    }
                    b8k0.e(mm40VarC, xczVar, null, nw3Var, null, null, false, null, (Function1) objP3, fetVar4, (i4 & 112) | 113270784, 108);
                    mm40 mm40VarB = zhg0Var.b(gqw0.k, o7k0.s(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 84.0f));
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar4, 48);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarB);
                    fetVar4.i0();
                    int i8 = i4;
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA, shdVar);
                    jpm0.o(fetVar4, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, shdVar4);
                    g1x.m(j3nVar.f, fetVar4, 6);
                    qal0 qal0Var = j3nVar.c;
                    if (qal0Var == null) {
                        fetVar4.e0(1819669165);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1819669166);
                        c3x.n(null, u1c.M(-413799523, new ygd(qal0Var, (byte) 8), fetVar4), u1c.M(-101896394, new ygd(qal0Var, (byte) 9), fetVar4), u1c.M(-1615805769, new ygd(qal0Var, (byte) 10), fetVar4), u1c.M(1165252152, new ygd(qal0Var, (byte) 11), fetVar4), fetVar4, 28080);
                        fetVar4.r(false);
                    }
                    final byte b4 = 1;
                    fetVar4.r(true);
                    mm40 mm40VarC2 = o7k0.c(zhg0Var.a(1.0f, jm40Var, true), 1.0f);
                    boolean zG2 = fetVar4.g(j3nVar);
                    Object objP4 = fetVar4.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new Function1() { // from class: a.q9l0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b5 = b4;
                                j3n j3nVar2 = j3nVar;
                                hcz hczVar = (hcz) obj7;
                                switch (b5) {
                                    case 0:
                                        hczVar.getClass();
                                        ArrayList arrayList = j3nVar2.d;
                                        r9l0 r9l0Var = r9l0.b;
                                        hczVar.f(arrayList.size(), new j13(arrayList, (byte) 29), new t9l0(arrayList, (byte) 0), new ugd(802480018, true, new wyl0(arrayList, (byte) 3)));
                                        break;
                                    default:
                                        hczVar.getClass();
                                        ArrayList arrayList2 = j3nVar2.e;
                                        s9l0 s9l0Var = s9l0.b;
                                        hczVar.f(arrayList2.size(), new t9l0(arrayList2), new t9l0(arrayList2, (byte) 2), new ugd(802480018, true, new wyl0(arrayList2, (byte) 4)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar4.o0(objP4);
                    }
                    b8k0.e(mm40VarC2, xczVar2, null, nw3Var, null, null, false, null, (Function1) objP4, fetVar4, ((i8 >> 3) & 112) | 113270784, 108);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                i0p0 i0p0Var = (i0p0) obj6;
                y5d y5dVar = (y5d) obj;
                e2d e2dVar2 = (e2d) obj2;
                j3p0 j3p0Var = (j3p0) obj3;
                fet fetVar5 = (fet) obj4;
                int iIntValue5 = ((Integer) obj5).intValue();
                j6m0 j6m0Var = i0p0.Z1;
                y5dVar.getClass();
                e2dVar2.getClass();
                j3p0Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i5 = iIntValue5 | (fetVar5.g(y5dVar) ? 4 : 2);
                } else {
                    i5 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i5 |= fetVar5.g(e2dVar2) ? 32 : 16;
                }
                if ((iIntValue5 & 384) == 0) {
                    i5 |= fetVar5.e(j3p0Var.ordinal()) ? 256 : 128;
                }
                if (fetVar5.U(i5 & 1, (i5 & 1171) != 1170)) {
                    int i9 = i5 & 1022;
                    int iOrdinal3 = j3p0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        fetVar5.e0(-1511427532);
                        i0p0Var.G0(e2dVar2, fetVar5, (i9 >> 3) & 14);
                        fetVar5.r(false);
                    } else {
                        if (iOrdinal3 != 1) {
                            throw b1j.f(-1511428884, fetVar5, false);
                        }
                        fetVar5.e0(-1511425639);
                        i0p0Var.H0(e2dVar2, fetVar5, (i9 >> 3) & 14);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
        }
    }
}
