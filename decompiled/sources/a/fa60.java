package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes5.dex */
public final class fa60 extends bnn0 implements zdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;
    public /* synthetic */ List l;
    public /* synthetic */ HashMap m;
    public final /* synthetic */ long n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa60(Object obj, long j, yje yjeVar, byte b) {
        super(5, yjeVar);
        this.i = b;
        this.o = obj;
        this.n = j;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.i;
        Object obj6 = this.o;
        List list = (List) obj;
        List list2 = (List) obj2;
        switch (b) {
            case 0:
                fa60 fa60Var = new fa60((pzu) obj6, this.n, (yje) obj5, (byte) 0);
                fa60Var.j = list;
                fa60Var.k = list2;
                fa60Var.m = (HashMap) obj3;
                fa60Var.l = (List) obj4;
                return fa60Var.invokeSuspend(Unit.f46060a);
            default:
                fa60 fa60Var2 = new fa60((rrd) obj6, this.n, (yje) obj5, (byte) 1);
                fa60Var2.j = list;
                fa60Var2.k = list2;
                fa60Var2.l = (List) obj3;
                fa60Var2.m = (HashMap) obj4;
                return fa60Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Iterator it;
        vr20 vr20Var;
        Object next;
        int i;
        Boolean bool;
        byte b = this.i;
        int i2 = 10;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                List list = this.j;
                List list2 = this.k;
                HashMap map = this.m;
                List list3 = this.l;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                pzu pzuVar = (pzu) obj2;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    sr20 sr20Var = (sr20) it2.next();
                    Boolean bool2 = (Boolean) map.get(Long.valueOf(sr20Var.b));
                    boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                vt20 vt20Var = (vt20) it3.next();
                                if (vt20Var.f37982a == sr20Var.b && vt20Var.c != 0) {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                        }
                    } else {
                        z = false;
                    }
                    iun iunVar = iun.f15405a;
                    list2.getClass();
                    iunVar.getClass();
                    ArrayList<List> arrayList2 = sr20Var.f32656a;
                    int i3 = 10;
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    for (List list4 : arrayList2) {
                        ArrayList arrayList4 = new ArrayList(r3d.q(list4, i3));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            vr20 vr20Var2 = (vr20) it4.next();
                            List list5 = list;
                            List list6 = list2;
                            long j = sr20Var.e;
                            Iterator it5 = list6.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    next = it5.next();
                                    long j2 = j;
                                    qu6 qu6Var = (qu6) next;
                                    it = it4;
                                    Iterator it6 = it5;
                                    vr20Var = vr20Var2;
                                    if (!n6x.G(vr20Var2, j2, qu6Var.b, qu6Var.x, qu6Var.d, qu6Var.t)) {
                                        it4 = it;
                                        vr20Var2 = vr20Var;
                                        it5 = it6;
                                        j = j2;
                                    }
                                } else {
                                    it = it4;
                                    vr20Var = vr20Var2;
                                    next = null;
                                }
                            }
                            qu6 qu6Var2 = (qu6) next;
                            pzu pzuVar2 = pzuVar;
                            arrayList4.add(tlb.h0(vr20Var, qu6Var2 != null, n6x.D(iunVar, vr20Var, sr20Var.e), qu6Var2 != null ? qu6Var2.F.d : uyc.IDLE));
                            it4 = it;
                            list = list5;
                            list2 = list6;
                            pzuVar = pzuVar2;
                        }
                        arrayList3.add(arrayList4);
                        i3 = 10;
                    }
                    List list7 = list;
                    List list8 = list2;
                    pzu pzuVar3 = pzuVar;
                    long j3 = sr20Var.b;
                    String str = sr20Var.c;
                    f07 f07Var = sr20Var.f;
                    boolean z3 = sr20Var.d;
                    int i4 = 10;
                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList3, 10));
                    Iterator it7 = arrayList3.iterator();
                    while (it7.hasNext()) {
                        List<hao> list9 = (List) it7.next();
                        ArrayList arrayList6 = new ArrayList(r3d.q(list9, i4));
                        for (hao haoVar : list9) {
                            if (haoVar.h && (z2 = haoVar.o)) {
                                int i5 = haoVar.f12733a;
                                long j4 = haoVar.b;
                                long j5 = haoVar.c;
                                double d = haoVar.d;
                                long j6 = haoVar.e;
                                double d2 = haoVar.f;
                                String str2 = haoVar.g;
                                String str3 = haoVar.i;
                                String str4 = haoVar.j;
                                String str5 = haoVar.k;
                                String str6 = haoVar.l;
                                rh7 rh7Var = haoVar.m;
                                ur20 ur20Var = haoVar.n;
                                boolean z4 = haoVar.p;
                                uoy uoyVar = haoVar.q;
                                boolean z5 = haoVar.r;
                                int i6 = haoVar.s;
                                zfa0 zfa0Var = haoVar.t;
                                boolean z6 = haoVar.u;
                                long j7 = haoVar.v;
                                uyc uycVar = haoVar.w;
                                str2.getClass();
                                str4.getClass();
                                str6.getClass();
                                zfa0Var.getClass();
                                haoVar = new hao(i5, j4, j5, d, j6, d2, str2, false, str3, str4, str5, str6, rh7Var, ur20Var, z2, z4, uoyVar, z5, i6, zfa0Var, z6, j7, uycVar);
                            }
                            arrayList6.add(haoVar);
                            it2 = it2;
                            f07Var = f07Var;
                            it7 = it7;
                        }
                        arrayList5.add(arrayList6);
                        i4 = 10;
                    }
                    arrayList.add(new ou20(arrayList5, j3, str, z3, f07Var, zBooleanValue, z));
                    list = list7;
                    list2 = list8;
                    pzuVar = pzuVar3;
                }
                List list10 = list;
                pzu pzuVar4 = pzuVar;
                ArrayList arrayList7 = new ArrayList(q8x.C(arrayList, list3));
                long jF = q8x.F(arrayList7, list3);
                HashSet hashSet = new HashSet();
                Iterator it8 = arrayList7.iterator();
                while (it8.hasNext()) {
                    hashSet.add(Long.valueOf(((ou20) it8.next()).b));
                }
                b8u b8uVar = (b8u) pzuVar4.f;
                a1d a1dVar = (a1d) pzuVar4.e;
                long j8 = this.n;
                q8x.N(arrayList7, map, hashSet, j8, b8uVar, a1dVar);
                if (list10.isEmpty()) {
                    return new ii6(j8);
                }
                return !arrayList7.isEmpty() ? new hi6(j8, jF, arrayList7) : new gi6(j8, jF);
            default:
                List list11 = this.j;
                List list12 = this.k;
                List list13 = this.l;
                HashMap map2 = this.m;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                rrd rrdVar = (rrd) obj2;
                ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                Iterator it9 = list11.iterator();
                while (it9.hasNext()) {
                    wr20 wr20Var = (wr20) it9.next();
                    Boolean bool3 = (Boolean) map2.get(new Long(wr20Var.b));
                    boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                    list13.getClass();
                    list12.getClass();
                    ArrayList arrayList9 = wr20Var.f39619a;
                    ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, i2));
                    Iterator it10 = arrayList9.iterator();
                    while (it10.hasNext()) {
                        sr20 sr20Var2 = (sr20) it10.next();
                        sr20Var2.getClass();
                        ArrayList arrayList11 = sr20Var2.f32656a;
                        long j9 = sr20Var2.e;
                        List list14 = list11;
                        Iterator it11 = it9;
                        ArrayList arrayList12 = new ArrayList(r3d.q(arrayList11, i2));
                        Iterator it12 = arrayList11.iterator();
                        while (it12.hasNext()) {
                            List list15 = (List) it12.next();
                            Iterator it13 = it12;
                            Iterator it14 = it10;
                            ArrayList arrayList13 = new ArrayList(r3d.q(list15, i2));
                            int i7 = 0;
                            for (Object obj3 : list15) {
                                int i8 = i7 + 1;
                                if (i7 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                vr20 vr20Var3 = (vr20) obj3;
                                arrayList13.add(tlb.h0(vr20Var3, yyw.P(list13, vr20Var3, j9), yyw.P(list12, vr20Var3, j9), uyc.IDLE));
                                i7 = i8;
                                j9 = j9;
                                list13 = list13;
                            }
                            arrayList12.add(arrayList13);
                            it12 = it13;
                            it10 = it14;
                            i2 = 10;
                        }
                        List list16 = list13;
                        Iterator it15 = it10;
                        boolean z7 = sr20Var2.d;
                        f07 f07Var2 = sr20Var2.f;
                        arrayList10.add(new lu20(arrayList12, sr20Var2.b, sr20Var2.c, z7, f07Var2 == f07.b, f07Var2 == f07.c));
                        it9 = it11;
                        it10 = it15;
                        list11 = list14;
                        list13 = list16;
                        i2 = 10;
                    }
                    arrayList8.add(new ey20(arrayList10, wr20Var.b, wr20Var.c, zBooleanValue2));
                    list11 = list11;
                    i2 = 10;
                }
                List list17 = list11;
                HashSet hashSet2 = new HashSet();
                Iterator it16 = list17.iterator();
                while (it16.hasNext()) {
                    hashSet2.add(new Long(((wr20) it16.next()).b));
                }
                rrdVar.getClass();
                rrc rrcVar = (rrc) rrdVar.g;
                Iterator it17 = map2.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it17.hasNext();
                    long j10 = this.n;
                    if (!zHasNext) {
                        bno bnoVar = (bno) ((fno) ((bwl) rrdVar.f).f3330a).f9848a.f4665a.get(Long.valueOf(j10));
                        if (!(bnoVar != null ? bnoVar.b : false)) {
                            Iterable iterableS0 = CollectionsKt.S0(arrayList8);
                            if (!(iterableS0 instanceof Collection) || !((Collection) iterableS0).isEmpty()) {
                                Iterator it18 = iterableS0.iterator();
                                do {
                                    iil iilVar = (iil) it18;
                                    if (iilVar.b.hasNext()) {
                                        IndexedValue indexedValue = (IndexedValue) iilVar.next();
                                        i = indexedValue.f46061a;
                                        bool = (Boolean) map2.get(Long.valueOf(((ey20) indexedValue.b).b));
                                    }
                                } while ((bool != null ? bool.booleanValue() : false) == (i < 3));
                                int i9 = 0;
                                for (Object obj4 : arrayList8) {
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    ((fno) rrcVar.b).f9848a.b(j10, i9 < 3, ((ey20) obj4).b);
                                    i9 = i10;
                                }
                            }
                        }
                        return arrayList8;
                    }
                    Map.Entry entry = (Map.Entry) it17.next();
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    if (((Boolean) entry.getValue()).booleanValue() && !hashSet2.contains(Long.valueOf(jLongValue))) {
                        ((fno) rrcVar.b).f9848a.b(j10, false, jLongValue);
                    }
                }
                break;
        }
    }
}
