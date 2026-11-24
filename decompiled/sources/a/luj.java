package a;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class luj {
    public static final lc00 a(List list, y78 y78Var, ctf0 ctf0Var, CyberGamesPage cyberGamesPage, boolean z, sff0 sff0Var, boolean z2, List list2, boolean z3) {
        lc00 lc00Var;
        int i;
        kuj kujVar;
        Object next;
        m5l0 m5l0Var;
        ctf0 ctf0Var2 = ctf0Var;
        CyberGamesPage cyberGamesPage2 = cyberGamesPage;
        boolean z4 = z2;
        ctf0Var2.getClass();
        cyberGamesPage2.getClass();
        list2.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        if (!list.isEmpty()) {
            int i2 = 0;
            lc00VarB.add(new nuj("HomeHeaderUiModel_" + z4, z4 ? new hjm(ctf0Var2.b.a(R.string.cyber_games_popular_live, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, true, null, null, false, null, null, 8126) : new hjm(ctf0Var2.b.a(R.string.popular_line_games, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126)));
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                eih eihVar = (eih) obj;
                long j = eihVar.f7859a;
                ArrayList<d0t> arrayList = eihVar.e;
                if (j == 40) {
                    j = eihVar.b;
                }
                if (arrayList.isEmpty()) {
                    lc00Var = lc00VarB;
                    i = i2;
                } else {
                    eih eihVar2 = eihVar;
                    akw akwVar = new akw("HomeSubHeaderUiModel_" + j + z4, j, z4, eihVar.c, ctf0Var2.b.a(R.string.all, Arrays.copyOf(new Object[i2], i2)), new n0x(eihVar.d), new m0x(R.drawable.ic_game_pad_primary_placeholder, null, 6));
                    lc00VarB.add(akwVar);
                    v5l0 v5l0Var = sff0Var.g.y;
                    String str = "HomeDefaultGameCardUiModel_" + i3 + z4 + BundleUtil.UNDERLINE_TAG + org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2);
                    q0s q0sVar = q0s.b;
                    int i5 = 10;
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (d0t d0tVar : arrayList) {
                        Iterator it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((lok0) next).f20396a != d0tVar.O);
                        lok0 lok0Var = (lok0) next;
                        kuj kujVar2 = kujVar;
                        boolean z5 = sff0Var.J;
                        String str2 = str;
                        String str3 = eihVar2.f;
                        boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                        ArrayList arrayList3 = arrayList2;
                        eih eihVar3 = eihVar2;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list2, i5));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(Integer.valueOf(((lok0) it2.next()).f20396a));
                        }
                        boolean z6 = lok0Var != null ? lok0Var.n : false;
                        boolean z7 = lok0Var != null ? lok0Var.p : false;
                        boolean zEquals2 = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE);
                        if (d0tVar.K.isEmpty()) {
                            List list3 = d0tVar.k;
                            if (list3 == null || !list3.isEmpty()) {
                                Iterator it3 = list3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        Iterator it4 = it3;
                                        if (((d0t) it3.next()).K.isEmpty()) {
                                            it3 = it4;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                    }
                                }
                            }
                            m5l0Var = i5l0.f14197a;
                        } else {
                            m5l0Var = l5l0.f19463a;
                        }
                        String str4 = lok0Var != null ? lok0Var.u : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        lc00 lc00Var2 = lc00VarB;
                        v5l0 v5l0Var2 = v5l0Var;
                        arrayList3.add(wwb.V(d0tVar, ctf0Var, y78Var, z, z5, str3, zEquals, arrayList4, z6, z7, zEquals2, v5l0Var2, m5l0Var, str4, z3));
                        sff0Var = sff0Var;
                        v5l0Var = v5l0Var2;
                        arrayList2 = arrayList3;
                        lc00VarB = lc00Var2;
                        kujVar = kujVar2;
                        eihVar2 = eihVar3;
                        q0sVar = q0sVar;
                        i5 = 10;
                        str = str2;
                        cyberGamesPage2 = cyberGamesPage;
                    }
                    i = 0;
                    lc00Var = lc00VarB;
                    lc00Var.add(new kuj(str, new vb90(q0sVar, dyb.o0(arrayList2), true, z3)));
                }
                ctf0Var2 = ctf0Var;
                cyberGamesPage2 = cyberGamesPage;
                z4 = z2;
                lc00VarB = lc00Var;
                i3 = i4;
                i2 = i;
            }
        }
        return kotlin.collections.a.a(lc00VarB);
    }
}
