package a;

import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;
import org.xplatform.sportgame.markets.betbuilder.api.navigation.BetBuilderMarketsParams;
import org.xplatform.sportgame.markets.categories.api.navigation.CategoryMarketsParams;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s49 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31595a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s49(pl7 pl7Var, wom womVar, w2d w2dVar, Function0 function0, xcz xczVar, Function1 function1) {
        this.f31595a = (byte) 2;
        this.c = pl7Var;
        this.d = womVar;
        this.e = w2dVar;
        this.b = function0;
        this.f = xczVar;
        this.g = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.util.ArrayList] */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b;
        ?? N;
        boolean z;
        lm6 lm6Var;
        fet fetVar;
        boolean z2;
        byte b2 = this.f31595a;
        jr8 jr8Var = jr8.f16991a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.c;
        byte b3 = 2;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.b;
        switch (b2) {
            case 0:
                Function0 function0 = (Function0) obj9;
                eke ekeVar = (eke) obj5;
                Function0 function1 = (Function0) obj4;
                Function0 function2 = (Function0) obj8;
                Function0 function3 = (Function0) obj7;
                Function0 function4 = (Function0) obj6;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    n0q n0qVar = o7k0.c;
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.c);
                    zcl zclVar = qmk.f28987a;
                    zvw.d(function0, s5x0.N(mm40VarB, 0.0f, 8.0f, 16.0f, 0.0f, 9), false, null, null, u1c.M(1807475127, new m87(ekeVar, (byte) 23), fetVar2), fetVar2, 1572864, 60);
                    jd8.n(jr8Var.b(jm40Var, gqw0.h), ekeVar.c, function1, function2, function3, function4, fetVar2, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                v3w0 v3w0Var = (v3w0) obj5;
                Function0 function5 = (Function0) obj9;
                Function0 function6 = (Function0) obj4;
                Function0 function7 = (Function0) obj8;
                Function0 function8 = (Function0) obj7;
                Function0 function9 = (Function0) obj6;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    n0q n0qVar2 = o7k0.c;
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    rq8.g(jr8Var.b(jm40Var, gqw0.h), v3w0Var.b, v3w0Var.c, v3w0Var.d, function5, function6, function7, function8, function9, fetVar3, 0);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                pl7 pl7Var = (pl7) obj4;
                wom womVar = (wom) obj8;
                w2d w2dVar = (w2d) obj7;
                Function0 function10 = (Function0) obj9;
                xcz xczVar = (xcz) obj6;
                Function1 function11 = (Function1) obj5;
                hh80 hh80Var = (hh80) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar4.g(hh80Var) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zD = pl7Var.d();
                    boolean z3 = !pl7Var.d();
                    n0q n0qVar3 = o7k0.c;
                    bdx.B(o2e.e0(s5x0.I(n0qVar3, hh80Var), "PULL_TO_REFRESH_HISTORY_BOX"), zD, z3, womVar, w2dVar, null, function10, null, u1c.M(750865777, new x2g((Object) pl7Var, (Object) xczVar, (Object) function11, (Object) function10, (byte) 25), fetVar4), fetVar4, 100696064);
                    if (pl7Var.c()) {
                        fetVar4.e0(-1370577428);
                        Object objP = fetVar4.P();
                        if (objP == cl5Var) {
                            objP = new th50((byte) 16);
                            fetVar4.o0(objP);
                        }
                        mm40 mm40VarY = y860.Y(n0qVar3, false, null, null, (Function0) objP, 14);
                        zfn zfnVar = m8m0.f21378a;
                        mm40 mm40VarQ = i120.Q(mm40VarY, ((StaticColors) fetVar4.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
                        tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                        int iHashCode3 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM3 = fetVar4.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarQ);
                        mkd.c0.getClass();
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, tj30VarC3, gqw0.x);
                        jpm0.o(fetVar4, bh90VarM3, gqw0.w);
                        jpm0.o(fetVar4, Integer.valueOf(iHashCode3), gqw0.y);
                        jpm0.n(fetVar4);
                        jpm0.o(fetVar4, mm40VarC2, gqw0.v);
                        kpb.j(jr8Var.b(jm40Var, gqw0.e), new dkm((ycl) null, new y3d(((StaticColors) fetVar4.k(zfnVar)).m131getWhite800d7_KjU()), 3), fetVar4, 0, 0);
                        fetVar4.r(true);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-1370119031);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                l7m0 l7m0Var = (l7m0) obj9;
                l7m0 l7m0Var2 = (l7m0) obj4;
                l7m0 l7m0Var3 = (l7m0) obj8;
                f3d f3dVar = (f3d) obj7;
                y82 y82Var = (y82) obj6;
                l7m0 l7m0Var4 = (l7m0) obj5;
                mm40 mm40Var = (mm40) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                qek0 qek0Var = y82.V1;
                mm40Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar5.g(mm40Var) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    y72 y72Var = (y72) l7m0Var.getValue();
                    boolean zBooleanValue = ((Boolean) l7m0Var2.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) l7m0Var4.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) l7m0Var3.getValue()).booleanValue();
                    vj50 vj50Var = (vj50) f3dVar.h.getValue();
                    boolean zI = fetVar5.i(y82Var);
                    Object objP2 = fetVar5.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new m82(y82Var, b3);
                        fetVar5.o0(objP2);
                    }
                    Function0 function12 = (Function0) objP2;
                    boolean zI2 = fetVar5.i(y82Var);
                    Object objP3 = fetVar5.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new j82(y82Var, (byte) 1);
                        fetVar5.o0(objP3);
                    }
                    y0x0.c(mm40Var, y72Var, zBooleanValue, zBooleanValue2, zBooleanValue3, vj50Var, function12, (Function2) objP3, fetVar5, iIntValue4 & 14);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                l7m0 l7m0Var5 = (l7m0) obj9;
                l7m0 l7m0Var6 = (l7m0) obj4;
                f3d f3dVar2 = (f3d) obj8;
                l7m0 l7m0Var7 = (l7m0) obj7;
                y82 y82Var2 = (y82) obj6;
                qno0 qno0Var = (qno0) obj5;
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                qek0 qek0Var2 = y82.V1;
                mm40Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar6.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    q4i0 q4i0Var = (q4i0) l7m0Var5.getValue();
                    ArrayList arrayList = q4i0Var.b;
                    int i = q4i0Var.f28098a;
                    boolean zI3 = fetVar6.i(arrayList);
                    Object objP4 = fetVar6.P();
                    if (zI3 || objP4 == cl5Var) {
                        b = 0;
                        objP4 = new l82(arrayList, b);
                        fetVar6.o0(objP4);
                    } else {
                        b = 0;
                    }
                    kwj kwjVarB = zk80.b(i, (Function0) objP4, fetVar6, b, 2);
                    Integer numValueOf = Integer.valueOf(i);
                    boolean zG = fetVar6.g(kwjVarB) | fetVar6.g(q4i0Var);
                    Object objP5 = fetVar6.P();
                    if (zG || objP5 == cl5Var) {
                        objP5 = new y32(kwjVarB, q4i0Var, (yje) null, b3);
                        fetVar6.o0(objP5);
                    }
                    m0x0.t(fetVar6, numValueOf, (Function2) objP5);
                    mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
                    boolean zG2 = fetVar6.g(l7m0Var6);
                    Object objP6 = fetVar6.P();
                    if (zG2 || objP6 == cl5Var) {
                        objP6 = new yd1(l7m0Var6, (byte) 14);
                        fetVar6.o0(objP6);
                    }
                    mm40 mm40VarT = i4w0.T(mm40VarD, (Function1) objP6);
                    pz40 pz40Var = s6t0.f31722a;
                    q5x.e(kwjVarB, fww.z(i120.Q(mm40VarT, s6t0.b().f33626a.getBackground(), jd8.n), ((Boolean) l7m0Var7.getValue()).booleanValue(), (vj50) f3dVar2.g.getValue()), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-597282819, new n82(y82Var2, arrayList, qno0Var, (byte) 0), fetVar6), fetVar6, 100687872, 24576, 16108);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                Set set = (Set) obj9;
                Set set2 = (Set) obj8;
                pz40 pz40Var2 = (pz40) obj7;
                List list = (List) obj6;
                ob50 ob50Var = (ob50) obj5;
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean zI4 = fetVar7.i(set);
                    Object obj10 = this.c;
                    boolean zI5 = fetVar7.i(obj10) | zI4 | fetVar7.i(set2) | fetVar7.g(pz40Var2);
                    Object objP7 = fetVar7.P();
                    if (zI5 || objP7 == cl5Var) {
                        objP7 = new dc0((Object) set, obj10, (Object) set2, (Object) pz40Var2, (byte) 26);
                        fetVar7.o0(objP7);
                    }
                    m0x0.o(obj10, (Function1) objP7, fetVar7);
                    fetVar7.e0(358947325);
                    if (list instanceof RandomAccess) {
                        iz40 iz40Var = new iz40(list.size());
                        N = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj11 = list.get(i2);
                            if (iz40Var.a(obj11)) {
                                N.add(obj11);
                            }
                        }
                    } else {
                        N = CollectionsKt.N(list);
                    }
                    if (!N.isEmpty()) {
                        ListIterator listIterator = N.listIterator(N.size());
                        while (listIterator.hasPrevious()) {
                            ob50Var = new ob50(ob50Var, u1c.M(-330823412, new rgh((pb50) listIterator.previous(), ob50Var, (byte) 6), fetVar7));
                        }
                    }
                    fetVar7.r(false);
                    ob50Var.a(0, fetVar7);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 6:
                Function1 function13 = (Function1) obj9;
                xcz xczVar2 = (xcz) obj4;
                l7m0 l7m0Var8 = (l7m0) obj8;
                l7m0 l7m0Var9 = (l7m0) obj7;
                l7m0 l7m0Var10 = (l7m0) obj6;
                l7m0 l7m0Var11 = (l7m0) obj5;
                ir8 ir8Var = (ir8) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar8.g(ir8Var) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    kje kjeVar = (kje) ((l7m0) l7m0Var10.getValue()).getValue();
                    if (kjeVar instanceof zie) {
                        fetVar8.e0(-1530568862);
                        mm40 mm40VarR = knm0.r(ir8Var.b(jm40Var, gqw0.e));
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(mm40VarR, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                        mdm mdmVar = ((zie) kjeVar).f44436a;
                        boolean zG3 = fetVar8.g(function13);
                        Object objP8 = fetVar8.P();
                        if (zG3 || objP8 == cl5Var) {
                            objP8 = new i8v(function13, (byte) 29);
                            fetVar8.o0(objP8);
                        }
                        jcb.l(mm40VarN, mdmVar, false, (Function0) objP8, fetVar8, 0, 4);
                        fetVar8.r(false);
                    } else if (Intrinsics.d(kjeVar, dje.f6181a)) {
                        fetVar8.e0(-1530006677);
                        k9x.b(0, fetVar8, s5x0.L(jm40Var, xfn.a(fetVar8).d, 0.0f, 2));
                        fetVar8.r(false);
                    } else {
                        if (!Intrinsics.d(kjeVar, fje.f9636a)) {
                            throw b1j.f(1197554620, fetVar8, false);
                        }
                        fetVar8.e0(-1529615147);
                        mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "BET_DETAILS_LAZY_ROW_TAG");
                        fetVar8.e0(1197594348);
                        zcl zclVar3 = qmk.f28987a;
                        hh80 lh80Var = new lh80(xfn.a(fetVar8).d, 12.0f, xfn.a(fetVar8).d, 32.0f);
                        if (((Collection) ((l7m0) l7m0Var11.getValue()).getValue()).isEmpty()) {
                            z = false;
                            fetVar8.e0(1664963726);
                            lh80Var = knm0.g(lh80Var, fetVar8);
                        } else {
                            fetVar8.e0(1664872865);
                            z = false;
                        }
                        fetVar8.r(z);
                        hh80 hh80Var2 = lh80Var;
                        fetVar8.r(z);
                        qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                        boolean zG4 = fetVar8.g(l7m0Var8) | fetVar8.g(function13) | fetVar8.g(l7m0Var9);
                        Object objP9 = fetVar8.P();
                        if (zG4 || objP9 == cl5Var) {
                            objP9 = new k9v(l7m0Var8, function13, (Object) l7m0Var9, (byte) 6);
                            fetVar8.o0(objP9);
                        }
                        b8k0.e(mm40VarE0, xczVar2, hh80Var2, qw3Var, null, null, false, null, (Function1) objP9, fetVar8, 6, Response.NOT_ACCEPTABLE_HERE);
                        fetVar8.r(false);
                    }
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                l7m0 l7m0Var12 = (l7m0) obj9;
                fli fliVar = (fli) obj4;
                mm40 mm40Var3 = (mm40) obj8;
                Fragment fragment = (Fragment) obj7;
                MarketsCategoriesParams marketsCategoriesParams = (MarketsCategoriesParams) obj6;
                Function1 function14 = (Function1) obj5;
                long jLongValue = ((Long) obj).longValue();
                fet fetVar9 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar9.f(jLongValue) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    lz20 lz20Var = (lz20) l7m0Var12.getValue();
                    if ((lz20Var instanceof kz20) && (lm6Var = ((kz20) lz20Var).m) != null && lm6Var.b) {
                        fetVar9.e0(-987767122);
                        fliVar.q.f(mm40Var3, fragment, new BetBuilderMarketsParams(marketsCategoriesParams.d), function14, fetVar9, 512);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(-987265883);
                        fliVar.p.a(mm40Var3, fragment, new CategoryMarketsParams(marketsCategoriesParams.d, marketsCategoriesParams.f46990a, jLongValue), function14, fetVar9, 512);
                        fetVar9.r(false);
                    }
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            default:
                l7m0 l7m0Var13 = (l7m0) obj9;
                yjt yjtVar = (yjt) obj4;
                l7m0 l7m0Var14 = (l7m0) obj8;
                fpk0 fpk0Var = (fpk0) obj7;
                f3d f3dVar3 = (f3d) obj6;
                qno0 qno0Var2 = (qno0) obj5;
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                zie0 zie0Var = fpk0.V1;
                mm40Var4.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar10.g(mm40Var4) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    ArrayList arrayList2 = ((kwk0) l7m0Var13.getValue()).b;
                    int i3 = ((kwk0) l7m0Var13.getValue()).f19006a;
                    boolean zI6 = fetVar10.i(arrayList2);
                    Object objP10 = fetVar10.P();
                    if (zI6 || objP10 == cl5Var) {
                        objP10 = new l82(arrayList2, (byte) 3);
                        fetVar10.o0(objP10);
                    }
                    kwj kwjVarB2 = zk80.b(i3, (Function0) objP10, fetVar10, 0, 2);
                    Integer numValueOf2 = Integer.valueOf(((kwk0) l7m0Var13.getValue()).f19006a);
                    boolean zG5 = fetVar10.g(kwjVarB2) | fetVar10.g(l7m0Var13);
                    Object objP11 = fetVar10.P();
                    if (zG5 || objP11 == cl5Var) {
                        objP11 = new eyj((byte) 10, null, kwjVarB2, l7m0Var13);
                        fetVar10.o0(objP11);
                    }
                    m0x0.t(fetVar10, numValueOf2, (Function2) objP11);
                    Object objP12 = fetVar10.P();
                    if (objP12 == cl5Var) {
                        objP12 = new rai0(yjtVar, (byte) 26);
                        fetVar10.o0(objP12);
                    }
                    mm40 mm40VarT2 = i4w0.T(mm40Var4, (Function1) objP12);
                    pz40 pz40Var3 = s6t0.f31722a;
                    mm40 mm40VarQ2 = i120.Q(mm40VarT2, s6t0.b().f33626a.getBackground(), jd8.n);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar10, 0);
                    int iHashCode4 = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM4 = fetVar10.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar10, mm40VarQ2);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(pcyVar);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, x5dVarA, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC3, gqw0.v);
                    if (arrayList2.size() > 1) {
                        fetVar10.e0(1028975411);
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarJ = s5x0.J(jm40Var, 8.0f);
                        a4x a4xVar = ((mwk0) l7m0Var14.getValue()).b;
                        dxh0 dxh0Var = ((mwk0) l7m0Var14.getValue()).c;
                        boolean zG6 = fetVar10.g(l7m0Var14);
                        Object objP13 = fetVar10.P();
                        if (zG6 || objP13 == cl5Var) {
                            objP13 = new f7f0(l7m0Var14, (byte) 14);
                            fetVar10.o0(objP13);
                        }
                        Function0 function15 = (Function0) objP13;
                        boolean zI7 = fetVar10.i(fpk0Var);
                        Object objP14 = fetVar10.P();
                        if (zI7 || objP14 == cl5Var) {
                            z2 = false;
                            objP14 = new dpk0(fpk0Var, (byte) 0);
                            fetVar10.o0(objP14);
                        } else {
                            z2 = false;
                        }
                        ibc.n(mm40VarJ, a4xVar, gxh0.f12078a, dxh0Var, false, function15, (Function1) objP14, fetVar10, 384, 16);
                        fetVar = fetVar10;
                        fetVar.r(z2);
                    } else {
                        fetVar = fetVar10;
                        fetVar.e0(1029519337);
                        fetVar.r(false);
                    }
                    q5x.e(kwjVarB2, fww.z(o7k0.d(jm40Var, 1.0f), true, (vj50) f3dVar3.g.getValue()), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1843667496, new n82(fpk0Var, arrayList2, qno0Var2, (byte) 4), fetVar), fetVar, 100687872, 24576, 16108);
                    fetVar.r(true);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ s49(v3w0 v3w0Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4) {
        this.f31595a = (byte) 1;
        this.g = v3w0Var;
        this.b = function0;
        this.c = function1;
        this.d = function2;
        this.e = function3;
        this.f = function4;
    }

    public /* synthetic */ s49(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.f31595a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public /* synthetic */ s49(Function0 function0, eke ekeVar, Function0 function1, Function0 function2, Function0 function3, Function0 function4) {
        this.f31595a = (byte) 0;
        this.b = function0;
        this.g = ekeVar;
        this.c = function1;
        this.d = function2;
        this.e = function3;
        this.f = function4;
    }
}
