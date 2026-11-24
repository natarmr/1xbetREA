package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gv1 implements v6t0 {
    public final n0o0 A;
    public final Object B;
    public final Object C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11955a = 2;
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
    public final n0o0 t;
    public final n0o0 u;
    public final n0o0 v;
    public final n0o0 w;
    public final n0o0 x;
    public final n0o0 y;
    public final n0o0 z;

    public gv1(yu1 yu1Var, ctf0 ctf0Var, Locale locale) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.B = locale;
        this.c = bkb.H(yu1Var.c);
        qu1 qu1Var = yu1Var.d;
        this.d = bkb.H(qu1Var);
        gu1 gu1Var = yu1Var.p;
        this.e = bkb.H(gu1Var);
        this.f = bkb.H(Boolean.valueOf(yu1Var.e));
        this.g = bkb.H(yu1Var.x);
        this.h = bkb.H(yu1Var.u);
        this.i = bkb.H(Boolean.valueOf(yu1Var.m));
        this.j = bkb.H(yu1Var.n);
        this.k = bkb.H(yu1Var.o);
        this.l = bkb.H(yu1Var.q);
        this.m = bkb.H(yu1Var.v);
        this.n = bkb.H(yu1Var.w);
        this.o = bkb.H(Boolean.valueOf(yu1Var.t));
        this.p = bkb.H(yu1Var.y);
        final byte b2 = 6;
        this.q = maz.b(new yw9(qu1Var, new dj1((byte) 6), (byte) 20));
        int i = yu1Var.l;
        this.r = bkb.H(Integer.valueOf(i));
        this.s = maz.b(new yw9(gu1Var, new df1(yu1Var, this, b2), (byte) 20));
        final byte b3 = 1;
        this.t = maz.b(new yw9(yu1Var.h, new Function1(this) { // from class: a.fv1
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                pt0 pt0Var;
                String strA;
                int i2;
                nur murVar;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                boolean zEquals = dt1Var.equals(ct1.f4914a);
                gv1 gv1Var = this.b;
                xll xllVar = xll.f41078a;
                if (zEquals) {
                    return new aml(x4d0.g0((ot0) gv1Var.a().c()), xllVar, true);
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new zll(x4d0.g0((ot0) gv1Var.a().c()), xllVar, lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                Map map = (Map) ((fee) gv1Var.l.getValue()).c();
                ctf0 ctf0Var2 = gv1Var.b;
                boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                ot0 ot0Var = (ot0) gv1Var.a().c();
                map.getClass();
                ctf0Var2.getClass();
                set.getClass();
                ot0Var.getClass();
                int iOrdinal = ot0Var.ordinal();
                if (iOrdinal == 0) {
                    pt0Var = pt0.f27539a;
                } else if (iOrdinal == 1) {
                    pt0Var = pt0.b;
                } else if (iOrdinal == 2) {
                    pt0Var = pt0.c;
                } else if (iOrdinal == 3) {
                    pt0Var = pt0.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    pt0Var = pt0.e;
                }
                Collection collectionValues = map.values();
                ArrayList arrayList = new ArrayList(r3d.q(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    mlr mlrVar = (mlr) it.next();
                    long j = mlrVar.f22006a;
                    boolean z = mlrVar.k;
                    boolean zContains = set.contains(Long.valueOf(j));
                    int i3 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                    boolean z2 = mlrVar.j;
                    if (z) {
                        strA = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = z2 ? ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                    }
                    Iterator it2 = it;
                    ctf0 ctf0Var3 = ctf0Var2;
                    long j2 = mlrVar.f22006a;
                    String str = mlrVar.f;
                    String str2 = mlrVar.e;
                    if (zBooleanValue) {
                        i2 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                    } else {
                        i2 = 0;
                    }
                    mtr mtrVar = new mtr(i2, zContains);
                    n0x n0xVar2 = new n0x(mlrVar.g);
                    m0x m0xVar = new m0x(i3, null, 6);
                    if (strA.length() == 0) {
                        murVar = lur.f20686a;
                        n0xVar = n0xVar2;
                    } else {
                        pt0 pt0Var4 = pt0.f27539a;
                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                            n0xVar = n0xVar2;
                        } else {
                            n0xVar = n0xVar2;
                            pt0 pt0Var5 = pt0.d;
                            if (pt0Var != pt0Var5 || !z) {
                                if ((pt0Var == pt0Var4 && z2) || ((pt0Var == pt0Var2 && z2) || (pt0Var == pt0Var5 && z2))) {
                                    d4d d4dVar = d4d.PRIMARY;
                                    uqo0Var = new eqo0();
                                } else {
                                    pt0 pt0Var6 = pt0.b;
                                    if ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) {
                                        uqo0Var = kro0.f18776a;
                                    } else {
                                        uqo0Var = ((pt0Var == pt0Var6 && z2) || (pt0Var == pt0Var3 && z2)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                    }
                                }
                            }
                            murVar = new mur(strA, uqo0Var);
                        }
                        d4d d4dVar2 = d4d.PRIMARY;
                        uqo0Var = new lro0();
                        murVar = new mur(strA, uqo0Var);
                    }
                    arrayList.add(new st0(j2, str, str2, mtrVar, n0xVar, m0xVar, null, murVar));
                    ctf0Var2 = ctf0Var3;
                    it = it2;
                }
                return new zll(pt0Var, xllVar, arrayList);
            }

            private final Object b(Object obj) {
                Iterable iterableC;
                xw1 xw1Var;
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.e;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                if (dt1Var.equals(ct1.f4914a)) {
                    gu1 gu1Var2 = (gu1) ((fee) n0o0Var.getValue()).c();
                    if (gu1Var2 != null && gu1Var2.b != z1s0.f43637a && gu1Var2.d) {
                        return new ys1(dyb.g0(new mw1(uw1.f36373a)));
                    }
                    hrl hrlVar = hrl.f13536a;
                    return new xs1(dyb.g0(new pu1(jrl.f17007a)));
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new xs1(lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                gu1 gu1Var3 = (gu1) ((fee) n0o0Var.getValue()).c();
                if (gu1Var3 == null) {
                    return new xs1(lak0.c);
                }
                List list = (List) ((fee) gv1Var.m.getValue()).c();
                Map map = (Map) ((fee) gv1Var.n.getValue()).c();
                Set set = (Set) ((fee) gv1Var.p.getValue()).c();
                list.getClass();
                map.getClass();
                set.getClass();
                if (gu1Var3.b == z1s0.f43637a || !gu1Var3.d) {
                    z78 z78Var = gu1Var3.j;
                    if (z78Var.f43905a) {
                        iterableC = iun.f15405a;
                    } else {
                        String strR = q8a.R(z78Var.c.concat(Separators.RETURN));
                        String strR2 = q8a.R(z78Var.d);
                        if (StringsKt.u0(strR).toString().length() == 0 && strR2.length() == 0) {
                            iterableC = iun.f15405a;
                        } else {
                            String strS = z78Var.e ? q8a.S(list) : null;
                            String str = strS != null ? strS : "";
                            hrl hrlVar2 = hrl.f13536a;
                            iterableC = kotlin.collections.a.c(new pu1(new irl(z78Var.b, StringsKt.v0(strR + str + strR2).toString())));
                        }
                    }
                    return new xs1(dyb.o0(iterableC));
                }
                o98 o98Var = gu1Var3.k;
                lc00 lc00VarB = kotlin.collections.a.b();
                String strR3 = q8a.R(o98Var.f24867a);
                List<jng0> list2 = o98Var.b;
                jng0 jng0Var = (jng0) CollectionsKt.firstOrNull(list2);
                String str2 = jng0Var != null ? jng0Var.e : null;
                String strR4 = q8a.R(str2 != null ? str2 : "");
                if (strR3.length() > 0) {
                    String strS2 = q8a.S(list);
                    lc00VarB.add(new mw1(new tw1(o98Var.c, StringsKt.v0(strR3 + strS2 + strR4).toString(), new ow1(new m0x(R.drawable.ic_glyph_tournaments, null, 6)), set.contains(xr1.f41347a))));
                }
                ArrayList arrayList = new ArrayList();
                for (jng0 jng0Var2 : list2) {
                    String strR5 = q8a.R(jng0Var2.f16811a);
                    String strR6 = q8a.R(jng0Var2.e);
                    if (strR5.length() == 0 || strR6.length() == 0) {
                        xw1Var = null;
                    } else {
                        List list3 = (List) map.get(Long.valueOf(jng0Var2.b));
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        String strS3 = q8a.S(list3);
                        xw1Var = new xw1(jng0Var2.b, jng0Var2.d, jng0Var2.c, StringsKt.v0(strR5 + strS3 + strR6).toString());
                    }
                    if (xw1Var != null) {
                        arrayList.add(xw1Var);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    xw1 xw1Var2 = (xw1) next;
                    long j = xw1Var2.f41588a;
                    wr1 wr1Var = new wr1(j);
                    Date date = xw1Var2.b;
                    Date date2 = xw1Var2.c;
                    rdj rdjVar = rdj.f30294a;
                    sdj sdjVar = sdj.UNIQUE_3;
                    lc00VarB.add(new lw1(j, new tw1(kng0.l(rdj.c(rdjVar, sdjVar, date, null, 60), " - ", rdj.c(rdjVar, sdjVar, date2, null, 60)), xw1Var2.d, new pw1(String.valueOf(i3)), set.contains(wr1Var))));
                    it = it;
                    i2 = i3;
                }
                return new ys1(dyb.o0(kotlin.collections.a.a(lc00VarB)));
            }

            /* JADX WARN: Code duplicated, block: B:358:0x09c5  */
            /* JADX WARN: Code duplicated, block: B:500:0x0c58  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                lt1 lt1Var;
                gx1 gx1Var;
                int i2;
                gu1 gu1Var2;
                lsm0 lsm0Var;
                lc00 lc00Var;
                ft1 ft1Var;
                pt0 pt0Var;
                lsm0 lsm0Var2;
                String strA;
                Collection collectionJ;
                boolean z;
                mt1 mt1Var;
                String strA2;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                lc00 lc00Var2;
                zu1 zu1Var;
                List list;
                List list2;
                List listSubList;
                gu1 gu1Var3;
                ArrayList arrayList;
                Iterator it;
                Object obj2;
                List list3;
                long j;
                rrl rrlVar;
                int i3;
                kt1 kt1Var;
                jt1 jt1Var;
                int i4;
                String strA3;
                Collection collectionJ2;
                Iterable iterableD0;
                int i5;
                int i6;
                int iIntValue;
                int iNextIndex;
                int i7;
                ft1 ft1Var2;
                String strL;
                String strK;
                String str4;
                n0x n0xVar2;
                String str5;
                String strA4;
                String strA5;
                Object mu1Var;
                rr1 rr1VarP;
                byte b4 = b3;
                bt1 bt1Var = bt1.f3159a;
                at1 at1Var = at1.f1413a;
                arl arlVar = arl.f1351a;
                ct1 ct1Var = ct1.f4914a;
                gv1 gv1Var = this.b;
                switch (b4) {
                    case 0:
                        return p8a.d0((gu1) obj, s9s0.d, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 1:
                        n0o0 n0o0Var = gv1Var.j;
                        n0o0 n0o0Var2 = gv1Var.q;
                        dt1 dt1Var = (dt1) obj;
                        dt1Var.getClass();
                        boolean zEquals = dt1Var.equals(ct1Var);
                        bzw bzwVar = null;
                        int i8 = 6;
                        o0s o0sVar = o0s.f24443a;
                        if (zEquals) {
                            zu1 zu1Var2 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            et1 et1Var = new et1(zu1Var2.f44988a, ew1.f8498a);
                            lt1 lt1Var2 = new lt1(zu1Var2.b, zrl.f44860a);
                            gt1 gt1Var = new gt1(zu1Var2.c, arlVar);
                            ft1 ft1Var3 = new ft1(zu1Var2.d, jw1.f17229a);
                            mt1 mt1Var2 = new mt1(new ijm());
                            nt1 nt1Var = new nt1(new aml(x4d0.g0((ot0) gv1Var.a().c()), new wll(o0sVar), true));
                            kt1 kt1Var2 = new kt1(zu1Var2.e, mrl.f22278a);
                            jt1 jt1Var2 = new jt1(zu1Var2.f, jrl.f17007a);
                            ht1 ht1Var = new ht1(new ijm());
                            jdk0 jdk0Var = rh1.f30465a;
                            String str6 = (String) ((fee) n0o0Var.getValue()).c();
                            jdk0Var.getClass();
                            return dyb.g0(et1Var, lt1Var2, gt1Var, ft1Var3, mt1Var2, nt1Var, kt1Var2, jt1Var2, ht1Var, new it1(new col(new b0i(sh1.b, jdk0.e(str6)))));
                        }
                        if (!dt1Var.equals(at1Var)) {
                            if (dt1Var.equals(bt1Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var4 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var4 != null) {
                            ctf0 ctf0Var2 = gv1Var.b;
                            Locale locale2 = (Locale) gv1Var.B;
                            zu1 zu1Var3 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            String str7 = (String) ((fee) gv1Var.h.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                            ot0 ot0Var = (ot0) gv1Var.a().c();
                            boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                            Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                            String str8 = (String) ((fee) n0o0Var.getValue()).c();
                            ctf0Var2.getClass();
                            zu1Var3.getClass();
                            str7.getClass();
                            ot0Var.getClass();
                            set.getClass();
                            str8.getClass();
                            lc00 lc00VarB = kotlin.collections.a.b();
                            cw1 cw1Var = zu1Var3.f44988a;
                            z1s0 z1s0Var = gu1Var4.b;
                            rdj rdjVar = rdj.f30294a;
                            j88 j88Var = gu1Var4.e;
                            Set set2 = set;
                            long j2 = j88Var.e;
                            long j3 = j88Var.i;
                            zoe zoeVar = j88Var.f16071a;
                            Date dateK = rdj.k(j3);
                            Date dateK2 = rdj.k(j2);
                            Date date = new Date();
                            bw1 bw1Var = ((date.after(dateK) && date.before(dateK2)) || new Date().before(dateK)) ? bw1.f3302a : bw1.b;
                            long j4 = ((j2 - j3) * 1000) / 86400000;
                            String str9 = j88Var.g;
                            String str10 = j88Var.h;
                            int iOrdinal = cw1Var.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                o0sVar = o0sVar;
                                str = "";
                            } else {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        strA5 = eeq.R(dateK, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA5 = ctf0Var2.b.a(R.string.tournament_prize_pool_title_date_start, Arrays.copyOf(new Object[0], 0));
                                str = strA5;
                            }
                            String strS = eeq.S(dateK, ctf0Var2, cw1Var, locale2);
                            int iOrdinal2 = cw1Var.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                str2 = "";
                            } else {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        strA4 = eeq.R(dateK2, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA4 = ctf0Var2.b.a(R.string.tournament_title_date_end, Arrays.copyOf(new Object[0], 0));
                                str2 = strA4;
                            }
                            String strS2 = eeq.S(dateK2, ctf0Var2, cw1Var, locale2);
                            Object[] objArr = {Long.valueOf(j4)};
                            lsm0 lsm0Var3 = ctf0Var2.b;
                            String strA6 = lsm0Var3.a(R.string.days_v2, Arrays.copyOf(objArr, 1));
                            String strA7 = bw1Var == bw1.b ? lsm0Var3.a(R.string.end_of_tournament, Arrays.copyOf(new Object[0], 0)) : "";
                            int iOrdinal3 = cw1Var.ordinal();
                            if (iOrdinal3 == 0) {
                                str3 = "Background Picture.webp";
                            } else if (iOrdinal3 == 1) {
                                str3 = "Picture S.webp";
                            } else {
                                if (iOrdinal3 != 2) {
                                    if (iOrdinal3 == 3) {
                                        str3 = "";
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                str3 = "Dates.webp";
                            }
                            List list4 = u0d.f34849a;
                            n0x n0xVar3 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(str3)));
                            int[] iArr = iu1.f15377a;
                            lc00VarB.add(new et1(cw1Var, new dw1(bw1Var, str9, str10, str, strS, str2, strS2, strA6, strA7, n0xVar3, new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Left.webp" : ""))), new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Right.webp" : ""))))));
                            gx1 gx1Var2 = zu1Var3.b;
                            if (zoeVar.d == qpe.c) {
                                lt1Var = null;
                            } else {
                                int iOrdinal4 = gx1Var2.ordinal();
                                if (iOrdinal4 == 0) {
                                    gx1Var = gx1.f12054a;
                                } else if (iOrdinal4 == 1) {
                                    gx1Var = gx1.b;
                                } else {
                                    if (iOrdinal4 != 2) {
                                        if (iOrdinal4 == 3) {
                                            gx1Var = gx1.d;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    gx1Var = gx1.c;
                                }
                                String str11 = zoeVar.c;
                                int iOrdinal5 = gx1Var2.ordinal();
                                if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                                    i2 = R.string.day_short;
                                } else {
                                    if (iOrdinal5 != 2) {
                                        if (iOrdinal5 == 3) {
                                            i2 = R.string.day_short_2;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    i2 = R.string.days_in_case_caps;
                                }
                                String strA8 = lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0));
                                gx1 gx1Var3 = gx1.c;
                                String strA9 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.hours_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA10 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.minutes_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA11 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.seconds_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                long jCurrentTimeMillis = zoeVar.f44716a - System.currentTimeMillis();
                                lt1Var = new lt1(gx1Var, new yrl(str11, strA8, strA9, strA10, strA11, jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis));
                            }
                            if (lt1Var != null) {
                                lc00VarB.add(lt1Var);
                            }
                            gt1 gt1VarT0 = ntr.t0(gu1Var4, ctf0Var2, zu1Var3.c);
                            if (gt1VarT0 != null) {
                                lc00VarB.add(gt1VarT0);
                            }
                            gw1 gw1Var = zu1Var3.d;
                            w88 w88Var = gu1Var4.f;
                            boolean z2 = w88Var.f38710a;
                            List list5 = w88Var.c;
                            if (z2 || list5.isEmpty()) {
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = null;
                            } else {
                                String strA12 = w88Var.e;
                                if (strA12.length() == 0) {
                                    i7 = 0;
                                    strA12 = lsm0Var3.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i7 = 0;
                                }
                                String strA13 = lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[i7], i7));
                                if (list5.size() <= 5) {
                                    strA13 = null;
                                }
                                String str12 = strA13 == null ? "" : strA13;
                                boolean z3 = w88Var.b == xxb0.f41650a;
                                String strF = ctf0Var2.f(R.string.fs, new Object[0]);
                                ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                                Iterator it2 = list5.iterator();
                                int i9 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    pxb0 pxb0Var = (pxb0) next;
                                    if (z3) {
                                        String strF2 = ctf0Var2.f(R.string.place, new Object[0]);
                                        int i11 = pxb0Var.b;
                                        int i12 = pxb0Var.c;
                                        strL = i11 == i12 ? dw9.m(i11, Separators.SP, strF2) : i11 + "-" + i12 + Separators.SP + strF2;
                                    } else {
                                        ft1Var2 = ft1Var2;
                                        strL = kng0.l(ctf0Var2.f(R.string.stocks_prizes, new Object[0]), ": ", pxb0Var.h);
                                    }
                                    int i13 = pxb0Var.i;
                                    String str13 = i13 > 0 ? strF + Separators.SP + i13 : "";
                                    if (z1s0Var != z1s0.f43637a) {
                                        strK = pxb0Var.d;
                                    } else {
                                        pn40 pn40Var = pn40.f27267a;
                                        double d = pxb0Var.f;
                                        p3u0 p3u0Var = p3u0.c;
                                        strK = b1j.k("\u202a", str7, Separators.SP, pn40.l(d), "\u202c");
                                    }
                                    String str14 = strK;
                                    String str15 = pxb0Var.f27747a;
                                    int iOrdinal6 = gw1Var.ordinal();
                                    if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
                                        if (i10 == 1) {
                                            str4 = "Number_Gold.webp";
                                        } else if (i10 == 2) {
                                            str4 = "Number_Silver.webp";
                                        } else if (i10 != 3) {
                                            str4 = gw1Var == gw1.c ? "Number_Other_Star.webp" : "Number_Other.webp";
                                        } else {
                                            str4 = "Number_Bronze.webp";
                                        }
                                        List list6 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/".concat(str4)));
                                    } else {
                                        if (iOrdinal6 != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                        if (i10 == 1) {
                                            str5 = "Illustration_Gold.webp";
                                        } else if (i10 != 2) {
                                            str5 = i10 != 3 ? "Illustration_Other.webp" : "Illustration_Bronze.webp";
                                        } else {
                                            str5 = "Illustration_Silver.webp";
                                        }
                                        List list7 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/illustration/".concat(str5)));
                                    }
                                    arrayList2.add(new vv1(str15, n0xVar2, strL, str14, str13));
                                    i9 = i10;
                                    it2 = it3;
                                    lsm0Var3 = lsm0Var3;
                                    gu1Var4 = gu1Var4;
                                    lc00VarB = lc00VarB;
                                    ft1Var2 = ft1Var2;
                                }
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = new ft1(gw1Var, new iw1(dyb.o0(arrayList2), strA12, str12));
                            }
                            lc00 lc00Var3 = lc00Var;
                            if (ft1Var != null) {
                                lc00Var3.add(ft1Var);
                            }
                            gu1 gu1Var5 = gu1Var2;
                            List list8 = gu1Var5.r;
                            if (list8.isEmpty()) {
                                collectionJ = iun.f15405a;
                                lsm0Var2 = lsm0Var;
                            } else {
                                int iOrdinal7 = ot0Var.ordinal();
                                if (iOrdinal7 == 0) {
                                    pt0Var = pt0.f27539a;
                                } else if (iOrdinal7 == 1) {
                                    pt0Var = pt0.b;
                                } else if (iOrdinal7 == 2) {
                                    pt0Var = pt0.c;
                                } else if (iOrdinal7 == 3) {
                                    pt0Var = pt0.d;
                                } else {
                                    if (iOrdinal7 != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    pt0Var = pt0.e;
                                }
                                if (list8.size() == 1) {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_game, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                mt1 mt1Var3 = new mt1(new hjm(strA, null, null, null, null, null, false, null, null, false, null, null, 7166));
                                wll wllVar = new wll(o0sVar);
                                List listD0 = CollectionsKt.D0(list8, 8);
                                ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                Iterator it4 = listD0.iterator();
                                while (it4.hasNext()) {
                                    mlr mlrVar = (mlr) it4.next();
                                    long j5 = mlrVar.f22006a;
                                    boolean z4 = mlrVar.k;
                                    Set set3 = set2;
                                    boolean zContains = set3.contains(Long.valueOf(j5));
                                    int i14 = zBooleanValue ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    Iterator it5 = it4;
                                    boolean z5 = mlrVar.j;
                                    if (z4) {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = lsm0Var2.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = z ? lsm0Var2.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    set2 = set3;
                                    long j6 = mlrVar.f22006a;
                                    String str16 = mlrVar.f;
                                    String str17 = mlrVar.e;
                                    mtr mtrVar = new mtr(zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar4 = new n0x(mlrVar.g);
                                    m0x m0xVar = new m0x(i14, bzwVar, i8);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        n0xVar = n0xVar4;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z4) || (pt0Var == (pt0Var2 = pt0.c) && z4)) {
                                            n0xVar = n0xVar4;
                                        } else {
                                            n0xVar = n0xVar4;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z4) {
                                                if ((pt0Var == pt0Var4 && z) || ((pt0Var == pt0Var2 && z) || (pt0Var == pt0Var5 && z))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var3 = pt0.e) && z4)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z) || (pt0Var == pt0Var3 && z)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList3.add(new st0(j6, str16, str17, mtrVar, n0xVar, m0xVar, null, murVar));
                                    it4 = it5;
                                    mt1Var3 = mt1Var;
                                    i8 = 6;
                                    bzwVar = null;
                                }
                                collectionJ = q3d.j(mt1Var3, new nt1(new zll(pt0Var, wllVar, arrayList3)));
                            }
                            lc00Var3.addAll(collectionJ);
                            zu1 zu1Var4 = zu1Var3;
                            l5i l5iVar = zu1Var4.e;
                            List list9 = gu1Var5.l.f38767a;
                            long j7 = gu1Var5.q;
                            List list10 = gu1Var5.k.b;
                            z1s0 z1s0Var2 = z1s0.b;
                            url urlVar = url.f36169a;
                            vrl vrlVar = vrl.f37904a;
                            if (z1s0Var == z1s0Var2) {
                                if (list10.isEmpty()) {
                                    iterableD0 = iun.f15405a;
                                } else if (list10.size() <= 3) {
                                    iterableD0 = list10;
                                } else if (plc.z(gu1Var5)) {
                                    int size = list10.size();
                                    Date date2 = new Date();
                                    ListIterator listIterator = list10.listIterator(list10.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                        } else if (((jng0) listIterator.previous()).c.before(date2)) {
                                            iNextIndex = listIterator.nextIndex();
                                        }
                                    }
                                    if (iNextIndex == -1) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(list10.get(iNextIndex));
                                        for (int i15 = iNextIndex + 1; i15 < size && arrayList4.size() < 3; i15++) {
                                            arrayList4.add(list10.get(i15));
                                        }
                                        if (arrayList4.size() < 3) {
                                            int i16 = iNextIndex - 1;
                                            for (int i17 = 3; -1 < i16 && arrayList4.size() < i17; i17 = 3) {
                                                arrayList4.add(0, list10.get(i16));
                                                i16--;
                                            }
                                            iterableD0 = arrayList4;
                                        } else {
                                            int i18 = iNextIndex >= size - 2 ? size - 3 : iNextIndex > 0 ? iNextIndex : 0;
                                            iterableD0 = list10.subList(i18, i18 + 3);
                                        }
                                    }
                                } else if (list10.size() > 3) {
                                    int iOrdinal8 = j88Var.j.ordinal();
                                    if (iOrdinal8 == 0) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else if (iOrdinal8 == 1) {
                                        int size2 = list10.size();
                                        Date date3 = new Date();
                                        Iterator it6 = list10.iterator();
                                        int i19 = 0;
                                        while (true) {
                                            if (it6.hasNext()) {
                                                jng0 jng0Var = (jng0) it6.next();
                                                i5 = size2;
                                                Date date4 = jng0Var.d;
                                                Date date5 = jng0Var.c;
                                                if (!date3.after(date4) || !date3.before(date5)) {
                                                    i19++;
                                                    size2 = i5;
                                                }
                                            } else {
                                                i5 = size2;
                                                i19 = -1;
                                            }
                                        }
                                        Integer numValueOf = Integer.valueOf(i19);
                                        if (i19 < 0) {
                                            numValueOf = null;
                                        }
                                        if (numValueOf != null) {
                                            iIntValue = numValueOf.intValue();
                                        } else {
                                            Iterator it7 = list10.iterator();
                                            int i20 = 0;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    int i21 = i20;
                                                    if (((jng0) it7.next()).b == j7) {
                                                        i6 = i21;
                                                    } else {
                                                        i20 = i21 + 1;
                                                    }
                                                } else {
                                                    i6 = -1;
                                                }
                                            }
                                            Integer numValueOf2 = Integer.valueOf(i6);
                                            if (i6 < 0) {
                                                numValueOf2 = null;
                                            }
                                            iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                        }
                                        if (iIntValue >= i5 - 2) {
                                            iIntValue = i5 - 3;
                                        } else if (iIntValue <= 0) {
                                            iIntValue = 0;
                                        }
                                        iterableD0 = list10.subList(iIntValue, iIntValue + 3);
                                    } else {
                                        if (iOrdinal8 != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        iterableD0 = CollectionsKt.E0(3, list10);
                                    }
                                } else {
                                    iterableD0 = list10;
                                }
                                ArrayList arrayList5 = new ArrayList(r3d.q(iterableD0, 10));
                                Iterator it8 = iterableD0.iterator();
                                int i22 = 0;
                                while (it8.hasNext()) {
                                    Object next2 = it8.next();
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    jng0 jng0Var2 = (jng0) next2;
                                    Date date6 = new Date();
                                    Date date7 = jng0Var2.d;
                                    Iterator it9 = it8;
                                    Date date8 = jng0Var2.c;
                                    List list11 = list10;
                                    rdj rdjVar2 = rdj.f30294a;
                                    sdj sdjVar = sdj.UNIQUE_3;
                                    List list12 = list9;
                                    lc00 lc00Var4 = lc00Var3;
                                    zu1 zu1Var5 = zu1Var4;
                                    String strL2 = kng0.l(rdj.c(rdjVar2, sdjVar, date7, locale2, 28), " - ", rdj.c(rdjVar2, sdjVar, date8, locale2, 28));
                                    String strValueOf = String.valueOf(jng0Var2.b);
                                    long time = jng0Var2.d.getTime();
                                    gu1 gu1Var6 = gu1Var5;
                                    double dCurrentTimeMillis = (((System.currentTimeMillis() - time) / 1000) / ((date8.getTime() - time) / 1000)) * 100.0d;
                                    arrayList5.add(date6.before(date7) ? new rrl(strValueOf, strL2, jng0Var2.f16811a, urlVar) : (date6.after(date7) && date6.before(date8)) ? new rrl(strValueOf, strL2, null, new wrl((dCurrentTimeMillis <= 0.0d || dCurrentTimeMillis >= 1.0d) ? (int) dCurrentTimeMillis : 1, 100)) : new rrl(strValueOf, strL2, null, vrlVar));
                                    it8 = it9;
                                    list10 = list11;
                                    i22 = i23;
                                    list9 = list12;
                                    zu1Var4 = zu1Var5;
                                    gu1Var5 = gu1Var6;
                                    lc00Var3 = lc00Var4;
                                }
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                list = list10;
                                list2 = list9;
                                gu1Var3 = gu1Var5;
                                arrayList = arrayList5;
                            } else {
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                gu1 gu1Var7 = gu1Var5;
                                list = list10;
                                list2 = list9;
                                List list13 = (list2.isEmpty() || list2.size() <= 3) ? null : list2;
                                if (list13 != null) {
                                    Iterator it10 = list13.iterator();
                                    int i24 = 0;
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            i3 = -1;
                                        } else if (((fzl0) it10.next()).c == j7) {
                                            i3 = i24;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i3);
                                    if (i3 < 0) {
                                        numValueOf3 = null;
                                    }
                                    int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                    int size3 = iIntValue2 == 0 ? 0 : iIntValue2 >= list13.size() + (-2) ? list13.size() - 3 : iIntValue2 - 1;
                                    int i25 = size3 + 3;
                                    int size4 = list13.size();
                                    if (i25 > size4) {
                                        i25 = size4;
                                    }
                                    listSubList = list13.subList(size3, i25);
                                    if (listSubList == null) {
                                        listSubList = list2;
                                    }
                                } else {
                                    listSubList = list2;
                                }
                                ArrayList arrayList6 = new ArrayList(r3d.q(listSubList, 10));
                                Iterator it11 = listSubList.iterator();
                                int i26 = 0;
                                while (it11.hasNext()) {
                                    Object next3 = it11.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fzl0 fzl0Var = (fzl0) next3;
                                    gu1 gu1Var8 = gu1Var7;
                                    Iterator it12 = gu1Var8.h.f17902a.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            Object next4 = it12.next();
                                            it = it11;
                                            if (((o2g0) next4).b) {
                                                obj2 = next4;
                                            } else {
                                                it11 = it;
                                            }
                                        } else {
                                            it = it11;
                                            obj2 = null;
                                        }
                                    }
                                    o2g0 o2g0Var = (o2g0) obj2;
                                    int i28 = o2g0Var != null ? o2g0Var.d : 0;
                                    int i29 = fzl0Var.b;
                                    boolean z6 = i28 >= i29;
                                    int i30 = (int) fzl0Var.c;
                                    int i31 = (int) j7;
                                    fzl0 fzl0Var2 = (fzl0) CollectionsKt.W(i26 - 1, listSubList);
                                    int i32 = fzl0Var2 != null ? fzl0Var2.b : 0;
                                    if (i30 != i31 || !gu1Var8.c) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = i31 > i30 ? new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar) : new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, urlVar);
                                    } else if (z6) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar);
                                    } else {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), lsm0Var2.a(R.string.tournament_stage_points_left_2_v2, Arrays.copyOf(new Object[]{String.valueOf(i29 - i28)}, 1)), new wrl(i28 - i32, i29 - i32));
                                    }
                                    arrayList6.add(rrlVar);
                                    it11 = it;
                                    i26 = i27;
                                    gu1Var7 = gu1Var8;
                                    listSubList = list3;
                                    j7 = j;
                                }
                                gu1Var3 = gu1Var7;
                                arrayList = arrayList6;
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                String strA14 = lsm0Var2.a(R.string.tournament_stages, Arrays.copyOf(new Object[0], 0));
                                String strA15 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                if (z1s0Var != z1s0.b ? list2.size() <= 3 : list.size() <= 3) {
                                    strA15 = null;
                                }
                                if (strA15 == null) {
                                    strA15 = "";
                                }
                                kt1Var = new kt1(l5iVar, new lrl(dyb.o0(arrayList), strA14, strA15));
                            } else {
                                kt1Var = null;
                            }
                            lc00 lc00Var5 = lc00Var2;
                            if (kt1Var != null) {
                                lc00Var5.add(kt1Var);
                            }
                            hrl hrlVar = zu1Var.f;
                            s98 s98Var = gu1Var3.i;
                            if (s98Var.f31841a.isEmpty()) {
                                jt1Var = null;
                            } else {
                                String strA16 = s98Var.b;
                                if (strA16.length() == 0) {
                                    strA16 = lsm0Var2.a(R.string.rules_title, Arrays.copyOf(new Object[0], 0));
                                }
                                jt1Var = new jt1(hrlVar, new irl(strA16, CollectionsKt.b0(s98Var.f31841a, Separators.RETURN, null, null, null, 62)));
                            }
                            if (jt1Var != null) {
                                lc00Var5.add(jt1Var);
                            }
                            sh1 sh1Var = sh1.b;
                            rh1.f30465a.getClass();
                            b0i b0iVar = new b0i(sh1Var, jdk0.e(str8));
                            List list14 = gu1Var3.g;
                            if (list14.isEmpty()) {
                                collectionJ2 = iun.f15405a;
                            } else {
                                if (list14.size() > 8) {
                                    i4 = 0;
                                    strA3 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i4 = 0;
                                    strA3 = null;
                                }
                                ht1 ht1Var2 = new ht1(new hjm(lsm0Var2.a(R.string.providers, Arrays.copyOf(new Object[i4], i4)), null, null, null, null, null, false, null, null, false, strA3 != null ? new ue9(strA3) : null, null, 7166));
                                List<izb0> listD1 = CollectionsKt.D0(list14, 8);
                                ArrayList arrayList7 = new ArrayList(r3d.q(listD1, 10));
                                for (izb0 izb0Var : listD1) {
                                    arrayList7.add(new eol(String.valueOf(izb0Var.c), new n0x(izb0Var.f15628a), false, izb0Var.b, "-", lsm0Var2.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), null));
                                }
                                collectionJ2 = q3d.j(ht1Var2, new it1(new bol(dyb.o0(arrayList7), b0iVar)));
                            }
                            lc00Var5.addAll(collectionJ2);
                            a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00Var5));
                            if (a4xVarO0 != null) {
                                return a4xVarO0;
                            }
                        }
                        return lak0.c;
                    case 2:
                        return a(obj);
                    case 3:
                        n0o0 n0o0Var3 = gv1Var.q;
                        dt1 dt1Var2 = (dt1) obj;
                        dt1Var2.getClass();
                        if (dt1Var2.equals(ct1Var)) {
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            lc00VarB2.add(new ju1(((zu1) ((fee) n0o0Var3.getValue()).b()).c, arlVar));
                            for (int i33 = 0; i33 < 10; i33++) {
                                lc00VarB2.add(new ku1(ur1.f36143a));
                            }
                            return new mu1(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                        }
                        if (!dt1Var2.equals(at1Var)) {
                            if (dt1Var2.equals(bt1Var)) {
                                return new mu1(lak0.c);
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var9 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var9 == null) {
                            return new mu1(lak0.c);
                        }
                        ctf0 ctf0Var3 = gv1Var.b;
                        zu1 zu1Var6 = (zu1) ((fee) n0o0Var3.getValue()).b();
                        int iIntValue3 = ((Number) ((fee) gv1Var.r.getValue()).c()).intValue();
                        ctf0Var3.getClass();
                        zu1Var6.getClass();
                        gt1 gt1VarT1 = ntr.t0(gu1Var9, ctf0Var3, zu1Var6.c);
                        ju1 ju1Var = gt1VarT1 != null ? new ju1(gt1VarT1.f11859a, gt1VarT1.b) : null;
                        List<o2g0> list15 = gu1Var9.h.f17902a;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list15, 10));
                        for (o2g0 o2g0Var2 : list15) {
                            o2g0Var2.getClass();
                            String str18 = o2g0Var2.f24529a;
                            Long lT0 = StringsKt.t0(str18);
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String strA17 = ctf0Var3.b.a(R.string.tournament_points_v2, Arrays.copyOf(new Object[]{String.valueOf(o2g0Var2.d)}, 1));
                            boolean z7 = o2g0Var2.b;
                            int i34 = o2g0Var2.c;
                            switch (i34) {
                                case 1:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_one);
                                    break;
                                case 2:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_two);
                                    break;
                                case 3:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_three);
                                    break;
                                case 4:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_four);
                                    break;
                                case 5:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_five);
                                    break;
                                case 6:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_six);
                                    break;
                                case 7:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_seven);
                                    break;
                                case 8:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_eight);
                                    break;
                                case 9:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_nine);
                                    break;
                                case 10:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_ten);
                                    break;
                                default:
                                    rr1VarP = new qr1(String.valueOf(i34), z7 ? czr0.b : czr0.f5237a);
                                    break;
                            }
                            arrayList8.add(new ku1(new tr1(jLongValue, strA17, str18, z7, false, rr1VarP)));
                        }
                        if (arrayList8.isEmpty()) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.i;
                            xuzVar.getClass();
                            mu1Var = new nu1(new mdm(xuz.a(pb10Var, iIntValue3), ju1Var == null ? pdm.f26814a : pdm.c, null, 0, 0, R.string.tournament_result_not_available, 0, 0, 0L, 0L, 988), ju1Var);
                        } else {
                            mu1Var = new mu1(dyb.o0(CollectionsKt.q0(q3d.k(ju1Var), arrayList8)));
                        }
                        return mu1Var;
                    case 4:
                        return b(obj);
                    case 5:
                        return p8a.d0((gu1) obj, s9s0.f31863a, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 6:
                        return p8a.d0((gu1) obj, s9s0.b, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    default:
                        return p8a.d0((gu1) obj, s9s0.c, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                }
            }
        }, (byte) 20));
        final byte b4 = 2;
        this.u = maz.b(new yw9(yu1Var.i, new Function1(this) { // from class: a.fv1
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                pt0 pt0Var;
                String strA;
                int i2;
                nur murVar;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                boolean zEquals = dt1Var.equals(ct1.f4914a);
                gv1 gv1Var = this.b;
                xll xllVar = xll.f41078a;
                if (zEquals) {
                    return new aml(x4d0.g0((ot0) gv1Var.a().c()), xllVar, true);
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new zll(x4d0.g0((ot0) gv1Var.a().c()), xllVar, lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                Map map = (Map) ((fee) gv1Var.l.getValue()).c();
                ctf0 ctf0Var2 = gv1Var.b;
                boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                ot0 ot0Var = (ot0) gv1Var.a().c();
                map.getClass();
                ctf0Var2.getClass();
                set.getClass();
                ot0Var.getClass();
                int iOrdinal = ot0Var.ordinal();
                if (iOrdinal == 0) {
                    pt0Var = pt0.f27539a;
                } else if (iOrdinal == 1) {
                    pt0Var = pt0.b;
                } else if (iOrdinal == 2) {
                    pt0Var = pt0.c;
                } else if (iOrdinal == 3) {
                    pt0Var = pt0.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    pt0Var = pt0.e;
                }
                Collection collectionValues = map.values();
                ArrayList arrayList = new ArrayList(r3d.q(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    mlr mlrVar = (mlr) it.next();
                    long j = mlrVar.f22006a;
                    boolean z = mlrVar.k;
                    boolean zContains = set.contains(Long.valueOf(j));
                    int i3 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                    boolean z2 = mlrVar.j;
                    if (z) {
                        strA = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = z2 ? ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                    }
                    Iterator it2 = it;
                    ctf0 ctf0Var3 = ctf0Var2;
                    long j2 = mlrVar.f22006a;
                    String str = mlrVar.f;
                    String str2 = mlrVar.e;
                    if (zBooleanValue) {
                        i2 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                    } else {
                        i2 = 0;
                    }
                    mtr mtrVar = new mtr(i2, zContains);
                    n0x n0xVar2 = new n0x(mlrVar.g);
                    m0x m0xVar = new m0x(i3, null, 6);
                    if (strA.length() == 0) {
                        murVar = lur.f20686a;
                        n0xVar = n0xVar2;
                    } else {
                        pt0 pt0Var4 = pt0.f27539a;
                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                            n0xVar = n0xVar2;
                        } else {
                            n0xVar = n0xVar2;
                            pt0 pt0Var5 = pt0.d;
                            if (pt0Var != pt0Var5 || !z) {
                                if ((pt0Var == pt0Var4 && z2) || ((pt0Var == pt0Var2 && z2) || (pt0Var == pt0Var5 && z2))) {
                                    d4d d4dVar = d4d.PRIMARY;
                                    uqo0Var = new eqo0();
                                } else {
                                    pt0 pt0Var6 = pt0.b;
                                    if ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) {
                                        uqo0Var = kro0.f18776a;
                                    } else {
                                        uqo0Var = ((pt0Var == pt0Var6 && z2) || (pt0Var == pt0Var3 && z2)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                    }
                                }
                            }
                            murVar = new mur(strA, uqo0Var);
                        }
                        d4d d4dVar2 = d4d.PRIMARY;
                        uqo0Var = new lro0();
                        murVar = new mur(strA, uqo0Var);
                    }
                    arrayList.add(new st0(j2, str, str2, mtrVar, n0xVar, m0xVar, null, murVar));
                    ctf0Var2 = ctf0Var3;
                    it = it2;
                }
                return new zll(pt0Var, xllVar, arrayList);
            }

            private final Object b(Object obj) {
                Iterable iterableC;
                xw1 xw1Var;
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.e;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                if (dt1Var.equals(ct1.f4914a)) {
                    gu1 gu1Var2 = (gu1) ((fee) n0o0Var.getValue()).c();
                    if (gu1Var2 != null && gu1Var2.b != z1s0.f43637a && gu1Var2.d) {
                        return new ys1(dyb.g0(new mw1(uw1.f36373a)));
                    }
                    hrl hrlVar = hrl.f13536a;
                    return new xs1(dyb.g0(new pu1(jrl.f17007a)));
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new xs1(lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                gu1 gu1Var3 = (gu1) ((fee) n0o0Var.getValue()).c();
                if (gu1Var3 == null) {
                    return new xs1(lak0.c);
                }
                List list = (List) ((fee) gv1Var.m.getValue()).c();
                Map map = (Map) ((fee) gv1Var.n.getValue()).c();
                Set set = (Set) ((fee) gv1Var.p.getValue()).c();
                list.getClass();
                map.getClass();
                set.getClass();
                if (gu1Var3.b == z1s0.f43637a || !gu1Var3.d) {
                    z78 z78Var = gu1Var3.j;
                    if (z78Var.f43905a) {
                        iterableC = iun.f15405a;
                    } else {
                        String strR = q8a.R(z78Var.c.concat(Separators.RETURN));
                        String strR2 = q8a.R(z78Var.d);
                        if (StringsKt.u0(strR).toString().length() == 0 && strR2.length() == 0) {
                            iterableC = iun.f15405a;
                        } else {
                            String strS = z78Var.e ? q8a.S(list) : null;
                            String str = strS != null ? strS : "";
                            hrl hrlVar2 = hrl.f13536a;
                            iterableC = kotlin.collections.a.c(new pu1(new irl(z78Var.b, StringsKt.v0(strR + str + strR2).toString())));
                        }
                    }
                    return new xs1(dyb.o0(iterableC));
                }
                o98 o98Var = gu1Var3.k;
                lc00 lc00VarB = kotlin.collections.a.b();
                String strR3 = q8a.R(o98Var.f24867a);
                List<jng0> list2 = o98Var.b;
                jng0 jng0Var = (jng0) CollectionsKt.firstOrNull(list2);
                String str2 = jng0Var != null ? jng0Var.e : null;
                String strR4 = q8a.R(str2 != null ? str2 : "");
                if (strR3.length() > 0) {
                    String strS2 = q8a.S(list);
                    lc00VarB.add(new mw1(new tw1(o98Var.c, StringsKt.v0(strR3 + strS2 + strR4).toString(), new ow1(new m0x(R.drawable.ic_glyph_tournaments, null, 6)), set.contains(xr1.f41347a))));
                }
                ArrayList arrayList = new ArrayList();
                for (jng0 jng0Var2 : list2) {
                    String strR5 = q8a.R(jng0Var2.f16811a);
                    String strR6 = q8a.R(jng0Var2.e);
                    if (strR5.length() == 0 || strR6.length() == 0) {
                        xw1Var = null;
                    } else {
                        List list3 = (List) map.get(Long.valueOf(jng0Var2.b));
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        String strS3 = q8a.S(list3);
                        xw1Var = new xw1(jng0Var2.b, jng0Var2.d, jng0Var2.c, StringsKt.v0(strR5 + strS3 + strR6).toString());
                    }
                    if (xw1Var != null) {
                        arrayList.add(xw1Var);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    xw1 xw1Var2 = (xw1) next;
                    long j = xw1Var2.f41588a;
                    wr1 wr1Var = new wr1(j);
                    Date date = xw1Var2.b;
                    Date date2 = xw1Var2.c;
                    rdj rdjVar = rdj.f30294a;
                    sdj sdjVar = sdj.UNIQUE_3;
                    lc00VarB.add(new lw1(j, new tw1(kng0.l(rdj.c(rdjVar, sdjVar, date, null, 60), " - ", rdj.c(rdjVar, sdjVar, date2, null, 60)), xw1Var2.d, new pw1(String.valueOf(i3)), set.contains(wr1Var))));
                    it = it;
                    i2 = i3;
                }
                return new ys1(dyb.o0(kotlin.collections.a.a(lc00VarB)));
            }

            /* JADX WARN: Code duplicated, block: B:358:0x09c5  */
            /* JADX WARN: Code duplicated, block: B:500:0x0c58  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                lt1 lt1Var;
                gx1 gx1Var;
                int i2;
                gu1 gu1Var2;
                lsm0 lsm0Var;
                lc00 lc00Var;
                ft1 ft1Var;
                pt0 pt0Var;
                lsm0 lsm0Var2;
                String strA;
                Collection collectionJ;
                boolean z;
                mt1 mt1Var;
                String strA2;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                lc00 lc00Var2;
                zu1 zu1Var;
                List list;
                List list2;
                List listSubList;
                gu1 gu1Var3;
                ArrayList arrayList;
                Iterator it;
                Object obj2;
                List list3;
                long j;
                rrl rrlVar;
                int i3;
                kt1 kt1Var;
                jt1 jt1Var;
                int i4;
                String strA3;
                Collection collectionJ2;
                Iterable iterableD0;
                int i5;
                int i6;
                int iIntValue;
                int iNextIndex;
                int i7;
                ft1 ft1Var2;
                String strL;
                String strK;
                String str4;
                n0x n0xVar2;
                String str5;
                String strA4;
                String strA5;
                Object mu1Var;
                rr1 rr1VarP;
                byte b5 = b4;
                bt1 bt1Var = bt1.f3159a;
                at1 at1Var = at1.f1413a;
                arl arlVar = arl.f1351a;
                ct1 ct1Var = ct1.f4914a;
                gv1 gv1Var = this.b;
                switch (b5) {
                    case 0:
                        return p8a.d0((gu1) obj, s9s0.d, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 1:
                        n0o0 n0o0Var = gv1Var.j;
                        n0o0 n0o0Var2 = gv1Var.q;
                        dt1 dt1Var = (dt1) obj;
                        dt1Var.getClass();
                        boolean zEquals = dt1Var.equals(ct1Var);
                        bzw bzwVar = null;
                        int i8 = 6;
                        o0s o0sVar = o0s.f24443a;
                        if (zEquals) {
                            zu1 zu1Var2 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            et1 et1Var = new et1(zu1Var2.f44988a, ew1.f8498a);
                            lt1 lt1Var2 = new lt1(zu1Var2.b, zrl.f44860a);
                            gt1 gt1Var = new gt1(zu1Var2.c, arlVar);
                            ft1 ft1Var3 = new ft1(zu1Var2.d, jw1.f17229a);
                            mt1 mt1Var2 = new mt1(new ijm());
                            nt1 nt1Var = new nt1(new aml(x4d0.g0((ot0) gv1Var.a().c()), new wll(o0sVar), true));
                            kt1 kt1Var2 = new kt1(zu1Var2.e, mrl.f22278a);
                            jt1 jt1Var2 = new jt1(zu1Var2.f, jrl.f17007a);
                            ht1 ht1Var = new ht1(new ijm());
                            jdk0 jdk0Var = rh1.f30465a;
                            String str6 = (String) ((fee) n0o0Var.getValue()).c();
                            jdk0Var.getClass();
                            return dyb.g0(et1Var, lt1Var2, gt1Var, ft1Var3, mt1Var2, nt1Var, kt1Var2, jt1Var2, ht1Var, new it1(new col(new b0i(sh1.b, jdk0.e(str6)))));
                        }
                        if (!dt1Var.equals(at1Var)) {
                            if (dt1Var.equals(bt1Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var4 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var4 != null) {
                            ctf0 ctf0Var2 = gv1Var.b;
                            Locale locale2 = (Locale) gv1Var.B;
                            zu1 zu1Var3 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            String str7 = (String) ((fee) gv1Var.h.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                            ot0 ot0Var = (ot0) gv1Var.a().c();
                            boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                            Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                            String str8 = (String) ((fee) n0o0Var.getValue()).c();
                            ctf0Var2.getClass();
                            zu1Var3.getClass();
                            str7.getClass();
                            ot0Var.getClass();
                            set.getClass();
                            str8.getClass();
                            lc00 lc00VarB = kotlin.collections.a.b();
                            cw1 cw1Var = zu1Var3.f44988a;
                            z1s0 z1s0Var = gu1Var4.b;
                            rdj rdjVar = rdj.f30294a;
                            j88 j88Var = gu1Var4.e;
                            Set set2 = set;
                            long j2 = j88Var.e;
                            long j3 = j88Var.i;
                            zoe zoeVar = j88Var.f16071a;
                            Date dateK = rdj.k(j3);
                            Date dateK2 = rdj.k(j2);
                            Date date = new Date();
                            bw1 bw1Var = ((date.after(dateK) && date.before(dateK2)) || new Date().before(dateK)) ? bw1.f3302a : bw1.b;
                            long j4 = ((j2 - j3) * 1000) / 86400000;
                            String str9 = j88Var.g;
                            String str10 = j88Var.h;
                            int iOrdinal = cw1Var.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                o0sVar = o0sVar;
                                str = "";
                            } else {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        strA5 = eeq.R(dateK, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA5 = ctf0Var2.b.a(R.string.tournament_prize_pool_title_date_start, Arrays.copyOf(new Object[0], 0));
                                str = strA5;
                            }
                            String strS = eeq.S(dateK, ctf0Var2, cw1Var, locale2);
                            int iOrdinal2 = cw1Var.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                str2 = "";
                            } else {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        strA4 = eeq.R(dateK2, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA4 = ctf0Var2.b.a(R.string.tournament_title_date_end, Arrays.copyOf(new Object[0], 0));
                                str2 = strA4;
                            }
                            String strS2 = eeq.S(dateK2, ctf0Var2, cw1Var, locale2);
                            Object[] objArr = {Long.valueOf(j4)};
                            lsm0 lsm0Var3 = ctf0Var2.b;
                            String strA6 = lsm0Var3.a(R.string.days_v2, Arrays.copyOf(objArr, 1));
                            String strA7 = bw1Var == bw1.b ? lsm0Var3.a(R.string.end_of_tournament, Arrays.copyOf(new Object[0], 0)) : "";
                            int iOrdinal3 = cw1Var.ordinal();
                            if (iOrdinal3 == 0) {
                                str3 = "Background Picture.webp";
                            } else if (iOrdinal3 == 1) {
                                str3 = "Picture S.webp";
                            } else {
                                if (iOrdinal3 != 2) {
                                    if (iOrdinal3 == 3) {
                                        str3 = "";
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                str3 = "Dates.webp";
                            }
                            List list4 = u0d.f34849a;
                            n0x n0xVar3 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(str3)));
                            int[] iArr = iu1.f15377a;
                            lc00VarB.add(new et1(cw1Var, new dw1(bw1Var, str9, str10, str, strS, str2, strS2, strA6, strA7, n0xVar3, new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Left.webp" : ""))), new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Right.webp" : ""))))));
                            gx1 gx1Var2 = zu1Var3.b;
                            if (zoeVar.d == qpe.c) {
                                lt1Var = null;
                            } else {
                                int iOrdinal4 = gx1Var2.ordinal();
                                if (iOrdinal4 == 0) {
                                    gx1Var = gx1.f12054a;
                                } else if (iOrdinal4 == 1) {
                                    gx1Var = gx1.b;
                                } else {
                                    if (iOrdinal4 != 2) {
                                        if (iOrdinal4 == 3) {
                                            gx1Var = gx1.d;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    gx1Var = gx1.c;
                                }
                                String str11 = zoeVar.c;
                                int iOrdinal5 = gx1Var2.ordinal();
                                if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                                    i2 = R.string.day_short;
                                } else {
                                    if (iOrdinal5 != 2) {
                                        if (iOrdinal5 == 3) {
                                            i2 = R.string.day_short_2;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    i2 = R.string.days_in_case_caps;
                                }
                                String strA8 = lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0));
                                gx1 gx1Var3 = gx1.c;
                                String strA9 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.hours_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA10 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.minutes_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA11 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.seconds_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                long jCurrentTimeMillis = zoeVar.f44716a - System.currentTimeMillis();
                                lt1Var = new lt1(gx1Var, new yrl(str11, strA8, strA9, strA10, strA11, jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis));
                            }
                            if (lt1Var != null) {
                                lc00VarB.add(lt1Var);
                            }
                            gt1 gt1VarT0 = ntr.t0(gu1Var4, ctf0Var2, zu1Var3.c);
                            if (gt1VarT0 != null) {
                                lc00VarB.add(gt1VarT0);
                            }
                            gw1 gw1Var = zu1Var3.d;
                            w88 w88Var = gu1Var4.f;
                            boolean z2 = w88Var.f38710a;
                            List list5 = w88Var.c;
                            if (z2 || list5.isEmpty()) {
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = null;
                            } else {
                                String strA12 = w88Var.e;
                                if (strA12.length() == 0) {
                                    i7 = 0;
                                    strA12 = lsm0Var3.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i7 = 0;
                                }
                                String strA13 = lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[i7], i7));
                                if (list5.size() <= 5) {
                                    strA13 = null;
                                }
                                String str12 = strA13 == null ? "" : strA13;
                                boolean z3 = w88Var.b == xxb0.f41650a;
                                String strF = ctf0Var2.f(R.string.fs, new Object[0]);
                                ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                                Iterator it2 = list5.iterator();
                                int i9 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    pxb0 pxb0Var = (pxb0) next;
                                    if (z3) {
                                        String strF2 = ctf0Var2.f(R.string.place, new Object[0]);
                                        int i11 = pxb0Var.b;
                                        int i12 = pxb0Var.c;
                                        strL = i11 == i12 ? dw9.m(i11, Separators.SP, strF2) : i11 + "-" + i12 + Separators.SP + strF2;
                                    } else {
                                        ft1Var2 = ft1Var2;
                                        strL = kng0.l(ctf0Var2.f(R.string.stocks_prizes, new Object[0]), ": ", pxb0Var.h);
                                    }
                                    int i13 = pxb0Var.i;
                                    String str13 = i13 > 0 ? strF + Separators.SP + i13 : "";
                                    if (z1s0Var != z1s0.f43637a) {
                                        strK = pxb0Var.d;
                                    } else {
                                        pn40 pn40Var = pn40.f27267a;
                                        double d = pxb0Var.f;
                                        p3u0 p3u0Var = p3u0.c;
                                        strK = b1j.k("\u202a", str7, Separators.SP, pn40.l(d), "\u202c");
                                    }
                                    String str14 = strK;
                                    String str15 = pxb0Var.f27747a;
                                    int iOrdinal6 = gw1Var.ordinal();
                                    if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
                                        if (i10 == 1) {
                                            str4 = "Number_Gold.webp";
                                        } else if (i10 == 2) {
                                            str4 = "Number_Silver.webp";
                                        } else if (i10 != 3) {
                                            str4 = gw1Var == gw1.c ? "Number_Other_Star.webp" : "Number_Other.webp";
                                        } else {
                                            str4 = "Number_Bronze.webp";
                                        }
                                        List list6 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/".concat(str4)));
                                    } else {
                                        if (iOrdinal6 != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                        if (i10 == 1) {
                                            str5 = "Illustration_Gold.webp";
                                        } else if (i10 != 2) {
                                            str5 = i10 != 3 ? "Illustration_Other.webp" : "Illustration_Bronze.webp";
                                        } else {
                                            str5 = "Illustration_Silver.webp";
                                        }
                                        List list7 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/illustration/".concat(str5)));
                                    }
                                    arrayList2.add(new vv1(str15, n0xVar2, strL, str14, str13));
                                    i9 = i10;
                                    it2 = it3;
                                    lsm0Var3 = lsm0Var3;
                                    gu1Var4 = gu1Var4;
                                    lc00VarB = lc00VarB;
                                    ft1Var2 = ft1Var2;
                                }
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = new ft1(gw1Var, new iw1(dyb.o0(arrayList2), strA12, str12));
                            }
                            lc00 lc00Var3 = lc00Var;
                            if (ft1Var != null) {
                                lc00Var3.add(ft1Var);
                            }
                            gu1 gu1Var5 = gu1Var2;
                            List list8 = gu1Var5.r;
                            if (list8.isEmpty()) {
                                collectionJ = iun.f15405a;
                                lsm0Var2 = lsm0Var;
                            } else {
                                int iOrdinal7 = ot0Var.ordinal();
                                if (iOrdinal7 == 0) {
                                    pt0Var = pt0.f27539a;
                                } else if (iOrdinal7 == 1) {
                                    pt0Var = pt0.b;
                                } else if (iOrdinal7 == 2) {
                                    pt0Var = pt0.c;
                                } else if (iOrdinal7 == 3) {
                                    pt0Var = pt0.d;
                                } else {
                                    if (iOrdinal7 != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    pt0Var = pt0.e;
                                }
                                if (list8.size() == 1) {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_game, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                mt1 mt1Var3 = new mt1(new hjm(strA, null, null, null, null, null, false, null, null, false, null, null, 7166));
                                wll wllVar = new wll(o0sVar);
                                List listD0 = CollectionsKt.D0(list8, 8);
                                ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                Iterator it4 = listD0.iterator();
                                while (it4.hasNext()) {
                                    mlr mlrVar = (mlr) it4.next();
                                    long j5 = mlrVar.f22006a;
                                    boolean z4 = mlrVar.k;
                                    Set set3 = set2;
                                    boolean zContains = set3.contains(Long.valueOf(j5));
                                    int i14 = zBooleanValue ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    Iterator it5 = it4;
                                    boolean z5 = mlrVar.j;
                                    if (z4) {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = lsm0Var2.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = z ? lsm0Var2.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    set2 = set3;
                                    long j6 = mlrVar.f22006a;
                                    String str16 = mlrVar.f;
                                    String str17 = mlrVar.e;
                                    mtr mtrVar = new mtr(zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar4 = new n0x(mlrVar.g);
                                    m0x m0xVar = new m0x(i14, bzwVar, i8);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        n0xVar = n0xVar4;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z4) || (pt0Var == (pt0Var2 = pt0.c) && z4)) {
                                            n0xVar = n0xVar4;
                                        } else {
                                            n0xVar = n0xVar4;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z4) {
                                                if ((pt0Var == pt0Var4 && z) || ((pt0Var == pt0Var2 && z) || (pt0Var == pt0Var5 && z))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var3 = pt0.e) && z4)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z) || (pt0Var == pt0Var3 && z)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList3.add(new st0(j6, str16, str17, mtrVar, n0xVar, m0xVar, null, murVar));
                                    it4 = it5;
                                    mt1Var3 = mt1Var;
                                    i8 = 6;
                                    bzwVar = null;
                                }
                                collectionJ = q3d.j(mt1Var3, new nt1(new zll(pt0Var, wllVar, arrayList3)));
                            }
                            lc00Var3.addAll(collectionJ);
                            zu1 zu1Var4 = zu1Var3;
                            l5i l5iVar = zu1Var4.e;
                            List list9 = gu1Var5.l.f38767a;
                            long j7 = gu1Var5.q;
                            List list10 = gu1Var5.k.b;
                            z1s0 z1s0Var2 = z1s0.b;
                            url urlVar = url.f36169a;
                            vrl vrlVar = vrl.f37904a;
                            if (z1s0Var == z1s0Var2) {
                                if (list10.isEmpty()) {
                                    iterableD0 = iun.f15405a;
                                } else if (list10.size() <= 3) {
                                    iterableD0 = list10;
                                } else if (plc.z(gu1Var5)) {
                                    int size = list10.size();
                                    Date date2 = new Date();
                                    ListIterator listIterator = list10.listIterator(list10.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                        } else if (((jng0) listIterator.previous()).c.before(date2)) {
                                            iNextIndex = listIterator.nextIndex();
                                        }
                                    }
                                    if (iNextIndex == -1) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(list10.get(iNextIndex));
                                        for (int i15 = iNextIndex + 1; i15 < size && arrayList4.size() < 3; i15++) {
                                            arrayList4.add(list10.get(i15));
                                        }
                                        if (arrayList4.size() < 3) {
                                            int i16 = iNextIndex - 1;
                                            for (int i17 = 3; -1 < i16 && arrayList4.size() < i17; i17 = 3) {
                                                arrayList4.add(0, list10.get(i16));
                                                i16--;
                                            }
                                            iterableD0 = arrayList4;
                                        } else {
                                            int i18 = iNextIndex >= size - 2 ? size - 3 : iNextIndex > 0 ? iNextIndex : 0;
                                            iterableD0 = list10.subList(i18, i18 + 3);
                                        }
                                    }
                                } else if (list10.size() > 3) {
                                    int iOrdinal8 = j88Var.j.ordinal();
                                    if (iOrdinal8 == 0) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else if (iOrdinal8 == 1) {
                                        int size2 = list10.size();
                                        Date date3 = new Date();
                                        Iterator it6 = list10.iterator();
                                        int i19 = 0;
                                        while (true) {
                                            if (it6.hasNext()) {
                                                jng0 jng0Var = (jng0) it6.next();
                                                i5 = size2;
                                                Date date4 = jng0Var.d;
                                                Date date5 = jng0Var.c;
                                                if (!date3.after(date4) || !date3.before(date5)) {
                                                    i19++;
                                                    size2 = i5;
                                                }
                                            } else {
                                                i5 = size2;
                                                i19 = -1;
                                            }
                                        }
                                        Integer numValueOf = Integer.valueOf(i19);
                                        if (i19 < 0) {
                                            numValueOf = null;
                                        }
                                        if (numValueOf != null) {
                                            iIntValue = numValueOf.intValue();
                                        } else {
                                            Iterator it7 = list10.iterator();
                                            int i20 = 0;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    int i21 = i20;
                                                    if (((jng0) it7.next()).b == j7) {
                                                        i6 = i21;
                                                    } else {
                                                        i20 = i21 + 1;
                                                    }
                                                } else {
                                                    i6 = -1;
                                                }
                                            }
                                            Integer numValueOf2 = Integer.valueOf(i6);
                                            if (i6 < 0) {
                                                numValueOf2 = null;
                                            }
                                            iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                        }
                                        if (iIntValue >= i5 - 2) {
                                            iIntValue = i5 - 3;
                                        } else if (iIntValue <= 0) {
                                            iIntValue = 0;
                                        }
                                        iterableD0 = list10.subList(iIntValue, iIntValue + 3);
                                    } else {
                                        if (iOrdinal8 != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        iterableD0 = CollectionsKt.E0(3, list10);
                                    }
                                } else {
                                    iterableD0 = list10;
                                }
                                ArrayList arrayList5 = new ArrayList(r3d.q(iterableD0, 10));
                                Iterator it8 = iterableD0.iterator();
                                int i22 = 0;
                                while (it8.hasNext()) {
                                    Object next2 = it8.next();
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    jng0 jng0Var2 = (jng0) next2;
                                    Date date6 = new Date();
                                    Date date7 = jng0Var2.d;
                                    Iterator it9 = it8;
                                    Date date8 = jng0Var2.c;
                                    List list11 = list10;
                                    rdj rdjVar2 = rdj.f30294a;
                                    sdj sdjVar = sdj.UNIQUE_3;
                                    List list12 = list9;
                                    lc00 lc00Var4 = lc00Var3;
                                    zu1 zu1Var5 = zu1Var4;
                                    String strL2 = kng0.l(rdj.c(rdjVar2, sdjVar, date7, locale2, 28), " - ", rdj.c(rdjVar2, sdjVar, date8, locale2, 28));
                                    String strValueOf = String.valueOf(jng0Var2.b);
                                    long time = jng0Var2.d.getTime();
                                    gu1 gu1Var6 = gu1Var5;
                                    double dCurrentTimeMillis = (((System.currentTimeMillis() - time) / 1000) / ((date8.getTime() - time) / 1000)) * 100.0d;
                                    arrayList5.add(date6.before(date7) ? new rrl(strValueOf, strL2, jng0Var2.f16811a, urlVar) : (date6.after(date7) && date6.before(date8)) ? new rrl(strValueOf, strL2, null, new wrl((dCurrentTimeMillis <= 0.0d || dCurrentTimeMillis >= 1.0d) ? (int) dCurrentTimeMillis : 1, 100)) : new rrl(strValueOf, strL2, null, vrlVar));
                                    it8 = it9;
                                    list10 = list11;
                                    i22 = i23;
                                    list9 = list12;
                                    zu1Var4 = zu1Var5;
                                    gu1Var5 = gu1Var6;
                                    lc00Var3 = lc00Var4;
                                }
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                list = list10;
                                list2 = list9;
                                gu1Var3 = gu1Var5;
                                arrayList = arrayList5;
                            } else {
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                gu1 gu1Var7 = gu1Var5;
                                list = list10;
                                list2 = list9;
                                List list13 = (list2.isEmpty() || list2.size() <= 3) ? null : list2;
                                if (list13 != null) {
                                    Iterator it10 = list13.iterator();
                                    int i24 = 0;
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            i3 = -1;
                                        } else if (((fzl0) it10.next()).c == j7) {
                                            i3 = i24;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i3);
                                    if (i3 < 0) {
                                        numValueOf3 = null;
                                    }
                                    int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                    int size3 = iIntValue2 == 0 ? 0 : iIntValue2 >= list13.size() + (-2) ? list13.size() - 3 : iIntValue2 - 1;
                                    int i25 = size3 + 3;
                                    int size4 = list13.size();
                                    if (i25 > size4) {
                                        i25 = size4;
                                    }
                                    listSubList = list13.subList(size3, i25);
                                    if (listSubList == null) {
                                        listSubList = list2;
                                    }
                                } else {
                                    listSubList = list2;
                                }
                                ArrayList arrayList6 = new ArrayList(r3d.q(listSubList, 10));
                                Iterator it11 = listSubList.iterator();
                                int i26 = 0;
                                while (it11.hasNext()) {
                                    Object next3 = it11.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fzl0 fzl0Var = (fzl0) next3;
                                    gu1 gu1Var8 = gu1Var7;
                                    Iterator it12 = gu1Var8.h.f17902a.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            Object next4 = it12.next();
                                            it = it11;
                                            if (((o2g0) next4).b) {
                                                obj2 = next4;
                                            } else {
                                                it11 = it;
                                            }
                                        } else {
                                            it = it11;
                                            obj2 = null;
                                        }
                                    }
                                    o2g0 o2g0Var = (o2g0) obj2;
                                    int i28 = o2g0Var != null ? o2g0Var.d : 0;
                                    int i29 = fzl0Var.b;
                                    boolean z6 = i28 >= i29;
                                    int i30 = (int) fzl0Var.c;
                                    int i31 = (int) j7;
                                    fzl0 fzl0Var2 = (fzl0) CollectionsKt.W(i26 - 1, listSubList);
                                    int i32 = fzl0Var2 != null ? fzl0Var2.b : 0;
                                    if (i30 != i31 || !gu1Var8.c) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = i31 > i30 ? new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar) : new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, urlVar);
                                    } else if (z6) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar);
                                    } else {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), lsm0Var2.a(R.string.tournament_stage_points_left_2_v2, Arrays.copyOf(new Object[]{String.valueOf(i29 - i28)}, 1)), new wrl(i28 - i32, i29 - i32));
                                    }
                                    arrayList6.add(rrlVar);
                                    it11 = it;
                                    i26 = i27;
                                    gu1Var7 = gu1Var8;
                                    listSubList = list3;
                                    j7 = j;
                                }
                                gu1Var3 = gu1Var7;
                                arrayList = arrayList6;
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                String strA14 = lsm0Var2.a(R.string.tournament_stages, Arrays.copyOf(new Object[0], 0));
                                String strA15 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                if (z1s0Var != z1s0.b ? list2.size() <= 3 : list.size() <= 3) {
                                    strA15 = null;
                                }
                                if (strA15 == null) {
                                    strA15 = "";
                                }
                                kt1Var = new kt1(l5iVar, new lrl(dyb.o0(arrayList), strA14, strA15));
                            } else {
                                kt1Var = null;
                            }
                            lc00 lc00Var5 = lc00Var2;
                            if (kt1Var != null) {
                                lc00Var5.add(kt1Var);
                            }
                            hrl hrlVar = zu1Var.f;
                            s98 s98Var = gu1Var3.i;
                            if (s98Var.f31841a.isEmpty()) {
                                jt1Var = null;
                            } else {
                                String strA16 = s98Var.b;
                                if (strA16.length() == 0) {
                                    strA16 = lsm0Var2.a(R.string.rules_title, Arrays.copyOf(new Object[0], 0));
                                }
                                jt1Var = new jt1(hrlVar, new irl(strA16, CollectionsKt.b0(s98Var.f31841a, Separators.RETURN, null, null, null, 62)));
                            }
                            if (jt1Var != null) {
                                lc00Var5.add(jt1Var);
                            }
                            sh1 sh1Var = sh1.b;
                            rh1.f30465a.getClass();
                            b0i b0iVar = new b0i(sh1Var, jdk0.e(str8));
                            List list14 = gu1Var3.g;
                            if (list14.isEmpty()) {
                                collectionJ2 = iun.f15405a;
                            } else {
                                if (list14.size() > 8) {
                                    i4 = 0;
                                    strA3 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i4 = 0;
                                    strA3 = null;
                                }
                                ht1 ht1Var2 = new ht1(new hjm(lsm0Var2.a(R.string.providers, Arrays.copyOf(new Object[i4], i4)), null, null, null, null, null, false, null, null, false, strA3 != null ? new ue9(strA3) : null, null, 7166));
                                List<izb0> listD1 = CollectionsKt.D0(list14, 8);
                                ArrayList arrayList7 = new ArrayList(r3d.q(listD1, 10));
                                for (izb0 izb0Var : listD1) {
                                    arrayList7.add(new eol(String.valueOf(izb0Var.c), new n0x(izb0Var.f15628a), false, izb0Var.b, "-", lsm0Var2.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), null));
                                }
                                collectionJ2 = q3d.j(ht1Var2, new it1(new bol(dyb.o0(arrayList7), b0iVar)));
                            }
                            lc00Var5.addAll(collectionJ2);
                            a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00Var5));
                            if (a4xVarO0 != null) {
                                return a4xVarO0;
                            }
                        }
                        return lak0.c;
                    case 2:
                        return a(obj);
                    case 3:
                        n0o0 n0o0Var3 = gv1Var.q;
                        dt1 dt1Var2 = (dt1) obj;
                        dt1Var2.getClass();
                        if (dt1Var2.equals(ct1Var)) {
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            lc00VarB2.add(new ju1(((zu1) ((fee) n0o0Var3.getValue()).b()).c, arlVar));
                            for (int i33 = 0; i33 < 10; i33++) {
                                lc00VarB2.add(new ku1(ur1.f36143a));
                            }
                            return new mu1(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                        }
                        if (!dt1Var2.equals(at1Var)) {
                            if (dt1Var2.equals(bt1Var)) {
                                return new mu1(lak0.c);
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var9 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var9 == null) {
                            return new mu1(lak0.c);
                        }
                        ctf0 ctf0Var3 = gv1Var.b;
                        zu1 zu1Var6 = (zu1) ((fee) n0o0Var3.getValue()).b();
                        int iIntValue3 = ((Number) ((fee) gv1Var.r.getValue()).c()).intValue();
                        ctf0Var3.getClass();
                        zu1Var6.getClass();
                        gt1 gt1VarT1 = ntr.t0(gu1Var9, ctf0Var3, zu1Var6.c);
                        ju1 ju1Var = gt1VarT1 != null ? new ju1(gt1VarT1.f11859a, gt1VarT1.b) : null;
                        List<o2g0> list15 = gu1Var9.h.f17902a;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list15, 10));
                        for (o2g0 o2g0Var2 : list15) {
                            o2g0Var2.getClass();
                            String str18 = o2g0Var2.f24529a;
                            Long lT0 = StringsKt.t0(str18);
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String strA17 = ctf0Var3.b.a(R.string.tournament_points_v2, Arrays.copyOf(new Object[]{String.valueOf(o2g0Var2.d)}, 1));
                            boolean z7 = o2g0Var2.b;
                            int i34 = o2g0Var2.c;
                            switch (i34) {
                                case 1:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_one);
                                    break;
                                case 2:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_two);
                                    break;
                                case 3:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_three);
                                    break;
                                case 4:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_four);
                                    break;
                                case 5:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_five);
                                    break;
                                case 6:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_six);
                                    break;
                                case 7:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_seven);
                                    break;
                                case 8:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_eight);
                                    break;
                                case 9:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_nine);
                                    break;
                                case 10:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_ten);
                                    break;
                                default:
                                    rr1VarP = new qr1(String.valueOf(i34), z7 ? czr0.b : czr0.f5237a);
                                    break;
                            }
                            arrayList8.add(new ku1(new tr1(jLongValue, strA17, str18, z7, false, rr1VarP)));
                        }
                        if (arrayList8.isEmpty()) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.i;
                            xuzVar.getClass();
                            mu1Var = new nu1(new mdm(xuz.a(pb10Var, iIntValue3), ju1Var == null ? pdm.f26814a : pdm.c, null, 0, 0, R.string.tournament_result_not_available, 0, 0, 0L, 0L, 988), ju1Var);
                        } else {
                            mu1Var = new mu1(dyb.o0(CollectionsKt.q0(q3d.k(ju1Var), arrayList8)));
                        }
                        return mu1Var;
                    case 4:
                        return b(obj);
                    case 5:
                        return p8a.d0((gu1) obj, s9s0.f31863a, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 6:
                        return p8a.d0((gu1) obj, s9s0.b, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    default:
                        return p8a.d0((gu1) obj, s9s0.c, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                }
            }
        }, (byte) 20));
        final byte b5 = 3;
        this.v = maz.b(new yw9(yu1Var.j, new Function1(this) { // from class: a.fv1
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                pt0 pt0Var;
                String strA;
                int i2;
                nur murVar;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                boolean zEquals = dt1Var.equals(ct1.f4914a);
                gv1 gv1Var = this.b;
                xll xllVar = xll.f41078a;
                if (zEquals) {
                    return new aml(x4d0.g0((ot0) gv1Var.a().c()), xllVar, true);
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new zll(x4d0.g0((ot0) gv1Var.a().c()), xllVar, lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                Map map = (Map) ((fee) gv1Var.l.getValue()).c();
                ctf0 ctf0Var2 = gv1Var.b;
                boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                ot0 ot0Var = (ot0) gv1Var.a().c();
                map.getClass();
                ctf0Var2.getClass();
                set.getClass();
                ot0Var.getClass();
                int iOrdinal = ot0Var.ordinal();
                if (iOrdinal == 0) {
                    pt0Var = pt0.f27539a;
                } else if (iOrdinal == 1) {
                    pt0Var = pt0.b;
                } else if (iOrdinal == 2) {
                    pt0Var = pt0.c;
                } else if (iOrdinal == 3) {
                    pt0Var = pt0.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    pt0Var = pt0.e;
                }
                Collection collectionValues = map.values();
                ArrayList arrayList = new ArrayList(r3d.q(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    mlr mlrVar = (mlr) it.next();
                    long j = mlrVar.f22006a;
                    boolean z = mlrVar.k;
                    boolean zContains = set.contains(Long.valueOf(j));
                    int i3 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                    boolean z2 = mlrVar.j;
                    if (z) {
                        strA = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = z2 ? ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                    }
                    Iterator it2 = it;
                    ctf0 ctf0Var3 = ctf0Var2;
                    long j2 = mlrVar.f22006a;
                    String str = mlrVar.f;
                    String str2 = mlrVar.e;
                    if (zBooleanValue) {
                        i2 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                    } else {
                        i2 = 0;
                    }
                    mtr mtrVar = new mtr(i2, zContains);
                    n0x n0xVar2 = new n0x(mlrVar.g);
                    m0x m0xVar = new m0x(i3, null, 6);
                    if (strA.length() == 0) {
                        murVar = lur.f20686a;
                        n0xVar = n0xVar2;
                    } else {
                        pt0 pt0Var4 = pt0.f27539a;
                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                            n0xVar = n0xVar2;
                        } else {
                            n0xVar = n0xVar2;
                            pt0 pt0Var5 = pt0.d;
                            if (pt0Var != pt0Var5 || !z) {
                                if ((pt0Var == pt0Var4 && z2) || ((pt0Var == pt0Var2 && z2) || (pt0Var == pt0Var5 && z2))) {
                                    d4d d4dVar = d4d.PRIMARY;
                                    uqo0Var = new eqo0();
                                } else {
                                    pt0 pt0Var6 = pt0.b;
                                    if ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) {
                                        uqo0Var = kro0.f18776a;
                                    } else {
                                        uqo0Var = ((pt0Var == pt0Var6 && z2) || (pt0Var == pt0Var3 && z2)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                    }
                                }
                            }
                            murVar = new mur(strA, uqo0Var);
                        }
                        d4d d4dVar2 = d4d.PRIMARY;
                        uqo0Var = new lro0();
                        murVar = new mur(strA, uqo0Var);
                    }
                    arrayList.add(new st0(j2, str, str2, mtrVar, n0xVar, m0xVar, null, murVar));
                    ctf0Var2 = ctf0Var3;
                    it = it2;
                }
                return new zll(pt0Var, xllVar, arrayList);
            }

            private final Object b(Object obj) {
                Iterable iterableC;
                xw1 xw1Var;
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.e;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                if (dt1Var.equals(ct1.f4914a)) {
                    gu1 gu1Var2 = (gu1) ((fee) n0o0Var.getValue()).c();
                    if (gu1Var2 != null && gu1Var2.b != z1s0.f43637a && gu1Var2.d) {
                        return new ys1(dyb.g0(new mw1(uw1.f36373a)));
                    }
                    hrl hrlVar = hrl.f13536a;
                    return new xs1(dyb.g0(new pu1(jrl.f17007a)));
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new xs1(lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                gu1 gu1Var3 = (gu1) ((fee) n0o0Var.getValue()).c();
                if (gu1Var3 == null) {
                    return new xs1(lak0.c);
                }
                List list = (List) ((fee) gv1Var.m.getValue()).c();
                Map map = (Map) ((fee) gv1Var.n.getValue()).c();
                Set set = (Set) ((fee) gv1Var.p.getValue()).c();
                list.getClass();
                map.getClass();
                set.getClass();
                if (gu1Var3.b == z1s0.f43637a || !gu1Var3.d) {
                    z78 z78Var = gu1Var3.j;
                    if (z78Var.f43905a) {
                        iterableC = iun.f15405a;
                    } else {
                        String strR = q8a.R(z78Var.c.concat(Separators.RETURN));
                        String strR2 = q8a.R(z78Var.d);
                        if (StringsKt.u0(strR).toString().length() == 0 && strR2.length() == 0) {
                            iterableC = iun.f15405a;
                        } else {
                            String strS = z78Var.e ? q8a.S(list) : null;
                            String str = strS != null ? strS : "";
                            hrl hrlVar2 = hrl.f13536a;
                            iterableC = kotlin.collections.a.c(new pu1(new irl(z78Var.b, StringsKt.v0(strR + str + strR2).toString())));
                        }
                    }
                    return new xs1(dyb.o0(iterableC));
                }
                o98 o98Var = gu1Var3.k;
                lc00 lc00VarB = kotlin.collections.a.b();
                String strR3 = q8a.R(o98Var.f24867a);
                List<jng0> list2 = o98Var.b;
                jng0 jng0Var = (jng0) CollectionsKt.firstOrNull(list2);
                String str2 = jng0Var != null ? jng0Var.e : null;
                String strR4 = q8a.R(str2 != null ? str2 : "");
                if (strR3.length() > 0) {
                    String strS2 = q8a.S(list);
                    lc00VarB.add(new mw1(new tw1(o98Var.c, StringsKt.v0(strR3 + strS2 + strR4).toString(), new ow1(new m0x(R.drawable.ic_glyph_tournaments, null, 6)), set.contains(xr1.f41347a))));
                }
                ArrayList arrayList = new ArrayList();
                for (jng0 jng0Var2 : list2) {
                    String strR5 = q8a.R(jng0Var2.f16811a);
                    String strR6 = q8a.R(jng0Var2.e);
                    if (strR5.length() == 0 || strR6.length() == 0) {
                        xw1Var = null;
                    } else {
                        List list3 = (List) map.get(Long.valueOf(jng0Var2.b));
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        String strS3 = q8a.S(list3);
                        xw1Var = new xw1(jng0Var2.b, jng0Var2.d, jng0Var2.c, StringsKt.v0(strR5 + strS3 + strR6).toString());
                    }
                    if (xw1Var != null) {
                        arrayList.add(xw1Var);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    xw1 xw1Var2 = (xw1) next;
                    long j = xw1Var2.f41588a;
                    wr1 wr1Var = new wr1(j);
                    Date date = xw1Var2.b;
                    Date date2 = xw1Var2.c;
                    rdj rdjVar = rdj.f30294a;
                    sdj sdjVar = sdj.UNIQUE_3;
                    lc00VarB.add(new lw1(j, new tw1(kng0.l(rdj.c(rdjVar, sdjVar, date, null, 60), " - ", rdj.c(rdjVar, sdjVar, date2, null, 60)), xw1Var2.d, new pw1(String.valueOf(i3)), set.contains(wr1Var))));
                    it = it;
                    i2 = i3;
                }
                return new ys1(dyb.o0(kotlin.collections.a.a(lc00VarB)));
            }

            /* JADX WARN: Code duplicated, block: B:358:0x09c5  */
            /* JADX WARN: Code duplicated, block: B:500:0x0c58  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                lt1 lt1Var;
                gx1 gx1Var;
                int i2;
                gu1 gu1Var2;
                lsm0 lsm0Var;
                lc00 lc00Var;
                ft1 ft1Var;
                pt0 pt0Var;
                lsm0 lsm0Var2;
                String strA;
                Collection collectionJ;
                boolean z;
                mt1 mt1Var;
                String strA2;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                lc00 lc00Var2;
                zu1 zu1Var;
                List list;
                List list2;
                List listSubList;
                gu1 gu1Var3;
                ArrayList arrayList;
                Iterator it;
                Object obj2;
                List list3;
                long j;
                rrl rrlVar;
                int i3;
                kt1 kt1Var;
                jt1 jt1Var;
                int i4;
                String strA3;
                Collection collectionJ2;
                Iterable iterableD0;
                int i5;
                int i6;
                int iIntValue;
                int iNextIndex;
                int i7;
                ft1 ft1Var2;
                String strL;
                String strK;
                String str4;
                n0x n0xVar2;
                String str5;
                String strA4;
                String strA5;
                Object mu1Var;
                rr1 rr1VarP;
                byte b6 = b5;
                bt1 bt1Var = bt1.f3159a;
                at1 at1Var = at1.f1413a;
                arl arlVar = arl.f1351a;
                ct1 ct1Var = ct1.f4914a;
                gv1 gv1Var = this.b;
                switch (b6) {
                    case 0:
                        return p8a.d0((gu1) obj, s9s0.d, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 1:
                        n0o0 n0o0Var = gv1Var.j;
                        n0o0 n0o0Var2 = gv1Var.q;
                        dt1 dt1Var = (dt1) obj;
                        dt1Var.getClass();
                        boolean zEquals = dt1Var.equals(ct1Var);
                        bzw bzwVar = null;
                        int i8 = 6;
                        o0s o0sVar = o0s.f24443a;
                        if (zEquals) {
                            zu1 zu1Var2 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            et1 et1Var = new et1(zu1Var2.f44988a, ew1.f8498a);
                            lt1 lt1Var2 = new lt1(zu1Var2.b, zrl.f44860a);
                            gt1 gt1Var = new gt1(zu1Var2.c, arlVar);
                            ft1 ft1Var3 = new ft1(zu1Var2.d, jw1.f17229a);
                            mt1 mt1Var2 = new mt1(new ijm());
                            nt1 nt1Var = new nt1(new aml(x4d0.g0((ot0) gv1Var.a().c()), new wll(o0sVar), true));
                            kt1 kt1Var2 = new kt1(zu1Var2.e, mrl.f22278a);
                            jt1 jt1Var2 = new jt1(zu1Var2.f, jrl.f17007a);
                            ht1 ht1Var = new ht1(new ijm());
                            jdk0 jdk0Var = rh1.f30465a;
                            String str6 = (String) ((fee) n0o0Var.getValue()).c();
                            jdk0Var.getClass();
                            return dyb.g0(et1Var, lt1Var2, gt1Var, ft1Var3, mt1Var2, nt1Var, kt1Var2, jt1Var2, ht1Var, new it1(new col(new b0i(sh1.b, jdk0.e(str6)))));
                        }
                        if (!dt1Var.equals(at1Var)) {
                            if (dt1Var.equals(bt1Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var4 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var4 != null) {
                            ctf0 ctf0Var2 = gv1Var.b;
                            Locale locale2 = (Locale) gv1Var.B;
                            zu1 zu1Var3 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            String str7 = (String) ((fee) gv1Var.h.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                            ot0 ot0Var = (ot0) gv1Var.a().c();
                            boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                            Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                            String str8 = (String) ((fee) n0o0Var.getValue()).c();
                            ctf0Var2.getClass();
                            zu1Var3.getClass();
                            str7.getClass();
                            ot0Var.getClass();
                            set.getClass();
                            str8.getClass();
                            lc00 lc00VarB = kotlin.collections.a.b();
                            cw1 cw1Var = zu1Var3.f44988a;
                            z1s0 z1s0Var = gu1Var4.b;
                            rdj rdjVar = rdj.f30294a;
                            j88 j88Var = gu1Var4.e;
                            Set set2 = set;
                            long j2 = j88Var.e;
                            long j3 = j88Var.i;
                            zoe zoeVar = j88Var.f16071a;
                            Date dateK = rdj.k(j3);
                            Date dateK2 = rdj.k(j2);
                            Date date = new Date();
                            bw1 bw1Var = ((date.after(dateK) && date.before(dateK2)) || new Date().before(dateK)) ? bw1.f3302a : bw1.b;
                            long j4 = ((j2 - j3) * 1000) / 86400000;
                            String str9 = j88Var.g;
                            String str10 = j88Var.h;
                            int iOrdinal = cw1Var.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                o0sVar = o0sVar;
                                str = "";
                            } else {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        strA5 = eeq.R(dateK, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA5 = ctf0Var2.b.a(R.string.tournament_prize_pool_title_date_start, Arrays.copyOf(new Object[0], 0));
                                str = strA5;
                            }
                            String strS = eeq.S(dateK, ctf0Var2, cw1Var, locale2);
                            int iOrdinal2 = cw1Var.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                str2 = "";
                            } else {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        strA4 = eeq.R(dateK2, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA4 = ctf0Var2.b.a(R.string.tournament_title_date_end, Arrays.copyOf(new Object[0], 0));
                                str2 = strA4;
                            }
                            String strS2 = eeq.S(dateK2, ctf0Var2, cw1Var, locale2);
                            Object[] objArr = {Long.valueOf(j4)};
                            lsm0 lsm0Var3 = ctf0Var2.b;
                            String strA6 = lsm0Var3.a(R.string.days_v2, Arrays.copyOf(objArr, 1));
                            String strA7 = bw1Var == bw1.b ? lsm0Var3.a(R.string.end_of_tournament, Arrays.copyOf(new Object[0], 0)) : "";
                            int iOrdinal3 = cw1Var.ordinal();
                            if (iOrdinal3 == 0) {
                                str3 = "Background Picture.webp";
                            } else if (iOrdinal3 == 1) {
                                str3 = "Picture S.webp";
                            } else {
                                if (iOrdinal3 != 2) {
                                    if (iOrdinal3 == 3) {
                                        str3 = "";
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                str3 = "Dates.webp";
                            }
                            List list4 = u0d.f34849a;
                            n0x n0xVar3 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(str3)));
                            int[] iArr = iu1.f15377a;
                            lc00VarB.add(new et1(cw1Var, new dw1(bw1Var, str9, str10, str, strS, str2, strS2, strA6, strA7, n0xVar3, new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Left.webp" : ""))), new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Right.webp" : ""))))));
                            gx1 gx1Var2 = zu1Var3.b;
                            if (zoeVar.d == qpe.c) {
                                lt1Var = null;
                            } else {
                                int iOrdinal4 = gx1Var2.ordinal();
                                if (iOrdinal4 == 0) {
                                    gx1Var = gx1.f12054a;
                                } else if (iOrdinal4 == 1) {
                                    gx1Var = gx1.b;
                                } else {
                                    if (iOrdinal4 != 2) {
                                        if (iOrdinal4 == 3) {
                                            gx1Var = gx1.d;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    gx1Var = gx1.c;
                                }
                                String str11 = zoeVar.c;
                                int iOrdinal5 = gx1Var2.ordinal();
                                if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                                    i2 = R.string.day_short;
                                } else {
                                    if (iOrdinal5 != 2) {
                                        if (iOrdinal5 == 3) {
                                            i2 = R.string.day_short_2;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    i2 = R.string.days_in_case_caps;
                                }
                                String strA8 = lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0));
                                gx1 gx1Var3 = gx1.c;
                                String strA9 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.hours_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA10 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.minutes_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA11 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.seconds_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                long jCurrentTimeMillis = zoeVar.f44716a - System.currentTimeMillis();
                                lt1Var = new lt1(gx1Var, new yrl(str11, strA8, strA9, strA10, strA11, jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis));
                            }
                            if (lt1Var != null) {
                                lc00VarB.add(lt1Var);
                            }
                            gt1 gt1VarT0 = ntr.t0(gu1Var4, ctf0Var2, zu1Var3.c);
                            if (gt1VarT0 != null) {
                                lc00VarB.add(gt1VarT0);
                            }
                            gw1 gw1Var = zu1Var3.d;
                            w88 w88Var = gu1Var4.f;
                            boolean z2 = w88Var.f38710a;
                            List list5 = w88Var.c;
                            if (z2 || list5.isEmpty()) {
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = null;
                            } else {
                                String strA12 = w88Var.e;
                                if (strA12.length() == 0) {
                                    i7 = 0;
                                    strA12 = lsm0Var3.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i7 = 0;
                                }
                                String strA13 = lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[i7], i7));
                                if (list5.size() <= 5) {
                                    strA13 = null;
                                }
                                String str12 = strA13 == null ? "" : strA13;
                                boolean z3 = w88Var.b == xxb0.f41650a;
                                String strF = ctf0Var2.f(R.string.fs, new Object[0]);
                                ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                                Iterator it2 = list5.iterator();
                                int i9 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    pxb0 pxb0Var = (pxb0) next;
                                    if (z3) {
                                        String strF2 = ctf0Var2.f(R.string.place, new Object[0]);
                                        int i11 = pxb0Var.b;
                                        int i12 = pxb0Var.c;
                                        strL = i11 == i12 ? dw9.m(i11, Separators.SP, strF2) : i11 + "-" + i12 + Separators.SP + strF2;
                                    } else {
                                        ft1Var2 = ft1Var2;
                                        strL = kng0.l(ctf0Var2.f(R.string.stocks_prizes, new Object[0]), ": ", pxb0Var.h);
                                    }
                                    int i13 = pxb0Var.i;
                                    String str13 = i13 > 0 ? strF + Separators.SP + i13 : "";
                                    if (z1s0Var != z1s0.f43637a) {
                                        strK = pxb0Var.d;
                                    } else {
                                        pn40 pn40Var = pn40.f27267a;
                                        double d = pxb0Var.f;
                                        p3u0 p3u0Var = p3u0.c;
                                        strK = b1j.k("\u202a", str7, Separators.SP, pn40.l(d), "\u202c");
                                    }
                                    String str14 = strK;
                                    String str15 = pxb0Var.f27747a;
                                    int iOrdinal6 = gw1Var.ordinal();
                                    if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
                                        if (i10 == 1) {
                                            str4 = "Number_Gold.webp";
                                        } else if (i10 == 2) {
                                            str4 = "Number_Silver.webp";
                                        } else if (i10 != 3) {
                                            str4 = gw1Var == gw1.c ? "Number_Other_Star.webp" : "Number_Other.webp";
                                        } else {
                                            str4 = "Number_Bronze.webp";
                                        }
                                        List list6 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/".concat(str4)));
                                    } else {
                                        if (iOrdinal6 != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                        if (i10 == 1) {
                                            str5 = "Illustration_Gold.webp";
                                        } else if (i10 != 2) {
                                            str5 = i10 != 3 ? "Illustration_Other.webp" : "Illustration_Bronze.webp";
                                        } else {
                                            str5 = "Illustration_Silver.webp";
                                        }
                                        List list7 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/illustration/".concat(str5)));
                                    }
                                    arrayList2.add(new vv1(str15, n0xVar2, strL, str14, str13));
                                    i9 = i10;
                                    it2 = it3;
                                    lsm0Var3 = lsm0Var3;
                                    gu1Var4 = gu1Var4;
                                    lc00VarB = lc00VarB;
                                    ft1Var2 = ft1Var2;
                                }
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = new ft1(gw1Var, new iw1(dyb.o0(arrayList2), strA12, str12));
                            }
                            lc00 lc00Var3 = lc00Var;
                            if (ft1Var != null) {
                                lc00Var3.add(ft1Var);
                            }
                            gu1 gu1Var5 = gu1Var2;
                            List list8 = gu1Var5.r;
                            if (list8.isEmpty()) {
                                collectionJ = iun.f15405a;
                                lsm0Var2 = lsm0Var;
                            } else {
                                int iOrdinal7 = ot0Var.ordinal();
                                if (iOrdinal7 == 0) {
                                    pt0Var = pt0.f27539a;
                                } else if (iOrdinal7 == 1) {
                                    pt0Var = pt0.b;
                                } else if (iOrdinal7 == 2) {
                                    pt0Var = pt0.c;
                                } else if (iOrdinal7 == 3) {
                                    pt0Var = pt0.d;
                                } else {
                                    if (iOrdinal7 != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    pt0Var = pt0.e;
                                }
                                if (list8.size() == 1) {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_game, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                mt1 mt1Var3 = new mt1(new hjm(strA, null, null, null, null, null, false, null, null, false, null, null, 7166));
                                wll wllVar = new wll(o0sVar);
                                List listD0 = CollectionsKt.D0(list8, 8);
                                ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                Iterator it4 = listD0.iterator();
                                while (it4.hasNext()) {
                                    mlr mlrVar = (mlr) it4.next();
                                    long j5 = mlrVar.f22006a;
                                    boolean z4 = mlrVar.k;
                                    Set set3 = set2;
                                    boolean zContains = set3.contains(Long.valueOf(j5));
                                    int i14 = zBooleanValue ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    Iterator it5 = it4;
                                    boolean z5 = mlrVar.j;
                                    if (z4) {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = lsm0Var2.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = z ? lsm0Var2.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    set2 = set3;
                                    long j6 = mlrVar.f22006a;
                                    String str16 = mlrVar.f;
                                    String str17 = mlrVar.e;
                                    mtr mtrVar = new mtr(zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar4 = new n0x(mlrVar.g);
                                    m0x m0xVar = new m0x(i14, bzwVar, i8);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        n0xVar = n0xVar4;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z4) || (pt0Var == (pt0Var2 = pt0.c) && z4)) {
                                            n0xVar = n0xVar4;
                                        } else {
                                            n0xVar = n0xVar4;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z4) {
                                                if ((pt0Var == pt0Var4 && z) || ((pt0Var == pt0Var2 && z) || (pt0Var == pt0Var5 && z))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var3 = pt0.e) && z4)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z) || (pt0Var == pt0Var3 && z)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList3.add(new st0(j6, str16, str17, mtrVar, n0xVar, m0xVar, null, murVar));
                                    it4 = it5;
                                    mt1Var3 = mt1Var;
                                    i8 = 6;
                                    bzwVar = null;
                                }
                                collectionJ = q3d.j(mt1Var3, new nt1(new zll(pt0Var, wllVar, arrayList3)));
                            }
                            lc00Var3.addAll(collectionJ);
                            zu1 zu1Var4 = zu1Var3;
                            l5i l5iVar = zu1Var4.e;
                            List list9 = gu1Var5.l.f38767a;
                            long j7 = gu1Var5.q;
                            List list10 = gu1Var5.k.b;
                            z1s0 z1s0Var2 = z1s0.b;
                            url urlVar = url.f36169a;
                            vrl vrlVar = vrl.f37904a;
                            if (z1s0Var == z1s0Var2) {
                                if (list10.isEmpty()) {
                                    iterableD0 = iun.f15405a;
                                } else if (list10.size() <= 3) {
                                    iterableD0 = list10;
                                } else if (plc.z(gu1Var5)) {
                                    int size = list10.size();
                                    Date date2 = new Date();
                                    ListIterator listIterator = list10.listIterator(list10.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                        } else if (((jng0) listIterator.previous()).c.before(date2)) {
                                            iNextIndex = listIterator.nextIndex();
                                        }
                                    }
                                    if (iNextIndex == -1) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(list10.get(iNextIndex));
                                        for (int i15 = iNextIndex + 1; i15 < size && arrayList4.size() < 3; i15++) {
                                            arrayList4.add(list10.get(i15));
                                        }
                                        if (arrayList4.size() < 3) {
                                            int i16 = iNextIndex - 1;
                                            for (int i17 = 3; -1 < i16 && arrayList4.size() < i17; i17 = 3) {
                                                arrayList4.add(0, list10.get(i16));
                                                i16--;
                                            }
                                            iterableD0 = arrayList4;
                                        } else {
                                            int i18 = iNextIndex >= size - 2 ? size - 3 : iNextIndex > 0 ? iNextIndex : 0;
                                            iterableD0 = list10.subList(i18, i18 + 3);
                                        }
                                    }
                                } else if (list10.size() > 3) {
                                    int iOrdinal8 = j88Var.j.ordinal();
                                    if (iOrdinal8 == 0) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else if (iOrdinal8 == 1) {
                                        int size2 = list10.size();
                                        Date date3 = new Date();
                                        Iterator it6 = list10.iterator();
                                        int i19 = 0;
                                        while (true) {
                                            if (it6.hasNext()) {
                                                jng0 jng0Var = (jng0) it6.next();
                                                i5 = size2;
                                                Date date4 = jng0Var.d;
                                                Date date5 = jng0Var.c;
                                                if (!date3.after(date4) || !date3.before(date5)) {
                                                    i19++;
                                                    size2 = i5;
                                                }
                                            } else {
                                                i5 = size2;
                                                i19 = -1;
                                            }
                                        }
                                        Integer numValueOf = Integer.valueOf(i19);
                                        if (i19 < 0) {
                                            numValueOf = null;
                                        }
                                        if (numValueOf != null) {
                                            iIntValue = numValueOf.intValue();
                                        } else {
                                            Iterator it7 = list10.iterator();
                                            int i20 = 0;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    int i21 = i20;
                                                    if (((jng0) it7.next()).b == j7) {
                                                        i6 = i21;
                                                    } else {
                                                        i20 = i21 + 1;
                                                    }
                                                } else {
                                                    i6 = -1;
                                                }
                                            }
                                            Integer numValueOf2 = Integer.valueOf(i6);
                                            if (i6 < 0) {
                                                numValueOf2 = null;
                                            }
                                            iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                        }
                                        if (iIntValue >= i5 - 2) {
                                            iIntValue = i5 - 3;
                                        } else if (iIntValue <= 0) {
                                            iIntValue = 0;
                                        }
                                        iterableD0 = list10.subList(iIntValue, iIntValue + 3);
                                    } else {
                                        if (iOrdinal8 != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        iterableD0 = CollectionsKt.E0(3, list10);
                                    }
                                } else {
                                    iterableD0 = list10;
                                }
                                ArrayList arrayList5 = new ArrayList(r3d.q(iterableD0, 10));
                                Iterator it8 = iterableD0.iterator();
                                int i22 = 0;
                                while (it8.hasNext()) {
                                    Object next2 = it8.next();
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    jng0 jng0Var2 = (jng0) next2;
                                    Date date6 = new Date();
                                    Date date7 = jng0Var2.d;
                                    Iterator it9 = it8;
                                    Date date8 = jng0Var2.c;
                                    List list11 = list10;
                                    rdj rdjVar2 = rdj.f30294a;
                                    sdj sdjVar = sdj.UNIQUE_3;
                                    List list12 = list9;
                                    lc00 lc00Var4 = lc00Var3;
                                    zu1 zu1Var5 = zu1Var4;
                                    String strL2 = kng0.l(rdj.c(rdjVar2, sdjVar, date7, locale2, 28), " - ", rdj.c(rdjVar2, sdjVar, date8, locale2, 28));
                                    String strValueOf = String.valueOf(jng0Var2.b);
                                    long time = jng0Var2.d.getTime();
                                    gu1 gu1Var6 = gu1Var5;
                                    double dCurrentTimeMillis = (((System.currentTimeMillis() - time) / 1000) / ((date8.getTime() - time) / 1000)) * 100.0d;
                                    arrayList5.add(date6.before(date7) ? new rrl(strValueOf, strL2, jng0Var2.f16811a, urlVar) : (date6.after(date7) && date6.before(date8)) ? new rrl(strValueOf, strL2, null, new wrl((dCurrentTimeMillis <= 0.0d || dCurrentTimeMillis >= 1.0d) ? (int) dCurrentTimeMillis : 1, 100)) : new rrl(strValueOf, strL2, null, vrlVar));
                                    it8 = it9;
                                    list10 = list11;
                                    i22 = i23;
                                    list9 = list12;
                                    zu1Var4 = zu1Var5;
                                    gu1Var5 = gu1Var6;
                                    lc00Var3 = lc00Var4;
                                }
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                list = list10;
                                list2 = list9;
                                gu1Var3 = gu1Var5;
                                arrayList = arrayList5;
                            } else {
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                gu1 gu1Var7 = gu1Var5;
                                list = list10;
                                list2 = list9;
                                List list13 = (list2.isEmpty() || list2.size() <= 3) ? null : list2;
                                if (list13 != null) {
                                    Iterator it10 = list13.iterator();
                                    int i24 = 0;
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            i3 = -1;
                                        } else if (((fzl0) it10.next()).c == j7) {
                                            i3 = i24;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i3);
                                    if (i3 < 0) {
                                        numValueOf3 = null;
                                    }
                                    int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                    int size3 = iIntValue2 == 0 ? 0 : iIntValue2 >= list13.size() + (-2) ? list13.size() - 3 : iIntValue2 - 1;
                                    int i25 = size3 + 3;
                                    int size4 = list13.size();
                                    if (i25 > size4) {
                                        i25 = size4;
                                    }
                                    listSubList = list13.subList(size3, i25);
                                    if (listSubList == null) {
                                        listSubList = list2;
                                    }
                                } else {
                                    listSubList = list2;
                                }
                                ArrayList arrayList6 = new ArrayList(r3d.q(listSubList, 10));
                                Iterator it11 = listSubList.iterator();
                                int i26 = 0;
                                while (it11.hasNext()) {
                                    Object next3 = it11.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fzl0 fzl0Var = (fzl0) next3;
                                    gu1 gu1Var8 = gu1Var7;
                                    Iterator it12 = gu1Var8.h.f17902a.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            Object next4 = it12.next();
                                            it = it11;
                                            if (((o2g0) next4).b) {
                                                obj2 = next4;
                                            } else {
                                                it11 = it;
                                            }
                                        } else {
                                            it = it11;
                                            obj2 = null;
                                        }
                                    }
                                    o2g0 o2g0Var = (o2g0) obj2;
                                    int i28 = o2g0Var != null ? o2g0Var.d : 0;
                                    int i29 = fzl0Var.b;
                                    boolean z6 = i28 >= i29;
                                    int i30 = (int) fzl0Var.c;
                                    int i31 = (int) j7;
                                    fzl0 fzl0Var2 = (fzl0) CollectionsKt.W(i26 - 1, listSubList);
                                    int i32 = fzl0Var2 != null ? fzl0Var2.b : 0;
                                    if (i30 != i31 || !gu1Var8.c) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = i31 > i30 ? new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar) : new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, urlVar);
                                    } else if (z6) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar);
                                    } else {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), lsm0Var2.a(R.string.tournament_stage_points_left_2_v2, Arrays.copyOf(new Object[]{String.valueOf(i29 - i28)}, 1)), new wrl(i28 - i32, i29 - i32));
                                    }
                                    arrayList6.add(rrlVar);
                                    it11 = it;
                                    i26 = i27;
                                    gu1Var7 = gu1Var8;
                                    listSubList = list3;
                                    j7 = j;
                                }
                                gu1Var3 = gu1Var7;
                                arrayList = arrayList6;
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                String strA14 = lsm0Var2.a(R.string.tournament_stages, Arrays.copyOf(new Object[0], 0));
                                String strA15 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                if (z1s0Var != z1s0.b ? list2.size() <= 3 : list.size() <= 3) {
                                    strA15 = null;
                                }
                                if (strA15 == null) {
                                    strA15 = "";
                                }
                                kt1Var = new kt1(l5iVar, new lrl(dyb.o0(arrayList), strA14, strA15));
                            } else {
                                kt1Var = null;
                            }
                            lc00 lc00Var5 = lc00Var2;
                            if (kt1Var != null) {
                                lc00Var5.add(kt1Var);
                            }
                            hrl hrlVar = zu1Var.f;
                            s98 s98Var = gu1Var3.i;
                            if (s98Var.f31841a.isEmpty()) {
                                jt1Var = null;
                            } else {
                                String strA16 = s98Var.b;
                                if (strA16.length() == 0) {
                                    strA16 = lsm0Var2.a(R.string.rules_title, Arrays.copyOf(new Object[0], 0));
                                }
                                jt1Var = new jt1(hrlVar, new irl(strA16, CollectionsKt.b0(s98Var.f31841a, Separators.RETURN, null, null, null, 62)));
                            }
                            if (jt1Var != null) {
                                lc00Var5.add(jt1Var);
                            }
                            sh1 sh1Var = sh1.b;
                            rh1.f30465a.getClass();
                            b0i b0iVar = new b0i(sh1Var, jdk0.e(str8));
                            List list14 = gu1Var3.g;
                            if (list14.isEmpty()) {
                                collectionJ2 = iun.f15405a;
                            } else {
                                if (list14.size() > 8) {
                                    i4 = 0;
                                    strA3 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i4 = 0;
                                    strA3 = null;
                                }
                                ht1 ht1Var2 = new ht1(new hjm(lsm0Var2.a(R.string.providers, Arrays.copyOf(new Object[i4], i4)), null, null, null, null, null, false, null, null, false, strA3 != null ? new ue9(strA3) : null, null, 7166));
                                List<izb0> listD1 = CollectionsKt.D0(list14, 8);
                                ArrayList arrayList7 = new ArrayList(r3d.q(listD1, 10));
                                for (izb0 izb0Var : listD1) {
                                    arrayList7.add(new eol(String.valueOf(izb0Var.c), new n0x(izb0Var.f15628a), false, izb0Var.b, "-", lsm0Var2.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), null));
                                }
                                collectionJ2 = q3d.j(ht1Var2, new it1(new bol(dyb.o0(arrayList7), b0iVar)));
                            }
                            lc00Var5.addAll(collectionJ2);
                            a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00Var5));
                            if (a4xVarO0 != null) {
                                return a4xVarO0;
                            }
                        }
                        return lak0.c;
                    case 2:
                        return a(obj);
                    case 3:
                        n0o0 n0o0Var3 = gv1Var.q;
                        dt1 dt1Var2 = (dt1) obj;
                        dt1Var2.getClass();
                        if (dt1Var2.equals(ct1Var)) {
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            lc00VarB2.add(new ju1(((zu1) ((fee) n0o0Var3.getValue()).b()).c, arlVar));
                            for (int i33 = 0; i33 < 10; i33++) {
                                lc00VarB2.add(new ku1(ur1.f36143a));
                            }
                            return new mu1(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                        }
                        if (!dt1Var2.equals(at1Var)) {
                            if (dt1Var2.equals(bt1Var)) {
                                return new mu1(lak0.c);
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var9 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var9 == null) {
                            return new mu1(lak0.c);
                        }
                        ctf0 ctf0Var3 = gv1Var.b;
                        zu1 zu1Var6 = (zu1) ((fee) n0o0Var3.getValue()).b();
                        int iIntValue3 = ((Number) ((fee) gv1Var.r.getValue()).c()).intValue();
                        ctf0Var3.getClass();
                        zu1Var6.getClass();
                        gt1 gt1VarT1 = ntr.t0(gu1Var9, ctf0Var3, zu1Var6.c);
                        ju1 ju1Var = gt1VarT1 != null ? new ju1(gt1VarT1.f11859a, gt1VarT1.b) : null;
                        List<o2g0> list15 = gu1Var9.h.f17902a;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list15, 10));
                        for (o2g0 o2g0Var2 : list15) {
                            o2g0Var2.getClass();
                            String str18 = o2g0Var2.f24529a;
                            Long lT0 = StringsKt.t0(str18);
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String strA17 = ctf0Var3.b.a(R.string.tournament_points_v2, Arrays.copyOf(new Object[]{String.valueOf(o2g0Var2.d)}, 1));
                            boolean z7 = o2g0Var2.b;
                            int i34 = o2g0Var2.c;
                            switch (i34) {
                                case 1:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_one);
                                    break;
                                case 2:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_two);
                                    break;
                                case 3:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_three);
                                    break;
                                case 4:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_four);
                                    break;
                                case 5:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_five);
                                    break;
                                case 6:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_six);
                                    break;
                                case 7:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_seven);
                                    break;
                                case 8:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_eight);
                                    break;
                                case 9:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_nine);
                                    break;
                                case 10:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_ten);
                                    break;
                                default:
                                    rr1VarP = new qr1(String.valueOf(i34), z7 ? czr0.b : czr0.f5237a);
                                    break;
                            }
                            arrayList8.add(new ku1(new tr1(jLongValue, strA17, str18, z7, false, rr1VarP)));
                        }
                        if (arrayList8.isEmpty()) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.i;
                            xuzVar.getClass();
                            mu1Var = new nu1(new mdm(xuz.a(pb10Var, iIntValue3), ju1Var == null ? pdm.f26814a : pdm.c, null, 0, 0, R.string.tournament_result_not_available, 0, 0, 0L, 0L, 988), ju1Var);
                        } else {
                            mu1Var = new mu1(dyb.o0(CollectionsKt.q0(q3d.k(ju1Var), arrayList8)));
                        }
                        return mu1Var;
                    case 4:
                        return b(obj);
                    case 5:
                        return p8a.d0((gu1) obj, s9s0.f31863a, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 6:
                        return p8a.d0((gu1) obj, s9s0.b, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    default:
                        return p8a.d0((gu1) obj, s9s0.c, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                }
            }
        }, (byte) 20));
        final byte b6 = 4;
        this.w = maz.b(new yw9(yu1Var.k, new Function1(this) { // from class: a.fv1
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                pt0 pt0Var;
                String strA;
                int i2;
                nur murVar;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                boolean zEquals = dt1Var.equals(ct1.f4914a);
                gv1 gv1Var = this.b;
                xll xllVar = xll.f41078a;
                if (zEquals) {
                    return new aml(x4d0.g0((ot0) gv1Var.a().c()), xllVar, true);
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new zll(x4d0.g0((ot0) gv1Var.a().c()), xllVar, lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                Map map = (Map) ((fee) gv1Var.l.getValue()).c();
                ctf0 ctf0Var2 = gv1Var.b;
                boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                ot0 ot0Var = (ot0) gv1Var.a().c();
                map.getClass();
                ctf0Var2.getClass();
                set.getClass();
                ot0Var.getClass();
                int iOrdinal = ot0Var.ordinal();
                if (iOrdinal == 0) {
                    pt0Var = pt0.f27539a;
                } else if (iOrdinal == 1) {
                    pt0Var = pt0.b;
                } else if (iOrdinal == 2) {
                    pt0Var = pt0.c;
                } else if (iOrdinal == 3) {
                    pt0Var = pt0.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    pt0Var = pt0.e;
                }
                Collection collectionValues = map.values();
                ArrayList arrayList = new ArrayList(r3d.q(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    mlr mlrVar = (mlr) it.next();
                    long j = mlrVar.f22006a;
                    boolean z = mlrVar.k;
                    boolean zContains = set.contains(Long.valueOf(j));
                    int i3 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                    boolean z2 = mlrVar.j;
                    if (z) {
                        strA = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = z2 ? ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                    }
                    Iterator it2 = it;
                    ctf0 ctf0Var3 = ctf0Var2;
                    long j2 = mlrVar.f22006a;
                    String str = mlrVar.f;
                    String str2 = mlrVar.e;
                    if (zBooleanValue) {
                        i2 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                    } else {
                        i2 = 0;
                    }
                    mtr mtrVar = new mtr(i2, zContains);
                    n0x n0xVar2 = new n0x(mlrVar.g);
                    m0x m0xVar = new m0x(i3, null, 6);
                    if (strA.length() == 0) {
                        murVar = lur.f20686a;
                        n0xVar = n0xVar2;
                    } else {
                        pt0 pt0Var4 = pt0.f27539a;
                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                            n0xVar = n0xVar2;
                        } else {
                            n0xVar = n0xVar2;
                            pt0 pt0Var5 = pt0.d;
                            if (pt0Var != pt0Var5 || !z) {
                                if ((pt0Var == pt0Var4 && z2) || ((pt0Var == pt0Var2 && z2) || (pt0Var == pt0Var5 && z2))) {
                                    d4d d4dVar = d4d.PRIMARY;
                                    uqo0Var = new eqo0();
                                } else {
                                    pt0 pt0Var6 = pt0.b;
                                    if ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) {
                                        uqo0Var = kro0.f18776a;
                                    } else {
                                        uqo0Var = ((pt0Var == pt0Var6 && z2) || (pt0Var == pt0Var3 && z2)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                    }
                                }
                            }
                            murVar = new mur(strA, uqo0Var);
                        }
                        d4d d4dVar2 = d4d.PRIMARY;
                        uqo0Var = new lro0();
                        murVar = new mur(strA, uqo0Var);
                    }
                    arrayList.add(new st0(j2, str, str2, mtrVar, n0xVar, m0xVar, null, murVar));
                    ctf0Var2 = ctf0Var3;
                    it = it2;
                }
                return new zll(pt0Var, xllVar, arrayList);
            }

            private final Object b(Object obj) {
                Iterable iterableC;
                xw1 xw1Var;
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.e;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                if (dt1Var.equals(ct1.f4914a)) {
                    gu1 gu1Var2 = (gu1) ((fee) n0o0Var.getValue()).c();
                    if (gu1Var2 != null && gu1Var2.b != z1s0.f43637a && gu1Var2.d) {
                        return new ys1(dyb.g0(new mw1(uw1.f36373a)));
                    }
                    hrl hrlVar = hrl.f13536a;
                    return new xs1(dyb.g0(new pu1(jrl.f17007a)));
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new xs1(lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                gu1 gu1Var3 = (gu1) ((fee) n0o0Var.getValue()).c();
                if (gu1Var3 == null) {
                    return new xs1(lak0.c);
                }
                List list = (List) ((fee) gv1Var.m.getValue()).c();
                Map map = (Map) ((fee) gv1Var.n.getValue()).c();
                Set set = (Set) ((fee) gv1Var.p.getValue()).c();
                list.getClass();
                map.getClass();
                set.getClass();
                if (gu1Var3.b == z1s0.f43637a || !gu1Var3.d) {
                    z78 z78Var = gu1Var3.j;
                    if (z78Var.f43905a) {
                        iterableC = iun.f15405a;
                    } else {
                        String strR = q8a.R(z78Var.c.concat(Separators.RETURN));
                        String strR2 = q8a.R(z78Var.d);
                        if (StringsKt.u0(strR).toString().length() == 0 && strR2.length() == 0) {
                            iterableC = iun.f15405a;
                        } else {
                            String strS = z78Var.e ? q8a.S(list) : null;
                            String str = strS != null ? strS : "";
                            hrl hrlVar2 = hrl.f13536a;
                            iterableC = kotlin.collections.a.c(new pu1(new irl(z78Var.b, StringsKt.v0(strR + str + strR2).toString())));
                        }
                    }
                    return new xs1(dyb.o0(iterableC));
                }
                o98 o98Var = gu1Var3.k;
                lc00 lc00VarB = kotlin.collections.a.b();
                String strR3 = q8a.R(o98Var.f24867a);
                List<jng0> list2 = o98Var.b;
                jng0 jng0Var = (jng0) CollectionsKt.firstOrNull(list2);
                String str2 = jng0Var != null ? jng0Var.e : null;
                String strR4 = q8a.R(str2 != null ? str2 : "");
                if (strR3.length() > 0) {
                    String strS2 = q8a.S(list);
                    lc00VarB.add(new mw1(new tw1(o98Var.c, StringsKt.v0(strR3 + strS2 + strR4).toString(), new ow1(new m0x(R.drawable.ic_glyph_tournaments, null, 6)), set.contains(xr1.f41347a))));
                }
                ArrayList arrayList = new ArrayList();
                for (jng0 jng0Var2 : list2) {
                    String strR5 = q8a.R(jng0Var2.f16811a);
                    String strR6 = q8a.R(jng0Var2.e);
                    if (strR5.length() == 0 || strR6.length() == 0) {
                        xw1Var = null;
                    } else {
                        List list3 = (List) map.get(Long.valueOf(jng0Var2.b));
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        String strS3 = q8a.S(list3);
                        xw1Var = new xw1(jng0Var2.b, jng0Var2.d, jng0Var2.c, StringsKt.v0(strR5 + strS3 + strR6).toString());
                    }
                    if (xw1Var != null) {
                        arrayList.add(xw1Var);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    xw1 xw1Var2 = (xw1) next;
                    long j = xw1Var2.f41588a;
                    wr1 wr1Var = new wr1(j);
                    Date date = xw1Var2.b;
                    Date date2 = xw1Var2.c;
                    rdj rdjVar = rdj.f30294a;
                    sdj sdjVar = sdj.UNIQUE_3;
                    lc00VarB.add(new lw1(j, new tw1(kng0.l(rdj.c(rdjVar, sdjVar, date, null, 60), " - ", rdj.c(rdjVar, sdjVar, date2, null, 60)), xw1Var2.d, new pw1(String.valueOf(i3)), set.contains(wr1Var))));
                    it = it;
                    i2 = i3;
                }
                return new ys1(dyb.o0(kotlin.collections.a.a(lc00VarB)));
            }

            /* JADX WARN: Code duplicated, block: B:358:0x09c5  */
            /* JADX WARN: Code duplicated, block: B:500:0x0c58  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                lt1 lt1Var;
                gx1 gx1Var;
                int i2;
                gu1 gu1Var2;
                lsm0 lsm0Var;
                lc00 lc00Var;
                ft1 ft1Var;
                pt0 pt0Var;
                lsm0 lsm0Var2;
                String strA;
                Collection collectionJ;
                boolean z;
                mt1 mt1Var;
                String strA2;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                lc00 lc00Var2;
                zu1 zu1Var;
                List list;
                List list2;
                List listSubList;
                gu1 gu1Var3;
                ArrayList arrayList;
                Iterator it;
                Object obj2;
                List list3;
                long j;
                rrl rrlVar;
                int i3;
                kt1 kt1Var;
                jt1 jt1Var;
                int i4;
                String strA3;
                Collection collectionJ2;
                Iterable iterableD0;
                int i5;
                int i6;
                int iIntValue;
                int iNextIndex;
                int i7;
                ft1 ft1Var2;
                String strL;
                String strK;
                String str4;
                n0x n0xVar2;
                String str5;
                String strA4;
                String strA5;
                Object mu1Var;
                rr1 rr1VarP;
                byte b7 = b6;
                bt1 bt1Var = bt1.f3159a;
                at1 at1Var = at1.f1413a;
                arl arlVar = arl.f1351a;
                ct1 ct1Var = ct1.f4914a;
                gv1 gv1Var = this.b;
                switch (b7) {
                    case 0:
                        return p8a.d0((gu1) obj, s9s0.d, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 1:
                        n0o0 n0o0Var = gv1Var.j;
                        n0o0 n0o0Var2 = gv1Var.q;
                        dt1 dt1Var = (dt1) obj;
                        dt1Var.getClass();
                        boolean zEquals = dt1Var.equals(ct1Var);
                        bzw bzwVar = null;
                        int i8 = 6;
                        o0s o0sVar = o0s.f24443a;
                        if (zEquals) {
                            zu1 zu1Var2 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            et1 et1Var = new et1(zu1Var2.f44988a, ew1.f8498a);
                            lt1 lt1Var2 = new lt1(zu1Var2.b, zrl.f44860a);
                            gt1 gt1Var = new gt1(zu1Var2.c, arlVar);
                            ft1 ft1Var3 = new ft1(zu1Var2.d, jw1.f17229a);
                            mt1 mt1Var2 = new mt1(new ijm());
                            nt1 nt1Var = new nt1(new aml(x4d0.g0((ot0) gv1Var.a().c()), new wll(o0sVar), true));
                            kt1 kt1Var2 = new kt1(zu1Var2.e, mrl.f22278a);
                            jt1 jt1Var2 = new jt1(zu1Var2.f, jrl.f17007a);
                            ht1 ht1Var = new ht1(new ijm());
                            jdk0 jdk0Var = rh1.f30465a;
                            String str6 = (String) ((fee) n0o0Var.getValue()).c();
                            jdk0Var.getClass();
                            return dyb.g0(et1Var, lt1Var2, gt1Var, ft1Var3, mt1Var2, nt1Var, kt1Var2, jt1Var2, ht1Var, new it1(new col(new b0i(sh1.b, jdk0.e(str6)))));
                        }
                        if (!dt1Var.equals(at1Var)) {
                            if (dt1Var.equals(bt1Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var4 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var4 != null) {
                            ctf0 ctf0Var2 = gv1Var.b;
                            Locale locale2 = (Locale) gv1Var.B;
                            zu1 zu1Var3 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            String str7 = (String) ((fee) gv1Var.h.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                            ot0 ot0Var = (ot0) gv1Var.a().c();
                            boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                            Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                            String str8 = (String) ((fee) n0o0Var.getValue()).c();
                            ctf0Var2.getClass();
                            zu1Var3.getClass();
                            str7.getClass();
                            ot0Var.getClass();
                            set.getClass();
                            str8.getClass();
                            lc00 lc00VarB = kotlin.collections.a.b();
                            cw1 cw1Var = zu1Var3.f44988a;
                            z1s0 z1s0Var = gu1Var4.b;
                            rdj rdjVar = rdj.f30294a;
                            j88 j88Var = gu1Var4.e;
                            Set set2 = set;
                            long j2 = j88Var.e;
                            long j3 = j88Var.i;
                            zoe zoeVar = j88Var.f16071a;
                            Date dateK = rdj.k(j3);
                            Date dateK2 = rdj.k(j2);
                            Date date = new Date();
                            bw1 bw1Var = ((date.after(dateK) && date.before(dateK2)) || new Date().before(dateK)) ? bw1.f3302a : bw1.b;
                            long j4 = ((j2 - j3) * 1000) / 86400000;
                            String str9 = j88Var.g;
                            String str10 = j88Var.h;
                            int iOrdinal = cw1Var.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                o0sVar = o0sVar;
                                str = "";
                            } else {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        strA5 = eeq.R(dateK, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA5 = ctf0Var2.b.a(R.string.tournament_prize_pool_title_date_start, Arrays.copyOf(new Object[0], 0));
                                str = strA5;
                            }
                            String strS = eeq.S(dateK, ctf0Var2, cw1Var, locale2);
                            int iOrdinal2 = cw1Var.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                str2 = "";
                            } else {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        strA4 = eeq.R(dateK2, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA4 = ctf0Var2.b.a(R.string.tournament_title_date_end, Arrays.copyOf(new Object[0], 0));
                                str2 = strA4;
                            }
                            String strS2 = eeq.S(dateK2, ctf0Var2, cw1Var, locale2);
                            Object[] objArr = {Long.valueOf(j4)};
                            lsm0 lsm0Var3 = ctf0Var2.b;
                            String strA6 = lsm0Var3.a(R.string.days_v2, Arrays.copyOf(objArr, 1));
                            String strA7 = bw1Var == bw1.b ? lsm0Var3.a(R.string.end_of_tournament, Arrays.copyOf(new Object[0], 0)) : "";
                            int iOrdinal3 = cw1Var.ordinal();
                            if (iOrdinal3 == 0) {
                                str3 = "Background Picture.webp";
                            } else if (iOrdinal3 == 1) {
                                str3 = "Picture S.webp";
                            } else {
                                if (iOrdinal3 != 2) {
                                    if (iOrdinal3 == 3) {
                                        str3 = "";
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                str3 = "Dates.webp";
                            }
                            List list4 = u0d.f34849a;
                            n0x n0xVar3 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(str3)));
                            int[] iArr = iu1.f15377a;
                            lc00VarB.add(new et1(cw1Var, new dw1(bw1Var, str9, str10, str, strS, str2, strS2, strA6, strA7, n0xVar3, new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Left.webp" : ""))), new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Right.webp" : ""))))));
                            gx1 gx1Var2 = zu1Var3.b;
                            if (zoeVar.d == qpe.c) {
                                lt1Var = null;
                            } else {
                                int iOrdinal4 = gx1Var2.ordinal();
                                if (iOrdinal4 == 0) {
                                    gx1Var = gx1.f12054a;
                                } else if (iOrdinal4 == 1) {
                                    gx1Var = gx1.b;
                                } else {
                                    if (iOrdinal4 != 2) {
                                        if (iOrdinal4 == 3) {
                                            gx1Var = gx1.d;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    gx1Var = gx1.c;
                                }
                                String str11 = zoeVar.c;
                                int iOrdinal5 = gx1Var2.ordinal();
                                if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                                    i2 = R.string.day_short;
                                } else {
                                    if (iOrdinal5 != 2) {
                                        if (iOrdinal5 == 3) {
                                            i2 = R.string.day_short_2;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    i2 = R.string.days_in_case_caps;
                                }
                                String strA8 = lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0));
                                gx1 gx1Var3 = gx1.c;
                                String strA9 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.hours_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA10 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.minutes_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA11 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.seconds_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                long jCurrentTimeMillis = zoeVar.f44716a - System.currentTimeMillis();
                                lt1Var = new lt1(gx1Var, new yrl(str11, strA8, strA9, strA10, strA11, jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis));
                            }
                            if (lt1Var != null) {
                                lc00VarB.add(lt1Var);
                            }
                            gt1 gt1VarT0 = ntr.t0(gu1Var4, ctf0Var2, zu1Var3.c);
                            if (gt1VarT0 != null) {
                                lc00VarB.add(gt1VarT0);
                            }
                            gw1 gw1Var = zu1Var3.d;
                            w88 w88Var = gu1Var4.f;
                            boolean z2 = w88Var.f38710a;
                            List list5 = w88Var.c;
                            if (z2 || list5.isEmpty()) {
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = null;
                            } else {
                                String strA12 = w88Var.e;
                                if (strA12.length() == 0) {
                                    i7 = 0;
                                    strA12 = lsm0Var3.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i7 = 0;
                                }
                                String strA13 = lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[i7], i7));
                                if (list5.size() <= 5) {
                                    strA13 = null;
                                }
                                String str12 = strA13 == null ? "" : strA13;
                                boolean z3 = w88Var.b == xxb0.f41650a;
                                String strF = ctf0Var2.f(R.string.fs, new Object[0]);
                                ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                                Iterator it2 = list5.iterator();
                                int i9 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    pxb0 pxb0Var = (pxb0) next;
                                    if (z3) {
                                        String strF2 = ctf0Var2.f(R.string.place, new Object[0]);
                                        int i11 = pxb0Var.b;
                                        int i12 = pxb0Var.c;
                                        strL = i11 == i12 ? dw9.m(i11, Separators.SP, strF2) : i11 + "-" + i12 + Separators.SP + strF2;
                                    } else {
                                        ft1Var2 = ft1Var2;
                                        strL = kng0.l(ctf0Var2.f(R.string.stocks_prizes, new Object[0]), ": ", pxb0Var.h);
                                    }
                                    int i13 = pxb0Var.i;
                                    String str13 = i13 > 0 ? strF + Separators.SP + i13 : "";
                                    if (z1s0Var != z1s0.f43637a) {
                                        strK = pxb0Var.d;
                                    } else {
                                        pn40 pn40Var = pn40.f27267a;
                                        double d = pxb0Var.f;
                                        p3u0 p3u0Var = p3u0.c;
                                        strK = b1j.k("\u202a", str7, Separators.SP, pn40.l(d), "\u202c");
                                    }
                                    String str14 = strK;
                                    String str15 = pxb0Var.f27747a;
                                    int iOrdinal6 = gw1Var.ordinal();
                                    if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
                                        if (i10 == 1) {
                                            str4 = "Number_Gold.webp";
                                        } else if (i10 == 2) {
                                            str4 = "Number_Silver.webp";
                                        } else if (i10 != 3) {
                                            str4 = gw1Var == gw1.c ? "Number_Other_Star.webp" : "Number_Other.webp";
                                        } else {
                                            str4 = "Number_Bronze.webp";
                                        }
                                        List list6 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/".concat(str4)));
                                    } else {
                                        if (iOrdinal6 != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                        if (i10 == 1) {
                                            str5 = "Illustration_Gold.webp";
                                        } else if (i10 != 2) {
                                            str5 = i10 != 3 ? "Illustration_Other.webp" : "Illustration_Bronze.webp";
                                        } else {
                                            str5 = "Illustration_Silver.webp";
                                        }
                                        List list7 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/illustration/".concat(str5)));
                                    }
                                    arrayList2.add(new vv1(str15, n0xVar2, strL, str14, str13));
                                    i9 = i10;
                                    it2 = it3;
                                    lsm0Var3 = lsm0Var3;
                                    gu1Var4 = gu1Var4;
                                    lc00VarB = lc00VarB;
                                    ft1Var2 = ft1Var2;
                                }
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = new ft1(gw1Var, new iw1(dyb.o0(arrayList2), strA12, str12));
                            }
                            lc00 lc00Var3 = lc00Var;
                            if (ft1Var != null) {
                                lc00Var3.add(ft1Var);
                            }
                            gu1 gu1Var5 = gu1Var2;
                            List list8 = gu1Var5.r;
                            if (list8.isEmpty()) {
                                collectionJ = iun.f15405a;
                                lsm0Var2 = lsm0Var;
                            } else {
                                int iOrdinal7 = ot0Var.ordinal();
                                if (iOrdinal7 == 0) {
                                    pt0Var = pt0.f27539a;
                                } else if (iOrdinal7 == 1) {
                                    pt0Var = pt0.b;
                                } else if (iOrdinal7 == 2) {
                                    pt0Var = pt0.c;
                                } else if (iOrdinal7 == 3) {
                                    pt0Var = pt0.d;
                                } else {
                                    if (iOrdinal7 != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    pt0Var = pt0.e;
                                }
                                if (list8.size() == 1) {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_game, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                mt1 mt1Var3 = new mt1(new hjm(strA, null, null, null, null, null, false, null, null, false, null, null, 7166));
                                wll wllVar = new wll(o0sVar);
                                List listD0 = CollectionsKt.D0(list8, 8);
                                ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                Iterator it4 = listD0.iterator();
                                while (it4.hasNext()) {
                                    mlr mlrVar = (mlr) it4.next();
                                    long j5 = mlrVar.f22006a;
                                    boolean z4 = mlrVar.k;
                                    Set set3 = set2;
                                    boolean zContains = set3.contains(Long.valueOf(j5));
                                    int i14 = zBooleanValue ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    Iterator it5 = it4;
                                    boolean z5 = mlrVar.j;
                                    if (z4) {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = lsm0Var2.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = z ? lsm0Var2.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    set2 = set3;
                                    long j6 = mlrVar.f22006a;
                                    String str16 = mlrVar.f;
                                    String str17 = mlrVar.e;
                                    mtr mtrVar = new mtr(zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar4 = new n0x(mlrVar.g);
                                    m0x m0xVar = new m0x(i14, bzwVar, i8);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        n0xVar = n0xVar4;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z4) || (pt0Var == (pt0Var2 = pt0.c) && z4)) {
                                            n0xVar = n0xVar4;
                                        } else {
                                            n0xVar = n0xVar4;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z4) {
                                                if ((pt0Var == pt0Var4 && z) || ((pt0Var == pt0Var2 && z) || (pt0Var == pt0Var5 && z))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var3 = pt0.e) && z4)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z) || (pt0Var == pt0Var3 && z)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList3.add(new st0(j6, str16, str17, mtrVar, n0xVar, m0xVar, null, murVar));
                                    it4 = it5;
                                    mt1Var3 = mt1Var;
                                    i8 = 6;
                                    bzwVar = null;
                                }
                                collectionJ = q3d.j(mt1Var3, new nt1(new zll(pt0Var, wllVar, arrayList3)));
                            }
                            lc00Var3.addAll(collectionJ);
                            zu1 zu1Var4 = zu1Var3;
                            l5i l5iVar = zu1Var4.e;
                            List list9 = gu1Var5.l.f38767a;
                            long j7 = gu1Var5.q;
                            List list10 = gu1Var5.k.b;
                            z1s0 z1s0Var2 = z1s0.b;
                            url urlVar = url.f36169a;
                            vrl vrlVar = vrl.f37904a;
                            if (z1s0Var == z1s0Var2) {
                                if (list10.isEmpty()) {
                                    iterableD0 = iun.f15405a;
                                } else if (list10.size() <= 3) {
                                    iterableD0 = list10;
                                } else if (plc.z(gu1Var5)) {
                                    int size = list10.size();
                                    Date date2 = new Date();
                                    ListIterator listIterator = list10.listIterator(list10.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                        } else if (((jng0) listIterator.previous()).c.before(date2)) {
                                            iNextIndex = listIterator.nextIndex();
                                        }
                                    }
                                    if (iNextIndex == -1) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(list10.get(iNextIndex));
                                        for (int i15 = iNextIndex + 1; i15 < size && arrayList4.size() < 3; i15++) {
                                            arrayList4.add(list10.get(i15));
                                        }
                                        if (arrayList4.size() < 3) {
                                            int i16 = iNextIndex - 1;
                                            for (int i17 = 3; -1 < i16 && arrayList4.size() < i17; i17 = 3) {
                                                arrayList4.add(0, list10.get(i16));
                                                i16--;
                                            }
                                            iterableD0 = arrayList4;
                                        } else {
                                            int i18 = iNextIndex >= size - 2 ? size - 3 : iNextIndex > 0 ? iNextIndex : 0;
                                            iterableD0 = list10.subList(i18, i18 + 3);
                                        }
                                    }
                                } else if (list10.size() > 3) {
                                    int iOrdinal8 = j88Var.j.ordinal();
                                    if (iOrdinal8 == 0) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else if (iOrdinal8 == 1) {
                                        int size2 = list10.size();
                                        Date date3 = new Date();
                                        Iterator it6 = list10.iterator();
                                        int i19 = 0;
                                        while (true) {
                                            if (it6.hasNext()) {
                                                jng0 jng0Var = (jng0) it6.next();
                                                i5 = size2;
                                                Date date4 = jng0Var.d;
                                                Date date5 = jng0Var.c;
                                                if (!date3.after(date4) || !date3.before(date5)) {
                                                    i19++;
                                                    size2 = i5;
                                                }
                                            } else {
                                                i5 = size2;
                                                i19 = -1;
                                            }
                                        }
                                        Integer numValueOf = Integer.valueOf(i19);
                                        if (i19 < 0) {
                                            numValueOf = null;
                                        }
                                        if (numValueOf != null) {
                                            iIntValue = numValueOf.intValue();
                                        } else {
                                            Iterator it7 = list10.iterator();
                                            int i20 = 0;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    int i21 = i20;
                                                    if (((jng0) it7.next()).b == j7) {
                                                        i6 = i21;
                                                    } else {
                                                        i20 = i21 + 1;
                                                    }
                                                } else {
                                                    i6 = -1;
                                                }
                                            }
                                            Integer numValueOf2 = Integer.valueOf(i6);
                                            if (i6 < 0) {
                                                numValueOf2 = null;
                                            }
                                            iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                        }
                                        if (iIntValue >= i5 - 2) {
                                            iIntValue = i5 - 3;
                                        } else if (iIntValue <= 0) {
                                            iIntValue = 0;
                                        }
                                        iterableD0 = list10.subList(iIntValue, iIntValue + 3);
                                    } else {
                                        if (iOrdinal8 != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        iterableD0 = CollectionsKt.E0(3, list10);
                                    }
                                } else {
                                    iterableD0 = list10;
                                }
                                ArrayList arrayList5 = new ArrayList(r3d.q(iterableD0, 10));
                                Iterator it8 = iterableD0.iterator();
                                int i22 = 0;
                                while (it8.hasNext()) {
                                    Object next2 = it8.next();
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    jng0 jng0Var2 = (jng0) next2;
                                    Date date6 = new Date();
                                    Date date7 = jng0Var2.d;
                                    Iterator it9 = it8;
                                    Date date8 = jng0Var2.c;
                                    List list11 = list10;
                                    rdj rdjVar2 = rdj.f30294a;
                                    sdj sdjVar = sdj.UNIQUE_3;
                                    List list12 = list9;
                                    lc00 lc00Var4 = lc00Var3;
                                    zu1 zu1Var5 = zu1Var4;
                                    String strL2 = kng0.l(rdj.c(rdjVar2, sdjVar, date7, locale2, 28), " - ", rdj.c(rdjVar2, sdjVar, date8, locale2, 28));
                                    String strValueOf = String.valueOf(jng0Var2.b);
                                    long time = jng0Var2.d.getTime();
                                    gu1 gu1Var6 = gu1Var5;
                                    double dCurrentTimeMillis = (((System.currentTimeMillis() - time) / 1000) / ((date8.getTime() - time) / 1000)) * 100.0d;
                                    arrayList5.add(date6.before(date7) ? new rrl(strValueOf, strL2, jng0Var2.f16811a, urlVar) : (date6.after(date7) && date6.before(date8)) ? new rrl(strValueOf, strL2, null, new wrl((dCurrentTimeMillis <= 0.0d || dCurrentTimeMillis >= 1.0d) ? (int) dCurrentTimeMillis : 1, 100)) : new rrl(strValueOf, strL2, null, vrlVar));
                                    it8 = it9;
                                    list10 = list11;
                                    i22 = i23;
                                    list9 = list12;
                                    zu1Var4 = zu1Var5;
                                    gu1Var5 = gu1Var6;
                                    lc00Var3 = lc00Var4;
                                }
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                list = list10;
                                list2 = list9;
                                gu1Var3 = gu1Var5;
                                arrayList = arrayList5;
                            } else {
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                gu1 gu1Var7 = gu1Var5;
                                list = list10;
                                list2 = list9;
                                List list13 = (list2.isEmpty() || list2.size() <= 3) ? null : list2;
                                if (list13 != null) {
                                    Iterator it10 = list13.iterator();
                                    int i24 = 0;
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            i3 = -1;
                                        } else if (((fzl0) it10.next()).c == j7) {
                                            i3 = i24;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i3);
                                    if (i3 < 0) {
                                        numValueOf3 = null;
                                    }
                                    int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                    int size3 = iIntValue2 == 0 ? 0 : iIntValue2 >= list13.size() + (-2) ? list13.size() - 3 : iIntValue2 - 1;
                                    int i25 = size3 + 3;
                                    int size4 = list13.size();
                                    if (i25 > size4) {
                                        i25 = size4;
                                    }
                                    listSubList = list13.subList(size3, i25);
                                    if (listSubList == null) {
                                        listSubList = list2;
                                    }
                                } else {
                                    listSubList = list2;
                                }
                                ArrayList arrayList6 = new ArrayList(r3d.q(listSubList, 10));
                                Iterator it11 = listSubList.iterator();
                                int i26 = 0;
                                while (it11.hasNext()) {
                                    Object next3 = it11.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fzl0 fzl0Var = (fzl0) next3;
                                    gu1 gu1Var8 = gu1Var7;
                                    Iterator it12 = gu1Var8.h.f17902a.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            Object next4 = it12.next();
                                            it = it11;
                                            if (((o2g0) next4).b) {
                                                obj2 = next4;
                                            } else {
                                                it11 = it;
                                            }
                                        } else {
                                            it = it11;
                                            obj2 = null;
                                        }
                                    }
                                    o2g0 o2g0Var = (o2g0) obj2;
                                    int i28 = o2g0Var != null ? o2g0Var.d : 0;
                                    int i29 = fzl0Var.b;
                                    boolean z6 = i28 >= i29;
                                    int i30 = (int) fzl0Var.c;
                                    int i31 = (int) j7;
                                    fzl0 fzl0Var2 = (fzl0) CollectionsKt.W(i26 - 1, listSubList);
                                    int i32 = fzl0Var2 != null ? fzl0Var2.b : 0;
                                    if (i30 != i31 || !gu1Var8.c) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = i31 > i30 ? new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar) : new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, urlVar);
                                    } else if (z6) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar);
                                    } else {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), lsm0Var2.a(R.string.tournament_stage_points_left_2_v2, Arrays.copyOf(new Object[]{String.valueOf(i29 - i28)}, 1)), new wrl(i28 - i32, i29 - i32));
                                    }
                                    arrayList6.add(rrlVar);
                                    it11 = it;
                                    i26 = i27;
                                    gu1Var7 = gu1Var8;
                                    listSubList = list3;
                                    j7 = j;
                                }
                                gu1Var3 = gu1Var7;
                                arrayList = arrayList6;
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                String strA14 = lsm0Var2.a(R.string.tournament_stages, Arrays.copyOf(new Object[0], 0));
                                String strA15 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                if (z1s0Var != z1s0.b ? list2.size() <= 3 : list.size() <= 3) {
                                    strA15 = null;
                                }
                                if (strA15 == null) {
                                    strA15 = "";
                                }
                                kt1Var = new kt1(l5iVar, new lrl(dyb.o0(arrayList), strA14, strA15));
                            } else {
                                kt1Var = null;
                            }
                            lc00 lc00Var5 = lc00Var2;
                            if (kt1Var != null) {
                                lc00Var5.add(kt1Var);
                            }
                            hrl hrlVar = zu1Var.f;
                            s98 s98Var = gu1Var3.i;
                            if (s98Var.f31841a.isEmpty()) {
                                jt1Var = null;
                            } else {
                                String strA16 = s98Var.b;
                                if (strA16.length() == 0) {
                                    strA16 = lsm0Var2.a(R.string.rules_title, Arrays.copyOf(new Object[0], 0));
                                }
                                jt1Var = new jt1(hrlVar, new irl(strA16, CollectionsKt.b0(s98Var.f31841a, Separators.RETURN, null, null, null, 62)));
                            }
                            if (jt1Var != null) {
                                lc00Var5.add(jt1Var);
                            }
                            sh1 sh1Var = sh1.b;
                            rh1.f30465a.getClass();
                            b0i b0iVar = new b0i(sh1Var, jdk0.e(str8));
                            List list14 = gu1Var3.g;
                            if (list14.isEmpty()) {
                                collectionJ2 = iun.f15405a;
                            } else {
                                if (list14.size() > 8) {
                                    i4 = 0;
                                    strA3 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i4 = 0;
                                    strA3 = null;
                                }
                                ht1 ht1Var2 = new ht1(new hjm(lsm0Var2.a(R.string.providers, Arrays.copyOf(new Object[i4], i4)), null, null, null, null, null, false, null, null, false, strA3 != null ? new ue9(strA3) : null, null, 7166));
                                List<izb0> listD1 = CollectionsKt.D0(list14, 8);
                                ArrayList arrayList7 = new ArrayList(r3d.q(listD1, 10));
                                for (izb0 izb0Var : listD1) {
                                    arrayList7.add(new eol(String.valueOf(izb0Var.c), new n0x(izb0Var.f15628a), false, izb0Var.b, "-", lsm0Var2.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), null));
                                }
                                collectionJ2 = q3d.j(ht1Var2, new it1(new bol(dyb.o0(arrayList7), b0iVar)));
                            }
                            lc00Var5.addAll(collectionJ2);
                            a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00Var5));
                            if (a4xVarO0 != null) {
                                return a4xVarO0;
                            }
                        }
                        return lak0.c;
                    case 2:
                        return a(obj);
                    case 3:
                        n0o0 n0o0Var3 = gv1Var.q;
                        dt1 dt1Var2 = (dt1) obj;
                        dt1Var2.getClass();
                        if (dt1Var2.equals(ct1Var)) {
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            lc00VarB2.add(new ju1(((zu1) ((fee) n0o0Var3.getValue()).b()).c, arlVar));
                            for (int i33 = 0; i33 < 10; i33++) {
                                lc00VarB2.add(new ku1(ur1.f36143a));
                            }
                            return new mu1(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                        }
                        if (!dt1Var2.equals(at1Var)) {
                            if (dt1Var2.equals(bt1Var)) {
                                return new mu1(lak0.c);
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var9 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var9 == null) {
                            return new mu1(lak0.c);
                        }
                        ctf0 ctf0Var3 = gv1Var.b;
                        zu1 zu1Var6 = (zu1) ((fee) n0o0Var3.getValue()).b();
                        int iIntValue3 = ((Number) ((fee) gv1Var.r.getValue()).c()).intValue();
                        ctf0Var3.getClass();
                        zu1Var6.getClass();
                        gt1 gt1VarT1 = ntr.t0(gu1Var9, ctf0Var3, zu1Var6.c);
                        ju1 ju1Var = gt1VarT1 != null ? new ju1(gt1VarT1.f11859a, gt1VarT1.b) : null;
                        List<o2g0> list15 = gu1Var9.h.f17902a;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list15, 10));
                        for (o2g0 o2g0Var2 : list15) {
                            o2g0Var2.getClass();
                            String str18 = o2g0Var2.f24529a;
                            Long lT0 = StringsKt.t0(str18);
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String strA17 = ctf0Var3.b.a(R.string.tournament_points_v2, Arrays.copyOf(new Object[]{String.valueOf(o2g0Var2.d)}, 1));
                            boolean z7 = o2g0Var2.b;
                            int i34 = o2g0Var2.c;
                            switch (i34) {
                                case 1:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_one);
                                    break;
                                case 2:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_two);
                                    break;
                                case 3:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_three);
                                    break;
                                case 4:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_four);
                                    break;
                                case 5:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_five);
                                    break;
                                case 6:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_six);
                                    break;
                                case 7:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_seven);
                                    break;
                                case 8:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_eight);
                                    break;
                                case 9:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_nine);
                                    break;
                                case 10:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_ten);
                                    break;
                                default:
                                    rr1VarP = new qr1(String.valueOf(i34), z7 ? czr0.b : czr0.f5237a);
                                    break;
                            }
                            arrayList8.add(new ku1(new tr1(jLongValue, strA17, str18, z7, false, rr1VarP)));
                        }
                        if (arrayList8.isEmpty()) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.i;
                            xuzVar.getClass();
                            mu1Var = new nu1(new mdm(xuz.a(pb10Var, iIntValue3), ju1Var == null ? pdm.f26814a : pdm.c, null, 0, 0, R.string.tournament_result_not_available, 0, 0, 0L, 0L, 988), ju1Var);
                        } else {
                            mu1Var = new mu1(dyb.o0(CollectionsKt.q0(q3d.k(ju1Var), arrayList8)));
                        }
                        return mu1Var;
                    case 4:
                        return b(obj);
                    case 5:
                        return p8a.d0((gu1) obj, s9s0.f31863a, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 6:
                        return p8a.d0((gu1) obj, s9s0.b, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    default:
                        return p8a.d0((gu1) obj, s9s0.c, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                }
            }
        }, (byte) 20));
        final byte b7 = 5;
        this.x = maz.b(new yw9(gu1Var, new Function1(this) { // from class: a.fv1
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                pt0 pt0Var;
                String strA;
                int i2;
                nur murVar;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                boolean zEquals = dt1Var.equals(ct1.f4914a);
                gv1 gv1Var = this.b;
                xll xllVar = xll.f41078a;
                if (zEquals) {
                    return new aml(x4d0.g0((ot0) gv1Var.a().c()), xllVar, true);
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new zll(x4d0.g0((ot0) gv1Var.a().c()), xllVar, lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                Map map = (Map) ((fee) gv1Var.l.getValue()).c();
                ctf0 ctf0Var2 = gv1Var.b;
                boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                ot0 ot0Var = (ot0) gv1Var.a().c();
                map.getClass();
                ctf0Var2.getClass();
                set.getClass();
                ot0Var.getClass();
                int iOrdinal = ot0Var.ordinal();
                if (iOrdinal == 0) {
                    pt0Var = pt0.f27539a;
                } else if (iOrdinal == 1) {
                    pt0Var = pt0.b;
                } else if (iOrdinal == 2) {
                    pt0Var = pt0.c;
                } else if (iOrdinal == 3) {
                    pt0Var = pt0.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    pt0Var = pt0.e;
                }
                Collection collectionValues = map.values();
                ArrayList arrayList = new ArrayList(r3d.q(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    mlr mlrVar = (mlr) it.next();
                    long j = mlrVar.f22006a;
                    boolean z = mlrVar.k;
                    boolean zContains = set.contains(Long.valueOf(j));
                    int i3 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                    boolean z2 = mlrVar.j;
                    if (z) {
                        strA = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = z2 ? ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                    }
                    Iterator it2 = it;
                    ctf0 ctf0Var3 = ctf0Var2;
                    long j2 = mlrVar.f22006a;
                    String str = mlrVar.f;
                    String str2 = mlrVar.e;
                    if (zBooleanValue) {
                        i2 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                    } else {
                        i2 = 0;
                    }
                    mtr mtrVar = new mtr(i2, zContains);
                    n0x n0xVar2 = new n0x(mlrVar.g);
                    m0x m0xVar = new m0x(i3, null, 6);
                    if (strA.length() == 0) {
                        murVar = lur.f20686a;
                        n0xVar = n0xVar2;
                    } else {
                        pt0 pt0Var4 = pt0.f27539a;
                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                            n0xVar = n0xVar2;
                        } else {
                            n0xVar = n0xVar2;
                            pt0 pt0Var5 = pt0.d;
                            if (pt0Var != pt0Var5 || !z) {
                                if ((pt0Var == pt0Var4 && z2) || ((pt0Var == pt0Var2 && z2) || (pt0Var == pt0Var5 && z2))) {
                                    d4d d4dVar = d4d.PRIMARY;
                                    uqo0Var = new eqo0();
                                } else {
                                    pt0 pt0Var6 = pt0.b;
                                    if ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) {
                                        uqo0Var = kro0.f18776a;
                                    } else {
                                        uqo0Var = ((pt0Var == pt0Var6 && z2) || (pt0Var == pt0Var3 && z2)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                    }
                                }
                            }
                            murVar = new mur(strA, uqo0Var);
                        }
                        d4d d4dVar2 = d4d.PRIMARY;
                        uqo0Var = new lro0();
                        murVar = new mur(strA, uqo0Var);
                    }
                    arrayList.add(new st0(j2, str, str2, mtrVar, n0xVar, m0xVar, null, murVar));
                    ctf0Var2 = ctf0Var3;
                    it = it2;
                }
                return new zll(pt0Var, xllVar, arrayList);
            }

            private final Object b(Object obj) {
                Iterable iterableC;
                xw1 xw1Var;
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.e;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                if (dt1Var.equals(ct1.f4914a)) {
                    gu1 gu1Var2 = (gu1) ((fee) n0o0Var.getValue()).c();
                    if (gu1Var2 != null && gu1Var2.b != z1s0.f43637a && gu1Var2.d) {
                        return new ys1(dyb.g0(new mw1(uw1.f36373a)));
                    }
                    hrl hrlVar = hrl.f13536a;
                    return new xs1(dyb.g0(new pu1(jrl.f17007a)));
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new xs1(lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                gu1 gu1Var3 = (gu1) ((fee) n0o0Var.getValue()).c();
                if (gu1Var3 == null) {
                    return new xs1(lak0.c);
                }
                List list = (List) ((fee) gv1Var.m.getValue()).c();
                Map map = (Map) ((fee) gv1Var.n.getValue()).c();
                Set set = (Set) ((fee) gv1Var.p.getValue()).c();
                list.getClass();
                map.getClass();
                set.getClass();
                if (gu1Var3.b == z1s0.f43637a || !gu1Var3.d) {
                    z78 z78Var = gu1Var3.j;
                    if (z78Var.f43905a) {
                        iterableC = iun.f15405a;
                    } else {
                        String strR = q8a.R(z78Var.c.concat(Separators.RETURN));
                        String strR2 = q8a.R(z78Var.d);
                        if (StringsKt.u0(strR).toString().length() == 0 && strR2.length() == 0) {
                            iterableC = iun.f15405a;
                        } else {
                            String strS = z78Var.e ? q8a.S(list) : null;
                            String str = strS != null ? strS : "";
                            hrl hrlVar2 = hrl.f13536a;
                            iterableC = kotlin.collections.a.c(new pu1(new irl(z78Var.b, StringsKt.v0(strR + str + strR2).toString())));
                        }
                    }
                    return new xs1(dyb.o0(iterableC));
                }
                o98 o98Var = gu1Var3.k;
                lc00 lc00VarB = kotlin.collections.a.b();
                String strR3 = q8a.R(o98Var.f24867a);
                List<jng0> list2 = o98Var.b;
                jng0 jng0Var = (jng0) CollectionsKt.firstOrNull(list2);
                String str2 = jng0Var != null ? jng0Var.e : null;
                String strR4 = q8a.R(str2 != null ? str2 : "");
                if (strR3.length() > 0) {
                    String strS2 = q8a.S(list);
                    lc00VarB.add(new mw1(new tw1(o98Var.c, StringsKt.v0(strR3 + strS2 + strR4).toString(), new ow1(new m0x(R.drawable.ic_glyph_tournaments, null, 6)), set.contains(xr1.f41347a))));
                }
                ArrayList arrayList = new ArrayList();
                for (jng0 jng0Var2 : list2) {
                    String strR5 = q8a.R(jng0Var2.f16811a);
                    String strR6 = q8a.R(jng0Var2.e);
                    if (strR5.length() == 0 || strR6.length() == 0) {
                        xw1Var = null;
                    } else {
                        List list3 = (List) map.get(Long.valueOf(jng0Var2.b));
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        String strS3 = q8a.S(list3);
                        xw1Var = new xw1(jng0Var2.b, jng0Var2.d, jng0Var2.c, StringsKt.v0(strR5 + strS3 + strR6).toString());
                    }
                    if (xw1Var != null) {
                        arrayList.add(xw1Var);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    xw1 xw1Var2 = (xw1) next;
                    long j = xw1Var2.f41588a;
                    wr1 wr1Var = new wr1(j);
                    Date date = xw1Var2.b;
                    Date date2 = xw1Var2.c;
                    rdj rdjVar = rdj.f30294a;
                    sdj sdjVar = sdj.UNIQUE_3;
                    lc00VarB.add(new lw1(j, new tw1(kng0.l(rdj.c(rdjVar, sdjVar, date, null, 60), " - ", rdj.c(rdjVar, sdjVar, date2, null, 60)), xw1Var2.d, new pw1(String.valueOf(i3)), set.contains(wr1Var))));
                    it = it;
                    i2 = i3;
                }
                return new ys1(dyb.o0(kotlin.collections.a.a(lc00VarB)));
            }

            /* JADX WARN: Code duplicated, block: B:358:0x09c5  */
            /* JADX WARN: Code duplicated, block: B:500:0x0c58  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                lt1 lt1Var;
                gx1 gx1Var;
                int i2;
                gu1 gu1Var2;
                lsm0 lsm0Var;
                lc00 lc00Var;
                ft1 ft1Var;
                pt0 pt0Var;
                lsm0 lsm0Var2;
                String strA;
                Collection collectionJ;
                boolean z;
                mt1 mt1Var;
                String strA2;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                lc00 lc00Var2;
                zu1 zu1Var;
                List list;
                List list2;
                List listSubList;
                gu1 gu1Var3;
                ArrayList arrayList;
                Iterator it;
                Object obj2;
                List list3;
                long j;
                rrl rrlVar;
                int i3;
                kt1 kt1Var;
                jt1 jt1Var;
                int i4;
                String strA3;
                Collection collectionJ2;
                Iterable iterableD0;
                int i5;
                int i6;
                int iIntValue;
                int iNextIndex;
                int i7;
                ft1 ft1Var2;
                String strL;
                String strK;
                String str4;
                n0x n0xVar2;
                String str5;
                String strA4;
                String strA5;
                Object mu1Var;
                rr1 rr1VarP;
                byte b8 = b7;
                bt1 bt1Var = bt1.f3159a;
                at1 at1Var = at1.f1413a;
                arl arlVar = arl.f1351a;
                ct1 ct1Var = ct1.f4914a;
                gv1 gv1Var = this.b;
                switch (b8) {
                    case 0:
                        return p8a.d0((gu1) obj, s9s0.d, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 1:
                        n0o0 n0o0Var = gv1Var.j;
                        n0o0 n0o0Var2 = gv1Var.q;
                        dt1 dt1Var = (dt1) obj;
                        dt1Var.getClass();
                        boolean zEquals = dt1Var.equals(ct1Var);
                        bzw bzwVar = null;
                        int i8 = 6;
                        o0s o0sVar = o0s.f24443a;
                        if (zEquals) {
                            zu1 zu1Var2 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            et1 et1Var = new et1(zu1Var2.f44988a, ew1.f8498a);
                            lt1 lt1Var2 = new lt1(zu1Var2.b, zrl.f44860a);
                            gt1 gt1Var = new gt1(zu1Var2.c, arlVar);
                            ft1 ft1Var3 = new ft1(zu1Var2.d, jw1.f17229a);
                            mt1 mt1Var2 = new mt1(new ijm());
                            nt1 nt1Var = new nt1(new aml(x4d0.g0((ot0) gv1Var.a().c()), new wll(o0sVar), true));
                            kt1 kt1Var2 = new kt1(zu1Var2.e, mrl.f22278a);
                            jt1 jt1Var2 = new jt1(zu1Var2.f, jrl.f17007a);
                            ht1 ht1Var = new ht1(new ijm());
                            jdk0 jdk0Var = rh1.f30465a;
                            String str6 = (String) ((fee) n0o0Var.getValue()).c();
                            jdk0Var.getClass();
                            return dyb.g0(et1Var, lt1Var2, gt1Var, ft1Var3, mt1Var2, nt1Var, kt1Var2, jt1Var2, ht1Var, new it1(new col(new b0i(sh1.b, jdk0.e(str6)))));
                        }
                        if (!dt1Var.equals(at1Var)) {
                            if (dt1Var.equals(bt1Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var4 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var4 != null) {
                            ctf0 ctf0Var2 = gv1Var.b;
                            Locale locale2 = (Locale) gv1Var.B;
                            zu1 zu1Var3 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            String str7 = (String) ((fee) gv1Var.h.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                            ot0 ot0Var = (ot0) gv1Var.a().c();
                            boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                            Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                            String str8 = (String) ((fee) n0o0Var.getValue()).c();
                            ctf0Var2.getClass();
                            zu1Var3.getClass();
                            str7.getClass();
                            ot0Var.getClass();
                            set.getClass();
                            str8.getClass();
                            lc00 lc00VarB = kotlin.collections.a.b();
                            cw1 cw1Var = zu1Var3.f44988a;
                            z1s0 z1s0Var = gu1Var4.b;
                            rdj rdjVar = rdj.f30294a;
                            j88 j88Var = gu1Var4.e;
                            Set set2 = set;
                            long j2 = j88Var.e;
                            long j3 = j88Var.i;
                            zoe zoeVar = j88Var.f16071a;
                            Date dateK = rdj.k(j3);
                            Date dateK2 = rdj.k(j2);
                            Date date = new Date();
                            bw1 bw1Var = ((date.after(dateK) && date.before(dateK2)) || new Date().before(dateK)) ? bw1.f3302a : bw1.b;
                            long j4 = ((j2 - j3) * 1000) / 86400000;
                            String str9 = j88Var.g;
                            String str10 = j88Var.h;
                            int iOrdinal = cw1Var.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                o0sVar = o0sVar;
                                str = "";
                            } else {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        strA5 = eeq.R(dateK, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA5 = ctf0Var2.b.a(R.string.tournament_prize_pool_title_date_start, Arrays.copyOf(new Object[0], 0));
                                str = strA5;
                            }
                            String strS = eeq.S(dateK, ctf0Var2, cw1Var, locale2);
                            int iOrdinal2 = cw1Var.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                str2 = "";
                            } else {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        strA4 = eeq.R(dateK2, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA4 = ctf0Var2.b.a(R.string.tournament_title_date_end, Arrays.copyOf(new Object[0], 0));
                                str2 = strA4;
                            }
                            String strS2 = eeq.S(dateK2, ctf0Var2, cw1Var, locale2);
                            Object[] objArr = {Long.valueOf(j4)};
                            lsm0 lsm0Var3 = ctf0Var2.b;
                            String strA6 = lsm0Var3.a(R.string.days_v2, Arrays.copyOf(objArr, 1));
                            String strA7 = bw1Var == bw1.b ? lsm0Var3.a(R.string.end_of_tournament, Arrays.copyOf(new Object[0], 0)) : "";
                            int iOrdinal3 = cw1Var.ordinal();
                            if (iOrdinal3 == 0) {
                                str3 = "Background Picture.webp";
                            } else if (iOrdinal3 == 1) {
                                str3 = "Picture S.webp";
                            } else {
                                if (iOrdinal3 != 2) {
                                    if (iOrdinal3 == 3) {
                                        str3 = "";
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                str3 = "Dates.webp";
                            }
                            List list4 = u0d.f34849a;
                            n0x n0xVar3 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(str3)));
                            int[] iArr = iu1.f15377a;
                            lc00VarB.add(new et1(cw1Var, new dw1(bw1Var, str9, str10, str, strS, str2, strS2, strA6, strA7, n0xVar3, new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Left.webp" : ""))), new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Right.webp" : ""))))));
                            gx1 gx1Var2 = zu1Var3.b;
                            if (zoeVar.d == qpe.c) {
                                lt1Var = null;
                            } else {
                                int iOrdinal4 = gx1Var2.ordinal();
                                if (iOrdinal4 == 0) {
                                    gx1Var = gx1.f12054a;
                                } else if (iOrdinal4 == 1) {
                                    gx1Var = gx1.b;
                                } else {
                                    if (iOrdinal4 != 2) {
                                        if (iOrdinal4 == 3) {
                                            gx1Var = gx1.d;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    gx1Var = gx1.c;
                                }
                                String str11 = zoeVar.c;
                                int iOrdinal5 = gx1Var2.ordinal();
                                if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                                    i2 = R.string.day_short;
                                } else {
                                    if (iOrdinal5 != 2) {
                                        if (iOrdinal5 == 3) {
                                            i2 = R.string.day_short_2;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    i2 = R.string.days_in_case_caps;
                                }
                                String strA8 = lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0));
                                gx1 gx1Var3 = gx1.c;
                                String strA9 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.hours_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA10 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.minutes_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA11 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.seconds_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                long jCurrentTimeMillis = zoeVar.f44716a - System.currentTimeMillis();
                                lt1Var = new lt1(gx1Var, new yrl(str11, strA8, strA9, strA10, strA11, jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis));
                            }
                            if (lt1Var != null) {
                                lc00VarB.add(lt1Var);
                            }
                            gt1 gt1VarT0 = ntr.t0(gu1Var4, ctf0Var2, zu1Var3.c);
                            if (gt1VarT0 != null) {
                                lc00VarB.add(gt1VarT0);
                            }
                            gw1 gw1Var = zu1Var3.d;
                            w88 w88Var = gu1Var4.f;
                            boolean z2 = w88Var.f38710a;
                            List list5 = w88Var.c;
                            if (z2 || list5.isEmpty()) {
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = null;
                            } else {
                                String strA12 = w88Var.e;
                                if (strA12.length() == 0) {
                                    i7 = 0;
                                    strA12 = lsm0Var3.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i7 = 0;
                                }
                                String strA13 = lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[i7], i7));
                                if (list5.size() <= 5) {
                                    strA13 = null;
                                }
                                String str12 = strA13 == null ? "" : strA13;
                                boolean z3 = w88Var.b == xxb0.f41650a;
                                String strF = ctf0Var2.f(R.string.fs, new Object[0]);
                                ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                                Iterator it2 = list5.iterator();
                                int i9 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    pxb0 pxb0Var = (pxb0) next;
                                    if (z3) {
                                        String strF2 = ctf0Var2.f(R.string.place, new Object[0]);
                                        int i11 = pxb0Var.b;
                                        int i12 = pxb0Var.c;
                                        strL = i11 == i12 ? dw9.m(i11, Separators.SP, strF2) : i11 + "-" + i12 + Separators.SP + strF2;
                                    } else {
                                        ft1Var2 = ft1Var2;
                                        strL = kng0.l(ctf0Var2.f(R.string.stocks_prizes, new Object[0]), ": ", pxb0Var.h);
                                    }
                                    int i13 = pxb0Var.i;
                                    String str13 = i13 > 0 ? strF + Separators.SP + i13 : "";
                                    if (z1s0Var != z1s0.f43637a) {
                                        strK = pxb0Var.d;
                                    } else {
                                        pn40 pn40Var = pn40.f27267a;
                                        double d = pxb0Var.f;
                                        p3u0 p3u0Var = p3u0.c;
                                        strK = b1j.k("\u202a", str7, Separators.SP, pn40.l(d), "\u202c");
                                    }
                                    String str14 = strK;
                                    String str15 = pxb0Var.f27747a;
                                    int iOrdinal6 = gw1Var.ordinal();
                                    if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
                                        if (i10 == 1) {
                                            str4 = "Number_Gold.webp";
                                        } else if (i10 == 2) {
                                            str4 = "Number_Silver.webp";
                                        } else if (i10 != 3) {
                                            str4 = gw1Var == gw1.c ? "Number_Other_Star.webp" : "Number_Other.webp";
                                        } else {
                                            str4 = "Number_Bronze.webp";
                                        }
                                        List list6 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/".concat(str4)));
                                    } else {
                                        if (iOrdinal6 != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                        if (i10 == 1) {
                                            str5 = "Illustration_Gold.webp";
                                        } else if (i10 != 2) {
                                            str5 = i10 != 3 ? "Illustration_Other.webp" : "Illustration_Bronze.webp";
                                        } else {
                                            str5 = "Illustration_Silver.webp";
                                        }
                                        List list7 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/illustration/".concat(str5)));
                                    }
                                    arrayList2.add(new vv1(str15, n0xVar2, strL, str14, str13));
                                    i9 = i10;
                                    it2 = it3;
                                    lsm0Var3 = lsm0Var3;
                                    gu1Var4 = gu1Var4;
                                    lc00VarB = lc00VarB;
                                    ft1Var2 = ft1Var2;
                                }
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = new ft1(gw1Var, new iw1(dyb.o0(arrayList2), strA12, str12));
                            }
                            lc00 lc00Var3 = lc00Var;
                            if (ft1Var != null) {
                                lc00Var3.add(ft1Var);
                            }
                            gu1 gu1Var5 = gu1Var2;
                            List list8 = gu1Var5.r;
                            if (list8.isEmpty()) {
                                collectionJ = iun.f15405a;
                                lsm0Var2 = lsm0Var;
                            } else {
                                int iOrdinal7 = ot0Var.ordinal();
                                if (iOrdinal7 == 0) {
                                    pt0Var = pt0.f27539a;
                                } else if (iOrdinal7 == 1) {
                                    pt0Var = pt0.b;
                                } else if (iOrdinal7 == 2) {
                                    pt0Var = pt0.c;
                                } else if (iOrdinal7 == 3) {
                                    pt0Var = pt0.d;
                                } else {
                                    if (iOrdinal7 != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    pt0Var = pt0.e;
                                }
                                if (list8.size() == 1) {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_game, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                mt1 mt1Var3 = new mt1(new hjm(strA, null, null, null, null, null, false, null, null, false, null, null, 7166));
                                wll wllVar = new wll(o0sVar);
                                List listD0 = CollectionsKt.D0(list8, 8);
                                ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                Iterator it4 = listD0.iterator();
                                while (it4.hasNext()) {
                                    mlr mlrVar = (mlr) it4.next();
                                    long j5 = mlrVar.f22006a;
                                    boolean z4 = mlrVar.k;
                                    Set set3 = set2;
                                    boolean zContains = set3.contains(Long.valueOf(j5));
                                    int i14 = zBooleanValue ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    Iterator it5 = it4;
                                    boolean z5 = mlrVar.j;
                                    if (z4) {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = lsm0Var2.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = z ? lsm0Var2.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    set2 = set3;
                                    long j6 = mlrVar.f22006a;
                                    String str16 = mlrVar.f;
                                    String str17 = mlrVar.e;
                                    mtr mtrVar = new mtr(zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar4 = new n0x(mlrVar.g);
                                    m0x m0xVar = new m0x(i14, bzwVar, i8);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        n0xVar = n0xVar4;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z4) || (pt0Var == (pt0Var2 = pt0.c) && z4)) {
                                            n0xVar = n0xVar4;
                                        } else {
                                            n0xVar = n0xVar4;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z4) {
                                                if ((pt0Var == pt0Var4 && z) || ((pt0Var == pt0Var2 && z) || (pt0Var == pt0Var5 && z))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var3 = pt0.e) && z4)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z) || (pt0Var == pt0Var3 && z)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList3.add(new st0(j6, str16, str17, mtrVar, n0xVar, m0xVar, null, murVar));
                                    it4 = it5;
                                    mt1Var3 = mt1Var;
                                    i8 = 6;
                                    bzwVar = null;
                                }
                                collectionJ = q3d.j(mt1Var3, new nt1(new zll(pt0Var, wllVar, arrayList3)));
                            }
                            lc00Var3.addAll(collectionJ);
                            zu1 zu1Var4 = zu1Var3;
                            l5i l5iVar = zu1Var4.e;
                            List list9 = gu1Var5.l.f38767a;
                            long j7 = gu1Var5.q;
                            List list10 = gu1Var5.k.b;
                            z1s0 z1s0Var2 = z1s0.b;
                            url urlVar = url.f36169a;
                            vrl vrlVar = vrl.f37904a;
                            if (z1s0Var == z1s0Var2) {
                                if (list10.isEmpty()) {
                                    iterableD0 = iun.f15405a;
                                } else if (list10.size() <= 3) {
                                    iterableD0 = list10;
                                } else if (plc.z(gu1Var5)) {
                                    int size = list10.size();
                                    Date date2 = new Date();
                                    ListIterator listIterator = list10.listIterator(list10.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                        } else if (((jng0) listIterator.previous()).c.before(date2)) {
                                            iNextIndex = listIterator.nextIndex();
                                        }
                                    }
                                    if (iNextIndex == -1) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(list10.get(iNextIndex));
                                        for (int i15 = iNextIndex + 1; i15 < size && arrayList4.size() < 3; i15++) {
                                            arrayList4.add(list10.get(i15));
                                        }
                                        if (arrayList4.size() < 3) {
                                            int i16 = iNextIndex - 1;
                                            for (int i17 = 3; -1 < i16 && arrayList4.size() < i17; i17 = 3) {
                                                arrayList4.add(0, list10.get(i16));
                                                i16--;
                                            }
                                            iterableD0 = arrayList4;
                                        } else {
                                            int i18 = iNextIndex >= size - 2 ? size - 3 : iNextIndex > 0 ? iNextIndex : 0;
                                            iterableD0 = list10.subList(i18, i18 + 3);
                                        }
                                    }
                                } else if (list10.size() > 3) {
                                    int iOrdinal8 = j88Var.j.ordinal();
                                    if (iOrdinal8 == 0) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else if (iOrdinal8 == 1) {
                                        int size2 = list10.size();
                                        Date date3 = new Date();
                                        Iterator it6 = list10.iterator();
                                        int i19 = 0;
                                        while (true) {
                                            if (it6.hasNext()) {
                                                jng0 jng0Var = (jng0) it6.next();
                                                i5 = size2;
                                                Date date4 = jng0Var.d;
                                                Date date5 = jng0Var.c;
                                                if (!date3.after(date4) || !date3.before(date5)) {
                                                    i19++;
                                                    size2 = i5;
                                                }
                                            } else {
                                                i5 = size2;
                                                i19 = -1;
                                            }
                                        }
                                        Integer numValueOf = Integer.valueOf(i19);
                                        if (i19 < 0) {
                                            numValueOf = null;
                                        }
                                        if (numValueOf != null) {
                                            iIntValue = numValueOf.intValue();
                                        } else {
                                            Iterator it7 = list10.iterator();
                                            int i20 = 0;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    int i21 = i20;
                                                    if (((jng0) it7.next()).b == j7) {
                                                        i6 = i21;
                                                    } else {
                                                        i20 = i21 + 1;
                                                    }
                                                } else {
                                                    i6 = -1;
                                                }
                                            }
                                            Integer numValueOf2 = Integer.valueOf(i6);
                                            if (i6 < 0) {
                                                numValueOf2 = null;
                                            }
                                            iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                        }
                                        if (iIntValue >= i5 - 2) {
                                            iIntValue = i5 - 3;
                                        } else if (iIntValue <= 0) {
                                            iIntValue = 0;
                                        }
                                        iterableD0 = list10.subList(iIntValue, iIntValue + 3);
                                    } else {
                                        if (iOrdinal8 != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        iterableD0 = CollectionsKt.E0(3, list10);
                                    }
                                } else {
                                    iterableD0 = list10;
                                }
                                ArrayList arrayList5 = new ArrayList(r3d.q(iterableD0, 10));
                                Iterator it8 = iterableD0.iterator();
                                int i22 = 0;
                                while (it8.hasNext()) {
                                    Object next2 = it8.next();
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    jng0 jng0Var2 = (jng0) next2;
                                    Date date6 = new Date();
                                    Date date7 = jng0Var2.d;
                                    Iterator it9 = it8;
                                    Date date8 = jng0Var2.c;
                                    List list11 = list10;
                                    rdj rdjVar2 = rdj.f30294a;
                                    sdj sdjVar = sdj.UNIQUE_3;
                                    List list12 = list9;
                                    lc00 lc00Var4 = lc00Var3;
                                    zu1 zu1Var5 = zu1Var4;
                                    String strL2 = kng0.l(rdj.c(rdjVar2, sdjVar, date7, locale2, 28), " - ", rdj.c(rdjVar2, sdjVar, date8, locale2, 28));
                                    String strValueOf = String.valueOf(jng0Var2.b);
                                    long time = jng0Var2.d.getTime();
                                    gu1 gu1Var6 = gu1Var5;
                                    double dCurrentTimeMillis = (((System.currentTimeMillis() - time) / 1000) / ((date8.getTime() - time) / 1000)) * 100.0d;
                                    arrayList5.add(date6.before(date7) ? new rrl(strValueOf, strL2, jng0Var2.f16811a, urlVar) : (date6.after(date7) && date6.before(date8)) ? new rrl(strValueOf, strL2, null, new wrl((dCurrentTimeMillis <= 0.0d || dCurrentTimeMillis >= 1.0d) ? (int) dCurrentTimeMillis : 1, 100)) : new rrl(strValueOf, strL2, null, vrlVar));
                                    it8 = it9;
                                    list10 = list11;
                                    i22 = i23;
                                    list9 = list12;
                                    zu1Var4 = zu1Var5;
                                    gu1Var5 = gu1Var6;
                                    lc00Var3 = lc00Var4;
                                }
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                list = list10;
                                list2 = list9;
                                gu1Var3 = gu1Var5;
                                arrayList = arrayList5;
                            } else {
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                gu1 gu1Var7 = gu1Var5;
                                list = list10;
                                list2 = list9;
                                List list13 = (list2.isEmpty() || list2.size() <= 3) ? null : list2;
                                if (list13 != null) {
                                    Iterator it10 = list13.iterator();
                                    int i24 = 0;
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            i3 = -1;
                                        } else if (((fzl0) it10.next()).c == j7) {
                                            i3 = i24;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i3);
                                    if (i3 < 0) {
                                        numValueOf3 = null;
                                    }
                                    int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                    int size3 = iIntValue2 == 0 ? 0 : iIntValue2 >= list13.size() + (-2) ? list13.size() - 3 : iIntValue2 - 1;
                                    int i25 = size3 + 3;
                                    int size4 = list13.size();
                                    if (i25 > size4) {
                                        i25 = size4;
                                    }
                                    listSubList = list13.subList(size3, i25);
                                    if (listSubList == null) {
                                        listSubList = list2;
                                    }
                                } else {
                                    listSubList = list2;
                                }
                                ArrayList arrayList6 = new ArrayList(r3d.q(listSubList, 10));
                                Iterator it11 = listSubList.iterator();
                                int i26 = 0;
                                while (it11.hasNext()) {
                                    Object next3 = it11.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fzl0 fzl0Var = (fzl0) next3;
                                    gu1 gu1Var8 = gu1Var7;
                                    Iterator it12 = gu1Var8.h.f17902a.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            Object next4 = it12.next();
                                            it = it11;
                                            if (((o2g0) next4).b) {
                                                obj2 = next4;
                                            } else {
                                                it11 = it;
                                            }
                                        } else {
                                            it = it11;
                                            obj2 = null;
                                        }
                                    }
                                    o2g0 o2g0Var = (o2g0) obj2;
                                    int i28 = o2g0Var != null ? o2g0Var.d : 0;
                                    int i29 = fzl0Var.b;
                                    boolean z6 = i28 >= i29;
                                    int i30 = (int) fzl0Var.c;
                                    int i31 = (int) j7;
                                    fzl0 fzl0Var2 = (fzl0) CollectionsKt.W(i26 - 1, listSubList);
                                    int i32 = fzl0Var2 != null ? fzl0Var2.b : 0;
                                    if (i30 != i31 || !gu1Var8.c) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = i31 > i30 ? new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar) : new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, urlVar);
                                    } else if (z6) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar);
                                    } else {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), lsm0Var2.a(R.string.tournament_stage_points_left_2_v2, Arrays.copyOf(new Object[]{String.valueOf(i29 - i28)}, 1)), new wrl(i28 - i32, i29 - i32));
                                    }
                                    arrayList6.add(rrlVar);
                                    it11 = it;
                                    i26 = i27;
                                    gu1Var7 = gu1Var8;
                                    listSubList = list3;
                                    j7 = j;
                                }
                                gu1Var3 = gu1Var7;
                                arrayList = arrayList6;
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                String strA14 = lsm0Var2.a(R.string.tournament_stages, Arrays.copyOf(new Object[0], 0));
                                String strA15 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                if (z1s0Var != z1s0.b ? list2.size() <= 3 : list.size() <= 3) {
                                    strA15 = null;
                                }
                                if (strA15 == null) {
                                    strA15 = "";
                                }
                                kt1Var = new kt1(l5iVar, new lrl(dyb.o0(arrayList), strA14, strA15));
                            } else {
                                kt1Var = null;
                            }
                            lc00 lc00Var5 = lc00Var2;
                            if (kt1Var != null) {
                                lc00Var5.add(kt1Var);
                            }
                            hrl hrlVar = zu1Var.f;
                            s98 s98Var = gu1Var3.i;
                            if (s98Var.f31841a.isEmpty()) {
                                jt1Var = null;
                            } else {
                                String strA16 = s98Var.b;
                                if (strA16.length() == 0) {
                                    strA16 = lsm0Var2.a(R.string.rules_title, Arrays.copyOf(new Object[0], 0));
                                }
                                jt1Var = new jt1(hrlVar, new irl(strA16, CollectionsKt.b0(s98Var.f31841a, Separators.RETURN, null, null, null, 62)));
                            }
                            if (jt1Var != null) {
                                lc00Var5.add(jt1Var);
                            }
                            sh1 sh1Var = sh1.b;
                            rh1.f30465a.getClass();
                            b0i b0iVar = new b0i(sh1Var, jdk0.e(str8));
                            List list14 = gu1Var3.g;
                            if (list14.isEmpty()) {
                                collectionJ2 = iun.f15405a;
                            } else {
                                if (list14.size() > 8) {
                                    i4 = 0;
                                    strA3 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i4 = 0;
                                    strA3 = null;
                                }
                                ht1 ht1Var2 = new ht1(new hjm(lsm0Var2.a(R.string.providers, Arrays.copyOf(new Object[i4], i4)), null, null, null, null, null, false, null, null, false, strA3 != null ? new ue9(strA3) : null, null, 7166));
                                List<izb0> listD1 = CollectionsKt.D0(list14, 8);
                                ArrayList arrayList7 = new ArrayList(r3d.q(listD1, 10));
                                for (izb0 izb0Var : listD1) {
                                    arrayList7.add(new eol(String.valueOf(izb0Var.c), new n0x(izb0Var.f15628a), false, izb0Var.b, "-", lsm0Var2.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), null));
                                }
                                collectionJ2 = q3d.j(ht1Var2, new it1(new bol(dyb.o0(arrayList7), b0iVar)));
                            }
                            lc00Var5.addAll(collectionJ2);
                            a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00Var5));
                            if (a4xVarO0 != null) {
                                return a4xVarO0;
                            }
                        }
                        return lak0.c;
                    case 2:
                        return a(obj);
                    case 3:
                        n0o0 n0o0Var3 = gv1Var.q;
                        dt1 dt1Var2 = (dt1) obj;
                        dt1Var2.getClass();
                        if (dt1Var2.equals(ct1Var)) {
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            lc00VarB2.add(new ju1(((zu1) ((fee) n0o0Var3.getValue()).b()).c, arlVar));
                            for (int i33 = 0; i33 < 10; i33++) {
                                lc00VarB2.add(new ku1(ur1.f36143a));
                            }
                            return new mu1(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                        }
                        if (!dt1Var2.equals(at1Var)) {
                            if (dt1Var2.equals(bt1Var)) {
                                return new mu1(lak0.c);
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var9 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var9 == null) {
                            return new mu1(lak0.c);
                        }
                        ctf0 ctf0Var3 = gv1Var.b;
                        zu1 zu1Var6 = (zu1) ((fee) n0o0Var3.getValue()).b();
                        int iIntValue3 = ((Number) ((fee) gv1Var.r.getValue()).c()).intValue();
                        ctf0Var3.getClass();
                        zu1Var6.getClass();
                        gt1 gt1VarT1 = ntr.t0(gu1Var9, ctf0Var3, zu1Var6.c);
                        ju1 ju1Var = gt1VarT1 != null ? new ju1(gt1VarT1.f11859a, gt1VarT1.b) : null;
                        List<o2g0> list15 = gu1Var9.h.f17902a;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list15, 10));
                        for (o2g0 o2g0Var2 : list15) {
                            o2g0Var2.getClass();
                            String str18 = o2g0Var2.f24529a;
                            Long lT0 = StringsKt.t0(str18);
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String strA17 = ctf0Var3.b.a(R.string.tournament_points_v2, Arrays.copyOf(new Object[]{String.valueOf(o2g0Var2.d)}, 1));
                            boolean z7 = o2g0Var2.b;
                            int i34 = o2g0Var2.c;
                            switch (i34) {
                                case 1:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_one);
                                    break;
                                case 2:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_two);
                                    break;
                                case 3:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_three);
                                    break;
                                case 4:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_four);
                                    break;
                                case 5:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_five);
                                    break;
                                case 6:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_six);
                                    break;
                                case 7:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_seven);
                                    break;
                                case 8:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_eight);
                                    break;
                                case 9:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_nine);
                                    break;
                                case 10:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_ten);
                                    break;
                                default:
                                    rr1VarP = new qr1(String.valueOf(i34), z7 ? czr0.b : czr0.f5237a);
                                    break;
                            }
                            arrayList8.add(new ku1(new tr1(jLongValue, strA17, str18, z7, false, rr1VarP)));
                        }
                        if (arrayList8.isEmpty()) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.i;
                            xuzVar.getClass();
                            mu1Var = new nu1(new mdm(xuz.a(pb10Var, iIntValue3), ju1Var == null ? pdm.f26814a : pdm.c, null, 0, 0, R.string.tournament_result_not_available, 0, 0, 0L, 0L, 988), ju1Var);
                        } else {
                            mu1Var = new mu1(dyb.o0(CollectionsKt.q0(q3d.k(ju1Var), arrayList8)));
                        }
                        return mu1Var;
                    case 4:
                        return b(obj);
                    case 5:
                        return p8a.d0((gu1) obj, s9s0.f31863a, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 6:
                        return p8a.d0((gu1) obj, s9s0.b, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    default:
                        return p8a.d0((gu1) obj, s9s0.c, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                }
            }
        }, (byte) 20));
        this.y = maz.b(new yw9(gu1Var, new Function1(this) { // from class: a.fv1
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                pt0 pt0Var;
                String strA;
                int i2;
                nur murVar;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                boolean zEquals = dt1Var.equals(ct1.f4914a);
                gv1 gv1Var = this.b;
                xll xllVar = xll.f41078a;
                if (zEquals) {
                    return new aml(x4d0.g0((ot0) gv1Var.a().c()), xllVar, true);
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new zll(x4d0.g0((ot0) gv1Var.a().c()), xllVar, lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                Map map = (Map) ((fee) gv1Var.l.getValue()).c();
                ctf0 ctf0Var2 = gv1Var.b;
                boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                ot0 ot0Var = (ot0) gv1Var.a().c();
                map.getClass();
                ctf0Var2.getClass();
                set.getClass();
                ot0Var.getClass();
                int iOrdinal = ot0Var.ordinal();
                if (iOrdinal == 0) {
                    pt0Var = pt0.f27539a;
                } else if (iOrdinal == 1) {
                    pt0Var = pt0.b;
                } else if (iOrdinal == 2) {
                    pt0Var = pt0.c;
                } else if (iOrdinal == 3) {
                    pt0Var = pt0.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    pt0Var = pt0.e;
                }
                Collection collectionValues = map.values();
                ArrayList arrayList = new ArrayList(r3d.q(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    mlr mlrVar = (mlr) it.next();
                    long j = mlrVar.f22006a;
                    boolean z = mlrVar.k;
                    boolean zContains = set.contains(Long.valueOf(j));
                    int i3 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                    boolean z2 = mlrVar.j;
                    if (z) {
                        strA = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = z2 ? ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                    }
                    Iterator it2 = it;
                    ctf0 ctf0Var3 = ctf0Var2;
                    long j2 = mlrVar.f22006a;
                    String str = mlrVar.f;
                    String str2 = mlrVar.e;
                    if (zBooleanValue) {
                        i2 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                    } else {
                        i2 = 0;
                    }
                    mtr mtrVar = new mtr(i2, zContains);
                    n0x n0xVar2 = new n0x(mlrVar.g);
                    m0x m0xVar = new m0x(i3, null, 6);
                    if (strA.length() == 0) {
                        murVar = lur.f20686a;
                        n0xVar = n0xVar2;
                    } else {
                        pt0 pt0Var4 = pt0.f27539a;
                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                            n0xVar = n0xVar2;
                        } else {
                            n0xVar = n0xVar2;
                            pt0 pt0Var5 = pt0.d;
                            if (pt0Var != pt0Var5 || !z) {
                                if ((pt0Var == pt0Var4 && z2) || ((pt0Var == pt0Var2 && z2) || (pt0Var == pt0Var5 && z2))) {
                                    d4d d4dVar = d4d.PRIMARY;
                                    uqo0Var = new eqo0();
                                } else {
                                    pt0 pt0Var6 = pt0.b;
                                    if ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) {
                                        uqo0Var = kro0.f18776a;
                                    } else {
                                        uqo0Var = ((pt0Var == pt0Var6 && z2) || (pt0Var == pt0Var3 && z2)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                    }
                                }
                            }
                            murVar = new mur(strA, uqo0Var);
                        }
                        d4d d4dVar2 = d4d.PRIMARY;
                        uqo0Var = new lro0();
                        murVar = new mur(strA, uqo0Var);
                    }
                    arrayList.add(new st0(j2, str, str2, mtrVar, n0xVar, m0xVar, null, murVar));
                    ctf0Var2 = ctf0Var3;
                    it = it2;
                }
                return new zll(pt0Var, xllVar, arrayList);
            }

            private final Object b(Object obj) {
                Iterable iterableC;
                xw1 xw1Var;
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.e;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                if (dt1Var.equals(ct1.f4914a)) {
                    gu1 gu1Var2 = (gu1) ((fee) n0o0Var.getValue()).c();
                    if (gu1Var2 != null && gu1Var2.b != z1s0.f43637a && gu1Var2.d) {
                        return new ys1(dyb.g0(new mw1(uw1.f36373a)));
                    }
                    hrl hrlVar = hrl.f13536a;
                    return new xs1(dyb.g0(new pu1(jrl.f17007a)));
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new xs1(lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                gu1 gu1Var3 = (gu1) ((fee) n0o0Var.getValue()).c();
                if (gu1Var3 == null) {
                    return new xs1(lak0.c);
                }
                List list = (List) ((fee) gv1Var.m.getValue()).c();
                Map map = (Map) ((fee) gv1Var.n.getValue()).c();
                Set set = (Set) ((fee) gv1Var.p.getValue()).c();
                list.getClass();
                map.getClass();
                set.getClass();
                if (gu1Var3.b == z1s0.f43637a || !gu1Var3.d) {
                    z78 z78Var = gu1Var3.j;
                    if (z78Var.f43905a) {
                        iterableC = iun.f15405a;
                    } else {
                        String strR = q8a.R(z78Var.c.concat(Separators.RETURN));
                        String strR2 = q8a.R(z78Var.d);
                        if (StringsKt.u0(strR).toString().length() == 0 && strR2.length() == 0) {
                            iterableC = iun.f15405a;
                        } else {
                            String strS = z78Var.e ? q8a.S(list) : null;
                            String str = strS != null ? strS : "";
                            hrl hrlVar2 = hrl.f13536a;
                            iterableC = kotlin.collections.a.c(new pu1(new irl(z78Var.b, StringsKt.v0(strR + str + strR2).toString())));
                        }
                    }
                    return new xs1(dyb.o0(iterableC));
                }
                o98 o98Var = gu1Var3.k;
                lc00 lc00VarB = kotlin.collections.a.b();
                String strR3 = q8a.R(o98Var.f24867a);
                List<jng0> list2 = o98Var.b;
                jng0 jng0Var = (jng0) CollectionsKt.firstOrNull(list2);
                String str2 = jng0Var != null ? jng0Var.e : null;
                String strR4 = q8a.R(str2 != null ? str2 : "");
                if (strR3.length() > 0) {
                    String strS2 = q8a.S(list);
                    lc00VarB.add(new mw1(new tw1(o98Var.c, StringsKt.v0(strR3 + strS2 + strR4).toString(), new ow1(new m0x(R.drawable.ic_glyph_tournaments, null, 6)), set.contains(xr1.f41347a))));
                }
                ArrayList arrayList = new ArrayList();
                for (jng0 jng0Var2 : list2) {
                    String strR5 = q8a.R(jng0Var2.f16811a);
                    String strR6 = q8a.R(jng0Var2.e);
                    if (strR5.length() == 0 || strR6.length() == 0) {
                        xw1Var = null;
                    } else {
                        List list3 = (List) map.get(Long.valueOf(jng0Var2.b));
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        String strS3 = q8a.S(list3);
                        xw1Var = new xw1(jng0Var2.b, jng0Var2.d, jng0Var2.c, StringsKt.v0(strR5 + strS3 + strR6).toString());
                    }
                    if (xw1Var != null) {
                        arrayList.add(xw1Var);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    xw1 xw1Var2 = (xw1) next;
                    long j = xw1Var2.f41588a;
                    wr1 wr1Var = new wr1(j);
                    Date date = xw1Var2.b;
                    Date date2 = xw1Var2.c;
                    rdj rdjVar = rdj.f30294a;
                    sdj sdjVar = sdj.UNIQUE_3;
                    lc00VarB.add(new lw1(j, new tw1(kng0.l(rdj.c(rdjVar, sdjVar, date, null, 60), " - ", rdj.c(rdjVar, sdjVar, date2, null, 60)), xw1Var2.d, new pw1(String.valueOf(i3)), set.contains(wr1Var))));
                    it = it;
                    i2 = i3;
                }
                return new ys1(dyb.o0(kotlin.collections.a.a(lc00VarB)));
            }

            /* JADX WARN: Code duplicated, block: B:358:0x09c5  */
            /* JADX WARN: Code duplicated, block: B:500:0x0c58  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                lt1 lt1Var;
                gx1 gx1Var;
                int i2;
                gu1 gu1Var2;
                lsm0 lsm0Var;
                lc00 lc00Var;
                ft1 ft1Var;
                pt0 pt0Var;
                lsm0 lsm0Var2;
                String strA;
                Collection collectionJ;
                boolean z;
                mt1 mt1Var;
                String strA2;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                lc00 lc00Var2;
                zu1 zu1Var;
                List list;
                List list2;
                List listSubList;
                gu1 gu1Var3;
                ArrayList arrayList;
                Iterator it;
                Object obj2;
                List list3;
                long j;
                rrl rrlVar;
                int i3;
                kt1 kt1Var;
                jt1 jt1Var;
                int i4;
                String strA3;
                Collection collectionJ2;
                Iterable iterableD0;
                int i5;
                int i6;
                int iIntValue;
                int iNextIndex;
                int i7;
                ft1 ft1Var2;
                String strL;
                String strK;
                String str4;
                n0x n0xVar2;
                String str5;
                String strA4;
                String strA5;
                Object mu1Var;
                rr1 rr1VarP;
                byte b8 = b2;
                bt1 bt1Var = bt1.f3159a;
                at1 at1Var = at1.f1413a;
                arl arlVar = arl.f1351a;
                ct1 ct1Var = ct1.f4914a;
                gv1 gv1Var = this.b;
                switch (b8) {
                    case 0:
                        return p8a.d0((gu1) obj, s9s0.d, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 1:
                        n0o0 n0o0Var = gv1Var.j;
                        n0o0 n0o0Var2 = gv1Var.q;
                        dt1 dt1Var = (dt1) obj;
                        dt1Var.getClass();
                        boolean zEquals = dt1Var.equals(ct1Var);
                        bzw bzwVar = null;
                        int i8 = 6;
                        o0s o0sVar = o0s.f24443a;
                        if (zEquals) {
                            zu1 zu1Var2 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            et1 et1Var = new et1(zu1Var2.f44988a, ew1.f8498a);
                            lt1 lt1Var2 = new lt1(zu1Var2.b, zrl.f44860a);
                            gt1 gt1Var = new gt1(zu1Var2.c, arlVar);
                            ft1 ft1Var3 = new ft1(zu1Var2.d, jw1.f17229a);
                            mt1 mt1Var2 = new mt1(new ijm());
                            nt1 nt1Var = new nt1(new aml(x4d0.g0((ot0) gv1Var.a().c()), new wll(o0sVar), true));
                            kt1 kt1Var2 = new kt1(zu1Var2.e, mrl.f22278a);
                            jt1 jt1Var2 = new jt1(zu1Var2.f, jrl.f17007a);
                            ht1 ht1Var = new ht1(new ijm());
                            jdk0 jdk0Var = rh1.f30465a;
                            String str6 = (String) ((fee) n0o0Var.getValue()).c();
                            jdk0Var.getClass();
                            return dyb.g0(et1Var, lt1Var2, gt1Var, ft1Var3, mt1Var2, nt1Var, kt1Var2, jt1Var2, ht1Var, new it1(new col(new b0i(sh1.b, jdk0.e(str6)))));
                        }
                        if (!dt1Var.equals(at1Var)) {
                            if (dt1Var.equals(bt1Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var4 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var4 != null) {
                            ctf0 ctf0Var2 = gv1Var.b;
                            Locale locale2 = (Locale) gv1Var.B;
                            zu1 zu1Var3 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            String str7 = (String) ((fee) gv1Var.h.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                            ot0 ot0Var = (ot0) gv1Var.a().c();
                            boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                            Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                            String str8 = (String) ((fee) n0o0Var.getValue()).c();
                            ctf0Var2.getClass();
                            zu1Var3.getClass();
                            str7.getClass();
                            ot0Var.getClass();
                            set.getClass();
                            str8.getClass();
                            lc00 lc00VarB = kotlin.collections.a.b();
                            cw1 cw1Var = zu1Var3.f44988a;
                            z1s0 z1s0Var = gu1Var4.b;
                            rdj rdjVar = rdj.f30294a;
                            j88 j88Var = gu1Var4.e;
                            Set set2 = set;
                            long j2 = j88Var.e;
                            long j3 = j88Var.i;
                            zoe zoeVar = j88Var.f16071a;
                            Date dateK = rdj.k(j3);
                            Date dateK2 = rdj.k(j2);
                            Date date = new Date();
                            bw1 bw1Var = ((date.after(dateK) && date.before(dateK2)) || new Date().before(dateK)) ? bw1.f3302a : bw1.b;
                            long j4 = ((j2 - j3) * 1000) / 86400000;
                            String str9 = j88Var.g;
                            String str10 = j88Var.h;
                            int iOrdinal = cw1Var.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                o0sVar = o0sVar;
                                str = "";
                            } else {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        strA5 = eeq.R(dateK, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA5 = ctf0Var2.b.a(R.string.tournament_prize_pool_title_date_start, Arrays.copyOf(new Object[0], 0));
                                str = strA5;
                            }
                            String strS = eeq.S(dateK, ctf0Var2, cw1Var, locale2);
                            int iOrdinal2 = cw1Var.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                str2 = "";
                            } else {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        strA4 = eeq.R(dateK2, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA4 = ctf0Var2.b.a(R.string.tournament_title_date_end, Arrays.copyOf(new Object[0], 0));
                                str2 = strA4;
                            }
                            String strS2 = eeq.S(dateK2, ctf0Var2, cw1Var, locale2);
                            Object[] objArr = {Long.valueOf(j4)};
                            lsm0 lsm0Var3 = ctf0Var2.b;
                            String strA6 = lsm0Var3.a(R.string.days_v2, Arrays.copyOf(objArr, 1));
                            String strA7 = bw1Var == bw1.b ? lsm0Var3.a(R.string.end_of_tournament, Arrays.copyOf(new Object[0], 0)) : "";
                            int iOrdinal3 = cw1Var.ordinal();
                            if (iOrdinal3 == 0) {
                                str3 = "Background Picture.webp";
                            } else if (iOrdinal3 == 1) {
                                str3 = "Picture S.webp";
                            } else {
                                if (iOrdinal3 != 2) {
                                    if (iOrdinal3 == 3) {
                                        str3 = "";
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                str3 = "Dates.webp";
                            }
                            List list4 = u0d.f34849a;
                            n0x n0xVar3 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(str3)));
                            int[] iArr = iu1.f15377a;
                            lc00VarB.add(new et1(cw1Var, new dw1(bw1Var, str9, str10, str, strS, str2, strS2, strA6, strA7, n0xVar3, new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Left.webp" : ""))), new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Right.webp" : ""))))));
                            gx1 gx1Var2 = zu1Var3.b;
                            if (zoeVar.d == qpe.c) {
                                lt1Var = null;
                            } else {
                                int iOrdinal4 = gx1Var2.ordinal();
                                if (iOrdinal4 == 0) {
                                    gx1Var = gx1.f12054a;
                                } else if (iOrdinal4 == 1) {
                                    gx1Var = gx1.b;
                                } else {
                                    if (iOrdinal4 != 2) {
                                        if (iOrdinal4 == 3) {
                                            gx1Var = gx1.d;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    gx1Var = gx1.c;
                                }
                                String str11 = zoeVar.c;
                                int iOrdinal5 = gx1Var2.ordinal();
                                if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                                    i2 = R.string.day_short;
                                } else {
                                    if (iOrdinal5 != 2) {
                                        if (iOrdinal5 == 3) {
                                            i2 = R.string.day_short_2;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    i2 = R.string.days_in_case_caps;
                                }
                                String strA8 = lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0));
                                gx1 gx1Var3 = gx1.c;
                                String strA9 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.hours_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA10 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.minutes_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA11 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.seconds_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                long jCurrentTimeMillis = zoeVar.f44716a - System.currentTimeMillis();
                                lt1Var = new lt1(gx1Var, new yrl(str11, strA8, strA9, strA10, strA11, jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis));
                            }
                            if (lt1Var != null) {
                                lc00VarB.add(lt1Var);
                            }
                            gt1 gt1VarT0 = ntr.t0(gu1Var4, ctf0Var2, zu1Var3.c);
                            if (gt1VarT0 != null) {
                                lc00VarB.add(gt1VarT0);
                            }
                            gw1 gw1Var = zu1Var3.d;
                            w88 w88Var = gu1Var4.f;
                            boolean z2 = w88Var.f38710a;
                            List list5 = w88Var.c;
                            if (z2 || list5.isEmpty()) {
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = null;
                            } else {
                                String strA12 = w88Var.e;
                                if (strA12.length() == 0) {
                                    i7 = 0;
                                    strA12 = lsm0Var3.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i7 = 0;
                                }
                                String strA13 = lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[i7], i7));
                                if (list5.size() <= 5) {
                                    strA13 = null;
                                }
                                String str12 = strA13 == null ? "" : strA13;
                                boolean z3 = w88Var.b == xxb0.f41650a;
                                String strF = ctf0Var2.f(R.string.fs, new Object[0]);
                                ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                                Iterator it2 = list5.iterator();
                                int i9 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    pxb0 pxb0Var = (pxb0) next;
                                    if (z3) {
                                        String strF2 = ctf0Var2.f(R.string.place, new Object[0]);
                                        int i11 = pxb0Var.b;
                                        int i12 = pxb0Var.c;
                                        strL = i11 == i12 ? dw9.m(i11, Separators.SP, strF2) : i11 + "-" + i12 + Separators.SP + strF2;
                                    } else {
                                        ft1Var2 = ft1Var2;
                                        strL = kng0.l(ctf0Var2.f(R.string.stocks_prizes, new Object[0]), ": ", pxb0Var.h);
                                    }
                                    int i13 = pxb0Var.i;
                                    String str13 = i13 > 0 ? strF + Separators.SP + i13 : "";
                                    if (z1s0Var != z1s0.f43637a) {
                                        strK = pxb0Var.d;
                                    } else {
                                        pn40 pn40Var = pn40.f27267a;
                                        double d = pxb0Var.f;
                                        p3u0 p3u0Var = p3u0.c;
                                        strK = b1j.k("\u202a", str7, Separators.SP, pn40.l(d), "\u202c");
                                    }
                                    String str14 = strK;
                                    String str15 = pxb0Var.f27747a;
                                    int iOrdinal6 = gw1Var.ordinal();
                                    if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
                                        if (i10 == 1) {
                                            str4 = "Number_Gold.webp";
                                        } else if (i10 == 2) {
                                            str4 = "Number_Silver.webp";
                                        } else if (i10 != 3) {
                                            str4 = gw1Var == gw1.c ? "Number_Other_Star.webp" : "Number_Other.webp";
                                        } else {
                                            str4 = "Number_Bronze.webp";
                                        }
                                        List list6 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/".concat(str4)));
                                    } else {
                                        if (iOrdinal6 != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                        if (i10 == 1) {
                                            str5 = "Illustration_Gold.webp";
                                        } else if (i10 != 2) {
                                            str5 = i10 != 3 ? "Illustration_Other.webp" : "Illustration_Bronze.webp";
                                        } else {
                                            str5 = "Illustration_Silver.webp";
                                        }
                                        List list7 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/illustration/".concat(str5)));
                                    }
                                    arrayList2.add(new vv1(str15, n0xVar2, strL, str14, str13));
                                    i9 = i10;
                                    it2 = it3;
                                    lsm0Var3 = lsm0Var3;
                                    gu1Var4 = gu1Var4;
                                    lc00VarB = lc00VarB;
                                    ft1Var2 = ft1Var2;
                                }
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = new ft1(gw1Var, new iw1(dyb.o0(arrayList2), strA12, str12));
                            }
                            lc00 lc00Var3 = lc00Var;
                            if (ft1Var != null) {
                                lc00Var3.add(ft1Var);
                            }
                            gu1 gu1Var5 = gu1Var2;
                            List list8 = gu1Var5.r;
                            if (list8.isEmpty()) {
                                collectionJ = iun.f15405a;
                                lsm0Var2 = lsm0Var;
                            } else {
                                int iOrdinal7 = ot0Var.ordinal();
                                if (iOrdinal7 == 0) {
                                    pt0Var = pt0.f27539a;
                                } else if (iOrdinal7 == 1) {
                                    pt0Var = pt0.b;
                                } else if (iOrdinal7 == 2) {
                                    pt0Var = pt0.c;
                                } else if (iOrdinal7 == 3) {
                                    pt0Var = pt0.d;
                                } else {
                                    if (iOrdinal7 != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    pt0Var = pt0.e;
                                }
                                if (list8.size() == 1) {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_game, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                mt1 mt1Var3 = new mt1(new hjm(strA, null, null, null, null, null, false, null, null, false, null, null, 7166));
                                wll wllVar = new wll(o0sVar);
                                List listD0 = CollectionsKt.D0(list8, 8);
                                ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                Iterator it4 = listD0.iterator();
                                while (it4.hasNext()) {
                                    mlr mlrVar = (mlr) it4.next();
                                    long j5 = mlrVar.f22006a;
                                    boolean z4 = mlrVar.k;
                                    Set set3 = set2;
                                    boolean zContains = set3.contains(Long.valueOf(j5));
                                    int i14 = zBooleanValue ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    Iterator it5 = it4;
                                    boolean z5 = mlrVar.j;
                                    if (z4) {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = lsm0Var2.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = z ? lsm0Var2.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    set2 = set3;
                                    long j6 = mlrVar.f22006a;
                                    String str16 = mlrVar.f;
                                    String str17 = mlrVar.e;
                                    mtr mtrVar = new mtr(zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar4 = new n0x(mlrVar.g);
                                    m0x m0xVar = new m0x(i14, bzwVar, i8);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        n0xVar = n0xVar4;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z4) || (pt0Var == (pt0Var2 = pt0.c) && z4)) {
                                            n0xVar = n0xVar4;
                                        } else {
                                            n0xVar = n0xVar4;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z4) {
                                                if ((pt0Var == pt0Var4 && z) || ((pt0Var == pt0Var2 && z) || (pt0Var == pt0Var5 && z))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var3 = pt0.e) && z4)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z) || (pt0Var == pt0Var3 && z)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList3.add(new st0(j6, str16, str17, mtrVar, n0xVar, m0xVar, null, murVar));
                                    it4 = it5;
                                    mt1Var3 = mt1Var;
                                    i8 = 6;
                                    bzwVar = null;
                                }
                                collectionJ = q3d.j(mt1Var3, new nt1(new zll(pt0Var, wllVar, arrayList3)));
                            }
                            lc00Var3.addAll(collectionJ);
                            zu1 zu1Var4 = zu1Var3;
                            l5i l5iVar = zu1Var4.e;
                            List list9 = gu1Var5.l.f38767a;
                            long j7 = gu1Var5.q;
                            List list10 = gu1Var5.k.b;
                            z1s0 z1s0Var2 = z1s0.b;
                            url urlVar = url.f36169a;
                            vrl vrlVar = vrl.f37904a;
                            if (z1s0Var == z1s0Var2) {
                                if (list10.isEmpty()) {
                                    iterableD0 = iun.f15405a;
                                } else if (list10.size() <= 3) {
                                    iterableD0 = list10;
                                } else if (plc.z(gu1Var5)) {
                                    int size = list10.size();
                                    Date date2 = new Date();
                                    ListIterator listIterator = list10.listIterator(list10.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                        } else if (((jng0) listIterator.previous()).c.before(date2)) {
                                            iNextIndex = listIterator.nextIndex();
                                        }
                                    }
                                    if (iNextIndex == -1) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(list10.get(iNextIndex));
                                        for (int i15 = iNextIndex + 1; i15 < size && arrayList4.size() < 3; i15++) {
                                            arrayList4.add(list10.get(i15));
                                        }
                                        if (arrayList4.size() < 3) {
                                            int i16 = iNextIndex - 1;
                                            for (int i17 = 3; -1 < i16 && arrayList4.size() < i17; i17 = 3) {
                                                arrayList4.add(0, list10.get(i16));
                                                i16--;
                                            }
                                            iterableD0 = arrayList4;
                                        } else {
                                            int i18 = iNextIndex >= size - 2 ? size - 3 : iNextIndex > 0 ? iNextIndex : 0;
                                            iterableD0 = list10.subList(i18, i18 + 3);
                                        }
                                    }
                                } else if (list10.size() > 3) {
                                    int iOrdinal8 = j88Var.j.ordinal();
                                    if (iOrdinal8 == 0) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else if (iOrdinal8 == 1) {
                                        int size2 = list10.size();
                                        Date date3 = new Date();
                                        Iterator it6 = list10.iterator();
                                        int i19 = 0;
                                        while (true) {
                                            if (it6.hasNext()) {
                                                jng0 jng0Var = (jng0) it6.next();
                                                i5 = size2;
                                                Date date4 = jng0Var.d;
                                                Date date5 = jng0Var.c;
                                                if (!date3.after(date4) || !date3.before(date5)) {
                                                    i19++;
                                                    size2 = i5;
                                                }
                                            } else {
                                                i5 = size2;
                                                i19 = -1;
                                            }
                                        }
                                        Integer numValueOf = Integer.valueOf(i19);
                                        if (i19 < 0) {
                                            numValueOf = null;
                                        }
                                        if (numValueOf != null) {
                                            iIntValue = numValueOf.intValue();
                                        } else {
                                            Iterator it7 = list10.iterator();
                                            int i20 = 0;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    int i21 = i20;
                                                    if (((jng0) it7.next()).b == j7) {
                                                        i6 = i21;
                                                    } else {
                                                        i20 = i21 + 1;
                                                    }
                                                } else {
                                                    i6 = -1;
                                                }
                                            }
                                            Integer numValueOf2 = Integer.valueOf(i6);
                                            if (i6 < 0) {
                                                numValueOf2 = null;
                                            }
                                            iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                        }
                                        if (iIntValue >= i5 - 2) {
                                            iIntValue = i5 - 3;
                                        } else if (iIntValue <= 0) {
                                            iIntValue = 0;
                                        }
                                        iterableD0 = list10.subList(iIntValue, iIntValue + 3);
                                    } else {
                                        if (iOrdinal8 != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        iterableD0 = CollectionsKt.E0(3, list10);
                                    }
                                } else {
                                    iterableD0 = list10;
                                }
                                ArrayList arrayList5 = new ArrayList(r3d.q(iterableD0, 10));
                                Iterator it8 = iterableD0.iterator();
                                int i22 = 0;
                                while (it8.hasNext()) {
                                    Object next2 = it8.next();
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    jng0 jng0Var2 = (jng0) next2;
                                    Date date6 = new Date();
                                    Date date7 = jng0Var2.d;
                                    Iterator it9 = it8;
                                    Date date8 = jng0Var2.c;
                                    List list11 = list10;
                                    rdj rdjVar2 = rdj.f30294a;
                                    sdj sdjVar = sdj.UNIQUE_3;
                                    List list12 = list9;
                                    lc00 lc00Var4 = lc00Var3;
                                    zu1 zu1Var5 = zu1Var4;
                                    String strL2 = kng0.l(rdj.c(rdjVar2, sdjVar, date7, locale2, 28), " - ", rdj.c(rdjVar2, sdjVar, date8, locale2, 28));
                                    String strValueOf = String.valueOf(jng0Var2.b);
                                    long time = jng0Var2.d.getTime();
                                    gu1 gu1Var6 = gu1Var5;
                                    double dCurrentTimeMillis = (((System.currentTimeMillis() - time) / 1000) / ((date8.getTime() - time) / 1000)) * 100.0d;
                                    arrayList5.add(date6.before(date7) ? new rrl(strValueOf, strL2, jng0Var2.f16811a, urlVar) : (date6.after(date7) && date6.before(date8)) ? new rrl(strValueOf, strL2, null, new wrl((dCurrentTimeMillis <= 0.0d || dCurrentTimeMillis >= 1.0d) ? (int) dCurrentTimeMillis : 1, 100)) : new rrl(strValueOf, strL2, null, vrlVar));
                                    it8 = it9;
                                    list10 = list11;
                                    i22 = i23;
                                    list9 = list12;
                                    zu1Var4 = zu1Var5;
                                    gu1Var5 = gu1Var6;
                                    lc00Var3 = lc00Var4;
                                }
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                list = list10;
                                list2 = list9;
                                gu1Var3 = gu1Var5;
                                arrayList = arrayList5;
                            } else {
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                gu1 gu1Var7 = gu1Var5;
                                list = list10;
                                list2 = list9;
                                List list13 = (list2.isEmpty() || list2.size() <= 3) ? null : list2;
                                if (list13 != null) {
                                    Iterator it10 = list13.iterator();
                                    int i24 = 0;
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            i3 = -1;
                                        } else if (((fzl0) it10.next()).c == j7) {
                                            i3 = i24;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i3);
                                    if (i3 < 0) {
                                        numValueOf3 = null;
                                    }
                                    int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                    int size3 = iIntValue2 == 0 ? 0 : iIntValue2 >= list13.size() + (-2) ? list13.size() - 3 : iIntValue2 - 1;
                                    int i25 = size3 + 3;
                                    int size4 = list13.size();
                                    if (i25 > size4) {
                                        i25 = size4;
                                    }
                                    listSubList = list13.subList(size3, i25);
                                    if (listSubList == null) {
                                        listSubList = list2;
                                    }
                                } else {
                                    listSubList = list2;
                                }
                                ArrayList arrayList6 = new ArrayList(r3d.q(listSubList, 10));
                                Iterator it11 = listSubList.iterator();
                                int i26 = 0;
                                while (it11.hasNext()) {
                                    Object next3 = it11.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fzl0 fzl0Var = (fzl0) next3;
                                    gu1 gu1Var8 = gu1Var7;
                                    Iterator it12 = gu1Var8.h.f17902a.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            Object next4 = it12.next();
                                            it = it11;
                                            if (((o2g0) next4).b) {
                                                obj2 = next4;
                                            } else {
                                                it11 = it;
                                            }
                                        } else {
                                            it = it11;
                                            obj2 = null;
                                        }
                                    }
                                    o2g0 o2g0Var = (o2g0) obj2;
                                    int i28 = o2g0Var != null ? o2g0Var.d : 0;
                                    int i29 = fzl0Var.b;
                                    boolean z6 = i28 >= i29;
                                    int i30 = (int) fzl0Var.c;
                                    int i31 = (int) j7;
                                    fzl0 fzl0Var2 = (fzl0) CollectionsKt.W(i26 - 1, listSubList);
                                    int i32 = fzl0Var2 != null ? fzl0Var2.b : 0;
                                    if (i30 != i31 || !gu1Var8.c) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = i31 > i30 ? new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar) : new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, urlVar);
                                    } else if (z6) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar);
                                    } else {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), lsm0Var2.a(R.string.tournament_stage_points_left_2_v2, Arrays.copyOf(new Object[]{String.valueOf(i29 - i28)}, 1)), new wrl(i28 - i32, i29 - i32));
                                    }
                                    arrayList6.add(rrlVar);
                                    it11 = it;
                                    i26 = i27;
                                    gu1Var7 = gu1Var8;
                                    listSubList = list3;
                                    j7 = j;
                                }
                                gu1Var3 = gu1Var7;
                                arrayList = arrayList6;
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                String strA14 = lsm0Var2.a(R.string.tournament_stages, Arrays.copyOf(new Object[0], 0));
                                String strA15 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                if (z1s0Var != z1s0.b ? list2.size() <= 3 : list.size() <= 3) {
                                    strA15 = null;
                                }
                                if (strA15 == null) {
                                    strA15 = "";
                                }
                                kt1Var = new kt1(l5iVar, new lrl(dyb.o0(arrayList), strA14, strA15));
                            } else {
                                kt1Var = null;
                            }
                            lc00 lc00Var5 = lc00Var2;
                            if (kt1Var != null) {
                                lc00Var5.add(kt1Var);
                            }
                            hrl hrlVar = zu1Var.f;
                            s98 s98Var = gu1Var3.i;
                            if (s98Var.f31841a.isEmpty()) {
                                jt1Var = null;
                            } else {
                                String strA16 = s98Var.b;
                                if (strA16.length() == 0) {
                                    strA16 = lsm0Var2.a(R.string.rules_title, Arrays.copyOf(new Object[0], 0));
                                }
                                jt1Var = new jt1(hrlVar, new irl(strA16, CollectionsKt.b0(s98Var.f31841a, Separators.RETURN, null, null, null, 62)));
                            }
                            if (jt1Var != null) {
                                lc00Var5.add(jt1Var);
                            }
                            sh1 sh1Var = sh1.b;
                            rh1.f30465a.getClass();
                            b0i b0iVar = new b0i(sh1Var, jdk0.e(str8));
                            List list14 = gu1Var3.g;
                            if (list14.isEmpty()) {
                                collectionJ2 = iun.f15405a;
                            } else {
                                if (list14.size() > 8) {
                                    i4 = 0;
                                    strA3 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i4 = 0;
                                    strA3 = null;
                                }
                                ht1 ht1Var2 = new ht1(new hjm(lsm0Var2.a(R.string.providers, Arrays.copyOf(new Object[i4], i4)), null, null, null, null, null, false, null, null, false, strA3 != null ? new ue9(strA3) : null, null, 7166));
                                List<izb0> listD1 = CollectionsKt.D0(list14, 8);
                                ArrayList arrayList7 = new ArrayList(r3d.q(listD1, 10));
                                for (izb0 izb0Var : listD1) {
                                    arrayList7.add(new eol(String.valueOf(izb0Var.c), new n0x(izb0Var.f15628a), false, izb0Var.b, "-", lsm0Var2.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), null));
                                }
                                collectionJ2 = q3d.j(ht1Var2, new it1(new bol(dyb.o0(arrayList7), b0iVar)));
                            }
                            lc00Var5.addAll(collectionJ2);
                            a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00Var5));
                            if (a4xVarO0 != null) {
                                return a4xVarO0;
                            }
                        }
                        return lak0.c;
                    case 2:
                        return a(obj);
                    case 3:
                        n0o0 n0o0Var3 = gv1Var.q;
                        dt1 dt1Var2 = (dt1) obj;
                        dt1Var2.getClass();
                        if (dt1Var2.equals(ct1Var)) {
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            lc00VarB2.add(new ju1(((zu1) ((fee) n0o0Var3.getValue()).b()).c, arlVar));
                            for (int i33 = 0; i33 < 10; i33++) {
                                lc00VarB2.add(new ku1(ur1.f36143a));
                            }
                            return new mu1(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                        }
                        if (!dt1Var2.equals(at1Var)) {
                            if (dt1Var2.equals(bt1Var)) {
                                return new mu1(lak0.c);
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var9 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var9 == null) {
                            return new mu1(lak0.c);
                        }
                        ctf0 ctf0Var3 = gv1Var.b;
                        zu1 zu1Var6 = (zu1) ((fee) n0o0Var3.getValue()).b();
                        int iIntValue3 = ((Number) ((fee) gv1Var.r.getValue()).c()).intValue();
                        ctf0Var3.getClass();
                        zu1Var6.getClass();
                        gt1 gt1VarT1 = ntr.t0(gu1Var9, ctf0Var3, zu1Var6.c);
                        ju1 ju1Var = gt1VarT1 != null ? new ju1(gt1VarT1.f11859a, gt1VarT1.b) : null;
                        List<o2g0> list15 = gu1Var9.h.f17902a;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list15, 10));
                        for (o2g0 o2g0Var2 : list15) {
                            o2g0Var2.getClass();
                            String str18 = o2g0Var2.f24529a;
                            Long lT0 = StringsKt.t0(str18);
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String strA17 = ctf0Var3.b.a(R.string.tournament_points_v2, Arrays.copyOf(new Object[]{String.valueOf(o2g0Var2.d)}, 1));
                            boolean z7 = o2g0Var2.b;
                            int i34 = o2g0Var2.c;
                            switch (i34) {
                                case 1:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_one);
                                    break;
                                case 2:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_two);
                                    break;
                                case 3:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_three);
                                    break;
                                case 4:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_four);
                                    break;
                                case 5:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_five);
                                    break;
                                case 6:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_six);
                                    break;
                                case 7:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_seven);
                                    break;
                                case 8:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_eight);
                                    break;
                                case 9:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_nine);
                                    break;
                                case 10:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_ten);
                                    break;
                                default:
                                    rr1VarP = new qr1(String.valueOf(i34), z7 ? czr0.b : czr0.f5237a);
                                    break;
                            }
                            arrayList8.add(new ku1(new tr1(jLongValue, strA17, str18, z7, false, rr1VarP)));
                        }
                        if (arrayList8.isEmpty()) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.i;
                            xuzVar.getClass();
                            mu1Var = new nu1(new mdm(xuz.a(pb10Var, iIntValue3), ju1Var == null ? pdm.f26814a : pdm.c, null, 0, 0, R.string.tournament_result_not_available, 0, 0, 0L, 0L, 988), ju1Var);
                        } else {
                            mu1Var = new mu1(dyb.o0(CollectionsKt.q0(q3d.k(ju1Var), arrayList8)));
                        }
                        return mu1Var;
                    case 4:
                        return b(obj);
                    case 5:
                        return p8a.d0((gu1) obj, s9s0.f31863a, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 6:
                        return p8a.d0((gu1) obj, s9s0.b, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    default:
                        return p8a.d0((gu1) obj, s9s0.c, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                }
            }
        }, (byte) 20));
        final byte b8 = 7;
        this.z = maz.b(new yw9(gu1Var, new Function1(this) { // from class: a.fv1
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                pt0 pt0Var;
                String strA;
                int i2;
                nur murVar;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                boolean zEquals = dt1Var.equals(ct1.f4914a);
                gv1 gv1Var = this.b;
                xll xllVar = xll.f41078a;
                if (zEquals) {
                    return new aml(x4d0.g0((ot0) gv1Var.a().c()), xllVar, true);
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new zll(x4d0.g0((ot0) gv1Var.a().c()), xllVar, lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                Map map = (Map) ((fee) gv1Var.l.getValue()).c();
                ctf0 ctf0Var2 = gv1Var.b;
                boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                ot0 ot0Var = (ot0) gv1Var.a().c();
                map.getClass();
                ctf0Var2.getClass();
                set.getClass();
                ot0Var.getClass();
                int iOrdinal = ot0Var.ordinal();
                if (iOrdinal == 0) {
                    pt0Var = pt0.f27539a;
                } else if (iOrdinal == 1) {
                    pt0Var = pt0.b;
                } else if (iOrdinal == 2) {
                    pt0Var = pt0.c;
                } else if (iOrdinal == 3) {
                    pt0Var = pt0.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    pt0Var = pt0.e;
                }
                Collection collectionValues = map.values();
                ArrayList arrayList = new ArrayList(r3d.q(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    mlr mlrVar = (mlr) it.next();
                    long j = mlrVar.f22006a;
                    boolean z = mlrVar.k;
                    boolean zContains = set.contains(Long.valueOf(j));
                    int i3 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                    boolean z2 = mlrVar.j;
                    if (z) {
                        strA = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = z2 ? ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                    }
                    Iterator it2 = it;
                    ctf0 ctf0Var3 = ctf0Var2;
                    long j2 = mlrVar.f22006a;
                    String str = mlrVar.f;
                    String str2 = mlrVar.e;
                    if (zBooleanValue) {
                        i2 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                    } else {
                        i2 = 0;
                    }
                    mtr mtrVar = new mtr(i2, zContains);
                    n0x n0xVar2 = new n0x(mlrVar.g);
                    m0x m0xVar = new m0x(i3, null, 6);
                    if (strA.length() == 0) {
                        murVar = lur.f20686a;
                        n0xVar = n0xVar2;
                    } else {
                        pt0 pt0Var4 = pt0.f27539a;
                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                            n0xVar = n0xVar2;
                        } else {
                            n0xVar = n0xVar2;
                            pt0 pt0Var5 = pt0.d;
                            if (pt0Var != pt0Var5 || !z) {
                                if ((pt0Var == pt0Var4 && z2) || ((pt0Var == pt0Var2 && z2) || (pt0Var == pt0Var5 && z2))) {
                                    d4d d4dVar = d4d.PRIMARY;
                                    uqo0Var = new eqo0();
                                } else {
                                    pt0 pt0Var6 = pt0.b;
                                    if ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) {
                                        uqo0Var = kro0.f18776a;
                                    } else {
                                        uqo0Var = ((pt0Var == pt0Var6 && z2) || (pt0Var == pt0Var3 && z2)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                    }
                                }
                            }
                            murVar = new mur(strA, uqo0Var);
                        }
                        d4d d4dVar2 = d4d.PRIMARY;
                        uqo0Var = new lro0();
                        murVar = new mur(strA, uqo0Var);
                    }
                    arrayList.add(new st0(j2, str, str2, mtrVar, n0xVar, m0xVar, null, murVar));
                    ctf0Var2 = ctf0Var3;
                    it = it2;
                }
                return new zll(pt0Var, xllVar, arrayList);
            }

            private final Object b(Object obj) {
                Iterable iterableC;
                xw1 xw1Var;
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.e;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                if (dt1Var.equals(ct1.f4914a)) {
                    gu1 gu1Var2 = (gu1) ((fee) n0o0Var.getValue()).c();
                    if (gu1Var2 != null && gu1Var2.b != z1s0.f43637a && gu1Var2.d) {
                        return new ys1(dyb.g0(new mw1(uw1.f36373a)));
                    }
                    hrl hrlVar = hrl.f13536a;
                    return new xs1(dyb.g0(new pu1(jrl.f17007a)));
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new xs1(lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                gu1 gu1Var3 = (gu1) ((fee) n0o0Var.getValue()).c();
                if (gu1Var3 == null) {
                    return new xs1(lak0.c);
                }
                List list = (List) ((fee) gv1Var.m.getValue()).c();
                Map map = (Map) ((fee) gv1Var.n.getValue()).c();
                Set set = (Set) ((fee) gv1Var.p.getValue()).c();
                list.getClass();
                map.getClass();
                set.getClass();
                if (gu1Var3.b == z1s0.f43637a || !gu1Var3.d) {
                    z78 z78Var = gu1Var3.j;
                    if (z78Var.f43905a) {
                        iterableC = iun.f15405a;
                    } else {
                        String strR = q8a.R(z78Var.c.concat(Separators.RETURN));
                        String strR2 = q8a.R(z78Var.d);
                        if (StringsKt.u0(strR).toString().length() == 0 && strR2.length() == 0) {
                            iterableC = iun.f15405a;
                        } else {
                            String strS = z78Var.e ? q8a.S(list) : null;
                            String str = strS != null ? strS : "";
                            hrl hrlVar2 = hrl.f13536a;
                            iterableC = kotlin.collections.a.c(new pu1(new irl(z78Var.b, StringsKt.v0(strR + str + strR2).toString())));
                        }
                    }
                    return new xs1(dyb.o0(iterableC));
                }
                o98 o98Var = gu1Var3.k;
                lc00 lc00VarB = kotlin.collections.a.b();
                String strR3 = q8a.R(o98Var.f24867a);
                List<jng0> list2 = o98Var.b;
                jng0 jng0Var = (jng0) CollectionsKt.firstOrNull(list2);
                String str2 = jng0Var != null ? jng0Var.e : null;
                String strR4 = q8a.R(str2 != null ? str2 : "");
                if (strR3.length() > 0) {
                    String strS2 = q8a.S(list);
                    lc00VarB.add(new mw1(new tw1(o98Var.c, StringsKt.v0(strR3 + strS2 + strR4).toString(), new ow1(new m0x(R.drawable.ic_glyph_tournaments, null, 6)), set.contains(xr1.f41347a))));
                }
                ArrayList arrayList = new ArrayList();
                for (jng0 jng0Var2 : list2) {
                    String strR5 = q8a.R(jng0Var2.f16811a);
                    String strR6 = q8a.R(jng0Var2.e);
                    if (strR5.length() == 0 || strR6.length() == 0) {
                        xw1Var = null;
                    } else {
                        List list3 = (List) map.get(Long.valueOf(jng0Var2.b));
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        String strS3 = q8a.S(list3);
                        xw1Var = new xw1(jng0Var2.b, jng0Var2.d, jng0Var2.c, StringsKt.v0(strR5 + strS3 + strR6).toString());
                    }
                    if (xw1Var != null) {
                        arrayList.add(xw1Var);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    xw1 xw1Var2 = (xw1) next;
                    long j = xw1Var2.f41588a;
                    wr1 wr1Var = new wr1(j);
                    Date date = xw1Var2.b;
                    Date date2 = xw1Var2.c;
                    rdj rdjVar = rdj.f30294a;
                    sdj sdjVar = sdj.UNIQUE_3;
                    lc00VarB.add(new lw1(j, new tw1(kng0.l(rdj.c(rdjVar, sdjVar, date, null, 60), " - ", rdj.c(rdjVar, sdjVar, date2, null, 60)), xw1Var2.d, new pw1(String.valueOf(i3)), set.contains(wr1Var))));
                    it = it;
                    i2 = i3;
                }
                return new ys1(dyb.o0(kotlin.collections.a.a(lc00VarB)));
            }

            /* JADX WARN: Code duplicated, block: B:358:0x09c5  */
            /* JADX WARN: Code duplicated, block: B:500:0x0c58  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                lt1 lt1Var;
                gx1 gx1Var;
                int i2;
                gu1 gu1Var2;
                lsm0 lsm0Var;
                lc00 lc00Var;
                ft1 ft1Var;
                pt0 pt0Var;
                lsm0 lsm0Var2;
                String strA;
                Collection collectionJ;
                boolean z;
                mt1 mt1Var;
                String strA2;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                lc00 lc00Var2;
                zu1 zu1Var;
                List list;
                List list2;
                List listSubList;
                gu1 gu1Var3;
                ArrayList arrayList;
                Iterator it;
                Object obj2;
                List list3;
                long j;
                rrl rrlVar;
                int i3;
                kt1 kt1Var;
                jt1 jt1Var;
                int i4;
                String strA3;
                Collection collectionJ2;
                Iterable iterableD0;
                int i5;
                int i6;
                int iIntValue;
                int iNextIndex;
                int i7;
                ft1 ft1Var2;
                String strL;
                String strK;
                String str4;
                n0x n0xVar2;
                String str5;
                String strA4;
                String strA5;
                Object mu1Var;
                rr1 rr1VarP;
                byte b9 = b8;
                bt1 bt1Var = bt1.f3159a;
                at1 at1Var = at1.f1413a;
                arl arlVar = arl.f1351a;
                ct1 ct1Var = ct1.f4914a;
                gv1 gv1Var = this.b;
                switch (b9) {
                    case 0:
                        return p8a.d0((gu1) obj, s9s0.d, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 1:
                        n0o0 n0o0Var = gv1Var.j;
                        n0o0 n0o0Var2 = gv1Var.q;
                        dt1 dt1Var = (dt1) obj;
                        dt1Var.getClass();
                        boolean zEquals = dt1Var.equals(ct1Var);
                        bzw bzwVar = null;
                        int i8 = 6;
                        o0s o0sVar = o0s.f24443a;
                        if (zEquals) {
                            zu1 zu1Var2 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            et1 et1Var = new et1(zu1Var2.f44988a, ew1.f8498a);
                            lt1 lt1Var2 = new lt1(zu1Var2.b, zrl.f44860a);
                            gt1 gt1Var = new gt1(zu1Var2.c, arlVar);
                            ft1 ft1Var3 = new ft1(zu1Var2.d, jw1.f17229a);
                            mt1 mt1Var2 = new mt1(new ijm());
                            nt1 nt1Var = new nt1(new aml(x4d0.g0((ot0) gv1Var.a().c()), new wll(o0sVar), true));
                            kt1 kt1Var2 = new kt1(zu1Var2.e, mrl.f22278a);
                            jt1 jt1Var2 = new jt1(zu1Var2.f, jrl.f17007a);
                            ht1 ht1Var = new ht1(new ijm());
                            jdk0 jdk0Var = rh1.f30465a;
                            String str6 = (String) ((fee) n0o0Var.getValue()).c();
                            jdk0Var.getClass();
                            return dyb.g0(et1Var, lt1Var2, gt1Var, ft1Var3, mt1Var2, nt1Var, kt1Var2, jt1Var2, ht1Var, new it1(new col(new b0i(sh1.b, jdk0.e(str6)))));
                        }
                        if (!dt1Var.equals(at1Var)) {
                            if (dt1Var.equals(bt1Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var4 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var4 != null) {
                            ctf0 ctf0Var2 = gv1Var.b;
                            Locale locale2 = (Locale) gv1Var.B;
                            zu1 zu1Var3 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            String str7 = (String) ((fee) gv1Var.h.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                            ot0 ot0Var = (ot0) gv1Var.a().c();
                            boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                            Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                            String str8 = (String) ((fee) n0o0Var.getValue()).c();
                            ctf0Var2.getClass();
                            zu1Var3.getClass();
                            str7.getClass();
                            ot0Var.getClass();
                            set.getClass();
                            str8.getClass();
                            lc00 lc00VarB = kotlin.collections.a.b();
                            cw1 cw1Var = zu1Var3.f44988a;
                            z1s0 z1s0Var = gu1Var4.b;
                            rdj rdjVar = rdj.f30294a;
                            j88 j88Var = gu1Var4.e;
                            Set set2 = set;
                            long j2 = j88Var.e;
                            long j3 = j88Var.i;
                            zoe zoeVar = j88Var.f16071a;
                            Date dateK = rdj.k(j3);
                            Date dateK2 = rdj.k(j2);
                            Date date = new Date();
                            bw1 bw1Var = ((date.after(dateK) && date.before(dateK2)) || new Date().before(dateK)) ? bw1.f3302a : bw1.b;
                            long j4 = ((j2 - j3) * 1000) / 86400000;
                            String str9 = j88Var.g;
                            String str10 = j88Var.h;
                            int iOrdinal = cw1Var.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                o0sVar = o0sVar;
                                str = "";
                            } else {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        strA5 = eeq.R(dateK, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA5 = ctf0Var2.b.a(R.string.tournament_prize_pool_title_date_start, Arrays.copyOf(new Object[0], 0));
                                str = strA5;
                            }
                            String strS = eeq.S(dateK, ctf0Var2, cw1Var, locale2);
                            int iOrdinal2 = cw1Var.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                str2 = "";
                            } else {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        strA4 = eeq.R(dateK2, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA4 = ctf0Var2.b.a(R.string.tournament_title_date_end, Arrays.copyOf(new Object[0], 0));
                                str2 = strA4;
                            }
                            String strS2 = eeq.S(dateK2, ctf0Var2, cw1Var, locale2);
                            Object[] objArr = {Long.valueOf(j4)};
                            lsm0 lsm0Var3 = ctf0Var2.b;
                            String strA6 = lsm0Var3.a(R.string.days_v2, Arrays.copyOf(objArr, 1));
                            String strA7 = bw1Var == bw1.b ? lsm0Var3.a(R.string.end_of_tournament, Arrays.copyOf(new Object[0], 0)) : "";
                            int iOrdinal3 = cw1Var.ordinal();
                            if (iOrdinal3 == 0) {
                                str3 = "Background Picture.webp";
                            } else if (iOrdinal3 == 1) {
                                str3 = "Picture S.webp";
                            } else {
                                if (iOrdinal3 != 2) {
                                    if (iOrdinal3 == 3) {
                                        str3 = "";
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                str3 = "Dates.webp";
                            }
                            List list4 = u0d.f34849a;
                            n0x n0xVar3 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(str3)));
                            int[] iArr = iu1.f15377a;
                            lc00VarB.add(new et1(cw1Var, new dw1(bw1Var, str9, str10, str, strS, str2, strS2, strA6, strA7, n0xVar3, new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Left.webp" : ""))), new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Right.webp" : ""))))));
                            gx1 gx1Var2 = zu1Var3.b;
                            if (zoeVar.d == qpe.c) {
                                lt1Var = null;
                            } else {
                                int iOrdinal4 = gx1Var2.ordinal();
                                if (iOrdinal4 == 0) {
                                    gx1Var = gx1.f12054a;
                                } else if (iOrdinal4 == 1) {
                                    gx1Var = gx1.b;
                                } else {
                                    if (iOrdinal4 != 2) {
                                        if (iOrdinal4 == 3) {
                                            gx1Var = gx1.d;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    gx1Var = gx1.c;
                                }
                                String str11 = zoeVar.c;
                                int iOrdinal5 = gx1Var2.ordinal();
                                if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                                    i2 = R.string.day_short;
                                } else {
                                    if (iOrdinal5 != 2) {
                                        if (iOrdinal5 == 3) {
                                            i2 = R.string.day_short_2;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    i2 = R.string.days_in_case_caps;
                                }
                                String strA8 = lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0));
                                gx1 gx1Var3 = gx1.c;
                                String strA9 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.hours_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA10 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.minutes_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA11 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.seconds_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                long jCurrentTimeMillis = zoeVar.f44716a - System.currentTimeMillis();
                                lt1Var = new lt1(gx1Var, new yrl(str11, strA8, strA9, strA10, strA11, jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis));
                            }
                            if (lt1Var != null) {
                                lc00VarB.add(lt1Var);
                            }
                            gt1 gt1VarT0 = ntr.t0(gu1Var4, ctf0Var2, zu1Var3.c);
                            if (gt1VarT0 != null) {
                                lc00VarB.add(gt1VarT0);
                            }
                            gw1 gw1Var = zu1Var3.d;
                            w88 w88Var = gu1Var4.f;
                            boolean z2 = w88Var.f38710a;
                            List list5 = w88Var.c;
                            if (z2 || list5.isEmpty()) {
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = null;
                            } else {
                                String strA12 = w88Var.e;
                                if (strA12.length() == 0) {
                                    i7 = 0;
                                    strA12 = lsm0Var3.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i7 = 0;
                                }
                                String strA13 = lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[i7], i7));
                                if (list5.size() <= 5) {
                                    strA13 = null;
                                }
                                String str12 = strA13 == null ? "" : strA13;
                                boolean z3 = w88Var.b == xxb0.f41650a;
                                String strF = ctf0Var2.f(R.string.fs, new Object[0]);
                                ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                                Iterator it2 = list5.iterator();
                                int i9 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    pxb0 pxb0Var = (pxb0) next;
                                    if (z3) {
                                        String strF2 = ctf0Var2.f(R.string.place, new Object[0]);
                                        int i11 = pxb0Var.b;
                                        int i12 = pxb0Var.c;
                                        strL = i11 == i12 ? dw9.m(i11, Separators.SP, strF2) : i11 + "-" + i12 + Separators.SP + strF2;
                                    } else {
                                        ft1Var2 = ft1Var2;
                                        strL = kng0.l(ctf0Var2.f(R.string.stocks_prizes, new Object[0]), ": ", pxb0Var.h);
                                    }
                                    int i13 = pxb0Var.i;
                                    String str13 = i13 > 0 ? strF + Separators.SP + i13 : "";
                                    if (z1s0Var != z1s0.f43637a) {
                                        strK = pxb0Var.d;
                                    } else {
                                        pn40 pn40Var = pn40.f27267a;
                                        double d = pxb0Var.f;
                                        p3u0 p3u0Var = p3u0.c;
                                        strK = b1j.k("\u202a", str7, Separators.SP, pn40.l(d), "\u202c");
                                    }
                                    String str14 = strK;
                                    String str15 = pxb0Var.f27747a;
                                    int iOrdinal6 = gw1Var.ordinal();
                                    if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
                                        if (i10 == 1) {
                                            str4 = "Number_Gold.webp";
                                        } else if (i10 == 2) {
                                            str4 = "Number_Silver.webp";
                                        } else if (i10 != 3) {
                                            str4 = gw1Var == gw1.c ? "Number_Other_Star.webp" : "Number_Other.webp";
                                        } else {
                                            str4 = "Number_Bronze.webp";
                                        }
                                        List list6 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/".concat(str4)));
                                    } else {
                                        if (iOrdinal6 != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                        if (i10 == 1) {
                                            str5 = "Illustration_Gold.webp";
                                        } else if (i10 != 2) {
                                            str5 = i10 != 3 ? "Illustration_Other.webp" : "Illustration_Bronze.webp";
                                        } else {
                                            str5 = "Illustration_Silver.webp";
                                        }
                                        List list7 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/illustration/".concat(str5)));
                                    }
                                    arrayList2.add(new vv1(str15, n0xVar2, strL, str14, str13));
                                    i9 = i10;
                                    it2 = it3;
                                    lsm0Var3 = lsm0Var3;
                                    gu1Var4 = gu1Var4;
                                    lc00VarB = lc00VarB;
                                    ft1Var2 = ft1Var2;
                                }
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = new ft1(gw1Var, new iw1(dyb.o0(arrayList2), strA12, str12));
                            }
                            lc00 lc00Var3 = lc00Var;
                            if (ft1Var != null) {
                                lc00Var3.add(ft1Var);
                            }
                            gu1 gu1Var5 = gu1Var2;
                            List list8 = gu1Var5.r;
                            if (list8.isEmpty()) {
                                collectionJ = iun.f15405a;
                                lsm0Var2 = lsm0Var;
                            } else {
                                int iOrdinal7 = ot0Var.ordinal();
                                if (iOrdinal7 == 0) {
                                    pt0Var = pt0.f27539a;
                                } else if (iOrdinal7 == 1) {
                                    pt0Var = pt0.b;
                                } else if (iOrdinal7 == 2) {
                                    pt0Var = pt0.c;
                                } else if (iOrdinal7 == 3) {
                                    pt0Var = pt0.d;
                                } else {
                                    if (iOrdinal7 != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    pt0Var = pt0.e;
                                }
                                if (list8.size() == 1) {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_game, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                mt1 mt1Var3 = new mt1(new hjm(strA, null, null, null, null, null, false, null, null, false, null, null, 7166));
                                wll wllVar = new wll(o0sVar);
                                List listD0 = CollectionsKt.D0(list8, 8);
                                ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                Iterator it4 = listD0.iterator();
                                while (it4.hasNext()) {
                                    mlr mlrVar = (mlr) it4.next();
                                    long j5 = mlrVar.f22006a;
                                    boolean z4 = mlrVar.k;
                                    Set set3 = set2;
                                    boolean zContains = set3.contains(Long.valueOf(j5));
                                    int i14 = zBooleanValue ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    Iterator it5 = it4;
                                    boolean z5 = mlrVar.j;
                                    if (z4) {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = lsm0Var2.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = z ? lsm0Var2.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    set2 = set3;
                                    long j6 = mlrVar.f22006a;
                                    String str16 = mlrVar.f;
                                    String str17 = mlrVar.e;
                                    mtr mtrVar = new mtr(zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar4 = new n0x(mlrVar.g);
                                    m0x m0xVar = new m0x(i14, bzwVar, i8);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        n0xVar = n0xVar4;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z4) || (pt0Var == (pt0Var2 = pt0.c) && z4)) {
                                            n0xVar = n0xVar4;
                                        } else {
                                            n0xVar = n0xVar4;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z4) {
                                                if ((pt0Var == pt0Var4 && z) || ((pt0Var == pt0Var2 && z) || (pt0Var == pt0Var5 && z))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var3 = pt0.e) && z4)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z) || (pt0Var == pt0Var3 && z)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList3.add(new st0(j6, str16, str17, mtrVar, n0xVar, m0xVar, null, murVar));
                                    it4 = it5;
                                    mt1Var3 = mt1Var;
                                    i8 = 6;
                                    bzwVar = null;
                                }
                                collectionJ = q3d.j(mt1Var3, new nt1(new zll(pt0Var, wllVar, arrayList3)));
                            }
                            lc00Var3.addAll(collectionJ);
                            zu1 zu1Var4 = zu1Var3;
                            l5i l5iVar = zu1Var4.e;
                            List list9 = gu1Var5.l.f38767a;
                            long j7 = gu1Var5.q;
                            List list10 = gu1Var5.k.b;
                            z1s0 z1s0Var2 = z1s0.b;
                            url urlVar = url.f36169a;
                            vrl vrlVar = vrl.f37904a;
                            if (z1s0Var == z1s0Var2) {
                                if (list10.isEmpty()) {
                                    iterableD0 = iun.f15405a;
                                } else if (list10.size() <= 3) {
                                    iterableD0 = list10;
                                } else if (plc.z(gu1Var5)) {
                                    int size = list10.size();
                                    Date date2 = new Date();
                                    ListIterator listIterator = list10.listIterator(list10.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                        } else if (((jng0) listIterator.previous()).c.before(date2)) {
                                            iNextIndex = listIterator.nextIndex();
                                        }
                                    }
                                    if (iNextIndex == -1) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(list10.get(iNextIndex));
                                        for (int i15 = iNextIndex + 1; i15 < size && arrayList4.size() < 3; i15++) {
                                            arrayList4.add(list10.get(i15));
                                        }
                                        if (arrayList4.size() < 3) {
                                            int i16 = iNextIndex - 1;
                                            for (int i17 = 3; -1 < i16 && arrayList4.size() < i17; i17 = 3) {
                                                arrayList4.add(0, list10.get(i16));
                                                i16--;
                                            }
                                            iterableD0 = arrayList4;
                                        } else {
                                            int i18 = iNextIndex >= size - 2 ? size - 3 : iNextIndex > 0 ? iNextIndex : 0;
                                            iterableD0 = list10.subList(i18, i18 + 3);
                                        }
                                    }
                                } else if (list10.size() > 3) {
                                    int iOrdinal8 = j88Var.j.ordinal();
                                    if (iOrdinal8 == 0) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else if (iOrdinal8 == 1) {
                                        int size2 = list10.size();
                                        Date date3 = new Date();
                                        Iterator it6 = list10.iterator();
                                        int i19 = 0;
                                        while (true) {
                                            if (it6.hasNext()) {
                                                jng0 jng0Var = (jng0) it6.next();
                                                i5 = size2;
                                                Date date4 = jng0Var.d;
                                                Date date5 = jng0Var.c;
                                                if (!date3.after(date4) || !date3.before(date5)) {
                                                    i19++;
                                                    size2 = i5;
                                                }
                                            } else {
                                                i5 = size2;
                                                i19 = -1;
                                            }
                                        }
                                        Integer numValueOf = Integer.valueOf(i19);
                                        if (i19 < 0) {
                                            numValueOf = null;
                                        }
                                        if (numValueOf != null) {
                                            iIntValue = numValueOf.intValue();
                                        } else {
                                            Iterator it7 = list10.iterator();
                                            int i20 = 0;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    int i21 = i20;
                                                    if (((jng0) it7.next()).b == j7) {
                                                        i6 = i21;
                                                    } else {
                                                        i20 = i21 + 1;
                                                    }
                                                } else {
                                                    i6 = -1;
                                                }
                                            }
                                            Integer numValueOf2 = Integer.valueOf(i6);
                                            if (i6 < 0) {
                                                numValueOf2 = null;
                                            }
                                            iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                        }
                                        if (iIntValue >= i5 - 2) {
                                            iIntValue = i5 - 3;
                                        } else if (iIntValue <= 0) {
                                            iIntValue = 0;
                                        }
                                        iterableD0 = list10.subList(iIntValue, iIntValue + 3);
                                    } else {
                                        if (iOrdinal8 != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        iterableD0 = CollectionsKt.E0(3, list10);
                                    }
                                } else {
                                    iterableD0 = list10;
                                }
                                ArrayList arrayList5 = new ArrayList(r3d.q(iterableD0, 10));
                                Iterator it8 = iterableD0.iterator();
                                int i22 = 0;
                                while (it8.hasNext()) {
                                    Object next2 = it8.next();
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    jng0 jng0Var2 = (jng0) next2;
                                    Date date6 = new Date();
                                    Date date7 = jng0Var2.d;
                                    Iterator it9 = it8;
                                    Date date8 = jng0Var2.c;
                                    List list11 = list10;
                                    rdj rdjVar2 = rdj.f30294a;
                                    sdj sdjVar = sdj.UNIQUE_3;
                                    List list12 = list9;
                                    lc00 lc00Var4 = lc00Var3;
                                    zu1 zu1Var5 = zu1Var4;
                                    String strL2 = kng0.l(rdj.c(rdjVar2, sdjVar, date7, locale2, 28), " - ", rdj.c(rdjVar2, sdjVar, date8, locale2, 28));
                                    String strValueOf = String.valueOf(jng0Var2.b);
                                    long time = jng0Var2.d.getTime();
                                    gu1 gu1Var6 = gu1Var5;
                                    double dCurrentTimeMillis = (((System.currentTimeMillis() - time) / 1000) / ((date8.getTime() - time) / 1000)) * 100.0d;
                                    arrayList5.add(date6.before(date7) ? new rrl(strValueOf, strL2, jng0Var2.f16811a, urlVar) : (date6.after(date7) && date6.before(date8)) ? new rrl(strValueOf, strL2, null, new wrl((dCurrentTimeMillis <= 0.0d || dCurrentTimeMillis >= 1.0d) ? (int) dCurrentTimeMillis : 1, 100)) : new rrl(strValueOf, strL2, null, vrlVar));
                                    it8 = it9;
                                    list10 = list11;
                                    i22 = i23;
                                    list9 = list12;
                                    zu1Var4 = zu1Var5;
                                    gu1Var5 = gu1Var6;
                                    lc00Var3 = lc00Var4;
                                }
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                list = list10;
                                list2 = list9;
                                gu1Var3 = gu1Var5;
                                arrayList = arrayList5;
                            } else {
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                gu1 gu1Var7 = gu1Var5;
                                list = list10;
                                list2 = list9;
                                List list13 = (list2.isEmpty() || list2.size() <= 3) ? null : list2;
                                if (list13 != null) {
                                    Iterator it10 = list13.iterator();
                                    int i24 = 0;
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            i3 = -1;
                                        } else if (((fzl0) it10.next()).c == j7) {
                                            i3 = i24;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i3);
                                    if (i3 < 0) {
                                        numValueOf3 = null;
                                    }
                                    int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                    int size3 = iIntValue2 == 0 ? 0 : iIntValue2 >= list13.size() + (-2) ? list13.size() - 3 : iIntValue2 - 1;
                                    int i25 = size3 + 3;
                                    int size4 = list13.size();
                                    if (i25 > size4) {
                                        i25 = size4;
                                    }
                                    listSubList = list13.subList(size3, i25);
                                    if (listSubList == null) {
                                        listSubList = list2;
                                    }
                                } else {
                                    listSubList = list2;
                                }
                                ArrayList arrayList6 = new ArrayList(r3d.q(listSubList, 10));
                                Iterator it11 = listSubList.iterator();
                                int i26 = 0;
                                while (it11.hasNext()) {
                                    Object next3 = it11.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fzl0 fzl0Var = (fzl0) next3;
                                    gu1 gu1Var8 = gu1Var7;
                                    Iterator it12 = gu1Var8.h.f17902a.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            Object next4 = it12.next();
                                            it = it11;
                                            if (((o2g0) next4).b) {
                                                obj2 = next4;
                                            } else {
                                                it11 = it;
                                            }
                                        } else {
                                            it = it11;
                                            obj2 = null;
                                        }
                                    }
                                    o2g0 o2g0Var = (o2g0) obj2;
                                    int i28 = o2g0Var != null ? o2g0Var.d : 0;
                                    int i29 = fzl0Var.b;
                                    boolean z6 = i28 >= i29;
                                    int i30 = (int) fzl0Var.c;
                                    int i31 = (int) j7;
                                    fzl0 fzl0Var2 = (fzl0) CollectionsKt.W(i26 - 1, listSubList);
                                    int i32 = fzl0Var2 != null ? fzl0Var2.b : 0;
                                    if (i30 != i31 || !gu1Var8.c) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = i31 > i30 ? new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar) : new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, urlVar);
                                    } else if (z6) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar);
                                    } else {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), lsm0Var2.a(R.string.tournament_stage_points_left_2_v2, Arrays.copyOf(new Object[]{String.valueOf(i29 - i28)}, 1)), new wrl(i28 - i32, i29 - i32));
                                    }
                                    arrayList6.add(rrlVar);
                                    it11 = it;
                                    i26 = i27;
                                    gu1Var7 = gu1Var8;
                                    listSubList = list3;
                                    j7 = j;
                                }
                                gu1Var3 = gu1Var7;
                                arrayList = arrayList6;
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                String strA14 = lsm0Var2.a(R.string.tournament_stages, Arrays.copyOf(new Object[0], 0));
                                String strA15 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                if (z1s0Var != z1s0.b ? list2.size() <= 3 : list.size() <= 3) {
                                    strA15 = null;
                                }
                                if (strA15 == null) {
                                    strA15 = "";
                                }
                                kt1Var = new kt1(l5iVar, new lrl(dyb.o0(arrayList), strA14, strA15));
                            } else {
                                kt1Var = null;
                            }
                            lc00 lc00Var5 = lc00Var2;
                            if (kt1Var != null) {
                                lc00Var5.add(kt1Var);
                            }
                            hrl hrlVar = zu1Var.f;
                            s98 s98Var = gu1Var3.i;
                            if (s98Var.f31841a.isEmpty()) {
                                jt1Var = null;
                            } else {
                                String strA16 = s98Var.b;
                                if (strA16.length() == 0) {
                                    strA16 = lsm0Var2.a(R.string.rules_title, Arrays.copyOf(new Object[0], 0));
                                }
                                jt1Var = new jt1(hrlVar, new irl(strA16, CollectionsKt.b0(s98Var.f31841a, Separators.RETURN, null, null, null, 62)));
                            }
                            if (jt1Var != null) {
                                lc00Var5.add(jt1Var);
                            }
                            sh1 sh1Var = sh1.b;
                            rh1.f30465a.getClass();
                            b0i b0iVar = new b0i(sh1Var, jdk0.e(str8));
                            List list14 = gu1Var3.g;
                            if (list14.isEmpty()) {
                                collectionJ2 = iun.f15405a;
                            } else {
                                if (list14.size() > 8) {
                                    i4 = 0;
                                    strA3 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i4 = 0;
                                    strA3 = null;
                                }
                                ht1 ht1Var2 = new ht1(new hjm(lsm0Var2.a(R.string.providers, Arrays.copyOf(new Object[i4], i4)), null, null, null, null, null, false, null, null, false, strA3 != null ? new ue9(strA3) : null, null, 7166));
                                List<izb0> listD1 = CollectionsKt.D0(list14, 8);
                                ArrayList arrayList7 = new ArrayList(r3d.q(listD1, 10));
                                for (izb0 izb0Var : listD1) {
                                    arrayList7.add(new eol(String.valueOf(izb0Var.c), new n0x(izb0Var.f15628a), false, izb0Var.b, "-", lsm0Var2.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), null));
                                }
                                collectionJ2 = q3d.j(ht1Var2, new it1(new bol(dyb.o0(arrayList7), b0iVar)));
                            }
                            lc00Var5.addAll(collectionJ2);
                            a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00Var5));
                            if (a4xVarO0 != null) {
                                return a4xVarO0;
                            }
                        }
                        return lak0.c;
                    case 2:
                        return a(obj);
                    case 3:
                        n0o0 n0o0Var3 = gv1Var.q;
                        dt1 dt1Var2 = (dt1) obj;
                        dt1Var2.getClass();
                        if (dt1Var2.equals(ct1Var)) {
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            lc00VarB2.add(new ju1(((zu1) ((fee) n0o0Var3.getValue()).b()).c, arlVar));
                            for (int i33 = 0; i33 < 10; i33++) {
                                lc00VarB2.add(new ku1(ur1.f36143a));
                            }
                            return new mu1(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                        }
                        if (!dt1Var2.equals(at1Var)) {
                            if (dt1Var2.equals(bt1Var)) {
                                return new mu1(lak0.c);
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var9 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var9 == null) {
                            return new mu1(lak0.c);
                        }
                        ctf0 ctf0Var3 = gv1Var.b;
                        zu1 zu1Var6 = (zu1) ((fee) n0o0Var3.getValue()).b();
                        int iIntValue3 = ((Number) ((fee) gv1Var.r.getValue()).c()).intValue();
                        ctf0Var3.getClass();
                        zu1Var6.getClass();
                        gt1 gt1VarT1 = ntr.t0(gu1Var9, ctf0Var3, zu1Var6.c);
                        ju1 ju1Var = gt1VarT1 != null ? new ju1(gt1VarT1.f11859a, gt1VarT1.b) : null;
                        List<o2g0> list15 = gu1Var9.h.f17902a;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list15, 10));
                        for (o2g0 o2g0Var2 : list15) {
                            o2g0Var2.getClass();
                            String str18 = o2g0Var2.f24529a;
                            Long lT0 = StringsKt.t0(str18);
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String strA17 = ctf0Var3.b.a(R.string.tournament_points_v2, Arrays.copyOf(new Object[]{String.valueOf(o2g0Var2.d)}, 1));
                            boolean z7 = o2g0Var2.b;
                            int i34 = o2g0Var2.c;
                            switch (i34) {
                                case 1:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_one);
                                    break;
                                case 2:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_two);
                                    break;
                                case 3:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_three);
                                    break;
                                case 4:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_four);
                                    break;
                                case 5:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_five);
                                    break;
                                case 6:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_six);
                                    break;
                                case 7:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_seven);
                                    break;
                                case 8:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_eight);
                                    break;
                                case 9:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_nine);
                                    break;
                                case 10:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_ten);
                                    break;
                                default:
                                    rr1VarP = new qr1(String.valueOf(i34), z7 ? czr0.b : czr0.f5237a);
                                    break;
                            }
                            arrayList8.add(new ku1(new tr1(jLongValue, strA17, str18, z7, false, rr1VarP)));
                        }
                        if (arrayList8.isEmpty()) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.i;
                            xuzVar.getClass();
                            mu1Var = new nu1(new mdm(xuz.a(pb10Var, iIntValue3), ju1Var == null ? pdm.f26814a : pdm.c, null, 0, 0, R.string.tournament_result_not_available, 0, 0, 0L, 0L, 988), ju1Var);
                        } else {
                            mu1Var = new mu1(dyb.o0(CollectionsKt.q0(q3d.k(ju1Var), arrayList8)));
                        }
                        return mu1Var;
                    case 4:
                        return b(obj);
                    case 5:
                        return p8a.d0((gu1) obj, s9s0.f31863a, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 6:
                        return p8a.d0((gu1) obj, s9s0.b, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    default:
                        return p8a.d0((gu1) obj, s9s0.c, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                }
            }
        }, (byte) 20));
        this.A = maz.b(new yw9(gu1Var, new Function1(this) { // from class: a.fv1
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                pt0 pt0Var;
                String strA;
                int i2;
                nur murVar;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                boolean zEquals = dt1Var.equals(ct1.f4914a);
                gv1 gv1Var = this.b;
                xll xllVar = xll.f41078a;
                if (zEquals) {
                    return new aml(x4d0.g0((ot0) gv1Var.a().c()), xllVar, true);
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new zll(x4d0.g0((ot0) gv1Var.a().c()), xllVar, lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                Map map = (Map) ((fee) gv1Var.l.getValue()).c();
                ctf0 ctf0Var2 = gv1Var.b;
                boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                ot0 ot0Var = (ot0) gv1Var.a().c();
                map.getClass();
                ctf0Var2.getClass();
                set.getClass();
                ot0Var.getClass();
                int iOrdinal = ot0Var.ordinal();
                if (iOrdinal == 0) {
                    pt0Var = pt0.f27539a;
                } else if (iOrdinal == 1) {
                    pt0Var = pt0.b;
                } else if (iOrdinal == 2) {
                    pt0Var = pt0.c;
                } else if (iOrdinal == 3) {
                    pt0Var = pt0.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    pt0Var = pt0.e;
                }
                Collection collectionValues = map.values();
                ArrayList arrayList = new ArrayList(r3d.q(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    mlr mlrVar = (mlr) it.next();
                    long j = mlrVar.f22006a;
                    boolean z = mlrVar.k;
                    boolean zContains = set.contains(Long.valueOf(j));
                    int i3 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                    boolean z2 = mlrVar.j;
                    if (z) {
                        strA = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = z2 ? ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                    }
                    Iterator it2 = it;
                    ctf0 ctf0Var3 = ctf0Var2;
                    long j2 = mlrVar.f22006a;
                    String str = mlrVar.f;
                    String str2 = mlrVar.e;
                    if (zBooleanValue) {
                        i2 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                    } else {
                        i2 = 0;
                    }
                    mtr mtrVar = new mtr(i2, zContains);
                    n0x n0xVar2 = new n0x(mlrVar.g);
                    m0x m0xVar = new m0x(i3, null, 6);
                    if (strA.length() == 0) {
                        murVar = lur.f20686a;
                        n0xVar = n0xVar2;
                    } else {
                        pt0 pt0Var4 = pt0.f27539a;
                        if ((pt0Var == pt0Var4 && z) || (pt0Var == (pt0Var2 = pt0.c) && z)) {
                            n0xVar = n0xVar2;
                        } else {
                            n0xVar = n0xVar2;
                            pt0 pt0Var5 = pt0.d;
                            if (pt0Var != pt0Var5 || !z) {
                                if ((pt0Var == pt0Var4 && z2) || ((pt0Var == pt0Var2 && z2) || (pt0Var == pt0Var5 && z2))) {
                                    d4d d4dVar = d4d.PRIMARY;
                                    uqo0Var = new eqo0();
                                } else {
                                    pt0 pt0Var6 = pt0.b;
                                    if ((pt0Var == pt0Var6 && z) || (pt0Var == (pt0Var3 = pt0.e) && z)) {
                                        uqo0Var = kro0.f18776a;
                                    } else {
                                        uqo0Var = ((pt0Var == pt0Var6 && z2) || (pt0Var == pt0Var3 && z2)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                    }
                                }
                            }
                            murVar = new mur(strA, uqo0Var);
                        }
                        d4d d4dVar2 = d4d.PRIMARY;
                        uqo0Var = new lro0();
                        murVar = new mur(strA, uqo0Var);
                    }
                    arrayList.add(new st0(j2, str, str2, mtrVar, n0xVar, m0xVar, null, murVar));
                    ctf0Var2 = ctf0Var3;
                    it = it2;
                }
                return new zll(pt0Var, xllVar, arrayList);
            }

            private final Object b(Object obj) {
                Iterable iterableC;
                xw1 xw1Var;
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.e;
                dt1 dt1Var = (dt1) obj;
                dt1Var.getClass();
                if (dt1Var.equals(ct1.f4914a)) {
                    gu1 gu1Var2 = (gu1) ((fee) n0o0Var.getValue()).c();
                    if (gu1Var2 != null && gu1Var2.b != z1s0.f43637a && gu1Var2.d) {
                        return new ys1(dyb.g0(new mw1(uw1.f36373a)));
                    }
                    hrl hrlVar = hrl.f13536a;
                    return new xs1(dyb.g0(new pu1(jrl.f17007a)));
                }
                if (!dt1Var.equals(at1.f1413a)) {
                    if (dt1Var.equals(bt1.f3159a)) {
                        return new xs1(lak0.c);
                    }
                    t9f.b();
                    return null;
                }
                gu1 gu1Var3 = (gu1) ((fee) n0o0Var.getValue()).c();
                if (gu1Var3 == null) {
                    return new xs1(lak0.c);
                }
                List list = (List) ((fee) gv1Var.m.getValue()).c();
                Map map = (Map) ((fee) gv1Var.n.getValue()).c();
                Set set = (Set) ((fee) gv1Var.p.getValue()).c();
                list.getClass();
                map.getClass();
                set.getClass();
                if (gu1Var3.b == z1s0.f43637a || !gu1Var3.d) {
                    z78 z78Var = gu1Var3.j;
                    if (z78Var.f43905a) {
                        iterableC = iun.f15405a;
                    } else {
                        String strR = q8a.R(z78Var.c.concat(Separators.RETURN));
                        String strR2 = q8a.R(z78Var.d);
                        if (StringsKt.u0(strR).toString().length() == 0 && strR2.length() == 0) {
                            iterableC = iun.f15405a;
                        } else {
                            String strS = z78Var.e ? q8a.S(list) : null;
                            String str = strS != null ? strS : "";
                            hrl hrlVar2 = hrl.f13536a;
                            iterableC = kotlin.collections.a.c(new pu1(new irl(z78Var.b, StringsKt.v0(strR + str + strR2).toString())));
                        }
                    }
                    return new xs1(dyb.o0(iterableC));
                }
                o98 o98Var = gu1Var3.k;
                lc00 lc00VarB = kotlin.collections.a.b();
                String strR3 = q8a.R(o98Var.f24867a);
                List<jng0> list2 = o98Var.b;
                jng0 jng0Var = (jng0) CollectionsKt.firstOrNull(list2);
                String str2 = jng0Var != null ? jng0Var.e : null;
                String strR4 = q8a.R(str2 != null ? str2 : "");
                if (strR3.length() > 0) {
                    String strS2 = q8a.S(list);
                    lc00VarB.add(new mw1(new tw1(o98Var.c, StringsKt.v0(strR3 + strS2 + strR4).toString(), new ow1(new m0x(R.drawable.ic_glyph_tournaments, null, 6)), set.contains(xr1.f41347a))));
                }
                ArrayList arrayList = new ArrayList();
                for (jng0 jng0Var2 : list2) {
                    String strR5 = q8a.R(jng0Var2.f16811a);
                    String strR6 = q8a.R(jng0Var2.e);
                    if (strR5.length() == 0 || strR6.length() == 0) {
                        xw1Var = null;
                    } else {
                        List list3 = (List) map.get(Long.valueOf(jng0Var2.b));
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                        String strS3 = q8a.S(list3);
                        xw1Var = new xw1(jng0Var2.b, jng0Var2.d, jng0Var2.c, StringsKt.v0(strR5 + strS3 + strR6).toString());
                    }
                    if (xw1Var != null) {
                        arrayList.add(xw1Var);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    xw1 xw1Var2 = (xw1) next;
                    long j = xw1Var2.f41588a;
                    wr1 wr1Var = new wr1(j);
                    Date date = xw1Var2.b;
                    Date date2 = xw1Var2.c;
                    rdj rdjVar = rdj.f30294a;
                    sdj sdjVar = sdj.UNIQUE_3;
                    lc00VarB.add(new lw1(j, new tw1(kng0.l(rdj.c(rdjVar, sdjVar, date, null, 60), " - ", rdj.c(rdjVar, sdjVar, date2, null, 60)), xw1Var2.d, new pw1(String.valueOf(i3)), set.contains(wr1Var))));
                    it = it;
                    i2 = i3;
                }
                return new ys1(dyb.o0(kotlin.collections.a.a(lc00VarB)));
            }

            /* JADX WARN: Code duplicated, block: B:358:0x09c5  */
            /* JADX WARN: Code duplicated, block: B:500:0x0c58  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                lt1 lt1Var;
                gx1 gx1Var;
                int i2;
                gu1 gu1Var2;
                lsm0 lsm0Var;
                lc00 lc00Var;
                ft1 ft1Var;
                pt0 pt0Var;
                lsm0 lsm0Var2;
                String strA;
                Collection collectionJ;
                boolean z;
                mt1 mt1Var;
                String strA2;
                pt0 pt0Var2;
                n0x n0xVar;
                pt0 pt0Var3;
                sso0 uqo0Var;
                nur murVar;
                lc00 lc00Var2;
                zu1 zu1Var;
                List list;
                List list2;
                List listSubList;
                gu1 gu1Var3;
                ArrayList arrayList;
                Iterator it;
                Object obj2;
                List list3;
                long j;
                rrl rrlVar;
                int i3;
                kt1 kt1Var;
                jt1 jt1Var;
                int i4;
                String strA3;
                Collection collectionJ2;
                Iterable iterableD0;
                int i5;
                int i6;
                int iIntValue;
                int iNextIndex;
                int i7;
                ft1 ft1Var2;
                String strL;
                String strK;
                String str4;
                n0x n0xVar2;
                String str5;
                String strA4;
                String strA5;
                Object mu1Var;
                rr1 rr1VarP;
                byte b9 = b;
                bt1 bt1Var = bt1.f3159a;
                at1 at1Var = at1.f1413a;
                arl arlVar = arl.f1351a;
                ct1 ct1Var = ct1.f4914a;
                gv1 gv1Var = this.b;
                switch (b9) {
                    case 0:
                        return p8a.d0((gu1) obj, s9s0.d, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 1:
                        n0o0 n0o0Var = gv1Var.j;
                        n0o0 n0o0Var2 = gv1Var.q;
                        dt1 dt1Var = (dt1) obj;
                        dt1Var.getClass();
                        boolean zEquals = dt1Var.equals(ct1Var);
                        bzw bzwVar = null;
                        int i8 = 6;
                        o0s o0sVar = o0s.f24443a;
                        if (zEquals) {
                            zu1 zu1Var2 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            et1 et1Var = new et1(zu1Var2.f44988a, ew1.f8498a);
                            lt1 lt1Var2 = new lt1(zu1Var2.b, zrl.f44860a);
                            gt1 gt1Var = new gt1(zu1Var2.c, arlVar);
                            ft1 ft1Var3 = new ft1(zu1Var2.d, jw1.f17229a);
                            mt1 mt1Var2 = new mt1(new ijm());
                            nt1 nt1Var = new nt1(new aml(x4d0.g0((ot0) gv1Var.a().c()), new wll(o0sVar), true));
                            kt1 kt1Var2 = new kt1(zu1Var2.e, mrl.f22278a);
                            jt1 jt1Var2 = new jt1(zu1Var2.f, jrl.f17007a);
                            ht1 ht1Var = new ht1(new ijm());
                            jdk0 jdk0Var = rh1.f30465a;
                            String str6 = (String) ((fee) n0o0Var.getValue()).c();
                            jdk0Var.getClass();
                            return dyb.g0(et1Var, lt1Var2, gt1Var, ft1Var3, mt1Var2, nt1Var, kt1Var2, jt1Var2, ht1Var, new it1(new col(new b0i(sh1.b, jdk0.e(str6)))));
                        }
                        if (!dt1Var.equals(at1Var)) {
                            if (dt1Var.equals(bt1Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var4 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var4 != null) {
                            ctf0 ctf0Var2 = gv1Var.b;
                            Locale locale2 = (Locale) gv1Var.B;
                            zu1 zu1Var3 = (zu1) ((fee) n0o0Var2.getValue()).b();
                            String str7 = (String) ((fee) gv1Var.h.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) gv1Var.i.getValue()).c()).booleanValue();
                            ot0 ot0Var = (ot0) gv1Var.a().c();
                            boolean zBooleanValue2 = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                            Set set = (Set) ((fee) gv1Var.g.getValue()).c();
                            String str8 = (String) ((fee) n0o0Var.getValue()).c();
                            ctf0Var2.getClass();
                            zu1Var3.getClass();
                            str7.getClass();
                            ot0Var.getClass();
                            set.getClass();
                            str8.getClass();
                            lc00 lc00VarB = kotlin.collections.a.b();
                            cw1 cw1Var = zu1Var3.f44988a;
                            z1s0 z1s0Var = gu1Var4.b;
                            rdj rdjVar = rdj.f30294a;
                            j88 j88Var = gu1Var4.e;
                            Set set2 = set;
                            long j2 = j88Var.e;
                            long j3 = j88Var.i;
                            zoe zoeVar = j88Var.f16071a;
                            Date dateK = rdj.k(j3);
                            Date dateK2 = rdj.k(j2);
                            Date date = new Date();
                            bw1 bw1Var = ((date.after(dateK) && date.before(dateK2)) || new Date().before(dateK)) ? bw1.f3302a : bw1.b;
                            long j4 = ((j2 - j3) * 1000) / 86400000;
                            String str9 = j88Var.g;
                            String str10 = j88Var.h;
                            int iOrdinal = cw1Var.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                o0sVar = o0sVar;
                                str = "";
                            } else {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        strA5 = eeq.R(dateK, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA5 = ctf0Var2.b.a(R.string.tournament_prize_pool_title_date_start, Arrays.copyOf(new Object[0], 0));
                                str = strA5;
                            }
                            String strS = eeq.S(dateK, ctf0Var2, cw1Var, locale2);
                            int iOrdinal2 = cw1Var.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                str2 = "";
                            } else {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        strA4 = eeq.R(dateK2, true, ctf0Var2.h(), cw1Var, locale2);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                strA4 = ctf0Var2.b.a(R.string.tournament_title_date_end, Arrays.copyOf(new Object[0], 0));
                                str2 = strA4;
                            }
                            String strS2 = eeq.S(dateK2, ctf0Var2, cw1Var, locale2);
                            Object[] objArr = {Long.valueOf(j4)};
                            lsm0 lsm0Var3 = ctf0Var2.b;
                            String strA6 = lsm0Var3.a(R.string.days_v2, Arrays.copyOf(objArr, 1));
                            String strA7 = bw1Var == bw1.b ? lsm0Var3.a(R.string.end_of_tournament, Arrays.copyOf(new Object[0], 0)) : "";
                            int iOrdinal3 = cw1Var.ordinal();
                            if (iOrdinal3 == 0) {
                                str3 = "Background Picture.webp";
                            } else if (iOrdinal3 == 1) {
                                str3 = "Picture S.webp";
                            } else {
                                if (iOrdinal3 != 2) {
                                    if (iOrdinal3 == 3) {
                                        str3 = "";
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                str3 = "Dates.webp";
                            }
                            List list4 = u0d.f34849a;
                            n0x n0xVar3 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(str3)));
                            int[] iArr = iu1.f15377a;
                            lc00VarB.add(new et1(cw1Var, new dw1(bw1Var, str9, str10, str, strS, str2, strS2, strA6, strA7, n0xVar3, new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Left.webp" : ""))), new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/".concat(iArr[cw1Var.ordinal()] == 2 ? "Background Illustration_Right.webp" : ""))))));
                            gx1 gx1Var2 = zu1Var3.b;
                            if (zoeVar.d == qpe.c) {
                                lt1Var = null;
                            } else {
                                int iOrdinal4 = gx1Var2.ordinal();
                                if (iOrdinal4 == 0) {
                                    gx1Var = gx1.f12054a;
                                } else if (iOrdinal4 == 1) {
                                    gx1Var = gx1.b;
                                } else {
                                    if (iOrdinal4 != 2) {
                                        if (iOrdinal4 == 3) {
                                            gx1Var = gx1.d;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    gx1Var = gx1.c;
                                }
                                String str11 = zoeVar.c;
                                int iOrdinal5 = gx1Var2.ordinal();
                                if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                                    i2 = R.string.day_short;
                                } else {
                                    if (iOrdinal5 != 2) {
                                        if (iOrdinal5 == 3) {
                                            i2 = R.string.day_short_2;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    i2 = R.string.days_in_case_caps;
                                }
                                String strA8 = lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0));
                                gx1 gx1Var3 = gx1.c;
                                String strA9 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.hours_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA10 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.minutes_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                String strA11 = gx1Var2 == gx1Var3 ? lsm0Var3.a(R.string.seconds_in_case_caps, Arrays.copyOf(new Object[0], 0)) : "";
                                long jCurrentTimeMillis = zoeVar.f44716a - System.currentTimeMillis();
                                lt1Var = new lt1(gx1Var, new yrl(str11, strA8, strA9, strA10, strA11, jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis));
                            }
                            if (lt1Var != null) {
                                lc00VarB.add(lt1Var);
                            }
                            gt1 gt1VarT0 = ntr.t0(gu1Var4, ctf0Var2, zu1Var3.c);
                            if (gt1VarT0 != null) {
                                lc00VarB.add(gt1VarT0);
                            }
                            gw1 gw1Var = zu1Var3.d;
                            w88 w88Var = gu1Var4.f;
                            boolean z2 = w88Var.f38710a;
                            List list5 = w88Var.c;
                            if (z2 || list5.isEmpty()) {
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = null;
                            } else {
                                String strA12 = w88Var.e;
                                if (strA12.length() == 0) {
                                    i7 = 0;
                                    strA12 = lsm0Var3.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i7 = 0;
                                }
                                String strA13 = lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[i7], i7));
                                if (list5.size() <= 5) {
                                    strA13 = null;
                                }
                                String str12 = strA13 == null ? "" : strA13;
                                boolean z3 = w88Var.b == xxb0.f41650a;
                                String strF = ctf0Var2.f(R.string.fs, new Object[0]);
                                ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                                Iterator it2 = list5.iterator();
                                int i9 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    pxb0 pxb0Var = (pxb0) next;
                                    if (z3) {
                                        String strF2 = ctf0Var2.f(R.string.place, new Object[0]);
                                        int i11 = pxb0Var.b;
                                        int i12 = pxb0Var.c;
                                        strL = i11 == i12 ? dw9.m(i11, Separators.SP, strF2) : i11 + "-" + i12 + Separators.SP + strF2;
                                    } else {
                                        ft1Var2 = ft1Var2;
                                        strL = kng0.l(ctf0Var2.f(R.string.stocks_prizes, new Object[0]), ": ", pxb0Var.h);
                                    }
                                    int i13 = pxb0Var.i;
                                    String str13 = i13 > 0 ? strF + Separators.SP + i13 : "";
                                    if (z1s0Var != z1s0.f43637a) {
                                        strK = pxb0Var.d;
                                    } else {
                                        pn40 pn40Var = pn40.f27267a;
                                        double d = pxb0Var.f;
                                        p3u0 p3u0Var = p3u0.c;
                                        strK = b1j.k("\u202a", str7, Separators.SP, pn40.l(d), "\u202c");
                                    }
                                    String str14 = strK;
                                    String str15 = pxb0Var.f27747a;
                                    int iOrdinal6 = gw1Var.ordinal();
                                    if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
                                        if (i10 == 1) {
                                            str4 = "Number_Gold.webp";
                                        } else if (i10 == 2) {
                                            str4 = "Number_Silver.webp";
                                        } else if (i10 != 3) {
                                            str4 = gw1Var == gw1.c ? "Number_Other_Star.webp" : "Number_Other.webp";
                                        } else {
                                            str4 = "Number_Bronze.webp";
                                        }
                                        List list6 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/".concat(str4)));
                                    } else {
                                        if (iOrdinal6 != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                        if (i10 == 1) {
                                            str5 = "Illustration_Gold.webp";
                                        } else if (i10 != 2) {
                                            str5 = i10 != 3 ? "Illustration_Other.webp" : "Illustration_Bronze.webp";
                                        } else {
                                            str5 = "Illustration_Silver.webp";
                                        }
                                        List list7 = u0d.f34849a;
                                        n0xVar2 = new n0x(u0d.q("/static/img/android/casino/alt_design/aggregator_tournament_prize/illustration/".concat(str5)));
                                    }
                                    arrayList2.add(new vv1(str15, n0xVar2, strL, str14, str13));
                                    i9 = i10;
                                    it2 = it3;
                                    lsm0Var3 = lsm0Var3;
                                    gu1Var4 = gu1Var4;
                                    lc00VarB = lc00VarB;
                                    ft1Var2 = ft1Var2;
                                }
                                gu1Var2 = gu1Var4;
                                lsm0Var = lsm0Var3;
                                lc00Var = lc00VarB;
                                ft1Var = new ft1(gw1Var, new iw1(dyb.o0(arrayList2), strA12, str12));
                            }
                            lc00 lc00Var3 = lc00Var;
                            if (ft1Var != null) {
                                lc00Var3.add(ft1Var);
                            }
                            gu1 gu1Var5 = gu1Var2;
                            List list8 = gu1Var5.r;
                            if (list8.isEmpty()) {
                                collectionJ = iun.f15405a;
                                lsm0Var2 = lsm0Var;
                            } else {
                                int iOrdinal7 = ot0Var.ordinal();
                                if (iOrdinal7 == 0) {
                                    pt0Var = pt0.f27539a;
                                } else if (iOrdinal7 == 1) {
                                    pt0Var = pt0.b;
                                } else if (iOrdinal7 == 2) {
                                    pt0Var = pt0.c;
                                } else if (iOrdinal7 == 3) {
                                    pt0Var = pt0.d;
                                } else {
                                    if (iOrdinal7 != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    pt0Var = pt0.e;
                                }
                                if (list8.size() == 1) {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_game, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    lsm0Var2 = lsm0Var;
                                    strA = lsm0Var2.a(R.string.tournament_top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                mt1 mt1Var3 = new mt1(new hjm(strA, null, null, null, null, null, false, null, null, false, null, null, 7166));
                                wll wllVar = new wll(o0sVar);
                                List listD0 = CollectionsKt.D0(list8, 8);
                                ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
                                Iterator it4 = listD0.iterator();
                                while (it4.hasNext()) {
                                    mlr mlrVar = (mlr) it4.next();
                                    long j5 = mlrVar.f22006a;
                                    boolean z4 = mlrVar.k;
                                    Set set3 = set2;
                                    boolean zContains = set3.contains(Long.valueOf(j5));
                                    int i14 = zBooleanValue ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                    Iterator it5 = it4;
                                    boolean z5 = mlrVar.j;
                                    if (z4) {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = lsm0Var2.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        z = z5;
                                        mt1Var = mt1Var3;
                                        strA2 = z ? lsm0Var2.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                                    }
                                    set2 = set3;
                                    long j6 = mlrVar.f22006a;
                                    String str16 = mlrVar.f;
                                    String str17 = mlrVar.e;
                                    mtr mtrVar = new mtr(zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, zContains);
                                    n0x n0xVar4 = new n0x(mlrVar.g);
                                    m0x m0xVar = new m0x(i14, bzwVar, i8);
                                    if (strA2.length() == 0) {
                                        murVar = lur.f20686a;
                                        n0xVar = n0xVar4;
                                    } else {
                                        pt0 pt0Var4 = pt0.f27539a;
                                        if ((pt0Var == pt0Var4 && z4) || (pt0Var == (pt0Var2 = pt0.c) && z4)) {
                                            n0xVar = n0xVar4;
                                        } else {
                                            n0xVar = n0xVar4;
                                            pt0 pt0Var5 = pt0.d;
                                            if (pt0Var != pt0Var5 || !z4) {
                                                if ((pt0Var == pt0Var4 && z) || ((pt0Var == pt0Var2 && z) || (pt0Var == pt0Var5 && z))) {
                                                    d4d d4dVar = d4d.PRIMARY;
                                                    uqo0Var = new eqo0();
                                                } else {
                                                    pt0 pt0Var6 = pt0.b;
                                                    uqo0Var = ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var3 = pt0.e) && z4)) ? kro0.f18776a : ((pt0Var == pt0Var6 && z) || (pt0Var == pt0Var3 && z)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                }
                                            }
                                            murVar = new mur(strA2, uqo0Var);
                                        }
                                        d4d d4dVar2 = d4d.PRIMARY;
                                        uqo0Var = new lro0();
                                        murVar = new mur(strA2, uqo0Var);
                                    }
                                    arrayList3.add(new st0(j6, str16, str17, mtrVar, n0xVar, m0xVar, null, murVar));
                                    it4 = it5;
                                    mt1Var3 = mt1Var;
                                    i8 = 6;
                                    bzwVar = null;
                                }
                                collectionJ = q3d.j(mt1Var3, new nt1(new zll(pt0Var, wllVar, arrayList3)));
                            }
                            lc00Var3.addAll(collectionJ);
                            zu1 zu1Var4 = zu1Var3;
                            l5i l5iVar = zu1Var4.e;
                            List list9 = gu1Var5.l.f38767a;
                            long j7 = gu1Var5.q;
                            List list10 = gu1Var5.k.b;
                            z1s0 z1s0Var2 = z1s0.b;
                            url urlVar = url.f36169a;
                            vrl vrlVar = vrl.f37904a;
                            if (z1s0Var == z1s0Var2) {
                                if (list10.isEmpty()) {
                                    iterableD0 = iun.f15405a;
                                } else if (list10.size() <= 3) {
                                    iterableD0 = list10;
                                } else if (plc.z(gu1Var5)) {
                                    int size = list10.size();
                                    Date date2 = new Date();
                                    ListIterator listIterator = list10.listIterator(list10.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                        } else if (((jng0) listIterator.previous()).c.before(date2)) {
                                            iNextIndex = listIterator.nextIndex();
                                        }
                                    }
                                    if (iNextIndex == -1) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(list10.get(iNextIndex));
                                        for (int i15 = iNextIndex + 1; i15 < size && arrayList4.size() < 3; i15++) {
                                            arrayList4.add(list10.get(i15));
                                        }
                                        if (arrayList4.size() < 3) {
                                            int i16 = iNextIndex - 1;
                                            for (int i17 = 3; -1 < i16 && arrayList4.size() < i17; i17 = 3) {
                                                arrayList4.add(0, list10.get(i16));
                                                i16--;
                                            }
                                            iterableD0 = arrayList4;
                                        } else {
                                            int i18 = iNextIndex >= size - 2 ? size - 3 : iNextIndex > 0 ? iNextIndex : 0;
                                            iterableD0 = list10.subList(i18, i18 + 3);
                                        }
                                    }
                                } else if (list10.size() > 3) {
                                    int iOrdinal8 = j88Var.j.ordinal();
                                    if (iOrdinal8 == 0) {
                                        iterableD0 = CollectionsKt.D0(list10, 3);
                                    } else if (iOrdinal8 == 1) {
                                        int size2 = list10.size();
                                        Date date3 = new Date();
                                        Iterator it6 = list10.iterator();
                                        int i19 = 0;
                                        while (true) {
                                            if (it6.hasNext()) {
                                                jng0 jng0Var = (jng0) it6.next();
                                                i5 = size2;
                                                Date date4 = jng0Var.d;
                                                Date date5 = jng0Var.c;
                                                if (!date3.after(date4) || !date3.before(date5)) {
                                                    i19++;
                                                    size2 = i5;
                                                }
                                            } else {
                                                i5 = size2;
                                                i19 = -1;
                                            }
                                        }
                                        Integer numValueOf = Integer.valueOf(i19);
                                        if (i19 < 0) {
                                            numValueOf = null;
                                        }
                                        if (numValueOf != null) {
                                            iIntValue = numValueOf.intValue();
                                        } else {
                                            Iterator it7 = list10.iterator();
                                            int i20 = 0;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    int i21 = i20;
                                                    if (((jng0) it7.next()).b == j7) {
                                                        i6 = i21;
                                                    } else {
                                                        i20 = i21 + 1;
                                                    }
                                                } else {
                                                    i6 = -1;
                                                }
                                            }
                                            Integer numValueOf2 = Integer.valueOf(i6);
                                            if (i6 < 0) {
                                                numValueOf2 = null;
                                            }
                                            iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                        }
                                        if (iIntValue >= i5 - 2) {
                                            iIntValue = i5 - 3;
                                        } else if (iIntValue <= 0) {
                                            iIntValue = 0;
                                        }
                                        iterableD0 = list10.subList(iIntValue, iIntValue + 3);
                                    } else {
                                        if (iOrdinal8 != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        iterableD0 = CollectionsKt.E0(3, list10);
                                    }
                                } else {
                                    iterableD0 = list10;
                                }
                                ArrayList arrayList5 = new ArrayList(r3d.q(iterableD0, 10));
                                Iterator it8 = iterableD0.iterator();
                                int i22 = 0;
                                while (it8.hasNext()) {
                                    Object next2 = it8.next();
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    jng0 jng0Var2 = (jng0) next2;
                                    Date date6 = new Date();
                                    Date date7 = jng0Var2.d;
                                    Iterator it9 = it8;
                                    Date date8 = jng0Var2.c;
                                    List list11 = list10;
                                    rdj rdjVar2 = rdj.f30294a;
                                    sdj sdjVar = sdj.UNIQUE_3;
                                    List list12 = list9;
                                    lc00 lc00Var4 = lc00Var3;
                                    zu1 zu1Var5 = zu1Var4;
                                    String strL2 = kng0.l(rdj.c(rdjVar2, sdjVar, date7, locale2, 28), " - ", rdj.c(rdjVar2, sdjVar, date8, locale2, 28));
                                    String strValueOf = String.valueOf(jng0Var2.b);
                                    long time = jng0Var2.d.getTime();
                                    gu1 gu1Var6 = gu1Var5;
                                    double dCurrentTimeMillis = (((System.currentTimeMillis() - time) / 1000) / ((date8.getTime() - time) / 1000)) * 100.0d;
                                    arrayList5.add(date6.before(date7) ? new rrl(strValueOf, strL2, jng0Var2.f16811a, urlVar) : (date6.after(date7) && date6.before(date8)) ? new rrl(strValueOf, strL2, null, new wrl((dCurrentTimeMillis <= 0.0d || dCurrentTimeMillis >= 1.0d) ? (int) dCurrentTimeMillis : 1, 100)) : new rrl(strValueOf, strL2, null, vrlVar));
                                    it8 = it9;
                                    list10 = list11;
                                    i22 = i23;
                                    list9 = list12;
                                    zu1Var4 = zu1Var5;
                                    gu1Var5 = gu1Var6;
                                    lc00Var3 = lc00Var4;
                                }
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                list = list10;
                                list2 = list9;
                                gu1Var3 = gu1Var5;
                                arrayList = arrayList5;
                            } else {
                                lc00Var2 = lc00Var3;
                                zu1Var = zu1Var4;
                                gu1 gu1Var7 = gu1Var5;
                                list = list10;
                                list2 = list9;
                                List list13 = (list2.isEmpty() || list2.size() <= 3) ? null : list2;
                                if (list13 != null) {
                                    Iterator it10 = list13.iterator();
                                    int i24 = 0;
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            i3 = -1;
                                        } else if (((fzl0) it10.next()).c == j7) {
                                            i3 = i24;
                                        } else {
                                            i24++;
                                        }
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i3);
                                    if (i3 < 0) {
                                        numValueOf3 = null;
                                    }
                                    int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                    int size3 = iIntValue2 == 0 ? 0 : iIntValue2 >= list13.size() + (-2) ? list13.size() - 3 : iIntValue2 - 1;
                                    int i25 = size3 + 3;
                                    int size4 = list13.size();
                                    if (i25 > size4) {
                                        i25 = size4;
                                    }
                                    listSubList = list13.subList(size3, i25);
                                    if (listSubList == null) {
                                        listSubList = list2;
                                    }
                                } else {
                                    listSubList = list2;
                                }
                                ArrayList arrayList6 = new ArrayList(r3d.q(listSubList, 10));
                                Iterator it11 = listSubList.iterator();
                                int i26 = 0;
                                while (it11.hasNext()) {
                                    Object next3 = it11.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fzl0 fzl0Var = (fzl0) next3;
                                    gu1 gu1Var8 = gu1Var7;
                                    Iterator it12 = gu1Var8.h.f17902a.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            Object next4 = it12.next();
                                            it = it11;
                                            if (((o2g0) next4).b) {
                                                obj2 = next4;
                                            } else {
                                                it11 = it;
                                            }
                                        } else {
                                            it = it11;
                                            obj2 = null;
                                        }
                                    }
                                    o2g0 o2g0Var = (o2g0) obj2;
                                    int i28 = o2g0Var != null ? o2g0Var.d : 0;
                                    int i29 = fzl0Var.b;
                                    boolean z6 = i28 >= i29;
                                    int i30 = (int) fzl0Var.c;
                                    int i31 = (int) j7;
                                    fzl0 fzl0Var2 = (fzl0) CollectionsKt.W(i26 - 1, listSubList);
                                    int i32 = fzl0Var2 != null ? fzl0Var2.b : 0;
                                    if (i30 != i31 || !gu1Var8.c) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = i31 > i30 ? new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar) : new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, urlVar);
                                    } else if (z6) {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), null, vrlVar);
                                    } else {
                                        list3 = listSubList;
                                        j = j7;
                                        rrlVar = new rrl(String.valueOf(i30), lsm0Var2.a(R.string.points_count_v2, Arrays.copyOf(new Object[]{String.valueOf(i29)}, 1)), lsm0Var2.a(R.string.tournament_stage_points_left_2_v2, Arrays.copyOf(new Object[]{String.valueOf(i29 - i28)}, 1)), new wrl(i28 - i32, i29 - i32));
                                    }
                                    arrayList6.add(rrlVar);
                                    it11 = it;
                                    i26 = i27;
                                    gu1Var7 = gu1Var8;
                                    listSubList = list3;
                                    j7 = j;
                                }
                                gu1Var3 = gu1Var7;
                                arrayList = arrayList6;
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                String strA14 = lsm0Var2.a(R.string.tournament_stages, Arrays.copyOf(new Object[0], 0));
                                String strA15 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                if (z1s0Var != z1s0.b ? list2.size() <= 3 : list.size() <= 3) {
                                    strA15 = null;
                                }
                                if (strA15 == null) {
                                    strA15 = "";
                                }
                                kt1Var = new kt1(l5iVar, new lrl(dyb.o0(arrayList), strA14, strA15));
                            } else {
                                kt1Var = null;
                            }
                            lc00 lc00Var5 = lc00Var2;
                            if (kt1Var != null) {
                                lc00Var5.add(kt1Var);
                            }
                            hrl hrlVar = zu1Var.f;
                            s98 s98Var = gu1Var3.i;
                            if (s98Var.f31841a.isEmpty()) {
                                jt1Var = null;
                            } else {
                                String strA16 = s98Var.b;
                                if (strA16.length() == 0) {
                                    strA16 = lsm0Var2.a(R.string.rules_title, Arrays.copyOf(new Object[0], 0));
                                }
                                jt1Var = new jt1(hrlVar, new irl(strA16, CollectionsKt.b0(s98Var.f31841a, Separators.RETURN, null, null, null, 62)));
                            }
                            if (jt1Var != null) {
                                lc00Var5.add(jt1Var);
                            }
                            sh1 sh1Var = sh1.b;
                            rh1.f30465a.getClass();
                            b0i b0iVar = new b0i(sh1Var, jdk0.e(str8));
                            List list14 = gu1Var3.g;
                            if (list14.isEmpty()) {
                                collectionJ2 = iun.f15405a;
                            } else {
                                if (list14.size() > 8) {
                                    i4 = 0;
                                    strA3 = lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    i4 = 0;
                                    strA3 = null;
                                }
                                ht1 ht1Var2 = new ht1(new hjm(lsm0Var2.a(R.string.providers, Arrays.copyOf(new Object[i4], i4)), null, null, null, null, null, false, null, null, false, strA3 != null ? new ue9(strA3) : null, null, 7166));
                                List<izb0> listD1 = CollectionsKt.D0(list14, 8);
                                ArrayList arrayList7 = new ArrayList(r3d.q(listD1, 10));
                                for (izb0 izb0Var : listD1) {
                                    arrayList7.add(new eol(String.valueOf(izb0Var.c), new n0x(izb0Var.f15628a), false, izb0Var.b, "-", lsm0Var2.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), null));
                                }
                                collectionJ2 = q3d.j(ht1Var2, new it1(new bol(dyb.o0(arrayList7), b0iVar)));
                            }
                            lc00Var5.addAll(collectionJ2);
                            a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00Var5));
                            if (a4xVarO0 != null) {
                                return a4xVarO0;
                            }
                        }
                        return lak0.c;
                    case 2:
                        return a(obj);
                    case 3:
                        n0o0 n0o0Var3 = gv1Var.q;
                        dt1 dt1Var2 = (dt1) obj;
                        dt1Var2.getClass();
                        if (dt1Var2.equals(ct1Var)) {
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            lc00VarB2.add(new ju1(((zu1) ((fee) n0o0Var3.getValue()).b()).c, arlVar));
                            for (int i33 = 0; i33 < 10; i33++) {
                                lc00VarB2.add(new ku1(ur1.f36143a));
                            }
                            return new mu1(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                        }
                        if (!dt1Var2.equals(at1Var)) {
                            if (dt1Var2.equals(bt1Var)) {
                                return new mu1(lak0.c);
                            }
                            t9f.b();
                            return null;
                        }
                        gu1 gu1Var9 = (gu1) ((fee) gv1Var.e.getValue()).c();
                        if (gu1Var9 == null) {
                            return new mu1(lak0.c);
                        }
                        ctf0 ctf0Var3 = gv1Var.b;
                        zu1 zu1Var6 = (zu1) ((fee) n0o0Var3.getValue()).b();
                        int iIntValue3 = ((Number) ((fee) gv1Var.r.getValue()).c()).intValue();
                        ctf0Var3.getClass();
                        zu1Var6.getClass();
                        gt1 gt1VarT1 = ntr.t0(gu1Var9, ctf0Var3, zu1Var6.c);
                        ju1 ju1Var = gt1VarT1 != null ? new ju1(gt1VarT1.f11859a, gt1VarT1.b) : null;
                        List<o2g0> list15 = gu1Var9.h.f17902a;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list15, 10));
                        for (o2g0 o2g0Var2 : list15) {
                            o2g0Var2.getClass();
                            String str18 = o2g0Var2.f24529a;
                            Long lT0 = StringsKt.t0(str18);
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String strA17 = ctf0Var3.b.a(R.string.tournament_points_v2, Arrays.copyOf(new Object[]{String.valueOf(o2g0Var2.d)}, 1));
                            boolean z7 = o2g0Var2.b;
                            int i34 = o2g0Var2.c;
                            switch (i34) {
                                case 1:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_one);
                                    break;
                                case 2:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_two);
                                    break;
                                case 3:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_three);
                                    break;
                                case 4:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_four);
                                    break;
                                case 5:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_five);
                                    break;
                                case 6:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_six);
                                    break;
                                case 7:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_seven);
                                    break;
                                case 8:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_eight);
                                    break;
                                case 9:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_nine);
                                    break;
                                case 10:
                                    rr1VarP = rq8.P(R.drawable.ic_tournament_place_ten);
                                    break;
                                default:
                                    rr1VarP = new qr1(String.valueOf(i34), z7 ? czr0.b : czr0.f5237a);
                                    break;
                            }
                            arrayList8.add(new ku1(new tr1(jLongValue, strA17, str18, z7, false, rr1VarP)));
                        }
                        if (arrayList8.isEmpty()) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.i;
                            xuzVar.getClass();
                            mu1Var = new nu1(new mdm(xuz.a(pb10Var, iIntValue3), ju1Var == null ? pdm.f26814a : pdm.c, null, 0, 0, R.string.tournament_result_not_available, 0, 0, 0L, 0L, 988), ju1Var);
                        } else {
                            mu1Var = new mu1(dyb.o0(CollectionsKt.q0(q3d.k(ju1Var), arrayList8)));
                        }
                        return mu1Var;
                    case 4:
                        return b(obj);
                    case 5:
                        return p8a.d0((gu1) obj, s9s0.f31863a, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    case 6:
                        return p8a.d0((gu1) obj, s9s0.b, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                    default:
                        return p8a.d0((gu1) obj, s9s0.c, ((Boolean) ((fee) gv1Var.o.getValue()).c()).booleanValue(), gv1Var.b);
                }
            }
        }, (byte) 20));
        this.C = maz.b(new yw9(Integer.valueOf(i), new dj1((byte) 7), (byte) 20));
    }

    public fee a() {
        return (fee) this.k.getValue();
    }

    public fee b() {
        return (fee) this.c.getValue();
    }

    public fee c() {
        return (fee) this.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0562  */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        dt1 dt1Var;
        Object cv1Var;
        byte b = this.f11955a;
        n0o0 n0o0Var = this.A;
        n0o0 n0o0Var2 = this.z;
        n0o0 n0o0Var3 = this.x;
        n0o0 n0o0Var4 = this.w;
        n0o0 n0o0Var5 = this.v;
        n0o0 n0o0Var6 = this.u;
        n0o0 n0o0Var7 = this.s;
        n0o0 n0o0Var8 = this.r;
        n0o0 n0o0Var9 = this.q;
        n0o0 n0o0Var10 = this.p;
        n0o0 n0o0Var11 = this.m;
        n0o0 n0o0Var12 = this.l;
        n0o0 n0o0Var13 = this.j;
        n0o0 n0o0Var14 = this.e;
        n0o0 n0o0Var15 = this.o;
        n0o0 n0o0Var16 = this.i;
        n0o0 n0o0Var17 = this.n;
        n0o0 n0o0Var18 = this.h;
        n0o0 n0o0Var19 = this.g;
        n0o0 n0o0Var20 = this.f;
        n0o0 n0o0Var21 = this.t;
        switch (b) {
            case 0:
                yu1 yu1Var = (yu1) obj;
                yu1Var.getClass();
                fee feeVar = (fee) this.c.getValue();
                bv1 bv1Var = yu1Var.c;
                dt1 dt1Var2 = yu1Var.h;
                dt1 dt1Var3 = yu1Var.i;
                dt1 dt1Var4 = yu1Var.j;
                dt1 dt1Var5 = yu1Var.k;
                feeVar.d(bv1Var);
                fee feeVar2 = (fee) this.d.getValue();
                qu1 qu1Var = yu1Var.d;
                feeVar2.d(qu1Var);
                fee feeVar3 = (fee) n0o0Var14.getValue();
                gu1 gu1Var = yu1Var.p;
                feeVar3.d(gu1Var);
                ((fee) n0o0Var20.getValue()).d(Boolean.valueOf(yu1Var.e));
                ((fee) n0o0Var19.getValue()).d(yu1Var.x);
                ((fee) n0o0Var18.getValue()).d(yu1Var.u);
                ((fee) n0o0Var16.getValue()).d(Boolean.valueOf(yu1Var.m));
                ((fee) n0o0Var13.getValue()).d(yu1Var.n);
                a().d(yu1Var.o);
                ((fee) n0o0Var12.getValue()).d(yu1Var.q);
                ((fee) n0o0Var11.getValue()).d(yu1Var.v);
                ((fee) n0o0Var17.getValue()).d(yu1Var.w);
                ((fee) n0o0Var15.getValue()).d(Boolean.valueOf(yu1Var.t));
                ((fee) n0o0Var10.getValue()).d(yu1Var.y);
                fee feeVar4 = (fee) n0o0Var8.getValue();
                int i = yu1Var.l;
                feeVar4.d(Integer.valueOf(i));
                ((fee) n0o0Var9.getValue()).d(qu1Var);
                fee feeVar5 = (fee) n0o0Var7.getValue();
                feeVar5.getClass();
                pz40 pz40VarA = feeVar5.a();
                pz40VarA.setValue(gu1Var);
                n0o0 n0o0Var22 = (n0o0) this.C;
                ((fee) n0o0Var22.getValue()).d(Integer.valueOf(i));
                int iOrdinal = bv1Var.ordinal();
                if (iOrdinal == 0) {
                    dt1Var = dt1Var2;
                } else if (iOrdinal == 1) {
                    dt1Var = dt1Var3;
                } else if (iOrdinal == 2) {
                    dt1Var = dt1Var4;
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    dt1Var = dt1Var5;
                }
                if (dt1Var.equals(bt1.f3159a)) {
                    cv1Var = new dv1(qu1Var, yu1Var.c, yu1Var.f, (fu1) ((fee) n0o0Var7.getValue()).b(), (mdm) ((fee) n0o0Var22.getValue()).b());
                } else {
                    fee feeVar6 = (fee) n0o0Var21.getValue();
                    feeVar6.getClass();
                    pz40 pz40VarA2 = feeVar6.a();
                    ((dt1) feeVar6.a().getValue()).getClass();
                    pz40VarA2.setValue(dt1Var2);
                    fee feeVar7 = (fee) n0o0Var6.getValue();
                    feeVar7.getClass();
                    pz40 pz40VarA3 = feeVar7.a();
                    ((dt1) feeVar7.a().getValue()).getClass();
                    pz40VarA3.setValue(dt1Var3);
                    fee feeVar8 = (fee) n0o0Var5.getValue();
                    feeVar8.getClass();
                    pz40 pz40VarA4 = feeVar8.a();
                    ((dt1) feeVar8.a().getValue()).getClass();
                    pz40VarA4.setValue(dt1Var4);
                    fee feeVar9 = (fee) n0o0Var4.getValue();
                    feeVar9.getClass();
                    pz40 pz40VarA5 = feeVar9.a();
                    ((dt1) feeVar9.a().getValue()).getClass();
                    pz40VarA5.setValue(dt1Var5);
                    fee feeVar10 = (fee) n0o0Var3.getValue();
                    feeVar10.getClass();
                    pz40 pz40VarA6 = feeVar10.a();
                    pz40VarA6.setValue(gu1Var);
                    n0o0 n0o0Var23 = this.y;
                    fee feeVar11 = (fee) n0o0Var23.getValue();
                    feeVar11.getClass();
                    pz40 pz40VarA7 = feeVar11.a();
                    pz40VarA7.setValue(gu1Var);
                    fee feeVar12 = (fee) n0o0Var2.getValue();
                    feeVar12.getClass();
                    pz40 pz40VarA8 = feeVar12.a();
                    pz40VarA8.setValue(gu1Var);
                    fee feeVar13 = (fee) n0o0Var.getValue();
                    feeVar13.getClass();
                    pz40 pz40VarA9 = feeVar13.a();
                    pz40VarA9.setValue(gu1Var);
                    int iOrdinal2 = bv1Var.ordinal();
                    if (iOrdinal2 == 0) {
                        cv1Var = new cv1(qu1Var, yu1Var.c, yu1Var.f, (fu1) ((fee) n0o0Var7.getValue()).b(), (a4x) ((fee) n0o0Var21.getValue()).b(), (bml) ((fee) n0o0Var6.getValue()).b(), (ou1) ((fee) n0o0Var5.getValue()).b(), (zs1) ((fee) n0o0Var4.getValue()).b(), (mtl) ((fee) n0o0Var3.getValue()).b(), (mtl) ((fee) n0o0Var23.getValue()).b(), (mtl) ((fee) n0o0Var2.getValue()).b(), (mtl) ((fee) n0o0Var.getValue()).b());
                    } else {
                        if (iOrdinal2 == 1) {
                            bml bmlVar = (bml) ((fee) n0o0Var6.getValue()).b();
                            if (bmlVar != null) {
                                if (!(bmlVar instanceof aml)) {
                                    if (bmlVar instanceof zll) {
                                        if (((zll) bmlVar).c.isEmpty()) {
                                            cv1Var = new dv1(qu1Var, yu1Var.c, yu1Var.f, (fu1) ((fee) n0o0Var7.getValue()).b(), (mdm) ((fee) n0o0Var22.getValue()).b());
                                        }
                                    }
                                }
                                cv1Var = new cv1(qu1Var, yu1Var.c, yu1Var.f, (fu1) ((fee) n0o0Var7.getValue()).b(), (a4x) ((fee) n0o0Var21.getValue()).b(), (bml) ((fee) n0o0Var6.getValue()).b(), (ou1) ((fee) n0o0Var5.getValue()).b(), (zs1) ((fee) n0o0Var4.getValue()).b(), (mtl) ((fee) n0o0Var3.getValue()).b(), (mtl) ((fee) n0o0Var23.getValue()).b(), (mtl) ((fee) n0o0Var2.getValue()).b(), (mtl) ((fee) n0o0Var.getValue()).b());
                            }
                            t9f.b();
                            return null;
                        }
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            if (!dt1Var5.equals(ct1.f4914a)) {
                                zs1 zs1Var = (zs1) ((fee) n0o0Var4.getValue()).b();
                                if (zs1Var != null) {
                                    if (zs1Var instanceof xs1) {
                                        if (((xs1) zs1Var).f41392a.isEmpty()) {
                                            cv1Var = new dv1(qu1Var, yu1Var.c, yu1Var.f, (fu1) ((fee) n0o0Var7.getValue()).b(), (mdm) ((fee) n0o0Var22.getValue()).b());
                                        }
                                    } else if (zs1Var instanceof ys1) {
                                        if (((ys1) zs1Var).f43146a.isEmpty()) {
                                            cv1Var = new dv1(qu1Var, yu1Var.c, yu1Var.f, (fu1) ((fee) n0o0Var7.getValue()).b(), (mdm) ((fee) n0o0Var22.getValue()).b());
                                        }
                                    }
                                }
                                t9f.b();
                                return null;
                            }
                        }
                        cv1Var = new cv1(qu1Var, yu1Var.c, yu1Var.f, (fu1) ((fee) n0o0Var7.getValue()).b(), (a4x) ((fee) n0o0Var21.getValue()).b(), (bml) ((fee) n0o0Var6.getValue()).b(), (ou1) ((fee) n0o0Var5.getValue()).b(), (zs1) ((fee) n0o0Var4.getValue()).b(), (mtl) ((fee) n0o0Var3.getValue()).b(), (mtl) ((fee) n0o0Var23.getValue()).b(), (mtl) ((fee) n0o0Var2.getValue()).b(), (mtl) ((fee) n0o0Var.getValue()).b());
                    }
                }
                return cv1Var;
            case 1:
                wmf wmfVar = (wmf) obj;
                wmfVar.getClass();
                n0o0 n0o0Var24 = this.c;
                fee feeVar14 = (fee) n0o0Var24.getValue();
                bqr bqrVar = wmfVar.c;
                feeVar14.d(bqrVar);
                fee feeVarC = c();
                jlr jlrVar = wmfVar.b;
                feeVarC.d(jlrVar);
                ((fee) n0o0Var7.getValue()).d(wmfVar.f);
                ((fee) n0o0Var21.getValue()).d(wmfVar.w);
                ((fee) n0o0Var16.getValue()).d(Boolean.valueOf(wmfVar.g));
                ((fee) n0o0Var19.getValue()).d(Boolean.valueOf(wmfVar.d));
                ((fee) n0o0Var18.getValue()).d(Boolean.valueOf(wmfVar.e));
                ((fee) n0o0Var20.getValue()).d(Boolean.valueOf(jlrVar instanceof xkr));
                ((fee) n0o0Var13.getValue()).d(wmfVar.h);
                ((fee) n0o0Var17.getValue()).d(wmfVar.v);
                ((fee) n0o0Var24.getValue()).d(bqrVar);
                fee feeVar15 = (fee) this.k.getValue();
                ypl0 ypl0Var = wmfVar.i;
                feeVar15.d(ypl0Var);
                ((fee) n0o0Var14.getValue()).d(ypl0Var.b);
                ((fee) n0o0Var12.getValue()).d(Boolean.valueOf(wmfVar.k));
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(wmfVar.l));
                ((fee) n0o0Var15.getValue()).d(wmfVar.n);
                ((fee) n0o0Var8.getValue()).d(wmfVar.u);
                ((fee) n0o0Var9.getValue()).d(Boolean.valueOf(wmfVar.p));
                ((fee) n0o0Var10.getValue()).d(wmfVar.o);
                return new knf(((fee) n0o0Var6.getValue()).e, ((fee) n0o0Var5.getValue()).e, ((fee) n0o0Var4.getValue()).e, ((fee) n0o0Var3.getValue()).e, ((fee) n0o0Var2.getValue()).e, ((fee) n0o0Var.getValue()).e, ((fee) n0o0Var9.getValue()).d);
            default:
                f9l f9lVar = (f9l) obj;
                f9lVar.getClass();
                fee feeVarB = b();
                jlr jlrVar2 = f9lVar.c;
                feeVarB.d(jlrVar2);
                ((fee) this.d.getValue()).d(f9lVar.d);
                ((fee) n0o0Var21.getValue()).d(f9lVar.y);
                ((fee) n0o0Var20.getValue()).d(Boolean.valueOf(f9lVar.h));
                ((fee) n0o0Var19.getValue()).d(Boolean.valueOf(f9lVar.n));
                ((fee) n0o0Var18.getValue()).d(Boolean.valueOf(f9lVar.o));
                ((fee) n0o0Var17.getValue()).d(Boolean.valueOf(jlrVar2 instanceof xkr));
                ((fee) n0o0Var16.getValue()).d(f9lVar.p);
                ((fee) this.k.getValue()).d(f9lVar.v);
                ((fee) n0o0Var15.getValue()).d(f9lVar.f);
                fee feeVar16 = (fee) n0o0Var14.getValue();
                ypl0 ypl0Var2 = f9lVar.e;
                feeVar16.d(ypl0Var2);
                ((fee) n0o0Var13.getValue()).d(ypl0Var2.b);
                ((fee) n0o0Var12.getValue()).d(Boolean.valueOf(f9lVar.s));
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(f9lVar.u));
                ((fee) n0o0Var10.getValue()).d(f9lVar.l);
                ((fee) n0o0Var9.getValue()).d(f9lVar.j);
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(f9lVar.i));
                ((fee) n0o0Var7.getValue()).d(f9lVar.k);
                return new val(((fee) n0o0Var6.getValue()).e, ((fee) n0o0Var5.getValue()).e, ((fee) n0o0Var4.getValue()).e, ((fee) n0o0Var3.getValue()).e, ((fee) n0o0Var2.getValue()).e, ((fee) n0o0Var.getValue()).e, ((fee) n0o0Var8.getValue()).d);
        }
    }

    public gv1(f9l f9lVar, ctf0 ctf0Var, g2v g2vVar) {
        final byte b = 2;
        ctf0Var.getClass();
        this.B = f9lVar;
        this.b = ctf0Var;
        this.C = g2vVar;
        jlr jlrVar = f9lVar.c;
        this.c = bkb.H(jlrVar);
        this.d = bkb.H(f9lVar.d);
        this.e = bkb.H(f9lVar.e);
        this.f = bkb.H(Boolean.valueOf(f9lVar.h));
        this.g = bkb.H(Boolean.valueOf(f9lVar.n));
        this.h = bkb.H(Boolean.valueOf(f9lVar.o));
        this.i = bkb.H(f9lVar.p);
        this.j = bkb.H("");
        this.k = bkb.H(f9lVar.v);
        this.l = bkb.H(Boolean.valueOf(f9lVar.s));
        this.m = bkb.H(Boolean.valueOf(f9lVar.u));
        this.n = bkb.H(Boolean.valueOf(jlrVar instanceof xkr));
        n0o0 n0o0VarH = bkb.H(f9lVar.f);
        this.o = n0o0VarH;
        this.p = bkb.H(f9lVar.l);
        this.q = bkb.H(f9lVar.j);
        this.r = bkb.H(Boolean.valueOf(f9lVar.i));
        this.s = bkb.H(f9lVar.k);
        n0o0 n0o0VarH2 = bkb.H(f9lVar.y);
        this.t = n0o0VarH2;
        this.u = maz.b(new yw9((fee) n0o0VarH.getValue(), new n2l((byte) 22), (byte) 20));
        final byte b2 = 0;
        this.v = maz.b(new yw9(b(), new Function1(this) { // from class: a.wal
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:109:0x0323  */
            /* JADX WARN: Code duplicated, block: B:115:0x0351  */
            /* JADX WARN: Code duplicated, block: B:117:0x0359  */
            /* JADX WARN: Code duplicated, block: B:119:0x0363  */
            /* JADX WARN: Code duplicated, block: B:120:0x0366  */
            /* JADX WARN: Code duplicated, block: B:123:0x0388  */
            /* JADX WARN: Code duplicated, block: B:125:0x038b  */
            /* JADX WARN: Code duplicated, block: B:127:0x038e  */
            /* JADX WARN: Code duplicated, block: B:129:0x0391  */
            /* JADX WARN: Code duplicated, block: B:131:0x0394  */
            /* JADX WARN: Code duplicated, block: B:133:0x0399  */
            /* JADX WARN: Code duplicated, block: B:134:0x03a2  */
            /* JADX WARN: Code duplicated, block: B:135:0x03ab  */
            /* JADX WARN: Code duplicated, block: B:136:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:137:0x03bd  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c8  */
            /* JADX WARN: Code duplicated, block: B:141:0x03ce  */
            /* JADX WARN: Code duplicated, block: B:145:0x03ee A[LOOP:9: B:143:0x03e8->B:145:0x03ee, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:174:0x04cc  */
            /* JADX WARN: Code duplicated, block: B:178:0x04f5  */
            /* JADX WARN: Code duplicated, block: B:184:0x050a  */
            /* JADX WARN: Code duplicated, block: B:376:0x0b65  */
            /* JADX WARN: Code duplicated, block: B:396:0x0bfa  */
            /* JADX WARN: Code duplicated, block: B:468:0x0ddc  */
            /* JADX WARN: Code duplicated, block: B:493:0x0e64  */
            /* JADX WARN: Code duplicated, block: B:533:0x02d5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:534:0x0413 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:550:0x0332 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:552:0x031d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:559:0x0505 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:81:0x0244  */
            /* JADX WARN: Code duplicated, block: B:84:0x0250  */
            /* JADX WARN: Code duplicated, block: B:85:0x0258  */
            /* JADX WARN: Code duplicated, block: B:88:0x025d  */
            /* JADX WARN: Code duplicated, block: B:92:0x0289  */
            /* JADX WARN: Code duplicated, block: B:94:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:95:0x02a3  */
            /* JADX WARN: Code duplicated, block: B:97:0x02a7  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v19, types: [a.lak0] */
            /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22 */
            /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v27 */
            /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r4v35, types: [java.util.ArrayList] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v65 java.lang.Object, still in use, count: 2, list:
                  (r4v65 java.lang.Object) from 0x04c8: PHI (r4 I:??) = (r4v59 java.lang.Object), (r4v65 java.lang.Object) binds: [B:171:0x04c7, B:557:0x04c8] A[DONT_GENERATE, DONT_INLINE]
                  (r4v65 java.lang.Object) from 0x04bc: CHECK_CAST (a.wmg) (r4v65 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            private final java.lang.Object a(java.lang.Object r53) {
                /*
                    Method dump skipped, instruction units count: 3890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.wal.a(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x9l x9lVar;
                byte b3 = b2;
                la30 la30VarP = null;
                gv1 gv1Var = this.b;
                switch (b3) {
                    case 0:
                        ((fee) obj).getClass();
                        return new avs(((fee) gv1Var.j.getValue()).d, ((fee) gv1Var.n.getValue()).d, ((fee) gv1Var.g.getValue()).d, ((fee) gv1Var.h.getValue()).d);
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m9s m9sVarC = d5c.C((jlr) feeVar.c());
                        ctf0 ctf0Var2 = gv1Var.b;
                        f9l f9lVar2 = (f9l) gv1Var.B;
                        if (m9sVarC != null && (x9lVar = (x9l) ((fee) gv1Var.d.getValue()).c()) != null) {
                            la30VarP = zjb.P(x9lVar, m9sVarC);
                        }
                        return hkb.P(m9sVarC, false, false, ctf0Var2, la30VarP, ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue(), (List) ((fee) gv1Var.i.getValue()).c(), f9lVar2.z, true, ((ypl0) ((fee) gv1Var.e.getValue()).c()).c.f19909a, f9lVar2.f9159a.g);
                    case 2:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        jlr jlrVar2 = (jlr) feeVar2.c();
                        boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                        f9l f9lVar3 = (f9l) gv1Var.B;
                        return ulb.j0(jlrVar2, zBooleanValue, f9lVar3.q.J, ((Boolean) ((fee) gv1Var.l.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv1Var.m.getValue()).c()).booleanValue(), f9lVar3.t, (yws) ((fee) gv1Var.k.getValue()).c());
                    case 3:
                        return a(obj);
                    case 4:
                        n0o0 n0o0Var = gv1Var.y;
                        g2v g2vVar2 = (g2v) gv1Var.C;
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        jlr jlrVar3 = (jlr) feeVar3.c();
                        if (jlrVar3 != null) {
                            if (jlrVar3 instanceof xkr) {
                                if (((fee) gv1Var.d.getValue()).c() == null) {
                                    return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                                }
                                zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                                zbkVar.getClass();
                                return new pss(zbkVar);
                            }
                            if (jlrVar3 instanceof alr) {
                                return new lss(((da10) ((fee) gv1Var.s.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                            }
                            if (jlrVar3 instanceof blr) {
                                return new mss(new pdq(g2v.b(g2vVar2, ozb.K(1L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar3).c, R.string.transition_to_live));
                            }
                            if (jlrVar3 instanceof clr) {
                                zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                                zbkVar2.getClass();
                                return new pss(zbkVar2);
                            }
                            if ((jlrVar3 instanceof dlr) || (jlrVar3 instanceof ilr)) {
                                return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                            }
                            if (jlrVar3 instanceof elr) {
                                return new oss(g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                            }
                        }
                        t9f.b();
                        return null;
                    default:
                        ((fee) obj).getClass();
                        return pzw.W((szj0) ((fee) gv1Var.t.getValue()).c(), ((f9l) gv1Var.B).q.K1, gv1Var.b);
                }
            }
        }, (byte) 20));
        final byte b3 = 1;
        this.w = maz.b(new yw9(b(), new Function1(this) { // from class: a.wal
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:109:0x0323  */
            /* JADX WARN: Code duplicated, block: B:115:0x0351  */
            /* JADX WARN: Code duplicated, block: B:117:0x0359  */
            /* JADX WARN: Code duplicated, block: B:119:0x0363  */
            /* JADX WARN: Code duplicated, block: B:120:0x0366  */
            /* JADX WARN: Code duplicated, block: B:123:0x0388  */
            /* JADX WARN: Code duplicated, block: B:125:0x038b  */
            /* JADX WARN: Code duplicated, block: B:127:0x038e  */
            /* JADX WARN: Code duplicated, block: B:129:0x0391  */
            /* JADX WARN: Code duplicated, block: B:131:0x0394  */
            /* JADX WARN: Code duplicated, block: B:133:0x0399  */
            /* JADX WARN: Code duplicated, block: B:134:0x03a2  */
            /* JADX WARN: Code duplicated, block: B:135:0x03ab  */
            /* JADX WARN: Code duplicated, block: B:136:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:137:0x03bd  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c8  */
            /* JADX WARN: Code duplicated, block: B:141:0x03ce  */
            /* JADX WARN: Code duplicated, block: B:145:0x03ee A[LOOP:9: B:143:0x03e8->B:145:0x03ee, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:174:0x04cc  */
            /* JADX WARN: Code duplicated, block: B:178:0x04f5  */
            /* JADX WARN: Code duplicated, block: B:184:0x050a  */
            /* JADX WARN: Code duplicated, block: B:376:0x0b65  */
            /* JADX WARN: Code duplicated, block: B:396:0x0bfa  */
            /* JADX WARN: Code duplicated, block: B:468:0x0ddc  */
            /* JADX WARN: Code duplicated, block: B:493:0x0e64  */
            /* JADX WARN: Code duplicated, block: B:533:0x02d5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:534:0x0413 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:550:0x0332 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:552:0x031d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:559:0x0505 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:81:0x0244  */
            /* JADX WARN: Code duplicated, block: B:84:0x0250  */
            /* JADX WARN: Code duplicated, block: B:85:0x0258  */
            /* JADX WARN: Code duplicated, block: B:88:0x025d  */
            /* JADX WARN: Code duplicated, block: B:92:0x0289  */
            /* JADX WARN: Code duplicated, block: B:94:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:95:0x02a3  */
            /* JADX WARN: Code duplicated, block: B:97:0x02a7  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v19, types: [a.lak0] */
            /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22 */
            /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v27 */
            /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r4v35, types: [java.util.ArrayList] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v65 java.lang.Object, still in use, count: 2, list:
                  (r4v65 java.lang.Object) from 0x04c8: PHI (r4 I:??) = (r4v59 java.lang.Object), (r4v65 java.lang.Object) binds: [B:171:0x04c7, B:557:0x04c8] A[DONT_GENERATE, DONT_INLINE]
                  (r4v65 java.lang.Object) from 0x04bc: CHECK_CAST (a.wmg) (r4v65 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            private final java.lang.Object a(java.lang.Object r53) {
                /*
                    Method dump skipped, instruction units count: 3890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.wal.a(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x9l x9lVar;
                byte b4 = b3;
                la30 la30VarP = null;
                gv1 gv1Var = this.b;
                switch (b4) {
                    case 0:
                        ((fee) obj).getClass();
                        return new avs(((fee) gv1Var.j.getValue()).d, ((fee) gv1Var.n.getValue()).d, ((fee) gv1Var.g.getValue()).d, ((fee) gv1Var.h.getValue()).d);
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m9s m9sVarC = d5c.C((jlr) feeVar.c());
                        ctf0 ctf0Var2 = gv1Var.b;
                        f9l f9lVar2 = (f9l) gv1Var.B;
                        if (m9sVarC != null && (x9lVar = (x9l) ((fee) gv1Var.d.getValue()).c()) != null) {
                            la30VarP = zjb.P(x9lVar, m9sVarC);
                        }
                        return hkb.P(m9sVarC, false, false, ctf0Var2, la30VarP, ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue(), (List) ((fee) gv1Var.i.getValue()).c(), f9lVar2.z, true, ((ypl0) ((fee) gv1Var.e.getValue()).c()).c.f19909a, f9lVar2.f9159a.g);
                    case 2:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        jlr jlrVar2 = (jlr) feeVar2.c();
                        boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                        f9l f9lVar3 = (f9l) gv1Var.B;
                        return ulb.j0(jlrVar2, zBooleanValue, f9lVar3.q.J, ((Boolean) ((fee) gv1Var.l.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv1Var.m.getValue()).c()).booleanValue(), f9lVar3.t, (yws) ((fee) gv1Var.k.getValue()).c());
                    case 3:
                        return a(obj);
                    case 4:
                        n0o0 n0o0Var = gv1Var.y;
                        g2v g2vVar2 = (g2v) gv1Var.C;
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        jlr jlrVar3 = (jlr) feeVar3.c();
                        if (jlrVar3 != null) {
                            if (jlrVar3 instanceof xkr) {
                                if (((fee) gv1Var.d.getValue()).c() == null) {
                                    return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                                }
                                zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                                zbkVar.getClass();
                                return new pss(zbkVar);
                            }
                            if (jlrVar3 instanceof alr) {
                                return new lss(((da10) ((fee) gv1Var.s.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                            }
                            if (jlrVar3 instanceof blr) {
                                return new mss(new pdq(g2v.b(g2vVar2, ozb.K(1L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar3).c, R.string.transition_to_live));
                            }
                            if (jlrVar3 instanceof clr) {
                                zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                                zbkVar2.getClass();
                                return new pss(zbkVar2);
                            }
                            if ((jlrVar3 instanceof dlr) || (jlrVar3 instanceof ilr)) {
                                return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                            }
                            if (jlrVar3 instanceof elr) {
                                return new oss(g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                            }
                        }
                        t9f.b();
                        return null;
                    default:
                        ((fee) obj).getClass();
                        return pzw.W((szj0) ((fee) gv1Var.t.getValue()).c(), ((f9l) gv1Var.B).q.K1, gv1Var.b);
                }
            }
        }, (byte) 20));
        this.x = maz.b(new yw9(b(), new Function1(this) { // from class: a.wal
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:109:0x0323  */
            /* JADX WARN: Code duplicated, block: B:115:0x0351  */
            /* JADX WARN: Code duplicated, block: B:117:0x0359  */
            /* JADX WARN: Code duplicated, block: B:119:0x0363  */
            /* JADX WARN: Code duplicated, block: B:120:0x0366  */
            /* JADX WARN: Code duplicated, block: B:123:0x0388  */
            /* JADX WARN: Code duplicated, block: B:125:0x038b  */
            /* JADX WARN: Code duplicated, block: B:127:0x038e  */
            /* JADX WARN: Code duplicated, block: B:129:0x0391  */
            /* JADX WARN: Code duplicated, block: B:131:0x0394  */
            /* JADX WARN: Code duplicated, block: B:133:0x0399  */
            /* JADX WARN: Code duplicated, block: B:134:0x03a2  */
            /* JADX WARN: Code duplicated, block: B:135:0x03ab  */
            /* JADX WARN: Code duplicated, block: B:136:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:137:0x03bd  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c8  */
            /* JADX WARN: Code duplicated, block: B:141:0x03ce  */
            /* JADX WARN: Code duplicated, block: B:145:0x03ee A[LOOP:9: B:143:0x03e8->B:145:0x03ee, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:174:0x04cc  */
            /* JADX WARN: Code duplicated, block: B:178:0x04f5  */
            /* JADX WARN: Code duplicated, block: B:184:0x050a  */
            /* JADX WARN: Code duplicated, block: B:376:0x0b65  */
            /* JADX WARN: Code duplicated, block: B:396:0x0bfa  */
            /* JADX WARN: Code duplicated, block: B:468:0x0ddc  */
            /* JADX WARN: Code duplicated, block: B:493:0x0e64  */
            /* JADX WARN: Code duplicated, block: B:533:0x02d5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:534:0x0413 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:550:0x0332 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:552:0x031d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:559:0x0505 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:81:0x0244  */
            /* JADX WARN: Code duplicated, block: B:84:0x0250  */
            /* JADX WARN: Code duplicated, block: B:85:0x0258  */
            /* JADX WARN: Code duplicated, block: B:88:0x025d  */
            /* JADX WARN: Code duplicated, block: B:92:0x0289  */
            /* JADX WARN: Code duplicated, block: B:94:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:95:0x02a3  */
            /* JADX WARN: Code duplicated, block: B:97:0x02a7  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v19, types: [a.lak0] */
            /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22 */
            /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v27 */
            /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r4v35, types: [java.util.ArrayList] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v65 java.lang.Object, still in use, count: 2, list:
                  (r4v65 java.lang.Object) from 0x04c8: PHI (r4 I:??) = (r4v59 java.lang.Object), (r4v65 java.lang.Object) binds: [B:171:0x04c7, B:557:0x04c8] A[DONT_GENERATE, DONT_INLINE]
                  (r4v65 java.lang.Object) from 0x04bc: CHECK_CAST (a.wmg) (r4v65 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            private final java.lang.Object a(java.lang.Object r53) {
                /*
                    Method dump skipped, instruction units count: 3890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.wal.a(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x9l x9lVar;
                byte b4 = b;
                la30 la30VarP = null;
                gv1 gv1Var = this.b;
                switch (b4) {
                    case 0:
                        ((fee) obj).getClass();
                        return new avs(((fee) gv1Var.j.getValue()).d, ((fee) gv1Var.n.getValue()).d, ((fee) gv1Var.g.getValue()).d, ((fee) gv1Var.h.getValue()).d);
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m9s m9sVarC = d5c.C((jlr) feeVar.c());
                        ctf0 ctf0Var2 = gv1Var.b;
                        f9l f9lVar2 = (f9l) gv1Var.B;
                        if (m9sVarC != null && (x9lVar = (x9l) ((fee) gv1Var.d.getValue()).c()) != null) {
                            la30VarP = zjb.P(x9lVar, m9sVarC);
                        }
                        return hkb.P(m9sVarC, false, false, ctf0Var2, la30VarP, ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue(), (List) ((fee) gv1Var.i.getValue()).c(), f9lVar2.z, true, ((ypl0) ((fee) gv1Var.e.getValue()).c()).c.f19909a, f9lVar2.f9159a.g);
                    case 2:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        jlr jlrVar2 = (jlr) feeVar2.c();
                        boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                        f9l f9lVar3 = (f9l) gv1Var.B;
                        return ulb.j0(jlrVar2, zBooleanValue, f9lVar3.q.J, ((Boolean) ((fee) gv1Var.l.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv1Var.m.getValue()).c()).booleanValue(), f9lVar3.t, (yws) ((fee) gv1Var.k.getValue()).c());
                    case 3:
                        return a(obj);
                    case 4:
                        n0o0 n0o0Var = gv1Var.y;
                        g2v g2vVar2 = (g2v) gv1Var.C;
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        jlr jlrVar3 = (jlr) feeVar3.c();
                        if (jlrVar3 != null) {
                            if (jlrVar3 instanceof xkr) {
                                if (((fee) gv1Var.d.getValue()).c() == null) {
                                    return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                                }
                                zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                                zbkVar.getClass();
                                return new pss(zbkVar);
                            }
                            if (jlrVar3 instanceof alr) {
                                return new lss(((da10) ((fee) gv1Var.s.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                            }
                            if (jlrVar3 instanceof blr) {
                                return new mss(new pdq(g2v.b(g2vVar2, ozb.K(1L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar3).c, R.string.transition_to_live));
                            }
                            if (jlrVar3 instanceof clr) {
                                zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                                zbkVar2.getClass();
                                return new pss(zbkVar2);
                            }
                            if ((jlrVar3 instanceof dlr) || (jlrVar3 instanceof ilr)) {
                                return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                            }
                            if (jlrVar3 instanceof elr) {
                                return new oss(g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                            }
                        }
                        t9f.b();
                        return null;
                    default:
                        ((fee) obj).getClass();
                        return pzw.W((szj0) ((fee) gv1Var.t.getValue()).c(), ((f9l) gv1Var.B).q.K1, gv1Var.b);
                }
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.y = maz.b(new yw9(b(), new Function1(this) { // from class: a.wal
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:109:0x0323  */
            /* JADX WARN: Code duplicated, block: B:115:0x0351  */
            /* JADX WARN: Code duplicated, block: B:117:0x0359  */
            /* JADX WARN: Code duplicated, block: B:119:0x0363  */
            /* JADX WARN: Code duplicated, block: B:120:0x0366  */
            /* JADX WARN: Code duplicated, block: B:123:0x0388  */
            /* JADX WARN: Code duplicated, block: B:125:0x038b  */
            /* JADX WARN: Code duplicated, block: B:127:0x038e  */
            /* JADX WARN: Code duplicated, block: B:129:0x0391  */
            /* JADX WARN: Code duplicated, block: B:131:0x0394  */
            /* JADX WARN: Code duplicated, block: B:133:0x0399  */
            /* JADX WARN: Code duplicated, block: B:134:0x03a2  */
            /* JADX WARN: Code duplicated, block: B:135:0x03ab  */
            /* JADX WARN: Code duplicated, block: B:136:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:137:0x03bd  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c8  */
            /* JADX WARN: Code duplicated, block: B:141:0x03ce  */
            /* JADX WARN: Code duplicated, block: B:145:0x03ee A[LOOP:9: B:143:0x03e8->B:145:0x03ee, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:174:0x04cc  */
            /* JADX WARN: Code duplicated, block: B:178:0x04f5  */
            /* JADX WARN: Code duplicated, block: B:184:0x050a  */
            /* JADX WARN: Code duplicated, block: B:376:0x0b65  */
            /* JADX WARN: Code duplicated, block: B:396:0x0bfa  */
            /* JADX WARN: Code duplicated, block: B:468:0x0ddc  */
            /* JADX WARN: Code duplicated, block: B:493:0x0e64  */
            /* JADX WARN: Code duplicated, block: B:533:0x02d5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:534:0x0413 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:550:0x0332 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:552:0x031d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:559:0x0505 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:81:0x0244  */
            /* JADX WARN: Code duplicated, block: B:84:0x0250  */
            /* JADX WARN: Code duplicated, block: B:85:0x0258  */
            /* JADX WARN: Code duplicated, block: B:88:0x025d  */
            /* JADX WARN: Code duplicated, block: B:92:0x0289  */
            /* JADX WARN: Code duplicated, block: B:94:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:95:0x02a3  */
            /* JADX WARN: Code duplicated, block: B:97:0x02a7  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v19, types: [a.lak0] */
            /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22 */
            /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v27 */
            /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r4v35, types: [java.util.ArrayList] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v65 java.lang.Object, still in use, count: 2, list:
                  (r4v65 java.lang.Object) from 0x04c8: PHI (r4 I:??) = (r4v59 java.lang.Object), (r4v65 java.lang.Object) binds: [B:171:0x04c7, B:557:0x04c8] A[DONT_GENERATE, DONT_INLINE]
                  (r4v65 java.lang.Object) from 0x04bc: CHECK_CAST (a.wmg) (r4v65 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            private final java.lang.Object a(java.lang.Object r53) {
                /*
                    Method dump skipped, instruction units count: 3890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.wal.a(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x9l x9lVar;
                byte b5 = b4;
                la30 la30VarP = null;
                gv1 gv1Var = this.b;
                switch (b5) {
                    case 0:
                        ((fee) obj).getClass();
                        return new avs(((fee) gv1Var.j.getValue()).d, ((fee) gv1Var.n.getValue()).d, ((fee) gv1Var.g.getValue()).d, ((fee) gv1Var.h.getValue()).d);
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m9s m9sVarC = d5c.C((jlr) feeVar.c());
                        ctf0 ctf0Var2 = gv1Var.b;
                        f9l f9lVar2 = (f9l) gv1Var.B;
                        if (m9sVarC != null && (x9lVar = (x9l) ((fee) gv1Var.d.getValue()).c()) != null) {
                            la30VarP = zjb.P(x9lVar, m9sVarC);
                        }
                        return hkb.P(m9sVarC, false, false, ctf0Var2, la30VarP, ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue(), (List) ((fee) gv1Var.i.getValue()).c(), f9lVar2.z, true, ((ypl0) ((fee) gv1Var.e.getValue()).c()).c.f19909a, f9lVar2.f9159a.g);
                    case 2:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        jlr jlrVar2 = (jlr) feeVar2.c();
                        boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                        f9l f9lVar3 = (f9l) gv1Var.B;
                        return ulb.j0(jlrVar2, zBooleanValue, f9lVar3.q.J, ((Boolean) ((fee) gv1Var.l.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv1Var.m.getValue()).c()).booleanValue(), f9lVar3.t, (yws) ((fee) gv1Var.k.getValue()).c());
                    case 3:
                        return a(obj);
                    case 4:
                        n0o0 n0o0Var = gv1Var.y;
                        g2v g2vVar2 = (g2v) gv1Var.C;
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        jlr jlrVar3 = (jlr) feeVar3.c();
                        if (jlrVar3 != null) {
                            if (jlrVar3 instanceof xkr) {
                                if (((fee) gv1Var.d.getValue()).c() == null) {
                                    return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                                }
                                zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                                zbkVar.getClass();
                                return new pss(zbkVar);
                            }
                            if (jlrVar3 instanceof alr) {
                                return new lss(((da10) ((fee) gv1Var.s.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                            }
                            if (jlrVar3 instanceof blr) {
                                return new mss(new pdq(g2v.b(g2vVar2, ozb.K(1L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar3).c, R.string.transition_to_live));
                            }
                            if (jlrVar3 instanceof clr) {
                                zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                                zbkVar2.getClass();
                                return new pss(zbkVar2);
                            }
                            if ((jlrVar3 instanceof dlr) || (jlrVar3 instanceof ilr)) {
                                return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                            }
                            if (jlrVar3 instanceof elr) {
                                return new oss(g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                            }
                        }
                        t9f.b();
                        return null;
                    default:
                        ((fee) obj).getClass();
                        return pzw.W((szj0) ((fee) gv1Var.t.getValue()).c(), ((f9l) gv1Var.B).q.K1, gv1Var.b);
                }
            }
        }, (byte) 20));
        final byte b5 = 4;
        this.z = maz.b(new yw9(b(), new Function1(this) { // from class: a.wal
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:109:0x0323  */
            /* JADX WARN: Code duplicated, block: B:115:0x0351  */
            /* JADX WARN: Code duplicated, block: B:117:0x0359  */
            /* JADX WARN: Code duplicated, block: B:119:0x0363  */
            /* JADX WARN: Code duplicated, block: B:120:0x0366  */
            /* JADX WARN: Code duplicated, block: B:123:0x0388  */
            /* JADX WARN: Code duplicated, block: B:125:0x038b  */
            /* JADX WARN: Code duplicated, block: B:127:0x038e  */
            /* JADX WARN: Code duplicated, block: B:129:0x0391  */
            /* JADX WARN: Code duplicated, block: B:131:0x0394  */
            /* JADX WARN: Code duplicated, block: B:133:0x0399  */
            /* JADX WARN: Code duplicated, block: B:134:0x03a2  */
            /* JADX WARN: Code duplicated, block: B:135:0x03ab  */
            /* JADX WARN: Code duplicated, block: B:136:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:137:0x03bd  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c8  */
            /* JADX WARN: Code duplicated, block: B:141:0x03ce  */
            /* JADX WARN: Code duplicated, block: B:145:0x03ee A[LOOP:9: B:143:0x03e8->B:145:0x03ee, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:174:0x04cc  */
            /* JADX WARN: Code duplicated, block: B:178:0x04f5  */
            /* JADX WARN: Code duplicated, block: B:184:0x050a  */
            /* JADX WARN: Code duplicated, block: B:376:0x0b65  */
            /* JADX WARN: Code duplicated, block: B:396:0x0bfa  */
            /* JADX WARN: Code duplicated, block: B:468:0x0ddc  */
            /* JADX WARN: Code duplicated, block: B:493:0x0e64  */
            /* JADX WARN: Code duplicated, block: B:533:0x02d5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:534:0x0413 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:550:0x0332 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:552:0x031d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:559:0x0505 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:81:0x0244  */
            /* JADX WARN: Code duplicated, block: B:84:0x0250  */
            /* JADX WARN: Code duplicated, block: B:85:0x0258  */
            /* JADX WARN: Code duplicated, block: B:88:0x025d  */
            /* JADX WARN: Code duplicated, block: B:92:0x0289  */
            /* JADX WARN: Code duplicated, block: B:94:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:95:0x02a3  */
            /* JADX WARN: Code duplicated, block: B:97:0x02a7  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v19, types: [a.lak0] */
            /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22 */
            /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v27 */
            /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r4v35, types: [java.util.ArrayList] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v65 java.lang.Object, still in use, count: 2, list:
                  (r4v65 java.lang.Object) from 0x04c8: PHI (r4 I:??) = (r4v59 java.lang.Object), (r4v65 java.lang.Object) binds: [B:171:0x04c7, B:557:0x04c8] A[DONT_GENERATE, DONT_INLINE]
                  (r4v65 java.lang.Object) from 0x04bc: CHECK_CAST (a.wmg) (r4v65 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                */
            private final java.lang.Object a(java.lang.Object r53) {
                /*
                    Method dump skipped, instruction units count: 3890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.wal.a(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x9l x9lVar;
                byte b6 = b5;
                la30 la30VarP = null;
                gv1 gv1Var = this.b;
                switch (b6) {
                    case 0:
                        ((fee) obj).getClass();
                        return new avs(((fee) gv1Var.j.getValue()).d, ((fee) gv1Var.n.getValue()).d, ((fee) gv1Var.g.getValue()).d, ((fee) gv1Var.h.getValue()).d);
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m9s m9sVarC = d5c.C((jlr) feeVar.c());
                        ctf0 ctf0Var2 = gv1Var.b;
                        f9l f9lVar2 = (f9l) gv1Var.B;
                        if (m9sVarC != null && (x9lVar = (x9l) ((fee) gv1Var.d.getValue()).c()) != null) {
                            la30VarP = zjb.P(x9lVar, m9sVarC);
                        }
                        return hkb.P(m9sVarC, false, false, ctf0Var2, la30VarP, ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue(), (List) ((fee) gv1Var.i.getValue()).c(), f9lVar2.z, true, ((ypl0) ((fee) gv1Var.e.getValue()).c()).c.f19909a, f9lVar2.f9159a.g);
                    case 2:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        jlr jlrVar2 = (jlr) feeVar2.c();
                        boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                        f9l f9lVar3 = (f9l) gv1Var.B;
                        return ulb.j0(jlrVar2, zBooleanValue, f9lVar3.q.J, ((Boolean) ((fee) gv1Var.l.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv1Var.m.getValue()).c()).booleanValue(), f9lVar3.t, (yws) ((fee) gv1Var.k.getValue()).c());
                    case 3:
                        return a(obj);
                    case 4:
                        n0o0 n0o0Var = gv1Var.y;
                        g2v g2vVar2 = (g2v) gv1Var.C;
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        jlr jlrVar3 = (jlr) feeVar3.c();
                        if (jlrVar3 != null) {
                            if (jlrVar3 instanceof xkr) {
                                if (((fee) gv1Var.d.getValue()).c() == null) {
                                    return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                                }
                                zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                                zbkVar.getClass();
                                return new pss(zbkVar);
                            }
                            if (jlrVar3 instanceof alr) {
                                return new lss(((da10) ((fee) gv1Var.s.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                            }
                            if (jlrVar3 instanceof blr) {
                                return new mss(new pdq(g2v.b(g2vVar2, ozb.K(1L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar3).c, R.string.transition_to_live));
                            }
                            if (jlrVar3 instanceof clr) {
                                zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                                zbkVar2.getClass();
                                return new pss(zbkVar2);
                            }
                            if ((jlrVar3 instanceof dlr) || (jlrVar3 instanceof ilr)) {
                                return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                            }
                            if (jlrVar3 instanceof elr) {
                                return new oss(g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                            }
                        }
                        t9f.b();
                        return null;
                    default:
                        ((fee) obj).getClass();
                        return pzw.W((szj0) ((fee) gv1Var.t.getValue()).c(), ((f9l) gv1Var.B).q.K1, gv1Var.b);
                }
            }
        }, (byte) 20));
        final byte b6 = 5;
        this.A = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.wal
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:109:0x0323  */
            /* JADX WARN: Code duplicated, block: B:115:0x0351  */
            /* JADX WARN: Code duplicated, block: B:117:0x0359  */
            /* JADX WARN: Code duplicated, block: B:119:0x0363  */
            /* JADX WARN: Code duplicated, block: B:120:0x0366  */
            /* JADX WARN: Code duplicated, block: B:123:0x0388  */
            /* JADX WARN: Code duplicated, block: B:125:0x038b  */
            /* JADX WARN: Code duplicated, block: B:127:0x038e  */
            /* JADX WARN: Code duplicated, block: B:129:0x0391  */
            /* JADX WARN: Code duplicated, block: B:131:0x0394  */
            /* JADX WARN: Code duplicated, block: B:133:0x0399  */
            /* JADX WARN: Code duplicated, block: B:134:0x03a2  */
            /* JADX WARN: Code duplicated, block: B:135:0x03ab  */
            /* JADX WARN: Code duplicated, block: B:136:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:137:0x03bd  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c8  */
            /* JADX WARN: Code duplicated, block: B:141:0x03ce  */
            /* JADX WARN: Code duplicated, block: B:145:0x03ee A[LOOP:9: B:143:0x03e8->B:145:0x03ee, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:174:0x04cc  */
            /* JADX WARN: Code duplicated, block: B:178:0x04f5  */
            /* JADX WARN: Code duplicated, block: B:184:0x050a  */
            /* JADX WARN: Code duplicated, block: B:376:0x0b65  */
            /* JADX WARN: Code duplicated, block: B:396:0x0bfa  */
            /* JADX WARN: Code duplicated, block: B:468:0x0ddc  */
            /* JADX WARN: Code duplicated, block: B:493:0x0e64  */
            /* JADX WARN: Code duplicated, block: B:533:0x02d5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:534:0x0413 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:550:0x0332 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:552:0x031d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:559:0x0505 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:81:0x0244  */
            /* JADX WARN: Code duplicated, block: B:84:0x0250  */
            /* JADX WARN: Code duplicated, block: B:85:0x0258  */
            /* JADX WARN: Code duplicated, block: B:88:0x025d  */
            /* JADX WARN: Code duplicated, block: B:92:0x0289  */
            /* JADX WARN: Code duplicated, block: B:94:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:95:0x02a3  */
            /* JADX WARN: Code duplicated, block: B:97:0x02a7  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v19, types: [a.lak0] */
            /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22 */
            /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v27 */
            /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r4v35, types: [java.util.ArrayList] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v65 java.lang.Object, still in use, count: 2, list:
                  (r4v65 java.lang.Object) from 0x04c8: PHI (r4 I:??) = (r4v59 java.lang.Object), (r4v65 java.lang.Object) binds: [B:171:0x04c7, B:557:0x04c8] A[DONT_GENERATE, DONT_INLINE]
                  (r4v65 java.lang.Object) from 0x04bc: CHECK_CAST (a.wmg) (r4v65 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                */
            private final java.lang.Object a(java.lang.Object r53) {
                /*
                    Method dump skipped, instruction units count: 3890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.wal.a(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                x9l x9lVar;
                byte b7 = b6;
                la30 la30VarP = null;
                gv1 gv1Var = this.b;
                switch (b7) {
                    case 0:
                        ((fee) obj).getClass();
                        return new avs(((fee) gv1Var.j.getValue()).d, ((fee) gv1Var.n.getValue()).d, ((fee) gv1Var.g.getValue()).d, ((fee) gv1Var.h.getValue()).d);
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m9s m9sVarC = d5c.C((jlr) feeVar.c());
                        ctf0 ctf0Var2 = gv1Var.b;
                        f9l f9lVar2 = (f9l) gv1Var.B;
                        if (m9sVarC != null && (x9lVar = (x9l) ((fee) gv1Var.d.getValue()).c()) != null) {
                            la30VarP = zjb.P(x9lVar, m9sVarC);
                        }
                        return hkb.P(m9sVarC, false, false, ctf0Var2, la30VarP, ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue(), (List) ((fee) gv1Var.i.getValue()).c(), f9lVar2.z, true, ((ypl0) ((fee) gv1Var.e.getValue()).c()).c.f19909a, f9lVar2.f9159a.g);
                    case 2:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        jlr jlrVar2 = (jlr) feeVar2.c();
                        boolean zBooleanValue = ((Boolean) ((fee) gv1Var.f.getValue()).c()).booleanValue();
                        f9l f9lVar3 = (f9l) gv1Var.B;
                        return ulb.j0(jlrVar2, zBooleanValue, f9lVar3.q.J, ((Boolean) ((fee) gv1Var.l.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv1Var.m.getValue()).c()).booleanValue(), f9lVar3.t, (yws) ((fee) gv1Var.k.getValue()).c());
                    case 3:
                        return a(obj);
                    case 4:
                        n0o0 n0o0Var = gv1Var.y;
                        g2v g2vVar2 = (g2v) gv1Var.C;
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        jlr jlrVar3 = (jlr) feeVar3.c();
                        if (jlrVar3 != null) {
                            if (jlrVar3 instanceof xkr) {
                                if (((fee) gv1Var.d.getValue()).c() == null) {
                                    return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                                }
                                zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                                zbkVar.getClass();
                                return new pss(zbkVar);
                            }
                            if (jlrVar3 instanceof alr) {
                                return new lss(((da10) ((fee) gv1Var.s.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                            }
                            if (jlrVar3 instanceof blr) {
                                return new mss(new pdq(g2v.b(g2vVar2, ozb.K(1L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar3).c, R.string.transition_to_live));
                            }
                            if (jlrVar3 instanceof clr) {
                                zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                                zbkVar2.getClass();
                                return new pss(zbkVar2);
                            }
                            if ((jlrVar3 instanceof dlr) || (jlrVar3 instanceof ilr)) {
                                return new nss(g2v.b(g2vVar2, ozb.K(1L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                            }
                            if (jlrVar3 instanceof elr) {
                                return new oss(g2v.b(g2vVar2, ozb.J(1L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                            }
                        }
                        t9f.b();
                        return null;
                    default:
                        ((fee) obj).getClass();
                        return pzw.W((szj0) ((fee) gv1Var.t.getValue()).c(), ((f9l) gv1Var.B).q.K1, gv1Var.b);
                }
            }
        }, (byte) 20));
    }

    public gv1(wmf wmfVar, ctf0 ctf0Var, g2v g2vVar) {
        final byte b = 1;
        ctf0Var.getClass();
        this.B = wmfVar;
        this.b = ctf0Var;
        this.C = g2vVar;
        n0o0 n0o0VarH = bkb.H(wmfVar.c);
        this.c = n0o0VarH;
        jlr jlrVar = wmfVar.b;
        this.d = bkb.H(jlrVar);
        this.e = bkb.H("");
        this.f = bkb.H(Boolean.valueOf(jlrVar instanceof xkr));
        this.g = bkb.H(Boolean.valueOf(wmfVar.d));
        this.h = bkb.H(Boolean.valueOf(wmfVar.e));
        this.i = bkb.H(Boolean.valueOf(wmfVar.g));
        this.j = bkb.H(wmfVar.h);
        this.k = bkb.H(wmfVar.i);
        this.l = bkb.H(Boolean.valueOf(wmfVar.k));
        this.m = bkb.H(Boolean.valueOf(wmfVar.l));
        this.n = bkb.H(wmfVar.v);
        this.o = bkb.H(wmfVar.n);
        this.p = bkb.H(wmfVar.o);
        this.q = bkb.H(Boolean.valueOf(wmfVar.p));
        this.r = bkb.H(wmfVar.u);
        this.s = bkb.H(wmfVar.f);
        n0o0 n0o0VarH2 = bkb.H(wmfVar.w);
        this.t = n0o0VarH2;
        this.u = maz.b(new yw9((fee) n0o0VarH.getValue(), new vlf((byte) 1), (byte) 20));
        final byte b2 = 0;
        this.v = maz.b(new yw9(c(), new Function1(this) { // from class: a.lnf
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.y;
                g2v g2vVar2 = (g2v) gv1Var.C;
                fee feeVar = (fee) obj;
                feeVar.getClass();
                jlr jlrVar2 = (jlr) feeVar.c();
                if (jlrVar2 != null) {
                    if (jlrVar2 instanceof xkr) {
                        if (((fee) gv1Var.s.getValue()).c() == null) {
                            return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                        }
                        zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                        zbkVar.getClass();
                        return new pss(zbkVar);
                    }
                    if (jlrVar2 instanceof alr) {
                        return new lss(((da10) ((fee) gv1Var.p.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                    }
                    if (jlrVar2 instanceof blr) {
                        return new mss(new pdq(g2v.b(g2vVar2, ozb.K(46L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar2).c, R.string.transition_to_live));
                    }
                    if (jlrVar2 instanceof clr) {
                        zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                        zbkVar2.getClass();
                        return new pss(zbkVar2);
                    }
                    if ((jlrVar2 instanceof dlr) || (jlrVar2 instanceof ilr)) {
                        return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                    }
                    if (jlrVar2 instanceof elr) {
                        return new oss(g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                    }
                }
                t9f.b();
                return null;
            }

            /* JADX WARN: Code duplicated, block: B:155:0x055a  */
            /* JADX WARN: Code duplicated, block: B:156:0x055d  */
            /* JADX WARN: Code duplicated, block: B:19:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:523:0x02a1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0270  */
            /* JADX WARN: Code duplicated, block: B:77:0x0291  */
            /* JADX WARN: Code duplicated, block: B:83:0x02a7  */
            /* JADX WARN: Code duplicated, block: B:87:0x030f A[LOOP:6: B:85:0x0309->B:87:0x030f, LOOP_END] */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v57 java.lang.Object, still in use, count: 2, list:
                  (r4v57 java.lang.Object) from 0x026c: PHI (r4 I:??) = (r4v51 java.lang.Object), (r4v57 java.lang.Object) binds: [B:70:0x026a, B:521:0x026c] A[DONT_GENERATE, DONT_INLINE]
                  (r4v57 java.lang.Object) from 0x025f: CHECK_CAST (a.nrf) (r4v57 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r59) {
                /*
                    Method dump skipped, instruction units count: 3904
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.lnf.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.w = maz.b(new yw9(c(), new Function1(this) { // from class: a.lnf
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.y;
                g2v g2vVar2 = (g2v) gv1Var.C;
                fee feeVar = (fee) obj;
                feeVar.getClass();
                jlr jlrVar2 = (jlr) feeVar.c();
                if (jlrVar2 != null) {
                    if (jlrVar2 instanceof xkr) {
                        if (((fee) gv1Var.s.getValue()).c() == null) {
                            return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                        }
                        zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                        zbkVar.getClass();
                        return new pss(zbkVar);
                    }
                    if (jlrVar2 instanceof alr) {
                        return new lss(((da10) ((fee) gv1Var.p.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                    }
                    if (jlrVar2 instanceof blr) {
                        return new mss(new pdq(g2v.b(g2vVar2, ozb.K(46L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar2).c, R.string.transition_to_live));
                    }
                    if (jlrVar2 instanceof clr) {
                        zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                        zbkVar2.getClass();
                        return new pss(zbkVar2);
                    }
                    if ((jlrVar2 instanceof dlr) || (jlrVar2 instanceof ilr)) {
                        return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                    }
                    if (jlrVar2 instanceof elr) {
                        return new oss(g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                    }
                }
                t9f.b();
                return null;
            }

            /* JADX WARN: Code duplicated, block: B:155:0x055a  */
            /* JADX WARN: Code duplicated, block: B:156:0x055d  */
            /* JADX WARN: Code duplicated, block: B:19:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:523:0x02a1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0270  */
            /* JADX WARN: Code duplicated, block: B:77:0x0291  */
            /* JADX WARN: Code duplicated, block: B:83:0x02a7  */
            /* JADX WARN: Code duplicated, block: B:87:0x030f A[LOOP:6: B:85:0x0309->B:87:0x030f, LOOP_END] */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v57 java.lang.Object, still in use, count: 2, list:
                  (r4v57 java.lang.Object) from 0x026c: PHI (r4 I:??) = (r4v51 java.lang.Object), (r4v57 java.lang.Object) binds: [B:70:0x026a, B:521:0x026c] A[DONT_GENERATE, DONT_INLINE]
                  (r4v57 java.lang.Object) from 0x025f: CHECK_CAST (a.nrf) (r4v57 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r59) {
                /*
                    Method dump skipped, instruction units count: 3904
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.lnf.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.x = maz.b(new yw9(c(), new Function1(this) { // from class: a.lnf
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.y;
                g2v g2vVar2 = (g2v) gv1Var.C;
                fee feeVar = (fee) obj;
                feeVar.getClass();
                jlr jlrVar2 = (jlr) feeVar.c();
                if (jlrVar2 != null) {
                    if (jlrVar2 instanceof xkr) {
                        if (((fee) gv1Var.s.getValue()).c() == null) {
                            return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                        }
                        zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                        zbkVar.getClass();
                        return new pss(zbkVar);
                    }
                    if (jlrVar2 instanceof alr) {
                        return new lss(((da10) ((fee) gv1Var.p.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                    }
                    if (jlrVar2 instanceof blr) {
                        return new mss(new pdq(g2v.b(g2vVar2, ozb.K(46L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar2).c, R.string.transition_to_live));
                    }
                    if (jlrVar2 instanceof clr) {
                        zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                        zbkVar2.getClass();
                        return new pss(zbkVar2);
                    }
                    if ((jlrVar2 instanceof dlr) || (jlrVar2 instanceof ilr)) {
                        return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                    }
                    if (jlrVar2 instanceof elr) {
                        return new oss(g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                    }
                }
                t9f.b();
                return null;
            }

            /* JADX WARN: Code duplicated, block: B:155:0x055a  */
            /* JADX WARN: Code duplicated, block: B:156:0x055d  */
            /* JADX WARN: Code duplicated, block: B:19:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:523:0x02a1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0270  */
            /* JADX WARN: Code duplicated, block: B:77:0x0291  */
            /* JADX WARN: Code duplicated, block: B:83:0x02a7  */
            /* JADX WARN: Code duplicated, block: B:87:0x030f A[LOOP:6: B:85:0x0309->B:87:0x030f, LOOP_END] */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v57 java.lang.Object, still in use, count: 2, list:
                  (r4v57 java.lang.Object) from 0x026c: PHI (r4 I:??) = (r4v51 java.lang.Object), (r4v57 java.lang.Object) binds: [B:70:0x026a, B:521:0x026c] A[DONT_GENERATE, DONT_INLINE]
                  (r4v57 java.lang.Object) from 0x025f: CHECK_CAST (a.nrf) (r4v57 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r59) {
                /*
                    Method dump skipped, instruction units count: 3904
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.lnf.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.y = maz.b(new yw9(c(), new Function1(this) { // from class: a.lnf
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.y;
                g2v g2vVar2 = (g2v) gv1Var.C;
                fee feeVar = (fee) obj;
                feeVar.getClass();
                jlr jlrVar2 = (jlr) feeVar.c();
                if (jlrVar2 != null) {
                    if (jlrVar2 instanceof xkr) {
                        if (((fee) gv1Var.s.getValue()).c() == null) {
                            return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                        }
                        zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                        zbkVar.getClass();
                        return new pss(zbkVar);
                    }
                    if (jlrVar2 instanceof alr) {
                        return new lss(((da10) ((fee) gv1Var.p.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                    }
                    if (jlrVar2 instanceof blr) {
                        return new mss(new pdq(g2v.b(g2vVar2, ozb.K(46L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar2).c, R.string.transition_to_live));
                    }
                    if (jlrVar2 instanceof clr) {
                        zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                        zbkVar2.getClass();
                        return new pss(zbkVar2);
                    }
                    if ((jlrVar2 instanceof dlr) || (jlrVar2 instanceof ilr)) {
                        return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                    }
                    if (jlrVar2 instanceof elr) {
                        return new oss(g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                    }
                }
                t9f.b();
                return null;
            }

            /* JADX WARN: Code duplicated, block: B:155:0x055a  */
            /* JADX WARN: Code duplicated, block: B:156:0x055d  */
            /* JADX WARN: Code duplicated, block: B:19:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:523:0x02a1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0270  */
            /* JADX WARN: Code duplicated, block: B:77:0x0291  */
            /* JADX WARN: Code duplicated, block: B:83:0x02a7  */
            /* JADX WARN: Code duplicated, block: B:87:0x030f A[LOOP:6: B:85:0x0309->B:87:0x030f, LOOP_END] */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v57 java.lang.Object, still in use, count: 2, list:
                  (r4v57 java.lang.Object) from 0x026c: PHI (r4 I:??) = (r4v51 java.lang.Object), (r4v57 java.lang.Object) binds: [B:70:0x026a, B:521:0x026c] A[DONT_GENERATE, DONT_INLINE]
                  (r4v57 java.lang.Object) from 0x025f: CHECK_CAST (a.nrf) (r4v57 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r59) {
                /*
                    Method dump skipped, instruction units count: 3904
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.lnf.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b5 = 4;
        this.z = maz.b(new yw9(c(), new Function1(this) { // from class: a.lnf
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.y;
                g2v g2vVar2 = (g2v) gv1Var.C;
                fee feeVar = (fee) obj;
                feeVar.getClass();
                jlr jlrVar2 = (jlr) feeVar.c();
                if (jlrVar2 != null) {
                    if (jlrVar2 instanceof xkr) {
                        if (((fee) gv1Var.s.getValue()).c() == null) {
                            return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                        }
                        zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                        zbkVar.getClass();
                        return new pss(zbkVar);
                    }
                    if (jlrVar2 instanceof alr) {
                        return new lss(((da10) ((fee) gv1Var.p.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                    }
                    if (jlrVar2 instanceof blr) {
                        return new mss(new pdq(g2v.b(g2vVar2, ozb.K(46L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar2).c, R.string.transition_to_live));
                    }
                    if (jlrVar2 instanceof clr) {
                        zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                        zbkVar2.getClass();
                        return new pss(zbkVar2);
                    }
                    if ((jlrVar2 instanceof dlr) || (jlrVar2 instanceof ilr)) {
                        return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                    }
                    if (jlrVar2 instanceof elr) {
                        return new oss(g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                    }
                }
                t9f.b();
                return null;
            }

            /* JADX WARN: Code duplicated, block: B:155:0x055a  */
            /* JADX WARN: Code duplicated, block: B:156:0x055d  */
            /* JADX WARN: Code duplicated, block: B:19:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:523:0x02a1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0270  */
            /* JADX WARN: Code duplicated, block: B:77:0x0291  */
            /* JADX WARN: Code duplicated, block: B:83:0x02a7  */
            /* JADX WARN: Code duplicated, block: B:87:0x030f A[LOOP:6: B:85:0x0309->B:87:0x030f, LOOP_END] */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v57 java.lang.Object, still in use, count: 2, list:
                  (r4v57 java.lang.Object) from 0x026c: PHI (r4 I:??) = (r4v51 java.lang.Object), (r4v57 java.lang.Object) binds: [B:70:0x026a, B:521:0x026c] A[DONT_GENERATE, DONT_INLINE]
                  (r4v57 java.lang.Object) from 0x025f: CHECK_CAST (a.nrf) (r4v57 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r59) {
                /*
                    Method dump skipped, instruction units count: 3904
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.lnf.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b6 = 5;
        this.A = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.lnf
            public final /* synthetic */ gv1 b;

            {
                this.b = this;
            }

            private final Object a(Object obj) {
                gv1 gv1Var = this.b;
                n0o0 n0o0Var = gv1Var.y;
                g2v g2vVar2 = (g2v) gv1Var.C;
                fee feeVar = (fee) obj;
                feeVar.getClass();
                jlr jlrVar2 = (jlr) feeVar.c();
                if (jlrVar2 != null) {
                    if (jlrVar2 instanceof xkr) {
                        if (((fee) gv1Var.s.getValue()).c() == null) {
                            return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                        }
                        zbk zbkVar = ((fee) n0o0Var.getValue()).e;
                        zbkVar.getClass();
                        return new pss(zbkVar);
                    }
                    if (jlrVar2 instanceof alr) {
                        return new lss(((da10) ((fee) gv1Var.p.getValue()).c()).f5727a, g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                    }
                    if (jlrVar2 instanceof blr) {
                        return new mss(new pdq(g2v.b(g2vVar2, ozb.K(46L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), ((blr) jlrVar2).c, R.string.transition_to_live));
                    }
                    if (jlrVar2 instanceof clr) {
                        zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
                        zbkVar2.getClass();
                        return new pss(zbkVar2);
                    }
                    if ((jlrVar2 instanceof dlr) || (jlrVar2 instanceof ilr)) {
                        return new nss(g2v.b(g2vVar2, ozb.K(46L), null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022));
                    }
                    if (jlrVar2 instanceof elr) {
                        return new oss(g2v.b(g2vVar2, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.game_in_live_not_found, 0, R.string.go_to_game_list, 0L, 0L, 858));
                    }
                }
                t9f.b();
                return null;
            }

            /* JADX WARN: Code duplicated, block: B:155:0x055a  */
            /* JADX WARN: Code duplicated, block: B:156:0x055d  */
            /* JADX WARN: Code duplicated, block: B:19:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:523:0x02a1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0270  */
            /* JADX WARN: Code duplicated, block: B:77:0x0291  */
            /* JADX WARN: Code duplicated, block: B:83:0x02a7  */
            /* JADX WARN: Code duplicated, block: B:87:0x030f A[LOOP:6: B:85:0x0309->B:87:0x030f, LOOP_END] */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v57 java.lang.Object, still in use, count: 2, list:
                  (r4v57 java.lang.Object) from 0x026c: PHI (r4 I:??) = (r4v51 java.lang.Object), (r4v57 java.lang.Object) binds: [B:70:0x026a, B:521:0x026c] A[DONT_GENERATE, DONT_INLINE]
                  (r4v57 java.lang.Object) from 0x025f: CHECK_CAST (a.nrf) (r4v57 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r59) {
                /*
                    Method dump skipped, instruction units count: 3904
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.lnf.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }
}
