package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.LeaderBoardScreenParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.discipline_filter.model.LeaderboardDisciplineFilterParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.regions.LeaderboardRegionModelParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.teams_type.model.LeaderboardTeamsTypeModelParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter.LeaderboardTimeFilterModelParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter.LeaderboardTimeFilterYearsModel;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.type.model.LeaderboardTypeModelParams;

/* JADX INFO: loaded from: classes4.dex */
public final class eiz extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public bby A;
    public bby B;
    public bby C;
    public bby D;
    public final LeaderBoardScreenParams o;
    public final m1e p;
    public final ctf0 q;
    public final hzg r;
    public final j3c s;
    public final cmt t;
    public final e1u u;
    public final n4u v;
    public final rpt w;
    public final ih5 x;
    public final zr1 y;
    public c4m0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public eiz(LeaderBoardScreenParams leaderBoardScreenParams, mne mneVar, m1e m1eVar, g2v g2vVar, ctf0 ctf0Var, hzg hzgVar, j3c j3cVar, cmt cmtVar, e1u e1uVar, n4u n4uVar, rpt rptVar, ih5 ih5Var, zr1 zr1Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new rcz(leaderBoardScreenParams, (byte) 5), g090VarP, new o20(g2vVar, ctf0Var, (byte) 12), (yzn0) null);
        this.o = leaderBoardScreenParams;
        this.p = m1eVar;
        this.q = ctf0Var;
        this.r = hzgVar;
        this.s = j3cVar;
        this.t = cmtVar;
        this.u = e1uVar;
        this.v = n4uVar;
        this.w = rptVar;
        this.x = ih5Var;
        this.y = zr1Var;
        i3t0.K(this, null, null, new aiz(this, null, (byte) 0), 3);
    }

    public final List M() {
        long j = ((ihz) D()).b;
        if (j == 1) {
            return xhz.e;
        }
        if (j != 46) {
            return xhz.e;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(xhz.PRIZES_TYPE);
        lc00VarB.add(xhz.TEAMS_TYPE);
        return kotlin.collections.a.a(lc00VarB);
    }

    public final void N() {
        bby bbyVar = this.C;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.C = i3t0.K(this, null, null, new bu(this, null, (byte) 9), 3);
    }

    public final void O() {
        bby bbyVar = this.A;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.A = i3t0.K(this, null, null, new ciz(this, null, (byte) 1), 3);
    }

    public final void P() {
        int iOrdinal = ((ihz) D()).d.ordinal();
        if (iOrdinal == 0) {
            O();
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                N();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        bby bbyVar = this.D;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.D = i3t0.K(this, null, new z8z((byte) 10), new ciz(this, null, (byte) 0), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        l2h l2hVar;
        Object value4;
        Iterable iterable;
        rfz rfzVar = (rfz) obj;
        rfzVar.getClass();
        super.x(rfzVar);
        byte b = 10;
        yje yjeVar = null;
        if (!(rfzVar instanceof qfz)) {
            if (!(rfzVar instanceof efz)) {
                t9f.b();
                return;
            }
            efz efzVar = (efz) rfzVar;
            if (efzVar.equals(bfz.f2528a)) {
                E();
                return;
            }
            if (!efzVar.equals(cfz.f4287a)) {
                if (!efzVar.equals(dfz.f6022a)) {
                    t9f.b();
                    return;
                } else {
                    e3c.n(this.z);
                    this.z = i3t0.L(this, new fnq(this.p.b(), new slx(this, yjeVar, b), (byte) 4), null, null, 3);
                    return;
                }
            }
            bby bbyVar = this.A;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            bby bbyVar2 = this.C;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.B;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
                return;
            }
            return;
        }
        qfz qfzVar = (qfz) rfzVar;
        boolean zEquals = qfzVar.equals(ffz.f9466a);
        hzg hzgVar = this.r;
        if (zEquals) {
            ((uzg) hzgVar).a();
            return;
        }
        if (qfzVar instanceof kfz) {
            P();
            return;
        }
        boolean z = qfzVar instanceof gfz;
        byte b2 = 0;
        ctf0 ctf0Var = this.q;
        if (z) {
            long j = ((gfz) qfzVar).f11228a;
            if (j == 1) {
                G(new bhz(new LeaderboardDisciplineFilterParams(((ihz) D()).b, ((ihz) D()).h)));
                return;
            }
            if (j != 3) {
                if (j == 2) {
                    G(new ghz(new LeaderboardTypeModelParams(M(), ((ihz) D()).d)));
                    return;
                } else if (j == 4) {
                    G(new chz(new LeaderboardRegionModelParams(((ihz) D()).e)));
                    return;
                } else {
                    if (j == 5) {
                        G(new ehz(new LeaderboardTeamsTypeModelParams(((ihz) D()).f)));
                        return;
                    }
                    return;
                }
            }
            Pair pair = ((ihz) D()).k;
            if (pair == null || (iterable = (List) pair.b) == null) {
                iterable = iun.f15405a;
            }
            iterable.getClass();
            ctf0Var.getClass();
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(new LeaderboardTimeFilterYearsModel(0, ctf0Var.b.a(R.string.all_time_calendar, Arrays.copyOf(new Object[0], 0))));
            ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                lc00VarB.add(new LeaderboardTimeFilterYearsModel(iIntValue, String.valueOf(iIntValue)));
                arrayList.add(Boolean.TRUE);
            }
            G(new fhz(new LeaderboardTimeFilterModelParams(kotlin.collections.a.a(lc00VarB), ((ihz) D()).c)));
            return;
        }
        boolean z2 = qfzVar instanceof jfz;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z2) {
            l2h l2hVar2 = ((ihz) D()).i;
            j2h j2hVar = j2h.f15779a;
            boolean zEquals2 = l2hVar2.equals(j2hVar);
            k2h k2hVar = k2h.f17571a;
            if (zEquals2) {
                l2hVar = k2hVar;
            } else {
                if (!l2hVar2.equals(k2hVar)) {
                    t9f.b();
                    return;
                }
                l2hVar = j2hVar;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, ihz.a((ihz) value4, 0L, 0, null, null, null, null, null, l2hVar, null, null, null, null, null, false, false, false, 130815)));
            return;
        }
        if (qfzVar instanceof hfz) {
            hfz hfzVar = (hfz) qfzVar;
            if (((ihz) D()).b != hfzVar.f12993a) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, ihz.a((ihz) value3, hfzVar.f12993a, 0, xhz.PRIZES_TYPE, null, null, null, null, null, null, null, null, null, null, true, false, false, 114161)));
                M();
                O();
                return;
            }
            return;
        }
        if (qfzVar instanceof pfz) {
            xhz xhzVar = ((pfz) qfzVar).f26928a;
            if (((ihz) D()).d == xhzVar) {
                return;
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            while (true) {
                Object value5 = p7m0Var3.getValue();
                value5.getClass();
                oyg0Var.getClass();
                xhz xhzVar2 = xhzVar;
                if (p7m0Var3.m(value5, ihz.a((ihz) value5, 0L, 0, xhzVar2, null, null, null, null, null, null, null, null, null, null, false, false, false, 131063))) {
                    P();
                    return;
                }
                xhzVar = xhzVar2;
            }
        } else {
            if (qfzVar instanceof ofz) {
                ofz ofzVar = (ofz) qfzVar;
                if (((ihz) D()).c != ofzVar.f25191a) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var4.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value2, ihz.a((ihz) value2, 0L, ofzVar.f25191a, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 130555)));
                    O();
                    return;
                }
                return;
            }
            if (qfzVar instanceof lfz) {
                qgz qgzVar = ((lfz) qfzVar).f19981a;
                if (((ihz) D()).e != qgzVar) {
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    while (true) {
                        Object value6 = p7m0Var5.getValue();
                        value6.getClass();
                        oyg0Var.getClass();
                        qgz qgzVar2 = qgzVar;
                        if (p7m0Var5.m(value6, ihz.a((ihz) value6, 0L, 0, null, qgzVar2, null, null, null, null, null, null, null, null, null, false, false, false, 122863))) {
                            break;
                        } else {
                            qgzVar = qgzVar2;
                        }
                    }
                    bby bbyVar4 = this.D;
                    if (bbyVar4 != null) {
                        e3c.n(bbyVar4);
                    }
                    this.D = i3t0.K(this, null, new z8z(b), new ciz(this, yjeVar, b2), 1);
                    return;
                }
                return;
            }
            if (!(qfzVar instanceof nfz)) {
                if (!(qfzVar instanceof ifz)) {
                    if (!(qfzVar instanceof mfz)) {
                        t9f.b();
                        return;
                    }
                    p7m0 p7m0Var6 = ocjVar.f25029a;
                    do {
                        value = p7m0Var6.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var6.m(value, ihz.a((ihz) value, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 114687)));
                    return;
                }
                ifz ifzVar = (ifz) qfzVar;
                List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
                ArrayList arrayList2 = new ArrayList(r3d.q(listJ, 10));
                Iterator it2 = listJ.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((yxg) it2.next()).f43419a));
                }
                if (!arrayList2.contains(Long.valueOf(((ihz) D()).b)) || !ifzVar.c) {
                    G(new dhz(ctf0Var.b.a(R.string.snackbar_no_info_for_selected_team, Arrays.copyOf(new Object[0], 0))));
                    return;
                }
                this.x.p(r1g.CYBERSPORT_LEADERBOARD, ((ihz) D()).f14803a.b);
                this.y.z(((ihz) D()).f14803a.b, "cyber_leaderboard");
                ((uzg) hzgVar).n(((ihz) D()).b, ifzVar.f14710a, ifzVar.b, k1g.OPEN_REGULAR);
                return;
            }
            epe epeVar = ((nfz) qfzVar).f23459a;
            if (((ihz) D()).f == epeVar) {
                return;
            }
            p7m0 p7m0Var7 = ocjVar.f25029a;
            while (true) {
                Object value7 = p7m0Var7.getValue();
                value7.getClass();
                oyg0Var.getClass();
                epe epeVar2 = epeVar;
                if (p7m0Var7.m(value7, ihz.a((ihz) value7, 0L, 0, null, null, epeVar2, null, null, null, null, null, null, null, null, false, false, false, 124895))) {
                    N();
                    return;
                }
                epeVar = epeVar2;
            }
        }
    }
}
