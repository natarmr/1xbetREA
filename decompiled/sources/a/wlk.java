package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wlk extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public String j;
    public boolean k;
    public final /* synthetic */ pmi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wlk(pmi pmiVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = pmiVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pmi pmiVar = this.l;
        switch (b) {
            case 0:
                return new wlk(pmiVar, yjeVar, (byte) 0);
            case 1:
                return new wlk(pmiVar, yjeVar, (byte) 1);
            case 2:
                return new wlk(pmiVar, yjeVar, (byte) 2);
            case 3:
                return new wlk(pmiVar, yjeVar, (byte) 3);
            default:
                return new wlk(pmiVar, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((wlk) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objD;
        String str2;
        eos0 eos0Var;
        Object objA;
        String str3;
        String str4;
        Object objF;
        String strC;
        Object objC;
        String strC2;
        Object objE;
        byte b = this.i;
        pmi pmiVar = this.l;
        ArrayList arrayList = null;
        switch (b) {
            case 0:
                vlk vlkVar = (vlk) pmiVar.c;
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    String strC3 = ((knf0) pmiVar.d).c();
                    clc clcVar = (clc) pmiVar.b;
                    long jA = vlkVar.a(ylk.APP_STRINGS, strC3);
                    this.j = strC3;
                    this.k = true;
                    str = strC3;
                    objD = ((xlk) ((sza) clcVar.b).invoke()).d(54, 65228, str, jA, this);
                    if (objD == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = this.j;
                    z1x.P(obj);
                    str = str5;
                    objD = obj;
                }
                gos0 gos0Var = (gos0) ((dx5) objD).a();
                Long l = gos0Var.f11648a;
                if (l != null) {
                    long jLongValue = l.longValue();
                    ylk ylkVar = ylk.APP_STRINGS;
                    Objects.toString(ylkVar);
                    vlkVar.c(ylkVar, jLongValue, str);
                }
                List<fos0> list = gos0Var.b;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    for (fos0 fos0Var : list) {
                        fos0Var.getClass();
                        str.getClass();
                        String str6 = fos0Var.f9898a;
                        if (str6 == null) {
                            str6 = "";
                        }
                        List list2 = fos0Var.b;
                        if (list2 == null || (eos0Var = (eos0) CollectionsKt.firstOrNull(list2)) == null || (str2 = eos0Var.f8151a) == null) {
                            str2 = "";
                        }
                        arrayList2.add(new qj3(str, str6, str2));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        qj3 qj3Var = (qj3) obj2;
                        if (qj3Var.b.length() > 0 && qj3Var.c.length() > 0) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList = arrayList3;
                }
                return arrayList == null ? iun.f15405a : arrayList;
            case 1:
                vlk vlkVar2 = (vlk) pmiVar.c;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    String strC4 = ((knf0) pmiVar.d).c();
                    clc clcVar2 = (clc) pmiVar.b;
                    long jA2 = vlkVar2.a(ylk.COUNTRIES, strC4);
                    this.j = strC4;
                    this.k = true;
                    objA = ((xlk) ((sza) clcVar2.b).invoke()).a(jA2, strC4, this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                    str3 = strC4;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = this.j;
                    z1x.P(obj);
                    objA = obj;
                }
                Pair pairA = ((ox5) objA).a();
                List<mre> list3 = (List) pairA.f46059a;
                long jLongValue2 = ((Number) pairA.b).longValue();
                ylk ylkVar2 = ylk.COUNTRIES;
                Objects.toString(ylkVar2);
                vlkVar2.c(ylkVar2, jLongValue2, str3);
                ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                for (mre mreVar : list3) {
                    mreVar.getClass();
                    Integer num = mreVar.f22267a;
                    if (num == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue = num.intValue();
                    String str7 = mreVar.b;
                    String str8 = str7 == null ? "" : str7;
                    Integer num2 = mreVar.c;
                    if (num2 == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue2 = num2.intValue();
                    String str9 = mreVar.d;
                    String str10 = str9 == null ? "" : str9;
                    Long l2 = mreVar.e;
                    long jLongValue3 = l2 != null ? l2.longValue() : 0L;
                    String str11 = mreVar.f;
                    arrayList4.add(new tkt(str8, iIntValue, str10, str11 == null ? "" : str11, iIntValue2, jLongValue3));
                }
                return arrayList4;
            case 2:
                vlk vlkVar3 = (vlk) pmiVar.c;
                knf0 knf0Var = (knf0) pmiVar.d;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.k;
                if (!z3) {
                    z1x.P(obj);
                    String strC5 = knf0Var.c();
                    clc clcVar3 = (clc) pmiVar.b;
                    long jA3 = vlkVar3.a(ylk.CURRENCIES, strC5);
                    knf0Var.getClass();
                    this.j = strC5;
                    this.k = true;
                    str4 = strC5;
                    objF = ((xlk) ((sza) clcVar3.b).invoke()).f(jA3, str4, 1, this);
                    if (objF == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str12 = this.j;
                    z1x.P(obj);
                    str4 = str12;
                    objF = obj;
                }
                Pair pairA2 = ((ox5) objF).a();
                List<jvf> list4 = (List) pairA2.f46059a;
                long jLongValue4 = ((Number) pairA2.b).longValue();
                ylk ylkVar3 = ylk.CURRENCIES;
                Objects.toString(ylkVar3);
                vlkVar3.c(ylkVar3, jLongValue4, str4);
                ArrayList arrayList5 = new ArrayList(r3d.q(list4, 10));
                for (jvf jvfVar : list4) {
                    jvfVar.getClass();
                    Long l3 = jvfVar.f17201a;
                    if (l3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue5 = l3.longValue();
                    String str13 = jvfVar.b;
                    String str14 = str13 == null ? "" : str13;
                    String str15 = jvfVar.c;
                    String str16 = str15 == null ? "" : str15;
                    Boolean bool = jvfVar.d;
                    if (bool == null) {
                        jf4.k(null);
                        return null;
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    Double d = jvfVar.e;
                    if (d == null) {
                        jf4.k(null);
                        return null;
                    }
                    double dDoubleValue = d.doubleValue();
                    String str17 = jvfVar.f;
                    String str18 = str17 == null ? "" : str17;
                    Double d2 = jvfVar.g;
                    if (d2 == null) {
                        jf4.k(null);
                        return null;
                    }
                    double dDoubleValue2 = d2.doubleValue();
                    Double d3 = jvfVar.h;
                    if (d3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    double dDoubleValue3 = d3.doubleValue();
                    Double d4 = jvfVar.i;
                    if (d4 == null) {
                        jf4.k(null);
                        return null;
                    }
                    double dDoubleValue4 = d4.doubleValue();
                    Integer num3 = jvfVar.j;
                    if (num3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue3 = num3.intValue();
                    Boolean bool2 = jvfVar.k;
                    if (bool2 == null) {
                        jf4.k(null);
                        return null;
                    }
                    boolean zBooleanValue2 = bool2.booleanValue();
                    Boolean bool3 = jvfVar.l;
                    if (bool3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    boolean zBooleanValue3 = bool3.booleanValue();
                    Double d5 = jvfVar.m;
                    double dDoubleValue5 = 0.0d;
                    double dDoubleValue6 = d5 != null ? d5.doubleValue() : 0.0d;
                    Double d6 = jvfVar.n;
                    if (d6 != null) {
                        dDoubleValue5 = d6.doubleValue();
                    }
                    arrayList5.add(new puf(jLongValue5, str14, str16, zBooleanValue, dDoubleValue, str18, dDoubleValue2, dDoubleValue3, dDoubleValue4, iIntValue3, zBooleanValue2, zBooleanValue3, dDoubleValue6, dDoubleValue5));
                }
                return arrayList5;
            case 3:
                vlk vlkVar4 = (vlk) pmiVar.c;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    strC = ((knf0) pmiVar.d).c();
                    clc clcVar4 = (clc) pmiVar.b;
                    long jA4 = vlkVar4.a(ylk.GROUPS, strC);
                    this.j = strC;
                    this.k = true;
                    objC = ((xlk) ((sza) clcVar4.b).invoke()).c(jA4, strC, this);
                    if (objC == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    strC = this.j;
                    z1x.P(obj);
                    objC = obj;
                }
                Pair pairA3 = ((ox5) objC).a();
                List<lio> list5 = (List) pairA3.f46059a;
                long jLongValue6 = ((Number) pairA3.b).longValue();
                ylk ylkVar4 = ylk.GROUPS;
                Objects.toString(ylkVar4);
                vlkVar4.c(ylkVar4, jLongValue6, strC);
                ArrayList arrayList6 = new ArrayList(r3d.q(list5, 10));
                for (lio lioVar : list5) {
                    lioVar.getClass();
                    Long l4 = lioVar.f20116a;
                    if (l4 == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue7 = l4.longValue();
                    String str19 = lioVar.b;
                    String str20 = str19 == null ? "" : str19;
                    Long l5 = lioVar.c;
                    if (l5 == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue8 = l5.longValue();
                    Long l6 = lioVar.d;
                    if (l6 == null) {
                        jf4.k(null);
                        return null;
                    }
                    long jLongValue9 = l6.longValue();
                    Boolean bool4 = lioVar.e;
                    arrayList6.add(new xco(jLongValue7, jLongValue8, jLongValue9, str20, bool4 != null ? bool4.booleanValue() : false));
                }
                return arrayList6;
            default:
                vlk vlkVar5 = (vlk) pmiVar.c;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.k;
                if (!z5) {
                    z1x.P(obj);
                    strC2 = ((knf0) pmiVar.d).c();
                    clc clcVar5 = (clc) pmiVar.b;
                    long jA5 = vlkVar5.a(ylk.EVENTS, strC2);
                    this.j = strC2;
                    this.k = true;
                    objE = ((xlk) ((sza) clcVar5.b).invoke()).e(jA5, strC2, this);
                    if (objE == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    strC2 = this.j;
                    z1x.P(obj);
                    objE = obj;
                }
                Pair pairA4 = ((ox5) objE).a();
                List<oio> list6 = (List) pairA4.f46059a;
                long jLongValue10 = ((Number) pairA4.b).longValue();
                ylk ylkVar5 = ylk.EVENTS;
                Objects.toString(ylkVar5);
                vlkVar5.c(ylkVar5, jLongValue10, strC2);
                ArrayList arrayList7 = new ArrayList();
                for (oio oioVar : list6) {
                    oioVar.getClass();
                    Iterable iterable = oioVar.f25322a;
                    if (iterable == null) {
                        iterable = iun.f15405a;
                    }
                    ArrayList arrayList8 = new ArrayList(r3d.q(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        long jLongValue11 = ((Number) it.next()).longValue();
                        String str21 = oioVar.b;
                        String str22 = str21 == null ? "" : str21;
                        Integer num4 = oioVar.c;
                        if (num4 == null) {
                            jf4.k(null);
                            return null;
                        }
                        int iIntValue4 = num4.intValue();
                        Integer num5 = oioVar.d;
                        arrayList8.add(new ueo(str22, iIntValue4, num5 != null ? num5.intValue() : 0, jLongValue11));
                    }
                    w3d.u(arrayList7, arrayList8);
                }
                return arrayList7;
        }
    }
}
