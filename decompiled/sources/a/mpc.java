package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class mpc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f22172a;

    public /* synthetic */ mpc(g45 g45Var) {
        this.f22172a = g45Var;
    }

    public int a() {
        return ((q7d0) this.f22172a.f).a().getInt("COUPON_TYPE_KEY_PREFERENCE", 0);
    }

    public ArrayList b(List list) {
        ArrayList arrayListU = twn.u(list);
        lye lyeVar = (lye) this.f22172a.f10647a;
        ArrayList arrayList = lyeVar.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            tg7 tg7Var = (tg7) obj;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!ozb.Y(tg7Var, (qu6) it.next()));
            }
            arrayList2.add(obj);
        }
        if (arrayList2.size() < 3) {
            ArrayList arrayList3 = lyeVar.f;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                tg7 tg7Var2 = (tg7) obj2;
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    do {
                        if (it2.hasNext()) {
                        }
                    } while (!ozb.Y(tg7Var2, (qu6) it2.next()));
                }
                arrayList4.add(obj2);
            }
            arrayListU = CollectionsKt.N0(CollectionsKt.D0(arrayList4, 3 - arrayList2.size()));
        }
        return CollectionsKt.q0(arrayList2, arrayListU);
    }

    public List c() {
        g45 g45Var = this.f22172a;
        if (((ave) g45Var.c).f1521a != q4f.m) {
            return ((lye) g45Var.f10647a).b.e;
        }
        ArrayList arrayList = ((m0f) g45Var.b).b;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((cit0) it.next()).e);
        }
        return r3d.r(arrayList2);
    }

    public boolean d(int i) {
        Object next;
        Iterator it = ((m0f) this.f22172a.b).f20951a.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List list = ((g0f) next).b;
            if (list == null || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((hf6) it2.next()).f12958a == i) {
                        break loop0;
                    }
                }
            }
        }
        g0f g0fVar = (g0f) next;
        if (g0fVar != null) {
            return g0fVar.i;
        }
        return false;
    }
}
