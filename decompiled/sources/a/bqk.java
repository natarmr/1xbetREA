package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineDetailsParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class bqk implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ksk f3035a;
    public final ctf0 b;
    public final g2v c;
    public final y78 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    public bqk(ksk kskVar, ctf0 ctf0Var, g2v g2vVar, y78 y78Var) {
        btk btkVar;
        btk btkVar2;
        List list;
        List list2;
        List list3;
        List list4;
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        j0g0 j0g0Var3;
        j0g0 j0g0Var4;
        j0g0 j0g0Var5;
        ctf0Var.getClass();
        this.f3035a = kskVar;
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = y78Var;
        final byte b = 0;
        this.e = maz.b(new yw9(null, new Function1(this) { // from class: a.aqk
            public final /* synthetic */ bqk b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                ypl0 ypl0Var2;
                String str2;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                itk itkVar;
                boolean zBooleanValue;
                byte b2 = b;
                int size = 2;
                jtk jtkVar = null;
                int i = 0;
                bqk bqkVar = this.b;
                switch (b2) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        return bool != null ? rt20.a(bqkVar.f3035a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var6 = (j0g0) obj;
                        ksk kskVar2 = bqkVar.f3035a;
                        DisciplineDetailsParams disciplineDetailsParams = kskVar2.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = bqkVar.b;
                        boolean z = kskVar2.f;
                        qt20 qt20Var = (qt20) ((fee) bqkVar.e.getValue()).b();
                        List list5 = zpk.f44763a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        qt20Var.getClass();
                        if (j0g0Var6 != null) {
                            Object obj2 = j0g0Var6.f15681a;
                            jtkVar = (jtk) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        byte b3 = cyberGamesPage.f46556a;
                        boolean z2 = (jtkVar == null || (itkVar = jtkVar.c) == null) ? false : itkVar.f15357a;
                        Object[] objArr = b3 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = zpk.f44763a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && objArr != false) {
                            lc00VarB.add(new lxl(2L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (zContains2 && objArr != false) {
                            lc00VarB.add(new lxl(1L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new lxl(0L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        if (z2) {
                            lc00VarB.add(new lxl(3L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (j == 1 && objArr != false) {
                            lc00VarB.add(new lxl(4L, (dyl) new xxl(lsm0Var.a(R.string.meta_heroes, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str3 = "";
                        if (!z ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str = lel0Var2.d) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, '/'));
                        }
                        String string = sb.toString();
                        int i2 = z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        if (jtkVar != null && (ypl0Var2 = jtkVar.b) != null && (str2 = ypl0Var2.b) != null) {
                            str3 = str2;
                        }
                        return new msk(string, i2, str3, a4xVarO0.isEmpty() ? opk.f25645a : new npk(new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(z).e, 0.0f, 2), null, 22)), qt20Var);
                    case 2:
                        btk btkVar3 = (btk) obj;
                        ksk kskVar3 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage2 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = bqkVar.d;
                            ctf0 ctf0Var3 = bqkVar.b;
                            Boolean bool2 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            lc00 lc00VarA = spk.a(btkVar3, y78Var2, ctf0Var3, cyberGamesPage2, zBooleanValue, kskVar3.g, kskVar3.b, true, kskVar3.e, kskVar3.i);
                            if (lc00VarA != null) {
                                return lc00VarA;
                            }
                        }
                        return iun.f15405a;
                    case 3:
                        btk btkVar4 = (btk) obj;
                        ksk kskVar4 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage3 = kskVar4.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = bqkVar.d;
                            ctf0 ctf0Var4 = bqkVar.b;
                            Boolean bool3 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            lc00 lc00VarA2 = spk.a(btkVar4, y78Var3, ctf0Var4, cyberGamesPage3, zBooleanValue, kskVar4.g, kskVar4.b, false, kskVar4.e, kskVar4.i);
                            if (lc00VarA2 != null) {
                                return lc00VarA2;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        List list6 = (List) obj;
                        list6.getClass();
                        ctf0 ctf0Var5 = bqkVar.b;
                        ctf0Var5.getClass();
                        if (list6.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB2.add(new nuj("HEADER_ACTIVE_TEAMS", new hjm(lsm0Var2.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        List listD0 = CollectionsKt.D0(list6, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new mtj("ACTIVE_TEAMS", new g9m(dyb.o0(arrayList))));
                                return kotlin.collections.a.a(lc00VarB2);
                            }
                            Object next = it.next();
                            i = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bm bmVar = (bm) next;
                            arrayList.add(new y8m(i3, String.valueOf(bmVar.f2815a), new n0x(bmVar.c), bmVar.b, false));
                        }
                        break;
                    case 5:
                        mpk mpkVar = (mpk) obj;
                        mpkVar.getClass();
                        ctf0 ctf0Var6 = bqkVar.b;
                        ctf0Var6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        List list7 = mpkVar.f22184a;
                        List list8 = mpkVar.b;
                        if (list7.isEmpty() && list8.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var6.b;
                        lc00VarB3.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        ArrayList arrayList2 = new ArrayList(r3d.q(list7, 10));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Long.valueOf(((nyg) it2.next()).g));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list8) {
                            if (!arrayList2.contains(Long.valueOf(((nyg) obj3).g))) {
                                arrayList3.add(obj3);
                            }
                        }
                        if (list7.isEmpty()) {
                            size = 0;
                        } else if (list7.size() < 2) {
                            size = list7.size();
                        }
                        int iMin = Math.min(4, Math.min(4 - size, arrayList3.size()));
                        List listD1 = CollectionsKt.D0(list7, Math.max(0, Math.min(list7.size() - size, (4 - iMin) - size)) + size);
                        List listD2 = CollectionsKt.D0(arrayList3, iMin);
                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                        int i4 = 0;
                        for (Object obj4 : listD1) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(new oxj(twn.m(i4, "CHAMPIONSHIPS_LIVE"), wwb.U((nyg) obj4, ctf0Var6)));
                            i4 = i5;
                        }
                        lc00VarB3.addAll(arrayList4);
                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                        for (Object obj5 : listD2) {
                            int i6 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList5.add(new oxj(twn.m(i, "CHAMPIONSHIPS_LINE"), wwb.U((nyg) obj5, ctf0Var6)));
                            i = i6;
                        }
                        lc00VarB3.addAll(arrayList5);
                        return kotlin.collections.a.a(lc00VarB3);
                    default:
                        List list9 = (List) obj;
                        list9.getClass();
                        ctf0 ctf0Var7 = bqkVar.b;
                        ctf0Var7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        if (list9.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : list9) {
                            if (((xah) obj6).n) {
                                arrayList6.add(obj6);
                            } else {
                                arrayList7.add(obj6);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                arrayList8.add(jwb.W((xah) it3.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList8), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList7.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList9 = new ArrayList(r3d.q(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add(jwb.W((xah) it4.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList9), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB4);
                }
            }
        }, (byte) 20));
        final byte b2 = 1;
        this.f = maz.b(new yw9(kskVar.c, new Function1(this) { // from class: a.aqk
            public final /* synthetic */ bqk b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                ypl0 ypl0Var2;
                String str2;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                itk itkVar;
                boolean zBooleanValue;
                byte b3 = b2;
                int size = 2;
                jtk jtkVar = null;
                int i = 0;
                bqk bqkVar = this.b;
                switch (b3) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        return bool != null ? rt20.a(bqkVar.f3035a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var6 = (j0g0) obj;
                        ksk kskVar2 = bqkVar.f3035a;
                        DisciplineDetailsParams disciplineDetailsParams = kskVar2.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = bqkVar.b;
                        boolean z = kskVar2.f;
                        qt20 qt20Var = (qt20) ((fee) bqkVar.e.getValue()).b();
                        List list5 = zpk.f44763a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        qt20Var.getClass();
                        if (j0g0Var6 != null) {
                            Object obj2 = j0g0Var6.f15681a;
                            jtkVar = (jtk) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        byte b4 = cyberGamesPage.f46556a;
                        boolean z2 = (jtkVar == null || (itkVar = jtkVar.c) == null) ? false : itkVar.f15357a;
                        Object[] objArr = b4 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = zpk.f44763a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && objArr != false) {
                            lc00VarB.add(new lxl(2L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (zContains2 && objArr != false) {
                            lc00VarB.add(new lxl(1L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new lxl(0L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        if (z2) {
                            lc00VarB.add(new lxl(3L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (j == 1 && objArr != false) {
                            lc00VarB.add(new lxl(4L, (dyl) new xxl(lsm0Var.a(R.string.meta_heroes, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str3 = "";
                        if (!z ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str = lel0Var2.d) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, '/'));
                        }
                        String string = sb.toString();
                        int i2 = z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        if (jtkVar != null && (ypl0Var2 = jtkVar.b) != null && (str2 = ypl0Var2.b) != null) {
                            str3 = str2;
                        }
                        return new msk(string, i2, str3, a4xVarO0.isEmpty() ? opk.f25645a : new npk(new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(z).e, 0.0f, 2), null, 22)), qt20Var);
                    case 2:
                        btk btkVar3 = (btk) obj;
                        ksk kskVar3 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage2 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = bqkVar.d;
                            ctf0 ctf0Var3 = bqkVar.b;
                            Boolean bool2 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            lc00 lc00VarA = spk.a(btkVar3, y78Var2, ctf0Var3, cyberGamesPage2, zBooleanValue, kskVar3.g, kskVar3.b, true, kskVar3.e, kskVar3.i);
                            if (lc00VarA != null) {
                                return lc00VarA;
                            }
                        }
                        return iun.f15405a;
                    case 3:
                        btk btkVar4 = (btk) obj;
                        ksk kskVar4 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage3 = kskVar4.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = bqkVar.d;
                            ctf0 ctf0Var4 = bqkVar.b;
                            Boolean bool3 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            lc00 lc00VarA2 = spk.a(btkVar4, y78Var3, ctf0Var4, cyberGamesPage3, zBooleanValue, kskVar4.g, kskVar4.b, false, kskVar4.e, kskVar4.i);
                            if (lc00VarA2 != null) {
                                return lc00VarA2;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        List list6 = (List) obj;
                        list6.getClass();
                        ctf0 ctf0Var5 = bqkVar.b;
                        ctf0Var5.getClass();
                        if (list6.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB2.add(new nuj("HEADER_ACTIVE_TEAMS", new hjm(lsm0Var2.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        List listD0 = CollectionsKt.D0(list6, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new mtj("ACTIVE_TEAMS", new g9m(dyb.o0(arrayList))));
                                return kotlin.collections.a.a(lc00VarB2);
                            }
                            Object next = it.next();
                            i = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bm bmVar = (bm) next;
                            arrayList.add(new y8m(i3, String.valueOf(bmVar.f2815a), new n0x(bmVar.c), bmVar.b, false));
                        }
                        break;
                    case 5:
                        mpk mpkVar = (mpk) obj;
                        mpkVar.getClass();
                        ctf0 ctf0Var6 = bqkVar.b;
                        ctf0Var6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        List list7 = mpkVar.f22184a;
                        List list8 = mpkVar.b;
                        if (list7.isEmpty() && list8.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var6.b;
                        lc00VarB3.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        ArrayList arrayList2 = new ArrayList(r3d.q(list7, 10));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Long.valueOf(((nyg) it2.next()).g));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list8) {
                            if (!arrayList2.contains(Long.valueOf(((nyg) obj3).g))) {
                                arrayList3.add(obj3);
                            }
                        }
                        if (list7.isEmpty()) {
                            size = 0;
                        } else if (list7.size() < 2) {
                            size = list7.size();
                        }
                        int iMin = Math.min(4, Math.min(4 - size, arrayList3.size()));
                        List listD1 = CollectionsKt.D0(list7, Math.max(0, Math.min(list7.size() - size, (4 - iMin) - size)) + size);
                        List listD2 = CollectionsKt.D0(arrayList3, iMin);
                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                        int i4 = 0;
                        for (Object obj4 : listD1) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(new oxj(twn.m(i4, "CHAMPIONSHIPS_LIVE"), wwb.U((nyg) obj4, ctf0Var6)));
                            i4 = i5;
                        }
                        lc00VarB3.addAll(arrayList4);
                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                        for (Object obj5 : listD2) {
                            int i6 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList5.add(new oxj(twn.m(i, "CHAMPIONSHIPS_LINE"), wwb.U((nyg) obj5, ctf0Var6)));
                            i = i6;
                        }
                        lc00VarB3.addAll(arrayList5);
                        return kotlin.collections.a.a(lc00VarB3);
                    default:
                        List list9 = (List) obj;
                        list9.getClass();
                        ctf0 ctf0Var7 = bqkVar.b;
                        ctf0Var7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        if (list9.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : list9) {
                            if (((xah) obj6).n) {
                                arrayList6.add(obj6);
                            } else {
                                arrayList7.add(obj6);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                arrayList8.add(jwb.W((xah) it3.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList8), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList7.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList9 = new ArrayList(r3d.q(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add(jwb.W((xah) it4.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList9), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB4);
                }
            }
        }, (byte) 20));
        j0g0 j0g0Var6 = kskVar.d;
        if (j0g0Var6 != null) {
            Object obj = j0g0Var6.f15681a;
            kuk kukVar = (kuk) (obj instanceof g0g0 ? null : obj);
            if (kukVar == null || (j0g0Var5 = kukVar.c) == null) {
                btkVar = null;
            } else {
                Object obj2 = j0g0Var5.f15681a;
                btkVar = (btk) (obj2 instanceof g0g0 ? new btk(iun.f15405a, "") : obj2);
            }
        } else {
            btkVar = null;
        }
        final byte b3 = 2;
        this.g = maz.b(new yw9(btkVar, new Function1(this) { // from class: a.aqk
            public final /* synthetic */ bqk b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                ypl0 ypl0Var2;
                String str2;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                itk itkVar;
                boolean zBooleanValue;
                byte b4 = b3;
                int size = 2;
                jtk jtkVar = null;
                int i = 0;
                bqk bqkVar = this.b;
                switch (b4) {
                    case 0:
                        Boolean bool = (Boolean) obj3;
                        return bool != null ? rt20.a(bqkVar.f3035a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var7 = (j0g0) obj3;
                        ksk kskVar2 = bqkVar.f3035a;
                        DisciplineDetailsParams disciplineDetailsParams = kskVar2.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = bqkVar.b;
                        boolean z = kskVar2.f;
                        qt20 qt20Var = (qt20) ((fee) bqkVar.e.getValue()).b();
                        List list5 = zpk.f44763a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        qt20Var.getClass();
                        if (j0g0Var7 != null) {
                            Object obj4 = j0g0Var7.f15681a;
                            jtkVar = (jtk) (obj4 instanceof g0g0 ? null : obj4);
                        }
                        byte b5 = cyberGamesPage.f46556a;
                        boolean z2 = (jtkVar == null || (itkVar = jtkVar.c) == null) ? false : itkVar.f15357a;
                        Object[] objArr = b5 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = zpk.f44763a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && objArr != false) {
                            lc00VarB.add(new lxl(2L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (zContains2 && objArr != false) {
                            lc00VarB.add(new lxl(1L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new lxl(0L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        if (z2) {
                            lc00VarB.add(new lxl(3L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (j == 1 && objArr != false) {
                            lc00VarB.add(new lxl(4L, (dyl) new xxl(lsm0Var.a(R.string.meta_heroes, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str3 = "";
                        if (!z ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str = lel0Var2.d) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, '/'));
                        }
                        String string = sb.toString();
                        int i2 = z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        if (jtkVar != null && (ypl0Var2 = jtkVar.b) != null && (str2 = ypl0Var2.b) != null) {
                            str3 = str2;
                        }
                        return new msk(string, i2, str3, a4xVarO0.isEmpty() ? opk.f25645a : new npk(new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(z).e, 0.0f, 2), null, 22)), qt20Var);
                    case 2:
                        btk btkVar3 = (btk) obj3;
                        ksk kskVar3 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage2 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = bqkVar.d;
                            ctf0 ctf0Var3 = bqkVar.b;
                            Boolean bool2 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            lc00 lc00VarA = spk.a(btkVar3, y78Var2, ctf0Var3, cyberGamesPage2, zBooleanValue, kskVar3.g, kskVar3.b, true, kskVar3.e, kskVar3.i);
                            if (lc00VarA != null) {
                                return lc00VarA;
                            }
                        }
                        return iun.f15405a;
                    case 3:
                        btk btkVar4 = (btk) obj3;
                        ksk kskVar4 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage3 = kskVar4.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = bqkVar.d;
                            ctf0 ctf0Var4 = bqkVar.b;
                            Boolean bool3 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            lc00 lc00VarA2 = spk.a(btkVar4, y78Var3, ctf0Var4, cyberGamesPage3, zBooleanValue, kskVar4.g, kskVar4.b, false, kskVar4.e, kskVar4.i);
                            if (lc00VarA2 != null) {
                                return lc00VarA2;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        List list6 = (List) obj3;
                        list6.getClass();
                        ctf0 ctf0Var5 = bqkVar.b;
                        ctf0Var5.getClass();
                        if (list6.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB2.add(new nuj("HEADER_ACTIVE_TEAMS", new hjm(lsm0Var2.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        List listD0 = CollectionsKt.D0(list6, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new mtj("ACTIVE_TEAMS", new g9m(dyb.o0(arrayList))));
                                return kotlin.collections.a.a(lc00VarB2);
                            }
                            Object next = it.next();
                            i = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bm bmVar = (bm) next;
                            arrayList.add(new y8m(i3, String.valueOf(bmVar.f2815a), new n0x(bmVar.c), bmVar.b, false));
                        }
                        break;
                    case 5:
                        mpk mpkVar = (mpk) obj3;
                        mpkVar.getClass();
                        ctf0 ctf0Var6 = bqkVar.b;
                        ctf0Var6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        List list7 = mpkVar.f22184a;
                        List list8 = mpkVar.b;
                        if (list7.isEmpty() && list8.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var6.b;
                        lc00VarB3.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        ArrayList arrayList2 = new ArrayList(r3d.q(list7, 10));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Long.valueOf(((nyg) it2.next()).g));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list8) {
                            if (!arrayList2.contains(Long.valueOf(((nyg) obj5).g))) {
                                arrayList3.add(obj5);
                            }
                        }
                        if (list7.isEmpty()) {
                            size = 0;
                        } else if (list7.size() < 2) {
                            size = list7.size();
                        }
                        int iMin = Math.min(4, Math.min(4 - size, arrayList3.size()));
                        List listD1 = CollectionsKt.D0(list7, Math.max(0, Math.min(list7.size() - size, (4 - iMin) - size)) + size);
                        List listD2 = CollectionsKt.D0(arrayList3, iMin);
                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                        int i4 = 0;
                        for (Object obj6 : listD1) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(new oxj(twn.m(i4, "CHAMPIONSHIPS_LIVE"), wwb.U((nyg) obj6, ctf0Var6)));
                            i4 = i5;
                        }
                        lc00VarB3.addAll(arrayList4);
                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                        for (Object obj7 : listD2) {
                            int i6 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList5.add(new oxj(twn.m(i, "CHAMPIONSHIPS_LINE"), wwb.U((nyg) obj7, ctf0Var6)));
                            i = i6;
                        }
                        lc00VarB3.addAll(arrayList5);
                        return kotlin.collections.a.a(lc00VarB3);
                    default:
                        List list9 = (List) obj3;
                        list9.getClass();
                        ctf0 ctf0Var7 = bqkVar.b;
                        ctf0Var7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        if (list9.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj8 : list9) {
                            if (((xah) obj8).n) {
                                arrayList6.add(obj8);
                            } else {
                                arrayList7.add(obj8);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                arrayList8.add(jwb.W((xah) it3.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList8), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList7.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList9 = new ArrayList(r3d.q(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add(jwb.W((xah) it4.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList9), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB4);
                }
            }
        }, (byte) 20));
        if (j0g0Var6 != null) {
            Object obj3 = j0g0Var6.f15681a;
            kuk kukVar2 = (kuk) (obj3 instanceof g0g0 ? null : obj3);
            if (kukVar2 == null || (j0g0Var4 = kukVar2.d) == null) {
                btkVar2 = null;
            } else {
                Object obj4 = j0g0Var4.f15681a;
                btkVar2 = (btk) (obj4 instanceof g0g0 ? new btk(iun.f15405a, "") : obj4);
            }
        } else {
            btkVar2 = null;
        }
        final byte b4 = 3;
        this.h = maz.b(new yw9(btkVar2, new Function1(this) { // from class: a.aqk
            public final /* synthetic */ bqk b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj5) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                ypl0 ypl0Var2;
                String str2;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                itk itkVar;
                boolean zBooleanValue;
                byte b5 = b4;
                int size = 2;
                jtk jtkVar = null;
                int i = 0;
                bqk bqkVar = this.b;
                switch (b5) {
                    case 0:
                        Boolean bool = (Boolean) obj5;
                        return bool != null ? rt20.a(bqkVar.f3035a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var7 = (j0g0) obj5;
                        ksk kskVar2 = bqkVar.f3035a;
                        DisciplineDetailsParams disciplineDetailsParams = kskVar2.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = bqkVar.b;
                        boolean z = kskVar2.f;
                        qt20 qt20Var = (qt20) ((fee) bqkVar.e.getValue()).b();
                        List list5 = zpk.f44763a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        qt20Var.getClass();
                        if (j0g0Var7 != null) {
                            Object obj6 = j0g0Var7.f15681a;
                            jtkVar = (jtk) (obj6 instanceof g0g0 ? null : obj6);
                        }
                        byte b6 = cyberGamesPage.f46556a;
                        boolean z2 = (jtkVar == null || (itkVar = jtkVar.c) == null) ? false : itkVar.f15357a;
                        Object[] objArr = b6 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = zpk.f44763a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && objArr != false) {
                            lc00VarB.add(new lxl(2L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (zContains2 && objArr != false) {
                            lc00VarB.add(new lxl(1L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new lxl(0L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        if (z2) {
                            lc00VarB.add(new lxl(3L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (j == 1 && objArr != false) {
                            lc00VarB.add(new lxl(4L, (dyl) new xxl(lsm0Var.a(R.string.meta_heroes, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str3 = "";
                        if (!z ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str = lel0Var2.d) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, '/'));
                        }
                        String string = sb.toString();
                        int i2 = z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        if (jtkVar != null && (ypl0Var2 = jtkVar.b) != null && (str2 = ypl0Var2.b) != null) {
                            str3 = str2;
                        }
                        return new msk(string, i2, str3, a4xVarO0.isEmpty() ? opk.f25645a : new npk(new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(z).e, 0.0f, 2), null, 22)), qt20Var);
                    case 2:
                        btk btkVar3 = (btk) obj5;
                        ksk kskVar3 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage2 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = bqkVar.d;
                            ctf0 ctf0Var3 = bqkVar.b;
                            Boolean bool2 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            lc00 lc00VarA = spk.a(btkVar3, y78Var2, ctf0Var3, cyberGamesPage2, zBooleanValue, kskVar3.g, kskVar3.b, true, kskVar3.e, kskVar3.i);
                            if (lc00VarA != null) {
                                return lc00VarA;
                            }
                        }
                        return iun.f15405a;
                    case 3:
                        btk btkVar4 = (btk) obj5;
                        ksk kskVar4 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage3 = kskVar4.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = bqkVar.d;
                            ctf0 ctf0Var4 = bqkVar.b;
                            Boolean bool3 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            lc00 lc00VarA2 = spk.a(btkVar4, y78Var3, ctf0Var4, cyberGamesPage3, zBooleanValue, kskVar4.g, kskVar4.b, false, kskVar4.e, kskVar4.i);
                            if (lc00VarA2 != null) {
                                return lc00VarA2;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        List list6 = (List) obj5;
                        list6.getClass();
                        ctf0 ctf0Var5 = bqkVar.b;
                        ctf0Var5.getClass();
                        if (list6.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB2.add(new nuj("HEADER_ACTIVE_TEAMS", new hjm(lsm0Var2.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        List listD0 = CollectionsKt.D0(list6, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new mtj("ACTIVE_TEAMS", new g9m(dyb.o0(arrayList))));
                                return kotlin.collections.a.a(lc00VarB2);
                            }
                            Object next = it.next();
                            i = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bm bmVar = (bm) next;
                            arrayList.add(new y8m(i3, String.valueOf(bmVar.f2815a), new n0x(bmVar.c), bmVar.b, false));
                        }
                        break;
                    case 5:
                        mpk mpkVar = (mpk) obj5;
                        mpkVar.getClass();
                        ctf0 ctf0Var6 = bqkVar.b;
                        ctf0Var6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        List list7 = mpkVar.f22184a;
                        List list8 = mpkVar.b;
                        if (list7.isEmpty() && list8.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var6.b;
                        lc00VarB3.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        ArrayList arrayList2 = new ArrayList(r3d.q(list7, 10));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Long.valueOf(((nyg) it2.next()).g));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj7 : list8) {
                            if (!arrayList2.contains(Long.valueOf(((nyg) obj7).g))) {
                                arrayList3.add(obj7);
                            }
                        }
                        if (list7.isEmpty()) {
                            size = 0;
                        } else if (list7.size() < 2) {
                            size = list7.size();
                        }
                        int iMin = Math.min(4, Math.min(4 - size, arrayList3.size()));
                        List listD1 = CollectionsKt.D0(list7, Math.max(0, Math.min(list7.size() - size, (4 - iMin) - size)) + size);
                        List listD2 = CollectionsKt.D0(arrayList3, iMin);
                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                        int i4 = 0;
                        for (Object obj8 : listD1) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(new oxj(twn.m(i4, "CHAMPIONSHIPS_LIVE"), wwb.U((nyg) obj8, ctf0Var6)));
                            i4 = i5;
                        }
                        lc00VarB3.addAll(arrayList4);
                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                        for (Object obj9 : listD2) {
                            int i6 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList5.add(new oxj(twn.m(i, "CHAMPIONSHIPS_LINE"), wwb.U((nyg) obj9, ctf0Var6)));
                            i = i6;
                        }
                        lc00VarB3.addAll(arrayList5);
                        return kotlin.collections.a.a(lc00VarB3);
                    default:
                        List list9 = (List) obj5;
                        list9.getClass();
                        ctf0 ctf0Var7 = bqkVar.b;
                        ctf0Var7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        if (list9.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj10 : list9) {
                            if (((xah) obj10).n) {
                                arrayList6.add(obj10);
                            } else {
                                arrayList7.add(obj10);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                arrayList8.add(jwb.W((xah) it3.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList8), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList7.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList9 = new ArrayList(r3d.q(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add(jwb.W((xah) it4.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList9), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB4);
                }
            }
        }, (byte) 20));
        if (j0g0Var6 != null) {
            Object obj5 = j0g0Var6.f15681a;
            kuk kukVar3 = (kuk) (obj5 instanceof g0g0 ? null : obj5);
            if (kukVar3 == null || (j0g0Var3 = kukVar3.g) == null) {
                list = iun.f15405a;
                list2 = list;
            } else {
                Object obj6 = j0g0Var3.f15681a;
                list = iun.f15405a;
                list2 = (List) (obj6 instanceof g0g0 ? list : obj6);
                if (list2 == null) {
                    list = iun.f15405a;
                    list2 = list;
                }
            }
        } else {
            list = iun.f15405a;
            list2 = list;
        }
        final byte b5 = 4;
        this.i = maz.b(new yw9(list2, new Function1(this) { // from class: a.aqk
            public final /* synthetic */ bqk b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj7) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                ypl0 ypl0Var2;
                String str2;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                itk itkVar;
                boolean zBooleanValue;
                byte b6 = b5;
                int size = 2;
                jtk jtkVar = null;
                int i = 0;
                bqk bqkVar = this.b;
                switch (b6) {
                    case 0:
                        Boolean bool = (Boolean) obj7;
                        return bool != null ? rt20.a(bqkVar.f3035a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var7 = (j0g0) obj7;
                        ksk kskVar2 = bqkVar.f3035a;
                        DisciplineDetailsParams disciplineDetailsParams = kskVar2.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = bqkVar.b;
                        boolean z = kskVar2.f;
                        qt20 qt20Var = (qt20) ((fee) bqkVar.e.getValue()).b();
                        List list5 = zpk.f44763a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        qt20Var.getClass();
                        if (j0g0Var7 != null) {
                            Object obj8 = j0g0Var7.f15681a;
                            jtkVar = (jtk) (obj8 instanceof g0g0 ? null : obj8);
                        }
                        byte b7 = cyberGamesPage.f46556a;
                        boolean z2 = (jtkVar == null || (itkVar = jtkVar.c) == null) ? false : itkVar.f15357a;
                        Object[] objArr = b7 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = zpk.f44763a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && objArr != false) {
                            lc00VarB.add(new lxl(2L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (zContains2 && objArr != false) {
                            lc00VarB.add(new lxl(1L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new lxl(0L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        if (z2) {
                            lc00VarB.add(new lxl(3L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (j == 1 && objArr != false) {
                            lc00VarB.add(new lxl(4L, (dyl) new xxl(lsm0Var.a(R.string.meta_heroes, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str3 = "";
                        if (!z ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str = lel0Var2.d) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, '/'));
                        }
                        String string = sb.toString();
                        int i2 = z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        if (jtkVar != null && (ypl0Var2 = jtkVar.b) != null && (str2 = ypl0Var2.b) != null) {
                            str3 = str2;
                        }
                        return new msk(string, i2, str3, a4xVarO0.isEmpty() ? opk.f25645a : new npk(new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(z).e, 0.0f, 2), null, 22)), qt20Var);
                    case 2:
                        btk btkVar3 = (btk) obj7;
                        ksk kskVar3 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage2 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = bqkVar.d;
                            ctf0 ctf0Var3 = bqkVar.b;
                            Boolean bool2 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            lc00 lc00VarA = spk.a(btkVar3, y78Var2, ctf0Var3, cyberGamesPage2, zBooleanValue, kskVar3.g, kskVar3.b, true, kskVar3.e, kskVar3.i);
                            if (lc00VarA != null) {
                                return lc00VarA;
                            }
                        }
                        return iun.f15405a;
                    case 3:
                        btk btkVar4 = (btk) obj7;
                        ksk kskVar4 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage3 = kskVar4.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = bqkVar.d;
                            ctf0 ctf0Var4 = bqkVar.b;
                            Boolean bool3 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            lc00 lc00VarA2 = spk.a(btkVar4, y78Var3, ctf0Var4, cyberGamesPage3, zBooleanValue, kskVar4.g, kskVar4.b, false, kskVar4.e, kskVar4.i);
                            if (lc00VarA2 != null) {
                                return lc00VarA2;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        List list6 = (List) obj7;
                        list6.getClass();
                        ctf0 ctf0Var5 = bqkVar.b;
                        ctf0Var5.getClass();
                        if (list6.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB2.add(new nuj("HEADER_ACTIVE_TEAMS", new hjm(lsm0Var2.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        List listD0 = CollectionsKt.D0(list6, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new mtj("ACTIVE_TEAMS", new g9m(dyb.o0(arrayList))));
                                return kotlin.collections.a.a(lc00VarB2);
                            }
                            Object next = it.next();
                            i = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bm bmVar = (bm) next;
                            arrayList.add(new y8m(i3, String.valueOf(bmVar.f2815a), new n0x(bmVar.c), bmVar.b, false));
                        }
                        break;
                    case 5:
                        mpk mpkVar = (mpk) obj7;
                        mpkVar.getClass();
                        ctf0 ctf0Var6 = bqkVar.b;
                        ctf0Var6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        List list7 = mpkVar.f22184a;
                        List list8 = mpkVar.b;
                        if (list7.isEmpty() && list8.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var6.b;
                        lc00VarB3.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        ArrayList arrayList2 = new ArrayList(r3d.q(list7, 10));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Long.valueOf(((nyg) it2.next()).g));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj9 : list8) {
                            if (!arrayList2.contains(Long.valueOf(((nyg) obj9).g))) {
                                arrayList3.add(obj9);
                            }
                        }
                        if (list7.isEmpty()) {
                            size = 0;
                        } else if (list7.size() < 2) {
                            size = list7.size();
                        }
                        int iMin = Math.min(4, Math.min(4 - size, arrayList3.size()));
                        List listD1 = CollectionsKt.D0(list7, Math.max(0, Math.min(list7.size() - size, (4 - iMin) - size)) + size);
                        List listD2 = CollectionsKt.D0(arrayList3, iMin);
                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                        int i4 = 0;
                        for (Object obj10 : listD1) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(new oxj(twn.m(i4, "CHAMPIONSHIPS_LIVE"), wwb.U((nyg) obj10, ctf0Var6)));
                            i4 = i5;
                        }
                        lc00VarB3.addAll(arrayList4);
                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                        for (Object obj11 : listD2) {
                            int i6 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList5.add(new oxj(twn.m(i, "CHAMPIONSHIPS_LINE"), wwb.U((nyg) obj11, ctf0Var6)));
                            i = i6;
                        }
                        lc00VarB3.addAll(arrayList5);
                        return kotlin.collections.a.a(lc00VarB3);
                    default:
                        List list9 = (List) obj7;
                        list9.getClass();
                        ctf0 ctf0Var7 = bqkVar.b;
                        ctf0Var7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        if (list9.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj12 : list9) {
                            if (((xah) obj12).n) {
                                arrayList6.add(obj12);
                            } else {
                                arrayList7.add(obj12);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                arrayList8.add(jwb.W((xah) it3.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList8), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList7.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList9 = new ArrayList(r3d.q(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add(jwb.W((xah) it4.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList9), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB4);
                }
            }
        }, (byte) 20));
        if (j0g0Var6 != null) {
            Object obj7 = j0g0Var6.f15681a;
            kuk kukVar4 = (kuk) (obj7 instanceof g0g0 ? null : obj7);
            if (kukVar4 != null && (j0g0Var2 = kukVar4.f18914a) != null) {
                Object obj8 = j0g0Var2.f15681a;
                list3 = (List) (obj8 instanceof g0g0 ? null : obj8);
                list3 = list3 == null ? list : list3;
            }
        }
        if (j0g0Var6 != null) {
            Object obj9 = j0g0Var6.f15681a;
            kuk kukVar5 = (kuk) (obj9 instanceof g0g0 ? null : obj9);
            if (kukVar5 != null && (j0g0Var = kukVar5.b) != null) {
                Object obj10 = j0g0Var.f15681a;
                list4 = (List) (obj10 instanceof g0g0 ? null : obj10);
                list4 = list4 == null ? list : list4;
            }
        }
        mpk mpkVar = new mpk(list3, list4);
        final byte b6 = 5;
        this.j = maz.b(new yw9(mpkVar, new Function1(this) { // from class: a.aqk
            public final /* synthetic */ bqk b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj11) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                ypl0 ypl0Var2;
                String str2;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                itk itkVar;
                boolean zBooleanValue;
                byte b7 = b6;
                int size = 2;
                jtk jtkVar = null;
                int i = 0;
                bqk bqkVar = this.b;
                switch (b7) {
                    case 0:
                        Boolean bool = (Boolean) obj11;
                        return bool != null ? rt20.a(bqkVar.f3035a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var7 = (j0g0) obj11;
                        ksk kskVar2 = bqkVar.f3035a;
                        DisciplineDetailsParams disciplineDetailsParams = kskVar2.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = bqkVar.b;
                        boolean z = kskVar2.f;
                        qt20 qt20Var = (qt20) ((fee) bqkVar.e.getValue()).b();
                        List list5 = zpk.f44763a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        qt20Var.getClass();
                        if (j0g0Var7 != null) {
                            Object obj12 = j0g0Var7.f15681a;
                            jtkVar = (jtk) (obj12 instanceof g0g0 ? null : obj12);
                        }
                        byte b8 = cyberGamesPage.f46556a;
                        boolean z2 = (jtkVar == null || (itkVar = jtkVar.c) == null) ? false : itkVar.f15357a;
                        Object[] objArr = b8 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = zpk.f44763a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && objArr != false) {
                            lc00VarB.add(new lxl(2L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (zContains2 && objArr != false) {
                            lc00VarB.add(new lxl(1L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new lxl(0L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        if (z2) {
                            lc00VarB.add(new lxl(3L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (j == 1 && objArr != false) {
                            lc00VarB.add(new lxl(4L, (dyl) new xxl(lsm0Var.a(R.string.meta_heroes, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str3 = "";
                        if (!z ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str = lel0Var2.d) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, '/'));
                        }
                        String string = sb.toString();
                        int i2 = z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        if (jtkVar != null && (ypl0Var2 = jtkVar.b) != null && (str2 = ypl0Var2.b) != null) {
                            str3 = str2;
                        }
                        return new msk(string, i2, str3, a4xVarO0.isEmpty() ? opk.f25645a : new npk(new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(z).e, 0.0f, 2), null, 22)), qt20Var);
                    case 2:
                        btk btkVar3 = (btk) obj11;
                        ksk kskVar3 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage2 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = bqkVar.d;
                            ctf0 ctf0Var3 = bqkVar.b;
                            Boolean bool2 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            lc00 lc00VarA = spk.a(btkVar3, y78Var2, ctf0Var3, cyberGamesPage2, zBooleanValue, kskVar3.g, kskVar3.b, true, kskVar3.e, kskVar3.i);
                            if (lc00VarA != null) {
                                return lc00VarA;
                            }
                        }
                        return iun.f15405a;
                    case 3:
                        btk btkVar4 = (btk) obj11;
                        ksk kskVar4 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage3 = kskVar4.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = bqkVar.d;
                            ctf0 ctf0Var4 = bqkVar.b;
                            Boolean bool3 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            lc00 lc00VarA2 = spk.a(btkVar4, y78Var3, ctf0Var4, cyberGamesPage3, zBooleanValue, kskVar4.g, kskVar4.b, false, kskVar4.e, kskVar4.i);
                            if (lc00VarA2 != null) {
                                return lc00VarA2;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        List list6 = (List) obj11;
                        list6.getClass();
                        ctf0 ctf0Var5 = bqkVar.b;
                        ctf0Var5.getClass();
                        if (list6.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB2.add(new nuj("HEADER_ACTIVE_TEAMS", new hjm(lsm0Var2.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        List listD0 = CollectionsKt.D0(list6, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new mtj("ACTIVE_TEAMS", new g9m(dyb.o0(arrayList))));
                                return kotlin.collections.a.a(lc00VarB2);
                            }
                            Object next = it.next();
                            i = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bm bmVar = (bm) next;
                            arrayList.add(new y8m(i3, String.valueOf(bmVar.f2815a), new n0x(bmVar.c), bmVar.b, false));
                        }
                        break;
                    case 5:
                        mpk mpkVar2 = (mpk) obj11;
                        mpkVar2.getClass();
                        ctf0 ctf0Var6 = bqkVar.b;
                        ctf0Var6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        List list7 = mpkVar2.f22184a;
                        List list8 = mpkVar2.b;
                        if (list7.isEmpty() && list8.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var6.b;
                        lc00VarB3.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        ArrayList arrayList2 = new ArrayList(r3d.q(list7, 10));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Long.valueOf(((nyg) it2.next()).g));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj13 : list8) {
                            if (!arrayList2.contains(Long.valueOf(((nyg) obj13).g))) {
                                arrayList3.add(obj13);
                            }
                        }
                        if (list7.isEmpty()) {
                            size = 0;
                        } else if (list7.size() < 2) {
                            size = list7.size();
                        }
                        int iMin = Math.min(4, Math.min(4 - size, arrayList3.size()));
                        List listD1 = CollectionsKt.D0(list7, Math.max(0, Math.min(list7.size() - size, (4 - iMin) - size)) + size);
                        List listD2 = CollectionsKt.D0(arrayList3, iMin);
                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                        int i4 = 0;
                        for (Object obj14 : listD1) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(new oxj(twn.m(i4, "CHAMPIONSHIPS_LIVE"), wwb.U((nyg) obj14, ctf0Var6)));
                            i4 = i5;
                        }
                        lc00VarB3.addAll(arrayList4);
                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                        for (Object obj15 : listD2) {
                            int i6 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList5.add(new oxj(twn.m(i, "CHAMPIONSHIPS_LINE"), wwb.U((nyg) obj15, ctf0Var6)));
                            i = i6;
                        }
                        lc00VarB3.addAll(arrayList5);
                        return kotlin.collections.a.a(lc00VarB3);
                    default:
                        List list9 = (List) obj11;
                        list9.getClass();
                        ctf0 ctf0Var7 = bqkVar.b;
                        ctf0Var7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        if (list9.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj16 : list9) {
                            if (((xah) obj16).n) {
                                arrayList6.add(obj16);
                            } else {
                                arrayList7.add(obj16);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                arrayList8.add(jwb.W((xah) it3.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList8), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList7.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList9 = new ArrayList(r3d.q(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add(jwb.W((xah) it4.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList9), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB4);
                }
            }
        }, (byte) 20));
        if (j0g0Var6 != null) {
            Object obj11 = j0g0Var6.f15681a;
            kuk kukVar6 = (kuk) (obj11 instanceof g0g0 ? null : obj11);
            if (kukVar6 != null) {
                Object obj12 = kukVar6.j;
                List list5 = (List) (obj12 instanceof g0g0 ? null : obj12);
                if (list5 != null) {
                    list = list5;
                }
            }
        }
        final byte b7 = 6;
        this.k = maz.b(new yw9(list, new Function1(this) { // from class: a.aqk
            public final /* synthetic */ bqk b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj13) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                ypl0 ypl0Var2;
                String str2;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                itk itkVar;
                boolean zBooleanValue;
                byte b8 = b7;
                int size = 2;
                jtk jtkVar = null;
                int i = 0;
                bqk bqkVar = this.b;
                switch (b8) {
                    case 0:
                        Boolean bool = (Boolean) obj13;
                        return bool != null ? rt20.a(bqkVar.f3035a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var7 = (j0g0) obj13;
                        ksk kskVar2 = bqkVar.f3035a;
                        DisciplineDetailsParams disciplineDetailsParams = kskVar2.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = bqkVar.b;
                        boolean z = kskVar2.f;
                        qt20 qt20Var = (qt20) ((fee) bqkVar.e.getValue()).b();
                        List list6 = zpk.f44763a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        qt20Var.getClass();
                        if (j0g0Var7 != null) {
                            Object obj14 = j0g0Var7.f15681a;
                            jtkVar = (jtk) (obj14 instanceof g0g0 ? null : obj14);
                        }
                        byte b9 = cyberGamesPage.f46556a;
                        boolean z2 = (jtkVar == null || (itkVar = jtkVar.c) == null) ? false : itkVar.f15357a;
                        Object[] objArr = b9 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = zpk.f44763a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && objArr != false) {
                            lc00VarB.add(new lxl(2L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (zContains2 && objArr != false) {
                            lc00VarB.add(new lxl(1L, (dyl) new xxl(ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new lxl(0L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        if (z2) {
                            lc00VarB.add(new lxl(3L, (dyl) new xxl(lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        if (j == 1 && objArr != false) {
                            lc00VarB.add(new lxl(4L, (dyl) new xxl(lsm0Var.a(R.string.meta_heroes, Arrays.copyOf(new Object[0], 0))), false, (uxl) null, (cwl) null, 124));
                        }
                        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str3 = "";
                        if (!z ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str = lel0Var2.d) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, '/'));
                        }
                        String string = sb.toString();
                        int i2 = z ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        if (jtkVar != null && (ypl0Var2 = jtkVar.b) != null && (str2 = ypl0Var2.b) != null) {
                            str3 = str2;
                        }
                        return new msk(string, i2, str3, a4xVarO0.isEmpty() ? opk.f25645a : new npk(new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(z).e, 0.0f, 2), null, 22)), qt20Var);
                    case 2:
                        btk btkVar3 = (btk) obj13;
                        ksk kskVar3 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage2 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = bqkVar.d;
                            ctf0 ctf0Var3 = bqkVar.b;
                            Boolean bool2 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            lc00 lc00VarA = spk.a(btkVar3, y78Var2, ctf0Var3, cyberGamesPage2, zBooleanValue, kskVar3.g, kskVar3.b, true, kskVar3.e, kskVar3.i);
                            if (lc00VarA != null) {
                                return lc00VarA;
                            }
                        }
                        return iun.f15405a;
                    case 3:
                        btk btkVar4 = (btk) obj13;
                        ksk kskVar4 = bqkVar.f3035a;
                        CyberGamesPage cyberGamesPage3 = kskVar4.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = bqkVar.d;
                            ctf0 ctf0Var4 = bqkVar.b;
                            Boolean bool3 = (Boolean) ((fee) bqkVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            lc00 lc00VarA2 = spk.a(btkVar4, y78Var3, ctf0Var4, cyberGamesPage3, zBooleanValue, kskVar4.g, kskVar4.b, false, kskVar4.e, kskVar4.i);
                            if (lc00VarA2 != null) {
                                return lc00VarA2;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        List list7 = (List) obj13;
                        list7.getClass();
                        ctf0 ctf0Var5 = bqkVar.b;
                        ctf0Var5.getClass();
                        if (list7.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        lsm0 lsm0Var2 = ctf0Var5.b;
                        lc00VarB2.add(new nuj("HEADER_ACTIVE_TEAMS", new hjm(lsm0Var2.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        List listD0 = CollectionsKt.D0(list7, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new mtj("ACTIVE_TEAMS", new g9m(dyb.o0(arrayList))));
                                return kotlin.collections.a.a(lc00VarB2);
                            }
                            Object next = it.next();
                            i = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bm bmVar = (bm) next;
                            arrayList.add(new y8m(i3, String.valueOf(bmVar.f2815a), new n0x(bmVar.c), bmVar.b, false));
                        }
                        break;
                    case 5:
                        mpk mpkVar2 = (mpk) obj13;
                        mpkVar2.getClass();
                        ctf0 ctf0Var6 = bqkVar.b;
                        ctf0Var6.getClass();
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        List list8 = mpkVar2.f22184a;
                        List list9 = mpkVar2.b;
                        if (list8.isEmpty() && list9.isEmpty()) {
                            return iun.f15405a;
                        }
                        lsm0 lsm0Var3 = ctf0Var6.b;
                        lc00VarB3.add(new nuj("HEADER_CHAMPIONSHIPS", new hjm(lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                        ArrayList arrayList2 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Long.valueOf(((nyg) it2.next()).g));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj15 : list9) {
                            if (!arrayList2.contains(Long.valueOf(((nyg) obj15).g))) {
                                arrayList3.add(obj15);
                            }
                        }
                        if (list8.isEmpty()) {
                            size = 0;
                        } else if (list8.size() < 2) {
                            size = list8.size();
                        }
                        int iMin = Math.min(4, Math.min(4 - size, arrayList3.size()));
                        List listD1 = CollectionsKt.D0(list8, Math.max(0, Math.min(list8.size() - size, (4 - iMin) - size)) + size);
                        List listD2 = CollectionsKt.D0(arrayList3, iMin);
                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                        int i4 = 0;
                        for (Object obj16 : listD1) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(new oxj(twn.m(i4, "CHAMPIONSHIPS_LIVE"), wwb.U((nyg) obj16, ctf0Var6)));
                            i4 = i5;
                        }
                        lc00VarB3.addAll(arrayList4);
                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                        for (Object obj17 : listD2) {
                            int i6 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList5.add(new oxj(twn.m(i, "CHAMPIONSHIPS_LINE"), wwb.U((nyg) obj17, ctf0Var6)));
                            i = i6;
                        }
                        lc00VarB3.addAll(arrayList5);
                        return kotlin.collections.a.a(lc00VarB3);
                    default:
                        List list10 = (List) obj13;
                        list10.getClass();
                        ctf0 ctf0Var7 = bqkVar.b;
                        ctf0Var7.getClass();
                        lc00 lc00VarB4 = kotlin.collections.a.b();
                        if (list10.isEmpty()) {
                            return iun.f15405a;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj18 : list10) {
                            if (((xah) obj18).n) {
                                arrayList6.add(obj18);
                            } else {
                                arrayList7.add(obj18);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            lsm0 lsm0Var4 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LIVE", new hjm(kng0.l(lsm0Var4.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var4.a(R.string.cyber_champ_live, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, true, null, null, false, new ue9(lsm0Var4.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                arrayList8.add(jwb.W((xah) it3.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList8), "BANNERS_CHAMPIONSHIPS_REAL_LIVE"));
                        }
                        if (!arrayList7.isEmpty()) {
                            lsm0 lsm0Var5 = ctf0Var7.b;
                            lc00VarB4.add(new nuj("HEADER_CHAMPIONSHIPS_REAL_LINE", new hjm(kng0.l(lsm0Var5.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var5.a(R.string.line, Arrays.copyOf(new Object[0], 0))), null, null, null, null, null, false, null, null, false, new ue9(lsm0Var5.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)));
                            ArrayList arrayList9 = new ArrayList(r3d.q(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add(jwb.W((xah) it4.next(), ctf0Var7));
                            }
                            lc00VarB4.add(new ztj(dyb.r0(arrayList9), "BANNERS_CHAMPIONSHIPS_REAL_LINE"));
                        }
                        return kotlin.collections.a.a(lc00VarB4);
                }
            }
        }, (byte) 20));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        ksk kskVar = (ksk) obj;
        kskVar.getClass();
        j0g0 j0g0Var = kskVar.d;
        j0g0 j0g0Var2 = kskVar.c;
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            Object objValueOf = null;
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            boolean zIsEmpty = hic.w((kuk) obj2).isEmpty();
            n0o0 n0o0Var = this.e;
            fee feeVar = (fee) n0o0Var.getValue();
            if (!zIsEmpty) {
                if (j0g0Var2 != null) {
                    Object obj3 = j0g0Var2.f15681a;
                    jtk jtkVar = (jtk) (obj3 instanceof g0g0 ? null : obj3);
                    if (jtkVar != null) {
                        objValueOf = Boolean.valueOf(jtkVar.f17104a);
                    } else {
                        objValueOf = (Boolean) ((fee) n0o0Var.getValue()).c();
                    }
                } else {
                    objValueOf = (Boolean) ((fee) n0o0Var.getValue()).c();
                }
            }
            feeVar.d(objValueOf);
        }
        n2o n2oVar = this.f3035a.b.c.q;
        n0o0 n0o0Var2 = this.f;
        zbk zbkVar = ((fee) n0o0Var2.getValue()).e;
        ((fee) n0o0Var2.getValue()).d(j0g0Var2);
        sff0 sff0Var = kskVar.b;
        n2o n2oVar2 = sff0Var.c.q;
        v5l0 v5l0Var = sff0Var.g.y;
        j0g0 j0g0Var3 = kskVar.d;
        DisciplineDetailsParams disciplineDetailsParams = kskVar.f18817a;
        return new tsk(n2oVar, zbkVar, xbc.P(n2oVar2, v5l0Var, j0g0Var3, this.c, disciplineDetailsParams, Intrinsics.d(disciplineDetailsParams.b, CyberGamesPage.Real.INSTANCE), new vef(this, kskVar, (byte) 27)));
    }
}
