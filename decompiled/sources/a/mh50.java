package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class mh50 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ nh50 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh50(nh50 nh50Var, int i, int i2, long j, yje yjeVar) {
        super(2, yjeVar);
        this.j = nh50Var;
        this.k = i;
        this.l = i2;
        this.m = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new mh50(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mh50) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v23, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [a.ri50] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [a.jg50] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [a.bi50] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [a.ni50] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r51v0 */
    /* JADX WARN: Type inference failed for: r51v1, types: [a.eh50] */
    /* JADX WARN: Type inference failed for: r51v2 */
    /* JADX WARN: Type inference failed for: r52v0 */
    /* JADX WARN: Type inference failed for: r52v1, types: [a.vg50] */
    /* JADX WARN: Type inference failed for: r52v3 */
    /* JADX WARN: Type inference failed for: r59v0 */
    /* JADX WARN: Type inference failed for: r59v1, types: [a.fi50] */
    /* JADX WARN: Type inference failed for: r59v2 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [a.lun, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [a.bg50] */
    /* JADX WARN: Type inference failed for: r9v30 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        String str;
        ?? vg50Var;
        ?? fi50Var;
        List list;
        Collection collectionValues;
        List listL0;
        fg50 fg50Var;
        ?? arrayList;
        ?? bi50Var;
        ?? ni50Var;
        ?? linkedHashMap;
        ?? arrayList2;
        Iterator it;
        Object next;
        ng50 ng50Var;
        ?? bg50Var;
        ?? ri50Var;
        boolean z;
        wne wneVar = wne.f39444a;
        boolean z2 = this.i;
        rh50 rh50Var = null;
        boolean zBooleanValue = true;
        nh50 nh50Var = this.j;
        if (!z2) {
            z1x.P(obj);
            knf0 knf0Var = nh50Var.d;
            knf0 knf0Var2 = nh50Var.d;
            int iB = knf0Var.b();
            knf0Var2.getClass();
            String strA = nh50Var.e.a();
            knf0Var2.getClass();
            knf0Var2.getClass();
            iw20 iw20Var = nh50Var.f23518a;
            jo20 jo20Var = new jo20();
            int i = this.k;
            if (i <= 0) {
                i = iB;
            }
            jo20Var.put("country", Integer.valueOf(i));
            if (iB > 0) {
                jo20Var.put("fcountry", Integer.valueOf(iB));
            }
            int i2 = this.l;
            if (i2 > 0) {
                jo20Var.put("globalChampId", Integer.valueOf(i2));
            }
            jo20Var.put("gr", 1357);
            if (strA.length() == 0) {
                strA = "en";
            }
            jo20Var.put("lng", strA);
            jo20Var.put("ref", 1);
            jo20 jo20VarJ = w6x.j(22, jo20Var, "whence");
            this.i = true;
            objA = ((ag50) ((tpv) iw20Var.f15470a).invoke()).a(jo20VarJ, this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objA = obj;
        }
        qh50 qh50Var = (qh50) ((dx5) objA).a();
        Long l = qh50Var.d;
        wh50 wh50Var = qh50Var.o;
        Long l2 = qh50Var.e;
        qoj0 qoj0Var = (qoj0) nh50Var.b.b;
        boolean z3 = l2 != null && l2.longValue() == 1;
        qi50 qi50Var = wh50Var != null ? wh50Var.j : null;
        if (qi50Var != null) {
            Long l3 = qi50Var.f28774a;
            long jLongValue = l3 != null ? l3.longValue() : 0L;
            Long l4 = qi50Var.b;
            boolean z4 = l4 != null && l4.longValue() == 1;
            if (z3) {
                Boolean bool = qi50Var.c;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                    z = zBooleanValue;
                } else {
                    z = false;
                }
            } else {
                z = zBooleanValue;
            }
            qoj0Var.g(new dj50(jLongValue, 0L, z4, z, z3));
        } else if (!z3 && l != null) {
            long jLongValue2 = l.longValue() - this.m;
            qoj0Var.g(new dj50(jLongValue2 < 0 ? 0L : jLongValue2, 0L, true, jLongValue2 > 0, false));
        }
        if (wh50Var != null) {
            Regex regex = sh50.f32195a;
            String str2 = wh50Var.f39150a;
            String strReplace = str2 != null ? sh50.f32195a.replace(str2, " : ") : null;
            String str3 = strReplace == null ? "" : strReplace;
            ig50 ig50Var = wh50Var.b;
            if (ig50Var != null) {
                qg50 qg50Var = ig50Var.f14720a;
                if (qg50Var != null) {
                    Long l5 = qg50Var.f28667a;
                    if (l5 == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue3 = l5.longValue();
                    Long l6 = qg50Var.b;
                    if (l6 == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue4 = l6.longValue();
                    str = null;
                    Double d = qg50Var.c;
                    double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                    String str4 = qg50Var.d;
                    ng50Var = new ng50(jLongValue3, jLongValue4, dDoubleValue, str4 == null ? "" : str4);
                } else {
                    str = null;
                    ng50Var = null;
                }
                eg50 eg50Var = ig50Var.b;
                if (eg50Var != null) {
                    ui50 ui50Var = eg50Var.f7746a;
                    if (ui50Var != null) {
                        String str5 = ui50Var.f35714a;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = ui50Var.b;
                        if (str6 == null) {
                            str6 = "";
                        }
                        ri50Var = new ri50(str5, str6);
                    } else {
                        ri50Var = str;
                    }
                    bg50Var = new bg50(ri50Var);
                } else {
                    bg50Var = str;
                }
                fg50Var = new fg50(ng50Var, bg50Var);
            } else {
                str = null;
                fg50Var = null;
            }
            List<lh50> list2 = wh50Var.c;
            int i3 = 10;
            if (list2 != null) {
                arrayList = new ArrayList(r3d.q(list2, 10));
                for (lh50 lh50Var : list2) {
                    lh50Var.getClass();
                    Long l7 = lh50Var.f20038a;
                    long jLongValue5 = l7 != null ? l7.longValue() : 0L;
                    Long l8 = lh50Var.b;
                    long jLongValue6 = l8 != null ? l8.longValue() : 0L;
                    Long l9 = lh50Var.c;
                    long jLongValue7 = l9 != null ? l9.longValue() : 0L;
                    String str7 = lh50Var.d;
                    String str8 = str7 == null ? "" : str7;
                    String str9 = lh50Var.e;
                    String str10 = str9 == null ? "" : str9;
                    Long l10 = lh50Var.f;
                    arrayList.add(new ih50(jLongValue5, jLongValue6, jLongValue7, str8, str10, l10 != null ? l10.longValue() : 0L));
                }
            } else {
                arrayList = str;
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            ?? r25 = arrayList;
            mg50 mg50Var = wh50Var.d;
            ?? jg50Var = mg50Var != null ? new jg50(mg50Var.f21726a, mg50Var.b) : str;
            ei50 ei50Var = wh50Var.e;
            if (ei50Var != null) {
                String str11 = ei50Var.f7842a;
                if (str11 == null) {
                    str11 = "";
                }
                String str12 = ei50Var.b;
                if (str12 == null) {
                    str12 = "";
                }
                bi50Var = new bi50(str11, str12);
            } else {
                bi50Var = str;
            }
            Long l11 = wh50Var.f;
            long jLongValue8 = l11 != null ? l11.longValue() : -1L;
            String str13 = wh50Var.g;
            String str14 = str13 == null ? "" : str13;
            Boolean bool2 = wh50Var.h;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            String str15 = wh50Var.i;
            String str16 = str15 == null ? "" : str15;
            qi50 qi50Var2 = wh50Var.j;
            if (qi50Var2 != null) {
                Long l12 = qi50Var2.f28774a;
                long jLongValue9 = l12 != null ? l12.longValue() : -1L;
                Long l13 = qi50Var2.b;
                long jLongValue10 = l13 != null ? l13.longValue() : -1L;
                Boolean bool3 = qi50Var2.c;
                ni50Var = new ni50(jLongValue9, bool3 != null ? bool3.booleanValue() : false, jLongValue10);
            } else {
                ni50Var = str;
            }
            Map map = wh50Var.k;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    List list3 = (List) entry.getValue();
                    if (list3 != null) {
                        arrayList2 = new ArrayList(r3d.q(list3, i3));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            mi50 mi50Var = (mi50) it2.next();
                            mi50Var.getClass();
                            Long l14 = mi50Var.f21827a;
                            long jLongValue11 = l14 != null ? l14.longValue() : -1L;
                            String str17 = mi50Var.b;
                            String str18 = str17 == null ? "" : str17;
                            String str19 = mi50Var.c;
                            String str20 = str19 == null ? "" : str19;
                            String str21 = mi50Var.d;
                            String str22 = str21 == null ? "" : str21;
                            evz evzVar = cj50.b;
                            long jLongValue12 = l14 != null ? l14.longValue() : -1L;
                            evzVar.getClass();
                            Iterator it3 = cj50.h.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    it = it2;
                                    next = str;
                                    break;
                                }
                                next = it3.next();
                                it = it2;
                                if (((cj50) next).f4443a == jLongValue12) {
                                    break;
                                }
                                it2 = it;
                            }
                            cj50 cj50Var = (cj50) next;
                            if (cj50Var == null) {
                                cj50Var = cj50.UNKNOWN;
                            }
                            arrayList2.add(new ji50(jLongValue11, str18, str20, str22, cj50Var));
                            it2 = it;
                        }
                    } else {
                        arrayList2 = str;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = iun.f15405a;
                    }
                    linkedHashMap.put(key, arrayList2);
                    i3 = 10;
                }
            } else {
                linkedHashMap = str;
            }
            if (linkedHashMap == 0) {
                linkedHashMap = lun.f20680a;
                linkedHashMap.getClass();
            }
            rh50Var = new rh50(str3, fg50Var, r25, jg50Var, bi50Var, jLongValue8, str14, zBooleanValue2, str16, ni50Var, linkedHashMap);
        } else {
            str = null;
        }
        Long l15 = qh50Var.f28723a;
        long jLongValue13 = l15 != null ? l15.longValue() : -1L;
        Long l16 = qh50Var.b;
        long jLongValue14 = l16 != null ? l16.longValue() : -1L;
        Long l17 = qh50Var.c;
        long jLongValue15 = l17 != null ? l17.longValue() : -1L;
        long jLongValue16 = l != null ? l.longValue() : -1L;
        long jLongValue17 = l2 != null ? l2.longValue() : -1L;
        ai50 ai50Var = qh50Var.f;
        if (ai50Var == null) {
            jf4.k(str);
            return str;
        }
        String str23 = ai50Var.f908a;
        String str24 = str23 == null ? "" : str23;
        Boolean bool4 = ai50Var.b;
        if (bool4 == null) {
            jf4.k(str);
            return str;
        }
        boolean zBooleanValue3 = bool4.booleanValue();
        String str25 = ai50Var.c;
        String str26 = str25 == null ? "" : str25;
        String str27 = ai50Var.d;
        String str28 = str27 == null ? "" : str27;
        Long l18 = ai50Var.e;
        if (l18 == null) {
            jf4.k(str);
            return str;
        }
        long jLongValue18 = l18.longValue();
        String str29 = ai50Var.f;
        xh50 xh50Var = new xh50(jLongValue18, str24, str26, str28, str29 == null ? "" : str29, zBooleanValue3);
        ug50 ug50Var = qh50Var.g;
        if (ug50Var == null) {
            jf4.k(str);
            return str;
        }
        String str30 = ug50Var.f35608a;
        String str31 = str30 == null ? "" : str30;
        String str32 = ug50Var.b;
        String str33 = str32 == null ? "" : str32;
        String str34 = ug50Var.c;
        String str35 = str34 == null ? "" : str34;
        Boolean bool5 = ug50Var.d;
        if (bool5 == null) {
            jf4.k(str);
            return str;
        }
        boolean zBooleanValue4 = bool5.booleanValue();
        Long l19 = ug50Var.e;
        if (l19 == null) {
            jf4.k(str);
            return str;
        }
        long jLongValue19 = l19.longValue();
        String str36 = ug50Var.f;
        String str37 = str36 == null ? "" : str36;
        Long l20 = ug50Var.g;
        rg50 rg50Var = new rg50(str31, str33, str35, zBooleanValue4, jLongValue19, str37, l20 != null ? l20.longValue() : -1L);
        hh50 hh50Var = qh50Var.h;
        if (hh50Var == null) {
            jf4.k(str);
            return str;
        }
        eh50 eh50VarY = azw.Y(hh50Var);
        hh50 hh50Var2 = qh50Var.i;
        ?? Y = hh50Var2 != null ? azw.Y(hh50Var2) : str;
        yg50 yg50Var = qh50Var.j;
        if (yg50Var != null) {
            String str38 = yg50Var.f42571a;
            String str39 = str38 == null ? "" : str38;
            String str40 = yg50Var.b;
            String str41 = str40 == null ? "" : str40;
            String str42 = yg50Var.c;
            String str43 = str42 == null ? "" : str42;
            String str44 = yg50Var.d;
            String str45 = str44 == null ? "" : str44;
            String str46 = yg50Var.e;
            String str47 = str46 == null ? "" : str46;
            String str48 = yg50Var.f;
            String str49 = str48 == null ? "" : str48;
            String str50 = yg50Var.g;
            String str51 = str50 == null ? "" : str50;
            String str52 = yg50Var.h;
            String str53 = str52 == null ? "" : str52;
            String str54 = yg50Var.i;
            String str55 = str54 == null ? "" : str54;
            String str56 = yg50Var.j;
            String str57 = str56 == null ? "" : str56;
            String str58 = yg50Var.k;
            String str59 = str58 == null ? "" : str58;
            String str60 = yg50Var.l;
            String str61 = str60 == null ? "" : str60;
            String str62 = yg50Var.m;
            String str63 = str62 == null ? "" : str62;
            String str64 = yg50Var.n;
            String str65 = str64 == null ? "" : str64;
            String str66 = yg50Var.o;
            String str67 = str66 == null ? "" : str66;
            String str68 = yg50Var.p;
            String str69 = str68 == null ? "" : str68;
            String str70 = yg50Var.q;
            String str71 = str70 == null ? "" : str70;
            String str72 = yg50Var.r;
            String str73 = str72 == null ? "" : str72;
            String str74 = yg50Var.s;
            String str75 = str74 == null ? "" : str74;
            String str76 = yg50Var.t;
            String str77 = str76 == null ? "" : str76;
            String str78 = yg50Var.u;
            String str79 = str78 == null ? "" : str78;
            String str80 = yg50Var.v;
            String str81 = str80 == null ? "" : str80;
            String str82 = yg50Var.w;
            String str83 = str82 == null ? "" : str82;
            String str84 = yg50Var.x;
            String str85 = str84 == null ? "" : str84;
            String str86 = yg50Var.y;
            String str87 = str86 == null ? "" : str86;
            String str88 = yg50Var.z;
            String str89 = str88 == null ? "" : str88;
            String str90 = yg50Var.A;
            String str91 = str90 == null ? "" : str90;
            String str92 = yg50Var.B;
            String str93 = str92 == null ? "" : str92;
            String str94 = yg50Var.C;
            String str95 = str94 == null ? "" : str94;
            String str96 = yg50Var.D;
            String str97 = str96 == null ? "" : str96;
            String str98 = yg50Var.E;
            vg50Var = new vg50(str39, str41, str43, str45, str47, str49, str51, str53, str55, str57, str59, str61, str63, str65, str67, str69, str71, str73, str75, str77, str79, str81, str83, str85, str87, str89, str91, str93, str95, str97, str98 == null ? "" : str98);
        } else {
            vg50Var = str;
        }
        Boolean bool6 = qh50Var.k;
        boolean zBooleanValue5 = bool6 != null ? bool6.booleanValue() : false;
        String str99 = qh50Var.l;
        String str100 = str99 == null ? "" : str99;
        String str101 = qh50Var.m;
        String str102 = str101 == null ? "" : str101;
        ii50 ii50Var = qh50Var.n;
        if (ii50Var != null) {
            Long l21 = ii50Var.f14813a;
            if (l21 == null) {
                jf4.k(str);
                return str;
            }
            long jLongValue20 = l21.longValue();
            String str103 = ii50Var.b;
            if (str103 == null) {
                str103 = "";
            }
            String str104 = ii50Var.c;
            fi50Var = new fi50(jLongValue20, str103, str104 != null ? str104 : "");
        } else {
            fi50Var = str;
        }
        List listR = (rh50Var == null || (collectionValues = rh50Var.k.values()) == null || (listL0 = CollectionsKt.L0(collectionValues)) == null) ? iun.f15405a : r3d.r(listL0);
        if (rh50Var == null || (list = rh50Var.c) == null) {
            list = iun.f15405a;
        }
        return new zg50(jLongValue13, jLongValue14, jLongValue15, jLongValue16, jLongValue17, xh50Var, rg50Var, eh50VarY, Y, vg50Var, zBooleanValue5, str100, str102, rh50Var, listR, list, fi50Var);
    }
}
