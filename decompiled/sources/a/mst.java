package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class mst implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kmq f22338a;
    public final /* synthetic */ kki b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ List g;
    public final /* synthetic */ List h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;

    public mst(kmq kmqVar, kki kkiVar, long j, boolean z, long j2, String str, List list, List list2, boolean z2, boolean z3) {
        this.f22338a = kmqVar;
        this.b = kkiVar;
        this.c = j;
        this.d = z;
        this.e = j2;
        this.f = str;
        this.g = list;
        this.h = list2;
        this.i = z2;
        this.j = z3;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:65:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r50v2, types: [java.lang.Throwable] */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        lst lstVar;
        long j;
        Object next;
        yi6 yi6Var;
        boolean z;
        String strC;
        uoy uoyVar;
        boolean z2;
        kki kkiVar = this.b;
        j1q0 j1q0Var = (j1q0) kkiVar.d;
        yi6 yi6Var2 = (yi6) kkiVar.e;
        if (yjeVar instanceof lst) {
            lstVar = (lst) yjeVar;
            int i = lstVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                lstVar.j = i - Integer.MIN_VALUE;
            } else {
                lstVar = new lst(this, yjeVar);
            }
        } else {
            lstVar = new lst(this, yjeVar);
        }
        Object obj2 = lstVar.i;
        wne wneVar = wne.f39444a;
        int i2 = lstVar.j;
        List list = null;
        if (i2 == 0) {
            z1x.P(obj2);
            eh6 eh6Var = (eh6) obj;
            dh6 dh6Var = eh6Var instanceof dh6 ? (dh6) eh6Var : null;
            Iterable iterable = dh6Var != null ? dh6Var.f6078a : null;
            if (iterable == null) {
                iterable = iun.f15405a;
            }
            Iterator it = iterable.iterator();
            do {
                boolean zHasNext = it.hasNext();
                j = this.c;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((xf6) next).f40777a.f21776a != j);
            xf6 xf6Var = (xf6) next;
            List list2 = (List) yi6Var2.f42671a.b.get(Long.valueOf(j));
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            List list3 = list2;
            if (xf6Var != null) {
                String str = this.f;
                str.getClass();
                long j2 = xf6Var.f40777a.f21776a;
                List list4 = xf6Var.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list4) {
                    List list5 = list;
                    yi6 yi6Var3 = yi6Var2;
                    Long lValueOf = Long.valueOf(((ei6) obj3).k);
                    Object arrayList = linkedHashMap.get(lValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(lValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj3);
                    list = list5;
                    yi6Var2 = yi6Var3;
                }
                yi6Var = yi6Var2;
                ?? r50 = list;
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    List list6 = (List) entry.getValue();
                    ArrayList arrayList3 = new ArrayList(r3d.q(list6, 10));
                    Iterator it3 = list6.iterator();
                    int i3 = 0;
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        z = this.d;
                        if (zHasNext2) {
                            Object next2 = it3.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw r50;
                            }
                            ei6 ei6Var = (ei6) next2;
                            long j3 = j;
                            long j4 = ei6Var.f7843a;
                            Iterator it4 = it2;
                            String str2 = ei6Var.f;
                            double d = ei6Var.e;
                            double d2 = ei6Var.d;
                            String strValueOf = String.valueOf(d2);
                            Iterator it5 = it3;
                            boolean z3 = ei6Var.b;
                            double d3 = ei6Var.e;
                            if (d3 == 0.0d || str2.equals("SP")) {
                                strC = "SP";
                            } else {
                                if (str2.length() > 0) {
                                    strC = str2;
                                } else {
                                    pn40 pn40Var = pn40.f27267a;
                                    strC = pn40.c(d3, p3u0.e);
                                }
                                rh7 rh7Var = ei6Var.c;
                                if (z) {
                                    uoyVar = uoy.LIVE;
                                } else {
                                    uoyVar = uoy.LINE;
                                }
                                uoy uoyVar2 = uoyVar;
                                if (d3 == 0.0d && !str2.equals("SP")) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                long j5 = jLongValue;
                                jLongValue = j5;
                                arrayList3.add(new ig7(i3, j4, j2, d, j5, d2, strValueOf, z3, str2, strC, rh7Var, uoyVar2, z2, yfa0.INSTANCE, false, ei6Var.h, ei6Var.i));
                                i3 = i4;
                                it2 = it4;
                                j = j3;
                                it3 = it5;
                                str = str;
                            }
                            rh7 rh7Var2 = ei6Var.c;
                            if (z) {
                                uoyVar = uoy.LIVE;
                            } else {
                                uoyVar = uoy.LINE;
                            }
                            uoy uoyVar3 = uoyVar;
                            if (d3 == 0.0d) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            long j6 = jLongValue;
                            jLongValue = j6;
                            arrayList3.add(new ig7(i3, j4, j2, d, j6, d2, strValueOf, z3, str2, strC, rh7Var2, uoyVar3, z2, yfa0.INSTANCE, false, ei6Var.h, ei6Var.i));
                            i3 = i4;
                            it2 = it4;
                            j = j3;
                            it3 = it5;
                            str = str;
                        }
                    }
                    long j7 = j2;
                    arrayList2.add(new h07(kotlin.collections.a.c(arrayList3), jLongValue, false, str, z, j7, this.e));
                    it2 = it2;
                    j2 = j7;
                }
                list = arrayList2;
            } else {
                yi6Var = yi6Var2;
            }
            long j8 = j;
            if (list == null) {
                list = iun.f15405a;
            }
            ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList4.add(vdx.c0((h07) it6.next(), list3, this.g, this.h, j1q0Var.f15748a.j(), this.i, j1q0Var.f15748a.f() || this.j));
            }
            xi6 xi6Var = yi6Var.f42671a;
            xi6Var.getClass();
            xi6Var.b.put(Long.valueOf(j8), arrayList4);
            lstVar.j = 1;
            if (this.f22338a.a(arrayList4, lstVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }
}
