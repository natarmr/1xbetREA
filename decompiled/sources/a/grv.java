package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class grv {
    public static final List a(n52 n52Var, CyberGamesPage cyberGamesPage, ctf0 ctf0Var) {
        String str;
        String str2;
        int i;
        cyberGamesPage.getClass();
        ctf0Var.getClass();
        List list = n52Var.f22922a;
        List list2 = n52Var.b;
        if (list.isEmpty() && list2.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        int size = list.isEmpty() ? 6 : 6 - CollectionsKt.D0(list, 3).size();
        List listD0 = CollectionsKt.D0(list, 3);
        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((nyg) it.next()).g));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!arrayList.contains(Long.valueOf(((nyg) obj).g))) {
                arrayList2.add(obj);
            }
        }
        List listD1 = CollectionsKt.D0(arrayList2, size);
        int i2 = 0;
        lsm0 lsm0Var = ctf0Var.b;
        v7m v7mVar = new v7m(new c8m(lsm0Var.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
        ArrayList arrayListQ0 = CollectionsKt.q0(listD0, listD1);
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListQ0, 10));
        Iterator it2 = arrayListQ0.iterator();
        while (it2.hasNext()) {
            nyg nygVar = (nyg) it2.next();
            long j = nygVar.g;
            rmh pmhVar = nygVar.m ? new pmh(lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[i2], i2))) : qmh.f28982a;
            String strM0 = nygVar.f;
            if (nygVar.i == 243) {
                strM0 = StringsKt.m0(strM0, ". ", strM0);
            }
            String str3 = strM0;
            String str4 = nygVar.j;
            long j2 = nygVar.l;
            StringBuilder sb = new StringBuilder(ujn.h);
            if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
                str = "Real";
            } else if (cyberGamesPage.equals(CyberGamesPage.Virtual.INSTANCE)) {
                str = "Virtual";
            } else {
                if (!cyberGamesPage.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                    t9f.b();
                    return null;
                }
                str = "1XCyber";
            }
            if (j2 == 1) {
                str2 = "TopChamp_Dota2";
            } else if (j2 == 46) {
                str2 = "TopChamp_CS2";
            } else if (j2 == 27) {
                str2 = "TopChamp_Valorant";
            } else {
                str2 = j2 == 2 ? "TopChamp_LoL" : "TopChamp";
            }
            Iterator it3 = it2;
            String strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str2, ".png");
            if (strK.length() == 0) {
                sb.setLength(0);
                i = 0;
            } else {
                if (StringsKt.O(strK, ujn.h, false)) {
                    i = 0;
                } else if (kotlin.text.c.x(strK, "https://", false)) {
                    i = 0;
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    i = 0;
                    sb.append(StringsKt.y0(strK, '/'));
                }
                sb.setLength(i);
                sb.append(strK);
            }
            i2 = i;
            arrayList3.add(new smh(j, sb.toString(), new mmh(nygVar.n), str3, str4, pmhVar));
            it2 = it3;
        }
        lc00VarB.add(new hrv("HeaderFocusTournamentListUiModel", cyberGamesPage, v7mVar, new wmh(dyb.r0(arrayList3))));
        return kotlin.collections.a.a(lc00VarB);
    }
}
