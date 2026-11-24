package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineDetailsParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class csk implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ksk f4893a;
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
    public final n0o0 l;

    /* JADX WARN: Code duplicated, block: B:15:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:67:0x012a  */
    public csk(ksk kskVar, ctf0 ctf0Var, g2v g2vVar, y78 y78Var) {
        btk btkVar;
        btk btkVar2;
        zrk zrkVar;
        List list;
        Object obj;
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        j0g0 j0g0Var3;
        ctf0Var.getClass();
        this.f4893a = kskVar;
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = y78Var;
        final byte b = 0;
        this.e = maz.b(new yw9(null, new Function1(this) { // from class: a.bsk
            public final /* synthetic */ csk b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x016f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                String str2;
                ypl0 ypl0Var2;
                String str3;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                ypl0 ypl0Var4;
                lel0 lel0Var3;
                boolean z;
                boolean zBooleanValue;
                itk itkVar;
                byte b2 = b;
                jtk jtkVar = null;
                int i = 0;
                csk cskVar = this.b;
                switch (b2) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        return bool != null ? rt20.a(cskVar.f4893a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var4 = (j0g0) obj2;
                        boolean z2 = cskVar.f4893a.f;
                        qt20 qt20Var = (qt20) ((fee) cskVar.e.getValue()).b();
                        qt20Var.getClass();
                        if (j0g0Var4 != null) {
                            Object obj3 = j0g0Var4.f15681a;
                            jtkVar = (jtk) (obj3 instanceof g0g0 ? null : obj3);
                        }
                        StringBuilder sb = new StringBuilder(ujn.h);
                        if (!z2 ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var4 = jtkVar.b) == null || (lel0Var3 = ypl0Var4.c) == null || (str = lel0Var3.d) == null) {
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
                        int i2 = z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        if (jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str2 = lel0Var2.n) == null) {
                            str2 = "";
                        }
                        if (str2.length() == 0) {
                            sb2.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb2.setLength(0);
                            sb2.append(str2);
                        } else {
                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                sb2.append('/');
                            }
                            sb2.append(StringsKt.y0(str2, '/'));
                        }
                        return new psk(string, i2, sb2.toString(), (jtkVar == null || (ypl0Var2 = jtkVar.b) == null || (str3 = ypl0Var2.b) == null) ? "" : str3, qt20Var);
                    case 2:
                        j0g0 j0g0Var5 = (j0g0) obj2;
                        DisciplineDetailsParams disciplineDetailsParams = cskVar.f4893a.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = cskVar.b;
                        List list2 = qrk.f29214a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        byte b3 = cyberGamesPage.f46556a;
                        if (j0g0Var5 != null) {
                            Object obj4 = j0g0Var5.f15681a;
                            if (obj4 instanceof g0g0) {
                                obj4 = null;
                            }
                            jtk jtkVar2 = (jtk) obj4;
                            if (jtkVar2 == null || (itkVar = jtkVar2.c) == null) {
                                z = false;
                            } else {
                                z = itkVar.f15357a;
                            }
                        } else {
                            z = false;
                        }
                        zBooleanValue = b3 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = qrk.f29214a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && zBooleanValue) {
                            lc00VarB.add(new ona(2L, new m0x(R.drawable.ic_alt_icon_focus_transfers, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (zContains2 && zBooleanValue) {
                            lc00VarB.add(new ona(1L, new m0x(R.drawable.ic_alt_icon_focus_leaderboard, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))));
                        }
                        m0x m0xVar = new m0x(R.drawable.ic_alt_icon_focus_results, null, 6);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new ona(0L, m0xVar, lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))));
                        if (z) {
                            lc00VarB.add(new ona(3L, new m0x(R.drawable.ic_alt_icon_focus_calendar, null, 6), lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))));
                        }
                        return new prk("CHIPS_BLOCK", new yna(dyb.o0(kotlin.collections.a.a(lc00VarB))));
                    case 3:
                        btk btkVar3 = (btk) obj2;
                        ksk kskVar2 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage2 = kskVar2.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = cskVar.d;
                            ctf0 ctf0Var3 = cskVar.b;
                            Boolean bool2 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            boolean z3 = zBooleanValue;
                            boolean z4 = kskVar2.g;
                            sff0 sff0Var = kskVar2.b;
                            List listA = trk.a(y78Var2, btkVar3, sff0Var, ctf0Var3, sff0Var.g.y, kskVar2.e, cyberGamesPage2, z4, true, z3, kskVar2.i);
                            if (listA != null) {
                                return listA;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        btk btkVar4 = (btk) obj2;
                        ksk kskVar3 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage3 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = cskVar.d;
                            ctf0 ctf0Var4 = cskVar.b;
                            Boolean bool3 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            boolean z5 = zBooleanValue;
                            boolean z6 = kskVar3.g;
                            sff0 sff0Var2 = kskVar3.b;
                            List listA2 = trk.a(y78Var3, btkVar4, sff0Var2, ctf0Var4, sff0Var2.g.y, kskVar3.e, cyberGamesPage3, z6, false, z5, kskVar3.i);
                            if (listA2 != null) {
                                return listA2;
                            }
                        }
                        return iun.f15405a;
                    case 5:
                        zrk zrkVar2 = (zrk) obj2;
                        zrkVar2.getClass();
                        return ask.a(zrkVar2, cskVar.f4893a.f18817a.b, cskVar.b);
                    case 6:
                        zrk zrkVar3 = (zrk) obj2;
                        zrkVar3.getClass();
                        return ask.a(zrkVar3, cskVar.f4893a.f18817a.b, cskVar.b);
                    default:
                        List list3 = (List) obj2;
                        list3.getClass();
                        ctf0 ctf0Var5 = cskVar.b;
                        ctf0Var5.getClass();
                        if (list3.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        v7m v7mVar = new v7m(new c8m(ctf0Var5.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
                        List listD0 = CollectionsKt.D0(list3, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new ork("ACTIVE_TEAMS", v7mVar, new d9m(dyb.o0(arrayList))));
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
                }
            }
        }, (byte) 20));
        j0g0 j0g0Var4 = kskVar.c;
        final byte b2 = 1;
        this.f = maz.b(new yw9(j0g0Var4, new Function1(this) { // from class: a.bsk
            public final /* synthetic */ csk b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x016f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                String str2;
                ypl0 ypl0Var2;
                String str3;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                ypl0 ypl0Var4;
                lel0 lel0Var3;
                boolean z;
                boolean zBooleanValue;
                itk itkVar;
                byte b3 = b2;
                jtk jtkVar = null;
                int i = 0;
                csk cskVar = this.b;
                switch (b3) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        return bool != null ? rt20.a(cskVar.f4893a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var5 = (j0g0) obj2;
                        boolean z2 = cskVar.f4893a.f;
                        qt20 qt20Var = (qt20) ((fee) cskVar.e.getValue()).b();
                        qt20Var.getClass();
                        if (j0g0Var5 != null) {
                            Object obj3 = j0g0Var5.f15681a;
                            jtkVar = (jtk) (obj3 instanceof g0g0 ? null : obj3);
                        }
                        StringBuilder sb = new StringBuilder(ujn.h);
                        if (!z2 ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var4 = jtkVar.b) == null || (lel0Var3 = ypl0Var4.c) == null || (str = lel0Var3.d) == null) {
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
                        int i2 = z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        if (jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str2 = lel0Var2.n) == null) {
                            str2 = "";
                        }
                        if (str2.length() == 0) {
                            sb2.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb2.setLength(0);
                            sb2.append(str2);
                        } else {
                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                sb2.append('/');
                            }
                            sb2.append(StringsKt.y0(str2, '/'));
                        }
                        return new psk(string, i2, sb2.toString(), (jtkVar == null || (ypl0Var2 = jtkVar.b) == null || (str3 = ypl0Var2.b) == null) ? "" : str3, qt20Var);
                    case 2:
                        j0g0 j0g0Var6 = (j0g0) obj2;
                        DisciplineDetailsParams disciplineDetailsParams = cskVar.f4893a.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = cskVar.b;
                        List list2 = qrk.f29214a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        byte b4 = cyberGamesPage.f46556a;
                        if (j0g0Var6 != null) {
                            Object obj4 = j0g0Var6.f15681a;
                            if (obj4 instanceof g0g0) {
                                obj4 = null;
                            }
                            jtk jtkVar2 = (jtk) obj4;
                            if (jtkVar2 == null || (itkVar = jtkVar2.c) == null) {
                                z = false;
                            } else {
                                z = itkVar.f15357a;
                            }
                        } else {
                            z = false;
                        }
                        zBooleanValue = b4 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = qrk.f29214a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && zBooleanValue) {
                            lc00VarB.add(new ona(2L, new m0x(R.drawable.ic_alt_icon_focus_transfers, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (zContains2 && zBooleanValue) {
                            lc00VarB.add(new ona(1L, new m0x(R.drawable.ic_alt_icon_focus_leaderboard, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))));
                        }
                        m0x m0xVar = new m0x(R.drawable.ic_alt_icon_focus_results, null, 6);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new ona(0L, m0xVar, lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))));
                        if (z) {
                            lc00VarB.add(new ona(3L, new m0x(R.drawable.ic_alt_icon_focus_calendar, null, 6), lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))));
                        }
                        return new prk("CHIPS_BLOCK", new yna(dyb.o0(kotlin.collections.a.a(lc00VarB))));
                    case 3:
                        btk btkVar3 = (btk) obj2;
                        ksk kskVar2 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage2 = kskVar2.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = cskVar.d;
                            ctf0 ctf0Var3 = cskVar.b;
                            Boolean bool2 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            boolean z3 = zBooleanValue;
                            boolean z4 = kskVar2.g;
                            sff0 sff0Var = kskVar2.b;
                            List listA = trk.a(y78Var2, btkVar3, sff0Var, ctf0Var3, sff0Var.g.y, kskVar2.e, cyberGamesPage2, z4, true, z3, kskVar2.i);
                            if (listA != null) {
                                return listA;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        btk btkVar4 = (btk) obj2;
                        ksk kskVar3 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage3 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = cskVar.d;
                            ctf0 ctf0Var4 = cskVar.b;
                            Boolean bool3 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            boolean z5 = zBooleanValue;
                            boolean z6 = kskVar3.g;
                            sff0 sff0Var2 = kskVar3.b;
                            List listA2 = trk.a(y78Var3, btkVar4, sff0Var2, ctf0Var4, sff0Var2.g.y, kskVar3.e, cyberGamesPage3, z6, false, z5, kskVar3.i);
                            if (listA2 != null) {
                                return listA2;
                            }
                        }
                        return iun.f15405a;
                    case 5:
                        zrk zrkVar2 = (zrk) obj2;
                        zrkVar2.getClass();
                        return ask.a(zrkVar2, cskVar.f4893a.f18817a.b, cskVar.b);
                    case 6:
                        zrk zrkVar3 = (zrk) obj2;
                        zrkVar3.getClass();
                        return ask.a(zrkVar3, cskVar.f4893a.f18817a.b, cskVar.b);
                    default:
                        List list3 = (List) obj2;
                        list3.getClass();
                        ctf0 ctf0Var5 = cskVar.b;
                        ctf0Var5.getClass();
                        if (list3.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        v7m v7mVar = new v7m(new c8m(ctf0Var5.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
                        List listD0 = CollectionsKt.D0(list3, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new ork("ACTIVE_TEAMS", v7mVar, new d9m(dyb.o0(arrayList))));
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
                }
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.g = maz.b(new yw9(j0g0Var4, new Function1(this) { // from class: a.bsk
            public final /* synthetic */ csk b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x016f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                String str2;
                ypl0 ypl0Var2;
                String str3;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                ypl0 ypl0Var4;
                lel0 lel0Var3;
                boolean z;
                boolean zBooleanValue;
                itk itkVar;
                byte b4 = b3;
                jtk jtkVar = null;
                int i = 0;
                csk cskVar = this.b;
                switch (b4) {
                    case 0:
                        Boolean bool = (Boolean) obj2;
                        return bool != null ? rt20.a(cskVar.f4893a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var5 = (j0g0) obj2;
                        boolean z2 = cskVar.f4893a.f;
                        qt20 qt20Var = (qt20) ((fee) cskVar.e.getValue()).b();
                        qt20Var.getClass();
                        if (j0g0Var5 != null) {
                            Object obj3 = j0g0Var5.f15681a;
                            jtkVar = (jtk) (obj3 instanceof g0g0 ? null : obj3);
                        }
                        StringBuilder sb = new StringBuilder(ujn.h);
                        if (!z2 ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var4 = jtkVar.b) == null || (lel0Var3 = ypl0Var4.c) == null || (str = lel0Var3.d) == null) {
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
                        int i2 = z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        if (jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str2 = lel0Var2.n) == null) {
                            str2 = "";
                        }
                        if (str2.length() == 0) {
                            sb2.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb2.setLength(0);
                            sb2.append(str2);
                        } else {
                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                sb2.append('/');
                            }
                            sb2.append(StringsKt.y0(str2, '/'));
                        }
                        return new psk(string, i2, sb2.toString(), (jtkVar == null || (ypl0Var2 = jtkVar.b) == null || (str3 = ypl0Var2.b) == null) ? "" : str3, qt20Var);
                    case 2:
                        j0g0 j0g0Var6 = (j0g0) obj2;
                        DisciplineDetailsParams disciplineDetailsParams = cskVar.f4893a.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = cskVar.b;
                        List list2 = qrk.f29214a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        byte b5 = cyberGamesPage.f46556a;
                        if (j0g0Var6 != null) {
                            Object obj4 = j0g0Var6.f15681a;
                            if (obj4 instanceof g0g0) {
                                obj4 = null;
                            }
                            jtk jtkVar2 = (jtk) obj4;
                            if (jtkVar2 == null || (itkVar = jtkVar2.c) == null) {
                                z = false;
                            } else {
                                z = itkVar.f15357a;
                            }
                        } else {
                            z = false;
                        }
                        zBooleanValue = b5 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = qrk.f29214a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && zBooleanValue) {
                            lc00VarB.add(new ona(2L, new m0x(R.drawable.ic_alt_icon_focus_transfers, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (zContains2 && zBooleanValue) {
                            lc00VarB.add(new ona(1L, new m0x(R.drawable.ic_alt_icon_focus_leaderboard, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))));
                        }
                        m0x m0xVar = new m0x(R.drawable.ic_alt_icon_focus_results, null, 6);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new ona(0L, m0xVar, lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))));
                        if (z) {
                            lc00VarB.add(new ona(3L, new m0x(R.drawable.ic_alt_icon_focus_calendar, null, 6), lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))));
                        }
                        return new prk("CHIPS_BLOCK", new yna(dyb.o0(kotlin.collections.a.a(lc00VarB))));
                    case 3:
                        btk btkVar3 = (btk) obj2;
                        ksk kskVar2 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage2 = kskVar2.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = cskVar.d;
                            ctf0 ctf0Var3 = cskVar.b;
                            Boolean bool2 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            boolean z3 = zBooleanValue;
                            boolean z4 = kskVar2.g;
                            sff0 sff0Var = kskVar2.b;
                            List listA = trk.a(y78Var2, btkVar3, sff0Var, ctf0Var3, sff0Var.g.y, kskVar2.e, cyberGamesPage2, z4, true, z3, kskVar2.i);
                            if (listA != null) {
                                return listA;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        btk btkVar4 = (btk) obj2;
                        ksk kskVar3 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage3 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = cskVar.d;
                            ctf0 ctf0Var4 = cskVar.b;
                            Boolean bool3 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            boolean z5 = zBooleanValue;
                            boolean z6 = kskVar3.g;
                            sff0 sff0Var2 = kskVar3.b;
                            List listA2 = trk.a(y78Var3, btkVar4, sff0Var2, ctf0Var4, sff0Var2.g.y, kskVar3.e, cyberGamesPage3, z6, false, z5, kskVar3.i);
                            if (listA2 != null) {
                                return listA2;
                            }
                        }
                        return iun.f15405a;
                    case 5:
                        zrk zrkVar2 = (zrk) obj2;
                        zrkVar2.getClass();
                        return ask.a(zrkVar2, cskVar.f4893a.f18817a.b, cskVar.b);
                    case 6:
                        zrk zrkVar3 = (zrk) obj2;
                        zrkVar3.getClass();
                        return ask.a(zrkVar3, cskVar.f4893a.f18817a.b, cskVar.b);
                    default:
                        List list3 = (List) obj2;
                        list3.getClass();
                        ctf0 ctf0Var5 = cskVar.b;
                        ctf0Var5.getClass();
                        if (list3.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        v7m v7mVar = new v7m(new c8m(ctf0Var5.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
                        List listD0 = CollectionsKt.D0(list3, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new ork("ACTIVE_TEAMS", v7mVar, new d9m(dyb.o0(arrayList))));
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
                }
            }
        }, (byte) 20));
        j0g0 j0g0Var5 = kskVar.d;
        if (j0g0Var5 != null) {
            Object obj2 = j0g0Var5.f15681a;
            kuk kukVar = (kuk) (obj2 instanceof g0g0 ? null : obj2);
            if (kukVar == null || (j0g0Var3 = kukVar.c) == null) {
                btkVar = null;
            } else {
                Object obj3 = j0g0Var3.f15681a;
                btkVar = (btk) (obj3 instanceof g0g0 ? new btk(iun.f15405a, "") : obj3);
            }
        } else {
            btkVar = null;
        }
        final byte b4 = 3;
        this.h = maz.b(new yw9(btkVar, new Function1(this) { // from class: a.bsk
            public final /* synthetic */ csk b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x016f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                String str2;
                ypl0 ypl0Var2;
                String str3;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                ypl0 ypl0Var4;
                lel0 lel0Var3;
                boolean z;
                boolean zBooleanValue;
                itk itkVar;
                byte b5 = b4;
                jtk jtkVar = null;
                int i = 0;
                csk cskVar = this.b;
                switch (b5) {
                    case 0:
                        Boolean bool = (Boolean) obj4;
                        return bool != null ? rt20.a(cskVar.f4893a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var6 = (j0g0) obj4;
                        boolean z2 = cskVar.f4893a.f;
                        qt20 qt20Var = (qt20) ((fee) cskVar.e.getValue()).b();
                        qt20Var.getClass();
                        if (j0g0Var6 != null) {
                            Object obj5 = j0g0Var6.f15681a;
                            jtkVar = (jtk) (obj5 instanceof g0g0 ? null : obj5);
                        }
                        StringBuilder sb = new StringBuilder(ujn.h);
                        if (!z2 ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var4 = jtkVar.b) == null || (lel0Var3 = ypl0Var4.c) == null || (str = lel0Var3.d) == null) {
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
                        int i2 = z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        if (jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str2 = lel0Var2.n) == null) {
                            str2 = "";
                        }
                        if (str2.length() == 0) {
                            sb2.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb2.setLength(0);
                            sb2.append(str2);
                        } else {
                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                sb2.append('/');
                            }
                            sb2.append(StringsKt.y0(str2, '/'));
                        }
                        return new psk(string, i2, sb2.toString(), (jtkVar == null || (ypl0Var2 = jtkVar.b) == null || (str3 = ypl0Var2.b) == null) ? "" : str3, qt20Var);
                    case 2:
                        j0g0 j0g0Var7 = (j0g0) obj4;
                        DisciplineDetailsParams disciplineDetailsParams = cskVar.f4893a.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = cskVar.b;
                        List list2 = qrk.f29214a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        byte b6 = cyberGamesPage.f46556a;
                        if (j0g0Var7 != null) {
                            Object obj6 = j0g0Var7.f15681a;
                            if (obj6 instanceof g0g0) {
                                obj6 = null;
                            }
                            jtk jtkVar2 = (jtk) obj6;
                            if (jtkVar2 == null || (itkVar = jtkVar2.c) == null) {
                                z = false;
                            } else {
                                z = itkVar.f15357a;
                            }
                        } else {
                            z = false;
                        }
                        zBooleanValue = b6 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = qrk.f29214a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && zBooleanValue) {
                            lc00VarB.add(new ona(2L, new m0x(R.drawable.ic_alt_icon_focus_transfers, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (zContains2 && zBooleanValue) {
                            lc00VarB.add(new ona(1L, new m0x(R.drawable.ic_alt_icon_focus_leaderboard, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))));
                        }
                        m0x m0xVar = new m0x(R.drawable.ic_alt_icon_focus_results, null, 6);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new ona(0L, m0xVar, lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))));
                        if (z) {
                            lc00VarB.add(new ona(3L, new m0x(R.drawable.ic_alt_icon_focus_calendar, null, 6), lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))));
                        }
                        return new prk("CHIPS_BLOCK", new yna(dyb.o0(kotlin.collections.a.a(lc00VarB))));
                    case 3:
                        btk btkVar3 = (btk) obj4;
                        ksk kskVar2 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage2 = kskVar2.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = cskVar.d;
                            ctf0 ctf0Var3 = cskVar.b;
                            Boolean bool2 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            boolean z3 = zBooleanValue;
                            boolean z4 = kskVar2.g;
                            sff0 sff0Var = kskVar2.b;
                            List listA = trk.a(y78Var2, btkVar3, sff0Var, ctf0Var3, sff0Var.g.y, kskVar2.e, cyberGamesPage2, z4, true, z3, kskVar2.i);
                            if (listA != null) {
                                return listA;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        btk btkVar4 = (btk) obj4;
                        ksk kskVar3 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage3 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = cskVar.d;
                            ctf0 ctf0Var4 = cskVar.b;
                            Boolean bool3 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            boolean z5 = zBooleanValue;
                            boolean z6 = kskVar3.g;
                            sff0 sff0Var2 = kskVar3.b;
                            List listA2 = trk.a(y78Var3, btkVar4, sff0Var2, ctf0Var4, sff0Var2.g.y, kskVar3.e, cyberGamesPage3, z6, false, z5, kskVar3.i);
                            if (listA2 != null) {
                                return listA2;
                            }
                        }
                        return iun.f15405a;
                    case 5:
                        zrk zrkVar2 = (zrk) obj4;
                        zrkVar2.getClass();
                        return ask.a(zrkVar2, cskVar.f4893a.f18817a.b, cskVar.b);
                    case 6:
                        zrk zrkVar3 = (zrk) obj4;
                        zrkVar3.getClass();
                        return ask.a(zrkVar3, cskVar.f4893a.f18817a.b, cskVar.b);
                    default:
                        List list3 = (List) obj4;
                        list3.getClass();
                        ctf0 ctf0Var5 = cskVar.b;
                        ctf0Var5.getClass();
                        if (list3.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        v7m v7mVar = new v7m(new c8m(ctf0Var5.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
                        List listD0 = CollectionsKt.D0(list3, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new ork("ACTIVE_TEAMS", v7mVar, new d9m(dyb.o0(arrayList))));
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
                }
            }
        }, (byte) 20));
        if (j0g0Var5 != null) {
            Object obj4 = j0g0Var5.f15681a;
            kuk kukVar2 = (kuk) (obj4 instanceof g0g0 ? null : obj4);
            if (kukVar2 == null || (j0g0Var2 = kukVar2.d) == null) {
                btkVar2 = null;
            } else {
                Object obj5 = j0g0Var2.f15681a;
                btkVar2 = (btk) (obj5 instanceof g0g0 ? new btk(iun.f15405a, "") : obj5);
            }
        } else {
            btkVar2 = null;
        }
        final byte b5 = 4;
        this.i = maz.b(new yw9(btkVar2, new Function1(this) { // from class: a.bsk
            public final /* synthetic */ csk b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x016f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj6) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                String str2;
                ypl0 ypl0Var2;
                String str3;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                ypl0 ypl0Var4;
                lel0 lel0Var3;
                boolean z;
                boolean zBooleanValue;
                itk itkVar;
                byte b6 = b5;
                jtk jtkVar = null;
                int i = 0;
                csk cskVar = this.b;
                switch (b6) {
                    case 0:
                        Boolean bool = (Boolean) obj6;
                        return bool != null ? rt20.a(cskVar.f4893a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var6 = (j0g0) obj6;
                        boolean z2 = cskVar.f4893a.f;
                        qt20 qt20Var = (qt20) ((fee) cskVar.e.getValue()).b();
                        qt20Var.getClass();
                        if (j0g0Var6 != null) {
                            Object obj7 = j0g0Var6.f15681a;
                            jtkVar = (jtk) (obj7 instanceof g0g0 ? null : obj7);
                        }
                        StringBuilder sb = new StringBuilder(ujn.h);
                        if (!z2 ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var4 = jtkVar.b) == null || (lel0Var3 = ypl0Var4.c) == null || (str = lel0Var3.d) == null) {
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
                        int i2 = z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        if (jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str2 = lel0Var2.n) == null) {
                            str2 = "";
                        }
                        if (str2.length() == 0) {
                            sb2.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb2.setLength(0);
                            sb2.append(str2);
                        } else {
                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                sb2.append('/');
                            }
                            sb2.append(StringsKt.y0(str2, '/'));
                        }
                        return new psk(string, i2, sb2.toString(), (jtkVar == null || (ypl0Var2 = jtkVar.b) == null || (str3 = ypl0Var2.b) == null) ? "" : str3, qt20Var);
                    case 2:
                        j0g0 j0g0Var7 = (j0g0) obj6;
                        DisciplineDetailsParams disciplineDetailsParams = cskVar.f4893a.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = cskVar.b;
                        List list2 = qrk.f29214a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        byte b7 = cyberGamesPage.f46556a;
                        if (j0g0Var7 != null) {
                            Object obj8 = j0g0Var7.f15681a;
                            if (obj8 instanceof g0g0) {
                                obj8 = null;
                            }
                            jtk jtkVar2 = (jtk) obj8;
                            if (jtkVar2 == null || (itkVar = jtkVar2.c) == null) {
                                z = false;
                            } else {
                                z = itkVar.f15357a;
                            }
                        } else {
                            z = false;
                        }
                        zBooleanValue = b7 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = qrk.f29214a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && zBooleanValue) {
                            lc00VarB.add(new ona(2L, new m0x(R.drawable.ic_alt_icon_focus_transfers, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (zContains2 && zBooleanValue) {
                            lc00VarB.add(new ona(1L, new m0x(R.drawable.ic_alt_icon_focus_leaderboard, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))));
                        }
                        m0x m0xVar = new m0x(R.drawable.ic_alt_icon_focus_results, null, 6);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new ona(0L, m0xVar, lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))));
                        if (z) {
                            lc00VarB.add(new ona(3L, new m0x(R.drawable.ic_alt_icon_focus_calendar, null, 6), lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))));
                        }
                        return new prk("CHIPS_BLOCK", new yna(dyb.o0(kotlin.collections.a.a(lc00VarB))));
                    case 3:
                        btk btkVar3 = (btk) obj6;
                        ksk kskVar2 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage2 = kskVar2.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = cskVar.d;
                            ctf0 ctf0Var3 = cskVar.b;
                            Boolean bool2 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            boolean z3 = zBooleanValue;
                            boolean z4 = kskVar2.g;
                            sff0 sff0Var = kskVar2.b;
                            List listA = trk.a(y78Var2, btkVar3, sff0Var, ctf0Var3, sff0Var.g.y, kskVar2.e, cyberGamesPage2, z4, true, z3, kskVar2.i);
                            if (listA != null) {
                                return listA;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        btk btkVar4 = (btk) obj6;
                        ksk kskVar3 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage3 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = cskVar.d;
                            ctf0 ctf0Var4 = cskVar.b;
                            Boolean bool3 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            boolean z5 = zBooleanValue;
                            boolean z6 = kskVar3.g;
                            sff0 sff0Var2 = kskVar3.b;
                            List listA2 = trk.a(y78Var3, btkVar4, sff0Var2, ctf0Var4, sff0Var2.g.y, kskVar3.e, cyberGamesPage3, z6, false, z5, kskVar3.i);
                            if (listA2 != null) {
                                return listA2;
                            }
                        }
                        return iun.f15405a;
                    case 5:
                        zrk zrkVar2 = (zrk) obj6;
                        zrkVar2.getClass();
                        return ask.a(zrkVar2, cskVar.f4893a.f18817a.b, cskVar.b);
                    case 6:
                        zrk zrkVar3 = (zrk) obj6;
                        zrkVar3.getClass();
                        return ask.a(zrkVar3, cskVar.f4893a.f18817a.b, cskVar.b);
                    default:
                        List list3 = (List) obj6;
                        list3.getClass();
                        ctf0 ctf0Var5 = cskVar.b;
                        ctf0Var5.getClass();
                        if (list3.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        v7m v7mVar = new v7m(new c8m(ctf0Var5.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
                        List listD0 = CollectionsKt.D0(list3, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new ork("ACTIVE_TEAMS", v7mVar, new d9m(dyb.o0(arrayList))));
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
                }
            }
        }, (byte) 20));
        if (j0g0Var5 != null) {
            Object obj6 = j0g0Var5.f15681a;
            kuk kukVar3 = (kuk) (obj6 instanceof g0g0 ? null : obj6);
            if (kukVar3 != null) {
                zrkVar = obc.T(kukVar3);
            } else {
                iun iunVar = iun.f15405a;
                zrkVar = new zrk(iunVar, iunVar);
            }
        } else {
            iun iunVar2 = iun.f15405a;
            zrkVar = new zrk(iunVar2, iunVar2);
        }
        final byte b6 = 5;
        this.j = maz.b(new yw9(zrkVar, new Function1(this) { // from class: a.bsk
            public final /* synthetic */ csk b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x016f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj7) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                String str2;
                ypl0 ypl0Var2;
                String str3;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                ypl0 ypl0Var4;
                lel0 lel0Var3;
                boolean z;
                boolean zBooleanValue;
                itk itkVar;
                byte b7 = b6;
                jtk jtkVar = null;
                int i = 0;
                csk cskVar = this.b;
                switch (b7) {
                    case 0:
                        Boolean bool = (Boolean) obj7;
                        return bool != null ? rt20.a(cskVar.f4893a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var6 = (j0g0) obj7;
                        boolean z2 = cskVar.f4893a.f;
                        qt20 qt20Var = (qt20) ((fee) cskVar.e.getValue()).b();
                        qt20Var.getClass();
                        if (j0g0Var6 != null) {
                            Object obj8 = j0g0Var6.f15681a;
                            jtkVar = (jtk) (obj8 instanceof g0g0 ? null : obj8);
                        }
                        StringBuilder sb = new StringBuilder(ujn.h);
                        if (!z2 ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var4 = jtkVar.b) == null || (lel0Var3 = ypl0Var4.c) == null || (str = lel0Var3.d) == null) {
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
                        int i2 = z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        if (jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str2 = lel0Var2.n) == null) {
                            str2 = "";
                        }
                        if (str2.length() == 0) {
                            sb2.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb2.setLength(0);
                            sb2.append(str2);
                        } else {
                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                sb2.append('/');
                            }
                            sb2.append(StringsKt.y0(str2, '/'));
                        }
                        return new psk(string, i2, sb2.toString(), (jtkVar == null || (ypl0Var2 = jtkVar.b) == null || (str3 = ypl0Var2.b) == null) ? "" : str3, qt20Var);
                    case 2:
                        j0g0 j0g0Var7 = (j0g0) obj7;
                        DisciplineDetailsParams disciplineDetailsParams = cskVar.f4893a.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = cskVar.b;
                        List list2 = qrk.f29214a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        byte b8 = cyberGamesPage.f46556a;
                        if (j0g0Var7 != null) {
                            Object obj9 = j0g0Var7.f15681a;
                            if (obj9 instanceof g0g0) {
                                obj9 = null;
                            }
                            jtk jtkVar2 = (jtk) obj9;
                            if (jtkVar2 == null || (itkVar = jtkVar2.c) == null) {
                                z = false;
                            } else {
                                z = itkVar.f15357a;
                            }
                        } else {
                            z = false;
                        }
                        zBooleanValue = b8 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = qrk.f29214a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && zBooleanValue) {
                            lc00VarB.add(new ona(2L, new m0x(R.drawable.ic_alt_icon_focus_transfers, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (zContains2 && zBooleanValue) {
                            lc00VarB.add(new ona(1L, new m0x(R.drawable.ic_alt_icon_focus_leaderboard, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))));
                        }
                        m0x m0xVar = new m0x(R.drawable.ic_alt_icon_focus_results, null, 6);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new ona(0L, m0xVar, lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))));
                        if (z) {
                            lc00VarB.add(new ona(3L, new m0x(R.drawable.ic_alt_icon_focus_calendar, null, 6), lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))));
                        }
                        return new prk("CHIPS_BLOCK", new yna(dyb.o0(kotlin.collections.a.a(lc00VarB))));
                    case 3:
                        btk btkVar3 = (btk) obj7;
                        ksk kskVar2 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage2 = kskVar2.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = cskVar.d;
                            ctf0 ctf0Var3 = cskVar.b;
                            Boolean bool2 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            boolean z3 = zBooleanValue;
                            boolean z4 = kskVar2.g;
                            sff0 sff0Var = kskVar2.b;
                            List listA = trk.a(y78Var2, btkVar3, sff0Var, ctf0Var3, sff0Var.g.y, kskVar2.e, cyberGamesPage2, z4, true, z3, kskVar2.i);
                            if (listA != null) {
                                return listA;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        btk btkVar4 = (btk) obj7;
                        ksk kskVar3 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage3 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = cskVar.d;
                            ctf0 ctf0Var4 = cskVar.b;
                            Boolean bool3 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            boolean z5 = zBooleanValue;
                            boolean z6 = kskVar3.g;
                            sff0 sff0Var2 = kskVar3.b;
                            List listA2 = trk.a(y78Var3, btkVar4, sff0Var2, ctf0Var4, sff0Var2.g.y, kskVar3.e, cyberGamesPage3, z6, false, z5, kskVar3.i);
                            if (listA2 != null) {
                                return listA2;
                            }
                        }
                        return iun.f15405a;
                    case 5:
                        zrk zrkVar2 = (zrk) obj7;
                        zrkVar2.getClass();
                        return ask.a(zrkVar2, cskVar.f4893a.f18817a.b, cskVar.b);
                    case 6:
                        zrk zrkVar3 = (zrk) obj7;
                        zrkVar3.getClass();
                        return ask.a(zrkVar3, cskVar.f4893a.f18817a.b, cskVar.b);
                    default:
                        List list3 = (List) obj7;
                        list3.getClass();
                        ctf0 ctf0Var5 = cskVar.b;
                        ctf0Var5.getClass();
                        if (list3.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        v7m v7mVar = new v7m(new c8m(ctf0Var5.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
                        List listD0 = CollectionsKt.D0(list3, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new ork("ACTIVE_TEAMS", v7mVar, new d9m(dyb.o0(arrayList))));
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
                }
            }
        }, (byte) 20));
        if (j0g0Var5 != null) {
            Object obj7 = j0g0Var5.f15681a;
            kuk kukVar4 = (kuk) (obj7 instanceof g0g0 ? null : obj7);
            if (kukVar4 != null) {
                Object obj8 = kukVar4.j;
                list = (List) (obj8 instanceof g0g0 ? null : obj8);
                list = list == null ? iun.f15405a : list;
            }
        }
        final byte b7 = 6;
        this.k = maz.b(new yw9(kbc.i0(list), new Function1(this) { // from class: a.bsk
            public final /* synthetic */ csk b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x016f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj9) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                String str2;
                ypl0 ypl0Var2;
                String str3;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                ypl0 ypl0Var4;
                lel0 lel0Var3;
                boolean z;
                boolean zBooleanValue;
                itk itkVar;
                byte b8 = b7;
                jtk jtkVar = null;
                int i = 0;
                csk cskVar = this.b;
                switch (b8) {
                    case 0:
                        Boolean bool = (Boolean) obj9;
                        return bool != null ? rt20.a(cskVar.f4893a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var6 = (j0g0) obj9;
                        boolean z2 = cskVar.f4893a.f;
                        qt20 qt20Var = (qt20) ((fee) cskVar.e.getValue()).b();
                        qt20Var.getClass();
                        if (j0g0Var6 != null) {
                            Object obj10 = j0g0Var6.f15681a;
                            jtkVar = (jtk) (obj10 instanceof g0g0 ? null : obj10);
                        }
                        StringBuilder sb = new StringBuilder(ujn.h);
                        if (!z2 ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var4 = jtkVar.b) == null || (lel0Var3 = ypl0Var4.c) == null || (str = lel0Var3.d) == null) {
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
                        int i2 = z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        if (jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str2 = lel0Var2.n) == null) {
                            str2 = "";
                        }
                        if (str2.length() == 0) {
                            sb2.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb2.setLength(0);
                            sb2.append(str2);
                        } else {
                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                sb2.append('/');
                            }
                            sb2.append(StringsKt.y0(str2, '/'));
                        }
                        return new psk(string, i2, sb2.toString(), (jtkVar == null || (ypl0Var2 = jtkVar.b) == null || (str3 = ypl0Var2.b) == null) ? "" : str3, qt20Var);
                    case 2:
                        j0g0 j0g0Var7 = (j0g0) obj9;
                        DisciplineDetailsParams disciplineDetailsParams = cskVar.f4893a.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = cskVar.b;
                        List list2 = qrk.f29214a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        byte b9 = cyberGamesPage.f46556a;
                        if (j0g0Var7 != null) {
                            Object obj11 = j0g0Var7.f15681a;
                            if (obj11 instanceof g0g0) {
                                obj11 = null;
                            }
                            jtk jtkVar2 = (jtk) obj11;
                            if (jtkVar2 == null || (itkVar = jtkVar2.c) == null) {
                                z = false;
                            } else {
                                z = itkVar.f15357a;
                            }
                        } else {
                            z = false;
                        }
                        zBooleanValue = b9 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = qrk.f29214a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && zBooleanValue) {
                            lc00VarB.add(new ona(2L, new m0x(R.drawable.ic_alt_icon_focus_transfers, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (zContains2 && zBooleanValue) {
                            lc00VarB.add(new ona(1L, new m0x(R.drawable.ic_alt_icon_focus_leaderboard, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))));
                        }
                        m0x m0xVar = new m0x(R.drawable.ic_alt_icon_focus_results, null, 6);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new ona(0L, m0xVar, lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))));
                        if (z) {
                            lc00VarB.add(new ona(3L, new m0x(R.drawable.ic_alt_icon_focus_calendar, null, 6), lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))));
                        }
                        return new prk("CHIPS_BLOCK", new yna(dyb.o0(kotlin.collections.a.a(lc00VarB))));
                    case 3:
                        btk btkVar3 = (btk) obj9;
                        ksk kskVar2 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage2 = kskVar2.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = cskVar.d;
                            ctf0 ctf0Var3 = cskVar.b;
                            Boolean bool2 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            boolean z3 = zBooleanValue;
                            boolean z4 = kskVar2.g;
                            sff0 sff0Var = kskVar2.b;
                            List listA = trk.a(y78Var2, btkVar3, sff0Var, ctf0Var3, sff0Var.g.y, kskVar2.e, cyberGamesPage2, z4, true, z3, kskVar2.i);
                            if (listA != null) {
                                return listA;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        btk btkVar4 = (btk) obj9;
                        ksk kskVar3 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage3 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = cskVar.d;
                            ctf0 ctf0Var4 = cskVar.b;
                            Boolean bool3 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            boolean z5 = zBooleanValue;
                            boolean z6 = kskVar3.g;
                            sff0 sff0Var2 = kskVar3.b;
                            List listA2 = trk.a(y78Var3, btkVar4, sff0Var2, ctf0Var4, sff0Var2.g.y, kskVar3.e, cyberGamesPage3, z6, false, z5, kskVar3.i);
                            if (listA2 != null) {
                                return listA2;
                            }
                        }
                        return iun.f15405a;
                    case 5:
                        zrk zrkVar2 = (zrk) obj9;
                        zrkVar2.getClass();
                        return ask.a(zrkVar2, cskVar.f4893a.f18817a.b, cskVar.b);
                    case 6:
                        zrk zrkVar3 = (zrk) obj9;
                        zrkVar3.getClass();
                        return ask.a(zrkVar3, cskVar.f4893a.f18817a.b, cskVar.b);
                    default:
                        List list3 = (List) obj9;
                        list3.getClass();
                        ctf0 ctf0Var5 = cskVar.b;
                        ctf0Var5.getClass();
                        if (list3.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        v7m v7mVar = new v7m(new c8m(ctf0Var5.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
                        List listD0 = CollectionsKt.D0(list3, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new ork("ACTIVE_TEAMS", v7mVar, new d9m(dyb.o0(arrayList))));
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
                }
            }
        }, (byte) 20));
        if (j0g0Var5 != null) {
            Object obj9 = j0g0Var5.f15681a;
            kuk kukVar5 = (kuk) (obj9 instanceof g0g0 ? null : obj9);
            if (kukVar5 != null && (j0g0Var = kukVar5.g) != null) {
                Object obj10 = j0g0Var.f15681a;
                obj = (List) (obj10 instanceof g0g0 ? iun.f15405a : obj10);
                obj = obj == null ? iun.f15405a : obj;
            }
        }
        final byte b8 = 7;
        this.l = maz.b(new yw9(obj, new Function1(this) { // from class: a.bsk
            public final /* synthetic */ csk b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:55:0x016f  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj11) {
                ypl0 ypl0Var;
                lel0 lel0Var;
                String str;
                String str2;
                ypl0 ypl0Var2;
                String str3;
                ypl0 ypl0Var3;
                lel0 lel0Var2;
                ypl0 ypl0Var4;
                lel0 lel0Var3;
                boolean z;
                boolean zBooleanValue;
                itk itkVar;
                byte b9 = b8;
                jtk jtkVar = null;
                int i = 0;
                csk cskVar = this.b;
                switch (b9) {
                    case 0:
                        Boolean bool = (Boolean) obj11;
                        return bool != null ? rt20.a(cskVar.f4893a.f18817a.b.f46556a, bool.booleanValue()) : pt20.f27543a;
                    case 1:
                        j0g0 j0g0Var6 = (j0g0) obj11;
                        boolean z2 = cskVar.f4893a.f;
                        qt20 qt20Var = (qt20) ((fee) cskVar.e.getValue()).b();
                        qt20Var.getClass();
                        if (j0g0Var6 != null) {
                            Object obj12 = j0g0Var6.f15681a;
                            jtkVar = (jtk) (obj12 instanceof g0g0 ? null : obj12);
                        }
                        StringBuilder sb = new StringBuilder(ujn.h);
                        if (!z2 ? jtkVar == null || (ypl0Var = jtkVar.b) == null || (lel0Var = ypl0Var.c) == null || (str = lel0Var.c) == null : jtkVar == null || (ypl0Var4 = jtkVar.b) == null || (lel0Var3 = ypl0Var4.c) == null || (str = lel0Var3.d) == null) {
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
                        int i2 = z2 ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        if (jtkVar == null || (ypl0Var3 = jtkVar.b) == null || (lel0Var2 = ypl0Var3.c) == null || (str2 = lel0Var2.n) == null) {
                            str2 = "";
                        }
                        if (str2.length() == 0) {
                            sb2.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb2.setLength(0);
                            sb2.append(str2);
                        } else {
                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                sb2.append('/');
                            }
                            sb2.append(StringsKt.y0(str2, '/'));
                        }
                        return new psk(string, i2, sb2.toString(), (jtkVar == null || (ypl0Var2 = jtkVar.b) == null || (str3 = ypl0Var2.b) == null) ? "" : str3, qt20Var);
                    case 2:
                        j0g0 j0g0Var7 = (j0g0) obj11;
                        DisciplineDetailsParams disciplineDetailsParams = cskVar.f4893a.f18817a;
                        long j = disciplineDetailsParams.f46554a;
                        CyberGamesPage cyberGamesPage = disciplineDetailsParams.b;
                        ctf0 ctf0Var2 = cskVar.b;
                        List list2 = qrk.f29214a;
                        cyberGamesPage.getClass();
                        ctf0Var2.getClass();
                        byte b10 = cyberGamesPage.f46556a;
                        if (j0g0Var7 != null) {
                            Object obj13 = j0g0Var7.f15681a;
                            if (obj13 instanceof g0g0) {
                                obj13 = null;
                            }
                            jtk jtkVar2 = (jtk) obj13;
                            if (jtkVar2 == null || (itkVar = jtkVar2.c) == null) {
                                z = false;
                            } else {
                                z = itkVar.f15357a;
                            }
                        } else {
                            z = false;
                        }
                        zBooleanValue = b10 == CyberGamesPage.Real.INSTANCE.f46556a;
                        boolean zContains = gql0.e().contains(Long.valueOf(j));
                        boolean zContains2 = qrk.f29214a.contains(Long.valueOf(j));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (zContains && zBooleanValue) {
                            lc00VarB.add(new ona(2L, new m0x(R.drawable.ic_alt_icon_focus_transfers, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (zContains2 && zBooleanValue) {
                            lc00VarB.add(new ona(1L, new m0x(R.drawable.ic_alt_icon_focus_leaderboard, null, 6), ctf0Var2.b.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0))));
                        }
                        m0x m0xVar = new m0x(R.drawable.ic_alt_icon_focus_results, null, 6);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new ona(0L, m0xVar, lsm0Var.a(R.string.cyber_games_chip_match_result, Arrays.copyOf(new Object[0], 0))));
                        if (z) {
                            lc00VarB.add(new ona(3L, new m0x(R.drawable.ic_alt_icon_focus_calendar, null, 6), lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0))));
                        }
                        return new prk("CHIPS_BLOCK", new yna(dyb.o0(kotlin.collections.a.a(lc00VarB))));
                    case 3:
                        btk btkVar3 = (btk) obj11;
                        ksk kskVar2 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage2 = kskVar2.f18817a.b;
                        zBooleanValue = cyberGamesPage2.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar3 != null) {
                            y78 y78Var2 = cskVar.d;
                            ctf0 ctf0Var3 = cskVar.b;
                            Boolean bool2 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            boolean z3 = zBooleanValue;
                            boolean z4 = kskVar2.g;
                            sff0 sff0Var = kskVar2.b;
                            List listA = trk.a(y78Var2, btkVar3, sff0Var, ctf0Var3, sff0Var.g.y, kskVar2.e, cyberGamesPage2, z4, true, z3, kskVar2.i);
                            if (listA != null) {
                                return listA;
                            }
                        }
                        return iun.f15405a;
                    case 4:
                        btk btkVar4 = (btk) obj11;
                        ksk kskVar3 = cskVar.f4893a;
                        CyberGamesPage cyberGamesPage3 = kskVar3.f18817a.b;
                        zBooleanValue = cyberGamesPage3.f46556a == CyberGamesPage.Virtual.INSTANCE.f46556a;
                        if (btkVar4 != null) {
                            y78 y78Var3 = cskVar.d;
                            ctf0 ctf0Var4 = cskVar.b;
                            Boolean bool3 = (Boolean) ((fee) cskVar.e.getValue()).c();
                            if (bool3 != null) {
                                zBooleanValue = bool3.booleanValue();
                            }
                            boolean z5 = zBooleanValue;
                            boolean z6 = kskVar3.g;
                            sff0 sff0Var2 = kskVar3.b;
                            List listA2 = trk.a(y78Var3, btkVar4, sff0Var2, ctf0Var4, sff0Var2.g.y, kskVar3.e, cyberGamesPage3, z6, false, z5, kskVar3.i);
                            if (listA2 != null) {
                                return listA2;
                            }
                        }
                        return iun.f15405a;
                    case 5:
                        zrk zrkVar2 = (zrk) obj11;
                        zrkVar2.getClass();
                        return ask.a(zrkVar2, cskVar.f4893a.f18817a.b, cskVar.b);
                    case 6:
                        zrk zrkVar3 = (zrk) obj11;
                        zrkVar3.getClass();
                        return ask.a(zrkVar3, cskVar.f4893a.f18817a.b, cskVar.b);
                    default:
                        List list3 = (List) obj11;
                        list3.getClass();
                        ctf0 ctf0Var5 = cskVar.b;
                        ctf0Var5.getClass();
                        if (list3.size() < 5) {
                            return iun.f15405a;
                        }
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        v7m v7mVar = new v7m(new c8m(ctf0Var5.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0)), n7m.f23049a));
                        List listD0 = CollectionsKt.D0(list3, 10);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        Iterator it = listD0.iterator();
                        while (true) {
                            int i3 = i;
                            if (!it.hasNext()) {
                                lc00VarB2.add(new ork("ACTIVE_TEAMS", v7mVar, new d9m(dyb.o0(arrayList))));
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
        n0o0 n0o0Var2 = this.f;
        ((fee) n0o0Var2.getValue()).d(j0g0Var2);
        n2o n2oVar = this.f4893a.b.c.q;
        zbk zbkVar = ((fee) n0o0Var2.getValue()).e;
        sff0 sff0Var = kskVar.b;
        return new tsk(n2oVar, zbkVar, xbc.P(sff0Var.c.q, sff0Var.g.y, kskVar.d, this.c, kskVar.f18817a, false, new lrk(this, kskVar, (byte) 1)));
    }
}
