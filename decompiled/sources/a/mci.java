package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetViewType;
import org.xplatform.market_statistic.api.presentation.MarketStatisticParams;

/* JADX INFO: loaded from: classes4.dex */
public final class mci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21553a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;

    public mci(w000 w000Var, cad cadVar, ii iiVar, ctf0 ctf0Var, us00 us00Var, btt0 btt0Var, knf0 knf0Var, gii0 gii0Var, i1w0 i1w0Var, wrz wrzVar, duj dujVar) {
        this.c = wrzVar;
        this.b = cadVar;
        this.f21553a = ctf0Var;
        this.d = dujVar;
        this.e = i1w0Var;
        this.f = w000Var;
        this.g = gii0Var;
        this.h = btt0Var;
        this.i = knf0Var;
        this.j = us00Var;
        byte b = 1;
        this.k = mbl.b(new dci(this, 3, b));
        this.l = mbl.b(new dci(this, 2, b));
        this.m = mbl.b(new dci(this, b, b));
        this.n = mbl.b(new dci(this, 5, b));
        this.o = mbl.b(new dci(this, 4, b));
        this.p = mbl.b(new dci(this, 6, b));
        this.q = mbl.b(new dci(this, 7, b));
        this.r = new dci(this, 0, b);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x018c  */
    /* JADX WARN: Code duplicated, block: B:191:0x030c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:358:0x0800  */
    /* JADX WARN: Code duplicated, block: B:82:0x0151  */
    public ygs a(ygs ygsVar, z9s z9sVar, boolean z, boolean z2) {
        String str;
        long j;
        List list;
        ygs ygsVar2;
        ahs ahsVar;
        zgs zgsVar;
        String str2;
        long j2;
        kts ktsVar;
        ArrayList arrayList;
        ygs ygsVar3;
        ehs ehsVar;
        ahs ahsVar2;
        zgs zgsVar2;
        String str3;
        long j3;
        kts ktsVar2;
        BetGroupZip betGroupZip;
        xco xcoVar;
        BetGroupZip betGroupZip2;
        Long l;
        ArrayList arrayList2;
        Integer numValueOf;
        ehs ehsVar2;
        ahs ahsVar3;
        zgs zgsVar3;
        ArrayList arrayList3;
        BetZip betZipZ;
        kts ktsVar3;
        ehs ehsVar3;
        Map linkedHashMap;
        int i;
        List listJ;
        String str4;
        Object next;
        List listD0;
        List listD1;
        String str5;
        boolean z3;
        boolean z4;
        Double d;
        Double d2;
        Object next2;
        mci mciVar = this;
        ygs ygsVar4 = ygsVar;
        z9s z9sVar2 = z9sVar;
        String str6 = (String) mciVar.r;
        long j4 = ygsVar4.f42600a;
        ehs ehsVar4 = ygsVar4.i;
        byte b = 2;
        if (z) {
            upc upcVar = (upc) mciVar.j;
            str6.getClass();
            x9s x9sVar = upcVar.f36058a;
            x9sVar.getClass();
            las lasVar = x9sVar.f40522a;
            lasVar.getClass();
            lasVar.f19719a.compute(str6, new kas(new a21((byte) 14, j4), b));
        }
        x7u x7uVar = (x7u) mciVar.i;
        str6.getClass();
        x9s x9sVar2 = x7uVar.f40431a;
        x9sVar2.getClass();
        las lasVar2 = x9sVar2.f40522a;
        lasVar2.getClass();
        w9s w9sVar = (w9s) lasVar2.a(str6).f5766a.get(new bds(j4));
        zgs zgsVar4 = zgs.e;
        if (ehsVar4 != null) {
            ubr ubrVar = ehsVar4.C;
            int i2 = ubrVar.f35394a;
            ubr ubrVar2 = w9sVar != null ? w9sVar.g : null;
            boolean z5 = (ubrVar2 == null || ubrVar.equals(ubrVar2)) ? false : true;
            List list2 = ehsVar4.o;
            if (list2 != null) {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((cmr) next2).f4620a != dmr.t);
                cmr cmrVar = (cmr) next2;
                if (cmrVar != null) {
                    str5 = cmrVar.b;
                } else {
                    str5 = null;
                }
            } else {
                str5 = null;
            }
            if (str5 == null) {
                str5 = "";
            }
            List listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{Separators.SEMICOLON}, false, 0, 6, null);
            String str7 = (String) CollectionsKt.firstOrNull(listSplit$default);
            Integer intOrNull = str7 != null ? StringsKt.toIntOrNull(str7) : null;
            String str8 = (String) CollectionsKt.f0(listSplit$default);
            Double dI = str8 != null ? kotlin.text.b.i(str8) : null;
            List listJ2 = (intOrNull == null || dI == null) ? iun.f15405a : q3d.j(Double.valueOf(intOrNull.intValue() == 1 ? dI.doubleValue() : 0.0d), Double.valueOf(intOrNull.intValue() == 2 ? dI.doubleValue() : 0.0d));
            List list3 = w9sVar != null ? w9sVar.d : null;
            boolean z6 = (listJ2.isEmpty() || list3 == null || listJ2.equals(list3)) ? false : true;
            if (z5 || z6) {
                int i3 = ubrVar.b;
                if (i2 > (ubrVar2 != null ? ubrVar2.f35394a : 0)) {
                    z3 = true;
                } else {
                    Double d3 = (Double) CollectionsKt.firstOrNull(listJ2);
                    if ((d3 != null ? d3.doubleValue() : 0.0d) > ((list3 == null || (d2 = (Double) CollectionsKt.firstOrNull(list3)) == null) ? 0.0d : d2.doubleValue())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                boolean z7 = i2 < (ubrVar2 != null ? ubrVar2.f35394a : 0);
                if (i3 > (ubrVar2 != null ? ubrVar2.b : 0)) {
                    z4 = true;
                } else {
                    Double d4 = (Double) CollectionsKt.f0(listJ2);
                    if ((d4 != null ? d4.doubleValue() : 0.0d) > ((list3 == null || (d = (Double) CollectionsKt.f0(list3)) == null) ? 0.0d : d.doubleValue())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                zgsVar4 = new zgs(z3, z4, z7, i3 < (ubrVar2 != null ? ubrVar2.b : 0));
            }
        }
        ahs ahsVar4 = ahs.e;
        if (ehsVar4 == null) {
            str = str6;
            j = j4;
        } else {
            String str9 = w9sVar != null ? w9sVar.e : null;
            if (str9 == null) {
                str = str6;
                j = j4;
            } else {
                int i4 = ehsVar4.c;
                List list4 = ehsVar4.e;
                if (list4 == null) {
                    list4 = iun.f15405a;
                }
                StringBuilder sb = new StringBuilder();
                int i5 = 0;
                for (Object obj : list4) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str10 = str6;
                    tf90 tf90Var = ((df90) obj).b;
                    long j5 = j4;
                    sb.append(tf90Var.b + "-" + tf90Var.c);
                    if (i5 != list4.size() - 1) {
                        sb.append(", ");
                    }
                    i5 = i6;
                    str6 = str10;
                    j4 = j5;
                }
                str = str6;
                j = j4;
                String string = sb.toString();
                int i7 = gql0.f11739a;
                if (i4 > 0) {
                    string = gql0.c(i4, string);
                }
                boolean zEquals = str9.equals(string);
                List listSplit$default2 = StringsKt__StringsKt.split$default(str9, new String[]{Separators.COMMA}, false, 0, 6, null);
                if (listSplit$default2.isEmpty()) {
                    listD0 = iun.f15405a;
                    break;
                }
                ListIterator listIterator = listSplit$default2.listIterator(listSplit$default2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listD0 = iun.f15405a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        listD0 = CollectionsKt.D0(listSplit$default2, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                List listSplit$default3 = StringsKt__StringsKt.split$default(string, new String[]{Separators.COMMA}, false, 0, 6, null);
                if (listSplit$default3.isEmpty()) {
                    listD1 = iun.f15405a;
                    break;
                }
                ListIterator listIterator2 = listSplit$default3.listIterator(listSplit$default3.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        listD1 = iun.f15405a;
                        break;
                    }
                    if (((String) listIterator2.previous()).length() != 0) {
                        listD1 = CollectionsKt.D0(listSplit$default3, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
                boolean z8 = listD0.size() != listD1.size();
                List listZ = z1x.z(listD0);
                List listZ2 = z1x.z(listD1);
                if (listZ2.size() == 2 && listZ.size() == 2 && !zEquals && !z8) {
                    boolean zD = Intrinsics.d(CollectionsKt.W(0, listZ), CollectionsKt.W(0, listZ2));
                    boolean zD2 = Intrinsics.d(CollectionsKt.W(1, listZ), CollectionsKt.W(1, listZ2));
                    double dH = z1x.H(0, listZ2);
                    double dH2 = z1x.H(1, listZ2);
                    double dH3 = z1x.H(0, listZ);
                    double dH4 = z1x.H(1, listZ);
                    ahsVar4 = new ahs(!zD && dH > dH3, !zD2 && dH2 > dH4, !zD && dH < dH3, !zD2 && dH2 < dH4);
                }
            }
        }
        vas vasVar = ehsVar4 != null ? ehsVar4.h : null;
        kts ktsVar4 = w9sVar != null ? w9sVar.f : null;
        String str11 = vasVar != null ? vasVar.f37106a : null;
        if (str11 == null) {
            str11 = "";
        }
        String str12 = vasVar != null ? vasVar.b : null;
        if (str12 == null) {
            str12 = "";
        }
        kts ktsVar5 = ktsVar4 == null ? new kts(str11, str12, false, false) : new kts(str11, str12, sj3.o0(str11, ktsVar4.f18881a), sj3.o0(str12, ktsVar4.b));
        boolean zContains = z9sVar2.f44035a.contains(Long.valueOf(ygsVar4.b));
        ulk ulkVar = (ulk) ((bbw0) mciVar.g).b;
        List<u9s> list5 = ygsVar4.y;
        int i8 = 10;
        if (list5 == null) {
            list = iun.f15405a;
            ahsVar = ahsVar4;
            zgsVar = zgsVar4;
            str2 = str;
            j2 = j;
            ktsVar = ktsVar5;
            ygsVar2 = ygsVar4;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (u9s u9sVar : list5) {
                List list6 = u9sVar.f35298a;
                ArrayList arrayList5 = arrayList4;
                Long l2 = u9sVar.b;
                if (list6 == null || l2 == null) {
                    arrayList = arrayList5;
                    ygsVar3 = ygsVar4;
                    ehsVar = ehsVar4;
                    ahsVar2 = ahsVar4;
                    zgsVar2 = zgsVar4;
                    str3 = str;
                    j3 = j;
                    ktsVar2 = ktsVar5;
                    betGroupZip = null;
                } else {
                    xco xcoVar2 = (xco) z9sVar2.d.get(l2);
                    String str13 = xcoVar2 != null ? xcoVar2.b : null;
                    if (str13 == null || str13.length() == 0) {
                        ulkVar.a();
                        xcoVar = null;
                    } else {
                        xcoVar = xcoVar2;
                    }
                    if (xcoVar != null) {
                        List<List> list7 = u9sVar.f35298a;
                        if (list7 != null) {
                            Long l3 = l2;
                            ArrayList arrayList6 = new ArrayList(r3d.q(list7, i8));
                            for (List<v9s> list8 : list7) {
                                Boolean bool = u9sVar.c;
                                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                j1q0 j1q0Var = (j1q0) mciVar.o;
                                ArrayList arrayList7 = arrayList6;
                                ArrayList arrayList8 = new ArrayList();
                                for (v9s v9sVar : list8) {
                                    ueo ueoVar = (ueo) z9sVar2.e.get(Long.valueOf(v9sVar.f37049a));
                                    if (ueoVar == null) {
                                        ulkVar.a();
                                    }
                                    if (ueoVar != null) {
                                        bek bekVar = sip.f32274a;
                                        boolean z9 = ygsVar4.c;
                                        bekVar.getClass();
                                        sip sipVarF = bek.f(z9);
                                        ahs ahsVar5 = ahsVar4;
                                        long j6 = ygsVar4.f42600a;
                                        zgs zgsVar5 = zgsVar4;
                                        long j7 = ygsVar4.d;
                                        ahsVar3 = ahsVar5;
                                        zgsVar3 = zgsVar5;
                                        ehsVar2 = ehsVar4;
                                        arrayList3 = arrayList8;
                                        betZipZ = wha0.Z(v9sVar, ueoVar, j1q0Var.f15748a.j(), sipVarF, j6, j7, xcoVar.b, ((us3) ((peg0) mciVar.d).b).a(), true, zBooleanValue, w9sVar, z9sVar2, z2, j1q0Var.f15748a.f() || ((pru) mciVar.p).a().O1);
                                    } else {
                                        ehsVar2 = ehsVar4;
                                        ahsVar3 = ahsVar4;
                                        zgsVar3 = zgsVar4;
                                        arrayList3 = arrayList8;
                                        betZipZ = null;
                                    }
                                    if (betZipZ != null) {
                                        arrayList3.add(betZipZ);
                                    }
                                    mciVar = this;
                                    z9sVar2 = z9sVar;
                                    arrayList8 = arrayList3;
                                    l3 = l3;
                                    j1q0Var = j1q0Var;
                                    u9sVar = u9sVar;
                                    str = str;
                                    j = j;
                                    ehsVar4 = ehsVar2;
                                    zgsVar4 = zgsVar3;
                                    ahsVar4 = ahsVar3;
                                    ktsVar5 = ktsVar5;
                                    arrayList5 = arrayList5;
                                    xcoVar = xcoVar;
                                    ygsVar4 = ygsVar;
                                }
                                arrayList7.add(CollectionsKt.A0(arrayList8, new vvt((byte) 3)));
                                mciVar = this;
                                ygsVar4 = ygsVar;
                                z9sVar2 = z9sVar;
                                arrayList6 = arrayList7;
                                u9sVar = u9sVar;
                            }
                            l = l3;
                            arrayList2 = arrayList6;
                        } else {
                            l = l2;
                            arrayList2 = null;
                        }
                        arrayList = arrayList5;
                        xco xcoVar3 = xcoVar;
                        ehsVar = ehsVar4;
                        ahsVar2 = ahsVar4;
                        zgsVar2 = zgsVar4;
                        str3 = str;
                        j3 = j;
                        ktsVar2 = ktsVar5;
                        List list9 = arrayList2;
                        if (arrayList2 == null) {
                            list9 = iun.f15405a;
                        }
                        Iterator it2 = list9.iterator();
                        if (it2.hasNext()) {
                            numValueOf = Integer.valueOf(((List) it2.next()).size());
                            while (it2.hasNext()) {
                                Integer numValueOf2 = Integer.valueOf(((List) it2.next()).size());
                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                    numValueOf = numValueOf2;
                                }
                            }
                        } else {
                            numValueOf = null;
                        }
                        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        ArrayList arrayList9 = new ArrayList();
                        for (int i9 = 0; i9 < iIntValue; i9++) {
                            Iterator it3 = list9.iterator();
                            while (it3.hasNext()) {
                                BetZip betZip = (BetZip) CollectionsKt.W(i9, (List) it3.next());
                                if (betZip != null) {
                                    arrayList9.add(betZip);
                                }
                            }
                        }
                        long jLongValue = l.longValue();
                        ygsVar3 = ygsVar;
                        int size = ygsVar3.d == 40 ? arrayList9.size() : list9.size();
                        betGroupZip2 = new BetGroupZip(ygsVar3.d, jLongValue, xcoVar3.b, (int) xcoVar3.c, size, arrayList9, cy2.A(arrayList9, (jLongValue == 1316 || jLongValue == 1315) ? BetViewType.b : BetViewType.f46430a, size));
                    } else {
                        arrayList = arrayList5;
                        ygsVar3 = ygsVar4;
                        ehsVar = ehsVar4;
                        ahsVar2 = ahsVar4;
                        zgsVar2 = zgsVar4;
                        str3 = str;
                        j3 = j;
                        ktsVar2 = ktsVar5;
                        betGroupZip2 = null;
                    }
                    betGroupZip = betGroupZip2;
                }
                ArrayList arrayList10 = arrayList;
                if (betGroupZip != null) {
                    arrayList10.add(betGroupZip);
                }
                mciVar = this;
                z9sVar2 = z9sVar;
                ygsVar4 = ygsVar3;
                arrayList4 = arrayList10;
                str = str3;
                j = j3;
                ehsVar4 = ehsVar;
                zgsVar4 = zgsVar2;
                ahsVar4 = ahsVar2;
                ktsVar5 = ktsVar2;
                i8 = 10;
            }
            list = arrayList4;
            ygsVar2 = ygsVar4;
            ahsVar = ahsVar4;
            zgsVar = zgsVar4;
            str2 = str;
            j2 = j;
            ktsVar = ktsVar5;
        }
        ehs ehsVar5 = ehsVar4;
        if (ehsVar5 != null) {
            zgs zgsVar6 = zgsVar;
            ahs ahsVar6 = ahsVar;
            ktsVar3 = ktsVar;
            ehsVar3 = new ehs(ehsVar5.f7822a, ehsVar5.b, ehsVar5.c, ehsVar5.d, ehsVar5.e, ehsVar5.f, ehsVar5.g, ehsVar5.h, ehsVar5.i, ehsVar5.j, ehsVar5.k, ehsVar5.l, ehsVar5.m, ehsVar5.n, ehsVar5.o, ehsVar5.p, ktsVar3.c, ktsVar3.d, ahsVar6.f888a, ahsVar6.b, zgsVar6.f44359a, zgsVar6.b, ahsVar6.c, ahsVar6.d, zgsVar6.c, zgsVar6.d, ehsVar5.A, ehsVar5.B, ehsVar5.C);
        } else {
            ktsVar3 = ktsVar;
            ehsVar3 = null;
        }
        long j8 = ygsVar2.f42600a;
        long j9 = ygsVar2.b;
        boolean z10 = ygsVar2.c;
        long j10 = ygsVar2.d;
        String str14 = ygsVar2.e;
        long j11 = ygsVar2.f;
        boolean z11 = ygsVar2.g;
        String str15 = ygsVar2.h;
        kts ktsVar6 = ktsVar3;
        long j12 = ygsVar2.j;
        long j13 = ygsVar2.k;
        List list10 = ygsVar2.l;
        List list11 = ygsVar2.m;
        String str16 = ygsVar2.n;
        String str17 = ygsVar2.o;
        String str18 = ygsVar2.p;
        List list12 = ygsVar2.q;
        List list13 = ygsVar2.r;
        String str19 = ygsVar2.s;
        boolean z12 = ygsVar2.t;
        boolean z13 = ygsVar2.u;
        boolean z14 = ygsVar2.w;
        List list14 = ygsVar2.y;
        long j14 = ygsVar2.z;
        String str20 = ygsVar2.A;
        long j15 = ygsVar2.B;
        list10.getClass();
        list11.getClass();
        list12.getClass();
        list13.getClass();
        ygs ygsVar5 = new ygs(j8, j9, z10, j10, str14, j11, z11, str15, ehsVar3, j12, j13, list10, list11, str16, str17, str18, list12, list13, str19, z12, z13, zContains, z14, list, list14, j14, str20, j15);
        ehs ehsVar6 = ehsVar3;
        if (list != null) {
            ArrayList<BetZip> arrayList11 = new ArrayList();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                w3d.u(arrayList11, ((BetGroupZip) it4.next()).f);
            }
            int iA = wp20.a(r3d.q(arrayList11, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (BetZip betZip2 : arrayList11) {
                betZip2.getClass();
                linkedHashMap.put(new g97(gq80.f0(Long.valueOf(betZip2.f46426a), Long.valueOf(betZip2.c), Double.valueOf(betZip2.d), betZip2.t)), new zyc(betZip2.b, betZip2.v));
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = lun.f20680a;
            linkedHashMap.getClass();
        }
        Map map = linkedHashMap;
        Collection collection = ygsVar5.x;
        if (collection == null) {
            collection = iun.f15405a;
        }
        boolean z15 = (w9sVar != null && w9sVar.b) || !collection.isEmpty();
        String str21 = ehsVar6 != null ? ehsVar6.d : null;
        String str22 = str21 == null ? "" : str21;
        if (ehsVar6 != null) {
            List list15 = ehsVar6.o;
            if (list15 != null) {
                Iterator it5 = list15.iterator();
                do {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                } while (((cmr) next).f4620a != dmr.t);
                cmr cmrVar2 = (cmr) next;
                if (cmrVar2 != null) {
                    str4 = cmrVar2.b;
                } else {
                    str4 = null;
                }
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            i = 0;
            List listSplit$default4 = StringsKt__StringsKt.split$default(str4, new String[]{Separators.SEMICOLON}, false, 0, 6, null);
            String str23 = (String) CollectionsKt.firstOrNull(listSplit$default4);
            Integer intOrNull2 = str23 != null ? StringsKt.toIntOrNull(str23) : null;
            String str24 = (String) CollectionsKt.f0(listSplit$default4);
            Double dI2 = str24 != null ? kotlin.text.b.i(str24) : null;
            listJ = (intOrNull2 == null || dI2 == null) ? iun.f15405a : q3d.j(Double.valueOf(intOrNull2.intValue() == 1 ? dI2.doubleValue() : 0.0d), Double.valueOf(intOrNull2.intValue() == 2 ? dI2.doubleValue() : 0.0d));
        } else {
            i = 0;
            listJ = iun.f15405a;
        }
        List list16 = listJ;
        String strO = ehsVar6 != null ? c9x.o(ehsVar6) : null;
        w9s w9sVar2 = new w9s(map, z15, str22, list16, strO == null ? "" : strO, ktsVar6, ehsVar6 != null ? ehsVar6.C : new ubr(i, i));
        x9s x9sVar3 = ((gyg0) this.n).f12128a;
        x9sVar3.getClass();
        las lasVar3 = x9sVar3.f40522a;
        lasVar3.getClass();
        byte b2 = 3;
        lasVar3.f19719a.compute(str2, new kas(new ub4(j2, w9sVar2, b2), b2));
        return ygsVar5;
    }

    public cu b() {
        return new cu(new rpt(c()), new yqc(c(), (byte) 20), ((g45) ((wsf0) this.q).b).G(), (byte) 16);
    }

    public kki c() {
        return new kki(new vqc((gii0) this.g, (byte) 21), (knf0) this.i, (o0j) this.b, (btt0) this.h, (mne) this.e);
    }

    public kki d() {
        return new kki(new f4u(m(), (byte) 0), (kc60) this.p, new crt(c()), (pru) this.k, new nmt(c()), (byte) 29);
    }

    public j2j e() {
        return new j2j(b(), (mne) this.e, d(), (duj) this.d, (kc60) this.p, new nmt(c()), new g4u(c()), k(), (m1e) this.r, new g4u(c()), (pru) this.k);
    }

    public f3j f() {
        return new f3j((rl1) this.f, (iqt) this.j, (mne) this.e, (ctf0) this.f21553a, new q5j(), l(), new crt(c()), new rpt(c()), (oeg0) this.l, (peg0) this.m, (b4j) this.n, (je) this.o, (pru) this.k, (kc60) this.p, h());
    }

    public g3j g() {
        return new g3j((rl1) this.f, (ctf0) this.f21553a, l(), new q5j(), new crt(c()), (oeg0) this.l, (peg0) this.m, (b4j) this.n, (je) this.o);
    }

    public pmi h() {
        return new pmi((Object) new nmt(c()), (Object) new crt(c()), (Object) new crt(c()), (Object) new nmt(c()), (byte) 29);
    }

    public ArrayList i(List list, z9s z9sVar, boolean z) {
        Object g0g0Var;
        List list2;
        ygs ygsVar;
        bek bekVar = sip.f32274a;
        rbb rbbVar = (rbb) CollectionsKt.firstOrNull(list);
        byte b = 0;
        boolean z2 = (rbbVar == null || (list2 = rbbVar.p) == null || (ygsVar = (ygs) CollectionsKt.firstOrNull(list2)) == null || !ygsVar.c) ? false : true;
        bekVar.getClass();
        sip sipVarF = bek.f(z2);
        String str = (String) this.r;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = Boolean.valueOf(((wsc) this.m).f39683a.f());
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = Boolean.FALSE;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        boolean zBooleanValue = ((Boolean) g0g0Var).booleanValue();
        kou kouVar = (kou) this.l;
        str.getClass();
        x9s x9sVar = kouVar.f18646a;
        x9sVar.getClass();
        las lasVar = x9sVar.f40522a;
        lasVar.getClass();
        Boolean bool = (Boolean) lasVar.a(str).b.get(sipVarF);
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
        x9s x9sVar2 = ((nyg0) this.k).f24329a;
        x9sVar2.getClass();
        las lasVar2 = x9sVar2.f40522a;
        lasVar2.getClass();
        lasVar2.f19719a.compute(str, new kas(new jv1((Object) sipVarF, zBooleanValue, (byte) 23), b));
        boolean z3 = zBooleanValue != zBooleanValue2;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rbb rbbVar2 = (rbb) it.next();
            List<sum0> list3 = rbbVar2.d;
            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
            for (sum0 sum0Var : list3) {
                List list4 = sum0Var.m;
                ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(a((ygs) it2.next(), z9sVar, z3, z));
                }
                arrayList2.add(sum0.a(sum0Var, false, arrayList3, 24575));
            }
            List list5 = rbbVar2.p;
            ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList4.add(a((ygs) it3.next(), z9sVar, z3, z));
            }
            arrayList.add(rbb.a(rbbVar2, arrayList2, false, arrayList4, 98295));
        }
        return arrayList;
    }

    public y3v j() {
        return new y3v((nx20) this.k, new onv((gii0) this.g, (byte) 14), (knf0) this.i);
    }

    public n660 k() {
        g45 g45Var = (g45) ((wsf0) this.q).b;
        return new n660(g45Var.G(), new qot(c()), g45Var.F(), g45Var.E());
    }

    public kd30 l() {
        return new kd30((pru) this.k, new qot(c()));
    }

    public roi0 m() {
        return new roi0((q7d0) this.c);
    }

    public mci(h9c h9cVar, pj9 pj9Var, z8u z8uVar, peg0 peg0Var, dj9 dj9Var, e1u e1uVar, bbw0 bbw0Var, cmt cmtVar, x7u x7uVar, upc upcVar, nyg0 nyg0Var, kou kouVar, wsc wscVar, gyg0 gyg0Var, j1q0 j1q0Var, pru pruVar) {
        j1q0Var.getClass();
        this.c = h9cVar;
        this.b = pj9Var;
        this.f21553a = z8uVar;
        this.d = peg0Var;
        this.e = dj9Var;
        this.f = e1uVar;
        this.g = bbw0Var;
        this.h = cmtVar;
        this.i = x7uVar;
        this.j = upcVar;
        this.k = nyg0Var;
        this.l = kouVar;
        this.m = wscVar;
        this.n = gyg0Var;
        this.o = j1q0Var;
        this.p = pruVar;
        this.q = maz.b(new jcs(this, (byte) 19));
        this.r = axq.g();
    }

    public mci(cad cadVar, pmi0 pmi0Var, lme0 lme0Var, i1w0 i1w0Var, tgk tgkVar, gii0 gii0Var, String str, m1e m1eVar, wyu wyuVar, ctf0 ctf0Var, Long l, knf0 knf0Var, s9m0 s9m0Var, tqt tqtVar, ocl oclVar, uyu uyuVar, pru pruVar, r9u r9uVar) {
        this.c = str;
        this.d = l;
        this.b = cadVar;
        this.g = gii0Var;
        this.f = tgkVar;
        this.i = knf0Var;
        this.h = m1eVar;
        this.e = i1w0Var;
        this.j = oclVar;
        this.f21553a = ctf0Var;
        this.k = s9m0Var;
        this.l = tqtVar;
        this.m = pmi0Var;
        this.n = pruVar;
        this.o = uyuVar;
        this.p = wyuVar;
        this.q = r9uVar;
        this.r = new ppi(this, (byte) 16);
    }

    public mci(d1p d1pVar, poq0 poq0Var, epi0 epi0Var, zx10 zx10Var, peg0 peg0Var, pek pekVar, zg zgVar, czt cztVar, pmi0 pmi0Var, ouu ouuVar, lbu lbuVar, kj5 kj5Var, mne mneVar, bst bstVar, ctf0 ctf0Var, pru pruVar, gst0 gst0Var) {
        this.c = d1pVar;
        this.b = zgVar;
        this.d = pmi0Var;
        this.e = kj5Var;
        this.f = peg0Var;
        this.g = zx10Var;
        this.h = pekVar;
        this.i = ouuVar;
        this.j = mneVar;
        this.f21553a = ctf0Var;
        this.l = pruVar;
        this.m = gst0Var;
        this.n = poq0Var;
        this.o = epi0Var;
        this.p = cztVar;
        this.q = bstVar;
        this.r = lbuVar;
        this.k = n0k0.a(new rki(this, (byte) 24));
    }

    public mci(cad cadVar, d1p d1pVar, pmi0 pmi0Var, sxs0 sxs0Var, String str, String str2, Long l, oaa0 oaa0Var, i1w0 i1w0Var, duj dujVar, gii0 gii0Var, m1e m1eVar, wyu wyuVar, knf0 knf0Var, ctf0 ctf0Var, uyu uyuVar, ocl oclVar, yo4 yo4Var) {
        this.f21553a = ctf0Var;
        this.c = pmi0Var;
        this.g = gii0Var;
        this.i = knf0Var;
        this.b = cadVar;
        this.f = wyuVar;
        this.h = str2;
        this.j = str;
        this.k = l;
        this.e = i1w0Var;
        this.d = dujVar;
        this.l = m1eVar;
        this.m = oclVar;
        this.n = uyuVar;
        this.o = oaa0Var;
        this.p = yo4Var;
        this.q = d1pVar;
        this.r = new eni(this, (byte) 12);
    }

    public mci(cad cadVar, vqc vqcVar, i1w0 i1w0Var, ctf0 ctf0Var, knf0 knf0Var, MarketStatisticParams marketStatisticParams, zfo zfoVar, gii0 gii0Var, g2v g2vVar, m1e m1eVar, rou rouVar, ieu ieuVar, pru pruVar, gst0 gst0Var, x0u x0uVar, nx20 nx20Var, j1q0 j1q0Var) {
        this.c = marketStatisticParams;
        this.d = vqcVar;
        this.f = pruVar;
        this.b = cadVar;
        this.e = i1w0Var;
        this.h = g2vVar;
        this.j = m1eVar;
        this.f21553a = ctf0Var;
        this.k = nx20Var;
        this.g = gii0Var;
        this.i = knf0Var;
        this.l = x0uVar;
        this.m = gst0Var;
        this.n = ieuVar;
        this.o = rouVar;
        this.p = j1q0Var;
        this.q = zfoVar;
        this.r = new rki(this, (byte) 3);
    }

    public mci(cad cadVar, iw20 iw20Var, nv20 nv20Var, v6k v6kVar, gr70 gr70Var, sue sueVar, ii iiVar, yoc yocVar, yoc yocVar2, gsb gsbVar, zg zgVar, c1d0 c1d0Var, rpc rpcVar, rqc rqcVar, au0 au0Var, ctf0 ctf0Var, bsc bscVar, wgu wguVar, o470 o470Var) {
        this.c = wguVar;
        this.d = iw20Var;
        this.e = rpcVar;
        this.f = nv20Var;
        this.g = yocVar;
        this.h = yocVar2;
        this.i = gr70Var;
        this.j = gsbVar;
        this.k = zgVar;
        this.l = c1d0Var;
        this.m = rqcVar;
        this.n = sueVar;
        this.o = au0Var;
        this.p = bscVar;
        this.f21553a = ctf0Var;
        this.b = cadVar;
        this.q = o470Var;
        this.r = new uci(this, (byte) 1);
    }

    public mci(wsf0 wsf0Var, rl1 rl1Var, q7d0 q7d0Var, ctf0 ctf0Var, gii0 gii0Var, mne mneVar, duj dujVar, pru pruVar, btt0 btt0Var, o0j o0jVar, kc60 kc60Var, iqt iqtVar, m1e m1eVar, knf0 knf0Var, oeg0 oeg0Var, peg0 peg0Var, b4j b4jVar, je jeVar) {
        this.c = q7d0Var;
        this.g = gii0Var;
        this.i = knf0Var;
        this.b = o0jVar;
        this.h = btt0Var;
        this.e = mneVar;
        this.f = rl1Var;
        this.j = iqtVar;
        this.f21553a = ctf0Var;
        this.k = pruVar;
        this.l = oeg0Var;
        this.m = peg0Var;
        this.n = b4jVar;
        this.o = jeVar;
        this.p = kc60Var;
        this.q = wsf0Var;
        this.d = dujVar;
        this.r = m1eVar;
    }
}
