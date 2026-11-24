package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.coupon.impl.generate_coupon.presentation.model.compose.GenerateCouponTypeUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class cit implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4429a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public cit(List list, int i, Function1 function1) {
        this.f4429a = (byte) 4;
        this.b = list;
        this.c = i;
        this.d = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f4429a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        List list = this.b;
        Object obj5 = this.d;
        int i = this.c;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                dit ditVar = (dit) obj5;
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
                    GenerateCouponTypeUiModel generateCouponTypeUiModel = (GenerateCouponTypeUiModel) list.get(iIntValue);
                    fetVar.e0(2018473914);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    tui0 tui0Var = new tui0(generateCouponTypeUiModel.f46470a, null);
                    nvi0 nvi0Var = new nvi0(generateCouponTypeUiModel.c);
                    xak xakVar = dit.m2;
                    rqm rqmVar = new rqm((vui0) tui0Var, (pui0) null, (pvi0) nvi0Var, (d4d) null, (tvi0) null, iIntValue == ditVar.l2.n(ditVar, dit.n2[1]).size() - 1 ? wui0.d : wui0.c, false, (e900) null, 442);
                    boolean z = iIntValue != i;
                    boolean zI = fetVar.i(ditVar) | fetVar.g(generateCouponTypeUiModel);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new bit(ditVar, generateCouponTypeUiModel, (byte) 0);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI2 = fetVar.i(ditVar) | fetVar.g(generateCouponTypeUiModel);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new bit(ditVar, generateCouponTypeUiModel, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    obc.q(mm40VarD, rqmVar, z, null, function0, null, (Function0) objP2, null, fetVar, 6, 168);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                fit fitVar = (fit) obj5;
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
                    GenerateCouponTypeUiModel generateCouponTypeUiModel2 = (GenerateCouponTypeUiModel) list.get(iIntValue3);
                    fetVar2.e0(157767729);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    tui0 tui0Var2 = new tui0(generateCouponTypeUiModel2.f46470a, null);
                    nvi0 nvi0Var2 = new nvi0(generateCouponTypeUiModel2.c);
                    ddk ddkVar = fit.m2;
                    rqm rqmVar2 = new rqm((vui0) tui0Var2, (pui0) null, (pvi0) nvi0Var2, (d4d) null, (tvi0) null, iIntValue3 == fitVar.l2.n(fitVar, fit.n2[1]).size() - 1 ? wui0.d : wui0.c, false, (e900) null, 442);
                    boolean z2 = iIntValue3 != i;
                    boolean zI3 = fetVar2.i(fitVar) | fetVar2.g(generateCouponTypeUiModel2);
                    Object objP3 = fetVar2.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new eit(fitVar, generateCouponTypeUiModel2, (byte) 0);
                        fetVar2.o0(objP3);
                    }
                    Function0 function1 = (Function0) objP3;
                    boolean zI4 = fetVar2.i(fitVar) | fetVar2.g(generateCouponTypeUiModel2);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new eit(fitVar, generateCouponTypeUiModel2, (byte) 1);
                        fetVar2.o0(objP4);
                    }
                    obc.q(mm40VarD2, rqmVar2, z2, null, function1, null, (Function0) objP4, null, fetVar2, 6, 168);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (fetVar3.g(g9zVar3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i4 & 1, (i4 & 147) != 146)) {
                    wn5 wn5Var = (wn5) list.get(iIntValue5);
                    fetVar3.e0(1584673371);
                    piz.l(wn5Var, iIntValue5 == ((a4x) ((nc30) obj5).d.get(i)).size() - 1, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i5 = (iIntValue8 & 6) == 0 ? iIntValue8 | (fetVar4.g(g9zVar4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(i5 & 1, (i5 & 147) != 146)) {
                    hoa0 hoa0Var = (hoa0) list.get(iIntValue7);
                    fetVar4.e0(270902165);
                    boolean z3 = iIntValue7 == ((a4x) ((qd30) obj5).e.get(i)).size() - 1;
                    if (hoa0Var instanceof eoa0) {
                        fetVar4.e0(271061504);
                        l7x.k((eoa0) hoa0Var, z3, fetVar4, 0);
                        fetVar4.r(false);
                    } else if (hoa0Var instanceof foa0) {
                        fetVar4.e0(271383873);
                        n7x.b((foa0) hoa0Var, z3, iIntValue7 == 0, fetVar4, 0);
                        fetVar4.r(false);
                    } else {
                        if (!Intrinsics.d(hoa0Var, goa0.f11622a)) {
                            throw b1j.f(-1515279394, fetVar4, false);
                        }
                        fetVar4.e0(271746077);
                        u7x.b(0, fetVar4, z3);
                        fetVar4.r(false);
                    }
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                Function1 function2 = (Function1) obj5;
                int i6 = (iIntValue10 & 6) == 0 ? iIntValue10 | (fetVar5.g(g9zVar5) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i6 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(i6 & 1, (i6 & 147) != 146)) {
                    List list2 = (List) list.get(iIntValue9);
                    fetVar5.e0(-82402969);
                    mm40 mm40VarK0 = q8a.k0(o7k0.d(jm40Var, 1.0f), enx.b);
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarK0);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(e7z.u1);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar5);
                    Iterator itV = kng0.v(fetVar5, mm40VarC0, gqw0.v, -1075221046, list2);
                    while (itV.hasNext()) {
                        pzc pzcVar = (pzc) itV.next();
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        mm40 mm40VarC = o7k0.c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                        rqm rqmVar3 = pzcVar.b;
                        boolean zG = fetVar5.g(function2) | fetVar5.g(pzcVar);
                        Object objP5 = fetVar5.P();
                        if (zG || objP5 == cl5Var) {
                            objP5 = new sue0(function2, pzcVar, (byte) 16);
                            fetVar5.o0(objP5);
                        }
                        fet fetVar6 = fetVar5;
                        obc.q(mm40VarC, rqmVar3, false, null, (Function0) objP5, null, null, null, fetVar6, 0, 236);
                        fetVar5 = fetVar6;
                    }
                    fet fetVar7 = fetVar5;
                    fetVar7.r(false);
                    if (list2.size() < i) {
                        fetVar7.e0(1028300042);
                        int size = i - list2.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            if (1.0f <= 0.0d) {
                                vcx.a("invalid weight; must be greater than zero");
                            }
                            qxw.o(fetVar7, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                        }
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(1028456685);
                        fetVar7.r(false);
                    }
                    fetVar7.r(true);
                    fetVar7.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ cit(List list, Object obj, int i, byte b) {
        this.f4429a = b;
        this.b = list;
        this.d = obj;
        this.c = i;
    }
}
