package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jgh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f16479a = q3d.j(new ggh(), new fgh(22, R.string.cyber_statistic_experience), new hgh(23, R.string.cyber_statistic_win_rate));

    public static final void a(lc00 lc00Var, omg omgVar, int i, long j, ctf0 ctf0Var, List list) {
        Object next;
        List<eev> list2;
        List list3;
        List list4;
        omgVar.getClass();
        ctf0Var.getClass();
        list.getClass();
        kmg kmgVar = (kmg) CollectionsKt.W(i, omgVar.i);
        if (kmgVar == null) {
            return;
        }
        e8h e8hVar = kmgVar.d;
        String str = e8hVar.b;
        e8h e8hVar2 = kmgVar.c;
        String str2 = e8hVar2.b;
        List list5 = kmgVar.k;
        List list6 = kmgVar.j;
        List list7 = kmgVar.i;
        lc00 lc00VarB = kotlin.collections.a.b();
        for (igh ighVar : f16479a) {
            if (ighVar != null) {
                if (ighVar instanceof ggh) {
                    if (!list7.isEmpty() && !list7.isEmpty()) {
                        Iterator it = list7.iterator();
                        while (it.hasNext()) {
                            if (((eev) it.next()).f7692a != 0) {
                                lc00VarB.add(ighVar);
                                break;
                            }
                        }
                    }
                } else if (ighVar instanceof fgh) {
                    if (!list6.isEmpty() && !list6.isEmpty()) {
                        Iterator it2 = list6.iterator();
                        while (it2.hasNext()) {
                            if (((eev) it2.next()).f7692a != 0) {
                                lc00VarB.add(ighVar);
                                break;
                            }
                        }
                    }
                } else if (ighVar instanceof hgh) {
                    if (list5.isEmpty() || list5.isEmpty()) {
                        break;
                    }
                    Iterator it3 = list5.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((eev) it3.next()).f7692a != 0) {
                                if (list5.isEmpty()) {
                                    break;
                                }
                                Iterator it4 = list5.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        eev eevVar = (eev) it4.next();
                                        list3 = list7;
                                        list4 = list5;
                                        if (eevVar.f7692a != -50 && eevVar.b != 0) {
                                            lc00VarB.add(ighVar);
                                            break;
                                        } else {
                                            list7 = list3;
                                            list5 = list4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    list7 = list3;
                    list5 = list4;
                }
                list3 = list7;
                list4 = list5;
                list7 = list3;
                list5 = list4;
            }
            t9f.b();
            return;
        }
        List list8 = list7;
        List list9 = list5;
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        ListIterator listIterator = lc00VarA.listIterator(0);
        do {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                next = null;
                break;
            }
            next = pawVar.next();
        } while (((igh) next).f14735a != j);
        igh ighVar2 = (igh) next;
        if (ighVar2 == null) {
            ighVar2 = (igh) CollectionsKt.firstOrNull(lc00VarA);
        }
        if (ighVar2 == null || str2.length() == 0 || str.length() == 0) {
            return;
        }
        lc00Var.add(wzb.N(4L, R.string.cyber_statistic_graphs, ctf0Var, 24));
        long j2 = ighVar2.f14735a;
        ArrayList arrayList = new ArrayList(r3d.q(lc00VarA, 10));
        ListIterator listIterator2 = lc00VarA.listIterator(0);
        while (true) {
            paw pawVar2 = (paw) listIterator2;
            if (!pawVar2.hasNext()) {
                break;
            }
            igh ighVar3 = (igh) pawVar2.next();
            long j3 = j2;
            ListIterator listIterator3 = listIterator2;
            arrayList.add(new lxl(ighVar3.f14735a, (dyl) new xxl(ctf0Var.b.a(ighVar3.b, Arrays.copyOf(new Object[0], 0))), false, ((long) ighVar3.f14735a) == j3 ? uxl.b : uxl.f36445a, (cwl) null, 108));
            listIterator2 = listIterator3;
            j2 = j3;
        }
        lc00Var.add(new boo0("STATISTIC_GRAPH_TABS_KEY", new fyl(dyb.o0(arrayList), null, null, s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2), new jyl(new y3d(kkg.m), null, null, 126), 6), pno0.f27299a));
        String strM = twn.m(omgVar.f25503a, liq.class.getSimpleName());
        if (ighVar2 instanceof ggh) {
            list2 = list8;
        } else if (ighVar2 instanceof fgh) {
            list2 = list6;
        } else {
            if (!(ighVar2 instanceof hgh)) {
                t9f.b();
                return;
            }
            list2 = list9;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        for (eev eevVar2 : list2) {
            arrayList2.add(new miq(eevVar2.f7692a, eevVar2.b));
        }
        lc00Var.add(new liq(strM, dyb.r0(arrayList2), new kiq(str2, tnq0.l(e8hVar2, list), kkg.k), new kiq(str, tnq0.l(e8hVar, list), kkg.l), ighVar2 instanceof hgh ? wev.b : wev.f39038a));
    }
}
