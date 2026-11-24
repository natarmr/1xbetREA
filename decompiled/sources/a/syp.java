package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final class syp implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33032a = 0;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final Object h;
    public final Object i;
    public final Object j;

    public syp(ocl oclVar, ctf0 ctf0Var, ufb0 ufb0Var) {
        final byte b = 2;
        ctf0Var.getClass();
        this.h = oclVar;
        this.i = ctf0Var;
        this.b = maz.b(new yw9(new efb0(ufb0Var.i, ufb0Var.f, a(ufb0Var)), xfb0.f40784a, (byte) 20));
        this.c = maz.b(new yw9(new mfb0(ufb0Var.l, a(ufb0Var)), yfb0.f42533a, (byte) 20));
        final byte b2 = 0;
        this.d = maz.b(new yw9(new kfb0(ufb0Var.k, a(ufb0Var)), new Function1(this) { // from class: a.wfb0
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0083  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y4t y4tVar;
                oeb0 jeb0Var;
                byte b3 = b2;
                Object obj2 = null;
                syp sypVar = this.b;
                switch (b3) {
                    case 0:
                        kfb0 kfb0Var = (kfb0) obj;
                        kfb0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) sypVar.i;
                        neb0 neb0Var = lfb0.f19946a;
                        ctf0Var2.getClass();
                        hfe hfeVar = kfb0Var.f18187a;
                        if (!(hfeVar instanceof vee)) {
                            if (!(hfeVar instanceof bfe)) {
                                return null;
                            }
                            if (!kfb0Var.b) {
                                xeb0 xeb0Var = (xeb0) ((bfe) hfeVar).f2497a;
                                pn40 pn40Var = pn40.f27267a;
                                return new neb0(new to30(pn40.d(Double.parseDouble(xeb0Var.f40737a.d), xeb0Var.b, p3u0.c), ctf0Var2.b.a(R.string.promo_jackpot, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.jackpot_popular_banner, null, 6), false), meb0.b);
                            }
                        }
                        return neb0Var;
                    case 1:
                        ofb0 ofb0Var = (ofb0) obj;
                        ofb0Var.getClass();
                        ctf0 ctf0Var3 = (ctf0) sypVar.i;
                        leb0 leb0Var = pfb0.f26894a;
                        ctf0Var3.getClass();
                        hfe hfeVar2 = ofb0Var.f25158a;
                        if (!(hfeVar2 instanceof vee)) {
                            if (!(hfeVar2 instanceof bfe)) {
                                return null;
                            }
                            if (!ofb0Var.b) {
                                List<uab> list = (List) ((bfe) hfeVar2).f2497a;
                                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                                for (uab uabVar : list) {
                                    uabVar.getClass();
                                    mz60 mz60Var = uabVar.f35321a;
                                    long jD = x1x.D(mz60Var.b);
                                    String str = mz60Var.f22638a;
                                    hds hdsVar = mz60Var.d;
                                    arrayList.add(new jvy(jD, str, new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), new m0x(R.drawable.ic_games_placeholder, null, 6)));
                                }
                                return new leb0(new kvy(arrayList), new hjm(ctf0Var3.b.a(R.string.popular_games_in_center_of_attention, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190));
                            }
                        }
                        return leb0Var;
                    case 2:
                        gfb0 gfb0Var = (gfb0) obj;
                        gfb0Var.getClass();
                        ctf0 ctf0Var4 = (ctf0) sypVar.i;
                        List list2 = hfb0.f12965a;
                        ctf0Var4.getClass();
                        hfe hfeVar3 = gfb0Var.f11201a;
                        if (hfeVar3 instanceof vee) {
                            obj2 = list2;
                        } else if (hfeVar3 instanceof bfe) {
                            if (gfb0Var.b) {
                                obj2 = list2;
                            } else {
                                List<gis> list3 = (List) ((bfe) hfeVar3).f2497a;
                                xim ximVar = xim.c;
                                ArrayList arrayList2 = new ArrayList();
                                for (gis gisVar : list3) {
                                    nek nekVar = y4t.c;
                                    String str2 = gisVar.b;
                                    List list4 = gisVar.f11364a;
                                    nekVar.getClass();
                                    str2.getClass();
                                    y4t[] y4tVarArrValues = y4t.values();
                                    int length = y4tVarArrValues.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            y4tVar = y4tVarArrValues[i];
                                            if (!y4tVar.f42020a.equals(str2)) {
                                                i++;
                                            }
                                        } else {
                                            y4tVar = null;
                                        }
                                    }
                                    int i2 = y4tVar == null ? -1 : eeb0.f7664a[y4tVar.ordinal()];
                                    if (i2 == 1) {
                                        String str3 = gisVar.b;
                                        List listD0 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                        Iterator it = listD0.iterator();
                                        while (it.hasNext()) {
                                            arrayList3.add(e9x.Z((mz60) it.next()));
                                        }
                                        i4 i4VarR0 = dyb.r0(arrayList3);
                                        String str4 = gisVar.c;
                                        pz40 pz40Var = s6t0.f31722a;
                                        StaticColors staticColors = StaticColors.INSTANCE;
                                        jeb0Var = new jeb0(str3, i4VarR0, str4, new m0x(R.drawable.category_for_you_banner_container, null, 6), yk5.g(q3d.j(new y3d(staticColors.m122getViolet0d7_KjU()), new y3d(staticColors.m111getPurple0d7_KjU())), 0.0f, 0.0f, 14), false);
                                    } else if (i2 == 2) {
                                        String str5 = gisVar.b;
                                        List listD1 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                                        Iterator it2 = listD1.iterator();
                                        while (it2.hasNext()) {
                                            arrayList4.add(e9x.Z((mz60) it2.next()));
                                        }
                                        i4 i4VarR1 = dyb.r0(arrayList4);
                                        String str6 = gisVar.c;
                                        pz40 pz40Var2 = s6t0.f31722a;
                                        StaticColors staticColors2 = StaticColors.INSTANCE;
                                        jeb0Var = new jeb0(str5, i4VarR1, str6, new m0x(R.drawable.category_best_banner_container, null, 6), yk5.g(q3d.j(new y3d(staticColors2.m87getDarkOrange0d7_KjU()), new y3d(staticColors2.m132getYellow0d7_KjU())), 0.0f, 0.0f, 14), false);
                                    } else if (i2 != 3) {
                                        String str7 = gisVar.b;
                                        List listD2 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                                        Iterator it3 = listD2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList5.add(e9x.Z((mz60) it3.next()));
                                        }
                                        jeb0Var = new ieb0(str7, new cjm(dyb.r0(arrayList5), ximVar), new hjm(gisVar.c, null, null, null, null, null, false, null, null, false, list4.size() >= 4 ? new ue9(ctf0Var4.b.a(R.string.filter_all, Arrays.copyOf(new Object[0], 0))) : null, null, 7166));
                                    } else {
                                        jeb0Var = null;
                                    }
                                    if (jeb0Var != null) {
                                        arrayList2.add(jeb0Var);
                                    }
                                }
                                obj2 = arrayList2;
                            }
                        }
                        return obj2 == null ? iun.f15405a : obj2;
                    default:
                        jfb0 jfb0Var = (jfb0) obj;
                        jfb0Var.getClass();
                        ocl oclVar2 = (ocl) sypVar.h;
                        if (jfb0Var.c) {
                            return ocl.b(oclVar2, pb10.r1, pdm.b, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, R.string.continue_action, 0L, 0L, 852);
                        }
                        if (jfb0Var.f16417a) {
                            return ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_empty_games_error, 0, 0L, 0L, 734);
                        }
                        if (jfb0Var.b || jfb0Var.d) {
                            return ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        return null;
                }
            }
        }, (byte) 20));
        hfe hfeVar = ufb0Var.j;
        final byte b3 = 1;
        this.e = maz.b(new yw9(b(hfeVar, a(ufb0Var)).b, new Function1(this) { // from class: a.wfb0
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0083  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y4t y4tVar;
                oeb0 jeb0Var;
                byte b4 = b3;
                Object obj2 = null;
                syp sypVar = this.b;
                switch (b4) {
                    case 0:
                        kfb0 kfb0Var = (kfb0) obj;
                        kfb0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) sypVar.i;
                        neb0 neb0Var = lfb0.f19946a;
                        ctf0Var2.getClass();
                        hfe hfeVar2 = kfb0Var.f18187a;
                        if (!(hfeVar2 instanceof vee)) {
                            if (!(hfeVar2 instanceof bfe)) {
                                return null;
                            }
                            if (!kfb0Var.b) {
                                xeb0 xeb0Var = (xeb0) ((bfe) hfeVar2).f2497a;
                                pn40 pn40Var = pn40.f27267a;
                                return new neb0(new to30(pn40.d(Double.parseDouble(xeb0Var.f40737a.d), xeb0Var.b, p3u0.c), ctf0Var2.b.a(R.string.promo_jackpot, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.jackpot_popular_banner, null, 6), false), meb0.b);
                            }
                        }
                        return neb0Var;
                    case 1:
                        ofb0 ofb0Var = (ofb0) obj;
                        ofb0Var.getClass();
                        ctf0 ctf0Var3 = (ctf0) sypVar.i;
                        leb0 leb0Var = pfb0.f26894a;
                        ctf0Var3.getClass();
                        hfe hfeVar3 = ofb0Var.f25158a;
                        if (!(hfeVar3 instanceof vee)) {
                            if (!(hfeVar3 instanceof bfe)) {
                                return null;
                            }
                            if (!ofb0Var.b) {
                                List<uab> list = (List) ((bfe) hfeVar3).f2497a;
                                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                                for (uab uabVar : list) {
                                    uabVar.getClass();
                                    mz60 mz60Var = uabVar.f35321a;
                                    long jD = x1x.D(mz60Var.b);
                                    String str = mz60Var.f22638a;
                                    hds hdsVar = mz60Var.d;
                                    arrayList.add(new jvy(jD, str, new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), new m0x(R.drawable.ic_games_placeholder, null, 6)));
                                }
                                return new leb0(new kvy(arrayList), new hjm(ctf0Var3.b.a(R.string.popular_games_in_center_of_attention, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190));
                            }
                        }
                        return leb0Var;
                    case 2:
                        gfb0 gfb0Var = (gfb0) obj;
                        gfb0Var.getClass();
                        ctf0 ctf0Var4 = (ctf0) sypVar.i;
                        List list2 = hfb0.f12965a;
                        ctf0Var4.getClass();
                        hfe hfeVar4 = gfb0Var.f11201a;
                        if (hfeVar4 instanceof vee) {
                            obj2 = list2;
                        } else if (hfeVar4 instanceof bfe) {
                            if (gfb0Var.b) {
                                obj2 = list2;
                            } else {
                                List<gis> list3 = (List) ((bfe) hfeVar4).f2497a;
                                xim ximVar = xim.c;
                                ArrayList arrayList2 = new ArrayList();
                                for (gis gisVar : list3) {
                                    nek nekVar = y4t.c;
                                    String str2 = gisVar.b;
                                    List list4 = gisVar.f11364a;
                                    nekVar.getClass();
                                    str2.getClass();
                                    y4t[] y4tVarArrValues = y4t.values();
                                    int length = y4tVarArrValues.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            y4tVar = y4tVarArrValues[i];
                                            if (!y4tVar.f42020a.equals(str2)) {
                                                i++;
                                            }
                                        } else {
                                            y4tVar = null;
                                        }
                                    }
                                    int i2 = y4tVar == null ? -1 : eeb0.f7664a[y4tVar.ordinal()];
                                    if (i2 == 1) {
                                        String str3 = gisVar.b;
                                        List listD0 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                        Iterator it = listD0.iterator();
                                        while (it.hasNext()) {
                                            arrayList3.add(e9x.Z((mz60) it.next()));
                                        }
                                        i4 i4VarR0 = dyb.r0(arrayList3);
                                        String str4 = gisVar.c;
                                        pz40 pz40Var = s6t0.f31722a;
                                        StaticColors staticColors = StaticColors.INSTANCE;
                                        jeb0Var = new jeb0(str3, i4VarR0, str4, new m0x(R.drawable.category_for_you_banner_container, null, 6), yk5.g(q3d.j(new y3d(staticColors.m122getViolet0d7_KjU()), new y3d(staticColors.m111getPurple0d7_KjU())), 0.0f, 0.0f, 14), false);
                                    } else if (i2 == 2) {
                                        String str5 = gisVar.b;
                                        List listD1 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                                        Iterator it2 = listD1.iterator();
                                        while (it2.hasNext()) {
                                            arrayList4.add(e9x.Z((mz60) it2.next()));
                                        }
                                        i4 i4VarR1 = dyb.r0(arrayList4);
                                        String str6 = gisVar.c;
                                        pz40 pz40Var2 = s6t0.f31722a;
                                        StaticColors staticColors2 = StaticColors.INSTANCE;
                                        jeb0Var = new jeb0(str5, i4VarR1, str6, new m0x(R.drawable.category_best_banner_container, null, 6), yk5.g(q3d.j(new y3d(staticColors2.m87getDarkOrange0d7_KjU()), new y3d(staticColors2.m132getYellow0d7_KjU())), 0.0f, 0.0f, 14), false);
                                    } else if (i2 != 3) {
                                        String str7 = gisVar.b;
                                        List listD2 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                                        Iterator it3 = listD2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList5.add(e9x.Z((mz60) it3.next()));
                                        }
                                        jeb0Var = new ieb0(str7, new cjm(dyb.r0(arrayList5), ximVar), new hjm(gisVar.c, null, null, null, null, null, false, null, null, false, list4.size() >= 4 ? new ue9(ctf0Var4.b.a(R.string.filter_all, Arrays.copyOf(new Object[0], 0))) : null, null, 7166));
                                    } else {
                                        jeb0Var = null;
                                    }
                                    if (jeb0Var != null) {
                                        arrayList2.add(jeb0Var);
                                    }
                                }
                                obj2 = arrayList2;
                            }
                        }
                        return obj2 == null ? iun.f15405a : obj2;
                    default:
                        jfb0 jfb0Var = (jfb0) obj;
                        jfb0Var.getClass();
                        ocl oclVar2 = (ocl) sypVar.h;
                        if (jfb0Var.c) {
                            return ocl.b(oclVar2, pb10.r1, pdm.b, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, R.string.continue_action, 0L, 0L, 852);
                        }
                        if (jfb0Var.f16417a) {
                            return ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_empty_games_error, 0, 0L, 0L, 734);
                        }
                        if (jfb0Var.b || jfb0Var.d) {
                            return ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        return null;
                }
            }
        }, (byte) 20));
        this.f = maz.b(new yw9(b(hfeVar, a(ufb0Var)).f46059a, new Function1(this) { // from class: a.wfb0
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0083  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y4t y4tVar;
                oeb0 jeb0Var;
                byte b4 = b;
                Object obj2 = null;
                syp sypVar = this.b;
                switch (b4) {
                    case 0:
                        kfb0 kfb0Var = (kfb0) obj;
                        kfb0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) sypVar.i;
                        neb0 neb0Var = lfb0.f19946a;
                        ctf0Var2.getClass();
                        hfe hfeVar2 = kfb0Var.f18187a;
                        if (!(hfeVar2 instanceof vee)) {
                            if (!(hfeVar2 instanceof bfe)) {
                                return null;
                            }
                            if (!kfb0Var.b) {
                                xeb0 xeb0Var = (xeb0) ((bfe) hfeVar2).f2497a;
                                pn40 pn40Var = pn40.f27267a;
                                return new neb0(new to30(pn40.d(Double.parseDouble(xeb0Var.f40737a.d), xeb0Var.b, p3u0.c), ctf0Var2.b.a(R.string.promo_jackpot, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.jackpot_popular_banner, null, 6), false), meb0.b);
                            }
                        }
                        return neb0Var;
                    case 1:
                        ofb0 ofb0Var = (ofb0) obj;
                        ofb0Var.getClass();
                        ctf0 ctf0Var3 = (ctf0) sypVar.i;
                        leb0 leb0Var = pfb0.f26894a;
                        ctf0Var3.getClass();
                        hfe hfeVar3 = ofb0Var.f25158a;
                        if (!(hfeVar3 instanceof vee)) {
                            if (!(hfeVar3 instanceof bfe)) {
                                return null;
                            }
                            if (!ofb0Var.b) {
                                List<uab> list = (List) ((bfe) hfeVar3).f2497a;
                                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                                for (uab uabVar : list) {
                                    uabVar.getClass();
                                    mz60 mz60Var = uabVar.f35321a;
                                    long jD = x1x.D(mz60Var.b);
                                    String str = mz60Var.f22638a;
                                    hds hdsVar = mz60Var.d;
                                    arrayList.add(new jvy(jD, str, new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), new m0x(R.drawable.ic_games_placeholder, null, 6)));
                                }
                                return new leb0(new kvy(arrayList), new hjm(ctf0Var3.b.a(R.string.popular_games_in_center_of_attention, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190));
                            }
                        }
                        return leb0Var;
                    case 2:
                        gfb0 gfb0Var = (gfb0) obj;
                        gfb0Var.getClass();
                        ctf0 ctf0Var4 = (ctf0) sypVar.i;
                        List list2 = hfb0.f12965a;
                        ctf0Var4.getClass();
                        hfe hfeVar4 = gfb0Var.f11201a;
                        if (hfeVar4 instanceof vee) {
                            obj2 = list2;
                        } else if (hfeVar4 instanceof bfe) {
                            if (gfb0Var.b) {
                                obj2 = list2;
                            } else {
                                List<gis> list3 = (List) ((bfe) hfeVar4).f2497a;
                                xim ximVar = xim.c;
                                ArrayList arrayList2 = new ArrayList();
                                for (gis gisVar : list3) {
                                    nek nekVar = y4t.c;
                                    String str2 = gisVar.b;
                                    List list4 = gisVar.f11364a;
                                    nekVar.getClass();
                                    str2.getClass();
                                    y4t[] y4tVarArrValues = y4t.values();
                                    int length = y4tVarArrValues.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            y4tVar = y4tVarArrValues[i];
                                            if (!y4tVar.f42020a.equals(str2)) {
                                                i++;
                                            }
                                        } else {
                                            y4tVar = null;
                                        }
                                    }
                                    int i2 = y4tVar == null ? -1 : eeb0.f7664a[y4tVar.ordinal()];
                                    if (i2 == 1) {
                                        String str3 = gisVar.b;
                                        List listD0 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                        Iterator it = listD0.iterator();
                                        while (it.hasNext()) {
                                            arrayList3.add(e9x.Z((mz60) it.next()));
                                        }
                                        i4 i4VarR0 = dyb.r0(arrayList3);
                                        String str4 = gisVar.c;
                                        pz40 pz40Var = s6t0.f31722a;
                                        StaticColors staticColors = StaticColors.INSTANCE;
                                        jeb0Var = new jeb0(str3, i4VarR0, str4, new m0x(R.drawable.category_for_you_banner_container, null, 6), yk5.g(q3d.j(new y3d(staticColors.m122getViolet0d7_KjU()), new y3d(staticColors.m111getPurple0d7_KjU())), 0.0f, 0.0f, 14), false);
                                    } else if (i2 == 2) {
                                        String str5 = gisVar.b;
                                        List listD1 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                                        Iterator it2 = listD1.iterator();
                                        while (it2.hasNext()) {
                                            arrayList4.add(e9x.Z((mz60) it2.next()));
                                        }
                                        i4 i4VarR1 = dyb.r0(arrayList4);
                                        String str6 = gisVar.c;
                                        pz40 pz40Var2 = s6t0.f31722a;
                                        StaticColors staticColors2 = StaticColors.INSTANCE;
                                        jeb0Var = new jeb0(str5, i4VarR1, str6, new m0x(R.drawable.category_best_banner_container, null, 6), yk5.g(q3d.j(new y3d(staticColors2.m87getDarkOrange0d7_KjU()), new y3d(staticColors2.m132getYellow0d7_KjU())), 0.0f, 0.0f, 14), false);
                                    } else if (i2 != 3) {
                                        String str7 = gisVar.b;
                                        List listD2 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                                        Iterator it3 = listD2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList5.add(e9x.Z((mz60) it3.next()));
                                        }
                                        jeb0Var = new ieb0(str7, new cjm(dyb.r0(arrayList5), ximVar), new hjm(gisVar.c, null, null, null, null, null, false, null, null, false, list4.size() >= 4 ? new ue9(ctf0Var4.b.a(R.string.filter_all, Arrays.copyOf(new Object[0], 0))) : null, null, 7166));
                                    } else {
                                        jeb0Var = null;
                                    }
                                    if (jeb0Var != null) {
                                        arrayList2.add(jeb0Var);
                                    }
                                }
                                obj2 = arrayList2;
                            }
                        }
                        return obj2 == null ? iun.f15405a : obj2;
                    default:
                        jfb0 jfb0Var = (jfb0) obj;
                        jfb0Var.getClass();
                        ocl oclVar2 = (ocl) sypVar.h;
                        if (jfb0Var.c) {
                            return ocl.b(oclVar2, pb10.r1, pdm.b, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, R.string.continue_action, 0L, 0L, 852);
                        }
                        if (jfb0Var.f16417a) {
                            return ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_empty_games_error, 0, 0L, 0L, 734);
                        }
                        if (jfb0Var.b || jfb0Var.d) {
                            return ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        return null;
                }
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.g = maz.b(new yw9(new jfb0(false, false, false, false), new Function1(this) { // from class: a.wfb0
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0083  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y4t y4tVar;
                oeb0 jeb0Var;
                byte b5 = b4;
                Object obj2 = null;
                syp sypVar = this.b;
                switch (b5) {
                    case 0:
                        kfb0 kfb0Var = (kfb0) obj;
                        kfb0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) sypVar.i;
                        neb0 neb0Var = lfb0.f19946a;
                        ctf0Var2.getClass();
                        hfe hfeVar2 = kfb0Var.f18187a;
                        if (!(hfeVar2 instanceof vee)) {
                            if (!(hfeVar2 instanceof bfe)) {
                                return null;
                            }
                            if (!kfb0Var.b) {
                                xeb0 xeb0Var = (xeb0) ((bfe) hfeVar2).f2497a;
                                pn40 pn40Var = pn40.f27267a;
                                return new neb0(new to30(pn40.d(Double.parseDouble(xeb0Var.f40737a.d), xeb0Var.b, p3u0.c), ctf0Var2.b.a(R.string.promo_jackpot, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.jackpot_popular_banner, null, 6), false), meb0.b);
                            }
                        }
                        return neb0Var;
                    case 1:
                        ofb0 ofb0Var = (ofb0) obj;
                        ofb0Var.getClass();
                        ctf0 ctf0Var3 = (ctf0) sypVar.i;
                        leb0 leb0Var = pfb0.f26894a;
                        ctf0Var3.getClass();
                        hfe hfeVar3 = ofb0Var.f25158a;
                        if (!(hfeVar3 instanceof vee)) {
                            if (!(hfeVar3 instanceof bfe)) {
                                return null;
                            }
                            if (!ofb0Var.b) {
                                List<uab> list = (List) ((bfe) hfeVar3).f2497a;
                                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                                for (uab uabVar : list) {
                                    uabVar.getClass();
                                    mz60 mz60Var = uabVar.f35321a;
                                    long jD = x1x.D(mz60Var.b);
                                    String str = mz60Var.f22638a;
                                    hds hdsVar = mz60Var.d;
                                    arrayList.add(new jvy(jD, str, new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), new m0x(R.drawable.ic_games_placeholder, null, 6)));
                                }
                                return new leb0(new kvy(arrayList), new hjm(ctf0Var3.b.a(R.string.popular_games_in_center_of_attention, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190));
                            }
                        }
                        return leb0Var;
                    case 2:
                        gfb0 gfb0Var = (gfb0) obj;
                        gfb0Var.getClass();
                        ctf0 ctf0Var4 = (ctf0) sypVar.i;
                        List list2 = hfb0.f12965a;
                        ctf0Var4.getClass();
                        hfe hfeVar4 = gfb0Var.f11201a;
                        if (hfeVar4 instanceof vee) {
                            obj2 = list2;
                        } else if (hfeVar4 instanceof bfe) {
                            if (gfb0Var.b) {
                                obj2 = list2;
                            } else {
                                List<gis> list3 = (List) ((bfe) hfeVar4).f2497a;
                                xim ximVar = xim.c;
                                ArrayList arrayList2 = new ArrayList();
                                for (gis gisVar : list3) {
                                    nek nekVar = y4t.c;
                                    String str2 = gisVar.b;
                                    List list4 = gisVar.f11364a;
                                    nekVar.getClass();
                                    str2.getClass();
                                    y4t[] y4tVarArrValues = y4t.values();
                                    int length = y4tVarArrValues.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            y4tVar = y4tVarArrValues[i];
                                            if (!y4tVar.f42020a.equals(str2)) {
                                                i++;
                                            }
                                        } else {
                                            y4tVar = null;
                                        }
                                    }
                                    int i2 = y4tVar == null ? -1 : eeb0.f7664a[y4tVar.ordinal()];
                                    if (i2 == 1) {
                                        String str3 = gisVar.b;
                                        List listD0 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                        Iterator it = listD0.iterator();
                                        while (it.hasNext()) {
                                            arrayList3.add(e9x.Z((mz60) it.next()));
                                        }
                                        i4 i4VarR0 = dyb.r0(arrayList3);
                                        String str4 = gisVar.c;
                                        pz40 pz40Var = s6t0.f31722a;
                                        StaticColors staticColors = StaticColors.INSTANCE;
                                        jeb0Var = new jeb0(str3, i4VarR0, str4, new m0x(R.drawable.category_for_you_banner_container, null, 6), yk5.g(q3d.j(new y3d(staticColors.m122getViolet0d7_KjU()), new y3d(staticColors.m111getPurple0d7_KjU())), 0.0f, 0.0f, 14), false);
                                    } else if (i2 == 2) {
                                        String str5 = gisVar.b;
                                        List listD1 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList4 = new ArrayList(r3d.q(listD1, 10));
                                        Iterator it2 = listD1.iterator();
                                        while (it2.hasNext()) {
                                            arrayList4.add(e9x.Z((mz60) it2.next()));
                                        }
                                        i4 i4VarR1 = dyb.r0(arrayList4);
                                        String str6 = gisVar.c;
                                        pz40 pz40Var2 = s6t0.f31722a;
                                        StaticColors staticColors2 = StaticColors.INSTANCE;
                                        jeb0Var = new jeb0(str5, i4VarR1, str6, new m0x(R.drawable.category_best_banner_container, null, 6), yk5.g(q3d.j(new y3d(staticColors2.m87getDarkOrange0d7_KjU()), new y3d(staticColors2.m132getYellow0d7_KjU())), 0.0f, 0.0f, 14), false);
                                    } else if (i2 != 3) {
                                        String str7 = gisVar.b;
                                        List listD2 = CollectionsKt.D0(list4, 10);
                                        ArrayList arrayList5 = new ArrayList(r3d.q(listD2, 10));
                                        Iterator it3 = listD2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList5.add(e9x.Z((mz60) it3.next()));
                                        }
                                        jeb0Var = new ieb0(str7, new cjm(dyb.r0(arrayList5), ximVar), new hjm(gisVar.c, null, null, null, null, null, false, null, null, false, list4.size() >= 4 ? new ue9(ctf0Var4.b.a(R.string.filter_all, Arrays.copyOf(new Object[0], 0))) : null, null, 7166));
                                    } else {
                                        jeb0Var = null;
                                    }
                                    if (jeb0Var != null) {
                                        arrayList2.add(jeb0Var);
                                    }
                                }
                                obj2 = arrayList2;
                            }
                        }
                        return obj2 == null ? iun.f15405a : obj2;
                    default:
                        jfb0 jfb0Var = (jfb0) obj;
                        jfb0Var.getClass();
                        ocl oclVar2 = (ocl) sypVar.h;
                        if (jfb0Var.c) {
                            return ocl.b(oclVar2, pb10.r1, pdm.b, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, R.string.continue_action, 0L, 0L, 852);
                        }
                        if (jfb0Var.f16417a) {
                            return ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_empty_games_error, 0, 0L, 0L, 734);
                        }
                        if (jfb0Var.b || jfb0Var.d) {
                            return ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        return null;
                }
            }
        }, (byte) 20));
        this.j = maz.b(new yw9(new ifb0(iun.f15405a, null, null, null, null, null, null), zfb0.f44294a, (byte) 20));
    }

    public static boolean a(ufb0 ufb0Var) {
        return (ufb0Var.i instanceof vee) || (ufb0Var.j instanceof vee) || (ufb0Var.l instanceof vee) || (ufb0Var.k instanceof vee);
    }

    public static Pair b(hfe hfeVar, boolean z) {
        if (hfeVar instanceof vee) {
            vee veeVar = vee.f37282a;
            return new Pair(new gfb0(veeVar, z), new ofb0(veeVar, z));
        }
        if (hfeVar instanceof wee) {
            wee weeVar = wee.f39013a;
            return new Pair(new gfb0(weeVar, z), new ofb0(weeVar, z));
        }
        if (hfeVar instanceof xee) {
            Throwable th = ((xee) hfeVar).f40742a;
            return new Pair(new gfb0(new xee(th), z), new ofb0(new xee(th), z));
        }
        if (hfeVar instanceof zee) {
            zee zeeVar = zee.f44245a;
            return new Pair(new gfb0(zeeVar, z), new ofb0(zeeVar, z));
        }
        if (hfeVar instanceof bfe) {
            Object obj = ((bfe) hfeVar).f2497a;
            return new Pair(new gfb0(new bfe(((feb0) obj).f9398a), z), new ofb0(new bfe(((feb0) obj).b), z));
        }
        t9f.b();
        return null;
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f33032a;
        Object obj2 = this.h;
        Object obj3 = this.j;
        n0o0 n0o0Var = this.g;
        n0o0 n0o0Var2 = this.e;
        n0o0 n0o0Var3 = this.f;
        n0o0 n0o0Var4 = this.d;
        n0o0 n0o0Var5 = this.c;
        n0o0 n0o0Var6 = this.b;
        switch (b) {
            case 0:
                kxp kxpVar = (kxp) obj;
                g2v g2vVar = (g2v) obj2;
                kxpVar.getClass();
                ((fee) n0o0Var6.getValue()).d(kxpVar.h.c);
                xwp xwpVar = kxpVar.b;
                if (xwpVar == null && !kxpVar.f19067a) {
                    return new qyp(new gxp(new dxp(yyw.N(g2vVar, ldm.b))), (String) ((fee) n0o0Var6.getValue()).b());
                }
                if (xwpVar == null) {
                    return new qyp(new gxp(new exp(g2v.b(g2vVar, pb10.q, null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022))), (String) ((fee) n0o0Var6.getValue()).b());
                }
                Object obj4 = xwpVar.f41620a;
                e0g0 e0g0Var = j0g0.b;
                boolean z = obj4 instanceof g0g0;
                if (!z) {
                    mxp mxpVar = (mxp) (z ? null : obj4);
                    if (mxpVar == null || mxpVar.c.length() != 0) {
                        ((fee) n0o0Var5.getValue()).d((mxp) (z ? null : obj4));
                        ((fee) n0o0Var4.getValue()).d(kxpVar);
                        ((fee) n0o0Var2.getValue()).d(kxpVar);
                        ((fee) n0o0Var3.getValue()).d(kxpVar);
                        fee feeVar = (fee) n0o0Var.getValue();
                        if (z) {
                            obj4 = null;
                        }
                        feeVar.d((mxp) obj4);
                        pyp pypVar = (pyp) ((fee) n0o0Var5.getValue()).b();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) n0o0Var4.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) n0o0Var2.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                        return new qyp(pypVar, new gxp(cxp.f5132a, twn.k(lc00VarB, (Collection) ((fee) n0o0Var.getValue()).b(), lc00VarB)), (String) ((fee) n0o0Var6.getValue()).b());
                    }
                }
                return new qyp(new gxp(new dxp(yyw.N(g2vVar, ldm.b))), (String) ((fee) n0o0Var6.getValue()).b());
            case 1:
                nj00 nj00Var = (nj00) obj;
                nj00Var.getClass();
                fee feeVar2 = (fee) n0o0Var6.getValue();
                feeVar2.getClass();
                pz40 pz40VarA = feeVar2.a();
                mj00 mj00Var = nj00Var.b;
                pz40VarA.setValue(mj00Var);
                fee feeVar3 = (fee) n0o0Var4.getValue();
                feeVar3.getClass();
                pz40 pz40VarA2 = feeVar3.a();
                ((String) feeVar3.a().getValue()).getClass();
                pz40VarA2.setValue(nj00Var.f23613a);
                fee feeVar4 = (fee) n0o0Var5.getValue();
                feeVar4.getClass();
                pz40 pz40VarA3 = feeVar4.a();
                ((Set) feeVar4.a().getValue()).getClass();
                pz40VarA3.setValue(nj00Var.e);
                List list = nj00Var.c;
                String str = nj00Var.h;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    d0t d0tVar = (d0t) obj5;
                    String str2 = d0tVar.o;
                    String str3 = d0tVar.i;
                    Object obj6 = obj2;
                    String str4 = d0tVar.b;
                    mj00 mj00Var2 = mj00Var;
                    if (StringsKt.O(str2, str, true) || StringsKt.O(str3, str, true) || StringsKt.O(str4, str, true) || StringsKt.O(qzb.c0(d0tVar), str, true) || StringsKt.O(qzb.r0(d0tVar), str, true)) {
                        arrayList.add(obj5);
                    }
                    obj2 = obj6;
                    mj00Var = mj00Var2;
                }
                Object obj7 = obj2;
                mj00 mj00Var3 = mj00Var;
                fee feeVar5 = (fee) n0o0Var3.getValue();
                feeVar5.getClass();
                pz40 pz40VarA4 = feeVar5.a();
                ((List) feeVar5.a().getValue()).getClass();
                pz40VarA4.setValue(arrayList);
                fee feeVar6 = (fee) ((n0o0) this.i).getValue();
                feeVar6.getClass();
                pz40 pz40VarA5 = feeVar6.a();
                ((ais) feeVar6.a().getValue()).getClass();
                boolean z2 = nj00Var.g;
                ais aisVar = nj00Var.d;
                if (!z2 && aisVar == ais.f939a && arrayList.isEmpty()) {
                    aisVar = str.length() > 0 ? ais.d : ais.c;
                }
                pz40VarA5.setValue(aisVar);
                fee feeVar7 = (fee) n0o0Var.getValue();
                feeVar7.getClass();
                pz40 pz40VarA6 = feeVar7.a();
                ((Boolean) feeVar7.a().getValue()).getClass();
                pz40VarA6.setValue(Boolean.valueOf(nj00Var.f));
                fee feeVar8 = (fee) n0o0Var2.getValue();
                feeVar8.getClass();
                pz40 pz40VarA7 = feeVar8.a();
                ((String) feeVar8.a().getValue()).getClass();
                pz40VarA7.setValue(str);
                fee feeVar9 = (fee) ((n0o0) obj7).getValue();
                feeVar9.getClass();
                pz40 pz40VarA8 = feeVar9.a();
                ((Boolean) feeVar9.a().getValue()).getClass();
                pz40VarA8.setValue(Boolean.valueOf(nj00Var.i));
                return new oj00((String) ((fee) n0o0Var4.getValue()).c(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue(), mj00Var3 != null ? (kj00) ((fee) ((n0o0) obj3).getValue()).b() : ij00.f14851a);
            default:
                n0o0 n0o0Var7 = (n0o0) obj3;
                ufb0 ufb0Var = (ufb0) obj;
                ufb0Var.getClass();
                boolean zA = a(ufb0Var);
                ((fee) n0o0Var6.getValue()).d(new efb0(ufb0Var.i, ufb0Var.f, zA));
                ((fee) n0o0Var5.getValue()).d(new mfb0(ufb0Var.l, zA));
                ((fee) n0o0Var4.getValue()).d(new kfb0(ufb0Var.k, zA));
                hfe hfeVar = ufb0Var.j;
                Pair pairB = b(hfeVar, zA);
                gfb0 gfb0Var = (gfb0) pairB.f46059a;
                ofb0 ofb0Var = (ofb0) pairB.b;
                ((fee) n0o0Var3.getValue()).d(gfb0Var);
                ((fee) n0o0Var2.getValue()).d(ofb0Var);
                fee feeVar10 = (fee) n0o0Var.getValue();
                boolean z3 = hfeVar instanceof wee;
                seb0 seb0Var = ufb0Var.d;
                feeVar10.d(new jfb0(z3, seb0Var == seb0.c, seb0Var == seb0.d, seb0Var == seb0.b || (hfeVar instanceof xee) || (hfeVar instanceof zee)));
                fee feeVar11 = (fee) n0o0Var7.getValue();
                List list2 = ufb0Var.g;
                if (list2.isEmpty()) {
                    list2 = ufb0Var.h;
                }
                feeVar11.d(new ifb0(list2, (heb0) ((fee) n0o0Var6.getValue()).b(), (neb0) ((fee) n0o0Var5.getValue()).b(), (neb0) ((fee) n0o0Var4.getValue()).b(), (List) ((fee) n0o0Var3.getValue()).b(), (leb0) ((fee) n0o0Var2.getValue()).b(), (mdm) ((fee) n0o0Var.getValue()).b()));
                return (vfb0) ((fee) n0o0Var7.getValue()).b();
        }
    }

    public syp(kxp kxpVar, g2v g2vVar, ctf0 ctf0Var, y78 y78Var) {
        mxp mxpVar;
        final byte b = 0;
        ctf0Var.getClass();
        this.h = g2vVar;
        this.i = ctf0Var;
        this.j = y78Var;
        this.b = maz.b(new yw9(kxpVar.h.c, new Function1(this) { // from class: a.ryp
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 a.qoh, still in use, count: 2, list:
                  (r6v4 a.qoh) from 0x094d: MOVE (r22v4 a.qoh) = (r6v4 a.qoh) (LINE:2382)
                  (r6v4 a.qoh) from 0x094a: MOVE (r22v6 a.qoh) = (r6v4 a.qoh) (LINE:2379)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 3626
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.ryp.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        xwp xwpVar = kxpVar.b;
        Object obj = null;
        if (xwpVar != null) {
            Object obj2 = xwpVar.f41620a;
            e0g0 e0g0Var = j0g0.b;
            mxpVar = (mxp) (obj2 instanceof g0g0 ? null : obj2);
        } else {
            mxpVar = null;
        }
        final byte b2 = 1;
        this.c = maz.b(new yw9(mxpVar, new Function1(this) { // from class: a.ryp
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 a.qoh, still in use, count: 2, list:
                  (r6v4 a.qoh) from 0x094d: MOVE (r22v4 a.qoh) = (r6v4 a.qoh) (LINE:2382)
                  (r6v4 a.qoh) from 0x094a: MOVE (r22v6 a.qoh) = (r6v4 a.qoh) (LINE:2379)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 3626
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.ryp.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.d = maz.b(new yw9(kxpVar, new Function1(this) { // from class: a.ryp
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 a.qoh, still in use, count: 2, list:
                  (r6v4 a.qoh) from 0x094d: MOVE (r22v4 a.qoh) = (r6v4 a.qoh) (LINE:2382)
                  (r6v4 a.qoh) from 0x094a: MOVE (r22v6 a.qoh) = (r6v4 a.qoh) (LINE:2379)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 3626
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.ryp.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.e = maz.b(new yw9(kxpVar, new Function1(this) { // from class: a.ryp
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 a.qoh, still in use, count: 2, list:
                  (r6v4 a.qoh) from 0x094d: MOVE (r22v4 a.qoh) = (r6v4 a.qoh) (LINE:2382)
                  (r6v4 a.qoh) from 0x094a: MOVE (r22v6 a.qoh) = (r6v4 a.qoh) (LINE:2379)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 3626
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.ryp.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b5 = 4;
        this.f = maz.b(new yw9(kxpVar, new Function1(this) { // from class: a.ryp
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 a.qoh, still in use, count: 2, list:
                  (r6v4 a.qoh) from 0x094d: MOVE (r22v4 a.qoh) = (r6v4 a.qoh) (LINE:2382)
                  (r6v4 a.qoh) from 0x094a: MOVE (r22v6 a.qoh) = (r6v4 a.qoh) (LINE:2379)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 3626
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.ryp.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        if (xwpVar != null) {
            Object obj3 = xwpVar.f41620a;
            e0g0 e0g0Var2 = j0g0.b;
            obj = (mxp) (obj3 instanceof g0g0 ? null : obj3);
        }
        final byte b6 = 5;
        this.g = maz.b(new yw9(obj, new Function1(this) { // from class: a.ryp
            public final /* synthetic */ syp b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 a.qoh, still in use, count: 2, list:
                  (r6v4 a.qoh) from 0x094d: MOVE (r22v4 a.qoh) = (r6v4 a.qoh) (LINE:2382)
                  (r6v4 a.qoh) from 0x094a: MOVE (r22v6 a.qoh) = (r6v4 a.qoh) (LINE:2379)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 3626
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.ryp.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }

    public syp(nj00 nj00Var, ctf0 ctf0Var, y78 y78Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = bkb.H(nj00Var.b);
        this.c = bkb.H(nj00Var.e);
        this.d = bkb.H(nj00Var.f23613a);
        this.e = bkb.H(nj00Var.h);
        this.f = maz.b(new yw9(nj00Var.c, new k9v(this, ctf0Var, y78Var, (byte) 20), (byte) 20));
        this.g = bkb.H(Boolean.valueOf(nj00Var.f));
        this.h = bkb.H(Boolean.valueOf(nj00Var.i));
        n0o0 n0o0VarB = maz.b(new yw9(nj00Var.d, new rib(g2vVar, (byte) 1), (byte) 20));
        this.i = n0o0VarB;
        this.j = bkb.G(((fee) n0o0VarB.getValue()).d, new ebz(this, (byte) 28));
    }
}
