package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;
import org.xplatform.sportgame.subgames.api.SubGamesParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z1s implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43636a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1s(Object obj, Object obj2, byte b) {
        this.f43636a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b = this.f43636a;
        byte b2 = 7;
        pcy pcyVar = e7z.u1;
        Object obj6 = this.c;
        Object obj7 = this.b;
        final byte b3 = 1;
        switch (b) {
            case 0:
                l7m0 l7m0Var = (l7m0) obj7;
                j2s j2sVar = (j2s) obj6;
                mm40 mm40Var = (mm40) obj;
                mm40 mm40Var2 = (mm40) obj2;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                xak xakVar = j2s.b2;
                mm40Var.getClass();
                mm40Var2.getClass();
                function1.getClass();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (fetVar.g(mm40Var) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= fetVar.g(mm40Var2) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= fetVar.i(function1) ? 256 : 128;
                }
                if (fetVar.U(i & 1, (i & 1171) != 1170)) {
                    ugd ugdVarM = u1c.M(1523519898, new d2s(j2sVar, mm40Var2, (byte) 0), fetVar);
                    ugd ugdVarM2 = u1c.M(670081537, new n82(j2sVar, mm40Var2, function1, (byte) 15), fetVar);
                    l7m0Var.getClass();
                    pz40 pz40Var = s6t0.f31722a;
                    long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                    zcl zclVar = qmk.i;
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar2, zclVar2, i120.Q(mm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar2, zclVar2)));
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
                    b830 b830Var = (b830) l7m0Var.getValue();
                    if (b830Var != null) {
                        if (b830Var instanceof v730) {
                            fetVar.e0(-44749564);
                            ugdVarM2.j(o7k0.c, ((v730) b830Var).f36904a, fetVar, 390);
                            fetVar.r(false);
                        } else {
                            z = false;
                            if (b830Var instanceof z730) {
                                fetVar.e0(-44745831);
                                ugdVarM.j(o7k0.c, ((z730) b830Var).f43900a, fetVar, 390);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(true);
                    } else {
                        z = false;
                    }
                    throw b1j.f(-44752362, fetVar, z);
                }
                fetVar.X();
                return Unit.f46060a;
            case 1:
                final oda odaVar = (oda) obj7;
                final Function2 function2 = (Function2) obj6;
                mm40 mm40Var3 = (mm40) obj;
                final xcz xczVar = (xcz) obj2;
                final xcz xczVar2 = (xcz) obj3;
                fet fetVar2 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                mm40Var3.getClass();
                xczVar.getClass();
                xczVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (fetVar2.g(mm40Var3) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= fetVar2.g(xczVar) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= fetVar2.g(xczVar2) ? 256 : 128;
                }
                int i6 = i2;
                if (fetVar2.U(i6 & 1, (i6 & 1171) != 1170)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarD = o7k0.d(s5x0.N(mm40Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, thg0VarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    zfn zfnVar = cn80.b;
                    w6n w6nVar = w6n.k;
                    l5d0 l5d0VarA = zfnVar.a(w6nVar);
                    zfn zfnVar2 = cn80.f4642a;
                    zfn zfnVar3 = bmd.n;
                    l5d0 l5d0VarA2 = zfnVar2.a(fetVar2.k(zfnVar3));
                    zfn zfnVar4 = kcp0.c;
                    l5d0 l5d0VarA3 = zfnVar4.a(Boolean.FALSE);
                    zfn zfnVar5 = egp0.f7775a;
                    l5d0 l5d0VarA4 = zfnVar5.a(gqw0.f);
                    zfn zfnVar6 = egp0.c;
                    zfn zfnVar7 = j1t0.e;
                    ((g1t0) fetVar2.k(zfnVar7)).getClass();
                    l5d0 l5d0VarA5 = zfnVar6.a(g1t0.h());
                    zfn zfnVar8 = egp0.b;
                    l5d0 l5d0VarK = dw9.k(6, zfnVar8);
                    l5d0 l5d0VarA6 = zfnVar2.a(fetVar2.k(zfnVar3));
                    zfn zfnVar9 = egp0.d;
                    l5d0 l5d0VarA7 = zfnVar9.a(2);
                    zfn zfnVar10 = kcp0.f18071a;
                    final byte b4 = 0;
                    obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, l5d0VarA4, l5d0VarA5, l5d0VarK, l5d0VarA6, l5d0VarA7, zfnVar10.a(null)}, u1c.M(319605329, new Function2() { // from class: a.cda
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            byte b5 = b4;
                            cl5 cl5Var = ukd.f35823a;
                            final Function2 function3 = function2;
                            final oda odaVar2 = odaVar;
                            final byte b6 = 1;
                            final byte b7 = 0;
                            switch (b5) {
                                case 0:
                                    fet fetVar3 = (fet) obj8;
                                    int iIntValue3 = ((Integer) obj9).intValue();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        mm40 mm40VarC = o7k0.c(new x7z(1.0f, true), 1.0f);
                                        zcl zclVar4 = qmk.f28987a;
                                        qw3 qw3Var = new qw3(4.0f, false, new gne(gqw0.k, (byte) 11));
                                        boolean zG = fetVar3.g(odaVar2) | fetVar3.g(function3);
                                        Object objP = fetVar3.P();
                                        if (zG || objP == cl5Var) {
                                            objP = new Function1() { // from class: a.ada
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj10) {
                                                    byte b8 = b7;
                                                    Function2 function4 = function3;
                                                    oda odaVar3 = odaVar2;
                                                    hcz hczVar = (hcz) obj10;
                                                    switch (b8) {
                                                        case 0:
                                                            hczVar.getClass();
                                                            ArrayList arrayList = odaVar3.c;
                                                            dda ddaVar = dda.b;
                                                            hczVar.f(arrayList.size(), new j13(arrayList, (byte) 5), new j13(arrayList, (byte) 6, false), new ugd(802480018, true, new fda(arrayList, function4, (byte) 0)));
                                                            break;
                                                        default:
                                                            hczVar.getClass();
                                                            ArrayList arrayList2 = odaVar3.d;
                                                            eda edaVar = eda.b;
                                                            hczVar.f(arrayList2.size(), new j13(arrayList2, (byte) 7), new j13(arrayList2, (byte) 8, false), new ugd(802480018, true, new fda(arrayList2, function4, (byte) 1)));
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar3.o0(objP);
                                        }
                                        b8k0.e(mm40VarC, xczVar, null, qw3Var, null, null, false, null, (Function1) objP, fetVar3, 12582912, 364);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    fet fetVar4 = (fet) obj8;
                                    int iIntValue4 = ((Integer) obj9).intValue();
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        mm40 mm40VarC2 = o7k0.c(new x7z(1.0f, true), 1.0f);
                                        zcl zclVar5 = qmk.f28987a;
                                        qw3 qw3Var2 = new qw3(4.0f, false, new gne(gqw0.k, (byte) 11));
                                        boolean zG2 = fetVar4.g(odaVar2) | fetVar4.g(function3);
                                        Object objP2 = fetVar4.P();
                                        if (zG2 || objP2 == cl5Var) {
                                            objP2 = new Function1() { // from class: a.ada
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj10) {
                                                    byte b8 = b6;
                                                    Function2 function4 = function3;
                                                    oda odaVar3 = odaVar2;
                                                    hcz hczVar = (hcz) obj10;
                                                    switch (b8) {
                                                        case 0:
                                                            hczVar.getClass();
                                                            ArrayList arrayList = odaVar3.c;
                                                            dda ddaVar = dda.b;
                                                            hczVar.f(arrayList.size(), new j13(arrayList, (byte) 5), new j13(arrayList, (byte) 6, false), new ugd(802480018, true, new fda(arrayList, function4, (byte) 0)));
                                                            break;
                                                        default:
                                                            hczVar.getClass();
                                                            ArrayList arrayList2 = odaVar3.d;
                                                            eda edaVar = eda.b;
                                                            hczVar.f(arrayList2.size(), new j13(arrayList2, (byte) 7), new j13(arrayList2, (byte) 8, false), new ugd(802480018, true, new fda(arrayList2, function4, (byte) 1)));
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar4.o0(objP2);
                                        }
                                        b8k0.e(mm40VarC2, xczVar, null, qw3Var2, null, null, false, null, (Function1) objP2, fetVar4, 12582912, 364);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), fetVar2, 48);
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarL = twn.l(gqw0.k, o7k0.s(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 80.0f));
                    x5d x5dVarA = w5d.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarL);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    n4c.l(jm40Var, odaVar.e, ((Boolean) fetVar2.k(kr00.f18743a)).booleanValue(), fetVar2, 0);
                    fka.a(6, fetVar2, o7k0.d(jm40Var, 1.0f));
                    fetVar2.r(true);
                    l5d0 l5d0VarA8 = zfnVar.a(w6nVar);
                    l5d0 l5d0VarA9 = zfnVar2.a(fetVar2.k(zfnVar3));
                    l5d0 l5d0VarA10 = zfnVar4.a(Boolean.TRUE);
                    l5d0 l5d0VarA11 = zfnVar5.a(gqw0.d);
                    ((g1t0) fetVar2.k(zfnVar7)).getClass();
                    l5d0[] l5d0VarArr = {l5d0VarA8, l5d0VarA9, l5d0VarA10, l5d0VarA11, zfnVar6.a(g1t0.h()), dw9.k(5, zfnVar8), zfnVar9.a(2), zfnVar10.a(null)};
                    final byte b5 = 1;
                    obc.e(l5d0VarArr, u1c.M(-1145120006, new Function2() { // from class: a.cda
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            byte b6 = b5;
                            cl5 cl5Var = ukd.f35823a;
                            final Function2 function3 = function2;
                            final oda odaVar2 = odaVar;
                            final byte b7 = 1;
                            final byte b8 = 0;
                            switch (b6) {
                                case 0:
                                    fet fetVar3 = (fet) obj8;
                                    int iIntValue3 = ((Integer) obj9).intValue();
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        mm40 mm40VarC = o7k0.c(new x7z(1.0f, true), 1.0f);
                                        zcl zclVar4 = qmk.f28987a;
                                        qw3 qw3Var = new qw3(4.0f, false, new gne(gqw0.k, (byte) 11));
                                        boolean zG = fetVar3.g(odaVar2) | fetVar3.g(function3);
                                        Object objP = fetVar3.P();
                                        if (zG || objP == cl5Var) {
                                            objP = new Function1() { // from class: a.ada
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj10) {
                                                    byte b9 = b8;
                                                    Function2 function4 = function3;
                                                    oda odaVar3 = odaVar2;
                                                    hcz hczVar = (hcz) obj10;
                                                    switch (b9) {
                                                        case 0:
                                                            hczVar.getClass();
                                                            ArrayList arrayList = odaVar3.c;
                                                            dda ddaVar = dda.b;
                                                            hczVar.f(arrayList.size(), new j13(arrayList, (byte) 5), new j13(arrayList, (byte) 6, false), new ugd(802480018, true, new fda(arrayList, function4, (byte) 0)));
                                                            break;
                                                        default:
                                                            hczVar.getClass();
                                                            ArrayList arrayList2 = odaVar3.d;
                                                            eda edaVar = eda.b;
                                                            hczVar.f(arrayList2.size(), new j13(arrayList2, (byte) 7), new j13(arrayList2, (byte) 8, false), new ugd(802480018, true, new fda(arrayList2, function4, (byte) 1)));
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar3.o0(objP);
                                        }
                                        b8k0.e(mm40VarC, xczVar2, null, qw3Var, null, null, false, null, (Function1) objP, fetVar3, 12582912, 364);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    fet fetVar4 = (fet) obj8;
                                    int iIntValue4 = ((Integer) obj9).intValue();
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        mm40 mm40VarC3 = o7k0.c(new x7z(1.0f, true), 1.0f);
                                        zcl zclVar5 = qmk.f28987a;
                                        qw3 qw3Var2 = new qw3(4.0f, false, new gne(gqw0.k, (byte) 11));
                                        boolean zG2 = fetVar4.g(odaVar2) | fetVar4.g(function3);
                                        Object objP2 = fetVar4.P();
                                        if (zG2 || objP2 == cl5Var) {
                                            objP2 = new Function1() { // from class: a.ada
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj10) {
                                                    byte b9 = b7;
                                                    Function2 function4 = function3;
                                                    oda odaVar3 = odaVar2;
                                                    hcz hczVar = (hcz) obj10;
                                                    switch (b9) {
                                                        case 0:
                                                            hczVar.getClass();
                                                            ArrayList arrayList = odaVar3.c;
                                                            dda ddaVar = dda.b;
                                                            hczVar.f(arrayList.size(), new j13(arrayList, (byte) 5), new j13(arrayList, (byte) 6, false), new ugd(802480018, true, new fda(arrayList, function4, (byte) 0)));
                                                            break;
                                                        default:
                                                            hczVar.getClass();
                                                            ArrayList arrayList2 = odaVar3.d;
                                                            eda edaVar = eda.b;
                                                            hczVar.f(arrayList2.size(), new j13(arrayList2, (byte) 7), new j13(arrayList2, (byte) 8, false), new ugd(802480018, true, new fda(arrayList2, function4, (byte) 1)));
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar4.o0(objP2);
                                        }
                                        b8k0.e(mm40VarC3, xczVar2, null, qw3Var2, null, null, false, null, (Function1) objP2, fetVar4, 12582912, 364);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), fetVar2, 48);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                vka vkaVar = (vka) obj7;
                Function2 function3 = (Function2) obj6;
                mm40 mm40Var4 = (mm40) obj;
                d9z d9zVar = (d9z) obj2;
                d9z d9zVar2 = (d9z) obj3;
                fet fetVar3 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                mm40Var4.getClass();
                d9zVar.getClass();
                d9zVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = iIntValue3 | (fetVar3.g(mm40Var4) ? 4 : 2);
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= fetVar3.g(d9zVar) ? 32 : 16;
                }
                if ((iIntValue3 & 384) == 0) {
                    i3 |= fetVar3.g(d9zVar2) ? 256 : 128;
                }
                if (fetVar3.U(i3 & 1, (i3 & 1171) != 1170)) {
                    obc.d(cn80.b.a(w6n.f), u1c.M(-1086542097, new ba00((Object) mm40Var4, (Object) vkaVar, (Object) function3, (Object) d9zVar, (Object) d9zVar2, (byte) 20), fetVar3), fetVar3, 56);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                final wka wkaVar = (wka) obj7;
                final Function2 function4 = (Function2) obj6;
                mm40 mm40Var5 = (mm40) obj;
                final d9z d9zVar3 = (d9z) obj2;
                final d9z d9zVar4 = (d9z) obj3;
                fet fetVar4 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                mm40Var5.getClass();
                d9zVar3.getClass();
                d9zVar4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i4 = (fetVar4.g(mm40Var5) ? 4 : 2) | iIntValue4;
                } else {
                    i4 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i4 |= fetVar4.g(d9zVar3) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i4 |= fetVar4.g(d9zVar4) ? 256 : 128;
                }
                if (fetVar4.U(i4 & 1, (i4 & 1171) != 1170)) {
                    mm40 mm40VarK0 = q8a.k0(mm40Var5, enx.b);
                    final Object[] objArr = null == true ? 1 : 0;
                    b34.k(mm40VarK0, q3d.j(u1c.M(-1313187027, new xdr() { // from class: a.rka
                        @Override // a.xdr
                        public final Object F(Object obj8, Object obj9, Object obj10) {
                            byte b6 = objArr;
                            final d9z d9zVar5 = d9zVar3;
                            final Function2 function5 = function4;
                            final wka wkaVar2 = wkaVar;
                            char c = 1;
                            final byte b7 = 0;
                            switch (b6) {
                                case 0:
                                    mm40 mm40Var6 = (mm40) obj8;
                                    fet fetVar5 = (fet) obj9;
                                    int iIntValue5 = ((Integer) obj10).intValue();
                                    mm40Var6.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= fetVar5.g(mm40Var6) ? 4 : 2;
                                    }
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        edp0 edp0Var = wkaVar2.b;
                                        zcl zclVar4 = qmk.f28987a;
                                        xf0.h(mm40Var6, edp0Var, new qw3(12.0f, false, new gne(gqw0.k, (byte) 11)), u1c.M(1444134725, new ydr() { // from class: a.tka
                                            @Override // a.ydr
                                            public final Object j(Object obj11, Object obj12, Object obj13, Object obj14) {
                                                byte b8 = b7;
                                                d9z d9zVar6 = d9zVar5;
                                                wka wkaVar3 = wkaVar2;
                                                switch (b8) {
                                                    case 0:
                                                        xdp0 xdp0Var = (xdp0) obj12;
                                                        fet fetVar6 = (fet) obj13;
                                                        int iIntValue6 = ((Integer) obj14).intValue();
                                                        ((y5d) obj11).getClass();
                                                        xdp0Var.getClass();
                                                        if ((iIntValue6 & 48) == 0) {
                                                            iIntValue6 |= fetVar6.g(xdp0Var) ? 32 : 16;
                                                        }
                                                        if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                                                            wpm0.c(null, xdp0Var, function5, fetVar6, iIntValue6 & 112, 1);
                                                            j47.q0(wkaVar3.f, d9zVar6, fetVar6, 0);
                                                        } else {
                                                            fetVar6.X();
                                                        }
                                                        break;
                                                    default:
                                                        xdp0 xdp0Var2 = (xdp0) obj12;
                                                        fet fetVar7 = (fet) obj13;
                                                        int iIntValue7 = ((Integer) obj14).intValue();
                                                        ((y5d) obj11).getClass();
                                                        xdp0Var2.getClass();
                                                        if ((iIntValue7 & 48) == 0) {
                                                            iIntValue7 |= fetVar7.g(xdp0Var2) ? 32 : 16;
                                                        }
                                                        if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                                                            wpm0.c(null, xdp0Var2, function5, fetVar7, iIntValue7 & 112, 1);
                                                            j47.q0(wkaVar3.g, d9zVar6, fetVar7, 0);
                                                        } else {
                                                            fetVar7.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar5), fetVar5, (iIntValue5 & 14) | 24576, 8);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var7 = (mm40) obj8;
                                    fet fetVar6 = (fet) obj9;
                                    int iIntValue6 = ((Integer) obj10).intValue();
                                    mm40Var7.getClass();
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= fetVar6.g(mm40Var7) ? 4 : 2;
                                    }
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        edp0 edp0Var2 = wkaVar2.c;
                                        zcl zclVar5 = qmk.f28987a;
                                        qw3 qw3Var = new qw3(12.0f, false, new gne(gqw0.k, (byte) 11));
                                        final char c2 = c == true ? 1 : 0;
                                        xf0.h(mm40Var7, edp0Var2, qw3Var, u1c.M(-2036777597, new ydr() { // from class: a.tka
                                            @Override // a.ydr
                                            public final Object j(Object obj11, Object obj12, Object obj13, Object obj14) {
                                                byte b8 = c2;
                                                d9z d9zVar6 = d9zVar5;
                                                wka wkaVar3 = wkaVar2;
                                                switch (b8) {
                                                    case 0:
                                                        xdp0 xdp0Var = (xdp0) obj12;
                                                        fet fetVar7 = (fet) obj13;
                                                        int iIntValue7 = ((Integer) obj14).intValue();
                                                        ((y5d) obj11).getClass();
                                                        xdp0Var.getClass();
                                                        if ((iIntValue7 & 48) == 0) {
                                                            iIntValue7 |= fetVar7.g(xdp0Var) ? 32 : 16;
                                                        }
                                                        if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                                                            wpm0.c(null, xdp0Var, function5, fetVar7, iIntValue7 & 112, 1);
                                                            j47.q0(wkaVar3.f, d9zVar6, fetVar7, 0);
                                                        } else {
                                                            fetVar7.X();
                                                        }
                                                        break;
                                                    default:
                                                        xdp0 xdp0Var2 = (xdp0) obj12;
                                                        fet fetVar8 = (fet) obj13;
                                                        int iIntValue8 = ((Integer) obj14).intValue();
                                                        ((y5d) obj11).getClass();
                                                        xdp0Var2.getClass();
                                                        if ((iIntValue8 & 48) == 0) {
                                                            iIntValue8 |= fetVar8.g(xdp0Var2) ? 32 : 16;
                                                        }
                                                        if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                                                            wpm0.c(null, xdp0Var2, function5, fetVar8, iIntValue8 & 112, 1);
                                                            j47.q0(wkaVar3.g, d9zVar6, fetVar8, 0);
                                                        } else {
                                                            fetVar8.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar6), fetVar6, (iIntValue6 & 14) | 24576, 8);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar4), u1c.M(-906159540, new sd8(wkaVar, b2), fetVar4), u1c.M(-499132053, new xdr() { // from class: a.rka
                        @Override // a.xdr
                        public final Object F(Object obj8, Object obj9, Object obj10) {
                            byte b6 = b3;
                            final d9z d9zVar5 = d9zVar4;
                            final Function2 function5 = function4;
                            final wka wkaVar2 = wkaVar;
                            char c = 1;
                            final byte b7 = 0;
                            switch (b6) {
                                case 0:
                                    mm40 mm40Var6 = (mm40) obj8;
                                    fet fetVar5 = (fet) obj9;
                                    int iIntValue5 = ((Integer) obj10).intValue();
                                    mm40Var6.getClass();
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= fetVar5.g(mm40Var6) ? 4 : 2;
                                    }
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        edp0 edp0Var = wkaVar2.b;
                                        zcl zclVar4 = qmk.f28987a;
                                        xf0.h(mm40Var6, edp0Var, new qw3(12.0f, false, new gne(gqw0.k, (byte) 11)), u1c.M(1444134725, new ydr() { // from class: a.tka
                                            @Override // a.ydr
                                            public final Object j(Object obj11, Object obj12, Object obj13, Object obj14) {
                                                byte b8 = b7;
                                                d9z d9zVar6 = d9zVar5;
                                                wka wkaVar3 = wkaVar2;
                                                switch (b8) {
                                                    case 0:
                                                        xdp0 xdp0Var = (xdp0) obj12;
                                                        fet fetVar7 = (fet) obj13;
                                                        int iIntValue7 = ((Integer) obj14).intValue();
                                                        ((y5d) obj11).getClass();
                                                        xdp0Var.getClass();
                                                        if ((iIntValue7 & 48) == 0) {
                                                            iIntValue7 |= fetVar7.g(xdp0Var) ? 32 : 16;
                                                        }
                                                        if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                                                            wpm0.c(null, xdp0Var, function5, fetVar7, iIntValue7 & 112, 1);
                                                            j47.q0(wkaVar3.f, d9zVar6, fetVar7, 0);
                                                        } else {
                                                            fetVar7.X();
                                                        }
                                                        break;
                                                    default:
                                                        xdp0 xdp0Var2 = (xdp0) obj12;
                                                        fet fetVar8 = (fet) obj13;
                                                        int iIntValue8 = ((Integer) obj14).intValue();
                                                        ((y5d) obj11).getClass();
                                                        xdp0Var2.getClass();
                                                        if ((iIntValue8 & 48) == 0) {
                                                            iIntValue8 |= fetVar8.g(xdp0Var2) ? 32 : 16;
                                                        }
                                                        if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                                                            wpm0.c(null, xdp0Var2, function5, fetVar8, iIntValue8 & 112, 1);
                                                            j47.q0(wkaVar3.g, d9zVar6, fetVar8, 0);
                                                        } else {
                                                            fetVar8.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar5), fetVar5, (iIntValue5 & 14) | 24576, 8);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var7 = (mm40) obj8;
                                    fet fetVar6 = (fet) obj9;
                                    int iIntValue6 = ((Integer) obj10).intValue();
                                    mm40Var7.getClass();
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= fetVar6.g(mm40Var7) ? 4 : 2;
                                    }
                                    if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        edp0 edp0Var2 = wkaVar2.c;
                                        zcl zclVar5 = qmk.f28987a;
                                        qw3 qw3Var = new qw3(12.0f, false, new gne(gqw0.k, (byte) 11));
                                        final byte c2 = c == true ? 1 : 0;
                                        xf0.h(mm40Var7, edp0Var2, qw3Var, u1c.M(-2036777597, new ydr() { // from class: a.tka
                                            @Override // a.ydr
                                            public final Object j(Object obj11, Object obj12, Object obj13, Object obj14) {
                                                byte b8 = c2;
                                                d9z d9zVar6 = d9zVar5;
                                                wka wkaVar3 = wkaVar2;
                                                switch (b8) {
                                                    case 0:
                                                        xdp0 xdp0Var = (xdp0) obj12;
                                                        fet fetVar7 = (fet) obj13;
                                                        int iIntValue7 = ((Integer) obj14).intValue();
                                                        ((y5d) obj11).getClass();
                                                        xdp0Var.getClass();
                                                        if ((iIntValue7 & 48) == 0) {
                                                            iIntValue7 |= fetVar7.g(xdp0Var) ? 32 : 16;
                                                        }
                                                        if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                                                            wpm0.c(null, xdp0Var, function5, fetVar7, iIntValue7 & 112, 1);
                                                            j47.q0(wkaVar3.f, d9zVar6, fetVar7, 0);
                                                        } else {
                                                            fetVar7.X();
                                                        }
                                                        break;
                                                    default:
                                                        xdp0 xdp0Var2 = (xdp0) obj12;
                                                        fet fetVar8 = (fet) obj13;
                                                        int iIntValue8 = ((Integer) obj14).intValue();
                                                        ((y5d) obj11).getClass();
                                                        xdp0Var2.getClass();
                                                        if ((iIntValue8 & 48) == 0) {
                                                            iIntValue8 |= fetVar8.g(xdp0Var2) ? 32 : 16;
                                                        }
                                                        if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                                                            wpm0.c(null, xdp0Var2, function5, fetVar8, iIntValue8 & 112, 1);
                                                            j47.q0(wkaVar3.g, d9zVar6, fetVar8, 0);
                                                        } else {
                                                            fetVar8.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar6), fetVar6, (iIntValue6 & 14) | 24576, 8);
                                    } else {
                                        fetVar6.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar4)), null, fetVar4, 4);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                w6b w6bVar = (w6b) obj7;
                Function1 function5 = (Function1) obj6;
                m3b m3bVar = (m3b) obj;
                ((Integer) obj3).getClass();
                fet fetVar5 = (fet) obj4;
                int iIntValue5 = ((Integer) obj5).intValue();
                m3bVar.getClass();
                ((a4x) obj2).getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(m3bVar) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 1027) != 1026)) {
                    d4n d4nVar = m3bVar.f21106a;
                    boolean zA = w6bVar.a();
                    int i7 = 14 & iIntValue5;
                    boolean zG = fetVar5.g(function5) | (i7 == 4);
                    Object objP = fetVar5.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new h6b(function5, m3bVar, (byte) 6);
                        fetVar5.o0(objP);
                    }
                    Function1 function6 = (Function1) objP;
                    boolean z2 = (fetVar5.g(function5) ? 1 : 0) | (i7 != 4 ? (byte) 0 : (byte) 1);
                    Object objP2 = fetVar5.P();
                    if (z2 != 0 || objP2 == cl5Var) {
                        objP2 = new h6b(function5, m3bVar, (byte) 7);
                        fetVar5.o0(objP2);
                    }
                    agc.t(null, d4nVar, zA, function6, (Function1) objP2, fetVar5, 0, 1);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                l7m0 l7m0Var2 = (l7m0) obj7;
                dnr dnrVar = (dnr) obj6;
                mm40 mm40Var6 = (mm40) obj;
                mm40 mm40Var7 = (mm40) obj2;
                Function1 function7 = (Function1) obj3;
                fet fetVar6 = (fet) obj4;
                int iIntValue6 = ((Integer) obj5).intValue();
                ddk ddkVar = dnr.c2;
                mm40Var6.getClass();
                mm40Var7.getClass();
                function7.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i5 = iIntValue6 | (fetVar6.g(mm40Var6) ? 4 : 2);
                } else {
                    i5 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i5 |= fetVar6.g(mm40Var7) ? 32 : 16;
                }
                if ((iIntValue6 & 384) == 0) {
                    i5 |= fetVar6.i(function7) ? 256 : 128;
                }
                if (fetVar6.U(i5 & 1, (i5 & 1171) != 1170)) {
                    ugd ugdVarM3 = u1c.M(-181738239, new eyn(dnrVar, mm40Var6, mm40Var7, b2), fetVar6);
                    ugd ugdVarM4 = u1c.M(518988602, new x2g((Object) dnrVar, (Object) mm40Var6, (Object) mm40Var7, (Object) function7, (byte) 20), fetVar6);
                    l7m0Var2.getClass();
                    zym0 zym0Var = (zym0) l7m0Var2.getValue();
                    if (zym0Var != null) {
                        if (zym0Var instanceof tym0) {
                            fetVar6.e0(-674323992);
                            SubGamesParams subGamesParams = ((tym0) zym0Var).f34763a;
                            ugdVarM4.F(new MarketsCategoriesParams(subGamesParams.f47014a, subGamesParams.c, subGamesParams.d, subGamesParams.e, subGamesParams.f, subGamesParams.b), fetVar6, 48);
                            fetVar6.r(false);
                        } else if (zym0Var instanceof wym0) {
                            fetVar6.e0(-674308009);
                            ugdVarM3.F(((wym0) zym0Var).f39981a, fetVar6, 48);
                            fetVar6.r(false);
                        }
                    }
                    throw b1j.f(-674327099, fetVar6, false);
                }
                fetVar6.X();
                return Unit.f46060a;
            default:
                l7m0 l7m0Var3 = (l7m0) obj7;
                final i7s i7sVar = (i7s) obj6;
                mm40 mm40Var8 = (mm40) obj;
                fet fetVar7 = (fet) obj4;
                int iIntValue7 = ((Integer) obj5).intValue();
                nek nekVar = i7s.a2;
                mm40Var8.getClass();
                ((mm40) obj2).getClass();
                ((Function1) obj3).getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(mm40Var8) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 1027) != 1026)) {
                    final Object[] objArr2 = null == true ? 1 : 0;
                    ugd ugdVarM5 = u1c.M(-90092041, new xdr() { // from class: a.f7s
                        @Override // a.xdr
                        public final Object F(Object obj8, Object obj9, Object obj10) {
                            switch (objArr2) {
                                case 0:
                                    RelatedParams relatedParams = (RelatedParams) obj8;
                                    fet fetVar8 = (fet) obj9;
                                    int iIntValue8 = ((Integer) obj10).intValue();
                                    nek nekVar2 = i7s.a2;
                                    relatedParams.getClass();
                                    if ((iIntValue8 & 6) == 0) {
                                        iIntValue8 |= fetVar8.g(relatedParams) ? 4 : 2;
                                    }
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                        zcl zclVar4 = qmk.f28987a;
                                        float f = qmk.a(fetVar8).c;
                                        i7s i7sVar2 = i7sVar;
                                        ndf0 ndf0Var = i7sVar2.P1;
                                        if (ndf0Var == null) {
                                            Intrinsics.h("relatedGamesFactory");
                                            throw null;
                                        }
                                        n0q n0qVar = o7k0.c;
                                        ndf0Var.a(s5x0.L(n0qVar, f, 0.0f, 2), n0qVar, i7sVar2, relatedParams, fetVar8);
                                    } else {
                                        fetVar8.X();
                                    }
                                    return Unit.f46060a;
                                default:
                                    MarketsCategoriesParams marketsCategoriesParams = (MarketsCategoriesParams) obj8;
                                    fet fetVar9 = (fet) obj9;
                                    int iIntValue9 = ((Integer) obj10).intValue();
                                    nek nekVar3 = i7s.a2;
                                    marketsCategoriesParams.getClass();
                                    if ((iIntValue9 & 6) == 0) {
                                        iIntValue9 |= (iIntValue9 & 8) == 0 ? fetVar9.g(marketsCategoriesParams) : fetVar9.i(marketsCategoriesParams) ? 4 : 2;
                                    }
                                    if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                                        i7s i7sVar3 = i7sVar;
                                        if (i7sVar3.Q1 == null) {
                                            Intrinsics.h("marketsCategoriesFactory");
                                            throw null;
                                        }
                                        n0q n0qVar2 = o7k0.c;
                                        Object objP3 = fetVar9.P();
                                        if (objP3 == ukd.f35823a) {
                                            objP3 = new dcr((byte) 17);
                                            fetVar9.o0(objP3);
                                        }
                                        uuz.c(n0qVar2, jm40.b, i7sVar3, marketsCategoriesParams, (Function1) objP3, fetVar9, 24630 | ((iIntValue9 << 9) & 7168));
                                    } else {
                                        fetVar9.X();
                                    }
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar7);
                    ugd ugdVarM6 = u1c.M(2031618910, new xdr() { // from class: a.f7s
                        @Override // a.xdr
                        public final Object F(Object obj8, Object obj9, Object obj10) {
                            switch (b3) {
                                case 0:
                                    RelatedParams relatedParams = (RelatedParams) obj8;
                                    fet fetVar8 = (fet) obj9;
                                    int iIntValue8 = ((Integer) obj10).intValue();
                                    nek nekVar2 = i7s.a2;
                                    relatedParams.getClass();
                                    if ((iIntValue8 & 6) == 0) {
                                        iIntValue8 |= fetVar8.g(relatedParams) ? 4 : 2;
                                    }
                                    if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                        zcl zclVar4 = qmk.f28987a;
                                        float f = qmk.a(fetVar8).c;
                                        i7s i7sVar2 = i7sVar;
                                        ndf0 ndf0Var = i7sVar2.P1;
                                        if (ndf0Var == null) {
                                            Intrinsics.h("relatedGamesFactory");
                                            throw null;
                                        }
                                        n0q n0qVar = o7k0.c;
                                        ndf0Var.a(s5x0.L(n0qVar, f, 0.0f, 2), n0qVar, i7sVar2, relatedParams, fetVar8);
                                    } else {
                                        fetVar8.X();
                                    }
                                    return Unit.f46060a;
                                default:
                                    MarketsCategoriesParams marketsCategoriesParams = (MarketsCategoriesParams) obj8;
                                    fet fetVar9 = (fet) obj9;
                                    int iIntValue9 = ((Integer) obj10).intValue();
                                    nek nekVar3 = i7s.a2;
                                    marketsCategoriesParams.getClass();
                                    if ((iIntValue9 & 6) == 0) {
                                        iIntValue9 |= (iIntValue9 & 8) == 0 ? fetVar9.g(marketsCategoriesParams) : fetVar9.i(marketsCategoriesParams) ? 4 : 2;
                                    }
                                    if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                                        i7s i7sVar3 = i7sVar;
                                        if (i7sVar3.Q1 == null) {
                                            Intrinsics.h("marketsCategoriesFactory");
                                            throw null;
                                        }
                                        n0q n0qVar2 = o7k0.c;
                                        Object objP3 = fetVar9.P();
                                        if (objP3 == ukd.f35823a) {
                                            objP3 = new dcr((byte) 17);
                                            fetVar9.o0(objP3);
                                        }
                                        uuz.c(n0qVar2, jm40.b, i7sVar3, marketsCategoriesParams, (Function1) objP3, fetVar9, 24630 | ((iIntValue9 << 9) & 7168));
                                    } else {
                                        fetVar9.X();
                                    }
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar7);
                    l7m0Var3.getClass();
                    pz40 pz40Var2 = s6t0.f31722a;
                    long backgroundContent2 = s6t0.b().f33626a.getBackgroundContent();
                    zcl zclVar4 = qmk.k;
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarE2 = h97.e(zclVar4, zclVar4, zclVar5, zclVar5, i120.Q(mm40Var8, backgroundContent2, new ugg0(zclVar4, zclVar4, zclVar5, zclVar5)));
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.n, fetVar7, 48);
                    int iHashCode4 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM4 = fetVar7.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar7, mm40VarE2);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC3, gqw0.v);
                    mm40 mm40VarE3 = o7k0.e(o7k0.s(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f), 4.0f);
                    long separator = s6t0.b().f33626a.getSeparator();
                    zcl zclVar6 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar7, i120.Q(mm40VarE3, separator, new ugg0(zclVar6, zclVar6, zclVar6, zclVar6)));
                    xym0 xym0Var = (xym0) l7m0Var3.getValue();
                    if (xym0Var != null) {
                        if (xym0Var instanceof rym0) {
                            fetVar7.e0(-1720730336);
                            ugdVarM6.F(((rym0) xym0Var).f31320a, fetVar7, 48);
                            fetVar7.r(false);
                        } else if (xym0Var instanceof uym0) {
                            fetVar7.e0(-1720727338);
                            ugdVarM5.F(((uym0) xym0Var).f36497a, fetVar7, 48);
                            fetVar7.r(false);
                        }
                        fetVar7.r(true);
                    }
                    throw b1j.f(-1720733187, fetVar7, false);
                }
                fetVar7.X();
                return Unit.f46060a;
        }
    }
}
