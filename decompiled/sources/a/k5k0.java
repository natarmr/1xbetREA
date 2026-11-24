package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.rating.impl.rating_history.screen.RatingHistoryScreen;
import org.xplatform.statistic.team.impl.team_completed_match.presentation.screen.CompletedMatchesTeamScreen;
import org.xplatform.statistic.team.impl.team_future_match.presentation.screen.FeatureMatchTeamScreen;
import org.xplatform.statistic.team.impl.team_rating_chart.presentation.screen.TeamRatingChartScreen;
import org.xplatform.statistic.team.impl.team_squad.presentation.TeamSquadStatisticScreen;
import org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam;
import org.xplatform.statistic.team.impl.team_transfer.presentation.screen.TeamTransfersScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class k5k0 extends i3t0 {
    public static final /* synthetic */ int J = 0;
    public final ieu A;
    public final TypeParam B;
    public final String C;
    public final long D;
    public final int E;
    public final int F;
    public bby G;
    public c4m0 H;
    public final c4m0 I;
    public final i1w0 o;
    public final fhj p;
    public final wyu q;
    public final duj r;
    public final f7u s;
    public final lyu t;
    public final u58 u;
    public final juu v;
    public final zr1 w;
    public final cge0 x;
    public final g9m0 y;
    public final yo4 z;

    public k5k0(i1w0 i1w0Var, mne mneVar, fhj fhjVar, ocl oclVar, wyu wyuVar, uyu uyuVar, m1e m1eVar, duj dujVar, f7u f7uVar, lyu lyuVar, u58 u58Var, juu juuVar, zr1 zr1Var, String str, cge0 cge0Var, g9m0 g9m0Var, r9u r9uVar, yo4 yo4Var, ieu ieuVar, pru pruVar, TypeParam typeParam, String str2, long j, int i, int i2) {
        i1w0Var.getClass();
        wyuVar.getClass();
        m1eVar.getClass();
        str.getClass();
        r9uVar.getClass();
        fkm fkmVar = new fkm(pruVar, fhjVar, str2, j, wyuVar);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 12);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, fkmVar, xuhVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = i1w0Var;
        this.p = fhjVar;
        this.q = wyuVar;
        this.r = dujVar;
        this.s = f7uVar;
        this.t = lyuVar;
        this.u = u58Var;
        this.v = juuVar;
        this.w = zr1Var;
        this.x = cge0Var;
        this.y = g9m0Var;
        this.z = yo4Var;
        this.A = ieuVar;
        this.B = typeParam;
        this.C = str2;
        this.D = j;
        this.E = i;
        this.F = i2;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new h5k0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), j5k0.h);
        c4m0 c4m0Var = this.I;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.I = sac.T(new fnq(m1eVar.b(), new yng0(this, yjeVar, (byte) 19), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new h5k0(this, yjeVar, (byte) 0));
        }
        P();
    }

    public final String M() {
        esp0 esp0Var = ((b5k0) D()).d;
        String str = esp0Var != null ? esp0Var.f8341a : null;
        return str == null ? "" : str;
    }

    public final String N() {
        esp0 esp0Var = ((b5k0) D()).d;
        String str = esp0Var != null ? esp0Var.c : null;
        return str == null ? "" : str;
    }

    public final void O() {
        Object value;
        bby bbyVar = this.G;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, b5k0.a((b5k0) value, null, null, null, true, false, false, 15)));
            this.G = i3t0.K(this, null, new g5k0(this, b), new em4(this, null), 1);
        }
    }

    public final void P() {
        c4m0 c4m0Var;
        c4m0 c4m0Var2 = this.H;
        byte b = 1;
        yje yjeVar = null;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.H) != null) {
            c4m0Var.cancel(null);
        }
        this.H = sac.T(new fnq(this.s.n(this.C), new h5k0(this, yjeVar, b), (byte) 4), jiu0.a(this), i5k0.h);
        O();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ifp0 ifp0Var;
        int i;
        String str;
        w4k0 w4k0Var = (w4k0) obj;
        w4k0Var.getClass();
        super.x(w4k0Var);
        boolean zEquals = w4k0Var.equals(t4k0.f33324a);
        byte b = 0;
        i1w0 i1w0Var = this.o;
        if (!zEquals) {
            if (w4k0Var.equals(v4k0.f36785a)) {
                O();
                return;
            }
            if (!(w4k0Var instanceof u4k0)) {
                t9f.b();
                return;
            }
            esp0 esp0Var = ((b5k0) D()).d;
            if (esp0Var != null) {
                ctp0 ctp0Var = ((u4k0) w4k0Var).f35054a;
                String str2 = esp0Var.c;
                this.u.i(ctp0Var.b);
                juu juuVar = this.v;
                int i2 = juuVar.f17177a.f11635a.f9885a.a().getInt("SPECIAL_EVENT_ID_PREF_KEY", 0);
                int i3 = this.F;
                if (i2 != 0 && !ctp0Var.equals(zsp0.c)) {
                    int i4 = juuVar.f17177a.f11635a.f9885a.a().getInt("SPECIAL_EVENT_ID_PREF_KEY", 0);
                    String strValueOf = String.valueOf(i3);
                    if (ctp0Var.equals(hsp0.c)) {
                        str = "stadium";
                    } else if (ctp0Var.equals(nsp0.c)) {
                        str = "future_matches";
                    } else if (ctp0Var.equals(osp0.c)) {
                        str = "finished_matches";
                    } else if (ctp0Var.equals(qsp0.c)) {
                        str = "team_transitions";
                    } else if (ctp0Var.equals(tsp0.c)) {
                        str = "rating";
                    } else if (ctp0Var.equals(usp0.c)) {
                        str = "rating_history";
                    } else {
                        str = ctp0Var.equals(xsp0.c) ? "team_list" : "";
                    }
                    this.w.t(i4, strValueOf, str);
                }
                if (ctp0Var instanceof xsp0) {
                    ifp0Var = ifp0.TEAM_LIST;
                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI.h(new TeamSquadStatisticScreen(N(), org.xplatform.statistic.team.impl.team_statistic.domain.models.c.a(this.B)));
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (!pawVar.hasNext()) {
                            break;
                        } else {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (ctp0Var instanceof hsp0) {
                    ifp0Var = ifp0.STADIUM;
                    i1w0Var.d(new g5k0(this, b));
                } else if (ctp0Var instanceof qsp0) {
                    ifp0Var = ifp0.TEAM_TRANSITIONS;
                    esp0 esp0Var2 = ((b5k0) D()).d;
                    if (esp0Var2 != null) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen teamTransfersScreen = new TeamTransfersScreen(esp0Var2.c);
                        if (teamTransfersScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) teamTransfersScreen)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(teamTransfersScreen)));
                        }
                        ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO2;
                            if (!pawVar2.hasNext()) {
                                break;
                            } else {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                        }
                    }
                } else if (ctp0Var instanceof osp0) {
                    ifp0Var = ifp0.FINISHED_MATCHES;
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    FragmentScreen completedMatchesTeamScreen = new CompletedMatchesTeamScreen(M());
                    if (completedMatchesTeamScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) completedMatchesTeamScreen)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(completedMatchesTeamScreen)));
                    }
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO3;
                        if (!pawVar3.hasNext()) {
                            break;
                        } else {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else if (ctp0Var instanceof nsp0) {
                    ifp0Var = ifp0.FUTURE_MATCHES;
                    CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                    FragmentScreen featureMatchTeamScreen = new FeatureMatchTeamScreen(M());
                    if (featureMatchTeamScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) featureMatchTeamScreen)));
                    } else {
                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(featureMatchTeamScreen)));
                    }
                    ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayListQ3, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO4;
                        if (!pawVar4.hasNext()) {
                            break;
                        } else {
                            i1w0Var.a((oe50) pawVar4.next());
                        }
                    }
                } else if (ctp0Var instanceof tsp0) {
                    ifp0Var = ifp0.RATING;
                    CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                    FragmentScreen teamRatingChartScreen = new TeamRatingChartScreen(N());
                    if (teamRatingChartScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) teamRatingChartScreen)));
                    } else {
                        copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(teamRatingChartScreen)));
                    }
                    ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayListQ4, 0);
                    while (true) {
                        paw pawVar5 = (paw) listIteratorO5;
                        if (!pawVar5.hasNext()) {
                            break;
                        } else {
                            i1w0Var.a((oe50) pawVar5.next());
                        }
                    }
                } else if (ctp0Var instanceof usp0) {
                    ifp0Var = ifp0.RATING_HISTORY;
                    CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                    this.y.getClass();
                    FragmentScreen ratingHistoryScreen = new RatingHistoryScreen(str2);
                    if (ratingHistoryScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) ratingHistoryScreen)));
                    } else {
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(ratingHistoryScreen)));
                    }
                    ListIterator listIteratorO6 = b1j.o(i1w0Var, copyOnWriteArrayListQ5, 0);
                    while (true) {
                        paw pawVar6 = (paw) listIteratorO6;
                        if (!pawVar6.hasNext()) {
                            break;
                        } else {
                            i1w0Var.a((oe50) pawVar6.next());
                        }
                    }
                } else {
                    if (!(ctp0Var instanceof zsp0)) {
                        t9f.b();
                        return;
                    }
                    ifp0Var = null;
                }
                if (ifp0Var == null || (i = this.E) == -1) {
                    return;
                }
                this.z.v(i, i3, ifp0Var);
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ6 = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ6, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ6, 0);
        while (true) {
            paw pawVar7 = (paw) listIteratorP;
            if (!pawVar7.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar7.next());
            }
        }
    }
}
