package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.player.impl.player.career.presentation.PlayerCareerScreen;
import org.xplatform.statistic.player.impl.player.medals.presentation.screen.PlayerMedalsStatisticScreen;
import org.xplatform.statistic.player.impl.player.player_injury.presentation.screen.InjuriesScreens;
import org.xplatform.statistic.player.impl.player.player_lastgame.presentation.screen.LastGamePlayerScreen;
import org.xplatform.statistic.player.impl.player.player_transfers.presentation.screen.TransfersPlayerScreen;
import org.xplatform.statistic.player.impl.player.winter_full_description.presentation.actual.FullDescriptionScreen;
import org.xplatform.statistic.player.impl.referee.referee_card_last_game.presentation.screen.RefereeLastGameScreen;
import org.xplatform.statistic.player.impl.referee.referee_team.presentation.RefereeTeamsFragmentScreen;
import org.xplatform.statistic.player.impl.referee.referee_tour.presentation.RefereeTourScreens;
import org.xplatform.statistic.winter_games.impl.personal_statistic.presentation.WinterGamesPersonalStatisticFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class d6a0 extends i3t0 {
    public static final /* synthetic */ int C = 0;
    public final c4m0 A;
    public bby B;
    public final fhj o;
    public final f4u p;
    public final String q;
    public final String r;
    public final long s;
    public final i1w0 t;
    public final duj u;
    public final mne v;
    public final bzs0 w;
    public final oaa0 x;
    public final yo4 y;
    public final zr1 z;

    public d6a0(ctf0 ctf0Var, fhj fhjVar, f4u f4uVar, wyu wyuVar, String str, String str2, long j, i1w0 i1w0Var, duj dujVar, m1e m1eVar, ocl oclVar, mne mneVar, uyu uyuVar, bzs0 bzs0Var, oaa0 oaa0Var, yo4 yo4Var, zr1 zr1Var) {
        ctf0Var.getClass();
        wyuVar.getClass();
        m1eVar.getClass();
        fkm fkmVar = new fkm((byte) 2, j, fhjVar, str, wyuVar, oaa0Var);
        cz czVar = new cz(oclVar, ctf0Var, (byte) 26);
        rwj rwjVar = mneVar.f22085a;
        super(null, fkmVar, czVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = fhjVar;
        this.p = f4uVar;
        this.q = str;
        this.r = str2;
        this.s = j;
        this.t = i1w0Var;
        this.u = dujVar;
        this.v = mneVar;
        this.w = bzs0Var;
        this.x = oaa0Var;
        this.y = yo4Var;
        this.z = zr1Var;
        yje yjeVar = null;
        byte b = 1;
        sac.T(new fnq(uyuVar.f36509a.h(), new b6a0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), c6a0.h);
        c4m0 c4m0Var = this.A;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.A = sac.T(new fnq(m1eVar.b(), new a6a0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new b6a0(this, yjeVar, (byte) 0));
        }
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, v5a0.a((v5a0) value, null, true, false, false, null, 49)));
            this.B = sac.V(jiu0.a(this), new yr80(this, (byte) 6), null, this.v.b, new a6a0(this, null, (byte) 0), 10);
        }
    }

    public final void N(e8a0 e8a0Var) {
        if (this.x != oaa0.b) {
            yo4 yo4Var = this.y;
            yo4Var.getClass();
            i8i.D("point", e8a0Var.f7364a, yo4Var.f42966a, "bet_statistic_player_menu_call");
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        String str;
        o5a0 o5a0Var = (o5a0) obj;
        o5a0Var.getClass();
        super.x(o5a0Var);
        boolean z = o5a0Var instanceof l5a0;
        i1w0 i1w0Var = this.t;
        if (!z) {
            if (!(o5a0Var instanceof m5a0)) {
                if (o5a0Var instanceof n5a0) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            w8a0 w8a0Var = ((m5a0) o5a0Var).f21211a;
            boolean z2 = w8a0Var instanceof s8a0;
            String str2 = this.r;
            if (z2) {
                N(e8a0.TORNAMENTS);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                FragmentScreen refereeTourScreens = new RefereeTourScreens(str2);
                if (refereeTourScreens instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) refereeTourScreens)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(refereeTourScreens)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            } else if (w8a0Var instanceof q8a0) {
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen refereeLastGameScreen = new RefereeLastGameScreen(str2);
                if (refereeLastGameScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) refereeLastGameScreen)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(refereeLastGameScreen)));
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
            } else if (w8a0Var instanceof r8a0) {
                N(e8a0.TEAMS);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                FragmentScreen refereeTeamsFragmentScreen = new RefereeTeamsFragmentScreen(str2);
                if (refereeTeamsFragmentScreen instanceof DialogScreen) {
                    copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) refereeTeamsFragmentScreen)));
                } else {
                    copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(refereeTeamsFragmentScreen)));
                }
                ListIterator listIteratorO3 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO3;
                    if (!pawVar3.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            } else if (w8a0Var instanceof l8a0) {
                N(e8a0.CAREER);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                FragmentScreen playerCareerScreen = new PlayerCareerScreen(str2);
                if (playerCareerScreen instanceof DialogScreen) {
                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) playerCareerScreen)));
                } else {
                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new w0w0(playerCareerScreen)));
                }
                ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayList3, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO4;
                    if (!pawVar4.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar4.next());
                    }
                }
            } else if (w8a0Var instanceof t8a0) {
                N(e8a0.TRANSITIONS);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
                FragmentScreen transfersPlayerScreen = new TransfersPlayerScreen(str2);
                if (transfersPlayerScreen instanceof DialogScreen) {
                    copyOnWriteArrayList4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) transfersPlayerScreen)));
                } else {
                    copyOnWriteArrayList4.add(new c8d(y7d.f42146a, new w0w0(transfersPlayerScreen)));
                }
                ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayList4, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorO5;
                    if (!pawVar5.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar5.next());
                    }
                }
            } else if (w8a0Var instanceof m8a0) {
                N(e8a0.INJURIES);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList5 = new CopyOnWriteArrayList();
                FragmentScreen injuriesScreens = new InjuriesScreens(str2);
                if (injuriesScreens instanceof DialogScreen) {
                    copyOnWriteArrayList5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) injuriesScreens)));
                } else {
                    copyOnWriteArrayList5.add(new c8d(y7d.f42146a, new w0w0(injuriesScreens)));
                }
                ListIterator listIteratorO6 = b1j.o(i1w0Var, copyOnWriteArrayList5, 0);
                while (true) {
                    paw pawVar6 = (paw) listIteratorO6;
                    if (!pawVar6.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar6.next());
                    }
                }
            } else if (w8a0Var instanceof p8a0) {
                N(e8a0.LAST_MATCHES);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList6 = new CopyOnWriteArrayList();
                FragmentScreen lastGamePlayerScreen = new LastGamePlayerScreen(str2, this.s);
                if (lastGamePlayerScreen instanceof DialogScreen) {
                    copyOnWriteArrayList6.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) lastGamePlayerScreen)));
                } else {
                    copyOnWriteArrayList6.add(new c8d(y7d.f42146a, new w0w0(lastGamePlayerScreen)));
                }
                ListIterator listIteratorO7 = b1j.o(i1w0Var, copyOnWriteArrayList6, 0);
                while (true) {
                    paw pawVar7 = (paw) listIteratorO7;
                    if (!pawVar7.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar7.next());
                    }
                }
            } else if (w8a0Var instanceof v8a0) {
                N(e8a0.FULL_DESCRIPTION);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList7 = new CopyOnWriteArrayList();
                FragmentScreen fullDescriptionScreen = new FullDescriptionScreen(str2);
                if (fullDescriptionScreen instanceof DialogScreen) {
                    copyOnWriteArrayList7.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fullDescriptionScreen)));
                } else {
                    copyOnWriteArrayList7.add(new c8d(y7d.f42146a, new w0w0(fullDescriptionScreen)));
                }
                ListIterator listIteratorO8 = b1j.o(i1w0Var, copyOnWriteArrayList7, 0);
                while (true) {
                    paw pawVar8 = (paw) listIteratorO8;
                    if (!pawVar8.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar8.next());
                    }
                }
            } else if (w8a0Var instanceof o8a0) {
                N(e8a0.PERSONAL_STAT);
                this.w.getClass();
                str2.getClass();
                FragmentScreen winterGamesPersonalStatisticFragmentScreen = new WinterGamesPersonalStatisticFragmentScreen(str2);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList8 = new CopyOnWriteArrayList();
                if (winterGamesPersonalStatisticFragmentScreen instanceof DialogScreen) {
                    copyOnWriteArrayList8.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) winterGamesPersonalStatisticFragmentScreen)));
                } else {
                    copyOnWriteArrayList8.add(new c8d(y7d.f42146a, new w0w0(winterGamesPersonalStatisticFragmentScreen)));
                }
                ListIterator listIteratorO9 = b1j.o(i1w0Var, copyOnWriteArrayList8, 0);
                while (true) {
                    paw pawVar9 = (paw) listIteratorO9;
                    if (!pawVar9.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar9.next());
                    }
                }
            } else if (w8a0Var instanceof n8a0) {
                N(e8a0.MEDALS);
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList9 = new CopyOnWriteArrayList();
                FragmentScreen playerMedalsStatisticScreen = new PlayerMedalsStatisticScreen(str2);
                if (playerMedalsStatisticScreen instanceof DialogScreen) {
                    copyOnWriteArrayList9.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) playerMedalsStatisticScreen)));
                } else {
                    copyOnWriteArrayList9.add(new c8d(y7d.f42146a, new w0w0(playerMedalsStatisticScreen)));
                }
                ListIterator listIteratorO10 = b1j.o(i1w0Var, copyOnWriteArrayList9, 0);
                while (true) {
                    paw pawVar10 = (paw) listIteratorO10;
                    if (!pawVar10.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar10.next());
                    }
                }
            } else if (!(w8a0Var instanceof u8a0)) {
                t9f.b();
                return;
            }
            if ((w8a0Var instanceof u8a0) || this.x == oaa0.b) {
                return;
            }
            if (w8a0Var.equals(l8a0.b)) {
                str = "career";
            } else if (w8a0Var.equals(m8a0.b)) {
                str = "injuries";
            } else if (w8a0Var.equals(n8a0.b)) {
                str = "medals";
            } else if (w8a0Var.equals(o8a0.b)) {
                str = "personal_stat";
            } else if (w8a0Var.equals(p8a0.b) || w8a0Var.equals(q8a0.b)) {
                str = "last_matches";
            } else if (w8a0Var.equals(r8a0.b)) {
                str = "teams";
            } else if (w8a0Var.equals(s8a0.b)) {
                str = "tornaments";
            } else if (w8a0Var.equals(t8a0.b)) {
                str = "transitions";
            } else {
                str = w8a0Var.equals(v8a0.b) ? "full_description" : "";
            }
            zr1 zr1Var = this.z;
            zr1Var.getClass();
            b1j.v(str, zr1Var.f44833a, 3113L);
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ2, 0);
        while (true) {
            paw pawVar11 = (paw) listIteratorP;
            if (!pawVar11.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar11.next());
            }
        }
    }
}
