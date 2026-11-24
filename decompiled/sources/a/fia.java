package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntRange f9577a = new IntRange(1, 3, 1);
    public static final IntRange b = new IntRange(4, 6, 1);

    public static final void a(lc00 lc00Var, kha khaVar, ctf0 ctf0Var, m9s m9sVar) {
        dha dhaVar;
        fha fhaVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        qha qhaVar;
        sha rhaVar;
        ctf0Var.getClass();
        m9sVar.getClass();
        Integer numValueOf = Integer.valueOf(R.drawable.card_back);
        List list = khaVar.h;
        int i = khaVar.f18280a;
        ve90 ve90Var = (ve90) CollectionsKt.firstOrNull(list);
        ve90 ve90Var2 = (ve90) CollectionsKt.W(1, list);
        boolean z = khaVar.d;
        tha thaVar = khaVar.b;
        List list2 = thaVar.b;
        List list3 = thaVar.f33951a;
        tha thaVar2 = khaVar.c;
        List list4 = thaVar2.b;
        boolean z2 = khaVar.e;
        if (z && z2) {
            dhaVar = dha.c;
        } else if (z2) {
            dhaVar = dha.f6082a;
        } else {
            dhaVar = z ? dha.b : dha.d;
        }
        eha ehaVar = new eha(dhaVar);
        fha.c.getClass();
        switch (i) {
            case 1:
                fhaVar = fha.e;
                break;
            case 2:
                fhaVar = fha.f;
                break;
            case 3:
                fhaVar = fha.g;
                break;
            case 4:
                fhaVar = fha.h;
                break;
            case 5:
                fhaVar = fha.i;
                break;
            case 6:
                fhaVar = fha.j;
                break;
            default:
                fhaVar = fha.d;
                break;
        }
        List list5 = thaVar2.f33951a;
        ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
        Iterator it = list4.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                List list6 = list4;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it2 = list2.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    tna0 tna0Var = (tna0) next;
                    Iterator it3 = it2;
                    List list7 = list2;
                    arrayList2.add(new cha(z1x.F(tna0Var), tna0Var.b.f30780a > ((tna0) list5.get(i3)).b.f30780a));
                    i3 = i4;
                    it2 = it3;
                    list2 = list7;
                }
                List list8 = list2;
                gha ghaVar = new gha(new xha(arrayList, arrayList2, fhaVar), ehaVar);
                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Integer.valueOf(z1x.F((tna0) it4.next())));
                }
                boolean zIsEmpty = arrayList3.isEmpty();
                List listJ = arrayList3;
                if (zIsEmpty) {
                    listJ = q3d.j(numValueOf, numValueOf, numValueOf);
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(Integer.valueOf(z1x.F((tna0) it5.next())));
                }
                boolean zIsEmpty2 = arrayList4.isEmpty();
                List listJ2 = arrayList4;
                if (zIsEmpty2) {
                    listJ2 = q3d.j(numValueOf, numValueOf, numValueOf);
                }
                cia ciaVar = new cia(listJ, listJ2, (list3.isEmpty() || list5.isEmpty()) ? false : true, khaVar.i);
                if (ve90Var == null || (str = ve90Var.b) == null) {
                    str = "";
                }
                if (ve90Var == null || (str2 = ve90Var.c) == null) {
                    str2 = "";
                }
                if (ve90Var == null || (str3 = ve90Var.f37273a) == null) {
                    str3 = "";
                }
                String strB = b(str, str2, str3, ctf0Var);
                IntRange intRange = f9577a;
                int i5 = intRange.f46068a;
                int i6 = intRange.b;
                int i7 = R.drawable.cybergame_card_football_period_unselected_bg;
                int i8 = (i5 > i || i > i6) ? R.drawable.cybergame_card_football_period_unselected_bg : R.drawable.cybergame_card_football_period_selected_bg;
                int i9 = R.color.static_black;
                mha mhaVar = new mha(strB, i8, (i5 > i || i > i6) ? R.color.static_black : R.color.static_white);
                if (ve90Var2 == null || (str4 = ve90Var2.b) == null) {
                    str4 = "";
                }
                if (ve90Var2 == null || (str5 = ve90Var2.c) == null) {
                    str5 = "";
                }
                if (ve90Var2 == null || (str6 = ve90Var2.f37273a) == null) {
                    str6 = "";
                }
                String strB2 = b(str4, str5, str6, ctf0Var);
                IntRange intRange2 = b;
                int i10 = intRange2.f46068a;
                int i11 = intRange2.b;
                if (i10 <= i && i <= i11) {
                    i7 = R.drawable.cybergame_card_football_period_selected_bg;
                }
                if (i10 <= i && i <= i11) {
                    i9 = R.color.static_white;
                }
                mha mhaVar2 = new mha(strB2, i7, i9);
                long jG = znq0.g(m9sVar.v);
                long millis = TimeUnit.SECONDS.toMillis(khaVar.f);
                qqs qqsVar = m9sVar.h;
                String str7 = qqsVar.l;
                boolean z3 = m9sVar.r;
                znq0 znq0Var = qqsVar.k;
                Long lValueOf = znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null;
                if (z3) {
                    qhaVar = new qha(ctf0Var.b.a(R.string.news_match_finished, Arrays.copyOf(new Object[0], 0)));
                } else if (jG - (System.currentTimeMillis() / 1000) >= 0) {
                    qhaVar = new qha(ctf0Var.b.a(R.string.bet_before_game_start, Arrays.copyOf(new Object[0], 0)));
                } else {
                    if ((i != 0 && i != 3) || msm0.j(str7)) {
                        if (millis != 0 && list8.isEmpty() && list6.isEmpty()) {
                            rhaVar = new rha(lValueOf, millis);
                        } else {
                            qhaVar = new qha("");
                        }
                        lc00Var.add(new eia(ghaVar, ciaVar, mhaVar, mhaVar2, rhaVar));
                        return;
                    }
                    qhaVar = new qha(str7);
                }
                rhaVar = qhaVar;
                lc00Var.add(new eia(ghaVar, ciaVar, mhaVar, mhaVar2, rhaVar));
                return;
            }
            Object next2 = it.next();
            int i12 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            Iterator it6 = it;
            tna0 tna0Var2 = (tna0) next2;
            List list9 = list4;
            arrayList.add(new cha(z1x.F(tna0Var2), tna0Var2.b.f30780a > ((tna0) list3.get(i2)).b.f30780a));
            list4 = list9;
            i2 = i12;
            it = it6;
        }
    }

    public static final String b(String str, String str2, String str3, ctf0 ctf0Var) {
        return kng0.l(ctf0Var.b.a(R.string.cybergame_synthetic_time_v2, Arrays.copyOf(new Object[]{str3}, 1)), Separators.SP, (str.length() <= 0 || str2.length() <= 0) ? "" : b1j.k(Separators.LPAREN, str, Separators.COLON, str2, Separators.RPAREN));
    }
}
