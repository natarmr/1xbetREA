package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class mxt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z220 f22575a;

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165 A[LOOP:5: B:65:0x015f->B:67:0x0165, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0173 A[SYNTHETIC] */
    public Object a(zje zjeVar) {
        xzn0 xzn0Var;
        List list;
        List list2;
        List list3;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it2;
        epn0 epn0Var;
        epn0 epn0Var2;
        Object next;
        epn0 epn0Var3;
        Iterator it3;
        Object obj;
        Object next2;
        epn0 epn0Var4;
        z220 z220Var = this.f22575a;
        yvn0 yvn0Var = (yvn0) z220Var.d;
        if (zjeVar instanceof xzn0) {
            xzn0Var = (xzn0) zjeVar;
            int i = xzn0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xzn0Var.m = i - Integer.MIN_VALUE;
            } else {
                xzn0Var = new xzn0(this, zjeVar);
            }
        } else {
            xzn0Var = new xzn0(this, zjeVar);
        }
        Object obj2 = xzn0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = xzn0Var.m;
        if (i2 == 0) {
            z1x.P(obj2);
            List list4 = (List) yvn0Var.d.getValue();
            xzn0Var.i = list4;
            xzn0Var.m = 1;
            Object objL = z220Var.l(xzn0Var);
            if (objL != wneVar) {
                list = list4;
                obj2 = objL;
            }
            return wneVar;
        }
        if (i2 == 1) {
            list = xzn0Var.i;
            z1x.P(obj2);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = xzn0Var.j;
            list3 = xzn0Var.i;
            z1x.P(obj2);
        }
        List<hpn0> list5 = (List) obj2;
        arrayList = new ArrayList();
        it = list2.iterator();
        while (it.hasNext()) {
            next = it.next();
            epn0Var3 = (epn0) next;
            it3 = list3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = next;
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                epn0Var4 = (epn0) next2;
                if (epn0Var4.f8198a == epn0Var3.f8198a) {
                    obj = next;
                    if (epn0Var4.d == epn0Var3.d && epn0Var4.e == epn0Var3.e) {
                        break;
                    }
                } else {
                    obj = next;
                }
                next = obj;
            }
            if (next2 != null) {
                arrayList.add(obj);
            }
        }
        arrayList2 = new ArrayList(arrayList);
        arrayList3 = new ArrayList(r3d.q(list5, 10));
        for (hpn0 hpn0Var : list5) {
            arrayList4 = new ArrayList();
            for (Object obj3 : arrayList2) {
                epn0Var2 = (epn0) obj3;
                if (epn0Var2.d != hpn0Var.f13452a && epn0Var2.e == hpn0Var.c) {
                    arrayList4.add(obj3);
                }
            }
            w3d.y(arrayList2, new uy2(arrayList4, (byte) 19));
            if (arrayList4.isEmpty()) {
                List list6 = (List) yvn0Var.d.getValue();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list6) {
                    epn0Var = (epn0) obj4;
                    if (epn0Var.d != hpn0Var.f13452a && epn0Var.e == hpn0Var.c) {
                        arrayList5.add(obj4);
                    }
                }
                arrayList4 = new ArrayList(r3d.q(arrayList5, 10));
                it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(epn0.a((epn0) it2.next(), true));
                }
            }
            arrayList3.add(arrayList4);
        }
        z220Var.L(r3d.r(arrayList3));
        return Unit.f46060a;
        List list7 = (List) obj2;
        xzn0Var.i = list;
        xzn0Var.j = list7;
        xzn0Var.m = 2;
        Object objV = z220Var.v(xzn0Var);
        if (objV != wneVar) {
            list2 = list7;
            obj2 = objV;
            list3 = list;
            List<hpn0> list8 = (List) obj2;
            arrayList = new ArrayList();
            it = list2.iterator();
            while (it.hasNext()) {
                next = it.next();
                epn0Var3 = (epn0) next;
                it3 = list3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = next;
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    epn0Var4 = (epn0) next2;
                    if (epn0Var4.f8198a == epn0Var3.f8198a) {
                        obj = next;
                        if (epn0Var4.d == epn0Var3.d) {
                            continue;
                        }
                    } else {
                        obj = next;
                    }
                    next = obj;
                }
                if (next2 != null) {
                    arrayList.add(obj);
                }
            }
            arrayList2 = new ArrayList(arrayList);
            arrayList3 = new ArrayList(r3d.q(list8, 10));
            while (r0.hasNext()) {
                arrayList4 = new ArrayList();
                while (r9.hasNext()) {
                    epn0Var2 = (epn0) obj3;
                    if (epn0Var2.d != hpn0Var.f13452a) {
                    }
                }
                w3d.y(arrayList2, new uy2(arrayList4, (byte) 19));
                if (arrayList4.isEmpty()) {
                    List list9 = (List) yvn0Var.d.getValue();
                    ArrayList arrayList6 = new ArrayList();
                    while (r7.hasNext()) {
                        epn0Var = (epn0) obj4;
                        if (epn0Var.d != hpn0Var.f13452a) {
                        }
                    }
                    arrayList4 = new ArrayList(r3d.q(arrayList6, 10));
                    it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(epn0.a((epn0) it2.next(), true));
                    }
                }
                arrayList3.add(arrayList4);
            }
            z220Var.L(r3d.r(arrayList3));
            return Unit.f46060a;
        }
        return wneVar;
    }
}
