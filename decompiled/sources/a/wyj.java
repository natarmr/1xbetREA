package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.home.CyberHomeParams;

/* JADX INFO: loaded from: classes4.dex */
public final class wyj implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f39976a;
    public final y78 b;
    public final g2v c;
    public final zjw d;
    public final th90 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;

    /* JADX WARN: Code duplicated, block: B:39:0x0274  */
    /* JADX WARN: Code duplicated, block: B:47:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0304  */
    /* JADX WARN: Code duplicated, block: B:71:0x0334  */
    public wyj(CyberHomeParams cyberHomeParams, ctf0 ctf0Var, y78 y78Var, g2v g2vVar, zjw zjwVar) {
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ctf0Var.getClass();
        this.f39976a = ctf0Var;
        this.b = y78Var;
        this.c = g2vVar;
        this.d = zjwVar;
        List list = zjwVar.f44501a;
        boolean zD = Intrinsics.d(cyberHomeParams.f46558a, CyberGamesPage.Real.INSTANCE);
        List list2 = zjwVar.c;
        final byte b = 1;
        if (list2 != null && list2.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            lok0 lok0Var = (lok0) it.next();
            if (this.d.f ? lok0Var.t.contains(4) : lok0Var.t.contains(5)) {
                z = true;
                break;
            }
        }
        zjw zjwVar2 = this.d;
        sff0 sff0Var = zjwVar2.b;
        jo20 jo20Var = new jo20();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CyberGamesPage cyberGamesPage = ((ekw) it2.next()).f7971a;
            lq5 lq5VarI = ujn.i(a(sff0Var, cyberGamesPage, zjwVar2.f));
            mum0 mum0Var = sff0Var.g;
            v5l0 v5l0Var = mum0Var.y;
            rhb0 rhb0Var = mum0Var.l;
            cyberGamesPage.getClass();
            lc00 lc00VarB = kotlin.collections.a.b();
            if (!cyberGamesPage.equals(CyberGamesPage.OneXCyber.INSTANCE) && rhb0Var != rhb0.POPULAR_CLASSIC) {
                lc00VarB.add(new aiw(lq5VarI));
            }
            if (z && cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
                lc00VarB.add(new nuj("shimmer_header_6", new ijm()));
                lc00VarB.add(new ojw("shimmer_top_event", pjw.b));
            }
            lc00VarB.add(new nuj("shimmer_header_1", new ijm()));
            lc00VarB.add(new diw("shimmer_category_card_collection", avl.f1531a));
            lc00VarB.add(new nuj("shimmer_header_2", new ijm()));
            pjw pjwVar = pjw.f27109a;
            lc00VarB.add(new ojw("shimmer_sub_header_1", pjwVar));
            lc00VarB.add(axj.a(v5l0Var, "shimmer_games_1"));
            lc00VarB.add(new ojw("shimmer_sub_header_2", pjwVar));
            lc00VarB.add(axj.a(v5l0Var, "shimmer_games_2"));
            lc00VarB.add(new ojw("shimmer_sub_header_3", pjwVar));
            lc00VarB.add(axj.a(v5l0Var, "shimmer_games_3"));
            lc00VarB.add(new nuj("shimmer_header_3", new ijm()));
            lc00VarB.add(new ojw("shimmer_sub_header_4", pjwVar));
            lc00VarB.add(axj.a(v5l0Var, "shimmer_games_4"));
            lc00VarB.add(new ojw("shimmer_sub_header_5", pjwVar));
            lc00VarB.add(axj.a(v5l0Var, "shimmer_games_5"));
            lc00VarB.add(new ojw("shimmer_sub_header_6", pjwVar));
            lc00VarB.add(axj.a(v5l0Var, "shimmer_games_6"));
            if (zD) {
                lc00VarB.add(new nuj("shimmer_header_4", new ijm()));
                lc00VarB.add(new ztj(dyb.g0(new z2m(0.9f), new z2m(0.9f), new z2m(0.9f)), "shimmer_banner_champs_1"));
                lc00VarB.add(new nuj("shimmer_header_5", new ijm()));
                lc00VarB.add(new ztj(dyb.g0(new z2m(0.9f), new z2m(0.9f), new z2m(0.9f)), "shimmer_banner_champs_2"));
            }
            jo20Var.put(cyberGamesPage, androidx.compose.runtime.e.e(new hjw(wiw.f39237a, dyb.o0(kotlin.collections.a.a(lc00VarB)), true)));
        }
        this.e = dyb.p0(jo20Var.b());
        this.f = bkb.H(this.d.g);
        zjw zjwVar3 = this.d;
        this.g = bkb.H(Boolean.valueOf(Intrinsics.d(zjwVar3.j.get(zjwVar3.g.f7971a), Boolean.TRUE)));
        this.h = bkb.H(Boolean.valueOf(this.d.k));
        this.i = bkb.H(this.d.d);
        this.j = maz.b(new yw9(b(), new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj6) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b2 = b;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b2) {
                    case 0:
                        List list3 = (List) obj6;
                        list3.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list4 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list4.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj7 : list3) {
                            lok0 lok0Var2 = (lok0) obj7;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj7);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list5 = list4;
                            if (j2 != 0) {
                                Iterator it5 = list5.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList4 = arrayList;
                                arrayList4.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list4 = list5;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList4;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList5 = arrayList;
                            arrayList5.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list4 = list5;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList5;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj6;
                        feeVar.getClass();
                        zjw zjwVar4 = wyjVar.d;
                        return new gkw(!zjwVar4.f, dyb.o0(zjwVar4.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar4.b));
                    case 2:
                        List<uog> list6 = (List) obj6;
                        list6.getClass();
                        zjw zjwVar5 = wyjVar.d;
                        String strA = wyj.a(zjwVar5.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar5.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList6 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList6.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList6));
                    case 3:
                        List list7 = (List) obj6;
                        list7.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar6 = wyjVar.d;
                        return luj.a(list7, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar6.e, zjwVar6.b, zU, zjwVar6.c, zjwVar6.s);
                    case 4:
                        List list8 = (List) obj6;
                        list8.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar7 = wyjVar.d;
                        return luj.a(list8, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar7.e, zjwVar7.b, zU2, zjwVar7.c, zjwVar7.s);
                    case 5:
                        List list9 = (List) obj6;
                        list9.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list9.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList7 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList7.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList8 = new ArrayList(r3d.q(list9, 10));
                            Iterator it7 = list9.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList8.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList7.addAll(arrayList8);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList7))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list10 = (List) obj6;
                        list10.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj8 : list10) {
                            if (((uog) obj8).b.length() > 0) {
                                arrayList9.add(obj8);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList10 = new ArrayList();
                        for (Object obj9 : arrayList9) {
                            if (hashSet.add(Integer.valueOf(((uog) obj9).f36012a))) {
                                arrayList10.add(obj9);
                            }
                        }
                        if (arrayList10.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                        for (uog uogVar2 : arrayList10) {
                            arrayList11.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList11))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj6;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list11 = fiwVar.f9608a;
                        List list12 = fiwVar.b;
                        if (list11.isEmpty() && list12.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list11.isEmpty() ? 6 : 6 - CollectionsKt.D0(list11, 3).size();
                        List listD0 = CollectionsKt.D0(list11, 3);
                        ArrayList arrayList12 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList12.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj10 : list12) {
                            if (!arrayList12.contains(Long.valueOf(((nyg) obj10).g))) {
                                arrayList13.add(obj10);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList13, size);
                        ArrayList arrayList14 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj11 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj11, ctf0Var7);
                            arrayList14.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList14);
                        ArrayList arrayList15 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj12 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj12, ctf0Var7);
                            arrayList15.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList15);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list13 = (List) obj6;
                        list13.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list13.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList16 = new ArrayList();
                        ArrayList arrayList17 = new ArrayList();
                        for (Object obj13 : list13) {
                            if (((xah) obj13).n) {
                                arrayList16.add(obj13);
                            } else {
                                arrayList17.add(obj13);
                            }
                        }
                        if (!arrayList16.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList18 = new ArrayList(r3d.q(arrayList16, 10));
                            Iterator it9 = arrayList16.iterator();
                            while (it9.hasNext()) {
                                arrayList18.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList18), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList17.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList19 = new ArrayList(r3d.q(arrayList17, 10));
                            Iterator it10 = arrayList17.iterator();
                            while (it10.hasNext()) {
                                arrayList19.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList19), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar8 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar8.f, zjwVar8.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
        zjw zjwVar4 = this.d;
        jih jihVar = (jih) zjwVar4.h.get(zjwVar4.g.f7971a);
        if (jihVar != null) {
            Object obj6 = jihVar.f16574a;
            e0g0 e0g0Var = j0g0.b;
            obj = (List) (obj6 instanceof g0g0 ? null : obj6);
            obj = obj == null ? iun.f15405a : obj;
        }
        final byte b2 = 2;
        this.k = maz.b(new yw9(obj, new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj7) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b3 = b2;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b3) {
                    case 0:
                        List list3 = (List) obj7;
                        list3.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list4 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list4.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj8 : list3) {
                            lok0 lok0Var2 = (lok0) obj8;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj8);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list5 = list4;
                            if (j2 != 0) {
                                Iterator it5 = list5.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList5 = arrayList;
                                arrayList5.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list4 = list5;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList5;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList6 = arrayList;
                            arrayList6.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list4 = list5;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList6;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj7;
                        feeVar.getClass();
                        zjw zjwVar5 = wyjVar.d;
                        return new gkw(!zjwVar5.f, dyb.o0(zjwVar5.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar5.b));
                    case 2:
                        List<uog> list6 = (List) obj7;
                        list6.getClass();
                        zjw zjwVar6 = wyjVar.d;
                        String strA = wyj.a(zjwVar6.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar6.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList7 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList7.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList7));
                    case 3:
                        List list7 = (List) obj7;
                        list7.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar7 = wyjVar.d;
                        return luj.a(list7, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar7.e, zjwVar7.b, zU, zjwVar7.c, zjwVar7.s);
                    case 4:
                        List list8 = (List) obj7;
                        list8.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar8 = wyjVar.d;
                        return luj.a(list8, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar8.e, zjwVar8.b, zU2, zjwVar8.c, zjwVar8.s);
                    case 5:
                        List list9 = (List) obj7;
                        list9.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list9.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList8 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList8.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList9 = new ArrayList(r3d.q(list9, 10));
                            Iterator it7 = list9.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList9.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList8.addAll(arrayList9);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList8))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list10 = (List) obj7;
                        list10.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj9 : list10) {
                            if (((uog) obj9).b.length() > 0) {
                                arrayList10.add(obj9);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList11 = new ArrayList();
                        for (Object obj10 : arrayList10) {
                            if (hashSet.add(Integer.valueOf(((uog) obj10).f36012a))) {
                                arrayList11.add(obj10);
                            }
                        }
                        if (arrayList11.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList12 = new ArrayList(r3d.q(arrayList11, 10));
                        for (uog uogVar2 : arrayList11) {
                            arrayList12.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList12))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj7;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list11 = fiwVar.f9608a;
                        List list12 = fiwVar.b;
                        if (list11.isEmpty() && list12.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list11.isEmpty() ? 6 : 6 - CollectionsKt.D0(list11, 3).size();
                        List listD0 = CollectionsKt.D0(list11, 3);
                        ArrayList arrayList13 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList13.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList14 = new ArrayList();
                        for (Object obj11 : list12) {
                            if (!arrayList13.contains(Long.valueOf(((nyg) obj11).g))) {
                                arrayList14.add(obj11);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList14, size);
                        ArrayList arrayList15 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj12 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj12, ctf0Var7);
                            arrayList15.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList15);
                        ArrayList arrayList16 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj13 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj13, ctf0Var7);
                            arrayList16.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList16);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list13 = (List) obj7;
                        list13.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list13.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList17 = new ArrayList();
                        ArrayList arrayList18 = new ArrayList();
                        for (Object obj14 : list13) {
                            if (((xah) obj14).n) {
                                arrayList17.add(obj14);
                            } else {
                                arrayList18.add(obj14);
                            }
                        }
                        if (!arrayList17.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList19 = new ArrayList(r3d.q(arrayList17, 10));
                            Iterator it9 = arrayList17.iterator();
                            while (it9.hasNext()) {
                                arrayList19.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList19), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList18.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList110 = new ArrayList(r3d.q(arrayList18, 10));
                            Iterator it10 = arrayList18.iterator();
                            while (it10.hasNext()) {
                                arrayList110.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList110), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar9 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar9.f, zjwVar9.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
        zjw zjwVar5 = this.d;
        jih jihVar2 = (jih) zjwVar5.h.get(zjwVar5.g.f7971a);
        if (jihVar2 != null) {
            Object obj7 = jihVar2.c;
            e0g0 e0g0Var2 = j0g0.b;
            obj2 = (List) (obj7 instanceof g0g0 ? null : obj7);
            obj2 = obj2 == null ? iun.f15405a : obj2;
        }
        final byte b3 = 3;
        this.l = maz.b(new yw9(obj2, new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj8) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b4 = b3;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b4) {
                    case 0:
                        List list3 = (List) obj8;
                        list3.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list4 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list4.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj9 : list3) {
                            lok0 lok0Var2 = (lok0) obj9;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj9);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list5 = list4;
                            if (j2 != 0) {
                                Iterator it5 = list5.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList6 = arrayList;
                                arrayList6.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list4 = list5;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList6;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList7 = arrayList;
                            arrayList7.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list4 = list5;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList7;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj8;
                        feeVar.getClass();
                        zjw zjwVar6 = wyjVar.d;
                        return new gkw(!zjwVar6.f, dyb.o0(zjwVar6.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar6.b));
                    case 2:
                        List<uog> list6 = (List) obj8;
                        list6.getClass();
                        zjw zjwVar7 = wyjVar.d;
                        String strA = wyj.a(zjwVar7.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar7.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList8 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList8.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList8));
                    case 3:
                        List list7 = (List) obj8;
                        list7.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar8 = wyjVar.d;
                        return luj.a(list7, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar8.e, zjwVar8.b, zU, zjwVar8.c, zjwVar8.s);
                    case 4:
                        List list8 = (List) obj8;
                        list8.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar9 = wyjVar.d;
                        return luj.a(list8, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar9.e, zjwVar9.b, zU2, zjwVar9.c, zjwVar9.s);
                    case 5:
                        List list9 = (List) obj8;
                        list9.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list9.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList9 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList9.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList10 = new ArrayList(r3d.q(list9, 10));
                            Iterator it7 = list9.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList10.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList9.addAll(arrayList10);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList9))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list10 = (List) obj8;
                        list10.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList11 = new ArrayList();
                        for (Object obj10 : list10) {
                            if (((uog) obj10).b.length() > 0) {
                                arrayList11.add(obj10);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList12 = new ArrayList();
                        for (Object obj11 : arrayList11) {
                            if (hashSet.add(Integer.valueOf(((uog) obj11).f36012a))) {
                                arrayList12.add(obj11);
                            }
                        }
                        if (arrayList12.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList13 = new ArrayList(r3d.q(arrayList12, 10));
                        for (uog uogVar2 : arrayList12) {
                            arrayList13.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList13))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj8;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list11 = fiwVar.f9608a;
                        List list12 = fiwVar.b;
                        if (list11.isEmpty() && list12.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list11.isEmpty() ? 6 : 6 - CollectionsKt.D0(list11, 3).size();
                        List listD0 = CollectionsKt.D0(list11, 3);
                        ArrayList arrayList14 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList14.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList15 = new ArrayList();
                        for (Object obj12 : list12) {
                            if (!arrayList14.contains(Long.valueOf(((nyg) obj12).g))) {
                                arrayList15.add(obj12);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList15, size);
                        ArrayList arrayList16 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj13 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj13, ctf0Var7);
                            arrayList16.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList16);
                        ArrayList arrayList17 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj14 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj14, ctf0Var7);
                            arrayList17.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList17);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list13 = (List) obj8;
                        list13.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list13.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList18 = new ArrayList();
                        ArrayList arrayList19 = new ArrayList();
                        for (Object obj15 : list13) {
                            if (((xah) obj15).n) {
                                arrayList18.add(obj15);
                            } else {
                                arrayList19.add(obj15);
                            }
                        }
                        if (!arrayList18.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList110 = new ArrayList(r3d.q(arrayList18, 10));
                            Iterator it9 = arrayList18.iterator();
                            while (it9.hasNext()) {
                                arrayList110.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList110), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList19.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList111 = new ArrayList(r3d.q(arrayList19, 10));
                            Iterator it10 = arrayList19.iterator();
                            while (it10.hasNext()) {
                                arrayList111.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList111), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar10 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar10.f, zjwVar10.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
        zjw zjwVar6 = this.d;
        jih jihVar3 = (jih) zjwVar6.h.get(zjwVar6.g.f7971a);
        if (jihVar3 != null) {
            Object obj8 = jihVar3.d;
            e0g0 e0g0Var3 = j0g0.b;
            obj3 = (List) (obj8 instanceof g0g0 ? null : obj8);
            obj3 = obj3 == null ? iun.f15405a : obj3;
        }
        final byte b4 = 4;
        this.m = maz.b(new yw9(obj3, new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj9) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b5 = b4;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b5) {
                    case 0:
                        List list3 = (List) obj9;
                        list3.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list4 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list4.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj10 : list3) {
                            lok0 lok0Var2 = (lok0) obj10;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj10);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list5 = list4;
                            if (j2 != 0) {
                                Iterator it5 = list5.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList7 = arrayList;
                                arrayList7.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list4 = list5;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList7;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList8 = arrayList;
                            arrayList8.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list4 = list5;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList8;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj9;
                        feeVar.getClass();
                        zjw zjwVar7 = wyjVar.d;
                        return new gkw(!zjwVar7.f, dyb.o0(zjwVar7.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar7.b));
                    case 2:
                        List<uog> list6 = (List) obj9;
                        list6.getClass();
                        zjw zjwVar8 = wyjVar.d;
                        String strA = wyj.a(zjwVar8.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar8.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList9 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList9.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList9));
                    case 3:
                        List list7 = (List) obj9;
                        list7.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar9 = wyjVar.d;
                        return luj.a(list7, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar9.e, zjwVar9.b, zU, zjwVar9.c, zjwVar9.s);
                    case 4:
                        List list8 = (List) obj9;
                        list8.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar10 = wyjVar.d;
                        return luj.a(list8, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar10.e, zjwVar10.b, zU2, zjwVar10.c, zjwVar10.s);
                    case 5:
                        List list9 = (List) obj9;
                        list9.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list9.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList10 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList10.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList11 = new ArrayList(r3d.q(list9, 10));
                            Iterator it7 = list9.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList11.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList10.addAll(arrayList11);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList10))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list10 = (List) obj9;
                        list10.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList12 = new ArrayList();
                        for (Object obj11 : list10) {
                            if (((uog) obj11).b.length() > 0) {
                                arrayList12.add(obj11);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList13 = new ArrayList();
                        for (Object obj12 : arrayList12) {
                            if (hashSet.add(Integer.valueOf(((uog) obj12).f36012a))) {
                                arrayList13.add(obj12);
                            }
                        }
                        if (arrayList13.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList14 = new ArrayList(r3d.q(arrayList13, 10));
                        for (uog uogVar2 : arrayList13) {
                            arrayList14.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList14))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj9;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list11 = fiwVar.f9608a;
                        List list12 = fiwVar.b;
                        if (list11.isEmpty() && list12.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list11.isEmpty() ? 6 : 6 - CollectionsKt.D0(list11, 3).size();
                        List listD0 = CollectionsKt.D0(list11, 3);
                        ArrayList arrayList15 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList15.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList16 = new ArrayList();
                        for (Object obj13 : list12) {
                            if (!arrayList15.contains(Long.valueOf(((nyg) obj13).g))) {
                                arrayList16.add(obj13);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList16, size);
                        ArrayList arrayList17 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj14 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj14, ctf0Var7);
                            arrayList17.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList17);
                        ArrayList arrayList18 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj15 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj15, ctf0Var7);
                            arrayList18.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList18);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list13 = (List) obj9;
                        list13.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list13.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList19 = new ArrayList();
                        ArrayList arrayList110 = new ArrayList();
                        for (Object obj16 : list13) {
                            if (((xah) obj16).n) {
                                arrayList19.add(obj16);
                            } else {
                                arrayList110.add(obj16);
                            }
                        }
                        if (!arrayList19.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList111 = new ArrayList(r3d.q(arrayList19, 10));
                            Iterator it9 = arrayList19.iterator();
                            while (it9.hasNext()) {
                                arrayList111.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList111), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList110.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList112 = new ArrayList(r3d.q(arrayList110, 10));
                            Iterator it10 = arrayList110.iterator();
                            while (it10.hasNext()) {
                                arrayList112.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList112), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar11 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar11.f, zjwVar11.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
        zjw zjwVar7 = this.d;
        jih jihVar4 = (jih) zjwVar7.h.get(zjwVar7.g.f7971a);
        if (jihVar4 != null) {
            Object obj9 = jihVar4.b;
            e0g0 e0g0Var4 = j0g0.b;
            obj4 = (List) (obj9 instanceof g0g0 ? null : obj9);
            obj4 = obj4 == null ? iun.f15405a : obj4;
        }
        final byte b5 = 5;
        this.n = maz.b(new yw9(obj4, new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj10) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b6 = b5;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b6) {
                    case 0:
                        List list3 = (List) obj10;
                        list3.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list4 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list4.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj11 : list3) {
                            lok0 lok0Var2 = (lok0) obj11;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj11);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list5 = list4;
                            if (j2 != 0) {
                                Iterator it5 = list5.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList8 = arrayList;
                                arrayList8.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list4 = list5;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList8;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList9 = arrayList;
                            arrayList9.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list4 = list5;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList9;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj10;
                        feeVar.getClass();
                        zjw zjwVar8 = wyjVar.d;
                        return new gkw(!zjwVar8.f, dyb.o0(zjwVar8.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar8.b));
                    case 2:
                        List<uog> list6 = (List) obj10;
                        list6.getClass();
                        zjw zjwVar9 = wyjVar.d;
                        String strA = wyj.a(zjwVar9.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar9.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList10 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList10.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList10));
                    case 3:
                        List list7 = (List) obj10;
                        list7.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar10 = wyjVar.d;
                        return luj.a(list7, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar10.e, zjwVar10.b, zU, zjwVar10.c, zjwVar10.s);
                    case 4:
                        List list8 = (List) obj10;
                        list8.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar11 = wyjVar.d;
                        return luj.a(list8, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar11.e, zjwVar11.b, zU2, zjwVar11.c, zjwVar11.s);
                    case 5:
                        List list9 = (List) obj10;
                        list9.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list9.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList11 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList11.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList12 = new ArrayList(r3d.q(list9, 10));
                            Iterator it7 = list9.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList12.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList11.addAll(arrayList12);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList11))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list10 = (List) obj10;
                        list10.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj12 : list10) {
                            if (((uog) obj12).b.length() > 0) {
                                arrayList13.add(obj12);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList14 = new ArrayList();
                        for (Object obj13 : arrayList13) {
                            if (hashSet.add(Integer.valueOf(((uog) obj13).f36012a))) {
                                arrayList14.add(obj13);
                            }
                        }
                        if (arrayList14.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList15 = new ArrayList(r3d.q(arrayList14, 10));
                        for (uog uogVar2 : arrayList14) {
                            arrayList15.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList15))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj10;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list11 = fiwVar.f9608a;
                        List list12 = fiwVar.b;
                        if (list11.isEmpty() && list12.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list11.isEmpty() ? 6 : 6 - CollectionsKt.D0(list11, 3).size();
                        List listD0 = CollectionsKt.D0(list11, 3);
                        ArrayList arrayList16 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList16.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList17 = new ArrayList();
                        for (Object obj14 : list12) {
                            if (!arrayList16.contains(Long.valueOf(((nyg) obj14).g))) {
                                arrayList17.add(obj14);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList17, size);
                        ArrayList arrayList18 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj15 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj15, ctf0Var7);
                            arrayList18.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList18);
                        ArrayList arrayList19 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj16 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj16, ctf0Var7);
                            arrayList19.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList19);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list13 = (List) obj10;
                        list13.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list13.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList110 = new ArrayList();
                        ArrayList arrayList111 = new ArrayList();
                        for (Object obj17 : list13) {
                            if (((xah) obj17).n) {
                                arrayList110.add(obj17);
                            } else {
                                arrayList111.add(obj17);
                            }
                        }
                        if (!arrayList110.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList112 = new ArrayList(r3d.q(arrayList110, 10));
                            Iterator it9 = arrayList110.iterator();
                            while (it9.hasNext()) {
                                arrayList112.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList112), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList111.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList113 = new ArrayList(r3d.q(arrayList111, 10));
                            Iterator it10 = arrayList111.iterator();
                            while (it10.hasNext()) {
                                arrayList113.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList113), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar12 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar12.f, zjwVar12.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
        zjw zjwVar8 = this.d;
        jih jihVar5 = (jih) zjwVar8.h.get(zjwVar8.g.f7971a);
        if (jihVar5 != null) {
            Object obj10 = jihVar5.e;
            e0g0 e0g0Var5 = j0g0.b;
            obj5 = (List) (obj10 instanceof g0g0 ? null : obj10);
            obj5 = obj5 == null ? iun.f15405a : obj5;
        }
        final byte b6 = 6;
        this.o = maz.b(new yw9(obj5, new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj11) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b7 = b6;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b7) {
                    case 0:
                        List list3 = (List) obj11;
                        list3.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list4 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list4.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj12 : list3) {
                            lok0 lok0Var2 = (lok0) obj12;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj12);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list5 = list4;
                            if (j2 != 0) {
                                Iterator it5 = list5.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList9 = arrayList;
                                arrayList9.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list4 = list5;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList9;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList10 = arrayList;
                            arrayList10.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list4 = list5;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList10;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj11;
                        feeVar.getClass();
                        zjw zjwVar9 = wyjVar.d;
                        return new gkw(!zjwVar9.f, dyb.o0(zjwVar9.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar9.b));
                    case 2:
                        List<uog> list6 = (List) obj11;
                        list6.getClass();
                        zjw zjwVar10 = wyjVar.d;
                        String strA = wyj.a(zjwVar10.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar10.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList11 = new ArrayList(r3d.q(list6, 10));
                        for (uog uogVar : list6) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList11.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList11));
                    case 3:
                        List list7 = (List) obj11;
                        list7.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar11 = wyjVar.d;
                        return luj.a(list7, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar11.e, zjwVar11.b, zU, zjwVar11.c, zjwVar11.s);
                    case 4:
                        List list8 = (List) obj11;
                        list8.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar12 = wyjVar.d;
                        return luj.a(list8, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar12.e, zjwVar12.b, zU2, zjwVar12.c, zjwVar12.s);
                    case 5:
                        List list9 = (List) obj11;
                        list9.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list9.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList12 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList12.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList13 = new ArrayList(r3d.q(list9, 10));
                            Iterator it7 = list9.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList13.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList12.addAll(arrayList13);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList12))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list10 = (List) obj11;
                        list10.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList14 = new ArrayList();
                        for (Object obj13 : list10) {
                            if (((uog) obj13).b.length() > 0) {
                                arrayList14.add(obj13);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList15 = new ArrayList();
                        for (Object obj14 : arrayList14) {
                            if (hashSet.add(Integer.valueOf(((uog) obj14).f36012a))) {
                                arrayList15.add(obj14);
                            }
                        }
                        if (arrayList15.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList16 = new ArrayList(r3d.q(arrayList15, 10));
                        for (uog uogVar2 : arrayList15) {
                            arrayList16.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList16))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj11;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list11 = fiwVar.f9608a;
                        List list12 = fiwVar.b;
                        if (list11.isEmpty() && list12.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list11.isEmpty() ? 6 : 6 - CollectionsKt.D0(list11, 3).size();
                        List listD0 = CollectionsKt.D0(list11, 3);
                        ArrayList arrayList17 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList17.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList18 = new ArrayList();
                        for (Object obj15 : list12) {
                            if (!arrayList17.contains(Long.valueOf(((nyg) obj15).g))) {
                                arrayList18.add(obj15);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList18, size);
                        ArrayList arrayList19 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj16 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj16, ctf0Var7);
                            arrayList19.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList19);
                        ArrayList arrayList110 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj17 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj17, ctf0Var7);
                            arrayList110.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList110);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list13 = (List) obj11;
                        list13.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list13.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList111 = new ArrayList();
                        ArrayList arrayList112 = new ArrayList();
                        for (Object obj18 : list13) {
                            if (((xah) obj18).n) {
                                arrayList111.add(obj18);
                            } else {
                                arrayList112.add(obj18);
                            }
                        }
                        if (!arrayList111.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList113 = new ArrayList(r3d.q(arrayList111, 10));
                            Iterator it9 = arrayList111.iterator();
                            while (it9.hasNext()) {
                                arrayList113.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList113), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList112.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList114 = new ArrayList(r3d.q(arrayList112, 10));
                            Iterator it10 = arrayList112.iterator();
                            while (it10.hasNext()) {
                                arrayList114.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList114), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar13 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar13.f, zjwVar13.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
        List list3 = iun.f15405a;
        final byte b7 = 7;
        this.p = maz.b(new yw9(new fiw(list3, list3), new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj11) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b8 = b7;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b8) {
                    case 0:
                        List list4 = (List) obj11;
                        list4.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list5 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list5.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj12 : list4) {
                            lok0 lok0Var2 = (lok0) obj12;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj12);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list6 = list5;
                            if (j2 != 0) {
                                Iterator it5 = list6.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList10 = arrayList;
                                arrayList10.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list5 = list6;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList10;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList11 = arrayList;
                            arrayList11.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list5 = list6;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList11;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj11;
                        feeVar.getClass();
                        zjw zjwVar9 = wyjVar.d;
                        return new gkw(!zjwVar9.f, dyb.o0(zjwVar9.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar9.b));
                    case 2:
                        List<uog> list7 = (List) obj11;
                        list7.getClass();
                        zjw zjwVar10 = wyjVar.d;
                        String strA = wyj.a(zjwVar10.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar10.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList12 = new ArrayList(r3d.q(list7, 10));
                        for (uog uogVar : list7) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList12.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList12));
                    case 3:
                        List list8 = (List) obj11;
                        list8.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar11 = wyjVar.d;
                        return luj.a(list8, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar11.e, zjwVar11.b, zU, zjwVar11.c, zjwVar11.s);
                    case 4:
                        List list9 = (List) obj11;
                        list9.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar12 = wyjVar.d;
                        return luj.a(list9, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar12.e, zjwVar12.b, zU2, zjwVar12.c, zjwVar12.s);
                    case 5:
                        List list10 = (List) obj11;
                        list10.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list10.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList13 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList13.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList14 = new ArrayList(r3d.q(list10, 10));
                            Iterator it7 = list10.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList14.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList13.addAll(arrayList14);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList13))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list11 = (List) obj11;
                        list11.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList15 = new ArrayList();
                        for (Object obj13 : list11) {
                            if (((uog) obj13).b.length() > 0) {
                                arrayList15.add(obj13);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList16 = new ArrayList();
                        for (Object obj14 : arrayList15) {
                            if (hashSet.add(Integer.valueOf(((uog) obj14).f36012a))) {
                                arrayList16.add(obj14);
                            }
                        }
                        if (arrayList16.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList17 = new ArrayList(r3d.q(arrayList16, 10));
                        for (uog uogVar2 : arrayList16) {
                            arrayList17.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList17))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj11;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list12 = fiwVar.f9608a;
                        List list13 = fiwVar.b;
                        if (list12.isEmpty() && list13.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list12.isEmpty() ? 6 : 6 - CollectionsKt.D0(list12, 3).size();
                        List listD0 = CollectionsKt.D0(list12, 3);
                        ArrayList arrayList18 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList18.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList19 = new ArrayList();
                        for (Object obj15 : list13) {
                            if (!arrayList18.contains(Long.valueOf(((nyg) obj15).g))) {
                                arrayList19.add(obj15);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList19, size);
                        ArrayList arrayList110 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj16 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj16, ctf0Var7);
                            arrayList110.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList110);
                        ArrayList arrayList111 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj17 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj17, ctf0Var7);
                            arrayList111.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList111);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list14 = (List) obj11;
                        list14.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list14.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList112 = new ArrayList();
                        ArrayList arrayList113 = new ArrayList();
                        for (Object obj18 : list14) {
                            if (((xah) obj18).n) {
                                arrayList112.add(obj18);
                            } else {
                                arrayList113.add(obj18);
                            }
                        }
                        if (!arrayList112.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList114 = new ArrayList(r3d.q(arrayList112, 10));
                            Iterator it9 = arrayList112.iterator();
                            while (it9.hasNext()) {
                                arrayList114.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList114), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList113.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList115 = new ArrayList(r3d.q(arrayList113, 10));
                            Iterator it10 = arrayList113.iterator();
                            while (it10.hasNext()) {
                                arrayList115.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList115), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar13 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar13.f, zjwVar13.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
        zjw zjwVar9 = this.d;
        jih jihVar6 = (jih) zjwVar9.h.get(zjwVar9.g.f7971a);
        if (jihVar6 != null) {
            Object obj11 = jihVar6.i;
            e0g0 e0g0Var6 = j0g0.b;
            List list4 = (List) (obj11 instanceof g0g0 ? null : obj11);
            if (list4 != null) {
                list3 = list4;
            }
        }
        final byte b8 = 8;
        this.q = maz.b(new yw9(list3, new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj12) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b9 = b8;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b9) {
                    case 0:
                        List list5 = (List) obj12;
                        list5.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list6 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list6.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj13 : list5) {
                            lok0 lok0Var2 = (lok0) obj13;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj13);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list7 = list6;
                            if (j2 != 0) {
                                Iterator it5 = list7.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList11 = arrayList;
                                arrayList11.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list6 = list7;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList11;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList12 = arrayList;
                            arrayList12.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list6 = list7;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList12;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj12;
                        feeVar.getClass();
                        zjw zjwVar10 = wyjVar.d;
                        return new gkw(!zjwVar10.f, dyb.o0(zjwVar10.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar10.b));
                    case 2:
                        List<uog> list8 = (List) obj12;
                        list8.getClass();
                        zjw zjwVar11 = wyjVar.d;
                        String strA = wyj.a(zjwVar11.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar11.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList13 = new ArrayList(r3d.q(list8, 10));
                        for (uog uogVar : list8) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList13.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList13));
                    case 3:
                        List list9 = (List) obj12;
                        list9.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar12 = wyjVar.d;
                        return luj.a(list9, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar12.e, zjwVar12.b, zU, zjwVar12.c, zjwVar12.s);
                    case 4:
                        List list10 = (List) obj12;
                        list10.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar13 = wyjVar.d;
                        return luj.a(list10, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar13.e, zjwVar13.b, zU2, zjwVar13.c, zjwVar13.s);
                    case 5:
                        List list11 = (List) obj12;
                        list11.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list11.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList14 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList14.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList15 = new ArrayList(r3d.q(list11, 10));
                            Iterator it7 = list11.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList15.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList14.addAll(arrayList15);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList14))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list12 = (List) obj12;
                        list12.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList16 = new ArrayList();
                        for (Object obj14 : list12) {
                            if (((uog) obj14).b.length() > 0) {
                                arrayList16.add(obj14);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList17 = new ArrayList();
                        for (Object obj15 : arrayList16) {
                            if (hashSet.add(Integer.valueOf(((uog) obj15).f36012a))) {
                                arrayList17.add(obj15);
                            }
                        }
                        if (arrayList17.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList18 = new ArrayList(r3d.q(arrayList17, 10));
                        for (uog uogVar2 : arrayList17) {
                            arrayList18.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList18))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj12;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list13 = fiwVar.f9608a;
                        List list14 = fiwVar.b;
                        if (list13.isEmpty() && list14.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list13.isEmpty() ? 6 : 6 - CollectionsKt.D0(list13, 3).size();
                        List listD0 = CollectionsKt.D0(list13, 3);
                        ArrayList arrayList19 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList19.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList110 = new ArrayList();
                        for (Object obj16 : list14) {
                            if (!arrayList19.contains(Long.valueOf(((nyg) obj16).g))) {
                                arrayList110.add(obj16);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList110, size);
                        ArrayList arrayList111 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj17 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj17, ctf0Var7);
                            arrayList111.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList111);
                        ArrayList arrayList112 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj18 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj18, ctf0Var7);
                            arrayList112.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList112);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list15 = (List) obj12;
                        list15.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list15.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList113 = new ArrayList();
                        ArrayList arrayList114 = new ArrayList();
                        for (Object obj19 : list15) {
                            if (((xah) obj19).n) {
                                arrayList113.add(obj19);
                            } else {
                                arrayList114.add(obj19);
                            }
                        }
                        if (!arrayList113.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList115 = new ArrayList(r3d.q(arrayList113, 10));
                            Iterator it9 = arrayList113.iterator();
                            while (it9.hasNext()) {
                                arrayList115.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList115), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList114.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList116 = new ArrayList(r3d.q(arrayList114, 10));
                            Iterator it10 = arrayList114.iterator();
                            while (it10.hasNext()) {
                                arrayList116.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList116), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar14 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar14.f, zjwVar14.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
        zjw zjwVar10 = this.d;
        jih jihVar7 = (jih) zjwVar10.h.get(zjwVar10.g.f7971a);
        final byte b9 = 9;
        this.r = maz.b(new yw9(Boolean.valueOf(!(jihVar7 != null && kih.a(jihVar7, ((ekw) b().c()).f7971a, false))), new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj12) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b10 = b9;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b10) {
                    case 0:
                        List list5 = (List) obj12;
                        list5.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list6 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list6.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj13 : list5) {
                            lok0 lok0Var2 = (lok0) obj13;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj13);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list7 = list6;
                            if (j2 != 0) {
                                Iterator it5 = list7.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList12 = arrayList;
                                arrayList12.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list6 = list7;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList12;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList13 = arrayList;
                            arrayList13.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list6 = list7;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList13;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj12;
                        feeVar.getClass();
                        zjw zjwVar11 = wyjVar.d;
                        return new gkw(!zjwVar11.f, dyb.o0(zjwVar11.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar11.b));
                    case 2:
                        List<uog> list8 = (List) obj12;
                        list8.getClass();
                        zjw zjwVar12 = wyjVar.d;
                        String strA = wyj.a(zjwVar12.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar12.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList14 = new ArrayList(r3d.q(list8, 10));
                        for (uog uogVar : list8) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList14.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList14));
                    case 3:
                        List list9 = (List) obj12;
                        list9.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar13 = wyjVar.d;
                        return luj.a(list9, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar13.e, zjwVar13.b, zU, zjwVar13.c, zjwVar13.s);
                    case 4:
                        List list10 = (List) obj12;
                        list10.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar14 = wyjVar.d;
                        return luj.a(list10, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar14.e, zjwVar14.b, zU2, zjwVar14.c, zjwVar14.s);
                    case 5:
                        List list11 = (List) obj12;
                        list11.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list11.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList15 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList15.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList16 = new ArrayList(r3d.q(list11, 10));
                            Iterator it7 = list11.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList16.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList15.addAll(arrayList16);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList15))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list12 = (List) obj12;
                        list12.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList17 = new ArrayList();
                        for (Object obj14 : list12) {
                            if (((uog) obj14).b.length() > 0) {
                                arrayList17.add(obj14);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList18 = new ArrayList();
                        for (Object obj15 : arrayList17) {
                            if (hashSet.add(Integer.valueOf(((uog) obj15).f36012a))) {
                                arrayList18.add(obj15);
                            }
                        }
                        if (arrayList18.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList19 = new ArrayList(r3d.q(arrayList18, 10));
                        for (uog uogVar2 : arrayList18) {
                            arrayList19.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList19))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj12;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list13 = fiwVar.f9608a;
                        List list14 = fiwVar.b;
                        if (list13.isEmpty() && list14.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list13.isEmpty() ? 6 : 6 - CollectionsKt.D0(list13, 3).size();
                        List listD0 = CollectionsKt.D0(list13, 3);
                        ArrayList arrayList110 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList110.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList111 = new ArrayList();
                        for (Object obj16 : list14) {
                            if (!arrayList110.contains(Long.valueOf(((nyg) obj16).g))) {
                                arrayList111.add(obj16);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList111, size);
                        ArrayList arrayList112 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj17 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj17, ctf0Var7);
                            arrayList112.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList112);
                        ArrayList arrayList113 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj18 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj18, ctf0Var7);
                            arrayList113.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList113);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list15 = (List) obj12;
                        list15.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list15.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList114 = new ArrayList();
                        ArrayList arrayList115 = new ArrayList();
                        for (Object obj19 : list15) {
                            if (((xah) obj19).n) {
                                arrayList114.add(obj19);
                            } else {
                                arrayList115.add(obj19);
                            }
                        }
                        if (!arrayList114.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList116 = new ArrayList(r3d.q(arrayList114, 10));
                            Iterator it9 = arrayList114.iterator();
                            while (it9.hasNext()) {
                                arrayList116.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList116), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList115.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList117 = new ArrayList(r3d.q(arrayList115, 10));
                            Iterator it10 = arrayList115.iterator();
                            while (it10.hasNext()) {
                                arrayList117.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList117), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar15 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar15.f, zjwVar15.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
        final byte b10 = 0;
        this.s = maz.b(new yw9(this.d.c, new Function1(this) { // from class: a.vyj
            public final /* synthetic */ wyj b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:149:0x0626 A[PHI: r8
  0x0626: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:151:0x062e, B:147:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj12) {
                ArrayList arrayList;
                nuj nujVar;
                char c;
                boolean z2;
                int i;
                String string;
                Object next;
                String str;
                byte b11 = b10;
                int i2 = 0;
                wyj wyjVar = this.b;
                switch (b11) {
                    case 0:
                        List list5 = (List) obj12;
                        list5.getClass();
                        CyberGamesPage cyberGamesPage2 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0 ctf0Var2 = wyjVar.f39976a;
                        boolean z3 = wyjVar.d.f;
                        List list6 = (List) ((fee) wyjVar.i.getValue()).c();
                        cyberGamesPage2.getClass();
                        ctf0Var2.getClass();
                        list6.getClass();
                        if (!cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj13 : list5) {
                            lok0 lok0Var2 = (lok0) obj13;
                            if (z3 ? lok0Var2.t.contains(4) : lok0Var2.t.contains(5)) {
                                arrayList2.add(obj13);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nuj nujVar2 = new nuj("HomeHeaderUiModel_SPECIAL_EVENTS", new hjm(ctf0Var2.b.a(R.string.top_events_title, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126));
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            lok0 lok0Var3 = (lok0) it3.next();
                            int i3 = lok0Var3.f20396a;
                            String str2 = lok0Var3.u;
                            long j = lok0Var3.f;
                            String str3 = lok0Var3.b;
                            Iterator it4 = it3;
                            long j2 = lok0Var3.g;
                            String string2 = "";
                            List list7 = list6;
                            if (j2 != 0) {
                                Iterator it5 = list7.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        Iterator it6 = it5;
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        if (((f3n0) next).f8872a != j2) {
                                            it5 = it6;
                                            nujVar2 = nujVar;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        nujVar = nujVar2;
                                        next = null;
                                    }
                                }
                                f3n0 f3n0Var = (f3n0) next;
                                if (f3n0Var != null) {
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = f3n0Var.c.j;
                                    str4.getClass();
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                        i = 0;
                                        c = '/';
                                        z2 = true;
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb.append('/');
                                            }
                                            z2 = true;
                                            i = 0;
                                            sb.append(StringsKt.y0(str4, c));
                                        }
                                        c = '/';
                                        z2 = true;
                                        sb.setLength(i);
                                        sb.append(str4);
                                    }
                                    string = sb.toString();
                                } else {
                                    c = '/';
                                    z2 = true;
                                    i = 0;
                                    if (j != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    }
                                }
                                ArrayList arrayList13 = arrayList;
                                arrayList13.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                                list6 = list7;
                                nujVar2 = nujVar;
                                arrayList3 = arrayList13;
                                it3 = it4;
                            } else {
                                arrayList = arrayList3;
                                nujVar = nujVar2;
                                c = '/';
                                z2 = true;
                                i = 0;
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                }
                            }
                            string = string2;
                            ArrayList arrayList14 = arrayList;
                            arrayList14.add(new xjw(i3, str3, new gy30(new ux30(14, 0L, lok0Var3.b, (String) null), new rx30(new n0x(string), 0L, null, R.drawable.sport_new, 0L, new qc5(null, new n0x(q5x.D(i3, str2)), null), 438), new zx30(new n0x(q5x.E(i3, str2)), 2), 0L, null, null, 248)));
                            list6 = list7;
                            nujVar2 = nujVar;
                            arrayList3 = arrayList14;
                            it3 = it4;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        lc00VarB2.add(nujVar2);
                        lc00VarB2.add(new wjw(a4xVarO0));
                        return kotlin.collections.a.a(lc00VarB2);
                    case 1:
                        fee feeVar = (fee) obj12;
                        feeVar.getClass();
                        zjw zjwVar11 = wyjVar.d;
                        return new gkw(!zjwVar11.f, dyb.o0(zjwVar11.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) wyjVar.g.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) wyjVar.h.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, ucx.X(zjwVar11.b));
                    case 2:
                        List<uog> list8 = (List) obj12;
                        list8.getClass();
                        zjw zjwVar12 = wyjVar.d;
                        String strA = wyj.a(zjwVar12.b, ((ekw) wyjVar.b().c()).f7971a, zjwVar12.f);
                        CyberGamesPage cyberGamesPage3 = ((ekw) wyjVar.b().c()).f7971a;
                        cyberGamesPage3.getClass();
                        lq5 lq5VarI2 = ujn.i(strA);
                        String strConcat = "HomeBannerCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage3));
                        ArrayList arrayList15 = new ArrayList(r3d.q(list8, 10));
                        for (uog uogVar : list8) {
                            int i4 = uogVar.f36012a;
                            String str5 = uogVar.l;
                            if (lq5VarI2.equals(gq5.f11714a) || lq5VarI2.equals(fq5.f9956a)) {
                                str = uogVar.n;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else if (lq5VarI2.equals(hq5.f13470a) || lq5VarI2.equals(iq5.f15191a) || lq5VarI2.equals(kq5.f18703a) || (lq5VarI2 instanceof jq5)) {
                                str = uogVar.m;
                                if (str.length() != 0) {
                                    str5 = str;
                                }
                            } else {
                                if (!lq5VarI2.equals(dq5.f6497a) && !lq5VarI2.equals(eq5.f8219a) && !lq5VarI2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str5 = uogVar.o;
                                if (str5.length() == 0) {
                                    str5 = uogVar.e;
                                }
                            }
                            arrayList15.add(new fr5(i4, new n0x(str5), (n0x) null, uogVar.b, uogVar.d, (er5) null, 68));
                        }
                        return new zhw(strConcat, lq5VarI2, dyb.o0(arrayList15));
                    case 3:
                        List list9 = (List) obj12;
                        list9.getClass();
                        y78 y78Var2 = wyjVar.b;
                        ctf0 ctf0Var3 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage4 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU = kpb.u(sip.c);
                        zjw zjwVar13 = wyjVar.d;
                        return luj.a(list9, y78Var2, ctf0Var3, cyberGamesPage4, zjwVar13.e, zjwVar13.b, zU, zjwVar13.c, zjwVar13.s);
                    case 4:
                        List list10 = (List) obj12;
                        list10.getClass();
                        y78 y78Var3 = wyjVar.b;
                        ctf0 ctf0Var4 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage5 = ((ekw) wyjVar.b().c()).f7971a;
                        boolean zU2 = kpb.u(sip.b);
                        zjw zjwVar14 = wyjVar.d;
                        return luj.a(list10, y78Var3, ctf0Var4, cyberGamesPage5, zjwVar14.e, zjwVar14.b, zU2, zjwVar14.c, zjwVar14.s);
                    case 5:
                        List list11 = (List) obj12;
                        list11.getClass();
                        ctf0 ctf0Var5 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage6 = ((ekw) wyjVar.b().c()).f7971a;
                        Integer numValueOf = Integer.valueOf(R.drawable.cybergames_discipline_placeholder);
                        ctf0Var5.getClass();
                        cyberGamesPage6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        if (!list11.isEmpty()) {
                            lsm0 lsm0Var = ctf0Var5.b;
                            lc00VarB3.add(new nuj("HEADER_DISCIPLINES_ALL", new hjm(lsm0Var.a(R.string.disciplines, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList16 = new ArrayList();
                            if (cyberGamesPage6.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                String strA2 = lsm0Var.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png");
                                } else {
                                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/virtualCategories/popular/allCategories.png", '/'));
                                }
                                arrayList16.add(new cvl(-10, new n0x(sb2.toString()), numValueOf, strA2));
                            }
                            ArrayList arrayList17 = new ArrayList(r3d.q(list11, 10));
                            Iterator it7 = list11.iterator();
                            while (it7.hasNext()) {
                                p3b p3bVarE = vic.E((ypl0) it7.next());
                                arrayList17.add(new cvl(p3bVarE.f26292a, p3bVarE.b, numValueOf, p3bVarE.c));
                            }
                            arrayList16.addAll(arrayList17);
                            lc00VarB3.add(new diw("HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage6)), new zul(dyb.r0(arrayList16))));
                        }
                        return kotlin.collections.a.a(lc00VarB3);
                    case 6:
                        List list12 = (List) obj12;
                        list12.getClass();
                        ctf0 ctf0Var6 = wyjVar.f39976a;
                        CyberGamesPage cyberGamesPage7 = ((ekw) wyjVar.b().c()).f7971a;
                        ctf0Var6.getClass();
                        cyberGamesPage7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        ArrayList arrayList18 = new ArrayList();
                        for (Object obj14 : list12) {
                            if (((uog) obj14).b.length() > 0) {
                                arrayList18.add(obj14);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<uog> arrayList19 = new ArrayList();
                        for (Object obj15 : arrayList18) {
                            if (hashSet.add(Integer.valueOf(((uog) obj15).f36012a))) {
                                arrayList19.add(obj15);
                            }
                        }
                        if (arrayList19.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var2 = ctf0Var6.b;
                        lc00VarB4.add(new nuj("HEADER_PARTNER_ALL", new hjm(lsm0Var2.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        String strConcat2 = "HomeCyberLogoCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage7));
                        ArrayList arrayList110 = new ArrayList(r3d.q(arrayList19, 10));
                        for (uog uogVar2 : arrayList19) {
                            arrayList110.add(new y8m(uogVar2.f36012a, uogVar2.c, new n0x(uogVar2.l), uogVar2.b, false));
                        }
                        lc00VarB4.add(new mtj(strConcat2, new g9m(dyb.o0(arrayList110))));
                        return kotlin.collections.a.a(lc00VarB4);
                    case 7:
                        fiw fiwVar = (fiw) obj12;
                        fiwVar.getClass();
                        ctf0 ctf0Var7 = wyjVar.f39976a;
                        ctf0Var7.getClass();
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        List list13 = fiwVar.f9608a;
                        List list14 = fiwVar.b;
                        if (list13.isEmpty() && list14.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var7.b;
                        lc00VarB5.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        int size = list13.isEmpty() ? 6 : 6 - CollectionsKt.D0(list13, 3).size();
                        List listD0 = CollectionsKt.D0(list13, 3);
                        ArrayList arrayList111 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList111.add(Long.valueOf(((nyg) it8.next()).g));
                        }
                        ArrayList arrayList112 = new ArrayList();
                        for (Object obj16 : list14) {
                            if (!arrayList111.contains(Long.valueOf(((nyg) obj16).g))) {
                                arrayList112.add(obj16);
                            }
                        }
                        List listD1 = CollectionsKt.D0(arrayList112, size);
                        ArrayList arrayList113 = new ArrayList(r3d.q(listD0, 10));
                        int i5 = 0;
                        for (Object obj17 : listD0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ0 = kbc.j0((nyg) obj17, ctf0Var7);
                            arrayList113.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ0.f34426a + "_live_" + i5, trmVarJ0));
                            i5 = i6;
                        }
                        lc00VarB5.addAll(arrayList113);
                        ArrayList arrayList114 = new ArrayList(r3d.q(listD1, 10));
                        for (Object obj18 : listD1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            trm trmVarJ1 = kbc.j0((nyg) obj18, ctf0Var7);
                            arrayList114.add(new oxj("HomeSportBannerChampionshipUiModel_" + trmVarJ1.f34426a + "_line_" + i2, trmVarJ1));
                            i2 = i7;
                        }
                        lc00VarB5.addAll(arrayList114);
                        return kotlin.collections.a.a(lc00VarB5);
                    case 8:
                        List list15 = (List) obj12;
                        list15.getClass();
                        ctf0 ctf0Var8 = wyjVar.f39976a;
                        ctf0Var8.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        if (list15.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList115 = new ArrayList();
                        ArrayList arrayList116 = new ArrayList();
                        for (Object obj19 : list15) {
                            if (((xah) obj19).n) {
                                arrayList115.add(obj19);
                            } else {
                                arrayList116.add(obj19);
                            }
                        }
                        if (!arrayList115.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList117 = new ArrayList(r3d.q(arrayList115, 10));
                            Iterator it9 = arrayList115.iterator();
                            while (it9.hasNext()) {
                                arrayList117.add(d5c.X((xah) it9.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList117), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList116.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var8.b;
                            lc00VarB6.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList118 = new ArrayList(r3d.q(arrayList116, 10));
                            Iterator it10 = arrayList116.iterator();
                            while (it10.hasNext()) {
                                arrayList118.add(d5c.X((xah) it10.next(), ctf0Var8));
                            }
                            lc00VarB6.add(new ztj(dyb.r0(arrayList118), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB6);
                    default:
                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                        ctf0 ctf0Var9 = wyjVar.f39976a;
                        zjw zjwVar15 = wyjVar.d;
                        return qbc.I(zBooleanValue, ctf0Var9, zjwVar15.f, zjwVar15.b.c.f7565a.d);
                }
            }
        }, (byte) 20));
    }

    public static String a(sff0 sff0Var, CyberGamesPage cyberGamesPage, boolean z) {
        ech echVar = sff0Var.c;
        if (z) {
            return echVar.k.f37134a;
        }
        if (Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE)) {
            return echVar.l.f4058a;
        }
        return Intrinsics.d(cyberGamesPage, CyberGamesPage.Virtual.INSTANCE) ? echVar.m.f23842a : "";
    }

    public final fee b() {
        return (fee) this.f.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        zjw zjwVar = (zjw) obj;
        zjwVar.getClass();
        fee feeVar = (fee) this.g.getValue();
        Map map = zjwVar.j;
        ekw ekwVar = zjwVar.g;
        CyberGamesPage cyberGamesPage = ekwVar.f7971a;
        feeVar.d(Boolean.valueOf(Intrinsics.d(map.get(cyberGamesPage), Boolean.TRUE)));
        ((fee) this.h.getValue()).d(Boolean.valueOf(zjwVar.k));
        b().d(ekwVar);
        ((fee) this.i.getValue()).d(zjwVar.d);
        zjw zjwVar2 = this.d;
        g5h g5hVar = zjwVar2.b.c.o;
        boolean z = zjwVar2.f;
        zbk zbkVar = ((fee) this.j.getValue()).e;
        jih jihVar = (jih) zjwVar.h.get(cyberGamesPage);
        th90 th90Var = this.e;
        if (jihVar != null) {
            ((pz40) xp20.d(th90Var, cyberGamesPage)).setValue(u1c.w(this.c, ekwVar.f7971a, jihVar, zjwVar.i, false, new kk0(this, jihVar, zjwVar, (byte) 28)));
        }
        return new kkw(g5hVar, z, zbkVar, th90Var);
    }
}
