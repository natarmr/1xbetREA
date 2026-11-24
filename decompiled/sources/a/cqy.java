package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cqy implements vpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4817a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList(0);
    public final ArrayList d;

    public cqy() {
        kd40.f18088a.getClass();
        List listA = jd40.a();
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((ffy) ((kd40) it.next())).getClass();
            arrayList.add(new jfy());
        }
        this.d = arrayList;
    }

    @Override // a.vpy
    public final ArrayList a() {
        return this.b;
    }

    @Override // a.vpy
    public final ArrayList b() {
        return this.c;
    }

    @Override // a.vpy
    public final ArrayList c() {
        return this.f4817a;
    }
}
