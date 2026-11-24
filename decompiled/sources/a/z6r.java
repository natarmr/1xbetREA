package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class z6r implements AutoCloseable, bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lrm0 f43883a;
    public final y6r b;
    public final we80 c = new we80(ze80.b);
    public final LinkedHashMap d;
    public final Set e;

    public z6r(lrm0 lrm0Var, y6r y6rVar) {
        this.f43883a = lrm0Var;
        this.b = y6rVar;
        jo20 jo20Var = lrm0Var.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(jo20Var.i));
        Iterator it = jo20Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            int i = ((mrm0) entry.getKey()).f22281a;
            if (lrm0Var.a(i) == null) {
                jf4.n("Required value was null.");
                throw null;
            }
            lrm0Var.c(i).getClass();
            throw null;
        }
        this.d = linkedHashMap;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(r3d.q(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            f3a f3aVarA = this.f43883a.a(((mrm0) it2.next()).f22281a);
            if (f3aVarA == null) {
                jf4.n("Required value was null.");
                throw null;
            }
            arrayList.add(f3aVarA);
        }
        this.e = CollectionsKt.P0(arrayList);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
        this.c.close();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                ((we80) it2.next()).close();
            }
        }
    }

    @Override // a.bmf0
    public final void d(gnf0 gnf0Var, long j, oz2 oz2Var) {
        this.c.c(oz2Var, j);
    }

    @Override // a.bmf0
    public final void q(cmf0 cmf0Var) {
        cmf0Var.getClass();
        this.b.a(cmf0Var);
    }

    @Override // a.bmf0
    public final void r(gnf0 gnf0Var, long j, int i, int i2) {
        Map map = (Map) this.d.get(new mrm0(i));
        if (map == null) {
            return;
        }
        if (this.f43883a.c(i) == null) {
            jf4.n("Required value was null.");
        } else {
            if (!map.containsKey(new xe80(i2))) {
                jf4.n("Check failed.");
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((we80) it.next()).a(j);
            }
        }
    }

    @Override // a.bmf0
    public final void v(gnf0 gnf0Var, long j, long j2) {
        gnf0Var.getClass();
        s7r s7rVar = new s7r(gnf0Var, j, j2, this.e);
        this.c.d(j, j2, j, s7rVar.d);
        lc00 lc00Var = s7rVar.e;
        int iB = lc00Var.b();
        for (int i = 0; i < iB; i++) {
            q7r q7rVar = (q7r) lc00Var.get(i);
            Object obj = this.d.get(new mrm0(q7rVar.c));
            if (obj == null) {
                jf4.n("Required value was null.");
                return;
            }
            Object obj2 = ((Map) obj).get(new xe80(q7rVar.d));
            if (obj2 == null) {
                jf4.n("Required value was null.");
                return;
            }
            we80 we80Var = (we80) obj2;
            we80Var.d(j, j2, j2, q7rVar);
            if (!gnf0Var.Q().keySet().contains(new mrm0(q7rVar.c))) {
                we80Var.a(s7rVar.f31764a);
            }
        }
        a7r a7rVar = new a7r(s7rVar);
        if (!gnf0Var.R()) {
            this.b.a(gnf0Var.getRequest());
        }
        a7rVar.a();
    }

    @Override // a.bmf0
    public final void w(gnf0 gnf0Var, long j, qmf0 qmf0Var) {
        this.c.c(new df80(10), j);
        if (qmf0Var.k()) {
            return;
        }
        for (mrm0 mrm0Var : gnf0Var.Q().keySet()) {
            int i = mrm0Var.f22281a;
            Map map = (Map) this.d.get(mrm0Var);
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((we80) it.next()).a(j);
                }
            }
        }
    }
}
