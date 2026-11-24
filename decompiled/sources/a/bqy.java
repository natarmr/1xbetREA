package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3055a;
    public final String b;
    public final ArrayList c;
    public fqy d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public fqy h;
    public final ArrayList i;
    public final LinkedHashMap j;
    public final ArrayList k;
    public final ArrayList l;

    public bqy(int i, String str) {
        str.getClass();
        this.f3055a = i;
        this.b = str;
        this.c = new ArrayList(0);
        this.e = new ArrayList(0);
        new ArrayList(0);
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = new ArrayList(0);
        this.j = new LinkedHashMap(0);
        this.k = new ArrayList(0);
        kd40.f18088a.getClass();
        List listA = jd40.a();
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((ffy) ((kd40) it.next())).getClass();
            arrayList.add(new wey());
        }
        this.l = arrayList;
    }
}
