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
public abstract class jrk {
    public static final List a(irk irkVar, CyberGamesPage cyberGamesPage, ctf0 ctf0Var) {
        int size;
        String str;
        String str2;
        cyberGamesPage.getClass();
        ctf0Var.getClass();
        List list = irkVar.f15260a;
        List list2 = irkVar.b;
        if (list.isEmpty() && list2.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((nyg) it.next()).g));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!arrayList.contains(Long.valueOf(((nyg) obj).g))) {
                arrayList2.add(obj);
            }
        }
        if (list.isEmpty()) {
            size = 0;
        } else {
            size = 3;
            if (list.size() < 3) {
                size = list.size();
            }
        }
        int iMin = Math.min(6, Math.min(6 - size, arrayList2.size()));
        List listD0 = CollectionsKt.D0(list, Math.max(0, Math.min(list.size() - size, (6 - iMin) - size)) + size);
        List listD1 = CollectionsKt.D0(arrayList2, iMin);
        lsm0 lsm0Var = ctf0Var.b;
        v7m v7mVar = new v7m(new c8m(lsm0Var.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
        ArrayList<nyg> arrayListQ0 = CollectionsKt.q0(listD0, listD1);
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListQ0, 10));
        for (nyg nygVar : arrayListQ0) {
            long j = nygVar.g;
            rmh pmhVar = nygVar.m ? new pmh(lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[0], 0))) : qmh.f28982a;
            String strM0 = nygVar.f;
            if (nygVar.i == 243) {
                strM0 = StringsKt.m0(strM0, ". ", strM0);
            }
            String str3 = strM0;
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
            String strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str2, ".png");
            if (strK.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(strK, ujn.h, false) || kotlin.text.c.x(strK, "https://", false)) {
                sb.setLength(0);
                sb.append(strK);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(strK, '/'));
            }
            arrayList3.add(new smh(j, sb.toString(), nmh.f23772a, str3, "", pmhVar));
        }
        lc00VarB.add(new hrv("CHAMPIONSHIPS", cyberGamesPage, v7mVar, new wmh(dyb.r0(arrayList3))));
        return kotlin.collections.a.a(lc00VarB);
    }
}
