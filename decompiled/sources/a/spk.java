package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class spk {
    /* JADX WARN: Code duplicated, block: B:52:0x0167  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    public static final lc00 a(btk btkVar, y78 y78Var, ctf0 ctf0Var, CyberGamesPage cyberGamesPage, boolean z, boolean z2, sff0 sff0Var, boolean z3, List list, boolean z4) {
        lc00 lc00Var;
        hjm hjmVar;
        Object next;
        m5l0 m5l0Var;
        btk btkVar2 = btkVar;
        ctf0 ctf0Var2 = ctf0Var;
        CyberGamesPage cyberGamesPage2 = cyberGamesPage;
        sff0 sff0Var2 = sff0Var;
        ctf0Var2.getClass();
        cyberGamesPage2.getClass();
        list.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        List<d0t> list2 = btkVar2.f3186a;
        if (list2.isEmpty()) {
            lc00Var = lc00VarB;
        } else {
            String str = z3 ? "HEADER_LIVE_GAMES" : "HEADER_LINE_GAMES";
            boolean z5 = false;
            if (z3) {
                lsm0 lsm0Var = ctf0Var2.b;
                hjmVar = new hjm(lsm0Var.a(R.string.cyber_games_popular_live, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102);
            } else {
                lsm0 lsm0Var2 = ctf0Var2.b;
                hjmVar = new hjm(lsm0Var2.a(R.string.popular_line_games, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102);
            }
            lc00VarB.add(new nuj(str, hjmVar));
            v5l0 v5l0Var = sff0Var2.g.y;
            q0s q0sVar = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE) ? q0s.f27918a : q0s.b;
            int i = 10;
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            for (d0t d0tVar : list2) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((lok0) next).f20396a != d0tVar.O);
                lok0 lok0Var = (lok0) next;
                boolean z6 = sff0Var2.J;
                q0s q0sVar2 = q0sVar;
                String str2 = btkVar2.b;
                boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                boolean z7 = z5;
                ArrayList arrayList2 = new ArrayList(r3d.q(list, i));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((lok0) it2.next()).f20396a));
                }
                boolean z8 = lok0Var != null ? lok0Var.n : z7;
                boolean z9 = lok0Var != null ? lok0Var.p : z7;
                if (d0tVar.K.isEmpty()) {
                    List list3 = d0tVar.k;
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Iterator it4 = it3;
                                if (((d0t) it3.next()).K.isEmpty()) {
                                    it3 = it4;
                                } else if (z) {
                                    m5l0Var = k5l0.f17726a;
                                } else {
                                    m5l0Var = l5l0.f19463a;
                                }
                            }
                        }
                    }
                    m5l0Var = i5l0.f14197a;
                } else if (z) {
                    m5l0Var = k5l0.f17726a;
                } else {
                    m5l0Var = l5l0.f19463a;
                }
                String str3 = lok0Var != null ? lok0Var.u : null;
                if (str3 == null) {
                    str3 = "";
                }
                boolean z10 = z9;
                m5l0 m5l0Var2 = m5l0Var;
                ArrayList arrayList3 = arrayList;
                arrayList3.add(wwb.V(d0tVar, ctf0Var2, y78Var, z2, z6, str2, zEquals, arrayList2, z8, z10, false, v5l0Var, m5l0Var2, str3, z4));
                ctf0Var2 = ctf0Var;
                cyberGamesPage2 = cyberGamesPage;
                sff0Var2 = sff0Var;
                arrayList = arrayList3;
                lc00VarB = lc00VarB;
                q0sVar = q0sVar2;
                z5 = z7;
                i = 10;
                btkVar2 = btkVar;
            }
            lc00 lc00Var2 = lc00VarB;
            lc00Var = lc00Var2;
            lc00Var.add(new kuj(z3 ? "LIVE_GAMES" : "LINE_GAMES", new vb90(q0sVar, dyb.o0(arrayList), true, z4)));
        }
        return kotlin.collections.a.a(lc00Var);
    }
}
