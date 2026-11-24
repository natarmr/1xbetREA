package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class stp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f32783a = q3d.j(new gmp0(1), new hmp0(2), new imp0(3));

    /* JADX WARN: Code duplicated, block: B:101:0x022e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0159  */
    /* JADX WARN: Code duplicated, block: B:78:0x015e  */
    public static final void a(lc00 lc00Var, r2s0 r2s0Var, long j, m9s m9sVar, ctf0 ctf0Var, boolean z) {
        Object next;
        String strA;
        uxl uxlVar;
        Object obj;
        Object obj2;
        r2s0Var.getClass();
        m9sVar.getClass();
        ctf0Var.getClass();
        List list = r2s0Var.f29752a;
        if (list.isEmpty()) {
            return;
        }
        String str = m9sVar.j;
        String str2 = m9sVar.i;
        List<jmp0> list2 = f32783a;
        list2.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        for (jmp0 jmp0Var : list2) {
            if (jmp0Var != null) {
                if (jmp0Var instanceof gmp0) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next2 = it.next();
                        if (((cmp0) next2).f4618a.equals(str2)) {
                            obj = next2;
                            break;
                        }
                    }
                    if (vbc.a0((cmp0) obj)) {
                        lc00VarB.add(jmp0Var);
                    }
                } else if (jmp0Var instanceof hmp0) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next3 = it2.next();
                        if (((cmp0) next3).f4618a.equals(str)) {
                            obj2 = next3;
                            break;
                        }
                    }
                    if (vbc.a0((cmp0) obj2)) {
                        lc00VarB.add(jmp0Var);
                    }
                } else if (jmp0Var instanceof imp0) {
                    if (list == null || !list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (vbc.S((cmp0) it3.next())) {
                                lc00VarB.add(jmp0Var);
                                break;
                            }
                        }
                    }
                }
            }
            t9f.b();
            return;
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        ListIterator listIterator = lc00VarA.listIterator(0);
        do {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                next = null;
                break;
            }
            next = pawVar.next();
        } while (((jmp0) next).f16777a != j);
        jmp0 jmp0Var2 = (jmp0) next;
        if (jmp0Var2 == null) {
            jmp0Var2 = (jmp0) CollectionsKt.firstOrNull(lc00VarA);
        }
        jmp0 jmp0Var3 = jmp0Var2;
        if (jmp0Var3 == null) {
            return;
        }
        psv psvVar = new psv("TEAM_STATISTICS_HEADER_KEY", R.string.statistic_teams_title);
        long j2 = ijg.B0;
        ArrayList arrayList = new ArrayList(r3d.q(lc00VarA, 10));
        ListIterator listIterator2 = lc00VarA.listIterator(0);
        while (true) {
            paw pawVar2 = (paw) listIterator2;
            if (pawVar2.hasNext()) {
                jmp0 jmp0Var4 = (jmp0) pawVar2.next();
                long j3 = jmp0Var4.f16777a;
                List list3 = list;
                if (jmp0Var4 instanceof gmp0) {
                    strA = str2;
                } else {
                    if (jmp0Var4 instanceof hmp0) {
                        strA = str;
                    } else {
                        if (!(jmp0Var4 instanceof imp0)) {
                            t9f.b();
                            return;
                        }
                        strA = ctf0Var.b.a(R.string.stage_table, Arrays.copyOf(new Object[0], 0));
                    }
                    xxl xxlVar = new xxl(strA);
                    if (jmp0Var4.f16777a == jmp0Var3.f16777a) {
                        uxlVar = uxl.b;
                    } else {
                        uxlVar = uxl.f36445a;
                    }
                    arrayList.add(new lxl(j3, (dyl) xxlVar, false, uxlVar, (cwl) null, 108));
                    listIterator2 = listIterator2;
                    list = list3;
                }
                xxl xxlVar2 = new xxl(strA);
                if (jmp0Var4.f16777a == jmp0Var3.f16777a) {
                    uxlVar = uxl.b;
                } else {
                    uxlVar = uxl.f36445a;
                }
                arrayList.add(new lxl(j3, (dyl) xxlVar2, false, uxlVar, (cwl) null, 108));
                listIterator2 = listIterator2;
                list = list3;
            } else {
                List list4 = list;
                a4x a4xVarO0 = dyb.o0(arrayList);
                lsm0 lsm0Var = ctf0Var.b;
                boo0 boo0Var = new boo0("TEAM_STATISTICS_KEY", new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2), new jyl(new y3d(j2), null, null, 126), 6), pno0.f27299a);
                kmp0 kmp0VarB = b(r2s0Var, str2, ctf0Var);
                kmp0 kmp0VarB2 = b(r2s0Var, str, ctf0Var);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list4) {
                    if (((cmp0) obj3).f4618a.length() > 0) {
                        arrayList4.add(obj3);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                int i = 0;
                while (true) {
                    String str3 = "playerlogo/";
                    ArrayList arrayList5 = arrayList4;
                    Iterator it5 = it4;
                    if (!it4.hasNext()) {
                        long j4 = qmk.o;
                        long j5 = qmk.q;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj4 : list4) {
                            if (((cmp0) obj4).f4618a.length() > 0) {
                                arrayList6.add(obj4);
                            }
                        }
                        String strA2 = lsm0Var.a(R.string.stage_table_title_count_games, Arrays.copyOf(new Object[0], 0));
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            arrayList7.add(((cmp0) it6.next()).d);
                        }
                        zcl zclVar = qmk.f28987a;
                        ihm0.f(arrayList2, strA2, arrayList7, j5, 12.0f);
                        String strA3 = lsm0Var.a(R.string.stage_table_status_win, Arrays.copyOf(new Object[0], 0));
                        ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList8.add(((cmp0) it7.next()).e);
                        }
                        zcl zclVar2 = qmk.f28987a;
                        ihm0.f(arrayList2, strA3, arrayList8, j5, 12.0f);
                        String strA4 = lsm0Var.a(R.string.stage_table_status_draw, Arrays.copyOf(new Object[0], 0));
                        ArrayList arrayList9 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it8 = arrayList6.iterator();
                        while (it8.hasNext()) {
                            arrayList9.add(((cmp0) it8.next()).f);
                        }
                        zcl zclVar3 = qmk.f28987a;
                        ihm0.f(arrayList2, strA4, arrayList9, j5, 12.0f);
                        String strA5 = lsm0Var.a(R.string.stage_table_status_lose, Arrays.copyOf(new Object[0], 0));
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it9 = arrayList6.iterator();
                        while (it9.hasNext()) {
                            arrayList10.add(((cmp0) it9.next()).g);
                        }
                        zcl zclVar4 = qmk.f28987a;
                        ihm0.f(arrayList2, strA5, arrayList10, j5, 12.0f);
                        String strA6 = lsm0Var.a(R.string.stage_table_title_count_goals_difference, Arrays.copyOf(new Object[0], 0));
                        ArrayList arrayList11 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList11.add(((cmp0) it10.next()).h);
                        }
                        zcl zclVar5 = qmk.f28987a;
                        ihm0.f(arrayList2, strA6, arrayList11, j4, 14.0f);
                        String strA7 = lsm0Var.a(R.string.stage_table_title_count_points, Arrays.copyOf(new Object[0], 0));
                        ArrayList arrayList12 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it11 = arrayList6.iterator();
                        while (it11.hasNext()) {
                            arrayList12.add(((cmp0) it11.next()).i);
                        }
                        zcl zclVar6 = qmk.f28987a;
                        ihm0.f(arrayList2, strA7, arrayList12, j5, 12.0f);
                        ArrayList arrayList13 = new ArrayList(r3d.q(arrayList2, 10));
                        int i2 = 0;
                        for (Object obj5 : arrayList2) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList13.add(new jhm0(i2, (a4x) obj5));
                            i2 = i3;
                        }
                        i4 i4VarR0 = dyb.r0(dyb.r0(arrayList13));
                        ArrayList arrayList14 = new ArrayList();
                        arrayList14.add(new l4m0(lsm0Var.a(R.string.team, Arrays.copyOf(new Object[0], 0)), kkg.E, qmk.q, 84.0f, 5, 8.0f, 12.0f));
                        ArrayList arrayList15 = new ArrayList();
                        for (Object obj6 : list4) {
                            if (((cmp0) obj6).f4618a.length() > 0) {
                                arrayList15.add(obj6);
                            }
                        }
                        ArrayList arrayList16 = new ArrayList(r3d.q(arrayList15, 10));
                        Iterator it12 = arrayList15.iterator();
                        while (it12.hasNext()) {
                            cmp0 cmp0Var = (cmp0) it12.next();
                            String upperCase = ttm0.L(3, cmp0Var.f4618a).toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            String str4 = cmp0Var.b;
                            Iterator it13 = it12;
                            if (!kotlin.text.c.x(str4, ujn.h, false)) {
                                if (str4.length() != 0) {
                                    List list5 = u0d.f34849a;
                                    if (!u0d.c(str4)) {
                                        str4 = String.format(Locale.ENGLISH, StringsKt.O(str4, str3, true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str4}, 2));
                                    }
                                }
                                str4 = "";
                            }
                            zcl zclVar7 = qmk.f28987a;
                            arrayList16.add(new k4m0(upperCase, str4, 8.0f, 84.0f));
                            it12 = it13;
                            str3 = str3;
                        }
                        arrayList14.addAll(arrayList16);
                        lc00Var.add(new m52(psvVar, boo0Var, jmp0Var3, kmp0VarB, kmp0VarB2, new o4m0(dyb.r0(arrayList14), i4VarR0, z)));
                        return;
                    }
                    Object next4 = it5.next();
                    int i4 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str5 = ((cmp0) next4).b;
                    if (!kotlin.text.c.x(str5, ujn.h, false)) {
                        if (str5.length() == 0) {
                            str5 = "";
                        } else {
                            List list6 = u0d.f34849a;
                            if (u0d.c(str5)) {
                                str5 = "";
                            } else {
                                str5 = String.format(Locale.ENGLISH, StringsKt.O(str5, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str5}, 2));
                            }
                        }
                    }
                    zcl zclVar8 = qmk.f28987a;
                    arrayList3.add(new k4m0("", str5, 6.0f, 36.0f));
                    Iterator it14 = arrayList5.iterator();
                    while (it14.hasNext()) {
                        String str6 = (String) ((cmp0) it14.next()).c.get(i);
                        str6.getClass();
                        if (str6.length() == 0) {
                            str6 = "-";
                        }
                        arrayList3.add(new l4m0(str6, kkg.D, qmk.q, 36.0f, 3, 0.0f, 12.0f));
                    }
                    arrayList2.add(dyb.r0(arrayList3));
                    arrayList3.clear();
                    arrayList4 = arrayList5;
                    it4 = it5;
                    i = i4;
                }
            }
        }
    }

    public static final kmp0 b(r2s0 r2s0Var, String str, ctf0 ctf0Var) {
        Object next;
        Iterator it = r2s0Var.f29752a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((cmp0) next).f4618a.equals(str));
        cmp0 cmp0Var = (cmp0) next;
        if (cmp0Var == null) {
            return null;
        }
        long j = kkg.B;
        lsm0 lsm0Var = ctf0Var.b;
        lsm0 lsm0Var2 = ctf0Var.b;
        List<bmp0> listJ = q3d.j(new bmp0(j, lsm0Var.a(R.string.fifa_wins_title, Arrays.copyOf(new Object[0], 0)), cmp0Var.e), new bmp0(StaticColors.INSTANCE.m132getYellow0d7_KjU(), lsm0Var2.a(R.string.fifa_draws_title, Arrays.copyOf(new Object[0], 0)), cmp0Var.f), new bmp0(kkg.C, lsm0Var2.a(R.string.fifa_loses_title, Arrays.copyOf(new Object[0], 0)), cmp0Var.g));
        String strA = lsm0Var2.a(R.string.fifa_goal_difference_v2, Arrays.copyOf(new Object[]{cmp0Var.h}, 1));
        String strA2 = lsm0Var2.a(R.string.fifa_points_v2, Arrays.copyOf(new Object[]{cmp0Var.i}, 1));
        String str2 = cmp0Var.d;
        i4 i4VarR0 = dyb.r0(listJ);
        ArrayList arrayList = new ArrayList();
        for (bmp0 bmp0Var : listJ) {
            Integer intOrNull = StringsKt.toIntOrNull(bmp0Var.c);
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            vt90 vt90Var = iIntValue != 0 ? new vt90(iIntValue, bmp0Var.f2847a) : null;
            if (vt90Var != null) {
                arrayList.add(vt90Var);
            }
        }
        i4 i4VarR1 = dyb.r0(arrayList);
        zcl zclVar = qmk.f28987a;
        return new kmp0(strA, strA2, str2, new b1l(i4VarR1), i4VarR0);
    }
}
