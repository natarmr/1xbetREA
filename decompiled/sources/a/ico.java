package a;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ico {
    public static final List a(List list, y78 y78Var, v5l0 v5l0Var, CyberGamesPage cyberGamesPage, boolean z, sff0 sff0Var, sip sipVar, List list2, List list3, long j, ctf0 ctf0Var, boolean z2) {
        Iterable iterableR0;
        Object next;
        ftk ftkVar;
        v7m v7mVar;
        Iterable iterable;
        Object next2;
        m5l0 m5l0Var;
        long j2;
        ctf0 ctf0Var2 = ctf0Var;
        list.getClass();
        cyberGamesPage.getClass();
        list2.getClass();
        list3.getClass();
        ctf0Var2.getClass();
        c8m c8mVar = new c8m(kpb.u(sipVar) ? ctf0Var2.b.a(R.string.cyber_live, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)), rv00.m);
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eih eihVar = (eih) it.next();
            long j3 = eihVar.f7859a;
            if (j3 == 40) {
                j3 = eihVar.b;
            }
            long j4 = j3;
            arrayList.add(new ctk(j4, eihVar.d, eihVar.c, j == j4));
        }
        if (arrayList.isEmpty()) {
            iterableR0 = iun.f15405a;
        } else {
            int iA = wp20.a(r3d.q(arrayList, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : arrayList) {
                linkedHashMap.put(Long.valueOf(((ctk) obj).f4941a), obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                ctk ctkVar = (ctk) linkedHashMap.get(Long.valueOf(((Number) it2.next()).longValue()));
                if (ctkVar != null) {
                    arrayList2.add(ctkVar);
                }
            }
            iterableR0 = dyb.r0(arrayList2);
        }
        i4 i4VarR0 = dyb.r0(iterableR0);
        ftk ftkVar2 = new ftk(sipVar, i4VarR0);
        if (i4VarR0.isEmpty()) {
            return iun.f15405a;
        }
        String strI = ua80.i("EventFocusTopEventsUiModel_", sipVar.name(), BundleUtil.UNDERLINE_TAG, org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage));
        v7m v7mVar2 = new v7m(c8mVar);
        if (j <= 0) {
            iterable = iun.f15405a;
            ftkVar = ftkVar2;
            v7mVar = v7mVar2;
        } else {
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                eih eihVar2 = (eih) next;
                j2 = eihVar2.f7859a;
                if (j2 == 40) {
                    j2 = eihVar2.b;
                }
            } while (j2 != j);
            eih eihVar3 = (eih) next;
            if (eihVar3 != null) {
                ArrayList<d0t> arrayList3 = eihVar3.e;
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                for (d0t d0tVar : arrayList3) {
                    Iterator it4 = list2.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                    } while (((lok0) next2).f20396a != d0tVar.O);
                    lok0 lok0Var = (lok0) next2;
                    boolean z3 = sff0Var.J;
                    String str = eihVar3.f;
                    boolean zEquals = cyberGamesPage.equals(CyberGamesPage.OneXCyber.INSTANCE);
                    ArrayList arrayList5 = arrayList4;
                    ArrayList arrayList6 = new ArrayList(r3d.q(list2, i));
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(Integer.valueOf(((lok0) it5.next()).f20396a));
                    }
                    boolean z4 = lok0Var != null ? lok0Var.n : false;
                    boolean z5 = lok0Var != null ? lok0Var.p : false;
                    eih eihVar4 = eihVar3;
                    if (d0tVar.K.isEmpty()) {
                        List list4 = d0tVar.k;
                        if (list4 == null || !list4.isEmpty()) {
                            Iterator it6 = list4.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    Iterator it7 = it6;
                                    if (((d0t) it6.next()).K.isEmpty()) {
                                        it6 = it7;
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
                    String str2 = lok0Var != null ? lok0Var.u : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList5.add(wwb.V(d0tVar, ctf0Var2, y78Var, z, z3, str, zEquals, arrayList6, z4, z5, false, v5l0Var, m5l0Var, str2, z2));
                    ctf0Var2 = ctf0Var;
                    arrayList4 = arrayList5;
                    ftkVar2 = ftkVar2;
                    v7mVar2 = v7mVar2;
                    eihVar3 = eihVar4;
                    i = 10;
                }
                ftkVar = ftkVar2;
                v7mVar = v7mVar2;
                iterable = arrayList4;
            } else {
                ftkVar = ftkVar2;
                v7mVar = v7mVar2;
                iterable = lak0.c;
            }
        }
        return kotlin.collections.a.c(new hco(strI, sipVar, v7mVar, ftkVar, new vb90(q0s.f27918a, dyb.o0(iterable), true, z2), k3g.f17616a));
    }
}
