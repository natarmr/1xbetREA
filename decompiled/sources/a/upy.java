package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class upy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36091a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList(0);
    public final LinkedHashMap d = new LinkedHashMap(0);
    public final ArrayList e = new ArrayList(0);
    public final ArrayList f;

    public upy(int i) {
        this.f36091a = i;
        kd40.f18088a.getClass();
        List listA = jd40.a();
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((ffy) ((kd40) it.next())).getClass();
            arrayList.add(new sey());
        }
        this.f = arrayList;
    }
}
