package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hqk {
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    public static final List a(y78 y78Var, btk btkVar, sff0 sff0Var, ctf0 ctf0Var, v5l0 v5l0Var, List list, CyberGamesPage cyberGamesPage, boolean z, boolean z2, boolean z3, boolean z4) {
        Object next;
        m5l0 m5l0Var;
        btk btkVar2 = btkVar;
        ctf0Var.getClass();
        cyberGamesPage.getClass();
        list.getClass();
        List list2 = btkVar2.f3186a;
        if (list2.isEmpty()) {
            return iun.f15405a;
        }
        String str = z2 ? "LIVE_GAMES" : "LINE_GAMES";
        ctf0 ctf0Var2 = ctf0Var;
        v7m v7mVar = new v7m(new c8m(ctf0Var2.b.a(z2 ? R.string.cyber_live : R.string.line, Arrays.copyOf(new Object[0], 0)), rv00.m));
        q0s q0sVar = q0s.f27918a;
        List listD0 = CollectionsKt.D0(list2, 3);
        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            d0t d0tVar = (d0t) it.next();
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((lok0) next).f20396a != d0tVar.O);
            lok0 lok0Var = (lok0) next;
            boolean z5 = sff0Var.J;
            String str2 = btkVar2.b;
            boolean zEquals = cyberGamesPage.equals(CyberGamesPage.OneXCyber.INSTANCE);
            Iterator it3 = it;
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList2.add(Integer.valueOf(((lok0) it4.next()).f20396a));
            }
            boolean z6 = lok0Var != null ? lok0Var.n : false;
            boolean z7 = lok0Var != null ? lok0Var.p : false;
            if (d0tVar.K.isEmpty()) {
                List list3 = d0tVar.k;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it5 = list3.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            if (!((d0t) it5.next()).K.isEmpty()) {
                                if (z3) {
                                    m5l0Var = k5l0.f17726a;
                                } else {
                                    m5l0Var = l5l0.f19463a;
                                }
                            }
                        }
                    }
                }
                m5l0Var = i5l0.f14197a;
            } else if (z3) {
                m5l0Var = k5l0.f17726a;
            } else {
                m5l0Var = l5l0.f19463a;
            }
            m5l0 m5l0Var2 = m5l0Var;
            String str3 = lok0Var != null ? lok0Var.u : null;
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(wwb.V(d0tVar, ctf0Var2, y78Var, z, z5, str2, zEquals, arrayList2, z6, z7, false, v5l0Var, m5l0Var2, str3, z4));
            btkVar2 = btkVar;
            ctf0Var2 = ctf0Var;
            it = it3;
        }
        return kotlin.collections.a.c(new gqk(str, v7mVar, new vb90(q0sVar, dyb.o0(arrayList), true, z4), k3g.f17616a));
    }
}
