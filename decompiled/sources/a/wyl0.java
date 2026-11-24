package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class wyl0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39979a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wyl0(Object obj, byte b) {
        this.f39979a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        byte b = this.f39979a;
        jm40 jm40Var = jm40.b;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    yjz yjzVar = (yjz) ((ArrayList) obj5).get(iIntValue);
                    fetVar.e0(1346580006);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD2, 48.0f), 16.0f, 0.0f, 2);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    v8q0.a(yjzVar.f42761a, o7k0.w(o7k0.s(jm40Var, 44.0f), null, false, 3), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.j(), fetVar), fetVar, 0, 24576, 114684);
                    mm40 mm40VarN = s5x0.N(o7k0.c, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    v8q0.a(yjzVar.b, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.k(), fetVar), fetVar, 48, 24960, 110588);
                    mbc.o(zfi0.f44303a, jr8.f16991a.b(jm40Var, gqw0.g), false, fetVar, 6, 4);
                    fetVar.r(true);
                    fetVar.r(true);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2) : iIntValue4;
                if ((48 & iIntValue4) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    of90 of90Var = (of90) ((ArrayList) obj5).get(iIntValue3);
                    fetVar2.e0(1465593793);
                    zcl zclVar2 = qmk.f28987a;
                    n2x.f(of90Var, false, o7k0.s(jm40Var, 38.0f), null, fetVar2, 48, 8);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i3 = (iIntValue6 & 6) == 0 ? iIntValue6 | (fetVar3.g(g9zVar3) ? 4 : 2) : iIntValue6;
                if ((48 & iIntValue6) == 0) {
                    i3 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    trj0 trj0Var = (trj0) ((ArrayList) obj5).get(iIntValue5);
                    fetVar3.e0(157586882);
                    k7x.t(null, trj0Var, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i4 = (iIntValue8 & 6) == 0 ? iIntValue8 | (fetVar4.g(g9zVar4) ? 4 : 2) : iIntValue8;
                if ((48 & iIntValue8) == 0) {
                    i4 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    fal0 fal0Var = (fal0) ((ArrayList) obj5).get(iIntValue7);
                    fetVar4.e0(459713363);
                    s0x.x(jm40Var, fal0Var, fetVar4);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i5 = (iIntValue10 & 6) == 0 ? iIntValue10 | (fetVar5.g(g9zVar5) ? 4 : 2) : iIntValue10;
                if ((48 & iIntValue10) == 0) {
                    i5 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    fal0 fal0Var2 = (fal0) ((ArrayList) obj5).get(iIntValue9);
                    fetVar5.e0(1228681660);
                    s0x.x(jm40Var, fal0Var2, fetVar5);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                List list = (List) obj;
                String str = (String) obj2;
                fet fetVar6 = (fet) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                list.getClass();
                str.getClass();
                int i6 = (iIntValue11 & 6) == 0 ? ((iIntValue11 & 8) == 0 ? fetVar6.g(list) : fetVar6.i(list) ? 4 : 2) | iIntValue11 : iIntValue11;
                if ((48 & iIntValue11) == 0) {
                    i6 |= fetVar6.g(str) ? 32 : 16;
                }
                if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                    boolean zIsEmpty = list.isEmpty();
                    jm40 jm40Var2 = jm40.b;
                    if (zIsEmpty) {
                        fetVar6.e0(1063245312);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarE = o7k0.e(o7k0.z(s5x0.N(jm40Var2, xfn.a(fetVar6).d, 4.0f, 0.0f, 0.0f, 12), gqw0.m, true), 104.0f);
                        arrayList = new ArrayList();
                        for (Object obj6 : list) {
                            if (obj6 instanceof eh8) {
                                arrayList.add(obj6);
                            }
                        }
                        cjx.j(mm40VarE, arrayList, null, fetVar6, 0);
                        fetVar6.r(false);
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!(((ih8) it.next()) instanceof eh8)) {
                                fetVar6.e0(1063919562);
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarE2 = o7k0.e(s5x0.N(jm40Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13), 104.0f);
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj7 : list) {
                                    if (obj7 instanceof bh8) {
                                        arrayList2.add(obj7);
                                    }
                                }
                                zgc.f(mm40VarE2, arrayList2, str, (Function1) obj5, fetVar6, (i6 << 3) & 896);
                                fetVar6.r(false);
                            }
                        }
                        fetVar6.e0(1063245312);
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarE3 = o7k0.e(o7k0.z(s5x0.N(jm40Var2, xfn.a(fetVar6).d, 4.0f, 0.0f, 0.0f, 12), gqw0.m, true), 104.0f);
                        arrayList = new ArrayList();
                        while (r1.hasNext()) {
                            if (obj6 instanceof eh8) {
                                arrayList.add(obj6);
                            }
                        }
                        cjx.j(mm40VarE3, arrayList, null, fetVar6, 0);
                        fetVar6.r(false);
                    }
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
