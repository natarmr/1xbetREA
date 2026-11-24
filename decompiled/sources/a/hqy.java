package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13506a;
    public final String b;
    public final int c;
    public final kqy d;
    public final ArrayList e;
    public final ArrayList f;

    public hqy(int i, String str, int i2, kqy kqyVar) {
        str.getClass();
        this.f13506a = i;
        this.b = str;
        this.c = i2;
        this.d = kqyVar;
        this.e = new ArrayList(1);
        kd40.f18088a.getClass();
        List listA = jd40.a();
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((ffy) ((kd40) it.next())).getClass();
            arrayList.add(new mgy());
        }
        this.f = arrayList;
    }
}
