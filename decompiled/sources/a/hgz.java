package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.discipline_filter.model.LeaderboardDisciplineFilterParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.regions.LeaderboardRegionModelParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.teams_type.model.LeaderboardTeamsTypeModelParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter.LeaderboardTimeFilterModelParams;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.type.model.LeaderboardTypeModelParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hgz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13036a;
    public final /* synthetic */ jgz b;

    public /* synthetic */ hgz(jgz jgzVar, byte b) {
        this.f13036a = b;
        this.b = jgzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f13036a;
        jgz jgzVar = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                tqt tqtVar = jgz.Q1;
                jgzVar.G0().x(new hfz(jLongValue));
                return Unit.f46060a;
            case 1:
                rfz rfzVar = (rfz) obj;
                tqt tqtVar2 = jgz.Q1;
                rfzVar.getClass();
                jgzVar.G0().x(rfzVar);
                return Unit.f46060a;
            case 2:
                hhz hhzVar = (hhz) obj;
                tqt tqtVar3 = jgz.Q1;
                hhzVar.getClass();
                boolean z = hhzVar instanceof bhz;
                jgz jgzVar2 = this.b;
                if (z) {
                    bhz bhzVar = (bhz) hhzVar;
                    String name = zis0.class.getName();
                    if (jgzVar2.C().J(name) == null) {
                        sqt sqtVar = cgz.m2;
                        LeaderboardDisciplineFilterParams leaderboardDisciplineFilterParams = bhzVar.f2633a;
                        sqtVar.getClass();
                        cgz cgzVar = new cgz();
                        cgzVar.l2.J(cgzVar, cgz.n2[0], leaderboardDisciplineFilterParams);
                        cgzVar.H0(jgzVar2.C(), name);
                    }
                } else if (hhzVar instanceof ghz) {
                    ghz ghzVar = (ghz) hhzVar;
                    String name2 = vhz.class.getName();
                    if (jgzVar2.C().J(name2) == null) {
                        rqt rqtVar = vhz.l2;
                        LeaderboardTypeModelParams leaderboardTypeModelParams = ghzVar.f11321a;
                        rqtVar.getClass();
                        vhz vhzVar = new vhz();
                        vhzVar.k2.J(vhzVar, vhz.m2[0], leaderboardTypeModelParams);
                        vhzVar.H0(jgzVar2.C(), name2);
                    }
                } else if (hhzVar instanceof fhz) {
                    fhz fhzVar = (fhz) hhzVar;
                    String name3 = qhz.class.getName();
                    if (jgzVar2.C().J(name3) == null) {
                        gst gstVar = qhz.l2;
                        LeaderboardTimeFilterModelParams leaderboardTimeFilterModelParams = fhzVar.f9563a;
                        gstVar.getClass();
                        qhz qhzVar = new qhz();
                        qhzVar.k2.J(qhzVar, qhz.m2[0], leaderboardTimeFilterModelParams);
                        qhzVar.H0(jgzVar2.C(), name3);
                    }
                } else if (hhzVar instanceof chz) {
                    chz chzVar = (chz) hhzVar;
                    String name4 = pgz.class.getName();
                    if (jgzVar2.C().J(name4) == null) {
                        art artVar = pgz.l2;
                        LeaderboardRegionModelParams leaderboardRegionModelParams = chzVar.f4386a;
                        artVar.getClass();
                        pgz pgzVar = new pgz();
                        pgzVar.k2.J(pgzVar, pgz.m2[0], leaderboardRegionModelParams);
                        pgzVar.H0(jgzVar2.C(), name4);
                    }
                } else if (hhzVar instanceof ehz) {
                    ehz ehzVar = (ehz) hhzVar;
                    String name5 = mhz.class.getName();
                    if (jgzVar2.C().J(name5) == null) {
                        bst bstVar = mhz.l2;
                        LeaderboardTeamsTypeModelParams leaderboardTeamsTypeModelParams = ehzVar.f7831a;
                        bstVar.getClass();
                        mhz mhzVar = new mhz();
                        mhzVar.k2.J(mhzVar, mhz.m2[0], leaderboardTeamsTypeModelParams);
                        mhzVar.H0(jgzVar2.C(), name5);
                    }
                } else {
                    if (!(hhzVar instanceof dhz)) {
                        t9f.b();
                        return null;
                    }
                    dhz dhzVar = (dhz) hhzVar;
                    wdk0 wdk0Var = jgzVar2.L1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, dhzVar.f6115a, null, null, null, null, 124), jgzVar2, null, null, false, null, 1020);
                }
                jgzVar2.G0().x(bfz.f2528a);
                return Unit.f46060a;
            case 3:
                xhz xhzVar = (xhz) obj;
                tqt tqtVar4 = jgz.Q1;
                xhzVar.getClass();
                jgzVar.G0().x(new pfz(xhzVar));
                return Unit.f46060a;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                tqt tqtVar5 = jgz.Q1;
                jgzVar.G0().x(new ofz(iIntValue));
                return Unit.f46060a;
            case 5:
                qgz qgzVar = (qgz) obj;
                tqt tqtVar6 = jgz.Q1;
                qgzVar.getClass();
                jgzVar.G0().x(new lfz(qgzVar));
                return Unit.f46060a;
            default:
                epe epeVar = (epe) obj;
                tqt tqtVar7 = jgz.Q1;
                epeVar.getClass();
                jgzVar.G0().x(new nfz(epeVar));
                return Unit.f46060a;
        }
    }
}
