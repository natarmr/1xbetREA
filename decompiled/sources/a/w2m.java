package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final class w2m implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38456a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public w2m(List list, Function0 function0, l7m0 l7m0Var, Function1 function1, vne vneVar, xcz xczVar) {
        this.f38456a = (byte) 3;
        this.b = list;
        this.d = function0;
        this.e = l7m0Var;
        this.c = function1;
        this.f = vneVar;
        this.g = xczVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        fet fetVar;
        int i3;
        fet fetVar2;
        int i4;
        byte b = this.f38456a;
        cl5 cl5Var = ukd.f35823a;
        Object obj5 = this.d;
        List list = this.b;
        Object obj6 = this.f;
        Object obj7 = this.g;
        Object obj8 = this.c;
        byte b2 = 2;
        Object obj9 = this.e;
        final byte b3 = 1;
        final byte b4 = 0;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar3.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    a3m a3mVar = (a3m) list.get(iIntValue);
                    fetVar3.e0(1219307123);
                    xia0.t(a3mVar, (Function1) obj8, (Function1) obj5, (Function1) obj9, (Function1) obj6, (Function1) obj7, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ngk0 ngk0Var = (ngk0) obj7;
                ezj ezjVar = (ezj) obj5;
                ejm ejmVar = (ejm) obj8;
                g9zVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    wim wimVar = (wim) ((i4) list).get(iIntValue3);
                    fetVar4.e0(-1342192158);
                    boolean zE = fetVar4.e(wimVar.f39221a);
                    Object objP = fetVar4.P();
                    if (zE || objP == cl5Var) {
                        objP = new yan(new xg((Function2) obj6, ngk0Var, wimVar, (byte) 5), wimVar, b4);
                        fetVar4.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG = fetVar4.g(wimVar);
                    Object objP2 = fetVar4.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new ctl(ngk0Var, wimVar, (byte) 18);
                        fetVar4.o0(objP2);
                    }
                    Function1 function1 = (Function1) objP2;
                    xim ximVar = ((cjm) ejmVar).b;
                    int iOrdinal = ximVar.ordinal();
                    if (iOrdinal == 0) {
                        fetVar = fetVar4;
                        fetVar.e0(-1341676102);
                        ezjVar.getClass();
                        phu0.l(null, wimVar, ezj.a(wimVar, ximVar, fetVar), (gy40) obj9, function0, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar = fetVar4;
                        fetVar.e0(-1341191975);
                        ezjVar.getClass();
                        vbw0.o(null, wimVar, ezj.a(wimVar, ximVar, fetVar), (gy40) obj9, function0, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (iOrdinal == 2) {
                        fetVar = fetVar4;
                        fetVar.e0(-1340706887);
                        ezjVar.getClass();
                        i4w0.r(null, wimVar, ezj.a(wimVar, ximVar, fetVar), (gy40) obj9, function0, function1, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 3) {
                            throw b1j.f(-1844396308, fetVar4, false);
                        }
                        fetVar4.e0(-1340219753);
                        ezjVar.getClass();
                        epv0.l(null, wimVar, ezj.a(wimVar, ximVar, fetVar4), (gy40) obj9, function0, function1, fetVar4, 0);
                        fetVar = fetVar4;
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 2:
                Function2 function2 = (Function2) obj6;
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                Function1 function3 = (Function1) obj8;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar5.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar5.e(iIntValue5) ? 32 : 16;
                }
                int i5 = i3;
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    bja bjaVar = (bja) list.get(iIntValue5);
                    fetVar5.e0(-973274021);
                    mm40 mm40VarC = g9z.c(g9zVar3);
                    if (bjaVar instanceof rda) {
                        fetVar5.e0(245700515);
                        rda rdaVar = (rda) bjaVar;
                        function2.getClass();
                        if (rdaVar instanceof qda) {
                            fetVar5.e0(102037491);
                            final qda qdaVar = (qda) rdaVar;
                            zcl zclVar = qmk.f28987a;
                            final byte b5 = 2;
                            uc9.h(s5x0.K(mm40VarC, 8.0f, 4.0f), u1c.M(1097013439, new ydr() { // from class: a.kda
                                @Override // a.ydr
                                public final Object j(Object obj10, Object obj11, Object obj12, Object obj13) {
                                    int i6;
                                    byte b6 = b4;
                                    qda qdaVar2 = qdaVar;
                                    switch (b6) {
                                        case 0:
                                            mm40 mm40Var = (mm40) obj11;
                                            fet fetVar6 = (fet) obj12;
                                            int iD = dw9.d((Integer) obj13, (y5d) obj10, mm40Var);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar6.g(mm40Var) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD & 1, (iD & 145) != 144)) {
                                                knx.m(mm40Var, qdaVar2.f28525a, fetVar6, (iD >> 3) & 14);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                        case 1:
                                            y5d y5dVar = (y5d) obj10;
                                            mm40 mm40Var2 = (mm40) obj11;
                                            fet fetVar7 = (fet) obj12;
                                            int iD2 = dw9.d((Integer) obj13, y5dVar, mm40Var2);
                                            if ((iD2 & 6) == 0) {
                                                i6 = (fetVar7.g(y5dVar) ? 4 : 2) | iD2;
                                            } else {
                                                i6 = iD2;
                                            }
                                            if ((iD2 & 48) == 0) {
                                                i6 |= fetVar7.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                                                zcl zclVar2 = qmk.f28987a;
                                                mm40 mm40VarD = o7k0.d(y5dVar.b(s5x0.N(mm40Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13), true), 1.0f);
                                                x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar7, 48);
                                                int iHashCode = Long.hashCode(fetVar7.T);
                                                bh90 bh90VarM = fetVar7.m();
                                                mm40 mm40VarC0 = kbc.c0(fetVar7, mm40VarD);
                                                mkd.c0.getClass();
                                                fetVar7.i0();
                                                boolean z = fetVar7.S;
                                                pcy pcyVar = e7z.u1;
                                                if (z) {
                                                    fetVar7.l(pcyVar);
                                                } else {
                                                    fetVar7.r0();
                                                }
                                                shd shdVar = gqw0.x;
                                                jpm0.o(fetVar7, x5dVarA, shdVar);
                                                shd shdVar2 = gqw0.w;
                                                jpm0.o(fetVar7, bh90VarM, shdVar2);
                                                Integer numValueOf = Integer.valueOf(iHashCode);
                                                shd shdVar3 = gqw0.y;
                                                jpm0.o(fetVar7, numValueOf, shdVar3);
                                                jpm0.n(fetVar7);
                                                shd shdVar4 = gqw0.v;
                                                jpm0.o(fetVar7, mm40VarC0, shdVar4);
                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                int iHashCode2 = Long.hashCode(fetVar7.T);
                                                bh90 bh90VarM2 = fetVar7.m();
                                                jm40 jm40Var = jm40.b;
                                                mm40 mm40VarC1 = kbc.c0(fetVar7, jm40Var);
                                                fetVar7.i0();
                                                if (fetVar7.S) {
                                                    fetVar7.l(pcyVar);
                                                } else {
                                                    fetVar7.r0();
                                                }
                                                jpm0.o(fetVar7, tj30VarC, shdVar);
                                                jpm0.o(fetVar7, bh90VarM2, shdVar2);
                                                vqd.u(iHashCode2, fetVar7, shdVar3, fetVar7);
                                                jpm0.o(fetVar7, mm40VarC1, shdVar4);
                                                String str = qdaVar2.b;
                                                ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                qrq qrqVar = j1t0.c;
                                                long j = qmk.t;
                                                y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, idm0.t(22), 16646109);
                                                pz40 pz40Var = s6t0.f31722a;
                                                v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), new n05(qmk.q, j, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, y9q0Var, fetVar7, 0, 24960, 109554);
                                                fetVar7.r(true);
                                                fka.a(6, fetVar7, o7k0.d(jm40Var, 1.0f));
                                                fetVar7.r(true);
                                            } else {
                                                fetVar7.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var3 = (mm40) obj11;
                                            fet fetVar8 = (fet) obj12;
                                            int iD3 = dw9.d((Integer) obj13, (y5d) obj10, mm40Var3);
                                            if ((iD3 & 48) == 0) {
                                                iD3 |= fetVar8.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar8.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                knx.l(mm40Var3, qdaVar2.c, fetVar8, (iD3 >> 3) & 14);
                                            } else {
                                                fetVar8.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar5), u1c.M(1106784000, new ydr() { // from class: a.kda
                                @Override // a.ydr
                                public final Object j(Object obj10, Object obj11, Object obj12, Object obj13) {
                                    int i6;
                                    byte b6 = b3;
                                    qda qdaVar2 = qdaVar;
                                    switch (b6) {
                                        case 0:
                                            mm40 mm40Var = (mm40) obj11;
                                            fet fetVar6 = (fet) obj12;
                                            int iD = dw9.d((Integer) obj13, (y5d) obj10, mm40Var);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar6.g(mm40Var) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD & 1, (iD & 145) != 144)) {
                                                knx.m(mm40Var, qdaVar2.f28525a, fetVar6, (iD >> 3) & 14);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                        case 1:
                                            y5d y5dVar = (y5d) obj10;
                                            mm40 mm40Var2 = (mm40) obj11;
                                            fet fetVar7 = (fet) obj12;
                                            int iD2 = dw9.d((Integer) obj13, y5dVar, mm40Var2);
                                            if ((iD2 & 6) == 0) {
                                                i6 = (fetVar7.g(y5dVar) ? 4 : 2) | iD2;
                                            } else {
                                                i6 = iD2;
                                            }
                                            if ((iD2 & 48) == 0) {
                                                i6 |= fetVar7.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                                                zcl zclVar2 = qmk.f28987a;
                                                mm40 mm40VarD = o7k0.d(y5dVar.b(s5x0.N(mm40Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13), true), 1.0f);
                                                x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar7, 48);
                                                int iHashCode = Long.hashCode(fetVar7.T);
                                                bh90 bh90VarM = fetVar7.m();
                                                mm40 mm40VarC0 = kbc.c0(fetVar7, mm40VarD);
                                                mkd.c0.getClass();
                                                fetVar7.i0();
                                                boolean z = fetVar7.S;
                                                pcy pcyVar = e7z.u1;
                                                if (z) {
                                                    fetVar7.l(pcyVar);
                                                } else {
                                                    fetVar7.r0();
                                                }
                                                shd shdVar = gqw0.x;
                                                jpm0.o(fetVar7, x5dVarA, shdVar);
                                                shd shdVar2 = gqw0.w;
                                                jpm0.o(fetVar7, bh90VarM, shdVar2);
                                                Integer numValueOf = Integer.valueOf(iHashCode);
                                                shd shdVar3 = gqw0.y;
                                                jpm0.o(fetVar7, numValueOf, shdVar3);
                                                jpm0.n(fetVar7);
                                                shd shdVar4 = gqw0.v;
                                                jpm0.o(fetVar7, mm40VarC0, shdVar4);
                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                int iHashCode2 = Long.hashCode(fetVar7.T);
                                                bh90 bh90VarM2 = fetVar7.m();
                                                jm40 jm40Var = jm40.b;
                                                mm40 mm40VarC1 = kbc.c0(fetVar7, jm40Var);
                                                fetVar7.i0();
                                                if (fetVar7.S) {
                                                    fetVar7.l(pcyVar);
                                                } else {
                                                    fetVar7.r0();
                                                }
                                                jpm0.o(fetVar7, tj30VarC, shdVar);
                                                jpm0.o(fetVar7, bh90VarM2, shdVar2);
                                                vqd.u(iHashCode2, fetVar7, shdVar3, fetVar7);
                                                jpm0.o(fetVar7, mm40VarC1, shdVar4);
                                                String str = qdaVar2.b;
                                                ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                qrq qrqVar = j1t0.c;
                                                long j = qmk.t;
                                                y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, idm0.t(22), 16646109);
                                                pz40 pz40Var = s6t0.f31722a;
                                                v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), new n05(qmk.q, j, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, y9q0Var, fetVar7, 0, 24960, 109554);
                                                fetVar7.r(true);
                                                fka.a(6, fetVar7, o7k0.d(jm40Var, 1.0f));
                                                fetVar7.r(true);
                                            } else {
                                                fetVar7.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var3 = (mm40) obj11;
                                            fet fetVar8 = (fet) obj12;
                                            int iD3 = dw9.d((Integer) obj13, (y5d) obj10, mm40Var3);
                                            if ((iD3 & 48) == 0) {
                                                iD3 |= fetVar8.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar8.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                knx.l(mm40Var3, qdaVar2.c, fetVar8, (iD3 >> 3) & 14);
                                            } else {
                                                fetVar8.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar5), u1c.M(1116554561, new ydr() { // from class: a.kda
                                @Override // a.ydr
                                public final Object j(Object obj10, Object obj11, Object obj12, Object obj13) {
                                    int i6;
                                    byte b6 = b5;
                                    qda qdaVar2 = qdaVar;
                                    switch (b6) {
                                        case 0:
                                            mm40 mm40Var = (mm40) obj11;
                                            fet fetVar6 = (fet) obj12;
                                            int iD = dw9.d((Integer) obj13, (y5d) obj10, mm40Var);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar6.g(mm40Var) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD & 1, (iD & 145) != 144)) {
                                                knx.m(mm40Var, qdaVar2.f28525a, fetVar6, (iD >> 3) & 14);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                        case 1:
                                            y5d y5dVar = (y5d) obj10;
                                            mm40 mm40Var2 = (mm40) obj11;
                                            fet fetVar7 = (fet) obj12;
                                            int iD2 = dw9.d((Integer) obj13, y5dVar, mm40Var2);
                                            if ((iD2 & 6) == 0) {
                                                i6 = (fetVar7.g(y5dVar) ? 4 : 2) | iD2;
                                            } else {
                                                i6 = iD2;
                                            }
                                            if ((iD2 & 48) == 0) {
                                                i6 |= fetVar7.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                                                zcl zclVar2 = qmk.f28987a;
                                                mm40 mm40VarD = o7k0.d(y5dVar.b(s5x0.N(mm40Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13), true), 1.0f);
                                                x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar7, 48);
                                                int iHashCode = Long.hashCode(fetVar7.T);
                                                bh90 bh90VarM = fetVar7.m();
                                                mm40 mm40VarC0 = kbc.c0(fetVar7, mm40VarD);
                                                mkd.c0.getClass();
                                                fetVar7.i0();
                                                boolean z = fetVar7.S;
                                                pcy pcyVar = e7z.u1;
                                                if (z) {
                                                    fetVar7.l(pcyVar);
                                                } else {
                                                    fetVar7.r0();
                                                }
                                                shd shdVar = gqw0.x;
                                                jpm0.o(fetVar7, x5dVarA, shdVar);
                                                shd shdVar2 = gqw0.w;
                                                jpm0.o(fetVar7, bh90VarM, shdVar2);
                                                Integer numValueOf = Integer.valueOf(iHashCode);
                                                shd shdVar3 = gqw0.y;
                                                jpm0.o(fetVar7, numValueOf, shdVar3);
                                                jpm0.n(fetVar7);
                                                shd shdVar4 = gqw0.v;
                                                jpm0.o(fetVar7, mm40VarC0, shdVar4);
                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                int iHashCode2 = Long.hashCode(fetVar7.T);
                                                bh90 bh90VarM2 = fetVar7.m();
                                                jm40 jm40Var = jm40.b;
                                                mm40 mm40VarC1 = kbc.c0(fetVar7, jm40Var);
                                                fetVar7.i0();
                                                if (fetVar7.S) {
                                                    fetVar7.l(pcyVar);
                                                } else {
                                                    fetVar7.r0();
                                                }
                                                jpm0.o(fetVar7, tj30VarC, shdVar);
                                                jpm0.o(fetVar7, bh90VarM2, shdVar2);
                                                vqd.u(iHashCode2, fetVar7, shdVar3, fetVar7);
                                                jpm0.o(fetVar7, mm40VarC1, shdVar4);
                                                String str = qdaVar2.b;
                                                ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                qrq qrqVar = j1t0.c;
                                                long j = qmk.t;
                                                y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, idm0.t(22), 16646109);
                                                pz40 pz40Var = s6t0.f31722a;
                                                v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), new n05(qmk.q, j, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, y9q0Var, fetVar7, 0, 24960, 109554);
                                                fetVar7.r(true);
                                                fka.a(6, fetVar7, o7k0.d(jm40Var, 1.0f));
                                                fetVar7.r(true);
                                            } else {
                                                fetVar7.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var3 = (mm40) obj11;
                                            fet fetVar8 = (fet) obj12;
                                            int iD3 = dw9.d((Integer) obj13, (y5d) obj10, mm40Var3);
                                            if ((iD3 & 48) == 0) {
                                                iD3 |= fetVar8.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar8.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                knx.l(mm40Var3, qdaVar2.c, fetVar8, (iD3 >> 3) & 14);
                                            } else {
                                                fetVar8.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar5), fetVar5, 28032, 2);
                            fetVar2 = fetVar5;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar5;
                            if (rdaVar instanceof oda) {
                                fetVar2.e0(102041827);
                                xia0.m(mm40VarC, (oda) rdaVar, function2, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (rdaVar instanceof pda) {
                                fetVar2.e0(102047717);
                                o050.h(mm40VarC, (pda) rdaVar, function2, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (rdaVar instanceof nda) {
                                fetVar2.e0(102053541);
                                i120.l(mm40VarC, (nda) rdaVar, function2, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (rdaVar.equals(mda.f21586a)) {
                                fetVar2.e0(102059523);
                                knx.K(0, fetVar2, mm40VarC);
                                fetVar2.r(false);
                            } else {
                                if (!(rdaVar instanceof lda)) {
                                    throw b1j.f(102036419, fetVar2, false);
                                }
                                fetVar2.e0(102062546);
                                j47.P(mm40VarC, (lda) rdaVar, fetVar2, 0);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar5;
                        if (bjaVar instanceof bla) {
                            fetVar2.e0(245707509);
                            final bla blaVar = (bla) bjaVar;
                            uc9.h(mm40VarC, null, u1c.M(-1556452452, new ydr() { // from class: a.yka
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // a.ydr
                                public final Object j(Object obj10, Object obj11, Object obj12, Object obj13) {
                                    int i6;
                                    byte b6 = b4;
                                    final bla blaVar2 = blaVar;
                                    final byte b7 = 1;
                                    Object[] objArr = 0;
                                    y5d y5dVar = (y5d) obj10;
                                    switch (b6) {
                                        case 0:
                                            mm40 mm40Var = (mm40) obj11;
                                            fet fetVar6 = (fet) obj12;
                                            int iD = dw9.d((Integer) obj13, y5dVar, mm40Var);
                                            if ((iD & 6) == 0) {
                                                i6 = (fetVar6.g(y5dVar) ? 4 : 2) | iD;
                                            } else {
                                                i6 = iD;
                                            }
                                            if ((iD & 48) == 0) {
                                                i6 |= fetVar6.g(mm40Var) ? 32 : 16;
                                            }
                                            if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                                                zcl zclVar2 = qmk.f28987a;
                                                mm40 mm40VarB = y5dVar.b(o7k0.d(s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), true);
                                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                                cy2.e(3456, u1c.M(153597823, new xdr() { // from class: a.zka
                                                    @Override // a.xdr
                                                    public final Object F(Object obj14, Object obj15, Object obj16) {
                                                        ugd ugdVar;
                                                        ugd ugdVar2;
                                                        byte b8 = objArr2;
                                                        bla blaVar3 = blaVar2;
                                                        switch (b8) {
                                                            case 0:
                                                                mm40 mm40Var2 = (mm40) obj14;
                                                                fet fetVar7 = (fet) obj15;
                                                                int iIntValue7 = ((Integer) obj16).intValue();
                                                                mm40Var2.getClass();
                                                                if ((iIntValue7 & 6) == 0) {
                                                                    iIntValue7 |= fetVar7.g(mm40Var2) ? 4 : 2;
                                                                }
                                                                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                                                    l5d0 l5d0VarA = cn80.b.a(w6n.h);
                                                                    l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.d);
                                                                    l5d0 l5d0VarK = dw9.k(5, egp0.b);
                                                                    l5d0 l5d0VarA3 = cn80.f4642a.a(fetVar7.k(bmd.n));
                                                                    l5d0 l5d0VarA4 = kcp0.f18071a.a(null);
                                                                    l5d0 l5d0VarA5 = kcp0.c.a(Boolean.TRUE);
                                                                    zfn zfnVar = egp0.c;
                                                                    ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                                    obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarK, l5d0VarA3, l5d0VarA4, l5d0VarA5, zfnVar.a(g1t0.g())}, u1c.M(599456447, new kea(mm40Var2, blaVar3, (byte) 3), fetVar7), fetVar7, 48);
                                                                } else {
                                                                    fetVar7.X();
                                                                }
                                                                return Unit.f46060a;
                                                            default:
                                                                mm40 mm40Var3 = (mm40) obj14;
                                                                fet fetVar8 = (fet) obj15;
                                                                int iIntValue8 = ((Integer) obj16).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue8 & 6) == 0) {
                                                                    iIntValue8 |= fetVar8.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                                                    t5h0 t5h0Var = blaVar3.d;
                                                                    boolean z = t5h0Var instanceof r5h0;
                                                                    jm40 jm40Var = jm40.b;
                                                                    cl5 cl5Var2 = ukd.f35823a;
                                                                    if (z) {
                                                                        fetVar8.e0(529252137);
                                                                        zcl zclVar3 = qmk.f28987a;
                                                                        mm40 mm40VarN = s5x0.N(mm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                                                        r5h0 r5h0Var = (r5h0) t5h0Var;
                                                                        Object objP3 = fetVar8.P();
                                                                        if (objP3 == cl5Var2) {
                                                                            objP3 = o7k0.s(jm40Var, 24.0f);
                                                                            fetVar8.o0(objP3);
                                                                        }
                                                                        mm40 mm40Var4 = (mm40) objP3;
                                                                        Object objP4 = fetVar8.P();
                                                                        if (objP4 == cl5Var2) {
                                                                            objP4 = o7k0.s(jm40Var, 32.0f);
                                                                            fetVar8.o0(objP4);
                                                                        }
                                                                        mm40 mm40Var5 = (mm40) objP4;
                                                                        pz40 pz40VarF = androidx.compose.runtime.e.f(r5h0Var.b, fetVar8);
                                                                        w0s w0sVar = r5h0Var.d;
                                                                        if (w0sVar == null) {
                                                                            fetVar8.e0(-1365312353);
                                                                            fetVar8.r(false);
                                                                            ugdVar = null;
                                                                        } else {
                                                                            fetVar8.e0(-1365312352);
                                                                            ugd ugdVarM = u1c.M(-1346073967, new hqd(mm40Var5, w0sVar, (byte) 2), fetVar8);
                                                                            fetVar8.r(false);
                                                                            ugdVar = ugdVarM;
                                                                        }
                                                                        koa0 koa0Var = r5h0Var.e;
                                                                        if (koa0Var == null) {
                                                                            fetVar8.e0(-1364500804);
                                                                            fetVar8.r(false);
                                                                            ugdVar2 = null;
                                                                        } else {
                                                                            fetVar8.e0(-1364500803);
                                                                            ugd ugdVarM2 = u1c.M(-3564958, new iqd(mm40Var5, koa0Var, (byte) 2), fetVar8);
                                                                            fetVar8.r(false);
                                                                            ugdVar2 = ugdVarM2;
                                                                        }
                                                                        xww.p(mm40VarN, false, ugdVar, ugdVar2, u1c.M(-672921053, new jqd(r5h0Var, (byte) 1), fetVar8), u1c.M(-2072229559, new ypd((byte) 3, mm40Var4, pz40VarF), fetVar8), u1c.M(-746505631, new kqd(mm40Var5, r5h0Var, (byte) 2), fetVar8), fetVar8, 1794048);
                                                                        fetVar8.r(false);
                                                                    } else {
                                                                        if (!(t5h0Var instanceof q5h0)) {
                                                                            throw b1j.f(529249590, fetVar8, false);
                                                                        }
                                                                        fetVar8.e0(529259302);
                                                                        zcl zclVar4 = qmk.f28987a;
                                                                        mm40 mm40VarN2 = s5x0.N(mm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                                                        q5h0 q5h0Var = (q5h0) t5h0Var;
                                                                        Object objP5 = fetVar8.P();
                                                                        if (objP5 == cl5Var2) {
                                                                            objP5 = o7k0.s(jm40Var, 24.0f);
                                                                            fetVar8.o0(objP5);
                                                                        }
                                                                        mm40 mm40Var6 = (mm40) objP5;
                                                                        Object objP6 = fetVar8.P();
                                                                        if (objP6 == cl5Var2) {
                                                                            objP6 = o7k0.s(jm40Var, 32.0f);
                                                                            fetVar8.o0(objP6);
                                                                        }
                                                                        sac.v(3456, u1c.M(375875630, new ypd((byte) 2, mm40Var6, androidx.compose.runtime.e.f(q5h0Var.f28152a, fetVar8)), fetVar8), u1c.M(-1455735482, new zpd((mm40) objP6, q5h0Var, (byte) 2), fetVar8), fetVar8, mm40VarN2, false);
                                                                        fetVar8.r(false);
                                                                    }
                                                                } else {
                                                                    fetVar8.X();
                                                                }
                                                                return Unit.f46060a;
                                                        }
                                                    }
                                                }, fetVar6), u1c.M(1354739166, new xdr() { // from class: a.zka
                                                    @Override // a.xdr
                                                    public final Object F(Object obj14, Object obj15, Object obj16) {
                                                        ugd ugdVar;
                                                        ugd ugdVar2;
                                                        byte b8 = b7;
                                                        bla blaVar3 = blaVar2;
                                                        switch (b8) {
                                                            case 0:
                                                                mm40 mm40Var2 = (mm40) obj14;
                                                                fet fetVar7 = (fet) obj15;
                                                                int iIntValue7 = ((Integer) obj16).intValue();
                                                                mm40Var2.getClass();
                                                                if ((iIntValue7 & 6) == 0) {
                                                                    iIntValue7 |= fetVar7.g(mm40Var2) ? 4 : 2;
                                                                }
                                                                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                                                    l5d0 l5d0VarA = cn80.b.a(w6n.h);
                                                                    l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.d);
                                                                    l5d0 l5d0VarK = dw9.k(5, egp0.b);
                                                                    l5d0 l5d0VarA3 = cn80.f4642a.a(fetVar7.k(bmd.n));
                                                                    l5d0 l5d0VarA4 = kcp0.f18071a.a(null);
                                                                    l5d0 l5d0VarA5 = kcp0.c.a(Boolean.TRUE);
                                                                    zfn zfnVar = egp0.c;
                                                                    ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                                    obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarK, l5d0VarA3, l5d0VarA4, l5d0VarA5, zfnVar.a(g1t0.g())}, u1c.M(599456447, new kea(mm40Var2, blaVar3, (byte) 3), fetVar7), fetVar7, 48);
                                                                } else {
                                                                    fetVar7.X();
                                                                }
                                                                return Unit.f46060a;
                                                            default:
                                                                mm40 mm40Var3 = (mm40) obj14;
                                                                fet fetVar8 = (fet) obj15;
                                                                int iIntValue8 = ((Integer) obj16).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue8 & 6) == 0) {
                                                                    iIntValue8 |= fetVar8.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                                                    t5h0 t5h0Var = blaVar3.d;
                                                                    boolean z = t5h0Var instanceof r5h0;
                                                                    jm40 jm40Var = jm40.b;
                                                                    cl5 cl5Var2 = ukd.f35823a;
                                                                    if (z) {
                                                                        fetVar8.e0(529252137);
                                                                        zcl zclVar3 = qmk.f28987a;
                                                                        mm40 mm40VarN = s5x0.N(mm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                                                        r5h0 r5h0Var = (r5h0) t5h0Var;
                                                                        Object objP3 = fetVar8.P();
                                                                        if (objP3 == cl5Var2) {
                                                                            objP3 = o7k0.s(jm40Var, 24.0f);
                                                                            fetVar8.o0(objP3);
                                                                        }
                                                                        mm40 mm40Var4 = (mm40) objP3;
                                                                        Object objP4 = fetVar8.P();
                                                                        if (objP4 == cl5Var2) {
                                                                            objP4 = o7k0.s(jm40Var, 32.0f);
                                                                            fetVar8.o0(objP4);
                                                                        }
                                                                        mm40 mm40Var5 = (mm40) objP4;
                                                                        pz40 pz40VarF = androidx.compose.runtime.e.f(r5h0Var.b, fetVar8);
                                                                        w0s w0sVar = r5h0Var.d;
                                                                        if (w0sVar == null) {
                                                                            fetVar8.e0(-1365312353);
                                                                            fetVar8.r(false);
                                                                            ugdVar = null;
                                                                        } else {
                                                                            fetVar8.e0(-1365312352);
                                                                            ugd ugdVarM = u1c.M(-1346073967, new hqd(mm40Var5, w0sVar, (byte) 2), fetVar8);
                                                                            fetVar8.r(false);
                                                                            ugdVar = ugdVarM;
                                                                        }
                                                                        koa0 koa0Var = r5h0Var.e;
                                                                        if (koa0Var == null) {
                                                                            fetVar8.e0(-1364500804);
                                                                            fetVar8.r(false);
                                                                            ugdVar2 = null;
                                                                        } else {
                                                                            fetVar8.e0(-1364500803);
                                                                            ugd ugdVarM2 = u1c.M(-3564958, new iqd(mm40Var5, koa0Var, (byte) 2), fetVar8);
                                                                            fetVar8.r(false);
                                                                            ugdVar2 = ugdVarM2;
                                                                        }
                                                                        xww.p(mm40VarN, false, ugdVar, ugdVar2, u1c.M(-672921053, new jqd(r5h0Var, (byte) 1), fetVar8), u1c.M(-2072229559, new ypd((byte) 3, mm40Var4, pz40VarF), fetVar8), u1c.M(-746505631, new kqd(mm40Var5, r5h0Var, (byte) 2), fetVar8), fetVar8, 1794048);
                                                                        fetVar8.r(false);
                                                                    } else {
                                                                        if (!(t5h0Var instanceof q5h0)) {
                                                                            throw b1j.f(529249590, fetVar8, false);
                                                                        }
                                                                        fetVar8.e0(529259302);
                                                                        zcl zclVar4 = qmk.f28987a;
                                                                        mm40 mm40VarN2 = s5x0.N(mm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                                                        q5h0 q5h0Var = (q5h0) t5h0Var;
                                                                        Object objP5 = fetVar8.P();
                                                                        if (objP5 == cl5Var2) {
                                                                            objP5 = o7k0.s(jm40Var, 24.0f);
                                                                            fetVar8.o0(objP5);
                                                                        }
                                                                        mm40 mm40Var6 = (mm40) objP5;
                                                                        Object objP6 = fetVar8.P();
                                                                        if (objP6 == cl5Var2) {
                                                                            objP6 = o7k0.s(jm40Var, 32.0f);
                                                                            fetVar8.o0(objP6);
                                                                        }
                                                                        sac.v(3456, u1c.M(375875630, new ypd((byte) 2, mm40Var6, androidx.compose.runtime.e.f(q5h0Var.f28152a, fetVar8)), fetVar8), u1c.M(-1455735482, new zpd((mm40) objP6, q5h0Var, (byte) 2), fetVar8), fetVar8, mm40VarN2, false);
                                                                        fetVar8.r(false);
                                                                    }
                                                                } else {
                                                                    fetVar8.X();
                                                                }
                                                                return Unit.f46060a;
                                                        }
                                                    }
                                                }, fetVar6), fetVar6, mm40VarB, false);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var2 = (mm40) obj11;
                                            fet fetVar7 = (fet) obj12;
                                            int iD2 = dw9.d((Integer) obj13, y5dVar, mm40Var2);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar7.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar7.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                unh0.i(mm40Var2, blaVar2.f2785a, fetVar7);
                                            } else {
                                                fetVar7.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar2), u1c.M(1701398267, new ydr() { // from class: a.yka
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // a.ydr
                                public final Object j(Object obj10, Object obj11, Object obj12, Object obj13) {
                                    int i6;
                                    byte b6 = b3;
                                    final bla blaVar2 = blaVar;
                                    final byte b7 = 1;
                                    Object[] objArr = 0;
                                    y5d y5dVar = (y5d) obj10;
                                    switch (b6) {
                                        case 0:
                                            mm40 mm40Var = (mm40) obj11;
                                            fet fetVar6 = (fet) obj12;
                                            int iD = dw9.d((Integer) obj13, y5dVar, mm40Var);
                                            if ((iD & 6) == 0) {
                                                i6 = (fetVar6.g(y5dVar) ? 4 : 2) | iD;
                                            } else {
                                                i6 = iD;
                                            }
                                            if ((iD & 48) == 0) {
                                                i6 |= fetVar6.g(mm40Var) ? 32 : 16;
                                            }
                                            if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                                                zcl zclVar2 = qmk.f28987a;
                                                mm40 mm40VarB = y5dVar.b(o7k0.d(s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), true);
                                                final byte objArr2 = objArr == true ? 1 : 0;
                                                cy2.e(3456, u1c.M(153597823, new xdr() { // from class: a.zka
                                                    @Override // a.xdr
                                                    public final Object F(Object obj14, Object obj15, Object obj16) {
                                                        ugd ugdVar;
                                                        ugd ugdVar2;
                                                        byte b8 = objArr2;
                                                        bla blaVar3 = blaVar2;
                                                        switch (b8) {
                                                            case 0:
                                                                mm40 mm40Var2 = (mm40) obj14;
                                                                fet fetVar7 = (fet) obj15;
                                                                int iIntValue7 = ((Integer) obj16).intValue();
                                                                mm40Var2.getClass();
                                                                if ((iIntValue7 & 6) == 0) {
                                                                    iIntValue7 |= fetVar7.g(mm40Var2) ? 4 : 2;
                                                                }
                                                                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                                                    l5d0 l5d0VarA = cn80.b.a(w6n.h);
                                                                    l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.d);
                                                                    l5d0 l5d0VarK = dw9.k(5, egp0.b);
                                                                    l5d0 l5d0VarA3 = cn80.f4642a.a(fetVar7.k(bmd.n));
                                                                    l5d0 l5d0VarA4 = kcp0.f18071a.a(null);
                                                                    l5d0 l5d0VarA5 = kcp0.c.a(Boolean.TRUE);
                                                                    zfn zfnVar = egp0.c;
                                                                    ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                                    obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarK, l5d0VarA3, l5d0VarA4, l5d0VarA5, zfnVar.a(g1t0.g())}, u1c.M(599456447, new kea(mm40Var2, blaVar3, (byte) 3), fetVar7), fetVar7, 48);
                                                                } else {
                                                                    fetVar7.X();
                                                                }
                                                                return Unit.f46060a;
                                                            default:
                                                                mm40 mm40Var3 = (mm40) obj14;
                                                                fet fetVar8 = (fet) obj15;
                                                                int iIntValue8 = ((Integer) obj16).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue8 & 6) == 0) {
                                                                    iIntValue8 |= fetVar8.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                                                    t5h0 t5h0Var = blaVar3.d;
                                                                    boolean z = t5h0Var instanceof r5h0;
                                                                    jm40 jm40Var = jm40.b;
                                                                    cl5 cl5Var2 = ukd.f35823a;
                                                                    if (z) {
                                                                        fetVar8.e0(529252137);
                                                                        zcl zclVar3 = qmk.f28987a;
                                                                        mm40 mm40VarN = s5x0.N(mm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                                                        r5h0 r5h0Var = (r5h0) t5h0Var;
                                                                        Object objP3 = fetVar8.P();
                                                                        if (objP3 == cl5Var2) {
                                                                            objP3 = o7k0.s(jm40Var, 24.0f);
                                                                            fetVar8.o0(objP3);
                                                                        }
                                                                        mm40 mm40Var4 = (mm40) objP3;
                                                                        Object objP4 = fetVar8.P();
                                                                        if (objP4 == cl5Var2) {
                                                                            objP4 = o7k0.s(jm40Var, 32.0f);
                                                                            fetVar8.o0(objP4);
                                                                        }
                                                                        mm40 mm40Var5 = (mm40) objP4;
                                                                        pz40 pz40VarF = androidx.compose.runtime.e.f(r5h0Var.b, fetVar8);
                                                                        w0s w0sVar = r5h0Var.d;
                                                                        if (w0sVar == null) {
                                                                            fetVar8.e0(-1365312353);
                                                                            fetVar8.r(false);
                                                                            ugdVar = null;
                                                                        } else {
                                                                            fetVar8.e0(-1365312352);
                                                                            ugd ugdVarM = u1c.M(-1346073967, new hqd(mm40Var5, w0sVar, (byte) 2), fetVar8);
                                                                            fetVar8.r(false);
                                                                            ugdVar = ugdVarM;
                                                                        }
                                                                        koa0 koa0Var = r5h0Var.e;
                                                                        if (koa0Var == null) {
                                                                            fetVar8.e0(-1364500804);
                                                                            fetVar8.r(false);
                                                                            ugdVar2 = null;
                                                                        } else {
                                                                            fetVar8.e0(-1364500803);
                                                                            ugd ugdVarM2 = u1c.M(-3564958, new iqd(mm40Var5, koa0Var, (byte) 2), fetVar8);
                                                                            fetVar8.r(false);
                                                                            ugdVar2 = ugdVarM2;
                                                                        }
                                                                        xww.p(mm40VarN, false, ugdVar, ugdVar2, u1c.M(-672921053, new jqd(r5h0Var, (byte) 1), fetVar8), u1c.M(-2072229559, new ypd((byte) 3, mm40Var4, pz40VarF), fetVar8), u1c.M(-746505631, new kqd(mm40Var5, r5h0Var, (byte) 2), fetVar8), fetVar8, 1794048);
                                                                        fetVar8.r(false);
                                                                    } else {
                                                                        if (!(t5h0Var instanceof q5h0)) {
                                                                            throw b1j.f(529249590, fetVar8, false);
                                                                        }
                                                                        fetVar8.e0(529259302);
                                                                        zcl zclVar4 = qmk.f28987a;
                                                                        mm40 mm40VarN2 = s5x0.N(mm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                                                        q5h0 q5h0Var = (q5h0) t5h0Var;
                                                                        Object objP5 = fetVar8.P();
                                                                        if (objP5 == cl5Var2) {
                                                                            objP5 = o7k0.s(jm40Var, 24.0f);
                                                                            fetVar8.o0(objP5);
                                                                        }
                                                                        mm40 mm40Var6 = (mm40) objP5;
                                                                        Object objP6 = fetVar8.P();
                                                                        if (objP6 == cl5Var2) {
                                                                            objP6 = o7k0.s(jm40Var, 32.0f);
                                                                            fetVar8.o0(objP6);
                                                                        }
                                                                        sac.v(3456, u1c.M(375875630, new ypd((byte) 2, mm40Var6, androidx.compose.runtime.e.f(q5h0Var.f28152a, fetVar8)), fetVar8), u1c.M(-1455735482, new zpd((mm40) objP6, q5h0Var, (byte) 2), fetVar8), fetVar8, mm40VarN2, false);
                                                                        fetVar8.r(false);
                                                                    }
                                                                } else {
                                                                    fetVar8.X();
                                                                }
                                                                return Unit.f46060a;
                                                        }
                                                    }
                                                }, fetVar6), u1c.M(1354739166, new xdr() { // from class: a.zka
                                                    @Override // a.xdr
                                                    public final Object F(Object obj14, Object obj15, Object obj16) {
                                                        ugd ugdVar;
                                                        ugd ugdVar2;
                                                        byte b8 = b7;
                                                        bla blaVar3 = blaVar2;
                                                        switch (b8) {
                                                            case 0:
                                                                mm40 mm40Var2 = (mm40) obj14;
                                                                fet fetVar7 = (fet) obj15;
                                                                int iIntValue7 = ((Integer) obj16).intValue();
                                                                mm40Var2.getClass();
                                                                if ((iIntValue7 & 6) == 0) {
                                                                    iIntValue7 |= fetVar7.g(mm40Var2) ? 4 : 2;
                                                                }
                                                                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                                                    l5d0 l5d0VarA = cn80.b.a(w6n.h);
                                                                    l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.d);
                                                                    l5d0 l5d0VarK = dw9.k(5, egp0.b);
                                                                    l5d0 l5d0VarA3 = cn80.f4642a.a(fetVar7.k(bmd.n));
                                                                    l5d0 l5d0VarA4 = kcp0.f18071a.a(null);
                                                                    l5d0 l5d0VarA5 = kcp0.c.a(Boolean.TRUE);
                                                                    zfn zfnVar = egp0.c;
                                                                    ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                                    obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarK, l5d0VarA3, l5d0VarA4, l5d0VarA5, zfnVar.a(g1t0.g())}, u1c.M(599456447, new kea(mm40Var2, blaVar3, (byte) 3), fetVar7), fetVar7, 48);
                                                                } else {
                                                                    fetVar7.X();
                                                                }
                                                                return Unit.f46060a;
                                                            default:
                                                                mm40 mm40Var3 = (mm40) obj14;
                                                                fet fetVar8 = (fet) obj15;
                                                                int iIntValue8 = ((Integer) obj16).intValue();
                                                                mm40Var3.getClass();
                                                                if ((iIntValue8 & 6) == 0) {
                                                                    iIntValue8 |= fetVar8.g(mm40Var3) ? 4 : 2;
                                                                }
                                                                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                                                                    t5h0 t5h0Var = blaVar3.d;
                                                                    boolean z = t5h0Var instanceof r5h0;
                                                                    jm40 jm40Var = jm40.b;
                                                                    cl5 cl5Var2 = ukd.f35823a;
                                                                    if (z) {
                                                                        fetVar8.e0(529252137);
                                                                        zcl zclVar3 = qmk.f28987a;
                                                                        mm40 mm40VarN = s5x0.N(mm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                                                        r5h0 r5h0Var = (r5h0) t5h0Var;
                                                                        Object objP3 = fetVar8.P();
                                                                        if (objP3 == cl5Var2) {
                                                                            objP3 = o7k0.s(jm40Var, 24.0f);
                                                                            fetVar8.o0(objP3);
                                                                        }
                                                                        mm40 mm40Var4 = (mm40) objP3;
                                                                        Object objP4 = fetVar8.P();
                                                                        if (objP4 == cl5Var2) {
                                                                            objP4 = o7k0.s(jm40Var, 32.0f);
                                                                            fetVar8.o0(objP4);
                                                                        }
                                                                        mm40 mm40Var5 = (mm40) objP4;
                                                                        pz40 pz40VarF = androidx.compose.runtime.e.f(r5h0Var.b, fetVar8);
                                                                        w0s w0sVar = r5h0Var.d;
                                                                        if (w0sVar == null) {
                                                                            fetVar8.e0(-1365312353);
                                                                            fetVar8.r(false);
                                                                            ugdVar = null;
                                                                        } else {
                                                                            fetVar8.e0(-1365312352);
                                                                            ugd ugdVarM = u1c.M(-1346073967, new hqd(mm40Var5, w0sVar, (byte) 2), fetVar8);
                                                                            fetVar8.r(false);
                                                                            ugdVar = ugdVarM;
                                                                        }
                                                                        koa0 koa0Var = r5h0Var.e;
                                                                        if (koa0Var == null) {
                                                                            fetVar8.e0(-1364500804);
                                                                            fetVar8.r(false);
                                                                            ugdVar2 = null;
                                                                        } else {
                                                                            fetVar8.e0(-1364500803);
                                                                            ugd ugdVarM2 = u1c.M(-3564958, new iqd(mm40Var5, koa0Var, (byte) 2), fetVar8);
                                                                            fetVar8.r(false);
                                                                            ugdVar2 = ugdVarM2;
                                                                        }
                                                                        xww.p(mm40VarN, false, ugdVar, ugdVar2, u1c.M(-672921053, new jqd(r5h0Var, (byte) 1), fetVar8), u1c.M(-2072229559, new ypd((byte) 3, mm40Var4, pz40VarF), fetVar8), u1c.M(-746505631, new kqd(mm40Var5, r5h0Var, (byte) 2), fetVar8), fetVar8, 1794048);
                                                                        fetVar8.r(false);
                                                                    } else {
                                                                        if (!(t5h0Var instanceof q5h0)) {
                                                                            throw b1j.f(529249590, fetVar8, false);
                                                                        }
                                                                        fetVar8.e0(529259302);
                                                                        zcl zclVar4 = qmk.f28987a;
                                                                        mm40 mm40VarN2 = s5x0.N(mm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                                                        q5h0 q5h0Var = (q5h0) t5h0Var;
                                                                        Object objP5 = fetVar8.P();
                                                                        if (objP5 == cl5Var2) {
                                                                            objP5 = o7k0.s(jm40Var, 24.0f);
                                                                            fetVar8.o0(objP5);
                                                                        }
                                                                        mm40 mm40Var6 = (mm40) objP5;
                                                                        Object objP6 = fetVar8.P();
                                                                        if (objP6 == cl5Var2) {
                                                                            objP6 = o7k0.s(jm40Var, 32.0f);
                                                                            fetVar8.o0(objP6);
                                                                        }
                                                                        sac.v(3456, u1c.M(375875630, new ypd((byte) 2, mm40Var6, androidx.compose.runtime.e.f(q5h0Var.f28152a, fetVar8)), fetVar8), u1c.M(-1455735482, new zpd((mm40) objP6, q5h0Var, (byte) 2), fetVar8), fetVar8, mm40VarN2, false);
                                                                        fetVar8.r(false);
                                                                    }
                                                                } else {
                                                                    fetVar8.X();
                                                                }
                                                                return Unit.f46060a;
                                                        }
                                                    }
                                                }, fetVar6), fetVar6, mm40VarB, false);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var2 = (mm40) obj11;
                                            fet fetVar7 = (fet) obj12;
                                            int iD2 = dw9.d((Integer) obj13, y5dVar, mm40Var2);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar7.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar7.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                unh0.i(mm40Var2, blaVar2.f2785a, fetVar7);
                                            } else {
                                                fetVar7.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar2), fetVar2, 27648, 6);
                            fetVar2.r(false);
                        } else if (bjaVar instanceof ria) {
                            fetVar2.e0(245711177);
                            ria riaVar = (ria) bjaVar;
                            function3.getClass();
                            pz40 pz40VarF = androidx.compose.runtime.e.f(riaVar.f30531a, fetVar2);
                            pz40 pz40VarF2 = androidx.compose.runtime.e.f(riaVar.b, fetVar2);
                            zcl zclVar2 = qmk.f28987a;
                            uc9.h(s5x0.N(mm40VarC, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, u1c.M(1885559182, new tia(function3, pz40VarF, pz40VarF2, b4), fetVar2), u1c.M(-119931697, new awh(riaVar, (byte) 6), fetVar2), fetVar2, 27648, 6);
                            fetVar2.r(false);
                        } else if (bjaVar instanceof xoa) {
                            fetVar2.e0(245718192);
                            final xoa xoaVar = (xoa) bjaVar;
                            uc9.h(mm40VarC, null, u1c.M(-36407312, new ydr() { // from class: a.toa
                                @Override // a.ydr
                                public final Object j(Object obj10, Object obj11, Object obj12, Object obj13) {
                                    int i6;
                                    byte b6 = b4;
                                    xoa xoaVar2 = xoaVar;
                                    y5d y5dVar = (y5d) obj10;
                                    switch (b6) {
                                        case 0:
                                            mm40 mm40Var = (mm40) obj11;
                                            fet fetVar6 = (fet) obj12;
                                            int iD = dw9.d((Integer) obj13, y5dVar, mm40Var);
                                            if ((iD & 6) == 0) {
                                                i6 = (fetVar6.g(y5dVar) ? 4 : 2) | iD;
                                            } else {
                                                i6 = iD;
                                            }
                                            if ((iD & 48) == 0) {
                                                i6 |= fetVar6.g(mm40Var) ? 32 : 16;
                                            }
                                            if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                                                zcl zclVar3 = qmk.f28987a;
                                                wpm0.h(y5dVar.b(s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), true), xoaVar2.f41206a, fetVar6, 0);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var2 = (mm40) obj11;
                                            fet fetVar7 = (fet) obj12;
                                            int iD2 = dw9.d((Integer) obj13, y5dVar, mm40Var2);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar7.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar7.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                unh0.i(mm40Var2, xoaVar2.b, fetVar7);
                                            } else {
                                                fetVar7.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar2), u1c.M(-720637617, new ydr() { // from class: a.toa
                                @Override // a.ydr
                                public final Object j(Object obj10, Object obj11, Object obj12, Object obj13) {
                                    int i6;
                                    byte b6 = b3;
                                    xoa xoaVar2 = xoaVar;
                                    y5d y5dVar = (y5d) obj10;
                                    switch (b6) {
                                        case 0:
                                            mm40 mm40Var = (mm40) obj11;
                                            fet fetVar6 = (fet) obj12;
                                            int iD = dw9.d((Integer) obj13, y5dVar, mm40Var);
                                            if ((iD & 6) == 0) {
                                                i6 = (fetVar6.g(y5dVar) ? 4 : 2) | iD;
                                            } else {
                                                i6 = iD;
                                            }
                                            if ((iD & 48) == 0) {
                                                i6 |= fetVar6.g(mm40Var) ? 32 : 16;
                                            }
                                            if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                                                zcl zclVar3 = qmk.f28987a;
                                                wpm0.h(y5dVar.b(s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), true), xoaVar2.f41206a, fetVar6, 0);
                                            } else {
                                                fetVar6.X();
                                            }
                                            break;
                                        default:
                                            mm40 mm40Var2 = (mm40) obj11;
                                            fet fetVar7 = (fet) obj12;
                                            int iD2 = dw9.d((Integer) obj13, y5dVar, mm40Var2);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar7.g(mm40Var2) ? 32 : 16;
                                            }
                                            if (fetVar7.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                unh0.i(mm40Var2, xoaVar2.b, fetVar7);
                                            } else {
                                                fetVar7.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar2), fetVar2, 27648, 6);
                            fetVar2.r(false);
                        } else if (bjaVar instanceof vka) {
                            fetVar2.e0(245721572);
                            kc5.S(mm40VarC, (vka) bjaVar, function2, fetVar2, 0);
                            fetVar2.r(false);
                        } else if (bjaVar instanceof zja) {
                            fetVar2.e0(245728731);
                            s5x0.l(mm40VarC, (zja) bjaVar, (Function1) obj5, (Function1) obj8, fetVar2, 0);
                            fetVar2.r(false);
                        } else if (bjaVar instanceof ina) {
                            fetVar2.e0(245737643);
                            ina inaVar = (ina) bjaVar;
                            function3.getClass();
                            pz40 pz40VarF3 = androidx.compose.runtime.e.f(inaVar.f15064a, fetVar2);
                            zcl zclVar3 = qmk.f28987a;
                            uc9.h(s5x0.N(mm40VarC, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, u1c.M(1140493083, new n82(pz40VarF3, inaVar, function3, (byte) 10), fetVar2), u1c.M(713223354, new awh(inaVar, (byte) 12), fetVar2), fetVar2, 27648, 6);
                            fetVar2.r(false);
                        } else if (bjaVar instanceof ija) {
                            fetVar2.e0(245744967);
                            ija ijaVar = (ija) bjaVar;
                            Function1 function4 = (Function1) obj9;
                            function3.getClass();
                            function4.getClass();
                            uc9.h(mm40VarC, null, u1c.M(1122754622, new g54((Object) ijaVar, function4, function3, androidx.compose.runtime.e.f(ijaVar.f14864a.b, fetVar2), (byte) 4), fetVar2), u1c.M(-2022380387, new awh(ijaVar, (byte) 8), fetVar2), fetVar2, 27648, 6);
                            fetVar2.r(false);
                        } else if (bjaVar instanceof ioa) {
                            fetVar2.e0(245754016);
                            final ioa ioaVar = (ioa) bjaVar;
                            Function2 function5 = (Function2) obj7;
                            function5.getClass();
                            Object objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = jgk0.b(new Function0() { // from class: a.foa
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b6 = b4;
                                        ioa ioaVar2 = ioaVar;
                                        switch (b6) {
                                            case 0:
                                                return ioaVar2.c;
                                            default:
                                                return ioaVar2.b;
                                        }
                                    }
                                });
                                fetVar2.o0(objP3);
                            }
                            l7m0 l7m0Var = (l7m0) objP3;
                            Object objP4 = fetVar2.P();
                            if (objP4 == cl5Var) {
                                objP4 = jgk0.b(new Function0() { // from class: a.foa
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b6 = b3;
                                        ioa ioaVar2 = ioaVar;
                                        switch (b6) {
                                            case 0:
                                                return ioaVar2.c;
                                            default:
                                                return ioaVar2.b;
                                        }
                                    }
                                });
                                fetVar2.o0(objP4);
                            }
                            zcl zclVar4 = qmk.f28987a;
                            uc9.h(s5x0.N(mm40VarC, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, u1c.M(1248573717, new g54((Object) l7m0Var, (Object) function5, (Object) ioaVar, objP4, (byte) 6), fetVar2), u1c.M(2048148246, new awh(ioaVar, (byte) 14), fetVar2), fetVar2, 27648, 6);
                            fetVar2.r(false);
                        } else if (bjaVar instanceof vaa) {
                            fetVar2.e0(245761000);
                            x8f.o(mm40VarC, (vaa) bjaVar, function2, fetVar2, 0);
                            fetVar2.r(false);
                        } else {
                            if (!Intrinsics.d(bjaVar, wja.f39251a)) {
                                throw b1j.f(245700588, fetVar2, false);
                            }
                            fetVar2.e0(245767875);
                            knx.K(0, fetVar2, mm40VarC);
                            fetVar2.r(false);
                        }
                    }
                    fetVar2.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                xcz xczVar = (xcz) obj7;
                vne vneVar = (vne) obj6;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar6.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar6.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar6.U(i4 & 1, (i4 & 147) != 146)) {
                    int i6 = i4 & 126;
                    String str = (String) list.get(iIntValue7);
                    fetVar6.e0(2081697729);
                    boolean z = ((Number) ((Function0) obj5).invoke()).intValue() == iIntValue7;
                    l7m0 l7m0Var2 = (l7m0) obj9;
                    Function1 function6 = (Function1) obj8;
                    boolean z2 = (fetVar6.i(vneVar) ? 1 : 0) | (fetVar6.g(xczVar) ? 1 : 0);
                    if ((((i4 & 112) ^ 48) <= 32 || !fetVar6.e(iIntValue7)) && (i4 & 48) != 32) {
                        b3 = 0;
                    }
                    boolean z3 = z2 | b3;
                    Object objP5 = fetVar6.P();
                    if (z3 != 0 || objP5 == cl5Var) {
                        objP5 = new i5(vneVar, xczVar, iIntValue7, b2);
                        fetVar6.o0(objP5);
                    }
                    g7x.r(null, l7m0Var2, z, str, iIntValue7, function6, (Function0) objP5, fetVar6, (i6 << 9) & 57344);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ w2m(List list, Object obj, Object obj2, Object obj3, wdr wdrVar, Object obj4, byte b) {
        this.f38456a = b;
        this.b = list;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = wdrVar;
        this.g = obj4;
    }

    public w2m(List list, Function2 function2, Function1 function1, Function1 function3, Function1 function4, Function2 function5) {
        this.f38456a = (byte) 2;
        this.b = list;
        this.f = function2;
        this.c = function1;
        this.d = function3;
        this.e = function4;
        this.g = function5;
    }
}
