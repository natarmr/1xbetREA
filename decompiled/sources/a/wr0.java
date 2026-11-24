package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final class wr0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39615a = 1;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
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

    public wr0(ur0 ur0Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(ur0Var.e);
        n0o0 n0o0VarH = bkb.H(ur0Var.h);
        this.d = n0o0VarH;
        this.e = bkb.H(Boolean.valueOf(ur0Var.f));
        n0o0 n0o0VarH2 = bkb.H(ur0Var.c);
        this.f = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(ur0Var.b);
        this.g = n0o0VarH3;
        this.h = bkb.H(ur0Var.d);
        int i = ur0Var.g;
        final byte b2 = 6;
        this.i = maz.b(new yw9(Integer.valueOf(i), new eo0((byte) 6), (byte) 20));
        final byte b3 = 7;
        this.j = maz.b(new yw9(Integer.valueOf(i), new eo0((byte) 7), (byte) 20));
        final byte b4 = 2;
        this.k = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.vr0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0119  */
            /* JADX WARN: Code duplicated, block: B:44:0x012e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x2q x2qVar;
                dyl xxlVar;
                AggregatorSortingOptionModel aggregatorSortingOptionModel;
                d4d d4dVar;
                x2q x2qVar2;
                List list;
                pvi0 gvi0Var;
                fvi0 fvi0Var;
                d4d d4dVar2;
                x2q x2qVar3;
                byte b5 = b4;
                int i2 = 10;
                Iterable<j4b> iterable = null;
                wr0 wr0Var = this.b;
                switch (b5) {
                    case 0:
                        y5d0 y5d0Var = (y5d0) obj;
                        y5d0Var.getClass();
                        u5d0 u5d0Var = y5d0Var instanceof u5d0 ? (u5d0) y5d0Var : null;
                        if (u5d0Var != null && (x2qVar = u5d0Var.f35088a) != null) {
                            iterable = x2qVar.d;
                        }
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        List listD0 = CollectionsKt.D0(iterable, 6);
                        ArrayList<s5d0> arrayList = new ArrayList();
                        for (Object obj2 : listD0) {
                            if (obj2 instanceof s5d0) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (s5d0 s5d0Var : arrayList) {
                            arrayList2.add(new r5d0(new n0x(s5d0Var.c), s5d0Var.f31650a));
                        }
                        return new t5d0(dyb.r0(arrayList2), wr0Var.c().c() == ep0.LARGE_HEADER ? q5d0.b : q5d0.f28147a);
                    case 1:
                        v5q v5qVar = (v5q) obj;
                        v5qVar.getClass();
                        r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
                        iterable = r5qVar != null ? r5qVar.f29900a : null;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (j4b j4bVar : iterable) {
                            boolean z = wr0Var.c().c() != ep0.SMALL_HEADER && Intrinsics.d(j4bVar.f15876a.f40181a, "dopInfo2");
                            ep0 ep0Var = (ep0) wr0Var.c().c();
                            x2q x2qVar4 = j4bVar.f15876a;
                            hjm hjmVarA = wr0.a(ep0Var, x2qVar4.b);
                            List<l3q> list2 = x2qVar4.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list2, i2));
                            for (l3q l3qVar : list2) {
                                if (z) {
                                    String name = l3qVar.getName();
                                    String id = l3qVar.getId();
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str = String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg", Arrays.copyOf(new Object[]{id}, 1));
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
                                    n0x n0xVar = new n0x(sb.toString());
                                    zcl zclVar = qmk.f28987a;
                                    xxlVar = new ayl(name, n0xVar, 10.0f, Integer.valueOf(R.drawable.ic_glyph_category_new), Boolean.TRUE);
                                } else {
                                    xxlVar = new xxl(l3qVar.getName());
                                }
                                arrayList4.add(new lxl(Long.parseLong(l3qVar.getId()), xxlVar, false, j4bVar.b.contains(l3qVar.getId()) ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            }
                            arrayList3.add(new ro0(x2qVar4.f40181a, hjmVarA, new fyl(dyb.r0(arrayList4), tyl.b, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16)));
                            i2 = 10;
                        }
                        return arrayList3;
                    case 2:
                        ((uaq0) obj).getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(wr0Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 3:
                        ep0 ep0Var2 = (ep0) obj;
                        ep0Var2.getClass();
                        return wr0.a(ep0Var2, wr0Var.b.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        ep0 ep0Var3 = (ep0) obj;
                        ep0Var3.getClass();
                        return wr0.a(ep0Var3, wr0Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0)));
                    case 5:
                        rlk0 rlk0Var = (rlk0) obj;
                        rlk0Var.getClass();
                        nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
                        if (nlk0Var == null || (aggregatorSortingOptionModel = nlk0Var.b) == null) {
                            return null;
                        }
                        int iOrdinal = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal == 0) {
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        } else if (iOrdinal == 1) {
                            d4dVar = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        }
                        d4d d4dVar3 = d4dVar;
                        String str2 = aggregatorSortingOptionModel.f46274a;
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4dVar3, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    case 6:
                        pz40 pz40Var3 = s6t0.f31722a;
                        y5d0 y5d0Var2 = (y5d0) obj;
                        y5d0Var2.getClass();
                        u5d0 u5d0Var2 = y5d0Var2 instanceof u5d0 ? (u5d0) y5d0Var2 : null;
                        if (u5d0Var2 == null || (x2qVar2 = u5d0Var2.f35088a) == null || (list = x2qVar2.d) == null) {
                            return null;
                        }
                        int iOrdinal2 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                if (list.size() <= 6) {
                                    fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                                } else {
                                    gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                                }
                            } else {
                                fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            }
                            gvi0Var = fvi0Var;
                        } else if (list.size() <= 6) {
                            fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            gvi0Var = fvi0Var;
                        } else {
                            gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                        }
                        int iOrdinal3 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal3 == 0) {
                            int size = list.size();
                            d4dVar2 = (1 > size || size >= 7) ? d4d.BACKGROUND_CONTENT : d4d.BACKGROUND;
                        } else if (iOrdinal3 == 1) {
                            d4dVar2 = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar2 = !list.isEmpty() ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT;
                        }
                        return new rqm((vui0) new tui0(wr0Var.b.b.a(R.string.choose_providers, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, gvi0Var, d4dVar2, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    default:
                        y5d0 y5d0Var3 = (y5d0) obj;
                        y5d0Var3.getClass();
                        u5d0 u5d0Var3 = y5d0Var3 instanceof u5d0 ? (u5d0) y5d0Var3 : null;
                        List list3 = (u5d0Var3 == null || (x2qVar3 = u5d0Var3.f35088a) == null) ? null : x2qVar3.d;
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        lc00 lc00VarB = kotlin.collections.a.b();
                        for (l3q l3qVar2 : CollectionsKt.D0(list3, 6)) {
                            lc00VarB.add(new lxl(Long.parseLong(l3qVar2.getId()), (dyl) new byl(l3qVar2.getName(), new m0x(R.drawable.ic_glyph_cancel, null, 6), Integer.valueOf(R.drawable.ic_glyph_cancel), Boolean.TRUE, 4), false, uxl.b, (cwl) null, 104));
                        }
                        if (list3.size() > 6) {
                            lc00VarB.add(new lxl(-1L, (dyl) new xxl(wr0Var.b.b.a(R.string.plus_n, Arrays.copyOf(new Object[]{String.valueOf(list3.size() - 6)}, 1))), false, uxl.b, (cwl) null, 104));
                        }
                        return new fyl(dyb.r0(kotlin.collections.a.a(lc00VarB)), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                }
            }
        });
        this.l = maz.b(new nc(this, (byte) 13));
        final byte b5 = 3;
        this.m = bkb.G(c().d, new Function1(this) { // from class: a.vr0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0119  */
            /* JADX WARN: Code duplicated, block: B:44:0x012e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x2q x2qVar;
                dyl xxlVar;
                AggregatorSortingOptionModel aggregatorSortingOptionModel;
                d4d d4dVar;
                x2q x2qVar2;
                List list;
                pvi0 gvi0Var;
                fvi0 fvi0Var;
                d4d d4dVar2;
                x2q x2qVar3;
                byte b6 = b5;
                int i2 = 10;
                Iterable<j4b> iterable = null;
                wr0 wr0Var = this.b;
                switch (b6) {
                    case 0:
                        y5d0 y5d0Var = (y5d0) obj;
                        y5d0Var.getClass();
                        u5d0 u5d0Var = y5d0Var instanceof u5d0 ? (u5d0) y5d0Var : null;
                        if (u5d0Var != null && (x2qVar = u5d0Var.f35088a) != null) {
                            iterable = x2qVar.d;
                        }
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        List listD0 = CollectionsKt.D0(iterable, 6);
                        ArrayList<s5d0> arrayList = new ArrayList();
                        for (Object obj2 : listD0) {
                            if (obj2 instanceof s5d0) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (s5d0 s5d0Var : arrayList) {
                            arrayList2.add(new r5d0(new n0x(s5d0Var.c), s5d0Var.f31650a));
                        }
                        return new t5d0(dyb.r0(arrayList2), wr0Var.c().c() == ep0.LARGE_HEADER ? q5d0.b : q5d0.f28147a);
                    case 1:
                        v5q v5qVar = (v5q) obj;
                        v5qVar.getClass();
                        r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
                        iterable = r5qVar != null ? r5qVar.f29900a : null;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (j4b j4bVar : iterable) {
                            boolean z = wr0Var.c().c() != ep0.SMALL_HEADER && Intrinsics.d(j4bVar.f15876a.f40181a, "dopInfo2");
                            ep0 ep0Var = (ep0) wr0Var.c().c();
                            x2q x2qVar4 = j4bVar.f15876a;
                            hjm hjmVarA = wr0.a(ep0Var, x2qVar4.b);
                            List<l3q> list2 = x2qVar4.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list2, i2));
                            for (l3q l3qVar : list2) {
                                if (z) {
                                    String name = l3qVar.getName();
                                    String id = l3qVar.getId();
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str = String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg", Arrays.copyOf(new Object[]{id}, 1));
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
                                    n0x n0xVar = new n0x(sb.toString());
                                    zcl zclVar = qmk.f28987a;
                                    xxlVar = new ayl(name, n0xVar, 10.0f, Integer.valueOf(R.drawable.ic_glyph_category_new), Boolean.TRUE);
                                } else {
                                    xxlVar = new xxl(l3qVar.getName());
                                }
                                arrayList4.add(new lxl(Long.parseLong(l3qVar.getId()), xxlVar, false, j4bVar.b.contains(l3qVar.getId()) ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            }
                            arrayList3.add(new ro0(x2qVar4.f40181a, hjmVarA, new fyl(dyb.r0(arrayList4), tyl.b, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16)));
                            i2 = 10;
                        }
                        return arrayList3;
                    case 2:
                        ((uaq0) obj).getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(wr0Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 3:
                        ep0 ep0Var2 = (ep0) obj;
                        ep0Var2.getClass();
                        return wr0.a(ep0Var2, wr0Var.b.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        ep0 ep0Var3 = (ep0) obj;
                        ep0Var3.getClass();
                        return wr0.a(ep0Var3, wr0Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0)));
                    case 5:
                        rlk0 rlk0Var = (rlk0) obj;
                        rlk0Var.getClass();
                        nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
                        if (nlk0Var == null || (aggregatorSortingOptionModel = nlk0Var.b) == null) {
                            return null;
                        }
                        int iOrdinal = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal == 0) {
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        } else if (iOrdinal == 1) {
                            d4dVar = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        }
                        d4d d4dVar3 = d4dVar;
                        String str2 = aggregatorSortingOptionModel.f46274a;
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4dVar3, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    case 6:
                        pz40 pz40Var3 = s6t0.f31722a;
                        y5d0 y5d0Var2 = (y5d0) obj;
                        y5d0Var2.getClass();
                        u5d0 u5d0Var2 = y5d0Var2 instanceof u5d0 ? (u5d0) y5d0Var2 : null;
                        if (u5d0Var2 == null || (x2qVar2 = u5d0Var2.f35088a) == null || (list = x2qVar2.d) == null) {
                            return null;
                        }
                        int iOrdinal2 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                if (list.size() <= 6) {
                                    fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                                } else {
                                    gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                                }
                            } else {
                                fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            }
                            gvi0Var = fvi0Var;
                        } else if (list.size() <= 6) {
                            fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            gvi0Var = fvi0Var;
                        } else {
                            gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                        }
                        int iOrdinal3 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal3 == 0) {
                            int size = list.size();
                            d4dVar2 = (1 > size || size >= 7) ? d4d.BACKGROUND_CONTENT : d4d.BACKGROUND;
                        } else if (iOrdinal3 == 1) {
                            d4dVar2 = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar2 = !list.isEmpty() ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT;
                        }
                        return new rqm((vui0) new tui0(wr0Var.b.b.a(R.string.choose_providers, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, gvi0Var, d4dVar2, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    default:
                        y5d0 y5d0Var3 = (y5d0) obj;
                        y5d0Var3.getClass();
                        u5d0 u5d0Var3 = y5d0Var3 instanceof u5d0 ? (u5d0) y5d0Var3 : null;
                        List list3 = (u5d0Var3 == null || (x2qVar3 = u5d0Var3.f35088a) == null) ? null : x2qVar3.d;
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        lc00 lc00VarB = kotlin.collections.a.b();
                        for (l3q l3qVar2 : CollectionsKt.D0(list3, 6)) {
                            lc00VarB.add(new lxl(Long.parseLong(l3qVar2.getId()), (dyl) new byl(l3qVar2.getName(), new m0x(R.drawable.ic_glyph_cancel, null, 6), Integer.valueOf(R.drawable.ic_glyph_cancel), Boolean.TRUE, 4), false, uxl.b, (cwl) null, 104));
                        }
                        if (list3.size() > 6) {
                            lc00VarB.add(new lxl(-1L, (dyl) new xxl(wr0Var.b.b.a(R.string.plus_n, Arrays.copyOf(new Object[]{String.valueOf(list3.size() - 6)}, 1))), false, uxl.b, (cwl) null, 104));
                        }
                        return new fyl(dyb.r0(kotlin.collections.a.a(lc00VarB)), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                }
            }
        });
        final byte b6 = 4;
        this.n = bkb.G(c().d, new Function1(this) { // from class: a.vr0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0119  */
            /* JADX WARN: Code duplicated, block: B:44:0x012e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x2q x2qVar;
                dyl xxlVar;
                AggregatorSortingOptionModel aggregatorSortingOptionModel;
                d4d d4dVar;
                x2q x2qVar2;
                List list;
                pvi0 gvi0Var;
                fvi0 fvi0Var;
                d4d d4dVar2;
                x2q x2qVar3;
                byte b7 = b6;
                int i2 = 10;
                Iterable<j4b> iterable = null;
                wr0 wr0Var = this.b;
                switch (b7) {
                    case 0:
                        y5d0 y5d0Var = (y5d0) obj;
                        y5d0Var.getClass();
                        u5d0 u5d0Var = y5d0Var instanceof u5d0 ? (u5d0) y5d0Var : null;
                        if (u5d0Var != null && (x2qVar = u5d0Var.f35088a) != null) {
                            iterable = x2qVar.d;
                        }
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        List listD0 = CollectionsKt.D0(iterable, 6);
                        ArrayList<s5d0> arrayList = new ArrayList();
                        for (Object obj2 : listD0) {
                            if (obj2 instanceof s5d0) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (s5d0 s5d0Var : arrayList) {
                            arrayList2.add(new r5d0(new n0x(s5d0Var.c), s5d0Var.f31650a));
                        }
                        return new t5d0(dyb.r0(arrayList2), wr0Var.c().c() == ep0.LARGE_HEADER ? q5d0.b : q5d0.f28147a);
                    case 1:
                        v5q v5qVar = (v5q) obj;
                        v5qVar.getClass();
                        r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
                        iterable = r5qVar != null ? r5qVar.f29900a : null;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (j4b j4bVar : iterable) {
                            boolean z = wr0Var.c().c() != ep0.SMALL_HEADER && Intrinsics.d(j4bVar.f15876a.f40181a, "dopInfo2");
                            ep0 ep0Var = (ep0) wr0Var.c().c();
                            x2q x2qVar4 = j4bVar.f15876a;
                            hjm hjmVarA = wr0.a(ep0Var, x2qVar4.b);
                            List<l3q> list2 = x2qVar4.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list2, i2));
                            for (l3q l3qVar : list2) {
                                if (z) {
                                    String name = l3qVar.getName();
                                    String id = l3qVar.getId();
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str = String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg", Arrays.copyOf(new Object[]{id}, 1));
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
                                    n0x n0xVar = new n0x(sb.toString());
                                    zcl zclVar = qmk.f28987a;
                                    xxlVar = new ayl(name, n0xVar, 10.0f, Integer.valueOf(R.drawable.ic_glyph_category_new), Boolean.TRUE);
                                } else {
                                    xxlVar = new xxl(l3qVar.getName());
                                }
                                arrayList4.add(new lxl(Long.parseLong(l3qVar.getId()), xxlVar, false, j4bVar.b.contains(l3qVar.getId()) ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            }
                            arrayList3.add(new ro0(x2qVar4.f40181a, hjmVarA, new fyl(dyb.r0(arrayList4), tyl.b, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16)));
                            i2 = 10;
                        }
                        return arrayList3;
                    case 2:
                        ((uaq0) obj).getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(wr0Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 3:
                        ep0 ep0Var2 = (ep0) obj;
                        ep0Var2.getClass();
                        return wr0.a(ep0Var2, wr0Var.b.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        ep0 ep0Var3 = (ep0) obj;
                        ep0Var3.getClass();
                        return wr0.a(ep0Var3, wr0Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0)));
                    case 5:
                        rlk0 rlk0Var = (rlk0) obj;
                        rlk0Var.getClass();
                        nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
                        if (nlk0Var == null || (aggregatorSortingOptionModel = nlk0Var.b) == null) {
                            return null;
                        }
                        int iOrdinal = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal == 0) {
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        } else if (iOrdinal == 1) {
                            d4dVar = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        }
                        d4d d4dVar3 = d4dVar;
                        String str2 = aggregatorSortingOptionModel.f46274a;
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4dVar3, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    case 6:
                        pz40 pz40Var3 = s6t0.f31722a;
                        y5d0 y5d0Var2 = (y5d0) obj;
                        y5d0Var2.getClass();
                        u5d0 u5d0Var2 = y5d0Var2 instanceof u5d0 ? (u5d0) y5d0Var2 : null;
                        if (u5d0Var2 == null || (x2qVar2 = u5d0Var2.f35088a) == null || (list = x2qVar2.d) == null) {
                            return null;
                        }
                        int iOrdinal2 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                if (list.size() <= 6) {
                                    fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                                } else {
                                    gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                                }
                            } else {
                                fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            }
                            gvi0Var = fvi0Var;
                        } else if (list.size() <= 6) {
                            fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            gvi0Var = fvi0Var;
                        } else {
                            gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                        }
                        int iOrdinal3 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal3 == 0) {
                            int size = list.size();
                            d4dVar2 = (1 > size || size >= 7) ? d4d.BACKGROUND_CONTENT : d4d.BACKGROUND;
                        } else if (iOrdinal3 == 1) {
                            d4dVar2 = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar2 = !list.isEmpty() ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT;
                        }
                        return new rqm((vui0) new tui0(wr0Var.b.b.a(R.string.choose_providers, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, gvi0Var, d4dVar2, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    default:
                        y5d0 y5d0Var3 = (y5d0) obj;
                        y5d0Var3.getClass();
                        u5d0 u5d0Var3 = y5d0Var3 instanceof u5d0 ? (u5d0) y5d0Var3 : null;
                        List list3 = (u5d0Var3 == null || (x2qVar3 = u5d0Var3.f35088a) == null) ? null : x2qVar3.d;
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        lc00 lc00VarB = kotlin.collections.a.b();
                        for (l3q l3qVar2 : CollectionsKt.D0(list3, 6)) {
                            lc00VarB.add(new lxl(Long.parseLong(l3qVar2.getId()), (dyl) new byl(l3qVar2.getName(), new m0x(R.drawable.ic_glyph_cancel, null, 6), Integer.valueOf(R.drawable.ic_glyph_cancel), Boolean.TRUE, 4), false, uxl.b, (cwl) null, 104));
                        }
                        if (list3.size() > 6) {
                            lc00VarB.add(new lxl(-1L, (dyl) new xxl(wr0Var.b.b.a(R.string.plus_n, Arrays.copyOf(new Object[]{String.valueOf(list3.size() - 6)}, 1))), false, uxl.b, (cwl) null, 104));
                        }
                        return new fyl(dyb.r0(kotlin.collections.a.a(lc00VarB)), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                }
            }
        });
        pz40 pz40Var = ((fee) n0o0VarH2.getValue()).d;
        final byte b7 = 5;
        this.o = bkb.G(pz40Var, new Function1(this) { // from class: a.vr0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0119  */
            /* JADX WARN: Code duplicated, block: B:44:0x012e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x2q x2qVar;
                dyl xxlVar;
                AggregatorSortingOptionModel aggregatorSortingOptionModel;
                d4d d4dVar;
                x2q x2qVar2;
                List list;
                pvi0 gvi0Var;
                fvi0 fvi0Var;
                d4d d4dVar2;
                x2q x2qVar3;
                byte b8 = b7;
                int i2 = 10;
                Iterable<j4b> iterable = null;
                wr0 wr0Var = this.b;
                switch (b8) {
                    case 0:
                        y5d0 y5d0Var = (y5d0) obj;
                        y5d0Var.getClass();
                        u5d0 u5d0Var = y5d0Var instanceof u5d0 ? (u5d0) y5d0Var : null;
                        if (u5d0Var != null && (x2qVar = u5d0Var.f35088a) != null) {
                            iterable = x2qVar.d;
                        }
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        List listD0 = CollectionsKt.D0(iterable, 6);
                        ArrayList<s5d0> arrayList = new ArrayList();
                        for (Object obj2 : listD0) {
                            if (obj2 instanceof s5d0) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (s5d0 s5d0Var : arrayList) {
                            arrayList2.add(new r5d0(new n0x(s5d0Var.c), s5d0Var.f31650a));
                        }
                        return new t5d0(dyb.r0(arrayList2), wr0Var.c().c() == ep0.LARGE_HEADER ? q5d0.b : q5d0.f28147a);
                    case 1:
                        v5q v5qVar = (v5q) obj;
                        v5qVar.getClass();
                        r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
                        iterable = r5qVar != null ? r5qVar.f29900a : null;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (j4b j4bVar : iterable) {
                            boolean z = wr0Var.c().c() != ep0.SMALL_HEADER && Intrinsics.d(j4bVar.f15876a.f40181a, "dopInfo2");
                            ep0 ep0Var = (ep0) wr0Var.c().c();
                            x2q x2qVar4 = j4bVar.f15876a;
                            hjm hjmVarA = wr0.a(ep0Var, x2qVar4.b);
                            List<l3q> list2 = x2qVar4.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list2, i2));
                            for (l3q l3qVar : list2) {
                                if (z) {
                                    String name = l3qVar.getName();
                                    String id = l3qVar.getId();
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str = String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg", Arrays.copyOf(new Object[]{id}, 1));
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
                                    n0x n0xVar = new n0x(sb.toString());
                                    zcl zclVar = qmk.f28987a;
                                    xxlVar = new ayl(name, n0xVar, 10.0f, Integer.valueOf(R.drawable.ic_glyph_category_new), Boolean.TRUE);
                                } else {
                                    xxlVar = new xxl(l3qVar.getName());
                                }
                                arrayList4.add(new lxl(Long.parseLong(l3qVar.getId()), xxlVar, false, j4bVar.b.contains(l3qVar.getId()) ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            }
                            arrayList3.add(new ro0(x2qVar4.f40181a, hjmVarA, new fyl(dyb.r0(arrayList4), tyl.b, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16)));
                            i2 = 10;
                        }
                        return arrayList3;
                    case 2:
                        ((uaq0) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(wr0Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 3:
                        ep0 ep0Var2 = (ep0) obj;
                        ep0Var2.getClass();
                        return wr0.a(ep0Var2, wr0Var.b.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        ep0 ep0Var3 = (ep0) obj;
                        ep0Var3.getClass();
                        return wr0.a(ep0Var3, wr0Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0)));
                    case 5:
                        rlk0 rlk0Var = (rlk0) obj;
                        rlk0Var.getClass();
                        nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
                        if (nlk0Var == null || (aggregatorSortingOptionModel = nlk0Var.b) == null) {
                            return null;
                        }
                        int iOrdinal = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal == 0) {
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        } else if (iOrdinal == 1) {
                            d4dVar = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        }
                        d4d d4dVar3 = d4dVar;
                        String str2 = aggregatorSortingOptionModel.f46274a;
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4dVar3, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    case 6:
                        pz40 pz40Var4 = s6t0.f31722a;
                        y5d0 y5d0Var2 = (y5d0) obj;
                        y5d0Var2.getClass();
                        u5d0 u5d0Var2 = y5d0Var2 instanceof u5d0 ? (u5d0) y5d0Var2 : null;
                        if (u5d0Var2 == null || (x2qVar2 = u5d0Var2.f35088a) == null || (list = x2qVar2.d) == null) {
                            return null;
                        }
                        int iOrdinal2 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                if (list.size() <= 6) {
                                    fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                                } else {
                                    gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                                }
                            } else {
                                fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            }
                            gvi0Var = fvi0Var;
                        } else if (list.size() <= 6) {
                            fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            gvi0Var = fvi0Var;
                        } else {
                            gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                        }
                        int iOrdinal3 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal3 == 0) {
                            int size = list.size();
                            d4dVar2 = (1 > size || size >= 7) ? d4d.BACKGROUND_CONTENT : d4d.BACKGROUND;
                        } else if (iOrdinal3 == 1) {
                            d4dVar2 = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar2 = !list.isEmpty() ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT;
                        }
                        return new rqm((vui0) new tui0(wr0Var.b.b.a(R.string.choose_providers, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, gvi0Var, d4dVar2, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    default:
                        y5d0 y5d0Var3 = (y5d0) obj;
                        y5d0Var3.getClass();
                        u5d0 u5d0Var3 = y5d0Var3 instanceof u5d0 ? (u5d0) y5d0Var3 : null;
                        List list3 = (u5d0Var3 == null || (x2qVar3 = u5d0Var3.f35088a) == null) ? null : x2qVar3.d;
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        lc00 lc00VarB = kotlin.collections.a.b();
                        for (l3q l3qVar2 : CollectionsKt.D0(list3, 6)) {
                            lc00VarB.add(new lxl(Long.parseLong(l3qVar2.getId()), (dyl) new byl(l3qVar2.getName(), new m0x(R.drawable.ic_glyph_cancel, null, 6), Integer.valueOf(R.drawable.ic_glyph_cancel), Boolean.TRUE, 4), false, uxl.b, (cwl) null, 104));
                        }
                        if (list3.size() > 6) {
                            lc00VarB.add(new lxl(-1L, (dyl) new xxl(wr0Var.b.b.a(R.string.plus_n, Arrays.copyOf(new Object[]{String.valueOf(list3.size() - 6)}, 1))), false, uxl.b, (cwl) null, 104));
                        }
                        return new fyl(dyb.r0(kotlin.collections.a.a(lc00VarB)), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                }
            }
        });
        this.p = bkb.G(b().d, new Function1(this) { // from class: a.vr0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0119  */
            /* JADX WARN: Code duplicated, block: B:44:0x012e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x2q x2qVar;
                dyl xxlVar;
                AggregatorSortingOptionModel aggregatorSortingOptionModel;
                d4d d4dVar;
                x2q x2qVar2;
                List list;
                pvi0 gvi0Var;
                fvi0 fvi0Var;
                d4d d4dVar2;
                x2q x2qVar3;
                byte b8 = b2;
                int i2 = 10;
                Iterable<j4b> iterable = null;
                wr0 wr0Var = this.b;
                switch (b8) {
                    case 0:
                        y5d0 y5d0Var = (y5d0) obj;
                        y5d0Var.getClass();
                        u5d0 u5d0Var = y5d0Var instanceof u5d0 ? (u5d0) y5d0Var : null;
                        if (u5d0Var != null && (x2qVar = u5d0Var.f35088a) != null) {
                            iterable = x2qVar.d;
                        }
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        List listD0 = CollectionsKt.D0(iterable, 6);
                        ArrayList<s5d0> arrayList = new ArrayList();
                        for (Object obj2 : listD0) {
                            if (obj2 instanceof s5d0) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (s5d0 s5d0Var : arrayList) {
                            arrayList2.add(new r5d0(new n0x(s5d0Var.c), s5d0Var.f31650a));
                        }
                        return new t5d0(dyb.r0(arrayList2), wr0Var.c().c() == ep0.LARGE_HEADER ? q5d0.b : q5d0.f28147a);
                    case 1:
                        v5q v5qVar = (v5q) obj;
                        v5qVar.getClass();
                        r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
                        iterable = r5qVar != null ? r5qVar.f29900a : null;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (j4b j4bVar : iterable) {
                            boolean z = wr0Var.c().c() != ep0.SMALL_HEADER && Intrinsics.d(j4bVar.f15876a.f40181a, "dopInfo2");
                            ep0 ep0Var = (ep0) wr0Var.c().c();
                            x2q x2qVar4 = j4bVar.f15876a;
                            hjm hjmVarA = wr0.a(ep0Var, x2qVar4.b);
                            List<l3q> list2 = x2qVar4.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list2, i2));
                            for (l3q l3qVar : list2) {
                                if (z) {
                                    String name = l3qVar.getName();
                                    String id = l3qVar.getId();
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str = String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg", Arrays.copyOf(new Object[]{id}, 1));
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
                                    n0x n0xVar = new n0x(sb.toString());
                                    zcl zclVar = qmk.f28987a;
                                    xxlVar = new ayl(name, n0xVar, 10.0f, Integer.valueOf(R.drawable.ic_glyph_category_new), Boolean.TRUE);
                                } else {
                                    xxlVar = new xxl(l3qVar.getName());
                                }
                                arrayList4.add(new lxl(Long.parseLong(l3qVar.getId()), xxlVar, false, j4bVar.b.contains(l3qVar.getId()) ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            }
                            arrayList3.add(new ro0(x2qVar4.f40181a, hjmVarA, new fyl(dyb.r0(arrayList4), tyl.b, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16)));
                            i2 = 10;
                        }
                        return arrayList3;
                    case 2:
                        ((uaq0) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(wr0Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 3:
                        ep0 ep0Var2 = (ep0) obj;
                        ep0Var2.getClass();
                        return wr0.a(ep0Var2, wr0Var.b.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        ep0 ep0Var3 = (ep0) obj;
                        ep0Var3.getClass();
                        return wr0.a(ep0Var3, wr0Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0)));
                    case 5:
                        rlk0 rlk0Var = (rlk0) obj;
                        rlk0Var.getClass();
                        nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
                        if (nlk0Var == null || (aggregatorSortingOptionModel = nlk0Var.b) == null) {
                            return null;
                        }
                        int iOrdinal = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal == 0) {
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        } else if (iOrdinal == 1) {
                            d4dVar = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        }
                        d4d d4dVar3 = d4dVar;
                        String str2 = aggregatorSortingOptionModel.f46274a;
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4dVar3, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    case 6:
                        pz40 pz40Var4 = s6t0.f31722a;
                        y5d0 y5d0Var2 = (y5d0) obj;
                        y5d0Var2.getClass();
                        u5d0 u5d0Var2 = y5d0Var2 instanceof u5d0 ? (u5d0) y5d0Var2 : null;
                        if (u5d0Var2 == null || (x2qVar2 = u5d0Var2.f35088a) == null || (list = x2qVar2.d) == null) {
                            return null;
                        }
                        int iOrdinal2 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                if (list.size() <= 6) {
                                    fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                                } else {
                                    gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                                }
                            } else {
                                fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            }
                            gvi0Var = fvi0Var;
                        } else if (list.size() <= 6) {
                            fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            gvi0Var = fvi0Var;
                        } else {
                            gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                        }
                        int iOrdinal3 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal3 == 0) {
                            int size = list.size();
                            d4dVar2 = (1 > size || size >= 7) ? d4d.BACKGROUND_CONTENT : d4d.BACKGROUND;
                        } else if (iOrdinal3 == 1) {
                            d4dVar2 = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar2 = !list.isEmpty() ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT;
                        }
                        return new rqm((vui0) new tui0(wr0Var.b.b.a(R.string.choose_providers, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, gvi0Var, d4dVar2, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    default:
                        y5d0 y5d0Var3 = (y5d0) obj;
                        y5d0Var3.getClass();
                        u5d0 u5d0Var3 = y5d0Var3 instanceof u5d0 ? (u5d0) y5d0Var3 : null;
                        List list3 = (u5d0Var3 == null || (x2qVar3 = u5d0Var3.f35088a) == null) ? null : x2qVar3.d;
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        lc00 lc00VarB = kotlin.collections.a.b();
                        for (l3q l3qVar2 : CollectionsKt.D0(list3, 6)) {
                            lc00VarB.add(new lxl(Long.parseLong(l3qVar2.getId()), (dyl) new byl(l3qVar2.getName(), new m0x(R.drawable.ic_glyph_cancel, null, 6), Integer.valueOf(R.drawable.ic_glyph_cancel), Boolean.TRUE, 4), false, uxl.b, (cwl) null, 104));
                        }
                        if (list3.size() > 6) {
                            lc00VarB.add(new lxl(-1L, (dyl) new xxl(wr0Var.b.b.a(R.string.plus_n, Arrays.copyOf(new Object[]{String.valueOf(list3.size() - 6)}, 1))), false, uxl.b, (cwl) null, 104));
                        }
                        return new fyl(dyb.r0(kotlin.collections.a.a(lc00VarB)), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                }
            }
        });
        this.q = bkb.G(b().d, new Function1(this) { // from class: a.vr0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0119  */
            /* JADX WARN: Code duplicated, block: B:44:0x012e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x2q x2qVar;
                dyl xxlVar;
                AggregatorSortingOptionModel aggregatorSortingOptionModel;
                d4d d4dVar;
                x2q x2qVar2;
                List list;
                pvi0 gvi0Var;
                fvi0 fvi0Var;
                d4d d4dVar2;
                x2q x2qVar3;
                byte b8 = b3;
                int i2 = 10;
                Iterable<j4b> iterable = null;
                wr0 wr0Var = this.b;
                switch (b8) {
                    case 0:
                        y5d0 y5d0Var = (y5d0) obj;
                        y5d0Var.getClass();
                        u5d0 u5d0Var = y5d0Var instanceof u5d0 ? (u5d0) y5d0Var : null;
                        if (u5d0Var != null && (x2qVar = u5d0Var.f35088a) != null) {
                            iterable = x2qVar.d;
                        }
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        List listD0 = CollectionsKt.D0(iterable, 6);
                        ArrayList<s5d0> arrayList = new ArrayList();
                        for (Object obj2 : listD0) {
                            if (obj2 instanceof s5d0) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (s5d0 s5d0Var : arrayList) {
                            arrayList2.add(new r5d0(new n0x(s5d0Var.c), s5d0Var.f31650a));
                        }
                        return new t5d0(dyb.r0(arrayList2), wr0Var.c().c() == ep0.LARGE_HEADER ? q5d0.b : q5d0.f28147a);
                    case 1:
                        v5q v5qVar = (v5q) obj;
                        v5qVar.getClass();
                        r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
                        iterable = r5qVar != null ? r5qVar.f29900a : null;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (j4b j4bVar : iterable) {
                            boolean z = wr0Var.c().c() != ep0.SMALL_HEADER && Intrinsics.d(j4bVar.f15876a.f40181a, "dopInfo2");
                            ep0 ep0Var = (ep0) wr0Var.c().c();
                            x2q x2qVar4 = j4bVar.f15876a;
                            hjm hjmVarA = wr0.a(ep0Var, x2qVar4.b);
                            List<l3q> list2 = x2qVar4.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list2, i2));
                            for (l3q l3qVar : list2) {
                                if (z) {
                                    String name = l3qVar.getName();
                                    String id = l3qVar.getId();
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str = String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg", Arrays.copyOf(new Object[]{id}, 1));
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
                                    n0x n0xVar = new n0x(sb.toString());
                                    zcl zclVar = qmk.f28987a;
                                    xxlVar = new ayl(name, n0xVar, 10.0f, Integer.valueOf(R.drawable.ic_glyph_category_new), Boolean.TRUE);
                                } else {
                                    xxlVar = new xxl(l3qVar.getName());
                                }
                                arrayList4.add(new lxl(Long.parseLong(l3qVar.getId()), xxlVar, false, j4bVar.b.contains(l3qVar.getId()) ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            }
                            arrayList3.add(new ro0(x2qVar4.f40181a, hjmVarA, new fyl(dyb.r0(arrayList4), tyl.b, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16)));
                            i2 = 10;
                        }
                        return arrayList3;
                    case 2:
                        ((uaq0) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(wr0Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 3:
                        ep0 ep0Var2 = (ep0) obj;
                        ep0Var2.getClass();
                        return wr0.a(ep0Var2, wr0Var.b.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        ep0 ep0Var3 = (ep0) obj;
                        ep0Var3.getClass();
                        return wr0.a(ep0Var3, wr0Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0)));
                    case 5:
                        rlk0 rlk0Var = (rlk0) obj;
                        rlk0Var.getClass();
                        nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
                        if (nlk0Var == null || (aggregatorSortingOptionModel = nlk0Var.b) == null) {
                            return null;
                        }
                        int iOrdinal = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal == 0) {
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        } else if (iOrdinal == 1) {
                            d4dVar = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        }
                        d4d d4dVar3 = d4dVar;
                        String str2 = aggregatorSortingOptionModel.f46274a;
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4dVar3, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    case 6:
                        pz40 pz40Var4 = s6t0.f31722a;
                        y5d0 y5d0Var2 = (y5d0) obj;
                        y5d0Var2.getClass();
                        u5d0 u5d0Var2 = y5d0Var2 instanceof u5d0 ? (u5d0) y5d0Var2 : null;
                        if (u5d0Var2 == null || (x2qVar2 = u5d0Var2.f35088a) == null || (list = x2qVar2.d) == null) {
                            return null;
                        }
                        int iOrdinal2 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                if (list.size() <= 6) {
                                    fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                                } else {
                                    gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                                }
                            } else {
                                fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            }
                            gvi0Var = fvi0Var;
                        } else if (list.size() <= 6) {
                            fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            gvi0Var = fvi0Var;
                        } else {
                            gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                        }
                        int iOrdinal3 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal3 == 0) {
                            int size = list.size();
                            d4dVar2 = (1 > size || size >= 7) ? d4d.BACKGROUND_CONTENT : d4d.BACKGROUND;
                        } else if (iOrdinal3 == 1) {
                            d4dVar2 = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar2 = !list.isEmpty() ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT;
                        }
                        return new rqm((vui0) new tui0(wr0Var.b.b.a(R.string.choose_providers, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, gvi0Var, d4dVar2, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    default:
                        y5d0 y5d0Var3 = (y5d0) obj;
                        y5d0Var3.getClass();
                        u5d0 u5d0Var3 = y5d0Var3 instanceof u5d0 ? (u5d0) y5d0Var3 : null;
                        List list3 = (u5d0Var3 == null || (x2qVar3 = u5d0Var3.f35088a) == null) ? null : x2qVar3.d;
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        lc00 lc00VarB = kotlin.collections.a.b();
                        for (l3q l3qVar2 : CollectionsKt.D0(list3, 6)) {
                            lc00VarB.add(new lxl(Long.parseLong(l3qVar2.getId()), (dyl) new byl(l3qVar2.getName(), new m0x(R.drawable.ic_glyph_cancel, null, 6), Integer.valueOf(R.drawable.ic_glyph_cancel), Boolean.TRUE, 4), false, uxl.b, (cwl) null, 104));
                        }
                        if (list3.size() > 6) {
                            lc00VarB.add(new lxl(-1L, (dyl) new xxl(wr0Var.b.b.a(R.string.plus_n, Arrays.copyOf(new Object[]{String.valueOf(list3.size() - 6)}, 1))), false, uxl.b, (cwl) null, 104));
                        }
                        return new fyl(dyb.r0(kotlin.collections.a.a(lc00VarB)), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                }
            }
        });
        this.r = bkb.G(b().d, new Function1(this) { // from class: a.vr0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0119  */
            /* JADX WARN: Code duplicated, block: B:44:0x012e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x2q x2qVar;
                dyl xxlVar;
                AggregatorSortingOptionModel aggregatorSortingOptionModel;
                d4d d4dVar;
                x2q x2qVar2;
                List list;
                pvi0 gvi0Var;
                fvi0 fvi0Var;
                d4d d4dVar2;
                x2q x2qVar3;
                byte b8 = b;
                int i2 = 10;
                Iterable<j4b> iterable = null;
                wr0 wr0Var = this.b;
                switch (b8) {
                    case 0:
                        y5d0 y5d0Var = (y5d0) obj;
                        y5d0Var.getClass();
                        u5d0 u5d0Var = y5d0Var instanceof u5d0 ? (u5d0) y5d0Var : null;
                        if (u5d0Var != null && (x2qVar = u5d0Var.f35088a) != null) {
                            iterable = x2qVar.d;
                        }
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        List listD0 = CollectionsKt.D0(iterable, 6);
                        ArrayList<s5d0> arrayList = new ArrayList();
                        for (Object obj2 : listD0) {
                            if (obj2 instanceof s5d0) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (s5d0 s5d0Var : arrayList) {
                            arrayList2.add(new r5d0(new n0x(s5d0Var.c), s5d0Var.f31650a));
                        }
                        return new t5d0(dyb.r0(arrayList2), wr0Var.c().c() == ep0.LARGE_HEADER ? q5d0.b : q5d0.f28147a);
                    case 1:
                        v5q v5qVar = (v5q) obj;
                        v5qVar.getClass();
                        r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
                        iterable = r5qVar != null ? r5qVar.f29900a : null;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (j4b j4bVar : iterable) {
                            boolean z = wr0Var.c().c() != ep0.SMALL_HEADER && Intrinsics.d(j4bVar.f15876a.f40181a, "dopInfo2");
                            ep0 ep0Var = (ep0) wr0Var.c().c();
                            x2q x2qVar4 = j4bVar.f15876a;
                            hjm hjmVarA = wr0.a(ep0Var, x2qVar4.b);
                            List<l3q> list2 = x2qVar4.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list2, i2));
                            for (l3q l3qVar : list2) {
                                if (z) {
                                    String name = l3qVar.getName();
                                    String id = l3qVar.getId();
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str = String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg", Arrays.copyOf(new Object[]{id}, 1));
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
                                    n0x n0xVar = new n0x(sb.toString());
                                    zcl zclVar = qmk.f28987a;
                                    xxlVar = new ayl(name, n0xVar, 10.0f, Integer.valueOf(R.drawable.ic_glyph_category_new), Boolean.TRUE);
                                } else {
                                    xxlVar = new xxl(l3qVar.getName());
                                }
                                arrayList4.add(new lxl(Long.parseLong(l3qVar.getId()), xxlVar, false, j4bVar.b.contains(l3qVar.getId()) ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            }
                            arrayList3.add(new ro0(x2qVar4.f40181a, hjmVarA, new fyl(dyb.r0(arrayList4), tyl.b, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16)));
                            i2 = 10;
                        }
                        return arrayList3;
                    case 2:
                        ((uaq0) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(wr0Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 3:
                        ep0 ep0Var2 = (ep0) obj;
                        ep0Var2.getClass();
                        return wr0.a(ep0Var2, wr0Var.b.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        ep0 ep0Var3 = (ep0) obj;
                        ep0Var3.getClass();
                        return wr0.a(ep0Var3, wr0Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0)));
                    case 5:
                        rlk0 rlk0Var = (rlk0) obj;
                        rlk0Var.getClass();
                        nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
                        if (nlk0Var == null || (aggregatorSortingOptionModel = nlk0Var.b) == null) {
                            return null;
                        }
                        int iOrdinal = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal == 0) {
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        } else if (iOrdinal == 1) {
                            d4dVar = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        }
                        d4d d4dVar3 = d4dVar;
                        String str2 = aggregatorSortingOptionModel.f46274a;
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4dVar3, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    case 6:
                        pz40 pz40Var4 = s6t0.f31722a;
                        y5d0 y5d0Var2 = (y5d0) obj;
                        y5d0Var2.getClass();
                        u5d0 u5d0Var2 = y5d0Var2 instanceof u5d0 ? (u5d0) y5d0Var2 : null;
                        if (u5d0Var2 == null || (x2qVar2 = u5d0Var2.f35088a) == null || (list = x2qVar2.d) == null) {
                            return null;
                        }
                        int iOrdinal2 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                if (list.size() <= 6) {
                                    fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                                } else {
                                    gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                                }
                            } else {
                                fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            }
                            gvi0Var = fvi0Var;
                        } else if (list.size() <= 6) {
                            fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            gvi0Var = fvi0Var;
                        } else {
                            gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                        }
                        int iOrdinal3 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal3 == 0) {
                            int size = list.size();
                            d4dVar2 = (1 > size || size >= 7) ? d4d.BACKGROUND_CONTENT : d4d.BACKGROUND;
                        } else if (iOrdinal3 == 1) {
                            d4dVar2 = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar2 = !list.isEmpty() ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT;
                        }
                        return new rqm((vui0) new tui0(wr0Var.b.b.a(R.string.choose_providers, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, gvi0Var, d4dVar2, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    default:
                        y5d0 y5d0Var3 = (y5d0) obj;
                        y5d0Var3.getClass();
                        u5d0 u5d0Var3 = y5d0Var3 instanceof u5d0 ? (u5d0) y5d0Var3 : null;
                        List list3 = (u5d0Var3 == null || (x2qVar3 = u5d0Var3.f35088a) == null) ? null : x2qVar3.d;
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        lc00 lc00VarB = kotlin.collections.a.b();
                        for (l3q l3qVar2 : CollectionsKt.D0(list3, 6)) {
                            lc00VarB.add(new lxl(Long.parseLong(l3qVar2.getId()), (dyl) new byl(l3qVar2.getName(), new m0x(R.drawable.ic_glyph_cancel, null, 6), Integer.valueOf(R.drawable.ic_glyph_cancel), Boolean.TRUE, 4), false, uxl.b, (cwl) null, 104));
                        }
                        if (list3.size() > 6) {
                            lc00VarB.add(new lxl(-1L, (dyl) new xxl(wr0Var.b.b.a(R.string.plus_n, Arrays.copyOf(new Object[]{String.valueOf(list3.size() - 6)}, 1))), false, uxl.b, (cwl) null, 104));
                        }
                        return new fyl(dyb.r0(kotlin.collections.a.a(lc00VarB)), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                }
            }
        });
        final byte b8 = 1;
        this.s = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.vr0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0119  */
            /* JADX WARN: Code duplicated, block: B:44:0x012e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x2q x2qVar;
                dyl xxlVar;
                AggregatorSortingOptionModel aggregatorSortingOptionModel;
                d4d d4dVar;
                x2q x2qVar2;
                List list;
                pvi0 gvi0Var;
                fvi0 fvi0Var;
                d4d d4dVar2;
                x2q x2qVar3;
                byte b9 = b8;
                int i2 = 10;
                Iterable<j4b> iterable = null;
                wr0 wr0Var = this.b;
                switch (b9) {
                    case 0:
                        y5d0 y5d0Var = (y5d0) obj;
                        y5d0Var.getClass();
                        u5d0 u5d0Var = y5d0Var instanceof u5d0 ? (u5d0) y5d0Var : null;
                        if (u5d0Var != null && (x2qVar = u5d0Var.f35088a) != null) {
                            iterable = x2qVar.d;
                        }
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        List listD0 = CollectionsKt.D0(iterable, 6);
                        ArrayList<s5d0> arrayList = new ArrayList();
                        for (Object obj2 : listD0) {
                            if (obj2 instanceof s5d0) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (s5d0 s5d0Var : arrayList) {
                            arrayList2.add(new r5d0(new n0x(s5d0Var.c), s5d0Var.f31650a));
                        }
                        return new t5d0(dyb.r0(arrayList2), wr0Var.c().c() == ep0.LARGE_HEADER ? q5d0.b : q5d0.f28147a);
                    case 1:
                        v5q v5qVar = (v5q) obj;
                        v5qVar.getClass();
                        r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
                        iterable = r5qVar != null ? r5qVar.f29900a : null;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (j4b j4bVar : iterable) {
                            boolean z = wr0Var.c().c() != ep0.SMALL_HEADER && Intrinsics.d(j4bVar.f15876a.f40181a, "dopInfo2");
                            ep0 ep0Var = (ep0) wr0Var.c().c();
                            x2q x2qVar4 = j4bVar.f15876a;
                            hjm hjmVarA = wr0.a(ep0Var, x2qVar4.b);
                            List<l3q> list2 = x2qVar4.d;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list2, i2));
                            for (l3q l3qVar : list2) {
                                if (z) {
                                    String name = l3qVar.getName();
                                    String id = l3qVar.getId();
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str = String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg", Arrays.copyOf(new Object[]{id}, 1));
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
                                    n0x n0xVar = new n0x(sb.toString());
                                    zcl zclVar = qmk.f28987a;
                                    xxlVar = new ayl(name, n0xVar, 10.0f, Integer.valueOf(R.drawable.ic_glyph_category_new), Boolean.TRUE);
                                } else {
                                    xxlVar = new xxl(l3qVar.getName());
                                }
                                arrayList4.add(new lxl(Long.parseLong(l3qVar.getId()), xxlVar, false, j4bVar.b.contains(l3qVar.getId()) ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            }
                            arrayList3.add(new ro0(x2qVar4.f40181a, hjmVarA, new fyl(dyb.r0(arrayList4), tyl.b, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16)));
                            i2 = 10;
                        }
                        return arrayList3;
                    case 2:
                        ((uaq0) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(wr0Var.b.b.a(R.string.filter, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 3:
                        ep0 ep0Var2 = (ep0) obj;
                        ep0Var2.getClass();
                        return wr0.a(ep0Var2, wr0Var.b.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        ep0 ep0Var3 = (ep0) obj;
                        ep0Var3.getClass();
                        return wr0.a(ep0Var3, wr0Var.b.b.a(R.string.sort_by, Arrays.copyOf(new Object[0], 0)));
                    case 5:
                        rlk0 rlk0Var = (rlk0) obj;
                        rlk0Var.getClass();
                        nlk0 nlk0Var = rlk0Var instanceof nlk0 ? (nlk0) rlk0Var : null;
                        if (nlk0Var == null || (aggregatorSortingOptionModel = nlk0Var.b) == null) {
                            return null;
                        }
                        int iOrdinal = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal == 0) {
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        } else if (iOrdinal == 1) {
                            d4dVar = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar = d4d.BACKGROUND_CONTENT;
                        }
                        d4d d4dVar3 = d4dVar;
                        String str2 = aggregatorSortingOptionModel.f46274a;
                        pz40 pz40Var3 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4dVar3, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    case 6:
                        pz40 pz40Var4 = s6t0.f31722a;
                        y5d0 y5d0Var2 = (y5d0) obj;
                        y5d0Var2.getClass();
                        u5d0 u5d0Var2 = y5d0Var2 instanceof u5d0 ? (u5d0) y5d0Var2 : null;
                        if (u5d0Var2 == null || (x2qVar2 = u5d0Var2.f35088a) == null || (list = x2qVar2.d) == null) {
                            return null;
                        }
                        int iOrdinal2 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                if (list.size() <= 6) {
                                    fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                                } else {
                                    gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                                }
                            } else {
                                fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            }
                            gvi0Var = fvi0Var;
                        } else if (list.size() <= 6) {
                            fvi0Var = new fvi0(new y3d(s6t0.b().f33626a.getSecondary()));
                            gvi0Var = fvi0Var;
                        } else {
                            gvi0Var = new gvi0(new kpe(), list.size(), new y3d(s6t0.b().f33626a.getSecondary()));
                        }
                        int iOrdinal3 = ((ep0) wr0Var.c().c()).ordinal();
                        if (iOrdinal3 == 0) {
                            int size = list.size();
                            d4dVar2 = (1 > size || size >= 7) ? d4d.BACKGROUND_CONTENT : d4d.BACKGROUND;
                        } else if (iOrdinal3 == 1) {
                            d4dVar2 = d4d.BACKGROUND;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            d4dVar2 = !list.isEmpty() ? d4d.BACKGROUND : d4d.BACKGROUND_CONTENT;
                        }
                        return new rqm((vui0) new tui0(wr0Var.b.b.a(R.string.choose_providers, Arrays.copyOf(new Object[0], 0)), new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, gvi0Var, d4dVar2, (tvi0) null, (wui0) null, false, (e900) null, 490);
                    default:
                        y5d0 y5d0Var3 = (y5d0) obj;
                        y5d0Var3.getClass();
                        u5d0 u5d0Var3 = y5d0Var3 instanceof u5d0 ? (u5d0) y5d0Var3 : null;
                        List list3 = (u5d0Var3 == null || (x2qVar3 = u5d0Var3.f35088a) == null) ? null : x2qVar3.d;
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        lc00 lc00VarB = kotlin.collections.a.b();
                        for (l3q l3qVar2 : CollectionsKt.D0(list3, 6)) {
                            lc00VarB.add(new lxl(Long.parseLong(l3qVar2.getId()), (dyl) new byl(l3qVar2.getName(), new m0x(R.drawable.ic_glyph_cancel, null, 6), Integer.valueOf(R.drawable.ic_glyph_cancel), Boolean.TRUE, 4), false, uxl.b, (cwl) null, 104));
                        }
                        if (list3.size() > 6) {
                            lc00VarB.add(new lxl(-1L, (dyl) new xxl(wr0Var.b.b.a(R.string.plus_n, Arrays.copyOf(new Object[]{String.valueOf(list3.size() - 6)}, 1))), false, uxl.b, (cwl) null, 104));
                        }
                        return new fyl(dyb.r0(kotlin.collections.a.a(lc00VarB)), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
                }
            }
        });
    }

    public static hjm a(ep0 ep0Var, String str) {
        if (ep0Var == ep0.LARGE_HEADER) {
            mjm mjmVar = new mjm(127);
            pz40 pz40Var = s6t0.f31722a;
            return new hjm(str, mjmVar, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8184);
        }
        ojm ojmVar = new ojm(127);
        pz40 pz40Var2 = s6t0.f31722a;
        return new hjm(str, ojmVar, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8184);
    }

    public fee b() {
        return (fee) this.h.getValue();
    }

    public fee c() {
        return (fee) this.c.getValue();
    }

    public fee d() {
        return (fee) this.e.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        i4 i4VarR0;
        gq0 eq0Var;
        i4 i4VarR1;
        boolean z;
        uhc0 uhc0Var;
        List list;
        byte b = this.f39615a;
        n0o0 n0o0Var = this.s;
        n0o0 n0o0Var2 = this.r;
        n0o0 n0o0Var3 = this.q;
        n0o0 n0o0Var4 = this.p;
        n0o0 n0o0Var5 = this.o;
        n0o0 n0o0Var6 = this.m;
        n0o0 n0o0Var7 = this.l;
        n0o0 n0o0Var8 = this.n;
        n0o0 n0o0Var9 = this.k;
        n0o0 n0o0Var10 = this.j;
        n0o0 n0o0Var11 = this.i;
        n0o0 n0o0Var12 = this.g;
        n0o0 n0o0Var13 = this.f;
        n0o0 n0o0Var14 = this.d;
        switch (b) {
            case 0:
                ur0 ur0Var = (ur0) obj;
                ur0Var.getClass();
                ((fee) n0o0Var14.getValue()).d(ur0Var.h);
                c().d(ur0Var.e);
                ((fee) this.e.getValue()).d(Boolean.valueOf(ur0Var.f));
                ((fee) n0o0Var13.getValue()).d(ur0Var.c);
                ((fee) n0o0Var12.getValue()).d(ur0Var.b);
                b().d(ur0Var.d);
                fee feeVar = (fee) n0o0Var11.getValue();
                int i = ur0Var.g;
                feeVar.d(Integer.valueOf(i));
                ((fee) n0o0Var10.getValue()).d(Integer.valueOf(i));
                if ((((fee) n0o0Var13.getValue()).c() instanceof qlk0) || (((fee) n0o0Var12.getValue()).c() instanceof u5q) || (b().c() instanceof x5d0)) {
                    n0o0Var9 = n0o0Var9;
                    int iOrdinal = ((ep0) c().c()).ordinal();
                    if (iOrdinal == 0) {
                        lc00 lc00VarB = kotlin.collections.a.b();
                        zcl zclVar = qmk.f28987a;
                        lc00VarB.add(q8x.z(0.0f, "SORTING_HEADER_SHIMMER_ID"));
                        lh80 lh80VarT = s5x0.t(0.0f, 0.0f, 3);
                        lh80 lh80VarT2 = s5x0.t(0.0f, 0.0f, 3);
                        yo0 yo0Var = yo0.e;
                        zo0 zo0Var = new zo0(lh80VarT, lh80VarT2, yo0Var);
                        oq0 oq0Var = oq0.f25665a;
                        lc00VarB.add(new pq0("SORTING_SETTING_CELL_SHIMMER_ID", zo0Var, oq0Var));
                        lc00VarB.add(q8x.z(8.0f, "PROVIDERS_HEADER_SHIMMER_ID"));
                        lc00VarB.add(new pq0("PROVIDERS_SETTING_CELL_SHIMMER_ID", new zo0(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), yo0Var), oq0Var));
                        for (int i2 = 0; i2 < 4; i2++) {
                            String strM = twn.m(i2, "FILTER_HEADER_SHIMMER_ID");
                            zcl zclVar2 = qmk.f28987a;
                            lc00VarB.add(q8x.z(8.0f, strM));
                            lc00VarB.add(new pq0(twn.m(i2, "FILTER_SHIMMER_ID"), new zo0(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), yo0.e), oq0.b));
                        }
                        i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                    } else if (iOrdinal == 1) {
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        int i3 = 0;
                        while (i3 < 6) {
                            String strM2 = twn.m(i3, "FILTER_SHIMMER_ID");
                            lh80 lh80VarT3 = s5x0.t(0.0f, 0.0f, 3);
                            zcl zclVar3 = qmk.f28987a;
                            lc00VarB2.add(new pq0(strM2, new zo0(lh80VarT3, s5x0.u(0.0f, i3 == 0 ? 0.0f : 8.0f, 0.0f, 0.0f, 13), yo0.e), oq0.b));
                            i3++;
                        }
                        i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB2));
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        zcl zclVar4 = qmk.f28987a;
                        lc00VarB3.add(vvw.s(0.0f, "SORTING_HEADER_SHIMMER_ID"));
                        lh80 lh80VarT4 = s5x0.t(0.0f, 0.0f, 3);
                        lh80 lh80VarT5 = s5x0.t(0.0f, 0.0f, 3);
                        yo0 yo0Var2 = yo0.e;
                        zo0 zo0Var2 = new zo0(lh80VarT4, lh80VarT5, yo0Var2);
                        oq0 oq0Var2 = oq0.f25665a;
                        lc00VarB3.add(new pq0("SORTING_SETTING_CELL_SHIMMER_ID", zo0Var2, oq0Var2));
                        lc00VarB3.add(vvw.s(8.0f, "PROVIDERS_HEADER_SHIMMER_ID"));
                        lc00VarB3.add(new pq0("PROVIDERS_SETTING_CELL_SHIMMER_ID", new zo0(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), yo0Var2), oq0Var2));
                        for (int i4 = 0; i4 < 4; i4++) {
                            String strM3 = twn.m(i4, "FILTER_HEADER_SHIMMER_ID");
                            zcl zclVar5 = qmk.f28987a;
                            lc00VarB3.add(vvw.s(8.0f, strM3));
                            lc00VarB3.add(new pq0(twn.m(i4, "FILTER_SHIMMER_ID"), new zo0(s5x0.t(0.0f, 0.0f, 3), s5x0.t(0.0f, 0.0f, 3), yo0.e), oq0.b));
                        }
                        i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                    }
                    gq0 fq0Var = new fq0(i4VarR0);
                    eq0Var = fq0Var;
                } else if ((((fee) n0o0Var13.getValue()).c() instanceof nlk0) || (((fee) n0o0Var12.getValue()).c() instanceof r5q) || (b().c() instanceof u5d0)) {
                    Object objC = b().c();
                    u5d0 u5d0Var = objC instanceof u5d0 ? (u5d0) objC : null;
                    x2q x2qVar = u5d0Var != null ? u5d0Var.f35088a : null;
                    mtl mtlVar = (mtl) n0o0Var7.getValue();
                    int iOrdinal2 = ((ep0) c().c()).ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            jjm jjmVar = (jjm) ((fee) n0o0Var6.getValue()).b();
                            rqm rqmVar = (rqm) ((fee) n0o0Var4.getValue()).b();
                            fyl fylVar = (fyl) ((fee) n0o0Var3.getValue()).b();
                            List list2 = (List) ((fee) n0o0Var.getValue()).b();
                            jjm jjmVar2 = (jjm) ((fee) n0o0Var8.getValue()).b();
                            rqm rqmVar2 = (rqm) ((fee) n0o0Var5.getValue()).b();
                            jjmVar.getClass();
                            fylVar.getClass();
                            list2.getClass();
                            jjmVar2.getClass();
                            lc00 lc00VarB4 = kotlin.collections.a.b();
                            List list3 = x2qVar != null ? x2qVar.d : null;
                            boolean z2 = list3 == null || list3.isEmpty();
                            if (rqmVar2 != null) {
                                kjm kjmVar = kjm.b;
                                zcl zclVar6 = qmk.f28987a;
                                lc00VarB4.add(new lq0("SORTING_HEADER_ID", new zo0(s5x0.u(16.0f, 6.0f, 16.0f, 0.0f, 8), s5x0.t(0.0f, 0.0f, 3), yo0.f42963a), jjmVar2, kjmVar));
                                lc00VarB4.add(new qq0(new zo0(s5x0.u(16.0f, 0.0f, 16.0f, 16.0f, 2), s5x0.t(0.0f, 0.0f, 3), yo0.b), rqmVar2));
                            }
                            if (rqmVar != null) {
                                kjm kjmVar2 = kjm.b;
                                zcl zclVar7 = qmk.f28987a;
                                lc00VarB4.add(new lq0("PROVIDERS_HEADER_ID", new zo0(s5x0.u(16.0f, 6.0f, 16.0f, 0.0f, 8), s5x0.u(0.0f, rqmVar2 == null ? 0.0f : 8.0f, 0.0f, 0.0f, 13), yo0.f42963a), jjmVar, kjmVar2));
                                lc00VarB4.add(new nq0(new zo0(s5x0.u(16.0f, 0.0f, 16.0f, !z2 ? 0.0f : 16.0f, 2), s5x0.t(0.0f, 0.0f, 3), !z2 ? yo0.c : yo0.b), rqmVar));
                                if (!z2) {
                                    lc00VarB4.add(new kq0("PROVIDERS_CELLS_ID", new zo0(new lh80(16.0f, 8.0f, 16.0f, 8.0f), s5x0.t(0.0f, 0.0f, 3), yo0.b), x2qVar.f40181a, fylVar, vxl.f38204a));
                                }
                            }
                            int i5 = 0;
                            for (Object obj2 : list2) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                ro0 ro0Var = (ro0) obj2;
                                if (!ro0Var.c.f10362a.isEmpty()) {
                                    String strK = kng0.k("FILTER_CATEGORY_HEADER_ID", ro0Var.f30813a);
                                    hjm hjmVar = ro0Var.b;
                                    kjm kjmVar3 = kjm.b;
                                    zcl zclVar8 = qmk.f28987a;
                                    lc00VarB4.add(new lq0(strK, new zo0(s5x0.u(16.0f, 6.0f, 16.0f, 0.0f, 8), s5x0.u(0.0f, (i5 == 0 && rqmVar == null) ? 0.0f : 8.0f, 0.0f, 0.0f, 13), yo0.f42963a), hjmVar, kjmVar3));
                                    String str = ro0Var.f30813a;
                                    lc00VarB4.add(new kq0(str, new zo0(s5x0.u(16.0f, 0.0f, 16.0f, 8.0f, 2), s5x0.t(0.0f, 0.0f, 3), yo0.b), str, ro0Var.c, vxl.b));
                                }
                                i5 = i6;
                            }
                            i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB4));
                        } else {
                            if (iOrdinal2 != 2) {
                                t9f.b();
                                return null;
                            }
                            jjm jjmVar3 = (jjm) ((fee) n0o0Var6.getValue()).b();
                            rqm rqmVar3 = (rqm) ((fee) n0o0Var4.getValue()).b();
                            t5d0 t5d0Var = (t5d0) ((fee) n0o0Var2.getValue()).b();
                            List list4 = (List) ((fee) n0o0Var.getValue()).b();
                            jjm jjmVar4 = (jjm) ((fee) n0o0Var8.getValue()).b();
                            rqm rqmVar4 = (rqm) ((fee) n0o0Var5.getValue()).b();
                            jjmVar3.getClass();
                            t5d0Var.getClass();
                            list4.getClass();
                            jjmVar4.getClass();
                            lc00 lc00VarB5 = kotlin.collections.a.b();
                            List list5 = x2qVar != null ? x2qVar.d : null;
                            boolean z3 = list5 == null || list5.isEmpty();
                            if (rqmVar4 != null) {
                                kjm kjmVar4 = kjm.f18392a;
                                zcl zclVar9 = qmk.f28987a;
                                lc00VarB5.add(new lq0("SORTING_HEADER_ID", new zo0(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.t(0.0f, 0.0f, 3), yo0.e), jjmVar4, kjmVar4));
                                lc00VarB5.add(new qq0(new zo0(s5x0.u(0.0f, 0.0f, 0.0f, 0.0f, 8), s5x0.t(0.0f, 0.0f, 3), yo0.d), rqmVar4));
                            }
                            if (rqmVar3 != null) {
                                kjm kjmVar5 = kjm.f18392a;
                                zcl zclVar10 = qmk.f28987a;
                                lc00VarB5.add(new lq0("PROVIDERS_HEADER_ID", new zo0(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.u(0.0f, rqmVar4 == null ? 0.0f : 8.0f, 0.0f, 0.0f, 13), yo0.e), jjmVar3, kjmVar5));
                                lc00VarB5.add(new nq0(new zo0(s5x0.u(!z3 ? 16.0f : 0.0f, !z3 ? 16.0f : 0.0f, !z3 ? 16.0f : 0.0f, 0.0f, 8), s5x0.t(0.0f, 0.0f, 3), !z3 ? yo0.f42963a : yo0.d), rqmVar3));
                                if (!z3) {
                                    lc00VarB5.add(new mq0(new zo0(new lh80(16.0f, 12.0f, 16.0f, 16.0f), s5x0.t(0.0f, 0.0f, 3), yo0.b), t5d0Var));
                                }
                            }
                            int i7 = 0;
                            for (Object obj3 : list4) {
                                int i8 = i7 + 1;
                                if (i7 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                ro0 ro0Var2 = (ro0) obj3;
                                if (!ro0Var2.c.f10362a.isEmpty()) {
                                    String strK2 = kng0.k("FILTER_CATEGORY_HEADER_ID", ro0Var2.f30813a);
                                    hjm hjmVar2 = ro0Var2.b;
                                    kjm kjmVar6 = kjm.f18392a;
                                    zcl zclVar11 = qmk.f28987a;
                                    lc00VarB5.add(new lq0(strK2, new zo0(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.u(0.0f, (i7 == 0 && rqmVar3 == null) ? 0.0f : 8.0f, 0.0f, 0.0f, 13), yo0.e), hjmVar2, kjmVar6));
                                    String str2 = ro0Var2.f30813a;
                                    lc00VarB5.add(new kq0(str2, new zo0(new lh80(16.0f, 8.0f, 16.0f, 8.0f), s5x0.t(0.0f, 0.0f, 3), yo0.d), str2, ro0Var2.c, vxl.b));
                                }
                                i7 = i8;
                            }
                            i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB5));
                        }
                        new dq0(i4VarR1, mtlVar);
                        eq0Var = fq0Var;
                    } else {
                        mtlVar = mtlVar;
                        jjm jjmVar5 = (jjm) ((fee) n0o0Var6.getValue()).b();
                        rqm rqmVar5 = (rqm) ((fee) n0o0Var4.getValue()).b();
                        t5d0 t5d0Var2 = (t5d0) ((fee) n0o0Var2.getValue()).b();
                        List list6 = (List) ((fee) n0o0Var.getValue()).b();
                        jjm jjmVar6 = (jjm) ((fee) n0o0Var8.getValue()).b();
                        rqm rqmVar6 = (rqm) ((fee) n0o0Var5.getValue()).b();
                        jjmVar5.getClass();
                        t5d0Var2.getClass();
                        list6.getClass();
                        jjmVar6.getClass();
                        lc00 lc00VarB6 = kotlin.collections.a.b();
                        List list7 = x2qVar != null ? x2qVar.d : null;
                        if (list7 == null) {
                            list7 = iun.f15405a;
                        }
                        int size = list7.size();
                        boolean z4 = 1 <= size && size < 7;
                        if (rqmVar6 != null) {
                            kjm kjmVar7 = kjm.b;
                            zcl zclVar12 = qmk.f28987a;
                            lc00VarB6.add(new lq0("SORTING_HEADER_ID", new zo0(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.t(0.0f, 0.0f, 3), yo0.e), jjmVar6, kjmVar7));
                            lc00VarB6.add(new qq0(new zo0(s5x0.u(0.0f, 0.0f, 0.0f, 0.0f, 8), s5x0.t(0.0f, 0.0f, 3), yo0.d), rqmVar6));
                        }
                        if (rqmVar5 != null) {
                            kjm kjmVar8 = kjm.b;
                            zcl zclVar13 = qmk.f28987a;
                            lc00VarB6.add(new lq0("PROVIDERS_HEADER_ID", new zo0(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.u(0.0f, rqmVar6 == null ? 0.0f : 8.0f, 0.0f, 0.0f, 13), yo0.e), jjmVar5, kjmVar8));
                            lc00VarB6.add(new nq0(new zo0(s5x0.u(z4 ? 16.0f : 0.0f, z4 ? 16.0f : 0.0f, z4 ? 16.0f : 0.0f, 0.0f, 8), s5x0.t(0.0f, 0.0f, 3), z4 ? yo0.f42963a : yo0.d), rqmVar5));
                            if (z4) {
                                lc00VarB6.add(new mq0(new zo0(new lh80(16.0f, 12.0f, 16.0f, 16.0f), s5x0.t(0.0f, 0.0f, 3), yo0.b), t5d0Var2));
                            }
                        }
                        int i9 = 0;
                        for (Object obj4 : list6) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                q3d.p();
                                throw null;
                            }
                            ro0 ro0Var3 = (ro0) obj4;
                            if (!ro0Var3.c.f10362a.isEmpty()) {
                                String strK3 = kng0.k("FILTER_CATEGORY_HEADER_ID", ro0Var3.f30813a);
                                hjm hjmVar3 = ro0Var3.b;
                                kjm kjmVar9 = kjm.b;
                                zcl zclVar14 = qmk.f28987a;
                                lc00VarB6.add(new lq0(strK3, new zo0(s5x0.u(16.0f, 0.0f, 16.0f, 0.0f, 10), s5x0.u(0.0f, (i9 == 0 && rqmVar5 == null) ? 0.0f : 8.0f, 0.0f, 0.0f, 13), yo0.e), hjmVar3, kjmVar9));
                                String str3 = ro0Var3.f30813a;
                                lc00VarB6.add(new kq0(str3, new zo0(new lh80(16.0f, 8.0f, 16.0f, 8.0f), s5x0.t(0.0f, 0.0f, 3), yo0.d), str3, ro0Var3.c, vxl.b));
                            }
                            i9 = i10;
                        }
                        i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB6));
                    }
                    mtlVar = mtlVar;
                    new dq0(i4VarR1, mtlVar);
                    eq0Var = fq0Var;
                } else {
                    eq0Var = ((((fee) n0o0Var13.getValue()).c() instanceof olk0) && (((fee) n0o0Var12.getValue()).c() instanceof s5q) && (b().c() instanceof v5d0)) ? new eq0((mdm) ((fee) n0o0Var10.getValue()).b()) : new eq0((mdm) ((fee) n0o0Var11.getValue()).b());
                    n0o0Var9 = n0o0Var9;
                }
                return new xr0((imm) ((fee) n0o0Var9.getValue()).b(), eq0Var);
            default:
                d0b0 d0b0Var = (d0b0) obj;
                d0b0Var.getClass();
                ((fee) this.c.getValue()).d(Boolean.valueOf(d0b0Var.g));
                ((fee) n0o0Var14.getValue()).d(Boolean.valueOf(d0b0Var.h));
                d().d(d0b0Var.f);
                ((fee) n0o0Var13.getValue()).d(d0b0Var.e);
                ((fee) n0o0Var12.getValue()).d(Boolean.valueOf(d0b0Var.j));
                ((fee) this.h.getValue()).d(d0b0Var.f5260a);
                ((fee) n0o0Var11.getValue()).d(d0b0Var.b);
                ((fee) n0o0Var10.getValue()).d(d0b0Var.c);
                ((fee) n0o0Var9.getValue()).d(d0b0Var.d);
                if (d0b0Var.i) {
                    return new m0b0((mdm) ((fee) n0o0Var8.getValue()).b());
                }
                boolean z5 = ((zza0) ((fee) n0o0Var11.getValue()).c()).b;
                boolean z6 = ((yza0) ((fee) n0o0Var10.getValue()).c()).b;
                boolean z7 = ((b0b0) ((fee) n0o0Var9.getValue()).c()).b;
                if (!((c0b0) d().c()).f3516a ? !(z5 && z6 && z7) : !(z5 && z6)) {
                    return new m0b0((mdm) ((fee) n0o0Var7.getValue()).b());
                }
                if (((zza0) ((fee) n0o0Var11.getValue()).c()).b) {
                    z = true;
                } else {
                    List list8 = ((zza0) ((fee) n0o0Var11.getValue()).c()).c;
                    if (list8 != null) {
                        if (!list8.isEmpty()) {
                            Iterator it = list8.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((nza0) it.next()).c.isEmpty()) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    z = false;
                }
                boolean z8 = ((yza0) ((fee) n0o0Var10.getValue()).c()).b || ((list = ((yza0) ((fee) n0o0Var10.getValue()).c()).c) != null && list.isEmpty());
                boolean z9 = ((b0b0) ((fee) n0o0Var9.getValue()).c()).b || !((uhc0Var = ((b0b0) ((fee) n0o0Var9.getValue()).c()).c) == null || uhc0Var.c.g || uhc0Var.f35671a.k || uhc0Var.b.k);
                if (!((c0b0) d().c()).f3516a ? !(z && z8 && z9) : !(z && z8)) {
                    return new m0b0((mdm) ((fee) n0o0Var6.getValue()).b());
                }
                lc00 lc00VarB7 = kotlin.collections.a.b();
                dza0 dza0Var = (dza0) ((fee) n0o0Var5.getValue()).b();
                if (dza0Var != null) {
                    lc00VarB7.add(dza0Var);
                }
                lc00VarB7.add(((fee) n0o0Var4.getValue()).b());
                List list9 = (List) ((fee) n0o0Var3.getValue()).b();
                if (list9 != null) {
                    lc00VarB7.addAll(list9);
                }
                eza0 eza0Var = (eza0) ((fee) n0o0Var2.getValue()).b();
                if (eza0Var != null) {
                    lc00VarB7.add(eza0Var);
                }
                qza0 qza0Var = (qza0) ((fee) n0o0Var.getValue()).b();
                if (qza0Var != null) {
                    lc00VarB7.add(qza0Var);
                }
                return new l0b0(dyb.o0(kotlin.collections.a.a(lc00VarB7)));
        }
    }

    public wr0(d0b0 d0b0Var, ctf0 ctf0Var) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(Boolean.valueOf(d0b0Var.g));
        this.d = bkb.H(Boolean.valueOf(d0b0Var.h));
        this.e = bkb.H(d0b0Var.f);
        this.f = bkb.H(d0b0Var.e);
        this.g = bkb.H(Boolean.valueOf(d0b0Var.j));
        n0o0 n0o0VarH = bkb.H(d0b0Var.f5260a);
        this.h = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(d0b0Var.b);
        this.i = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(d0b0Var.c);
        this.j = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(d0b0Var.d);
        this.k = n0o0VarH4;
        final byte b2 = 2;
        n0o0 n0o0VarG = bkb.G(d().d, new kma0((byte) 2));
        final byte b3 = 3;
        this.l = bkb.G(d().d, new kma0((byte) 3));
        final byte b4 = 4;
        this.m = bkb.G(d().d, new kma0((byte) 4));
        this.n = bkb.G(d().d, new kma0((byte) 5));
        final byte b5 = 0;
        this.o = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.k0b0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                int i;
                char c;
                fkl fklVar;
                pt0 pt0Var;
                int i2;
                String strA;
                char c2;
                mza0 mza0Var;
                int i3;
                boolean z;
                boolean z2;
                String strA2;
                pt0 pt0Var2;
                mtr mtrVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                int i4;
                char c3;
                fkl fklVar2;
                int i5;
                char c4;
                byte b6 = b5;
                int i6 = 10;
                wr0 wr0Var = this.b;
                switch (b6) {
                    case 0:
                        Object obj2 = null;
                        xza0 xza0Var = (xza0) obj;
                        xza0Var.getClass();
                        if (!((c0b0) wr0Var.d().c()).g) {
                            return null;
                        }
                        lq5 lq5Var = ((c0b0) wr0Var.d().c()).c;
                        Iterable<lr5> iterable = xza0Var.c;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (lr5 lr5Var : iterable) {
                            lq5 lq5Var2 = ((c0b0) wr0Var.d().c()).c;
                            int i7 = lr5Var.f20512a;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            if (lq5Var2.equals(gq5.f11714a) || lq5Var2.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var2.equals(hq5.f13470a) || lq5Var2.equals(iq5.f15191a) || lq5Var2.equals(kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var2.equals(dq5.f6497a) && !lq5Var2.equals(eq5.f8219a) && !lq5Var2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return obj2;
                                }
                                str = lr5Var.d;
                            }
                            str.getClass();
                            if (str.length() == 0) {
                                sb.setLength(0);
                            } else {
                                if (StringsKt.O(str, ujn.h, false)) {
                                    i = 0;
                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                    i = 0;
                                } else {
                                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                        c = '/';
                                    } else {
                                        c = '/';
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0(str, c));
                                }
                                sb.setLength(i);
                                sb.append(str);
                            }
                            arrayList.add(new fr5(i7, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                            obj2 = null;
                        }
                        return new dza0(lq5Var, dyb.o0(arrayList), xza0Var.f41746a);
                    case 1:
                        ctf0 ctf0Var2 = wr0Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            pz40 pz40Var = s6t0.f31722a;
                            long j = hi0.T;
                            String strA3 = ctf0Var2.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar = new m0x(R.drawable.popular_virtual_banner, null, 6);
                            ckl cklVar = ckl.f4512a;
                            fklVar = new fkl(j, m0xVar, null, strA3, null, dyb.g0(dkl.f6236a), 32);
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            long jM92getDarkPink0d7_KjU = StaticColors.INSTANCE.m92getDarkPink0d7_KjU();
                            String strA4 = ctf0Var2.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar2 = new m0x(R.drawable.aggregator_popular_banner, null, 6);
                            ckl cklVar2 = ckl.f4512a;
                            fklVar = new fkl(jM92getDarkPink0d7_KjU, m0xVar2, null, strA4, null, dyb.g0(dkl.f6236a), 32);
                        }
                        return new pza0(fklVar);
                    case 2:
                        zza0 zza0Var = (zza0) obj;
                        zza0Var.getClass();
                        fee feeVarD = wr0Var.d();
                        ctf0 ctf0Var3 = wr0Var.b;
                        int iOrdinal = ((c0b0) feeVarD.c()).d.ordinal();
                        if (iOrdinal == 0) {
                            pt0Var = pt0.f27539a;
                        } else if (iOrdinal == 1) {
                            pt0Var = pt0.b;
                        } else if (iOrdinal == 2) {
                            pt0Var = pt0.c;
                        } else {
                            if (iOrdinal != 3) {
                                if (iOrdinal == 4) {
                                    pt0Var = pt0.e;
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            pt0Var = pt0.d;
                        }
                        boolean z3 = zza0Var.f45243a;
                        o0s o0sVar = o0s.f24443a;
                        if (z3) {
                            ArrayList arrayList2 = new ArrayList(4);
                            for (int i8 = 0; i8 < 4; i8++) {
                                arrayList2.add(new mza0(fza0.c, 0L, new ijm(), new aml(pt0Var, new wll(o0sVar), true)));
                            }
                            return arrayList2;
                        }
                        List list = zza0Var.c;
                        if (list != null) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                nza0 nza0Var = (nza0) it.next();
                                List list2 = nza0Var.c;
                                fza0 fza0Var = nza0Var.b;
                                vh0 vh0Var = nza0Var.f24363a;
                                ArrayList arrayList4 = new ArrayList(r3d.q(list2, i6));
                                for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
                                    mlr mlrVar = (mlr) it2.next();
                                    boolean zBooleanValue = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                    boolean z4 = ((c0b0) wr0Var.d().c()).f3516a;
                                    Set set = (Set) ((fee) wr0Var.f.getValue()).c();
                                    long j2 = mlrVar.f22006a;
                                    Iterator it3 = it;
                                    boolean z5 = mlrVar.k;
                                    boolean zContains = set.contains(Long.valueOf(j2));
                                    int iOrdinal2 = fza0Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        i3 = 1292;
                                    } else if (iOrdinal2 == 9) {
                                        i3 = 1194;
                                    } else if (iOrdinal2 != 5) {
                                        i3 = iOrdinal2 != 6 ? 0 : 1293;
                                    } else {
                                        i3 = 1192;
                                    }
                                    Integer numValueOf = Integer.valueOf(i3);
                                    ctf0Var3.getClass();
                                    int i9 = z4 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    boolean z6 = mlrVar.j;
                                    if (z5) {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = z2 ? ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    boolean z7 = z2;
                                    long j3 = mlrVar.f22006a;
                                    String str2 = mlrVar.f;
                                    String str3 = mlrVar.e;
                                    mtr mtrVar2 = new mtr(zBooleanValue ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar = new n0x(mlrVar.g);
                                    m0x m0xVar3 = new m0x(i9, null, 6);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        mtrVar = mtrVar2;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                                            mtrVar = mtrVar2;
                                        } else {
                                            mtrVar = mtrVar2;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z) {
                                                if ((pt0Var == pt0Var4 && z7) || ((pt0Var == pt0Var2 && z7) || (pt0Var == pt0Var5 && z7))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z7) || (pt0Var == pt0Var3 && z7)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList4.add(new st0(j3, str2, str3, mtrVar, n0xVar, m0xVar3, numValueOf, murVar));
                                    it = it3;
                                }
                                Iterator it4 = it;
                                if (arrayList4.isEmpty()) {
                                    c2 = 228;
                                    mza0Var = null;
                                } else {
                                    a4x a4xVarO0 = dyb.o0(arrayList4);
                                    if (((c0b0) wr0Var.d().c()).f3516a) {
                                        strA = vh0Var.b;
                                        i2 = 0;
                                    } else {
                                        fza0.f10399a.getClass();
                                        i2 = 0;
                                        strA = ctf0Var3.b.a(fl70.b(fza0Var), Arrays.copyOf(new Object[0], 0));
                                    }
                                    c2 = 228;
                                    mza0Var = new mza0(fza0Var, vh0Var.f37408a, new hjm(strA, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[i2], i2))), null, 7166), new zll(pt0Var, new wll(o0sVar), a4xVarO0));
                                }
                                arrayList3.add(mza0Var);
                                it = it4;
                                i6 = 10;
                            }
                            return CollectionsKt.S(arrayList3);
                        }
                        return null;
                    case 3:
                        yza0 yza0Var = (yza0) obj;
                        yza0Var.getClass();
                        boolean z8 = yza0Var.f43506a;
                        List<vh0> list3 = yza0Var.c;
                        if (z8) {
                            return new eza0(new ijm(new qjm()), avl.f1531a);
                        }
                        if (list3 == null || list3.isEmpty()) {
                            return null;
                        }
                        fee feeVarD2 = wr0Var.d();
                        ctf0 ctf0Var4 = wr0Var.b;
                        int i10 = ((c0b0) feeVarD2.c()).f3516a ? R.drawable.category_virtual_placeholder : R.drawable.category_aggregator_placeholder;
                        hjm hjmVar = new hjm(ctf0Var4.b.a(R.string.categories, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(ctf0Var4.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166);
                        ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                        for (vh0 vh0Var2 : list3) {
                            int i11 = (int) vh0Var2.f37408a;
                            String str4 = vh0Var2.b;
                            StringBuilder sb2 = new StringBuilder(ujn.h);
                            String str5 = vh0Var2.c;
                            if (str5.length() == 0) {
                                sb2.setLength(0);
                            } else {
                                if (StringsKt.O(str5, ujn.h, false)) {
                                    i4 = 0;
                                } else if (kotlin.text.c.x(str5, "https://", false)) {
                                    i4 = 0;
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        c3 = '/';
                                    } else {
                                        c3 = '/';
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0(str5, c3));
                                }
                                sb2.setLength(i4);
                                sb2.append(str5);
                            }
                            arrayList5.add(new cvl(i11, new n0x(sb2.toString()), Integer.valueOf(i10), str4));
                        }
                        return new eza0(hjmVar, new zul(dyb.o0(arrayList5)));
                    default:
                        b0b0 b0b0Var = (b0b0) obj;
                        b0b0Var.getClass();
                        boolean z9 = b0b0Var.f1759a;
                        uhc0 uhc0Var = b0b0Var.c;
                        if (z9) {
                            return new qza0(new ijm(), gkl.f11450a, iml.f15031a);
                        }
                        if (uhc0Var != null) {
                            jic0 jic0Var = uhc0Var.b;
                            boolean z10 = jic0Var.k;
                            jic0 jic0Var2 = uhc0Var.f35671a;
                            boolean z11 = jic0Var2.k;
                            eoc0 eoc0Var = uhc0Var.c;
                            boolean z12 = eoc0Var.g;
                            boolean z13 = ((c0b0) wr0Var.d().c()).e && z12;
                            boolean z14 = z11 || z10;
                            if (z13 || z14) {
                                boolean zBooleanValue2 = ((Boolean) ((fee) wr0Var.g.getValue()).c()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                List listL0 = CollectionsKt.L0((Iterable) ((fee) wr0Var.f.getValue()).c());
                                ctf0 ctf0Var5 = wr0Var.b;
                                listL0.getClass();
                                ctf0Var5.getClass();
                                lsm0 lsm0Var = ctf0Var5.b;
                                hjm hjmVar2 = new hjm(lsm0Var.a(R.string.selection_for_you, Arrays.copyOf(new Object[0], 0)), new mjm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                                if (z13 && z12) {
                                    pz40 pz40Var3 = s6t0.f31722a;
                                    long jM95getGray0d7_KjU = StaticColors.INSTANCE.m95getGray0d7_KjU();
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str6 = zBooleanValue2 ? eoc0Var.b : eoc0Var.c;
                                    if (StringsKt.W(str6)) {
                                        str6 = eoc0Var.f8132a;
                                    }
                                    if (str6.length() == 0) {
                                        i5 = 0;
                                        sb3.setLength(0);
                                    } else {
                                        i5 = 0;
                                        if (StringsKt.O(str6, ujn.h, false)) {
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else if (kotlin.text.c.x(str6, "https://", false)) {
                                            i5 = 0;
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c4 = '/';
                                            } else {
                                                c4 = '/';
                                                sb3.append('/');
                                            }
                                            i5 = 0;
                                            sb3.append(StringsKt.y0(str6, c4));
                                        }
                                    }
                                    n0x n0xVar2 = new n0x(sb3.toString());
                                    String str7 = eoc0Var.f;
                                    String strA5 = lsm0Var.a(R.string.casino_provider_of_the_month, Arrays.copyOf(new Object[i5], i5));
                                    ckl cklVar3 = ckl.f4512a;
                                    fklVar2 = new fkl(jM95getGray0d7_KjU, n0xVar2, null, str7, strA5, dyb.g0(dkl.f6236a, dkl.b), 32);
                                } else {
                                    fklVar2 = null;
                                }
                                return new qza0(hjmVar2, fklVar2, (z11 || z10) ? new hml(z11 ? yyw.c0(jic0Var2, zBooleanValue3, listL0, nw80.b, ctf0Var5) : yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5), (z11 && z10) ? yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5) : null) : null);
                            }
                        }
                        return null;
                }
            }
        });
        this.p = bkb.G(((fee) n0o0VarG.getValue()).e, new Function1(this) { // from class: a.k0b0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                int i;
                char c;
                fkl fklVar;
                pt0 pt0Var;
                int i2;
                String strA;
                char c2;
                mza0 mza0Var;
                int i3;
                boolean z;
                boolean z2;
                String strA2;
                pt0 pt0Var2;
                mtr mtrVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                int i4;
                char c3;
                fkl fklVar2;
                int i5;
                char c4;
                byte b6 = b;
                int i6 = 10;
                wr0 wr0Var = this.b;
                switch (b6) {
                    case 0:
                        Object obj2 = null;
                        xza0 xza0Var = (xza0) obj;
                        xza0Var.getClass();
                        if (!((c0b0) wr0Var.d().c()).g) {
                            return null;
                        }
                        lq5 lq5Var = ((c0b0) wr0Var.d().c()).c;
                        Iterable<lr5> iterable = xza0Var.c;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (lr5 lr5Var : iterable) {
                            lq5 lq5Var2 = ((c0b0) wr0Var.d().c()).c;
                            int i7 = lr5Var.f20512a;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            if (lq5Var2.equals(gq5.f11714a) || lq5Var2.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var2.equals(hq5.f13470a) || lq5Var2.equals(iq5.f15191a) || lq5Var2.equals(kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var2.equals(dq5.f6497a) && !lq5Var2.equals(eq5.f8219a) && !lq5Var2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return obj2;
                                }
                                str = lr5Var.d;
                            }
                            str.getClass();
                            if (str.length() == 0) {
                                sb.setLength(0);
                            } else {
                                if (StringsKt.O(str, ujn.h, false)) {
                                    i = 0;
                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                    i = 0;
                                } else {
                                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                        c = '/';
                                    } else {
                                        c = '/';
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0(str, c));
                                }
                                sb.setLength(i);
                                sb.append(str);
                            }
                            arrayList.add(new fr5(i7, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                            obj2 = null;
                        }
                        return new dza0(lq5Var, dyb.o0(arrayList), xza0Var.f41746a);
                    case 1:
                        ctf0 ctf0Var2 = wr0Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            pz40 pz40Var = s6t0.f31722a;
                            long j = hi0.T;
                            String strA3 = ctf0Var2.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar = new m0x(R.drawable.popular_virtual_banner, null, 6);
                            ckl cklVar = ckl.f4512a;
                            fklVar = new fkl(j, m0xVar, null, strA3, null, dyb.g0(dkl.f6236a), 32);
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            long jM92getDarkPink0d7_KjU = StaticColors.INSTANCE.m92getDarkPink0d7_KjU();
                            String strA4 = ctf0Var2.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar2 = new m0x(R.drawable.aggregator_popular_banner, null, 6);
                            ckl cklVar2 = ckl.f4512a;
                            fklVar = new fkl(jM92getDarkPink0d7_KjU, m0xVar2, null, strA4, null, dyb.g0(dkl.f6236a), 32);
                        }
                        return new pza0(fklVar);
                    case 2:
                        zza0 zza0Var = (zza0) obj;
                        zza0Var.getClass();
                        fee feeVarD = wr0Var.d();
                        ctf0 ctf0Var3 = wr0Var.b;
                        int iOrdinal = ((c0b0) feeVarD.c()).d.ordinal();
                        if (iOrdinal == 0) {
                            pt0Var = pt0.f27539a;
                        } else if (iOrdinal == 1) {
                            pt0Var = pt0.b;
                        } else if (iOrdinal == 2) {
                            pt0Var = pt0.c;
                        } else {
                            if (iOrdinal != 3) {
                                if (iOrdinal == 4) {
                                    pt0Var = pt0.e;
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            pt0Var = pt0.d;
                        }
                        boolean z3 = zza0Var.f45243a;
                        o0s o0sVar = o0s.f24443a;
                        if (z3) {
                            ArrayList arrayList2 = new ArrayList(4);
                            for (int i8 = 0; i8 < 4; i8++) {
                                arrayList2.add(new mza0(fza0.c, 0L, new ijm(), new aml(pt0Var, new wll(o0sVar), true)));
                            }
                            return arrayList2;
                        }
                        List list = zza0Var.c;
                        if (list != null) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                nza0 nza0Var = (nza0) it.next();
                                List list2 = nza0Var.c;
                                fza0 fza0Var = nza0Var.b;
                                vh0 vh0Var = nza0Var.f24363a;
                                ArrayList arrayList4 = new ArrayList(r3d.q(list2, i6));
                                for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
                                    mlr mlrVar = (mlr) it2.next();
                                    boolean zBooleanValue = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                    boolean z4 = ((c0b0) wr0Var.d().c()).f3516a;
                                    Set set = (Set) ((fee) wr0Var.f.getValue()).c();
                                    long j2 = mlrVar.f22006a;
                                    Iterator it3 = it;
                                    boolean z5 = mlrVar.k;
                                    boolean zContains = set.contains(Long.valueOf(j2));
                                    int iOrdinal2 = fza0Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        i3 = 1292;
                                    } else if (iOrdinal2 == 9) {
                                        i3 = 1194;
                                    } else if (iOrdinal2 != 5) {
                                        i3 = iOrdinal2 != 6 ? 0 : 1293;
                                    } else {
                                        i3 = 1192;
                                    }
                                    Integer numValueOf = Integer.valueOf(i3);
                                    ctf0Var3.getClass();
                                    int i9 = z4 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    boolean z6 = mlrVar.j;
                                    if (z5) {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = z2 ? ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    boolean z7 = z2;
                                    long j3 = mlrVar.f22006a;
                                    String str2 = mlrVar.f;
                                    String str3 = mlrVar.e;
                                    mtr mtrVar2 = new mtr(zBooleanValue ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar = new n0x(mlrVar.g);
                                    m0x m0xVar3 = new m0x(i9, null, 6);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        mtrVar = mtrVar2;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                                            mtrVar = mtrVar2;
                                        } else {
                                            mtrVar = mtrVar2;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z) {
                                                if ((pt0Var == pt0Var4 && z7) || ((pt0Var == pt0Var2 && z7) || (pt0Var == pt0Var5 && z7))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z7) || (pt0Var == pt0Var3 && z7)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList4.add(new st0(j3, str2, str3, mtrVar, n0xVar, m0xVar3, numValueOf, murVar));
                                    it = it3;
                                }
                                Iterator it4 = it;
                                if (arrayList4.isEmpty()) {
                                    c2 = 228;
                                    mza0Var = null;
                                } else {
                                    a4x a4xVarO0 = dyb.o0(arrayList4);
                                    if (((c0b0) wr0Var.d().c()).f3516a) {
                                        strA = vh0Var.b;
                                        i2 = 0;
                                    } else {
                                        fza0.f10399a.getClass();
                                        i2 = 0;
                                        strA = ctf0Var3.b.a(fl70.b(fza0Var), Arrays.copyOf(new Object[0], 0));
                                    }
                                    c2 = 228;
                                    mza0Var = new mza0(fza0Var, vh0Var.f37408a, new hjm(strA, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[i2], i2))), null, 7166), new zll(pt0Var, new wll(o0sVar), a4xVarO0));
                                }
                                arrayList3.add(mza0Var);
                                it = it4;
                                i6 = 10;
                            }
                            return CollectionsKt.S(arrayList3);
                        }
                        return null;
                    case 3:
                        yza0 yza0Var = (yza0) obj;
                        yza0Var.getClass();
                        boolean z8 = yza0Var.f43506a;
                        List<vh0> list3 = yza0Var.c;
                        if (z8) {
                            return new eza0(new ijm(new qjm()), avl.f1531a);
                        }
                        if (list3 == null || list3.isEmpty()) {
                            return null;
                        }
                        fee feeVarD2 = wr0Var.d();
                        ctf0 ctf0Var4 = wr0Var.b;
                        int i10 = ((c0b0) feeVarD2.c()).f3516a ? R.drawable.category_virtual_placeholder : R.drawable.category_aggregator_placeholder;
                        hjm hjmVar = new hjm(ctf0Var4.b.a(R.string.categories, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(ctf0Var4.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166);
                        ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                        for (vh0 vh0Var2 : list3) {
                            int i11 = (int) vh0Var2.f37408a;
                            String str4 = vh0Var2.b;
                            StringBuilder sb2 = new StringBuilder(ujn.h);
                            String str5 = vh0Var2.c;
                            if (str5.length() == 0) {
                                sb2.setLength(0);
                            } else {
                                if (StringsKt.O(str5, ujn.h, false)) {
                                    i4 = 0;
                                } else if (kotlin.text.c.x(str5, "https://", false)) {
                                    i4 = 0;
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        c3 = '/';
                                    } else {
                                        c3 = '/';
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0(str5, c3));
                                }
                                sb2.setLength(i4);
                                sb2.append(str5);
                            }
                            arrayList5.add(new cvl(i11, new n0x(sb2.toString()), Integer.valueOf(i10), str4));
                        }
                        return new eza0(hjmVar, new zul(dyb.o0(arrayList5)));
                    default:
                        b0b0 b0b0Var = (b0b0) obj;
                        b0b0Var.getClass();
                        boolean z9 = b0b0Var.f1759a;
                        uhc0 uhc0Var = b0b0Var.c;
                        if (z9) {
                            return new qza0(new ijm(), gkl.f11450a, iml.f15031a);
                        }
                        if (uhc0Var != null) {
                            jic0 jic0Var = uhc0Var.b;
                            boolean z10 = jic0Var.k;
                            jic0 jic0Var2 = uhc0Var.f35671a;
                            boolean z11 = jic0Var2.k;
                            eoc0 eoc0Var = uhc0Var.c;
                            boolean z12 = eoc0Var.g;
                            boolean z13 = ((c0b0) wr0Var.d().c()).e && z12;
                            boolean z14 = z11 || z10;
                            if (z13 || z14) {
                                boolean zBooleanValue2 = ((Boolean) ((fee) wr0Var.g.getValue()).c()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                List listL0 = CollectionsKt.L0((Iterable) ((fee) wr0Var.f.getValue()).c());
                                ctf0 ctf0Var5 = wr0Var.b;
                                listL0.getClass();
                                ctf0Var5.getClass();
                                lsm0 lsm0Var = ctf0Var5.b;
                                hjm hjmVar2 = new hjm(lsm0Var.a(R.string.selection_for_you, Arrays.copyOf(new Object[0], 0)), new mjm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                                if (z13 && z12) {
                                    pz40 pz40Var3 = s6t0.f31722a;
                                    long jM95getGray0d7_KjU = StaticColors.INSTANCE.m95getGray0d7_KjU();
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str6 = zBooleanValue2 ? eoc0Var.b : eoc0Var.c;
                                    if (StringsKt.W(str6)) {
                                        str6 = eoc0Var.f8132a;
                                    }
                                    if (str6.length() == 0) {
                                        i5 = 0;
                                        sb3.setLength(0);
                                    } else {
                                        i5 = 0;
                                        if (StringsKt.O(str6, ujn.h, false)) {
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else if (kotlin.text.c.x(str6, "https://", false)) {
                                            i5 = 0;
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c4 = '/';
                                            } else {
                                                c4 = '/';
                                                sb3.append('/');
                                            }
                                            i5 = 0;
                                            sb3.append(StringsKt.y0(str6, c4));
                                        }
                                    }
                                    n0x n0xVar2 = new n0x(sb3.toString());
                                    String str7 = eoc0Var.f;
                                    String strA5 = lsm0Var.a(R.string.casino_provider_of_the_month, Arrays.copyOf(new Object[i5], i5));
                                    ckl cklVar3 = ckl.f4512a;
                                    fklVar2 = new fkl(jM95getGray0d7_KjU, n0xVar2, null, str7, strA5, dyb.g0(dkl.f6236a, dkl.b), 32);
                                } else {
                                    fklVar2 = null;
                                }
                                return new qza0(hjmVar2, fklVar2, (z11 || z10) ? new hml(z11 ? yyw.c0(jic0Var2, zBooleanValue3, listL0, nw80.b, ctf0Var5) : yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5), (z11 && z10) ? yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5) : null) : null);
                            }
                        }
                        return null;
                }
            }
        });
        this.q = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.k0b0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                int i;
                char c;
                fkl fklVar;
                pt0 pt0Var;
                int i2;
                String strA;
                char c2;
                mza0 mza0Var;
                int i3;
                boolean z;
                boolean z2;
                String strA2;
                pt0 pt0Var2;
                mtr mtrVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                int i4;
                char c3;
                fkl fklVar2;
                int i5;
                char c4;
                byte b6 = b2;
                int i6 = 10;
                wr0 wr0Var = this.b;
                switch (b6) {
                    case 0:
                        Object obj2 = null;
                        xza0 xza0Var = (xza0) obj;
                        xza0Var.getClass();
                        if (!((c0b0) wr0Var.d().c()).g) {
                            return null;
                        }
                        lq5 lq5Var = ((c0b0) wr0Var.d().c()).c;
                        Iterable<lr5> iterable = xza0Var.c;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (lr5 lr5Var : iterable) {
                            lq5 lq5Var2 = ((c0b0) wr0Var.d().c()).c;
                            int i7 = lr5Var.f20512a;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            if (lq5Var2.equals(gq5.f11714a) || lq5Var2.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var2.equals(hq5.f13470a) || lq5Var2.equals(iq5.f15191a) || lq5Var2.equals(kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var2.equals(dq5.f6497a) && !lq5Var2.equals(eq5.f8219a) && !lq5Var2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return obj2;
                                }
                                str = lr5Var.d;
                            }
                            str.getClass();
                            if (str.length() == 0) {
                                sb.setLength(0);
                            } else {
                                if (StringsKt.O(str, ujn.h, false)) {
                                    i = 0;
                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                    i = 0;
                                } else {
                                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                        c = '/';
                                    } else {
                                        c = '/';
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0(str, c));
                                }
                                sb.setLength(i);
                                sb.append(str);
                            }
                            arrayList.add(new fr5(i7, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                            obj2 = null;
                        }
                        return new dza0(lq5Var, dyb.o0(arrayList), xza0Var.f41746a);
                    case 1:
                        ctf0 ctf0Var2 = wr0Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            pz40 pz40Var = s6t0.f31722a;
                            long j = hi0.T;
                            String strA3 = ctf0Var2.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar = new m0x(R.drawable.popular_virtual_banner, null, 6);
                            ckl cklVar = ckl.f4512a;
                            fklVar = new fkl(j, m0xVar, null, strA3, null, dyb.g0(dkl.f6236a), 32);
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            long jM92getDarkPink0d7_KjU = StaticColors.INSTANCE.m92getDarkPink0d7_KjU();
                            String strA4 = ctf0Var2.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar2 = new m0x(R.drawable.aggregator_popular_banner, null, 6);
                            ckl cklVar2 = ckl.f4512a;
                            fklVar = new fkl(jM92getDarkPink0d7_KjU, m0xVar2, null, strA4, null, dyb.g0(dkl.f6236a), 32);
                        }
                        return new pza0(fklVar);
                    case 2:
                        zza0 zza0Var = (zza0) obj;
                        zza0Var.getClass();
                        fee feeVarD = wr0Var.d();
                        ctf0 ctf0Var3 = wr0Var.b;
                        int iOrdinal = ((c0b0) feeVarD.c()).d.ordinal();
                        if (iOrdinal == 0) {
                            pt0Var = pt0.f27539a;
                        } else if (iOrdinal == 1) {
                            pt0Var = pt0.b;
                        } else if (iOrdinal == 2) {
                            pt0Var = pt0.c;
                        } else {
                            if (iOrdinal != 3) {
                                if (iOrdinal == 4) {
                                    pt0Var = pt0.e;
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            pt0Var = pt0.d;
                        }
                        boolean z3 = zza0Var.f45243a;
                        o0s o0sVar = o0s.f24443a;
                        if (z3) {
                            ArrayList arrayList2 = new ArrayList(4);
                            for (int i8 = 0; i8 < 4; i8++) {
                                arrayList2.add(new mza0(fza0.c, 0L, new ijm(), new aml(pt0Var, new wll(o0sVar), true)));
                            }
                            return arrayList2;
                        }
                        List list = zza0Var.c;
                        if (list != null) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                nza0 nza0Var = (nza0) it.next();
                                List list2 = nza0Var.c;
                                fza0 fza0Var = nza0Var.b;
                                vh0 vh0Var = nza0Var.f24363a;
                                ArrayList arrayList4 = new ArrayList(r3d.q(list2, i6));
                                for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
                                    mlr mlrVar = (mlr) it2.next();
                                    boolean zBooleanValue = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                    boolean z4 = ((c0b0) wr0Var.d().c()).f3516a;
                                    Set set = (Set) ((fee) wr0Var.f.getValue()).c();
                                    long j2 = mlrVar.f22006a;
                                    Iterator it3 = it;
                                    boolean z5 = mlrVar.k;
                                    boolean zContains = set.contains(Long.valueOf(j2));
                                    int iOrdinal2 = fza0Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        i3 = 1292;
                                    } else if (iOrdinal2 == 9) {
                                        i3 = 1194;
                                    } else if (iOrdinal2 != 5) {
                                        i3 = iOrdinal2 != 6 ? 0 : 1293;
                                    } else {
                                        i3 = 1192;
                                    }
                                    Integer numValueOf = Integer.valueOf(i3);
                                    ctf0Var3.getClass();
                                    int i9 = z4 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    boolean z6 = mlrVar.j;
                                    if (z5) {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = z2 ? ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    boolean z7 = z2;
                                    long j3 = mlrVar.f22006a;
                                    String str2 = mlrVar.f;
                                    String str3 = mlrVar.e;
                                    mtr mtrVar2 = new mtr(zBooleanValue ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar = new n0x(mlrVar.g);
                                    m0x m0xVar3 = new m0x(i9, null, 6);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        mtrVar = mtrVar2;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                                            mtrVar = mtrVar2;
                                        } else {
                                            mtrVar = mtrVar2;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z) {
                                                if ((pt0Var == pt0Var4 && z7) || ((pt0Var == pt0Var2 && z7) || (pt0Var == pt0Var5 && z7))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z7) || (pt0Var == pt0Var3 && z7)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList4.add(new st0(j3, str2, str3, mtrVar, n0xVar, m0xVar3, numValueOf, murVar));
                                    it = it3;
                                }
                                Iterator it4 = it;
                                if (arrayList4.isEmpty()) {
                                    c2 = 228;
                                    mza0Var = null;
                                } else {
                                    a4x a4xVarO0 = dyb.o0(arrayList4);
                                    if (((c0b0) wr0Var.d().c()).f3516a) {
                                        strA = vh0Var.b;
                                        i2 = 0;
                                    } else {
                                        fza0.f10399a.getClass();
                                        i2 = 0;
                                        strA = ctf0Var3.b.a(fl70.b(fza0Var), Arrays.copyOf(new Object[0], 0));
                                    }
                                    c2 = 228;
                                    mza0Var = new mza0(fza0Var, vh0Var.f37408a, new hjm(strA, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[i2], i2))), null, 7166), new zll(pt0Var, new wll(o0sVar), a4xVarO0));
                                }
                                arrayList3.add(mza0Var);
                                it = it4;
                                i6 = 10;
                            }
                            return CollectionsKt.S(arrayList3);
                        }
                        return null;
                    case 3:
                        yza0 yza0Var = (yza0) obj;
                        yza0Var.getClass();
                        boolean z8 = yza0Var.f43506a;
                        List<vh0> list3 = yza0Var.c;
                        if (z8) {
                            return new eza0(new ijm(new qjm()), avl.f1531a);
                        }
                        if (list3 == null || list3.isEmpty()) {
                            return null;
                        }
                        fee feeVarD2 = wr0Var.d();
                        ctf0 ctf0Var4 = wr0Var.b;
                        int i10 = ((c0b0) feeVarD2.c()).f3516a ? R.drawable.category_virtual_placeholder : R.drawable.category_aggregator_placeholder;
                        hjm hjmVar = new hjm(ctf0Var4.b.a(R.string.categories, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(ctf0Var4.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166);
                        ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                        for (vh0 vh0Var2 : list3) {
                            int i11 = (int) vh0Var2.f37408a;
                            String str4 = vh0Var2.b;
                            StringBuilder sb2 = new StringBuilder(ujn.h);
                            String str5 = vh0Var2.c;
                            if (str5.length() == 0) {
                                sb2.setLength(0);
                            } else {
                                if (StringsKt.O(str5, ujn.h, false)) {
                                    i4 = 0;
                                } else if (kotlin.text.c.x(str5, "https://", false)) {
                                    i4 = 0;
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        c3 = '/';
                                    } else {
                                        c3 = '/';
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0(str5, c3));
                                }
                                sb2.setLength(i4);
                                sb2.append(str5);
                            }
                            arrayList5.add(new cvl(i11, new n0x(sb2.toString()), Integer.valueOf(i10), str4));
                        }
                        return new eza0(hjmVar, new zul(dyb.o0(arrayList5)));
                    default:
                        b0b0 b0b0Var = (b0b0) obj;
                        b0b0Var.getClass();
                        boolean z9 = b0b0Var.f1759a;
                        uhc0 uhc0Var = b0b0Var.c;
                        if (z9) {
                            return new qza0(new ijm(), gkl.f11450a, iml.f15031a);
                        }
                        if (uhc0Var != null) {
                            jic0 jic0Var = uhc0Var.b;
                            boolean z10 = jic0Var.k;
                            jic0 jic0Var2 = uhc0Var.f35671a;
                            boolean z11 = jic0Var2.k;
                            eoc0 eoc0Var = uhc0Var.c;
                            boolean z12 = eoc0Var.g;
                            boolean z13 = ((c0b0) wr0Var.d().c()).e && z12;
                            boolean z14 = z11 || z10;
                            if (z13 || z14) {
                                boolean zBooleanValue2 = ((Boolean) ((fee) wr0Var.g.getValue()).c()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                List listL0 = CollectionsKt.L0((Iterable) ((fee) wr0Var.f.getValue()).c());
                                ctf0 ctf0Var5 = wr0Var.b;
                                listL0.getClass();
                                ctf0Var5.getClass();
                                lsm0 lsm0Var = ctf0Var5.b;
                                hjm hjmVar2 = new hjm(lsm0Var.a(R.string.selection_for_you, Arrays.copyOf(new Object[0], 0)), new mjm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                                if (z13 && z12) {
                                    pz40 pz40Var3 = s6t0.f31722a;
                                    long jM95getGray0d7_KjU = StaticColors.INSTANCE.m95getGray0d7_KjU();
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str6 = zBooleanValue2 ? eoc0Var.b : eoc0Var.c;
                                    if (StringsKt.W(str6)) {
                                        str6 = eoc0Var.f8132a;
                                    }
                                    if (str6.length() == 0) {
                                        i5 = 0;
                                        sb3.setLength(0);
                                    } else {
                                        i5 = 0;
                                        if (StringsKt.O(str6, ujn.h, false)) {
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else if (kotlin.text.c.x(str6, "https://", false)) {
                                            i5 = 0;
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c4 = '/';
                                            } else {
                                                c4 = '/';
                                                sb3.append('/');
                                            }
                                            i5 = 0;
                                            sb3.append(StringsKt.y0(str6, c4));
                                        }
                                    }
                                    n0x n0xVar2 = new n0x(sb3.toString());
                                    String str7 = eoc0Var.f;
                                    String strA5 = lsm0Var.a(R.string.casino_provider_of_the_month, Arrays.copyOf(new Object[i5], i5));
                                    ckl cklVar3 = ckl.f4512a;
                                    fklVar2 = new fkl(jM95getGray0d7_KjU, n0xVar2, null, str7, strA5, dyb.g0(dkl.f6236a, dkl.b), 32);
                                } else {
                                    fklVar2 = null;
                                }
                                return new qza0(hjmVar2, fklVar2, (z11 || z10) ? new hml(z11 ? yyw.c0(jic0Var2, zBooleanValue3, listL0, nw80.b, ctf0Var5) : yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5), (z11 && z10) ? yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5) : null) : null);
                            }
                        }
                        return null;
                }
            }
        });
        this.r = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.k0b0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                int i;
                char c;
                fkl fklVar;
                pt0 pt0Var;
                int i2;
                String strA;
                char c2;
                mza0 mza0Var;
                int i3;
                boolean z;
                boolean z2;
                String strA2;
                pt0 pt0Var2;
                mtr mtrVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                int i4;
                char c3;
                fkl fklVar2;
                int i5;
                char c4;
                byte b6 = b3;
                int i6 = 10;
                wr0 wr0Var = this.b;
                switch (b6) {
                    case 0:
                        Object obj2 = null;
                        xza0 xza0Var = (xza0) obj;
                        xza0Var.getClass();
                        if (!((c0b0) wr0Var.d().c()).g) {
                            return null;
                        }
                        lq5 lq5Var = ((c0b0) wr0Var.d().c()).c;
                        Iterable<lr5> iterable = xza0Var.c;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (lr5 lr5Var : iterable) {
                            lq5 lq5Var2 = ((c0b0) wr0Var.d().c()).c;
                            int i7 = lr5Var.f20512a;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            if (lq5Var2.equals(gq5.f11714a) || lq5Var2.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var2.equals(hq5.f13470a) || lq5Var2.equals(iq5.f15191a) || lq5Var2.equals(kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var2.equals(dq5.f6497a) && !lq5Var2.equals(eq5.f8219a) && !lq5Var2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return obj2;
                                }
                                str = lr5Var.d;
                            }
                            str.getClass();
                            if (str.length() == 0) {
                                sb.setLength(0);
                            } else {
                                if (StringsKt.O(str, ujn.h, false)) {
                                    i = 0;
                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                    i = 0;
                                } else {
                                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                        c = '/';
                                    } else {
                                        c = '/';
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0(str, c));
                                }
                                sb.setLength(i);
                                sb.append(str);
                            }
                            arrayList.add(new fr5(i7, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                            obj2 = null;
                        }
                        return new dza0(lq5Var, dyb.o0(arrayList), xza0Var.f41746a);
                    case 1:
                        ctf0 ctf0Var2 = wr0Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            pz40 pz40Var = s6t0.f31722a;
                            long j = hi0.T;
                            String strA3 = ctf0Var2.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar = new m0x(R.drawable.popular_virtual_banner, null, 6);
                            ckl cklVar = ckl.f4512a;
                            fklVar = new fkl(j, m0xVar, null, strA3, null, dyb.g0(dkl.f6236a), 32);
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            long jM92getDarkPink0d7_KjU = StaticColors.INSTANCE.m92getDarkPink0d7_KjU();
                            String strA4 = ctf0Var2.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar2 = new m0x(R.drawable.aggregator_popular_banner, null, 6);
                            ckl cklVar2 = ckl.f4512a;
                            fklVar = new fkl(jM92getDarkPink0d7_KjU, m0xVar2, null, strA4, null, dyb.g0(dkl.f6236a), 32);
                        }
                        return new pza0(fklVar);
                    case 2:
                        zza0 zza0Var = (zza0) obj;
                        zza0Var.getClass();
                        fee feeVarD = wr0Var.d();
                        ctf0 ctf0Var3 = wr0Var.b;
                        int iOrdinal = ((c0b0) feeVarD.c()).d.ordinal();
                        if (iOrdinal == 0) {
                            pt0Var = pt0.f27539a;
                        } else if (iOrdinal == 1) {
                            pt0Var = pt0.b;
                        } else if (iOrdinal == 2) {
                            pt0Var = pt0.c;
                        } else {
                            if (iOrdinal != 3) {
                                if (iOrdinal == 4) {
                                    pt0Var = pt0.e;
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            pt0Var = pt0.d;
                        }
                        boolean z3 = zza0Var.f45243a;
                        o0s o0sVar = o0s.f24443a;
                        if (z3) {
                            ArrayList arrayList2 = new ArrayList(4);
                            for (int i8 = 0; i8 < 4; i8++) {
                                arrayList2.add(new mza0(fza0.c, 0L, new ijm(), new aml(pt0Var, new wll(o0sVar), true)));
                            }
                            return arrayList2;
                        }
                        List list = zza0Var.c;
                        if (list != null) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                nza0 nza0Var = (nza0) it.next();
                                List list2 = nza0Var.c;
                                fza0 fza0Var = nza0Var.b;
                                vh0 vh0Var = nza0Var.f24363a;
                                ArrayList arrayList4 = new ArrayList(r3d.q(list2, i6));
                                for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
                                    mlr mlrVar = (mlr) it2.next();
                                    boolean zBooleanValue = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                    boolean z4 = ((c0b0) wr0Var.d().c()).f3516a;
                                    Set set = (Set) ((fee) wr0Var.f.getValue()).c();
                                    long j2 = mlrVar.f22006a;
                                    Iterator it3 = it;
                                    boolean z5 = mlrVar.k;
                                    boolean zContains = set.contains(Long.valueOf(j2));
                                    int iOrdinal2 = fza0Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        i3 = 1292;
                                    } else if (iOrdinal2 == 9) {
                                        i3 = 1194;
                                    } else if (iOrdinal2 != 5) {
                                        i3 = iOrdinal2 != 6 ? 0 : 1293;
                                    } else {
                                        i3 = 1192;
                                    }
                                    Integer numValueOf = Integer.valueOf(i3);
                                    ctf0Var3.getClass();
                                    int i9 = z4 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    boolean z6 = mlrVar.j;
                                    if (z5) {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = z2 ? ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    boolean z7 = z2;
                                    long j3 = mlrVar.f22006a;
                                    String str2 = mlrVar.f;
                                    String str3 = mlrVar.e;
                                    mtr mtrVar2 = new mtr(zBooleanValue ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar = new n0x(mlrVar.g);
                                    m0x m0xVar3 = new m0x(i9, null, 6);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        mtrVar = mtrVar2;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                                            mtrVar = mtrVar2;
                                        } else {
                                            mtrVar = mtrVar2;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z) {
                                                if ((pt0Var == pt0Var4 && z7) || ((pt0Var == pt0Var2 && z7) || (pt0Var == pt0Var5 && z7))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z7) || (pt0Var == pt0Var3 && z7)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList4.add(new st0(j3, str2, str3, mtrVar, n0xVar, m0xVar3, numValueOf, murVar));
                                    it = it3;
                                }
                                Iterator it4 = it;
                                if (arrayList4.isEmpty()) {
                                    c2 = 228;
                                    mza0Var = null;
                                } else {
                                    a4x a4xVarO0 = dyb.o0(arrayList4);
                                    if (((c0b0) wr0Var.d().c()).f3516a) {
                                        strA = vh0Var.b;
                                        i2 = 0;
                                    } else {
                                        fza0.f10399a.getClass();
                                        i2 = 0;
                                        strA = ctf0Var3.b.a(fl70.b(fza0Var), Arrays.copyOf(new Object[0], 0));
                                    }
                                    c2 = 228;
                                    mza0Var = new mza0(fza0Var, vh0Var.f37408a, new hjm(strA, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[i2], i2))), null, 7166), new zll(pt0Var, new wll(o0sVar), a4xVarO0));
                                }
                                arrayList3.add(mza0Var);
                                it = it4;
                                i6 = 10;
                            }
                            return CollectionsKt.S(arrayList3);
                        }
                        return null;
                    case 3:
                        yza0 yza0Var = (yza0) obj;
                        yza0Var.getClass();
                        boolean z8 = yza0Var.f43506a;
                        List<vh0> list3 = yza0Var.c;
                        if (z8) {
                            return new eza0(new ijm(new qjm()), avl.f1531a);
                        }
                        if (list3 == null || list3.isEmpty()) {
                            return null;
                        }
                        fee feeVarD2 = wr0Var.d();
                        ctf0 ctf0Var4 = wr0Var.b;
                        int i10 = ((c0b0) feeVarD2.c()).f3516a ? R.drawable.category_virtual_placeholder : R.drawable.category_aggregator_placeholder;
                        hjm hjmVar = new hjm(ctf0Var4.b.a(R.string.categories, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(ctf0Var4.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166);
                        ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                        for (vh0 vh0Var2 : list3) {
                            int i11 = (int) vh0Var2.f37408a;
                            String str4 = vh0Var2.b;
                            StringBuilder sb2 = new StringBuilder(ujn.h);
                            String str5 = vh0Var2.c;
                            if (str5.length() == 0) {
                                sb2.setLength(0);
                            } else {
                                if (StringsKt.O(str5, ujn.h, false)) {
                                    i4 = 0;
                                } else if (kotlin.text.c.x(str5, "https://", false)) {
                                    i4 = 0;
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        c3 = '/';
                                    } else {
                                        c3 = '/';
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0(str5, c3));
                                }
                                sb2.setLength(i4);
                                sb2.append(str5);
                            }
                            arrayList5.add(new cvl(i11, new n0x(sb2.toString()), Integer.valueOf(i10), str4));
                        }
                        return new eza0(hjmVar, new zul(dyb.o0(arrayList5)));
                    default:
                        b0b0 b0b0Var = (b0b0) obj;
                        b0b0Var.getClass();
                        boolean z9 = b0b0Var.f1759a;
                        uhc0 uhc0Var = b0b0Var.c;
                        if (z9) {
                            return new qza0(new ijm(), gkl.f11450a, iml.f15031a);
                        }
                        if (uhc0Var != null) {
                            jic0 jic0Var = uhc0Var.b;
                            boolean z10 = jic0Var.k;
                            jic0 jic0Var2 = uhc0Var.f35671a;
                            boolean z11 = jic0Var2.k;
                            eoc0 eoc0Var = uhc0Var.c;
                            boolean z12 = eoc0Var.g;
                            boolean z13 = ((c0b0) wr0Var.d().c()).e && z12;
                            boolean z14 = z11 || z10;
                            if (z13 || z14) {
                                boolean zBooleanValue2 = ((Boolean) ((fee) wr0Var.g.getValue()).c()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                List listL0 = CollectionsKt.L0((Iterable) ((fee) wr0Var.f.getValue()).c());
                                ctf0 ctf0Var5 = wr0Var.b;
                                listL0.getClass();
                                ctf0Var5.getClass();
                                lsm0 lsm0Var = ctf0Var5.b;
                                hjm hjmVar2 = new hjm(lsm0Var.a(R.string.selection_for_you, Arrays.copyOf(new Object[0], 0)), new mjm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                                if (z13 && z12) {
                                    pz40 pz40Var3 = s6t0.f31722a;
                                    long jM95getGray0d7_KjU = StaticColors.INSTANCE.m95getGray0d7_KjU();
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str6 = zBooleanValue2 ? eoc0Var.b : eoc0Var.c;
                                    if (StringsKt.W(str6)) {
                                        str6 = eoc0Var.f8132a;
                                    }
                                    if (str6.length() == 0) {
                                        i5 = 0;
                                        sb3.setLength(0);
                                    } else {
                                        i5 = 0;
                                        if (StringsKt.O(str6, ujn.h, false)) {
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else if (kotlin.text.c.x(str6, "https://", false)) {
                                            i5 = 0;
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c4 = '/';
                                            } else {
                                                c4 = '/';
                                                sb3.append('/');
                                            }
                                            i5 = 0;
                                            sb3.append(StringsKt.y0(str6, c4));
                                        }
                                    }
                                    n0x n0xVar2 = new n0x(sb3.toString());
                                    String str7 = eoc0Var.f;
                                    String strA5 = lsm0Var.a(R.string.casino_provider_of_the_month, Arrays.copyOf(new Object[i5], i5));
                                    ckl cklVar3 = ckl.f4512a;
                                    fklVar2 = new fkl(jM95getGray0d7_KjU, n0xVar2, null, str7, strA5, dyb.g0(dkl.f6236a, dkl.b), 32);
                                } else {
                                    fklVar2 = null;
                                }
                                return new qza0(hjmVar2, fklVar2, (z11 || z10) ? new hml(z11 ? yyw.c0(jic0Var2, zBooleanValue3, listL0, nw80.b, ctf0Var5) : yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5), (z11 && z10) ? yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5) : null) : null);
                            }
                        }
                        return null;
                }
            }
        });
        this.s = bkb.G(((fee) n0o0VarH4.getValue()).d, new Function1(this) { // from class: a.k0b0
            public final /* synthetic */ wr0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                int i;
                char c;
                fkl fklVar;
                pt0 pt0Var;
                int i2;
                String strA;
                char c2;
                mza0 mza0Var;
                int i3;
                boolean z;
                boolean z2;
                String strA2;
                pt0 pt0Var2;
                mtr mtrVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                int i4;
                char c3;
                fkl fklVar2;
                int i5;
                char c4;
                byte b6 = b4;
                int i6 = 10;
                wr0 wr0Var = this.b;
                switch (b6) {
                    case 0:
                        Object obj2 = null;
                        xza0 xza0Var = (xza0) obj;
                        xza0Var.getClass();
                        if (!((c0b0) wr0Var.d().c()).g) {
                            return null;
                        }
                        lq5 lq5Var = ((c0b0) wr0Var.d().c()).c;
                        Iterable<lr5> iterable = xza0Var.c;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (lr5 lr5Var : iterable) {
                            lq5 lq5Var2 = ((c0b0) wr0Var.d().c()).c;
                            int i7 = lr5Var.f20512a;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            if (lq5Var2.equals(gq5.f11714a) || lq5Var2.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var2.equals(hq5.f13470a) || lq5Var2.equals(iq5.f15191a) || lq5Var2.equals(kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var2.equals(dq5.f6497a) && !lq5Var2.equals(eq5.f8219a) && !lq5Var2.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return obj2;
                                }
                                str = lr5Var.d;
                            }
                            str.getClass();
                            if (str.length() == 0) {
                                sb.setLength(0);
                            } else {
                                if (StringsKt.O(str, ujn.h, false)) {
                                    i = 0;
                                } else if (kotlin.text.c.x(str, "https://", false)) {
                                    i = 0;
                                } else {
                                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                        c = '/';
                                    } else {
                                        c = '/';
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0(str, c));
                                }
                                sb.setLength(i);
                                sb.append(str);
                            }
                            arrayList.add(new fr5(i7, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                            obj2 = null;
                        }
                        return new dza0(lq5Var, dyb.o0(arrayList), xza0Var.f41746a);
                    case 1:
                        ctf0 ctf0Var2 = wr0Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            pz40 pz40Var = s6t0.f31722a;
                            long j = hi0.T;
                            String strA3 = ctf0Var2.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar = new m0x(R.drawable.popular_virtual_banner, null, 6);
                            ckl cklVar = ckl.f4512a;
                            fklVar = new fkl(j, m0xVar, null, strA3, null, dyb.g0(dkl.f6236a), 32);
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            long jM92getDarkPink0d7_KjU = StaticColors.INSTANCE.m92getDarkPink0d7_KjU();
                            String strA4 = ctf0Var2.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0));
                            m0x m0xVar2 = new m0x(R.drawable.aggregator_popular_banner, null, 6);
                            ckl cklVar2 = ckl.f4512a;
                            fklVar = new fkl(jM92getDarkPink0d7_KjU, m0xVar2, null, strA4, null, dyb.g0(dkl.f6236a), 32);
                        }
                        return new pza0(fklVar);
                    case 2:
                        zza0 zza0Var = (zza0) obj;
                        zza0Var.getClass();
                        fee feeVarD = wr0Var.d();
                        ctf0 ctf0Var3 = wr0Var.b;
                        int iOrdinal = ((c0b0) feeVarD.c()).d.ordinal();
                        if (iOrdinal == 0) {
                            pt0Var = pt0.f27539a;
                        } else if (iOrdinal == 1) {
                            pt0Var = pt0.b;
                        } else if (iOrdinal == 2) {
                            pt0Var = pt0.c;
                        } else {
                            if (iOrdinal != 3) {
                                if (iOrdinal == 4) {
                                    pt0Var = pt0.e;
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            pt0Var = pt0.d;
                        }
                        boolean z3 = zza0Var.f45243a;
                        o0s o0sVar = o0s.f24443a;
                        if (z3) {
                            ArrayList arrayList2 = new ArrayList(4);
                            for (int i8 = 0; i8 < 4; i8++) {
                                arrayList2.add(new mza0(fza0.c, 0L, new ijm(), new aml(pt0Var, new wll(o0sVar), true)));
                            }
                            return arrayList2;
                        }
                        List list = zza0Var.c;
                        if (list != null) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                nza0 nza0Var = (nza0) it.next();
                                List list2 = nza0Var.c;
                                fza0 fza0Var = nza0Var.b;
                                vh0 vh0Var = nza0Var.f24363a;
                                ArrayList arrayList4 = new ArrayList(r3d.q(list2, i6));
                                for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
                                    mlr mlrVar = (mlr) it2.next();
                                    boolean zBooleanValue = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                    boolean z4 = ((c0b0) wr0Var.d().c()).f3516a;
                                    Set set = (Set) ((fee) wr0Var.f.getValue()).c();
                                    long j2 = mlrVar.f22006a;
                                    Iterator it3 = it;
                                    boolean z5 = mlrVar.k;
                                    boolean zContains = set.contains(Long.valueOf(j2));
                                    int iOrdinal2 = fza0Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        i3 = 1292;
                                    } else if (iOrdinal2 == 9) {
                                        i3 = 1194;
                                    } else if (iOrdinal2 != 5) {
                                        i3 = iOrdinal2 != 6 ? 0 : 1293;
                                    } else {
                                        i3 = 1192;
                                    }
                                    Integer numValueOf = Integer.valueOf(i3);
                                    ctf0Var3.getClass();
                                    int i9 = z4 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    boolean z6 = mlrVar.j;
                                    if (z5) {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        z2 = z6;
                                        strA2 = z2 ? ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    boolean z7 = z2;
                                    long j3 = mlrVar.f22006a;
                                    String str2 = mlrVar.f;
                                    String str3 = mlrVar.e;
                                    mtr mtrVar2 = new mtr(zBooleanValue ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar = new n0x(mlrVar.g);
                                    m0x m0xVar3 = new m0x(i9, null, 6);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        mtrVar = mtrVar2;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                                            mtrVar = mtrVar2;
                                        } else {
                                            mtrVar = mtrVar2;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z) {
                                                if ((pt0Var == pt0Var4 && z7) || ((pt0Var == pt0Var2 && z7) || (pt0Var == pt0Var5 && z7))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z7) || (pt0Var == pt0Var3 && z7)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList4.add(new st0(j3, str2, str3, mtrVar, n0xVar, m0xVar3, numValueOf, murVar));
                                    it = it3;
                                }
                                Iterator it4 = it;
                                if (arrayList4.isEmpty()) {
                                    c2 = 228;
                                    mza0Var = null;
                                } else {
                                    a4x a4xVarO0 = dyb.o0(arrayList4);
                                    if (((c0b0) wr0Var.d().c()).f3516a) {
                                        strA = vh0Var.b;
                                        i2 = 0;
                                    } else {
                                        fza0.f10399a.getClass();
                                        i2 = 0;
                                        strA = ctf0Var3.b.a(fl70.b(fza0Var), Arrays.copyOf(new Object[0], 0));
                                    }
                                    c2 = 228;
                                    mza0Var = new mza0(fza0Var, vh0Var.f37408a, new hjm(strA, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[i2], i2))), null, 7166), new zll(pt0Var, new wll(o0sVar), a4xVarO0));
                                }
                                arrayList3.add(mza0Var);
                                it = it4;
                                i6 = 10;
                            }
                            return CollectionsKt.S(arrayList3);
                        }
                        return null;
                    case 3:
                        yza0 yza0Var = (yza0) obj;
                        yza0Var.getClass();
                        boolean z8 = yza0Var.f43506a;
                        List<vh0> list3 = yza0Var.c;
                        if (z8) {
                            return new eza0(new ijm(new qjm()), avl.f1531a);
                        }
                        if (list3 == null || list3.isEmpty()) {
                            return null;
                        }
                        fee feeVarD2 = wr0Var.d();
                        ctf0 ctf0Var4 = wr0Var.b;
                        int i10 = ((c0b0) feeVarD2.c()).f3516a ? R.drawable.category_virtual_placeholder : R.drawable.category_aggregator_placeholder;
                        hjm hjmVar = new hjm(ctf0Var4.b.a(R.string.categories, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(ctf0Var4.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166);
                        ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                        for (vh0 vh0Var2 : list3) {
                            int i11 = (int) vh0Var2.f37408a;
                            String str4 = vh0Var2.b;
                            StringBuilder sb2 = new StringBuilder(ujn.h);
                            String str5 = vh0Var2.c;
                            if (str5.length() == 0) {
                                sb2.setLength(0);
                            } else {
                                if (StringsKt.O(str5, ujn.h, false)) {
                                    i4 = 0;
                                } else if (kotlin.text.c.x(str5, "https://", false)) {
                                    i4 = 0;
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        c3 = '/';
                                    } else {
                                        c3 = '/';
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0(str5, c3));
                                }
                                sb2.setLength(i4);
                                sb2.append(str5);
                            }
                            arrayList5.add(new cvl(i11, new n0x(sb2.toString()), Integer.valueOf(i10), str4));
                        }
                        return new eza0(hjmVar, new zul(dyb.o0(arrayList5)));
                    default:
                        b0b0 b0b0Var = (b0b0) obj;
                        b0b0Var.getClass();
                        boolean z9 = b0b0Var.f1759a;
                        uhc0 uhc0Var = b0b0Var.c;
                        if (z9) {
                            return new qza0(new ijm(), gkl.f11450a, iml.f15031a);
                        }
                        if (uhc0Var != null) {
                            jic0 jic0Var = uhc0Var.b;
                            boolean z10 = jic0Var.k;
                            jic0 jic0Var2 = uhc0Var.f35671a;
                            boolean z11 = jic0Var2.k;
                            eoc0 eoc0Var = uhc0Var.c;
                            boolean z12 = eoc0Var.g;
                            boolean z13 = ((c0b0) wr0Var.d().c()).e && z12;
                            boolean z14 = z11 || z10;
                            if (z13 || z14) {
                                boolean zBooleanValue2 = ((Boolean) ((fee) wr0Var.g.getValue()).c()).booleanValue();
                                boolean zBooleanValue3 = ((Boolean) ((fee) wr0Var.c.getValue()).c()).booleanValue();
                                List listL0 = CollectionsKt.L0((Iterable) ((fee) wr0Var.f.getValue()).c());
                                ctf0 ctf0Var5 = wr0Var.b;
                                listL0.getClass();
                                ctf0Var5.getClass();
                                lsm0 lsm0Var = ctf0Var5.b;
                                hjm hjmVar2 = new hjm(lsm0Var.a(R.string.selection_for_you, Arrays.copyOf(new Object[0], 0)), new mjm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                                if (z13 && z12) {
                                    pz40 pz40Var3 = s6t0.f31722a;
                                    long jM95getGray0d7_KjU = StaticColors.INSTANCE.m95getGray0d7_KjU();
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    String str6 = zBooleanValue2 ? eoc0Var.b : eoc0Var.c;
                                    if (StringsKt.W(str6)) {
                                        str6 = eoc0Var.f8132a;
                                    }
                                    if (str6.length() == 0) {
                                        i5 = 0;
                                        sb3.setLength(0);
                                    } else {
                                        i5 = 0;
                                        if (StringsKt.O(str6, ujn.h, false)) {
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else if (kotlin.text.c.x(str6, "https://", false)) {
                                            i5 = 0;
                                            sb3.setLength(i5);
                                            sb3.append(str6);
                                        } else {
                                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                c4 = '/';
                                            } else {
                                                c4 = '/';
                                                sb3.append('/');
                                            }
                                            i5 = 0;
                                            sb3.append(StringsKt.y0(str6, c4));
                                        }
                                    }
                                    n0x n0xVar2 = new n0x(sb3.toString());
                                    String str7 = eoc0Var.f;
                                    String strA5 = lsm0Var.a(R.string.casino_provider_of_the_month, Arrays.copyOf(new Object[i5], i5));
                                    ckl cklVar3 = ckl.f4512a;
                                    fklVar2 = new fkl(jM95getGray0d7_KjU, n0xVar2, null, str7, strA5, dyb.g0(dkl.f6236a, dkl.b), 32);
                                } else {
                                    fklVar2 = null;
                                }
                                return new qza0(hjmVar2, fklVar2, (z11 || z10) ? new hml(z11 ? yyw.c0(jic0Var2, zBooleanValue3, listL0, nw80.b, ctf0Var5) : yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5), (z11 && z10) ? yyw.c0(jic0Var, zBooleanValue3, listL0, nw80.f24223a, ctf0Var5) : null) : null);
                            }
                        }
                        return null;
                }
            }
        });
    }
}
