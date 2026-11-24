package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f33251a;

    public static ArrayList a() {
        List listJ = q3d.j(q4f.c, q4f.d, q4f.e, q4f.f, q4f.g, q4f.h, q4f.i, q4f.j, q4f.k, q4f.l);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(new un7((q4f) it.next(), true));
        }
        return arrayList;
    }
}
