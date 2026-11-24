package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class kvu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z220 f18971a;

    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[LOOP:4: B:65:0x0119->B:96:?, LOOP_END, SYNTHETIC] */
    public Enum a(zje zjeVar) {
        zzn0 zzn0Var;
        List<hpn0> list;
        List list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        Iterator it2;
        Object next;
        boolean z;
        hpn0 hpn0Var;
        hpn0 hpn0Var2;
        Iterator it3;
        Object next2;
        hpn0 hpn0Var3;
        if (zjeVar instanceof zzn0) {
            zzn0Var = (zzn0) zjeVar;
            int i = zzn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzn0Var.l = i - Integer.MIN_VALUE;
            } else {
                zzn0Var = new zzn0(this, zjeVar);
            }
        } else {
            zzn0Var = new zzn0(this, zjeVar);
        }
        Object obj = zzn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = zzn0Var.l;
        z220 z220Var = this.f18971a;
        if (i2 == 0) {
            z1x.P(obj);
            zzn0Var.l = 1;
            obj = (List) ((yvn0) z220Var.d).c.getValue();
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(obj);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = zzn0Var.i;
            z1x.P(obj);
        }
        list2 = (List) obj;
        arrayList = new ArrayList();
        for (Object obj2 : list2) {
            hpn0Var2 = (hpn0) obj2;
            it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                hpn0Var3 = (hpn0) next2;
                if (hpn0Var3.f13452a != hpn0Var2.f13452a && hpn0Var3.c == hpn0Var2.c) {
                    break;
                }
            }
            if (next2 != null) {
                arrayList.add(obj2);
            }
        }
        z220Var.M(arrayList);
        arrayList2 = new ArrayList(r3d.q(list, 10));
        for (hpn0 hpn0Var4 : list) {
            it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                hpn0Var = (hpn0) next;
                if (hpn0Var.f13452a != hpn0Var4.f13452a && hpn0Var.c == hpn0Var4.c) {
                    break;
                }
            }
            if (next != null) {
                z = true;
            } else {
                z = false;
            }
            arrayList2.add(hpn0.a(hpn0Var4, z));
        }
        z220Var.b(arrayList2);
        if (!arrayList.isEmpty() && !list2.isEmpty()) {
            return o0o0.b;
        }
        if (arrayList.size() == list2.size()) {
            if (!arrayList.isEmpty()) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((hpn0) it.next()).e <= 0) {
                    }
                }
            }
            return o0o0.c;
        }
        return o0o0.f24438a;
        List list3 = (List) obj;
        zzn0Var.i = list3;
        zzn0Var.l = 2;
        Object objV = z220Var.v(zzn0Var);
        if (objV != wneVar) {
            list = list3;
            obj = objV;
            list2 = (List) obj;
            arrayList = new ArrayList();
            while (r4.hasNext()) {
                hpn0Var2 = (hpn0) obj2;
                it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    hpn0Var3 = (hpn0) next2;
                    if (hpn0Var3.f13452a != hpn0Var2.f13452a) {
                    }
                }
                if (next2 != null) {
                    arrayList.add(obj2);
                }
            }
            z220Var.M(arrayList);
            arrayList2 = new ArrayList(r3d.q(list, 10));
            while (r2.hasNext()) {
                it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    hpn0Var = (hpn0) next;
                    if (hpn0Var.f13452a != hpn0Var4.f13452a) {
                    }
                }
                if (next != null) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList2.add(hpn0.a(hpn0Var4, z));
            }
            z220Var.b(arrayList2);
            if (!arrayList.isEmpty()) {
            }
            if (arrayList.size() == list2.size()) {
                if (!arrayList.isEmpty()) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((hpn0) it.next()).e <= 0) {
                        }
                    }
                }
                return o0o0.c;
            }
            return o0o0.f24438a;
        }
        return wneVar;
    }
}
