package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class elj implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8000a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ pz40 e;

    public elj(Object obj, Set set, Set set2, pz40 pz40Var, pz40 pz40Var2) {
        this.f8000a = obj;
        this.b = set;
        this.c = set2;
        this.d = pz40Var;
        this.e = pz40Var2;
    }

    @Override // a.kwk
    public final void a() {
        ArrayList arrayList;
        List list = (List) this.d.getValue();
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((ob50) list.get(i)).b);
            }
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ob50) it.next()).b);
            }
        }
        Object obj = this.f8000a;
        if (!(arrayList.contains(obj) ? false : this.b.remove(obj)) || this.c.contains(obj)) {
            return;
        }
        List list2 = (List) this.e.getValue();
        if (!(list2 instanceof RandomAccess)) {
            Iterator it2 = CollectionsKt.t0(list2).iterator();
            while (it2.hasNext()) {
                ((pb50) it2.next()).f26690a.invoke(obj);
            }
            return;
        }
        int size2 = list2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            ((pb50) list2.get(size2)).f26690a.invoke(obj);
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }
}
