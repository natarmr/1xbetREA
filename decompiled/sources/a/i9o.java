package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class i9o implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z8o f14395a;
    public final ctf0 b;
    public final g2v c;
    public final y78 d;
    public final long e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0048  */
    public i9o(z8o z8oVar, ctf0 ctf0Var, g2v g2vVar, y78 y78Var, long j) {
        h8o h8oVar;
        h8o h8oVar2;
        Object obj;
        ctf0Var.getClass();
        this.f14395a = z8oVar;
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = y78Var;
        this.e = j;
        final byte b = 0;
        this.f = maz.b(new yw9(z8oVar, new Function1(this) { // from class: a.h9o
            public final /* synthetic */ i9o b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:115:0x038e A[PHI: r24
  0x038e: PHI (r24v3 long) = (r24v2 long), (r24v2 long), (r24v6 long) binds: [B:145:0x03f3, B:130:0x03c6, B:114:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:160:0x0420  */
            /* JADX WARN: Code duplicated, block: B:161:0x0424  */
            /* JADX WARN: Code duplicated, block: B:163:0x042b  */
            /* JADX WARN: Code duplicated, block: B:165:0x0430  */
            /* JADX WARN: Code duplicated, block: B:167:0x0434  */
            /* JADX WARN: Code duplicated, block: B:168:0x0438  */
            /* JADX WARN: Code duplicated, block: B:170:0x043c  */
            /* JADX WARN: Code duplicated, block: B:171:0x0440  */
            /* JADX WARN: Code duplicated, block: B:173:0x0444  */
            /* JADX WARN: Code duplicated, block: B:174:0x0448  */
            /* JADX WARN: Code duplicated, block: B:177:0x0459  */
            /* JADX WARN: Code duplicated, block: B:178:0x045b  */
            /* JADX WARN: Code duplicated, block: B:181:0x0465  */
            /* JADX WARN: Code duplicated, block: B:183:0x046a  */
            /* JADX WARN: Code duplicated, block: B:215:0x0543  */
            /* JADX WARN: Code duplicated, block: B:217:0x056d  */
            /* JADX WARN: Code duplicated, block: B:218:0x0576  */
            /* JADX WARN: Code duplicated, block: B:220:0x0583  */
            /* JADX WARN: Code duplicated, block: B:222:0x0589  */
            /* JADX WARN: Code duplicated, block: B:223:0x058b  */
            /* JADX WARN: Code duplicated, block: B:228:0x05a0  */
            /* JADX WARN: Code duplicated, block: B:230:0x05b0  */
            /* JADX WARN: Code duplicated, block: B:276:0x0488 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:280:0x0358 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i;
                char c;
                ArrayList arrayList;
                ArrayList arrayList2;
                Iterator it;
                int i2;
                StringBuilder sb;
                String str;
                Iterator it2;
                int i3;
                int i4;
                int i5;
                char c2;
                long j2;
                lxl lxlVar;
                int size;
                long j3;
                int i6;
                long j4;
                boolean z;
                uxl uxlVar;
                lxl lxlVar2;
                int i7;
                List listSplit$default;
                c8o c8oVar;
                String str2;
                String str3;
                String str4;
                byte b2 = b;
                i9o i9oVar = this.b;
                switch (b2) {
                    case 0:
                        z8o z8oVar2 = (z8o) obj2;
                        z8oVar2.getClass();
                        ctf0 ctf0Var2 = i9oVar.b;
                        sff0 sff0Var = z8oVar2.d;
                        boolean z2 = z8oVar2.g;
                        ctf0Var2.getClass();
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String strE = ua80.e(sff0Var.c.g, z2 ? "static/img/ImgDefault/Esports/EWC/headerTablet" : "static/img/ImgDefault/Esports/EWC/header", ".png");
                        if (strE.length() == 0) {
                            i = 0;
                            sb2.setLength(0);
                        } else {
                            i = 0;
                            if (StringsKt.O(strE, ujn.h, false)) {
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else if (kotlin.text.c.x(strE, "https://", false)) {
                                i = 0;
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else {
                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                    c = '/';
                                } else {
                                    c = '/';
                                    sb2.append('/');
                                }
                                i = 0;
                                sb2.append(StringsKt.y0(strE, c));
                            }
                        }
                        return new f9o(z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder, ctf0Var2.b.a(R.string.cyber_world_cup_title, Arrays.copyOf(new Object[i], i)), sb2.toString());
                    case 1:
                        d8o d8oVar = (d8o) obj2;
                        d8oVar.getClass();
                        long j5 = i9oVar.e;
                        z8o z8oVar3 = i9oVar.f14395a;
                        ech echVar = z8oVar3.d.c;
                        List listD0 = echVar.h;
                        List list = echVar.j;
                        List list2 = echVar.i;
                        Map map = d8oVar.b;
                        long j6 = d8oVar.f5660a;
                        ctf0 ctf0Var3 = i9oVar.b;
                        boolean z3 = z8oVar3.g;
                        listD0.getClass();
                        list.getClass();
                        list2.getClass();
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (listD0.size() > list.size()) {
                            listD0 = CollectionsKt.D0(listD0, list.size());
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it3 = listD0.iterator();
                        int i8 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw null;
                            }
                            int iIntValue = ((Number) next).intValue();
                            boolean z4 = z3;
                            String str5 = (String) CollectionsKt.W(i8, list2);
                            if (str5 != null) {
                                i7 = 0;
                                listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{"&"}, false, 0, 6, null);
                            } else {
                                i7 = 0;
                                listSplit$default = null;
                            }
                            Long l = (Long) CollectionsKt.W(i8, list);
                            long jLongValue = l != null ? l.longValue() : -1L;
                            Long lT0 = (listSplit$default == null || (str3 = (String) CollectionsKt.W(i7, listSplit$default)) == null) ? null : StringsKt.t0(str3);
                            Long lT1 = (listSplit$default == null || (str2 = (String) CollectionsKt.W(1, listSplit$default)) == null) ? null : StringsKt.t0(str2);
                            ypl0 ypl0Var = (ypl0) map.get(Long.valueOf(iIntValue));
                            String str6 = ypl0Var != null ? ypl0Var.b : null;
                            if (lT0 == null || lT1 == null || str6 == null || StringsKt.W(str6)) {
                                c8oVar = null;
                            } else {
                                String str7 = ypl0Var.c.b;
                                long jLongValue2 = lT0.longValue();
                                long jLongValue3 = lT1.longValue();
                                rnk rnkVar = j5 < jLongValue2 ? rnk.SOON : j5 > jLongValue3 ? rnk.COMPLETED : rnk.LIVE;
                                rdj rdjVar = rdj.f30294a;
                                sdj sdjVar = sdj.UNIQUE_2;
                                c8oVar = new c8o(jLongValue, iIntValue, str6, ctf0Var3.b.a(R.string.bet_teams_info, Arrays.copyOf(new Object[]{rdj.f(new znq0(jLongValue2), sdjVar, null, 60), rdj.f(new znq0(jLongValue3), sdjVar, null, 60)}, 2)), str7, rnkVar);
                            }
                            arrayList3.add(c8oVar);
                            z3 = z4;
                            it3 = it3;
                            i8 = i9;
                            j6 = j6;
                            j5 = j5;
                        }
                        boolean z5 = z3;
                        long j7 = j6;
                        ArrayList arrayListS = CollectionsKt.S(arrayList3);
                        if (!arrayListS.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            lc00VarB.add(new n8o("DISCIPLINES_HEADER", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                            List list3 = b9o.f2220a;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = list3.iterator();
                            while (true) {
                                long j8 = 2;
                                if (it4.hasNext()) {
                                    aco0 aco0Var = (aco0) it4.next();
                                    byte b3 = aco0Var.f639a;
                                    byte b4 = aco0Var.f639a;
                                    long j9 = b3;
                                    a9o[] a9oVarArr = a9o.f488a;
                                    if (j9 == 1) {
                                        j2 = 2;
                                        size = arrayListS.size();
                                    } else {
                                        if (j9 != 2) {
                                            j2 = 2;
                                            if (j9 == 3) {
                                                if (arrayListS.isEmpty()) {
                                                    size = 0;
                                                } else {
                                                    Iterator it5 = arrayListS.iterator();
                                                    size = 0;
                                                    while (it5.hasNext()) {
                                                        if (((c8o) it5.next()).f == rnk.SOON && (size = size + 1) < 0) {
                                                            q3d.o();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            } else if (j9 != 4) {
                                                lxlVar = null;
                                                size = 0;
                                            } else if (arrayListS.isEmpty()) {
                                                size = 0;
                                            } else {
                                                Iterator it6 = arrayListS.iterator();
                                                size = 0;
                                                while (it6.hasNext()) {
                                                    if (((c8o) it6.next()).f == rnk.COMPLETED && (size = size + 1) < 0) {
                                                        q3d.o();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        } else if (arrayListS.isEmpty()) {
                                            j2 = 2;
                                            size = 0;
                                        } else {
                                            Iterator it7 = arrayListS.iterator();
                                            int i10 = 0;
                                            while (it7.hasNext()) {
                                                long j10 = j8;
                                                if (((c8o) it7.next()).f == rnk.LIVE && (i10 = i10 + 1) < 0) {
                                                    q3d.o();
                                                    throw null;
                                                }
                                                j8 = j10;
                                            }
                                            j2 = j8;
                                            size = i10;
                                        }
                                        if (size == 0) {
                                            lxlVar2 = lxlVar;
                                        } else {
                                            j3 = b4;
                                            a9o[] a9oVarArr2 = a9o.f488a;
                                            if (j3 == 1) {
                                                i6 = R.string.all;
                                            } else if (j3 == j2) {
                                                i6 = R.string.live_new;
                                            } else if (j3 == 3) {
                                                i6 = R.string.soon;
                                            } else if (j3 == 4) {
                                                i6 = R.string.completed;
                                            } else {
                                                i6 = 0;
                                            }
                                            String strA = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                            j4 = b4;
                                            if (j7 == j4) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            xxl xxlVar = new xxl(strA);
                                            if (z) {
                                                uxlVar = uxl.b;
                                            } else {
                                                uxlVar = uxl.f36445a;
                                            }
                                            lxlVar2 = new lxl(j4, (dyl) xxlVar, false, uxlVar, new cwl(new rpe(size)), 76);
                                        }
                                        if (lxlVar2 != null) {
                                            arrayList4.add(lxlVar2);
                                        }
                                    }
                                    lxlVar = null;
                                    if (size == 0) {
                                        lxlVar2 = lxlVar;
                                    } else {
                                        j3 = b4;
                                        a9o[] a9oVarArr3 = a9o.f488a;
                                        if (j3 == 1) {
                                            i6 = R.string.all;
                                        } else if (j3 == j2) {
                                            i6 = R.string.live_new;
                                        } else if (j3 == 3) {
                                            i6 = R.string.soon;
                                        } else if (j3 == 4) {
                                            i6 = R.string.completed;
                                        } else {
                                            i6 = 0;
                                        }
                                        String strA2 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                        j4 = b4;
                                        if (j7 == j4) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        xxl xxlVar2 = new xxl(strA2);
                                        if (z) {
                                            uxlVar = uxl.b;
                                        } else {
                                            uxlVar = uxl.f36445a;
                                        }
                                        lxlVar2 = new lxl(j4, (dyl) xxlVar2, false, uxlVar, new cwl(new rpe(size)), 76);
                                    }
                                    if (lxlVar2 != null) {
                                        arrayList4.add(lxlVar2);
                                    }
                                } else {
                                    lc00VarB.add(new kok("DISCIPLINE_TABS_ID", new fyl(dyb.o0(arrayList4), null, null, s5x0.t(xfn.b(z5).c, 0.0f, 2), null, 22)));
                                    a9o[] a9oVarArr4 = a9o.f488a;
                                    if (j7 == 2) {
                                        arrayList = new ArrayList();
                                        for (Object obj3 : arrayListS) {
                                            if (((c8o) obj3).f == rnk.LIVE) {
                                                arrayList.add(obj3);
                                            }
                                        }
                                    } else if (j7 == 3) {
                                        arrayList = new ArrayList();
                                        for (Object obj4 : arrayListS) {
                                            if (((c8o) obj4).f == rnk.SOON) {
                                                arrayList.add(obj4);
                                            }
                                        }
                                    } else {
                                        if (j7 == 4) {
                                            arrayList = new ArrayList();
                                            for (Object obj5 : arrayListS) {
                                                if (((c8o) obj5).f == rnk.COMPLETED) {
                                                    arrayList.add(obj5);
                                                }
                                            }
                                        }
                                        String strValueOf = String.valueOf(j7);
                                        arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                        it = arrayListS.iterator();
                                        while (it.hasNext()) {
                                            c8o c8oVar2 = (c8o) it.next();
                                            i2 = c8oVar2.b;
                                            long j11 = c8oVar2.f3923a;
                                            String str8 = c8oVar2.c;
                                            str8.getClass();
                                            String str9 = c8oVar2.d;
                                            str9.getClass();
                                            sb = new StringBuilder(ujn.h);
                                            str = c8oVar2.e;
                                            str.getClass();
                                            if (str.length() == 0) {
                                                it2 = it;
                                                sb.setLength(0);
                                                i3 = i2;
                                            } else {
                                                it2 = it;
                                                i3 = i2;
                                                if (!StringsKt.O(str, ujn.h, false)) {
                                                    i4 = 0;
                                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                                    i4 = 0;
                                                } else {
                                                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                        i5 = 1;
                                                        c2 = '/';
                                                    } else {
                                                        sb.append('/');
                                                        c2 = '/';
                                                        i5 = 1;
                                                    }
                                                    char[] cArr = new char[i5];
                                                    cArr[0] = c2;
                                                    sb.append(StringsKt.y0(str, cArr));
                                                }
                                                sb.setLength(i4);
                                                sb.append(str);
                                            }
                                            arrayList2.add(new wnk(i3, j11, str8, str9, new tnk(sb.toString()), c8oVar2.f));
                                            it = it2;
                                        }
                                        lc00VarB.add(new e8o(strValueOf, arrayList2));
                                    }
                                    arrayListS = arrayList;
                                    String strValueOf2 = String.valueOf(j7);
                                    arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        c8o c8oVar3 = (c8o) it.next();
                                        i2 = c8oVar3.b;
                                        long j12 = c8oVar3.f3923a;
                                        String str10 = c8oVar3.c;
                                        str10.getClass();
                                        String str11 = c8oVar3.d;
                                        str11.getClass();
                                        sb = new StringBuilder(ujn.h);
                                        str = c8oVar3.e;
                                        str.getClass();
                                        if (str.length() == 0) {
                                            it2 = it;
                                            sb.setLength(0);
                                            i3 = i2;
                                        } else {
                                            it2 = it;
                                            i3 = i2;
                                            if (!StringsKt.O(str, ujn.h, false)) {
                                                i4 = 0;
                                            } else if (kotlin.text.c.x(str, "https://", false)) {
                                                i4 = 0;
                                            } else {
                                                if (sb.length() > 0) {
                                                    i5 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i5 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr2 = new char[i5];
                                                cArr2[0] = c2;
                                                sb.append(StringsKt.y0(str, cArr2));
                                            }
                                            sb.setLength(i4);
                                            sb.append(str);
                                        }
                                        arrayList2.add(new wnk(i3, j12, str10, str11, new tnk(sb.toString()), c8oVar3.f));
                                        it = it2;
                                    }
                                    lc00VarB.add(new e8o(strValueOf2, arrayList2));
                                }
                            }
                        }
                        return kotlin.collections.a.a(lc00VarB);
                    case 2:
                        h8o h8oVar3 = (h8o) obj2;
                        h8oVar3.getClass();
                        y78 y78Var2 = i9oVar.d;
                        z8o z8oVar4 = i9oVar.f14395a;
                        sff0 sff0Var2 = z8oVar4.d;
                        boolean z6 = z8oVar4.e;
                        w7o w7oVar = z8oVar4.b;
                        List list4 = w7oVar != null ? w7oVar.d : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return hkb.A(h8oVar3, y78Var2, sff0Var2, z6, list4, i9oVar.b, true, z8oVar4.h);
                    case 3:
                        h8o h8oVar4 = (h8o) obj2;
                        h8oVar4.getClass();
                        y78 y78Var3 = i9oVar.d;
                        z8o z8oVar5 = i9oVar.f14395a;
                        sff0 sff0Var3 = z8oVar5.d;
                        boolean z7 = z8oVar5.e;
                        w7o w7oVar2 = z8oVar5.b;
                        List list5 = w7oVar2 != null ? w7oVar2.d : null;
                        if (list5 == null) {
                            list5 = iun.f15405a;
                        }
                        return hkb.A(h8oVar4, y78Var3, sff0Var3, z7, list5, i9oVar.b, false, z8oVar5.h);
                    case 4:
                        List<uog> list6 = (List) obj2;
                        list6.getClass();
                        ctf0 ctf0Var4 = i9oVar.b;
                        ctf0Var4.getClass();
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        if (list6.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00VarB2.add(new n8o("PROMO_HEADER", new hjm(ctf0Var4.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                        ArrayList arrayList5 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            arrayList5.add(new owr0(uogVar.f36012a, uogVar.b, uogVar.d, uogVar.l, uogVar.f, uogVar.i, uogVar.j, uogVar.k, uogVar.g, uogVar.h));
                        }
                        lc00VarB2.add(new p8o(dyb.r0(arrayList5)));
                        return kotlin.collections.a.a(lc00VarB2);
                    default:
                        List<phk0> list7 = (List) obj2;
                        list7.getClass();
                        ctf0 ctf0Var5 = i9oVar.b;
                        ctf0Var5.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (list7.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB3.add(new n8o("SOCIAL_NETWORKS_HEADER", new hjm(lsm0Var2.a(R.string.social_networks, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126)));
                        for (phk0 phk0Var : list7) {
                            String str12 = phk0Var.f27002a;
                            String str13 = phk0Var.b;
                            if (str12.equals(lsm0Var2.a(R.string.social_telegram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "org.telegram.messenger";
                            } else if (str12.equals(lsm0Var2.a(R.string.social_instagram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.instagram.android";
                            } else if (str12.equals(lsm0Var2.a(R.string.social_x_label, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.twitter.android";
                            } else {
                                str4 = str12.equals(lsm0Var2.a(R.string.social_discord, Arrays.copyOf(new Object[0], 0))) ? "com.discord" : "";
                            }
                            lc00VarB3.add(new o5s0(str12, str13, str4, phk0Var.c));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                }
            }
        }, (byte) 20));
        final byte b2 = 1;
        this.g = maz.b(new yw9(z8oVar.f, new Function1(this) { // from class: a.h9o
            public final /* synthetic */ i9o b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:115:0x038e A[PHI: r24
  0x038e: PHI (r24v3 long) = (r24v2 long), (r24v2 long), (r24v6 long) binds: [B:145:0x03f3, B:130:0x03c6, B:114:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:160:0x0420  */
            /* JADX WARN: Code duplicated, block: B:161:0x0424  */
            /* JADX WARN: Code duplicated, block: B:163:0x042b  */
            /* JADX WARN: Code duplicated, block: B:165:0x0430  */
            /* JADX WARN: Code duplicated, block: B:167:0x0434  */
            /* JADX WARN: Code duplicated, block: B:168:0x0438  */
            /* JADX WARN: Code duplicated, block: B:170:0x043c  */
            /* JADX WARN: Code duplicated, block: B:171:0x0440  */
            /* JADX WARN: Code duplicated, block: B:173:0x0444  */
            /* JADX WARN: Code duplicated, block: B:174:0x0448  */
            /* JADX WARN: Code duplicated, block: B:177:0x0459  */
            /* JADX WARN: Code duplicated, block: B:178:0x045b  */
            /* JADX WARN: Code duplicated, block: B:181:0x0465  */
            /* JADX WARN: Code duplicated, block: B:183:0x046a  */
            /* JADX WARN: Code duplicated, block: B:215:0x0543  */
            /* JADX WARN: Code duplicated, block: B:217:0x056d  */
            /* JADX WARN: Code duplicated, block: B:218:0x0576  */
            /* JADX WARN: Code duplicated, block: B:220:0x0583  */
            /* JADX WARN: Code duplicated, block: B:222:0x0589  */
            /* JADX WARN: Code duplicated, block: B:223:0x058b  */
            /* JADX WARN: Code duplicated, block: B:228:0x05a0  */
            /* JADX WARN: Code duplicated, block: B:230:0x05b0  */
            /* JADX WARN: Code duplicated, block: B:276:0x0488 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:280:0x0358 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i;
                char c;
                ArrayList arrayList;
                ArrayList arrayList2;
                Iterator it;
                int i2;
                StringBuilder sb;
                String str;
                Iterator it2;
                int i3;
                int i4;
                int i5;
                char c2;
                long j2;
                lxl lxlVar;
                int size;
                long j3;
                int i6;
                long j4;
                boolean z;
                uxl uxlVar;
                lxl lxlVar2;
                int i7;
                List listSplit$default;
                c8o c8oVar;
                String str2;
                String str3;
                String str4;
                byte b3 = b2;
                i9o i9oVar = this.b;
                switch (b3) {
                    case 0:
                        z8o z8oVar2 = (z8o) obj2;
                        z8oVar2.getClass();
                        ctf0 ctf0Var2 = i9oVar.b;
                        sff0 sff0Var = z8oVar2.d;
                        boolean z2 = z8oVar2.g;
                        ctf0Var2.getClass();
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String strE = ua80.e(sff0Var.c.g, z2 ? "static/img/ImgDefault/Esports/EWC/headerTablet" : "static/img/ImgDefault/Esports/EWC/header", ".png");
                        if (strE.length() == 0) {
                            i = 0;
                            sb2.setLength(0);
                        } else {
                            i = 0;
                            if (StringsKt.O(strE, ujn.h, false)) {
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else if (kotlin.text.c.x(strE, "https://", false)) {
                                i = 0;
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else {
                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                    c = '/';
                                } else {
                                    c = '/';
                                    sb2.append('/');
                                }
                                i = 0;
                                sb2.append(StringsKt.y0(strE, c));
                            }
                        }
                        return new f9o(z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder, ctf0Var2.b.a(R.string.cyber_world_cup_title, Arrays.copyOf(new Object[i], i)), sb2.toString());
                    case 1:
                        d8o d8oVar = (d8o) obj2;
                        d8oVar.getClass();
                        long j5 = i9oVar.e;
                        z8o z8oVar3 = i9oVar.f14395a;
                        ech echVar = z8oVar3.d.c;
                        List listD0 = echVar.h;
                        List list = echVar.j;
                        List list2 = echVar.i;
                        Map map = d8oVar.b;
                        long j6 = d8oVar.f5660a;
                        ctf0 ctf0Var3 = i9oVar.b;
                        boolean z3 = z8oVar3.g;
                        listD0.getClass();
                        list.getClass();
                        list2.getClass();
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (listD0.size() > list.size()) {
                            listD0 = CollectionsKt.D0(listD0, list.size());
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it3 = listD0.iterator();
                        int i8 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw null;
                            }
                            int iIntValue = ((Number) next).intValue();
                            boolean z4 = z3;
                            String str5 = (String) CollectionsKt.W(i8, list2);
                            if (str5 != null) {
                                i7 = 0;
                                listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{"&"}, false, 0, 6, null);
                            } else {
                                i7 = 0;
                                listSplit$default = null;
                            }
                            Long l = (Long) CollectionsKt.W(i8, list);
                            long jLongValue = l != null ? l.longValue() : -1L;
                            Long lT0 = (listSplit$default == null || (str3 = (String) CollectionsKt.W(i7, listSplit$default)) == null) ? null : StringsKt.t0(str3);
                            Long lT1 = (listSplit$default == null || (str2 = (String) CollectionsKt.W(1, listSplit$default)) == null) ? null : StringsKt.t0(str2);
                            ypl0 ypl0Var = (ypl0) map.get(Long.valueOf(iIntValue));
                            String str6 = ypl0Var != null ? ypl0Var.b : null;
                            if (lT0 == null || lT1 == null || str6 == null || StringsKt.W(str6)) {
                                c8oVar = null;
                            } else {
                                String str7 = ypl0Var.c.b;
                                long jLongValue2 = lT0.longValue();
                                long jLongValue3 = lT1.longValue();
                                rnk rnkVar = j5 < jLongValue2 ? rnk.SOON : j5 > jLongValue3 ? rnk.COMPLETED : rnk.LIVE;
                                rdj rdjVar = rdj.f30294a;
                                sdj sdjVar = sdj.UNIQUE_2;
                                c8oVar = new c8o(jLongValue, iIntValue, str6, ctf0Var3.b.a(R.string.bet_teams_info, Arrays.copyOf(new Object[]{rdj.f(new znq0(jLongValue2), sdjVar, null, 60), rdj.f(new znq0(jLongValue3), sdjVar, null, 60)}, 2)), str7, rnkVar);
                            }
                            arrayList3.add(c8oVar);
                            z3 = z4;
                            it3 = it3;
                            i8 = i9;
                            j6 = j6;
                            j5 = j5;
                        }
                        boolean z5 = z3;
                        long j7 = j6;
                        ArrayList arrayListS = CollectionsKt.S(arrayList3);
                        if (!arrayListS.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            lc00VarB.add(new n8o("DISCIPLINES_HEADER", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                            List list3 = b9o.f2220a;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = list3.iterator();
                            while (true) {
                                long j8 = 2;
                                if (it4.hasNext()) {
                                    aco0 aco0Var = (aco0) it4.next();
                                    byte b4 = aco0Var.f639a;
                                    byte b5 = aco0Var.f639a;
                                    long j9 = b4;
                                    a9o[] a9oVarArr = a9o.f488a;
                                    if (j9 == 1) {
                                        j2 = 2;
                                        size = arrayListS.size();
                                    } else {
                                        if (j9 != 2) {
                                            j2 = 2;
                                            if (j9 == 3) {
                                                if (arrayListS.isEmpty()) {
                                                    size = 0;
                                                } else {
                                                    Iterator it5 = arrayListS.iterator();
                                                    size = 0;
                                                    while (it5.hasNext()) {
                                                        if (((c8o) it5.next()).f == rnk.SOON && (size = size + 1) < 0) {
                                                            q3d.o();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            } else if (j9 != 4) {
                                                lxlVar = null;
                                                size = 0;
                                            } else if (arrayListS.isEmpty()) {
                                                size = 0;
                                            } else {
                                                Iterator it6 = arrayListS.iterator();
                                                size = 0;
                                                while (it6.hasNext()) {
                                                    if (((c8o) it6.next()).f == rnk.COMPLETED && (size = size + 1) < 0) {
                                                        q3d.o();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        } else if (arrayListS.isEmpty()) {
                                            j2 = 2;
                                            size = 0;
                                        } else {
                                            Iterator it7 = arrayListS.iterator();
                                            int i10 = 0;
                                            while (it7.hasNext()) {
                                                long j10 = j8;
                                                if (((c8o) it7.next()).f == rnk.LIVE && (i10 = i10 + 1) < 0) {
                                                    q3d.o();
                                                    throw null;
                                                }
                                                j8 = j10;
                                            }
                                            j2 = j8;
                                            size = i10;
                                        }
                                        if (size == 0) {
                                            lxlVar2 = lxlVar;
                                        } else {
                                            j3 = b5;
                                            a9o[] a9oVarArr3 = a9o.f488a;
                                            if (j3 == 1) {
                                                i6 = R.string.all;
                                            } else if (j3 == j2) {
                                                i6 = R.string.live_new;
                                            } else if (j3 == 3) {
                                                i6 = R.string.soon;
                                            } else if (j3 == 4) {
                                                i6 = R.string.completed;
                                            } else {
                                                i6 = 0;
                                            }
                                            String strA2 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                            j4 = b5;
                                            if (j7 == j4) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            xxl xxlVar2 = new xxl(strA2);
                                            if (z) {
                                                uxlVar = uxl.b;
                                            } else {
                                                uxlVar = uxl.f36445a;
                                            }
                                            lxlVar2 = new lxl(j4, (dyl) xxlVar2, false, uxlVar, new cwl(new rpe(size)), 76);
                                        }
                                        if (lxlVar2 != null) {
                                            arrayList4.add(lxlVar2);
                                        }
                                    }
                                    lxlVar = null;
                                    if (size == 0) {
                                        lxlVar2 = lxlVar;
                                    } else {
                                        j3 = b5;
                                        a9o[] a9oVarArr4 = a9o.f488a;
                                        if (j3 == 1) {
                                            i6 = R.string.all;
                                        } else if (j3 == j2) {
                                            i6 = R.string.live_new;
                                        } else if (j3 == 3) {
                                            i6 = R.string.soon;
                                        } else if (j3 == 4) {
                                            i6 = R.string.completed;
                                        } else {
                                            i6 = 0;
                                        }
                                        String strA3 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                        j4 = b5;
                                        if (j7 == j4) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        xxl xxlVar3 = new xxl(strA3);
                                        if (z) {
                                            uxlVar = uxl.b;
                                        } else {
                                            uxlVar = uxl.f36445a;
                                        }
                                        lxlVar2 = new lxl(j4, (dyl) xxlVar3, false, uxlVar, new cwl(new rpe(size)), 76);
                                    }
                                    if (lxlVar2 != null) {
                                        arrayList4.add(lxlVar2);
                                    }
                                } else {
                                    lc00VarB.add(new kok("DISCIPLINE_TABS_ID", new fyl(dyb.o0(arrayList4), null, null, s5x0.t(xfn.b(z5).c, 0.0f, 2), null, 22)));
                                    a9o[] a9oVarArr5 = a9o.f488a;
                                    if (j7 == 2) {
                                        arrayList = new ArrayList();
                                        for (Object obj3 : arrayListS) {
                                            if (((c8o) obj3).f == rnk.LIVE) {
                                                arrayList.add(obj3);
                                            }
                                        }
                                    } else if (j7 == 3) {
                                        arrayList = new ArrayList();
                                        for (Object obj4 : arrayListS) {
                                            if (((c8o) obj4).f == rnk.SOON) {
                                                arrayList.add(obj4);
                                            }
                                        }
                                    } else {
                                        if (j7 == 4) {
                                            arrayList = new ArrayList();
                                            for (Object obj5 : arrayListS) {
                                                if (((c8o) obj5).f == rnk.COMPLETED) {
                                                    arrayList.add(obj5);
                                                }
                                            }
                                        }
                                        String strValueOf2 = String.valueOf(j7);
                                        arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                        it = arrayListS.iterator();
                                        while (it.hasNext()) {
                                            c8o c8oVar3 = (c8o) it.next();
                                            i2 = c8oVar3.b;
                                            long j12 = c8oVar3.f3923a;
                                            String str10 = c8oVar3.c;
                                            str10.getClass();
                                            String str11 = c8oVar3.d;
                                            str11.getClass();
                                            sb = new StringBuilder(ujn.h);
                                            str = c8oVar3.e;
                                            str.getClass();
                                            if (str.length() == 0) {
                                                it2 = it;
                                                sb.setLength(0);
                                                i3 = i2;
                                            } else {
                                                it2 = it;
                                                i3 = i2;
                                                if (!StringsKt.O(str, ujn.h, false)) {
                                                    i4 = 0;
                                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                                    i4 = 0;
                                                } else {
                                                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                        i5 = 1;
                                                        c2 = '/';
                                                    } else {
                                                        sb.append('/');
                                                        c2 = '/';
                                                        i5 = 1;
                                                    }
                                                    char[] cArr2 = new char[i5];
                                                    cArr2[0] = c2;
                                                    sb.append(StringsKt.y0(str, cArr2));
                                                }
                                                sb.setLength(i4);
                                                sb.append(str);
                                            }
                                            arrayList2.add(new wnk(i3, j12, str10, str11, new tnk(sb.toString()), c8oVar3.f));
                                            it = it2;
                                        }
                                        lc00VarB.add(new e8o(strValueOf2, arrayList2));
                                    }
                                    arrayListS = arrayList;
                                    String strValueOf3 = String.valueOf(j7);
                                    arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        c8o c8oVar4 = (c8o) it.next();
                                        i2 = c8oVar4.b;
                                        long j13 = c8oVar4.f3923a;
                                        String str12 = c8oVar4.c;
                                        str12.getClass();
                                        String str13 = c8oVar4.d;
                                        str13.getClass();
                                        sb = new StringBuilder(ujn.h);
                                        str = c8oVar4.e;
                                        str.getClass();
                                        if (str.length() == 0) {
                                            it2 = it;
                                            sb.setLength(0);
                                            i3 = i2;
                                        } else {
                                            it2 = it;
                                            i3 = i2;
                                            if (!StringsKt.O(str, ujn.h, false)) {
                                                i4 = 0;
                                            } else if (kotlin.text.c.x(str, "https://", false)) {
                                                i4 = 0;
                                            } else {
                                                if (sb.length() > 0) {
                                                    i5 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i5 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr3 = new char[i5];
                                                cArr3[0] = c2;
                                                sb.append(StringsKt.y0(str, cArr3));
                                            }
                                            sb.setLength(i4);
                                            sb.append(str);
                                        }
                                        arrayList2.add(new wnk(i3, j13, str12, str13, new tnk(sb.toString()), c8oVar4.f));
                                        it = it2;
                                    }
                                    lc00VarB.add(new e8o(strValueOf3, arrayList2));
                                }
                            }
                        }
                        return kotlin.collections.a.a(lc00VarB);
                    case 2:
                        h8o h8oVar3 = (h8o) obj2;
                        h8oVar3.getClass();
                        y78 y78Var2 = i9oVar.d;
                        z8o z8oVar4 = i9oVar.f14395a;
                        sff0 sff0Var2 = z8oVar4.d;
                        boolean z6 = z8oVar4.e;
                        w7o w7oVar = z8oVar4.b;
                        List list4 = w7oVar != null ? w7oVar.d : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return hkb.A(h8oVar3, y78Var2, sff0Var2, z6, list4, i9oVar.b, true, z8oVar4.h);
                    case 3:
                        h8o h8oVar4 = (h8o) obj2;
                        h8oVar4.getClass();
                        y78 y78Var3 = i9oVar.d;
                        z8o z8oVar5 = i9oVar.f14395a;
                        sff0 sff0Var3 = z8oVar5.d;
                        boolean z7 = z8oVar5.e;
                        w7o w7oVar2 = z8oVar5.b;
                        List list5 = w7oVar2 != null ? w7oVar2.d : null;
                        if (list5 == null) {
                            list5 = iun.f15405a;
                        }
                        return hkb.A(h8oVar4, y78Var3, sff0Var3, z7, list5, i9oVar.b, false, z8oVar5.h);
                    case 4:
                        List<uog> list6 = (List) obj2;
                        list6.getClass();
                        ctf0 ctf0Var4 = i9oVar.b;
                        ctf0Var4.getClass();
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        if (list6.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00VarB2.add(new n8o("PROMO_HEADER", new hjm(ctf0Var4.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                        ArrayList arrayList5 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            arrayList5.add(new owr0(uogVar.f36012a, uogVar.b, uogVar.d, uogVar.l, uogVar.f, uogVar.i, uogVar.j, uogVar.k, uogVar.g, uogVar.h));
                        }
                        lc00VarB2.add(new p8o(dyb.r0(arrayList5)));
                        return kotlin.collections.a.a(lc00VarB2);
                    default:
                        List<phk0> list7 = (List) obj2;
                        list7.getClass();
                        ctf0 ctf0Var5 = i9oVar.b;
                        ctf0Var5.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (list7.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB3.add(new n8o("SOCIAL_NETWORKS_HEADER", new hjm(lsm0Var2.a(R.string.social_networks, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126)));
                        for (phk0 phk0Var : list7) {
                            String str14 = phk0Var.f27002a;
                            String str15 = phk0Var.b;
                            if (str14.equals(lsm0Var2.a(R.string.social_telegram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "org.telegram.messenger";
                            } else if (str14.equals(lsm0Var2.a(R.string.social_instagram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.instagram.android";
                            } else if (str14.equals(lsm0Var2.a(R.string.social_x_label, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.twitter.android";
                            } else {
                                str4 = str14.equals(lsm0Var2.a(R.string.social_discord, Arrays.copyOf(new Object[0], 0))) ? "com.discord" : "";
                            }
                            lc00VarB3.add(new o5s0(str14, str15, str4, phk0Var.c));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                }
            }
        }, (byte) 20));
        w7o w7oVar = z8oVar.b;
        if (w7oVar != null) {
            Object obj2 = w7oVar.f38683a;
            e0g0 e0g0Var = j0g0.b;
            h8oVar = (h8o) (obj2 instanceof g0g0 ? null : obj2);
            if (h8oVar == null) {
                iun iunVar = iun.f15405a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                h8oVar = new h8o(iunVar, lunVar);
            }
        } else {
            iun iunVar2 = iun.f15405a;
            lun lunVar2 = lun.f20680a;
            lunVar2.getClass();
            h8oVar = new h8o(iunVar2, lunVar2);
        }
        final byte b3 = 2;
        this.h = maz.b(new yw9(h8oVar, new Function1(this) { // from class: a.h9o
            public final /* synthetic */ i9o b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:115:0x038e A[PHI: r24
  0x038e: PHI (r24v3 long) = (r24v2 long), (r24v2 long), (r24v6 long) binds: [B:145:0x03f3, B:130:0x03c6, B:114:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:160:0x0420  */
            /* JADX WARN: Code duplicated, block: B:161:0x0424  */
            /* JADX WARN: Code duplicated, block: B:163:0x042b  */
            /* JADX WARN: Code duplicated, block: B:165:0x0430  */
            /* JADX WARN: Code duplicated, block: B:167:0x0434  */
            /* JADX WARN: Code duplicated, block: B:168:0x0438  */
            /* JADX WARN: Code duplicated, block: B:170:0x043c  */
            /* JADX WARN: Code duplicated, block: B:171:0x0440  */
            /* JADX WARN: Code duplicated, block: B:173:0x0444  */
            /* JADX WARN: Code duplicated, block: B:174:0x0448  */
            /* JADX WARN: Code duplicated, block: B:177:0x0459  */
            /* JADX WARN: Code duplicated, block: B:178:0x045b  */
            /* JADX WARN: Code duplicated, block: B:181:0x0465  */
            /* JADX WARN: Code duplicated, block: B:183:0x046a  */
            /* JADX WARN: Code duplicated, block: B:215:0x0543  */
            /* JADX WARN: Code duplicated, block: B:217:0x056d  */
            /* JADX WARN: Code duplicated, block: B:218:0x0576  */
            /* JADX WARN: Code duplicated, block: B:220:0x0583  */
            /* JADX WARN: Code duplicated, block: B:222:0x0589  */
            /* JADX WARN: Code duplicated, block: B:223:0x058b  */
            /* JADX WARN: Code duplicated, block: B:228:0x05a0  */
            /* JADX WARN: Code duplicated, block: B:230:0x05b0  */
            /* JADX WARN: Code duplicated, block: B:276:0x0488 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:280:0x0358 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                int i;
                char c;
                ArrayList arrayList;
                ArrayList arrayList2;
                Iterator it;
                int i2;
                StringBuilder sb;
                String str;
                Iterator it2;
                int i3;
                int i4;
                int i5;
                char c2;
                long j2;
                lxl lxlVar;
                int size;
                long j3;
                int i6;
                long j4;
                boolean z;
                uxl uxlVar;
                lxl lxlVar2;
                int i7;
                List listSplit$default;
                c8o c8oVar;
                String str2;
                String str3;
                String str4;
                byte b4 = b3;
                i9o i9oVar = this.b;
                switch (b4) {
                    case 0:
                        z8o z8oVar2 = (z8o) obj3;
                        z8oVar2.getClass();
                        ctf0 ctf0Var2 = i9oVar.b;
                        sff0 sff0Var = z8oVar2.d;
                        boolean z2 = z8oVar2.g;
                        ctf0Var2.getClass();
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String strE = ua80.e(sff0Var.c.g, z2 ? "static/img/ImgDefault/Esports/EWC/headerTablet" : "static/img/ImgDefault/Esports/EWC/header", ".png");
                        if (strE.length() == 0) {
                            i = 0;
                            sb2.setLength(0);
                        } else {
                            i = 0;
                            if (StringsKt.O(strE, ujn.h, false)) {
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else if (kotlin.text.c.x(strE, "https://", false)) {
                                i = 0;
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else {
                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                    c = '/';
                                } else {
                                    c = '/';
                                    sb2.append('/');
                                }
                                i = 0;
                                sb2.append(StringsKt.y0(strE, c));
                            }
                        }
                        return new f9o(z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder, ctf0Var2.b.a(R.string.cyber_world_cup_title, Arrays.copyOf(new Object[i], i)), sb2.toString());
                    case 1:
                        d8o d8oVar = (d8o) obj3;
                        d8oVar.getClass();
                        long j5 = i9oVar.e;
                        z8o z8oVar3 = i9oVar.f14395a;
                        ech echVar = z8oVar3.d.c;
                        List listD0 = echVar.h;
                        List list = echVar.j;
                        List list2 = echVar.i;
                        Map map = d8oVar.b;
                        long j6 = d8oVar.f5660a;
                        ctf0 ctf0Var3 = i9oVar.b;
                        boolean z3 = z8oVar3.g;
                        listD0.getClass();
                        list.getClass();
                        list2.getClass();
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (listD0.size() > list.size()) {
                            listD0 = CollectionsKt.D0(listD0, list.size());
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it3 = listD0.iterator();
                        int i8 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw null;
                            }
                            int iIntValue = ((Number) next).intValue();
                            boolean z4 = z3;
                            String str5 = (String) CollectionsKt.W(i8, list2);
                            if (str5 != null) {
                                i7 = 0;
                                listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{"&"}, false, 0, 6, null);
                            } else {
                                i7 = 0;
                                listSplit$default = null;
                            }
                            Long l = (Long) CollectionsKt.W(i8, list);
                            long jLongValue = l != null ? l.longValue() : -1L;
                            Long lT0 = (listSplit$default == null || (str3 = (String) CollectionsKt.W(i7, listSplit$default)) == null) ? null : StringsKt.t0(str3);
                            Long lT1 = (listSplit$default == null || (str2 = (String) CollectionsKt.W(1, listSplit$default)) == null) ? null : StringsKt.t0(str2);
                            ypl0 ypl0Var = (ypl0) map.get(Long.valueOf(iIntValue));
                            String str6 = ypl0Var != null ? ypl0Var.b : null;
                            if (lT0 == null || lT1 == null || str6 == null || StringsKt.W(str6)) {
                                c8oVar = null;
                            } else {
                                String str7 = ypl0Var.c.b;
                                long jLongValue2 = lT0.longValue();
                                long jLongValue3 = lT1.longValue();
                                rnk rnkVar = j5 < jLongValue2 ? rnk.SOON : j5 > jLongValue3 ? rnk.COMPLETED : rnk.LIVE;
                                rdj rdjVar = rdj.f30294a;
                                sdj sdjVar = sdj.UNIQUE_2;
                                c8oVar = new c8o(jLongValue, iIntValue, str6, ctf0Var3.b.a(R.string.bet_teams_info, Arrays.copyOf(new Object[]{rdj.f(new znq0(jLongValue2), sdjVar, null, 60), rdj.f(new znq0(jLongValue3), sdjVar, null, 60)}, 2)), str7, rnkVar);
                            }
                            arrayList3.add(c8oVar);
                            z3 = z4;
                            it3 = it3;
                            i8 = i9;
                            j6 = j6;
                            j5 = j5;
                        }
                        boolean z5 = z3;
                        long j7 = j6;
                        ArrayList arrayListS = CollectionsKt.S(arrayList3);
                        if (!arrayListS.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            lc00VarB.add(new n8o("DISCIPLINES_HEADER", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                            List list3 = b9o.f2220a;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = list3.iterator();
                            while (true) {
                                long j8 = 2;
                                if (it4.hasNext()) {
                                    aco0 aco0Var = (aco0) it4.next();
                                    byte b5 = aco0Var.f639a;
                                    byte b6 = aco0Var.f639a;
                                    long j9 = b5;
                                    a9o[] a9oVarArr = a9o.f488a;
                                    if (j9 == 1) {
                                        j2 = 2;
                                        size = arrayListS.size();
                                    } else {
                                        if (j9 != 2) {
                                            j2 = 2;
                                            if (j9 == 3) {
                                                if (arrayListS.isEmpty()) {
                                                    size = 0;
                                                } else {
                                                    Iterator it5 = arrayListS.iterator();
                                                    size = 0;
                                                    while (it5.hasNext()) {
                                                        if (((c8o) it5.next()).f == rnk.SOON && (size = size + 1) < 0) {
                                                            q3d.o();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            } else if (j9 != 4) {
                                                lxlVar = null;
                                                size = 0;
                                            } else if (arrayListS.isEmpty()) {
                                                size = 0;
                                            } else {
                                                Iterator it6 = arrayListS.iterator();
                                                size = 0;
                                                while (it6.hasNext()) {
                                                    if (((c8o) it6.next()).f == rnk.COMPLETED && (size = size + 1) < 0) {
                                                        q3d.o();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        } else if (arrayListS.isEmpty()) {
                                            j2 = 2;
                                            size = 0;
                                        } else {
                                            Iterator it7 = arrayListS.iterator();
                                            int i10 = 0;
                                            while (it7.hasNext()) {
                                                long j10 = j8;
                                                if (((c8o) it7.next()).f == rnk.LIVE && (i10 = i10 + 1) < 0) {
                                                    q3d.o();
                                                    throw null;
                                                }
                                                j8 = j10;
                                            }
                                            j2 = j8;
                                            size = i10;
                                        }
                                        if (size == 0) {
                                            lxlVar2 = lxlVar;
                                        } else {
                                            j3 = b6;
                                            a9o[] a9oVarArr4 = a9o.f488a;
                                            if (j3 == 1) {
                                                i6 = R.string.all;
                                            } else if (j3 == j2) {
                                                i6 = R.string.live_new;
                                            } else if (j3 == 3) {
                                                i6 = R.string.soon;
                                            } else if (j3 == 4) {
                                                i6 = R.string.completed;
                                            } else {
                                                i6 = 0;
                                            }
                                            String strA3 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                            j4 = b6;
                                            if (j7 == j4) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            xxl xxlVar3 = new xxl(strA3);
                                            if (z) {
                                                uxlVar = uxl.b;
                                            } else {
                                                uxlVar = uxl.f36445a;
                                            }
                                            lxlVar2 = new lxl(j4, (dyl) xxlVar3, false, uxlVar, new cwl(new rpe(size)), 76);
                                        }
                                        if (lxlVar2 != null) {
                                            arrayList4.add(lxlVar2);
                                        }
                                    }
                                    lxlVar = null;
                                    if (size == 0) {
                                        lxlVar2 = lxlVar;
                                    } else {
                                        j3 = b6;
                                        a9o[] a9oVarArr5 = a9o.f488a;
                                        if (j3 == 1) {
                                            i6 = R.string.all;
                                        } else if (j3 == j2) {
                                            i6 = R.string.live_new;
                                        } else if (j3 == 3) {
                                            i6 = R.string.soon;
                                        } else if (j3 == 4) {
                                            i6 = R.string.completed;
                                        } else {
                                            i6 = 0;
                                        }
                                        String strA4 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                        j4 = b6;
                                        if (j7 == j4) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        xxl xxlVar4 = new xxl(strA4);
                                        if (z) {
                                            uxlVar = uxl.b;
                                        } else {
                                            uxlVar = uxl.f36445a;
                                        }
                                        lxlVar2 = new lxl(j4, (dyl) xxlVar4, false, uxlVar, new cwl(new rpe(size)), 76);
                                    }
                                    if (lxlVar2 != null) {
                                        arrayList4.add(lxlVar2);
                                    }
                                } else {
                                    lc00VarB.add(new kok("DISCIPLINE_TABS_ID", new fyl(dyb.o0(arrayList4), null, null, s5x0.t(xfn.b(z5).c, 0.0f, 2), null, 22)));
                                    a9o[] a9oVarArr6 = a9o.f488a;
                                    if (j7 == 2) {
                                        arrayList = new ArrayList();
                                        for (Object obj4 : arrayListS) {
                                            if (((c8o) obj4).f == rnk.LIVE) {
                                                arrayList.add(obj4);
                                            }
                                        }
                                    } else if (j7 == 3) {
                                        arrayList = new ArrayList();
                                        for (Object obj5 : arrayListS) {
                                            if (((c8o) obj5).f == rnk.SOON) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                    } else {
                                        if (j7 == 4) {
                                            arrayList = new ArrayList();
                                            for (Object obj6 : arrayListS) {
                                                if (((c8o) obj6).f == rnk.COMPLETED) {
                                                    arrayList.add(obj6);
                                                }
                                            }
                                        }
                                        String strValueOf3 = String.valueOf(j7);
                                        arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                        it = arrayListS.iterator();
                                        while (it.hasNext()) {
                                            c8o c8oVar4 = (c8o) it.next();
                                            i2 = c8oVar4.b;
                                            long j13 = c8oVar4.f3923a;
                                            String str12 = c8oVar4.c;
                                            str12.getClass();
                                            String str13 = c8oVar4.d;
                                            str13.getClass();
                                            sb = new StringBuilder(ujn.h);
                                            str = c8oVar4.e;
                                            str.getClass();
                                            if (str.length() == 0) {
                                                it2 = it;
                                                sb.setLength(0);
                                                i3 = i2;
                                            } else {
                                                it2 = it;
                                                i3 = i2;
                                                if (!StringsKt.O(str, ujn.h, false)) {
                                                    i4 = 0;
                                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                                    i4 = 0;
                                                } else {
                                                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                        i5 = 1;
                                                        c2 = '/';
                                                    } else {
                                                        sb.append('/');
                                                        c2 = '/';
                                                        i5 = 1;
                                                    }
                                                    char[] cArr3 = new char[i5];
                                                    cArr3[0] = c2;
                                                    sb.append(StringsKt.y0(str, cArr3));
                                                }
                                                sb.setLength(i4);
                                                sb.append(str);
                                            }
                                            arrayList2.add(new wnk(i3, j13, str12, str13, new tnk(sb.toString()), c8oVar4.f));
                                            it = it2;
                                        }
                                        lc00VarB.add(new e8o(strValueOf3, arrayList2));
                                    }
                                    arrayListS = arrayList;
                                    String strValueOf4 = String.valueOf(j7);
                                    arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        c8o c8oVar5 = (c8o) it.next();
                                        i2 = c8oVar5.b;
                                        long j14 = c8oVar5.f3923a;
                                        String str14 = c8oVar5.c;
                                        str14.getClass();
                                        String str15 = c8oVar5.d;
                                        str15.getClass();
                                        sb = new StringBuilder(ujn.h);
                                        str = c8oVar5.e;
                                        str.getClass();
                                        if (str.length() == 0) {
                                            it2 = it;
                                            sb.setLength(0);
                                            i3 = i2;
                                        } else {
                                            it2 = it;
                                            i3 = i2;
                                            if (!StringsKt.O(str, ujn.h, false)) {
                                                i4 = 0;
                                            } else if (kotlin.text.c.x(str, "https://", false)) {
                                                i4 = 0;
                                            } else {
                                                if (sb.length() > 0) {
                                                    i5 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i5 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr4 = new char[i5];
                                                cArr4[0] = c2;
                                                sb.append(StringsKt.y0(str, cArr4));
                                            }
                                            sb.setLength(i4);
                                            sb.append(str);
                                        }
                                        arrayList2.add(new wnk(i3, j14, str14, str15, new tnk(sb.toString()), c8oVar5.f));
                                        it = it2;
                                    }
                                    lc00VarB.add(new e8o(strValueOf4, arrayList2));
                                }
                            }
                        }
                        return kotlin.collections.a.a(lc00VarB);
                    case 2:
                        h8o h8oVar3 = (h8o) obj3;
                        h8oVar3.getClass();
                        y78 y78Var2 = i9oVar.d;
                        z8o z8oVar4 = i9oVar.f14395a;
                        sff0 sff0Var2 = z8oVar4.d;
                        boolean z6 = z8oVar4.e;
                        w7o w7oVar2 = z8oVar4.b;
                        List list4 = w7oVar2 != null ? w7oVar2.d : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return hkb.A(h8oVar3, y78Var2, sff0Var2, z6, list4, i9oVar.b, true, z8oVar4.h);
                    case 3:
                        h8o h8oVar4 = (h8o) obj3;
                        h8oVar4.getClass();
                        y78 y78Var3 = i9oVar.d;
                        z8o z8oVar5 = i9oVar.f14395a;
                        sff0 sff0Var3 = z8oVar5.d;
                        boolean z7 = z8oVar5.e;
                        w7o w7oVar3 = z8oVar5.b;
                        List list5 = w7oVar3 != null ? w7oVar3.d : null;
                        if (list5 == null) {
                            list5 = iun.f15405a;
                        }
                        return hkb.A(h8oVar4, y78Var3, sff0Var3, z7, list5, i9oVar.b, false, z8oVar5.h);
                    case 4:
                        List<uog> list6 = (List) obj3;
                        list6.getClass();
                        ctf0 ctf0Var4 = i9oVar.b;
                        ctf0Var4.getClass();
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        if (list6.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00VarB2.add(new n8o("PROMO_HEADER", new hjm(ctf0Var4.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                        ArrayList arrayList5 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            arrayList5.add(new owr0(uogVar.f36012a, uogVar.b, uogVar.d, uogVar.l, uogVar.f, uogVar.i, uogVar.j, uogVar.k, uogVar.g, uogVar.h));
                        }
                        lc00VarB2.add(new p8o(dyb.r0(arrayList5)));
                        return kotlin.collections.a.a(lc00VarB2);
                    default:
                        List<phk0> list7 = (List) obj3;
                        list7.getClass();
                        ctf0 ctf0Var5 = i9oVar.b;
                        ctf0Var5.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (list7.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB3.add(new n8o("SOCIAL_NETWORKS_HEADER", new hjm(lsm0Var2.a(R.string.social_networks, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126)));
                        for (phk0 phk0Var : list7) {
                            String str16 = phk0Var.f27002a;
                            String str17 = phk0Var.b;
                            if (str16.equals(lsm0Var2.a(R.string.social_telegram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "org.telegram.messenger";
                            } else if (str16.equals(lsm0Var2.a(R.string.social_instagram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.instagram.android";
                            } else if (str16.equals(lsm0Var2.a(R.string.social_x_label, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.twitter.android";
                            } else {
                                str4 = str16.equals(lsm0Var2.a(R.string.social_discord, Arrays.copyOf(new Object[0], 0))) ? "com.discord" : "";
                            }
                            lc00VarB3.add(new o5s0(str16, str17, str4, phk0Var.c));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                }
            }
        }, (byte) 20));
        if (w7oVar != null) {
            Object obj3 = w7oVar.b;
            e0g0 e0g0Var2 = j0g0.b;
            h8oVar2 = (h8o) (obj3 instanceof g0g0 ? null : obj3);
            if (h8oVar2 == null) {
                iun iunVar3 = iun.f15405a;
                lun lunVar3 = lun.f20680a;
                lunVar3.getClass();
                h8oVar2 = new h8o(iunVar3, lunVar3);
            }
        } else {
            iun iunVar4 = iun.f15405a;
            lun lunVar4 = lun.f20680a;
            lunVar4.getClass();
            h8oVar2 = new h8o(iunVar4, lunVar4);
        }
        final byte b4 = 3;
        this.i = maz.b(new yw9(h8oVar2, new Function1(this) { // from class: a.h9o
            public final /* synthetic */ i9o b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:115:0x038e A[PHI: r24
  0x038e: PHI (r24v3 long) = (r24v2 long), (r24v2 long), (r24v6 long) binds: [B:145:0x03f3, B:130:0x03c6, B:114:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:160:0x0420  */
            /* JADX WARN: Code duplicated, block: B:161:0x0424  */
            /* JADX WARN: Code duplicated, block: B:163:0x042b  */
            /* JADX WARN: Code duplicated, block: B:165:0x0430  */
            /* JADX WARN: Code duplicated, block: B:167:0x0434  */
            /* JADX WARN: Code duplicated, block: B:168:0x0438  */
            /* JADX WARN: Code duplicated, block: B:170:0x043c  */
            /* JADX WARN: Code duplicated, block: B:171:0x0440  */
            /* JADX WARN: Code duplicated, block: B:173:0x0444  */
            /* JADX WARN: Code duplicated, block: B:174:0x0448  */
            /* JADX WARN: Code duplicated, block: B:177:0x0459  */
            /* JADX WARN: Code duplicated, block: B:178:0x045b  */
            /* JADX WARN: Code duplicated, block: B:181:0x0465  */
            /* JADX WARN: Code duplicated, block: B:183:0x046a  */
            /* JADX WARN: Code duplicated, block: B:215:0x0543  */
            /* JADX WARN: Code duplicated, block: B:217:0x056d  */
            /* JADX WARN: Code duplicated, block: B:218:0x0576  */
            /* JADX WARN: Code duplicated, block: B:220:0x0583  */
            /* JADX WARN: Code duplicated, block: B:222:0x0589  */
            /* JADX WARN: Code duplicated, block: B:223:0x058b  */
            /* JADX WARN: Code duplicated, block: B:228:0x05a0  */
            /* JADX WARN: Code duplicated, block: B:230:0x05b0  */
            /* JADX WARN: Code duplicated, block: B:276:0x0488 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:280:0x0358 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i;
                char c;
                ArrayList arrayList;
                ArrayList arrayList2;
                Iterator it;
                int i2;
                StringBuilder sb;
                String str;
                Iterator it2;
                int i3;
                int i4;
                int i5;
                char c2;
                long j2;
                lxl lxlVar;
                int size;
                long j3;
                int i6;
                long j4;
                boolean z;
                uxl uxlVar;
                lxl lxlVar2;
                int i7;
                List listSplit$default;
                c8o c8oVar;
                String str2;
                String str3;
                String str4;
                byte b5 = b4;
                i9o i9oVar = this.b;
                switch (b5) {
                    case 0:
                        z8o z8oVar2 = (z8o) obj4;
                        z8oVar2.getClass();
                        ctf0 ctf0Var2 = i9oVar.b;
                        sff0 sff0Var = z8oVar2.d;
                        boolean z2 = z8oVar2.g;
                        ctf0Var2.getClass();
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String strE = ua80.e(sff0Var.c.g, z2 ? "static/img/ImgDefault/Esports/EWC/headerTablet" : "static/img/ImgDefault/Esports/EWC/header", ".png");
                        if (strE.length() == 0) {
                            i = 0;
                            sb2.setLength(0);
                        } else {
                            i = 0;
                            if (StringsKt.O(strE, ujn.h, false)) {
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else if (kotlin.text.c.x(strE, "https://", false)) {
                                i = 0;
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else {
                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                    c = '/';
                                } else {
                                    c = '/';
                                    sb2.append('/');
                                }
                                i = 0;
                                sb2.append(StringsKt.y0(strE, c));
                            }
                        }
                        return new f9o(z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder, ctf0Var2.b.a(R.string.cyber_world_cup_title, Arrays.copyOf(new Object[i], i)), sb2.toString());
                    case 1:
                        d8o d8oVar = (d8o) obj4;
                        d8oVar.getClass();
                        long j5 = i9oVar.e;
                        z8o z8oVar3 = i9oVar.f14395a;
                        ech echVar = z8oVar3.d.c;
                        List listD0 = echVar.h;
                        List list = echVar.j;
                        List list2 = echVar.i;
                        Map map = d8oVar.b;
                        long j6 = d8oVar.f5660a;
                        ctf0 ctf0Var3 = i9oVar.b;
                        boolean z3 = z8oVar3.g;
                        listD0.getClass();
                        list.getClass();
                        list2.getClass();
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (listD0.size() > list.size()) {
                            listD0 = CollectionsKt.D0(listD0, list.size());
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it3 = listD0.iterator();
                        int i8 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw null;
                            }
                            int iIntValue = ((Number) next).intValue();
                            boolean z4 = z3;
                            String str5 = (String) CollectionsKt.W(i8, list2);
                            if (str5 != null) {
                                i7 = 0;
                                listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{"&"}, false, 0, 6, null);
                            } else {
                                i7 = 0;
                                listSplit$default = null;
                            }
                            Long l = (Long) CollectionsKt.W(i8, list);
                            long jLongValue = l != null ? l.longValue() : -1L;
                            Long lT0 = (listSplit$default == null || (str3 = (String) CollectionsKt.W(i7, listSplit$default)) == null) ? null : StringsKt.t0(str3);
                            Long lT1 = (listSplit$default == null || (str2 = (String) CollectionsKt.W(1, listSplit$default)) == null) ? null : StringsKt.t0(str2);
                            ypl0 ypl0Var = (ypl0) map.get(Long.valueOf(iIntValue));
                            String str6 = ypl0Var != null ? ypl0Var.b : null;
                            if (lT0 == null || lT1 == null || str6 == null || StringsKt.W(str6)) {
                                c8oVar = null;
                            } else {
                                String str7 = ypl0Var.c.b;
                                long jLongValue2 = lT0.longValue();
                                long jLongValue3 = lT1.longValue();
                                rnk rnkVar = j5 < jLongValue2 ? rnk.SOON : j5 > jLongValue3 ? rnk.COMPLETED : rnk.LIVE;
                                rdj rdjVar = rdj.f30294a;
                                sdj sdjVar = sdj.UNIQUE_2;
                                c8oVar = new c8o(jLongValue, iIntValue, str6, ctf0Var3.b.a(R.string.bet_teams_info, Arrays.copyOf(new Object[]{rdj.f(new znq0(jLongValue2), sdjVar, null, 60), rdj.f(new znq0(jLongValue3), sdjVar, null, 60)}, 2)), str7, rnkVar);
                            }
                            arrayList3.add(c8oVar);
                            z3 = z4;
                            it3 = it3;
                            i8 = i9;
                            j6 = j6;
                            j5 = j5;
                        }
                        boolean z5 = z3;
                        long j7 = j6;
                        ArrayList arrayListS = CollectionsKt.S(arrayList3);
                        if (!arrayListS.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            lc00VarB.add(new n8o("DISCIPLINES_HEADER", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                            List list3 = b9o.f2220a;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = list3.iterator();
                            while (true) {
                                long j8 = 2;
                                if (it4.hasNext()) {
                                    aco0 aco0Var = (aco0) it4.next();
                                    byte b6 = aco0Var.f639a;
                                    byte b7 = aco0Var.f639a;
                                    long j9 = b6;
                                    a9o[] a9oVarArr = a9o.f488a;
                                    if (j9 == 1) {
                                        j2 = 2;
                                        size = arrayListS.size();
                                    } else {
                                        if (j9 != 2) {
                                            j2 = 2;
                                            if (j9 == 3) {
                                                if (arrayListS.isEmpty()) {
                                                    size = 0;
                                                } else {
                                                    Iterator it5 = arrayListS.iterator();
                                                    size = 0;
                                                    while (it5.hasNext()) {
                                                        if (((c8o) it5.next()).f == rnk.SOON && (size = size + 1) < 0) {
                                                            q3d.o();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            } else if (j9 != 4) {
                                                lxlVar = null;
                                                size = 0;
                                            } else if (arrayListS.isEmpty()) {
                                                size = 0;
                                            } else {
                                                Iterator it6 = arrayListS.iterator();
                                                size = 0;
                                                while (it6.hasNext()) {
                                                    if (((c8o) it6.next()).f == rnk.COMPLETED && (size = size + 1) < 0) {
                                                        q3d.o();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        } else if (arrayListS.isEmpty()) {
                                            j2 = 2;
                                            size = 0;
                                        } else {
                                            Iterator it7 = arrayListS.iterator();
                                            int i10 = 0;
                                            while (it7.hasNext()) {
                                                long j10 = j8;
                                                if (((c8o) it7.next()).f == rnk.LIVE && (i10 = i10 + 1) < 0) {
                                                    q3d.o();
                                                    throw null;
                                                }
                                                j8 = j10;
                                            }
                                            j2 = j8;
                                            size = i10;
                                        }
                                        if (size == 0) {
                                            lxlVar2 = lxlVar;
                                        } else {
                                            j3 = b7;
                                            a9o[] a9oVarArr5 = a9o.f488a;
                                            if (j3 == 1) {
                                                i6 = R.string.all;
                                            } else if (j3 == j2) {
                                                i6 = R.string.live_new;
                                            } else if (j3 == 3) {
                                                i6 = R.string.soon;
                                            } else if (j3 == 4) {
                                                i6 = R.string.completed;
                                            } else {
                                                i6 = 0;
                                            }
                                            String strA4 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                            j4 = b7;
                                            if (j7 == j4) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            xxl xxlVar4 = new xxl(strA4);
                                            if (z) {
                                                uxlVar = uxl.b;
                                            } else {
                                                uxlVar = uxl.f36445a;
                                            }
                                            lxlVar2 = new lxl(j4, (dyl) xxlVar4, false, uxlVar, new cwl(new rpe(size)), 76);
                                        }
                                        if (lxlVar2 != null) {
                                            arrayList4.add(lxlVar2);
                                        }
                                    }
                                    lxlVar = null;
                                    if (size == 0) {
                                        lxlVar2 = lxlVar;
                                    } else {
                                        j3 = b7;
                                        a9o[] a9oVarArr6 = a9o.f488a;
                                        if (j3 == 1) {
                                            i6 = R.string.all;
                                        } else if (j3 == j2) {
                                            i6 = R.string.live_new;
                                        } else if (j3 == 3) {
                                            i6 = R.string.soon;
                                        } else if (j3 == 4) {
                                            i6 = R.string.completed;
                                        } else {
                                            i6 = 0;
                                        }
                                        String strA5 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                        j4 = b7;
                                        if (j7 == j4) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        xxl xxlVar5 = new xxl(strA5);
                                        if (z) {
                                            uxlVar = uxl.b;
                                        } else {
                                            uxlVar = uxl.f36445a;
                                        }
                                        lxlVar2 = new lxl(j4, (dyl) xxlVar5, false, uxlVar, new cwl(new rpe(size)), 76);
                                    }
                                    if (lxlVar2 != null) {
                                        arrayList4.add(lxlVar2);
                                    }
                                } else {
                                    lc00VarB.add(new kok("DISCIPLINE_TABS_ID", new fyl(dyb.o0(arrayList4), null, null, s5x0.t(xfn.b(z5).c, 0.0f, 2), null, 22)));
                                    a9o[] a9oVarArr7 = a9o.f488a;
                                    if (j7 == 2) {
                                        arrayList = new ArrayList();
                                        for (Object obj5 : arrayListS) {
                                            if (((c8o) obj5).f == rnk.LIVE) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                    } else if (j7 == 3) {
                                        arrayList = new ArrayList();
                                        for (Object obj6 : arrayListS) {
                                            if (((c8o) obj6).f == rnk.SOON) {
                                                arrayList.add(obj6);
                                            }
                                        }
                                    } else {
                                        if (j7 == 4) {
                                            arrayList = new ArrayList();
                                            for (Object obj7 : arrayListS) {
                                                if (((c8o) obj7).f == rnk.COMPLETED) {
                                                    arrayList.add(obj7);
                                                }
                                            }
                                        }
                                        String strValueOf4 = String.valueOf(j7);
                                        arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                        it = arrayListS.iterator();
                                        while (it.hasNext()) {
                                            c8o c8oVar5 = (c8o) it.next();
                                            i2 = c8oVar5.b;
                                            long j14 = c8oVar5.f3923a;
                                            String str14 = c8oVar5.c;
                                            str14.getClass();
                                            String str15 = c8oVar5.d;
                                            str15.getClass();
                                            sb = new StringBuilder(ujn.h);
                                            str = c8oVar5.e;
                                            str.getClass();
                                            if (str.length() == 0) {
                                                it2 = it;
                                                sb.setLength(0);
                                                i3 = i2;
                                            } else {
                                                it2 = it;
                                                i3 = i2;
                                                if (!StringsKt.O(str, ujn.h, false)) {
                                                    i4 = 0;
                                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                                    i4 = 0;
                                                } else {
                                                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                        i5 = 1;
                                                        c2 = '/';
                                                    } else {
                                                        sb.append('/');
                                                        c2 = '/';
                                                        i5 = 1;
                                                    }
                                                    char[] cArr4 = new char[i5];
                                                    cArr4[0] = c2;
                                                    sb.append(StringsKt.y0(str, cArr4));
                                                }
                                                sb.setLength(i4);
                                                sb.append(str);
                                            }
                                            arrayList2.add(new wnk(i3, j14, str14, str15, new tnk(sb.toString()), c8oVar5.f));
                                            it = it2;
                                        }
                                        lc00VarB.add(new e8o(strValueOf4, arrayList2));
                                    }
                                    arrayListS = arrayList;
                                    String strValueOf5 = String.valueOf(j7);
                                    arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        c8o c8oVar6 = (c8o) it.next();
                                        i2 = c8oVar6.b;
                                        long j15 = c8oVar6.f3923a;
                                        String str16 = c8oVar6.c;
                                        str16.getClass();
                                        String str17 = c8oVar6.d;
                                        str17.getClass();
                                        sb = new StringBuilder(ujn.h);
                                        str = c8oVar6.e;
                                        str.getClass();
                                        if (str.length() == 0) {
                                            it2 = it;
                                            sb.setLength(0);
                                            i3 = i2;
                                        } else {
                                            it2 = it;
                                            i3 = i2;
                                            if (!StringsKt.O(str, ujn.h, false)) {
                                                i4 = 0;
                                            } else if (kotlin.text.c.x(str, "https://", false)) {
                                                i4 = 0;
                                            } else {
                                                if (sb.length() > 0) {
                                                    i5 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i5 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr5 = new char[i5];
                                                cArr5[0] = c2;
                                                sb.append(StringsKt.y0(str, cArr5));
                                            }
                                            sb.setLength(i4);
                                            sb.append(str);
                                        }
                                        arrayList2.add(new wnk(i3, j15, str16, str17, new tnk(sb.toString()), c8oVar6.f));
                                        it = it2;
                                    }
                                    lc00VarB.add(new e8o(strValueOf5, arrayList2));
                                }
                            }
                        }
                        return kotlin.collections.a.a(lc00VarB);
                    case 2:
                        h8o h8oVar3 = (h8o) obj4;
                        h8oVar3.getClass();
                        y78 y78Var2 = i9oVar.d;
                        z8o z8oVar4 = i9oVar.f14395a;
                        sff0 sff0Var2 = z8oVar4.d;
                        boolean z6 = z8oVar4.e;
                        w7o w7oVar2 = z8oVar4.b;
                        List list4 = w7oVar2 != null ? w7oVar2.d : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return hkb.A(h8oVar3, y78Var2, sff0Var2, z6, list4, i9oVar.b, true, z8oVar4.h);
                    case 3:
                        h8o h8oVar4 = (h8o) obj4;
                        h8oVar4.getClass();
                        y78 y78Var3 = i9oVar.d;
                        z8o z8oVar5 = i9oVar.f14395a;
                        sff0 sff0Var3 = z8oVar5.d;
                        boolean z7 = z8oVar5.e;
                        w7o w7oVar3 = z8oVar5.b;
                        List list5 = w7oVar3 != null ? w7oVar3.d : null;
                        if (list5 == null) {
                            list5 = iun.f15405a;
                        }
                        return hkb.A(h8oVar4, y78Var3, sff0Var3, z7, list5, i9oVar.b, false, z8oVar5.h);
                    case 4:
                        List<uog> list6 = (List) obj4;
                        list6.getClass();
                        ctf0 ctf0Var4 = i9oVar.b;
                        ctf0Var4.getClass();
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        if (list6.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00VarB2.add(new n8o("PROMO_HEADER", new hjm(ctf0Var4.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                        ArrayList arrayList5 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            arrayList5.add(new owr0(uogVar.f36012a, uogVar.b, uogVar.d, uogVar.l, uogVar.f, uogVar.i, uogVar.j, uogVar.k, uogVar.g, uogVar.h));
                        }
                        lc00VarB2.add(new p8o(dyb.r0(arrayList5)));
                        return kotlin.collections.a.a(lc00VarB2);
                    default:
                        List<phk0> list7 = (List) obj4;
                        list7.getClass();
                        ctf0 ctf0Var5 = i9oVar.b;
                        ctf0Var5.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (list7.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB3.add(new n8o("SOCIAL_NETWORKS_HEADER", new hjm(lsm0Var2.a(R.string.social_networks, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126)));
                        for (phk0 phk0Var : list7) {
                            String str18 = phk0Var.f27002a;
                            String str19 = phk0Var.b;
                            if (str18.equals(lsm0Var2.a(R.string.social_telegram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "org.telegram.messenger";
                            } else if (str18.equals(lsm0Var2.a(R.string.social_instagram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.instagram.android";
                            } else if (str18.equals(lsm0Var2.a(R.string.social_x_label, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.twitter.android";
                            } else {
                                str4 = str18.equals(lsm0Var2.a(R.string.social_discord, Arrays.copyOf(new Object[0], 0))) ? "com.discord" : "";
                            }
                            lc00VarB3.add(new o5s0(str18, str19, str4, phk0Var.c));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                }
            }
        }, (byte) 20));
        if (w7oVar != null) {
            Object obj4 = w7oVar.c;
            e0g0 e0g0Var3 = j0g0.b;
            obj = (List) (obj4 instanceof g0g0 ? null : obj4);
            obj = obj == null ? iun.f15405a : obj;
        }
        final byte b5 = 4;
        this.j = maz.b(new yw9(obj, new Function1(this) { // from class: a.h9o
            public final /* synthetic */ i9o b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:115:0x038e A[PHI: r24
  0x038e: PHI (r24v3 long) = (r24v2 long), (r24v2 long), (r24v6 long) binds: [B:145:0x03f3, B:130:0x03c6, B:114:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:160:0x0420  */
            /* JADX WARN: Code duplicated, block: B:161:0x0424  */
            /* JADX WARN: Code duplicated, block: B:163:0x042b  */
            /* JADX WARN: Code duplicated, block: B:165:0x0430  */
            /* JADX WARN: Code duplicated, block: B:167:0x0434  */
            /* JADX WARN: Code duplicated, block: B:168:0x0438  */
            /* JADX WARN: Code duplicated, block: B:170:0x043c  */
            /* JADX WARN: Code duplicated, block: B:171:0x0440  */
            /* JADX WARN: Code duplicated, block: B:173:0x0444  */
            /* JADX WARN: Code duplicated, block: B:174:0x0448  */
            /* JADX WARN: Code duplicated, block: B:177:0x0459  */
            /* JADX WARN: Code duplicated, block: B:178:0x045b  */
            /* JADX WARN: Code duplicated, block: B:181:0x0465  */
            /* JADX WARN: Code duplicated, block: B:183:0x046a  */
            /* JADX WARN: Code duplicated, block: B:215:0x0543  */
            /* JADX WARN: Code duplicated, block: B:217:0x056d  */
            /* JADX WARN: Code duplicated, block: B:218:0x0576  */
            /* JADX WARN: Code duplicated, block: B:220:0x0583  */
            /* JADX WARN: Code duplicated, block: B:222:0x0589  */
            /* JADX WARN: Code duplicated, block: B:223:0x058b  */
            /* JADX WARN: Code duplicated, block: B:228:0x05a0  */
            /* JADX WARN: Code duplicated, block: B:230:0x05b0  */
            /* JADX WARN: Code duplicated, block: B:276:0x0488 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:280:0x0358 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj5) {
                int i;
                char c;
                ArrayList arrayList;
                ArrayList arrayList2;
                Iterator it;
                int i2;
                StringBuilder sb;
                String str;
                Iterator it2;
                int i3;
                int i4;
                int i5;
                char c2;
                long j2;
                lxl lxlVar;
                int size;
                long j3;
                int i6;
                long j4;
                boolean z;
                uxl uxlVar;
                lxl lxlVar2;
                int i7;
                List listSplit$default;
                c8o c8oVar;
                String str2;
                String str3;
                String str4;
                byte b6 = b5;
                i9o i9oVar = this.b;
                switch (b6) {
                    case 0:
                        z8o z8oVar2 = (z8o) obj5;
                        z8oVar2.getClass();
                        ctf0 ctf0Var2 = i9oVar.b;
                        sff0 sff0Var = z8oVar2.d;
                        boolean z2 = z8oVar2.g;
                        ctf0Var2.getClass();
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String strE = ua80.e(sff0Var.c.g, z2 ? "static/img/ImgDefault/Esports/EWC/headerTablet" : "static/img/ImgDefault/Esports/EWC/header", ".png");
                        if (strE.length() == 0) {
                            i = 0;
                            sb2.setLength(0);
                        } else {
                            i = 0;
                            if (StringsKt.O(strE, ujn.h, false)) {
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else if (kotlin.text.c.x(strE, "https://", false)) {
                                i = 0;
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else {
                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                    c = '/';
                                } else {
                                    c = '/';
                                    sb2.append('/');
                                }
                                i = 0;
                                sb2.append(StringsKt.y0(strE, c));
                            }
                        }
                        return new f9o(z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder, ctf0Var2.b.a(R.string.cyber_world_cup_title, Arrays.copyOf(new Object[i], i)), sb2.toString());
                    case 1:
                        d8o d8oVar = (d8o) obj5;
                        d8oVar.getClass();
                        long j5 = i9oVar.e;
                        z8o z8oVar3 = i9oVar.f14395a;
                        ech echVar = z8oVar3.d.c;
                        List listD0 = echVar.h;
                        List list = echVar.j;
                        List list2 = echVar.i;
                        Map map = d8oVar.b;
                        long j6 = d8oVar.f5660a;
                        ctf0 ctf0Var3 = i9oVar.b;
                        boolean z3 = z8oVar3.g;
                        listD0.getClass();
                        list.getClass();
                        list2.getClass();
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (listD0.size() > list.size()) {
                            listD0 = CollectionsKt.D0(listD0, list.size());
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it3 = listD0.iterator();
                        int i8 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw null;
                            }
                            int iIntValue = ((Number) next).intValue();
                            boolean z4 = z3;
                            String str5 = (String) CollectionsKt.W(i8, list2);
                            if (str5 != null) {
                                i7 = 0;
                                listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{"&"}, false, 0, 6, null);
                            } else {
                                i7 = 0;
                                listSplit$default = null;
                            }
                            Long l = (Long) CollectionsKt.W(i8, list);
                            long jLongValue = l != null ? l.longValue() : -1L;
                            Long lT0 = (listSplit$default == null || (str3 = (String) CollectionsKt.W(i7, listSplit$default)) == null) ? null : StringsKt.t0(str3);
                            Long lT1 = (listSplit$default == null || (str2 = (String) CollectionsKt.W(1, listSplit$default)) == null) ? null : StringsKt.t0(str2);
                            ypl0 ypl0Var = (ypl0) map.get(Long.valueOf(iIntValue));
                            String str6 = ypl0Var != null ? ypl0Var.b : null;
                            if (lT0 == null || lT1 == null || str6 == null || StringsKt.W(str6)) {
                                c8oVar = null;
                            } else {
                                String str7 = ypl0Var.c.b;
                                long jLongValue2 = lT0.longValue();
                                long jLongValue3 = lT1.longValue();
                                rnk rnkVar = j5 < jLongValue2 ? rnk.SOON : j5 > jLongValue3 ? rnk.COMPLETED : rnk.LIVE;
                                rdj rdjVar = rdj.f30294a;
                                sdj sdjVar = sdj.UNIQUE_2;
                                c8oVar = new c8o(jLongValue, iIntValue, str6, ctf0Var3.b.a(R.string.bet_teams_info, Arrays.copyOf(new Object[]{rdj.f(new znq0(jLongValue2), sdjVar, null, 60), rdj.f(new znq0(jLongValue3), sdjVar, null, 60)}, 2)), str7, rnkVar);
                            }
                            arrayList3.add(c8oVar);
                            z3 = z4;
                            it3 = it3;
                            i8 = i9;
                            j6 = j6;
                            j5 = j5;
                        }
                        boolean z5 = z3;
                        long j7 = j6;
                        ArrayList arrayListS = CollectionsKt.S(arrayList3);
                        if (!arrayListS.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            lc00VarB.add(new n8o("DISCIPLINES_HEADER", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                            List list3 = b9o.f2220a;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = list3.iterator();
                            while (true) {
                                long j8 = 2;
                                if (it4.hasNext()) {
                                    aco0 aco0Var = (aco0) it4.next();
                                    byte b7 = aco0Var.f639a;
                                    byte b8 = aco0Var.f639a;
                                    long j9 = b7;
                                    a9o[] a9oVarArr = a9o.f488a;
                                    if (j9 == 1) {
                                        j2 = 2;
                                        size = arrayListS.size();
                                    } else {
                                        if (j9 != 2) {
                                            j2 = 2;
                                            if (j9 == 3) {
                                                if (arrayListS.isEmpty()) {
                                                    size = 0;
                                                } else {
                                                    Iterator it5 = arrayListS.iterator();
                                                    size = 0;
                                                    while (it5.hasNext()) {
                                                        if (((c8o) it5.next()).f == rnk.SOON && (size = size + 1) < 0) {
                                                            q3d.o();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            } else if (j9 != 4) {
                                                lxlVar = null;
                                                size = 0;
                                            } else if (arrayListS.isEmpty()) {
                                                size = 0;
                                            } else {
                                                Iterator it6 = arrayListS.iterator();
                                                size = 0;
                                                while (it6.hasNext()) {
                                                    if (((c8o) it6.next()).f == rnk.COMPLETED && (size = size + 1) < 0) {
                                                        q3d.o();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        } else if (arrayListS.isEmpty()) {
                                            j2 = 2;
                                            size = 0;
                                        } else {
                                            Iterator it7 = arrayListS.iterator();
                                            int i10 = 0;
                                            while (it7.hasNext()) {
                                                long j10 = j8;
                                                if (((c8o) it7.next()).f == rnk.LIVE && (i10 = i10 + 1) < 0) {
                                                    q3d.o();
                                                    throw null;
                                                }
                                                j8 = j10;
                                            }
                                            j2 = j8;
                                            size = i10;
                                        }
                                        if (size == 0) {
                                            lxlVar2 = lxlVar;
                                        } else {
                                            j3 = b8;
                                            a9o[] a9oVarArr6 = a9o.f488a;
                                            if (j3 == 1) {
                                                i6 = R.string.all;
                                            } else if (j3 == j2) {
                                                i6 = R.string.live_new;
                                            } else if (j3 == 3) {
                                                i6 = R.string.soon;
                                            } else if (j3 == 4) {
                                                i6 = R.string.completed;
                                            } else {
                                                i6 = 0;
                                            }
                                            String strA5 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                            j4 = b8;
                                            if (j7 == j4) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            xxl xxlVar5 = new xxl(strA5);
                                            if (z) {
                                                uxlVar = uxl.b;
                                            } else {
                                                uxlVar = uxl.f36445a;
                                            }
                                            lxlVar2 = new lxl(j4, (dyl) xxlVar5, false, uxlVar, new cwl(new rpe(size)), 76);
                                        }
                                        if (lxlVar2 != null) {
                                            arrayList4.add(lxlVar2);
                                        }
                                    }
                                    lxlVar = null;
                                    if (size == 0) {
                                        lxlVar2 = lxlVar;
                                    } else {
                                        j3 = b8;
                                        a9o[] a9oVarArr7 = a9o.f488a;
                                        if (j3 == 1) {
                                            i6 = R.string.all;
                                        } else if (j3 == j2) {
                                            i6 = R.string.live_new;
                                        } else if (j3 == 3) {
                                            i6 = R.string.soon;
                                        } else if (j3 == 4) {
                                            i6 = R.string.completed;
                                        } else {
                                            i6 = 0;
                                        }
                                        String strA6 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                        j4 = b8;
                                        if (j7 == j4) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        xxl xxlVar6 = new xxl(strA6);
                                        if (z) {
                                            uxlVar = uxl.b;
                                        } else {
                                            uxlVar = uxl.f36445a;
                                        }
                                        lxlVar2 = new lxl(j4, (dyl) xxlVar6, false, uxlVar, new cwl(new rpe(size)), 76);
                                    }
                                    if (lxlVar2 != null) {
                                        arrayList4.add(lxlVar2);
                                    }
                                } else {
                                    lc00VarB.add(new kok("DISCIPLINE_TABS_ID", new fyl(dyb.o0(arrayList4), null, null, s5x0.t(xfn.b(z5).c, 0.0f, 2), null, 22)));
                                    a9o[] a9oVarArr8 = a9o.f488a;
                                    if (j7 == 2) {
                                        arrayList = new ArrayList();
                                        for (Object obj6 : arrayListS) {
                                            if (((c8o) obj6).f == rnk.LIVE) {
                                                arrayList.add(obj6);
                                            }
                                        }
                                    } else if (j7 == 3) {
                                        arrayList = new ArrayList();
                                        for (Object obj7 : arrayListS) {
                                            if (((c8o) obj7).f == rnk.SOON) {
                                                arrayList.add(obj7);
                                            }
                                        }
                                    } else {
                                        if (j7 == 4) {
                                            arrayList = new ArrayList();
                                            for (Object obj8 : arrayListS) {
                                                if (((c8o) obj8).f == rnk.COMPLETED) {
                                                    arrayList.add(obj8);
                                                }
                                            }
                                        }
                                        String strValueOf5 = String.valueOf(j7);
                                        arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                        it = arrayListS.iterator();
                                        while (it.hasNext()) {
                                            c8o c8oVar6 = (c8o) it.next();
                                            i2 = c8oVar6.b;
                                            long j15 = c8oVar6.f3923a;
                                            String str16 = c8oVar6.c;
                                            str16.getClass();
                                            String str17 = c8oVar6.d;
                                            str17.getClass();
                                            sb = new StringBuilder(ujn.h);
                                            str = c8oVar6.e;
                                            str.getClass();
                                            if (str.length() == 0) {
                                                it2 = it;
                                                sb.setLength(0);
                                                i3 = i2;
                                            } else {
                                                it2 = it;
                                                i3 = i2;
                                                if (!StringsKt.O(str, ujn.h, false)) {
                                                    i4 = 0;
                                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                                    i4 = 0;
                                                } else {
                                                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                        i5 = 1;
                                                        c2 = '/';
                                                    } else {
                                                        sb.append('/');
                                                        c2 = '/';
                                                        i5 = 1;
                                                    }
                                                    char[] cArr5 = new char[i5];
                                                    cArr5[0] = c2;
                                                    sb.append(StringsKt.y0(str, cArr5));
                                                }
                                                sb.setLength(i4);
                                                sb.append(str);
                                            }
                                            arrayList2.add(new wnk(i3, j15, str16, str17, new tnk(sb.toString()), c8oVar6.f));
                                            it = it2;
                                        }
                                        lc00VarB.add(new e8o(strValueOf5, arrayList2));
                                    }
                                    arrayListS = arrayList;
                                    String strValueOf6 = String.valueOf(j7);
                                    arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        c8o c8oVar7 = (c8o) it.next();
                                        i2 = c8oVar7.b;
                                        long j16 = c8oVar7.f3923a;
                                        String str18 = c8oVar7.c;
                                        str18.getClass();
                                        String str19 = c8oVar7.d;
                                        str19.getClass();
                                        sb = new StringBuilder(ujn.h);
                                        str = c8oVar7.e;
                                        str.getClass();
                                        if (str.length() == 0) {
                                            it2 = it;
                                            sb.setLength(0);
                                            i3 = i2;
                                        } else {
                                            it2 = it;
                                            i3 = i2;
                                            if (!StringsKt.O(str, ujn.h, false)) {
                                                i4 = 0;
                                            } else if (kotlin.text.c.x(str, "https://", false)) {
                                                i4 = 0;
                                            } else {
                                                if (sb.length() > 0) {
                                                    i5 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i5 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr6 = new char[i5];
                                                cArr6[0] = c2;
                                                sb.append(StringsKt.y0(str, cArr6));
                                            }
                                            sb.setLength(i4);
                                            sb.append(str);
                                        }
                                        arrayList2.add(new wnk(i3, j16, str18, str19, new tnk(sb.toString()), c8oVar7.f));
                                        it = it2;
                                    }
                                    lc00VarB.add(new e8o(strValueOf6, arrayList2));
                                }
                            }
                        }
                        return kotlin.collections.a.a(lc00VarB);
                    case 2:
                        h8o h8oVar3 = (h8o) obj5;
                        h8oVar3.getClass();
                        y78 y78Var2 = i9oVar.d;
                        z8o z8oVar4 = i9oVar.f14395a;
                        sff0 sff0Var2 = z8oVar4.d;
                        boolean z6 = z8oVar4.e;
                        w7o w7oVar2 = z8oVar4.b;
                        List list4 = w7oVar2 != null ? w7oVar2.d : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return hkb.A(h8oVar3, y78Var2, sff0Var2, z6, list4, i9oVar.b, true, z8oVar4.h);
                    case 3:
                        h8o h8oVar4 = (h8o) obj5;
                        h8oVar4.getClass();
                        y78 y78Var3 = i9oVar.d;
                        z8o z8oVar5 = i9oVar.f14395a;
                        sff0 sff0Var3 = z8oVar5.d;
                        boolean z7 = z8oVar5.e;
                        w7o w7oVar3 = z8oVar5.b;
                        List list5 = w7oVar3 != null ? w7oVar3.d : null;
                        if (list5 == null) {
                            list5 = iun.f15405a;
                        }
                        return hkb.A(h8oVar4, y78Var3, sff0Var3, z7, list5, i9oVar.b, false, z8oVar5.h);
                    case 4:
                        List<uog> list6 = (List) obj5;
                        list6.getClass();
                        ctf0 ctf0Var4 = i9oVar.b;
                        ctf0Var4.getClass();
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        if (list6.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00VarB2.add(new n8o("PROMO_HEADER", new hjm(ctf0Var4.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                        ArrayList arrayList5 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            arrayList5.add(new owr0(uogVar.f36012a, uogVar.b, uogVar.d, uogVar.l, uogVar.f, uogVar.i, uogVar.j, uogVar.k, uogVar.g, uogVar.h));
                        }
                        lc00VarB2.add(new p8o(dyb.r0(arrayList5)));
                        return kotlin.collections.a.a(lc00VarB2);
                    default:
                        List<phk0> list7 = (List) obj5;
                        list7.getClass();
                        ctf0 ctf0Var5 = i9oVar.b;
                        ctf0Var5.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (list7.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB3.add(new n8o("SOCIAL_NETWORKS_HEADER", new hjm(lsm0Var2.a(R.string.social_networks, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126)));
                        for (phk0 phk0Var : list7) {
                            String str110 = phk0Var.f27002a;
                            String str111 = phk0Var.b;
                            if (str110.equals(lsm0Var2.a(R.string.social_telegram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "org.telegram.messenger";
                            } else if (str110.equals(lsm0Var2.a(R.string.social_instagram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.instagram.android";
                            } else if (str110.equals(lsm0Var2.a(R.string.social_x_label, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.twitter.android";
                            } else {
                                str4 = str110.equals(lsm0Var2.a(R.string.social_discord, Arrays.copyOf(new Object[0], 0))) ? "com.discord" : "";
                            }
                            lc00VarB3.add(new o5s0(str110, str111, str4, phk0Var.c));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                }
            }
        }, (byte) 20));
        final byte b6 = 5;
        this.k = maz.b(new yw9(z8oVar.c, new Function1(this) { // from class: a.h9o
            public final /* synthetic */ i9o b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:115:0x038e A[PHI: r24
  0x038e: PHI (r24v3 long) = (r24v2 long), (r24v2 long), (r24v6 long) binds: [B:145:0x03f3, B:130:0x03c6, B:114:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:160:0x0420  */
            /* JADX WARN: Code duplicated, block: B:161:0x0424  */
            /* JADX WARN: Code duplicated, block: B:163:0x042b  */
            /* JADX WARN: Code duplicated, block: B:165:0x0430  */
            /* JADX WARN: Code duplicated, block: B:167:0x0434  */
            /* JADX WARN: Code duplicated, block: B:168:0x0438  */
            /* JADX WARN: Code duplicated, block: B:170:0x043c  */
            /* JADX WARN: Code duplicated, block: B:171:0x0440  */
            /* JADX WARN: Code duplicated, block: B:173:0x0444  */
            /* JADX WARN: Code duplicated, block: B:174:0x0448  */
            /* JADX WARN: Code duplicated, block: B:177:0x0459  */
            /* JADX WARN: Code duplicated, block: B:178:0x045b  */
            /* JADX WARN: Code duplicated, block: B:181:0x0465  */
            /* JADX WARN: Code duplicated, block: B:183:0x046a  */
            /* JADX WARN: Code duplicated, block: B:215:0x0543  */
            /* JADX WARN: Code duplicated, block: B:217:0x056d  */
            /* JADX WARN: Code duplicated, block: B:218:0x0576  */
            /* JADX WARN: Code duplicated, block: B:220:0x0583  */
            /* JADX WARN: Code duplicated, block: B:222:0x0589  */
            /* JADX WARN: Code duplicated, block: B:223:0x058b  */
            /* JADX WARN: Code duplicated, block: B:228:0x05a0  */
            /* JADX WARN: Code duplicated, block: B:230:0x05b0  */
            /* JADX WARN: Code duplicated, block: B:276:0x0488 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:280:0x0358 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj5) {
                int i;
                char c;
                ArrayList arrayList;
                ArrayList arrayList2;
                Iterator it;
                int i2;
                StringBuilder sb;
                String str;
                Iterator it2;
                int i3;
                int i4;
                int i5;
                char c2;
                long j2;
                lxl lxlVar;
                int size;
                long j3;
                int i6;
                long j4;
                boolean z;
                uxl uxlVar;
                lxl lxlVar2;
                int i7;
                List listSplit$default;
                c8o c8oVar;
                String str2;
                String str3;
                String str4;
                byte b7 = b6;
                i9o i9oVar = this.b;
                switch (b7) {
                    case 0:
                        z8o z8oVar2 = (z8o) obj5;
                        z8oVar2.getClass();
                        ctf0 ctf0Var2 = i9oVar.b;
                        sff0 sff0Var = z8oVar2.d;
                        boolean z2 = z8oVar2.g;
                        ctf0Var2.getClass();
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String strE = ua80.e(sff0Var.c.g, z2 ? "static/img/ImgDefault/Esports/EWC/headerTablet" : "static/img/ImgDefault/Esports/EWC/header", ".png");
                        if (strE.length() == 0) {
                            i = 0;
                            sb2.setLength(0);
                        } else {
                            i = 0;
                            if (StringsKt.O(strE, ujn.h, false)) {
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else if (kotlin.text.c.x(strE, "https://", false)) {
                                i = 0;
                                sb2.setLength(i);
                                sb2.append(strE);
                            } else {
                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                    c = '/';
                                } else {
                                    c = '/';
                                    sb2.append('/');
                                }
                                i = 0;
                                sb2.append(StringsKt.y0(strE, c));
                            }
                        }
                        return new f9o(z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder, ctf0Var2.b.a(R.string.cyber_world_cup_title, Arrays.copyOf(new Object[i], i)), sb2.toString());
                    case 1:
                        d8o d8oVar = (d8o) obj5;
                        d8oVar.getClass();
                        long j5 = i9oVar.e;
                        z8o z8oVar3 = i9oVar.f14395a;
                        ech echVar = z8oVar3.d.c;
                        List listD0 = echVar.h;
                        List list = echVar.j;
                        List list2 = echVar.i;
                        Map map = d8oVar.b;
                        long j6 = d8oVar.f5660a;
                        ctf0 ctf0Var3 = i9oVar.b;
                        boolean z3 = z8oVar3.g;
                        listD0.getClass();
                        list.getClass();
                        list2.getClass();
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (listD0.size() > list.size()) {
                            listD0 = CollectionsKt.D0(listD0, list.size());
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it3 = listD0.iterator();
                        int i8 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw null;
                            }
                            int iIntValue = ((Number) next).intValue();
                            boolean z4 = z3;
                            String str5 = (String) CollectionsKt.W(i8, list2);
                            if (str5 != null) {
                                i7 = 0;
                                listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{"&"}, false, 0, 6, null);
                            } else {
                                i7 = 0;
                                listSplit$default = null;
                            }
                            Long l = (Long) CollectionsKt.W(i8, list);
                            long jLongValue = l != null ? l.longValue() : -1L;
                            Long lT0 = (listSplit$default == null || (str3 = (String) CollectionsKt.W(i7, listSplit$default)) == null) ? null : StringsKt.t0(str3);
                            Long lT1 = (listSplit$default == null || (str2 = (String) CollectionsKt.W(1, listSplit$default)) == null) ? null : StringsKt.t0(str2);
                            ypl0 ypl0Var = (ypl0) map.get(Long.valueOf(iIntValue));
                            String str6 = ypl0Var != null ? ypl0Var.b : null;
                            if (lT0 == null || lT1 == null || str6 == null || StringsKt.W(str6)) {
                                c8oVar = null;
                            } else {
                                String str7 = ypl0Var.c.b;
                                long jLongValue2 = lT0.longValue();
                                long jLongValue3 = lT1.longValue();
                                rnk rnkVar = j5 < jLongValue2 ? rnk.SOON : j5 > jLongValue3 ? rnk.COMPLETED : rnk.LIVE;
                                rdj rdjVar = rdj.f30294a;
                                sdj sdjVar = sdj.UNIQUE_2;
                                c8oVar = new c8o(jLongValue, iIntValue, str6, ctf0Var3.b.a(R.string.bet_teams_info, Arrays.copyOf(new Object[]{rdj.f(new znq0(jLongValue2), sdjVar, null, 60), rdj.f(new znq0(jLongValue3), sdjVar, null, 60)}, 2)), str7, rnkVar);
                            }
                            arrayList3.add(c8oVar);
                            z3 = z4;
                            it3 = it3;
                            i8 = i9;
                            j6 = j6;
                            j5 = j5;
                        }
                        boolean z5 = z3;
                        long j7 = j6;
                        ArrayList arrayListS = CollectionsKt.S(arrayList3);
                        if (!arrayListS.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            lc00VarB.add(new n8o("DISCIPLINES_HEADER", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                            List list3 = b9o.f2220a;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = list3.iterator();
                            while (true) {
                                long j8 = 2;
                                if (it4.hasNext()) {
                                    aco0 aco0Var = (aco0) it4.next();
                                    byte b8 = aco0Var.f639a;
                                    byte b9 = aco0Var.f639a;
                                    long j9 = b8;
                                    a9o[] a9oVarArr = a9o.f488a;
                                    if (j9 == 1) {
                                        j2 = 2;
                                        size = arrayListS.size();
                                    } else {
                                        if (j9 != 2) {
                                            j2 = 2;
                                            if (j9 == 3) {
                                                if (arrayListS.isEmpty()) {
                                                    size = 0;
                                                } else {
                                                    Iterator it5 = arrayListS.iterator();
                                                    size = 0;
                                                    while (it5.hasNext()) {
                                                        if (((c8o) it5.next()).f == rnk.SOON && (size = size + 1) < 0) {
                                                            q3d.o();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            } else if (j9 != 4) {
                                                lxlVar = null;
                                                size = 0;
                                            } else if (arrayListS.isEmpty()) {
                                                size = 0;
                                            } else {
                                                Iterator it6 = arrayListS.iterator();
                                                size = 0;
                                                while (it6.hasNext()) {
                                                    if (((c8o) it6.next()).f == rnk.COMPLETED && (size = size + 1) < 0) {
                                                        q3d.o();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        } else if (arrayListS.isEmpty()) {
                                            j2 = 2;
                                            size = 0;
                                        } else {
                                            Iterator it7 = arrayListS.iterator();
                                            int i10 = 0;
                                            while (it7.hasNext()) {
                                                long j10 = j8;
                                                if (((c8o) it7.next()).f == rnk.LIVE && (i10 = i10 + 1) < 0) {
                                                    q3d.o();
                                                    throw null;
                                                }
                                                j8 = j10;
                                            }
                                            j2 = j8;
                                            size = i10;
                                        }
                                        if (size == 0) {
                                            lxlVar2 = lxlVar;
                                        } else {
                                            j3 = b9;
                                            a9o[] a9oVarArr7 = a9o.f488a;
                                            if (j3 == 1) {
                                                i6 = R.string.all;
                                            } else if (j3 == j2) {
                                                i6 = R.string.live_new;
                                            } else if (j3 == 3) {
                                                i6 = R.string.soon;
                                            } else if (j3 == 4) {
                                                i6 = R.string.completed;
                                            } else {
                                                i6 = 0;
                                            }
                                            String strA6 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                            j4 = b9;
                                            if (j7 == j4) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            xxl xxlVar6 = new xxl(strA6);
                                            if (z) {
                                                uxlVar = uxl.b;
                                            } else {
                                                uxlVar = uxl.f36445a;
                                            }
                                            lxlVar2 = new lxl(j4, (dyl) xxlVar6, false, uxlVar, new cwl(new rpe(size)), 76);
                                        }
                                        if (lxlVar2 != null) {
                                            arrayList4.add(lxlVar2);
                                        }
                                    }
                                    lxlVar = null;
                                    if (size == 0) {
                                        lxlVar2 = lxlVar;
                                    } else {
                                        j3 = b9;
                                        a9o[] a9oVarArr8 = a9o.f488a;
                                        if (j3 == 1) {
                                            i6 = R.string.all;
                                        } else if (j3 == j2) {
                                            i6 = R.string.live_new;
                                        } else if (j3 == 3) {
                                            i6 = R.string.soon;
                                        } else if (j3 == 4) {
                                            i6 = R.string.completed;
                                        } else {
                                            i6 = 0;
                                        }
                                        String strA7 = lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0));
                                        j4 = b9;
                                        if (j7 == j4) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        xxl xxlVar7 = new xxl(strA7);
                                        if (z) {
                                            uxlVar = uxl.b;
                                        } else {
                                            uxlVar = uxl.f36445a;
                                        }
                                        lxlVar2 = new lxl(j4, (dyl) xxlVar7, false, uxlVar, new cwl(new rpe(size)), 76);
                                    }
                                    if (lxlVar2 != null) {
                                        arrayList4.add(lxlVar2);
                                    }
                                } else {
                                    lc00VarB.add(new kok("DISCIPLINE_TABS_ID", new fyl(dyb.o0(arrayList4), null, null, s5x0.t(xfn.b(z5).c, 0.0f, 2), null, 22)));
                                    a9o[] a9oVarArr9 = a9o.f488a;
                                    if (j7 == 2) {
                                        arrayList = new ArrayList();
                                        for (Object obj6 : arrayListS) {
                                            if (((c8o) obj6).f == rnk.LIVE) {
                                                arrayList.add(obj6);
                                            }
                                        }
                                    } else if (j7 == 3) {
                                        arrayList = new ArrayList();
                                        for (Object obj7 : arrayListS) {
                                            if (((c8o) obj7).f == rnk.SOON) {
                                                arrayList.add(obj7);
                                            }
                                        }
                                    } else {
                                        if (j7 == 4) {
                                            arrayList = new ArrayList();
                                            for (Object obj8 : arrayListS) {
                                                if (((c8o) obj8).f == rnk.COMPLETED) {
                                                    arrayList.add(obj8);
                                                }
                                            }
                                        }
                                        String strValueOf6 = String.valueOf(j7);
                                        arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                        it = arrayListS.iterator();
                                        while (it.hasNext()) {
                                            c8o c8oVar7 = (c8o) it.next();
                                            i2 = c8oVar7.b;
                                            long j16 = c8oVar7.f3923a;
                                            String str18 = c8oVar7.c;
                                            str18.getClass();
                                            String str19 = c8oVar7.d;
                                            str19.getClass();
                                            sb = new StringBuilder(ujn.h);
                                            str = c8oVar7.e;
                                            str.getClass();
                                            if (str.length() == 0) {
                                                it2 = it;
                                                sb.setLength(0);
                                                i3 = i2;
                                            } else {
                                                it2 = it;
                                                i3 = i2;
                                                if (!StringsKt.O(str, ujn.h, false)) {
                                                    i4 = 0;
                                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                                    i4 = 0;
                                                } else {
                                                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                        i5 = 1;
                                                        c2 = '/';
                                                    } else {
                                                        sb.append('/');
                                                        c2 = '/';
                                                        i5 = 1;
                                                    }
                                                    char[] cArr6 = new char[i5];
                                                    cArr6[0] = c2;
                                                    sb.append(StringsKt.y0(str, cArr6));
                                                }
                                                sb.setLength(i4);
                                                sb.append(str);
                                            }
                                            arrayList2.add(new wnk(i3, j16, str18, str19, new tnk(sb.toString()), c8oVar7.f));
                                            it = it2;
                                        }
                                        lc00VarB.add(new e8o(strValueOf6, arrayList2));
                                    }
                                    arrayListS = arrayList;
                                    String strValueOf7 = String.valueOf(j7);
                                    arrayList2 = new ArrayList(r3d.q(arrayListS, 10));
                                    it = arrayListS.iterator();
                                    while (it.hasNext()) {
                                        c8o c8oVar8 = (c8o) it.next();
                                        i2 = c8oVar8.b;
                                        long j17 = c8oVar8.f3923a;
                                        String str110 = c8oVar8.c;
                                        str110.getClass();
                                        String str111 = c8oVar8.d;
                                        str111.getClass();
                                        sb = new StringBuilder(ujn.h);
                                        str = c8oVar8.e;
                                        str.getClass();
                                        if (str.length() == 0) {
                                            it2 = it;
                                            sb.setLength(0);
                                            i3 = i2;
                                        } else {
                                            it2 = it;
                                            i3 = i2;
                                            if (!StringsKt.O(str, ujn.h, false)) {
                                                i4 = 0;
                                            } else if (kotlin.text.c.x(str, "https://", false)) {
                                                i4 = 0;
                                            } else {
                                                if (sb.length() > 0) {
                                                    i5 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i5 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr7 = new char[i5];
                                                cArr7[0] = c2;
                                                sb.append(StringsKt.y0(str, cArr7));
                                            }
                                            sb.setLength(i4);
                                            sb.append(str);
                                        }
                                        arrayList2.add(new wnk(i3, j17, str110, str111, new tnk(sb.toString()), c8oVar8.f));
                                        it = it2;
                                    }
                                    lc00VarB.add(new e8o(strValueOf7, arrayList2));
                                }
                            }
                        }
                        return kotlin.collections.a.a(lc00VarB);
                    case 2:
                        h8o h8oVar3 = (h8o) obj5;
                        h8oVar3.getClass();
                        y78 y78Var2 = i9oVar.d;
                        z8o z8oVar4 = i9oVar.f14395a;
                        sff0 sff0Var2 = z8oVar4.d;
                        boolean z6 = z8oVar4.e;
                        w7o w7oVar2 = z8oVar4.b;
                        List list4 = w7oVar2 != null ? w7oVar2.d : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return hkb.A(h8oVar3, y78Var2, sff0Var2, z6, list4, i9oVar.b, true, z8oVar4.h);
                    case 3:
                        h8o h8oVar4 = (h8o) obj5;
                        h8oVar4.getClass();
                        y78 y78Var3 = i9oVar.d;
                        z8o z8oVar5 = i9oVar.f14395a;
                        sff0 sff0Var3 = z8oVar5.d;
                        boolean z7 = z8oVar5.e;
                        w7o w7oVar3 = z8oVar5.b;
                        List list5 = w7oVar3 != null ? w7oVar3.d : null;
                        if (list5 == null) {
                            list5 = iun.f15405a;
                        }
                        return hkb.A(h8oVar4, y78Var3, sff0Var3, z7, list5, i9oVar.b, false, z8oVar5.h);
                    case 4:
                        List<uog> list6 = (List) obj5;
                        list6.getClass();
                        ctf0 ctf0Var4 = i9oVar.b;
                        ctf0Var4.getClass();
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        if (list6.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00VarB2.add(new n8o("PROMO_HEADER", new hjm(ctf0Var4.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                        ArrayList arrayList5 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            arrayList5.add(new owr0(uogVar.f36012a, uogVar.b, uogVar.d, uogVar.l, uogVar.f, uogVar.i, uogVar.j, uogVar.k, uogVar.g, uogVar.h));
                        }
                        lc00VarB2.add(new p8o(dyb.r0(arrayList5)));
                        return kotlin.collections.a.a(lc00VarB2);
                    default:
                        List<phk0> list7 = (List) obj5;
                        list7.getClass();
                        ctf0 ctf0Var5 = i9oVar.b;
                        ctf0Var5.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (list7.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB3.add(new n8o("SOCIAL_NETWORKS_HEADER", new hjm(lsm0Var2.a(R.string.social_networks, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126)));
                        for (phk0 phk0Var : list7) {
                            String str112 = phk0Var.f27002a;
                            String str113 = phk0Var.b;
                            if (str112.equals(lsm0Var2.a(R.string.social_telegram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "org.telegram.messenger";
                            } else if (str112.equals(lsm0Var2.a(R.string.social_instagram, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.instagram.android";
                            } else if (str112.equals(lsm0Var2.a(R.string.social_x_label, Arrays.copyOf(new Object[0], 0)))) {
                                str4 = "com.twitter.android";
                            } else {
                                str4 = str112.equals(lsm0Var2.a(R.string.social_discord, Arrays.copyOf(new Object[0], 0))) ? "com.discord" : "";
                            }
                            lc00VarB3.add(new o5s0(str112, str113, str4, phk0Var.c));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                }
            }
        }, (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        t8o t8oVar;
        t8o t8oVar2;
        l0l0 l0l0Var;
        z8o z8oVar = (z8o) obj;
        z8oVar.getClass();
        zbk zbkVar = ((fee) this.f.getValue()).e;
        w7o w7oVar = z8oVar.b;
        boolean z = z8oVar.f43977a;
        v5l0 v5l0Var = z8oVar.d.g.y;
        boolean z2 = this.f14395a.g;
        gnm gnmVar = new gnm(this, z8oVar, (byte) 25);
        g2v g2vVar = this.c;
        x7o x7oVar = x7o.f40421a;
        if (w7oVar != null) {
            a4x a4xVar = (a4x) gnmVar.invoke();
            Object obj2 = w7oVar.f38683a;
            e0g0 e0g0Var = j0g0.b;
            if ((obj2 instanceof g0g0) && (w7oVar.b instanceof g0g0) && (w7oVar.c instanceof g0g0)) {
                t8oVar2 = new t8o(new y7o(ozb.Q(-1L, g2vVar)));
            } else if (a4xVar.isEmpty()) {
                t8oVar2 = new t8o(new y7o(ozb.P(-1L, g2vVar)));
            } else {
                t8oVar = new t8o(x7oVar, (a4x) gnmVar.invoke());
            }
            t8oVar = t8oVar2;
        } else if (z) {
            int iOrdinal = v5l0Var.ordinal();
            if (iOrdinal == 0) {
                l0l0Var = g0l0.f10465a;
            } else if (iOrdinal == 1) {
                l0l0Var = k0l0.f17474a;
            } else if (iOrdinal == 2) {
                l0l0Var = j0l0.f15687a;
            } else if (iOrdinal == 3) {
                l0l0Var = i0l0.f13953a;
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                l0l0Var = h0l0.f12241a;
            }
            n8o n8oVar = new n8o("DISCIPLINES_HEADER_SHIMMER_KEY", new ijm());
            kok kokVar = new kok("DISCIPLINES_TABS_SHIMMER_KEY", new gyl(null, s5x0.t(xfn.b(z2).c, 0.0f, 2), 1));
            n8o n8oVar2 = new n8o("LIVE_EVENTS_HEADER_SHIMMER_KEY", new ijm());
            q0s q0sVar = q0s.b;
            t8oVar = new t8o(x7oVar, dyb.g0(n8oVar, kokVar, f8o.f9116a, n8oVar2, new m8o("LIVE_EVENTS_SHIMMER_KEY", new vb90(q0sVar, dyb.g0(new x56(l0l0Var), new x56(l0l0Var)), false, true)), new n8o("LINE_EVENTS_HEADER_SHIMMER_KEY", new ijm()), new m8o("LINE_EVENTS_SHIMMER_KEY", new vb90(q0sVar, dyb.g0(new x56(l0l0Var), new x56(l0l0Var)), false, true))));
        } else {
            t8oVar2 = new t8o(new y7o(ozb.Q(-1L, g2vVar)));
            t8oVar = t8oVar2;
        }
        return new g9o(zbkVar, t8oVar);
    }
}
