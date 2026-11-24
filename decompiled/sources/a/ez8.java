package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ez8 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8660a = 1;
    public final ctf0 b;
    public final Object c;
    public final Object d;

    public ez8(az80 az80Var, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = new bz80(ctf0Var.b.a(R.string.our_partners, Arrays.copyOf(new Object[0], 0)));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:127:0x030e A[PHI: r12
  0x030e: PHI (r12v13 int) = (r12v12 int), (r12v18 int) binds: [B:116:0x02df, B:119:0x02e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x032c  */
    /* JADX WARN: Code duplicated, block: B:131:0x032f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0337  */
    /* JADX WARN: Code duplicated, block: B:135:0x033e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0341  */
    /* JADX WARN: Code duplicated, block: B:140:0x0347  */
    /* JADX WARN: Code duplicated, block: B:141:0x034c  */
    /* JADX WARN: Code duplicated, block: B:144:0x035d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0365  */
    /* JADX WARN: Code duplicated, block: B:147:0x0367  */
    /* JADX WARN: Code duplicated, block: B:151:0x0370  */
    /* JADX WARN: Code duplicated, block: B:152:0x0379  */
    /* JADX WARN: Code duplicated, block: B:154:0x037c  */
    /* JADX WARN: Code duplicated, block: B:155:0x037f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0398  */
    /* JADX WARN: Code duplicated, block: B:159:0x039b  */
    /* JADX WARN: Code duplicated, block: B:162:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:163:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:169:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:174:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:179:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:183:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:186:0x040c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0413  */
    /* JADX WARN: Code duplicated, block: B:190:0x0419  */
    /* JADX WARN: Code duplicated, block: B:191:0x041c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0422  */
    /* JADX WARN: Code duplicated, block: B:195:0x0429  */
    /* JADX WARN: Code duplicated, block: B:198:0x042f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0436  */
    /* JADX WARN: Code duplicated, block: B:236:0x0562  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fd  */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        boolean z;
        List listA;
        boolean z2;
        Iterable iterable;
        Iterable iterable2;
        boolean z3;
        Object next;
        ypl0 ypl0Var;
        List list;
        List list2;
        v9s v9sVar;
        String str;
        v9s v9sVar2;
        long j;
        String strJ;
        StringBuilder sb;
        String str2;
        nas nasVar;
        int i;
        int i2;
        char c;
        String str3;
        List list3;
        String str4;
        Long l;
        long jLongValue;
        String strF;
        String str5;
        String str6;
        List list4;
        String str7;
        Long l2;
        long jLongValue2;
        String strF2;
        String str8;
        long jLongValue3;
        String str9;
        String str10;
        Long l3;
        long jLongValue4;
        Integer num;
        int iIntValue;
        uw80 sw80Var;
        Object next2;
        Object next3;
        Object next4;
        boolean z4;
        zw80 xw80Var;
        int i3;
        char c2;
        rx80 px80Var;
        byte b = this.f8660a;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((cz8) obj).getClass();
                cz8 cz8Var = (cz8) obj4;
                return new dz8((imm) ((n0o0) obj5).getValue(), cz8Var.f5212a, cz8Var.b);
            default:
                az80 az80Var = (az80) obj;
                az80Var.getClass();
                j0g0 j0g0Var = az80Var.b;
                boolean z5 = az80Var.f1705a;
                if (j0g0Var == null && z5) {
                    listA = q3d.j(new nx80("shimmer_1"), new nx80("shimmer_2"), new nx80("shimmer_3"), new nx80("shimmer_4"), new nx80("shimmer_5"), new nx80("shimmer_6"), new nx80("shimmer_7"), new nx80("shimmer_8"));
                    obj2 = obj4;
                    obj3 = obj5;
                    z = z5;
                } else if (j0g0Var != null) {
                    Object obj6 = j0g0Var.f15681a;
                    boolean z6 = obj6 instanceof g0g0;
                    boolean z7 = true;
                    if (!z6) {
                        if (z6) {
                            obj6 = null;
                        }
                        Iterable iterable3 = (List) obj6;
                        if (iterable3 == null) {
                            iterable3 = iun.f15405a;
                        }
                        List list5 = az80Var.c;
                        Map map = az80Var.d;
                        ctf0 ctf0Var = this.b;
                        ctf0Var.getClass();
                        iterable3.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it = iterable3.iterator();
                        while (it.hasNext()) {
                            by80 by80Var = (by80) it.next();
                            if (list5.isEmpty()) {
                                z2 = false;
                            } else {
                                Iterator it2 = list5.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z2 = false;
                                    } else if (kotlin.text.c.o((String) it2.next(), by80Var.f3405a)) {
                                        z2 = z7;
                                    }
                                }
                            }
                            by80Var.getClass();
                            String str11 = by80Var.b;
                            String str12 = by80Var.f3405a;
                            lsm0 lsm0Var = ctf0Var.b;
                            ctf0 ctf0Var2 = ctf0Var;
                            Object obj7 = obj4;
                            Object obj8 = obj5;
                            Iterator it3 = it;
                            sx80 sx80Var = new sx80(str12, lsm0Var.a(R.string.partner_1x, Arrays.copyOf(new Object[0], 0)), new n0x(by80Var.c), new m0x(R.drawable.empty_team_ic, null, 6));
                            List<ypl0> list6 = by80Var.f;
                            String str13 = by80Var.d;
                            if (map.containsKey(str11)) {
                                cx80 ax80Var = str13.length() == 0 ? bx80.f3365a : new ax80(str13);
                                str11.getClass();
                                ex80 ex80Var = (ex80) map.get(str11);
                                if (ex80Var == null || (iterable = ex80Var.b) == null) {
                                    iterable = iun.f15405a;
                                }
                                ex80 ex80Var2 = (ex80) map.get(str11);
                                if (ex80Var2 == null || (iterable2 = ex80Var2.c) == null) {
                                    iterable2 = iun.f15405a;
                                }
                                nas nasVar2 = (nas) CollectionsKt.firstOrNull(CollectionsKt.A0(iterable, new lk30((byte) 14)));
                                if (nasVar2 == null) {
                                    sw80Var = tw80.f34638a;
                                    lc00VarB = lc00VarB;
                                    by80Var = by80Var;
                                    z3 = z2;
                                    sx80Var = sx80Var;
                                } else {
                                    Long l4 = nasVar2.w;
                                    oas oasVar = nasVar2.z;
                                    String str14 = oasVar.b;
                                    oas oasVar2 = nasVar2.y;
                                    String str15 = oasVar2.b;
                                    Iterator it4 = iterable2.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            next = it4.next();
                                            z3 = z2;
                                            Iterator it5 = it4;
                                            long j2 = ((ypl0) next).f43037a;
                                            if (l4 == null || j2 != l4.longValue()) {
                                                z2 = z3;
                                                it4 = it5;
                                            }
                                        } else {
                                            z3 = z2;
                                            next = null;
                                        }
                                    }
                                    ypl0 ypl0Var2 = (ypl0) next;
                                    String str16 = "";
                                    if (ypl0Var2 == null) {
                                        lel0.Companion.getClass();
                                        ypl0Var = new ypl0(0L, "", kel0.a());
                                    } else {
                                        ypl0Var = ypl0Var2;
                                    }
                                    List list7 = nasVar2.p;
                                    if (list7 != null) {
                                        Iterator it6 = list7.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                next4 = it6.next();
                                                Long l5 = ((u9s) next4).b;
                                                if (l5 != null && l5.longValue() == 1) {
                                                }
                                            } else {
                                                next4 = null;
                                            }
                                        }
                                        u9s u9sVar = (u9s) next4;
                                        if (u9sVar != null) {
                                            list = u9sVar.f35298a;
                                        } else {
                                            list = null;
                                        }
                                    } else {
                                        list = null;
                                    }
                                    if (list == null) {
                                        list = iun.f15405a;
                                    }
                                    List list8 = (List) CollectionsKt.firstOrNull(list);
                                    if (list8 != null) {
                                        Iterator it7 = list8.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                next3 = it7.next();
                                                list2 = list;
                                                Iterator it8 = it7;
                                                if (((v9s) next3).f37049a != 1) {
                                                    list = list2;
                                                    it7 = it8;
                                                }
                                            } else {
                                                list2 = list;
                                                next3 = null;
                                            }
                                        }
                                        v9sVar = (v9s) next3;
                                    } else {
                                        list2 = list;
                                        v9sVar = null;
                                    }
                                    List list9 = (List) CollectionsKt.f0(list2);
                                    if (list9 != null) {
                                        Iterator it9 = list9.iterator();
                                        while (true) {
                                            if (it9.hasNext()) {
                                                next2 = it9.next();
                                                Iterator it10 = it9;
                                                str = str16;
                                                if (((v9s) next2).f37049a != 3) {
                                                    it9 = it10;
                                                    str16 = str;
                                                }
                                            } else {
                                                str = str16;
                                                next2 = null;
                                            }
                                        }
                                        v9sVar2 = (v9s) next2;
                                    } else {
                                        str = "";
                                        v9sVar2 = null;
                                    }
                                    String strA = lsm0Var.a(R.string.next_match, Arrays.copyOf(new Object[0], 0));
                                    Long l6 = nasVar2.u;
                                    v9s v9sVar3 = v9sVar2;
                                    if (l6 != null) {
                                        long jLongValue5 = l6.longValue();
                                        rdj rdjVar = rdj.f30294a;
                                        znq0 znq0Var = new znq0(jLongValue5);
                                        wjo wjoVar = wjo.AGGREGATOR_TOURNAMENTS_DATE_DAY;
                                        Locale locale = Locale.getDefault();
                                        locale.getClass();
                                        Locale localeM = rdj.m(locale);
                                        j = 0;
                                        if (jLongValue5 > 0) {
                                            strJ = rdj.j(aoq0.a(znq0Var, "d MMMM", localeM), localeM);
                                        }
                                        sb = new StringBuilder(ujn.h);
                                        str2 = ypl0Var.c.f19909a;
                                        str2.getClass();
                                        if (str2.length() == 0) {
                                            sb.setLength(0);
                                            nasVar = nasVar2;
                                        } else {
                                            nasVar = nasVar2;
                                            i = 0;
                                            if (StringsKt.O(str2, ujn.h, false)) {
                                                sb.setLength(i);
                                                sb.append(str2);
                                            } else if (kotlin.text.c.x(str2, "https://", false)) {
                                                i = 0;
                                                sb.setLength(i);
                                                sb.append(str2);
                                            } else {
                                                if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                    i2 = 1;
                                                    c = '/';
                                                } else {
                                                    sb.append('/');
                                                    c = '/';
                                                    i2 = 1;
                                                }
                                                char[] cArr = new char[i2];
                                                cArr[0] = c;
                                                sb.append(StringsKt.y0(str2, cArr));
                                            }
                                        }
                                        pw80 pw80Var = new pw80(strA, strJ, new n0x(sb.toString()), new m0x(R.drawable.empty_team_ic, null, 6));
                                        if (str15 == null) {
                                            str3 = str;
                                        } else {
                                            str3 = str15;
                                        }
                                        list3 = oasVar2.d;
                                        if (list3 != null) {
                                            str4 = (String) CollectionsKt.firstOrNull(list3);
                                        } else {
                                            str4 = null;
                                        }
                                        if (str4 == null) {
                                            str4 = str;
                                        }
                                        l = oasVar2.f24944a;
                                        if (l != null) {
                                            jLongValue = l.longValue();
                                        } else {
                                            jLongValue = j;
                                        }
                                        n0x n0xVar = new n0x(vsm0.s(jLongValue, str4));
                                        boolean zD = Intrinsics.d(str15, str12);
                                        if (v9sVar != null) {
                                            strF = v9sVar.h;
                                            if (Intrinsics.d(strF, "SP")) {
                                                strF = "SP";
                                            } else if (strF != null || strF.length() <= 0) {
                                                pn40 pn40Var = pn40.f27267a;
                                                strF = pn40.f(v9sVar.b);
                                            }
                                        } else {
                                            strF = null;
                                        }
                                        if (strF == null) {
                                            str5 = str;
                                        } else {
                                            str5 = strF;
                                        }
                                        ox80 ox80Var = new ox80(str3, n0xVar, new m0x(R.drawable.ic_glyph_circle_globe, null, 6), zD, str5);
                                        if (str14 == null) {
                                            str6 = str;
                                        } else {
                                            str6 = str14;
                                        }
                                        list4 = oasVar.d;
                                        if (list4 != null) {
                                            str7 = (String) CollectionsKt.firstOrNull(list4);
                                        } else {
                                            str7 = null;
                                        }
                                        if (str7 == null) {
                                            str7 = str;
                                        }
                                        l2 = oasVar.f24944a;
                                        if (l2 != null) {
                                            jLongValue2 = l2.longValue();
                                        } else {
                                            jLongValue2 = j;
                                        }
                                        n0x n0xVar2 = new n0x(vsm0.s(jLongValue2, str7));
                                        boolean zD2 = Intrinsics.d(str14, str12);
                                        if (v9sVar3 != null) {
                                            strF2 = v9sVar3.h;
                                            if (Intrinsics.d(strF2, "SP")) {
                                                strF2 = "SP";
                                            } else if (strF2 != null || strF2.length() <= 0) {
                                                pn40 pn40Var2 = pn40.f27267a;
                                                strF2 = pn40.f(v9sVar3.b);
                                            }
                                        } else {
                                            strF2 = null;
                                        }
                                        if (strF2 == null) {
                                            str8 = str;
                                        } else {
                                            str8 = strF2;
                                        }
                                        rw80 rw80Var = new rw80(ox80Var, new ox80(str6, n0xVar2, new m0x(R.drawable.ic_glyph_circle_globe, null, 6), zD2, str8));
                                        nas nasVar3 = nasVar;
                                        long j3 = nasVar3.f23205a;
                                        long j4 = nasVar3.x;
                                        if (l4 != null) {
                                            jLongValue3 = l4.longValue();
                                        } else {
                                            jLongValue3 = j;
                                        }
                                        str9 = nasVar3.s;
                                        if (str9 == null) {
                                            str10 = str;
                                        } else {
                                            str10 = str9;
                                        }
                                        l3 = nasVar3.q;
                                        if (l3 != null) {
                                            jLongValue4 = l3.longValue();
                                        } else {
                                            jLongValue4 = j;
                                        }
                                        num = nasVar3.H;
                                        if (num != null) {
                                            iIntValue = num.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        sw80Var = new sw80(str12, pw80Var, rw80Var, new ow80(iIntValue, j3, j4, jLongValue3, jLongValue4, str10, kpb.u(nasVar3.r)));
                                    } else {
                                        j = 0;
                                    }
                                    strJ = str;
                                    sb = new StringBuilder(ujn.h);
                                    str2 = ypl0Var.c.f19909a;
                                    str2.getClass();
                                    if (str2.length() == 0) {
                                        sb.setLength(0);
                                        nasVar = nasVar2;
                                    } else {
                                        nasVar = nasVar2;
                                        i = 0;
                                        if (StringsKt.O(str2, ujn.h, false)) {
                                            sb.setLength(i);
                                            sb.append(str2);
                                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                                            i = 0;
                                            sb.setLength(i);
                                            sb.append(str2);
                                        } else {
                                            if (sb.length() > 0) {
                                                i2 = 1;
                                                c = '/';
                                            } else {
                                                i2 = 1;
                                                c = '/';
                                            }
                                            char[] cArr2 = new char[i2];
                                            cArr2[0] = c;
                                            sb.append(StringsKt.y0(str2, cArr2));
                                        }
                                    }
                                    pw80 pw80Var2 = new pw80(strA, strJ, new n0x(sb.toString()), new m0x(R.drawable.empty_team_ic, null, 6));
                                    if (str15 == null) {
                                        str3 = str;
                                    } else {
                                        str3 = str15;
                                    }
                                    list3 = oasVar2.d;
                                    if (list3 != null) {
                                        str4 = (String) CollectionsKt.firstOrNull(list3);
                                    } else {
                                        str4 = null;
                                    }
                                    if (str4 == null) {
                                        str4 = str;
                                    }
                                    l = oasVar2.f24944a;
                                    if (l != null) {
                                        jLongValue = l.longValue();
                                    } else {
                                        jLongValue = j;
                                    }
                                    n0x n0xVar3 = new n0x(vsm0.s(jLongValue, str4));
                                    boolean zD3 = Intrinsics.d(str15, str12);
                                    if (v9sVar != null) {
                                        strF = v9sVar.h;
                                        if (Intrinsics.d(strF, "SP")) {
                                            strF = "SP";
                                        } else if (strF != null) {
                                            pn40 pn40Var3 = pn40.f27267a;
                                            strF = pn40.f(v9sVar.b);
                                        } else {
                                            pn40 pn40Var4 = pn40.f27267a;
                                            strF = pn40.f(v9sVar.b);
                                        }
                                    } else {
                                        strF = null;
                                    }
                                    if (strF == null) {
                                        str5 = str;
                                    } else {
                                        str5 = strF;
                                    }
                                    ox80 ox80Var2 = new ox80(str3, n0xVar3, new m0x(R.drawable.ic_glyph_circle_globe, null, 6), zD3, str5);
                                    if (str14 == null) {
                                        str6 = str;
                                    } else {
                                        str6 = str14;
                                    }
                                    list4 = oasVar.d;
                                    if (list4 != null) {
                                        str7 = (String) CollectionsKt.firstOrNull(list4);
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 == null) {
                                        str7 = str;
                                    }
                                    l2 = oasVar.f24944a;
                                    if (l2 != null) {
                                        jLongValue2 = l2.longValue();
                                    } else {
                                        jLongValue2 = j;
                                    }
                                    n0x n0xVar4 = new n0x(vsm0.s(jLongValue2, str7));
                                    boolean zD4 = Intrinsics.d(str14, str12);
                                    if (v9sVar3 != null) {
                                        strF2 = v9sVar3.h;
                                        if (Intrinsics.d(strF2, "SP")) {
                                            strF2 = "SP";
                                        } else if (strF2 != null) {
                                            pn40 pn40Var5 = pn40.f27267a;
                                            strF2 = pn40.f(v9sVar3.b);
                                        } else {
                                            pn40 pn40Var6 = pn40.f27267a;
                                            strF2 = pn40.f(v9sVar3.b);
                                        }
                                    } else {
                                        strF2 = null;
                                    }
                                    if (strF2 == null) {
                                        str8 = str;
                                    } else {
                                        str8 = strF2;
                                    }
                                    rw80 rw80Var2 = new rw80(ox80Var2, new ox80(str6, n0xVar4, new m0x(R.drawable.ic_glyph_circle_globe, null, 6), zD4, str8));
                                    nas nasVar4 = nasVar;
                                    long j5 = nasVar4.f23205a;
                                    long j6 = nasVar4.x;
                                    if (l4 != null) {
                                        jLongValue3 = l4.longValue();
                                    } else {
                                        jLongValue3 = j;
                                    }
                                    str9 = nasVar4.s;
                                    if (str9 == null) {
                                        str10 = str;
                                    } else {
                                        str10 = str9;
                                    }
                                    l3 = nasVar4.q;
                                    if (l3 != null) {
                                        jLongValue4 = l3.longValue();
                                    } else {
                                        jLongValue4 = j;
                                    }
                                    num = nasVar4.H;
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    sw80Var = new sw80(str12, pw80Var2, rw80Var2, new ow80(iIntValue, j5, j6, jLongValue3, jLongValue4, str10, kpb.u(nasVar4.r)));
                                }
                                if (list6.isEmpty()) {
                                    xw80Var = yw80.f43359a;
                                    z4 = true;
                                } else {
                                    String strA2 = lsm0Var.a(R.string.other_lineups, Arrays.copyOf(new Object[0], 0));
                                    ArrayList arrayList = new ArrayList(r3d.q(list6, 10));
                                    for (ypl0 ypl0Var3 : list6) {
                                        long j7 = ypl0Var3.f43037a;
                                        StringBuilder sb2 = new StringBuilder(ujn.h);
                                        String str17 = ypl0Var3.c.j;
                                        str17.getClass();
                                        if (str17.length() == 0) {
                                            sb2.setLength(0);
                                        } else {
                                            if (StringsKt.O(str17, ujn.h, false)) {
                                                i3 = 0;
                                            } else if (kotlin.text.c.x(str17, "https://", false)) {
                                                i3 = 0;
                                            } else {
                                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                    c2 = '/';
                                                } else {
                                                    c2 = '/';
                                                    sb2.append('/');
                                                }
                                                sb2.append(StringsKt.y0(str17, c2));
                                            }
                                            sb2.setLength(i3);
                                            sb2.append(str17);
                                        }
                                        arrayList.add(new vw80(j7, new n0x(sb2.toString()), new m0x(R.drawable.ic_teamdetails_player_placeholder, null, 6), ypl0Var3.b));
                                    }
                                    z4 = true;
                                    xw80Var = new xw80(dyb.o0(arrayList), str12, strA2);
                                }
                                px80Var = new px80(ax80Var, sw80Var, xw80Var);
                            } else {
                                px80Var = qx80.f29470a;
                                map = map;
                                z5 = z5;
                                list5 = list5;
                                lc00VarB = lc00VarB;
                                by80Var = by80Var;
                                z3 = z2;
                                sx80Var = sx80Var;
                                z4 = true;
                            }
                            by80 by80Var2 = by80Var;
                            lc00 lc00Var = lc00VarB;
                            lc00Var.add(new jx80(by80Var2.b, by80Var2.f3405a, sx80Var, px80Var, z3 ? dx80.b : dx80.f6836a));
                            lc00VarB = lc00Var;
                            z7 = z4;
                            ctf0Var = ctf0Var2;
                            obj4 = obj7;
                            obj5 = obj8;
                            it = it3;
                            map = map;
                            z5 = z5;
                            list5 = list5;
                        }
                        obj2 = obj4;
                        obj3 = obj5;
                        z = z5;
                        listA = kotlin.collections.a.a(lc00VarB);
                    } else {
                        obj2 = obj4;
                        obj3 = obj5;
                        z = z5;
                        listA = iun.f15405a;
                    }
                } else {
                    obj2 = obj4;
                    obj3 = obj5;
                    z = z5;
                    listA = iun.f15405a;
                }
                bz80 bz80Var = (bz80) obj3;
                boolean zIsEmpty = listA.isEmpty();
                g2v g2vVar = (g2v) obj2;
                return new cz80(bz80Var, (!zIsEmpty || z) ? zIsEmpty ? new oy80(ozb.P(-1L, g2vVar)) : ny80.f24318a : new oy80(ozb.Q(-1L, g2vVar)), dyb.o0(listA));
        }
    }

    public ez8(cz8 cz8Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.c = cz8Var;
        this.b = ctf0Var;
        this.d = maz.b(new vb8(this, (byte) 12));
    }
}
