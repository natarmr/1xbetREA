package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$Categories;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$Recommended;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Champs$Line;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Champs$Live;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Disciplines;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Games$Line;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Cyber$Games$Live;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$OneXGames$Categories;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$Games$Line;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Sport$Games$Live;

/* JADX INFO: loaded from: classes2.dex */
public final class gq4 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11712a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public gq4(List list, djg djgVar, Function1 function1, a4x a4xVar) {
        this.f11712a = (byte) 2;
        this.b = list;
        this.d = djgVar;
        this.c = function1;
        this.e = a4xVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) ((a4x) this.b).get(iIntValue);
            fetVar.e0(-801035058);
            if (p6t0Var == null) {
                fetVar.e0(-800154783);
                fetVar.r(false);
            } else if (p6t0Var instanceof jzh0) {
                fetVar.e0(1775276544);
                zvw.t(null, (jzh0) p6t0Var, fetVar, 0);
                fetVar.r(false);
            } else if (p6t0Var instanceof uzh0) {
                fetVar.e0(1775279171);
                cww.l(null, (uzh0) p6t0Var, fetVar, 0);
                fetVar.r(false);
            } else if (p6t0Var instanceof ua5) {
                fetVar.e0(-800823112);
                ua5 ua5Var = (ua5) p6t0Var;
                Boolean boolValueOf = Boolean.valueOf(ua5Var.f);
                boolean zG = fetVar.g(p6t0Var);
                if ((((i & 112) ^ 48) <= 32 || !fetVar.e(iIntValue)) && (i & 48) != 32) {
                    z = false;
                }
                Object obj5 = this.d;
                boolean zG2 = zG | z | fetVar.g((a4x) obj5);
                Object obj6 = this.e;
                boolean zG3 = zG2 | fetVar.g((xcz) obj6);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG3 || objP == cl5Var) {
                    fs fsVar = new fs((Object) p6t0Var, iIntValue, obj5, obj6, (yje) null, (byte) 15);
                    fetVar.o0(fsVar);
                    objP = fsVar;
                }
                m0x0.t(fetVar, boolValueOf, (Function2) objP);
                Function1 function1 = this.c;
                boolean zG4 = fetVar.g(function1) | fetVar.g(p6t0Var);
                Object objP2 = fetVar.P();
                byte b = 19;
                if (zG4 || objP2 == cl5Var) {
                    objP2 = new z7(function1, p6t0Var, (byte) 19);
                    fetVar.o0(objP2);
                }
                Function0 function0 = (Function0) objP2;
                boolean zG5 = fetVar.g(function1);
                Object objP3 = fetVar.P();
                if (zG5 || objP3 == cl5Var) {
                    objP3 = new v6a0(function1, b);
                    fetVar.o0(objP3);
                }
                Function1 function2 = (Function1) objP3;
                boolean zG6 = fetVar.g(function1);
                Object objP4 = fetVar.P();
                if (zG6 || objP4 == cl5Var) {
                    objP4 = new v6a0(function1, (byte) 20);
                    fetVar.o0(objP4);
                }
                mrv.m(null, ua5Var, function0, function2, (Function1) objP4, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-800154783);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mm40 mm40Var = (mm40) this.d;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        oer0 oer0Var = (oer0) this.e;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            a2n a2nVar = (a2n) this.b.get(iIntValue);
            fetVar.e0(-1713214382);
            if (a2nVar == null) {
                fetVar.e0(-1712459998);
                fetVar.r(false);
            } else {
                boolean z = a2nVar instanceof y56;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(1191662382);
                    mm40 mm40VarB = g9z.b(g9zVar, mm40Var, null, 7);
                    y56 y56Var = (y56) a2nVar;
                    boolean z2 = oer0Var.c;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new v6a0(function1, (byte) 24);
                        fetVar.o0(objP);
                    }
                    vcc.i(mm40VarB, y56Var, z2, (Function1) objP, null, fetVar, 0, 16);
                    fetVar.r(false);
                } else if (a2nVar instanceof c2o0) {
                    fetVar.e0(1191674418);
                    mm40 mm40VarB2 = g9z.b(g9zVar, mm40Var, null, 7);
                    c2o0 c2o0Var = (c2o0) a2nVar;
                    boolean z3 = oer0Var.c;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new v6a0(function1, (byte) 25);
                        fetVar.o0(objP2);
                    }
                    hkb.n(mm40VarB2, c2o0Var, z3, (Function1) objP2, null, fetVar, 0, 16);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1712459998);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        xx7 xx7Var = gqw0.n;
        qj50 qj50Var = (qj50) this.d;
        g9zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            qdr0 qdr0Var = (qdr0) this.b.get(iIntValue);
            fetVar.e0(-414701141);
            if (qdr0Var == null) {
                z2 = false;
            } else {
                boolean z4 = qdr0Var instanceof t7r0;
                Function1 function1 = this.c;
                jm40 jm40Var = jm40.b;
                if (z4) {
                    fetVar.e0(263709762);
                    mm40 mm40VarE0 = o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "TOP_HEADER_SECTION");
                    zcl zclVar = qmk.f28987a;
                    t7r0 t7r0Var = (t7r0) qdr0Var;
                    s7r0.a(o7k0.d(s5x0.N(mm40VarE0, qmk.a(fetVar).e, t7r0Var.f33480a instanceof TopSectionKey.Header.BannerTape ? 4.0f : 8.0f, qmk.a(fetVar).e, 0.0f, 8), 1.0f), t7r0Var, function1, fetVar, 0);
                    fetVar.r(false);
                } else if (qdr0Var instanceof mer0) {
                    fetVar.e0(263732288);
                    mm40 mm40VarE1 = o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "SPORT_FILTER_TAPE_SECTION");
                    zcl zclVar2 = qmk.f28987a;
                    ufx.p(s5x0.N(mm40VarE1, 0.0f, 0.0f, 0.0f, 8.0f, 7), (mer0) qdr0Var, function1, fetVar, 0);
                    fetVar.r(false);
                } else if (qdr0Var instanceof azq0) {
                    fetVar.e0(263744880);
                    mm40 mm40VarB = g9z.b(g9zVar, jm40Var, null, 7);
                    zcl zclVar3 = qmk.f28987a;
                    azq0 azq0Var = (azq0) qdr0Var;
                    hmw0.g(s5x0.N(mm40VarB, 0.0f, azq0Var.c instanceof fq5 ? 0.0f : 8.0f, 0.0f, 8.0f, 5), azq0Var, qj50Var.c(TopSectionKey.BannerTape.f47127a, fetVar), this.c, fetVar, 0);
                    fetVar.r(false);
                } else if (qdr0Var instanceof v8r0) {
                    fetVar.e0(263763742);
                    p470.a(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "ONEXGAMES_TAPE_SECTION"), (v8r0) qdr0Var, function1, fetVar, 0);
                    fetVar.r(false);
                } else {
                    if (qdr0Var instanceof f4r0) {
                        fetVar.e0(263773878);
                        dem0.f(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "TOP_EVENTS_SECTION"), (f4r0) qdr0Var, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (qdr0Var instanceof oer0) {
                        fetVar.e0(263784239);
                        xcz xczVarC = qj50Var.c(TopSectionKey$Sport$Games$Live.f47157a, fetVar);
                        zcl zclVar4 = qmk.f28987a;
                        u7x.s(g9z.b(g9zVar, jm40Var, null, 7), (oer0) qdr0Var, xczVarC, new qw3(8.0f, true, new gne(xx7Var, (byte) 12)), s5x0.t(qmk.a(fetVar).c, 0.0f, 2), this.c, fetVar, 0);
                        fetVar = fetVar;
                        z2 = false;
                        fetVar.r(false);
                    } else if (qdr0Var instanceof ner0) {
                        fetVar.e0(263802319);
                        xcz xczVarC2 = qj50Var.c(TopSectionKey$Sport$Games$Line.f47156a, fetVar);
                        zcl zclVar5 = qmk.f28987a;
                        r7x.o(g9z.b(g9zVar, jm40Var, null, 7), (ner0) qdr0Var, xczVarC2, new qw3(8.0f, true, new gne(xx7Var, (byte) 12)), s5x0.t(qmk.a(fetVar).c, 0.0f, 2), this.c, fetVar, 0);
                        fetVar = fetVar;
                        z2 = false;
                        fetVar.r(false);
                    } else if (qdr0Var instanceof ker0) {
                        fetVar.e0(263820305);
                        q8x.t(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "SPORT_CHAMPS_LIVE_SECTION"), (ker0) qdr0Var, qj50Var.b(qdr0Var.getKey(), fetVar), this.c, fetVar, 0);
                        z2 = false;
                        fetVar.r(false);
                    } else {
                        if (qdr0Var instanceof cyq0) {
                            fetVar.e0(263833878);
                            mm40 mm40VarE2 = o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "AGGREGATOR_MONTH_PROVIDER_SECTION");
                            zcl zclVar6 = qmk.f28987a;
                            z3 = false;
                            y0x0.b(o7k0.d(s5x0.N(mm40VarE2, qmk.a(fetVar).c, 0.0f, qmk.a(fetVar).c, 8.0f, 2), 1.0f), (cyq0) qdr0Var, function1, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            boolean z5 = qdr0Var instanceof gyq0;
                            Object obj5 = this.e;
                            if (z5) {
                                fetVar.e0(263854545);
                                xf0.b(o7k0.d(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "AGGREGATOR_RECOMMENDED_GAMES_SECTION"), 1.0f), (gyq0) qdr0Var, qj50Var.b(TopSectionKey$Aggregator$Recommended.f47125a, fetVar), (hh80) obj5, this.c, fetVar, 3072);
                                fetVar = fetVar;
                                z2 = false;
                                fetVar.r(false);
                            } else if (qdr0Var instanceof jv60) {
                                fetVar.e0(263871640);
                                qxw.h(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "ONEXGAMES_CATEGORIES_SECTION"), (jv60) qdr0Var, qj50Var.c(TopSectionKey$OneXGames$Categories.f47151a, fetVar), this.c, fetVar, 0);
                                z2 = false;
                                fetVar.r(false);
                            } else {
                                if (qdr0Var instanceof v370) {
                                    fetVar.e0(263884950);
                                    g1x.g(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "ONEXGAMES_SPOTLIGHT_SECTION"), (v370) qdr0Var, qj50Var.c(qdr0Var.getKey(), fetVar), this.c, fetVar, 0);
                                    z = false;
                                    fetVar.r(false);
                                } else {
                                    z = false;
                                    if (qdr0Var instanceof jyq0) {
                                        fetVar.e0(263898362);
                                        y860.e(o7k0.d(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "AGGREGATOR_TOURNAMENTS_SECTION"), 1.0f), (jyq0) qdr0Var, function1, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (qdr0Var instanceof qfr0) {
                                        fetVar.e0(263910696);
                                        qfr0 qfr0Var = (qfr0) qdr0Var;
                                        hhm0.j(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "VIRTUAL_GAMES_SECTION"), qfr0Var, qj50Var.b(qfr0Var.f28651a, fetVar), (hh80) obj5, this.c, fetVar, 3072);
                                        fetVar = fetVar;
                                        z2 = false;
                                        fetVar.r(false);
                                    } else if (qdr0Var instanceof yxq0) {
                                        fetVar.e0(263925590);
                                        y9a.b(g9z.b(g9zVar, jm40Var, null, 7), (yxq0) qdr0Var, qj50Var.c(TopSectionKey$Aggregator$Categories.f47122a, fetVar), this.c, fetVar, 0);
                                        z2 = false;
                                        fetVar.r(false);
                                    } else if (qdr0Var instanceof fyq0) {
                                        fetVar.e0(263937032);
                                        z3 = false;
                                        cfx0.a(o2e.e0(s5x0.L(g9z.b(g9zVar, jm40Var, null, 7), xfn.a(fetVar).c, 0.0f, 2), "AGGREGATOR_PROMO_GAMES_SECTION"), (fyq0) qdr0Var, function1, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (qdr0Var instanceof o2r0) {
                                        fetVar.e0(263950866);
                                        bfb.h(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "CYBER_DISCIPLINES_SECTION"), (o2r0) qdr0Var, qj50Var.c(TopSectionKey$Cyber$Disciplines.f47130a, fetVar), this.c, fetVar, 0);
                                        z2 = false;
                                        fetVar.r(false);
                                    } else if (qdr0Var instanceof q2r0) {
                                        fetVar.e0(-407048544);
                                        xcz xczVarC3 = qj50Var.c(TopSectionKey$Cyber$Games$Live.f47132a, fetVar);
                                        zcl zclVar7 = qmk.f28987a;
                                        sj3.f(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "CYBER_GAMES_LIVE_SECTION"), (q2r0) qdr0Var, xczVarC3, (hh80) obj5, new qw3(8.0f, true, new jf4((byte) 14)), this.c, fetVar, 3072);
                                        fetVar = fetVar;
                                        z2 = false;
                                        fetVar.r(false);
                                    } else if (qdr0Var instanceof p2r0) {
                                        fetVar.e0(-406500960);
                                        xcz xczVarC4 = qj50Var.c(TopSectionKey$Cyber$Games$Line.f47131a, fetVar);
                                        zcl zclVar8 = qmk.f28987a;
                                        ulb.e(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "CYBER_GAMES_LINE_SECTION"), (p2r0) qdr0Var, xczVarC4, (hh80) obj5, new qw3(8.0f, true, new jf4((byte) 14)), this.c, fetVar, 3072);
                                        fetVar = fetVar;
                                        z2 = false;
                                        fetVar.r(false);
                                    } else if (qdr0Var instanceof k2r0) {
                                        fetVar.e0(263999313);
                                        obb.j(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "CYBER_CHAMPS_LIVE_SECTION"), (k2r0) qdr0Var, qj50Var.c(TopSectionKey$Cyber$Champs$Live.f47129a, fetVar), this.c, fetVar, 0);
                                        z2 = false;
                                        fetVar.r(false);
                                    } else if (qdr0Var instanceof i2r0) {
                                        fetVar.e0(264012401);
                                        lmc.g(o2e.e0(g9z.b(g9zVar, jm40Var, null, 7), "CYBER_CHAMPS_LINE_SECTION"), (i2r0) qdr0Var, qj50Var.c(TopSectionKey$Cyber$Champs$Line.f47128a, fetVar), this.c, fetVar, 0);
                                        z2 = false;
                                        fetVar.r(false);
                                    } else {
                                        z2 = false;
                                    }
                                }
                                z2 = z;
                            }
                        }
                        z2 = z3;
                    }
                    fetVar.r(z2);
                }
                z2 = false;
                fetVar.r(z2);
            }
            fetVar.e0(264024369);
            fetVar.r(z2);
            fetVar.r(z2);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:491:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:71:0x017a  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        wui0 wui0Var;
        int i3;
        fet fetVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        mm40 mm40Var;
        mm40 mm40VarN;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        byte b = this.f11712a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.c;
        cl5 cl5Var = ukd.f35823a;
        Object obj5 = this.e;
        Object obj6 = this.d;
        List list = this.b;
        boolean z = true;
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
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue);
                    fetVar3.e0(1376729189);
                    if (p6t0Var == null) {
                        fetVar = fetVar3;
                        fetVar.e0(-925395734);
                        fetVar.r(false);
                    } else {
                        boolean z2 = p6t0Var instanceof iq4;
                        jm40 jm40Var2 = jm40.b;
                        if (z2) {
                            fetVar3.e0(1376773239);
                            zcl zclVar = qmk.f28987a;
                            bsr0.d((iq4) p6t0Var, s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 6.0f, 7), fetVar3, 0);
                            fetVar3.r(false);
                            fetVar = fetVar3;
                        } else if (p6t0Var instanceof xo4) {
                            fetVar3.e0(1377077070);
                            xo4 xo4Var = (xo4) p6t0Var;
                            zcl zclVar2 = qmk.f28987a;
                            x4d0.e(xo4Var, this.c, (Function1) obj6, (Function1) obj5, s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), fetVar3, 0);
                            fetVar = fetVar3;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar3;
                            fetVar.e0(-925395734);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                xhc xhcVar = (xhc) obj6;
                wpq wpqVar = (wpq) obj5;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    u95 u95Var = (u95) list.get(iIntValue3);
                    fetVar4.e0(1359506054);
                    tui0 tui0Var = new tui0(u95Var.f35266a + Separators.SP + xhcVar.c, null);
                    nvi0 nvi0Var = new nvi0(u95Var.b);
                    if (iIntValue3 == xhcVar.f40883a.size() - 1) {
                        wui0Var = wui0.d;
                    } else {
                        wui0Var = iIntValue3 == 0 ? wui0.b : wui0.c;
                    }
                    rqm rqmVar = new rqm((vui0) tui0Var, (pui0) null, (pvi0) nvi0Var, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 442);
                    boolean zI = fetVar4.i(wpqVar) | fetVar4.g(function1) | fetVar4.i(u95Var);
                    Object objP = fetVar4.P();
                    if (zI || objP == cl5Var) {
                        objP = new rhc(wpqVar, function1, u95Var, (byte) 0);
                        fetVar4.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI2 = fetVar4.i(wpqVar) | fetVar4.g(function1) | fetVar4.i(u95Var);
                    Object objP2 = fetVar4.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new rhc(wpqVar, function1, u95Var, (byte) 1);
                        fetVar4.o0(objP2);
                    }
                    obc.q(null, rqmVar, true, null, function0, null, (Function0) objP2, null, fetVar4, 384, 169);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar5.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar5.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar5.U(i3 & 1, (i3 & 147) != 146)) {
                    ejg ejgVar = (ejg) list.get(iIntValue5);
                    fetVar5.e0(61269636);
                    djg djgVar = (djg) obj6;
                    boolean zG = fetVar5.g(function1) | fetVar5.i(ejgVar);
                    Object objP3 = fetVar5.P();
                    if (zG || objP3 == cl5Var) {
                        objP3 = new lhf(function1, ejgVar, (byte) 5);
                        fetVar5.o0(objP3);
                    }
                    iiy[] iiyVarArr = iw5.j2;
                    kwd kwdVar = djg.n2;
                    djgVar.P0(ejgVar, (Function0) objP3, fetVar5, 512);
                    if (iIntValue5 < ((a4x) obj5).size() - 1) {
                        fetVar5.e0(61400734);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar3 = qmk.f28987a;
                        mbc.o(zfi0.f44303a, s5x0.L(mm40VarD, 12.0f, 0.0f, 2), false, fetVar5, 6, 4);
                        fetVar2 = fetVar5;
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar5;
                        fetVar2.e0(61666528);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar6.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar6.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar6.U(i4 & 1, (i4 & 147) != 146)) {
                    y95 y95Var = (y95) list.get(iIntValue7);
                    fetVar6.e0(238652617);
                    float f = xfn.a(fetVar6).d;
                    mm40 mm40VarN2 = jm40.b;
                    mm40 mm40VarL = s5x0.L(mm40VarN2, f, 0.0f, 2);
                    if (iIntValue7 == ((voz) obj6).f37788a.size() - 1) {
                        float fA = ((hh80) obj5).a();
                        zcl zclVar4 = qmk.f28987a;
                        mm40VarN2 = s5x0.N(mm40VarN2, 0.0f, 0.0f, 0.0f, fA + 8.0f, 7);
                    }
                    mm40 mm40VarE = mm40VarL.e(mm40VarN2);
                    rqm rqmVar2 = new rqm((vui0) new tui0(y95Var.c, null), (pui0) null, (pvi0) new nvi0(y95Var.e), (d4d) null, (tvi0) null, y95Var.d, false, (e900) null, 442);
                    boolean zG2 = fetVar6.g(function1) | fetVar6.g(y95Var);
                    Object objP4 = fetVar6.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new toz(function1, y95Var, (byte) 0);
                        fetVar6.o0(objP4);
                    }
                    Function0 function2 = (Function0) objP4;
                    boolean zG3 = fetVar6.g(function1) | fetVar6.g(y95Var);
                    Object objP5 = fetVar6.P();
                    if (zG3 || objP5 == cl5Var) {
                        objP5 = new toz(function1, y95Var, (byte) 1);
                        fetVar6.o0(objP5);
                    }
                    obc.q(mm40VarE, rqmVar2, false, null, function2, null, (Function0) objP5, null, fetVar6, 384, 168);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar7.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar7.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar7.U(i5 & 1, (i5 & 147) != 146)) {
                    v95 v95Var = (v95) list.get(iIntValue9);
                    fetVar7.e0(721308195);
                    int size = ((ppz) obj6).f27393a.size() - 1;
                    mm40 mm40VarN3 = jm40.b;
                    if (iIntValue9 == size) {
                        float fA2 = ((hh80) obj5).a();
                        zcl zclVar5 = qmk.f28987a;
                        mm40VarN3 = s5x0.N(mm40VarN3, 0.0f, 0.0f, 0.0f, fA2 + 8.0f, 7);
                    }
                    mm40 mm40Var2 = mm40VarN3;
                    rqm rqmVar3 = new rqm((vui0) new tui0(v95Var.c, null), (pui0) null, (pvi0) new nvi0(v95Var.e), (d4d) null, (tvi0) null, v95Var.d, false, (e900) null, 442);
                    boolean zG4 = fetVar7.g(function1) | fetVar7.g(v95Var);
                    Object objP6 = fetVar7.P();
                    if (zG4 || objP6 == cl5Var) {
                        objP6 = new jpz(function1, v95Var, (byte) 0);
                        fetVar7.o0(objP6);
                    }
                    Function0 function3 = (Function0) objP6;
                    boolean zG5 = fetVar7.g(function1) | fetVar7.g(v95Var);
                    Object objP7 = fetVar7.P();
                    if (zG5 || objP7 == cl5Var) {
                        objP7 = new jpz(function1, v95Var, (byte) 1);
                        fetVar7.o0(objP7);
                    }
                    obc.q(mm40Var2, rqmVar3, false, null, function3, null, (Function0) objP7, null, fetVar7, 384, 168);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar8.g(g9zVar6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar8.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar8.U(i6 & 1, (i6 & 147) != 146)) {
                    w95 w95Var = (w95) list.get(iIntValue11);
                    fetVar8.e0(876351541);
                    int size2 = ((kqz) obj6).f18741a.size() - 1;
                    mm40 mm40VarN4 = jm40.b;
                    if (iIntValue11 == size2) {
                        float fA3 = ((hh80) obj5).a();
                        zcl zclVar6 = qmk.f28987a;
                        mm40VarN4 = s5x0.N(mm40VarN4, 0.0f, 0.0f, 0.0f, fA3 + 8.0f, 7);
                    }
                    mm40 mm40Var3 = mm40VarN4;
                    rqm rqmVar4 = new rqm((vui0) new tui0(w95Var.c, null), (pui0) null, (pvi0) new nvi0(w95Var.e), (d4d) null, (tvi0) null, w95Var.d, false, (e900) null, 442);
                    boolean zG6 = fetVar8.g(function1) | fetVar8.g(w95Var);
                    Object objP8 = fetVar8.P();
                    if (zG6 || objP8 == cl5Var) {
                        objP8 = new eqz(function1, w95Var, (byte) 0);
                        fetVar8.o0(objP8);
                    }
                    Function0 function4 = (Function0) objP8;
                    boolean zG7 = fetVar8.g(function1) | fetVar8.g(w95Var);
                    Object objP9 = fetVar8.P();
                    if (zG7 || objP9 == cl5Var) {
                        objP9 = new eqz(function1, w95Var, (byte) 1);
                        fetVar8.o0(objP9);
                    }
                    obc.q(mm40Var3, rqmVar4, false, null, function4, null, (Function0) objP9, null, fetVar8, 384, 168);
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 6:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar9.g(g9zVar7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar9.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar9.U(i7 & 1, (i7 & 147) != 146)) {
                    m85 m85Var = (m85) list.get(iIntValue13);
                    fetVar9.e0(818011321);
                    float f2 = xfn.a(fetVar9).d;
                    mm40 mm40VarN5 = jm40.b;
                    mm40 mm40VarL2 = s5x0.L(mm40VarN5, f2, 0.0f, 2);
                    if (iIntValue13 == ((frz) obj6).f10042a.size() - 1) {
                        float fA4 = ((hh80) obj5).a();
                        zcl zclVar7 = qmk.f28987a;
                        mm40Var = mm40VarN5;
                        mm40VarN5 = s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, fA4 + 8.0f, 7);
                    } else {
                        mm40Var = mm40VarN5;
                    }
                    mm40 mm40VarE2 = mm40VarL2.e(mm40VarN5);
                    if (iIntValue13 == 0) {
                        zcl zclVar8 = qmk.f28987a;
                        mm40VarN = s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    } else {
                        mm40VarN = mm40Var;
                    }
                    mm40 mm40VarE3 = mm40VarE2.e(mm40VarN);
                    rqm rqmVar5 = new rqm((vui0) new tui0(m85Var.b, null), (pui0) null, (pvi0) new nvi0(m85Var.d), (d4d) null, (tvi0) null, m85Var.c, false, (e900) null, 442);
                    boolean zG8 = fetVar9.g(function1) | fetVar9.g(m85Var);
                    Object objP10 = fetVar9.P();
                    if (zG8 || objP10 == cl5Var) {
                        objP10 = new zqz(function1, m85Var, (byte) 0);
                        fetVar9.o0(objP10);
                    }
                    Function0 function5 = (Function0) objP10;
                    boolean zG9 = fetVar9.g(function1) | fetVar9.g(m85Var);
                    Object objP11 = fetVar9.P();
                    if (zG9 || objP11 == cl5Var) {
                        objP11 = new zqz(function1, m85Var, (byte) 1);
                        fetVar9.o0(objP11);
                    }
                    obc.q(mm40VarE3, rqmVar5, false, null, function5, null, (Function0) objP11, null, fetVar9, 384, 168);
                    fetVar9.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 7:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                kwj kwjVar = (kwj) obj6;
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar10.g(g9zVar8) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar10.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar10.U(i8 & 1, (i8 & 147) != 146)) {
                    mxl mxlVar = (mxl) ((ArrayList) list).get(iIntValue15);
                    fetVar10.e0(518977443);
                    int i14 = (i8 & 112) ^ 48;
                    boolean zG10 = fetVar10.g(function1) | ((i14 > 32 && fetVar10.e(iIntValue15)) || (i8 & 48) == 32);
                    Object objP12 = fetVar10.P();
                    if (zG10 || objP12 == cl5Var) {
                        objP12 = new bp40(function1, iIntValue15, (byte) 1);
                        fetVar10.o0(objP12);
                    }
                    mm40 mm40VarW = y860.W(jm40.b, null, null, false, null, (Function0) objP12, 28);
                    if ((i14 <= 32 || !fetVar10.e(iIntValue15)) && (i8 & 48) != 32) {
                        z = false;
                    }
                    boolean zG11 = fetVar10.g(kwjVar) | z;
                    Object objP13 = fetVar10.P();
                    if (zG11 || objP13 == cl5Var) {
                        objP13 = new ufe(iIntValue15, kwjVar, (cgk0) obj5);
                        fetVar10.o0(objP13);
                    }
                    mm40 mm40VarD0 = ro4.d0(mm40VarW, (Function1) objP13);
                    boolean zI3 = fetVar10.i(mxlVar);
                    Object objP14 = fetVar10.P();
                    if (zI3 || objP14 == cl5Var) {
                        objP14 = new caz(mxlVar, (byte) 6);
                        fetVar10.o0(objP14);
                    }
                    v3c.n(mm40VarD0, null, (Function1) objP14, fetVar10, 0, 2);
                    fetVar10.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 8:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                vne vneVar = (vne) obj5;
                xcz xczVar = (xcz) obj6;
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar11.g(g9zVar9) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar11.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar11.U(i9 & 1, (i9 & 147) != 146)) {
                    beo0 beo0Var = (beo0) list.get(iIntValue17);
                    fetVar11.e0(-789412575);
                    boolean zG12 = fetVar11.g(xczVar) | fetVar11.i(vneVar);
                    if ((((i9 & 112) ^ 48) <= 32 || !fetVar11.e(iIntValue17)) && (i9 & 48) != 32) {
                        z = false;
                    }
                    boolean zG13 = zG12 | z | fetVar11.g(function1);
                    Object objP15 = fetVar11.P();
                    if (zG13 || objP15 == cl5Var) {
                        objP15 = new qrb0(xczVar, vneVar, iIntValue17, function1);
                        fetVar11.o0(objP15);
                    }
                    mm40 mm40VarW2 = y860.W(jm40.b, null, null, false, null, (Function0) objP15, 28);
                    zcl zclVar9 = qmk.f28987a;
                    mm40 mm40VarL3 = s5x0.L(mm40VarW2, 4.0f, 0.0f, 2);
                    boolean zI4 = fetVar11.i(beo0Var);
                    Object objP16 = fetVar11.P();
                    if (zI4 || objP16 == cl5Var) {
                        objP16 = new caz(beo0Var, (byte) 12);
                        fetVar11.o0(objP16);
                    }
                    fbc.b(R.style.Widget_Chips_Secondary, 0, fetVar11, mm40VarL3, (Function1) objP16);
                    fetVar11.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 9:
                g9z g9zVar10 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar12.g(g9zVar10) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar12.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar12.U(i10 & 1, (i10 & 147) != 146)) {
                    ooh0 ooh0Var = (ooh0) list.get(iIntValue19);
                    fetVar12.e0(-1706537179);
                    dub.j(ooh0Var, (Function0) obj5, this.c, iIntValue19 == 0, iIntValue19 == q3d.i((a4x) obj6), g9z.b(g9zVar10, jm40Var, null, 7), fetVar12, 0);
                    fetVar12.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 10:
                g9z g9zVar11 = (g9z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                List list2 = (List) obj6;
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar13.g(g9zVar11) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar13.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar13.U(i11 & 1, (i11 & 147) != 146)) {
                    iqh0 iqh0Var = (iqh0) list.get(iIntValue21);
                    fetVar13.e0(-500484179);
                    boolean z3 = iIntValue21 == q3d.i(list2);
                    Iterator it = list2.iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i15 = -1;
                        } else if (((iqh0) it.next()) instanceof dqh0) {
                            i15++;
                        }
                    }
                    ccq0.y(iqh0Var, (Function0) obj5, this.c, iIntValue21 == i15, z3, fetVar13, 0);
                    fetVar13.r(false);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 11:
                return a(obj, obj2, obj3, obj4);
            case 12:
                mm40 mm40Var4 = (mm40) obj6;
                g9z g9zVar12 = (g9z) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                fet fetVar14 = (fet) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                ner0 ner0Var = (ner0) obj5;
                if ((iIntValue24 & 6) == 0) {
                    i12 = iIntValue24 | (fetVar14.g(g9zVar12) ? 4 : 2);
                } else {
                    i12 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i12 |= fetVar14.e(iIntValue23) ? 32 : 16;
                }
                if (fetVar14.U(1 & i12, (i12 & 147) != 146)) {
                    a2n a2nVar = (a2n) list.get(iIntValue23);
                    fetVar14.e0(-1929650878);
                    if (a2nVar == null) {
                        fetVar14.e0(-1928896494);
                        fetVar14.r(false);
                    } else if (a2nVar instanceof y56) {
                        fetVar14.e0(-477887426);
                        mm40 mm40VarB = g9z.b(g9zVar12, mm40Var4, null, 7);
                        y56 y56Var = (y56) a2nVar;
                        boolean z4 = ner0Var.b;
                        boolean zG14 = fetVar14.g(function1);
                        Object objP17 = fetVar14.P();
                        if (zG14 || objP17 == cl5Var) {
                            objP17 = new v6a0(function1, (byte) 22);
                            fetVar14.o0(objP17);
                        }
                        vcc.i(mm40VarB, y56Var, z4, (Function1) objP17, null, fetVar14, 0, 16);
                        fetVar14.r(false);
                    } else if (a2nVar instanceof c2o0) {
                        fetVar14.e0(-477875390);
                        mm40 mm40VarB2 = g9z.b(g9zVar12, mm40Var4, null, 7);
                        c2o0 c2o0Var = (c2o0) a2nVar;
                        boolean z5 = ner0Var.b;
                        boolean zG15 = fetVar14.g(function1);
                        Object objP18 = fetVar14.P();
                        if (zG15 || objP18 == cl5Var) {
                            objP18 = new v6a0(function1, (byte) 23);
                            fetVar14.o0(objP18);
                        }
                        hkb.n(mm40VarB2, c2o0Var, z5, (Function1) objP18, null, fetVar14, 0, 16);
                        fetVar14.r(false);
                    } else {
                        fetVar14.e0(-1928896494);
                        fetVar14.r(false);
                    }
                    fetVar14.r(false);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 13:
                return b(obj, obj2, obj3, obj4);
            case 14:
                return c(obj, obj2, obj3, obj4);
            default:
                g9z g9zVar13 = (g9z) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue26 = ((Number) obj4).intValue();
                if ((iIntValue26 & 6) == 0) {
                    i13 = iIntValue26 | (fetVar15.g(g9zVar13) ? 4 : 2);
                } else {
                    i13 = iIntValue26;
                }
                if ((iIntValue26 & 48) == 0) {
                    i13 |= fetVar15.e(iIntValue25) ? 32 : 16;
                }
                if (fetVar15.U(i13 & 1, (i13 & 147) != 146)) {
                    awr0 awr0Var = (awr0) list.get(iIntValue25);
                    fetVar15.e0(-1219348148);
                    ltt0.i(o7k0.d(jm40Var, 1.0f), awr0Var, this.c, (Function1) obj6, (xdr) obj5, fetVar15, 6);
                    fetVar15.r(false);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ gq4(List list, Object obj, Object obj2, Function1 function1, byte b) {
        this.f11712a = b;
        this.b = list;
        this.d = obj;
        this.e = obj2;
        this.c = function1;
    }

    public /* synthetic */ gq4(List list, Function1 function1, Object obj, Object obj2, byte b) {
        this.f11712a = b;
        this.b = list;
        this.c = function1;
        this.d = obj;
        this.e = obj2;
    }
}
