package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class du7 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ eu7 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ long l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du7(eu7 eu7Var, int i, long j, boolean z, long j2, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.j = eu7Var;
        this.k = i;
        this.l = j;
        this.m = z;
        this.n = j2;
        this.o = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new du7(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((du7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        wne wneVar;
        ws7 ws7Var;
        List list;
        List<us7> list2;
        List list3;
        wne wneVar2;
        Boolean bool;
        Iterator it;
        Integer num;
        char c;
        lu90 lu90Var;
        char c2 = 1;
        wne wneVar3 = wne.f39444a;
        byte b = this.i;
        eu7 eu7Var = this.j;
        if (b != 0) {
            if (b == 1) {
                z1x.P(obj);
                objA = obj;
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            return Unit.f46060a;
        }
        z1x.P(obj);
        int iA = eu7Var.d.a();
        knf0 knf0Var = eu7Var.e;
        int iB = knf0Var.b();
        String strC = knf0Var.c();
        jo20 jo20Var = new jo20();
        jo20Var.put("cfView", Integer.valueOf(iA));
        jo20Var.put("country", Integer.valueOf(this.k));
        jo20Var.put("fcountry", Integer.valueOf(iB));
        jo20Var.put("gameId", Long.valueOf(this.l));
        jo20Var.put("gr", 1357);
        jo20Var.put("lng", strC);
        jo20Var.put("ref", 1);
        if (this.m) {
            long j = this.n;
            if (j > 0) {
                jo20Var.put("userId", Long.valueOf(j));
            }
        }
        jo20 jo20VarJ = w6x.j(22, jo20Var, "whence");
        bbw0 bbw0Var = eu7Var.f8405a;
        this.i = (byte) 1;
        objA = ((js7) ((zm) bbw0Var.b).invoke()).a(this.o ? "Live" : "Line", jo20VarJ, this);
        if (objA == wneVar3) {
            return wneVar3;
        }
        ws7 ws7Var2 = (ws7) ((dx5) objA).a();
        vs7 vs7Var = ws7Var2.c;
        if (vs7Var == null || (list3 = vs7Var.f37935a) == null) {
            wneVar = wneVar3;
            ws7Var = ws7Var2;
            list = null;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                us7 us7Var = (us7) it2.next();
                us7Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                List list4 = us7Var.c;
                if (list4 != null) {
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        char c3 = c2;
                        ts7 ts7Var = (ts7) it3.next();
                        Boolean bool2 = us7Var.e;
                        ArrayList arrayList4 = new ArrayList();
                        List list5 = ts7Var.c;
                        Iterator it4 = it2;
                        Integer num2 = ts7Var.b;
                        if (list5 != null) {
                            Iterator it5 = list5.iterator();
                            while (it5.hasNext()) {
                                ws7 ws7Var3 = ws7Var2;
                                faa0 faa0Var = (faa0) it5.next();
                                Iterator it6 = it3;
                                if (Intrinsics.d(bool2, Boolean.TRUE)) {
                                    faa0Var.getClass();
                                    List list6 = faa0Var.g;
                                    bool = bool2;
                                    Integer num3 = faa0Var.e;
                                    if (list6 == null || list6.isEmpty()) {
                                        wneVar2 = wneVar3;
                                        num = num3;
                                        it = it5;
                                    } else {
                                        Iterator it7 = list6.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                num = num3;
                                                Integer num4 = ((caa0) it7.next()).f4000a;
                                                if (num4 != null && num4.intValue() == 3) {
                                                    it = it5;
                                                    wneVar2 = wneVar3;
                                                    c = CollectionsKt.L(q3d.j(1, 3, 4, 5, 6), num2) ? c3 : (char) 0;
                                                }
                                                it7 = it7;
                                                num3 = num;
                                                it5 = it5;
                                                wneVar3 = wneVar3;
                                            } else {
                                                wneVar2 = wneVar3;
                                                num = num3;
                                                it = it5;
                                            }
                                        }
                                    }
                                    Integer num5 = faa0Var.d;
                                    if (num5 == null && num == null && c == 0) {
                                        lu90Var = null;
                                    } else {
                                        String str = faa0Var.f9199a;
                                        String str2 = str == null ? "" : str;
                                        String str3 = faa0Var.b;
                                        String str4 = str3 == null ? "" : str3;
                                        String str5 = faa0Var.c;
                                        String str6 = str5 == null ? "" : str5;
                                        int iIntValue = num5 != null ? num5.intValue() : 0;
                                        int iIntValue2 = num != null ? num.intValue() : 0;
                                        String str7 = faa0Var.f;
                                        String str8 = str7 == null ? "" : str7;
                                        List list7 = faa0Var.h;
                                        lu90Var = new lu90(str2, str4, str6, iIntValue, iIntValue2, str8, ((list7 == null || list7.isEmpty()) ? c3 : (char) 0) ^ 1, l8x.A0(faa0Var));
                                    }
                                    if (lu90Var != null) {
                                        arrayList4.add(lu90Var);
                                    } else {
                                        arrayList3.add(afn0.B(faa0Var));
                                    }
                                } else {
                                    wneVar2 = wneVar3;
                                    bool = bool2;
                                    it = it5;
                                    arrayList3.add(afn0.B(faa0Var));
                                }
                                it3 = it6;
                                ws7Var2 = ws7Var3;
                                bool2 = bool;
                                it5 = it;
                                wneVar3 = wneVar2;
                            }
                        }
                        wne wneVar4 = wneVar3;
                        ws7 ws7Var4 = ws7Var2;
                        Iterator it8 = it3;
                        if (!arrayList4.isEmpty()) {
                            String str9 = ts7Var.f34448a;
                            if (str9 == null) {
                                str9 = "";
                            }
                            int iIntValue3 = num2 != null ? num2.intValue() : 0;
                            z8z z8zVar = new z8z((byte) 29);
                            w800 w800Var = new w800((byte) 0);
                            Function1[] function1Arr = new Function1[2];
                            function1Arr[0] = z8zVar;
                            function1Arr[c3] = w800Var;
                            arrayList2.add(new v800(str9, CollectionsKt.A0(arrayList4, hdd.a(function1Arr)), iIntValue3));
                        }
                        c2 = c3;
                        it2 = it4;
                        it3 = it8;
                        ws7Var2 = ws7Var4;
                        wneVar3 = wneVar4;
                    }
                }
                char c4 = c2;
                wne wneVar5 = wneVar3;
                Iterator it9 = it2;
                ws7 ws7Var5 = ws7Var2;
                List<gh40> list8 = us7Var.d;
                if (list8 != null) {
                    for (gh40 gh40Var : list8) {
                        gh40Var.getClass();
                        String str10 = gh40Var.f11282a;
                        String str11 = str10 == null ? "" : str10;
                        String str12 = gh40Var.b;
                        String str13 = str12 == null ? "" : str12;
                        String str14 = gh40Var.c;
                        String str15 = str14 == null ? "" : str14;
                        String str16 = gh40Var.d;
                        String str17 = str16 == null ? "" : str16;
                        List list9 = gh40Var.e;
                        arrayList3.add(new zen0(str11, str13, str15, str17, ((list9 == null || list9.isEmpty()) ? c4 : (char) 0) ^ 1, maa0.f21450a));
                    }
                }
                String str18 = us7Var.f36197a;
                if (str18 == null) {
                    str18 = "";
                }
                String str19 = us7Var.b;
                if (str19 == null) {
                    str19 = "";
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (hashSet.add(((zen0) obj2).f44261a)) {
                        arrayList5.add(obj2);
                    }
                }
                arrayList.add(new sfp0(str18, str19, arrayList2, arrayList5));
                c2 = c4;
                it2 = it9;
                ws7Var2 = ws7Var5;
                wneVar3 = wneVar5;
            }
            wneVar = wneVar3;
            ws7Var = ws7Var2;
            list = arrayList;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        boolean zIsEmpty = list.isEmpty();
        zpp0 zpp0Var = eu7Var.b;
        if (zIsEmpty) {
            zpp0Var.f44771a.o(null, pqp0.f27426a);
        } else {
            zpp0Var.f44771a.o(null, new oqp0(list));
        }
        this.i = (byte) 2;
        String strA = eu7Var.f.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (vs7Var != null && (list2 = vs7Var.f37935a) != null) {
            for (us7 us7Var2 : list2) {
                List list10 = us7Var2.c;
                boolean z = this.o;
                if (list10 != null) {
                    Iterator it10 = list10.iterator();
                    while (it10.hasNext()) {
                        List<faa0> list11 = ((ts7) it10.next()).c;
                        if (list11 != null) {
                            for (faa0 faa0Var2 : list11) {
                                eu7.a(linkedHashMap, ws7Var, z, strA, faa0Var2.f9199a, faa0Var2.h);
                            }
                        }
                        ws7Var = ws7Var;
                    }
                }
                ws7 ws7Var6 = ws7Var;
                List<gh40> list12 = us7Var2.d;
                if (list12 != null) {
                    for (gh40 gh40Var2 : list12) {
                        eu7.a(linkedHashMap, ws7Var6, z, strA, gh40Var2.f11282a, gh40Var2.e);
                    }
                }
                ws7Var = ws7Var6;
            }
        }
        Object objA2 = eu7Var.c.a(linkedHashMap, this);
        if (objA2 != wne.f39444a) {
            objA2 = Unit.f46060a;
        }
        wne wneVar6 = wneVar;
        if (objA2 == wneVar6) {
            return wneVar6;
        }
        return Unit.f46060a;
    }
}
