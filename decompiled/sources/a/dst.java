package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class dst {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fst f6629a;
    public final nmo b;
    public final onv c;
    public final pyg0 d;

    public dst(fst fstVar, nmo nmoVar, onv onvVar, pyg0 pyg0Var) {
        fstVar.getClass();
        pyg0Var.getClass();
        this.f6629a = fstVar;
        this.b = nmoVar;
        this.c = onvVar;
        this.d = pyg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8 A[LOOP:4: B:38:0x00e2->B:40:0x00e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x0152 A[LOOP:5: B:46:0x014c->B:48:0x0152, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0183  */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX WARN: Code duplicated, block: B:64:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01df  */
    /* JADX WARN: Code duplicated, block: B:84:0x0200 A[LOOP:2: B:82:0x01fa->B:84:0x0200, LOOP_END] */
    public final Serializable a(int i, zje zjeVar) {
        cst cstVar;
        int i2;
        Object objA;
        boolean z;
        List list;
        int i3;
        List list2;
        ArrayList arrayList;
        Iterator it;
        cu5 cu5Var;
        ArrayList arrayList2;
        Iterator it2;
        Object objW0;
        Object obj;
        List list3;
        boolean z2;
        ArrayList arrayList3;
        Iterator it3;
        int i4;
        List list4;
        List list5;
        ArrayList<Pair> arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        cu5 cu5Var2 = (cu5) this.b.f23782a;
        if (zjeVar instanceof cst) {
            cstVar = (cst) zjeVar;
            int i5 = cstVar.n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cstVar.n = i5 - Integer.MIN_VALUE;
            } else {
                cstVar = new cst(this, zjeVar);
            }
        } else {
            cstVar = new cst(this, zjeVar);
        }
        Object objA2 = cstVar.l;
        wne wneVar = wne.f39444a;
        int i6 = cstVar.n;
        yje yjeVar = null;
        if (i6 == 0) {
            z1x.P(objA2);
            i2 = i;
            cstVar.i = i2;
            cstVar.n = 1;
            objA = this.f6629a.a(cstVar);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i6 == 1) {
            int i7 = cstVar.i;
            z1x.P(objA2);
            objA = objA2;
            i2 = i7;
        } else {
            if (i6 == 2) {
                boolean z3 = cstVar.k;
                int i8 = cstVar.i;
                List list6 = cstVar.j;
                z1x.P(objA2);
                list = list6;
                z = z3;
                i3 = i8;
                list2 = list;
                if (((List) objA2).isEmpty() && z) {
                    list3 = list2;
                    i4 = i3;
                    cstVar.j = list3;
                    cstVar.i = i4;
                    cstVar.k = z;
                    cstVar.n = 4;
                    objA2 = cu5Var2.b.a(cstVar);
                    if (objA2 != wneVar) {
                        list4 = list3;
                    }
                } else {
                    arrayList = new ArrayList();
                    it = list2.iterator();
                    while (it.hasNext()) {
                        List list7 = (List) ((Pair) it.next()).b;
                        arrayList3 = new ArrayList(r3d.q(list7, 10));
                        it3 = list7.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(new Integer(((kr5) it3.next()).b));
                        }
                        w3d.u(arrayList, arrayList3);
                    }
                    List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList));
                    cstVar.j = list2;
                    cstVar.i = i3;
                    cstVar.k = z;
                    cstVar.n = 3;
                    cu5Var = this.d.f27800a;
                    if (cu5Var.f.a().getLong("FIRST_SAVE_SEEN_CMS_BANNER_TIMESTAMP", 0L) == 0) {
                        cu5Var.f.f("FIRST_SAVE_SEEN_CMS_BANNER_TIMESTAMP", System.currentTimeMillis());
                    }
                    jr5 jr5Var = cu5Var.b;
                    jr5Var.n.addAll(listL0);
                    vn50 vn50Var = (vn50) jr5Var.m.getValue();
                    arrayList2 = new ArrayList(r3d.q(listL0, 10));
                    it2 = listL0.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new un50(((Number) it2.next()).intValue()));
                    }
                    objW0 = sj3.w0(cstVar, vn50Var.f37702a, new hk40((Object) vn50Var, (Object) arrayList2, yjeVar, (byte) 12), false, true);
                    obj = wne.f39444a;
                    if (objW0 != obj) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 != obj) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 != obj) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 != obj) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 != wneVar) {
                        list3 = list2;
                        z2 = z;
                        z = z2;
                        i4 = i3;
                        cstVar.j = list3;
                        cstVar.i = i4;
                        cstVar.k = z;
                        cstVar.n = 4;
                        objA2 = cu5Var2.b.a(cstVar);
                        if (objA2 != wneVar) {
                            list4 = list3;
                        }
                    }
                }
                return wneVar;
            }
            if (i6 == 3) {
                z2 = cstVar.k;
                i3 = cstVar.i;
                list3 = cstVar.j;
                z1x.P(objA2);
                z = z2;
                i4 = i3;
                cstVar.j = list3;
                cstVar.i = i4;
                cstVar.k = z;
                cstVar.n = 4;
                objA2 = cu5Var2.b.a(cstVar);
                if (objA2 != wneVar) {
                    list4 = list3;
                }
                return wneVar;
            }
            if (i6 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = cstVar.i;
            list4 = cstVar.j;
            z1x.P(objA2);
        }
        list5 = (List) objA2;
        arrayList4 = new ArrayList();
        for (Object obj2 : list4) {
            xs5 xs5Var = (xs5) ((Pair) obj2).f46059a;
            if (i4 != -1 || i4 == xs5Var.f41399a) {
                arrayList4.add(obj2);
            }
        }
        arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
        for (Pair pair : arrayList4) {
            xs5 xs5Var2 = (xs5) pair.f46059a;
            List<kr5> list8 = (List) pair.b;
            arrayList6 = new ArrayList(r3d.q(list8, 10));
            for (kr5 kr5Var : list8) {
                arrayList6.add(new q2b(kr5Var, !rz4.C(kr5Var.b, list5)));
            }
            arrayList5.add(new ft5(xs5Var2, arrayList6));
        }
        return arrayList5;
        List list9 = (List) objA;
        z = ((cu5) this.c.f25567a).f.a().getBoolean("PROMOTIONS_WERE_LAUNCHED", false);
        cstVar.j = list9;
        cstVar.i = i2;
        cstVar.k = z;
        cstVar.n = 2;
        Object objA3 = cu5Var2.b.a(cstVar);
        if (objA3 != wneVar) {
            list = list9;
            i3 = i2;
            objA2 = objA3;
            list2 = list;
            if (((List) objA2).isEmpty()) {
            }
            arrayList = new ArrayList();
            it = list2.iterator();
            while (it.hasNext()) {
                List list10 = (List) ((Pair) it.next()).b;
                arrayList3 = new ArrayList(r3d.q(list10, 10));
                it3 = list10.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new Integer(((kr5) it3.next()).b));
                }
                w3d.u(arrayList, arrayList3);
            }
            List listL1 = CollectionsKt.L0(CollectionsKt.O0(arrayList));
            cstVar.j = list2;
            cstVar.i = i3;
            cstVar.k = z;
            cstVar.n = 3;
            cu5Var = this.d.f27800a;
            if (cu5Var.f.a().getLong("FIRST_SAVE_SEEN_CMS_BANNER_TIMESTAMP", 0L) == 0) {
                cu5Var.f.f("FIRST_SAVE_SEEN_CMS_BANNER_TIMESTAMP", System.currentTimeMillis());
            }
            jr5 jr5Var2 = cu5Var.b;
            jr5Var2.n.addAll(listL1);
            vn50 vn50Var2 = (vn50) jr5Var2.m.getValue();
            arrayList2 = new ArrayList(r3d.q(listL1, 10));
            it2 = listL1.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new un50(((Number) it2.next()).intValue()));
            }
            objW0 = sj3.w0(cstVar, vn50Var2.f37702a, new hk40((Object) vn50Var2, (Object) arrayList2, yjeVar, (byte) 12), false, true);
            obj = wne.f39444a;
            if (objW0 != obj) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != obj) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != obj) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != obj) {
                objW0 = Unit.f46060a;
            }
            if (objW0 != wneVar) {
                list3 = list2;
                z2 = z;
                z = z2;
                i4 = i3;
                cstVar.j = list3;
                cstVar.i = i4;
                cstVar.k = z;
                cstVar.n = 4;
                objA2 = cu5Var2.b.a(cstVar);
                if (objA2 != wneVar) {
                    list4 = list3;
                    list5 = (List) objA2;
                    arrayList4 = new ArrayList();
                    while (r2.hasNext()) {
                        xs5 xs5Var3 = (xs5) ((Pair) obj2).f46059a;
                        if (i4 != -1) {
                        }
                        arrayList4.add(obj2);
                    }
                    arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                    while (r2.hasNext()) {
                        xs5 xs5Var4 = (xs5) pair.f46059a;
                        List<kr5> list11 = (List) pair.b;
                        arrayList6 = new ArrayList(r3d.q(list11, 10));
                        while (r3.hasNext()) {
                            arrayList6.add(new q2b(kr5Var, !rz4.C(kr5Var.b, list5)));
                        }
                        arrayList5.add(new ft5(xs5Var4, arrayList6));
                    }
                    return arrayList5;
                }
            }
        }
        return wneVar;
    }
}
