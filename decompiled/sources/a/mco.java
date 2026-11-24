package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.home.CyberHomeParams;

/* JADX INFO: loaded from: classes4.dex */
public final class mco implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21561a;
    public final ctf0 b;
    public final y78 c;
    public final g2v d;
    public final zjw e;
    public final th90 f;
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

    /* JADX WARN: Code duplicated, block: B:109:0x035f  */
    /* JADX WARN: Code duplicated, block: B:170:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x015d  */
    /* JADX WARN: Code duplicated, block: B:47:0x017e  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x0225  */
    /* JADX WARN: Code duplicated, block: B:77:0x0259  */
    /* JADX WARN: Code duplicated, block: B:85:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ea  */
    public mco(CyberHomeParams cyberHomeParams, ctf0 ctf0Var, y78 y78Var, g2v g2vVar, zjw zjwVar, byte b) {
        List list;
        List list2;
        List list3;
        l0l0 l0l0Var;
        Collection collection;
        Iterable iterable;
        Object obj;
        Object obj2;
        List list4;
        Object obj3;
        List list5;
        List list6;
        l0l0 l0l0Var2;
        this.f21561a = b;
        wiw wiwVar = wiw.f39237a;
        int i = 3;
        int i2 = 2;
        final byte b2 = 1;
        ctf0Var.getClass();
        switch (b) {
            case 1:
                this.b = ctf0Var;
                this.c = y78Var;
                this.d = g2vVar;
                this.e = zjwVar;
                List list7 = zjwVar.f44501a;
                v5l0 v5l0Var = zjwVar.b.g.y;
                jo20 jo20Var = new jo20();
                Iterator it = list7.iterator();
                while (it.hasNext()) {
                    CyberGamesPage cyberGamesPage = ((ekw) it.next()).f7971a;
                    lc00 lc00VarB = kotlin.collections.a.b();
                    lc00VarB.add(new fok("DisciplineBlockUiModel_Shimmer"));
                    lc00VarB.add(new if9());
                    q0s q0sVar = q0s.b;
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
                            throw null;
                        }
                        l0l0Var = h0l0.f12241a;
                    }
                    vqv vqvVar = new vqv("HeaderFocusDisciplineGame_Shimmer", new zqv(z7m.f43924a), new vb90(q0sVar, dyb.g0(new x56(l0l0Var), new x56(l0l0Var)), false, true), -1L);
                    lc00VarB.add(new yqv("HeaderFocusAllEventsUiModel_Shimmer", new esv("", w7m.f38680a, lak0.c), dyb.g0(vqvVar, vqvVar, vqvVar), sip.c));
                    jo20Var.put(cyberGamesPage, androidx.compose.runtime.e.e(new hjw(wiwVar, dyb.o0(kotlin.collections.a.a(lc00VarB)), true)));
                }
                this.f = dyb.p0(jo20Var.b());
                this.g = bkb.H(this.e.g);
                this.h = bkb.H(this.e.l);
                this.i = bkb.H(Boolean.valueOf(this.e.k));
                zjw zjwVar2 = this.e;
                Object obj4 = zjwVar2.j.get(zjwVar2.g.f7971a);
                Boolean bool = Boolean.TRUE;
                this.j = bkb.H(Boolean.valueOf(Intrinsics.d(obj4, bool)));
                zjw zjwVar3 = this.e;
                this.k = bkb.H(Boolean.valueOf(Intrinsics.d(zjwVar3.q.get(zjwVar3.g.f7971a), bool)));
                final byte b3 = 0;
                this.l = maz.b(new yw9(b(), new Function1(this) { // from class: a.irv
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:262:0x0143 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:264:0x012e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
                    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[PHI: r10
  0x01b9: PHI (r10v42 int) = (r10v41 int), (r10v47 int) binds: [B:64:0x018a, B:67:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
                    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        a4x a4xVarG0;
                        Iterator it2;
                        Object next;
                        m5l0 m5l0Var;
                        int i3;
                        char c;
                        a4x a4xVarO0;
                        int i4;
                        String str;
                        StringBuilder sb;
                        String strK;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Iterator it3;
                        a4x a4xVarF;
                        StringBuilder sb2;
                        String str2;
                        Iterator it4;
                        int i5;
                        int i6;
                        char c2;
                        byte b4 = b3;
                        n7m n7mVar = n7m.f23049a;
                        String strA = "";
                        mco mcoVar = this.b;
                        switch (b4) {
                            case 0:
                                fee feeVar = (fee) obj5;
                                feeVar.getClass();
                                zjw zjwVar4 = mcoVar.e;
                                return new gkw(!zjwVar4.f, dyb.o0(zjwVar4.f44501a), (ekw) feeVar.c(), false, false, false, axh0.f1625a);
                            case 1:
                                xqv xqvVar = (xqv) obj5;
                                xqvVar.getClass();
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                CyberGamesPage cyberGamesPage2 = ((ekw) mcoVar.b().c()).f7971a;
                                Map map = (Map) ((fee) mcoVar.h.getValue()).c();
                                zjw zjwVar5 = mcoVar.e;
                                boolean z = zjwVar5.e;
                                sff0 sff0Var = zjwVar5.b;
                                List list8 = zjwVar5.c;
                                v5l0 v5l0Var2 = sff0Var.g.y;
                                boolean z2 = zjwVar5.s;
                                ctf0Var2.getClass();
                                cyberGamesPage2.getClass();
                                map.getClass();
                                list8.getClass();
                                List list9 = xqvVar.f41340a;
                                List list10 = xqvVar.b;
                                if (list9.isEmpty() && list10.isEmpty()) {
                                    return iun.f15405a;
                                }
                                sip sipVar = (sip) map.get(cyberGamesPage2);
                                if (sipVar == null) {
                                    sipVar = sip.c;
                                }
                                String strI = ua80.i("HeaderFocusAllEventsUiModel_", sipVar.name(), BundleUtil.UNDERLINE_TAG, org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2));
                                int i7 = (list10.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.cyber_games_popular_live : (list9.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.popular_line_games : R.string.popular;
                                lsm0 lsm0Var = ctf0Var2.b;
                                v7m v7mVar = new v7m(new c8m(lsm0Var.a(i7, Arrays.copyOf(new Object[0], 0)), rv00.m));
                                if (list9.isEmpty() || list10.isEmpty()) {
                                    a4xVarG0 = lak0.c;
                                } else {
                                    String strA2 = lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[0], 0));
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strA2.toUpperCase(locale);
                                    upperCase.getClass();
                                    dsv dsvVar = new dsv(upperCase, sip.c, kpb.u(sipVar));
                                    String upperCase2 = lsm0Var.a(R.string.line, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                                    upperCase2.getClass();
                                    a4xVarG0 = dyb.g0(dsvVar, new dsv(upperCase2, sip.b, !kpb.u(sipVar)));
                                }
                                esv esvVar = new esv("", v7mVar, a4xVarG0);
                                List list11 = (!list9.isEmpty() && (list10.isEmpty() || kpb.u(sipVar))) ? list9 : list10;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list11, 10));
                                Iterator it5 = list11.iterator();
                                int i8 = 0;
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    eih eihVar = (eih) next2;
                                    long j = eihVar.f7859a;
                                    if (j == 40) {
                                        j = eihVar.b;
                                    }
                                    String str3 = strA;
                                    Iterator it6 = it5;
                                    String str4 = "HeaderFocusDisciplineGame_" + org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2) + j + kpb.u(sipVar);
                                    zqv zqvVar = new zqv(new y7m(new c8m(eihVar.c, n7mVar)));
                                    q0s q0sVar2 = q0s.b;
                                    ArrayList arrayList4 = eihVar.e;
                                    n7m n7mVar2 = n7mVar;
                                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                                    Iterator it7 = arrayList4.iterator();
                                    while (it7.hasNext()) {
                                        d0t d0tVar = (d0t) it7.next();
                                        Iterator it8 = list8.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next = it8.next();
                                                it2 = it7;
                                                Iterator it9 = it8;
                                                if (((lok0) next).f20396a != d0tVar.O) {
                                                    it8 = it9;
                                                    it7 = it2;
                                                }
                                            } else {
                                                it2 = it7;
                                                next = null;
                                            }
                                        }
                                        lok0 lok0Var = (lok0) next;
                                        boolean z3 = sff0Var.J;
                                        String str5 = eihVar.f;
                                        boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                                        eih eihVar2 = eihVar;
                                        sff0 sff0Var2 = sff0Var;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
                                        Iterator it10 = list8.iterator();
                                        while (it10.hasNext()) {
                                            arrayList6.add(Integer.valueOf(((lok0) it10.next()).f20396a));
                                        }
                                        boolean z4 = lok0Var != null ? lok0Var.n : false;
                                        boolean z5 = lok0Var != null ? lok0Var.p : false;
                                        boolean zEquals2 = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE);
                                        if (d0tVar.K.isEmpty()) {
                                            List list12 = d0tVar.k;
                                            if (list12 == null || !list12.isEmpty()) {
                                                Iterator it11 = list12.iterator();
                                                while (true) {
                                                    if (it11.hasNext()) {
                                                        if (!((d0t) it11.next()).K.isEmpty()) {
                                                            m5l0Var = l5l0.f19463a;
                                                        }
                                                    }
                                                }
                                            }
                                            m5l0Var = i5l0.f14197a;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                        m5l0 m5l0Var2 = m5l0Var;
                                        String str6 = lok0Var != null ? lok0Var.u : null;
                                        arrayList5.add(wwb.V(d0tVar, ctf0Var2, y78Var2, z, z3, str5, zEquals, arrayList6, z4, z5, zEquals2, v5l0Var2, m5l0Var2, str6 == null ? str3 : str6, z2));
                                        sff0Var = sff0Var2;
                                        it7 = it2;
                                        eihVar = eihVar2;
                                    }
                                    arrayList3.add(new vqv(str4, zqvVar, new vb90(q0sVar2, dyb.o0(arrayList5), true, z2), j));
                                    i8 = i9;
                                    sff0Var = sff0Var;
                                    strA = str3;
                                    it5 = it6;
                                    n7mVar = n7mVar2;
                                }
                                return kotlin.collections.a.c(new yqv(strI, esvVar, dyb.o0(arrayList3), sipVar));
                            case 2:
                                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar6 = mcoVar.e;
                                return qbc.I(zBooleanValue, ctf0Var3, zjwVar6.f, zjwVar6.b.c.f7565a.d);
                            case 3:
                                List list13 = (List) obj5;
                                list13.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.b().c()).f7971a;
                                ctf0 ctf0Var4 = mcoVar.b;
                                ctf0Var4.getClass();
                                cyberGamesPage3.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj6 : list13) {
                                    if (((uog) obj6).b.length() > 0) {
                                        arrayList7.add(obj6);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj7 : arrayList7) {
                                    if (hashSet.add(Integer.valueOf(((uog) obj7).f36012a))) {
                                        arrayList8.add(obj7);
                                    }
                                }
                                List<uog> listD0 = CollectionsKt.D0(arrayList8, 16);
                                if (listD0.isEmpty() || !cyberGamesPage3.equals(CyberGamesPage.Real.INSTANCE)) {
                                    return iun.f15405a;
                                }
                                v7m v7mVar2 = new v7m(new c8m(ctf0Var4.b.a(R.string.partners, Arrays.copyOf(new Object[0], 0)), n7mVar));
                                ArrayList arrayList9 = new ArrayList(r3d.q(listD0, 10));
                                for (uog uogVar : listD0) {
                                    String strValueOf = String.valueOf(uogVar.f36012a);
                                    String str7 = uogVar.c;
                                    String str8 = uogVar.b;
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str9 = uogVar.l;
                                    if (str9.length() == 0) {
                                        sb3.setLength(0);
                                    } else {
                                        if (StringsKt.O(str9, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str9, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb3.append('/');
                                            }
                                            sb3.append(StringsKt.y0(str9, c));
                                        }
                                        sb3.setLength(i3);
                                        sb3.append(str9);
                                    }
                                    arrayList9.add(new zx80(strValueOf, str7, str8, sb3.toString()));
                                }
                                return kotlin.collections.a.c(new crv("HeaderFocusPartnersCardCollectionUiModel", v7mVar2, new wx80(dyb.r0(arrayList9))));
                            case 4:
                                fee feeVar2 = (fee) obj5;
                                feeVar2.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) feeVar2.c()).f7971a;
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.j.getValue()).d.getValue()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) ((fee) mcoVar.k.getValue()).c()).booleanValue();
                                ctf0 ctf0Var5 = mcoVar.b;
                                cyberGamesPage4.getClass();
                                ctf0Var5.getClass();
                                boolean zEquals3 = cyberGamesPage4.equals(CyberGamesPage.Real.INSTANCE);
                                dtb cxfVar = dxf.f6843a;
                                if (zEquals3) {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    lsm0 lsm0Var2 = ctf0Var5.b;
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var2.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        lc00VarB2.add(new fxf(R.drawable.ic_glyph_gift, lsm0Var2.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_calendar_inactive, lsm0Var2.a(R.string.calendar, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.c));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                                } else if (cyberGamesPage4.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                    lc00 lc00VarB3 = kotlin.collections.a.b();
                                    if (zBooleanValue4) {
                                        i4 = 0;
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_categories, ctf0Var5.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.d));
                                    } else {
                                        i4 = 0;
                                    }
                                    if (zBooleanValue2) {
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_gift, ctf0Var5.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[i4], i4)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB3.add(new fxf(R.drawable.ic_glyph_tournaments, ctf0Var5.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB3));
                                } else {
                                    if (!cyberGamesPage4.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                                        t9f.b();
                                        return null;
                                    }
                                    lc00 lc00VarB4 = kotlin.collections.a.b();
                                    lsm0 lsm0Var3 = ctf0Var5.b;
                                    lc00VarB4.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        String strA3 = lsm0Var3.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0));
                                        if (zBooleanValue3) {
                                            cxfVar = new cxf();
                                        }
                                        lc00VarB4.add(new fxf(R.drawable.ic_glyph_gift, strA3, cxfVar, exf.b));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB4));
                                }
                                return new hf9(a4xVarO0, "ButtonsCollectionUiModel" + cyberGamesPage4);
                            case 5:
                                List list14 = (List) obj5;
                                list14.getClass();
                                ctf0 ctf0Var6 = mcoVar.b;
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.b().c()).f7971a;
                                zjw zjwVar7 = mcoVar.e;
                                boolean z6 = zjwVar7.f || zjwVar7.f44501a.size() <= 1;
                                ctf0Var6.getClass();
                                cyberGamesPage5.getClass();
                                String strConcat = "DisciplineBlockUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                if (z6) {
                                    if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                        str = "Real";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                        str = "Virtual";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                        str = "1XCyber";
                                    } else {
                                        t9f.b();
                                    }
                                    sb = new StringBuilder(ujn.h);
                                    strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
                                    if (strK.length() == 0) {
                                        sb.setLength(0);
                                    } else if (StringsKt.O(strK, ujn.h, false)) {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    } else {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    }
                                    String string = sb.toString();
                                    arrayList = new ArrayList();
                                    for (Object obj8 : list14) {
                                        if (((ypl0) obj8).b.length() > 0) {
                                            arrayList.add(obj8);
                                        }
                                    }
                                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                    it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        ypl0 ypl0Var = (ypl0) it3.next();
                                        long j2 = ypl0Var.f43037a;
                                        String str10 = ypl0Var.b;
                                        sb2 = new StringBuilder(ujn.h);
                                        str2 = ypl0Var.c.j;
                                        str2.getClass();
                                        if (str2.length() == 0) {
                                            sb2.setLength(0);
                                            it4 = it3;
                                        } else {
                                            it4 = it3;
                                            i5 = 0;
                                            if (StringsKt.O(str2, ujn.h, false)) {
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else if (kotlin.text.c.x(str2, "https://", false)) {
                                                i5 = 0;
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else {
                                                if (sb2.length() > 0) {
                                                    i6 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i6 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr = new char[i6];
                                                cArr[0] = c2;
                                                sb2.append(StringsKt.y0(str2, cArr));
                                            }
                                        }
                                        arrayList2.add(new e8m(j2, new n0x(sb2.toString()), str10));
                                        it3 = it4;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        a4xVarF = lak0.c;
                                    } else {
                                        lc00 lc00VarB5 = kotlin.collections.a.b();
                                        lc00VarB5.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                        a4xVarF = cs0.f(lc00VarB5, lc00VarB5, arrayList2);
                                    }
                                    return new dok(strConcat, strA, string, new i8m(a4xVarF));
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    strA = ctf0Var6.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    strA = ctf0Var6.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    strA = ctf0Var6.b.a(R.string.one_x_cyber, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    str = "Real";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    str = "Virtual";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    str = "1XCyber";
                                } else {
                                    t9f.b();
                                }
                                sb = new StringBuilder(ujn.h);
                                strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
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
                                String string2 = sb.toString();
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    if (((ypl0) obj8).b.length() > 0) {
                                        arrayList.add(obj8);
                                    }
                                }
                                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    ypl0 ypl0Var2 = (ypl0) it3.next();
                                    long j3 = ypl0Var2.f43037a;
                                    String str11 = ypl0Var2.b;
                                    sb2 = new StringBuilder(ujn.h);
                                    str2 = ypl0Var2.c.j;
                                    str2.getClass();
                                    if (str2.length() == 0) {
                                        sb2.setLength(0);
                                        it4 = it3;
                                    } else {
                                        it4 = it3;
                                        i5 = 0;
                                        if (StringsKt.O(str2, ujn.h, false)) {
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                                            i5 = 0;
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else {
                                            if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                i6 = 1;
                                                c2 = '/';
                                            } else {
                                                sb2.append('/');
                                                c2 = '/';
                                                i6 = 1;
                                            }
                                            char[] cArr2 = new char[i6];
                                            cArr2[0] = c2;
                                            sb2.append(StringsKt.y0(str2, cArr2));
                                        }
                                    }
                                    arrayList2.add(new e8m(j3, new n0x(sb2.toString()), str11));
                                    it3 = it4;
                                }
                                if (arrayList2.isEmpty()) {
                                    a4xVarF = lak0.c;
                                } else {
                                    lc00 lc00VarB6 = kotlin.collections.a.b();
                                    lc00VarB6.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                    a4xVarF = cs0.f(lc00VarB6, lc00VarB6, arrayList2);
                                }
                                return new dok(strConcat, strA, string2, new i8m(a4xVarF));
                                return null;
                            case 6:
                                n52 n52Var = (n52) obj5;
                                n52Var.getClass();
                                return grv.a(n52Var, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                            default:
                                n52 n52Var2 = (n52) obj5;
                                n52Var2.getClass();
                                return grv.a(n52Var2, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar4 = this.e;
                this.m = maz.b(new yw9(jwb.X((jih) zjwVar4.h.get(zjwVar4.g.f7971a)), new Function1(this) { // from class: a.irv
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:262:0x0143 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:264:0x012e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
                    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[PHI: r10
  0x01b9: PHI (r10v42 int) = (r10v41 int), (r10v47 int) binds: [B:64:0x018a, B:67:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
                    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        a4x a4xVarG0;
                        Iterator it2;
                        Object next;
                        m5l0 m5l0Var;
                        int i3;
                        char c;
                        a4x a4xVarO0;
                        int i4;
                        String str;
                        StringBuilder sb;
                        String strK;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Iterator it3;
                        a4x a4xVarF;
                        StringBuilder sb2;
                        String str2;
                        Iterator it4;
                        int i5;
                        int i6;
                        char c2;
                        byte b4 = b2;
                        n7m n7mVar = n7m.f23049a;
                        String strA = "";
                        mco mcoVar = this.b;
                        switch (b4) {
                            case 0:
                                fee feeVar = (fee) obj5;
                                feeVar.getClass();
                                zjw zjwVar5 = mcoVar.e;
                                return new gkw(!zjwVar5.f, dyb.o0(zjwVar5.f44501a), (ekw) feeVar.c(), false, false, false, axh0.f1625a);
                            case 1:
                                xqv xqvVar = (xqv) obj5;
                                xqvVar.getClass();
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                CyberGamesPage cyberGamesPage2 = ((ekw) mcoVar.b().c()).f7971a;
                                Map map = (Map) ((fee) mcoVar.h.getValue()).c();
                                zjw zjwVar6 = mcoVar.e;
                                boolean z = zjwVar6.e;
                                sff0 sff0Var = zjwVar6.b;
                                List list8 = zjwVar6.c;
                                v5l0 v5l0Var2 = sff0Var.g.y;
                                boolean z2 = zjwVar6.s;
                                ctf0Var2.getClass();
                                cyberGamesPage2.getClass();
                                map.getClass();
                                list8.getClass();
                                List list9 = xqvVar.f41340a;
                                List list10 = xqvVar.b;
                                if (list9.isEmpty() && list10.isEmpty()) {
                                    return iun.f15405a;
                                }
                                sip sipVar = (sip) map.get(cyberGamesPage2);
                                if (sipVar == null) {
                                    sipVar = sip.c;
                                }
                                String strI = ua80.i("HeaderFocusAllEventsUiModel_", sipVar.name(), BundleUtil.UNDERLINE_TAG, org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2));
                                int i7 = (list10.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.cyber_games_popular_live : (list9.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.popular_line_games : R.string.popular;
                                lsm0 lsm0Var = ctf0Var2.b;
                                v7m v7mVar = new v7m(new c8m(lsm0Var.a(i7, Arrays.copyOf(new Object[0], 0)), rv00.m));
                                if (list9.isEmpty() || list10.isEmpty()) {
                                    a4xVarG0 = lak0.c;
                                } else {
                                    String strA2 = lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[0], 0));
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strA2.toUpperCase(locale);
                                    upperCase.getClass();
                                    dsv dsvVar = new dsv(upperCase, sip.c, kpb.u(sipVar));
                                    String upperCase2 = lsm0Var.a(R.string.line, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                                    upperCase2.getClass();
                                    a4xVarG0 = dyb.g0(dsvVar, new dsv(upperCase2, sip.b, !kpb.u(sipVar)));
                                }
                                esv esvVar = new esv("", v7mVar, a4xVarG0);
                                List list11 = (!list9.isEmpty() && (list10.isEmpty() || kpb.u(sipVar))) ? list9 : list10;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list11, 10));
                                Iterator it5 = list11.iterator();
                                int i8 = 0;
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    eih eihVar = (eih) next2;
                                    long j = eihVar.f7859a;
                                    if (j == 40) {
                                        j = eihVar.b;
                                    }
                                    String str3 = strA;
                                    Iterator it6 = it5;
                                    String str4 = "HeaderFocusDisciplineGame_" + org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2) + j + kpb.u(sipVar);
                                    zqv zqvVar = new zqv(new y7m(new c8m(eihVar.c, n7mVar)));
                                    q0s q0sVar2 = q0s.b;
                                    ArrayList arrayList4 = eihVar.e;
                                    n7m n7mVar2 = n7mVar;
                                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                                    Iterator it7 = arrayList4.iterator();
                                    while (it7.hasNext()) {
                                        d0t d0tVar = (d0t) it7.next();
                                        Iterator it8 = list8.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next = it8.next();
                                                it2 = it7;
                                                Iterator it9 = it8;
                                                if (((lok0) next).f20396a != d0tVar.O) {
                                                    it8 = it9;
                                                    it7 = it2;
                                                }
                                            } else {
                                                it2 = it7;
                                                next = null;
                                            }
                                        }
                                        lok0 lok0Var = (lok0) next;
                                        boolean z3 = sff0Var.J;
                                        String str5 = eihVar.f;
                                        boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                                        eih eihVar2 = eihVar;
                                        sff0 sff0Var2 = sff0Var;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
                                        Iterator it10 = list8.iterator();
                                        while (it10.hasNext()) {
                                            arrayList6.add(Integer.valueOf(((lok0) it10.next()).f20396a));
                                        }
                                        boolean z4 = lok0Var != null ? lok0Var.n : false;
                                        boolean z5 = lok0Var != null ? lok0Var.p : false;
                                        boolean zEquals2 = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE);
                                        if (d0tVar.K.isEmpty()) {
                                            List list12 = d0tVar.k;
                                            if (list12 == null || !list12.isEmpty()) {
                                                Iterator it11 = list12.iterator();
                                                while (true) {
                                                    if (it11.hasNext()) {
                                                        if (!((d0t) it11.next()).K.isEmpty()) {
                                                            m5l0Var = l5l0.f19463a;
                                                        }
                                                    }
                                                }
                                            }
                                            m5l0Var = i5l0.f14197a;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                        m5l0 m5l0Var2 = m5l0Var;
                                        String str6 = lok0Var != null ? lok0Var.u : null;
                                        arrayList5.add(wwb.V(d0tVar, ctf0Var2, y78Var2, z, z3, str5, zEquals, arrayList6, z4, z5, zEquals2, v5l0Var2, m5l0Var2, str6 == null ? str3 : str6, z2));
                                        sff0Var = sff0Var2;
                                        it7 = it2;
                                        eihVar = eihVar2;
                                    }
                                    arrayList3.add(new vqv(str4, zqvVar, new vb90(q0sVar2, dyb.o0(arrayList5), true, z2), j));
                                    i8 = i9;
                                    sff0Var = sff0Var;
                                    strA = str3;
                                    it5 = it6;
                                    n7mVar = n7mVar2;
                                }
                                return kotlin.collections.a.c(new yqv(strI, esvVar, dyb.o0(arrayList3), sipVar));
                            case 2:
                                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar7 = mcoVar.e;
                                return qbc.I(zBooleanValue, ctf0Var3, zjwVar7.f, zjwVar7.b.c.f7565a.d);
                            case 3:
                                List list13 = (List) obj5;
                                list13.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.b().c()).f7971a;
                                ctf0 ctf0Var4 = mcoVar.b;
                                ctf0Var4.getClass();
                                cyberGamesPage3.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj6 : list13) {
                                    if (((uog) obj6).b.length() > 0) {
                                        arrayList7.add(obj6);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj7 : arrayList7) {
                                    if (hashSet.add(Integer.valueOf(((uog) obj7).f36012a))) {
                                        arrayList8.add(obj7);
                                    }
                                }
                                List<uog> listD0 = CollectionsKt.D0(arrayList8, 16);
                                if (listD0.isEmpty() || !cyberGamesPage3.equals(CyberGamesPage.Real.INSTANCE)) {
                                    return iun.f15405a;
                                }
                                v7m v7mVar2 = new v7m(new c8m(ctf0Var4.b.a(R.string.partners, Arrays.copyOf(new Object[0], 0)), n7mVar));
                                ArrayList arrayList9 = new ArrayList(r3d.q(listD0, 10));
                                for (uog uogVar : listD0) {
                                    String strValueOf = String.valueOf(uogVar.f36012a);
                                    String str7 = uogVar.c;
                                    String str8 = uogVar.b;
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str9 = uogVar.l;
                                    if (str9.length() == 0) {
                                        sb3.setLength(0);
                                    } else {
                                        if (StringsKt.O(str9, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str9, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb3.append('/');
                                            }
                                            sb3.append(StringsKt.y0(str9, c));
                                        }
                                        sb3.setLength(i3);
                                        sb3.append(str9);
                                    }
                                    arrayList9.add(new zx80(strValueOf, str7, str8, sb3.toString()));
                                }
                                return kotlin.collections.a.c(new crv("HeaderFocusPartnersCardCollectionUiModel", v7mVar2, new wx80(dyb.r0(arrayList9))));
                            case 4:
                                fee feeVar2 = (fee) obj5;
                                feeVar2.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) feeVar2.c()).f7971a;
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.j.getValue()).d.getValue()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) ((fee) mcoVar.k.getValue()).c()).booleanValue();
                                ctf0 ctf0Var5 = mcoVar.b;
                                cyberGamesPage4.getClass();
                                ctf0Var5.getClass();
                                boolean zEquals3 = cyberGamesPage4.equals(CyberGamesPage.Real.INSTANCE);
                                dtb cxfVar = dxf.f6843a;
                                if (zEquals3) {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    lsm0 lsm0Var2 = ctf0Var5.b;
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var2.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        lc00VarB2.add(new fxf(R.drawable.ic_glyph_gift, lsm0Var2.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_calendar_inactive, lsm0Var2.a(R.string.calendar, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.c));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                                } else if (cyberGamesPage4.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                    lc00 lc00VarB3 = kotlin.collections.a.b();
                                    if (zBooleanValue4) {
                                        i4 = 0;
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_categories, ctf0Var5.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.d));
                                    } else {
                                        i4 = 0;
                                    }
                                    if (zBooleanValue2) {
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_gift, ctf0Var5.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[i4], i4)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB3.add(new fxf(R.drawable.ic_glyph_tournaments, ctf0Var5.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB3));
                                } else {
                                    if (!cyberGamesPage4.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                                        t9f.b();
                                        return null;
                                    }
                                    lc00 lc00VarB4 = kotlin.collections.a.b();
                                    lsm0 lsm0Var3 = ctf0Var5.b;
                                    lc00VarB4.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        String strA3 = lsm0Var3.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0));
                                        if (zBooleanValue3) {
                                            cxfVar = new cxf();
                                        }
                                        lc00VarB4.add(new fxf(R.drawable.ic_glyph_gift, strA3, cxfVar, exf.b));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB4));
                                }
                                return new hf9(a4xVarO0, "ButtonsCollectionUiModel" + cyberGamesPage4);
                            case 5:
                                List list14 = (List) obj5;
                                list14.getClass();
                                ctf0 ctf0Var6 = mcoVar.b;
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.b().c()).f7971a;
                                zjw zjwVar8 = mcoVar.e;
                                boolean z6 = zjwVar8.f || zjwVar8.f44501a.size() <= 1;
                                ctf0Var6.getClass();
                                cyberGamesPage5.getClass();
                                String strConcat = "DisciplineBlockUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                if (z6) {
                                    if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                        str = "Real";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                        str = "Virtual";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                        str = "1XCyber";
                                    } else {
                                        t9f.b();
                                    }
                                    sb = new StringBuilder(ujn.h);
                                    strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
                                    if (strK.length() == 0) {
                                        sb.setLength(0);
                                    } else if (StringsKt.O(strK, ujn.h, false)) {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    } else {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    }
                                    String string2 = sb.toString();
                                    arrayList = new ArrayList();
                                    for (Object obj8 : list14) {
                                        if (((ypl0) obj8).b.length() > 0) {
                                            arrayList.add(obj8);
                                        }
                                    }
                                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                    it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        ypl0 ypl0Var2 = (ypl0) it3.next();
                                        long j3 = ypl0Var2.f43037a;
                                        String str11 = ypl0Var2.b;
                                        sb2 = new StringBuilder(ujn.h);
                                        str2 = ypl0Var2.c.j;
                                        str2.getClass();
                                        if (str2.length() == 0) {
                                            sb2.setLength(0);
                                            it4 = it3;
                                        } else {
                                            it4 = it3;
                                            i5 = 0;
                                            if (StringsKt.O(str2, ujn.h, false)) {
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else if (kotlin.text.c.x(str2, "https://", false)) {
                                                i5 = 0;
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else {
                                                if (sb2.length() > 0) {
                                                    i6 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i6 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr2 = new char[i6];
                                                cArr2[0] = c2;
                                                sb2.append(StringsKt.y0(str2, cArr2));
                                            }
                                        }
                                        arrayList2.add(new e8m(j3, new n0x(sb2.toString()), str11));
                                        it3 = it4;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        a4xVarF = lak0.c;
                                    } else {
                                        lc00 lc00VarB6 = kotlin.collections.a.b();
                                        lc00VarB6.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                        a4xVarF = cs0.f(lc00VarB6, lc00VarB6, arrayList2);
                                    }
                                    return new dok(strConcat, strA, string2, new i8m(a4xVarF));
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    strA = ctf0Var6.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    strA = ctf0Var6.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    strA = ctf0Var6.b.a(R.string.one_x_cyber, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    str = "Real";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    str = "Virtual";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    str = "1XCyber";
                                } else {
                                    t9f.b();
                                }
                                sb = new StringBuilder(ujn.h);
                                strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
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
                                String string3 = sb.toString();
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    if (((ypl0) obj8).b.length() > 0) {
                                        arrayList.add(obj8);
                                    }
                                }
                                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    ypl0 ypl0Var3 = (ypl0) it3.next();
                                    long j4 = ypl0Var3.f43037a;
                                    String str12 = ypl0Var3.b;
                                    sb2 = new StringBuilder(ujn.h);
                                    str2 = ypl0Var3.c.j;
                                    str2.getClass();
                                    if (str2.length() == 0) {
                                        sb2.setLength(0);
                                        it4 = it3;
                                    } else {
                                        it4 = it3;
                                        i5 = 0;
                                        if (StringsKt.O(str2, ujn.h, false)) {
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                                            i5 = 0;
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else {
                                            if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                i6 = 1;
                                                c2 = '/';
                                            } else {
                                                sb2.append('/');
                                                c2 = '/';
                                                i6 = 1;
                                            }
                                            char[] cArr3 = new char[i6];
                                            cArr3[0] = c2;
                                            sb2.append(StringsKt.y0(str2, cArr3));
                                        }
                                    }
                                    arrayList2.add(new e8m(j4, new n0x(sb2.toString()), str12));
                                    it3 = it4;
                                }
                                if (arrayList2.isEmpty()) {
                                    a4xVarF = lak0.c;
                                } else {
                                    lc00 lc00VarB7 = kotlin.collections.a.b();
                                    lc00VarB7.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                    a4xVarF = cs0.f(lc00VarB7, lc00VarB7, arrayList2);
                                }
                                return new dok(strConcat, strA, string3, new i8m(a4xVarF));
                                return null;
                            case 6:
                                n52 n52Var = (n52) obj5;
                                n52Var.getClass();
                                return grv.a(n52Var, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                            default:
                                n52 n52Var2 = (n52) obj5;
                                n52Var2.getClass();
                                return grv.a(n52Var2, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar5 = this.e;
                jih jihVar = (jih) zjwVar5.h.get(zjwVar5.g.f7971a);
                final byte b4 = 2;
                this.n = maz.b(new yw9(Boolean.valueOf(!(jihVar != null && kih.a(jihVar, ((ekw) b().c()).f7971a, true))), new Function1(this) { // from class: a.irv
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:262:0x0143 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:264:0x012e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
                    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[PHI: r10
  0x01b9: PHI (r10v42 int) = (r10v41 int), (r10v47 int) binds: [B:64:0x018a, B:67:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
                    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        a4x a4xVarG0;
                        Iterator it2;
                        Object next;
                        m5l0 m5l0Var;
                        int i3;
                        char c;
                        a4x a4xVarO0;
                        int i4;
                        String str;
                        StringBuilder sb;
                        String strK;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Iterator it3;
                        a4x a4xVarF;
                        StringBuilder sb2;
                        String str2;
                        Iterator it4;
                        int i5;
                        int i6;
                        char c2;
                        byte b5 = b4;
                        n7m n7mVar = n7m.f23049a;
                        String strA = "";
                        mco mcoVar = this.b;
                        switch (b5) {
                            case 0:
                                fee feeVar = (fee) obj5;
                                feeVar.getClass();
                                zjw zjwVar6 = mcoVar.e;
                                return new gkw(!zjwVar6.f, dyb.o0(zjwVar6.f44501a), (ekw) feeVar.c(), false, false, false, axh0.f1625a);
                            case 1:
                                xqv xqvVar = (xqv) obj5;
                                xqvVar.getClass();
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                CyberGamesPage cyberGamesPage2 = ((ekw) mcoVar.b().c()).f7971a;
                                Map map = (Map) ((fee) mcoVar.h.getValue()).c();
                                zjw zjwVar7 = mcoVar.e;
                                boolean z = zjwVar7.e;
                                sff0 sff0Var = zjwVar7.b;
                                List list8 = zjwVar7.c;
                                v5l0 v5l0Var2 = sff0Var.g.y;
                                boolean z2 = zjwVar7.s;
                                ctf0Var2.getClass();
                                cyberGamesPage2.getClass();
                                map.getClass();
                                list8.getClass();
                                List list9 = xqvVar.f41340a;
                                List list10 = xqvVar.b;
                                if (list9.isEmpty() && list10.isEmpty()) {
                                    return iun.f15405a;
                                }
                                sip sipVar = (sip) map.get(cyberGamesPage2);
                                if (sipVar == null) {
                                    sipVar = sip.c;
                                }
                                String strI = ua80.i("HeaderFocusAllEventsUiModel_", sipVar.name(), BundleUtil.UNDERLINE_TAG, org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2));
                                int i7 = (list10.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.cyber_games_popular_live : (list9.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.popular_line_games : R.string.popular;
                                lsm0 lsm0Var = ctf0Var2.b;
                                v7m v7mVar = new v7m(new c8m(lsm0Var.a(i7, Arrays.copyOf(new Object[0], 0)), rv00.m));
                                if (list9.isEmpty() || list10.isEmpty()) {
                                    a4xVarG0 = lak0.c;
                                } else {
                                    String strA2 = lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[0], 0));
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strA2.toUpperCase(locale);
                                    upperCase.getClass();
                                    dsv dsvVar = new dsv(upperCase, sip.c, kpb.u(sipVar));
                                    String upperCase2 = lsm0Var.a(R.string.line, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                                    upperCase2.getClass();
                                    a4xVarG0 = dyb.g0(dsvVar, new dsv(upperCase2, sip.b, !kpb.u(sipVar)));
                                }
                                esv esvVar = new esv("", v7mVar, a4xVarG0);
                                List list11 = (!list9.isEmpty() && (list10.isEmpty() || kpb.u(sipVar))) ? list9 : list10;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list11, 10));
                                Iterator it5 = list11.iterator();
                                int i8 = 0;
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    eih eihVar = (eih) next2;
                                    long j = eihVar.f7859a;
                                    if (j == 40) {
                                        j = eihVar.b;
                                    }
                                    String str3 = strA;
                                    Iterator it6 = it5;
                                    String str4 = "HeaderFocusDisciplineGame_" + org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2) + j + kpb.u(sipVar);
                                    zqv zqvVar = new zqv(new y7m(new c8m(eihVar.c, n7mVar)));
                                    q0s q0sVar2 = q0s.b;
                                    ArrayList arrayList4 = eihVar.e;
                                    n7m n7mVar2 = n7mVar;
                                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                                    Iterator it7 = arrayList4.iterator();
                                    while (it7.hasNext()) {
                                        d0t d0tVar = (d0t) it7.next();
                                        Iterator it8 = list8.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next = it8.next();
                                                it2 = it7;
                                                Iterator it9 = it8;
                                                if (((lok0) next).f20396a != d0tVar.O) {
                                                    it8 = it9;
                                                    it7 = it2;
                                                }
                                            } else {
                                                it2 = it7;
                                                next = null;
                                            }
                                        }
                                        lok0 lok0Var = (lok0) next;
                                        boolean z3 = sff0Var.J;
                                        String str5 = eihVar.f;
                                        boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                                        eih eihVar2 = eihVar;
                                        sff0 sff0Var2 = sff0Var;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
                                        Iterator it10 = list8.iterator();
                                        while (it10.hasNext()) {
                                            arrayList6.add(Integer.valueOf(((lok0) it10.next()).f20396a));
                                        }
                                        boolean z4 = lok0Var != null ? lok0Var.n : false;
                                        boolean z5 = lok0Var != null ? lok0Var.p : false;
                                        boolean zEquals2 = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE);
                                        if (d0tVar.K.isEmpty()) {
                                            List list12 = d0tVar.k;
                                            if (list12 == null || !list12.isEmpty()) {
                                                Iterator it11 = list12.iterator();
                                                while (true) {
                                                    if (it11.hasNext()) {
                                                        if (!((d0t) it11.next()).K.isEmpty()) {
                                                            m5l0Var = l5l0.f19463a;
                                                        }
                                                    }
                                                }
                                            }
                                            m5l0Var = i5l0.f14197a;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                        m5l0 m5l0Var2 = m5l0Var;
                                        String str6 = lok0Var != null ? lok0Var.u : null;
                                        arrayList5.add(wwb.V(d0tVar, ctf0Var2, y78Var2, z, z3, str5, zEquals, arrayList6, z4, z5, zEquals2, v5l0Var2, m5l0Var2, str6 == null ? str3 : str6, z2));
                                        sff0Var = sff0Var2;
                                        it7 = it2;
                                        eihVar = eihVar2;
                                    }
                                    arrayList3.add(new vqv(str4, zqvVar, new vb90(q0sVar2, dyb.o0(arrayList5), true, z2), j));
                                    i8 = i9;
                                    sff0Var = sff0Var;
                                    strA = str3;
                                    it5 = it6;
                                    n7mVar = n7mVar2;
                                }
                                return kotlin.collections.a.c(new yqv(strI, esvVar, dyb.o0(arrayList3), sipVar));
                            case 2:
                                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar8 = mcoVar.e;
                                return qbc.I(zBooleanValue, ctf0Var3, zjwVar8.f, zjwVar8.b.c.f7565a.d);
                            case 3:
                                List list13 = (List) obj5;
                                list13.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.b().c()).f7971a;
                                ctf0 ctf0Var4 = mcoVar.b;
                                ctf0Var4.getClass();
                                cyberGamesPage3.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj6 : list13) {
                                    if (((uog) obj6).b.length() > 0) {
                                        arrayList7.add(obj6);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj7 : arrayList7) {
                                    if (hashSet.add(Integer.valueOf(((uog) obj7).f36012a))) {
                                        arrayList8.add(obj7);
                                    }
                                }
                                List<uog> listD0 = CollectionsKt.D0(arrayList8, 16);
                                if (listD0.isEmpty() || !cyberGamesPage3.equals(CyberGamesPage.Real.INSTANCE)) {
                                    return iun.f15405a;
                                }
                                v7m v7mVar2 = new v7m(new c8m(ctf0Var4.b.a(R.string.partners, Arrays.copyOf(new Object[0], 0)), n7mVar));
                                ArrayList arrayList9 = new ArrayList(r3d.q(listD0, 10));
                                for (uog uogVar : listD0) {
                                    String strValueOf = String.valueOf(uogVar.f36012a);
                                    String str7 = uogVar.c;
                                    String str8 = uogVar.b;
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str9 = uogVar.l;
                                    if (str9.length() == 0) {
                                        sb3.setLength(0);
                                    } else {
                                        if (StringsKt.O(str9, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str9, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb3.append('/');
                                            }
                                            sb3.append(StringsKt.y0(str9, c));
                                        }
                                        sb3.setLength(i3);
                                        sb3.append(str9);
                                    }
                                    arrayList9.add(new zx80(strValueOf, str7, str8, sb3.toString()));
                                }
                                return kotlin.collections.a.c(new crv("HeaderFocusPartnersCardCollectionUiModel", v7mVar2, new wx80(dyb.r0(arrayList9))));
                            case 4:
                                fee feeVar2 = (fee) obj5;
                                feeVar2.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) feeVar2.c()).f7971a;
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.j.getValue()).d.getValue()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) ((fee) mcoVar.k.getValue()).c()).booleanValue();
                                ctf0 ctf0Var5 = mcoVar.b;
                                cyberGamesPage4.getClass();
                                ctf0Var5.getClass();
                                boolean zEquals3 = cyberGamesPage4.equals(CyberGamesPage.Real.INSTANCE);
                                dtb cxfVar = dxf.f6843a;
                                if (zEquals3) {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    lsm0 lsm0Var2 = ctf0Var5.b;
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var2.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        lc00VarB2.add(new fxf(R.drawable.ic_glyph_gift, lsm0Var2.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_calendar_inactive, lsm0Var2.a(R.string.calendar, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.c));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                                } else if (cyberGamesPage4.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                    lc00 lc00VarB3 = kotlin.collections.a.b();
                                    if (zBooleanValue4) {
                                        i4 = 0;
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_categories, ctf0Var5.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.d));
                                    } else {
                                        i4 = 0;
                                    }
                                    if (zBooleanValue2) {
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_gift, ctf0Var5.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[i4], i4)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB3.add(new fxf(R.drawable.ic_glyph_tournaments, ctf0Var5.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB3));
                                } else {
                                    if (!cyberGamesPage4.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                                        t9f.b();
                                        return null;
                                    }
                                    lc00 lc00VarB4 = kotlin.collections.a.b();
                                    lsm0 lsm0Var3 = ctf0Var5.b;
                                    lc00VarB4.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        String strA3 = lsm0Var3.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0));
                                        if (zBooleanValue3) {
                                            cxfVar = new cxf();
                                        }
                                        lc00VarB4.add(new fxf(R.drawable.ic_glyph_gift, strA3, cxfVar, exf.b));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB4));
                                }
                                return new hf9(a4xVarO0, "ButtonsCollectionUiModel" + cyberGamesPage4);
                            case 5:
                                List list14 = (List) obj5;
                                list14.getClass();
                                ctf0 ctf0Var6 = mcoVar.b;
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.b().c()).f7971a;
                                zjw zjwVar9 = mcoVar.e;
                                boolean z6 = zjwVar9.f || zjwVar9.f44501a.size() <= 1;
                                ctf0Var6.getClass();
                                cyberGamesPage5.getClass();
                                String strConcat = "DisciplineBlockUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                if (z6) {
                                    if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                        str = "Real";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                        str = "Virtual";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                        str = "1XCyber";
                                    } else {
                                        t9f.b();
                                    }
                                    sb = new StringBuilder(ujn.h);
                                    strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
                                    if (strK.length() == 0) {
                                        sb.setLength(0);
                                    } else if (StringsKt.O(strK, ujn.h, false)) {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    } else {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    }
                                    String string3 = sb.toString();
                                    arrayList = new ArrayList();
                                    for (Object obj8 : list14) {
                                        if (((ypl0) obj8).b.length() > 0) {
                                            arrayList.add(obj8);
                                        }
                                    }
                                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                    it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        ypl0 ypl0Var3 = (ypl0) it3.next();
                                        long j4 = ypl0Var3.f43037a;
                                        String str12 = ypl0Var3.b;
                                        sb2 = new StringBuilder(ujn.h);
                                        str2 = ypl0Var3.c.j;
                                        str2.getClass();
                                        if (str2.length() == 0) {
                                            sb2.setLength(0);
                                            it4 = it3;
                                        } else {
                                            it4 = it3;
                                            i5 = 0;
                                            if (StringsKt.O(str2, ujn.h, false)) {
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else if (kotlin.text.c.x(str2, "https://", false)) {
                                                i5 = 0;
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else {
                                                if (sb2.length() > 0) {
                                                    i6 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i6 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr3 = new char[i6];
                                                cArr3[0] = c2;
                                                sb2.append(StringsKt.y0(str2, cArr3));
                                            }
                                        }
                                        arrayList2.add(new e8m(j4, new n0x(sb2.toString()), str12));
                                        it3 = it4;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        a4xVarF = lak0.c;
                                    } else {
                                        lc00 lc00VarB7 = kotlin.collections.a.b();
                                        lc00VarB7.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                        a4xVarF = cs0.f(lc00VarB7, lc00VarB7, arrayList2);
                                    }
                                    return new dok(strConcat, strA, string3, new i8m(a4xVarF));
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    strA = ctf0Var6.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    strA = ctf0Var6.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    strA = ctf0Var6.b.a(R.string.one_x_cyber, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    str = "Real";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    str = "Virtual";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    str = "1XCyber";
                                } else {
                                    t9f.b();
                                }
                                sb = new StringBuilder(ujn.h);
                                strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
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
                                String string4 = sb.toString();
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    if (((ypl0) obj8).b.length() > 0) {
                                        arrayList.add(obj8);
                                    }
                                }
                                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    ypl0 ypl0Var4 = (ypl0) it3.next();
                                    long j5 = ypl0Var4.f43037a;
                                    String str13 = ypl0Var4.b;
                                    sb2 = new StringBuilder(ujn.h);
                                    str2 = ypl0Var4.c.j;
                                    str2.getClass();
                                    if (str2.length() == 0) {
                                        sb2.setLength(0);
                                        it4 = it3;
                                    } else {
                                        it4 = it3;
                                        i5 = 0;
                                        if (StringsKt.O(str2, ujn.h, false)) {
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                                            i5 = 0;
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else {
                                            if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                i6 = 1;
                                                c2 = '/';
                                            } else {
                                                sb2.append('/');
                                                c2 = '/';
                                                i6 = 1;
                                            }
                                            char[] cArr4 = new char[i6];
                                            cArr4[0] = c2;
                                            sb2.append(StringsKt.y0(str2, cArr4));
                                        }
                                    }
                                    arrayList2.add(new e8m(j5, new n0x(sb2.toString()), str13));
                                    it3 = it4;
                                }
                                if (arrayList2.isEmpty()) {
                                    a4xVarF = lak0.c;
                                } else {
                                    lc00 lc00VarB8 = kotlin.collections.a.b();
                                    lc00VarB8.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                    a4xVarF = cs0.f(lc00VarB8, lc00VarB8, arrayList2);
                                }
                                return new dok(strConcat, strA, string4, new i8m(a4xVarF));
                                return null;
                            case 6:
                                n52 n52Var = (n52) obj5;
                                n52Var.getClass();
                                return grv.a(n52Var, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                            default:
                                n52 n52Var2 = (n52) obj5;
                                n52Var2.getClass();
                                return grv.a(n52Var2, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar6 = this.e;
                jih jihVar2 = (jih) zjwVar6.h.get(zjwVar6.g.f7971a);
                if (jihVar2 != null) {
                    Object obj5 = jihVar2.e;
                    e0g0 e0g0Var = j0g0.b;
                    list = (List) (obj5 instanceof g0g0 ? null : obj5);
                } else {
                    list = null;
                }
                final byte b5 = 3;
                this.o = maz.b(new yw9(list == null ? iun.f15405a : list, new Function1(this) { // from class: a.irv
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:262:0x0143 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:264:0x012e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
                    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[PHI: r10
  0x01b9: PHI (r10v42 int) = (r10v41 int), (r10v47 int) binds: [B:64:0x018a, B:67:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
                    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        a4x a4xVarG0;
                        Iterator it2;
                        Object next;
                        m5l0 m5l0Var;
                        int i3;
                        char c;
                        a4x a4xVarO0;
                        int i4;
                        String str;
                        StringBuilder sb;
                        String strK;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Iterator it3;
                        a4x a4xVarF;
                        StringBuilder sb2;
                        String str2;
                        Iterator it4;
                        int i5;
                        int i6;
                        char c2;
                        byte b6 = b5;
                        n7m n7mVar = n7m.f23049a;
                        String strA = "";
                        mco mcoVar = this.b;
                        switch (b6) {
                            case 0:
                                fee feeVar = (fee) obj6;
                                feeVar.getClass();
                                zjw zjwVar7 = mcoVar.e;
                                return new gkw(!zjwVar7.f, dyb.o0(zjwVar7.f44501a), (ekw) feeVar.c(), false, false, false, axh0.f1625a);
                            case 1:
                                xqv xqvVar = (xqv) obj6;
                                xqvVar.getClass();
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                CyberGamesPage cyberGamesPage2 = ((ekw) mcoVar.b().c()).f7971a;
                                Map map = (Map) ((fee) mcoVar.h.getValue()).c();
                                zjw zjwVar8 = mcoVar.e;
                                boolean z = zjwVar8.e;
                                sff0 sff0Var = zjwVar8.b;
                                List list8 = zjwVar8.c;
                                v5l0 v5l0Var2 = sff0Var.g.y;
                                boolean z2 = zjwVar8.s;
                                ctf0Var2.getClass();
                                cyberGamesPage2.getClass();
                                map.getClass();
                                list8.getClass();
                                List list9 = xqvVar.f41340a;
                                List list10 = xqvVar.b;
                                if (list9.isEmpty() && list10.isEmpty()) {
                                    return iun.f15405a;
                                }
                                sip sipVar = (sip) map.get(cyberGamesPage2);
                                if (sipVar == null) {
                                    sipVar = sip.c;
                                }
                                String strI = ua80.i("HeaderFocusAllEventsUiModel_", sipVar.name(), BundleUtil.UNDERLINE_TAG, org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2));
                                int i7 = (list10.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.cyber_games_popular_live : (list9.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.popular_line_games : R.string.popular;
                                lsm0 lsm0Var = ctf0Var2.b;
                                v7m v7mVar = new v7m(new c8m(lsm0Var.a(i7, Arrays.copyOf(new Object[0], 0)), rv00.m));
                                if (list9.isEmpty() || list10.isEmpty()) {
                                    a4xVarG0 = lak0.c;
                                } else {
                                    String strA2 = lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[0], 0));
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strA2.toUpperCase(locale);
                                    upperCase.getClass();
                                    dsv dsvVar = new dsv(upperCase, sip.c, kpb.u(sipVar));
                                    String upperCase2 = lsm0Var.a(R.string.line, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                                    upperCase2.getClass();
                                    a4xVarG0 = dyb.g0(dsvVar, new dsv(upperCase2, sip.b, !kpb.u(sipVar)));
                                }
                                esv esvVar = new esv("", v7mVar, a4xVarG0);
                                List list11 = (!list9.isEmpty() && (list10.isEmpty() || kpb.u(sipVar))) ? list9 : list10;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list11, 10));
                                Iterator it5 = list11.iterator();
                                int i8 = 0;
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    eih eihVar = (eih) next2;
                                    long j = eihVar.f7859a;
                                    if (j == 40) {
                                        j = eihVar.b;
                                    }
                                    String str3 = strA;
                                    Iterator it6 = it5;
                                    String str4 = "HeaderFocusDisciplineGame_" + org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2) + j + kpb.u(sipVar);
                                    zqv zqvVar = new zqv(new y7m(new c8m(eihVar.c, n7mVar)));
                                    q0s q0sVar2 = q0s.b;
                                    ArrayList arrayList4 = eihVar.e;
                                    n7m n7mVar2 = n7mVar;
                                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                                    Iterator it7 = arrayList4.iterator();
                                    while (it7.hasNext()) {
                                        d0t d0tVar = (d0t) it7.next();
                                        Iterator it8 = list8.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next = it8.next();
                                                it2 = it7;
                                                Iterator it9 = it8;
                                                if (((lok0) next).f20396a != d0tVar.O) {
                                                    it8 = it9;
                                                    it7 = it2;
                                                }
                                            } else {
                                                it2 = it7;
                                                next = null;
                                            }
                                        }
                                        lok0 lok0Var = (lok0) next;
                                        boolean z3 = sff0Var.J;
                                        String str5 = eihVar.f;
                                        boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                                        eih eihVar2 = eihVar;
                                        sff0 sff0Var2 = sff0Var;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
                                        Iterator it10 = list8.iterator();
                                        while (it10.hasNext()) {
                                            arrayList6.add(Integer.valueOf(((lok0) it10.next()).f20396a));
                                        }
                                        boolean z4 = lok0Var != null ? lok0Var.n : false;
                                        boolean z5 = lok0Var != null ? lok0Var.p : false;
                                        boolean zEquals2 = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE);
                                        if (d0tVar.K.isEmpty()) {
                                            List list12 = d0tVar.k;
                                            if (list12 == null || !list12.isEmpty()) {
                                                Iterator it11 = list12.iterator();
                                                while (true) {
                                                    if (it11.hasNext()) {
                                                        if (!((d0t) it11.next()).K.isEmpty()) {
                                                            m5l0Var = l5l0.f19463a;
                                                        }
                                                    }
                                                }
                                            }
                                            m5l0Var = i5l0.f14197a;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                        m5l0 m5l0Var2 = m5l0Var;
                                        String str6 = lok0Var != null ? lok0Var.u : null;
                                        arrayList5.add(wwb.V(d0tVar, ctf0Var2, y78Var2, z, z3, str5, zEquals, arrayList6, z4, z5, zEquals2, v5l0Var2, m5l0Var2, str6 == null ? str3 : str6, z2));
                                        sff0Var = sff0Var2;
                                        it7 = it2;
                                        eihVar = eihVar2;
                                    }
                                    arrayList3.add(new vqv(str4, zqvVar, new vb90(q0sVar2, dyb.o0(arrayList5), true, z2), j));
                                    i8 = i9;
                                    sff0Var = sff0Var;
                                    strA = str3;
                                    it5 = it6;
                                    n7mVar = n7mVar2;
                                }
                                return kotlin.collections.a.c(new yqv(strI, esvVar, dyb.o0(arrayList3), sipVar));
                            case 2:
                                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar9 = mcoVar.e;
                                return qbc.I(zBooleanValue, ctf0Var3, zjwVar9.f, zjwVar9.b.c.f7565a.d);
                            case 3:
                                List list13 = (List) obj6;
                                list13.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.b().c()).f7971a;
                                ctf0 ctf0Var4 = mcoVar.b;
                                ctf0Var4.getClass();
                                cyberGamesPage3.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj7 : list13) {
                                    if (((uog) obj7).b.length() > 0) {
                                        arrayList7.add(obj7);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj8 : arrayList7) {
                                    if (hashSet.add(Integer.valueOf(((uog) obj8).f36012a))) {
                                        arrayList8.add(obj8);
                                    }
                                }
                                List<uog> listD0 = CollectionsKt.D0(arrayList8, 16);
                                if (listD0.isEmpty() || !cyberGamesPage3.equals(CyberGamesPage.Real.INSTANCE)) {
                                    return iun.f15405a;
                                }
                                v7m v7mVar2 = new v7m(new c8m(ctf0Var4.b.a(R.string.partners, Arrays.copyOf(new Object[0], 0)), n7mVar));
                                ArrayList arrayList9 = new ArrayList(r3d.q(listD0, 10));
                                for (uog uogVar : listD0) {
                                    String strValueOf = String.valueOf(uogVar.f36012a);
                                    String str7 = uogVar.c;
                                    String str8 = uogVar.b;
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str9 = uogVar.l;
                                    if (str9.length() == 0) {
                                        sb3.setLength(0);
                                    } else {
                                        if (StringsKt.O(str9, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str9, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb3.append('/');
                                            }
                                            sb3.append(StringsKt.y0(str9, c));
                                        }
                                        sb3.setLength(i3);
                                        sb3.append(str9);
                                    }
                                    arrayList9.add(new zx80(strValueOf, str7, str8, sb3.toString()));
                                }
                                return kotlin.collections.a.c(new crv("HeaderFocusPartnersCardCollectionUiModel", v7mVar2, new wx80(dyb.r0(arrayList9))));
                            case 4:
                                fee feeVar2 = (fee) obj6;
                                feeVar2.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) feeVar2.c()).f7971a;
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.j.getValue()).d.getValue()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) ((fee) mcoVar.k.getValue()).c()).booleanValue();
                                ctf0 ctf0Var5 = mcoVar.b;
                                cyberGamesPage4.getClass();
                                ctf0Var5.getClass();
                                boolean zEquals3 = cyberGamesPage4.equals(CyberGamesPage.Real.INSTANCE);
                                dtb cxfVar = dxf.f6843a;
                                if (zEquals3) {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    lsm0 lsm0Var2 = ctf0Var5.b;
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var2.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        lc00VarB2.add(new fxf(R.drawable.ic_glyph_gift, lsm0Var2.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_calendar_inactive, lsm0Var2.a(R.string.calendar, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.c));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                                } else if (cyberGamesPage4.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                    lc00 lc00VarB3 = kotlin.collections.a.b();
                                    if (zBooleanValue4) {
                                        i4 = 0;
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_categories, ctf0Var5.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.d));
                                    } else {
                                        i4 = 0;
                                    }
                                    if (zBooleanValue2) {
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_gift, ctf0Var5.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[i4], i4)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB3.add(new fxf(R.drawable.ic_glyph_tournaments, ctf0Var5.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB3));
                                } else {
                                    if (!cyberGamesPage4.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                                        t9f.b();
                                        return null;
                                    }
                                    lc00 lc00VarB4 = kotlin.collections.a.b();
                                    lsm0 lsm0Var3 = ctf0Var5.b;
                                    lc00VarB4.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        String strA3 = lsm0Var3.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0));
                                        if (zBooleanValue3) {
                                            cxfVar = new cxf();
                                        }
                                        lc00VarB4.add(new fxf(R.drawable.ic_glyph_gift, strA3, cxfVar, exf.b));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB4));
                                }
                                return new hf9(a4xVarO0, "ButtonsCollectionUiModel" + cyberGamesPage4);
                            case 5:
                                List list14 = (List) obj6;
                                list14.getClass();
                                ctf0 ctf0Var6 = mcoVar.b;
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.b().c()).f7971a;
                                zjw zjwVar10 = mcoVar.e;
                                boolean z6 = zjwVar10.f || zjwVar10.f44501a.size() <= 1;
                                ctf0Var6.getClass();
                                cyberGamesPage5.getClass();
                                String strConcat = "DisciplineBlockUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                if (z6) {
                                    if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                        str = "Real";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                        str = "Virtual";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                        str = "1XCyber";
                                    } else {
                                        t9f.b();
                                    }
                                    sb = new StringBuilder(ujn.h);
                                    strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
                                    if (strK.length() == 0) {
                                        sb.setLength(0);
                                    } else if (StringsKt.O(strK, ujn.h, false)) {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    } else {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    }
                                    String string4 = sb.toString();
                                    arrayList = new ArrayList();
                                    for (Object obj9 : list14) {
                                        if (((ypl0) obj9).b.length() > 0) {
                                            arrayList.add(obj9);
                                        }
                                    }
                                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                    it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        ypl0 ypl0Var4 = (ypl0) it3.next();
                                        long j5 = ypl0Var4.f43037a;
                                        String str13 = ypl0Var4.b;
                                        sb2 = new StringBuilder(ujn.h);
                                        str2 = ypl0Var4.c.j;
                                        str2.getClass();
                                        if (str2.length() == 0) {
                                            sb2.setLength(0);
                                            it4 = it3;
                                        } else {
                                            it4 = it3;
                                            i5 = 0;
                                            if (StringsKt.O(str2, ujn.h, false)) {
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else if (kotlin.text.c.x(str2, "https://", false)) {
                                                i5 = 0;
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else {
                                                if (sb2.length() > 0) {
                                                    i6 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i6 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr4 = new char[i6];
                                                cArr4[0] = c2;
                                                sb2.append(StringsKt.y0(str2, cArr4));
                                            }
                                        }
                                        arrayList2.add(new e8m(j5, new n0x(sb2.toString()), str13));
                                        it3 = it4;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        a4xVarF = lak0.c;
                                    } else {
                                        lc00 lc00VarB8 = kotlin.collections.a.b();
                                        lc00VarB8.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                        a4xVarF = cs0.f(lc00VarB8, lc00VarB8, arrayList2);
                                    }
                                    return new dok(strConcat, strA, string4, new i8m(a4xVarF));
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    strA = ctf0Var6.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    strA = ctf0Var6.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    strA = ctf0Var6.b.a(R.string.one_x_cyber, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    str = "Real";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    str = "Virtual";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    str = "1XCyber";
                                } else {
                                    t9f.b();
                                }
                                sb = new StringBuilder(ujn.h);
                                strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
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
                                String string5 = sb.toString();
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    if (((ypl0) obj9).b.length() > 0) {
                                        arrayList.add(obj9);
                                    }
                                }
                                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    ypl0 ypl0Var5 = (ypl0) it3.next();
                                    long j6 = ypl0Var5.f43037a;
                                    String str14 = ypl0Var5.b;
                                    sb2 = new StringBuilder(ujn.h);
                                    str2 = ypl0Var5.c.j;
                                    str2.getClass();
                                    if (str2.length() == 0) {
                                        sb2.setLength(0);
                                        it4 = it3;
                                    } else {
                                        it4 = it3;
                                        i5 = 0;
                                        if (StringsKt.O(str2, ujn.h, false)) {
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                                            i5 = 0;
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else {
                                            if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                i6 = 1;
                                                c2 = '/';
                                            } else {
                                                sb2.append('/');
                                                c2 = '/';
                                                i6 = 1;
                                            }
                                            char[] cArr5 = new char[i6];
                                            cArr5[0] = c2;
                                            sb2.append(StringsKt.y0(str2, cArr5));
                                        }
                                    }
                                    arrayList2.add(new e8m(j6, new n0x(sb2.toString()), str14));
                                    it3 = it4;
                                }
                                if (arrayList2.isEmpty()) {
                                    a4xVarF = lak0.c;
                                } else {
                                    lc00 lc00VarB9 = kotlin.collections.a.b();
                                    lc00VarB9.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                    a4xVarF = cs0.f(lc00VarB9, lc00VarB9, arrayList2);
                                }
                                return new dok(strConcat, strA, string5, new i8m(a4xVarF));
                                return null;
                            case 6:
                                n52 n52Var = (n52) obj6;
                                n52Var.getClass();
                                return grv.a(n52Var, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                            default:
                                n52 n52Var2 = (n52) obj6;
                                n52Var2.getClass();
                                return grv.a(n52Var2, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                        }
                    }
                }, (byte) 20));
                final byte b6 = 4;
                this.p = maz.b(new yw9(b(), new Function1(this) { // from class: a.irv
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:262:0x0143 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:264:0x012e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
                    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[PHI: r10
  0x01b9: PHI (r10v42 int) = (r10v41 int), (r10v47 int) binds: [B:64:0x018a, B:67:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
                    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        a4x a4xVarG0;
                        Iterator it2;
                        Object next;
                        m5l0 m5l0Var;
                        int i3;
                        char c;
                        a4x a4xVarO0;
                        int i4;
                        String str;
                        StringBuilder sb;
                        String strK;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Iterator it3;
                        a4x a4xVarF;
                        StringBuilder sb2;
                        String str2;
                        Iterator it4;
                        int i5;
                        int i6;
                        char c2;
                        byte b7 = b6;
                        n7m n7mVar = n7m.f23049a;
                        String strA = "";
                        mco mcoVar = this.b;
                        switch (b7) {
                            case 0:
                                fee feeVar = (fee) obj6;
                                feeVar.getClass();
                                zjw zjwVar7 = mcoVar.e;
                                return new gkw(!zjwVar7.f, dyb.o0(zjwVar7.f44501a), (ekw) feeVar.c(), false, false, false, axh0.f1625a);
                            case 1:
                                xqv xqvVar = (xqv) obj6;
                                xqvVar.getClass();
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                CyberGamesPage cyberGamesPage2 = ((ekw) mcoVar.b().c()).f7971a;
                                Map map = (Map) ((fee) mcoVar.h.getValue()).c();
                                zjw zjwVar8 = mcoVar.e;
                                boolean z = zjwVar8.e;
                                sff0 sff0Var = zjwVar8.b;
                                List list8 = zjwVar8.c;
                                v5l0 v5l0Var2 = sff0Var.g.y;
                                boolean z2 = zjwVar8.s;
                                ctf0Var2.getClass();
                                cyberGamesPage2.getClass();
                                map.getClass();
                                list8.getClass();
                                List list9 = xqvVar.f41340a;
                                List list10 = xqvVar.b;
                                if (list9.isEmpty() && list10.isEmpty()) {
                                    return iun.f15405a;
                                }
                                sip sipVar = (sip) map.get(cyberGamesPage2);
                                if (sipVar == null) {
                                    sipVar = sip.c;
                                }
                                String strI = ua80.i("HeaderFocusAllEventsUiModel_", sipVar.name(), BundleUtil.UNDERLINE_TAG, org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2));
                                int i7 = (list10.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.cyber_games_popular_live : (list9.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.popular_line_games : R.string.popular;
                                lsm0 lsm0Var = ctf0Var2.b;
                                v7m v7mVar = new v7m(new c8m(lsm0Var.a(i7, Arrays.copyOf(new Object[0], 0)), rv00.m));
                                if (list9.isEmpty() || list10.isEmpty()) {
                                    a4xVarG0 = lak0.c;
                                } else {
                                    String strA2 = lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[0], 0));
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strA2.toUpperCase(locale);
                                    upperCase.getClass();
                                    dsv dsvVar = new dsv(upperCase, sip.c, kpb.u(sipVar));
                                    String upperCase2 = lsm0Var.a(R.string.line, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                                    upperCase2.getClass();
                                    a4xVarG0 = dyb.g0(dsvVar, new dsv(upperCase2, sip.b, !kpb.u(sipVar)));
                                }
                                esv esvVar = new esv("", v7mVar, a4xVarG0);
                                List list11 = (!list9.isEmpty() && (list10.isEmpty() || kpb.u(sipVar))) ? list9 : list10;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list11, 10));
                                Iterator it5 = list11.iterator();
                                int i8 = 0;
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    eih eihVar = (eih) next2;
                                    long j = eihVar.f7859a;
                                    if (j == 40) {
                                        j = eihVar.b;
                                    }
                                    String str3 = strA;
                                    Iterator it6 = it5;
                                    String str4 = "HeaderFocusDisciplineGame_" + org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2) + j + kpb.u(sipVar);
                                    zqv zqvVar = new zqv(new y7m(new c8m(eihVar.c, n7mVar)));
                                    q0s q0sVar2 = q0s.b;
                                    ArrayList arrayList4 = eihVar.e;
                                    n7m n7mVar2 = n7mVar;
                                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                                    Iterator it7 = arrayList4.iterator();
                                    while (it7.hasNext()) {
                                        d0t d0tVar = (d0t) it7.next();
                                        Iterator it8 = list8.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next = it8.next();
                                                it2 = it7;
                                                Iterator it9 = it8;
                                                if (((lok0) next).f20396a != d0tVar.O) {
                                                    it8 = it9;
                                                    it7 = it2;
                                                }
                                            } else {
                                                it2 = it7;
                                                next = null;
                                            }
                                        }
                                        lok0 lok0Var = (lok0) next;
                                        boolean z3 = sff0Var.J;
                                        String str5 = eihVar.f;
                                        boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                                        eih eihVar2 = eihVar;
                                        sff0 sff0Var2 = sff0Var;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
                                        Iterator it10 = list8.iterator();
                                        while (it10.hasNext()) {
                                            arrayList6.add(Integer.valueOf(((lok0) it10.next()).f20396a));
                                        }
                                        boolean z4 = lok0Var != null ? lok0Var.n : false;
                                        boolean z5 = lok0Var != null ? lok0Var.p : false;
                                        boolean zEquals2 = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE);
                                        if (d0tVar.K.isEmpty()) {
                                            List list12 = d0tVar.k;
                                            if (list12 == null || !list12.isEmpty()) {
                                                Iterator it11 = list12.iterator();
                                                while (true) {
                                                    if (it11.hasNext()) {
                                                        if (!((d0t) it11.next()).K.isEmpty()) {
                                                            m5l0Var = l5l0.f19463a;
                                                        }
                                                    }
                                                }
                                            }
                                            m5l0Var = i5l0.f14197a;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                        m5l0 m5l0Var2 = m5l0Var;
                                        String str6 = lok0Var != null ? lok0Var.u : null;
                                        arrayList5.add(wwb.V(d0tVar, ctf0Var2, y78Var2, z, z3, str5, zEquals, arrayList6, z4, z5, zEquals2, v5l0Var2, m5l0Var2, str6 == null ? str3 : str6, z2));
                                        sff0Var = sff0Var2;
                                        it7 = it2;
                                        eihVar = eihVar2;
                                    }
                                    arrayList3.add(new vqv(str4, zqvVar, new vb90(q0sVar2, dyb.o0(arrayList5), true, z2), j));
                                    i8 = i9;
                                    sff0Var = sff0Var;
                                    strA = str3;
                                    it5 = it6;
                                    n7mVar = n7mVar2;
                                }
                                return kotlin.collections.a.c(new yqv(strI, esvVar, dyb.o0(arrayList3), sipVar));
                            case 2:
                                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar9 = mcoVar.e;
                                return qbc.I(zBooleanValue, ctf0Var3, zjwVar9.f, zjwVar9.b.c.f7565a.d);
                            case 3:
                                List list13 = (List) obj6;
                                list13.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.b().c()).f7971a;
                                ctf0 ctf0Var4 = mcoVar.b;
                                ctf0Var4.getClass();
                                cyberGamesPage3.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj7 : list13) {
                                    if (((uog) obj7).b.length() > 0) {
                                        arrayList7.add(obj7);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj8 : arrayList7) {
                                    if (hashSet.add(Integer.valueOf(((uog) obj8).f36012a))) {
                                        arrayList8.add(obj8);
                                    }
                                }
                                List<uog> listD0 = CollectionsKt.D0(arrayList8, 16);
                                if (listD0.isEmpty() || !cyberGamesPage3.equals(CyberGamesPage.Real.INSTANCE)) {
                                    return iun.f15405a;
                                }
                                v7m v7mVar2 = new v7m(new c8m(ctf0Var4.b.a(R.string.partners, Arrays.copyOf(new Object[0], 0)), n7mVar));
                                ArrayList arrayList9 = new ArrayList(r3d.q(listD0, 10));
                                for (uog uogVar : listD0) {
                                    String strValueOf = String.valueOf(uogVar.f36012a);
                                    String str7 = uogVar.c;
                                    String str8 = uogVar.b;
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str9 = uogVar.l;
                                    if (str9.length() == 0) {
                                        sb3.setLength(0);
                                    } else {
                                        if (StringsKt.O(str9, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str9, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb3.append('/');
                                            }
                                            sb3.append(StringsKt.y0(str9, c));
                                        }
                                        sb3.setLength(i3);
                                        sb3.append(str9);
                                    }
                                    arrayList9.add(new zx80(strValueOf, str7, str8, sb3.toString()));
                                }
                                return kotlin.collections.a.c(new crv("HeaderFocusPartnersCardCollectionUiModel", v7mVar2, new wx80(dyb.r0(arrayList9))));
                            case 4:
                                fee feeVar2 = (fee) obj6;
                                feeVar2.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) feeVar2.c()).f7971a;
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.j.getValue()).d.getValue()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) ((fee) mcoVar.k.getValue()).c()).booleanValue();
                                ctf0 ctf0Var5 = mcoVar.b;
                                cyberGamesPage4.getClass();
                                ctf0Var5.getClass();
                                boolean zEquals3 = cyberGamesPage4.equals(CyberGamesPage.Real.INSTANCE);
                                dtb cxfVar = dxf.f6843a;
                                if (zEquals3) {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    lsm0 lsm0Var2 = ctf0Var5.b;
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var2.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        lc00VarB2.add(new fxf(R.drawable.ic_glyph_gift, lsm0Var2.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_calendar_inactive, lsm0Var2.a(R.string.calendar, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.c));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                                } else if (cyberGamesPage4.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                    lc00 lc00VarB3 = kotlin.collections.a.b();
                                    if (zBooleanValue4) {
                                        i4 = 0;
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_categories, ctf0Var5.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.d));
                                    } else {
                                        i4 = 0;
                                    }
                                    if (zBooleanValue2) {
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_gift, ctf0Var5.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[i4], i4)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB3.add(new fxf(R.drawable.ic_glyph_tournaments, ctf0Var5.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB3));
                                } else {
                                    if (!cyberGamesPage4.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                                        t9f.b();
                                        return null;
                                    }
                                    lc00 lc00VarB4 = kotlin.collections.a.b();
                                    lsm0 lsm0Var3 = ctf0Var5.b;
                                    lc00VarB4.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        String strA3 = lsm0Var3.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0));
                                        if (zBooleanValue3) {
                                            cxfVar = new cxf();
                                        }
                                        lc00VarB4.add(new fxf(R.drawable.ic_glyph_gift, strA3, cxfVar, exf.b));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB4));
                                }
                                return new hf9(a4xVarO0, "ButtonsCollectionUiModel" + cyberGamesPage4);
                            case 5:
                                List list14 = (List) obj6;
                                list14.getClass();
                                ctf0 ctf0Var6 = mcoVar.b;
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.b().c()).f7971a;
                                zjw zjwVar10 = mcoVar.e;
                                boolean z6 = zjwVar10.f || zjwVar10.f44501a.size() <= 1;
                                ctf0Var6.getClass();
                                cyberGamesPage5.getClass();
                                String strConcat = "DisciplineBlockUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                if (z6) {
                                    if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                        str = "Real";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                        str = "Virtual";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                        str = "1XCyber";
                                    } else {
                                        t9f.b();
                                    }
                                    sb = new StringBuilder(ujn.h);
                                    strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
                                    if (strK.length() == 0) {
                                        sb.setLength(0);
                                    } else if (StringsKt.O(strK, ujn.h, false)) {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    } else {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    }
                                    String string5 = sb.toString();
                                    arrayList = new ArrayList();
                                    for (Object obj9 : list14) {
                                        if (((ypl0) obj9).b.length() > 0) {
                                            arrayList.add(obj9);
                                        }
                                    }
                                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                    it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        ypl0 ypl0Var5 = (ypl0) it3.next();
                                        long j6 = ypl0Var5.f43037a;
                                        String str14 = ypl0Var5.b;
                                        sb2 = new StringBuilder(ujn.h);
                                        str2 = ypl0Var5.c.j;
                                        str2.getClass();
                                        if (str2.length() == 0) {
                                            sb2.setLength(0);
                                            it4 = it3;
                                        } else {
                                            it4 = it3;
                                            i5 = 0;
                                            if (StringsKt.O(str2, ujn.h, false)) {
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else if (kotlin.text.c.x(str2, "https://", false)) {
                                                i5 = 0;
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else {
                                                if (sb2.length() > 0) {
                                                    i6 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i6 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr5 = new char[i6];
                                                cArr5[0] = c2;
                                                sb2.append(StringsKt.y0(str2, cArr5));
                                            }
                                        }
                                        arrayList2.add(new e8m(j6, new n0x(sb2.toString()), str14));
                                        it3 = it4;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        a4xVarF = lak0.c;
                                    } else {
                                        lc00 lc00VarB9 = kotlin.collections.a.b();
                                        lc00VarB9.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                        a4xVarF = cs0.f(lc00VarB9, lc00VarB9, arrayList2);
                                    }
                                    return new dok(strConcat, strA, string5, new i8m(a4xVarF));
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    strA = ctf0Var6.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    strA = ctf0Var6.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    strA = ctf0Var6.b.a(R.string.one_x_cyber, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    str = "Real";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    str = "Virtual";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    str = "1XCyber";
                                } else {
                                    t9f.b();
                                }
                                sb = new StringBuilder(ujn.h);
                                strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
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
                                String string6 = sb.toString();
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    if (((ypl0) obj9).b.length() > 0) {
                                        arrayList.add(obj9);
                                    }
                                }
                                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    ypl0 ypl0Var6 = (ypl0) it3.next();
                                    long j7 = ypl0Var6.f43037a;
                                    String str15 = ypl0Var6.b;
                                    sb2 = new StringBuilder(ujn.h);
                                    str2 = ypl0Var6.c.j;
                                    str2.getClass();
                                    if (str2.length() == 0) {
                                        sb2.setLength(0);
                                        it4 = it3;
                                    } else {
                                        it4 = it3;
                                        i5 = 0;
                                        if (StringsKt.O(str2, ujn.h, false)) {
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                                            i5 = 0;
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else {
                                            if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                i6 = 1;
                                                c2 = '/';
                                            } else {
                                                sb2.append('/');
                                                c2 = '/';
                                                i6 = 1;
                                            }
                                            char[] cArr6 = new char[i6];
                                            cArr6[0] = c2;
                                            sb2.append(StringsKt.y0(str2, cArr6));
                                        }
                                    }
                                    arrayList2.add(new e8m(j7, new n0x(sb2.toString()), str15));
                                    it3 = it4;
                                }
                                if (arrayList2.isEmpty()) {
                                    a4xVarF = lak0.c;
                                } else {
                                    lc00 lc00VarB10 = kotlin.collections.a.b();
                                    lc00VarB10.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                    a4xVarF = cs0.f(lc00VarB10, lc00VarB10, arrayList2);
                                }
                                return new dok(strConcat, strA, string6, new i8m(a4xVarF));
                                return null;
                            case 6:
                                n52 n52Var = (n52) obj6;
                                n52Var.getClass();
                                return grv.a(n52Var, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                            default:
                                n52 n52Var2 = (n52) obj6;
                                n52Var2.getClass();
                                return grv.a(n52Var2, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar7 = this.e;
                jih jihVar3 = (jih) zjwVar7.h.get(zjwVar7.g.f7971a);
                if (jihVar3 != null) {
                    Object obj6 = jihVar3.b;
                    e0g0 e0g0Var2 = j0g0.b;
                    list2 = (List) (obj6 instanceof g0g0 ? null : obj6);
                } else {
                    list2 = null;
                }
                final byte b7 = 5;
                this.q = maz.b(new yw9(list2 == null ? iun.f15405a : list2, new Function1(this) { // from class: a.irv
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:262:0x0143 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:264:0x012e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
                    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[PHI: r10
  0x01b9: PHI (r10v42 int) = (r10v41 int), (r10v47 int) binds: [B:64:0x018a, B:67:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
                    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        a4x a4xVarG0;
                        Iterator it2;
                        Object next;
                        m5l0 m5l0Var;
                        int i3;
                        char c;
                        a4x a4xVarO0;
                        int i4;
                        String str;
                        StringBuilder sb;
                        String strK;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Iterator it3;
                        a4x a4xVarF;
                        StringBuilder sb2;
                        String str2;
                        Iterator it4;
                        int i5;
                        int i6;
                        char c2;
                        byte b8 = b7;
                        n7m n7mVar = n7m.f23049a;
                        String strA = "";
                        mco mcoVar = this.b;
                        switch (b8) {
                            case 0:
                                fee feeVar = (fee) obj7;
                                feeVar.getClass();
                                zjw zjwVar8 = mcoVar.e;
                                return new gkw(!zjwVar8.f, dyb.o0(zjwVar8.f44501a), (ekw) feeVar.c(), false, false, false, axh0.f1625a);
                            case 1:
                                xqv xqvVar = (xqv) obj7;
                                xqvVar.getClass();
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                CyberGamesPage cyberGamesPage2 = ((ekw) mcoVar.b().c()).f7971a;
                                Map map = (Map) ((fee) mcoVar.h.getValue()).c();
                                zjw zjwVar9 = mcoVar.e;
                                boolean z = zjwVar9.e;
                                sff0 sff0Var = zjwVar9.b;
                                List list8 = zjwVar9.c;
                                v5l0 v5l0Var2 = sff0Var.g.y;
                                boolean z2 = zjwVar9.s;
                                ctf0Var2.getClass();
                                cyberGamesPage2.getClass();
                                map.getClass();
                                list8.getClass();
                                List list9 = xqvVar.f41340a;
                                List list10 = xqvVar.b;
                                if (list9.isEmpty() && list10.isEmpty()) {
                                    return iun.f15405a;
                                }
                                sip sipVar = (sip) map.get(cyberGamesPage2);
                                if (sipVar == null) {
                                    sipVar = sip.c;
                                }
                                String strI = ua80.i("HeaderFocusAllEventsUiModel_", sipVar.name(), BundleUtil.UNDERLINE_TAG, org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2));
                                int i7 = (list10.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.cyber_games_popular_live : (list9.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.popular_line_games : R.string.popular;
                                lsm0 lsm0Var = ctf0Var2.b;
                                v7m v7mVar = new v7m(new c8m(lsm0Var.a(i7, Arrays.copyOf(new Object[0], 0)), rv00.m));
                                if (list9.isEmpty() || list10.isEmpty()) {
                                    a4xVarG0 = lak0.c;
                                } else {
                                    String strA2 = lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[0], 0));
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strA2.toUpperCase(locale);
                                    upperCase.getClass();
                                    dsv dsvVar = new dsv(upperCase, sip.c, kpb.u(sipVar));
                                    String upperCase2 = lsm0Var.a(R.string.line, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                                    upperCase2.getClass();
                                    a4xVarG0 = dyb.g0(dsvVar, new dsv(upperCase2, sip.b, !kpb.u(sipVar)));
                                }
                                esv esvVar = new esv("", v7mVar, a4xVarG0);
                                List list11 = (!list9.isEmpty() && (list10.isEmpty() || kpb.u(sipVar))) ? list9 : list10;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list11, 10));
                                Iterator it5 = list11.iterator();
                                int i8 = 0;
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    eih eihVar = (eih) next2;
                                    long j = eihVar.f7859a;
                                    if (j == 40) {
                                        j = eihVar.b;
                                    }
                                    String str3 = strA;
                                    Iterator it6 = it5;
                                    String str4 = "HeaderFocusDisciplineGame_" + org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2) + j + kpb.u(sipVar);
                                    zqv zqvVar = new zqv(new y7m(new c8m(eihVar.c, n7mVar)));
                                    q0s q0sVar2 = q0s.b;
                                    ArrayList arrayList4 = eihVar.e;
                                    n7m n7mVar2 = n7mVar;
                                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                                    Iterator it7 = arrayList4.iterator();
                                    while (it7.hasNext()) {
                                        d0t d0tVar = (d0t) it7.next();
                                        Iterator it8 = list8.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next = it8.next();
                                                it2 = it7;
                                                Iterator it9 = it8;
                                                if (((lok0) next).f20396a != d0tVar.O) {
                                                    it8 = it9;
                                                    it7 = it2;
                                                }
                                            } else {
                                                it2 = it7;
                                                next = null;
                                            }
                                        }
                                        lok0 lok0Var = (lok0) next;
                                        boolean z3 = sff0Var.J;
                                        String str5 = eihVar.f;
                                        boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                                        eih eihVar2 = eihVar;
                                        sff0 sff0Var2 = sff0Var;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
                                        Iterator it10 = list8.iterator();
                                        while (it10.hasNext()) {
                                            arrayList6.add(Integer.valueOf(((lok0) it10.next()).f20396a));
                                        }
                                        boolean z4 = lok0Var != null ? lok0Var.n : false;
                                        boolean z5 = lok0Var != null ? lok0Var.p : false;
                                        boolean zEquals2 = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE);
                                        if (d0tVar.K.isEmpty()) {
                                            List list12 = d0tVar.k;
                                            if (list12 == null || !list12.isEmpty()) {
                                                Iterator it11 = list12.iterator();
                                                while (true) {
                                                    if (it11.hasNext()) {
                                                        if (!((d0t) it11.next()).K.isEmpty()) {
                                                            m5l0Var = l5l0.f19463a;
                                                        }
                                                    }
                                                }
                                            }
                                            m5l0Var = i5l0.f14197a;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                        m5l0 m5l0Var2 = m5l0Var;
                                        String str6 = lok0Var != null ? lok0Var.u : null;
                                        arrayList5.add(wwb.V(d0tVar, ctf0Var2, y78Var2, z, z3, str5, zEquals, arrayList6, z4, z5, zEquals2, v5l0Var2, m5l0Var2, str6 == null ? str3 : str6, z2));
                                        sff0Var = sff0Var2;
                                        it7 = it2;
                                        eihVar = eihVar2;
                                    }
                                    arrayList3.add(new vqv(str4, zqvVar, new vb90(q0sVar2, dyb.o0(arrayList5), true, z2), j));
                                    i8 = i9;
                                    sff0Var = sff0Var;
                                    strA = str3;
                                    it5 = it6;
                                    n7mVar = n7mVar2;
                                }
                                return kotlin.collections.a.c(new yqv(strI, esvVar, dyb.o0(arrayList3), sipVar));
                            case 2:
                                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar10 = mcoVar.e;
                                return qbc.I(zBooleanValue, ctf0Var3, zjwVar10.f, zjwVar10.b.c.f7565a.d);
                            case 3:
                                List list13 = (List) obj7;
                                list13.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.b().c()).f7971a;
                                ctf0 ctf0Var4 = mcoVar.b;
                                ctf0Var4.getClass();
                                cyberGamesPage3.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj8 : list13) {
                                    if (((uog) obj8).b.length() > 0) {
                                        arrayList7.add(obj8);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj9 : arrayList7) {
                                    if (hashSet.add(Integer.valueOf(((uog) obj9).f36012a))) {
                                        arrayList8.add(obj9);
                                    }
                                }
                                List<uog> listD0 = CollectionsKt.D0(arrayList8, 16);
                                if (listD0.isEmpty() || !cyberGamesPage3.equals(CyberGamesPage.Real.INSTANCE)) {
                                    return iun.f15405a;
                                }
                                v7m v7mVar2 = new v7m(new c8m(ctf0Var4.b.a(R.string.partners, Arrays.copyOf(new Object[0], 0)), n7mVar));
                                ArrayList arrayList9 = new ArrayList(r3d.q(listD0, 10));
                                for (uog uogVar : listD0) {
                                    String strValueOf = String.valueOf(uogVar.f36012a);
                                    String str7 = uogVar.c;
                                    String str8 = uogVar.b;
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str9 = uogVar.l;
                                    if (str9.length() == 0) {
                                        sb3.setLength(0);
                                    } else {
                                        if (StringsKt.O(str9, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str9, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb3.append('/');
                                            }
                                            sb3.append(StringsKt.y0(str9, c));
                                        }
                                        sb3.setLength(i3);
                                        sb3.append(str9);
                                    }
                                    arrayList9.add(new zx80(strValueOf, str7, str8, sb3.toString()));
                                }
                                return kotlin.collections.a.c(new crv("HeaderFocusPartnersCardCollectionUiModel", v7mVar2, new wx80(dyb.r0(arrayList9))));
                            case 4:
                                fee feeVar2 = (fee) obj7;
                                feeVar2.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) feeVar2.c()).f7971a;
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.j.getValue()).d.getValue()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) ((fee) mcoVar.k.getValue()).c()).booleanValue();
                                ctf0 ctf0Var5 = mcoVar.b;
                                cyberGamesPage4.getClass();
                                ctf0Var5.getClass();
                                boolean zEquals3 = cyberGamesPage4.equals(CyberGamesPage.Real.INSTANCE);
                                dtb cxfVar = dxf.f6843a;
                                if (zEquals3) {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    lsm0 lsm0Var2 = ctf0Var5.b;
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var2.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        lc00VarB2.add(new fxf(R.drawable.ic_glyph_gift, lsm0Var2.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_calendar_inactive, lsm0Var2.a(R.string.calendar, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.c));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                                } else if (cyberGamesPage4.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                    lc00 lc00VarB3 = kotlin.collections.a.b();
                                    if (zBooleanValue4) {
                                        i4 = 0;
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_categories, ctf0Var5.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.d));
                                    } else {
                                        i4 = 0;
                                    }
                                    if (zBooleanValue2) {
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_gift, ctf0Var5.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[i4], i4)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB3.add(new fxf(R.drawable.ic_glyph_tournaments, ctf0Var5.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB3));
                                } else {
                                    if (!cyberGamesPage4.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                                        t9f.b();
                                        return null;
                                    }
                                    lc00 lc00VarB4 = kotlin.collections.a.b();
                                    lsm0 lsm0Var3 = ctf0Var5.b;
                                    lc00VarB4.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        String strA3 = lsm0Var3.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0));
                                        if (zBooleanValue3) {
                                            cxfVar = new cxf();
                                        }
                                        lc00VarB4.add(new fxf(R.drawable.ic_glyph_gift, strA3, cxfVar, exf.b));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB4));
                                }
                                return new hf9(a4xVarO0, "ButtonsCollectionUiModel" + cyberGamesPage4);
                            case 5:
                                List list14 = (List) obj7;
                                list14.getClass();
                                ctf0 ctf0Var6 = mcoVar.b;
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.b().c()).f7971a;
                                zjw zjwVar11 = mcoVar.e;
                                boolean z6 = zjwVar11.f || zjwVar11.f44501a.size() <= 1;
                                ctf0Var6.getClass();
                                cyberGamesPage5.getClass();
                                String strConcat = "DisciplineBlockUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                if (z6) {
                                    if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                        str = "Real";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                        str = "Virtual";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                        str = "1XCyber";
                                    } else {
                                        t9f.b();
                                    }
                                    sb = new StringBuilder(ujn.h);
                                    strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
                                    if (strK.length() == 0) {
                                        sb.setLength(0);
                                    } else if (StringsKt.O(strK, ujn.h, false)) {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    } else {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    }
                                    String string6 = sb.toString();
                                    arrayList = new ArrayList();
                                    for (Object obj10 : list14) {
                                        if (((ypl0) obj10).b.length() > 0) {
                                            arrayList.add(obj10);
                                        }
                                    }
                                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                    it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        ypl0 ypl0Var6 = (ypl0) it3.next();
                                        long j7 = ypl0Var6.f43037a;
                                        String str15 = ypl0Var6.b;
                                        sb2 = new StringBuilder(ujn.h);
                                        str2 = ypl0Var6.c.j;
                                        str2.getClass();
                                        if (str2.length() == 0) {
                                            sb2.setLength(0);
                                            it4 = it3;
                                        } else {
                                            it4 = it3;
                                            i5 = 0;
                                            if (StringsKt.O(str2, ujn.h, false)) {
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else if (kotlin.text.c.x(str2, "https://", false)) {
                                                i5 = 0;
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else {
                                                if (sb2.length() > 0) {
                                                    i6 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i6 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr6 = new char[i6];
                                                cArr6[0] = c2;
                                                sb2.append(StringsKt.y0(str2, cArr6));
                                            }
                                        }
                                        arrayList2.add(new e8m(j7, new n0x(sb2.toString()), str15));
                                        it3 = it4;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        a4xVarF = lak0.c;
                                    } else {
                                        lc00 lc00VarB10 = kotlin.collections.a.b();
                                        lc00VarB10.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                        a4xVarF = cs0.f(lc00VarB10, lc00VarB10, arrayList2);
                                    }
                                    return new dok(strConcat, strA, string6, new i8m(a4xVarF));
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    strA = ctf0Var6.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    strA = ctf0Var6.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    strA = ctf0Var6.b.a(R.string.one_x_cyber, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    str = "Real";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    str = "Virtual";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    str = "1XCyber";
                                } else {
                                    t9f.b();
                                }
                                sb = new StringBuilder(ujn.h);
                                strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
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
                                String string7 = sb.toString();
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    if (((ypl0) obj10).b.length() > 0) {
                                        arrayList.add(obj10);
                                    }
                                }
                                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    ypl0 ypl0Var7 = (ypl0) it3.next();
                                    long j8 = ypl0Var7.f43037a;
                                    String str16 = ypl0Var7.b;
                                    sb2 = new StringBuilder(ujn.h);
                                    str2 = ypl0Var7.c.j;
                                    str2.getClass();
                                    if (str2.length() == 0) {
                                        sb2.setLength(0);
                                        it4 = it3;
                                    } else {
                                        it4 = it3;
                                        i5 = 0;
                                        if (StringsKt.O(str2, ujn.h, false)) {
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                                            i5 = 0;
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else {
                                            if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                i6 = 1;
                                                c2 = '/';
                                            } else {
                                                sb2.append('/');
                                                c2 = '/';
                                                i6 = 1;
                                            }
                                            char[] cArr7 = new char[i6];
                                            cArr7[0] = c2;
                                            sb2.append(StringsKt.y0(str2, cArr7));
                                        }
                                    }
                                    arrayList2.add(new e8m(j8, new n0x(sb2.toString()), str16));
                                    it3 = it4;
                                }
                                if (arrayList2.isEmpty()) {
                                    a4xVarF = lak0.c;
                                } else {
                                    lc00 lc00VarB11 = kotlin.collections.a.b();
                                    lc00VarB11.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                    a4xVarF = cs0.f(lc00VarB11, lc00VarB11, arrayList2);
                                }
                                return new dok(strConcat, strA, string7, new i8m(a4xVarF));
                                return null;
                            case 6:
                                n52 n52Var = (n52) obj7;
                                n52Var.getClass();
                                return grv.a(n52Var, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                            default:
                                n52 n52Var2 = (n52) obj7;
                                n52Var2.getClass();
                                return grv.a(n52Var2, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar8 = this.e;
                jih jihVar4 = (jih) zjwVar8.h.get(zjwVar8.g.f7971a);
                if (jihVar4 != null) {
                    Object obj7 = jihVar4.i;
                    e0g0 e0g0Var3 = j0g0.b;
                    list3 = (List) (obj7 instanceof g0g0 ? null : obj7);
                    list3 = list3 == null ? iun.f15405a : list3;
                }
                final byte b8 = 6;
                this.r = maz.b(new yw9(cwr0.S(list3), new Function1(this) { // from class: a.irv
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:262:0x0143 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:264:0x012e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
                    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[PHI: r10
  0x01b9: PHI (r10v42 int) = (r10v41 int), (r10v47 int) binds: [B:64:0x018a, B:67:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
                    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        a4x a4xVarG0;
                        Iterator it2;
                        Object next;
                        m5l0 m5l0Var;
                        int i3;
                        char c;
                        a4x a4xVarO0;
                        int i4;
                        String str;
                        StringBuilder sb;
                        String strK;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Iterator it3;
                        a4x a4xVarF;
                        StringBuilder sb2;
                        String str2;
                        Iterator it4;
                        int i5;
                        int i6;
                        char c2;
                        byte b9 = b8;
                        n7m n7mVar = n7m.f23049a;
                        String strA = "";
                        mco mcoVar = this.b;
                        switch (b9) {
                            case 0:
                                fee feeVar = (fee) obj8;
                                feeVar.getClass();
                                zjw zjwVar9 = mcoVar.e;
                                return new gkw(!zjwVar9.f, dyb.o0(zjwVar9.f44501a), (ekw) feeVar.c(), false, false, false, axh0.f1625a);
                            case 1:
                                xqv xqvVar = (xqv) obj8;
                                xqvVar.getClass();
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                CyberGamesPage cyberGamesPage2 = ((ekw) mcoVar.b().c()).f7971a;
                                Map map = (Map) ((fee) mcoVar.h.getValue()).c();
                                zjw zjwVar10 = mcoVar.e;
                                boolean z = zjwVar10.e;
                                sff0 sff0Var = zjwVar10.b;
                                List list8 = zjwVar10.c;
                                v5l0 v5l0Var2 = sff0Var.g.y;
                                boolean z2 = zjwVar10.s;
                                ctf0Var2.getClass();
                                cyberGamesPage2.getClass();
                                map.getClass();
                                list8.getClass();
                                List list9 = xqvVar.f41340a;
                                List list10 = xqvVar.b;
                                if (list9.isEmpty() && list10.isEmpty()) {
                                    return iun.f15405a;
                                }
                                sip sipVar = (sip) map.get(cyberGamesPage2);
                                if (sipVar == null) {
                                    sipVar = sip.c;
                                }
                                String strI = ua80.i("HeaderFocusAllEventsUiModel_", sipVar.name(), BundleUtil.UNDERLINE_TAG, org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2));
                                int i7 = (list10.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.cyber_games_popular_live : (list9.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.popular_line_games : R.string.popular;
                                lsm0 lsm0Var = ctf0Var2.b;
                                v7m v7mVar = new v7m(new c8m(lsm0Var.a(i7, Arrays.copyOf(new Object[0], 0)), rv00.m));
                                if (list9.isEmpty() || list10.isEmpty()) {
                                    a4xVarG0 = lak0.c;
                                } else {
                                    String strA2 = lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[0], 0));
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strA2.toUpperCase(locale);
                                    upperCase.getClass();
                                    dsv dsvVar = new dsv(upperCase, sip.c, kpb.u(sipVar));
                                    String upperCase2 = lsm0Var.a(R.string.line, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                                    upperCase2.getClass();
                                    a4xVarG0 = dyb.g0(dsvVar, new dsv(upperCase2, sip.b, !kpb.u(sipVar)));
                                }
                                esv esvVar = new esv("", v7mVar, a4xVarG0);
                                List list11 = (!list9.isEmpty() && (list10.isEmpty() || kpb.u(sipVar))) ? list9 : list10;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list11, 10));
                                Iterator it5 = list11.iterator();
                                int i8 = 0;
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    eih eihVar = (eih) next2;
                                    long j = eihVar.f7859a;
                                    if (j == 40) {
                                        j = eihVar.b;
                                    }
                                    String str3 = strA;
                                    Iterator it6 = it5;
                                    String str4 = "HeaderFocusDisciplineGame_" + org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2) + j + kpb.u(sipVar);
                                    zqv zqvVar = new zqv(new y7m(new c8m(eihVar.c, n7mVar)));
                                    q0s q0sVar2 = q0s.b;
                                    ArrayList arrayList4 = eihVar.e;
                                    n7m n7mVar2 = n7mVar;
                                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                                    Iterator it7 = arrayList4.iterator();
                                    while (it7.hasNext()) {
                                        d0t d0tVar = (d0t) it7.next();
                                        Iterator it8 = list8.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next = it8.next();
                                                it2 = it7;
                                                Iterator it9 = it8;
                                                if (((lok0) next).f20396a != d0tVar.O) {
                                                    it8 = it9;
                                                    it7 = it2;
                                                }
                                            } else {
                                                it2 = it7;
                                                next = null;
                                            }
                                        }
                                        lok0 lok0Var = (lok0) next;
                                        boolean z3 = sff0Var.J;
                                        String str5 = eihVar.f;
                                        boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                                        eih eihVar2 = eihVar;
                                        sff0 sff0Var2 = sff0Var;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
                                        Iterator it10 = list8.iterator();
                                        while (it10.hasNext()) {
                                            arrayList6.add(Integer.valueOf(((lok0) it10.next()).f20396a));
                                        }
                                        boolean z4 = lok0Var != null ? lok0Var.n : false;
                                        boolean z5 = lok0Var != null ? lok0Var.p : false;
                                        boolean zEquals2 = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE);
                                        if (d0tVar.K.isEmpty()) {
                                            List list12 = d0tVar.k;
                                            if (list12 == null || !list12.isEmpty()) {
                                                Iterator it11 = list12.iterator();
                                                while (true) {
                                                    if (it11.hasNext()) {
                                                        if (!((d0t) it11.next()).K.isEmpty()) {
                                                            m5l0Var = l5l0.f19463a;
                                                        }
                                                    }
                                                }
                                            }
                                            m5l0Var = i5l0.f14197a;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                        m5l0 m5l0Var2 = m5l0Var;
                                        String str6 = lok0Var != null ? lok0Var.u : null;
                                        arrayList5.add(wwb.V(d0tVar, ctf0Var2, y78Var2, z, z3, str5, zEquals, arrayList6, z4, z5, zEquals2, v5l0Var2, m5l0Var2, str6 == null ? str3 : str6, z2));
                                        sff0Var = sff0Var2;
                                        it7 = it2;
                                        eihVar = eihVar2;
                                    }
                                    arrayList3.add(new vqv(str4, zqvVar, new vb90(q0sVar2, dyb.o0(arrayList5), true, z2), j));
                                    i8 = i9;
                                    sff0Var = sff0Var;
                                    strA = str3;
                                    it5 = it6;
                                    n7mVar = n7mVar2;
                                }
                                return kotlin.collections.a.c(new yqv(strI, esvVar, dyb.o0(arrayList3), sipVar));
                            case 2:
                                boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar11 = mcoVar.e;
                                return qbc.I(zBooleanValue, ctf0Var3, zjwVar11.f, zjwVar11.b.c.f7565a.d);
                            case 3:
                                List list13 = (List) obj8;
                                list13.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.b().c()).f7971a;
                                ctf0 ctf0Var4 = mcoVar.b;
                                ctf0Var4.getClass();
                                cyberGamesPage3.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj9 : list13) {
                                    if (((uog) obj9).b.length() > 0) {
                                        arrayList7.add(obj9);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj10 : arrayList7) {
                                    if (hashSet.add(Integer.valueOf(((uog) obj10).f36012a))) {
                                        arrayList8.add(obj10);
                                    }
                                }
                                List<uog> listD0 = CollectionsKt.D0(arrayList8, 16);
                                if (listD0.isEmpty() || !cyberGamesPage3.equals(CyberGamesPage.Real.INSTANCE)) {
                                    return iun.f15405a;
                                }
                                v7m v7mVar2 = new v7m(new c8m(ctf0Var4.b.a(R.string.partners, Arrays.copyOf(new Object[0], 0)), n7mVar));
                                ArrayList arrayList9 = new ArrayList(r3d.q(listD0, 10));
                                for (uog uogVar : listD0) {
                                    String strValueOf = String.valueOf(uogVar.f36012a);
                                    String str7 = uogVar.c;
                                    String str8 = uogVar.b;
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str9 = uogVar.l;
                                    if (str9.length() == 0) {
                                        sb3.setLength(0);
                                    } else {
                                        if (StringsKt.O(str9, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str9, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb3.append('/');
                                            }
                                            sb3.append(StringsKt.y0(str9, c));
                                        }
                                        sb3.setLength(i3);
                                        sb3.append(str9);
                                    }
                                    arrayList9.add(new zx80(strValueOf, str7, str8, sb3.toString()));
                                }
                                return kotlin.collections.a.c(new crv("HeaderFocusPartnersCardCollectionUiModel", v7mVar2, new wx80(dyb.r0(arrayList9))));
                            case 4:
                                fee feeVar2 = (fee) obj8;
                                feeVar2.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) feeVar2.c()).f7971a;
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.j.getValue()).d.getValue()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) ((fee) mcoVar.k.getValue()).c()).booleanValue();
                                ctf0 ctf0Var5 = mcoVar.b;
                                cyberGamesPage4.getClass();
                                ctf0Var5.getClass();
                                boolean zEquals3 = cyberGamesPage4.equals(CyberGamesPage.Real.INSTANCE);
                                dtb cxfVar = dxf.f6843a;
                                if (zEquals3) {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    lsm0 lsm0Var2 = ctf0Var5.b;
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var2.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        lc00VarB2.add(new fxf(R.drawable.ic_glyph_gift, lsm0Var2.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_calendar_inactive, lsm0Var2.a(R.string.calendar, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.c));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                                } else if (cyberGamesPage4.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                    lc00 lc00VarB3 = kotlin.collections.a.b();
                                    if (zBooleanValue4) {
                                        i4 = 0;
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_categories, ctf0Var5.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.d));
                                    } else {
                                        i4 = 0;
                                    }
                                    if (zBooleanValue2) {
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_gift, ctf0Var5.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[i4], i4)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB3.add(new fxf(R.drawable.ic_glyph_tournaments, ctf0Var5.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB3));
                                } else {
                                    if (!cyberGamesPage4.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                                        t9f.b();
                                        return null;
                                    }
                                    lc00 lc00VarB4 = kotlin.collections.a.b();
                                    lsm0 lsm0Var3 = ctf0Var5.b;
                                    lc00VarB4.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        String strA3 = lsm0Var3.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0));
                                        if (zBooleanValue3) {
                                            cxfVar = new cxf();
                                        }
                                        lc00VarB4.add(new fxf(R.drawable.ic_glyph_gift, strA3, cxfVar, exf.b));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB4));
                                }
                                return new hf9(a4xVarO0, "ButtonsCollectionUiModel" + cyberGamesPage4);
                            case 5:
                                List list14 = (List) obj8;
                                list14.getClass();
                                ctf0 ctf0Var6 = mcoVar.b;
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.b().c()).f7971a;
                                zjw zjwVar12 = mcoVar.e;
                                boolean z6 = zjwVar12.f || zjwVar12.f44501a.size() <= 1;
                                ctf0Var6.getClass();
                                cyberGamesPage5.getClass();
                                String strConcat = "DisciplineBlockUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                if (z6) {
                                    if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                        str = "Real";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                        str = "Virtual";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                        str = "1XCyber";
                                    } else {
                                        t9f.b();
                                    }
                                    sb = new StringBuilder(ujn.h);
                                    strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
                                    if (strK.length() == 0) {
                                        sb.setLength(0);
                                    } else if (StringsKt.O(strK, ujn.h, false)) {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    } else {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    }
                                    String string7 = sb.toString();
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list14) {
                                        if (((ypl0) obj11).b.length() > 0) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                    it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        ypl0 ypl0Var7 = (ypl0) it3.next();
                                        long j8 = ypl0Var7.f43037a;
                                        String str16 = ypl0Var7.b;
                                        sb2 = new StringBuilder(ujn.h);
                                        str2 = ypl0Var7.c.j;
                                        str2.getClass();
                                        if (str2.length() == 0) {
                                            sb2.setLength(0);
                                            it4 = it3;
                                        } else {
                                            it4 = it3;
                                            i5 = 0;
                                            if (StringsKt.O(str2, ujn.h, false)) {
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else if (kotlin.text.c.x(str2, "https://", false)) {
                                                i5 = 0;
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else {
                                                if (sb2.length() > 0) {
                                                    i6 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i6 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr7 = new char[i6];
                                                cArr7[0] = c2;
                                                sb2.append(StringsKt.y0(str2, cArr7));
                                            }
                                        }
                                        arrayList2.add(new e8m(j8, new n0x(sb2.toString()), str16));
                                        it3 = it4;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        a4xVarF = lak0.c;
                                    } else {
                                        lc00 lc00VarB11 = kotlin.collections.a.b();
                                        lc00VarB11.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                        a4xVarF = cs0.f(lc00VarB11, lc00VarB11, arrayList2);
                                    }
                                    return new dok(strConcat, strA, string7, new i8m(a4xVarF));
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    strA = ctf0Var6.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    strA = ctf0Var6.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    strA = ctf0Var6.b.a(R.string.one_x_cyber, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    str = "Real";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    str = "Virtual";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    str = "1XCyber";
                                } else {
                                    t9f.b();
                                }
                                sb = new StringBuilder(ujn.h);
                                strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
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
                                String string8 = sb.toString();
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    if (((ypl0) obj11).b.length() > 0) {
                                        arrayList.add(obj11);
                                    }
                                }
                                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    ypl0 ypl0Var8 = (ypl0) it3.next();
                                    long j9 = ypl0Var8.f43037a;
                                    String str17 = ypl0Var8.b;
                                    sb2 = new StringBuilder(ujn.h);
                                    str2 = ypl0Var8.c.j;
                                    str2.getClass();
                                    if (str2.length() == 0) {
                                        sb2.setLength(0);
                                        it4 = it3;
                                    } else {
                                        it4 = it3;
                                        i5 = 0;
                                        if (StringsKt.O(str2, ujn.h, false)) {
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                                            i5 = 0;
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else {
                                            if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                i6 = 1;
                                                c2 = '/';
                                            } else {
                                                sb2.append('/');
                                                c2 = '/';
                                                i6 = 1;
                                            }
                                            char[] cArr8 = new char[i6];
                                            cArr8[0] = c2;
                                            sb2.append(StringsKt.y0(str2, cArr8));
                                        }
                                    }
                                    arrayList2.add(new e8m(j9, new n0x(sb2.toString()), str17));
                                    it3 = it4;
                                }
                                if (arrayList2.isEmpty()) {
                                    a4xVarF = lak0.c;
                                } else {
                                    lc00 lc00VarB12 = kotlin.collections.a.b();
                                    lc00VarB12.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                    a4xVarF = cs0.f(lc00VarB12, lc00VarB12, arrayList2);
                                }
                                return new dok(strConcat, strA, string8, new i8m(a4xVarF));
                                return null;
                            case 6:
                                n52 n52Var = (n52) obj8;
                                n52Var.getClass();
                                return grv.a(n52Var, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                            default:
                                n52 n52Var2 = (n52) obj8;
                                n52Var2.getClass();
                                return grv.a(n52Var2, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar9 = this.e;
                final byte b9 = 7;
                this.s = maz.b(new yw9(phu0.W((jih) zjwVar9.h.get(zjwVar9.g.f7971a)), new Function1(this) { // from class: a.irv
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:262:0x0143 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:264:0x012e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
                    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
                    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[PHI: r10
  0x01b9: PHI (r10v42 int) = (r10v41 int), (r10v47 int) binds: [B:64:0x018a, B:67:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
                    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        a4x a4xVarG0;
                        Iterator it2;
                        Object next;
                        m5l0 m5l0Var;
                        int i3;
                        char c;
                        a4x a4xVarO0;
                        int i4;
                        String str;
                        StringBuilder sb;
                        String strK;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Iterator it3;
                        a4x a4xVarF;
                        StringBuilder sb2;
                        String str2;
                        Iterator it4;
                        int i5;
                        int i6;
                        char c2;
                        byte b10 = b9;
                        n7m n7mVar = n7m.f23049a;
                        String strA = "";
                        mco mcoVar = this.b;
                        switch (b10) {
                            case 0:
                                fee feeVar = (fee) obj8;
                                feeVar.getClass();
                                zjw zjwVar10 = mcoVar.e;
                                return new gkw(!zjwVar10.f, dyb.o0(zjwVar10.f44501a), (ekw) feeVar.c(), false, false, false, axh0.f1625a);
                            case 1:
                                xqv xqvVar = (xqv) obj8;
                                xqvVar.getClass();
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                CyberGamesPage cyberGamesPage2 = ((ekw) mcoVar.b().c()).f7971a;
                                Map map = (Map) ((fee) mcoVar.h.getValue()).c();
                                zjw zjwVar11 = mcoVar.e;
                                boolean z = zjwVar11.e;
                                sff0 sff0Var = zjwVar11.b;
                                List list8 = zjwVar11.c;
                                v5l0 v5l0Var2 = sff0Var.g.y;
                                boolean z2 = zjwVar11.s;
                                ctf0Var2.getClass();
                                cyberGamesPage2.getClass();
                                map.getClass();
                                list8.getClass();
                                List list9 = xqvVar.f41340a;
                                List list10 = xqvVar.b;
                                if (list9.isEmpty() && list10.isEmpty()) {
                                    return iun.f15405a;
                                }
                                sip sipVar = (sip) map.get(cyberGamesPage2);
                                if (sipVar == null) {
                                    sipVar = sip.c;
                                }
                                String strI = ua80.i("HeaderFocusAllEventsUiModel_", sipVar.name(), BundleUtil.UNDERLINE_TAG, org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2));
                                int i7 = (list10.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.cyber_games_popular_live : (list9.isEmpty() && cyberGamesPage2.equals(CyberGamesPage.Real.INSTANCE)) ? R.string.popular_line_games : R.string.popular;
                                lsm0 lsm0Var = ctf0Var2.b;
                                v7m v7mVar = new v7m(new c8m(lsm0Var.a(i7, Arrays.copyOf(new Object[0], 0)), rv00.m));
                                if (list9.isEmpty() || list10.isEmpty()) {
                                    a4xVarG0 = lak0.c;
                                } else {
                                    String strA2 = lsm0Var.a(R.string.live_game, Arrays.copyOf(new Object[0], 0));
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strA2.toUpperCase(locale);
                                    upperCase.getClass();
                                    dsv dsvVar = new dsv(upperCase, sip.c, kpb.u(sipVar));
                                    String upperCase2 = lsm0Var.a(R.string.line, Arrays.copyOf(new Object[0], 0)).toUpperCase(locale);
                                    upperCase2.getClass();
                                    a4xVarG0 = dyb.g0(dsvVar, new dsv(upperCase2, sip.b, !kpb.u(sipVar)));
                                }
                                esv esvVar = new esv("", v7mVar, a4xVarG0);
                                List list11 = (!list9.isEmpty() && (list10.isEmpty() || kpb.u(sipVar))) ? list9 : list10;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list11, 10));
                                Iterator it5 = list11.iterator();
                                int i8 = 0;
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    eih eihVar = (eih) next2;
                                    long j = eihVar.f7859a;
                                    if (j == 40) {
                                        j = eihVar.b;
                                    }
                                    String str3 = strA;
                                    Iterator it6 = it5;
                                    String str4 = "HeaderFocusDisciplineGame_" + org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage2) + j + kpb.u(sipVar);
                                    zqv zqvVar = new zqv(new y7m(new c8m(eihVar.c, n7mVar)));
                                    q0s q0sVar2 = q0s.b;
                                    ArrayList arrayList4 = eihVar.e;
                                    n7m n7mVar2 = n7mVar;
                                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                                    Iterator it7 = arrayList4.iterator();
                                    while (it7.hasNext()) {
                                        d0t d0tVar = (d0t) it7.next();
                                        Iterator it8 = list8.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next = it8.next();
                                                it2 = it7;
                                                Iterator it9 = it8;
                                                if (((lok0) next).f20396a != d0tVar.O) {
                                                    it8 = it9;
                                                    it7 = it2;
                                                }
                                            } else {
                                                it2 = it7;
                                                next = null;
                                            }
                                        }
                                        lok0 lok0Var = (lok0) next;
                                        boolean z3 = sff0Var.J;
                                        String str5 = eihVar.f;
                                        boolean zEquals = cyberGamesPage2.equals(CyberGamesPage.OneXCyber.INSTANCE);
                                        eih eihVar2 = eihVar;
                                        sff0 sff0Var2 = sff0Var;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
                                        Iterator it10 = list8.iterator();
                                        while (it10.hasNext()) {
                                            arrayList6.add(Integer.valueOf(((lok0) it10.next()).f20396a));
                                        }
                                        boolean z4 = lok0Var != null ? lok0Var.n : false;
                                        boolean z5 = lok0Var != null ? lok0Var.p : false;
                                        boolean zEquals2 = cyberGamesPage2.equals(CyberGamesPage.Virtual.INSTANCE);
                                        if (d0tVar.K.isEmpty()) {
                                            List list12 = d0tVar.k;
                                            if (list12 == null || !list12.isEmpty()) {
                                                Iterator it11 = list12.iterator();
                                                while (true) {
                                                    if (it11.hasNext()) {
                                                        if (!((d0t) it11.next()).K.isEmpty()) {
                                                            m5l0Var = l5l0.f19463a;
                                                        }
                                                    }
                                                }
                                            }
                                            m5l0Var = i5l0.f14197a;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                        m5l0 m5l0Var2 = m5l0Var;
                                        String str6 = lok0Var != null ? lok0Var.u : null;
                                        arrayList5.add(wwb.V(d0tVar, ctf0Var2, y78Var2, z, z3, str5, zEquals, arrayList6, z4, z5, zEquals2, v5l0Var2, m5l0Var2, str6 == null ? str3 : str6, z2));
                                        sff0Var = sff0Var2;
                                        it7 = it2;
                                        eihVar = eihVar2;
                                    }
                                    arrayList3.add(new vqv(str4, zqvVar, new vb90(q0sVar2, dyb.o0(arrayList5), true, z2), j));
                                    i8 = i9;
                                    sff0Var = sff0Var;
                                    strA = str3;
                                    it5 = it6;
                                    n7mVar = n7mVar2;
                                }
                                return kotlin.collections.a.c(new yqv(strI, esvVar, dyb.o0(arrayList3), sipVar));
                            case 2:
                                boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar12 = mcoVar.e;
                                return qbc.I(zBooleanValue, ctf0Var3, zjwVar12.f, zjwVar12.b.c.f7565a.d);
                            case 3:
                                List list13 = (List) obj8;
                                list13.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.b().c()).f7971a;
                                ctf0 ctf0Var4 = mcoVar.b;
                                ctf0Var4.getClass();
                                cyberGamesPage3.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj9 : list13) {
                                    if (((uog) obj9).b.length() > 0) {
                                        arrayList7.add(obj9);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj10 : arrayList7) {
                                    if (hashSet.add(Integer.valueOf(((uog) obj10).f36012a))) {
                                        arrayList8.add(obj10);
                                    }
                                }
                                List<uog> listD0 = CollectionsKt.D0(arrayList8, 16);
                                if (listD0.isEmpty() || !cyberGamesPage3.equals(CyberGamesPage.Real.INSTANCE)) {
                                    return iun.f15405a;
                                }
                                v7m v7mVar2 = new v7m(new c8m(ctf0Var4.b.a(R.string.partners, Arrays.copyOf(new Object[0], 0)), n7mVar));
                                ArrayList arrayList9 = new ArrayList(r3d.q(listD0, 10));
                                for (uog uogVar : listD0) {
                                    String strValueOf = String.valueOf(uogVar.f36012a);
                                    String str7 = uogVar.c;
                                    String str8 = uogVar.b;
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str9 = uogVar.l;
                                    if (str9.length() == 0) {
                                        sb3.setLength(0);
                                    } else {
                                        if (StringsKt.O(str9, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str9, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb3.append('/');
                                            }
                                            sb3.append(StringsKt.y0(str9, c));
                                        }
                                        sb3.setLength(i3);
                                        sb3.append(str9);
                                    }
                                    arrayList9.add(new zx80(strValueOf, str7, str8, sb3.toString()));
                                }
                                return kotlin.collections.a.c(new crv("HeaderFocusPartnersCardCollectionUiModel", v7mVar2, new wx80(dyb.r0(arrayList9))));
                            case 4:
                                fee feeVar2 = (fee) obj8;
                                feeVar2.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) feeVar2.c()).f7971a;
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.j.getValue()).d.getValue()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                boolean zBooleanValue4 = ((Boolean) ((fee) mcoVar.k.getValue()).c()).booleanValue();
                                ctf0 ctf0Var5 = mcoVar.b;
                                cyberGamesPage4.getClass();
                                ctf0Var5.getClass();
                                boolean zEquals3 = cyberGamesPage4.equals(CyberGamesPage.Real.INSTANCE);
                                dtb cxfVar = dxf.f6843a;
                                if (zEquals3) {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    lsm0 lsm0Var2 = ctf0Var5.b;
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var2.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        lc00VarB2.add(new fxf(R.drawable.ic_glyph_gift, lsm0Var2.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB2.add(new fxf(R.drawable.ic_glyph_calendar_inactive, lsm0Var2.a(R.string.calendar, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.c));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                                } else if (cyberGamesPage4.equals(CyberGamesPage.Virtual.INSTANCE)) {
                                    lc00 lc00VarB3 = kotlin.collections.a.b();
                                    if (zBooleanValue4) {
                                        i4 = 0;
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_categories, ctf0Var5.b.a(R.string.categories_games, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.d));
                                    } else {
                                        i4 = 0;
                                    }
                                    if (zBooleanValue2) {
                                        lc00VarB3.add(new fxf(R.drawable.ic_glyph_gift, ctf0Var5.b.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[i4], i4)), zBooleanValue3 ? new cxf() : cxfVar, exf.b));
                                    }
                                    lc00VarB3.add(new fxf(R.drawable.ic_glyph_tournaments, ctf0Var5.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB3));
                                } else {
                                    if (!cyberGamesPage4.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                                        t9f.b();
                                        return null;
                                    }
                                    lc00 lc00VarB4 = kotlin.collections.a.b();
                                    lsm0 lsm0Var3 = ctf0Var5.b;
                                    lc00VarB4.add(new fxf(R.drawable.ic_glyph_tournaments, lsm0Var3.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), cxfVar, exf.f8574a));
                                    if (zBooleanValue2) {
                                        String strA3 = lsm0Var3.a(R.string.cyber_games_stock, Arrays.copyOf(new Object[0], 0));
                                        if (zBooleanValue3) {
                                            cxfVar = new cxf();
                                        }
                                        lc00VarB4.add(new fxf(R.drawable.ic_glyph_gift, strA3, cxfVar, exf.b));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB4));
                                }
                                return new hf9(a4xVarO0, "ButtonsCollectionUiModel" + cyberGamesPage4);
                            case 5:
                                List list14 = (List) obj8;
                                list14.getClass();
                                ctf0 ctf0Var6 = mcoVar.b;
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.b().c()).f7971a;
                                zjw zjwVar13 = mcoVar.e;
                                boolean z6 = zjwVar13.f || zjwVar13.f44501a.size() <= 1;
                                ctf0Var6.getClass();
                                cyberGamesPage5.getClass();
                                String strConcat = "DisciplineBlockUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                if (z6) {
                                    if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                        str = "Real";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                        str = "Virtual";
                                    } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                        str = "1XCyber";
                                    } else {
                                        t9f.b();
                                    }
                                    sb = new StringBuilder(ujn.h);
                                    strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
                                    if (strK.length() == 0) {
                                        sb.setLength(0);
                                    } else if (StringsKt.O(strK, ujn.h, false)) {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    } else {
                                        sb.setLength(0);
                                        sb.append(strK);
                                    }
                                    String string8 = sb.toString();
                                    arrayList = new ArrayList();
                                    for (Object obj11 : list14) {
                                        if (((ypl0) obj11).b.length() > 0) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                    it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        ypl0 ypl0Var8 = (ypl0) it3.next();
                                        long j9 = ypl0Var8.f43037a;
                                        String str17 = ypl0Var8.b;
                                        sb2 = new StringBuilder(ujn.h);
                                        str2 = ypl0Var8.c.j;
                                        str2.getClass();
                                        if (str2.length() == 0) {
                                            sb2.setLength(0);
                                            it4 = it3;
                                        } else {
                                            it4 = it3;
                                            i5 = 0;
                                            if (StringsKt.O(str2, ujn.h, false)) {
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else if (kotlin.text.c.x(str2, "https://", false)) {
                                                i5 = 0;
                                                sb2.setLength(i5);
                                                sb2.append(str2);
                                            } else {
                                                if (sb2.length() > 0) {
                                                    i6 = 1;
                                                    c2 = '/';
                                                } else {
                                                    i6 = 1;
                                                    c2 = '/';
                                                }
                                                char[] cArr8 = new char[i6];
                                                cArr8[0] = c2;
                                                sb2.append(StringsKt.y0(str2, cArr8));
                                            }
                                        }
                                        arrayList2.add(new e8m(j9, new n0x(sb2.toString()), str17));
                                        it3 = it4;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        a4xVarF = lak0.c;
                                    } else {
                                        lc00 lc00VarB12 = kotlin.collections.a.b();
                                        lc00VarB12.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                        a4xVarF = cs0.f(lc00VarB12, lc00VarB12, arrayList2);
                                    }
                                    return new dok(strConcat, strA, string8, new i8m(a4xVarF));
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    strA = ctf0Var6.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    strA = ctf0Var6.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    strA = ctf0Var6.b.a(R.string.one_x_cyber, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                if (cyberGamesPage5 instanceof CyberGamesPage.Real) {
                                    str = "Real";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.Virtual) {
                                    str = "Virtual";
                                } else if (cyberGamesPage5 instanceof CyberGamesPage.OneXCyber) {
                                    str = "1XCyber";
                                } else {
                                    t9f.b();
                                }
                                sb = new StringBuilder(ujn.h);
                                strK = b1j.k("static/img/ImgDefault/Esports/", str, "/HeaderFocus/", str, "Header.png");
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
                                String string9 = sb.toString();
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    if (((ypl0) obj11).b.length() > 0) {
                                        arrayList.add(obj11);
                                    }
                                }
                                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    ypl0 ypl0Var9 = (ypl0) it3.next();
                                    long j10 = ypl0Var9.f43037a;
                                    String str18 = ypl0Var9.b;
                                    sb2 = new StringBuilder(ujn.h);
                                    str2 = ypl0Var9.c.j;
                                    str2.getClass();
                                    if (str2.length() == 0) {
                                        sb2.setLength(0);
                                        it4 = it3;
                                    } else {
                                        it4 = it3;
                                        i5 = 0;
                                        if (StringsKt.O(str2, ujn.h, false)) {
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                                            i5 = 0;
                                            sb2.setLength(i5);
                                            sb2.append(str2);
                                        } else {
                                            if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                i6 = 1;
                                                c2 = '/';
                                            } else {
                                                sb2.append('/');
                                                c2 = '/';
                                                i6 = 1;
                                            }
                                            char[] cArr9 = new char[i6];
                                            cArr9[0] = c2;
                                            sb2.append(StringsKt.y0(str2, cArr9));
                                        }
                                    }
                                    arrayList2.add(new e8m(j10, new n0x(sb2.toString()), str18));
                                    it3 = it4;
                                }
                                if (arrayList2.isEmpty()) {
                                    a4xVarF = lak0.c;
                                } else {
                                    lc00 lc00VarB13 = kotlin.collections.a.b();
                                    lc00VarB13.add(new e8m(-11L, new m0x(R.drawable.ic_glyph_all, null, 6), ctf0Var6.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))));
                                    a4xVarF = cs0.f(lc00VarB13, lc00VarB13, arrayList2);
                                }
                                return new dok(strConcat, strA, string9, new i8m(a4xVarF));
                                return null;
                            case 6:
                                n52 n52Var = (n52) obj8;
                                n52Var.getClass();
                                return grv.a(n52Var, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                            default:
                                n52 n52Var2 = (n52) obj8;
                                n52Var2.getClass();
                                return grv.a(n52Var2, ((ekw) mcoVar.b().c()).f7971a, mcoVar.b);
                        }
                    }
                }, (byte) 20));
                return;
            default:
                this.b = ctf0Var;
                this.c = y78Var;
                this.d = g2vVar;
                this.e = zjwVar;
                List list8 = zjwVar.f44501a;
                boolean z = zjwVar.f;
                jo20 jo20Var2 = new jo20();
                Iterator it2 = list8.iterator();
                while (it2.hasNext()) {
                    CyberGamesPage cyberGamesPage2 = ((ekw) it2.next()).f7971a;
                    zjw zjwVar10 = this.e;
                    v5l0 v5l0Var2 = zjwVar10.b.g.y;
                    boolean z2 = zjwVar10.r;
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    lc00VarB2.add(new uqv("HeaderContainerUiModel_Shimmer", !z ? rqv.f30950a : sqv.f32646a, new bev0(z2 ? zdv0.b : zdv0.f44226a)));
                    j8m j8mVar = j8m.f16090a;
                    l3g l3gVar = l3g.f19357a;
                    lc00VarB2.add(new wbo("EventFocusDisciplineListUiModel_Shimmer", j8mVar, l3gVar));
                    q0s q0sVar2 = q0s.f27918a;
                    int iOrdinal2 = v5l0Var2.ordinal();
                    if (iOrdinal2 == 0) {
                        l0l0Var2 = g0l0.f10465a;
                    } else if (iOrdinal2 == 1) {
                        l0l0Var2 = k0l0.f17474a;
                    } else if (iOrdinal2 == i2) {
                        l0l0Var2 = j0l0.f15687a;
                    } else if (iOrdinal2 == i) {
                        l0l0Var2 = i0l0.f13953a;
                    } else {
                        if (iOrdinal2 != 4) {
                            t9f.b();
                            throw null;
                        }
                        l0l0Var2 = h0l0.f12241a;
                    }
                    lc00VarB2.add(new hco("EventFocusTopEventsUiModel_Shimmer", sip.c, w7m.f38680a, gtk.f11885a, new vb90(q0sVar2, dyb.g0(new x56(l0l0Var2), new x56(l0l0Var2), new x56(l0l0Var2)), false, true), l3gVar));
                    jo20Var2.put(cyberGamesPage2, androidx.compose.runtime.e.e(new hjw(wiwVar, dyb.o0(kotlin.collections.a.a(lc00VarB2)), true)));
                    i = 3;
                    i2 = 2;
                }
                this.f = dyb.p0(jo20Var2.b());
                this.g = bkb.H(this.e.g);
                zjw zjwVar11 = this.e;
                this.h = bkb.H(Boolean.valueOf(Intrinsics.d(zjwVar11.j.get(zjwVar11.g.f7971a), Boolean.TRUE)));
                this.i = bkb.H(Boolean.valueOf(this.e.k));
                this.j = maz.b(new yw9(a(), new Function1(this) { // from class: a.lco
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:188:0x0551  */
                    /* JADX WARN: Code duplicated, block: B:191:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:193:0x055f  */
                    /* JADX WARN: Code duplicated, block: B:194:0x0562  */
                    /* JADX WARN: Code duplicated, block: B:213:0x05ae  */
                    /* JADX WARN: Code duplicated, block: B:215:0x05b4  */
                    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
                    /* JADX WARN: Code duplicated, block: B:223:0x05d8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05ec  */
                    /* JADX WARN: Code duplicated, block: B:228:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:231:0x0616  */
                    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        tqv qqvVar;
                        String strA;
                        aev0 aev0Var;
                        uqv uqvVar;
                        qdv0 qdv0Var;
                        qdv0 qdv0Var2;
                        List list9;
                        Object next;
                        ndv0 ndv0Var;
                        boolean z3;
                        String str;
                        String str2;
                        String strL;
                        tf90 tf90Var;
                        tf90 tf90Var2;
                        int length;
                        opm opmVar;
                        int i3;
                        String str3;
                        String str4;
                        mpm kpmVar;
                        String strA2;
                        rdv0 rdv0Var;
                        int i4;
                        uqv uqvVar2;
                        aev0 aev0Var2;
                        byte b10 = b2;
                        int i5 = 10;
                        mco mcoVar = this.b;
                        switch (b10) {
                            case 0:
                                xbo xboVar = (xbo) obj8;
                                xboVar.getClass();
                                List list10 = xboVar.f40610a;
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                zjw zjwVar12 = mcoVar.e;
                                sff0 sff0Var = zjwVar12.b;
                                return ico.a(list10, y78Var2, sff0Var.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar12.e, sff0Var, sip.b, zjwVar12.c, xboVar.c, xboVar.b, ctf0Var2, zjwVar12.s);
                            case 1:
                                fee feeVar = (fee) obj8;
                                feeVar.getClass();
                                zjw zjwVar13 = mcoVar.e;
                                return new gkw(!zjwVar13.f, dyb.o0(zjwVar13.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) mcoVar.h.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) mcoVar.i.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, axh0.f1625a);
                            case 2:
                                List list11 = (List) obj8;
                                list11.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.a().c()).f7971a;
                                boolean zBooleanValue = ((Boolean) ((fee) mcoVar.h.getValue()).c()).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar14 = mcoVar.e;
                                boolean z4 = zjwVar14.f || zjwVar14.f44501a.size() <= 1;
                                boolean z5 = zjwVar14.r;
                                boolean z6 = zjwVar14.s;
                                List list12 = ybo.f42348a;
                                cyberGamesPage3.getClass();
                                ctf0Var3.getClass();
                                if (z4) {
                                    qqvVar = sqv.f32646a;
                                } else {
                                    if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                        strA = ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                    } else if (cyberGamesPage3 instanceof CyberGamesPage.Virtual) {
                                        strA = ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        if (!(cyberGamesPage3 instanceof CyberGamesPage.OneXCyber)) {
                                            t9f.b();
                                            return null;
                                        }
                                        strA = ctf0Var3.b.a(R.string.cyber_games_page_onex_cyber, Arrays.copyOf(new Object[0], 0));
                                    }
                                    qqvVar = new qqv(strA);
                                }
                                zdv0 zdv0Var = z5 ? zdv0.b : zdv0.f44226a;
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_calendar_inactive, false, adv0.f699a));
                                } else {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_tournaments, false, edv0.f7639a));
                                }
                                if (zBooleanValue) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_gift, zBooleanValue2, cdv0.f4183a));
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                                ArrayList arrayList = new ArrayList();
                                for (Iterator it3 = list11.iterator(); it3.hasNext(); it3 = it3) {
                                    eih eihVar = (eih) it3.next();
                                    ArrayList arrayList2 = eihVar.e;
                                    ArrayList<d0t> arrayList3 = new ArrayList();
                                    for (Object obj9 : arrayList2) {
                                        if (!qzb.D0((d0t) obj9)) {
                                            arrayList3.add(obj9);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (d0t d0tVar : arrayList3) {
                                        List listA = ybo.a(1L, d0tVar);
                                        if (listA == null) {
                                            listA = ybo.a(38L, d0tVar);
                                        }
                                        Pair pair = (listA == null || listA.isEmpty()) ? null : new Pair(d0tVar, listA);
                                        if (pair != null) {
                                            arrayList4.add(pair);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj10 : arrayList4) {
                                        Iterable iterable2 = (Iterable) ((Pair) obj10).b;
                                        boolean z7 = z6;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, i5));
                                        Iterator it4 = iterable2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Long.valueOf(((BetZip) it4.next()).f46426a));
                                            arrayList5 = arrayList5;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        if (arrayList6.containsAll(ybo.f42348a)) {
                                            arrayList7.add(obj10);
                                            arrayList5 = arrayList7;
                                        } else {
                                            arrayList5 = arrayList7;
                                        }
                                        z6 = z7;
                                        i5 = 10;
                                    }
                                    boolean z8 = z6;
                                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(arrayList5);
                                    if (pair2 == null) {
                                        uqvVar2 = uqvVar;
                                        aev0Var2 = aev0Var;
                                        rdv0Var = null;
                                        i4 = 0;
                                    } else {
                                        d0t d0tVar2 = (d0t) pair2.f46059a;
                                        List list13 = (List) pair2.b;
                                        BetZip betZip = (BetZip) CollectionsKt.firstOrNull(list13);
                                        String str5 = betZip != null ? betZip.g : null;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        BetZip betZip2 = (BetZip) CollectionsKt.f0(list13);
                                        String str6 = betZip2 != null ? betZip2.g : null;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        aev0 aev0Var3 = aev0Var;
                                        long j = d0tVar2.v;
                                        boolean z9 = d0tVar2.C;
                                        f0t f0tVar = d0tVar2.r;
                                        f0t f0tVar2 = d0tVar2.q;
                                        uqv uqvVar3 = uqvVar;
                                        rqs rqsVar = d0tVar2.p;
                                        int i6 = rqsVar.q;
                                        long j2 = d0tVar2.u;
                                        long j3 = d0tVar2.f5282a;
                                        ndv0 ndv0Var2 = new ndv0(new n0x(eihVar.d), eihVar.c);
                                        String str7 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        qdv0 qdv0Var3 = new qdv0(vsm0.s(f0tVar2.f8731a, str7), str5);
                                        String str8 = (String) CollectionsKt.firstOrNull(f0tVar.d);
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        qdv0 qdv0Var4 = new qdv0(vsm0.s(f0tVar.f8731a, str8), str6);
                                        yk5 yk5Var = mc6.b;
                                        ubr ubrVar = rqsVar.B;
                                        Integer numValueOf = Integer.valueOf(i6);
                                        yk5Var.getClass();
                                        ieu0 ieu0Var = new ieu0(yk5.d(numValueOf).f21536a, ubrVar.f35394a);
                                        ieu0 ieu0Var2 = new ieu0(yk5.d(Integer.valueOf(i6)).f21536a, ubrVar.b);
                                        long j4 = d0tVar2.v;
                                        List list14 = rqsVar.d;
                                        Iterator it5 = xkb.P().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                qdv0Var = qdv0Var3;
                                                yxg yxgVar = (yxg) next;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                if (j4 == yxgVar.b) {
                                                    long j5 = d0tVar2.u;
                                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                                    }
                                                }
                                                qdv0Var3 = qdv0Var;
                                                qdv0Var4 = qdv0Var2;
                                                list14 = list9;
                                            } else {
                                                qdv0Var = qdv0Var3;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                next = null;
                                            }
                                        }
                                        yxg yxgVar2 = (yxg) next;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        yxg yxgVar3 = yxgVar2;
                                        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
                                        if (d0tVar2.z) {
                                            ndv0Var = ndv0Var2;
                                        } else {
                                            ndv0Var = ndv0Var2;
                                            if (!dyb.e0(d0tVar2.s)) {
                                                z3 = false;
                                            }
                                            str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                            if (str == null) {
                                                str = "";
                                            }
                                            str2 = (String) CollectionsKt.f0(listSplit$default);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            if (!z3) {
                                                strL = "";
                                            } else if (!z9 && yxgVar3.c == 1 && !list9.isEmpty()) {
                                                df90 df90Var = (df90) CollectionsKt.f0(list9);
                                                Integer numValueOf2 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : Integer.valueOf(tf90Var2.b);
                                                df90 df90Var2 = (df90) CollectionsKt.f0(list9);
                                                strL = numValueOf2 + "  :  " + ((df90Var2 == null || (tf90Var = df90Var2.b) == null) ? null : Integer.valueOf(tf90Var.c));
                                            } else if (str.length() > 0 || str2.length() <= 0 || j4 == 40) {
                                                strL = "";
                                            } else {
                                                strL = kng0.l(str, "  :  ", str2);
                                            }
                                            length = strL.length();
                                            opmVar = opm.f25648a;
                                            if (length == 0) {
                                                kpmVar = new lpm(opmVar, new gpm());
                                                i3 = 0;
                                            } else {
                                                i3 = 0;
                                                str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                            }
                                            if (z9) {
                                                strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                            } else {
                                                strA2 = "";
                                            }
                                            iev0 iev0Var = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                            i4 = i3;
                                            uqvVar2 = uqvVar3;
                                            aev0Var2 = aev0Var3;
                                            rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var, z8);
                                        }
                                        z3 = true;
                                        str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = (String) CollectionsKt.f0(listSplit$default);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (!z3) {
                                            strL = "";
                                        } else if (!z9) {
                                            if (str.length() > 0) {
                                                strL = "";
                                            } else {
                                                strL = "";
                                            }
                                        } else if (str.length() > 0) {
                                            strL = "";
                                        } else {
                                            strL = "";
                                        }
                                        length = strL.length();
                                        opmVar = opm.f25648a;
                                        if (length == 0) {
                                            kpmVar = new lpm(opmVar, new gpm());
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                        }
                                        if (z9) {
                                            strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                        } else {
                                            strA2 = "";
                                        }
                                        iev0 iev0Var2 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                        i4 = i3;
                                        uqvVar2 = uqvVar3;
                                        aev0Var2 = aev0Var3;
                                        rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var2, z8);
                                    }
                                    if (rdv0Var != null) {
                                        arrayList.add(rdv0Var);
                                    }
                                    uqvVar = uqvVar2;
                                    aev0Var = aev0Var2;
                                    z6 = z8;
                                    i5 = 10;
                                }
                                new uqv("HeaderContainerUiModel", qqvVar, new aev0(zdv0Var, i4VarR0, dyb.r0(CollectionsKt.D0(arrayList, 3))));
                                return uqvVar;
                            case 3:
                                List list15 = (List) obj8;
                                list15.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage4.getClass();
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                ArrayList<ypl0> arrayList8 = new ArrayList();
                                for (Object obj11 : list15) {
                                    if (((ypl0) obj11).b.length() > 0) {
                                        arrayList8.add(obj11);
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    String strConcat = "EventFocusDisciplineListUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage4));
                                    ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                    for (ypl0 ypl0Var : arrayList8) {
                                        long j6 = ypl0Var.f43037a;
                                        String str9 = ypl0Var.b;
                                        StringBuilder sb = new StringBuilder(ujn.h);
                                        String str10 = ypl0Var.c.f19909a;
                                        str10.getClass();
                                        if (str10.length() == 0) {
                                            sb.setLength(0);
                                        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                                            sb.setLength(0);
                                            sb.append(str10);
                                        } else {
                                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str10, '/'));
                                        }
                                        arrayList9.add(new e8m(j6, new n0x(sb.toString()), str9));
                                    }
                                    lc00VarB4.add(new wbo(strConcat, new i8m(dyb.o0(arrayList9)), k3g.f17616a));
                                }
                                return kotlin.collections.a.a(lc00VarB4);
                            case 4:
                                boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                                ctf0 ctf0Var4 = mcoVar.b;
                                zjw zjwVar15 = mcoVar.e;
                                return qbc.I(zBooleanValue3, ctf0Var4, zjwVar15.f, zjwVar15.b.c.f7565a.d);
                            case 5:
                                n52 n52Var = (n52) obj8;
                                n52Var.getClass();
                                return kco.a(n52Var, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 6:
                                n52 n52Var2 = (n52) obj8;
                                n52Var2.getClass();
                                return kco.a(n52Var2, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 7:
                                List list16 = (List) obj8;
                                list16.getClass();
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage5.getClass();
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                ArrayList<oru0> arrayList10 = new ArrayList();
                                for (Object obj12 : list16) {
                                    if (((oru0) obj12).b.length() > 0) {
                                        arrayList10.add(obj12);
                                    }
                                }
                                if (!arrayList10.isEmpty() && (cyberGamesPage5 instanceof CyberGamesPage.Virtual)) {
                                    String strConcat2 = "HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                    ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                                    for (oru0 oru0Var : arrayList10) {
                                        int i7 = oru0Var.f25753a;
                                        String str11 = oru0Var.b;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String strE = ua80.e(oru0Var.f25753a, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/", ".png");
                                        if (strE.length() == 0) {
                                            sb2.setLength(0);
                                        } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                                            sb2.setLength(0);
                                            sb2.append(strE);
                                        } else {
                                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                                sb2.append('/');
                                            }
                                            sb2.append(StringsKt.y0(strE, '/'));
                                        }
                                        arrayList11.add(new cvl(i7, new n0x(sb2.toString()), Integer.valueOf(R.drawable.cybergames_discipline_placeholder), str11));
                                    }
                                    lc00VarB5.add(new nco(new diw(strConcat2, new zul(dyb.r0(arrayList11)))));
                                }
                                return kotlin.collections.a.a(lc00VarB5);
                            default:
                                xbo xboVar2 = (xbo) obj8;
                                xboVar2.getClass();
                                List list17 = xboVar2.f40610a;
                                y78 y78Var3 = mcoVar.c;
                                zjw zjwVar16 = mcoVar.e;
                                sff0 sff0Var2 = zjwVar16.b;
                                return ico.a(list17, y78Var3, sff0Var2.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar16.e, sff0Var2, sip.c, zjwVar16.c, xboVar2.c, xboVar2.b, mcoVar.b, zjwVar16.s);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar12 = this.e;
                jih jihVar5 = (jih) zjwVar12.h.get(zjwVar12.g.f7971a);
                if (jihVar5 != null) {
                    Object obj8 = jihVar5.c;
                    e0g0 e0g0Var4 = j0g0.b;
                    collection = (List) (obj8 instanceof g0g0 ? null : obj8);
                    collection = collection == null ? iun.f15405a : collection;
                }
                zjw zjwVar13 = this.e;
                jih jihVar6 = (jih) zjwVar13.h.get(zjwVar13.g.f7971a);
                if (jihVar6 != null) {
                    Object obj9 = jihVar6.d;
                    e0g0 e0g0Var5 = j0g0.b;
                    iterable = (List) (obj9 instanceof g0g0 ? null : obj9);
                    iterable = iterable == null ? iun.f15405a : iterable;
                }
                final byte b10 = 2;
                this.k = maz.b(new yw9(CollectionsKt.q0(collection, iterable), new Function1(this) { // from class: a.lco
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:188:0x0551  */
                    /* JADX WARN: Code duplicated, block: B:191:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:193:0x055f  */
                    /* JADX WARN: Code duplicated, block: B:194:0x0562  */
                    /* JADX WARN: Code duplicated, block: B:213:0x05ae  */
                    /* JADX WARN: Code duplicated, block: B:215:0x05b4  */
                    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
                    /* JADX WARN: Code duplicated, block: B:223:0x05d8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05ec  */
                    /* JADX WARN: Code duplicated, block: B:228:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:231:0x0616  */
                    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj10) {
                        tqv qqvVar;
                        String strA;
                        aev0 aev0Var;
                        uqv uqvVar;
                        qdv0 qdv0Var;
                        qdv0 qdv0Var2;
                        List list9;
                        Object next;
                        ndv0 ndv0Var;
                        boolean z3;
                        String str;
                        String str2;
                        String strL;
                        tf90 tf90Var;
                        tf90 tf90Var2;
                        int length;
                        opm opmVar;
                        int i3;
                        String str3;
                        String str4;
                        mpm kpmVar;
                        String strA2;
                        rdv0 rdv0Var;
                        int i4;
                        uqv uqvVar2;
                        aev0 aev0Var2;
                        byte b11 = b10;
                        int i5 = 10;
                        mco mcoVar = this.b;
                        switch (b11) {
                            case 0:
                                xbo xboVar = (xbo) obj10;
                                xboVar.getClass();
                                List list10 = xboVar.f40610a;
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                zjw zjwVar14 = mcoVar.e;
                                sff0 sff0Var = zjwVar14.b;
                                return ico.a(list10, y78Var2, sff0Var.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar14.e, sff0Var, sip.b, zjwVar14.c, xboVar.c, xboVar.b, ctf0Var2, zjwVar14.s);
                            case 1:
                                fee feeVar = (fee) obj10;
                                feeVar.getClass();
                                zjw zjwVar15 = mcoVar.e;
                                return new gkw(!zjwVar15.f, dyb.o0(zjwVar15.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) mcoVar.h.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) mcoVar.i.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, axh0.f1625a);
                            case 2:
                                List list11 = (List) obj10;
                                list11.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.a().c()).f7971a;
                                boolean zBooleanValue = ((Boolean) ((fee) mcoVar.h.getValue()).c()).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar16 = mcoVar.e;
                                boolean z4 = zjwVar16.f || zjwVar16.f44501a.size() <= 1;
                                boolean z5 = zjwVar16.r;
                                boolean z6 = zjwVar16.s;
                                List list12 = ybo.f42348a;
                                cyberGamesPage3.getClass();
                                ctf0Var3.getClass();
                                if (z4) {
                                    qqvVar = sqv.f32646a;
                                } else {
                                    if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                        strA = ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                    } else if (cyberGamesPage3 instanceof CyberGamesPage.Virtual) {
                                        strA = ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        if (!(cyberGamesPage3 instanceof CyberGamesPage.OneXCyber)) {
                                            t9f.b();
                                            return null;
                                        }
                                        strA = ctf0Var3.b.a(R.string.cyber_games_page_onex_cyber, Arrays.copyOf(new Object[0], 0));
                                    }
                                    qqvVar = new qqv(strA);
                                }
                                zdv0 zdv0Var = z5 ? zdv0.b : zdv0.f44226a;
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_calendar_inactive, false, adv0.f699a));
                                } else {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_tournaments, false, edv0.f7639a));
                                }
                                if (zBooleanValue) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_gift, zBooleanValue2, cdv0.f4183a));
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                                ArrayList arrayList = new ArrayList();
                                for (Iterator it3 = list11.iterator(); it3.hasNext(); it3 = it3) {
                                    eih eihVar = (eih) it3.next();
                                    ArrayList arrayList2 = eihVar.e;
                                    ArrayList<d0t> arrayList3 = new ArrayList();
                                    for (Object obj11 : arrayList2) {
                                        if (!qzb.D0((d0t) obj11)) {
                                            arrayList3.add(obj11);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (d0t d0tVar : arrayList3) {
                                        List listA = ybo.a(1L, d0tVar);
                                        if (listA == null) {
                                            listA = ybo.a(38L, d0tVar);
                                        }
                                        Pair pair = (listA == null || listA.isEmpty()) ? null : new Pair(d0tVar, listA);
                                        if (pair != null) {
                                            arrayList4.add(pair);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj12 : arrayList4) {
                                        Iterable iterable2 = (Iterable) ((Pair) obj12).b;
                                        boolean z7 = z6;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, i5));
                                        Iterator it4 = iterable2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Long.valueOf(((BetZip) it4.next()).f46426a));
                                            arrayList5 = arrayList5;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        if (arrayList6.containsAll(ybo.f42348a)) {
                                            arrayList7.add(obj12);
                                            arrayList5 = arrayList7;
                                        } else {
                                            arrayList5 = arrayList7;
                                        }
                                        z6 = z7;
                                        i5 = 10;
                                    }
                                    boolean z8 = z6;
                                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(arrayList5);
                                    if (pair2 == null) {
                                        uqvVar2 = uqvVar;
                                        aev0Var2 = aev0Var;
                                        rdv0Var = null;
                                        i4 = 0;
                                    } else {
                                        d0t d0tVar2 = (d0t) pair2.f46059a;
                                        List list13 = (List) pair2.b;
                                        BetZip betZip = (BetZip) CollectionsKt.firstOrNull(list13);
                                        String str5 = betZip != null ? betZip.g : null;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        BetZip betZip2 = (BetZip) CollectionsKt.f0(list13);
                                        String str6 = betZip2 != null ? betZip2.g : null;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        aev0 aev0Var3 = aev0Var;
                                        long j = d0tVar2.v;
                                        boolean z9 = d0tVar2.C;
                                        f0t f0tVar = d0tVar2.r;
                                        f0t f0tVar2 = d0tVar2.q;
                                        uqv uqvVar3 = uqvVar;
                                        rqs rqsVar = d0tVar2.p;
                                        int i6 = rqsVar.q;
                                        long j2 = d0tVar2.u;
                                        long j3 = d0tVar2.f5282a;
                                        ndv0 ndv0Var2 = new ndv0(new n0x(eihVar.d), eihVar.c);
                                        String str7 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        qdv0 qdv0Var3 = new qdv0(vsm0.s(f0tVar2.f8731a, str7), str5);
                                        String str8 = (String) CollectionsKt.firstOrNull(f0tVar.d);
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        qdv0 qdv0Var4 = new qdv0(vsm0.s(f0tVar.f8731a, str8), str6);
                                        yk5 yk5Var = mc6.b;
                                        ubr ubrVar = rqsVar.B;
                                        Integer numValueOf = Integer.valueOf(i6);
                                        yk5Var.getClass();
                                        ieu0 ieu0Var = new ieu0(yk5.d(numValueOf).f21536a, ubrVar.f35394a);
                                        ieu0 ieu0Var2 = new ieu0(yk5.d(Integer.valueOf(i6)).f21536a, ubrVar.b);
                                        long j4 = d0tVar2.v;
                                        List list14 = rqsVar.d;
                                        Iterator it5 = xkb.P().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                qdv0Var = qdv0Var3;
                                                yxg yxgVar = (yxg) next;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                if (j4 == yxgVar.b) {
                                                    long j5 = d0tVar2.u;
                                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                                    }
                                                }
                                                qdv0Var3 = qdv0Var;
                                                qdv0Var4 = qdv0Var2;
                                                list14 = list9;
                                            } else {
                                                qdv0Var = qdv0Var3;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                next = null;
                                            }
                                        }
                                        yxg yxgVar2 = (yxg) next;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        yxg yxgVar3 = yxgVar2;
                                        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
                                        if (d0tVar2.z) {
                                            ndv0Var = ndv0Var2;
                                        } else {
                                            ndv0Var = ndv0Var2;
                                            if (!dyb.e0(d0tVar2.s)) {
                                                z3 = false;
                                            }
                                            str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                            if (str == null) {
                                                str = "";
                                            }
                                            str2 = (String) CollectionsKt.f0(listSplit$default);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            if (!z3) {
                                                strL = "";
                                            } else if (!z9 && yxgVar3.c == 1 && !list9.isEmpty()) {
                                                df90 df90Var = (df90) CollectionsKt.f0(list9);
                                                Integer numValueOf2 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : Integer.valueOf(tf90Var2.b);
                                                df90 df90Var2 = (df90) CollectionsKt.f0(list9);
                                                strL = numValueOf2 + "  :  " + ((df90Var2 == null || (tf90Var = df90Var2.b) == null) ? null : Integer.valueOf(tf90Var.c));
                                            } else if (str.length() > 0 || str2.length() <= 0 || j4 == 40) {
                                                strL = "";
                                            } else {
                                                strL = kng0.l(str, "  :  ", str2);
                                            }
                                            length = strL.length();
                                            opmVar = opm.f25648a;
                                            if (length == 0) {
                                                kpmVar = new lpm(opmVar, new gpm());
                                                i3 = 0;
                                            } else {
                                                i3 = 0;
                                                str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                            }
                                            if (z9) {
                                                strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                            } else {
                                                strA2 = "";
                                            }
                                            iev0 iev0Var2 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                            i4 = i3;
                                            uqvVar2 = uqvVar3;
                                            aev0Var2 = aev0Var3;
                                            rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var2, z8);
                                        }
                                        z3 = true;
                                        str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = (String) CollectionsKt.f0(listSplit$default);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (!z3) {
                                            strL = "";
                                        } else if (!z9) {
                                            if (str.length() > 0) {
                                                strL = "";
                                            } else {
                                                strL = "";
                                            }
                                        } else if (str.length() > 0) {
                                            strL = "";
                                        } else {
                                            strL = "";
                                        }
                                        length = strL.length();
                                        opmVar = opm.f25648a;
                                        if (length == 0) {
                                            kpmVar = new lpm(opmVar, new gpm());
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                        }
                                        if (z9) {
                                            strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                        } else {
                                            strA2 = "";
                                        }
                                        iev0 iev0Var3 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                        i4 = i3;
                                        uqvVar2 = uqvVar3;
                                        aev0Var2 = aev0Var3;
                                        rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var3, z8);
                                    }
                                    if (rdv0Var != null) {
                                        arrayList.add(rdv0Var);
                                    }
                                    uqvVar = uqvVar2;
                                    aev0Var = aev0Var2;
                                    z6 = z8;
                                    i5 = 10;
                                }
                                new uqv("HeaderContainerUiModel", qqvVar, new aev0(zdv0Var, i4VarR0, dyb.r0(CollectionsKt.D0(arrayList, 3))));
                                return uqvVar;
                            case 3:
                                List list15 = (List) obj10;
                                list15.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage4.getClass();
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                ArrayList<ypl0> arrayList8 = new ArrayList();
                                for (Object obj13 : list15) {
                                    if (((ypl0) obj13).b.length() > 0) {
                                        arrayList8.add(obj13);
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    String strConcat = "EventFocusDisciplineListUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage4));
                                    ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                    for (ypl0 ypl0Var : arrayList8) {
                                        long j6 = ypl0Var.f43037a;
                                        String str9 = ypl0Var.b;
                                        StringBuilder sb = new StringBuilder(ujn.h);
                                        String str10 = ypl0Var.c.f19909a;
                                        str10.getClass();
                                        if (str10.length() == 0) {
                                            sb.setLength(0);
                                        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                                            sb.setLength(0);
                                            sb.append(str10);
                                        } else {
                                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str10, '/'));
                                        }
                                        arrayList9.add(new e8m(j6, new n0x(sb.toString()), str9));
                                    }
                                    lc00VarB4.add(new wbo(strConcat, new i8m(dyb.o0(arrayList9)), k3g.f17616a));
                                }
                                return kotlin.collections.a.a(lc00VarB4);
                            case 4:
                                boolean zBooleanValue3 = ((Boolean) obj10).booleanValue();
                                ctf0 ctf0Var4 = mcoVar.b;
                                zjw zjwVar17 = mcoVar.e;
                                return qbc.I(zBooleanValue3, ctf0Var4, zjwVar17.f, zjwVar17.b.c.f7565a.d);
                            case 5:
                                n52 n52Var = (n52) obj10;
                                n52Var.getClass();
                                return kco.a(n52Var, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 6:
                                n52 n52Var2 = (n52) obj10;
                                n52Var2.getClass();
                                return kco.a(n52Var2, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 7:
                                List list16 = (List) obj10;
                                list16.getClass();
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage5.getClass();
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                ArrayList<oru0> arrayList10 = new ArrayList();
                                for (Object obj14 : list16) {
                                    if (((oru0) obj14).b.length() > 0) {
                                        arrayList10.add(obj14);
                                    }
                                }
                                if (!arrayList10.isEmpty() && (cyberGamesPage5 instanceof CyberGamesPage.Virtual)) {
                                    String strConcat2 = "HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                    ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                                    for (oru0 oru0Var : arrayList10) {
                                        int i7 = oru0Var.f25753a;
                                        String str11 = oru0Var.b;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String strE = ua80.e(oru0Var.f25753a, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/", ".png");
                                        if (strE.length() == 0) {
                                            sb2.setLength(0);
                                        } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                                            sb2.setLength(0);
                                            sb2.append(strE);
                                        } else {
                                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                                sb2.append('/');
                                            }
                                            sb2.append(StringsKt.y0(strE, '/'));
                                        }
                                        arrayList11.add(new cvl(i7, new n0x(sb2.toString()), Integer.valueOf(R.drawable.cybergames_discipline_placeholder), str11));
                                    }
                                    lc00VarB5.add(new nco(new diw(strConcat2, new zul(dyb.r0(arrayList11)))));
                                }
                                return kotlin.collections.a.a(lc00VarB5);
                            default:
                                xbo xboVar2 = (xbo) obj10;
                                xboVar2.getClass();
                                List list17 = xboVar2.f40610a;
                                y78 y78Var3 = mcoVar.c;
                                zjw zjwVar18 = mcoVar.e;
                                sff0 sff0Var2 = zjwVar18.b;
                                return ico.a(list17, y78Var3, sff0Var2.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar18.e, sff0Var2, sip.c, zjwVar18.c, xboVar2.c, xboVar2.b, mcoVar.b, zjwVar18.s);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar14 = this.e;
                jih jihVar7 = (jih) zjwVar14.h.get(zjwVar14.g.f7971a);
                if (jihVar7 != null) {
                    Object obj10 = jihVar7.b;
                    e0g0 e0g0Var6 = j0g0.b;
                    obj = (List) (obj10 instanceof g0g0 ? null : obj10);
                    obj = obj == null ? iun.f15405a : obj;
                }
                final byte b11 = 3;
                this.l = maz.b(new yw9(obj, new Function1(this) { // from class: a.lco
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:188:0x0551  */
                    /* JADX WARN: Code duplicated, block: B:191:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:193:0x055f  */
                    /* JADX WARN: Code duplicated, block: B:194:0x0562  */
                    /* JADX WARN: Code duplicated, block: B:213:0x05ae  */
                    /* JADX WARN: Code duplicated, block: B:215:0x05b4  */
                    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
                    /* JADX WARN: Code duplicated, block: B:223:0x05d8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05ec  */
                    /* JADX WARN: Code duplicated, block: B:228:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:231:0x0616  */
                    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj11) {
                        tqv qqvVar;
                        String strA;
                        aev0 aev0Var;
                        uqv uqvVar;
                        qdv0 qdv0Var;
                        qdv0 qdv0Var2;
                        List list9;
                        Object next;
                        ndv0 ndv0Var;
                        boolean z3;
                        String str;
                        String str2;
                        String strL;
                        tf90 tf90Var;
                        tf90 tf90Var2;
                        int length;
                        opm opmVar;
                        int i3;
                        String str3;
                        String str4;
                        mpm kpmVar;
                        String strA2;
                        rdv0 rdv0Var;
                        int i4;
                        uqv uqvVar2;
                        aev0 aev0Var2;
                        byte b12 = b11;
                        int i5 = 10;
                        mco mcoVar = this.b;
                        switch (b12) {
                            case 0:
                                xbo xboVar = (xbo) obj11;
                                xboVar.getClass();
                                List list10 = xboVar.f40610a;
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                zjw zjwVar15 = mcoVar.e;
                                sff0 sff0Var = zjwVar15.b;
                                return ico.a(list10, y78Var2, sff0Var.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar15.e, sff0Var, sip.b, zjwVar15.c, xboVar.c, xboVar.b, ctf0Var2, zjwVar15.s);
                            case 1:
                                fee feeVar = (fee) obj11;
                                feeVar.getClass();
                                zjw zjwVar16 = mcoVar.e;
                                return new gkw(!zjwVar16.f, dyb.o0(zjwVar16.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) mcoVar.h.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) mcoVar.i.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, axh0.f1625a);
                            case 2:
                                List list11 = (List) obj11;
                                list11.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.a().c()).f7971a;
                                boolean zBooleanValue = ((Boolean) ((fee) mcoVar.h.getValue()).c()).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar17 = mcoVar.e;
                                boolean z4 = zjwVar17.f || zjwVar17.f44501a.size() <= 1;
                                boolean z5 = zjwVar17.r;
                                boolean z6 = zjwVar17.s;
                                List list12 = ybo.f42348a;
                                cyberGamesPage3.getClass();
                                ctf0Var3.getClass();
                                if (z4) {
                                    qqvVar = sqv.f32646a;
                                } else {
                                    if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                        strA = ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                    } else if (cyberGamesPage3 instanceof CyberGamesPage.Virtual) {
                                        strA = ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        if (!(cyberGamesPage3 instanceof CyberGamesPage.OneXCyber)) {
                                            t9f.b();
                                            return null;
                                        }
                                        strA = ctf0Var3.b.a(R.string.cyber_games_page_onex_cyber, Arrays.copyOf(new Object[0], 0));
                                    }
                                    qqvVar = new qqv(strA);
                                }
                                zdv0 zdv0Var = z5 ? zdv0.b : zdv0.f44226a;
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_calendar_inactive, false, adv0.f699a));
                                } else {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_tournaments, false, edv0.f7639a));
                                }
                                if (zBooleanValue) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_gift, zBooleanValue2, cdv0.f4183a));
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                                ArrayList arrayList = new ArrayList();
                                for (Iterator it3 = list11.iterator(); it3.hasNext(); it3 = it3) {
                                    eih eihVar = (eih) it3.next();
                                    ArrayList arrayList2 = eihVar.e;
                                    ArrayList<d0t> arrayList3 = new ArrayList();
                                    for (Object obj12 : arrayList2) {
                                        if (!qzb.D0((d0t) obj12)) {
                                            arrayList3.add(obj12);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (d0t d0tVar : arrayList3) {
                                        List listA = ybo.a(1L, d0tVar);
                                        if (listA == null) {
                                            listA = ybo.a(38L, d0tVar);
                                        }
                                        Pair pair = (listA == null || listA.isEmpty()) ? null : new Pair(d0tVar, listA);
                                        if (pair != null) {
                                            arrayList4.add(pair);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj13 : arrayList4) {
                                        Iterable iterable2 = (Iterable) ((Pair) obj13).b;
                                        boolean z7 = z6;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, i5));
                                        Iterator it4 = iterable2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Long.valueOf(((BetZip) it4.next()).f46426a));
                                            arrayList5 = arrayList5;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        if (arrayList6.containsAll(ybo.f42348a)) {
                                            arrayList7.add(obj13);
                                            arrayList5 = arrayList7;
                                        } else {
                                            arrayList5 = arrayList7;
                                        }
                                        z6 = z7;
                                        i5 = 10;
                                    }
                                    boolean z8 = z6;
                                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(arrayList5);
                                    if (pair2 == null) {
                                        uqvVar2 = uqvVar;
                                        aev0Var2 = aev0Var;
                                        rdv0Var = null;
                                        i4 = 0;
                                    } else {
                                        d0t d0tVar2 = (d0t) pair2.f46059a;
                                        List list13 = (List) pair2.b;
                                        BetZip betZip = (BetZip) CollectionsKt.firstOrNull(list13);
                                        String str5 = betZip != null ? betZip.g : null;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        BetZip betZip2 = (BetZip) CollectionsKt.f0(list13);
                                        String str6 = betZip2 != null ? betZip2.g : null;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        aev0 aev0Var3 = aev0Var;
                                        long j = d0tVar2.v;
                                        boolean z9 = d0tVar2.C;
                                        f0t f0tVar = d0tVar2.r;
                                        f0t f0tVar2 = d0tVar2.q;
                                        uqv uqvVar3 = uqvVar;
                                        rqs rqsVar = d0tVar2.p;
                                        int i6 = rqsVar.q;
                                        long j2 = d0tVar2.u;
                                        long j3 = d0tVar2.f5282a;
                                        ndv0 ndv0Var2 = new ndv0(new n0x(eihVar.d), eihVar.c);
                                        String str7 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        qdv0 qdv0Var3 = new qdv0(vsm0.s(f0tVar2.f8731a, str7), str5);
                                        String str8 = (String) CollectionsKt.firstOrNull(f0tVar.d);
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        qdv0 qdv0Var4 = new qdv0(vsm0.s(f0tVar.f8731a, str8), str6);
                                        yk5 yk5Var = mc6.b;
                                        ubr ubrVar = rqsVar.B;
                                        Integer numValueOf = Integer.valueOf(i6);
                                        yk5Var.getClass();
                                        ieu0 ieu0Var = new ieu0(yk5.d(numValueOf).f21536a, ubrVar.f35394a);
                                        ieu0 ieu0Var2 = new ieu0(yk5.d(Integer.valueOf(i6)).f21536a, ubrVar.b);
                                        long j4 = d0tVar2.v;
                                        List list14 = rqsVar.d;
                                        Iterator it5 = xkb.P().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                qdv0Var = qdv0Var3;
                                                yxg yxgVar = (yxg) next;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                if (j4 == yxgVar.b) {
                                                    long j5 = d0tVar2.u;
                                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                                    }
                                                }
                                                qdv0Var3 = qdv0Var;
                                                qdv0Var4 = qdv0Var2;
                                                list14 = list9;
                                            } else {
                                                qdv0Var = qdv0Var3;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                next = null;
                                            }
                                        }
                                        yxg yxgVar2 = (yxg) next;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        yxg yxgVar3 = yxgVar2;
                                        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
                                        if (d0tVar2.z) {
                                            ndv0Var = ndv0Var2;
                                        } else {
                                            ndv0Var = ndv0Var2;
                                            if (!dyb.e0(d0tVar2.s)) {
                                                z3 = false;
                                            }
                                            str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                            if (str == null) {
                                                str = "";
                                            }
                                            str2 = (String) CollectionsKt.f0(listSplit$default);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            if (!z3) {
                                                strL = "";
                                            } else if (!z9 && yxgVar3.c == 1 && !list9.isEmpty()) {
                                                df90 df90Var = (df90) CollectionsKt.f0(list9);
                                                Integer numValueOf2 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : Integer.valueOf(tf90Var2.b);
                                                df90 df90Var2 = (df90) CollectionsKt.f0(list9);
                                                strL = numValueOf2 + "  :  " + ((df90Var2 == null || (tf90Var = df90Var2.b) == null) ? null : Integer.valueOf(tf90Var.c));
                                            } else if (str.length() > 0 || str2.length() <= 0 || j4 == 40) {
                                                strL = "";
                                            } else {
                                                strL = kng0.l(str, "  :  ", str2);
                                            }
                                            length = strL.length();
                                            opmVar = opm.f25648a;
                                            if (length == 0) {
                                                kpmVar = new lpm(opmVar, new gpm());
                                                i3 = 0;
                                            } else {
                                                i3 = 0;
                                                str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                            }
                                            if (z9) {
                                                strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                            } else {
                                                strA2 = "";
                                            }
                                            iev0 iev0Var3 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                            i4 = i3;
                                            uqvVar2 = uqvVar3;
                                            aev0Var2 = aev0Var3;
                                            rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var3, z8);
                                        }
                                        z3 = true;
                                        str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = (String) CollectionsKt.f0(listSplit$default);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (!z3) {
                                            strL = "";
                                        } else if (!z9) {
                                            if (str.length() > 0) {
                                                strL = "";
                                            } else {
                                                strL = "";
                                            }
                                        } else if (str.length() > 0) {
                                            strL = "";
                                        } else {
                                            strL = "";
                                        }
                                        length = strL.length();
                                        opmVar = opm.f25648a;
                                        if (length == 0) {
                                            kpmVar = new lpm(opmVar, new gpm());
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                        }
                                        if (z9) {
                                            strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                        } else {
                                            strA2 = "";
                                        }
                                        iev0 iev0Var4 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                        i4 = i3;
                                        uqvVar2 = uqvVar3;
                                        aev0Var2 = aev0Var3;
                                        rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var4, z8);
                                    }
                                    if (rdv0Var != null) {
                                        arrayList.add(rdv0Var);
                                    }
                                    uqvVar = uqvVar2;
                                    aev0Var = aev0Var2;
                                    z6 = z8;
                                    i5 = 10;
                                }
                                new uqv("HeaderContainerUiModel", qqvVar, new aev0(zdv0Var, i4VarR0, dyb.r0(CollectionsKt.D0(arrayList, 3))));
                                return uqvVar;
                            case 3:
                                List list15 = (List) obj11;
                                list15.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage4.getClass();
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                ArrayList<ypl0> arrayList8 = new ArrayList();
                                for (Object obj14 : list15) {
                                    if (((ypl0) obj14).b.length() > 0) {
                                        arrayList8.add(obj14);
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    String strConcat = "EventFocusDisciplineListUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage4));
                                    ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                    for (ypl0 ypl0Var : arrayList8) {
                                        long j6 = ypl0Var.f43037a;
                                        String str9 = ypl0Var.b;
                                        StringBuilder sb = new StringBuilder(ujn.h);
                                        String str10 = ypl0Var.c.f19909a;
                                        str10.getClass();
                                        if (str10.length() == 0) {
                                            sb.setLength(0);
                                        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                                            sb.setLength(0);
                                            sb.append(str10);
                                        } else {
                                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str10, '/'));
                                        }
                                        arrayList9.add(new e8m(j6, new n0x(sb.toString()), str9));
                                    }
                                    lc00VarB4.add(new wbo(strConcat, new i8m(dyb.o0(arrayList9)), k3g.f17616a));
                                }
                                return kotlin.collections.a.a(lc00VarB4);
                            case 4:
                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                ctf0 ctf0Var4 = mcoVar.b;
                                zjw zjwVar18 = mcoVar.e;
                                return qbc.I(zBooleanValue3, ctf0Var4, zjwVar18.f, zjwVar18.b.c.f7565a.d);
                            case 5:
                                n52 n52Var = (n52) obj11;
                                n52Var.getClass();
                                return kco.a(n52Var, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 6:
                                n52 n52Var2 = (n52) obj11;
                                n52Var2.getClass();
                                return kco.a(n52Var2, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 7:
                                List list16 = (List) obj11;
                                list16.getClass();
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage5.getClass();
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                ArrayList<oru0> arrayList10 = new ArrayList();
                                for (Object obj15 : list16) {
                                    if (((oru0) obj15).b.length() > 0) {
                                        arrayList10.add(obj15);
                                    }
                                }
                                if (!arrayList10.isEmpty() && (cyberGamesPage5 instanceof CyberGamesPage.Virtual)) {
                                    String strConcat2 = "HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                    ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                                    for (oru0 oru0Var : arrayList10) {
                                        int i7 = oru0Var.f25753a;
                                        String str11 = oru0Var.b;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String strE = ua80.e(oru0Var.f25753a, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/", ".png");
                                        if (strE.length() == 0) {
                                            sb2.setLength(0);
                                        } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                                            sb2.setLength(0);
                                            sb2.append(strE);
                                        } else {
                                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                                sb2.append('/');
                                            }
                                            sb2.append(StringsKt.y0(strE, '/'));
                                        }
                                        arrayList11.add(new cvl(i7, new n0x(sb2.toString()), Integer.valueOf(R.drawable.cybergames_discipline_placeholder), str11));
                                    }
                                    lc00VarB5.add(new nco(new diw(strConcat2, new zul(dyb.r0(arrayList11)))));
                                }
                                return kotlin.collections.a.a(lc00VarB5);
                            default:
                                xbo xboVar2 = (xbo) obj11;
                                xboVar2.getClass();
                                List list17 = xboVar2.f40610a;
                                y78 y78Var3 = mcoVar.c;
                                zjw zjwVar19 = mcoVar.e;
                                sff0 sff0Var2 = zjwVar19.b;
                                return ico.a(list17, y78Var3, sff0Var2.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar19.e, sff0Var2, sip.c, zjwVar19.c, xboVar2.c, xboVar2.b, mcoVar.b, zjwVar19.s);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar15 = this.e;
                jih jihVar8 = (jih) zjwVar15.h.get(zjwVar15.g.f7971a);
                final byte b12 = 4;
                this.m = maz.b(new yw9(Boolean.valueOf(!(jihVar8 != null && kih.a(jihVar8, ((ekw) a().c()).f7971a, true))), new Function1(this) { // from class: a.lco
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:188:0x0551  */
                    /* JADX WARN: Code duplicated, block: B:191:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:193:0x055f  */
                    /* JADX WARN: Code duplicated, block: B:194:0x0562  */
                    /* JADX WARN: Code duplicated, block: B:213:0x05ae  */
                    /* JADX WARN: Code duplicated, block: B:215:0x05b4  */
                    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
                    /* JADX WARN: Code duplicated, block: B:223:0x05d8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05ec  */
                    /* JADX WARN: Code duplicated, block: B:228:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:231:0x0616  */
                    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj11) {
                        tqv qqvVar;
                        String strA;
                        aev0 aev0Var;
                        uqv uqvVar;
                        qdv0 qdv0Var;
                        qdv0 qdv0Var2;
                        List list9;
                        Object next;
                        ndv0 ndv0Var;
                        boolean z3;
                        String str;
                        String str2;
                        String strL;
                        tf90 tf90Var;
                        tf90 tf90Var2;
                        int length;
                        opm opmVar;
                        int i3;
                        String str3;
                        String str4;
                        mpm kpmVar;
                        String strA2;
                        rdv0 rdv0Var;
                        int i4;
                        uqv uqvVar2;
                        aev0 aev0Var2;
                        byte b13 = b12;
                        int i5 = 10;
                        mco mcoVar = this.b;
                        switch (b13) {
                            case 0:
                                xbo xboVar = (xbo) obj11;
                                xboVar.getClass();
                                List list10 = xboVar.f40610a;
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                zjw zjwVar16 = mcoVar.e;
                                sff0 sff0Var = zjwVar16.b;
                                return ico.a(list10, y78Var2, sff0Var.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar16.e, sff0Var, sip.b, zjwVar16.c, xboVar.c, xboVar.b, ctf0Var2, zjwVar16.s);
                            case 1:
                                fee feeVar = (fee) obj11;
                                feeVar.getClass();
                                zjw zjwVar17 = mcoVar.e;
                                return new gkw(!zjwVar17.f, dyb.o0(zjwVar17.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) mcoVar.h.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) mcoVar.i.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, axh0.f1625a);
                            case 2:
                                List list11 = (List) obj11;
                                list11.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.a().c()).f7971a;
                                boolean zBooleanValue = ((Boolean) ((fee) mcoVar.h.getValue()).c()).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar18 = mcoVar.e;
                                boolean z4 = zjwVar18.f || zjwVar18.f44501a.size() <= 1;
                                boolean z5 = zjwVar18.r;
                                boolean z6 = zjwVar18.s;
                                List list12 = ybo.f42348a;
                                cyberGamesPage3.getClass();
                                ctf0Var3.getClass();
                                if (z4) {
                                    qqvVar = sqv.f32646a;
                                } else {
                                    if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                        strA = ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                    } else if (cyberGamesPage3 instanceof CyberGamesPage.Virtual) {
                                        strA = ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        if (!(cyberGamesPage3 instanceof CyberGamesPage.OneXCyber)) {
                                            t9f.b();
                                            return null;
                                        }
                                        strA = ctf0Var3.b.a(R.string.cyber_games_page_onex_cyber, Arrays.copyOf(new Object[0], 0));
                                    }
                                    qqvVar = new qqv(strA);
                                }
                                zdv0 zdv0Var = z5 ? zdv0.b : zdv0.f44226a;
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_calendar_inactive, false, adv0.f699a));
                                } else {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_tournaments, false, edv0.f7639a));
                                }
                                if (zBooleanValue) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_gift, zBooleanValue2, cdv0.f4183a));
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                                ArrayList arrayList = new ArrayList();
                                for (Iterator it3 = list11.iterator(); it3.hasNext(); it3 = it3) {
                                    eih eihVar = (eih) it3.next();
                                    ArrayList arrayList2 = eihVar.e;
                                    ArrayList<d0t> arrayList3 = new ArrayList();
                                    for (Object obj12 : arrayList2) {
                                        if (!qzb.D0((d0t) obj12)) {
                                            arrayList3.add(obj12);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (d0t d0tVar : arrayList3) {
                                        List listA = ybo.a(1L, d0tVar);
                                        if (listA == null) {
                                            listA = ybo.a(38L, d0tVar);
                                        }
                                        Pair pair = (listA == null || listA.isEmpty()) ? null : new Pair(d0tVar, listA);
                                        if (pair != null) {
                                            arrayList4.add(pair);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj13 : arrayList4) {
                                        Iterable iterable2 = (Iterable) ((Pair) obj13).b;
                                        boolean z7 = z6;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, i5));
                                        Iterator it4 = iterable2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Long.valueOf(((BetZip) it4.next()).f46426a));
                                            arrayList5 = arrayList5;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        if (arrayList6.containsAll(ybo.f42348a)) {
                                            arrayList7.add(obj13);
                                            arrayList5 = arrayList7;
                                        } else {
                                            arrayList5 = arrayList7;
                                        }
                                        z6 = z7;
                                        i5 = 10;
                                    }
                                    boolean z8 = z6;
                                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(arrayList5);
                                    if (pair2 == null) {
                                        uqvVar2 = uqvVar;
                                        aev0Var2 = aev0Var;
                                        rdv0Var = null;
                                        i4 = 0;
                                    } else {
                                        d0t d0tVar2 = (d0t) pair2.f46059a;
                                        List list13 = (List) pair2.b;
                                        BetZip betZip = (BetZip) CollectionsKt.firstOrNull(list13);
                                        String str5 = betZip != null ? betZip.g : null;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        BetZip betZip2 = (BetZip) CollectionsKt.f0(list13);
                                        String str6 = betZip2 != null ? betZip2.g : null;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        aev0 aev0Var3 = aev0Var;
                                        long j = d0tVar2.v;
                                        boolean z9 = d0tVar2.C;
                                        f0t f0tVar = d0tVar2.r;
                                        f0t f0tVar2 = d0tVar2.q;
                                        uqv uqvVar3 = uqvVar;
                                        rqs rqsVar = d0tVar2.p;
                                        int i6 = rqsVar.q;
                                        long j2 = d0tVar2.u;
                                        long j3 = d0tVar2.f5282a;
                                        ndv0 ndv0Var2 = new ndv0(new n0x(eihVar.d), eihVar.c);
                                        String str7 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        qdv0 qdv0Var3 = new qdv0(vsm0.s(f0tVar2.f8731a, str7), str5);
                                        String str8 = (String) CollectionsKt.firstOrNull(f0tVar.d);
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        qdv0 qdv0Var4 = new qdv0(vsm0.s(f0tVar.f8731a, str8), str6);
                                        yk5 yk5Var = mc6.b;
                                        ubr ubrVar = rqsVar.B;
                                        Integer numValueOf = Integer.valueOf(i6);
                                        yk5Var.getClass();
                                        ieu0 ieu0Var = new ieu0(yk5.d(numValueOf).f21536a, ubrVar.f35394a);
                                        ieu0 ieu0Var2 = new ieu0(yk5.d(Integer.valueOf(i6)).f21536a, ubrVar.b);
                                        long j4 = d0tVar2.v;
                                        List list14 = rqsVar.d;
                                        Iterator it5 = xkb.P().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                qdv0Var = qdv0Var3;
                                                yxg yxgVar = (yxg) next;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                if (j4 == yxgVar.b) {
                                                    long j5 = d0tVar2.u;
                                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                                    }
                                                }
                                                qdv0Var3 = qdv0Var;
                                                qdv0Var4 = qdv0Var2;
                                                list14 = list9;
                                            } else {
                                                qdv0Var = qdv0Var3;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                next = null;
                                            }
                                        }
                                        yxg yxgVar2 = (yxg) next;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        yxg yxgVar3 = yxgVar2;
                                        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
                                        if (d0tVar2.z) {
                                            ndv0Var = ndv0Var2;
                                        } else {
                                            ndv0Var = ndv0Var2;
                                            if (!dyb.e0(d0tVar2.s)) {
                                                z3 = false;
                                            }
                                            str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                            if (str == null) {
                                                str = "";
                                            }
                                            str2 = (String) CollectionsKt.f0(listSplit$default);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            if (!z3) {
                                                strL = "";
                                            } else if (!z9 && yxgVar3.c == 1 && !list9.isEmpty()) {
                                                df90 df90Var = (df90) CollectionsKt.f0(list9);
                                                Integer numValueOf2 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : Integer.valueOf(tf90Var2.b);
                                                df90 df90Var2 = (df90) CollectionsKt.f0(list9);
                                                strL = numValueOf2 + "  :  " + ((df90Var2 == null || (tf90Var = df90Var2.b) == null) ? null : Integer.valueOf(tf90Var.c));
                                            } else if (str.length() > 0 || str2.length() <= 0 || j4 == 40) {
                                                strL = "";
                                            } else {
                                                strL = kng0.l(str, "  :  ", str2);
                                            }
                                            length = strL.length();
                                            opmVar = opm.f25648a;
                                            if (length == 0) {
                                                kpmVar = new lpm(opmVar, new gpm());
                                                i3 = 0;
                                            } else {
                                                i3 = 0;
                                                str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                            }
                                            if (z9) {
                                                strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                            } else {
                                                strA2 = "";
                                            }
                                            iev0 iev0Var4 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                            i4 = i3;
                                            uqvVar2 = uqvVar3;
                                            aev0Var2 = aev0Var3;
                                            rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var4, z8);
                                        }
                                        z3 = true;
                                        str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = (String) CollectionsKt.f0(listSplit$default);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (!z3) {
                                            strL = "";
                                        } else if (!z9) {
                                            if (str.length() > 0) {
                                                strL = "";
                                            } else {
                                                strL = "";
                                            }
                                        } else if (str.length() > 0) {
                                            strL = "";
                                        } else {
                                            strL = "";
                                        }
                                        length = strL.length();
                                        opmVar = opm.f25648a;
                                        if (length == 0) {
                                            kpmVar = new lpm(opmVar, new gpm());
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                        }
                                        if (z9) {
                                            strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                        } else {
                                            strA2 = "";
                                        }
                                        iev0 iev0Var5 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                        i4 = i3;
                                        uqvVar2 = uqvVar3;
                                        aev0Var2 = aev0Var3;
                                        rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var5, z8);
                                    }
                                    if (rdv0Var != null) {
                                        arrayList.add(rdv0Var);
                                    }
                                    uqvVar = uqvVar2;
                                    aev0Var = aev0Var2;
                                    z6 = z8;
                                    i5 = 10;
                                }
                                new uqv("HeaderContainerUiModel", qqvVar, new aev0(zdv0Var, i4VarR0, dyb.r0(CollectionsKt.D0(arrayList, 3))));
                                return uqvVar;
                            case 3:
                                List list15 = (List) obj11;
                                list15.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage4.getClass();
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                ArrayList<ypl0> arrayList8 = new ArrayList();
                                for (Object obj14 : list15) {
                                    if (((ypl0) obj14).b.length() > 0) {
                                        arrayList8.add(obj14);
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    String strConcat = "EventFocusDisciplineListUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage4));
                                    ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                    for (ypl0 ypl0Var : arrayList8) {
                                        long j6 = ypl0Var.f43037a;
                                        String str9 = ypl0Var.b;
                                        StringBuilder sb = new StringBuilder(ujn.h);
                                        String str10 = ypl0Var.c.f19909a;
                                        str10.getClass();
                                        if (str10.length() == 0) {
                                            sb.setLength(0);
                                        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                                            sb.setLength(0);
                                            sb.append(str10);
                                        } else {
                                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str10, '/'));
                                        }
                                        arrayList9.add(new e8m(j6, new n0x(sb.toString()), str9));
                                    }
                                    lc00VarB4.add(new wbo(strConcat, new i8m(dyb.o0(arrayList9)), k3g.f17616a));
                                }
                                return kotlin.collections.a.a(lc00VarB4);
                            case 4:
                                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                                ctf0 ctf0Var4 = mcoVar.b;
                                zjw zjwVar19 = mcoVar.e;
                                return qbc.I(zBooleanValue3, ctf0Var4, zjwVar19.f, zjwVar19.b.c.f7565a.d);
                            case 5:
                                n52 n52Var = (n52) obj11;
                                n52Var.getClass();
                                return kco.a(n52Var, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 6:
                                n52 n52Var2 = (n52) obj11;
                                n52Var2.getClass();
                                return kco.a(n52Var2, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 7:
                                List list16 = (List) obj11;
                                list16.getClass();
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage5.getClass();
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                ArrayList<oru0> arrayList10 = new ArrayList();
                                for (Object obj15 : list16) {
                                    if (((oru0) obj15).b.length() > 0) {
                                        arrayList10.add(obj15);
                                    }
                                }
                                if (!arrayList10.isEmpty() && (cyberGamesPage5 instanceof CyberGamesPage.Virtual)) {
                                    String strConcat2 = "HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                    ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                                    for (oru0 oru0Var : arrayList10) {
                                        int i7 = oru0Var.f25753a;
                                        String str11 = oru0Var.b;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String strE = ua80.e(oru0Var.f25753a, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/", ".png");
                                        if (strE.length() == 0) {
                                            sb2.setLength(0);
                                        } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                                            sb2.setLength(0);
                                            sb2.append(strE);
                                        } else {
                                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                                sb2.append('/');
                                            }
                                            sb2.append(StringsKt.y0(strE, '/'));
                                        }
                                        arrayList11.add(new cvl(i7, new n0x(sb2.toString()), Integer.valueOf(R.drawable.cybergames_discipline_placeholder), str11));
                                    }
                                    lc00VarB5.add(new nco(new diw(strConcat2, new zul(dyb.r0(arrayList11)))));
                                }
                                return kotlin.collections.a.a(lc00VarB5);
                            default:
                                xbo xboVar2 = (xbo) obj11;
                                xboVar2.getClass();
                                List list17 = xboVar2.f40610a;
                                y78 y78Var3 = mcoVar.c;
                                zjw zjwVar110 = mcoVar.e;
                                sff0 sff0Var2 = zjwVar110.b;
                                return ico.a(list17, y78Var3, sff0Var2.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar110.e, sff0Var2, sip.c, zjwVar110.c, xboVar2.c, xboVar2.b, mcoVar.b, zjwVar110.s);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar16 = this.e;
                jih jihVar9 = (jih) zjwVar16.h.get(zjwVar16.g.f7971a);
                if (jihVar9 != null) {
                    Object obj11 = jihVar9.e;
                    e0g0 e0g0Var7 = j0g0.b;
                    obj2 = (List) (obj11 instanceof g0g0 ? null : obj11);
                    obj2 = obj2 == null ? iun.f15405a : obj2;
                }
                this.n = maz.b(new yw9(obj2, new mmn((byte) 16), (byte) 20));
                zjw zjwVar17 = this.e;
                jih jihVar10 = (jih) zjwVar17.h.get(zjwVar17.g.f7971a);
                if (jihVar10 != null) {
                    Object obj12 = jihVar10.i;
                    e0g0 e0g0Var8 = j0g0.b;
                    list4 = (List) (obj12 instanceof g0g0 ? null : obj12);
                    list4 = list4 == null ? iun.f15405a : list4;
                }
                final byte b13 = 5;
                this.o = maz.b(new yw9(cwr0.S(list4), new Function1(this) { // from class: a.lco
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:188:0x0551  */
                    /* JADX WARN: Code duplicated, block: B:191:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:193:0x055f  */
                    /* JADX WARN: Code duplicated, block: B:194:0x0562  */
                    /* JADX WARN: Code duplicated, block: B:213:0x05ae  */
                    /* JADX WARN: Code duplicated, block: B:215:0x05b4  */
                    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
                    /* JADX WARN: Code duplicated, block: B:223:0x05d8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05ec  */
                    /* JADX WARN: Code duplicated, block: B:228:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:231:0x0616  */
                    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj13) {
                        tqv qqvVar;
                        String strA;
                        aev0 aev0Var;
                        uqv uqvVar;
                        qdv0 qdv0Var;
                        qdv0 qdv0Var2;
                        List list9;
                        Object next;
                        ndv0 ndv0Var;
                        boolean z3;
                        String str;
                        String str2;
                        String strL;
                        tf90 tf90Var;
                        tf90 tf90Var2;
                        int length;
                        opm opmVar;
                        int i3;
                        String str3;
                        String str4;
                        mpm kpmVar;
                        String strA2;
                        rdv0 rdv0Var;
                        int i4;
                        uqv uqvVar2;
                        aev0 aev0Var2;
                        byte b14 = b13;
                        int i5 = 10;
                        mco mcoVar = this.b;
                        switch (b14) {
                            case 0:
                                xbo xboVar = (xbo) obj13;
                                xboVar.getClass();
                                List list10 = xboVar.f40610a;
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                zjw zjwVar18 = mcoVar.e;
                                sff0 sff0Var = zjwVar18.b;
                                return ico.a(list10, y78Var2, sff0Var.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar18.e, sff0Var, sip.b, zjwVar18.c, xboVar.c, xboVar.b, ctf0Var2, zjwVar18.s);
                            case 1:
                                fee feeVar = (fee) obj13;
                                feeVar.getClass();
                                zjw zjwVar19 = mcoVar.e;
                                return new gkw(!zjwVar19.f, dyb.o0(zjwVar19.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) mcoVar.h.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) mcoVar.i.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, axh0.f1625a);
                            case 2:
                                List list11 = (List) obj13;
                                list11.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.a().c()).f7971a;
                                boolean zBooleanValue = ((Boolean) ((fee) mcoVar.h.getValue()).c()).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar110 = mcoVar.e;
                                boolean z4 = zjwVar110.f || zjwVar110.f44501a.size() <= 1;
                                boolean z5 = zjwVar110.r;
                                boolean z6 = zjwVar110.s;
                                List list12 = ybo.f42348a;
                                cyberGamesPage3.getClass();
                                ctf0Var3.getClass();
                                if (z4) {
                                    qqvVar = sqv.f32646a;
                                } else {
                                    if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                        strA = ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                    } else if (cyberGamesPage3 instanceof CyberGamesPage.Virtual) {
                                        strA = ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        if (!(cyberGamesPage3 instanceof CyberGamesPage.OneXCyber)) {
                                            t9f.b();
                                            return null;
                                        }
                                        strA = ctf0Var3.b.a(R.string.cyber_games_page_onex_cyber, Arrays.copyOf(new Object[0], 0));
                                    }
                                    qqvVar = new qqv(strA);
                                }
                                zdv0 zdv0Var = z5 ? zdv0.b : zdv0.f44226a;
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_calendar_inactive, false, adv0.f699a));
                                } else {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_tournaments, false, edv0.f7639a));
                                }
                                if (zBooleanValue) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_gift, zBooleanValue2, cdv0.f4183a));
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                                ArrayList arrayList = new ArrayList();
                                for (Iterator it3 = list11.iterator(); it3.hasNext(); it3 = it3) {
                                    eih eihVar = (eih) it3.next();
                                    ArrayList arrayList2 = eihVar.e;
                                    ArrayList<d0t> arrayList3 = new ArrayList();
                                    for (Object obj14 : arrayList2) {
                                        if (!qzb.D0((d0t) obj14)) {
                                            arrayList3.add(obj14);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (d0t d0tVar : arrayList3) {
                                        List listA = ybo.a(1L, d0tVar);
                                        if (listA == null) {
                                            listA = ybo.a(38L, d0tVar);
                                        }
                                        Pair pair = (listA == null || listA.isEmpty()) ? null : new Pair(d0tVar, listA);
                                        if (pair != null) {
                                            arrayList4.add(pair);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj15 : arrayList4) {
                                        Iterable iterable2 = (Iterable) ((Pair) obj15).b;
                                        boolean z7 = z6;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, i5));
                                        Iterator it4 = iterable2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Long.valueOf(((BetZip) it4.next()).f46426a));
                                            arrayList5 = arrayList5;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        if (arrayList6.containsAll(ybo.f42348a)) {
                                            arrayList7.add(obj15);
                                            arrayList5 = arrayList7;
                                        } else {
                                            arrayList5 = arrayList7;
                                        }
                                        z6 = z7;
                                        i5 = 10;
                                    }
                                    boolean z8 = z6;
                                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(arrayList5);
                                    if (pair2 == null) {
                                        uqvVar2 = uqvVar;
                                        aev0Var2 = aev0Var;
                                        rdv0Var = null;
                                        i4 = 0;
                                    } else {
                                        d0t d0tVar2 = (d0t) pair2.f46059a;
                                        List list13 = (List) pair2.b;
                                        BetZip betZip = (BetZip) CollectionsKt.firstOrNull(list13);
                                        String str5 = betZip != null ? betZip.g : null;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        BetZip betZip2 = (BetZip) CollectionsKt.f0(list13);
                                        String str6 = betZip2 != null ? betZip2.g : null;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        aev0 aev0Var3 = aev0Var;
                                        long j = d0tVar2.v;
                                        boolean z9 = d0tVar2.C;
                                        f0t f0tVar = d0tVar2.r;
                                        f0t f0tVar2 = d0tVar2.q;
                                        uqv uqvVar3 = uqvVar;
                                        rqs rqsVar = d0tVar2.p;
                                        int i6 = rqsVar.q;
                                        long j2 = d0tVar2.u;
                                        long j3 = d0tVar2.f5282a;
                                        ndv0 ndv0Var2 = new ndv0(new n0x(eihVar.d), eihVar.c);
                                        String str7 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        qdv0 qdv0Var3 = new qdv0(vsm0.s(f0tVar2.f8731a, str7), str5);
                                        String str8 = (String) CollectionsKt.firstOrNull(f0tVar.d);
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        qdv0 qdv0Var4 = new qdv0(vsm0.s(f0tVar.f8731a, str8), str6);
                                        yk5 yk5Var = mc6.b;
                                        ubr ubrVar = rqsVar.B;
                                        Integer numValueOf = Integer.valueOf(i6);
                                        yk5Var.getClass();
                                        ieu0 ieu0Var = new ieu0(yk5.d(numValueOf).f21536a, ubrVar.f35394a);
                                        ieu0 ieu0Var2 = new ieu0(yk5.d(Integer.valueOf(i6)).f21536a, ubrVar.b);
                                        long j4 = d0tVar2.v;
                                        List list14 = rqsVar.d;
                                        Iterator it5 = xkb.P().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                qdv0Var = qdv0Var3;
                                                yxg yxgVar = (yxg) next;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                if (j4 == yxgVar.b) {
                                                    long j5 = d0tVar2.u;
                                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                                    }
                                                }
                                                qdv0Var3 = qdv0Var;
                                                qdv0Var4 = qdv0Var2;
                                                list14 = list9;
                                            } else {
                                                qdv0Var = qdv0Var3;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                next = null;
                                            }
                                        }
                                        yxg yxgVar2 = (yxg) next;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        yxg yxgVar3 = yxgVar2;
                                        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
                                        if (d0tVar2.z) {
                                            ndv0Var = ndv0Var2;
                                        } else {
                                            ndv0Var = ndv0Var2;
                                            if (!dyb.e0(d0tVar2.s)) {
                                                z3 = false;
                                            }
                                            str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                            if (str == null) {
                                                str = "";
                                            }
                                            str2 = (String) CollectionsKt.f0(listSplit$default);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            if (!z3) {
                                                strL = "";
                                            } else if (!z9 && yxgVar3.c == 1 && !list9.isEmpty()) {
                                                df90 df90Var = (df90) CollectionsKt.f0(list9);
                                                Integer numValueOf2 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : Integer.valueOf(tf90Var2.b);
                                                df90 df90Var2 = (df90) CollectionsKt.f0(list9);
                                                strL = numValueOf2 + "  :  " + ((df90Var2 == null || (tf90Var = df90Var2.b) == null) ? null : Integer.valueOf(tf90Var.c));
                                            } else if (str.length() > 0 || str2.length() <= 0 || j4 == 40) {
                                                strL = "";
                                            } else {
                                                strL = kng0.l(str, "  :  ", str2);
                                            }
                                            length = strL.length();
                                            opmVar = opm.f25648a;
                                            if (length == 0) {
                                                kpmVar = new lpm(opmVar, new gpm());
                                                i3 = 0;
                                            } else {
                                                i3 = 0;
                                                str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                            }
                                            if (z9) {
                                                strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                            } else {
                                                strA2 = "";
                                            }
                                            iev0 iev0Var5 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                            i4 = i3;
                                            uqvVar2 = uqvVar3;
                                            aev0Var2 = aev0Var3;
                                            rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var5, z8);
                                        }
                                        z3 = true;
                                        str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = (String) CollectionsKt.f0(listSplit$default);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (!z3) {
                                            strL = "";
                                        } else if (!z9) {
                                            if (str.length() > 0) {
                                                strL = "";
                                            } else {
                                                strL = "";
                                            }
                                        } else if (str.length() > 0) {
                                            strL = "";
                                        } else {
                                            strL = "";
                                        }
                                        length = strL.length();
                                        opmVar = opm.f25648a;
                                        if (length == 0) {
                                            kpmVar = new lpm(opmVar, new gpm());
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                        }
                                        if (z9) {
                                            strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                        } else {
                                            strA2 = "";
                                        }
                                        iev0 iev0Var6 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                        i4 = i3;
                                        uqvVar2 = uqvVar3;
                                        aev0Var2 = aev0Var3;
                                        rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var6, z8);
                                    }
                                    if (rdv0Var != null) {
                                        arrayList.add(rdv0Var);
                                    }
                                    uqvVar = uqvVar2;
                                    aev0Var = aev0Var2;
                                    z6 = z8;
                                    i5 = 10;
                                }
                                new uqv("HeaderContainerUiModel", qqvVar, new aev0(zdv0Var, i4VarR0, dyb.r0(CollectionsKt.D0(arrayList, 3))));
                                return uqvVar;
                            case 3:
                                List list15 = (List) obj13;
                                list15.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage4.getClass();
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                ArrayList<ypl0> arrayList8 = new ArrayList();
                                for (Object obj16 : list15) {
                                    if (((ypl0) obj16).b.length() > 0) {
                                        arrayList8.add(obj16);
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    String strConcat = "EventFocusDisciplineListUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage4));
                                    ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                    for (ypl0 ypl0Var : arrayList8) {
                                        long j6 = ypl0Var.f43037a;
                                        String str9 = ypl0Var.b;
                                        StringBuilder sb = new StringBuilder(ujn.h);
                                        String str10 = ypl0Var.c.f19909a;
                                        str10.getClass();
                                        if (str10.length() == 0) {
                                            sb.setLength(0);
                                        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                                            sb.setLength(0);
                                            sb.append(str10);
                                        } else {
                                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str10, '/'));
                                        }
                                        arrayList9.add(new e8m(j6, new n0x(sb.toString()), str9));
                                    }
                                    lc00VarB4.add(new wbo(strConcat, new i8m(dyb.o0(arrayList9)), k3g.f17616a));
                                }
                                return kotlin.collections.a.a(lc00VarB4);
                            case 4:
                                boolean zBooleanValue3 = ((Boolean) obj13).booleanValue();
                                ctf0 ctf0Var4 = mcoVar.b;
                                zjw zjwVar111 = mcoVar.e;
                                return qbc.I(zBooleanValue3, ctf0Var4, zjwVar111.f, zjwVar111.b.c.f7565a.d);
                            case 5:
                                n52 n52Var = (n52) obj13;
                                n52Var.getClass();
                                return kco.a(n52Var, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 6:
                                n52 n52Var2 = (n52) obj13;
                                n52Var2.getClass();
                                return kco.a(n52Var2, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 7:
                                List list16 = (List) obj13;
                                list16.getClass();
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage5.getClass();
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                ArrayList<oru0> arrayList10 = new ArrayList();
                                for (Object obj17 : list16) {
                                    if (((oru0) obj17).b.length() > 0) {
                                        arrayList10.add(obj17);
                                    }
                                }
                                if (!arrayList10.isEmpty() && (cyberGamesPage5 instanceof CyberGamesPage.Virtual)) {
                                    String strConcat2 = "HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                    ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                                    for (oru0 oru0Var : arrayList10) {
                                        int i7 = oru0Var.f25753a;
                                        String str11 = oru0Var.b;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String strE = ua80.e(oru0Var.f25753a, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/", ".png");
                                        if (strE.length() == 0) {
                                            sb2.setLength(0);
                                        } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                                            sb2.setLength(0);
                                            sb2.append(strE);
                                        } else {
                                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                                sb2.append('/');
                                            }
                                            sb2.append(StringsKt.y0(strE, '/'));
                                        }
                                        arrayList11.add(new cvl(i7, new n0x(sb2.toString()), Integer.valueOf(R.drawable.cybergames_discipline_placeholder), str11));
                                    }
                                    lc00VarB5.add(new nco(new diw(strConcat2, new zul(dyb.r0(arrayList11)))));
                                }
                                return kotlin.collections.a.a(lc00VarB5);
                            default:
                                xbo xboVar2 = (xbo) obj13;
                                xboVar2.getClass();
                                List list17 = xboVar2.f40610a;
                                y78 y78Var3 = mcoVar.c;
                                zjw zjwVar112 = mcoVar.e;
                                sff0 sff0Var2 = zjwVar112.b;
                                return ico.a(list17, y78Var3, sff0Var2.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar112.e, sff0Var2, sip.c, zjwVar112.c, xboVar2.c, xboVar2.b, mcoVar.b, zjwVar112.s);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar18 = this.e;
                final byte b14 = 6;
                this.p = maz.b(new yw9(phu0.W((jih) zjwVar18.h.get(zjwVar18.g.f7971a)), new Function1(this) { // from class: a.lco
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:188:0x0551  */
                    /* JADX WARN: Code duplicated, block: B:191:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:193:0x055f  */
                    /* JADX WARN: Code duplicated, block: B:194:0x0562  */
                    /* JADX WARN: Code duplicated, block: B:213:0x05ae  */
                    /* JADX WARN: Code duplicated, block: B:215:0x05b4  */
                    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
                    /* JADX WARN: Code duplicated, block: B:223:0x05d8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05ec  */
                    /* JADX WARN: Code duplicated, block: B:228:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:231:0x0616  */
                    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj13) {
                        tqv qqvVar;
                        String strA;
                        aev0 aev0Var;
                        uqv uqvVar;
                        qdv0 qdv0Var;
                        qdv0 qdv0Var2;
                        List list9;
                        Object next;
                        ndv0 ndv0Var;
                        boolean z3;
                        String str;
                        String str2;
                        String strL;
                        tf90 tf90Var;
                        tf90 tf90Var2;
                        int length;
                        opm opmVar;
                        int i3;
                        String str3;
                        String str4;
                        mpm kpmVar;
                        String strA2;
                        rdv0 rdv0Var;
                        int i4;
                        uqv uqvVar2;
                        aev0 aev0Var2;
                        byte b15 = b14;
                        int i5 = 10;
                        mco mcoVar = this.b;
                        switch (b15) {
                            case 0:
                                xbo xboVar = (xbo) obj13;
                                xboVar.getClass();
                                List list10 = xboVar.f40610a;
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                zjw zjwVar19 = mcoVar.e;
                                sff0 sff0Var = zjwVar19.b;
                                return ico.a(list10, y78Var2, sff0Var.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar19.e, sff0Var, sip.b, zjwVar19.c, xboVar.c, xboVar.b, ctf0Var2, zjwVar19.s);
                            case 1:
                                fee feeVar = (fee) obj13;
                                feeVar.getClass();
                                zjw zjwVar110 = mcoVar.e;
                                return new gkw(!zjwVar110.f, dyb.o0(zjwVar110.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) mcoVar.h.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) mcoVar.i.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, axh0.f1625a);
                            case 2:
                                List list11 = (List) obj13;
                                list11.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.a().c()).f7971a;
                                boolean zBooleanValue = ((Boolean) ((fee) mcoVar.h.getValue()).c()).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar111 = mcoVar.e;
                                boolean z4 = zjwVar111.f || zjwVar111.f44501a.size() <= 1;
                                boolean z5 = zjwVar111.r;
                                boolean z6 = zjwVar111.s;
                                List list12 = ybo.f42348a;
                                cyberGamesPage3.getClass();
                                ctf0Var3.getClass();
                                if (z4) {
                                    qqvVar = sqv.f32646a;
                                } else {
                                    if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                        strA = ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                    } else if (cyberGamesPage3 instanceof CyberGamesPage.Virtual) {
                                        strA = ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        if (!(cyberGamesPage3 instanceof CyberGamesPage.OneXCyber)) {
                                            t9f.b();
                                            return null;
                                        }
                                        strA = ctf0Var3.b.a(R.string.cyber_games_page_onex_cyber, Arrays.copyOf(new Object[0], 0));
                                    }
                                    qqvVar = new qqv(strA);
                                }
                                zdv0 zdv0Var = z5 ? zdv0.b : zdv0.f44226a;
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_calendar_inactive, false, adv0.f699a));
                                } else {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_tournaments, false, edv0.f7639a));
                                }
                                if (zBooleanValue) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_gift, zBooleanValue2, cdv0.f4183a));
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                                ArrayList arrayList = new ArrayList();
                                for (Iterator it3 = list11.iterator(); it3.hasNext(); it3 = it3) {
                                    eih eihVar = (eih) it3.next();
                                    ArrayList arrayList2 = eihVar.e;
                                    ArrayList<d0t> arrayList3 = new ArrayList();
                                    for (Object obj14 : arrayList2) {
                                        if (!qzb.D0((d0t) obj14)) {
                                            arrayList3.add(obj14);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (d0t d0tVar : arrayList3) {
                                        List listA = ybo.a(1L, d0tVar);
                                        if (listA == null) {
                                            listA = ybo.a(38L, d0tVar);
                                        }
                                        Pair pair = (listA == null || listA.isEmpty()) ? null : new Pair(d0tVar, listA);
                                        if (pair != null) {
                                            arrayList4.add(pair);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj15 : arrayList4) {
                                        Iterable iterable2 = (Iterable) ((Pair) obj15).b;
                                        boolean z7 = z6;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, i5));
                                        Iterator it4 = iterable2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Long.valueOf(((BetZip) it4.next()).f46426a));
                                            arrayList5 = arrayList5;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        if (arrayList6.containsAll(ybo.f42348a)) {
                                            arrayList7.add(obj15);
                                            arrayList5 = arrayList7;
                                        } else {
                                            arrayList5 = arrayList7;
                                        }
                                        z6 = z7;
                                        i5 = 10;
                                    }
                                    boolean z8 = z6;
                                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(arrayList5);
                                    if (pair2 == null) {
                                        uqvVar2 = uqvVar;
                                        aev0Var2 = aev0Var;
                                        rdv0Var = null;
                                        i4 = 0;
                                    } else {
                                        d0t d0tVar2 = (d0t) pair2.f46059a;
                                        List list13 = (List) pair2.b;
                                        BetZip betZip = (BetZip) CollectionsKt.firstOrNull(list13);
                                        String str5 = betZip != null ? betZip.g : null;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        BetZip betZip2 = (BetZip) CollectionsKt.f0(list13);
                                        String str6 = betZip2 != null ? betZip2.g : null;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        aev0 aev0Var3 = aev0Var;
                                        long j = d0tVar2.v;
                                        boolean z9 = d0tVar2.C;
                                        f0t f0tVar = d0tVar2.r;
                                        f0t f0tVar2 = d0tVar2.q;
                                        uqv uqvVar3 = uqvVar;
                                        rqs rqsVar = d0tVar2.p;
                                        int i6 = rqsVar.q;
                                        long j2 = d0tVar2.u;
                                        long j3 = d0tVar2.f5282a;
                                        ndv0 ndv0Var2 = new ndv0(new n0x(eihVar.d), eihVar.c);
                                        String str7 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        qdv0 qdv0Var3 = new qdv0(vsm0.s(f0tVar2.f8731a, str7), str5);
                                        String str8 = (String) CollectionsKt.firstOrNull(f0tVar.d);
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        qdv0 qdv0Var4 = new qdv0(vsm0.s(f0tVar.f8731a, str8), str6);
                                        yk5 yk5Var = mc6.b;
                                        ubr ubrVar = rqsVar.B;
                                        Integer numValueOf = Integer.valueOf(i6);
                                        yk5Var.getClass();
                                        ieu0 ieu0Var = new ieu0(yk5.d(numValueOf).f21536a, ubrVar.f35394a);
                                        ieu0 ieu0Var2 = new ieu0(yk5.d(Integer.valueOf(i6)).f21536a, ubrVar.b);
                                        long j4 = d0tVar2.v;
                                        List list14 = rqsVar.d;
                                        Iterator it5 = xkb.P().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                qdv0Var = qdv0Var3;
                                                yxg yxgVar = (yxg) next;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                if (j4 == yxgVar.b) {
                                                    long j5 = d0tVar2.u;
                                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                                    }
                                                }
                                                qdv0Var3 = qdv0Var;
                                                qdv0Var4 = qdv0Var2;
                                                list14 = list9;
                                            } else {
                                                qdv0Var = qdv0Var3;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                next = null;
                                            }
                                        }
                                        yxg yxgVar2 = (yxg) next;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        yxg yxgVar3 = yxgVar2;
                                        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
                                        if (d0tVar2.z) {
                                            ndv0Var = ndv0Var2;
                                        } else {
                                            ndv0Var = ndv0Var2;
                                            if (!dyb.e0(d0tVar2.s)) {
                                                z3 = false;
                                            }
                                            str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                            if (str == null) {
                                                str = "";
                                            }
                                            str2 = (String) CollectionsKt.f0(listSplit$default);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            if (!z3) {
                                                strL = "";
                                            } else if (!z9 && yxgVar3.c == 1 && !list9.isEmpty()) {
                                                df90 df90Var = (df90) CollectionsKt.f0(list9);
                                                Integer numValueOf2 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : Integer.valueOf(tf90Var2.b);
                                                df90 df90Var2 = (df90) CollectionsKt.f0(list9);
                                                strL = numValueOf2 + "  :  " + ((df90Var2 == null || (tf90Var = df90Var2.b) == null) ? null : Integer.valueOf(tf90Var.c));
                                            } else if (str.length() > 0 || str2.length() <= 0 || j4 == 40) {
                                                strL = "";
                                            } else {
                                                strL = kng0.l(str, "  :  ", str2);
                                            }
                                            length = strL.length();
                                            opmVar = opm.f25648a;
                                            if (length == 0) {
                                                kpmVar = new lpm(opmVar, new gpm());
                                                i3 = 0;
                                            } else {
                                                i3 = 0;
                                                str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                            }
                                            if (z9) {
                                                strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                            } else {
                                                strA2 = "";
                                            }
                                            iev0 iev0Var6 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                            i4 = i3;
                                            uqvVar2 = uqvVar3;
                                            aev0Var2 = aev0Var3;
                                            rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var6, z8);
                                        }
                                        z3 = true;
                                        str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = (String) CollectionsKt.f0(listSplit$default);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (!z3) {
                                            strL = "";
                                        } else if (!z9) {
                                            if (str.length() > 0) {
                                                strL = "";
                                            } else {
                                                strL = "";
                                            }
                                        } else if (str.length() > 0) {
                                            strL = "";
                                        } else {
                                            strL = "";
                                        }
                                        length = strL.length();
                                        opmVar = opm.f25648a;
                                        if (length == 0) {
                                            kpmVar = new lpm(opmVar, new gpm());
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                        }
                                        if (z9) {
                                            strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                        } else {
                                            strA2 = "";
                                        }
                                        iev0 iev0Var7 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                        i4 = i3;
                                        uqvVar2 = uqvVar3;
                                        aev0Var2 = aev0Var3;
                                        rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var7, z8);
                                    }
                                    if (rdv0Var != null) {
                                        arrayList.add(rdv0Var);
                                    }
                                    uqvVar = uqvVar2;
                                    aev0Var = aev0Var2;
                                    z6 = z8;
                                    i5 = 10;
                                }
                                new uqv("HeaderContainerUiModel", qqvVar, new aev0(zdv0Var, i4VarR0, dyb.r0(CollectionsKt.D0(arrayList, 3))));
                                return uqvVar;
                            case 3:
                                List list15 = (List) obj13;
                                list15.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage4.getClass();
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                ArrayList<ypl0> arrayList8 = new ArrayList();
                                for (Object obj16 : list15) {
                                    if (((ypl0) obj16).b.length() > 0) {
                                        arrayList8.add(obj16);
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    String strConcat = "EventFocusDisciplineListUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage4));
                                    ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                    for (ypl0 ypl0Var : arrayList8) {
                                        long j6 = ypl0Var.f43037a;
                                        String str9 = ypl0Var.b;
                                        StringBuilder sb = new StringBuilder(ujn.h);
                                        String str10 = ypl0Var.c.f19909a;
                                        str10.getClass();
                                        if (str10.length() == 0) {
                                            sb.setLength(0);
                                        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                                            sb.setLength(0);
                                            sb.append(str10);
                                        } else {
                                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str10, '/'));
                                        }
                                        arrayList9.add(new e8m(j6, new n0x(sb.toString()), str9));
                                    }
                                    lc00VarB4.add(new wbo(strConcat, new i8m(dyb.o0(arrayList9)), k3g.f17616a));
                                }
                                return kotlin.collections.a.a(lc00VarB4);
                            case 4:
                                boolean zBooleanValue3 = ((Boolean) obj13).booleanValue();
                                ctf0 ctf0Var4 = mcoVar.b;
                                zjw zjwVar112 = mcoVar.e;
                                return qbc.I(zBooleanValue3, ctf0Var4, zjwVar112.f, zjwVar112.b.c.f7565a.d);
                            case 5:
                                n52 n52Var = (n52) obj13;
                                n52Var.getClass();
                                return kco.a(n52Var, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 6:
                                n52 n52Var2 = (n52) obj13;
                                n52Var2.getClass();
                                return kco.a(n52Var2, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 7:
                                List list16 = (List) obj13;
                                list16.getClass();
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage5.getClass();
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                ArrayList<oru0> arrayList10 = new ArrayList();
                                for (Object obj17 : list16) {
                                    if (((oru0) obj17).b.length() > 0) {
                                        arrayList10.add(obj17);
                                    }
                                }
                                if (!arrayList10.isEmpty() && (cyberGamesPage5 instanceof CyberGamesPage.Virtual)) {
                                    String strConcat2 = "HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                    ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                                    for (oru0 oru0Var : arrayList10) {
                                        int i7 = oru0Var.f25753a;
                                        String str11 = oru0Var.b;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String strE = ua80.e(oru0Var.f25753a, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/", ".png");
                                        if (strE.length() == 0) {
                                            sb2.setLength(0);
                                        } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                                            sb2.setLength(0);
                                            sb2.append(strE);
                                        } else {
                                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                                sb2.append('/');
                                            }
                                            sb2.append(StringsKt.y0(strE, '/'));
                                        }
                                        arrayList11.add(new cvl(i7, new n0x(sb2.toString()), Integer.valueOf(R.drawable.cybergames_discipline_placeholder), str11));
                                    }
                                    lc00VarB5.add(new nco(new diw(strConcat2, new zul(dyb.r0(arrayList11)))));
                                }
                                return kotlin.collections.a.a(lc00VarB5);
                            default:
                                xbo xboVar2 = (xbo) obj13;
                                xboVar2.getClass();
                                List list17 = xboVar2.f40610a;
                                y78 y78Var3 = mcoVar.c;
                                zjw zjwVar113 = mcoVar.e;
                                sff0 sff0Var2 = zjwVar113.b;
                                return ico.a(list17, y78Var3, sff0Var2.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar113.e, sff0Var2, sip.c, zjwVar113.c, xboVar2.c, xboVar2.b, mcoVar.b, zjwVar113.s);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar19 = this.e;
                jih jihVar11 = (jih) zjwVar19.h.get(zjwVar19.g.f7971a);
                if (jihVar11 != null) {
                    Object obj13 = jihVar11.h;
                    e0g0 e0g0Var9 = j0g0.b;
                    obj3 = (List) (obj13 instanceof g0g0 ? null : obj13);
                    obj3 = obj3 == null ? iun.f15405a : obj3;
                }
                final byte b15 = 7;
                this.q = maz.b(new yw9(obj3, new Function1(this) { // from class: a.lco
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:188:0x0551  */
                    /* JADX WARN: Code duplicated, block: B:191:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:193:0x055f  */
                    /* JADX WARN: Code duplicated, block: B:194:0x0562  */
                    /* JADX WARN: Code duplicated, block: B:213:0x05ae  */
                    /* JADX WARN: Code duplicated, block: B:215:0x05b4  */
                    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
                    /* JADX WARN: Code duplicated, block: B:223:0x05d8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05ec  */
                    /* JADX WARN: Code duplicated, block: B:228:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:231:0x0616  */
                    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj14) {
                        tqv qqvVar;
                        String strA;
                        aev0 aev0Var;
                        uqv uqvVar;
                        qdv0 qdv0Var;
                        qdv0 qdv0Var2;
                        List list9;
                        Object next;
                        ndv0 ndv0Var;
                        boolean z3;
                        String str;
                        String str2;
                        String strL;
                        tf90 tf90Var;
                        tf90 tf90Var2;
                        int length;
                        opm opmVar;
                        int i3;
                        String str3;
                        String str4;
                        mpm kpmVar;
                        String strA2;
                        rdv0 rdv0Var;
                        int i4;
                        uqv uqvVar2;
                        aev0 aev0Var2;
                        byte b16 = b15;
                        int i5 = 10;
                        mco mcoVar = this.b;
                        switch (b16) {
                            case 0:
                                xbo xboVar = (xbo) obj14;
                                xboVar.getClass();
                                List list10 = xboVar.f40610a;
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                zjw zjwVar110 = mcoVar.e;
                                sff0 sff0Var = zjwVar110.b;
                                return ico.a(list10, y78Var2, sff0Var.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar110.e, sff0Var, sip.b, zjwVar110.c, xboVar.c, xboVar.b, ctf0Var2, zjwVar110.s);
                            case 1:
                                fee feeVar = (fee) obj14;
                                feeVar.getClass();
                                zjw zjwVar111 = mcoVar.e;
                                return new gkw(!zjwVar111.f, dyb.o0(zjwVar111.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) mcoVar.h.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) mcoVar.i.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, axh0.f1625a);
                            case 2:
                                List list11 = (List) obj14;
                                list11.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.a().c()).f7971a;
                                boolean zBooleanValue = ((Boolean) ((fee) mcoVar.h.getValue()).c()).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar112 = mcoVar.e;
                                boolean z4 = zjwVar112.f || zjwVar112.f44501a.size() <= 1;
                                boolean z5 = zjwVar112.r;
                                boolean z6 = zjwVar112.s;
                                List list12 = ybo.f42348a;
                                cyberGamesPage3.getClass();
                                ctf0Var3.getClass();
                                if (z4) {
                                    qqvVar = sqv.f32646a;
                                } else {
                                    if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                        strA = ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                    } else if (cyberGamesPage3 instanceof CyberGamesPage.Virtual) {
                                        strA = ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        if (!(cyberGamesPage3 instanceof CyberGamesPage.OneXCyber)) {
                                            t9f.b();
                                            return null;
                                        }
                                        strA = ctf0Var3.b.a(R.string.cyber_games_page_onex_cyber, Arrays.copyOf(new Object[0], 0));
                                    }
                                    qqvVar = new qqv(strA);
                                }
                                zdv0 zdv0Var = z5 ? zdv0.b : zdv0.f44226a;
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_calendar_inactive, false, adv0.f699a));
                                } else {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_tournaments, false, edv0.f7639a));
                                }
                                if (zBooleanValue) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_gift, zBooleanValue2, cdv0.f4183a));
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                                ArrayList arrayList = new ArrayList();
                                for (Iterator it3 = list11.iterator(); it3.hasNext(); it3 = it3) {
                                    eih eihVar = (eih) it3.next();
                                    ArrayList arrayList2 = eihVar.e;
                                    ArrayList<d0t> arrayList3 = new ArrayList();
                                    for (Object obj15 : arrayList2) {
                                        if (!qzb.D0((d0t) obj15)) {
                                            arrayList3.add(obj15);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (d0t d0tVar : arrayList3) {
                                        List listA = ybo.a(1L, d0tVar);
                                        if (listA == null) {
                                            listA = ybo.a(38L, d0tVar);
                                        }
                                        Pair pair = (listA == null || listA.isEmpty()) ? null : new Pair(d0tVar, listA);
                                        if (pair != null) {
                                            arrayList4.add(pair);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj16 : arrayList4) {
                                        Iterable iterable2 = (Iterable) ((Pair) obj16).b;
                                        boolean z7 = z6;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, i5));
                                        Iterator it4 = iterable2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Long.valueOf(((BetZip) it4.next()).f46426a));
                                            arrayList5 = arrayList5;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        if (arrayList6.containsAll(ybo.f42348a)) {
                                            arrayList7.add(obj16);
                                            arrayList5 = arrayList7;
                                        } else {
                                            arrayList5 = arrayList7;
                                        }
                                        z6 = z7;
                                        i5 = 10;
                                    }
                                    boolean z8 = z6;
                                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(arrayList5);
                                    if (pair2 == null) {
                                        uqvVar2 = uqvVar;
                                        aev0Var2 = aev0Var;
                                        rdv0Var = null;
                                        i4 = 0;
                                    } else {
                                        d0t d0tVar2 = (d0t) pair2.f46059a;
                                        List list13 = (List) pair2.b;
                                        BetZip betZip = (BetZip) CollectionsKt.firstOrNull(list13);
                                        String str5 = betZip != null ? betZip.g : null;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        BetZip betZip2 = (BetZip) CollectionsKt.f0(list13);
                                        String str6 = betZip2 != null ? betZip2.g : null;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        aev0 aev0Var3 = aev0Var;
                                        long j = d0tVar2.v;
                                        boolean z9 = d0tVar2.C;
                                        f0t f0tVar = d0tVar2.r;
                                        f0t f0tVar2 = d0tVar2.q;
                                        uqv uqvVar3 = uqvVar;
                                        rqs rqsVar = d0tVar2.p;
                                        int i6 = rqsVar.q;
                                        long j2 = d0tVar2.u;
                                        long j3 = d0tVar2.f5282a;
                                        ndv0 ndv0Var2 = new ndv0(new n0x(eihVar.d), eihVar.c);
                                        String str7 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        qdv0 qdv0Var3 = new qdv0(vsm0.s(f0tVar2.f8731a, str7), str5);
                                        String str8 = (String) CollectionsKt.firstOrNull(f0tVar.d);
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        qdv0 qdv0Var4 = new qdv0(vsm0.s(f0tVar.f8731a, str8), str6);
                                        yk5 yk5Var = mc6.b;
                                        ubr ubrVar = rqsVar.B;
                                        Integer numValueOf = Integer.valueOf(i6);
                                        yk5Var.getClass();
                                        ieu0 ieu0Var = new ieu0(yk5.d(numValueOf).f21536a, ubrVar.f35394a);
                                        ieu0 ieu0Var2 = new ieu0(yk5.d(Integer.valueOf(i6)).f21536a, ubrVar.b);
                                        long j4 = d0tVar2.v;
                                        List list14 = rqsVar.d;
                                        Iterator it5 = xkb.P().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                qdv0Var = qdv0Var3;
                                                yxg yxgVar = (yxg) next;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                if (j4 == yxgVar.b) {
                                                    long j5 = d0tVar2.u;
                                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                                    }
                                                }
                                                qdv0Var3 = qdv0Var;
                                                qdv0Var4 = qdv0Var2;
                                                list14 = list9;
                                            } else {
                                                qdv0Var = qdv0Var3;
                                                qdv0Var2 = qdv0Var4;
                                                list9 = list14;
                                                next = null;
                                            }
                                        }
                                        yxg yxgVar2 = (yxg) next;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        yxg yxgVar3 = yxgVar2;
                                        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
                                        if (d0tVar2.z) {
                                            ndv0Var = ndv0Var2;
                                        } else {
                                            ndv0Var = ndv0Var2;
                                            if (!dyb.e0(d0tVar2.s)) {
                                                z3 = false;
                                            }
                                            str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                            if (str == null) {
                                                str = "";
                                            }
                                            str2 = (String) CollectionsKt.f0(listSplit$default);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            if (!z3) {
                                                strL = "";
                                            } else if (!z9 && yxgVar3.c == 1 && !list9.isEmpty()) {
                                                df90 df90Var = (df90) CollectionsKt.f0(list9);
                                                Integer numValueOf2 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : Integer.valueOf(tf90Var2.b);
                                                df90 df90Var2 = (df90) CollectionsKt.f0(list9);
                                                strL = numValueOf2 + "  :  " + ((df90Var2 == null || (tf90Var = df90Var2.b) == null) ? null : Integer.valueOf(tf90Var.c));
                                            } else if (str.length() > 0 || str2.length() <= 0 || j4 == 40) {
                                                strL = "";
                                            } else {
                                                strL = kng0.l(str, "  :  ", str2);
                                            }
                                            length = strL.length();
                                            opmVar = opm.f25648a;
                                            if (length == 0) {
                                                kpmVar = new lpm(opmVar, new gpm());
                                                i3 = 0;
                                            } else {
                                                i3 = 0;
                                                str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                            }
                                            if (z9) {
                                                strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                            } else {
                                                strA2 = "";
                                            }
                                            iev0 iev0Var7 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                            i4 = i3;
                                            uqvVar2 = uqvVar3;
                                            aev0Var2 = aev0Var3;
                                            rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var7, z8);
                                        }
                                        z3 = true;
                                        str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = (String) CollectionsKt.f0(listSplit$default);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (!z3) {
                                            strL = "";
                                        } else if (!z9) {
                                            if (str.length() > 0) {
                                                strL = "";
                                            } else {
                                                strL = "";
                                            }
                                        } else if (str.length() > 0) {
                                            strL = "";
                                        } else {
                                            strL = "";
                                        }
                                        length = strL.length();
                                        opmVar = opm.f25648a;
                                        if (length == 0) {
                                            kpmVar = new lpm(opmVar, new gpm());
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                        }
                                        if (z9) {
                                            strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                        } else {
                                            strA2 = "";
                                        }
                                        iev0 iev0Var8 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                        i4 = i3;
                                        uqvVar2 = uqvVar3;
                                        aev0Var2 = aev0Var3;
                                        rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var8, z8);
                                    }
                                    if (rdv0Var != null) {
                                        arrayList.add(rdv0Var);
                                    }
                                    uqvVar = uqvVar2;
                                    aev0Var = aev0Var2;
                                    z6 = z8;
                                    i5 = 10;
                                }
                                new uqv("HeaderContainerUiModel", qqvVar, new aev0(zdv0Var, i4VarR0, dyb.r0(CollectionsKt.D0(arrayList, 3))));
                                return uqvVar;
                            case 3:
                                List list15 = (List) obj14;
                                list15.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage4.getClass();
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                ArrayList<ypl0> arrayList8 = new ArrayList();
                                for (Object obj17 : list15) {
                                    if (((ypl0) obj17).b.length() > 0) {
                                        arrayList8.add(obj17);
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    String strConcat = "EventFocusDisciplineListUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage4));
                                    ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                    for (ypl0 ypl0Var : arrayList8) {
                                        long j6 = ypl0Var.f43037a;
                                        String str9 = ypl0Var.b;
                                        StringBuilder sb = new StringBuilder(ujn.h);
                                        String str10 = ypl0Var.c.f19909a;
                                        str10.getClass();
                                        if (str10.length() == 0) {
                                            sb.setLength(0);
                                        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                                            sb.setLength(0);
                                            sb.append(str10);
                                        } else {
                                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str10, '/'));
                                        }
                                        arrayList9.add(new e8m(j6, new n0x(sb.toString()), str9));
                                    }
                                    lc00VarB4.add(new wbo(strConcat, new i8m(dyb.o0(arrayList9)), k3g.f17616a));
                                }
                                return kotlin.collections.a.a(lc00VarB4);
                            case 4:
                                boolean zBooleanValue3 = ((Boolean) obj14).booleanValue();
                                ctf0 ctf0Var4 = mcoVar.b;
                                zjw zjwVar113 = mcoVar.e;
                                return qbc.I(zBooleanValue3, ctf0Var4, zjwVar113.f, zjwVar113.b.c.f7565a.d);
                            case 5:
                                n52 n52Var = (n52) obj14;
                                n52Var.getClass();
                                return kco.a(n52Var, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 6:
                                n52 n52Var2 = (n52) obj14;
                                n52Var2.getClass();
                                return kco.a(n52Var2, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 7:
                                List list16 = (List) obj14;
                                list16.getClass();
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage5.getClass();
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                ArrayList<oru0> arrayList10 = new ArrayList();
                                for (Object obj18 : list16) {
                                    if (((oru0) obj18).b.length() > 0) {
                                        arrayList10.add(obj18);
                                    }
                                }
                                if (!arrayList10.isEmpty() && (cyberGamesPage5 instanceof CyberGamesPage.Virtual)) {
                                    String strConcat2 = "HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                    ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                                    for (oru0 oru0Var : arrayList10) {
                                        int i7 = oru0Var.f25753a;
                                        String str11 = oru0Var.b;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String strE = ua80.e(oru0Var.f25753a, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/", ".png");
                                        if (strE.length() == 0) {
                                            sb2.setLength(0);
                                        } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                                            sb2.setLength(0);
                                            sb2.append(strE);
                                        } else {
                                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                                sb2.append('/');
                                            }
                                            sb2.append(StringsKt.y0(strE, '/'));
                                        }
                                        arrayList11.add(new cvl(i7, new n0x(sb2.toString()), Integer.valueOf(R.drawable.cybergames_discipline_placeholder), str11));
                                    }
                                    lc00VarB5.add(new nco(new diw(strConcat2, new zul(dyb.r0(arrayList11)))));
                                }
                                return kotlin.collections.a.a(lc00VarB5);
                            default:
                                xbo xboVar2 = (xbo) obj14;
                                xboVar2.getClass();
                                List list17 = xboVar2.f40610a;
                                y78 y78Var3 = mcoVar.c;
                                zjw zjwVar114 = mcoVar.e;
                                sff0 sff0Var2 = zjwVar114.b;
                                return ico.a(list17, y78Var3, sff0Var2.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar114.e, sff0Var2, sip.c, zjwVar114.c, xboVar2.c, xboVar2.b, mcoVar.b, zjwVar114.s);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar20 = this.e;
                jih jihVar12 = (jih) zjwVar20.h.get(zjwVar20.g.f7971a);
                if (jihVar12 != null) {
                    Object obj14 = jihVar12.c;
                    e0g0 e0g0Var10 = j0g0.b;
                    list5 = (List) (obj14 instanceof g0g0 ? null : obj14);
                    list5 = list5 == null ? iun.f15405a : list5;
                }
                Long l = (Long) this.e.m.get(((ekw) a().c()).f7971a);
                long jLongValue = l != null ? l.longValue() : 0L;
                List list9 = (List) this.e.o.get(((ekw) a().c()).f7971a);
                xbo xboVar = new xbo(jLongValue, list5, list9 == null ? iun.f15405a : list9);
                final byte b16 = 8;
                this.r = maz.b(new yw9(xboVar, new Function1(this) { // from class: a.lco
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:188:0x0551  */
                    /* JADX WARN: Code duplicated, block: B:191:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:193:0x055f  */
                    /* JADX WARN: Code duplicated, block: B:194:0x0562  */
                    /* JADX WARN: Code duplicated, block: B:213:0x05ae  */
                    /* JADX WARN: Code duplicated, block: B:215:0x05b4  */
                    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
                    /* JADX WARN: Code duplicated, block: B:223:0x05d8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05ec  */
                    /* JADX WARN: Code duplicated, block: B:228:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:231:0x0616  */
                    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        tqv qqvVar;
                        String strA;
                        aev0 aev0Var;
                        uqv uqvVar;
                        qdv0 qdv0Var;
                        qdv0 qdv0Var2;
                        List list10;
                        Object next;
                        ndv0 ndv0Var;
                        boolean z3;
                        String str;
                        String str2;
                        String strL;
                        tf90 tf90Var;
                        tf90 tf90Var2;
                        int length;
                        opm opmVar;
                        int i3;
                        String str3;
                        String str4;
                        mpm kpmVar;
                        String strA2;
                        rdv0 rdv0Var;
                        int i4;
                        uqv uqvVar2;
                        aev0 aev0Var2;
                        byte b17 = b16;
                        int i5 = 10;
                        mco mcoVar = this.b;
                        switch (b17) {
                            case 0:
                                xbo xboVar2 = (xbo) obj15;
                                xboVar2.getClass();
                                List list11 = xboVar2.f40610a;
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                zjw zjwVar110 = mcoVar.e;
                                sff0 sff0Var = zjwVar110.b;
                                return ico.a(list11, y78Var2, sff0Var.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar110.e, sff0Var, sip.b, zjwVar110.c, xboVar2.c, xboVar2.b, ctf0Var2, zjwVar110.s);
                            case 1:
                                fee feeVar = (fee) obj15;
                                feeVar.getClass();
                                zjw zjwVar111 = mcoVar.e;
                                return new gkw(!zjwVar111.f, dyb.o0(zjwVar111.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) mcoVar.h.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) mcoVar.i.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, axh0.f1625a);
                            case 2:
                                List list12 = (List) obj15;
                                list12.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.a().c()).f7971a;
                                boolean zBooleanValue = ((Boolean) ((fee) mcoVar.h.getValue()).c()).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar112 = mcoVar.e;
                                boolean z4 = zjwVar112.f || zjwVar112.f44501a.size() <= 1;
                                boolean z5 = zjwVar112.r;
                                boolean z6 = zjwVar112.s;
                                List list13 = ybo.f42348a;
                                cyberGamesPage3.getClass();
                                ctf0Var3.getClass();
                                if (z4) {
                                    qqvVar = sqv.f32646a;
                                } else {
                                    if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                        strA = ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                    } else if (cyberGamesPage3 instanceof CyberGamesPage.Virtual) {
                                        strA = ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        if (!(cyberGamesPage3 instanceof CyberGamesPage.OneXCyber)) {
                                            t9f.b();
                                            return null;
                                        }
                                        strA = ctf0Var3.b.a(R.string.cyber_games_page_onex_cyber, Arrays.copyOf(new Object[0], 0));
                                    }
                                    qqvVar = new qqv(strA);
                                }
                                zdv0 zdv0Var = z5 ? zdv0.b : zdv0.f44226a;
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_calendar_inactive, false, adv0.f699a));
                                } else {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_tournaments, false, edv0.f7639a));
                                }
                                if (zBooleanValue) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_gift, zBooleanValue2, cdv0.f4183a));
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                                ArrayList arrayList = new ArrayList();
                                for (Iterator it3 = list12.iterator(); it3.hasNext(); it3 = it3) {
                                    eih eihVar = (eih) it3.next();
                                    ArrayList arrayList2 = eihVar.e;
                                    ArrayList<d0t> arrayList3 = new ArrayList();
                                    for (Object obj16 : arrayList2) {
                                        if (!qzb.D0((d0t) obj16)) {
                                            arrayList3.add(obj16);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (d0t d0tVar : arrayList3) {
                                        List listA = ybo.a(1L, d0tVar);
                                        if (listA == null) {
                                            listA = ybo.a(38L, d0tVar);
                                        }
                                        Pair pair = (listA == null || listA.isEmpty()) ? null : new Pair(d0tVar, listA);
                                        if (pair != null) {
                                            arrayList4.add(pair);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj17 : arrayList4) {
                                        Iterable iterable2 = (Iterable) ((Pair) obj17).b;
                                        boolean z7 = z6;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, i5));
                                        Iterator it4 = iterable2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Long.valueOf(((BetZip) it4.next()).f46426a));
                                            arrayList5 = arrayList5;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        if (arrayList6.containsAll(ybo.f42348a)) {
                                            arrayList7.add(obj17);
                                            arrayList5 = arrayList7;
                                        } else {
                                            arrayList5 = arrayList7;
                                        }
                                        z6 = z7;
                                        i5 = 10;
                                    }
                                    boolean z8 = z6;
                                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(arrayList5);
                                    if (pair2 == null) {
                                        uqvVar2 = uqvVar;
                                        aev0Var2 = aev0Var;
                                        rdv0Var = null;
                                        i4 = 0;
                                    } else {
                                        d0t d0tVar2 = (d0t) pair2.f46059a;
                                        List list14 = (List) pair2.b;
                                        BetZip betZip = (BetZip) CollectionsKt.firstOrNull(list14);
                                        String str5 = betZip != null ? betZip.g : null;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        BetZip betZip2 = (BetZip) CollectionsKt.f0(list14);
                                        String str6 = betZip2 != null ? betZip2.g : null;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        aev0 aev0Var3 = aev0Var;
                                        long j = d0tVar2.v;
                                        boolean z9 = d0tVar2.C;
                                        f0t f0tVar = d0tVar2.r;
                                        f0t f0tVar2 = d0tVar2.q;
                                        uqv uqvVar3 = uqvVar;
                                        rqs rqsVar = d0tVar2.p;
                                        int i6 = rqsVar.q;
                                        long j2 = d0tVar2.u;
                                        long j3 = d0tVar2.f5282a;
                                        ndv0 ndv0Var2 = new ndv0(new n0x(eihVar.d), eihVar.c);
                                        String str7 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        qdv0 qdv0Var3 = new qdv0(vsm0.s(f0tVar2.f8731a, str7), str5);
                                        String str8 = (String) CollectionsKt.firstOrNull(f0tVar.d);
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        qdv0 qdv0Var4 = new qdv0(vsm0.s(f0tVar.f8731a, str8), str6);
                                        yk5 yk5Var = mc6.b;
                                        ubr ubrVar = rqsVar.B;
                                        Integer numValueOf = Integer.valueOf(i6);
                                        yk5Var.getClass();
                                        ieu0 ieu0Var = new ieu0(yk5.d(numValueOf).f21536a, ubrVar.f35394a);
                                        ieu0 ieu0Var2 = new ieu0(yk5.d(Integer.valueOf(i6)).f21536a, ubrVar.b);
                                        long j4 = d0tVar2.v;
                                        List list15 = rqsVar.d;
                                        Iterator it5 = xkb.P().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                qdv0Var = qdv0Var3;
                                                yxg yxgVar = (yxg) next;
                                                qdv0Var2 = qdv0Var4;
                                                list10 = list15;
                                                if (j4 == yxgVar.b) {
                                                    long j5 = d0tVar2.u;
                                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                                    }
                                                }
                                                qdv0Var3 = qdv0Var;
                                                qdv0Var4 = qdv0Var2;
                                                list15 = list10;
                                            } else {
                                                qdv0Var = qdv0Var3;
                                                qdv0Var2 = qdv0Var4;
                                                list10 = list15;
                                                next = null;
                                            }
                                        }
                                        yxg yxgVar2 = (yxg) next;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        yxg yxgVar3 = yxgVar2;
                                        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
                                        if (d0tVar2.z) {
                                            ndv0Var = ndv0Var2;
                                        } else {
                                            ndv0Var = ndv0Var2;
                                            if (!dyb.e0(d0tVar2.s)) {
                                                z3 = false;
                                            }
                                            str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                            if (str == null) {
                                                str = "";
                                            }
                                            str2 = (String) CollectionsKt.f0(listSplit$default);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            if (!z3) {
                                                strL = "";
                                            } else if (!z9 && yxgVar3.c == 1 && !list10.isEmpty()) {
                                                df90 df90Var = (df90) CollectionsKt.f0(list10);
                                                Integer numValueOf2 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : Integer.valueOf(tf90Var2.b);
                                                df90 df90Var2 = (df90) CollectionsKt.f0(list10);
                                                strL = numValueOf2 + "  :  " + ((df90Var2 == null || (tf90Var = df90Var2.b) == null) ? null : Integer.valueOf(tf90Var.c));
                                            } else if (str.length() > 0 || str2.length() <= 0 || j4 == 40) {
                                                strL = "";
                                            } else {
                                                strL = kng0.l(str, "  :  ", str2);
                                            }
                                            length = strL.length();
                                            opmVar = opm.f25648a;
                                            if (length == 0) {
                                                kpmVar = new lpm(opmVar, new gpm());
                                                i3 = 0;
                                            } else {
                                                i3 = 0;
                                                str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                            }
                                            if (z9) {
                                                strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                            } else {
                                                strA2 = "";
                                            }
                                            iev0 iev0Var8 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                            i4 = i3;
                                            uqvVar2 = uqvVar3;
                                            aev0Var2 = aev0Var3;
                                            rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var8, z8);
                                        }
                                        z3 = true;
                                        str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = (String) CollectionsKt.f0(listSplit$default);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (!z3) {
                                            strL = "";
                                        } else if (!z9) {
                                            if (str.length() > 0) {
                                                strL = "";
                                            } else {
                                                strL = "";
                                            }
                                        } else if (str.length() > 0) {
                                            strL = "";
                                        } else {
                                            strL = "";
                                        }
                                        length = strL.length();
                                        opmVar = opm.f25648a;
                                        if (length == 0) {
                                            kpmVar = new lpm(opmVar, new gpm());
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                        }
                                        if (z9) {
                                            strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                        } else {
                                            strA2 = "";
                                        }
                                        iev0 iev0Var9 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                        i4 = i3;
                                        uqvVar2 = uqvVar3;
                                        aev0Var2 = aev0Var3;
                                        rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var9, z8);
                                    }
                                    if (rdv0Var != null) {
                                        arrayList.add(rdv0Var);
                                    }
                                    uqvVar = uqvVar2;
                                    aev0Var = aev0Var2;
                                    z6 = z8;
                                    i5 = 10;
                                }
                                new uqv("HeaderContainerUiModel", qqvVar, new aev0(zdv0Var, i4VarR0, dyb.r0(CollectionsKt.D0(arrayList, 3))));
                                return uqvVar;
                            case 3:
                                List list16 = (List) obj15;
                                list16.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage4.getClass();
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                ArrayList<ypl0> arrayList8 = new ArrayList();
                                for (Object obj18 : list16) {
                                    if (((ypl0) obj18).b.length() > 0) {
                                        arrayList8.add(obj18);
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    String strConcat = "EventFocusDisciplineListUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage4));
                                    ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                    for (ypl0 ypl0Var : arrayList8) {
                                        long j6 = ypl0Var.f43037a;
                                        String str9 = ypl0Var.b;
                                        StringBuilder sb = new StringBuilder(ujn.h);
                                        String str10 = ypl0Var.c.f19909a;
                                        str10.getClass();
                                        if (str10.length() == 0) {
                                            sb.setLength(0);
                                        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                                            sb.setLength(0);
                                            sb.append(str10);
                                        } else {
                                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str10, '/'));
                                        }
                                        arrayList9.add(new e8m(j6, new n0x(sb.toString()), str9));
                                    }
                                    lc00VarB4.add(new wbo(strConcat, new i8m(dyb.o0(arrayList9)), k3g.f17616a));
                                }
                                return kotlin.collections.a.a(lc00VarB4);
                            case 4:
                                boolean zBooleanValue3 = ((Boolean) obj15).booleanValue();
                                ctf0 ctf0Var4 = mcoVar.b;
                                zjw zjwVar113 = mcoVar.e;
                                return qbc.I(zBooleanValue3, ctf0Var4, zjwVar113.f, zjwVar113.b.c.f7565a.d);
                            case 5:
                                n52 n52Var = (n52) obj15;
                                n52Var.getClass();
                                return kco.a(n52Var, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 6:
                                n52 n52Var2 = (n52) obj15;
                                n52Var2.getClass();
                                return kco.a(n52Var2, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 7:
                                List list17 = (List) obj15;
                                list17.getClass();
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage5.getClass();
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                ArrayList<oru0> arrayList10 = new ArrayList();
                                for (Object obj19 : list17) {
                                    if (((oru0) obj19).b.length() > 0) {
                                        arrayList10.add(obj19);
                                    }
                                }
                                if (!arrayList10.isEmpty() && (cyberGamesPage5 instanceof CyberGamesPage.Virtual)) {
                                    String strConcat2 = "HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                    ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                                    for (oru0 oru0Var : arrayList10) {
                                        int i7 = oru0Var.f25753a;
                                        String str11 = oru0Var.b;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String strE = ua80.e(oru0Var.f25753a, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/", ".png");
                                        if (strE.length() == 0) {
                                            sb2.setLength(0);
                                        } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                                            sb2.setLength(0);
                                            sb2.append(strE);
                                        } else {
                                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                                sb2.append('/');
                                            }
                                            sb2.append(StringsKt.y0(strE, '/'));
                                        }
                                        arrayList11.add(new cvl(i7, new n0x(sb2.toString()), Integer.valueOf(R.drawable.cybergames_discipline_placeholder), str11));
                                    }
                                    lc00VarB5.add(new nco(new diw(strConcat2, new zul(dyb.r0(arrayList11)))));
                                }
                                return kotlin.collections.a.a(lc00VarB5);
                            default:
                                xbo xboVar3 = (xbo) obj15;
                                xboVar3.getClass();
                                List list18 = xboVar3.f40610a;
                                y78 y78Var3 = mcoVar.c;
                                zjw zjwVar114 = mcoVar.e;
                                sff0 sff0Var2 = zjwVar114.b;
                                return ico.a(list18, y78Var3, sff0Var2.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar114.e, sff0Var2, sip.c, zjwVar114.c, xboVar3.c, xboVar3.b, mcoVar.b, zjwVar114.s);
                        }
                    }
                }, (byte) 20));
                zjw zjwVar21 = this.e;
                jih jihVar13 = (jih) zjwVar21.h.get(zjwVar21.g.f7971a);
                if (jihVar13 != null) {
                    Object obj15 = jihVar13.d;
                    e0g0 e0g0Var11 = j0g0.b;
                    list6 = (List) (obj15 instanceof g0g0 ? null : obj15);
                    list6 = list6 == null ? iun.f15405a : list6;
                }
                Long l2 = (Long) this.e.n.get(((ekw) a().c()).f7971a);
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                List list10 = (List) this.e.p.get(((ekw) a().c()).f7971a);
                final byte b17 = 0;
                this.s = maz.b(new yw9(new xbo(jLongValue2, list6, list10 == null ? iun.f15405a : list10), new Function1(this) { // from class: a.lco
                    public final /* synthetic */ mco b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:188:0x0551  */
                    /* JADX WARN: Code duplicated, block: B:191:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:193:0x055f  */
                    /* JADX WARN: Code duplicated, block: B:194:0x0562  */
                    /* JADX WARN: Code duplicated, block: B:213:0x05ae  */
                    /* JADX WARN: Code duplicated, block: B:215:0x05b4  */
                    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
                    /* JADX WARN: Code duplicated, block: B:223:0x05d8  */
                    /* JADX WARN: Code duplicated, block: B:225:0x05ec  */
                    /* JADX WARN: Code duplicated, block: B:228:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:231:0x0616  */
                    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj16) {
                        tqv qqvVar;
                        String strA;
                        aev0 aev0Var;
                        uqv uqvVar;
                        qdv0 qdv0Var;
                        qdv0 qdv0Var2;
                        List list11;
                        Object next;
                        ndv0 ndv0Var;
                        boolean z3;
                        String str;
                        String str2;
                        String strL;
                        tf90 tf90Var;
                        tf90 tf90Var2;
                        int length;
                        opm opmVar;
                        int i3;
                        String str3;
                        String str4;
                        mpm kpmVar;
                        String strA2;
                        rdv0 rdv0Var;
                        int i4;
                        uqv uqvVar2;
                        aev0 aev0Var2;
                        byte b18 = b17;
                        int i5 = 10;
                        mco mcoVar = this.b;
                        switch (b18) {
                            case 0:
                                xbo xboVar2 = (xbo) obj16;
                                xboVar2.getClass();
                                List list12 = xboVar2.f40610a;
                                y78 y78Var2 = mcoVar.c;
                                ctf0 ctf0Var2 = mcoVar.b;
                                zjw zjwVar110 = mcoVar.e;
                                sff0 sff0Var = zjwVar110.b;
                                return ico.a(list12, y78Var2, sff0Var.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar110.e, sff0Var, sip.b, zjwVar110.c, xboVar2.c, xboVar2.b, ctf0Var2, zjwVar110.s);
                            case 1:
                                fee feeVar = (fee) obj16;
                                feeVar.getClass();
                                zjw zjwVar111 = mcoVar.e;
                                return new gkw(!zjwVar111.f, dyb.o0(zjwVar111.f44501a), (ekw) feeVar.c(), ((Boolean) ((fee) mcoVar.h.getValue()).d.getValue()).booleanValue(), ((Boolean) ((fee) mcoVar.i.getValue()).d.getValue()).booleanValue(), ((ekw) feeVar.c()).f7971a instanceof CyberGamesPage.Real, axh0.f1625a);
                            case 2:
                                List list13 = (List) obj16;
                                list13.getClass();
                                CyberGamesPage cyberGamesPage3 = ((ekw) mcoVar.a().c()).f7971a;
                                boolean zBooleanValue = ((Boolean) ((fee) mcoVar.h.getValue()).c()).booleanValue();
                                boolean zBooleanValue2 = ((Boolean) ((fee) mcoVar.i.getValue()).c()).booleanValue();
                                ctf0 ctf0Var3 = mcoVar.b;
                                zjw zjwVar112 = mcoVar.e;
                                boolean z4 = zjwVar112.f || zjwVar112.f44501a.size() <= 1;
                                boolean z5 = zjwVar112.r;
                                boolean z6 = zjwVar112.s;
                                List list14 = ybo.f42348a;
                                cyberGamesPage3.getClass();
                                ctf0Var3.getClass();
                                if (z4) {
                                    qqvVar = sqv.f32646a;
                                } else {
                                    if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                        strA = ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0));
                                    } else if (cyberGamesPage3 instanceof CyberGamesPage.Virtual) {
                                        strA = ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        if (!(cyberGamesPage3 instanceof CyberGamesPage.OneXCyber)) {
                                            t9f.b();
                                            return null;
                                        }
                                        strA = ctf0Var3.b.a(R.string.cyber_games_page_onex_cyber, Arrays.copyOf(new Object[0], 0));
                                    }
                                    qqvVar = new qqv(strA);
                                }
                                zdv0 zdv0Var = z5 ? zdv0.b : zdv0.f44226a;
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                if (cyberGamesPage3 instanceof CyberGamesPage.Real) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_calendar_inactive, false, adv0.f699a));
                                } else {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_tournaments, false, edv0.f7639a));
                                }
                                if (zBooleanValue) {
                                    lc00VarB3.add(new hdv0(R.drawable.ic_glyph_gift, zBooleanValue2, cdv0.f4183a));
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                                ArrayList arrayList = new ArrayList();
                                for (Iterator it3 = list13.iterator(); it3.hasNext(); it3 = it3) {
                                    eih eihVar = (eih) it3.next();
                                    ArrayList arrayList2 = eihVar.e;
                                    ArrayList<d0t> arrayList3 = new ArrayList();
                                    for (Object obj17 : arrayList2) {
                                        if (!qzb.D0((d0t) obj17)) {
                                            arrayList3.add(obj17);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (d0t d0tVar : arrayList3) {
                                        List listA = ybo.a(1L, d0tVar);
                                        if (listA == null) {
                                            listA = ybo.a(38L, d0tVar);
                                        }
                                        Pair pair = (listA == null || listA.isEmpty()) ? null : new Pair(d0tVar, listA);
                                        if (pair != null) {
                                            arrayList4.add(pair);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj18 : arrayList4) {
                                        Iterable iterable2 = (Iterable) ((Pair) obj18).b;
                                        boolean z7 = z6;
                                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable2, i5));
                                        Iterator it4 = iterable2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Long.valueOf(((BetZip) it4.next()).f46426a));
                                            arrayList5 = arrayList5;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        if (arrayList6.containsAll(ybo.f42348a)) {
                                            arrayList7.add(obj18);
                                            arrayList5 = arrayList7;
                                        } else {
                                            arrayList5 = arrayList7;
                                        }
                                        z6 = z7;
                                        i5 = 10;
                                    }
                                    boolean z8 = z6;
                                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(arrayList5);
                                    if (pair2 == null) {
                                        uqvVar2 = uqvVar;
                                        aev0Var2 = aev0Var;
                                        rdv0Var = null;
                                        i4 = 0;
                                    } else {
                                        d0t d0tVar2 = (d0t) pair2.f46059a;
                                        List list15 = (List) pair2.b;
                                        BetZip betZip = (BetZip) CollectionsKt.firstOrNull(list15);
                                        String str5 = betZip != null ? betZip.g : null;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        BetZip betZip2 = (BetZip) CollectionsKt.f0(list15);
                                        String str6 = betZip2 != null ? betZip2.g : null;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        aev0 aev0Var3 = aev0Var;
                                        long j = d0tVar2.v;
                                        boolean z9 = d0tVar2.C;
                                        f0t f0tVar = d0tVar2.r;
                                        f0t f0tVar2 = d0tVar2.q;
                                        uqv uqvVar3 = uqvVar;
                                        rqs rqsVar = d0tVar2.p;
                                        int i6 = rqsVar.q;
                                        long j2 = d0tVar2.u;
                                        long j3 = d0tVar2.f5282a;
                                        ndv0 ndv0Var2 = new ndv0(new n0x(eihVar.d), eihVar.c);
                                        String str7 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        qdv0 qdv0Var3 = new qdv0(vsm0.s(f0tVar2.f8731a, str7), str5);
                                        String str8 = (String) CollectionsKt.firstOrNull(f0tVar.d);
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        qdv0 qdv0Var4 = new qdv0(vsm0.s(f0tVar.f8731a, str8), str6);
                                        yk5 yk5Var = mc6.b;
                                        ubr ubrVar = rqsVar.B;
                                        Integer numValueOf = Integer.valueOf(i6);
                                        yk5Var.getClass();
                                        ieu0 ieu0Var = new ieu0(yk5.d(numValueOf).f21536a, ubrVar.f35394a);
                                        ieu0 ieu0Var2 = new ieu0(yk5.d(Integer.valueOf(i6)).f21536a, ubrVar.b);
                                        long j4 = d0tVar2.v;
                                        List list16 = rqsVar.d;
                                        Iterator it5 = xkb.P().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                qdv0Var = qdv0Var3;
                                                yxg yxgVar = (yxg) next;
                                                qdv0Var2 = qdv0Var4;
                                                list11 = list16;
                                                if (j4 == yxgVar.b) {
                                                    long j5 = d0tVar2.u;
                                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                                    }
                                                }
                                                qdv0Var3 = qdv0Var;
                                                qdv0Var4 = qdv0Var2;
                                                list16 = list11;
                                            } else {
                                                qdv0Var = qdv0Var3;
                                                qdv0Var2 = qdv0Var4;
                                                list11 = list16;
                                                next = null;
                                            }
                                        }
                                        yxg yxgVar2 = (yxg) next;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        yxg yxgVar3 = yxgVar2;
                                        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
                                        if (d0tVar2.z) {
                                            ndv0Var = ndv0Var2;
                                        } else {
                                            ndv0Var = ndv0Var2;
                                            if (!dyb.e0(d0tVar2.s)) {
                                                z3 = false;
                                            }
                                            str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                            if (str == null) {
                                                str = "";
                                            }
                                            str2 = (String) CollectionsKt.f0(listSplit$default);
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            if (!z3) {
                                                strL = "";
                                            } else if (!z9 && yxgVar3.c == 1 && !list11.isEmpty()) {
                                                df90 df90Var = (df90) CollectionsKt.f0(list11);
                                                Integer numValueOf2 = (df90Var == null || (tf90Var2 = df90Var.b) == null) ? null : Integer.valueOf(tf90Var2.b);
                                                df90 df90Var2 = (df90) CollectionsKt.f0(list11);
                                                strL = numValueOf2 + "  :  " + ((df90Var2 == null || (tf90Var = df90Var2.b) == null) ? null : Integer.valueOf(tf90Var.c));
                                            } else if (str.length() > 0 || str2.length() <= 0 || j4 == 40) {
                                                strL = "";
                                            } else {
                                                strL = kng0.l(str, "  :  ", str2);
                                            }
                                            length = strL.length();
                                            opmVar = opm.f25648a;
                                            if (length == 0) {
                                                kpmVar = new lpm(opmVar, new gpm());
                                                i3 = 0;
                                            } else {
                                                i3 = 0;
                                                str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                            }
                                            if (z9) {
                                                strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                            } else {
                                                strA2 = "";
                                            }
                                            iev0 iev0Var9 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                            i4 = i3;
                                            uqvVar2 = uqvVar3;
                                            aev0Var2 = aev0Var3;
                                            rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var9, z8);
                                        }
                                        z3 = true;
                                        str = (String) CollectionsKt.firstOrNull(listSplit$default);
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = (String) CollectionsKt.f0(listSplit$default);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        if (!z3) {
                                            strL = "";
                                        } else if (!z9) {
                                            if (str.length() > 0) {
                                                strL = "";
                                            } else {
                                                strL = "";
                                            }
                                        } else if (str.length() > 0) {
                                            strL = "";
                                        } else {
                                            strL = "";
                                        }
                                        length = strL.length();
                                        opmVar = opm.f25648a;
                                        if (length == 0) {
                                            kpmVar = new lpm(opmVar, new gpm());
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            str3 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            str4 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(strL, new String[]{Separators.COLON}, false, 0, 6, null));
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            kpmVar = new kpm(opmVar, new gpm(), d5c.O(str3, str4, false, false, new gpm()));
                                        }
                                        if (z9) {
                                            strA2 = ctf0Var3.b.a(R.string.cyber_live, Arrays.copyOf(new Object[i3], i3));
                                        } else {
                                            strA2 = "";
                                        }
                                        iev0 iev0Var10 = new iev0(ieu0Var, ieu0Var2, kpmVar, strA2);
                                        i4 = i3;
                                        uqvVar2 = uqvVar3;
                                        aev0Var2 = aev0Var3;
                                        rdv0Var = new rdv0(j, j2, j3, ndv0Var, qdv0Var, qdv0Var2, iev0Var10, z8);
                                    }
                                    if (rdv0Var != null) {
                                        arrayList.add(rdv0Var);
                                    }
                                    uqvVar = uqvVar2;
                                    aev0Var = aev0Var2;
                                    z6 = z8;
                                    i5 = 10;
                                }
                                new uqv("HeaderContainerUiModel", qqvVar, new aev0(zdv0Var, i4VarR0, dyb.r0(CollectionsKt.D0(arrayList, 3))));
                                return uqvVar;
                            case 3:
                                List list17 = (List) obj16;
                                list17.getClass();
                                CyberGamesPage cyberGamesPage4 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage4.getClass();
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                ArrayList<ypl0> arrayList8 = new ArrayList();
                                for (Object obj19 : list17) {
                                    if (((ypl0) obj19).b.length() > 0) {
                                        arrayList8.add(obj19);
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    String strConcat = "EventFocusDisciplineListUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage4));
                                    ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                                    for (ypl0 ypl0Var : arrayList8) {
                                        long j6 = ypl0Var.f43037a;
                                        String str9 = ypl0Var.b;
                                        StringBuilder sb = new StringBuilder(ujn.h);
                                        String str10 = ypl0Var.c.f19909a;
                                        str10.getClass();
                                        if (str10.length() == 0) {
                                            sb.setLength(0);
                                        } else if (StringsKt.O(str10, ujn.h, false) || kotlin.text.c.x(str10, "https://", false)) {
                                            sb.setLength(0);
                                            sb.append(str10);
                                        } else {
                                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str10, '/'));
                                        }
                                        arrayList9.add(new e8m(j6, new n0x(sb.toString()), str9));
                                    }
                                    lc00VarB4.add(new wbo(strConcat, new i8m(dyb.o0(arrayList9)), k3g.f17616a));
                                }
                                return kotlin.collections.a.a(lc00VarB4);
                            case 4:
                                boolean zBooleanValue3 = ((Boolean) obj16).booleanValue();
                                ctf0 ctf0Var4 = mcoVar.b;
                                zjw zjwVar113 = mcoVar.e;
                                return qbc.I(zBooleanValue3, ctf0Var4, zjwVar113.f, zjwVar113.b.c.f7565a.d);
                            case 5:
                                n52 n52Var = (n52) obj16;
                                n52Var.getClass();
                                return kco.a(n52Var, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 6:
                                n52 n52Var2 = (n52) obj16;
                                n52Var2.getClass();
                                return kco.a(n52Var2, ((ekw) mcoVar.a().c()).f7971a, mcoVar.b);
                            case 7:
                                List list18 = (List) obj16;
                                list18.getClass();
                                CyberGamesPage cyberGamesPage5 = ((ekw) mcoVar.a().c()).f7971a;
                                cyberGamesPage5.getClass();
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                ArrayList<oru0> arrayList10 = new ArrayList();
                                for (Object obj110 : list18) {
                                    if (((oru0) obj110).b.length() > 0) {
                                        arrayList10.add(obj110);
                                    }
                                }
                                if (!arrayList10.isEmpty() && (cyberGamesPage5 instanceof CyberGamesPage.Virtual)) {
                                    String strConcat2 = "HomeCategoryCardCollectionUiModel".concat(org.xplatform.cyber.section.api.domain.entity.d.a(cyberGamesPage5));
                                    ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                                    for (oru0 oru0Var : arrayList10) {
                                        int i7 = oru0Var.f25753a;
                                        String str11 = oru0Var.b;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String strE = ua80.e(oru0Var.f25753a, "static/img/ImgDefault/Esports/Virtual/EventFocus/Categories/", ".png");
                                        if (strE.length() == 0) {
                                            sb2.setLength(0);
                                        } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                                            sb2.setLength(0);
                                            sb2.append(strE);
                                        } else {
                                            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                                sb2.append('/');
                                            }
                                            sb2.append(StringsKt.y0(strE, '/'));
                                        }
                                        arrayList11.add(new cvl(i7, new n0x(sb2.toString()), Integer.valueOf(R.drawable.cybergames_discipline_placeholder), str11));
                                    }
                                    lc00VarB5.add(new nco(new diw(strConcat2, new zul(dyb.r0(arrayList11)))));
                                }
                                return kotlin.collections.a.a(lc00VarB5);
                            default:
                                xbo xboVar3 = (xbo) obj16;
                                xboVar3.getClass();
                                List list19 = xboVar3.f40610a;
                                y78 y78Var3 = mcoVar.c;
                                zjw zjwVar114 = mcoVar.e;
                                sff0 sff0Var2 = zjwVar114.b;
                                return ico.a(list19, y78Var3, sff0Var2.g.y, ((ekw) mcoVar.a().c()).f7971a, zjwVar114.e, sff0Var2, sip.c, zjwVar114.c, xboVar3.c, xboVar3.b, mcoVar.b, zjwVar114.s);
                        }
                    }
                }, (byte) 20));
                return;
        }
    }

    public fee a() {
        return (fee) this.g.getValue();
    }

    public fee b() {
        return (fee) this.g.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f21561a;
        th90 th90Var = this.f;
        zjw zjwVar = this.e;
        n0o0 n0o0Var = this.j;
        n0o0 n0o0Var2 = this.i;
        n0o0 n0o0Var3 = this.h;
        switch (b) {
            case 0:
                zjw zjwVar2 = (zjw) obj;
                zjwVar2.getClass();
                fee feeVar = (fee) n0o0Var3.getValue();
                Map map = zjwVar2.j;
                ekw ekwVar = zjwVar2.g;
                CyberGamesPage cyberGamesPage = ekwVar.f7971a;
                feeVar.d(Boolean.valueOf(Intrinsics.d(map.get(cyberGamesPage), Boolean.TRUE)));
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(zjwVar2.k));
                a().d(ekwVar);
                g5h g5hVar = zjwVar.b.c.o;
                boolean z = zjwVar.f;
                zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                jih jihVar = (jih) zjwVar2.h.get(cyberGamesPage);
                if (jihVar != null) {
                    ((pz40) xp20.d(th90Var, cyberGamesPage)).setValue(u1c.w(this.d, ekwVar.f7971a, jihVar, zjwVar2.i, true, new g8l(this, jihVar, zjwVar2, (byte) 11)));
                }
                return new kkw(g5hVar, z, zbkVar, th90Var);
            default:
                zjw zjwVar3 = (zjw) obj;
                zjwVar3.getClass();
                fee feeVarB = b();
                ekw ekwVar2 = zjwVar3.g;
                feeVarB.d(ekwVar2);
                ((fee) n0o0Var3.getValue()).d(zjwVar3.l);
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(zjwVar3.k));
                fee feeVar2 = (fee) n0o0Var.getValue();
                Map map2 = zjwVar3.j;
                CyberGamesPage cyberGamesPage2 = ekwVar2.f7971a;
                Object obj2 = map2.get(cyberGamesPage2);
                Boolean bool = Boolean.TRUE;
                feeVar2.d(Boolean.valueOf(Intrinsics.d(obj2, bool)));
                ((fee) this.k.getValue()).d(Boolean.valueOf(Intrinsics.d(zjwVar3.q.get(cyberGamesPage2), bool)));
                g5h g5hVar2 = zjwVar.b.c.o;
                boolean z2 = zjwVar.f;
                zbk zbkVar2 = ((fee) this.l.getValue()).e;
                jih jihVar2 = (jih) zjwVar3.h.get(cyberGamesPage2);
                if (jihVar2 != null) {
                    ((pz40) xp20.d(th90Var, cyberGamesPage2)).setValue(u1c.w(this.d, ekwVar2.f7971a, jihVar2, zjwVar3.i, true, new wqv(this, jihVar2, (byte) 1)));
                }
                return new kkw(g5hVar2, z2, zbkVar2, th90Var);
        }
    }
}
