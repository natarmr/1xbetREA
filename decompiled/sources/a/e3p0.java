package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final class e3p0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7149a = 0;
    public final ctf0 b;
    public final g2v c;

    public e3p0(kou0 kou0Var, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = g2vVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x01af  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x0223  */
    /* JADX WARN: Code duplicated, block: B:47:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0294  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    private final Object a(Object obj) {
        boolean z;
        j0g0 j0g0Var;
        ?? arrayList;
        ?? r3;
        boolean zIsEmpty;
        g2v g2vVar;
        gou0 fou0Var;
        boolean z2;
        boolean z3;
        imm immVar;
        boolean z4;
        kou0 kou0Var = (kou0) obj;
        kou0Var.getClass();
        String str = kou0Var.f18647a;
        boolean z5 = kou0Var.d;
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        j0g0 j0g0Var2 = kou0Var.b;
        if (j0g0Var2 != null || !z5) {
            z = z5;
            if (j0g0Var2 != null) {
                Object obj2 = j0g0Var2.f15681a;
                boolean z6 = obj2 instanceof g0g0;
                if (!z6) {
                    if (z6) {
                        obj2 = null;
                    }
                    Iterable iterable = (List) obj2;
                    if (iterable == null) {
                        iterable = iun.f15405a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (vqd.A(((ypl0) obj3).b, Locale.ROOT, str, false)) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList = new ArrayList(r3d.q(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        ypl0 ypl0Var = (ypl0) next;
                        ypl0Var.getClass();
                        String strValueOf = String.valueOf(i);
                        long j = ypl0Var.f43037a;
                        Iterator it2 = it;
                        b2l0 b2l0Var = new b2l0(ypl0Var.b, fbc.d(ctf0.b(R.attr.uikitTextPrimary, ctf0Var)));
                        zcl zclVar = qmk.f28987a;
                        arrayList.add(new hqu0(strValueOf, j, new zrm(b2l0Var, new t1l0(p1l0.CYBER_ICON, new y3d(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), ypl0Var.c.f19909a, null, null, null, 248), new v2l0(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), (d4d) null, new l3l0(16.0f), 40)));
                        i = i2;
                        j0g0Var2 = j0g0Var2;
                        it = it2;
                    }
                }
                zIsEmpty = r3.isEmpty();
                g2vVar = this.c;
                if (!zIsEmpty && !z) {
                    fou0Var = new fou0(ozb.Q(-1L, g2vVar));
                } else if (!zIsEmpty) {
                    fou0Var = eou0.f8153a;
                } else if (str.length() == 0) {
                    fou0Var = new fou0(ozb.P(-1L, g2vVar));
                } else {
                    fou0Var = new fou0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                }
                z2 = kou0Var.c;
                if (z2) {
                    immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), new nlm(new hmm(10, str, ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)), fmm.f9790a, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var)), true, null);
                    z3 = false;
                } else {
                    z3 = false;
                    immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), new plm(ctf0Var.b.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, fou0Var instanceof eou0, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var)), true, null);
                }
                lou0 lou0Var = new lou0(z2, str, immVar);
                a4x a4xVarO0 = dyb.o0(r3);
                if (j0g0Var == null || !z) {
                    z4 = z3;
                } else {
                    z4 = true;
                }
                return new mou0(lou0Var, fou0Var, a4xVarO0, z4);
            }
            j0g0Var = j0g0Var2;
            r3 = iun.f15405a;
            zIsEmpty = r3.isEmpty();
            g2vVar = this.c;
            if (!zIsEmpty) {
                if (!zIsEmpty) {
                    fou0Var = eou0.f8153a;
                } else if (str.length() == 0) {
                    fou0Var = new fou0(ozb.P(-1L, g2vVar));
                } else {
                    fou0Var = new fou0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                }
            } else if (!zIsEmpty) {
                fou0Var = eou0.f8153a;
            } else if (str.length() == 0) {
                fou0Var = new fou0(ozb.P(-1L, g2vVar));
            } else {
                fou0Var = new fou0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
            }
            z2 = kou0Var.c;
            if (z2) {
                immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), new nlm(new hmm(10, str, ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)), fmm.f9790a, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var)), true, null);
                z3 = false;
            } else {
                z3 = false;
                immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), new plm(ctf0Var.b.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, fou0Var instanceof eou0, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var)), true, null);
            }
            lou0 lou0Var2 = new lou0(z2, str, immVar);
            a4x a4xVarO1 = dyb.o0(r3);
            if (j0g0Var == null) {
                z4 = z3;
            } else {
                z4 = z3;
            }
            return new mou0(lou0Var2, fou0Var, a4xVarO1, z4);
        }
        z = z5;
        arrayList = q3d.j(new gqu0("shimmer_1"), new gqu0("shimmer_2"), new gqu0("shimmer_3"), new gqu0("shimmer_4"), new gqu0("shimmer_5"), new gqu0("shimmer_6"), new gqu0("shimmer_7"), new gqu0("shimmer_8"), new gqu0("shimmer_9"), new gqu0("shimmer_10"), new gqu0("shimmer_11"), new gqu0("shimmer_12"), new gqu0("shimmer_13"), new gqu0("shimmer_14"), new gqu0("shimmer_15"), new gqu0("shimmer_16"));
        j0g0Var = j0g0Var2;
        r3 = arrayList;
        zIsEmpty = r3.isEmpty();
        g2vVar = this.c;
        if (!zIsEmpty) {
            if (!zIsEmpty) {
                fou0Var = eou0.f8153a;
            } else if (str.length() == 0) {
                fou0Var = new fou0(ozb.P(-1L, g2vVar));
            } else {
                fou0Var = new fou0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
            }
        } else if (!zIsEmpty) {
            fou0Var = eou0.f8153a;
        } else if (str.length() == 0) {
            fou0Var = new fou0(ozb.P(-1L, g2vVar));
        } else {
            fou0Var = new fou0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
        }
        z2 = kou0Var.c;
        if (z2) {
            immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), new nlm(new hmm(10, str, ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)), fmm.f9790a, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var)), true, null);
            z3 = false;
        } else {
            z3 = false;
            immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), new plm(ctf0Var.b.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, fou0Var instanceof eou0, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var)), true, null);
        }
        lou0 lou0Var3 = new lou0(z2, str, immVar);
        a4x a4xVarO2 = dyb.o0(r3);
        if (j0g0Var == null) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        return new mou0(lou0Var3, fou0Var, a4xVarO2, z4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x022c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0231  */
    /* JADX WARN: Code duplicated, block: B:82:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0248  */
    /* JADX WARN: Code duplicated, block: B:88:0x024e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0258  */
    /* JADX WARN: Code duplicated, block: B:90:0x027f  */
    /* JADX WARN: Code duplicated, block: B:93:0x028a  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x0344 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0348  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        z2p0 z2p0Var;
        t2p0 s2p0Var;
        dtp0 dtp0Var;
        dtp0 dtp0Var2;
        ksp0 ksp0Var;
        lsp0 lsp0Var;
        int i;
        int i2;
        dtp0 dtp0Var3;
        wui0 wui0Var;
        z2p0 z2p0Var2;
        x2p0 x2p0Var;
        String str;
        String str2;
        k0p0 k0p0Var;
        Iterable iterableZ;
        boolean z;
        t1p0 t1p0Var;
        Object next;
        int i3;
        Object next2;
        boolean z2;
        cys0 cys0Var;
        char c;
        int i4;
        wui0 wui0Var2;
        String str3;
        ?? arrayList;
        int i5;
        ?? r2;
        boolean zIsEmpty;
        boolean z3;
        g2v g2vVar;
        bru0 aru0Var;
        boolean z4;
        String str4;
        imm immVar;
        boolean z5;
        switch (this.f7149a) {
            case 0:
                y3d y3dVar = null;
                z2p0 z2p0Var3 = (z2p0) obj;
                z2p0Var3.getClass();
                boolean z6 = z2p0Var3.f;
                x2p0 x2p0Var2 = z2p0Var3.e;
                if (z6 || x2p0Var2 == null) {
                    z2p0Var = z2p0Var3;
                    lc00 lc00VarB = kotlin.collections.a.b();
                    lc00VarB.add(new u2p0("TEAM_BET_TEAM_STATISTIC_HEADER", new ijm()));
                    lc00VarB.add(new w2p0(i1p0.f14011a));
                    lc00VarB.add(new a3p0(l1p0.f19267a));
                    lc00VarB.add(new u2p0("TEAM_BET_INDICATORS_HEADER", new ijm()));
                    zcl zclVar = qmk.f28987a;
                    lc00VarB.add(new b3p0("TEAM_BET_INDICATORS_SKELETON"));
                    lc00VarB.add(new u2p0("TEAM_BET_COMPLETED_MATCHES_HEADER", new ijm()));
                    lc00VarB.add(new b3p0("TEAM_BET_COMPLETED_MATCHES_SKELETON"));
                    s2p0Var = new s2p0(dyb.o0(kotlin.collections.a.a(lc00VarB)));
                } else {
                    boolean z7 = z2p0Var3.d;
                    g2v g2vVar2 = this.c;
                    if (z7) {
                        s2p0Var = new r2p0(g2v.b(g2vVar2, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        z2p0Var = z2p0Var3;
                    } else {
                        t1p0 t1p0Var2 = z2p0Var3.f43682a;
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        ctf0 ctf0Var = this.b;
                        if (t1p0Var2 != null) {
                            List list = t1p0Var2.f;
                            String str5 = z2p0Var3.c;
                            c1p0 c1p0Var = t1p0Var2.d;
                            int i6 = c1p0Var.c;
                            int i7 = c1p0Var.b;
                            int i8 = c1p0Var.f3585a;
                            if (i8 + i7 + i6 == 0) {
                                z2p0Var2 = z2p0Var3;
                                x2p0Var = x2p0Var2;
                                str = "TEAM_BET_COMPLETED_MATCHES_HEADER";
                                str2 = "TEAM_BET_INDICATORS_HEADER";
                            } else {
                                lsm0 lsm0Var = ctf0Var.b;
                                z2p0Var2 = z2p0Var3;
                                lsm0 lsm0Var2 = ctf0Var.b;
                                lc00VarB2.add(new u2p0("TEAM_BET_TEAM_STATISTIC_HEADER", new hjm(lsm0Var.a(R.string.statistic_team_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, lsm0Var2.a(R.string.team_bet_games_count, Arrays.copyOf(new Object[]{String.valueOf(i8 + i7 + i6)}, 1)), null, false, null, null, 8062)));
                                String strI = f140.i((i8 * 100) / ((i8 + i7) + i6), Separators.PERCENT);
                                String strA = lsm0Var2.a(R.string.team_bet_wins_subtitle, Arrays.copyOf(new Object[0], 0));
                                x2p0Var = x2p0Var2;
                                String strA2 = lsm0Var2.a(R.string.victories, Arrays.copyOf(new Object[0], 0));
                                int i9 = c1p0Var.f3585a;
                                String strValueOf = String.valueOf(i9);
                                StaticColors staticColors = StaticColors.INSTANCE;
                                g1p0 g1p0Var = new g1p0(i9, staticColors.m98getGreen0d7_KjU(), strA2, strValueOf);
                                str = "TEAM_BET_COMPLETED_MATCHES_HEADER";
                                String strA3 = lsm0Var2.a(R.string.fifa_draws_title, Arrays.copyOf(new Object[0], 0));
                                int i10 = c1p0Var.b;
                                g1p0 g1p0Var2 = new g1p0(i10, staticColors.m132getYellow0d7_KjU(), strA3, String.valueOf(i10));
                                str2 = "TEAM_BET_INDICATORS_HEADER";
                                String strA4 = lsm0Var2.a(R.string.fifa_loses_title, Arrays.copyOf(new Object[0], 0));
                                int i11 = c1p0Var.c;
                                lc00VarB2.add(new w2p0(new h1p0(dyb.o0(q3d.j(g1p0Var, g1p0Var2, new g1p0(i11, staticColors.m113getRed0d7_KjU(), strA4, String.valueOf(i11)))), strI, strA)));
                                List<w0p0> listD0 = CollectionsKt.D0(list, 5);
                                ArrayList arrayList2 = new ArrayList(r3d.q(listD0, 10));
                                for (w0p0 w0p0Var : listD0) {
                                    int i12 = d3p0.f5414a[w0p0Var.h.ordinal()];
                                    if (i12 == 3) {
                                        k0p0Var = k0p0.f17480a;
                                    } else if (i12 == 1 && w0p0Var.b.equals(str5)) {
                                        k0p0Var = k0p0.b;
                                    } else if (i12 == 2 && w0p0Var.c.equals(str5)) {
                                        k0p0Var = k0p0.b;
                                    } else {
                                        k0p0Var = i12 == 4 ? k0p0.f17480a : k0p0.c;
                                    }
                                    int iOrdinal = k0p0Var.ordinal();
                                    arrayList2.add(iOrdinal != 1 ? iOrdinal != 2 ? new n1p0(lsm0Var2.a(R.string.stage_table_status_draw, Arrays.copyOf(new Object[0], 0)), StaticColors.INSTANCE.m132getYellow0d7_KjU()) : new n1p0(lsm0Var2.a(R.string.stage_table_status_lose, Arrays.copyOf(new Object[0], 0)), StaticColors.INSTANCE.m113getRed0d7_KjU()) : new n1p0(lsm0Var2.a(R.string.stage_table_status_win, Arrays.copyOf(new Object[0], 0)), StaticColors.INSTANCE.m98getGreen0d7_KjU()));
                                }
                                if (arrayList2.size() == 5) {
                                    lc00VarB2.add(new a3p0(new k1p0(dyb.o0(arrayList2), lsm0Var2.a(R.string.stage_table_title_team_shape, Arrays.copyOf(new Object[0], 0)))));
                                }
                            }
                            s0p0 s0p0Var = t1p0Var2.e;
                            ctf0Var.getClass();
                            if (s0p0Var instanceof o0p0) {
                                iterableZ = iun.f15405a;
                            } else if (s0p0Var instanceof p0p0) {
                                p0p0 p0p0Var = (p0p0) s0p0Var;
                                Integer num = p0p0Var.f26164a;
                                lsm0 lsm0Var3 = ctf0Var.b;
                                Pair pairH = mym0.h(num, lsm0Var3.a(R.string.stage_table_full_title_count_goals_difference, Arrays.copyOf(new Object[0], 0)));
                                Pair pairH2 = mym0.h(p0p0Var.b, lsm0Var3.a(R.string.team_bet_indicator_teams_scored, Arrays.copyOf(new Object[0], 0)));
                                Integer num2 = p0p0Var.c;
                                Pair pairH3 = mym0.h(num2 != null ? mym0.p(num2.intValue()) : null, lsm0Var3.a(R.string.team_bet_indicator_total_goals_3, Arrays.copyOf(new Object[0], 0)));
                                Integer num3 = p0p0Var.d;
                                Pair pairH4 = mym0.h(num3 != null ? mym0.p(num3.intValue()) : null, lsm0Var3.a(R.string.team_bet_indicator_total_corners_10, Arrays.copyOf(new Object[0], 0)));
                                Integer num4 = p0p0Var.e;
                                iterableZ = tx3.z(new Pair[]{pairH, pairH2, pairH3, pairH4, mym0.h(num4 != null ? mym0.p(num4.intValue()) : null, lsm0Var3.a(R.string.team_bet_indicator_total_yellow_cards_5, Arrays.copyOf(new Object[0], 0)))});
                            } else if (s0p0Var instanceof q0p0) {
                                q0p0 q0p0Var = (q0p0) s0p0Var;
                                Integer num5 = q0p0Var.f27913a;
                                lsm0 lsm0Var4 = ctf0Var.b;
                                Pair pairH5 = mym0.h(num5, lsm0Var4.a(R.string.team_bet_indicator_diff_pucks, Arrays.copyOf(new Object[0], 0)));
                                Integer num6 = q0p0Var.b;
                                Pair pairH6 = mym0.h(num6 != null ? mym0.p(num6.intValue()) : null, lsm0Var4.a(R.string.team_bet_indicator_goals_5, Arrays.copyOf(new Object[0], 0)));
                                Integer num7 = q0p0Var.c;
                                iterableZ = tx3.z(new Pair[]{pairH5, pairH6, mym0.h(num7 != null ? mym0.p(num7.intValue()) : null, lsm0Var4.a(R.string.team_bet_indicator_total_goals_2, Arrays.copyOf(new Object[0], 0))), mym0.h(q0p0Var.d, lsm0Var4.a(R.string.team_bet_indicator_win_first, Arrays.copyOf(new Object[0], 0))), mym0.h(q0p0Var.e, lsm0Var4.a(R.string.team_bet_indicator_loss_first, Arrays.copyOf(new Object[0], 0)))});
                            } else if (s0p0Var instanceof r0p0) {
                                r0p0 r0p0Var = (r0p0) s0p0Var;
                                Integer num8 = r0p0Var.f29641a;
                                String strP = num8 != null ? mym0.p(num8.intValue()) : null;
                                lsm0 lsm0Var5 = ctf0Var.b;
                                Pair pairH7 = mym0.h(strP, lsm0Var5.a(R.string.team_bet_indicator_hold_serve, Arrays.copyOf(new Object[0], 0)));
                                Integer num9 = r0p0Var.b;
                                Pair pairH8 = mym0.h(num9 != null ? mym0.p(num9.intValue()) : null, lsm0Var5.a(R.string.team_bet_indicator_two_set_rate, Arrays.copyOf(new Object[0], 0)));
                                Pair pairH9 = mym0.h(r0p0Var.c, lsm0Var5.a(R.string.team_bet_indicator_win_count_3_set, Arrays.copyOf(new Object[0], 0)));
                                Pair pairH10 = mym0.h(r0p0Var.d, lsm0Var5.a(R.string.team_bet_indicator_win_count_loss_one_set, Arrays.copyOf(new Object[0], 0)));
                                Integer num10 = r0p0Var.e;
                                iterableZ = tx3.z(new Pair[]{pairH7, pairH8, pairH9, pairH10, mym0.h(num10 != null ? mym0.p(num10.intValue()) : null, lsm0Var5.a(R.string.team_bet_indicator_count_set_95, Arrays.copyOf(new Object[0], 0)))});
                            } else {
                                if (!(s0p0Var instanceof n0p0)) {
                                    if (s0p0Var instanceof m0p0) {
                                        m0p0 m0p0Var = (m0p0) s0p0Var;
                                        Integer num11 = m0p0Var.f20966a;
                                        lsm0 lsm0Var6 = ctf0Var.b;
                                        Pair pairH11 = mym0.h(num11, lsm0Var6.a(R.string.team_bet_indicator_diff_score, Arrays.copyOf(new Object[0], 0)));
                                        Pair pairH12 = mym0.h(m0p0Var.b, lsm0Var6.a(R.string.team_bet_indicator_total_avg_quarter, Arrays.copyOf(new Object[0], 0)));
                                        Pair pairH13 = mym0.h(m0p0Var.c, lsm0Var6.a(R.string.team_bet_indicator_total_avg_team_quarter, Arrays.copyOf(new Object[0], 0)));
                                        Integer num12 = m0p0Var.d;
                                        Pair pairH14 = mym0.h(num12 != null ? mym0.p(num12.intValue()) : null, lsm0Var6.a(R.string.team_bet_indicator_win_count_half_1, Arrays.copyOf(new Object[0], 0)));
                                        Integer num13 = m0p0Var.e;
                                        iterableZ = tx3.z(new Pair[]{pairH11, pairH12, pairH13, pairH14, mym0.h(num13 != null ? mym0.p(num13.intValue()) : null, lsm0Var6.a(R.string.team_bet_indicator_win_3_quarter_plus, Arrays.copyOf(new Object[0], 0)))});
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                n0p0 n0p0Var = (n0p0) s0p0Var;
                                Double d = n0p0Var.f22711a;
                                lsm0 lsm0Var7 = ctf0Var.b;
                                iterableZ = tx3.z(new Pair[]{mym0.h(d, lsm0Var7.a(R.string.team_bet_indicator_team_run_rate, Arrays.copyOf(new Object[0], 0))), mym0.h(n0p0Var.b, lsm0Var7.a(R.string.team_bet_indicator_team_bat_avg, Arrays.copyOf(new Object[0], 0))), mym0.h(n0p0Var.c, lsm0Var7.a(R.string.team_bet_indicator_team_bowl_avg, Arrays.copyOf(new Object[0], 0))), mym0.h(n0p0Var.d, lsm0Var7.a(R.string.team_bet_indicator_net_pro, Arrays.copyOf(new Object[0], 0)))});
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : iterableZ) {
                                String str6 = (String) ((Pair) obj2).b;
                                if (str6.length() > 0 && !str6.equals(Separators.PERCENT)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                lsm0 lsm0Var8 = ctf0Var.b;
                                hjm hjmVar = new hjm(lsm0Var8.a(R.string.team_bet_indicators, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, lsm0Var8.a(R.string.team_bet_games_count, Arrays.copyOf(new Object[]{String.valueOf(list.size())}, 1)), null, false, null, null, 8062);
                                String str7 = str2;
                                lc00VarB2.add(new u2p0(str7, hjmVar));
                                int i13 = 0;
                                for (Object obj3 : arrayList3) {
                                    int i14 = i13 + 1;
                                    if (i13 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    Pair pair = (Pair) obj3;
                                    String strM = twn.m(i13, str7);
                                    y3d y3dVar2 = y3dVar;
                                    tui0 tui0Var = new tui0((String) pair.f46059a, y3dVar2);
                                    jvi0 jvi0Var = new jvi0((String) pair.b, y3dVar2);
                                    int size = arrayList3.size();
                                    if (size == 1) {
                                        wui0Var2 = wui0.f39793a;
                                    } else if (i13 == 0) {
                                        wui0Var2 = wui0.b;
                                    } else {
                                        wui0Var2 = i13 == size + (-1) ? wui0.d : wui0.c;
                                    }
                                    lc00VarB2.add(new p2p0(strM, new rqm((vui0) tui0Var, (pui0) null, (pvi0) jvi0Var, (d4d) null, (tvi0) null, wui0Var2, false, (e900) null, 442)));
                                    i13 = i14;
                                    y3dVar = null;
                                }
                            }
                            if (!list.isEmpty()) {
                                lsm0 lsm0Var9 = ctf0Var.b;
                                lc00VarB2.add(new u2p0(str, new hjm(lsm0Var9.a(R.string.completed_matches, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, list.size() > 5 ? new ue9(lsm0Var9.a(R.string.all, Arrays.copyOf(new Object[0], 0))) : null, null, 7166)));
                                Iterator it = CollectionsKt.D0(list, 5).iterator();
                                int i15 = 0;
                                while (it.hasNext()) {
                                    Object next3 = it.next();
                                    int i16 = i15 + 1;
                                    if (i15 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    w0p0 w0p0Var2 = (w0p0) next3;
                                    String str8 = w0p0Var2.f38362a;
                                    String str9 = w0p0Var2.e;
                                    String str10 = w0p0Var2.d;
                                    List list2 = t1p0Var2.c;
                                    long j = t1p0Var2.f33178a;
                                    x2p0 x2p0Var3 = x2p0Var;
                                    v5l0 v5l0Var = x2p0Var3.f40180a;
                                    Iterator it2 = it;
                                    boolean z8 = x2p0Var3.b;
                                    list2.getClass();
                                    Iterator it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next = it3.next();
                                            z = z8;
                                            t1p0Var = t1p0Var2;
                                            if (!Intrinsics.d(((c2p0) next).f3636a, w0p0Var2.b)) {
                                                t1p0Var2 = t1p0Var;
                                                z8 = z;
                                            }
                                        } else {
                                            z = z8;
                                            t1p0Var = t1p0Var2;
                                            next = null;
                                        }
                                    }
                                    c2p0 c2p0Var = (c2p0) next;
                                    Iterator it4 = list2.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            next2 = it4.next();
                                            Iterator it5 = it4;
                                            i3 = i16;
                                            if (!Intrinsics.d(((c2p0) next2).f3636a, w0p0Var2.c)) {
                                                it4 = it5;
                                                i16 = i3;
                                            }
                                        } else {
                                            i3 = i16;
                                            next2 = null;
                                        }
                                    }
                                    c2p0 c2p0Var2 = (c2p0) next2;
                                    if (list2.isEmpty()) {
                                        z2 = false;
                                    } else {
                                        if (!list2.isEmpty()) {
                                            Iterator it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    Iterator it7 = it6;
                                                    if (((c2p0) it6.next()).d.size() > 1) {
                                                        it6 = it7;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                }
                                            }
                                        }
                                        z2 = true;
                                    }
                                    boolean z9 = j == 66;
                                    boolean z10 = j == 4;
                                    if (z2) {
                                        cys0Var = cys0.c;
                                    } else if (z10) {
                                        cys0Var = cys0.e;
                                    } else {
                                        cys0Var = z9 ? cys0.d : cys0.f5194a;
                                    }
                                    cys0 cys0Var2 = cys0Var;
                                    long j2 = i15;
                                    String str11 = c2p0Var != null ? c2p0Var.b : null;
                                    String str12 = str11 == null ? "" : str11;
                                    String str13 = c2p0Var2 != null ? c2p0Var2.b : null;
                                    String str14 = str13 == null ? "" : str13;
                                    String strU = iym0.u(c2p0Var, cys0Var2);
                                    String strU2 = iym0.u(c2p0Var2, cys0Var2);
                                    String strT = iym0.t(c2p0Var);
                                    String strT2 = iym0.t(c2p0Var2);
                                    boolean z11 = w0p0Var2.i;
                                    long j3 = w0p0Var2.f;
                                    int iOrdinal2 = w0p0Var2.h.ordinal();
                                    if (iOrdinal2 != 0) {
                                        if (iOrdinal2 != 1) {
                                            c = 2;
                                            if (iOrdinal2 == 2) {
                                                z11 = z11;
                                                i4 = 2;
                                            } else if (iOrdinal2 != 3) {
                                                t9f.b();
                                                return null;
                                            }
                                        } else {
                                            z11 = z11;
                                            c = 2;
                                            i4 = 1;
                                        }
                                        lc00VarB2.add(new v2p0(str8, wwb.S(j2, cys0Var2, new kbo(str12, strU, str14, strU2, strT, strT2, str10, str9, z11, "", "", j3, i4, z, kotlin.collections.a.c(new Pair(str10, str9))), v5l0Var, ctf0Var, oim0.f25320a), x2p0Var3.c));
                                        it = it2;
                                        t1p0Var2 = t1p0Var;
                                        i15 = i3;
                                        x2p0Var = x2p0Var3;
                                    } else {
                                        c = 2;
                                    }
                                    i4 = 0;
                                    lc00VarB2.add(new v2p0(str8, wwb.S(j2, cys0Var2, new kbo(str12, strU, str14, strU2, strT, strT2, str10, str9, z11, "", "", j3, i4, z, kotlin.collections.a.c(new Pair(str10, str9))), v5l0Var, ctf0Var, oim0.f25320a), x2p0Var3.c));
                                    it = it2;
                                    t1p0Var2 = t1p0Var;
                                    i15 = i3;
                                    x2p0Var = x2p0Var3;
                                }
                            }
                            z2p0Var = z2p0Var2;
                        } else {
                            z2p0Var = z2p0Var3;
                        }
                        nfp0 nfp0Var = z2p0Var.b;
                        if (nfp0Var != null) {
                            ArrayList arrayList4 = nfp0Var.c;
                            if (!arrayList4.isEmpty()) {
                                String str15 = "TEAM_BET_MENU_HEADER";
                                lc00VarB2.add(new u2p0("TEAM_BET_MENU_HEADER", new hjm(ctf0Var.b.a(R.string.statistic, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it8 = arrayList4.iterator();
                                while (true) {
                                    boolean zHasNext = it8.hasNext();
                                    dtp0 dtp0Var4 = jsp0.f17064a;
                                    ksp0 ksp0Var2 = ksp0.f18826a;
                                    lsp0 lsp0Var2 = lsp0.f20591a;
                                    ysp0 ysp0Var = ysp0.f43181a;
                                    isp0 isp0Var = isp0.f15317a;
                                    rsp0 rsp0Var = rsp0.f31042a;
                                    psp0 psp0Var = psp0.f27525a;
                                    msp0 msp0Var = msp0.f22331a;
                                    wsp0 wsp0Var = wsp0.f39703a;
                                    ssp0 ssp0Var = ssp0.f32736a;
                                    vsp0 vsp0Var = vsp0.f37962a;
                                    btp0 btp0Var = btp0.f3193a;
                                    atp0 atp0Var = atp0.f1442a;
                                    if (zHasNext) {
                                        Object next4 = it8.next();
                                        ArrayList arrayList6 = arrayList4;
                                        int i17 = ((jfp0) next4).f16440a;
                                        Iterator it9 = it8;
                                        if (i17 != 30) {
                                            if (i17 == 55) {
                                                dtp0Var4 = ksp0Var2;
                                            } else if (i17 != 62) {
                                                switch (i17) {
                                                    case 17:
                                                        dtp0Var4 = ysp0Var;
                                                        break;
                                                    case 18:
                                                        dtp0Var4 = isp0Var;
                                                        break;
                                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                                        dtp0Var4 = rsp0Var;
                                                        break;
                                                    case 20:
                                                        dtp0Var4 = psp0Var;
                                                        break;
                                                    case 21:
                                                        dtp0Var4 = msp0Var;
                                                        break;
                                                    case 22:
                                                        dtp0Var4 = wsp0Var;
                                                        break;
                                                    default:
                                                        switch (i17) {
                                                            case 64:
                                                                dtp0Var4 = ssp0Var;
                                                                break;
                                                            case 65:
                                                                dtp0Var4 = vsp0Var;
                                                                break;
                                                            case 66:
                                                                dtp0Var4 = btp0Var;
                                                                break;
                                                            default:
                                                                dtp0Var4 = atp0Var;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                dtp0Var4 = lsp0Var2;
                                            }
                                        }
                                        if (!dtp0Var4.equals(atp0Var)) {
                                            arrayList5.add(next4);
                                        }
                                        arrayList4 = arrayList6;
                                        it8 = it9;
                                    } else {
                                        ArrayList arrayList7 = arrayList4;
                                        Iterator it10 = arrayList5.iterator();
                                        int i18 = 0;
                                        while (it10.hasNext()) {
                                            Object next5 = it10.next();
                                            int i19 = i18 + 1;
                                            if (i18 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            jfp0 jfp0Var = (jfp0) next5;
                                            Iterator it11 = it10;
                                            int i20 = jfp0Var.f16440a;
                                            if (i20 == 30) {
                                                dtp0Var = dtp0Var4;
                                            } else if (i20 == 55) {
                                                dtp0Var = ksp0Var2;
                                            } else if (i20 != 62) {
                                                switch (i20) {
                                                    case 17:
                                                        dtp0Var = ysp0Var;
                                                        break;
                                                    case 18:
                                                        dtp0Var = isp0Var;
                                                        break;
                                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                                        dtp0Var = rsp0Var;
                                                        break;
                                                    case 20:
                                                        dtp0Var = psp0Var;
                                                        break;
                                                    case 21:
                                                        dtp0Var = msp0Var;
                                                        break;
                                                    case 22:
                                                        dtp0Var = wsp0Var;
                                                        break;
                                                    default:
                                                        switch (i20) {
                                                            case 64:
                                                                dtp0Var = ssp0Var;
                                                                break;
                                                            case 65:
                                                                dtp0Var = vsp0Var;
                                                                break;
                                                            case 66:
                                                                dtp0Var = btp0Var;
                                                                break;
                                                            default:
                                                                dtp0Var = atp0Var;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                dtp0Var = lsp0Var2;
                                            }
                                            if (dtp0Var.equals(atp0Var)) {
                                                dtp0Var2 = dtp0Var4;
                                                ksp0Var = ksp0Var2;
                                                lsp0Var = lsp0Var2;
                                            } else {
                                                String strM2 = twn.m(jfp0Var.f16440a, str15);
                                                dtp0Var2 = dtp0Var4;
                                                ksp0Var = ksp0Var2;
                                                lsp0Var = lsp0Var2;
                                                m0x m0xVar = new m0x(dtp0Var.a(), null, 6);
                                                pz40 pz40Var = s6t0.f31722a;
                                                nui0 nui0Var = new nui0(null, null, m0xVar, new y3d(s6t0.b().f33626a.getPrimary()), null, null, 0.0f, 243);
                                                tui0 tui0Var2 = new tui0(jfp0Var.b, null);
                                                if (arrayList7.isEmpty()) {
                                                    i = 0;
                                                    i2 = 1;
                                                } else {
                                                    Iterator it12 = arrayList7.iterator();
                                                    i = 0;
                                                    while (it12.hasNext()) {
                                                        int i21 = ((jfp0) it12.next()).f16440a;
                                                        if (i21 == 30) {
                                                            dtp0Var3 = dtp0Var2;
                                                        } else if (i21 == 55) {
                                                            dtp0Var3 = ksp0Var;
                                                        } else if (i21 != 62) {
                                                            switch (i21) {
                                                                case 17:
                                                                    dtp0Var3 = ysp0Var;
                                                                    break;
                                                                case 18:
                                                                    dtp0Var3 = isp0Var;
                                                                    break;
                                                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                                                    dtp0Var3 = rsp0Var;
                                                                    break;
                                                                case 20:
                                                                    dtp0Var3 = psp0Var;
                                                                    break;
                                                                case 21:
                                                                    dtp0Var3 = msp0Var;
                                                                    break;
                                                                case 22:
                                                                    dtp0Var3 = wsp0Var;
                                                                    break;
                                                                default:
                                                                    switch (i21) {
                                                                        case 64:
                                                                            dtp0Var3 = ssp0Var;
                                                                            break;
                                                                        case 65:
                                                                            dtp0Var3 = vsp0Var;
                                                                            break;
                                                                        case 66:
                                                                            dtp0Var3 = btp0Var;
                                                                            break;
                                                                        default:
                                                                            dtp0Var3 = atp0Var;
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            dtp0Var3 = lsp0Var;
                                                        }
                                                        if (!dtp0Var3.equals(atp0Var) && (i = i + 1) < 0) {
                                                            q3d.o();
                                                            throw null;
                                                        }
                                                    }
                                                    i2 = 1;
                                                }
                                                if (i == i2) {
                                                    wui0Var = wui0.f39793a;
                                                } else if (i18 == 0) {
                                                    wui0Var = wui0.b;
                                                } else {
                                                    wui0Var = i18 == i + (-1) ? wui0.d : wui0.c;
                                                }
                                                lc00VarB2.add(new o2p0(strM2, new rqm((vui0) tui0Var2, (pui0) nui0Var, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 444), dtp0Var));
                                            }
                                            it10 = it11;
                                            i18 = i19;
                                            str15 = str15;
                                            dtp0Var4 = dtp0Var2;
                                            ksp0Var2 = ksp0Var;
                                            lsp0Var2 = lsp0Var;
                                        }
                                    }
                                }
                            }
                        }
                        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                        s2p0Var = !a4xVarO0.isEmpty() ? new q2p0(a4xVarO0) : new r2p0(g2v.b(g2vVar2, pb10.g, pdm.b, null, R.drawable.ic_glyph_circle_multievent, R.string.data_is_missing, R.string.team_bet_statistics_empty_description, 0, 0, 0L, 0L, 964));
                    }
                }
                return new c3p0(z2p0Var.g, s2p0Var);
            case 1:
                return a(obj);
            default:
                fru0 fru0Var = (fru0) obj;
                fru0Var.getClass();
                String str16 = fru0Var.f10036a;
                boolean z12 = fru0Var.d;
                ctf0 ctf0Var2 = this.b;
                ctf0Var2.getClass();
                j0g0 j0g0Var = fru0Var.b;
                if (j0g0Var != null || !z12) {
                    if (j0g0Var != null) {
                        Object obj4 = j0g0Var.f15681a;
                        boolean z13 = obj4 instanceof g0g0;
                        if (!z13) {
                            if (z13) {
                                obj4 = null;
                            }
                            Iterable iterable = (List) obj4;
                            if (iterable == null) {
                                iterable = iun.f15405a;
                            }
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj5 : iterable) {
                                if (vqd.A(((oru0) obj5).b, Locale.ROOT, str16, false)) {
                                    arrayList8.add(obj5);
                                }
                            }
                            arrayList = new ArrayList(r3d.q(arrayList8, 10));
                            int i22 = 0;
                            for (Object obj6 : arrayList8) {
                                int i23 = i22 + 1;
                                if (i22 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                oru0 oru0Var = (oru0) obj6;
                                oru0Var.getClass();
                                String strValueOf2 = String.valueOf(i22);
                                int i24 = oru0Var.f25753a;
                                String str17 = str16;
                                b2l0 b2l0Var = new b2l0(oru0Var.b, fbc.d(ctf0.b(R.attr.uikitTextPrimary, ctf0Var2)));
                                zcl zclVar2 = qmk.f28987a;
                                l3l0 l3l0Var = new l3l0(16.0f);
                                p1l0 p1l0Var = p1l0.CYBER_ICON;
                                y3d y3dVar3 = new y3d(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)));
                                String lowerCase = oru0Var.c.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                switch (lowerCase.hashCode()) {
                                    case -1659489568:
                                        if (lowerCase.equals("sports games")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_sports_games;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    case -1006804125:
                                        lowerCase.equals("others");
                                        i5 = R.drawable.ic_glyph_cyber_color_other;
                                        break;
                                    case -890655590:
                                        if (lowerCase.equals("vehicular combat games")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_equipment_simulators;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    case -822200911:
                                        if (lowerCase.equals("card games")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_card_games;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    case -694094064:
                                        if (lowerCase.equals("adventure")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_adventures;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    case -345269017:
                                        if (lowerCase.equals("shooters")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_shooter;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    case -212781067:
                                        if (lowerCase.equals("puzzles")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_puzzle;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    case 279860979:
                                        if (lowerCase.equals("fighting games")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_fighting;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    case 405911895:
                                        if (lowerCase.equals("online rpgs")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_online_role_playing;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    case 1321891888:
                                        if (lowerCase.equals("sports simulators")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_simulators_of_sports_games;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    case 1787798387:
                                        if (lowerCase.equals("strategy")) {
                                            i5 = R.drawable.ic_glyph_cyber_color_strategies;
                                        } else {
                                            i5 = R.drawable.ic_glyph_cyber_color_other;
                                        }
                                        break;
                                    default:
                                        i5 = R.drawable.ic_glyph_cyber_color_other;
                                        break;
                                }
                                arrayList.add(new tru0(strValueOf2, i24, new zrm(b2l0Var, new t1l0(p1l0Var, y3dVar3, null, Integer.valueOf(i5), new y3d(y3d.g), null, 228), (g3l0) null, (d4d) null, l3l0Var, 44)));
                                i22 = i23;
                                str16 = str17;
                            }
                        }
                        zIsEmpty = r2.isEmpty();
                        if (j0g0Var != null) {
                            z3 = j0g0Var.f15681a instanceof g0g0;
                        } else {
                            z3 = false;
                        }
                        g2vVar = this.c;
                        if (!(zIsEmpty || z12) || z3) {
                            aru0Var = new aru0(ozb.Q(-1L, g2vVar));
                        } else if (!zIsEmpty) {
                            aru0Var = zqu0.f44825a;
                        } else if (str3.length() == 0) {
                            aru0Var = new aru0(ozb.P(-1L, g2vVar));
                        } else {
                            aru0Var = new aru0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                        }
                        z4 = fru0Var.c;
                        if (z4) {
                            String str18 = str3;
                            str4 = str18;
                            immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2))), new nlm(new hmm(10, str18, ctf0Var2.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)), fmm.f9790a, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), true, null);
                        } else {
                            str4 = str3;
                            immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2))), new plm(ctf0Var2.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, aru0Var instanceof zqu0, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), true, null);
                        }
                        gru0 gru0Var = new gru0(z4, str4, immVar);
                        a4x a4xVarO1 = dyb.o0(r2);
                        if (j0g0Var == null || !z12) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        return new hru0(gru0Var, aru0Var, a4xVarO1, z5);
                    }
                    str3 = str16;
                    r2 = iun.f15405a;
                    zIsEmpty = r2.isEmpty();
                    if (j0g0Var != null) {
                        z3 = j0g0Var.f15681a instanceof g0g0;
                    } else {
                        z3 = false;
                    }
                    g2vVar = this.c;
                    if (zIsEmpty) {
                        if (!zIsEmpty) {
                            aru0Var = zqu0.f44825a;
                        } else if (str3.length() == 0) {
                            aru0Var = new aru0(ozb.P(-1L, g2vVar));
                        } else {
                            aru0Var = new aru0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                        }
                    } else if (!zIsEmpty) {
                        aru0Var = zqu0.f44825a;
                    } else if (str3.length() == 0) {
                        aru0Var = new aru0(ozb.P(-1L, g2vVar));
                    } else {
                        aru0Var = new aru0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                    }
                    z4 = fru0Var.c;
                    if (z4) {
                        String str19 = str3;
                        str4 = str19;
                        immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2))), new nlm(new hmm(10, str19, ctf0Var2.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)), fmm.f9790a, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), true, null);
                    } else {
                        str4 = str3;
                        immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2))), new plm(ctf0Var2.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, aru0Var instanceof zqu0, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), true, null);
                    }
                    gru0 gru0Var2 = new gru0(z4, str4, immVar);
                    a4x a4xVarO2 = dyb.o0(r2);
                    if (j0g0Var == null) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    return new hru0(gru0Var2, aru0Var, a4xVarO2, z5);
                }
                arrayList = q3d.j(new sru0("shimmer_1"), new sru0("shimmer_2"), new sru0("shimmer_3"), new sru0("shimmer_4"), new sru0("shimmer_5"), new sru0("shimmer_6"), new sru0("shimmer_7"), new sru0("shimmer_8"), new sru0("shimmer_9"), new sru0("shimmer_10"), new sru0("shimmer_11"), new sru0("shimmer_12"), new sru0("shimmer_13"), new sru0("shimmer_14"), new sru0("shimmer_15"), new sru0("shimmer_16"));
                str3 = str16;
                r2 = arrayList;
                zIsEmpty = r2.isEmpty();
                if (j0g0Var != null) {
                    z3 = j0g0Var.f15681a instanceof g0g0;
                } else {
                    z3 = false;
                }
                g2vVar = this.c;
                if (zIsEmpty) {
                    if (!zIsEmpty) {
                        aru0Var = zqu0.f44825a;
                    } else if (str3.length() == 0) {
                        aru0Var = new aru0(ozb.P(-1L, g2vVar));
                    } else {
                        aru0Var = new aru0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                    }
                } else if (!zIsEmpty) {
                    aru0Var = zqu0.f44825a;
                } else if (str3.length() == 0) {
                    aru0Var = new aru0(ozb.P(-1L, g2vVar));
                } else {
                    aru0Var = new aru0(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                }
                z4 = fru0Var.c;
                if (z4) {
                    String str110 = str3;
                    str4 = str110;
                    immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2))), new nlm(new hmm(10, str110, ctf0Var2.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)), fmm.f9790a, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), true, null);
                } else {
                    str4 = str3;
                    immVar = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2))), new plm(ctf0Var2.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, aru0Var instanceof zqu0, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), true, null);
                }
                gru0 gru0Var3 = new gru0(z4, str4, immVar);
                a4x a4xVarO3 = dyb.o0(r2);
                if (j0g0Var == null) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                return new hru0(gru0Var3, aru0Var, a4xVarO3, z5);
        }
    }

    public e3p0(fru0 fru0Var, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = g2vVar;
    }

    public e3p0(ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = g2vVar;
    }
}
