package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class n530 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f22924a = -1;
    public final LinkedHashMap b = new LinkedHashMap();
    public final qoj0 c;

    public n530() {
        qoj0 qoj0VarB = roj0.b(1, 0, i99.b, 2);
        qoj0VarB.g(0L);
        this.c = qoj0VarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar, Set set) {
        k530 k530Var;
        Iterator it;
        if (zjeVar instanceof k530) {
            k530Var = (k530) zjeVar;
            int i = k530Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                k530Var.m = i - Integer.MIN_VALUE;
            } else {
                k530Var = new k530(this, zjeVar);
            }
        } else {
            k530Var = new k530(this, zjeVar);
        }
        Object obj = k530Var.k;
        wne wneVar = wne.f39444a;
        int i2 = k530Var.m;
        LinkedHashMap linkedHashMap = this.b;
        if (i2 == 0) {
            z1x.P(obj);
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : setKeySet) {
                i530 i530Var = (i530) obj2;
                if (i530Var.f14175a == j && !set.contains(new Long(i530Var.b))) {
                    arrayList.add(obj2);
                }
            }
            it = arrayList.iterator();
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = k530Var.j;
            it = k530Var.i;
            z1x.P(obj);
        }
        while (it.hasNext()) {
            h530 h530Var = (h530) linkedHashMap.get((i530) it.next());
            if (h530Var != null) {
                p7m0 p7m0Var = h530Var.f12461a;
                o530 o530Var = new o530(iun.f15405a, false);
                k530Var.i = it;
                k530Var.j = j;
                k530Var.m = 1;
                p7m0Var.o(null, o530Var);
                if (Unit.f46060a == wneVar) {
                    return wneVar;
                }
            }
        }
        return Unit.f46060a;
    }

    public final p7m0 b(i530 i530Var) {
        LinkedHashMap linkedHashMap = this.b;
        h530 h530Var = (h530) linkedHashMap.get(i530Var);
        if (h530Var != null) {
            return h530Var.f12461a;
        }
        h530 h530Var2 = new h530();
        linkedHashMap.put(i530Var, h530Var2);
        return h530Var2.f12461a;
    }

    public final Map c(long j, long j2) {
        if (this.f22924a != j) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            return lunVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((i530) entry.getKey()).f14175a == j2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(Long.valueOf(((i530) entry2.getKey()).b), ((h530) entry2.getValue()).f12461a.getValue()));
        }
        return xp20.m(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(long j, long j2, List list, long j3, zje zjeVar) {
        l530 l530Var;
        long j4;
        Object next;
        if (zjeVar instanceof l530) {
            l530Var = (l530) zjeVar;
            int i = l530Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l530Var.l = i - Integer.MIN_VALUE;
            } else {
                l530Var = new l530(this, zjeVar);
            }
        } else {
            l530Var = new l530(this, zjeVar);
        }
        Object obj = l530Var.j;
        wne wneVar = wne.f39444a;
        int i2 = l530Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            i530 i530Var = new i530(j3, j2);
            p7m0 p7m0VarB = b(i530Var);
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xt20 xt20Var = (xt20) it.next();
                Iterator it2 = ((o530) b(i530Var).getValue()).b.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((xt20) next).b != xt20Var.b);
                xt20 xt20Var2 = (xt20) next;
                arrayList.add(xt20.a(xt20Var, null, false, xt20Var2 != null ? xt20Var2.e : -1L, xt20Var2 != null ? xt20Var2.f : -1.0d, 207));
            }
            o530 o530Var = new o530(arrayList, false);
            l530Var.i = j;
            l530Var.l = 1;
            p7m0VarB.o(null, o530Var);
            if (Unit.f46060a == wneVar) {
                return wneVar;
            }
            j4 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = l530Var.i;
            z1x.P(obj);
        }
        this.f22924a = j4;
        return Unit.f46060a;
    }
}
