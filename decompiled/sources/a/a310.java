package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final class a310 extends bnn0 implements aer {
    public final /* synthetic */ byte i;
    public /* synthetic */ da10 j;
    public /* synthetic */ kam0 k;
    public /* synthetic */ boolean l;
    public /* synthetic */ List m;
    public final /* synthetic */ Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ w46 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a310(Object obj, w46 w46Var, Object obj2, yje yjeVar, byte b) {
        super(6, yjeVar);
        this.i = b;
        this.p = obj;
        this.q = w46Var;
        this.n = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:208:0x065e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0661 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x0663  */
    /* JADX WARN: Code duplicated, block: B:213:0x0666  */
    /* JADX WARN: Code duplicated, block: B:217:0x066f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0672  */
    /* JADX WARN: Code duplicated, block: B:219:0x0675  */
    /* JADX WARN: Code duplicated, block: B:326:0x0952  */
    /* JADX WARN: Code duplicated, block: B:334:0x0989  */
    /* JADX WARN: Code duplicated, block: B:397:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:417:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:546:0x066b A[SYNTHETIC] */
    private final Object l(Object obj) {
        hxd0 hxd0Var;
        Object axd0Var;
        Object value;
        ljg ljgVar;
        List list;
        lc00 lc00Var;
        List list2;
        g0e0 g0e0Var;
        ctf0 ctf0Var;
        lc00 lc00Var2;
        List list3;
        int i;
        char c;
        int i2;
        int i3;
        ctf0 ctf0Var2;
        int i4;
        cgg0 cgg0Var;
        cgg0 cgg0Var2;
        qud0 qud0Var;
        boolean z;
        int i5;
        char c2;
        String str;
        boolean z2;
        char c3;
        String str2;
        lc00 lc00Var3;
        boolean z3;
        int i6;
        char c4;
        String str3;
        int i7;
        int iOrdinal;
        oud0 oud0Var;
        ctf0 ctf0Var3;
        List list4;
        ljg ljgVar2;
        ArrayList arrayListA;
        l2z l2zVarD;
        Object next;
        ljg ljgVar3;
        lc00 lc00Var4;
        boolean z4;
        lc00 lc00Var5;
        Iterator it;
        Object next2;
        List list5;
        List list6;
        qzd0 qzd0Var;
        hxd0 hxd0Var2 = (hxd0) this.q;
        wwd0 wwd0Var = (wwd0) this.o;
        da10 da10Var = this.j;
        kam0 kam0Var = this.k;
        boolean z5 = this.l;
        List list7 = this.m;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        uwd0 uwd0Var = (uwd0) this.p;
        if (uwd0Var != null) {
            oxd0 oxd0Var = uwd0Var.e;
            g0e0 g0e0Var2 = uwd0Var.d;
            ljg ljgVar4 = uwd0Var.f36387a;
            ArrayList arrayList = hxd0Var2.G;
            arrayList.getClass();
            lc00 lc00VarB = kotlin.collections.a.b();
            ArrayList<ywd0> arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                Object obj2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                t9m0 t9m0Var = (t9m0) it2.next();
                for (Object obj3 : ywd0.c) {
                    if (((ywd0) obj3).f43366a == t9m0Var) {
                        obj2 = obj3;
                        break;
                    }
                }
                ywd0 ywd0Var = (ywd0) obj2;
                if (ywd0Var != null) {
                    arrayList2.add(ywd0Var);
                }
            }
            for (ywd0 ywd0Var2 : arrayList2) {
                int iOrdinal2 = ywd0Var2.ordinal();
                short s = ywd0Var2.f43366a.f33572a;
                switch (iOrdinal2) {
                    case 0:
                        if (g0e0Var2.f.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    case 1:
                        if (!g0e0Var2.f.isEmpty() && ((list5 = g0e0Var2.f) == null || !list5.isEmpty())) {
                            Iterator it3 = list5.iterator();
                            do {
                                if (it3.hasNext()) {
                                }
                            } while (x0x.Z((qzd0) it3.next()));
                        }
                        lc00VarB.add(Integer.valueOf(s));
                        break;
                    case 2:
                        if (!g0e0Var2.f.isEmpty() && ((list6 = g0e0Var2.f) == null || !list6.isEmpty())) {
                            Iterator it4 = list6.iterator();
                            do {
                                if (it4.hasNext()) {
                                    qzd0Var = (qzd0) it4.next();
                                    qzd0Var.getClass();
                                }
                            } while (qzd0Var.d.isEmpty());
                        }
                        lc00VarB.add(Integer.valueOf(s));
                        break;
                    case 3:
                        if (!g0e0Var2.f.isEmpty()) {
                            List list8 = g0e0Var2.f;
                            List list9 = g0e0Var2.h;
                            list8.getClass();
                            list9.getClass();
                            if (!list8.isEmpty()) {
                                Iterator it5 = list8.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        if (!((qzd0) it5.next()).e.isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!list9.isEmpty()) {
                                break;
                            }
                        }
                        lc00VarB.add(Integer.valueOf(s));
                        break;
                    case 4:
                        if (x2x.a0(oxd0Var)) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    case 5:
                        if (x2x.X(g0e0Var2)) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    case 6:
                        if (x2x.Z(g0e0Var2)) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    case 7:
                        if (x2x.d0(ljgVar4)) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    case 8:
                        ljgVar4.getClass();
                        v1h v1hVar = ljgVar4.d;
                        if (v1hVar.g.isEmpty() && v1hVar.h.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    default:
                        t9f.b();
                        return null;
                }
            }
            hxd0Var2.M = kotlin.collections.a.a(lc00VarB);
            ArrayList arrayList3 = kam0Var.f17972a;
            ctf0 ctf0Var4 = hxd0Var2.l;
            boolean zBooleanValue = ((Boolean) hxd0Var2.B.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) hxd0Var2.C.getValue()).booleanValue();
            r9u r9uVar = hxd0Var2.o;
            ygp ygpVar = ygp.t;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            boolean zD = j1q0Var.f15748a.d(ygpVar);
            wwd0Var.getClass();
            ctf0Var4.getClass();
            list7.getClass();
            lc00 lc00VarB2 = kotlin.collections.a.b();
            ypl0 ypl0Var = uwd0Var.c;
            ljg ljgVar5 = uwd0Var.f36387a;
            int i8 = wwd0Var.f39882a;
            List list10 = g0e0Var2.f;
            k0e0 k0e0Var = g0e0Var2.d;
            k0e0 k0e0Var2 = g0e0Var2.e;
            g0e0 g0e0Var3 = g0e0Var2;
            String str4 = k0e0Var2.c;
            int i9 = k0e0Var2.f17462a;
            int i10 = k0e0Var.f17462a;
            String str5 = k0e0Var.c;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list10) {
                ctf0 ctf0Var5 = ctf0Var4;
                ypl0 ypl0Var2 = ypl0Var;
                qzd0 qzd0Var2 = (qzd0) obj4;
                ljg ljgVar6 = ljgVar5;
                int i11 = i8;
                if (qzd0Var2.b.b != qzd0Var2.c.b && qzd0Var2.f29574a.length() > 0) {
                    arrayList4.add(obj4);
                }
                ctf0Var4 = ctf0Var5;
                ypl0Var = ypl0Var2;
                ljgVar5 = ljgVar6;
                i8 = i11;
            }
            ctf0 ctf0Var6 = ctf0Var4;
            int i12 = i8;
            ljg ljgVar7 = ljgVar4;
            String str6 = str5;
            uwd0 uwd0Var2 = uwd0Var;
            uvw.p(lc00VarB2, ctf0Var6, ypl0Var, ljgVar5, i12, arrayList4.size(), arrayList3, list7, zBooleanValue2, "POST_GAME_HEADER", ijg.l1, zD);
            lc00 lc00Var6 = lc00VarB2;
            ctf0 ctf0Var7 = ctf0Var6;
            ArrayList arrayList5 = arrayList3;
            List listM = zsm0.m(ljgVar7);
            lc00 lc00VarB3 = kotlin.collections.a.b();
            List listA0 = CollectionsKt.A0(arrayList5, new lk30((byte) 20));
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : listA0) {
                if (((StatisticBlockModel) obj5).c) {
                    arrayList6.add(obj5);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                StatisticBlockModel statisticBlockModel = (StatisticBlockModel) it6.next();
                Iterator it7 = ywd0.c.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        next2 = it7.next();
                        lc00Var5 = lc00VarB3;
                        it = it6;
                        if (((ywd0) next2).f43366a != statisticBlockModel.f46623a) {
                            lc00VarB3 = lc00Var5;
                            it6 = it;
                        }
                    } else {
                        lc00Var5 = lc00VarB3;
                        it = it6;
                        next2 = null;
                    }
                }
                ywd0 ywd0Var3 = (ywd0) next2;
                if (ywd0Var3 != null) {
                    arrayList7.add(ywd0Var3);
                }
                lc00VarB3 = lc00Var5;
                it6 = it;
            }
            lc00 lc00Var7 = lc00VarB3;
            Iterator it8 = arrayList7.iterator();
            while (it8.hasNext()) {
                switch (((ywd0) it8.next()).ordinal()) {
                    case 0:
                        ljgVar = ljgVar7;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        list = list10;
                        arrayList5 = arrayList5;
                        lc00Var = lc00Var6;
                        list2 = listM;
                        g0e0Var = g0e0Var3;
                        i12 = i12;
                        k0e0Var = k0e0Var;
                        ctf0Var = ctf0Var7;
                        lc00Var2 = lc00Var7;
                        i9 = i9;
                        list2.getClass();
                        qzd0 qzd0Var3 = (qzd0) CollectionsKt.W(i12, list);
                        if (qzd0Var3 != null) {
                            yzd0 yzd0Var = qzd0Var3.b;
                            boolean z6 = yzd0Var.b;
                            yzd0 yzd0Var2 = qzd0Var3.c;
                            if (z6 == yzd0Var2.b || qzd0Var3.f29574a.length() <= 0 || (i2 = yzd0Var.f43510a) == -1 || (i3 = yzd0Var2.f43510a) == -1 || (i2 == 0 && i3 == 0)) {
                                qzd0Var3 = null;
                            }
                        } else {
                            qzd0Var3 = null;
                        }
                        if (qzd0Var3 != null) {
                            yzd0 yzd0Var3 = qzd0Var3.b;
                            if (str6.length() != 0 && str4.length() != 0) {
                                list3 = list2;
                                String strT = vsm0.t(g7x.L(k0e0Var, list3));
                                String strT2 = vsm0.t(g7x.L(k0e0Var2, list3));
                                fp20 fp20Var = new fp20(yzd0Var3.b ? ijg.k1 : StaticColors.INSTANCE.m123getWhite0d7_KjU(), strT, str6, String.valueOf(yzd0Var3.f43510a));
                                yzd0 yzd0Var4 = qzd0Var3.c;
                                fp20 fp20Var2 = new fp20(yzd0Var4.b ? ijg.k1 : StaticColors.INSTANCE.m123getWhite0d7_KjU(), strT2, str4, String.valueOf(yzd0Var4.f43510a));
                                String str7 = str4;
                                String str8 = qzd0Var3.f29574a;
                                String str9 = zBooleanValue ? "Tablet" : "Mobile";
                                list10 = list;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String lowerCase = str8.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                str4 = str7;
                                String str10 = "/static/img/ImgDefault/Esports/Real/Rainbow/Maps/" + str9 + "/Left/" + lowerCase + ".png";
                                if (str10.length() == 0) {
                                    sb.setLength(0);
                                    i = 0;
                                } else {
                                    if (StringsKt.O(str10, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str10, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            c = '/';
                                        } else {
                                            c = '/';
                                            sb.append('/');
                                        }
                                        i = 0;
                                        sb.append(StringsKt.y0(str10, c));
                                    }
                                    sb.setLength(i);
                                    sb.append(str10);
                                }
                                wls wlsVar = new wls(fp20Var, fp20Var2, str8, sb.toString(), ctf0Var.b.a(R.string.cs2_statistic_map_finish, Arrays.copyOf(new Object[i], i)), false, null, zD);
                                lc00Var2.add(new psv("ABOUT_MAP", R.string.cyber_about_map));
                                lc00Var2.add(new tnb0(dyb.g0(wlsVar)));
                            }
                            str4 = str4;
                            lc00Var7 = lc00Var2;
                            k0e0Var = k0e0Var;
                            listM = list3;
                            i12 = i12;
                            i9 = i9;
                            ctf0Var7 = ctf0Var;
                            oxd0Var = oxd0Var;
                            wwd0Var = wwd0Var;
                            uwd0Var2 = uwd0Var2;
                            lc00Var6 = lc00Var;
                            g0e0Var3 = g0e0Var;
                            list10 = list10;
                            arrayList5 = arrayList5;
                            ljgVar7 = ljgVar;
                        }
                        list10 = list;
                        list3 = list2;
                        str4 = str4;
                        lc00Var7 = lc00Var2;
                        k0e0Var = k0e0Var;
                        listM = list3;
                        i12 = i12;
                        i9 = i9;
                        ctf0Var7 = ctf0Var;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        lc00Var6 = lc00Var;
                        g0e0Var3 = g0e0Var;
                        list10 = list10;
                        arrayList5 = arrayList5;
                        ljgVar7 = ljgVar;
                        break;
                    case 1:
                        ljgVar = ljgVar7;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        list = list10;
                        arrayList5 = arrayList5;
                        ctf0 ctf0Var8 = ctf0Var7;
                        lc00Var = lc00Var6;
                        list2 = listM;
                        lc00 lc00Var8 = lc00Var7;
                        g0e0Var = g0e0Var3;
                        i12 = i12;
                        int i13 = i10;
                        i9 = i9;
                        qzd0 qzd0Var4 = (qzd0) CollectionsKt.W(i12, list);
                        if (qzd0Var4 != null) {
                            yzd0 yzd0Var5 = qzd0Var4.c;
                            yzd0 yzd0Var6 = qzd0Var4.b;
                            if (x0x.Z(qzd0Var4)) {
                                k0e0Var = k0e0Var;
                                i10 = i13;
                                lc00Var2 = lc00Var8;
                                ctf0Var = ctf0Var8;
                            } else {
                                List list11 = yzd0Var6.c;
                                List list12 = yzd0Var5.c;
                                List listM2 = zsm0.m(ljgVar);
                                k0e0 k0e0Var3 = k0e0Var;
                                lc00Var2 = lc00Var8;
                                i10 = i13;
                                jlo0 jlo0VarP = g1x.p(k0e0Var3, listM2, list11, amo0.b, yzd0Var6.b, ctf0Var8);
                                k0e0Var = k0e0Var3;
                                jlo0 jlo0VarP2 = g1x.p(k0e0Var2, listM2, list12, amo0.f1119a, yzd0Var5.b, ctf0Var8);
                                ctf0Var = ctf0Var8;
                                if (jlo0VarP != null && jlo0VarP2 != null) {
                                    lc00Var2.add(new psv("STATISTIC_HEADER", R.string.statistic_info_players_stat));
                                    lc00Var2.add(jlo0VarP);
                                    lc00Var2.add(jlo0VarP2);
                                }
                            }
                        } else {
                            k0e0Var = k0e0Var;
                            i10 = i13;
                            lc00Var2 = lc00Var8;
                            ctf0Var = ctf0Var8;
                        }
                        list10 = list;
                        list3 = list2;
                        str4 = str4;
                        lc00Var7 = lc00Var2;
                        k0e0Var = k0e0Var;
                        listM = list3;
                        i12 = i12;
                        i9 = i9;
                        ctf0Var7 = ctf0Var;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        lc00Var6 = lc00Var;
                        g0e0Var3 = g0e0Var;
                        list10 = list10;
                        arrayList5 = arrayList5;
                        ljgVar7 = ljgVar;
                        break;
                    case 2:
                        ljgVar = ljgVar7;
                        int i14 = i9;
                        uwd0Var2 = uwd0Var2;
                        List list13 = list10;
                        ctf0Var2 = ctf0Var7;
                        lc00Var = lc00Var6;
                        list2 = listM;
                        lc00 lc00Var9 = lc00Var7;
                        g0e0Var = g0e0Var3;
                        i12 = i12;
                        qzd0 qzd0Var5 = (qzd0) CollectionsKt.W(i12, list13);
                        if (qzd0Var5 != null) {
                            List list14 = qzd0Var5.d;
                            if (list14.isEmpty()) {
                                i9 = i14;
                                i4 = i10;
                            } else {
                                List listM3 = zsm0.m(ljgVar);
                                zfg0 zfg0Var = unb0.f35953a;
                                listM3.getClass();
                                ArrayList arrayList8 = new ArrayList(r3d.q(list14, 10));
                                Iterator it9 = list14.iterator();
                                int i15 = 0;
                                while (it9.hasNext()) {
                                    Object next3 = it9.next();
                                    int i16 = i15 + 1;
                                    if (i15 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    uzd0 uzd0Var = (uzd0) next3;
                                    int i17 = uzd0Var.f36532a;
                                    int i18 = uzd0Var.b;
                                    if (i18 == 0 || i18 == 1) {
                                        cgg0Var = cgg0.b;
                                    } else if (i18 != 2) {
                                        cgg0Var = i18 != 3 ? null : cgg0.c;
                                    } else {
                                        cgg0Var = cgg0.e;
                                    }
                                    int i19 = i10;
                                    if (i19 != i17) {
                                        cgg0Var = null;
                                    }
                                    if (i18 == 0 || i18 == 1) {
                                        cgg0Var2 = cgg0.b;
                                    } else if (i18 != 2) {
                                        cgg0Var2 = i18 != 3 ? null : cgg0.c;
                                    } else {
                                        cgg0Var2 = cgg0.e;
                                    }
                                    int i20 = i14;
                                    if (i20 != i17) {
                                        cgg0Var2 = null;
                                    }
                                    dgg0 dgg0Var = dgg0.f6042a;
                                    Iterator it10 = it9;
                                    arrayList8.add(new zfg0(new bgg0(cgg0Var != null ? new egg0(cgg0Var, agg0.f824a) : dgg0Var), new bgg0(new fgg0(String.valueOf(i16), cgg0Var != null ? agg0.f824a : cgg0Var2 != null ? agg0.b : agg0.c)), new bgg0(cgg0Var2 != null ? new egg0(cgg0Var2, agg0.b) : dgg0Var)));
                                    it9 = it10;
                                    i15 = i16;
                                    i10 = i19;
                                    i14 = i20;
                                }
                                i9 = i14;
                                i4 = i10;
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                lc00VarB4.add(unb0.f35953a);
                                lc00VarB4.addAll(arrayList8);
                                ArrayList arrayListN0 = CollectionsKt.N0(kotlin.collections.a.a(lc00VarB4));
                                if (arrayList8.size() > 6) {
                                    arrayListN0.add(7, unb0.b);
                                }
                                hgg0 hgg0Var = new hgg0(dyb.o0(arrayListN0), vsm0.t(g7x.L(k0e0Var, listM3)), vsm0.t(g7x.L(k0e0Var2, listM3)), false);
                                lc00Var9.add(new psv("STATISTIC_ROUND_STAT_HEADER", R.string.round_statistics));
                                lc00Var9.add(hgg0Var);
                            }
                        } else {
                            i9 = i14;
                            i4 = i10;
                        }
                        list10 = list13;
                        i10 = i4;
                        lc00Var2 = lc00Var9;
                        ctf0Var = ctf0Var2;
                        list3 = list2;
                        str4 = str4;
                        lc00Var7 = lc00Var2;
                        k0e0Var = k0e0Var;
                        listM = list3;
                        i12 = i12;
                        i9 = i9;
                        ctf0Var7 = ctf0Var;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        lc00Var6 = lc00Var;
                        g0e0Var3 = g0e0Var;
                        list10 = list10;
                        arrayList5 = arrayList5;
                        ljgVar7 = ljgVar;
                        break;
                    case 3:
                        ljgVar = ljgVar7;
                        lc00 lc00Var10 = lc00Var6;
                        g0e0 g0e0Var4 = g0e0Var3;
                        i12 = i12;
                        ctf0 ctf0Var9 = ctf0Var7;
                        List list15 = listM;
                        lc00 lc00Var11 = lc00Var7;
                        long j = wwd0Var.h;
                        list15.getClass();
                        List list16 = g0e0Var4.h;
                        qzd0 qzd0Var6 = (qzd0) CollectionsKt.W(i12, list10);
                        if (qzd0Var6 != null) {
                            uwd0Var2 = uwd0Var2;
                            if (!qzd0Var6.e.isEmpty() || !list16.isEmpty()) {
                                lc00Var = lc00Var10;
                                ArrayList arrayListS = ewm0.s(v0e0.c, new oac0(qzd0Var6, g0e0Var4, (byte) 14));
                                aco0 aco0VarT = ewm0.t(j, arrayListS);
                                boo0 boo0VarK = qem0.k("STATISTIC_BANS_TABS", aco0VarT, arrayListS, ijg.k1, pno0.f27299a, ctf0Var9.j(), new iv80(ctf0Var9, (byte) 11));
                                if (aco0VarT != null) {
                                    j = aco0VarT.f639a;
                                }
                                u0e0[] u0e0VarArr = u0e0.f34850a;
                                String str11 = "%s/playerlogo/%s";
                                String str12 = "%s/%s";
                                if (j == 6) {
                                    ArrayList arrayList9 = new ArrayList(r3d.q(list16, 10));
                                    Iterator it11 = list16.iterator();
                                    int i21 = 0;
                                    while (it11.hasNext()) {
                                        Object next4 = it11.next();
                                        int i22 = i21 + 1;
                                        if (i21 < 0) {
                                            q3d.p();
                                            throw null;
                                        }
                                        Iterator it12 = it11;
                                        izd0 izd0Var = (izd0) next4;
                                        g0e0 g0e0Var5 = g0e0Var4;
                                        String str13 = izd0Var.e;
                                        String str14 = str11;
                                        String str15 = izd0Var.b;
                                        ctf0 ctf0Var10 = ctf0Var9;
                                        str6 = str6;
                                        k0e0 k0e0Var4 = str13.equalsIgnoreCase(str6) ? k0e0Var : k0e0Var2;
                                        List list17 = list15;
                                        String strL = g7x.L(k0e0Var4, list17);
                                        String str16 = str12;
                                        int i23 = izd0Var.f15630a;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(i23);
                                        sb2.append(i21);
                                        String string = sb2.toString();
                                        StringBuilder sb3 = new StringBuilder(ujn.h);
                                        String lowerCase2 = str15.toLowerCase(Locale.ROOT);
                                        lowerCase2.getClass();
                                        String str17 = "static/img/ImgDefault/Esports/Real/Rainbow/MapPicks/" + lowerCase2 + ".png";
                                        if (str17.length() == 0) {
                                            sb3.setLength(0);
                                            z3 = false;
                                        } else {
                                            if (StringsKt.O(str17, ujn.h, false)) {
                                                z3 = false;
                                            } else if (kotlin.text.c.x(str17, "https://", false)) {
                                                z3 = false;
                                            } else {
                                                if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                    i6 = 1;
                                                    c4 = '/';
                                                } else {
                                                    sb3.append('/');
                                                    c4 = '/';
                                                    i6 = 1;
                                                }
                                                char[] cArr = new char[i6];
                                                z3 = false;
                                                cArr[0] = c4;
                                                sb3.append(StringsKt.y0(str17, cArr));
                                            }
                                            sb3.setLength(z3 ? 1 : 0);
                                            sb3.append(str17);
                                        }
                                        String string2 = sb3.toString();
                                        if (kotlin.text.c.x(strL, ujn.h, z3)) {
                                            str3 = strL;
                                        } else {
                                            if (strL.length() != 0) {
                                                List list18 = u0d.f34849a;
                                                if (!u0d.c(strL)) {
                                                    String str18 = StringsKt.O(strL, "playerlogo/", true) ? str16 : str14;
                                                    Locale locale = Locale.ENGLISH;
                                                    Object[] objArr = {ujn.h, strL};
                                                    i7 = 2;
                                                    str3 = String.format(locale, str18, Arrays.copyOf(objArr, 2));
                                                }
                                                iOrdinal = izd0Var.d.ordinal();
                                                if (iOrdinal != 0) {
                                                    oud0Var = oud0.d;
                                                } else if (iOrdinal != 1) {
                                                    oud0Var = oud0.f25872a;
                                                } else if (iOrdinal != i7) {
                                                    oud0Var = oud0.b;
                                                } else {
                                                    if (iOrdinal == 3) {
                                                        t9f.b();
                                                        return null;
                                                    }
                                                    oud0Var = oud0.c;
                                                }
                                                arrayList9.add(new pud0(string, str3, string2, str15, oud0Var, nud0.f24142a));
                                                str12 = str16;
                                                i21 = i22;
                                                it11 = it12;
                                                str11 = str14;
                                                ctf0Var9 = ctf0Var10;
                                                g0e0Var4 = g0e0Var5;
                                                list15 = list17;
                                            }
                                            str3 = "";
                                        }
                                        i7 = 2;
                                        iOrdinal = izd0Var.d.ordinal();
                                        if (iOrdinal != 0) {
                                            oud0Var = oud0.d;
                                        } else if (iOrdinal != 1) {
                                            oud0Var = oud0.f25872a;
                                        } else if (iOrdinal != i7) {
                                            oud0Var = oud0.b;
                                        } else {
                                            if (iOrdinal == 3) {
                                                t9f.b();
                                                return null;
                                            }
                                            oud0Var = oud0.c;
                                        }
                                        arrayList9.add(new pud0(string, str3, string2, str15, oud0Var, nud0.f24142a));
                                        str12 = str16;
                                        i21 = i22;
                                        it11 = it12;
                                        str11 = str14;
                                        ctf0Var9 = ctf0Var10;
                                        g0e0Var4 = g0e0Var5;
                                        list15 = list17;
                                    }
                                    g0e0Var = g0e0Var4;
                                    ctf0Var2 = ctf0Var9;
                                    list2 = list15;
                                    qud0Var = new qud0(dyb.r0(arrayList9), "BANS_OPERATIVES");
                                    i9 = i9;
                                    list10 = list10;
                                } else {
                                    g0e0Var = g0e0Var4;
                                    ctf0Var2 = ctf0Var9;
                                    list2 = list15;
                                    if (j == 5) {
                                        qzd0 qzd0Var7 = (qzd0) list10.get(i12);
                                        List list19 = qzd0Var7.e;
                                        ArrayList arrayList10 = new ArrayList();
                                        for (Object obj6 : list19) {
                                            int i24 = i10;
                                            if (((mzd0) obj6).f22650a == i24) {
                                                arrayList10.add(obj6);
                                            }
                                            i10 = i24;
                                        }
                                        int i25 = i10;
                                        List list20 = qzd0Var7.e;
                                        ArrayList arrayList11 = new ArrayList();
                                        for (Object obj7 : list20) {
                                            int i26 = i9;
                                            if (((mzd0) obj7).f22650a == i26) {
                                                arrayList11.add(obj7);
                                            }
                                            i9 = i26;
                                        }
                                        int i27 = i9;
                                        ArrayList arrayList12 = new ArrayList(r3d.q(arrayList10, 10));
                                        Iterator it13 = arrayList10.iterator();
                                        int i28 = 0;
                                        while (true) {
                                            Iterator it14 = it13;
                                            if (it13.hasNext()) {
                                                Object next5 = it14.next();
                                                int i29 = i28 + 1;
                                                if (i28 < 0) {
                                                    q3d.p();
                                                    throw null;
                                                }
                                                mzd0 mzd0Var = (mzd0) next5;
                                                int i30 = i27;
                                                int i31 = mzd0Var.b;
                                                String str19 = mzd0Var.c;
                                                int i32 = i25;
                                                List list21 = list10;
                                                String str20 = "first_team_ban_" + i31 + i28;
                                                StringBuilder sb4 = new StringBuilder(ujn.h);
                                                String lowerCase3 = str19.toLowerCase(Locale.ROOT);
                                                lowerCase3.getClass();
                                                String str21 = "static/img/ImgDefault/Esports/Real/Rainbow/Operators/" + lowerCase3 + ".png";
                                                if (str21.length() == 0) {
                                                    z2 = false;
                                                    sb4.setLength(0);
                                                } else {
                                                    z2 = false;
                                                    if (StringsKt.O(str21, ujn.h, false)) {
                                                        sb4.setLength(z2 ? 1 : 0);
                                                        sb4.append(str21);
                                                    } else if (kotlin.text.c.x(str21, "https://", false)) {
                                                        z2 = false;
                                                        sb4.setLength(z2 ? 1 : 0);
                                                        sb4.append(str21);
                                                    } else {
                                                        if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                                                            c3 = '/';
                                                        } else {
                                                            c3 = '/';
                                                            sb4.append('/');
                                                        }
                                                        z2 = false;
                                                        sb4.append(StringsKt.y0(str21, c3));
                                                    }
                                                }
                                                String string3 = sb4.toString();
                                                String str22 = k0e0Var.d;
                                                if (kotlin.text.c.x(str22, ujn.h, z2)) {
                                                    str2 = str22;
                                                } else {
                                                    if (str22.length() != 0) {
                                                        List list22 = u0d.f34849a;
                                                        if (!u0d.c(str22)) {
                                                            str22 = String.format(Locale.ENGLISH, StringsKt.O(str22, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str22}, 2));
                                                            str2 = str22;
                                                        }
                                                    }
                                                    str2 = "";
                                                }
                                                arrayList12.add(new pud0(str20, str2, string3, str19, oud0.b, nud0.b));
                                                it13 = it14;
                                                i28 = i29;
                                                i27 = i30;
                                                i25 = i32;
                                                list10 = list21;
                                            } else {
                                                list10 = list10;
                                                i10 = i25;
                                                i9 = i27;
                                                ArrayList arrayList13 = new ArrayList(r3d.q(arrayList11, 10));
                                                Iterator it15 = arrayList11.iterator();
                                                int i33 = 0;
                                                while (it15.hasNext()) {
                                                    Object next6 = it15.next();
                                                    int i34 = i33 + 1;
                                                    if (i33 < 0) {
                                                        q3d.p();
                                                        throw null;
                                                    }
                                                    mzd0 mzd0Var2 = (mzd0) next6;
                                                    int i35 = mzd0Var2.b;
                                                    String str23 = mzd0Var2.c;
                                                    Iterator it16 = it15;
                                                    String str24 = "second_team_ban_" + i35 + i33;
                                                    StringBuilder sb5 = new StringBuilder(ujn.h);
                                                    String lowerCase4 = str23.toLowerCase(Locale.ROOT);
                                                    lowerCase4.getClass();
                                                    String str25 = "static/img/ImgDefault/Esports/Real/Rainbow/Operators/" + lowerCase4 + ".png";
                                                    if (str25.length() == 0) {
                                                        z = false;
                                                        sb5.setLength(0);
                                                    } else {
                                                        z = false;
                                                        if (StringsKt.O(str25, ujn.h, false)) {
                                                            sb5.setLength(z ? 1 : 0);
                                                            sb5.append(str25);
                                                        } else if (kotlin.text.c.x(str25, "https://", false)) {
                                                            z = false;
                                                            sb5.setLength(z ? 1 : 0);
                                                            sb5.append(str25);
                                                        } else {
                                                            if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                                                                i5 = 1;
                                                                c2 = '/';
                                                            } else {
                                                                sb5.append('/');
                                                                c2 = '/';
                                                                i5 = 1;
                                                            }
                                                            char[] cArr2 = new char[i5];
                                                            z = false;
                                                            cArr2[0] = c2;
                                                            sb5.append(StringsKt.y0(str25, cArr2));
                                                        }
                                                    }
                                                    String string4 = sb5.toString();
                                                    String str26 = k0e0Var2.d;
                                                    if (kotlin.text.c.x(str26, ujn.h, z)) {
                                                        str = str26;
                                                    } else {
                                                        if (str26.length() != 0) {
                                                            List list23 = u0d.f34849a;
                                                            if (!u0d.c(str26)) {
                                                                str26 = String.format(Locale.ENGLISH, StringsKt.O(str26, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str26}, 2));
                                                                str = str26;
                                                            }
                                                        }
                                                        str = "";
                                                    }
                                                    arrayList13.add(new pud0(str24, str, string4, str23, oud0.b, nud0.b));
                                                    it15 = it16;
                                                    i33 = i34;
                                                }
                                                qud0Var = new qud0(dyb.r0(CollectionsKt.q0(arrayList12, arrayList13)), "BANS_MAPS");
                                            }
                                        }
                                    } else {
                                        i9 = i9;
                                        list10 = list10;
                                        qud0Var = null;
                                    }
                                }
                                if (qud0Var == null) {
                                    lc00Var3 = lc00Var11;
                                } else {
                                    a4x a4xVar = boo0VarK.b.f10362a;
                                    if (a4xVar != null ? a4xVar.isEmpty() : true) {
                                        lc00Var3 = lc00Var11;
                                    } else {
                                        lc00Var3 = lc00Var11;
                                        lc00Var3.add(new psv("BANS_HEADER", R.string.bans_and_picks));
                                        lc00Var3.add(boo0VarK);
                                        lc00Var3.add(qud0Var);
                                    }
                                }
                            }
                            lc00Var2 = lc00Var3;
                            i9 = i9;
                            ctf0Var = ctf0Var2;
                            list3 = list2;
                            str4 = str4;
                            lc00Var7 = lc00Var2;
                            k0e0Var = k0e0Var;
                            listM = list3;
                            i12 = i12;
                            i9 = i9;
                            ctf0Var7 = ctf0Var;
                            oxd0Var = oxd0Var;
                            wwd0Var = wwd0Var;
                            uwd0Var2 = uwd0Var2;
                            lc00Var6 = lc00Var;
                            g0e0Var3 = g0e0Var;
                            list10 = list10;
                            arrayList5 = arrayList5;
                            ljgVar7 = ljgVar;
                        } else {
                            uwd0Var2 = uwd0Var2;
                        }
                        list10 = list10;
                        g0e0Var = g0e0Var4;
                        lc00Var = lc00Var10;
                        ctf0Var2 = ctf0Var9;
                        lc00Var3 = lc00Var11;
                        list2 = list15;
                        lc00Var2 = lc00Var3;
                        i9 = i9;
                        ctf0Var = ctf0Var2;
                        list3 = list2;
                        str4 = str4;
                        lc00Var7 = lc00Var2;
                        k0e0Var = k0e0Var;
                        listM = list3;
                        i12 = i12;
                        i9 = i9;
                        ctf0Var7 = ctf0Var;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        lc00Var6 = lc00Var;
                        g0e0Var3 = g0e0Var;
                        list10 = list10;
                        arrayList5 = arrayList5;
                        ljgVar7 = ljgVar;
                        break;
                    case 4:
                        lc00 lc00Var12 = lc00Var6;
                        List list24 = listM;
                        lc00 lc00Var13 = lc00Var7;
                        ctf0Var = ctf0Var7;
                        ljg ljgVar8 = ljgVar7;
                        arrayList5 = arrayList5;
                        n2x.s(lc00Var13, oxd0Var, wwd0Var.e, ctf0Var, list24);
                        g0e0Var = g0e0Var3;
                        lc00Var = lc00Var12;
                        list3 = list24;
                        ljgVar = ljgVar8;
                        lc00Var2 = lc00Var13;
                        str4 = str4;
                        str4 = str4;
                        lc00Var7 = lc00Var2;
                        k0e0Var = k0e0Var;
                        listM = list3;
                        i12 = i12;
                        i9 = i9;
                        ctf0Var7 = ctf0Var;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        lc00Var6 = lc00Var;
                        g0e0Var3 = g0e0Var;
                        list10 = list10;
                        arrayList5 = arrayList5;
                        ljgVar7 = ljgVar;
                        break;
                    case 5:
                        ctf0 ctf0Var11 = ctf0Var7;
                        lc00 lc00Var14 = lc00Var6;
                        List list25 = listM;
                        lc00 lc00Var15 = lc00Var7;
                        ljg ljgVar9 = ljgVar7;
                        arrayList5 = arrayList5;
                        g0e0 g0e0Var6 = g0e0Var3;
                        yyw.A(lc00Var15, g7x.L(k0e0Var, list25), g7x.L(k0e0Var2, list25), g0e0Var6, wwd0Var.b, ctf0Var11, zBooleanValue, zD);
                        lc00Var = lc00Var14;
                        list3 = list25;
                        ljgVar = ljgVar9;
                        g0e0Var = g0e0Var6;
                        lc00Var2 = lc00Var15;
                        ctf0Var = ctf0Var11;
                        str4 = str4;
                        str4 = str4;
                        lc00Var7 = lc00Var2;
                        k0e0Var = k0e0Var;
                        listM = list3;
                        i12 = i12;
                        i9 = i9;
                        ctf0Var7 = ctf0Var;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        lc00Var6 = lc00Var;
                        g0e0Var3 = g0e0Var;
                        list10 = list10;
                        arrayList5 = arrayList5;
                        ljgVar7 = ljgVar;
                        break;
                    case 6:
                        ctf0 ctf0Var12 = ctf0Var7;
                        List list26 = listM;
                        ljg ljgVar10 = ljgVar7;
                        arrayList5 = arrayList5;
                        lc00 lc00Var16 = lc00Var7;
                        jwb.x(lc00Var16, uwd0Var2.d, g7x.L(k0e0Var, list26), g7x.L(k0e0Var2, list26), ctf0Var12, zD);
                        lc00Var = lc00Var6;
                        list3 = list26;
                        ljgVar = ljgVar10;
                        g0e0Var = g0e0Var3;
                        lc00Var2 = lc00Var16;
                        ctf0Var = ctf0Var12;
                        str4 = str4;
                        str4 = str4;
                        lc00Var7 = lc00Var2;
                        k0e0Var = k0e0Var;
                        listM = list3;
                        i12 = i12;
                        i9 = i9;
                        ctf0Var7 = ctf0Var;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        lc00Var6 = lc00Var;
                        g0e0Var3 = g0e0Var;
                        list10 = list10;
                        arrayList5 = arrayList5;
                        ljgVar7 = ljgVar;
                        break;
                    case 7:
                        ljg ljgVar11 = ljgVar7;
                        arrayList5 = arrayList5;
                        lc00 lc00Var17 = lc00Var7;
                        zBooleanValue = zBooleanValue;
                        lc00 lc00Var18 = lc00Var6;
                        long j2 = wwd0Var.f;
                        boolean z7 = wwd0Var.g;
                        if (x2x.d0(ljgVar11) || (l2zVarD = n2z.d(j2, (arrayListA = n2z.a(ljgVar11, n2z.f22823a)))) == null) {
                            ctf0Var3 = ctf0Var7;
                            list4 = listM;
                            ljgVar2 = ljgVar11;
                        } else {
                            list4 = listM;
                            boo0 boo0VarC = q5x.C(ljgVar11, "LAST_MATCHES_TABS", l2zVarD, arrayListA, ijg.k1, ctf0Var7.b.a(R.string.head_2_head_meeting, Arrays.copyOf(new Object[0], 0)), ctf0Var7.j());
                            psv psvVar = new psv("LAST_MATCHES_HEADER", R.string.last_matches);
                            ctf0 ctf0Var13 = ctf0Var7;
                            m2z m2zVarB = n2z.b("LAST_MATCHES", ljgVar11, l2zVarD, z7, ctf0Var13, false, false, zD, new adw(ljgVar11, (byte) 25));
                            ljgVar2 = ljgVar11;
                            ctf0Var3 = ctf0Var13;
                            lc00Var17.add(psvVar);
                            lc00Var17.add(boo0VarC);
                            lc00Var17.add(m2zVarB);
                        }
                        lc00Var = lc00Var18;
                        ljgVar = ljgVar2;
                        ctf0Var = ctf0Var3;
                        g0e0Var = g0e0Var3;
                        lc00Var2 = lc00Var17;
                        list3 = list4;
                        str4 = str4;
                        str4 = str4;
                        lc00Var7 = lc00Var2;
                        k0e0Var = k0e0Var;
                        listM = list3;
                        i12 = i12;
                        i9 = i9;
                        ctf0Var7 = ctf0Var;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        lc00Var6 = lc00Var;
                        g0e0Var3 = g0e0Var;
                        list10 = list10;
                        arrayList5 = arrayList5;
                        ljgVar7 = ljgVar;
                        break;
                    case 8:
                        long j3 = wwd0Var.c;
                        boolean z8 = wwd0Var.d;
                        ljg ljgVar12 = ljgVar7;
                        ArrayList arrayListZ = zjb.z(ljgVar12, v0e0.d);
                        Iterator it17 = arrayListZ.iterator();
                        while (true) {
                            if (it17.hasNext()) {
                                next = it17.next();
                                long j4 = j3;
                                if (((mog) next).f22133a != j4) {
                                    j3 = j4;
                                }
                            } else {
                                next = null;
                            }
                        }
                        mog mogVar = (mog) next;
                        if (mogVar == null) {
                            mogVar = (mog) CollectionsKt.firstOrNull(arrayListZ);
                        }
                        mog mogVar2 = mogVar;
                        if (mogVar2 == null) {
                            ljgVar3 = ljgVar12;
                            lc00Var4 = lc00Var7;
                            z4 = zBooleanValue;
                        } else {
                            ljgVar3 = ljgVar12;
                            lc00Var4 = lc00Var7;
                            z4 = zBooleanValue;
                            boo0 boo0VarY = ahb.y(ljgVar3, mogVar2, arrayListZ, ijg.k1, z4);
                            ffr ffrVarU = ckb.U(ljgVar3, mogVar2, z8);
                            lc00Var4.add(new psv("FUTURE_GAMES_HEADER", R.string.cyber_future_matches));
                            lc00Var4.add(boo0VarY);
                            lc00Var4.add(ffrVarU);
                        }
                        ljgVar = ljgVar3;
                        zBooleanValue = z4;
                        ctf0Var = ctf0Var7;
                        lc00Var = lc00Var6;
                        g0e0Var = g0e0Var3;
                        lc00Var2 = lc00Var4;
                        list3 = listM;
                        str4 = str4;
                        str4 = str4;
                        lc00Var7 = lc00Var2;
                        k0e0Var = k0e0Var;
                        listM = list3;
                        i12 = i12;
                        i9 = i9;
                        ctf0Var7 = ctf0Var;
                        oxd0Var = oxd0Var;
                        wwd0Var = wwd0Var;
                        uwd0Var2 = uwd0Var2;
                        lc00Var6 = lc00Var;
                        g0e0Var3 = g0e0Var;
                        list10 = list10;
                        arrayList5 = arrayList5;
                        ljgVar7 = ljgVar;
                        break;
                    default:
                        t9f.b();
                        return null;
                }
            }
            ljg ljgVar13 = ljgVar7;
            lc00 lc00Var19 = lc00Var6;
            ctf0 ctf0Var14 = ctf0Var7;
            lc00Var19.addAll(kotlin.collections.a.a(lc00Var7));
            i4 i4VarG0 = dyb.g0(feb.K(ctf0Var14), n7x.w(ctf0Var14, arrayList5));
            lc00Var19.add(new psv("ADDITIONAL_INFO_HEADER", R.string.additional_info));
            lc00Var19.add(new wy(i4VarG0, "ADDITIONAL_INFO"));
            axd0Var = new zwd0(dyb.r0(kotlin.collections.a.a(lc00Var19)), z5, q3d.j(ljgVar13.b, ljgVar13.c));
            hxd0Var = hxd0Var2;
        } else {
            e0g0 e0g0Var = j0g0.b;
            if (this.n instanceof g0g0) {
                hxd0Var = hxd0Var2;
                axd0Var = new axd0(g2v.b(hxd0Var.k, ozb.J(hxd0Var.b.b, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, da10Var.f5727a, 0L, 602));
            } else {
                hxd0Var = hxd0Var2;
                axd0Var = bxd0.f3371a;
            }
        }
        p7m0 p7m0Var = hxd0Var.D;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, axd0Var));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:292:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x003c A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v46 java.lang.Object, still in use, count: 2, list:
          (r15v46 java.lang.Object) from 0x0061: PHI (r15 I:??) = (r15v43 java.lang.Object), (r15v46 java.lang.Object) binds: [B:15:0x0060, B:298:0x0061] A[DONT_GENERATE, DONT_INLINE]
          (r15v46 java.lang.Object) from 0x0059: CHECK_CAST (a.izt0) (r15v46 java.lang.Object)
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
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a310.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        byte b = this.i;
        w46 w46Var = this.q;
        Object obj7 = this.p;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                a310 a310Var = new a310((n210) obj7, (b310) w46Var, this.n, (yje) obj6, (byte) 0);
                a310Var.o = (n110) obj;
                a310Var.j = (da10) obj2;
                a310Var.k = (kam0) obj3;
                a310Var.l = zBooleanValue;
                a310Var.m = (List) obj5;
                return a310Var.invokeSuspend(Unit.f46060a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                a310 a310Var2 = new a310((uwd0) obj7, (hxd0) w46Var, this.n, (yje) obj6, (byte) 1);
                a310Var2.o = (wwd0) obj;
                a310Var2.j = (da10) obj2;
                a310Var2.k = (kam0) obj3;
                a310Var2.l = zBooleanValue2;
                a310Var2.m = (List) obj5;
                return a310Var2.invokeSuspend(Unit.f46060a);
            default:
                boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
                a310 a310Var3 = new a310((fzt0) obj7, (tzt0) w46Var, this.n, (yje) obj6, (byte) 2);
                a310Var3.o = (gzt0) obj;
                a310Var3.j = (da10) obj2;
                a310Var3.k = (kam0) obj3;
                a310Var3.l = zBooleanValue3;
                a310Var3.m = (List) obj5;
                return a310Var3.invokeSuspend(Unit.f46060a);
        }
    }
}
