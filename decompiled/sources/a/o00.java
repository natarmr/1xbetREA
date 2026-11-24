package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24396a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o00(Object obj, byte b) {
        this.f24396a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        w62 w62Var = (w62) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        pek0 pek0Var = w62.Q1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarG0 = w62Var.G0();
            boolean zI = fetVar.i(w62Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                ln1 ln1Var = new ln1(1, w62Var, w62.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/results/impl/presentation/alt_champs/models/AltChampResultsSideEffect;)V", 0, (byte) 11);
                fetVar.o0(ln1Var);
                objP = ln1Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(w62Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                l10 l10Var = new l10(k3t0VarG0, w62Var, pz40VarF, null, (byte) 16);
                fetVar.o0(l10Var);
                objP2 = l10Var;
            }
            m0x0.t(fetVar, w62Var, (Function2) objP2);
            l72 l72Var = (l72) ((i3t0) w62Var.G0()).y(fetVar).getValue();
            qdz qdzVar = (qdz) w62Var.L1.getValue();
            k3t0 k3t0VarG1 = w62Var.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                ln1 ln1Var2 = new ln1(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                fetVar.o0(ln1Var2);
                objP3 = ln1Var2;
            }
            Function1 function1 = (Function1) ((jhy) objP3);
            l72Var.getClass();
            qdzVar.getClass();
            function1.getClass();
            boolean zG = fetVar.g(function1);
            Object objP4 = fetVar.P();
            if (zG || objP4 == cl5Var) {
                objP4 = new si1(function1, (byte) 28);
                fetVar.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean zG2 = fetVar.g(function1);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == cl5Var) {
                objP5 = new si1(function1, (byte) 29);
                fetVar.o0(objP5);
            }
            v3c.z(function0, (Function0) objP5, null, fetVar, 0, 4);
            boolean z = l72Var instanceof h72;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-757486385);
                saj.x(jm40Var, (h72) l72Var, qdzVar, function1, fetVar, 0);
                fetVar.r(false);
            } else if (l72Var instanceof j72) {
                fetVar.e0(-757185747);
                rq8.p(jm40Var, (j72) l72Var, qdzVar, function1, fetVar, 0);
                fetVar.r(false);
            } else if (l72Var instanceof i72) {
                fetVar.e0(-756884210);
                j47.a0(jm40Var, (i72) l72Var, qdzVar, function1, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!(l72Var instanceof k72)) {
                    throw b1j.f(-301531214, fetVar, false);
                }
                fetVar.e0(-756585680);
                jd8.S(jm40Var, (k72) l72Var, qdzVar, function1, fetVar, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r4v73 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v5q r5qVar;
        pz40 pz40Var;
        Object l10Var;
        mm40 mm40Var;
        pz40 pz40Var2;
        Object l10Var2;
        on1 on1Var;
        Object l10Var3;
        au1 au1Var;
        uf50 uf50Var;
        byte b = this.f24396a;
        jm40 jm40Var = jm40.b;
        byte b2 = 8;
        x2q x2qVar = 0;
        bj50VarV = null;
        bj50 bj50VarV = null;
        cl5 cl5Var = ukd.f35823a;
        final byte b3 = 0;
        final byte b4 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kc5.H0((v00) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                kc5.Y((r00) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                kc5.l0((s00) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                kc5.q0((t00) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                kc5.G0((u00) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                m10 m10Var = (m10) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                pek0 pek0Var = m10.P1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3t0 k3t0VarG0 = m10Var.G0();
                    boolean zI = fetVar.i(m10Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        t0 t0Var = new t0(1, m10Var, m10.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/verification/status/impl/presentation/models/additional_verification_status/AdditionalVerificationStatusSideEffect;)V", 0, (byte) 26);
                        fetVar.o0(t0Var);
                        objP = t0Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(m10Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        l10 l10Var4 = new l10(k3t0VarG0, m10Var, pz40VarF, null, (byte) 0);
                        fetVar.o0(l10Var4);
                        objP2 = l10Var4;
                    }
                    m0x0.t(fetVar, m10Var, (Function2) objP2);
                    pz40 pz40VarY = ((i3t0) m10Var.G0()).y(fetVar);
                    k3t0 k3t0VarG1 = m10Var.G0();
                    boolean zI3 = fetVar.i(k3t0VarG1);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        t0 t0Var2 = new t0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar.o0(t0Var2);
                        objP3 = t0Var2;
                    }
                    uc9.a(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 6:
                jd0 jd0Var = (jd0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                gfk0 gfk0Var = jd0.P1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ae0 ae0Var = (ae0) ((i3t0) jd0Var.H0()).y(fetVar2).getValue();
                    k3t0 k3t0VarH0 = jd0Var.H0();
                    boolean zI4 = fetVar2.i(jd0Var);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == cl5Var) {
                        t90 t90Var = new t90(1, jd0Var, jd0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/search/impl/presentation/aggregator_brands/models/AggregatorBrandsSearchSideEffect;)V", 0, (byte) 8);
                        fetVar2.o0(t90Var);
                        objP4 = t90Var;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP4), fetVar2);
                    boolean zI5 = fetVar2.i(k3t0VarH0) | fetVar2.i(jd0Var) | fetVar2.e(3) | fetVar2.g(pz40VarF2);
                    Object objP5 = fetVar2.P();
                    if (zI5 || objP5 == cl5Var) {
                        l10 l10Var5 = new l10(k3t0VarH0, jd0Var, pz40VarF2, null, (byte) 1);
                        fetVar2.o0(l10Var5);
                        objP5 = l10Var5;
                    }
                    m0x0.t(fetVar2, jd0Var, (Function2) objP5);
                    mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
                    k3t0 k3t0VarH1 = jd0Var.H0();
                    boolean zI6 = fetVar2.i(k3t0VarH1);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == cl5Var) {
                        t90 t90Var2 = new t90(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                        fetVar2.o0(t90Var2);
                        objP6 = t90Var2;
                    }
                    Function1 function1 = (Function1) ((jhy) objP6);
                    ae0Var.getClass();
                    function1.getClass();
                    if (ae0Var instanceof xd0) {
                        fetVar2.e0(927322165);
                        p8a.a(mm40VarQ, ((xd0) ae0Var).f40673a, function1, fetVar2, 0);
                        fetVar2.r(false);
                    } else if (ae0Var instanceof yd0) {
                        fetVar2.e0(927574784);
                        p8a.c(mm40VarQ, ((yd0) ae0Var).f42408a, function1, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        if (!(ae0Var instanceof zd0)) {
                            throw b1j.f(-1217014040, fetVar2, false);
                        }
                        fetVar2.e0(927818010);
                        p8a.b(mm40VarQ, ((zd0) ae0Var).f44190a, fetVar2, 0);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 7:
                nf0 nf0Var = (nf0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                hfk0 hfk0Var = nf0.S1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) nf0Var.G0()).y(fetVar3);
                    k3t0 k3t0VarG2 = nf0Var.G0();
                    boolean zI7 = fetVar3.i(nf0Var);
                    Object objP7 = fetVar3.P();
                    if (zI7 || objP7 == cl5Var) {
                        t90 t90Var3 = new t90(1, nf0Var, nf0.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/aggregator/impl/category/presentation/models/category/AggregatorCategoriesSideEffect;)V", 0, (byte) 10);
                        fetVar3.o0(t90Var3);
                        objP7 = t90Var3;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP7), fetVar3);
                    boolean zI8 = fetVar3.i(k3t0VarG2) | fetVar3.i(nf0Var) | fetVar3.e(3) | fetVar3.g(pz40VarF3);
                    Object objP8 = fetVar3.P();
                    if (zI8 || objP8 == cl5Var) {
                        l10 l10Var6 = new l10(k3t0VarG2, nf0Var, pz40VarF3, null, (byte) 2);
                        fetVar3.o0(l10Var6);
                        objP8 = l10Var6;
                    }
                    m0x0.t(fetVar3, nf0Var, (Function2) objP8);
                    final kg0 kg0Var = (kg0) pz40VarY2.getValue();
                    k3t0 k3t0VarG3 = nf0Var.G0();
                    boolean zI9 = fetVar3.i(k3t0VarG3);
                    Object objP9 = fetVar3.P();
                    if (zI9 || objP9 == cl5Var) {
                        t90 t90Var4 = new t90(1, k3t0VarG3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                        fetVar3.o0(t90Var4);
                        objP9 = t90Var4;
                    }
                    final Function1 function2 = (Function1) ((jhy) objP9);
                    kg0Var.getClass();
                    mdm mdmVar = kg0Var.b;
                    function2.getClass();
                    clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar3), fetVar3, 24576);
                    mm40 mm40VarV = cjx.V(yyw.X(o2e.e0(jm40Var, "AGGREGATOR_CATEGORY_SCREEN"), null, fetVar3, 1), cloVarB.e, null);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarV);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(e7z.u1);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    ahy.b(o2e.e0(i120.Q(jm40Var, ((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent(), jd8.n), "AGGREGATOR_CATEGORY_NAVBAR"), cloVarB, mdmVar != null, u1c.M(1963260800, new Function2() { // from class: a.zf0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            byte b5 = b3;
                            Function1 function3 = function2;
                            kg0 kg0Var2 = kg0Var;
                            switch (b5) {
                                case 0:
                                    fet fetVar4 = (fet) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        zfn zfnVar = zaq0.b;
                                        imm immVar = new imm(new ilm(((ThemeColors) fetVar4.k(zfnVar)).getSecondary()), new plm(kg0Var2.f18217a, ((ThemeColors) fetVar4.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, ((ThemeColors) fetVar4.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar4.k(zfnVar)).getBackgroundContent(), false, null);
                                        boolean zG = fetVar4.g(function3);
                                        Object objP10 = fetVar4.P();
                                        cl5 cl5Var2 = ukd.f35823a;
                                        if (zG || objP10 == cl5Var2) {
                                            objP10 = new dn(function3, (byte) 17);
                                            fetVar4.o0(objP10);
                                        }
                                        Function0 function0 = (Function0) objP10;
                                        boolean zG2 = fetVar4.g(function3);
                                        Object objP11 = fetVar4.P();
                                        if (zG2 || objP11 == cl5Var2) {
                                            objP11 = new y7(function3, (byte) 18);
                                            fetVar4.o0(objP11);
                                        }
                                        hlm.c(null, immVar, null, function0, null, (Function1) objP11, null, null, null, null, null, null, fetVar4, 0, 0, 4053);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                                default:
                                    fet fetVar5 = (fet) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        q8a.I(o2e.e0(jm40.b, "TOP_CONTENT"), kg0Var2.f, function3, fetVar5, 6);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar3), u1c.M(-1673323617, new Function2() { // from class: a.zf0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            byte b5 = b4;
                            Function1 function3 = function2;
                            kg0 kg0Var2 = kg0Var;
                            switch (b5) {
                                case 0:
                                    fet fetVar4 = (fet) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        zfn zfnVar = zaq0.b;
                                        imm immVar = new imm(new ilm(((ThemeColors) fetVar4.k(zfnVar)).getSecondary()), new plm(kg0Var2.f18217a, ((ThemeColors) fetVar4.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, ((ThemeColors) fetVar4.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar4.k(zfnVar)).getBackgroundContent(), false, null);
                                        boolean zG = fetVar4.g(function3);
                                        Object objP10 = fetVar4.P();
                                        cl5 cl5Var2 = ukd.f35823a;
                                        if (zG || objP10 == cl5Var2) {
                                            objP10 = new dn(function3, (byte) 17);
                                            fetVar4.o0(objP10);
                                        }
                                        Function0 function0 = (Function0) objP10;
                                        boolean zG2 = fetVar4.g(function3);
                                        Object objP11 = fetVar4.P();
                                        if (zG2 || objP11 == cl5Var2) {
                                            objP11 = new y7(function3, (byte) 18);
                                            fetVar4.o0(objP11);
                                        }
                                        hlm.c(null, immVar, null, function0, null, (Function1) objP11, null, null, null, null, null, null, fetVar4, 0, 0, 4053);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                                default:
                                    fet fetVar5 = (fet) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        q8a.I(o2e.e0(jm40.b, "TOP_CONTENT"), kg0Var2.f, function3, fetVar5, 6);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar3), fetVar3, 27648, 0);
                    if (mdmVar != null) {
                        fetVar3.e0(1784085180);
                        q8a.x(o2e.e0(new x7z(1.0f, true), "MIDDLE_CONTENT"), kg0Var.c, kg0Var.b, function2, fetVar3, 0);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(1784429497);
                        q8a.w(o2e.e0(new x7z(1.0f, true), "MIDDLE_CONTENT"), kg0Var.c, kg0Var.d, kg0Var.e, kg0Var.b, function2, fetVar3, 0);
                        fetVar3.r(false);
                    }
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 8:
                kb0 kb0Var = (kb0) obj3;
                Throwable th = (Throwable) obj;
                String strG = (String) obj2;
                th.getClass();
                strG.getClass();
                if (StringsKt.W(strG)) {
                    strG = jwb.G(th, (ctf0) kb0Var.j);
                }
                kb0Var.g(new rk0(strG));
                return Unit.f46060a;
            case 9:
                gs0 gs0Var = (gs0) obj3;
                ur0 ur0Var = (ur0) obj2;
                ((oyg0) obj).getClass();
                ur0Var.getClass();
                v5q v5qVar = ur0Var.b;
                if (v5qVar instanceof r5q) {
                    a4x a4xVar = ((r5q) v5qVar).f29900a;
                    ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                    Iterator<E> it = a4xVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(gs0Var.M(((j4b) it.next()).f15876a, iun.f15405a));
                    }
                    i4 i4VarR0 = dyb.r0(arrayList);
                    i4VarR0.getClass();
                    r5qVar = new r5q(i4VarR0);
                } else {
                    r5qVar = v5qVar;
                }
                y5d0 u5d0Var = ur0Var.d;
                if (u5d0Var instanceof u5d0) {
                    x2q x2qVar2 = ((u5d0) u5d0Var).f35088a;
                    u5d0Var = new u5d0(x2qVar2 != null ? x2q.a(x2qVar2, iun.f15405a) : 0);
                }
                y5d0 y5d0Var = u5d0Var;
                rlk0 rlk0VarA = ur0Var.c;
                if (rlk0VarA instanceof nlk0) {
                    nlk0 nlk0Var = (nlk0) rlk0VarA;
                    rlk0VarA = nlk0.a(nlk0Var, (AggregatorSortingOptionModel) CollectionsKt.U(nlk0Var.f23732a));
                }
                return ur0.a(ur0Var, r5qVar, rlk0VarA, y5d0Var, null, 241);
            case 10:
                hu0 hu0Var = (hu0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                rek0 rek0Var = hu0.Y1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) hu0Var.G0()).y(fetVar4);
                    k3t0 k3t0VarG4 = hu0Var.G0();
                    boolean zI10 = fetVar4.i(hu0Var);
                    Object objP10 = fetVar4.P();
                    if (zI10 || objP10 == cl5Var) {
                        t90 t90Var5 = new t90(1, hu0Var, hu0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/game/impl/game/presentation/models/AggregatorGameSideEffect;)V", 0, (byte) 15);
                        fetVar4.o0(t90Var5);
                        objP10 = t90Var5;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP10), fetVar4);
                    boolean zI11 = fetVar4.i(k3t0VarG4) | fetVar4.i(hu0Var) | fetVar4.e(3) | fetVar4.g(pz40VarF4);
                    Object objP11 = fetVar4.P();
                    if (zI11 || objP11 == cl5Var) {
                        pz40Var = pz40VarY3;
                        l10 l10Var7 = new l10(k3t0VarG4, hu0Var, pz40VarF4, null, (byte) 5);
                        fetVar4.o0(l10Var7);
                        objP11 = l10Var7;
                    } else {
                        pz40Var = pz40VarY3;
                    }
                    m0x0.t(fetVar4, hu0Var, (Function2) objP11);
                    k3t0 k3t0VarG5 = hu0Var.G0();
                    boolean zI12 = fetVar4.i(k3t0VarG5);
                    Object objP12 = fetVar4.P();
                    if (zI12 || objP12 == cl5Var) {
                        t90 t90Var6 = new t90(1, k3t0VarG5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                        fetVar4.o0(t90Var6);
                        objP12 = t90Var6;
                    }
                    x8f.c(0, fetVar4, null, pz40Var, (Function1) ((jhy) objP12));
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 11:
                qy0 qy0Var = (qy0) obj3;
                a8z a8zVar = qy0Var.Q1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                pek0 pek0Var2 = qy0.S1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    lz0 lz0Var = (lz0) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar5).getValue();
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI13 = fetVar5.i(qy0Var);
                    Object objP13 = fetVar5.P();
                    Object obj4 = objP13;
                    if (zI13 || objP13 == cl5Var) {
                        t1 t1Var = new t1(qy0Var, (byte) 27);
                        fetVar5.o0(t1Var);
                        obj4 = t1Var;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) obj4, fetVar5);
                    boolean zI14 = fetVar5.i(k3t0Var) | fetVar5.i(qy0Var) | fetVar5.e(3) | fetVar5.g(pz40VarF5);
                    Object objP14 = fetVar5.P();
                    if (zI14 || objP14 == cl5Var) {
                        mm40Var = null;
                        l10Var = new l10(k3t0Var, qy0Var, pz40VarF5, null, (byte) 6);
                        fetVar5.o0(l10Var);
                    } else {
                        l10Var = objP14;
                        mm40Var = null;
                    }
                    m0x0.t(fetVar5, qy0Var, (Function2) l10Var);
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI15 = fetVar5.i(k3t0Var2);
                    Object objP15 = fetVar5.P();
                    if (zI15 || objP15 == cl5Var) {
                        t90 t90Var7 = new t90(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar5.o0(t90Var7);
                        objP15 = t90Var7;
                    }
                    saj.b(mm40Var, lz0Var, (Function1) ((jhy) objP15), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 12:
                m71 m71Var = (m71) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                rek0 rek0Var2 = m71.e2;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) m71Var.J0()).y(fetVar6);
                    k3t0 k3t0VarJ0 = m71Var.J0();
                    boolean zI16 = fetVar6.i(m71Var);
                    Object objP16 = fetVar6.P();
                    if (zI16 || objP16 == cl5Var) {
                        c21 c21Var = new c21(1, m71Var, m71.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/game/impl/game/presentation/models/AggregatorMultiModeGameSideEffect;)V", 0, (byte) 2);
                        fetVar6.o0(c21Var);
                        objP16 = c21Var;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP16), fetVar6);
                    boolean zI17 = fetVar6.i(k3t0VarJ0) | fetVar6.i(m71Var) | fetVar6.e(3) | fetVar6.g(pz40VarF6);
                    Object objP17 = fetVar6.P();
                    if (zI17 || objP17 == cl5Var) {
                        pz40Var2 = pz40VarY4;
                        l10 l10Var8 = new l10(k3t0VarJ0, m71Var, pz40VarF6, null, (byte) 8);
                        fetVar6.o0(l10Var8);
                        objP17 = l10Var8;
                    } else {
                        pz40Var2 = pz40VarY4;
                    }
                    m0x0.t(fetVar6, m71Var, (Function2) objP17);
                    k3t0 k3t0VarJ1 = m71Var.J0();
                    boolean zI18 = fetVar6.i(k3t0VarJ1);
                    Object objP18 = fetVar6.P();
                    if (zI18 || objP18 == cl5Var) {
                        c21 c21Var2 = new c21(1, k3t0VarJ1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                        fetVar6.o0(c21Var2);
                        objP18 = c21Var2;
                    }
                    cjx.b(0, fetVar6, null, pz40Var2, (Function1) ((jhy) objP18));
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 13:
                n91 n91Var = (n91) obj3;
                Throwable th2 = (Throwable) obj;
                String str = (String) obj2;
                th2.getClass();
                str.getClass();
                if ((th2 instanceof SocketTimeoutException) || (th2 instanceof ConnectException) || (th2 instanceof UnknownHostException)) {
                    n91Var.G(k81.f17850a);
                } else if (th2 instanceof cii0) {
                    n91Var.G(new l81(str));
                } else {
                    n91Var.G(g81.f10842a);
                }
                return Unit.f46060a;
            case 14:
                kc1 kc1Var = (kc1) obj3;
                Throwable th3 = (Throwable) obj;
                String str2 = (String) obj2;
                th3.getClass();
                str2.getClass();
                if ((th3 instanceof SocketTimeoutException) || (th3 instanceof ConnectException) || (th3 instanceof UnknownHostException)) {
                    kc1Var.G(qb1.f28424a);
                } else if (th3 instanceof cii0) {
                    kc1Var.G(new rb1(str2));
                } else {
                    kc1Var.G(mb1.f21483a);
                }
                return Unit.f46060a;
            case 15:
                mlr mlrVar = (mlr) obj3;
                xb1 xb1Var = (xb1) obj2;
                db1 db1Var = xb1Var.f40578a;
                String str3 = mlrVar.f;
                long j = mlrVar.c;
                long j2 = mlrVar.b;
                boolean z = mlrVar.m;
                boolean z2 = mlrVar.l;
                boolean z3 = mlrVar.n;
                long j3 = db1Var.f5778a;
                boolean z4 = db1Var.g;
                int i = db1Var.h;
                boolean z5 = db1Var.j;
                boolean z6 = db1Var.k;
                String str4 = db1Var.l;
                str3.getClass();
                str4.getClass();
                return xb1.a(xb1Var, new db1(j3, str3, j, j2, z, z2, z4, i, z3, z5, z6, str4), null, false, 0L, 0L, 0L, false, 2046);
            case 16:
                a8z a8zVar2 = ((lk1) obj3).N1;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                rek0 rek0Var3 = lk1.U1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar7);
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI19 = fetVar7.i(k3t0Var3);
                    Object objP19 = fetVar7.P();
                    if (zI19 || objP19 == cl5Var) {
                        c21 c21Var3 = new c21(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar7.o0(c21Var3);
                        objP19 = c21Var3;
                    }
                    lv00.e(0, fetVar7, null, pz40VarY5, (Function1) ((jhy) objP19));
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                gfk0 gfk0Var2 = cl1.o2;
                ((cl1) obj3).P0(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 18:
                on1 on1Var2 = (on1) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                hfk0 hfk0Var2 = on1.S1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    d9z d9zVarA = f9z.a(fetVar8);
                    Object objP20 = fetVar8.P();
                    Object obj5 = objP20;
                    if (objP20 == cl5Var) {
                        vne vneVarI = m0x0.I(kotlin.coroutines.g.f46065a, fetVar8);
                        fetVar8.o0(vneVarI);
                        obj5 = vneVarI;
                    }
                    vne vneVar = (vne) obj5;
                    fo1 fo1Var = (fo1) ((i3t0) on1Var2.G0()).y(fetVar8).getValue();
                    k3t0 k3t0VarG6 = on1Var2.G0();
                    boolean zI20 = fetVar8.i(vneVar) | fetVar8.g(d9zVarA) | fetVar8.i(on1Var2);
                    Object objP21 = fetVar8.P();
                    Object obj6 = objP21;
                    if (zI20 || objP21 == cl5Var) {
                        on onVar = new on(vneVar, on1Var2, d9zVarA, b2);
                        fetVar8.o0(onVar);
                        obj6 = onVar;
                    }
                    lkz lkzVar7 = lkz.f20223a;
                    pz40 pz40VarF7 = androidx.compose.runtime.e.f((Function1) obj6, fetVar8);
                    boolean zI21 = fetVar8.i(k3t0VarG6) | fetVar8.i(on1Var2) | fetVar8.e(3) | fetVar8.g(pz40VarF7);
                    Object objP22 = fetVar8.P();
                    if (zI21 || objP22 == cl5Var) {
                        on1Var = on1Var2;
                        l10Var2 = new l10(k3t0VarG6, on1Var, pz40VarF7, null, (byte) 12);
                        fetVar8.o0(l10Var2);
                    } else {
                        l10Var2 = objP22;
                        on1Var = on1Var2;
                    }
                    m0x0.t(fetVar8, on1Var, (Function2) l10Var2);
                    k3t0 k3t0VarG7 = on1Var.G0();
                    boolean zI22 = fetVar8.i(k3t0VarG7);
                    Object objP23 = fetVar8.P();
                    if (zI22 || objP23 == cl5Var) {
                        ln1 ln1Var = new ln1(1, k3t0VarG7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                        fetVar8.o0(ln1Var);
                        objP23 = ln1Var;
                    }
                    i120.d(null, fo1Var, (Function1) ((jhy) objP23), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                au1 au1Var2 = (au1) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                jdk0 jdk0Var = au1.Z1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar9, 0, 3);
                    d9z d9zVarA2 = f9z.a(fetVar9);
                    xcz xczVarA2 = ddz.a(0, 0, fetVar9, 0, 3);
                    xcz xczVarA3 = ddz.a(0, 0, fetVar9, 0, 3);
                    pz40 pz40VarY6 = ((i3t0) au1Var2.G0()).y(fetVar9);
                    k3t0 k3t0VarG8 = au1Var2.G0();
                    boolean zI23 = fetVar9.i(au1Var2);
                    Object objP24 = fetVar9.P();
                    Object obj7 = objP24;
                    if (zI23 || objP24 == cl5Var) {
                        m51 m51Var = new m51(au1Var2, b2);
                        fetVar9.o0(m51Var);
                        obj7 = m51Var;
                    }
                    lkz lkzVar8 = lkz.f20223a;
                    pz40 pz40VarF8 = androidx.compose.runtime.e.f((Function1) obj7, fetVar9);
                    boolean zI24 = fetVar9.i(k3t0VarG8) | fetVar9.i(au1Var2) | fetVar9.e(3) | fetVar9.g(pz40VarF8);
                    Object objP25 = fetVar9.P();
                    if (zI24 || objP25 == cl5Var) {
                        au1Var = au1Var2;
                        l10Var3 = new l10(k3t0VarG8, au1Var, pz40VarF8, null, (byte) 13);
                        fetVar9.o0(l10Var3);
                    } else {
                        l10Var3 = objP25;
                        au1Var = au1Var2;
                    }
                    m0x0.t(fetVar9, au1Var, (Function2) l10Var3);
                    k3t0 k3t0VarG9 = au1Var.G0();
                    boolean zI25 = fetVar9.i(k3t0VarG9);
                    Object objP26 = fetVar9.P();
                    if (zI25 || objP26 == cl5Var) {
                        objP26 = new ln1(1, k3t0VarG9, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                        fetVar9.o0(objP26);
                    }
                    fre0.b(null, pz40VarY6, xczVarA, d9zVarA2, xczVarA2, xczVarA3, (Function1) ((jhy) objP26), fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 20:
                uv1 uv1Var = (uv1) obj3;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((String) obj2).getClass();
                uv1Var.getClass();
                if ((th4 instanceof ConnectException) || (th4 instanceof UnknownHostException)) {
                    c4m0 c4m0Var = uv1Var.O;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    uv1Var.O = sac.T(new fnq(dtb.U(new lr(uv1Var.p.b(), (byte) 12), 1), new pv1(uv1Var, x2qVar, b3), (byte) 4), d5c.S(jiu0.a(uv1Var), uv1Var.L.b), new i8(2, uv1Var, uv1.class, "onHandleContentError", "onHandleContentError(Ljava/lang/Throwable;)V", 4, (byte) 17));
                }
                return Unit.f46060a;
            case 21:
                gqt0 gqt0Var = (gqt0) obj3;
                yu1 yu1Var = (yu1) obj2;
                ((oyg0) obj).getClass();
                yu1Var.getClass();
                gu1 gu1Var = yu1Var.p;
                return yu1.a(yu1Var, null, false, null, null, null, null, null, gu1Var != null ? gu1.a(gu1Var, false, null, gqt0Var, 0L, null, 253951) : null, null, false, false, false, null, null, null, null, null, 33521663);
            case 22:
                ((Integer) obj2).getClass();
                unh0.a((xv1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                lv00.g((qw1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ty1 ty1Var = (ty1) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                rek0 rek0Var4 = ty1.R1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    pz40 pz40VarY7 = ((i3t0) ty1Var.G0()).y(fetVar10);
                    k3t0 k3t0VarG10 = ty1Var.G0();
                    boolean zI26 = fetVar10.i(ty1Var);
                    Object objP27 = fetVar10.P();
                    if (zI26 || objP27 == cl5Var) {
                        ln1 ln1Var2 = new ln1(1, ty1Var, ty1.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/aggregator/impl/tournaments/presentation/models/tournaments_list/AggregatorTournamentsSideEffect;)V", 0, (byte) 6);
                        fetVar10.o0(ln1Var2);
                        objP27 = ln1Var2;
                    }
                    lkz lkzVar9 = lkz.f20223a;
                    pz40 pz40VarF9 = androidx.compose.runtime.e.f((Function1) ((jhy) objP27), fetVar10);
                    boolean zI27 = fetVar10.i(k3t0VarG10) | fetVar10.i(ty1Var) | fetVar10.e(3) | fetVar10.g(pz40VarF9);
                    Object objP28 = fetVar10.P();
                    if (zI27 || objP28 == cl5Var) {
                        l10 l10Var9 = new l10(k3t0VarG10, ty1Var, pz40VarF9, null, (byte) 14);
                        fetVar10.o0(l10Var9);
                        objP28 = l10Var9;
                    }
                    m0x0.t(fetVar10, ty1Var, (Function2) objP28);
                    kz1 kz1Var = (kz1) pz40VarY7.getValue();
                    k3t0 k3t0VarG11 = ty1Var.G0();
                    boolean zI28 = fetVar10.i(k3t0VarG11);
                    Object objP29 = fetVar10.P();
                    if (zI28 || objP29 == cl5Var) {
                        ln1 ln1Var3 = new ln1(1, k3t0VarG11, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                        fetVar10.o0(ln1Var3);
                        objP29 = ln1Var3;
                    }
                    ccq0.a(kz1Var, (Function1) ((jhy) objP29), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                fre0.d((n4i0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return a(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Date date = (Date) obj3;
                oyg0 oyg0Var = (oyg0) obj;
                g72 g72Var = (g72) obj2;
                oyg0Var.getClass();
                g72Var.getClass();
                q7x.F(oyg0Var, date, "KEY_CURRENT_DATE");
                xun xunVar = xun.f41520a;
                q7x.F(oyg0Var, xunVar, "KEY_SELECTED_IDS");
                return g72.a(g72Var, null, date, false, null, false, false, false, false, false, xunVar, null, null, 458749);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                n92 n92Var = (n92) obj3;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((String) obj2).getClass();
                th5.printStackTrace();
                long j4 = ((d92) n92Var.D()).b.d.g;
                if (j4 == 1) {
                    roi0 roi0Var = n92Var.I;
                    bqk0 bqk0Var = new bqk0(th5);
                    l6l l6lVar = (l6l) roi0Var.f30839a;
                    l6lVar.getClass();
                    l6lVar.f19511a.f22948a.o(null, bqk0Var);
                } else if (j4 == 2) {
                    ugf0 ugf0Var = n92Var.H;
                    bqk0 bqk0Var2 = new bqk0(th5);
                    f310 f310Var = (f310) ugf0Var.f35622a;
                    f310Var.getClass();
                    f310Var.f8839a.f40047a.o(null, bqk0Var2);
                } else if (j4 == 46) {
                    o470 o470Var = n92Var.G;
                    bqk0 bqk0Var3 = new bqk0(th5);
                    oh9 oh9Var = (oh9) o470Var.f24619a;
                    oh9Var.getClass();
                    oh9Var.f25256a.f23522a.o(null, bqk0Var3);
                }
                return Unit.f46060a;
            default:
                uf50 uf50Var2 = (uf50) obj3;
                d92 d92Var = (d92) obj2;
                yi50 yi50Var = d92Var.f;
                xi50 xi50Var = yi50Var instanceof xi50 ? (xi50) yi50Var : null;
                if (xi50Var != null && (uf50Var = xi50Var.f40928a) != null) {
                    bj50VarV = q0x.V(uf50Var);
                }
                return uf50Var2 == null ? d92.a(d92Var, null, null, null, vi50.f37461a, null, 0L, null, 1503) : d92.a(d92Var, null, null, null, new xi50(uf50Var2), null, 0L, bj50VarV, 1503);
        }
    }

    public /* synthetic */ o00(Object obj, int i, byte b) {
        this.f24396a = b;
        this.b = obj;
    }
}
