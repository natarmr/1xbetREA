package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final class jg0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f16455a;
    public final n0o0 b;
    public final lq5 c;
    public final zh0 d;
    public final cc0 e;
    public final boolean f;
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

    public jg0(hg0 hg0Var, ctf0 ctf0Var, sff0 sff0Var) {
        zh0 zh0Var;
        cc0 cc0Var;
        ctf0Var.getClass();
        this.f16455a = ctf0Var;
        kg kgVar = hg0Var.q;
        boolean z = hg0Var.i;
        this.b = maz.b(new yw9(kgVar, new b5(this), (byte) 20));
        hl1 hl1Var = sff0Var.b;
        this.c = x2x.m0(hl1Var.e);
        int iOrdinal = hl1Var.r.ordinal();
        final byte b = 4;
        final byte b2 = 3;
        final byte b3 = 2;
        final byte b4 = 1;
        if (iOrdinal == 0) {
            zh0Var = zh0.f44367a;
        } else if (iOrdinal == 1) {
            zh0Var = zh0.b;
        } else if (iOrdinal == 2) {
            zh0Var = zh0.c;
        } else if (iOrdinal == 3) {
            zh0Var = zh0.d;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                throw null;
            }
            zh0Var = zh0.e;
        }
        this.d = zh0Var;
        int iOrdinal2 = hl1Var.p.ordinal();
        if (iOrdinal2 == 0) {
            cc0Var = cc0.f4086a;
        } else if (iOrdinal2 == 1) {
            cc0Var = cc0.b;
        } else if (iOrdinal2 == 2) {
            cc0Var = cc0.c;
        } else if (iOrdinal2 == 3) {
            cc0Var = cc0.d;
        } else {
            if (iOrdinal2 != 4) {
                t9f.b();
                throw null;
            }
            cc0Var = cc0.e;
        }
        this.e = cc0Var;
        this.f = hg0Var.n;
        this.g = bkb.H(hg0Var.o);
        this.h = bkb.H(Boolean.valueOf(z));
        this.i = bkb.H(hg0Var.f);
        this.j = bkb.H(hg0Var.p);
        this.k = bkb.H(Boolean.valueOf(hg0Var.g));
        final byte b5 = 0;
        this.l = maz.b(new yw9(new Pair(Boolean.valueOf(hg0Var.j), hg0Var.b), new Function1(this) { // from class: a.ig0
            public final /* synthetic */ jg0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r14v11 */
            /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r14v13 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v13, types: [a.di0] */
            /* JADX WARN: Type inference failed for: r1v36 */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /* JADX WARN: Type inference failed for: r9v17, types: [int] */
            /* JADX WARN: Type inference failed for: r9v22 */
            /* JADX WARN: Type inference failed for: r9v26, types: [int] */
            /* JADX WARN: Type inference failed for: r9v28 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                ?? r1;
                int i;
                int i2;
                char c;
                int i3;
                int i4;
                char c2;
                String str2;
                String strC;
                byte b6 = b5;
                akl yjlVar = zjl.f44486a;
                Object bi0Var = null;
                ?? r11 = 0;
                jg0 jg0Var = this.b;
                switch (b6) {
                    case 0:
                        Pair pair = (Pair) obj;
                        pair.getClass();
                        boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                        List<lr5> list = (List) pair.b;
                        lq5 lq5Var = jg0Var.c;
                        if (zBooleanValue) {
                            return new oq5(lq5Var);
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            lr5Var.getClass();
                            lq5Var.getClass();
                            int i5 = lr5Var.f20512a;
                            if (lq5Var.equals(gq5.f11714a) || lq5Var.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var.equals(hq5.f13470a) || lq5Var.equals(iq5.f15191a) || lq5Var.equals(kq5.f18703a) || (lq5Var instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var.equals(dq5.f6497a) && !lq5Var.equals(eq5.f8219a) && !lq5Var.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str = lr5Var.d;
                            }
                            arrayList.add(new fr5(i5, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new nq5(lq5Var, dyb.r0(arrayList));
                    case 1:
                        Pair pair2 = (Pair) obj;
                        pair2.getClass();
                        boolean zBooleanValue2 = ((Boolean) pair2.f46059a).booleanValue();
                        a4x<vh0> a4xVar = (a4x) pair2.b;
                        zh0 zh0Var2 = jg0Var.d;
                        if (zBooleanValue2) {
                            r1 = ci0.f4388a;
                        } else {
                            if (!a4xVar.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar, 10));
                                for (vh0 vh0Var : a4xVar) {
                                    vh0Var.getClass();
                                    long j = vh0Var.f37408a;
                                    String str3 = vh0Var.b;
                                    List list2 = u0d.f34849a;
                                    arrayList2.add(new nh0(j, str3, u0d.q(String.format(Locale.ENGLISH, "/static/img/android/agregator/category/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)))));
                                }
                                bi0Var = new bi0(arrayList2);
                            }
                            r1 = bi0Var;
                        }
                        return new g3b(zh0Var2, r1);
                    case 2:
                        Pair pair3 = (Pair) obj;
                        pair3.getClass();
                        boolean zBooleanValue3 = ((Boolean) pair3.f46059a).booleanValue();
                        a4x a4xVar2 = (a4x) pair3.b;
                        cc0 cc0Var2 = jg0Var.e;
                        if (!zBooleanValue3) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar2, 10));
                            for (Iterator it = a4xVar2.iterator(); it.hasNext(); it = it) {
                                vh0 vh0Var2 = (vh0) it.next();
                                ctf0 ctf0Var2 = jg0Var.f16455a;
                                vh0Var2.getClass();
                                ctf0Var2.getClass();
                                long j2 = vh0Var2.f37408a;
                                String str4 = vh0Var2.b;
                                String str5 = vh0Var2.k;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String str6 = vh0Var2.d;
                                if (str6.length() == 0) {
                                    sb.setLength(0);
                                    i = 0;
                                } else {
                                    if (StringsKt.O(str6, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str6, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            i2 = 1;
                                            c = '/';
                                        } else {
                                            sb.append('/');
                                            c = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        i = 0;
                                        cArr[0] = c;
                                        sb.append(StringsKt.y0(str6, cArr));
                                    }
                                    sb.setLength(i);
                                    sb.append(str6);
                                }
                                n0x n0xVar = new n0x(sb.toString());
                                lsm0 lsm0Var = ctf0Var2.b;
                                arrayList3.add(new bkl(j2, n0xVar, str4, str5, lsm0Var.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i], i)), lsm0Var.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i], i))));
                            }
                            yjlVar = new yjl(dyb.r0(arrayList3));
                        }
                        return new b3b(cc0Var2, yjlVar);
                    case 3:
                        Pair pair4 = (Pair) obj;
                        pair4.getClass();
                        boolean zBooleanValue4 = ((Boolean) pair4.f46059a).booleanValue();
                        List<yp1> list3 = (List) pair4.b;
                        cc0 cc0Var3 = jg0Var.e;
                        if (!zBooleanValue4) {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            for (yp1 yp1Var : list3) {
                                ctf0 ctf0Var3 = jg0Var.f16455a;
                                yp1Var.getClass();
                                ctf0Var3.getClass();
                                long j3 = yp1Var.f43009a;
                                String str7 = yp1Var.b;
                                String str8 = yp1Var.c;
                                ?? sb2 = new StringBuilder(ujn.h);
                                String str9 = yp1Var.d;
                                if (str9.length() == 0) {
                                    sb2.setLength(r11);
                                    i3 = r11;
                                } else if (StringsKt.O(str9, ujn.h, r11) || kotlin.text.c.x(str9, "https://", r11)) {
                                    i3 = r11;
                                    sb2.setLength(i3);
                                    sb2.append(str9);
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        i4 = 1;
                                        c2 = '/';
                                    } else {
                                        sb2.append('/');
                                        c2 = '/';
                                        i4 = 1;
                                    }
                                    char[] cArr2 = new char[i4];
                                    cArr2[r11] = c2;
                                    sb2.append(StringsKt.y0(str9, cArr2));
                                    i3 = r11;
                                }
                                n0x n0xVar2 = new n0x(sb2.toString());
                                lsm0 lsm0Var2 = ctf0Var3.b;
                                arrayList4.add(new bkl(j3, n0xVar2, str7, str8, lsm0Var2.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i3], (int) i3)), lsm0Var2.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i3], (int) i3))));
                                r11 = 0;
                            }
                            yjlVar = new yjl(dyb.r0(arrayList4));
                        }
                        return new b3b(cc0Var3, yjlVar);
                    default:
                        n0o0 n0o0Var = jg0Var.b;
                        ctf0 ctf0Var4 = jg0Var.f16455a;
                        if (!((Boolean) obj).booleanValue()) {
                            return new xa0(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) jg0Var.j.getValue()).c();
                        if (ql5Var != null) {
                            String strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                            str2 = strA;
                        } else {
                            str2 = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str10 = strC == null ? "" : strC;
                        bi0Var = ql5Var != null ? ql5Var.f : null;
                        ?? r14 = bi0Var == null ? "" : bi0Var;
                        String strA2 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new wa0((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str10, r14, strA2, str2, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                }
            }
        }, (byte) 20));
        this.m = maz.b(new yw9(new Pair(Boolean.valueOf(hg0Var.k), hg0Var.c), new Function1(this) { // from class: a.ig0
            public final /* synthetic */ jg0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r14v11 */
            /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r14v13 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v13, types: [a.di0] */
            /* JADX WARN: Type inference failed for: r1v36 */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /* JADX WARN: Type inference failed for: r9v17, types: [int] */
            /* JADX WARN: Type inference failed for: r9v22 */
            /* JADX WARN: Type inference failed for: r9v26, types: [int] */
            /* JADX WARN: Type inference failed for: r9v28 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                ?? r1;
                int i;
                int i2;
                char c;
                int i3;
                int i4;
                char c2;
                String str2;
                String strC;
                byte b6 = b4;
                akl yjlVar = zjl.f44486a;
                Object bi0Var = null;
                ?? r11 = 0;
                jg0 jg0Var = this.b;
                switch (b6) {
                    case 0:
                        Pair pair = (Pair) obj;
                        pair.getClass();
                        boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                        List<lr5> list = (List) pair.b;
                        lq5 lq5Var = jg0Var.c;
                        if (zBooleanValue) {
                            return new oq5(lq5Var);
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            lr5Var.getClass();
                            lq5Var.getClass();
                            int i5 = lr5Var.f20512a;
                            if (lq5Var.equals(gq5.f11714a) || lq5Var.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var.equals(hq5.f13470a) || lq5Var.equals(iq5.f15191a) || lq5Var.equals(kq5.f18703a) || (lq5Var instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var.equals(dq5.f6497a) && !lq5Var.equals(eq5.f8219a) && !lq5Var.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str = lr5Var.d;
                            }
                            arrayList.add(new fr5(i5, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new nq5(lq5Var, dyb.r0(arrayList));
                    case 1:
                        Pair pair2 = (Pair) obj;
                        pair2.getClass();
                        boolean zBooleanValue2 = ((Boolean) pair2.f46059a).booleanValue();
                        a4x<vh0> a4xVar = (a4x) pair2.b;
                        zh0 zh0Var2 = jg0Var.d;
                        if (zBooleanValue2) {
                            r1 = ci0.f4388a;
                        } else {
                            if (!a4xVar.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar, 10));
                                for (vh0 vh0Var : a4xVar) {
                                    vh0Var.getClass();
                                    long j = vh0Var.f37408a;
                                    String str3 = vh0Var.b;
                                    List list2 = u0d.f34849a;
                                    arrayList2.add(new nh0(j, str3, u0d.q(String.format(Locale.ENGLISH, "/static/img/android/agregator/category/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)))));
                                }
                                bi0Var = new bi0(arrayList2);
                            }
                            r1 = bi0Var;
                        }
                        return new g3b(zh0Var2, r1);
                    case 2:
                        Pair pair3 = (Pair) obj;
                        pair3.getClass();
                        boolean zBooleanValue3 = ((Boolean) pair3.f46059a).booleanValue();
                        a4x a4xVar2 = (a4x) pair3.b;
                        cc0 cc0Var2 = jg0Var.e;
                        if (!zBooleanValue3) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar2, 10));
                            for (Iterator it = a4xVar2.iterator(); it.hasNext(); it = it) {
                                vh0 vh0Var2 = (vh0) it.next();
                                ctf0 ctf0Var2 = jg0Var.f16455a;
                                vh0Var2.getClass();
                                ctf0Var2.getClass();
                                long j2 = vh0Var2.f37408a;
                                String str4 = vh0Var2.b;
                                String str5 = vh0Var2.k;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String str6 = vh0Var2.d;
                                if (str6.length() == 0) {
                                    sb.setLength(0);
                                    i = 0;
                                } else {
                                    if (StringsKt.O(str6, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str6, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            i2 = 1;
                                            c = '/';
                                        } else {
                                            sb.append('/');
                                            c = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        i = 0;
                                        cArr[0] = c;
                                        sb.append(StringsKt.y0(str6, cArr));
                                    }
                                    sb.setLength(i);
                                    sb.append(str6);
                                }
                                n0x n0xVar = new n0x(sb.toString());
                                lsm0 lsm0Var = ctf0Var2.b;
                                arrayList3.add(new bkl(j2, n0xVar, str4, str5, lsm0Var.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i], i)), lsm0Var.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i], i))));
                            }
                            yjlVar = new yjl(dyb.r0(arrayList3));
                        }
                        return new b3b(cc0Var2, yjlVar);
                    case 3:
                        Pair pair4 = (Pair) obj;
                        pair4.getClass();
                        boolean zBooleanValue4 = ((Boolean) pair4.f46059a).booleanValue();
                        List<yp1> list3 = (List) pair4.b;
                        cc0 cc0Var3 = jg0Var.e;
                        if (!zBooleanValue4) {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            for (yp1 yp1Var : list3) {
                                ctf0 ctf0Var3 = jg0Var.f16455a;
                                yp1Var.getClass();
                                ctf0Var3.getClass();
                                long j3 = yp1Var.f43009a;
                                String str7 = yp1Var.b;
                                String str8 = yp1Var.c;
                                ?? sb2 = new StringBuilder(ujn.h);
                                String str9 = yp1Var.d;
                                if (str9.length() == 0) {
                                    sb2.setLength(r11);
                                    i3 = r11;
                                } else if (StringsKt.O(str9, ujn.h, r11) || kotlin.text.c.x(str9, "https://", r11)) {
                                    i3 = r11;
                                    sb2.setLength(i3);
                                    sb2.append(str9);
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        i4 = 1;
                                        c2 = '/';
                                    } else {
                                        sb2.append('/');
                                        c2 = '/';
                                        i4 = 1;
                                    }
                                    char[] cArr2 = new char[i4];
                                    cArr2[r11] = c2;
                                    sb2.append(StringsKt.y0(str9, cArr2));
                                    i3 = r11;
                                }
                                n0x n0xVar2 = new n0x(sb2.toString());
                                lsm0 lsm0Var2 = ctf0Var3.b;
                                arrayList4.add(new bkl(j3, n0xVar2, str7, str8, lsm0Var2.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i3], (int) i3)), lsm0Var2.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i3], (int) i3))));
                                r11 = 0;
                            }
                            yjlVar = new yjl(dyb.r0(arrayList4));
                        }
                        return new b3b(cc0Var3, yjlVar);
                    default:
                        n0o0 n0o0Var = jg0Var.b;
                        ctf0 ctf0Var4 = jg0Var.f16455a;
                        if (!((Boolean) obj).booleanValue()) {
                            return new xa0(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) jg0Var.j.getValue()).c();
                        if (ql5Var != null) {
                            String strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                            str2 = strA;
                        } else {
                            str2 = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str10 = strC == null ? "" : strC;
                        bi0Var = ql5Var != null ? ql5Var.f : null;
                        ?? r14 = bi0Var == null ? "" : bi0Var;
                        String strA2 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new wa0((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str10, r14, strA2, str2, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                }
            }
        }, (byte) 20));
        this.n = maz.b(new yw9(new Pair(Boolean.valueOf(hg0Var.l), hg0Var.d), new Function1(this) { // from class: a.ig0
            public final /* synthetic */ jg0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r14v11 */
            /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r14v13 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v13, types: [a.di0] */
            /* JADX WARN: Type inference failed for: r1v36 */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /* JADX WARN: Type inference failed for: r9v17, types: [int] */
            /* JADX WARN: Type inference failed for: r9v22 */
            /* JADX WARN: Type inference failed for: r9v26, types: [int] */
            /* JADX WARN: Type inference failed for: r9v28 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                ?? r1;
                int i;
                int i2;
                char c;
                int i3;
                int i4;
                char c2;
                String str2;
                String strC;
                byte b6 = b3;
                akl yjlVar = zjl.f44486a;
                Object bi0Var = null;
                ?? r11 = 0;
                jg0 jg0Var = this.b;
                switch (b6) {
                    case 0:
                        Pair pair = (Pair) obj;
                        pair.getClass();
                        boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                        List<lr5> list = (List) pair.b;
                        lq5 lq5Var = jg0Var.c;
                        if (zBooleanValue) {
                            return new oq5(lq5Var);
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            lr5Var.getClass();
                            lq5Var.getClass();
                            int i5 = lr5Var.f20512a;
                            if (lq5Var.equals(gq5.f11714a) || lq5Var.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var.equals(hq5.f13470a) || lq5Var.equals(iq5.f15191a) || lq5Var.equals(kq5.f18703a) || (lq5Var instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var.equals(dq5.f6497a) && !lq5Var.equals(eq5.f8219a) && !lq5Var.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str = lr5Var.d;
                            }
                            arrayList.add(new fr5(i5, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new nq5(lq5Var, dyb.r0(arrayList));
                    case 1:
                        Pair pair2 = (Pair) obj;
                        pair2.getClass();
                        boolean zBooleanValue2 = ((Boolean) pair2.f46059a).booleanValue();
                        a4x<vh0> a4xVar = (a4x) pair2.b;
                        zh0 zh0Var2 = jg0Var.d;
                        if (zBooleanValue2) {
                            r1 = ci0.f4388a;
                        } else {
                            if (!a4xVar.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar, 10));
                                for (vh0 vh0Var : a4xVar) {
                                    vh0Var.getClass();
                                    long j = vh0Var.f37408a;
                                    String str3 = vh0Var.b;
                                    List list2 = u0d.f34849a;
                                    arrayList2.add(new nh0(j, str3, u0d.q(String.format(Locale.ENGLISH, "/static/img/android/agregator/category/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)))));
                                }
                                bi0Var = new bi0(arrayList2);
                            }
                            r1 = bi0Var;
                        }
                        return new g3b(zh0Var2, r1);
                    case 2:
                        Pair pair3 = (Pair) obj;
                        pair3.getClass();
                        boolean zBooleanValue3 = ((Boolean) pair3.f46059a).booleanValue();
                        a4x a4xVar2 = (a4x) pair3.b;
                        cc0 cc0Var2 = jg0Var.e;
                        if (!zBooleanValue3) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar2, 10));
                            for (Iterator it = a4xVar2.iterator(); it.hasNext(); it = it) {
                                vh0 vh0Var2 = (vh0) it.next();
                                ctf0 ctf0Var2 = jg0Var.f16455a;
                                vh0Var2.getClass();
                                ctf0Var2.getClass();
                                long j2 = vh0Var2.f37408a;
                                String str4 = vh0Var2.b;
                                String str5 = vh0Var2.k;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String str6 = vh0Var2.d;
                                if (str6.length() == 0) {
                                    sb.setLength(0);
                                    i = 0;
                                } else {
                                    if (StringsKt.O(str6, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str6, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            i2 = 1;
                                            c = '/';
                                        } else {
                                            sb.append('/');
                                            c = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        i = 0;
                                        cArr[0] = c;
                                        sb.append(StringsKt.y0(str6, cArr));
                                    }
                                    sb.setLength(i);
                                    sb.append(str6);
                                }
                                n0x n0xVar = new n0x(sb.toString());
                                lsm0 lsm0Var = ctf0Var2.b;
                                arrayList3.add(new bkl(j2, n0xVar, str4, str5, lsm0Var.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i], i)), lsm0Var.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i], i))));
                            }
                            yjlVar = new yjl(dyb.r0(arrayList3));
                        }
                        return new b3b(cc0Var2, yjlVar);
                    case 3:
                        Pair pair4 = (Pair) obj;
                        pair4.getClass();
                        boolean zBooleanValue4 = ((Boolean) pair4.f46059a).booleanValue();
                        List<yp1> list3 = (List) pair4.b;
                        cc0 cc0Var3 = jg0Var.e;
                        if (!zBooleanValue4) {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            for (yp1 yp1Var : list3) {
                                ctf0 ctf0Var3 = jg0Var.f16455a;
                                yp1Var.getClass();
                                ctf0Var3.getClass();
                                long j3 = yp1Var.f43009a;
                                String str7 = yp1Var.b;
                                String str8 = yp1Var.c;
                                ?? sb2 = new StringBuilder(ujn.h);
                                String str9 = yp1Var.d;
                                if (str9.length() == 0) {
                                    sb2.setLength(r11);
                                    i3 = r11;
                                } else if (StringsKt.O(str9, ujn.h, r11) || kotlin.text.c.x(str9, "https://", r11)) {
                                    i3 = r11;
                                    sb2.setLength(i3);
                                    sb2.append(str9);
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        i4 = 1;
                                        c2 = '/';
                                    } else {
                                        sb2.append('/');
                                        c2 = '/';
                                        i4 = 1;
                                    }
                                    char[] cArr2 = new char[i4];
                                    cArr2[r11] = c2;
                                    sb2.append(StringsKt.y0(str9, cArr2));
                                    i3 = r11;
                                }
                                n0x n0xVar2 = new n0x(sb2.toString());
                                lsm0 lsm0Var2 = ctf0Var3.b;
                                arrayList4.add(new bkl(j3, n0xVar2, str7, str8, lsm0Var2.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i3], (int) i3)), lsm0Var2.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i3], (int) i3))));
                                r11 = 0;
                            }
                            yjlVar = new yjl(dyb.r0(arrayList4));
                        }
                        return new b3b(cc0Var3, yjlVar);
                    default:
                        n0o0 n0o0Var = jg0Var.b;
                        ctf0 ctf0Var4 = jg0Var.f16455a;
                        if (!((Boolean) obj).booleanValue()) {
                            return new xa0(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) jg0Var.j.getValue()).c();
                        if (ql5Var != null) {
                            String strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                            str2 = strA;
                        } else {
                            str2 = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str10 = strC == null ? "" : strC;
                        bi0Var = ql5Var != null ? ql5Var.f : null;
                        ?? r14 = bi0Var == null ? "" : bi0Var;
                        String strA2 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new wa0((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str10, r14, strA2, str2, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                }
            }
        }, (byte) 20));
        this.o = maz.b(new yw9(new Pair(Boolean.valueOf(hg0Var.m), hg0Var.e), new Function1(this) { // from class: a.ig0
            public final /* synthetic */ jg0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r14v11 */
            /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r14v13 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v13, types: [a.di0] */
            /* JADX WARN: Type inference failed for: r1v36 */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /* JADX WARN: Type inference failed for: r9v17, types: [int] */
            /* JADX WARN: Type inference failed for: r9v22 */
            /* JADX WARN: Type inference failed for: r9v26, types: [int] */
            /* JADX WARN: Type inference failed for: r9v28 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                ?? r1;
                int i;
                int i2;
                char c;
                int i3;
                int i4;
                char c2;
                String str2;
                String strC;
                byte b6 = b2;
                akl yjlVar = zjl.f44486a;
                Object bi0Var = null;
                ?? r11 = 0;
                jg0 jg0Var = this.b;
                switch (b6) {
                    case 0:
                        Pair pair = (Pair) obj;
                        pair.getClass();
                        boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                        List<lr5> list = (List) pair.b;
                        lq5 lq5Var = jg0Var.c;
                        if (zBooleanValue) {
                            return new oq5(lq5Var);
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            lr5Var.getClass();
                            lq5Var.getClass();
                            int i5 = lr5Var.f20512a;
                            if (lq5Var.equals(gq5.f11714a) || lq5Var.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var.equals(hq5.f13470a) || lq5Var.equals(iq5.f15191a) || lq5Var.equals(kq5.f18703a) || (lq5Var instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var.equals(dq5.f6497a) && !lq5Var.equals(eq5.f8219a) && !lq5Var.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str = lr5Var.d;
                            }
                            arrayList.add(new fr5(i5, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new nq5(lq5Var, dyb.r0(arrayList));
                    case 1:
                        Pair pair2 = (Pair) obj;
                        pair2.getClass();
                        boolean zBooleanValue2 = ((Boolean) pair2.f46059a).booleanValue();
                        a4x<vh0> a4xVar = (a4x) pair2.b;
                        zh0 zh0Var2 = jg0Var.d;
                        if (zBooleanValue2) {
                            r1 = ci0.f4388a;
                        } else {
                            if (!a4xVar.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar, 10));
                                for (vh0 vh0Var : a4xVar) {
                                    vh0Var.getClass();
                                    long j = vh0Var.f37408a;
                                    String str3 = vh0Var.b;
                                    List list2 = u0d.f34849a;
                                    arrayList2.add(new nh0(j, str3, u0d.q(String.format(Locale.ENGLISH, "/static/img/android/agregator/category/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)))));
                                }
                                bi0Var = new bi0(arrayList2);
                            }
                            r1 = bi0Var;
                        }
                        return new g3b(zh0Var2, r1);
                    case 2:
                        Pair pair3 = (Pair) obj;
                        pair3.getClass();
                        boolean zBooleanValue3 = ((Boolean) pair3.f46059a).booleanValue();
                        a4x a4xVar2 = (a4x) pair3.b;
                        cc0 cc0Var2 = jg0Var.e;
                        if (!zBooleanValue3) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar2, 10));
                            for (Iterator it = a4xVar2.iterator(); it.hasNext(); it = it) {
                                vh0 vh0Var2 = (vh0) it.next();
                                ctf0 ctf0Var2 = jg0Var.f16455a;
                                vh0Var2.getClass();
                                ctf0Var2.getClass();
                                long j2 = vh0Var2.f37408a;
                                String str4 = vh0Var2.b;
                                String str5 = vh0Var2.k;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String str6 = vh0Var2.d;
                                if (str6.length() == 0) {
                                    sb.setLength(0);
                                    i = 0;
                                } else {
                                    if (StringsKt.O(str6, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str6, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            i2 = 1;
                                            c = '/';
                                        } else {
                                            sb.append('/');
                                            c = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        i = 0;
                                        cArr[0] = c;
                                        sb.append(StringsKt.y0(str6, cArr));
                                    }
                                    sb.setLength(i);
                                    sb.append(str6);
                                }
                                n0x n0xVar = new n0x(sb.toString());
                                lsm0 lsm0Var = ctf0Var2.b;
                                arrayList3.add(new bkl(j2, n0xVar, str4, str5, lsm0Var.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i], i)), lsm0Var.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i], i))));
                            }
                            yjlVar = new yjl(dyb.r0(arrayList3));
                        }
                        return new b3b(cc0Var2, yjlVar);
                    case 3:
                        Pair pair4 = (Pair) obj;
                        pair4.getClass();
                        boolean zBooleanValue4 = ((Boolean) pair4.f46059a).booleanValue();
                        List<yp1> list3 = (List) pair4.b;
                        cc0 cc0Var3 = jg0Var.e;
                        if (!zBooleanValue4) {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            for (yp1 yp1Var : list3) {
                                ctf0 ctf0Var3 = jg0Var.f16455a;
                                yp1Var.getClass();
                                ctf0Var3.getClass();
                                long j3 = yp1Var.f43009a;
                                String str7 = yp1Var.b;
                                String str8 = yp1Var.c;
                                ?? sb2 = new StringBuilder(ujn.h);
                                String str9 = yp1Var.d;
                                if (str9.length() == 0) {
                                    sb2.setLength(r11);
                                    i3 = r11;
                                } else if (StringsKt.O(str9, ujn.h, r11) || kotlin.text.c.x(str9, "https://", r11)) {
                                    i3 = r11;
                                    sb2.setLength(i3);
                                    sb2.append(str9);
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        i4 = 1;
                                        c2 = '/';
                                    } else {
                                        sb2.append('/');
                                        c2 = '/';
                                        i4 = 1;
                                    }
                                    char[] cArr2 = new char[i4];
                                    cArr2[r11] = c2;
                                    sb2.append(StringsKt.y0(str9, cArr2));
                                    i3 = r11;
                                }
                                n0x n0xVar2 = new n0x(sb2.toString());
                                lsm0 lsm0Var2 = ctf0Var3.b;
                                arrayList4.add(new bkl(j3, n0xVar2, str7, str8, lsm0Var2.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i3], (int) i3)), lsm0Var2.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i3], (int) i3))));
                                r11 = 0;
                            }
                            yjlVar = new yjl(dyb.r0(arrayList4));
                        }
                        return new b3b(cc0Var3, yjlVar);
                    default:
                        n0o0 n0o0Var = jg0Var.b;
                        ctf0 ctf0Var4 = jg0Var.f16455a;
                        if (!((Boolean) obj).booleanValue()) {
                            return new xa0(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) jg0Var.j.getValue()).c();
                        if (ql5Var != null) {
                            String strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                            str2 = strA;
                        } else {
                            str2 = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str10 = strC == null ? "" : strC;
                        bi0Var = ql5Var != null ? ql5Var.f : null;
                        ?? r14 = bi0Var == null ? "" : bi0Var;
                        String strA2 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new wa0((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str10, r14, strA2, str2, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                }
            }
        }, (byte) 20));
        this.p = maz.b(new yw9(Boolean.valueOf(z), new Function1(this) { // from class: a.ig0
            public final /* synthetic */ jg0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r14v11 */
            /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r14v13 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v13, types: [a.di0] */
            /* JADX WARN: Type inference failed for: r1v36 */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /* JADX WARN: Type inference failed for: r9v17, types: [int] */
            /* JADX WARN: Type inference failed for: r9v22 */
            /* JADX WARN: Type inference failed for: r9v26, types: [int] */
            /* JADX WARN: Type inference failed for: r9v28 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                ?? r1;
                int i;
                int i2;
                char c;
                int i3;
                int i4;
                char c2;
                String str2;
                String strC;
                byte b6 = b;
                akl yjlVar = zjl.f44486a;
                Object bi0Var = null;
                ?? r11 = 0;
                jg0 jg0Var = this.b;
                switch (b6) {
                    case 0:
                        Pair pair = (Pair) obj;
                        pair.getClass();
                        boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                        List<lr5> list = (List) pair.b;
                        lq5 lq5Var = jg0Var.c;
                        if (zBooleanValue) {
                            return new oq5(lq5Var);
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            lr5Var.getClass();
                            lq5Var.getClass();
                            int i5 = lr5Var.f20512a;
                            if (lq5Var.equals(gq5.f11714a) || lq5Var.equals(fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (lq5Var.equals(hq5.f13470a) || lq5Var.equals(iq5.f15191a) || lq5Var.equals(kq5.f18703a) || (lq5Var instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!lq5Var.equals(dq5.f6497a) && !lq5Var.equals(eq5.f8219a) && !lq5Var.equals(cq5.f4775a)) {
                                    t9f.b();
                                    return null;
                                }
                                str = lr5Var.d;
                            }
                            arrayList.add(new fr5(i5, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new nq5(lq5Var, dyb.r0(arrayList));
                    case 1:
                        Pair pair2 = (Pair) obj;
                        pair2.getClass();
                        boolean zBooleanValue2 = ((Boolean) pair2.f46059a).booleanValue();
                        a4x<vh0> a4xVar = (a4x) pair2.b;
                        zh0 zh0Var2 = jg0Var.d;
                        if (zBooleanValue2) {
                            r1 = ci0.f4388a;
                        } else {
                            if (!a4xVar.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar, 10));
                                for (vh0 vh0Var : a4xVar) {
                                    vh0Var.getClass();
                                    long j = vh0Var.f37408a;
                                    String str3 = vh0Var.b;
                                    List list2 = u0d.f34849a;
                                    arrayList2.add(new nh0(j, str3, u0d.q(String.format(Locale.ENGLISH, "/static/img/android/agregator/category/%d.svg", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)))));
                                }
                                bi0Var = new bi0(arrayList2);
                            }
                            r1 = bi0Var;
                        }
                        return new g3b(zh0Var2, r1);
                    case 2:
                        Pair pair3 = (Pair) obj;
                        pair3.getClass();
                        boolean zBooleanValue3 = ((Boolean) pair3.f46059a).booleanValue();
                        a4x a4xVar2 = (a4x) pair3.b;
                        cc0 cc0Var2 = jg0Var.e;
                        if (!zBooleanValue3) {
                            ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar2, 10));
                            for (Iterator it = a4xVar2.iterator(); it.hasNext(); it = it) {
                                vh0 vh0Var2 = (vh0) it.next();
                                ctf0 ctf0Var2 = jg0Var.f16455a;
                                vh0Var2.getClass();
                                ctf0Var2.getClass();
                                long j2 = vh0Var2.f37408a;
                                String str4 = vh0Var2.b;
                                String str5 = vh0Var2.k;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String str6 = vh0Var2.d;
                                if (str6.length() == 0) {
                                    sb.setLength(0);
                                    i = 0;
                                } else {
                                    if (StringsKt.O(str6, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str6, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            i2 = 1;
                                            c = '/';
                                        } else {
                                            sb.append('/');
                                            c = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        i = 0;
                                        cArr[0] = c;
                                        sb.append(StringsKt.y0(str6, cArr));
                                    }
                                    sb.setLength(i);
                                    sb.append(str6);
                                }
                                n0x n0xVar = new n0x(sb.toString());
                                lsm0 lsm0Var = ctf0Var2.b;
                                arrayList3.add(new bkl(j2, n0xVar, str4, str5, lsm0Var.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i], i)), lsm0Var.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i], i))));
                            }
                            yjlVar = new yjl(dyb.r0(arrayList3));
                        }
                        return new b3b(cc0Var2, yjlVar);
                    case 3:
                        Pair pair4 = (Pair) obj;
                        pair4.getClass();
                        boolean zBooleanValue4 = ((Boolean) pair4.f46059a).booleanValue();
                        List<yp1> list3 = (List) pair4.b;
                        cc0 cc0Var3 = jg0Var.e;
                        if (!zBooleanValue4) {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            for (yp1 yp1Var : list3) {
                                ctf0 ctf0Var3 = jg0Var.f16455a;
                                yp1Var.getClass();
                                ctf0Var3.getClass();
                                long j3 = yp1Var.f43009a;
                                String str7 = yp1Var.b;
                                String str8 = yp1Var.c;
                                ?? sb2 = new StringBuilder(ujn.h);
                                String str9 = yp1Var.d;
                                if (str9.length() == 0) {
                                    sb2.setLength(r11);
                                    i3 = r11;
                                } else if (StringsKt.O(str9, ujn.h, r11) || kotlin.text.c.x(str9, "https://", r11)) {
                                    i3 = r11;
                                    sb2.setLength(i3);
                                    sb2.append(str9);
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        i4 = 1;
                                        c2 = '/';
                                    } else {
                                        sb2.append('/');
                                        c2 = '/';
                                        i4 = 1;
                                    }
                                    char[] cArr2 = new char[i4];
                                    cArr2[r11] = c2;
                                    sb2.append(StringsKt.y0(str9, cArr2));
                                    i3 = r11;
                                }
                                n0x n0xVar2 = new n0x(sb2.toString());
                                lsm0 lsm0Var2 = ctf0Var3.b;
                                arrayList4.add(new bkl(j3, n0xVar2, str7, str8, lsm0Var2.a(R.string.aggregator_category_banner_title, Arrays.copyOf(new Object[i3], (int) i3)), lsm0Var2.a(R.string.aggregator_category_banner_subtitle, Arrays.copyOf(new Object[i3], (int) i3))));
                                r11 = 0;
                            }
                            yjlVar = new yjl(dyb.r0(arrayList4));
                        }
                        return new b3b(cc0Var3, yjlVar);
                    default:
                        n0o0 n0o0Var = jg0Var.b;
                        ctf0 ctf0Var4 = jg0Var.f16455a;
                        if (!((Boolean) obj).booleanValue()) {
                            return new xa0(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) jg0Var.j.getValue()).c();
                        if (ql5Var != null) {
                            String strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                            str2 = strA;
                        } else {
                            str2 = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str10 = strC == null ? "" : strC;
                        bi0Var = ql5Var != null ? ql5Var.f : null;
                        ?? r14 = bi0Var == null ? "" : bi0Var;
                        String strA2 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new wa0((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str10, r14, strA2, str2, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                }
            }
        }, (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        hg0 hg0Var = (hg0) obj;
        hg0Var.getClass();
        ((fee) this.j.getValue()).d(hg0Var.p);
        n0o0 n0o0Var = this.g;
        ((fee) n0o0Var.getValue()).d(hg0Var.o);
        fee feeVar = (fee) this.h.getValue();
        boolean z = hg0Var.i;
        feeVar.d(Boolean.valueOf(z));
        ((fee) this.k.getValue()).d(Boolean.valueOf(hg0Var.g));
        ((fee) this.b.getValue()).d(hg0Var.q);
        n0o0 n0o0Var2 = this.l;
        ((fee) n0o0Var2.getValue()).d(new Pair(Boolean.valueOf(hg0Var.j), hg0Var.b));
        n0o0 n0o0Var3 = this.m;
        ((fee) n0o0Var3.getValue()).d(new Pair(Boolean.valueOf(hg0Var.k), hg0Var.c));
        n0o0 n0o0Var4 = this.n;
        ((fee) n0o0Var4.getValue()).d(new Pair(Boolean.valueOf(hg0Var.l), hg0Var.d));
        n0o0 n0o0Var5 = this.o;
        ((fee) n0o0Var5.getValue()).d(new Pair(Boolean.valueOf(hg0Var.m), hg0Var.e));
        n0o0 n0o0Var6 = this.p;
        ((fee) n0o0Var6.getValue()).d(Boolean.valueOf(z));
        return new kg0((String) ((fee) this.i.getValue()).c(), (mdm) ((fee) n0o0Var.getValue()).c(), (pq5) ((fee) n0o0Var2.getValue()).b(), (g3b) ((fee) n0o0Var3.getValue()).b(), this.f ? (b3b) ((fee) n0o0Var5.getValue()).b() : (b3b) ((fee) n0o0Var4.getValue()).b(), (ya0) ((fee) n0o0Var6.getValue()).b());
    }
}
